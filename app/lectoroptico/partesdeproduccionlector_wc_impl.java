package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class partesdeproduccionlector_wc_impl extends GXWebComponent
{
   public partesdeproduccionlector_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public partesdeproduccionlector_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partesdeproduccionlector_wc_impl.class ));
   }

   public partesdeproduccionlector_wc_impl( int remoteHandle ,
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
      cmbavGrupodeacciones = new HTMLChoice();
      chkavSeleccionar = UIFactory.getCheckbox(this);
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
               AV7EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
               AV8MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCod", AV8MaqCod);
               AV9HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProFec", localUtil.format(AV9HisProFec, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7EmprCod,AV8MaqCod,AV9HisProFec});
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
      nRC_GXsfl_109 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_109"))) ;
      nGXsfl_109_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_109_idx"))) ;
      sGXsfl_109_idx = httpContext.GetPar( "sGXsfl_109_idx") ;
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
      AV7EmprCod = httpContext.GetPar( "EmprCod") ;
      AV8MaqCod = httpContext.GetPar( "MaqCod") ;
      AV9HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV23ColumnsSelector);
      AV37TFHisProLin = (int)(GXutil.lval( httpContext.GetPar( "TFHisProLin"))) ;
      AV38TFHisProLin_To = (int)(GXutil.lval( httpContext.GetPar( "TFHisProLin_To"))) ;
      AV39TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV40TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV41TFGruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod"))) ;
      AV42TFGruOpeCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod_To"))) ;
      AV43TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV44TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV45TFFase = httpContext.GetPar( "TFFase") ;
      AV46TFFase_Sel = httpContext.GetPar( "TFFase_Sel") ;
      AV74TFFaseDsc = httpContext.GetPar( "TFFaseDsc") ;
      AV75TFFaseDsc_Sel = httpContext.GetPar( "TFFaseDsc_Sel") ;
      AV47TFHisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTI")) ;
      AV51TFHisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTF")) ;
      AV55TFHisProF = httpContext.GetPar( "TFHisProF") ;
      AV56TFHisProF_Sel = httpContext.GetPar( "TFHisProF_Sel") ;
      AV57TFHisProTur = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur"))) ;
      AV58TFHisProTur_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur_To"))) ;
      AV59TFHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr"), ".") ;
      AV60TFHisProKgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr_To"), ".") ;
      AV61TFHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr"), ".") ;
      AV62TFHisProMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr_To"), ".") ;
      AV63TFHisProNpzs = (short)(GXutil.lval( httpContext.GetPar( "TFHisProNpzs"))) ;
      AV64TFHisProNpzs_To = (short)(GXutil.lval( httpContext.GetPar( "TFHisProNpzs_To"))) ;
      AV76TFHisProLot = httpContext.GetPar( "TFHisProLot") ;
      AV77TFHisProLot_Sel = httpContext.GetPar( "TFHisProLot_Sel") ;
      AV65TFParCodNom = httpContext.GetPar( "TFParCodNom") ;
      AV66TFParCodNom_Sel = httpContext.GetPar( "TFParCodNom_Sel") ;
      AV78TFHisProTr2 = (short)(GXutil.lval( httpContext.GetPar( "TFHisProTr2"))) ;
      AV79TFHisProTr2_To = (short)(GXutil.lval( httpContext.GetPar( "TFHisProTr2_To"))) ;
      AV102Pgmname = httpContext.GetPar( "Pgmname") ;
      AV15OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV16OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV97Col_Hisprolin);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV8MaqCod, AV9HisProFec, AV23ColumnsSelector, AV37TFHisProLin, AV38TFHisProLin_To, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV41TFGruOpeCod, AV42TFGruOpeCod_To, AV43TFBarOrdLin, AV44TFBarOrdLin_To, AV45TFFase, AV46TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV47TFHisProDTI, AV51TFHisProDTF, AV55TFHisProF, AV56TFHisProF_Sel, AV57TFHisProTur, AV58TFHisProTur_To, AV59TFHisProKgr, AV60TFHisProKgr_To, AV61TFHisProMtr, AV62TFHisProMtr_To, AV63TFHisProNpzs, AV64TFHisProNpzs_To, AV76TFHisProLot, AV77TFHisProLot_Sel, AV65TFParCodNom, AV66TFParCodNom_Sel, AV78TFHisProTr2, AV79TFHisProTr2_To, AV102Pgmname, AV15OrderedBy, AV16OrderedDsc, AV97Col_Hisprolin, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1D32( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Detalle Producciones", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lectoroptico.partesdeproduccionlector_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(AV9HisProFec))}, new String[] {"EmprCod","MaqCod","HisProFec"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"PartesdeProduccionLector_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV102Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("lectoroptico\\partesdeproduccionlector_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_109", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_109, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV69GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV70GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV67DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV67DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7EmprCod", GXutil.rtrim( wcpOAV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8MaqCod", GXutil.rtrim( wcpOAV8MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9HisProFec", localUtil.dtoc( wcpOAV9HisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROLIN", GXutil.ltrim( localUtil.ntoc( AV37TFHisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROLIN_TO", GXutil.ltrim( localUtil.ntoc( AV38TFHisProLin_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV39TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV40TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD", GXutil.ltrim( localUtil.ntoc( AV41TFGruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV42TFGruOpeCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV43TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV44TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE", GXutil.rtrim( AV45TFFase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE_SEL", GXutil.rtrim( AV46TFFase_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASEDSC", GXutil.rtrim( AV74TFFaseDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASEDSC_SEL", GXutil.rtrim( AV75TFFaseDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTI", localUtil.ttoc( AV47TFHisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTF", localUtil.ttoc( AV51TFHisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROF", GXutil.rtrim( AV55TFHisProF));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROF_SEL", GXutil.rtrim( AV56TFHisProF_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR", GXutil.ltrim( localUtil.ntoc( AV57TFHisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR_TO", GXutil.ltrim( localUtil.ntoc( AV58TFHisProTur_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV59TFHisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR_TO", GXutil.ltrim( localUtil.ntoc( AV60TFHisProKgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV61TFHisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR_TO", GXutil.ltrim( localUtil.ntoc( AV62TFHisProMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRONPZS", GXutil.ltrim( localUtil.ntoc( AV63TFHisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRONPZS_TO", GXutil.ltrim( localUtil.ntoc( AV64TFHisProNpzs_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROLOT", GXutil.rtrim( AV76TFHisProLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROLOT_SEL", GXutil.rtrim( AV77TFHisProLot_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM", GXutil.rtrim( AV65TFParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPARCODNOM_SEL", GXutil.rtrim( AV66TFParCodNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTR2", GXutil.ltrim( localUtil.ntoc( AV78TFHisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTR2_TO", GXutil.ltrim( localUtil.ntoc( AV79TFHisProTr2_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV15OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV16OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD", GXutil.rtrim( AV8MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC", localUtil.dtoc( AV9HisProFec, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_HISPROLIN", AV97Col_Hisprolin);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_HISPROLIN", AV97Col_Hisprolin);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV72UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV73Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV99i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Result));
   }

   public void renderHtmlCloseForm1D32( )
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
      return "LectorOptico.PartesdeProduccionLector_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle Producciones", "") ;
   }

   public void wb1D30( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.lectoroptico.partesdeproduccionlector_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecbarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecbarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecbarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV83LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLecbarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83LecBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV83LecBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,19);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecbarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecbarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecbarreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecbarreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecbarreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV84LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLecbarreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV84LecBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV84LecBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,23);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecbarreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecbarreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecbarpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecbarpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecbarpar_Internalname, GXutil.rtrim( AV85LecBarPar), GXutil.rtrim( localUtil.format( AV85LecBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecbarpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecbarpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecfec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavLecfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecfec_Internalname, localUtil.format(AV86LecFec, "99/99/99"), localUtil.format( AV86LecFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavLecfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavLecfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLechor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLechor_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLechor_Internalname, GXutil.rtrim( AV87LecHor), GXutil.rtrim( localUtil.format( AV87LecHor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLechor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLechor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecfasord_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecfasord_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecfasord_Internalname, GXutil.ltrim( localUtil.ntoc( AV92LecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLecfasord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV92LecFasOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV92LecFasOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecfasord_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecfasord_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecfascod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecfascod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecfascod_Internalname, GXutil.rtrim( AV93LecFasCod), GXutil.rtrim( localUtil.format( AV93LecFasCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecfascod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecfascod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecfasdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecfasdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecfasdsc_Internalname, GXutil.rtrim( AV94LecFasDsc), GXutil.rtrim( localUtil.format( AV94LecFasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecfasdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecfasdsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecopecod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecopecod_Internalname, httpContext.getMessage( "Operario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecopecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV90LecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLecopecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV90LecOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV90LecOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecopecod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecopecod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecopenom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecopenom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecopenom_Internalname, GXutil.rtrim( AV91lecOpeNom), GXutil.rtrim( localUtil.format( AV91lecOpeNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecopenom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecopenom_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecparcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecparcod_Internalname, httpContext.getMessage( "Paro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecparcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV88LecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLecparcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV88LecParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV88LecParCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecparcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecparcod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecparnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecparnom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecparnom_Internalname, GXutil.rtrim( AV89LecParNom), GXutil.rtrim( localUtil.format( AV89LecParNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecparnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecparnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 109, 3, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 109, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 109, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 109, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 109, 3, 0)+","+"null"+");", "++", bttBtnmarcartodas_Jsonclick, 5, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 109, 3, 0)+","+"null"+");", "--", bttBtndesmarcartodas_Jsonclick, 5, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODESMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_98_1D32( true) ;
      }
      else
      {
         wb_table1_98_1D32( false) ;
      }
      return  ;
   }

   public void wb_table1_98_1D32e( boolean wbgen )
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
         startgridcontrol109( ) ;
      }
      if ( wbEnd == 109 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_109 = (int)(nGXsfl_109_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV69GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV70GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV102Pgmname), GXutil.rtrim( localUtil.format( AV102Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
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
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV67DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV67DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV23ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_150_1D32( true) ;
      }
      else
      {
         wb_table2_150_1D32( false) ;
      }
      return  ;
   }

   public void wb_table2_150_1D32e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtiauxdate_Internalname, localUtil.format(AV49DDO_HisProDTIAuxDate, "99/99/99"), localUtil.format( AV49DDO_HisProDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,157);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'" + sPrefix + "',false,'" + sGXsfl_109_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtfauxdate_Internalname, localUtil.format(AV53DDO_HisProDTFAuxDate, "99/99/99"), localUtil.format( AV53DDO_HisProDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,159);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LectorOptico\\PartesdeProduccionLector_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 109 )
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

   public void start1D32( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Detalle Producciones", ""), (short)(0)) ;
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
            strup1D30( ) ;
         }
      }
   }

   public void ws1D32( )
   {
      start1D32( ) ;
      evt1D32( ) ;
   }

   public void evt1D32( )
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
                              strup1D30( ) ;
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
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DLTLINEA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoMarcarTodas' */
                                 e161D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODESMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDesmarcarTodas' */
                                 e171D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e181D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e191D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e201D32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1D30( ) ;
                           }
                           nGXsfl_109_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1092( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV71Grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Grupodeacciones), 4, 0));
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
                           n606MaqDsc = false ;
                           A558HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisProFec_Internalname), 0)) ;
                           AV96Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV96Seleccionar);
                           A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV95M = httpContext.cgiGet( edtavM_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavM_Internalname, AV95M);
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
                           A7258FaseDsc = httpContext.cgiGet( edtFaseDsc_Internalname) ;
                           A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname), 0) ;
                           n4440HisProDTI = false ;
                           A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname), 0) ;
                           n4441HisProDTF = false ;
                           A557HisProF = GXutil.upper( httpContext.cgiGet( edtHisProF_Internalname)) ;
                           A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
                           A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
                           A4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3610HisProLot = httpContext.cgiGet( edtHisProLot_Internalname) ;
                           A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
                           n867ParCodNom = false ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A5605HisProTr2 = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e211D32 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e221D32 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e231D32 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e241D32 ();
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
                                    strup1D30( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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

   public void we1D32( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1D32( ) ;
         }
      }
   }

   public void pa1D32( )
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
            GX_FocusControl = edtavLecbarcod_Internalname ;
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
      subsflControlProps_1092( ) ;
      while ( nGXsfl_109_idx <= nRC_GXsfl_109 )
      {
         sendrow_1092( ) ;
         nGXsfl_109_idx = ((subGrid_Islastpage==1)&&(nGXsfl_109_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_109_idx+1) ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV7EmprCod ,
                                 String AV8MaqCod ,
                                 java.util.Date AV9HisProFec ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ,
                                 int AV37TFHisProLin ,
                                 int AV38TFHisProLin_To ,
                                 String AV39TFBarNHdr ,
                                 String AV40TFBarNHdr_Sel ,
                                 int AV41TFGruOpeCod ,
                                 int AV42TFGruOpeCod_To ,
                                 short AV43TFBarOrdLin ,
                                 short AV44TFBarOrdLin_To ,
                                 String AV45TFFase ,
                                 String AV46TFFase_Sel ,
                                 String AV74TFFaseDsc ,
                                 String AV75TFFaseDsc_Sel ,
                                 java.util.Date AV47TFHisProDTI ,
                                 java.util.Date AV51TFHisProDTF ,
                                 String AV55TFHisProF ,
                                 String AV56TFHisProF_Sel ,
                                 byte AV57TFHisProTur ,
                                 byte AV58TFHisProTur_To ,
                                 java.math.BigDecimal AV59TFHisProKgr ,
                                 java.math.BigDecimal AV60TFHisProKgr_To ,
                                 java.math.BigDecimal AV61TFHisProMtr ,
                                 java.math.BigDecimal AV62TFHisProMtr_To ,
                                 short AV63TFHisProNpzs ,
                                 short AV64TFHisProNpzs_To ,
                                 String AV76TFHisProLot ,
                                 String AV77TFHisProLot_Sel ,
                                 String AV65TFParCodNom ,
                                 String AV66TFParCodNom_Sel ,
                                 short AV78TFHisProTr2 ,
                                 short AV79TFHisProTr2_To ,
                                 String AV102Pgmname ,
                                 short AV15OrderedBy ,
                                 boolean AV16OrderedDsc ,
                                 GXSimpleCollection<Integer> AV97Col_Hisprolin ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e221D32 ();
      GRID_nCurrentRecord = 0 ;
      rf1D32( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"PartesdeProduccionLector_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV102Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("lectoroptico\\partesdeproduccionlector_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_GRUOPECOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRUOPECOD", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( A1525HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROKGR", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( A1526HisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROMTR", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPROTUR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROTUR", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPROF", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A557HisProF, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROF", GXutil.rtrim( A557HisProF));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPRODTI", getSecureSignedToken( sPrefix, localUtil.format( A4440HisProDTI, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPRODTI", localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPRODTF", getSecureSignedToken( sPrefix, localUtil.format( A4441HisProDTF, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPRODTF", localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      rf1D32( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV102Pgmname = "LectorOptico.PartesdeProduccionLector_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Pgmname", AV102Pgmname);
      Gx_err = (short)(0) ;
      edtavLecbarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecbarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarcod_Enabled), 5, 0), true);
      edtavLecbarreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecbarreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarreo_Enabled), 5, 0), true);
      edtavLecbarpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecbarpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarpar_Enabled), 5, 0), true);
      edtavLecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfec_Enabled), 5, 0), true);
      edtavLechor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLechor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLechor_Enabled), 5, 0), true);
      edtavLecfasord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecfasord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfasord_Enabled), 5, 0), true);
      edtavLecfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfascod_Enabled), 5, 0), true);
      edtavLecfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfasdsc_Enabled), 5, 0), true);
      edtavLecopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecopecod_Enabled), 5, 0), true);
      edtavLecopenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecopenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecopenom_Enabled), 5, 0), true);
      edtavLecparcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecparcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecparcod_Enabled), 5, 0), true);
      edtavLecparnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecparnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecparnom_Enabled), 5, 0), true);
      edtavM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavM_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV37TFHisProLin ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV38TFHisProLin_To ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV39TFBarNHdr ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV41TFGruOpeCod ;
      AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV42TFGruOpeCod_To ;
      AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV43TFBarOrdLin ;
      AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV44TFBarOrdLin_To ;
      AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV45TFFase ;
      AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV46TFFase_Sel ;
      AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV74TFFaseDsc ;
      AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV47TFHisProDTI ;
      AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV51TFHisProDTF ;
      AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV55TFHisProF ;
      AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV56TFHisProF_Sel ;
      AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV57TFHisProTur ;
      AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV58TFHisProTur_To ;
      AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV59TFHisProKgr ;
      AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV60TFHisProKgr_To ;
      AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV61TFHisProMtr ;
      AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV62TFHisProMtr_To ;
      AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV63TFHisProNpzs ;
      AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV64TFHisProNpzs_To ;
      AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV76TFHisProLot ;
      AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV77TFHisProLot_Sel ;
      AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV65TFParCodNom ;
      AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV66TFParCodNom_Sel ;
      AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV78TFHisProTr2 ;
      AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV79TFHisProTr2_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) ,
                                           Integer.valueOf(AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) ,
                                           AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                           AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                           Integer.valueOf(AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) ,
                                           Integer.valueOf(AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) ,
                                           Short.valueOf(AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) ,
                                           AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                           AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                           AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                           AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                           AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                           AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                           Byte.valueOf(AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) ,
                                           Byte.valueOf(AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) ,
                                           AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                           AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                           AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                           AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                           Short.valueOf(AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) ,
                                           Short.valueOf(AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) ,
                                           AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                           AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                           AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                           AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                           Short.valueOf(AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) ,
                                           Short.valueOf(AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A3610HisProLot ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV15OrderedBy) ,
                                           Boolean.valueOf(AV16OrderedDsc) ,
                                           AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                           AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                           A7258FaseDsc ,
                                           AV7EmprCod ,
                                           AV8MaqCod ,
                                           AV9HisProFec ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           A558HisProFec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr), 11, "%") ;
      lV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = GXutil.padr( GXutil.rtrim( AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase), 8, "%") ;
      lV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = GXutil.padr( GXutil.rtrim( AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof), 1, "%") ;
      lV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = GXutil.padr( GXutil.rtrim( AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot), 10, "%") ;
      lV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom), 30, "%") ;
      /* Using cursor H01D32 */
      pr_default.execute(0, new Object[] {AV7EmprCod, AV8MaqCod, AV9HisProFec, Integer.valueOf(AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin), Integer.valueOf(AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to), lV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr, AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel, Integer.valueOf(AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod), Integer.valueOf(AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to), Short.valueOf(AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin), Short.valueOf(AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to), lV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase, AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel, AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti, AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf, lV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof, AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel, Byte.valueOf(AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur), Byte.valueOf(AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to), AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr, AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to, AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr, AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to, Short.valueOf(AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs), Short.valueOf(AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to), lV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot, AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel, lV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom, AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel, Short.valueOf(AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2), Short.valueOf(AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A656ParCod = H01D32_A656ParCod[0] ;
         n656ParCod = H01D32_n656ParCod[0] ;
         A867ParCodNom = H01D32_A867ParCodNom[0] ;
         n867ParCodNom = H01D32_n867ParCodNom[0] ;
         A3610HisProLot = H01D32_A3610HisProLot[0] ;
         A4714HisProNpzs = H01D32_A4714HisProNpzs[0] ;
         A1526HisProMtr = H01D32_A1526HisProMtr[0] ;
         A1525HisProKgr = H01D32_A1525HisProKgr[0] ;
         A566HisProTur = H01D32_A566HisProTur[0] ;
         A557HisProF = H01D32_A557HisProF[0] ;
         A194BarOrdLin = H01D32_A194BarOrdLin[0] ;
         A503GruOpeCod = H01D32_A503GruOpeCod[0] ;
         A561HisProLin = H01D32_A561HisProLin[0] ;
         A558HisProFec = H01D32_A558HisProFec[0] ;
         A606MaqDsc = H01D32_A606MaqDsc[0] ;
         n606MaqDsc = H01D32_n606MaqDsc[0] ;
         A602MaqCod = H01D32_A602MaqCod[0] ;
         A130BarCodPar = H01D32_A130BarCodPar[0] ;
         A132BarCodReo = H01D32_A132BarCodReo[0] ;
         A129BarCod = H01D32_A129BarCod[0] ;
         A461Fase = H01D32_A461Fase[0] ;
         A396EmprCod = H01D32_A396EmprCod[0] ;
         A4440HisProDTI = H01D32_A4440HisProDTI[0] ;
         n4440HisProDTI = H01D32_n4440HisProDTI[0] ;
         A4441HisProDTF = H01D32_A4441HisProDTF[0] ;
         n4441HisProDTF = H01D32_n4441HisProDTF[0] ;
         A606MaqDsc = H01D32_A606MaqDsc[0] ;
         n606MaqDsc = H01D32_n606MaqDsc[0] ;
         A867ParCodNom = H01D32_A867ParCodNom[0] ;
         n867ParCodNom = H01D32_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         GXt_char1 = A7258FaseDsc ;
         GXv_char2[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
         partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char2[0] ;
         A7258FaseDsc = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc)==0) ) ) || ( GXutil.like( GXutil.upper( A7258FaseDsc) , GXutil.padr( "%" + GXutil.upper( AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) || ( ( GXutil.strcmp(A7258FaseDsc, AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel) == 0 ) ) )
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

   public void rf1D32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(109) ;
      /* Execute user event: Refresh */
      e221D32 ();
      nGXsfl_109_idx = 1 ;
      sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1092( ) ;
      bGXsfl_109_Refreshing = true ;
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
         subsflControlProps_1092( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) ,
                                              Integer.valueOf(AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) ,
                                              AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                              AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                              Integer.valueOf(AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) ,
                                              Integer.valueOf(AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) ,
                                              Short.valueOf(AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) ,
                                              Short.valueOf(AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) ,
                                              AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                              AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                              AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                              AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                              AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                              AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                              Byte.valueOf(AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) ,
                                              Byte.valueOf(AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) ,
                                              AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                              AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                              AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                              AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                              Short.valueOf(AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) ,
                                              Short.valueOf(AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) ,
                                              AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                              AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                              AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                              AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                              Short.valueOf(AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) ,
                                              Short.valueOf(AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) ,
                                              Integer.valueOf(A561HisProLin) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Integer.valueOf(A503GruOpeCod) ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A461Fase ,
                                              A4440HisProDTI ,
                                              A4441HisProDTF ,
                                              A557HisProF ,
                                              Byte.valueOf(A566HisProTur) ,
                                              A1525HisProKgr ,
                                              A1526HisProMtr ,
                                              Short.valueOf(A4714HisProNpzs) ,
                                              A3610HisProLot ,
                                              A867ParCodNom ,
                                              Short.valueOf(AV15OrderedBy) ,
                                              Boolean.valueOf(AV16OrderedDsc) ,
                                              AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                              AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                              A7258FaseDsc ,
                                              AV7EmprCod ,
                                              AV8MaqCod ,
                                              AV9HisProFec ,
                                              A396EmprCod ,
                                              A602MaqCod ,
                                              A558HisProFec } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                              }
         });
         lV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr), 11, "%") ;
         lV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = GXutil.padr( GXutil.rtrim( AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase), 8, "%") ;
         lV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = GXutil.padr( GXutil.rtrim( AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof), 1, "%") ;
         lV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = GXutil.padr( GXutil.rtrim( AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot), 10, "%") ;
         lV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom), 30, "%") ;
         /* Using cursor H01D33 */
         pr_default.execute(1, new Object[] {AV7EmprCod, AV8MaqCod, AV9HisProFec, Integer.valueOf(AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin), Integer.valueOf(AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to), lV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr, AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel, Integer.valueOf(AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod), Integer.valueOf(AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to), Short.valueOf(AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin), Short.valueOf(AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to), lV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase, AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel, AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti, AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf, lV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof, AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel, Byte.valueOf(AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur), Byte.valueOf(AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to), AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr, AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to, AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr, AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to, Short.valueOf(AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs), Short.valueOf(AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to), lV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot, AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel, lV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom, AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel, Short.valueOf(AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2), Short.valueOf(AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to)});
         nGXsfl_109_idx = 1 ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A656ParCod = H01D33_A656ParCod[0] ;
            n656ParCod = H01D33_n656ParCod[0] ;
            A867ParCodNom = H01D33_A867ParCodNom[0] ;
            n867ParCodNom = H01D33_n867ParCodNom[0] ;
            A3610HisProLot = H01D33_A3610HisProLot[0] ;
            A4714HisProNpzs = H01D33_A4714HisProNpzs[0] ;
            A1526HisProMtr = H01D33_A1526HisProMtr[0] ;
            A1525HisProKgr = H01D33_A1525HisProKgr[0] ;
            A566HisProTur = H01D33_A566HisProTur[0] ;
            A557HisProF = H01D33_A557HisProF[0] ;
            A194BarOrdLin = H01D33_A194BarOrdLin[0] ;
            A503GruOpeCod = H01D33_A503GruOpeCod[0] ;
            A561HisProLin = H01D33_A561HisProLin[0] ;
            A558HisProFec = H01D33_A558HisProFec[0] ;
            A606MaqDsc = H01D33_A606MaqDsc[0] ;
            n606MaqDsc = H01D33_n606MaqDsc[0] ;
            A602MaqCod = H01D33_A602MaqCod[0] ;
            A130BarCodPar = H01D33_A130BarCodPar[0] ;
            A132BarCodReo = H01D33_A132BarCodReo[0] ;
            A129BarCod = H01D33_A129BarCod[0] ;
            A461Fase = H01D33_A461Fase[0] ;
            A396EmprCod = H01D33_A396EmprCod[0] ;
            A4440HisProDTI = H01D33_A4440HisProDTI[0] ;
            n4440HisProDTI = H01D33_n4440HisProDTI[0] ;
            A4441HisProDTF = H01D33_A4441HisProDTF[0] ;
            n4441HisProDTF = H01D33_n4441HisProDTF[0] ;
            A606MaqDsc = H01D33_A606MaqDsc[0] ;
            n606MaqDsc = H01D33_n606MaqDsc[0] ;
            A867ParCodNom = H01D33_A867ParCodNom[0] ;
            n867ParCodNom = H01D33_n867ParCodNom[0] ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
            }
            GXt_char1 = A7258FaseDsc ;
            GXv_char2[0] = GXt_char1 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
            partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char2[0] ;
            A7258FaseDsc = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) && ( ! (GXutil.strcmp("", AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc)==0) ) ) || ( GXutil.like( GXutil.upper( A7258FaseDsc) , GXutil.padr( "%" + GXutil.upper( AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) || ( ( GXutil.strcmp(A7258FaseDsc, AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel) == 0 ) ) )
               {
                  A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                  e231D32 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(109) ;
         wb1D30( ) ;
      }
      bGXsfl_109_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1D32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_GRUOPECOD"+"_"+sGXsfl_109_idx, getSecureSignedToken( sPrefix+sGXsfl_109_idx, localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPROKGR"+"_"+sGXsfl_109_idx, getSecureSignedToken( sPrefix+sGXsfl_109_idx, localUtil.format( A1525HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPROMTR"+"_"+sGXsfl_109_idx, getSecureSignedToken( sPrefix+sGXsfl_109_idx, localUtil.format( A1526HisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPROTUR"+"_"+sGXsfl_109_idx, getSecureSignedToken( sPrefix+sGXsfl_109_idx, localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPROF"+"_"+sGXsfl_109_idx, getSecureSignedToken( sPrefix+sGXsfl_109_idx, GXutil.rtrim( localUtil.format( A557HisProF, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPRODTI"+"_"+sGXsfl_109_idx, getSecureSignedToken( sPrefix+sGXsfl_109_idx, localUtil.format( A4440HisProDTI, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HISPRODTF"+"_"+sGXsfl_109_idx, getSecureSignedToken( sPrefix+sGXsfl_109_idx, localUtil.format( A4441HisProDTF, "99/99/99 99:99:99")));
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
      AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV37TFHisProLin ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV38TFHisProLin_To ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV39TFBarNHdr ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV41TFGruOpeCod ;
      AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV42TFGruOpeCod_To ;
      AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV43TFBarOrdLin ;
      AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV44TFBarOrdLin_To ;
      AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV45TFFase ;
      AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV46TFFase_Sel ;
      AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV74TFFaseDsc ;
      AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV47TFHisProDTI ;
      AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV51TFHisProDTF ;
      AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV55TFHisProF ;
      AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV56TFHisProF_Sel ;
      AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV57TFHisProTur ;
      AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV58TFHisProTur_To ;
      AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV59TFHisProKgr ;
      AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV60TFHisProKgr_To ;
      AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV61TFHisProMtr ;
      AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV62TFHisProMtr_To ;
      AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV63TFHisProNpzs ;
      AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV64TFHisProNpzs_To ;
      AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV76TFHisProLot ;
      AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV77TFHisProLot_Sel ;
      AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV65TFParCodNom ;
      AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV66TFParCodNom_Sel ;
      AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV78TFHisProTr2 ;
      AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV79TFHisProTr2_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV8MaqCod, AV9HisProFec, AV23ColumnsSelector, AV37TFHisProLin, AV38TFHisProLin_To, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV41TFGruOpeCod, AV42TFGruOpeCod_To, AV43TFBarOrdLin, AV44TFBarOrdLin_To, AV45TFFase, AV46TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV47TFHisProDTI, AV51TFHisProDTF, AV55TFHisProF, AV56TFHisProF_Sel, AV57TFHisProTur, AV58TFHisProTur_To, AV59TFHisProKgr, AV60TFHisProKgr_To, AV61TFHisProMtr, AV62TFHisProMtr_To, AV63TFHisProNpzs, AV64TFHisProNpzs_To, AV76TFHisProLot, AV77TFHisProLot_Sel, AV65TFParCodNom, AV66TFParCodNom_Sel, AV78TFHisProTr2, AV79TFHisProTr2_To, AV102Pgmname, AV15OrderedBy, AV16OrderedDsc, AV97Col_Hisprolin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV37TFHisProLin ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV38TFHisProLin_To ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV39TFBarNHdr ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV41TFGruOpeCod ;
      AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV42TFGruOpeCod_To ;
      AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV43TFBarOrdLin ;
      AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV44TFBarOrdLin_To ;
      AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV45TFFase ;
      AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV46TFFase_Sel ;
      AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV74TFFaseDsc ;
      AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV47TFHisProDTI ;
      AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV51TFHisProDTF ;
      AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV55TFHisProF ;
      AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV56TFHisProF_Sel ;
      AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV57TFHisProTur ;
      AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV58TFHisProTur_To ;
      AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV59TFHisProKgr ;
      AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV60TFHisProKgr_To ;
      AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV61TFHisProMtr ;
      AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV62TFHisProMtr_To ;
      AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV63TFHisProNpzs ;
      AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV64TFHisProNpzs_To ;
      AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV76TFHisProLot ;
      AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV77TFHisProLot_Sel ;
      AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV65TFParCodNom ;
      AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV66TFParCodNom_Sel ;
      AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV78TFHisProTr2 ;
      AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV79TFHisProTr2_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV8MaqCod, AV9HisProFec, AV23ColumnsSelector, AV37TFHisProLin, AV38TFHisProLin_To, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV41TFGruOpeCod, AV42TFGruOpeCod_To, AV43TFBarOrdLin, AV44TFBarOrdLin_To, AV45TFFase, AV46TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV47TFHisProDTI, AV51TFHisProDTF, AV55TFHisProF, AV56TFHisProF_Sel, AV57TFHisProTur, AV58TFHisProTur_To, AV59TFHisProKgr, AV60TFHisProKgr_To, AV61TFHisProMtr, AV62TFHisProMtr_To, AV63TFHisProNpzs, AV64TFHisProNpzs_To, AV76TFHisProLot, AV77TFHisProLot_Sel, AV65TFParCodNom, AV66TFParCodNom_Sel, AV78TFHisProTr2, AV79TFHisProTr2_To, AV102Pgmname, AV15OrderedBy, AV16OrderedDsc, AV97Col_Hisprolin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV37TFHisProLin ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV38TFHisProLin_To ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV39TFBarNHdr ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV41TFGruOpeCod ;
      AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV42TFGruOpeCod_To ;
      AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV43TFBarOrdLin ;
      AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV44TFBarOrdLin_To ;
      AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV45TFFase ;
      AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV46TFFase_Sel ;
      AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV74TFFaseDsc ;
      AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV47TFHisProDTI ;
      AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV51TFHisProDTF ;
      AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV55TFHisProF ;
      AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV56TFHisProF_Sel ;
      AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV57TFHisProTur ;
      AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV58TFHisProTur_To ;
      AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV59TFHisProKgr ;
      AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV60TFHisProKgr_To ;
      AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV61TFHisProMtr ;
      AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV62TFHisProMtr_To ;
      AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV63TFHisProNpzs ;
      AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV64TFHisProNpzs_To ;
      AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV76TFHisProLot ;
      AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV77TFHisProLot_Sel ;
      AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV65TFParCodNom ;
      AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV66TFParCodNom_Sel ;
      AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV78TFHisProTr2 ;
      AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV79TFHisProTr2_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV8MaqCod, AV9HisProFec, AV23ColumnsSelector, AV37TFHisProLin, AV38TFHisProLin_To, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV41TFGruOpeCod, AV42TFGruOpeCod_To, AV43TFBarOrdLin, AV44TFBarOrdLin_To, AV45TFFase, AV46TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV47TFHisProDTI, AV51TFHisProDTF, AV55TFHisProF, AV56TFHisProF_Sel, AV57TFHisProTur, AV58TFHisProTur_To, AV59TFHisProKgr, AV60TFHisProKgr_To, AV61TFHisProMtr, AV62TFHisProMtr_To, AV63TFHisProNpzs, AV64TFHisProNpzs_To, AV76TFHisProLot, AV77TFHisProLot_Sel, AV65TFParCodNom, AV66TFParCodNom_Sel, AV78TFHisProTr2, AV79TFHisProTr2_To, AV102Pgmname, AV15OrderedBy, AV16OrderedDsc, AV97Col_Hisprolin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV37TFHisProLin ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV38TFHisProLin_To ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV39TFBarNHdr ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV41TFGruOpeCod ;
      AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV42TFGruOpeCod_To ;
      AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV43TFBarOrdLin ;
      AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV44TFBarOrdLin_To ;
      AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV45TFFase ;
      AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV46TFFase_Sel ;
      AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV74TFFaseDsc ;
      AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV47TFHisProDTI ;
      AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV51TFHisProDTF ;
      AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV55TFHisProF ;
      AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV56TFHisProF_Sel ;
      AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV57TFHisProTur ;
      AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV58TFHisProTur_To ;
      AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV59TFHisProKgr ;
      AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV60TFHisProKgr_To ;
      AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV61TFHisProMtr ;
      AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV62TFHisProMtr_To ;
      AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV63TFHisProNpzs ;
      AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV64TFHisProNpzs_To ;
      AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV76TFHisProLot ;
      AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV77TFHisProLot_Sel ;
      AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV65TFParCodNom ;
      AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV66TFParCodNom_Sel ;
      AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV78TFHisProTr2 ;
      AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV79TFHisProTr2_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV8MaqCod, AV9HisProFec, AV23ColumnsSelector, AV37TFHisProLin, AV38TFHisProLin_To, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV41TFGruOpeCod, AV42TFGruOpeCod_To, AV43TFBarOrdLin, AV44TFBarOrdLin_To, AV45TFFase, AV46TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV47TFHisProDTI, AV51TFHisProDTF, AV55TFHisProF, AV56TFHisProF_Sel, AV57TFHisProTur, AV58TFHisProTur_To, AV59TFHisProKgr, AV60TFHisProKgr_To, AV61TFHisProMtr, AV62TFHisProMtr_To, AV63TFHisProNpzs, AV64TFHisProNpzs_To, AV76TFHisProLot, AV77TFHisProLot_Sel, AV65TFParCodNom, AV66TFParCodNom_Sel, AV78TFHisProTr2, AV79TFHisProTr2_To, AV102Pgmname, AV15OrderedBy, AV16OrderedDsc, AV97Col_Hisprolin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV37TFHisProLin ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV38TFHisProLin_To ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV39TFBarNHdr ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV41TFGruOpeCod ;
      AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV42TFGruOpeCod_To ;
      AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV43TFBarOrdLin ;
      AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV44TFBarOrdLin_To ;
      AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV45TFFase ;
      AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV46TFFase_Sel ;
      AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV74TFFaseDsc ;
      AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV47TFHisProDTI ;
      AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV51TFHisProDTF ;
      AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV55TFHisProF ;
      AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV56TFHisProF_Sel ;
      AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV57TFHisProTur ;
      AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV58TFHisProTur_To ;
      AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV59TFHisProKgr ;
      AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV60TFHisProKgr_To ;
      AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV61TFHisProMtr ;
      AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV62TFHisProMtr_To ;
      AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV63TFHisProNpzs ;
      AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV64TFHisProNpzs_To ;
      AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV76TFHisProLot ;
      AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV77TFHisProLot_Sel ;
      AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV65TFParCodNom ;
      AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV66TFParCodNom_Sel ;
      AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV78TFHisProTr2 ;
      AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV79TFHisProTr2_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7EmprCod, AV8MaqCod, AV9HisProFec, AV23ColumnsSelector, AV37TFHisProLin, AV38TFHisProLin_To, AV39TFBarNHdr, AV40TFBarNHdr_Sel, AV41TFGruOpeCod, AV42TFGruOpeCod_To, AV43TFBarOrdLin, AV44TFBarOrdLin_To, AV45TFFase, AV46TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV47TFHisProDTI, AV51TFHisProDTF, AV55TFHisProF, AV56TFHisProF_Sel, AV57TFHisProTur, AV58TFHisProTur_To, AV59TFHisProKgr, AV60TFHisProKgr_To, AV61TFHisProMtr, AV62TFHisProMtr_To, AV63TFHisProNpzs, AV64TFHisProNpzs_To, AV76TFHisProLot, AV77TFHisProLot_Sel, AV65TFParCodNom, AV66TFParCodNom_Sel, AV78TFHisProTr2, AV79TFHisProTr2_To, AV102Pgmname, AV15OrderedBy, AV16OrderedDsc, AV97Col_Hisprolin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV102Pgmname = "LectorOptico.PartesdeProduccionLector_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Pgmname", AV102Pgmname);
      Gx_err = (short)(0) ;
      edtavLecbarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecbarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarcod_Enabled), 5, 0), true);
      edtavLecbarreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecbarreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarreo_Enabled), 5, 0), true);
      edtavLecbarpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecbarpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarpar_Enabled), 5, 0), true);
      edtavLecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfec_Enabled), 5, 0), true);
      edtavLechor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLechor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLechor_Enabled), 5, 0), true);
      edtavLecfasord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecfasord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfasord_Enabled), 5, 0), true);
      edtavLecfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfascod_Enabled), 5, 0), true);
      edtavLecfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfasdsc_Enabled), 5, 0), true);
      edtavLecopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecopecod_Enabled), 5, 0), true);
      edtavLecopenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecopenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecopenom_Enabled), 5, 0), true);
      edtavLecparcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecparcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecparcod_Enabled), 5, 0), true);
      edtavLecparnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLecparnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecparnom_Enabled), 5, 0), true);
      edtavM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavM_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1D30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e211D32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV67DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV23ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_HISPROLIN"), AV97Col_Hisprolin);
         /* Read saved values. */
         nRC_GXsfl_109 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_109"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV69GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV70GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV7EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV7EmprCod") ;
         wcpOAV8MaqCod = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCod") ;
         wcpOAV9HisProFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9HisProFec"), 0) ;
         AV99i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvelop_confirmpanel_dltlinea_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Title") ;
         Dvelop_confirmpanel_dltlinea_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_dltlinea_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_dltlinea_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_dltlinea_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_dltlinea_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_dltlinea_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Confirmtype") ;
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
         Dvelop_confirmpanel_dltlinea_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLECBARCOD");
            GX_FocusControl = edtavLecbarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83LecBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83LecBarCod), 8, 0));
         }
         else
         {
            AV83LecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavLecbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83LecBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLECBARREO");
            GX_FocusControl = edtavLecbarreo_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84LecBarReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84LecBarReo", GXutil.str( AV84LecBarReo, 1, 0));
         }
         else
         {
            AV84LecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavLecbarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84LecBarReo", GXutil.str( AV84LecBarReo, 1, 0));
         }
         AV85LecBarPar = httpContext.cgiGet( edtavLecbarpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85LecBarPar", AV85LecBarPar);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavLecfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vLECFEC");
            GX_FocusControl = edtavLecfec_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV86LecFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86LecFec", localUtil.format(AV86LecFec, "99/99/99"));
         }
         else
         {
            AV86LecFec = localUtil.ctod( httpContext.cgiGet( edtavLecfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86LecFec", localUtil.format(AV86LecFec, "99/99/99"));
         }
         AV87LecHor = httpContext.cgiGet( edtavLechor_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87LecHor", AV87LecHor);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLecfasord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLecfasord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLECFASORD");
            GX_FocusControl = edtavLecfasord_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV92LecFasOrd = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92LecFasOrd), 4, 0));
         }
         else
         {
            AV92LecFasOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtavLecfasord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92LecFasOrd), 4, 0));
         }
         AV93LecFasCod = httpContext.cgiGet( edtavLecfascod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93LecFasCod", AV93LecFasCod);
         AV94LecFasDsc = httpContext.cgiGet( edtavLecfasdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94LecFasDsc", AV94LecFasDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLecopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLecopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLECOPECOD");
            GX_FocusControl = edtavLecopecod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90LecOpeCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90LecOpeCod), 6, 0));
         }
         else
         {
            AV90LecOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavLecopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90LecOpeCod), 6, 0));
         }
         AV91lecOpeNom = httpContext.cgiGet( edtavLecopenom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91lecOpeNom", AV91lecOpeNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLecparcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLecparcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLECPARCOD");
            GX_FocusControl = edtavLecparcod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV88LecParCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88LecParCod), 4, 0));
         }
         else
         {
            AV88LecParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavLecparcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88LecParCod), 4, 0));
         }
         AV89LecParNom = httpContext.cgiGet( edtavLecparnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89LecParNom", AV89LecParNom);
         AV102Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Pgmname", AV102Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTIAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49DDO_HisProDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49DDO_HisProDTIAuxDate", localUtil.format(AV49DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV49DDO_HisProDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49DDO_HisProDTIAuxDate", localUtil.format(AV49DDO_HisProDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTFAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53DDO_HisProDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53DDO_HisProDTFAuxDate", localUtil.format(AV53DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV53DDO_HisProDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53DDO_HisProDTFAuxDate", localUtil.format(AV53DDO_HisProDTFAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"PartesdeProduccionLector_WC");
         AV102Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Pgmname", AV102Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV102Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("lectoroptico\\partesdeproduccionlector_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e211D32 ();
      if (returnInSub) return;
   }

   public void e211D32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV73Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV73Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Station", AV73Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV81EmprNom ;
      GXv_char4[0] = AV72UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV73Station, GXv_char2, GXv_char3, GXv_char4) ;
      partesdeproduccionlector_wc_impl.this.AV7EmprCod = GXv_char2[0] ;
      partesdeproduccionlector_wc_impl.this.AV81EmprNom = GXv_char3[0] ;
      partesdeproduccionlector_wc_impl.this.AV72UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72UsurCod", AV72UsurCod);
      GXt_char1 = AV80MaqDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pobtmaq(remoteHandle, context).execute( AV7EmprCod, AV8MaqCod, GXv_char4) ;
      partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV80MaqDsc = GXt_char1 ;
      /* Using cursor H01D34 */
      pr_default.execute(2, new Object[] {AV7EmprCod, AV8MaqCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1166LecMaqCod = H01D34_A1166LecMaqCod[0] ;
         A1167LecBarCod = H01D34_A1167LecBarCod[0] ;
         n1167LecBarCod = H01D34_n1167LecBarCod[0] ;
         A1168LecBarReo = H01D34_A1168LecBarReo[0] ;
         n1168LecBarReo = H01D34_n1168LecBarReo[0] ;
         A1169LecBarPar = H01D34_A1169LecBarPar[0] ;
         n1169LecBarPar = H01D34_n1169LecBarPar[0] ;
         A1188LecFasOrd = H01D34_A1188LecFasOrd[0] ;
         n1188LecFasOrd = H01D34_n1188LecFasOrd[0] ;
         A1174LecFec = H01D34_A1174LecFec[0] ;
         n1174LecFec = H01D34_n1174LecFec[0] ;
         A1173LecHor = H01D34_A1173LecHor[0] ;
         n1173LecHor = H01D34_n1173LecHor[0] ;
         A1172LecParCod = H01D34_A1172LecParCod[0] ;
         n1172LecParCod = H01D34_n1172LecParCod[0] ;
         A1171LecFasCod = H01D34_A1171LecFasCod[0] ;
         n1171LecFasCod = H01D34_n1171LecFasCod[0] ;
         A1170LecOpeCod = H01D34_A1170LecOpeCod[0] ;
         n1170LecOpeCod = H01D34_n1170LecOpeCod[0] ;
         A396EmprCod = H01D34_A396EmprCod[0] ;
         GXt_char1 = A14261LecParNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char4) ;
         partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         A14261LecParNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14261LecParNom", A14261LecParNom);
         GXt_char1 = A14260LecFasDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char4) ;
         partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         A14260LecFasDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14260LecFasDsc", A14260LecFasDsc);
         GXt_char1 = A14259lecOpeNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
         partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         A14259lecOpeNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14259lecOpeNom", A14259lecOpeNom);
         AV83LecBarCod = A1167LecBarCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83LecBarCod), 8, 0));
         AV84LecBarReo = A1168LecBarReo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84LecBarReo", GXutil.str( AV84LecBarReo, 1, 0));
         AV85LecBarPar = A1169LecBarPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85LecBarPar", AV85LecBarPar);
         AV90LecOpeCod = A1170LecOpeCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90LecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90LecOpeCod), 6, 0));
         AV91lecOpeNom = A14259lecOpeNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91lecOpeNom", AV91lecOpeNom);
         AV93LecFasCod = A1171LecFasCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93LecFasCod", AV93LecFasCod);
         AV94LecFasDsc = A14260LecFasDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94LecFasDsc", AV94LecFasDsc);
         AV92LecFasOrd = A1188LecFasOrd ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92LecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92LecFasOrd), 4, 0));
         AV86LecFec = A1174LecFec ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86LecFec", localUtil.format(AV86LecFec, "99/99/99"));
         AV87LecHor = A1173LecHor ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87LecHor", AV87LecHor);
         AV88LecParCod = A1172LecParCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88LecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88LecParCod), 4, 0));
         AV89LecParNom = A14261LecParNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89LecParNom", AV89LecParNom);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      GXt_char1 = AV73Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV73Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Station", AV73Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV81EmprNom ;
      GXv_char2[0] = AV72UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV73Station, GXv_char4, GXv_char3, GXv_char2) ;
      partesdeproduccionlector_wc_impl.this.AV7EmprCod = GXv_char4[0] ;
      partesdeproduccionlector_wc_impl.this.AV81EmprNom = GXv_char3[0] ;
      partesdeproduccionlector_wc_impl.this.AV72UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72UsurCod", AV72UsurCod);
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
      if ( AV15OrderedBy < 1 )
      {
         AV15OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV67DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV67DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e221D32( )
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
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25Session.getValue("LectorOptico.PartesdeProduccionLector_WCColumnsSelector"), "") != 0 )
      {
         AV21ColumnsSelectorXML = AV25Session.getValue("LectorOptico.PartesdeProduccionLector_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV21ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_109_Refreshing);
      edtHisProLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtavM_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavM_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavM_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtGruOpeCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGruOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruOpeCod_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtBarOrdLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtFase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtFaseDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFaseDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFaseDsc_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtHisProDTI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTI_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtHisProDTF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTF_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtHisProF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProF_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtHisProTur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProTur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTur_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtHisProKgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProKgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtHisProMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtHisProNpzs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProNpzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNpzs_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtHisProLot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProLot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLot_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtParCodNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtParCodNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCodNom_Visible), 5, 0), !bGXsfl_109_Refreshing);
      edtHisProTr2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProTr2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTr2_Visible), 5, 0), !bGXsfl_109_Refreshing);
      AV69GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69GridCurrentPage), 10, 0));
      AV70GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70GridPageCount), 10, 0));
      AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV37TFHisProLin ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV38TFHisProLin_To ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV39TFBarNHdr ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV41TFGruOpeCod ;
      AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV42TFGruOpeCod_To ;
      AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV43TFBarOrdLin ;
      AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV44TFBarOrdLin_To ;
      AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV45TFFase ;
      AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV46TFFase_Sel ;
      AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV74TFFaseDsc ;
      AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV47TFHisProDTI ;
      AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV51TFHisProDTF ;
      AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV55TFHisProF ;
      AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV56TFHisProF_Sel ;
      AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV57TFHisProTur ;
      AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV58TFHisProTur_To ;
      AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV59TFHisProKgr ;
      AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV60TFHisProKgr_To ;
      AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV61TFHisProMtr ;
      AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV62TFHisProMtr_To ;
      AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV63TFHisProNpzs ;
      AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV64TFHisProNpzs_To ;
      AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV76TFHisProLot ;
      AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV77TFHisProLot_Sel ;
      AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV65TFParCodNom ;
      AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV66TFParCodNom_Sel ;
      AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV78TFHisProTr2 ;
      AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV79TFHisProTr2_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
   }

   public void e111D32( )
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
         AV68PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV68PageToGo) ;
      }
   }

   public void e121D32( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131D32( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV15OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
         AV16OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedDsc", AV16OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProLin") == 0 )
         {
            AV37TFHisProLin = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFHisProLin), 8, 0));
            AV38TFHisProLin_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHisProLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFHisProLin_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV39TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarNHdr", AV39TFBarNHdr);
            AV40TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarNHdr_Sel", AV40TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GruOpeCod") == 0 )
         {
            AV41TFGruOpeCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFGruOpeCod), 6, 0));
            AV42TFGruOpeCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV43TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarOrdLin), 4, 0));
            AV44TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Fase") == 0 )
         {
            AV45TFFase = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFFase", AV45TFFase);
            AV46TFFase_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFFase_Sel", AV46TFFase_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FaseDsc") == 0 )
         {
            AV74TFFaseDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFFaseDsc", AV74TFFaseDsc);
            AV75TFFaseDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFFaseDsc_Sel", AV75TFFaseDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTI") == 0 )
         {
            AV47TFHisProDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHisProDTI", localUtil.ttoc( AV47TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTF") == 0 )
         {
            AV51TFHisProDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFHisProDTF", localUtil.ttoc( AV51TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProF") == 0 )
         {
            AV55TFHisProF = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFHisProF", AV55TFHisProF);
            AV56TFHisProF_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFHisProF_Sel", AV56TFHisProF_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTur") == 0 )
         {
            AV57TFHisProTur = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFHisProTur", GXutil.str( AV57TFHisProTur, 1, 0));
            AV58TFHisProTur_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHisProTur_To", GXutil.str( AV58TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProKgr") == 0 )
         {
            AV59TFHisProKgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFHisProKgr", GXutil.ltrimstr( AV59TFHisProKgr, 9, 2));
            AV60TFHisProKgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFHisProKgr_To", GXutil.ltrimstr( AV60TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProMtr") == 0 )
         {
            AV61TFHisProMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFHisProMtr", GXutil.ltrimstr( AV61TFHisProMtr, 9, 2));
            AV62TFHisProMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFHisProMtr_To", GXutil.ltrimstr( AV62TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProNpzs") == 0 )
         {
            AV63TFHisProNpzs = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFHisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFHisProNpzs), 4, 0));
            AV64TFHisProNpzs_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFHisProNpzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFHisProNpzs_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProLot") == 0 )
         {
            AV76TFHisProLot = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFHisProLot", AV76TFHisProLot);
            AV77TFHisProLot_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFHisProLot_Sel", AV77TFHisProLot_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCodNom") == 0 )
         {
            AV65TFParCodNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFParCodNom", AV65TFParCodNom);
            AV66TFParCodNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFParCodNom_Sel", AV66TFParCodNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTr2") == 0 )
         {
            AV78TFHisProTr2 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFHisProTr2), 4, 0));
            AV79TFHisProTr2_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFHisProTr2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFHisProTr2_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e231D32( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGrupodeacciones.removeAllItems();
         cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         AV95M = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavM_Internalname, AV95M);
         if ( GXutil.strcmp(A3610HisProLot, GXutil.str( A129BarCod, 8, 0)+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar) == 0 )
         {
            AV95M = "*" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavM_Internalname, AV95M);
         }
         AV96Seleccionar = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV96Seleccionar);
         AV99i = (short)(1) ;
         while ( AV99i <= AV97Col_Hisprolin.size() )
         {
            if ( ((Number) AV97Col_Hisprolin.elementAt(-1+AV99i)).intValue() == A561HisProLin )
            {
               AV96Seleccionar = true ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV96Seleccionar);
               if (true) break;
            }
            AV99i = (short)(AV99i+1) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(109) ;
         }
         sendrow_1092( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_109_Refreshing )
      {
         httpContext.doAjaxLoad(109, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV71Grupodeacciones, 4, 0)) );
   }

   public void e141D32( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV21ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV23ColumnsSelector.fromJSonString(AV21ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "LectorOptico.PartesdeProduccionLector_WCColumnsSelector", ((GXutil.strcmp("", AV21ColumnsSelectorXML)==0) ? "" : AV23ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
   }

   public void e241D32( )
   {
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV71Grupodeacciones == 1 )
      {
         /* Execute user subroutine: 'DO UPDLINEA' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV71Grupodeacciones == 2 )
      {
         /* Execute user subroutine: 'DO DLTLINEA' */
         S172 ();
         if (returnInSub) return;
      }
      AV71Grupodeacciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Grupodeacciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV71Grupodeacciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
   }

   public void e151D32( )
   {
      /* Dvelop_confirmpanel_dltlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_dltlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DLTLINEA' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
   }

   public void e201D32( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.webpartesproduccionins", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(AV9HisProFec))}, new String[] {"EmprCod","Maqcod","HisProFec"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void e161D32( )
   {
      /* 'DoMarcarTodas' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_109 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_109"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_109_fel_idx = 0 ;
      while ( nGXsfl_109_fel_idx < nRC_GXsfl_109 )
      {
         nGXsfl_109_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_109_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_109_fel_idx+1) ;
         sGXsfl_109_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_1092( ) ;
         cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
         cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
         AV71Grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
         n606MaqDsc = false ;
         A558HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisProFec_Internalname), 0)) ;
         AV96Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
         A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV95M = httpContext.cgiGet( edtavM_Internalname) ;
         A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
         A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
         A7258FaseDsc = httpContext.cgiGet( edtFaseDsc_Internalname) ;
         A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname), 0) ;
         n4440HisProDTI = false ;
         A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname), 0) ;
         n4441HisProDTF = false ;
         A557HisProF = GXutil.upper( httpContext.cgiGet( edtHisProF_Internalname)) ;
         A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
         A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
         A4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3610HisProLot = httpContext.cgiGet( edtHisProLot_Internalname) ;
         A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
         n867ParCodNom = false ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A5605HisProTr2 = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV97Col_Hisprolin.add((int)(A561HisProLin), 0);
         /* End For Each Line */
      }
      if ( nGXsfl_109_fel_idx == 0 )
      {
         nGXsfl_109_idx = 1 ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
      }
      nGXsfl_109_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV97Col_Hisprolin", AV97Col_Hisprolin);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
   }

   public void e171D32( )
   {
      /* 'DoDesmarcarTodas' Routine */
      returnInSub = false ;
      AV99i = (short)(1) ;
      while ( AV99i <= AV97Col_Hisprolin.size() )
      {
         AV97Col_Hisprolin.removeItem(AV99i);
         AV99i = (short)(AV99i+1) ;
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV97Col_Hisprolin", AV97Col_Hisprolin);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ColumnsSelector", AV23ColumnsSelector);
   }

   public void e181D32( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV19ExcelFilename ;
      GXv_char3[0] = AV20ErrorMessage ;
      new app.lectoroptico.partesdeproduccionlector_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      partesdeproduccionlector_wc_impl.this.AV19ExcelFilename = GXv_char4[0] ;
      partesdeproduccionlector_wc_impl.this.AV20ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV19ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV19ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV20ErrorMessage);
      }
   }

   public void e191D32( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.lectoroptico.partesdeproduccionlector_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV15OrderedBy, 4, 0))+":"+(AV16OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Seleccionar", "", "Op", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProLin", "", "#", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&M", "", "M", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNHdr", "", "N Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "GruOpeCod", "", "Operario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarOrdLin", "", "Orden", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Fase", "", "Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FaseDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProDTI", "", "Inicio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProDTF", "", "Fin", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProF", "", "F?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProTur", "", "T", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProKgr", "", "Kgs", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProMtr", "", "Mts", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProNpzs", "", "Pcs", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProLot", "", "Lote", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ParCodNom", "", "Paro", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProTr2", "", "T. real(m)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV22UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "LectorOptico.PartesdeProduccionLector_WCColumnsSelector", GXv_char4) ;
      partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV22UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV22UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S162( )
   {
      /* 'DO UPDLINEA' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webpartesproduccionupd", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A558HisProFec)),GXutil.URLEncode(GXutil.ltrimstr(A561HisProLin,8,0)),GXutil.URLEncode(GXutil.rtrim(A13696BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A461Fase)),GXutil.URLEncode(GXutil.rtrim(A7258FaseDsc)),GXutil.URLEncode(GXutil.rtrim(AV72UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV73Station))}, new String[] {"EmprCod","MaqCod","HisProFec","HisProLin","BarNHdr","BarOrdLin","Fase","FaseDsc","Usurcod","station"}) , new Object[] {"AV7EmprCod","A602MaqCod","A558HisProFec","A561HisProLin","A13696BarNHdr","A194BarOrdLin","A461Fase","A7258FaseDsc","AV72UsurCod","AV73Station"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S172( )
   {
      /* 'DO DLTLINEA' Routine */
      returnInSub = false ;
      AV135Emprcod_selected = A396EmprCod ;
      AV136Maqcod_selected = A602MaqCod ;
      AV137Hisprofec_selected = A558HisProFec ;
      AV138Hisprolin_selected = A561HisProLin ;
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_DLTLINEAContainer", "Confirm", "", new Object[] {});
   }

   public void S182( )
   {
      /* 'DO ACTION DLTLINEA' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV8MaqCod ;
      GXv_date10[0] = AV9HisProFec ;
      GXv_int11[0] = A561HisProLin ;
      GXv_char2[0] = AV73Station ;
      GXv_char12[0] = AV72UsurCod ;
      new app.lectoroptico.pwbollb(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date10, GXv_int11, GXv_char2, GXv_char12) ;
      partesdeproduccionlector_wc_impl.this.AV7EmprCod = GXv_char4[0] ;
      partesdeproduccionlector_wc_impl.this.AV8MaqCod = GXv_char3[0] ;
      partesdeproduccionlector_wc_impl.this.AV9HisProFec = GXv_date10[0] ;
      partesdeproduccionlector_wc_impl.this.A561HisProLin = GXv_int11[0] ;
      partesdeproduccionlector_wc_impl.this.AV73Station = GXv_char2[0] ;
      partesdeproduccionlector_wc_impl.this.AV72UsurCod = GXv_char12[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCod", AV8MaqCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProFec", localUtil.format(AV9HisProFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Station", AV73Station);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72UsurCod", AV72UsurCod);
      GXv_char12[0] = AV7EmprCod ;
      GXv_int11[0] = A129BarCod ;
      GXv_int13[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_int14[0] = A194BarOrdLin ;
      new app.lectoroptico.pacfbar3(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_int13, GXv_char4, GXv_int14) ;
      partesdeproduccionlector_wc_impl.this.AV7EmprCod = GXv_char12[0] ;
      partesdeproduccionlector_wc_impl.this.A129BarCod = GXv_int11[0] ;
      partesdeproduccionlector_wc_impl.this.A132BarCodReo = GXv_int13[0] ;
      partesdeproduccionlector_wc_impl.this.A130BarCodPar = GXv_char4[0] ;
      partesdeproduccionlector_wc_impl.this.A194BarOrdLin = GXv_int14[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      AV82Texto_i = httpContext.getMessage( "Elimino Linea", "") + httpContext.getMessage( " Usuario=", "") + AV72UsurCod + httpContext.getMessage( " Terminal=", "") + AV73Station + httpContext.getMessage( " Linea=", "") + GXutil.str( A561HisProLin, 8, 0) + httpContext.getMessage( " Operario=", "") + GXutil.str( A503GruOpeCod, 6, 0) + httpContext.getMessage( " Orden=", "") + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( " Kgs=", "") + GXutil.str( A1525HisProKgr, 9, 2) + httpContext.getMessage( " Mts  =", "") + GXutil.str( A1526HisProMtr, 9, 2) + httpContext.getMessage( " Turno=", "") + GXutil.str( A566HisProTur, 1, 0) + httpContext.getMessage( " Fin=", "") + A557HisProF + httpContext.getMessage( " Inicio=", "") + localUtil.ttoc( A4440HisProDTI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Fin=", "") + localUtil.ttoc( A4441HisProDTF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      new app.pctrinc(remoteHandle, context).execute( AV7EmprCod, AV102Pgmname, AV72UsurCod, AV73Station, AV82Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      GXv_char12[0] = AV7EmprCod ;
      GXv_char4[0] = AV8MaqCod ;
      GXv_date10[0] = AV9HisProFec ;
      GXv_char3[0] = AV73Station ;
      GXv_char2[0] = AV72UsurCod ;
      new app.lectoroptico.pwbollcb(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_date10, GXv_char3, GXv_char2) ;
      partesdeproduccionlector_wc_impl.this.AV7EmprCod = GXv_char12[0] ;
      partesdeproduccionlector_wc_impl.this.AV8MaqCod = GXv_char4[0] ;
      partesdeproduccionlector_wc_impl.this.AV9HisProFec = GXv_date10[0] ;
      partesdeproduccionlector_wc_impl.this.AV73Station = GXv_char3[0] ;
      partesdeproduccionlector_wc_impl.this.AV72UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCod", AV8MaqCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProFec", localUtil.format(AV9HisProFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Station", AV73Station);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72UsurCod", AV72UsurCod);
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV102Pgmname+"GridState"), "") == 0 )
      {
         AV13GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV102Pgmname+"GridState"), null, null);
      }
      else
      {
         AV13GridState.fromxml(AV25Session.getValue(AV102Pgmname+"GridState"), null, null);
      }
      AV15OrderedBy = AV13GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
      AV16OrderedDsc = AV13GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedDsc", AV16OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV139GXV1 = 1 ;
      while ( AV139GXV1 <= AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV139GXV1));
         if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV37TFHisProLin = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFHisProLin), 8, 0));
            AV38TFHisProLin_To = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHisProLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFHisProLin_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV39TFBarNHdr = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarNHdr", AV39TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV40TFBarNHdr_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarNHdr_Sel", AV40TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV41TFGruOpeCod = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFGruOpeCod), 6, 0));
            AV42TFGruOpeCod_To = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV43TFBarOrdLin = (short)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarOrdLin), 4, 0));
            AV44TFBarOrdLin_To = (short)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV45TFFase = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFFase", AV45TFFase);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV46TFFase_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFFase_Sel", AV46TFFase_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV74TFFaseDsc = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFFaseDsc", AV74TFFaseDsc);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV75TFFaseDsc_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFFaseDsc_Sel", AV75TFFaseDsc_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV47TFHisProDTI = localUtil.ctot( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHisProDTI", localUtil.ttoc( AV47TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV49DDO_HisProDTIAuxDate = GXutil.resetTime(AV47TFHisProDTI) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49DDO_HisProDTIAuxDate", localUtil.format(AV49DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV51TFHisProDTF = localUtil.ctot( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFHisProDTF", localUtil.ttoc( AV51TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV53DDO_HisProDTFAuxDate = GXutil.resetTime(AV51TFHisProDTF) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53DDO_HisProDTFAuxDate", localUtil.format(AV53DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV55TFHisProF = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFHisProF", AV55TFHisProF);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV56TFHisProF_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFHisProF_Sel", AV56TFHisProF_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV57TFHisProTur = (byte)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFHisProTur", GXutil.str( AV57TFHisProTur, 1, 0));
            AV58TFHisProTur_To = (byte)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHisProTur_To", GXutil.str( AV58TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV59TFHisProKgr = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFHisProKgr", GXutil.ltrimstr( AV59TFHisProKgr, 9, 2));
            AV60TFHisProKgr_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFHisProKgr_To", GXutil.ltrimstr( AV60TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV61TFHisProMtr = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFHisProMtr", GXutil.ltrimstr( AV61TFHisProMtr, 9, 2));
            AV62TFHisProMtr_To = CommonUtil.decimalVal( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFHisProMtr_To", GXutil.ltrimstr( AV62TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV63TFHisProNpzs = (short)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFHisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFHisProNpzs), 4, 0));
            AV64TFHisProNpzs_To = (short)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFHisProNpzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFHisProNpzs_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT") == 0 )
         {
            AV76TFHisProLot = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFHisProLot", AV76TFHisProLot);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT_SEL") == 0 )
         {
            AV77TFHisProLot_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFHisProLot_Sel", AV77TFHisProLot_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV65TFParCodNom = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFParCodNom", AV65TFParCodNom);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV66TFParCodNom_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFParCodNom_Sel", AV66TFParCodNom_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTR2") == 0 )
         {
            AV78TFHisProTr2 = (short)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFHisProTr2), 4, 0));
            AV79TFHisProTr2_To = (short)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFHisProTr2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFHisProTr2_To), 4, 0));
         }
         AV139GXV1 = (int)(AV139GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char12[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFBarNHdr_Sel)==0), AV40TFBarNHdr_Sel, GXv_char12) ;
      partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char12[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFFase_Sel)==0), AV46TFFase_Sel, GXv_char4) ;
      partesdeproduccionlector_wc_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFFaseDsc_Sel)==0), AV75TFFaseDsc_Sel, GXv_char3) ;
      partesdeproduccionlector_wc_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFHisProF_Sel)==0), AV56TFHisProF_Sel, GXv_char2) ;
      partesdeproduccionlector_wc_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFHisProLot_Sel)==0), AV77TFHisProLot_Sel, GXv_char19) ;
      partesdeproduccionlector_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFParCodNom_Sel)==0), AV66TFParCodNom_Sel, GXv_char21) ;
      partesdeproduccionlector_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|||"+GXt_char15+"|"+GXt_char16+"|||"+GXt_char17+"|||||"+GXt_char18+"|"+GXt_char20+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFBarNHdr)==0), AV39TFBarNHdr, GXv_char21) ;
      partesdeproduccionlector_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFFase)==0), AV45TFFase, GXv_char19) ;
      partesdeproduccionlector_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char12[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFFaseDsc)==0), AV74TFFaseDsc, GXv_char12) ;
      partesdeproduccionlector_wc_impl.this.GXt_char17 = GXv_char12[0] ;
      GXt_char16 = "" ;
      GXv_char4[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFHisProF)==0), AV55TFHisProF, GXv_char4) ;
      partesdeproduccionlector_wc_impl.this.GXt_char16 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFHisProLot)==0), AV76TFHisProLot, GXv_char3) ;
      partesdeproduccionlector_wc_impl.this.GXt_char15 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFParCodNom)==0), AV65TFParCodNom, GXv_char2) ;
      partesdeproduccionlector_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV37TFHisProLin) ? "" : GXutil.str( AV37TFHisProLin, 8, 0))+"||"+GXt_char20+"|"+((0==AV41TFGruOpeCod) ? "" : GXutil.str( AV41TFGruOpeCod, 6, 0))+"|"+((0==AV43TFBarOrdLin) ? "" : GXutil.str( AV43TFBarOrdLin, 4, 0))+"|"+GXt_char18+"|"+GXt_char17+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI) ? "" : localUtil.dtoc( AV49DDO_HisProDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV51TFHisProDTF) ? "" : localUtil.dtoc( AV53DDO_HisProDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char16+"|"+((0==AV57TFHisProTur) ? "" : GXutil.str( AV57TFHisProTur, 1, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFHisProKgr)==0) ? "" : GXutil.str( AV59TFHisProKgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFHisProMtr)==0) ? "" : GXutil.str( AV61TFHisProMtr, 9, 2))+"|"+((0==AV63TFHisProNpzs) ? "" : GXutil.str( AV63TFHisProNpzs, 4, 0))+"|"+GXt_char15+"|"+GXt_char1+"|"+((0==AV78TFHisProTr2) ? "" : GXutil.str( AV78TFHisProTr2, 4, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV38TFHisProLin_To) ? "" : GXutil.str( AV38TFHisProLin_To, 8, 0))+"|||"+((0==AV42TFGruOpeCod_To) ? "" : GXutil.str( AV42TFGruOpeCod_To, 6, 0))+"|"+((0==AV44TFBarOrdLin_To) ? "" : GXutil.str( AV44TFBarOrdLin_To, 4, 0))+"||||||"+((0==AV58TFHisProTur_To) ? "" : GXutil.str( AV58TFHisProTur_To, 1, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFHisProKgr_To)==0) ? "" : GXutil.str( AV60TFHisProKgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFHisProMtr_To)==0) ? "" : GXutil.str( AV62TFHisProMtr_To, 9, 2))+"|"+((0==AV64TFHisProNpzs_To) ? "" : GXutil.str( AV64TFHisProNpzs_To, 4, 0))+"|||"+((0==AV79TFHisProTr2_To) ? "" : GXutil.str( AV79TFHisProTr2_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV13GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV13GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV13GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV13GridState.fromxml(AV25Session.getValue(AV102Pgmname+"GridState"), null, null);
      AV13GridState.setgxTv_SdtWWPGridState_Orderedby( AV15OrderedBy );
      AV13GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV16OrderedDsc );
      AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROLIN", "", !((0==AV37TFHisProLin)&&(0==AV38TFHisProLin_To)), (short)(0), GXutil.trim( GXutil.str( AV37TFHisProLin, 8, 0)), GXutil.trim( GXutil.str( AV38TFHisProLin_To, 8, 0))) ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARNHDR", "", !(GXutil.strcmp("", AV39TFBarNHdr)==0), (short)(0), AV39TFBarNHdr, "", !(GXutil.strcmp("", AV40TFBarNHdr_Sel)==0), AV40TFBarNHdr_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFGRUOPECOD", "", !((0==AV41TFGruOpeCod)&&(0==AV42TFGruOpeCod_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFGruOpeCod, 6, 0)), GXutil.trim( GXutil.str( AV42TFGruOpeCod_To, 6, 0))) ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARORDLIN", "", !((0==AV43TFBarOrdLin)&&(0==AV44TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV43TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV44TFBarOrdLin_To, 4, 0))) ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASE", "", !(GXutil.strcmp("", AV45TFFase)==0), (short)(0), AV45TFFase, "", !(GXutil.strcmp("", AV46TFFase_Sel)==0), AV46TFFase_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASEDSC", "", !(GXutil.strcmp("", AV74TFFaseDsc)==0), (short)(0), AV74TFFaseDsc, "", !(GXutil.strcmp("", AV75TFFaseDsc_Sel)==0), AV75TFFaseDsc_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPRODTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV47TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPRODTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV51TFHisProDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV51TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROF", "", !(GXutil.strcmp("", AV55TFHisProF)==0), (short)(0), AV55TFHisProF, "", !(GXutil.strcmp("", AV56TFHisProF_Sel)==0), AV56TFHisProF_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROTUR", "", !((0==AV57TFHisProTur)&&(0==AV58TFHisProTur_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFHisProTur, 1, 0)), GXutil.trim( GXutil.str( AV58TFHisProTur_To, 1, 0))) ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROKGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFHisProKgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFHisProKgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV59TFHisProKgr, 9, 2)), GXutil.trim( GXutil.str( AV60TFHisProKgr_To, 9, 2))) ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFHisProMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFHisProMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV61TFHisProMtr, 9, 2)), GXutil.trim( GXutil.str( AV62TFHisProMtr_To, 9, 2))) ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPRONPZS", "", !((0==AV63TFHisProNpzs)&&(0==AV64TFHisProNpzs_To)), (short)(0), GXutil.trim( GXutil.str( AV63TFHisProNpzs, 4, 0)), GXutil.trim( GXutil.str( AV64TFHisProNpzs_To, 4, 0))) ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROLOT", "", !(GXutil.strcmp("", AV76TFHisProLot)==0), (short)(0), AV76TFHisProLot, "", !(GXutil.strcmp("", AV77TFHisProLot_Sel)==0), AV77TFHisProLot_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPARCODNOM", "", !(GXutil.strcmp("", AV65TFParCodNom)==0), (short)(0), AV65TFParCodNom, "", !(GXutil.strcmp("", AV66TFParCodNom_Sel)==0), AV66TFParCodNom_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROTR2", "", !((0==AV78TFHisProTr2)&&(0==AV79TFHisProTr2_To)), (short)(0), GXutil.trim( GXutil.str( AV78TFHisProTr2, 4, 0)), GXutil.trim( GXutil.str( AV79TFHisProTr2_To, 4, 0))) ;
      AV13GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7EmprCod );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8MaqCod)==0) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8MaqCod );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9HisProFec)) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROFEC" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV9HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      AV13GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV13GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV102Pgmname+"GridState", AV13GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV11TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV102Pgmname );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LHIPRO" );
      AV25Session.setValue("TrnContext", AV11TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_150_1D32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_dltlinea_Internalname, tblTabledvelop_confirmpanel_dltlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_dltlinea.setProperty("Title", Dvelop_confirmpanel_dltlinea_Title);
         ucDvelop_confirmpanel_dltlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_dltlinea_Confirmationtext);
         ucDvelop_confirmpanel_dltlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_dltlinea_Yesbuttoncaption);
         ucDvelop_confirmpanel_dltlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_dltlinea_Nobuttoncaption);
         ucDvelop_confirmpanel_dltlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_dltlinea_Cancelbuttoncaption);
         ucDvelop_confirmpanel_dltlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_dltlinea_Yesbuttonposition);
         ucDvelop_confirmpanel_dltlinea.setProperty("ConfirmType", Dvelop_confirmpanel_dltlinea_Confirmtype);
         ucDvelop_confirmpanel_dltlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_dltlinea_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_150_1D32e( true) ;
      }
      else
      {
         wb_table2_150_1D32e( false) ;
      }
   }

   public void wb_table1_98_1D32( boolean wbgen )
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
         wb_table1_98_1D32e( true) ;
      }
      else
      {
         wb_table1_98_1D32e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      AV8MaqCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCod", AV8MaqCod);
      AV9HisProFec = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProFec", localUtil.format(AV9HisProFec, "99/99/99"));
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
      pa1D32( ) ;
      ws1D32( ) ;
      we1D32( ) ;
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
      sCtrlAV7EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8MaqCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9HisProFec = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1D32( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "lectoroptico\\partesdeproduccionlector_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1D32( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
         AV8MaqCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCod", AV8MaqCod);
         AV9HisProFec = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProFec", localUtil.format(AV9HisProFec, "99/99/99"));
      }
      wcpOAV7EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV7EmprCod") ;
      wcpOAV8MaqCod = httpContext.cgiGet( sPrefix+"wcpOAV8MaqCod") ;
      wcpOAV9HisProFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9HisProFec"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7EmprCod, wcpOAV7EmprCod) != 0 ) || ( GXutil.strcmp(AV8MaqCod, wcpOAV8MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV9HisProFec), GXutil.resetTime(wcpOAV9HisProFec)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV7EmprCod = AV7EmprCod ;
      wcpOAV8MaqCod = AV8MaqCod ;
      wcpOAV9HisProFec = AV9HisProFec ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7EmprCod = httpContext.cgiGet( sPrefix+"AV7EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV7EmprCod) > 0 )
      {
         AV7EmprCod = httpContext.cgiGet( sCtrlAV7EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      }
      else
      {
         AV7EmprCod = httpContext.cgiGet( sPrefix+"AV7EmprCod_PARM") ;
      }
      sCtrlAV8MaqCod = httpContext.cgiGet( sPrefix+"AV8MaqCod_CTRL") ;
      if ( GXutil.len( sCtrlAV8MaqCod) > 0 )
      {
         AV8MaqCod = httpContext.cgiGet( sCtrlAV8MaqCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MaqCod", AV8MaqCod);
      }
      else
      {
         AV8MaqCod = httpContext.cgiGet( sPrefix+"AV8MaqCod_PARM") ;
      }
      sCtrlAV9HisProFec = httpContext.cgiGet( sPrefix+"AV9HisProFec_CTRL") ;
      if ( GXutil.len( sCtrlAV9HisProFec) > 0 )
      {
         AV9HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV9HisProFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisProFec", localUtil.format(AV9HisProFec, "99/99/99"));
      }
      else
      {
         AV9HisProFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV9HisProFec_PARM"), 0) ;
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
      pa1D32( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1D32( ) ;
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
      ws1D32( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7EmprCod_PARM", GXutil.rtrim( AV7EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7EmprCod_CTRL", GXutil.rtrim( sCtrlAV7EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCod_PARM", GXutil.rtrim( AV8MaqCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8MaqCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MaqCod_CTRL", GXutil.rtrim( sCtrlAV8MaqCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisProFec_PARM", localUtil.dtoc( AV9HisProFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9HisProFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisProFec_CTRL", GXutil.rtrim( sCtrlAV9HisProFec));
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
      we1D32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562716", true, true);
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
      httpContext.AddJavascriptSource("lectoroptico/partesdeproduccionlector_wc.js", "?202682115562716", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1092( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_109_idx );
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_109_idx ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC_"+sGXsfl_109_idx ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC_"+sGXsfl_109_idx ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_109_idx );
      edtHisProLin_Internalname = sPrefix+"HISPROLIN_"+sGXsfl_109_idx ;
      edtavM_Internalname = sPrefix+"vM_"+sGXsfl_109_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_109_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_109_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_109_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_109_idx ;
      edtFaseDsc_Internalname = sPrefix+"FASEDSC_"+sGXsfl_109_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_109_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_109_idx ;
      edtHisProF_Internalname = sPrefix+"HISPROF_"+sGXsfl_109_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_109_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_109_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_109_idx ;
      edtHisProNpzs_Internalname = sPrefix+"HISPRONPZS_"+sGXsfl_109_idx ;
      edtHisProLot_Internalname = sPrefix+"HISPROLOT_"+sGXsfl_109_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_109_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_109_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_109_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_109_idx ;
      edtHisProTr2_Internalname = sPrefix+"HISPROTR2_"+sGXsfl_109_idx ;
   }

   public void subsflControlProps_fel_1092( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_109_fel_idx );
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_109_fel_idx ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC_"+sGXsfl_109_fel_idx ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC_"+sGXsfl_109_fel_idx ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_109_fel_idx );
      edtHisProLin_Internalname = sPrefix+"HISPROLIN_"+sGXsfl_109_fel_idx ;
      edtavM_Internalname = sPrefix+"vM_"+sGXsfl_109_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_109_fel_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_109_fel_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_109_fel_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_109_fel_idx ;
      edtFaseDsc_Internalname = sPrefix+"FASEDSC_"+sGXsfl_109_fel_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_109_fel_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_109_fel_idx ;
      edtHisProF_Internalname = sPrefix+"HISPROF_"+sGXsfl_109_fel_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_109_fel_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_109_fel_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_109_fel_idx ;
      edtHisProNpzs_Internalname = sPrefix+"HISPRONPZS_"+sGXsfl_109_fel_idx ;
      edtHisProLot_Internalname = sPrefix+"HISPROLOT_"+sGXsfl_109_fel_idx ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM_"+sGXsfl_109_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_109_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_109_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_109_fel_idx ;
      edtHisProTr2_Internalname = sPrefix+"HISPROTR2_"+sGXsfl_109_fel_idx ;
   }

   public void sendrow_1092( )
   {
      subsflControlProps_1092( ) ;
      wb1D30( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_109_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_109_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_109_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'"+sPrefix+"',false,'"+sGXsfl_109_idx+"',109)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_109_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV71Grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV71Grupodeacciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Grupodeacciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV71Grupodeacciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRUPODEACCIONES.CLICK."+sGXsfl_109_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,110);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV71Grupodeacciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_109_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDsc_Internalname,GXutil.rtrim( A606MaqDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProFec_Internalname,localUtil.format(A558HisProFec, "99/99/99"),localUtil.format( A558HisProFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 114,'"+sPrefix+"',false,'"+sGXsfl_109_idx+"',109)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_109_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_109_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV96Seleccionar),"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,114);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavM_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavM_Enabled!=0)&&(edtavM_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 116,'"+sPrefix+"',false,'"+sGXsfl_109_idx+"',109)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavM_Internalname,GXutil.rtrim( AV95M),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavM_Enabled!=0)&&(edtavM_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,116);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavM_Visible),Integer.valueOf(edtavM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGruOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGruOpeCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarOrdLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFase_Internalname,GXutil.rtrim( A461Fase),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFase_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFaseDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFaseDsc_Internalname,GXutil.rtrim( A7258FaseDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFaseDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFaseDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTI_Internalname,localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4440HisProDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTF_Internalname,localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4441HisProDTF, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisProF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProF_Internalname,GXutil.rtrim( A557HisProF),GXutil.rtrim( localUtil.format( A557HisProF, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTur_Internalname,GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProTur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProTur_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProKgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProKgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProNpzs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProNpzs_Internalname,GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProNpzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProNpzs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisProLot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLot_Internalname,GXutil.rtrim( A3610HisProLot),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProLot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCodNom_Internalname,GXutil.rtrim( A867ParCodNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtParCodNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtParCodNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProTr2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTr2_Internalname,GXutil.ltrim( localUtil.ntoc( A5605HisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5605HisProTr2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProTr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProTr2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1D32( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_109_idx = ((subGrid_Islastpage==1)&&(nGXsfl_109_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_109_idx+1) ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
      }
      /* End function sendrow_1092 */
   }

   public void startgridcontrol109( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"109\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavM_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "M", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProNpzs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pcs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProLot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProTr2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T. real(m)", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV71Grupodeacciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A606MaqDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A558HisProFec, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV96Seleccionar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV95M));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavM_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavM_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGruOpeCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProDTI_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProDTF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A557HisProF));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProTur_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3610HisProLot));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProLot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A867ParCodNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtParCodNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5605HisProTr2, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProTr2_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavLecbarcod_Internalname = sPrefix+"vLECBARCOD" ;
      edtavLecbarreo_Internalname = sPrefix+"vLECBARREO" ;
      edtavLecbarpar_Internalname = sPrefix+"vLECBARPAR" ;
      edtavLecfec_Internalname = sPrefix+"vLECFEC" ;
      edtavLechor_Internalname = sPrefix+"vLECHOR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtavLecfasord_Internalname = sPrefix+"vLECFASORD" ;
      edtavLecfascod_Internalname = sPrefix+"vLECFASCOD" ;
      edtavLecfasdsc_Internalname = sPrefix+"vLECFASDSC" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtavLecopecod_Internalname = sPrefix+"vLECOPECOD" ;
      edtavLecopenom_Internalname = sPrefix+"vLECOPENOM" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      edtavLecparcod_Internalname = sPrefix+"vLECPARCOD" ;
      edtavLecparnom_Internalname = sPrefix+"vLECPARNOM" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtninsert_Internalname = sPrefix+"BTNINSERT" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      bttBtnmarcartodas_Internalname = sPrefix+"BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = sPrefix+"BTNDESMARCARTODAS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES" );
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC" ;
      edtHisProFec_Internalname = sPrefix+"HISPROFEC" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtHisProLin_Internalname = sPrefix+"HISPROLIN" ;
      edtavM_Internalname = sPrefix+"vM" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD" ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtFase_Internalname = sPrefix+"FASE" ;
      edtFaseDsc_Internalname = sPrefix+"FASEDSC" ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI" ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF" ;
      edtHisProF_Internalname = sPrefix+"HISPROF" ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR" ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR" ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR" ;
      edtHisProNpzs_Internalname = sPrefix+"HISPRONPZS" ;
      edtHisProLot_Internalname = sPrefix+"HISPROLOT" ;
      edtParCodNom_Internalname = sPrefix+"PARCODNOM" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtHisProTr2_Internalname = sPrefix+"HISPROTR2" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_dltlinea_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_DLTLINEA" ;
      tblTabledvelop_confirmpanel_dltlinea_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_DLTLINEA" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
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
      edtHisProTr2_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtParCodNom_Jsonclick = "" ;
      edtHisProLot_Jsonclick = "" ;
      edtHisProNpzs_Jsonclick = "" ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProKgr_Jsonclick = "" ;
      edtHisProTur_Jsonclick = "" ;
      edtHisProF_Jsonclick = "" ;
      edtHisProDTF_Jsonclick = "" ;
      edtHisProDTI_Jsonclick = "" ;
      edtFaseDsc_Jsonclick = "" ;
      edtFase_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtGruOpeCod_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtavM_Jsonclick = "" ;
      edtavM_Enabled = 1 ;
      edtHisProLin_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setEnabled( 1 );
      edtHisProFec_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtHisProTr2_Visible = -1 ;
      edtParCodNom_Visible = -1 ;
      edtHisProLot_Visible = -1 ;
      edtHisProNpzs_Visible = -1 ;
      edtHisProMtr_Visible = -1 ;
      edtHisProKgr_Visible = -1 ;
      edtHisProTur_Visible = -1 ;
      edtHisProF_Visible = -1 ;
      edtHisProDTF_Visible = -1 ;
      edtHisProDTI_Visible = -1 ;
      edtFaseDsc_Visible = -1 ;
      edtFase_Visible = -1 ;
      edtBarOrdLin_Visible = -1 ;
      edtGruOpeCod_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtavM_Visible = -1 ;
      edtHisProLin_Visible = -1 ;
      chkavSeleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisprodtfauxdate_Jsonclick = "" ;
      edtavDdo_hisprodtiauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavLecparnom_Jsonclick = "" ;
      edtavLecparnom_Enabled = 1 ;
      edtavLecparcod_Jsonclick = "" ;
      edtavLecparcod_Enabled = 1 ;
      edtavLecopenom_Jsonclick = "" ;
      edtavLecopenom_Enabled = 1 ;
      edtavLecopecod_Jsonclick = "" ;
      edtavLecopecod_Enabled = 1 ;
      edtavLecfasdsc_Jsonclick = "" ;
      edtavLecfasdsc_Enabled = 1 ;
      edtavLecfascod_Jsonclick = "" ;
      edtavLecfascod_Enabled = 1 ;
      edtavLecfasord_Jsonclick = "" ;
      edtavLecfasord_Enabled = 1 ;
      edtavLechor_Jsonclick = "" ;
      edtavLechor_Enabled = 1 ;
      edtavLecfec_Jsonclick = "" ;
      edtavLecfec_Enabled = 1 ;
      edtavLecbarpar_Jsonclick = "" ;
      edtavLecbarpar_Enabled = 1 ;
      edtavLecbarreo_Jsonclick = "" ;
      edtavLecbarreo_Enabled = 1 ;
      edtavLecbarcod_Jsonclick = "" ;
      edtavLecbarcod_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_dltlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_dltlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_dltlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_dltlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_dltlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_dltlinea_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_dltlinea_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "LectorOptico.PartesdeProduccionLector_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic|||Dynamic|Dynamic|||Dynamic|||||Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "|||T|||T|T|||T|||||T|T|" ;
      Ddo_grid_Filterisrange = "|T|||T|T||||||T|T|T|T|||T" ;
      Ddo_grid_Filtertype = "|Numeric||Character|Numeric|Numeric|Character|Character|Date|Date|Character|Numeric|Numeric|Numeric|Numeric|Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "|T||T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|||T|T|T||T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "|2|||3|4|5||6|7|8|9|10|11|12|13|14|" ;
      Ddo_grid_Columnids = "4:Seleccionar|5:HisProLin|6:M|7:BarNHdr|8:GruOpeCod|9:BarOrdLin|10:Fase|11:FaseDsc|12:HisProDTI|13:HisProDTF|14:HisProF|15:HisProTur|16:HisProKgr|17:HisProMtr|18:HisProNpzs|19:HisProLot|20:ParCodNom|24:HisProTr2" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Tabla LECTOR", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_109_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
      }
      GXCCtl = "vSELECCIONAR_" + sGXsfl_109_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_109_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'sPrefix'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV37TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV38TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV41TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV42TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV44TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV45TFFase',fld:'vTFFASE',pic:''},{av:'AV46TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV47TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV51TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV55TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV56TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV57TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV58TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV59TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV60TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV61TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV62TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV64TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV76TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV77TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV65TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV66TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV78TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV79TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtavM_Visible',ctrl:'vM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtHisProLot_Visible',ctrl:'HISPROLOT',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'edtHisProTr2_Visible',ctrl:'HISPROTR2',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111D32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV37TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV38TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV41TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV42TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV44TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV45TFFase',fld:'vTFFASE',pic:''},{av:'AV46TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV47TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV51TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV55TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV56TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV57TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV58TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV59TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV60TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV61TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV62TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV64TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV76TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV77TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV65TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV66TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV78TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV79TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121D32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV37TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV38TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV41TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV42TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV44TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV45TFFase',fld:'vTFFASE',pic:''},{av:'AV46TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV47TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV51TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV55TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV56TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV57TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV58TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV59TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV60TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV61TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV62TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV64TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV76TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV77TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV65TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV66TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV78TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV79TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131D32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV37TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV38TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV41TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV42TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV44TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV45TFFase',fld:'vTFFASE',pic:''},{av:'AV46TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV47TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV51TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV55TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV56TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV57TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV58TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV59TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV60TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV61TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV62TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV64TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV76TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV77TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV65TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV66TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV78TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV79TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV79TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV65TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV66TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV76TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV77TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV63TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV64TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV61TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV62TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV60TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV57TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV58TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV55TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV56TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV51TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV47TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV45TFFase',fld:'vTFFASE',pic:''},{av:'AV46TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV43TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV44TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV41TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV42TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV37TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV38TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e231D32',iparms:[{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV71Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV95M',fld:'vM',pic:''},{av:'AV96Seleccionar',fld:'vSELECCIONAR',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141D32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV37TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV38TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV41TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV42TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV44TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV45TFFase',fld:'vTFFASE',pic:''},{av:'AV46TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV47TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV51TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV55TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV56TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV57TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV58TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV59TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV60TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV61TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV62TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV64TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV76TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV77TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV65TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV66TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV78TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV79TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtavM_Visible',ctrl:'vM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtHisProLot_Visible',ctrl:'HISPROLOT',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'edtHisProTr2_Visible',ctrl:'HISPROTR2',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e241D32',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV71Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV37TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV38TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV41TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV42TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV44TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV45TFFase',fld:'vTFFASE',pic:''},{av:'AV46TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV47TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV51TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV55TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV56TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV57TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV58TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV59TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV60TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV61TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV62TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV64TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV76TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV77TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV65TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV66TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV78TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV79TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'sPrefix'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV71Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV73Station',fld:'vSTATION',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A461Fase',fld:'FASE',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtavM_Visible',ctrl:'vM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtHisProLot_Visible',ctrl:'HISPROLOT',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'edtHisProTr2_Visible',ctrl:'HISPROTR2',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DLTLINEA.CLOSE","{handler:'e151D32',iparms:[{av:'Dvelop_confirmpanel_dltlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_DLTLINEA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV37TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV38TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV41TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV42TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV44TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV45TFFase',fld:'vTFFASE',pic:''},{av:'AV46TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV47TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV51TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV55TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV56TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV57TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV58TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV59TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV60TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV61TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV62TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV64TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV76TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV77TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV65TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV66TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV78TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV79TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'sPrefix'},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'AV73Station',fld:'vSTATION',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9',hsh:true},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9',hsh:true},{av:'A557HisProF',fld:'HISPROF',pic:'@!',hsh:true},{av:'A4440HisProDTI',fld:'HISPRODTI',pic:'99/99/99 99:99:99',hsh:true},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DLTLINEA.CLOSE",",oparms:[{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtavM_Visible',ctrl:'vM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtHisProLot_Visible',ctrl:'HISPROLOT',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'edtHisProTr2_Visible',ctrl:'HISPROTR2',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e201D32',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e161D32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV37TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV38TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV41TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV42TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV44TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV45TFFase',fld:'vTFFASE',pic:''},{av:'AV46TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV47TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV51TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV55TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV56TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV57TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV58TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV59TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV60TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV61TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV62TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV64TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV76TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV77TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV65TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV66TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV78TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV79TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'sPrefix'},{av:'A561HisProLin',fld:'HISPROLIN',grid:109,pic:'ZZZZZZZ9'},{av:'nRC_GXsfl_109',ctrl:'GRID',grid:109,prop:'GridRC',grid:109}]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtavM_Visible',ctrl:'vM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtHisProLot_Visible',ctrl:'HISPROLOT',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'edtHisProTr2_Visible',ctrl:'HISPROTR2',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e171D32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV37TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV38TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV39TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV41TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV42TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV44TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV45TFFase',fld:'vTFFASE',pic:''},{av:'AV46TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV47TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV51TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV55TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV56TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV57TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV58TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV59TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV60TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV61TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV62TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV64TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV76TFHisProLot',fld:'vTFHISPROLOT',pic:''},{av:'AV77TFHisProLot_Sel',fld:'vTFHISPROLOT_SEL',pic:''},{av:'AV65TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV66TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV78TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV79TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'sPrefix'}]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[{av:'AV97Col_Hisprolin',fld:'vCOL_HISPROLIN',pic:''},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtavM_Visible',ctrl:'vM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtHisProLot_Visible',ctrl:'HISPROLOT',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'edtHisProTr2_Visible',ctrl:'HISPROTR2',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e181D32',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e191D32',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_FASE","{handler:'valid_Fase',iparms:[]");
      setEventMetadata("VALID_FASE",",oparms:[]}");
      setEventMetadata("VALID_FASEDSC","{handler:'valid_Fasedsc',iparms:[]");
      setEventMetadata("VALID_FASEDSC",",oparms:[]}");
      setEventMetadata("VALID_HISPRODTI","{handler:'valid_Hisprodti',iparms:[]");
      setEventMetadata("VALID_HISPRODTI",",oparms:[]}");
      setEventMetadata("VALID_HISPRODTF","{handler:'valid_Hisprodtf',iparms:[]");
      setEventMetadata("VALID_HISPRODTF",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hisprotr2',iparms:[]");
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
      wcpOAV7EmprCod = "" ;
      wcpOAV8MaqCod = "" ;
      wcpOAV9HisProFec = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Dvelop_confirmpanel_dltlinea_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7EmprCod = "" ;
      AV8MaqCod = "" ;
      AV9HisProFec = GXutil.nullDate() ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39TFBarNHdr = "" ;
      AV40TFBarNHdr_Sel = "" ;
      AV45TFFase = "" ;
      AV46TFFase_Sel = "" ;
      AV74TFFaseDsc = "" ;
      AV75TFFaseDsc_Sel = "" ;
      AV47TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV51TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV55TFHisProF = "" ;
      AV56TFHisProF_Sel = "" ;
      AV59TFHisProKgr = DecimalUtil.ZERO ;
      AV60TFHisProKgr_To = DecimalUtil.ZERO ;
      AV61TFHisProMtr = DecimalUtil.ZERO ;
      AV62TFHisProMtr_To = DecimalUtil.ZERO ;
      AV76TFHisProLot = "" ;
      AV77TFHisProLot_Sel = "" ;
      AV65TFParCodNom = "" ;
      AV66TFParCodNom_Sel = "" ;
      AV102Pgmname = "" ;
      AV97Col_Hisprolin = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV67DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV72UsurCod = "" ;
      AV73Station = "" ;
      A396EmprCod = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV85LecBarPar = "" ;
      AV86LecFec = GXutil.nullDate() ;
      AV87LecHor = "" ;
      AV93LecFasCod = "" ;
      AV94LecFasDsc = "" ;
      AV91lecOpeNom = "" ;
      AV89LecParNom = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV49DDO_HisProDTIAuxDate = GXutil.nullDate() ;
      AV53DDO_HisProDTFAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      AV95M = "" ;
      A13696BarNHdr = "" ;
      A461Fase = "" ;
      A7258FaseDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A3610HisProLot = "" ;
      A867ParCodNom = "" ;
      A130BarCodPar = "" ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = "" ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = "" ;
      AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = "" ;
      AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = "" ;
      AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = "" ;
      AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = "" ;
      AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = "" ;
      AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = "" ;
      AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = "" ;
      AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = "" ;
      AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = "" ;
      AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = "" ;
      lV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase = "" ;
      lV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = "" ;
      lV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = "" ;
      lV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = "" ;
      H01D32_A656ParCod = new short[1] ;
      H01D32_n656ParCod = new boolean[] {false} ;
      H01D32_A867ParCodNom = new String[] {""} ;
      H01D32_n867ParCodNom = new boolean[] {false} ;
      H01D32_A3610HisProLot = new String[] {""} ;
      H01D32_A4714HisProNpzs = new short[1] ;
      H01D32_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01D32_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01D32_A566HisProTur = new byte[1] ;
      H01D32_A557HisProF = new String[] {""} ;
      H01D32_A194BarOrdLin = new short[1] ;
      H01D32_A503GruOpeCod = new int[1] ;
      H01D32_A561HisProLin = new int[1] ;
      H01D32_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01D32_A606MaqDsc = new String[] {""} ;
      H01D32_n606MaqDsc = new boolean[] {false} ;
      H01D32_A602MaqCod = new String[] {""} ;
      H01D32_A130BarCodPar = new String[] {""} ;
      H01D32_A132BarCodReo = new byte[1] ;
      H01D32_A129BarCod = new int[1] ;
      H01D32_A461Fase = new String[] {""} ;
      H01D32_A396EmprCod = new String[] {""} ;
      H01D32_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01D32_n4440HisProDTI = new boolean[] {false} ;
      H01D32_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01D32_n4441HisProDTF = new boolean[] {false} ;
      H01D33_A656ParCod = new short[1] ;
      H01D33_n656ParCod = new boolean[] {false} ;
      H01D33_A867ParCodNom = new String[] {""} ;
      H01D33_n867ParCodNom = new boolean[] {false} ;
      H01D33_A3610HisProLot = new String[] {""} ;
      H01D33_A4714HisProNpzs = new short[1] ;
      H01D33_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01D33_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01D33_A566HisProTur = new byte[1] ;
      H01D33_A557HisProF = new String[] {""} ;
      H01D33_A194BarOrdLin = new short[1] ;
      H01D33_A503GruOpeCod = new int[1] ;
      H01D33_A561HisProLin = new int[1] ;
      H01D33_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01D33_A606MaqDsc = new String[] {""} ;
      H01D33_n606MaqDsc = new boolean[] {false} ;
      H01D33_A602MaqCod = new String[] {""} ;
      H01D33_A130BarCodPar = new String[] {""} ;
      H01D33_A132BarCodReo = new byte[1] ;
      H01D33_A129BarCod = new int[1] ;
      H01D33_A461Fase = new String[] {""} ;
      H01D33_A396EmprCod = new String[] {""} ;
      H01D33_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01D33_n4440HisProDTI = new boolean[] {false} ;
      H01D33_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01D33_n4441HisProDTF = new boolean[] {false} ;
      hsh = "" ;
      AV81EmprNom = "" ;
      AV80MaqDsc = "" ;
      H01D34_A1166LecMaqCod = new String[] {""} ;
      H01D34_A1167LecBarCod = new int[1] ;
      H01D34_n1167LecBarCod = new boolean[] {false} ;
      H01D34_A1168LecBarReo = new byte[1] ;
      H01D34_n1168LecBarReo = new boolean[] {false} ;
      H01D34_A1169LecBarPar = new String[] {""} ;
      H01D34_n1169LecBarPar = new boolean[] {false} ;
      H01D34_A1188LecFasOrd = new short[1] ;
      H01D34_n1188LecFasOrd = new boolean[] {false} ;
      H01D34_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01D34_n1174LecFec = new boolean[] {false} ;
      H01D34_A1173LecHor = new String[] {""} ;
      H01D34_n1173LecHor = new boolean[] {false} ;
      H01D34_A1172LecParCod = new short[1] ;
      H01D34_n1172LecParCod = new boolean[] {false} ;
      H01D34_A1171LecFasCod = new String[] {""} ;
      H01D34_n1171LecFasCod = new boolean[] {false} ;
      H01D34_A1170LecOpeCod = new int[1] ;
      H01D34_n1170LecOpeCod = new boolean[] {false} ;
      H01D34_A396EmprCod = new String[] {""} ;
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1173LecHor = "" ;
      A1171LecFasCod = "" ;
      A14261LecParNom = "" ;
      A14260LecFasDsc = "" ;
      A14259lecOpeNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV21ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV19ExcelFilename = "" ;
      AV20ErrorMessage = "" ;
      AV22UserCustomValue = "" ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV135Emprcod_selected = "" ;
      AV136Maqcod_selected = "" ;
      AV137Hisprofec_selected = GXutil.nullDate() ;
      GXv_int11 = new int[1] ;
      GXv_int13 = new byte[1] ;
      GXv_int14 = new short[1] ;
      AV82Texto_i = "" ;
      GXv_date10 = new java.util.Date[1] ;
      AV13GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV14GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char12 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_dltlinea = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7EmprCod = "" ;
      sCtrlAV8MaqCod = "" ;
      sCtrlAV9HisProFec = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.partesdeproduccionlector_wc__default(),
         new Object[] {
             new Object[] {
            H01D32_A656ParCod, H01D32_n656ParCod, H01D32_A867ParCodNom, H01D32_n867ParCodNom, H01D32_A3610HisProLot, H01D32_A4714HisProNpzs, H01D32_A1526HisProMtr, H01D32_A1525HisProKgr, H01D32_A566HisProTur, H01D32_A557HisProF,
            H01D32_A194BarOrdLin, H01D32_A503GruOpeCod, H01D32_A561HisProLin, H01D32_A558HisProFec, H01D32_A606MaqDsc, H01D32_n606MaqDsc, H01D32_A602MaqCod, H01D32_A130BarCodPar, H01D32_A132BarCodReo, H01D32_A129BarCod,
            H01D32_A461Fase, H01D32_A396EmprCod, H01D32_A4440HisProDTI, H01D32_n4440HisProDTI, H01D32_A4441HisProDTF, H01D32_n4441HisProDTF
            }
            , new Object[] {
            H01D33_A656ParCod, H01D33_n656ParCod, H01D33_A867ParCodNom, H01D33_n867ParCodNom, H01D33_A3610HisProLot, H01D33_A4714HisProNpzs, H01D33_A1526HisProMtr, H01D33_A1525HisProKgr, H01D33_A566HisProTur, H01D33_A557HisProF,
            H01D33_A194BarOrdLin, H01D33_A503GruOpeCod, H01D33_A561HisProLin, H01D33_A558HisProFec, H01D33_A606MaqDsc, H01D33_n606MaqDsc, H01D33_A602MaqCod, H01D33_A130BarCodPar, H01D33_A132BarCodReo, H01D33_A129BarCod,
            H01D33_A461Fase, H01D33_A396EmprCod, H01D33_A4440HisProDTI, H01D33_n4440HisProDTI, H01D33_A4441HisProDTF, H01D33_n4441HisProDTF
            }
            , new Object[] {
            H01D34_A1166LecMaqCod, H01D34_A1167LecBarCod, H01D34_n1167LecBarCod, H01D34_A1168LecBarReo, H01D34_n1168LecBarReo, H01D34_A1169LecBarPar, H01D34_n1169LecBarPar, H01D34_A1188LecFasOrd, H01D34_n1188LecFasOrd, H01D34_A1174LecFec,
            H01D34_n1174LecFec, H01D34_A1173LecHor, H01D34_n1173LecHor, H01D34_A1172LecParCod, H01D34_n1172LecParCod, H01D34_A1171LecFasCod, H01D34_n1171LecFasCod, H01D34_A1170LecOpeCod, H01D34_n1170LecOpeCod, H01D34_A396EmprCod
            }
         }
      );
      AV102Pgmname = "LectorOptico.PartesdeProduccionLector_WC" ;
      /* GeneXus formulas. */
      AV102Pgmname = "LectorOptico.PartesdeProduccionLector_WC" ;
      Gx_err = (short)(0) ;
      edtavLecbarcod_Enabled = 0 ;
      edtavLecbarreo_Enabled = 0 ;
      edtavLecbarpar_Enabled = 0 ;
      edtavLecfec_Enabled = 0 ;
      edtavLechor_Enabled = 0 ;
      edtavLecfasord_Enabled = 0 ;
      edtavLecfascod_Enabled = 0 ;
      edtavLecfasdsc_Enabled = 0 ;
      edtavLecopecod_Enabled = 0 ;
      edtavLecopenom_Enabled = 0 ;
      edtavLecparcod_Enabled = 0 ;
      edtavLecparnom_Enabled = 0 ;
      edtavM_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV57TFHisProTur ;
   private byte AV58TFHisProTur_To ;
   private byte AV84LecBarReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ;
   private byte AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A1168LecBarReo ;
   private byte GXv_int13[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV43TFBarOrdLin ;
   private short AV44TFBarOrdLin_To ;
   private short AV63TFHisProNpzs ;
   private short AV64TFHisProNpzs_To ;
   private short AV78TFHisProTr2 ;
   private short AV79TFHisProTr2_To ;
   private short AV15OrderedBy ;
   private short AV99i ;
   private short wbEnd ;
   private short wbStart ;
   private short AV92LecFasOrd ;
   private short AV88LecParCod ;
   private short AV71Grupodeacciones ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A5605HisProTr2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ;
   private short AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ;
   private short AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ;
   private short AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ;
   private short AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ;
   private short AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ;
   private short A656ParCod ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short GXv_int14[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_109 ;
   private int nGXsfl_109_idx=1 ;
   private int AV37TFHisProLin ;
   private int AV38TFHisProLin_To ;
   private int AV41TFGruOpeCod ;
   private int AV42TFGruOpeCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV83LecBarCod ;
   private int edtavLecbarcod_Enabled ;
   private int edtavLecbarreo_Enabled ;
   private int edtavLecbarpar_Enabled ;
   private int edtavLecfec_Enabled ;
   private int edtavLechor_Enabled ;
   private int edtavLecfasord_Enabled ;
   private int edtavLecfascod_Enabled ;
   private int edtavLecfasdsc_Enabled ;
   private int AV90LecOpeCod ;
   private int edtavLecopecod_Enabled ;
   private int edtavLecopenom_Enabled ;
   private int edtavLecparcod_Enabled ;
   private int edtavLecparnom_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavM_Enabled ;
   private int AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ;
   private int AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ;
   private int AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ;
   private int AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int edtHisProLin_Visible ;
   private int edtavM_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtGruOpeCod_Visible ;
   private int edtBarOrdLin_Visible ;
   private int edtFase_Visible ;
   private int edtFaseDsc_Visible ;
   private int edtHisProDTI_Visible ;
   private int edtHisProDTF_Visible ;
   private int edtHisProF_Visible ;
   private int edtHisProTur_Visible ;
   private int edtHisProKgr_Visible ;
   private int edtHisProMtr_Visible ;
   private int edtHisProNpzs_Visible ;
   private int edtHisProLot_Visible ;
   private int edtParCodNom_Visible ;
   private int edtHisProTr2_Visible ;
   private int AV68PageToGo ;
   private int nGXsfl_109_fel_idx=1 ;
   private int AV138Hisprolin_selected ;
   private int GXv_int11[] ;
   private int AV139GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV69GridCurrentPage ;
   private long AV70GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV59TFHisProKgr ;
   private java.math.BigDecimal AV60TFHisProKgr_To ;
   private java.math.BigDecimal AV61TFHisProMtr ;
   private java.math.BigDecimal AV62TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ;
   private java.math.BigDecimal AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ;
   private java.math.BigDecimal AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV8MaqCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Dvelop_confirmpanel_dltlinea_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7EmprCod ;
   private String AV8MaqCod ;
   private String sGXsfl_109_idx="0001" ;
   private String AV39TFBarNHdr ;
   private String AV40TFBarNHdr_Sel ;
   private String AV45TFFase ;
   private String AV46TFFase_Sel ;
   private String AV74TFFaseDsc ;
   private String AV75TFFaseDsc_Sel ;
   private String AV55TFHisProF ;
   private String AV56TFHisProF_Sel ;
   private String AV76TFHisProLot ;
   private String AV77TFHisProLot_Sel ;
   private String AV65TFParCodNom ;
   private String AV66TFParCodNom_Sel ;
   private String AV102Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV72UsurCod ;
   private String AV73Station ;
   private String A396EmprCod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvelop_confirmpanel_dltlinea_Title ;
   private String Dvelop_confirmpanel_dltlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_dltlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_dltlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_dltlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_dltlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_dltlinea_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavLecbarcod_Internalname ;
   private String TempTags ;
   private String edtavLecbarcod_Jsonclick ;
   private String edtavLecbarreo_Internalname ;
   private String edtavLecbarreo_Jsonclick ;
   private String edtavLecbarpar_Internalname ;
   private String AV85LecBarPar ;
   private String edtavLecbarpar_Jsonclick ;
   private String edtavLecfec_Internalname ;
   private String edtavLecfec_Jsonclick ;
   private String edtavLechor_Internalname ;
   private String AV87LecHor ;
   private String edtavLechor_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavLecfasord_Internalname ;
   private String edtavLecfasord_Jsonclick ;
   private String edtavLecfascod_Internalname ;
   private String AV93LecFasCod ;
   private String edtavLecfascod_Jsonclick ;
   private String edtavLecfasdsc_Internalname ;
   private String AV94LecFasDsc ;
   private String edtavLecfasdsc_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavLecopecod_Internalname ;
   private String edtavLecopecod_Jsonclick ;
   private String edtavLecopenom_Internalname ;
   private String AV91lecOpeNom ;
   private String edtavLecopenom_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavLecparcod_Internalname ;
   private String edtavLecparcod_Jsonclick ;
   private String edtavLecparnom_Internalname ;
   private String AV89LecParNom ;
   private String edtavLecparnom_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
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
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Internalname ;
   private String edtHisProFec_Internalname ;
   private String edtHisProLin_Internalname ;
   private String AV95M ;
   private String edtavM_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtGruOpeCod_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A461Fase ;
   private String edtFase_Internalname ;
   private String A7258FaseDsc ;
   private String edtFaseDsc_Internalname ;
   private String edtHisProDTI_Internalname ;
   private String edtHisProDTF_Internalname ;
   private String A557HisProF ;
   private String edtHisProF_Internalname ;
   private String edtHisProTur_Internalname ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProMtr_Internalname ;
   private String edtHisProNpzs_Internalname ;
   private String A3610HisProLot ;
   private String edtHisProLot_Internalname ;
   private String A867ParCodNom ;
   private String edtParCodNom_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtHisProTr2_Internalname ;
   private String AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ;
   private String AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ;
   private String AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase ;
   private String AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ;
   private String AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ;
   private String AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ;
   private String AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ;
   private String AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ;
   private String AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ;
   private String AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ;
   private String AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ;
   private String AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ;
   private String lV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase ;
   private String lV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ;
   private String lV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ;
   private String lV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ;
   private String hsh ;
   private String AV81EmprNom ;
   private String AV80MaqDsc ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private String A1173LecHor ;
   private String A1171LecFasCod ;
   private String A14261LecParNom ;
   private String A14260LecFasDsc ;
   private String A14259lecOpeNom ;
   private String sGXsfl_109_fel_idx="0001" ;
   private String AV135Emprcod_selected ;
   private String AV136Maqcod_selected ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char17 ;
   private String GXv_char12[] ;
   private String GXt_char16 ;
   private String GXv_char4[] ;
   private String GXt_char15 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_dltlinea_Internalname ;
   private String Dvelop_confirmpanel_dltlinea_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV7EmprCod ;
   private String sCtrlAV8MaqCod ;
   private String sCtrlAV9HisProFec ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtHisProFec_Jsonclick ;
   private String edtHisProLin_Jsonclick ;
   private String edtavM_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtGruOpeCod_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFase_Jsonclick ;
   private String edtFaseDsc_Jsonclick ;
   private String edtHisProDTI_Jsonclick ;
   private String edtHisProDTF_Jsonclick ;
   private String edtHisProF_Jsonclick ;
   private String edtHisProTur_Jsonclick ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Jsonclick ;
   private String edtHisProNpzs_Jsonclick ;
   private String edtHisProLot_Jsonclick ;
   private String edtParCodNom_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtHisProTr2_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV47TFHisProDTI ;
   private java.util.Date AV51TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ;
   private java.util.Date AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ;
   private java.util.Date wcpOAV9HisProFec ;
   private java.util.Date AV9HisProFec ;
   private java.util.Date AV86LecFec ;
   private java.util.Date AV49DDO_HisProDTIAuxDate ;
   private java.util.Date AV53DDO_HisProDTFAuxDate ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A1174LecFec ;
   private java.util.Date AV137Hisprofec_selected ;
   private java.util.Date GXv_date10[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV16OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean n606MaqDsc ;
   private boolean AV96Seleccionar ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n867ParCodNom ;
   private boolean bGXsfl_109_Refreshing=false ;
   private boolean n656ParCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n1167LecBarCod ;
   private boolean n1168LecBarReo ;
   private boolean n1169LecBarPar ;
   private boolean n1188LecFasOrd ;
   private boolean n1174LecFec ;
   private boolean n1173LecHor ;
   private boolean n1172LecParCod ;
   private boolean n1171LecFasCod ;
   private boolean n1170LecOpeCod ;
   private boolean gx_refresh_fired ;
   private String AV21ColumnsSelectorXML ;
   private String AV22UserCustomValue ;
   private String AV19ExcelFilename ;
   private String AV20ErrorMessage ;
   private String AV82Texto_i ;
   private GXSimpleCollection<Integer> AV97Col_Hisprolin ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_dltlinea ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGrupodeacciones ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private short[] H01D32_A656ParCod ;
   private boolean[] H01D32_n656ParCod ;
   private String[] H01D32_A867ParCodNom ;
   private boolean[] H01D32_n867ParCodNom ;
   private String[] H01D32_A3610HisProLot ;
   private short[] H01D32_A4714HisProNpzs ;
   private java.math.BigDecimal[] H01D32_A1526HisProMtr ;
   private java.math.BigDecimal[] H01D32_A1525HisProKgr ;
   private byte[] H01D32_A566HisProTur ;
   private String[] H01D32_A557HisProF ;
   private short[] H01D32_A194BarOrdLin ;
   private int[] H01D32_A503GruOpeCod ;
   private int[] H01D32_A561HisProLin ;
   private java.util.Date[] H01D32_A558HisProFec ;
   private String[] H01D32_A606MaqDsc ;
   private boolean[] H01D32_n606MaqDsc ;
   private String[] H01D32_A602MaqCod ;
   private String[] H01D32_A130BarCodPar ;
   private byte[] H01D32_A132BarCodReo ;
   private int[] H01D32_A129BarCod ;
   private String[] H01D32_A461Fase ;
   private String[] H01D32_A396EmprCod ;
   private java.util.Date[] H01D32_A4440HisProDTI ;
   private boolean[] H01D32_n4440HisProDTI ;
   private java.util.Date[] H01D32_A4441HisProDTF ;
   private boolean[] H01D32_n4441HisProDTF ;
   private short[] H01D33_A656ParCod ;
   private boolean[] H01D33_n656ParCod ;
   private String[] H01D33_A867ParCodNom ;
   private boolean[] H01D33_n867ParCodNom ;
   private String[] H01D33_A3610HisProLot ;
   private short[] H01D33_A4714HisProNpzs ;
   private java.math.BigDecimal[] H01D33_A1526HisProMtr ;
   private java.math.BigDecimal[] H01D33_A1525HisProKgr ;
   private byte[] H01D33_A566HisProTur ;
   private String[] H01D33_A557HisProF ;
   private short[] H01D33_A194BarOrdLin ;
   private int[] H01D33_A503GruOpeCod ;
   private int[] H01D33_A561HisProLin ;
   private java.util.Date[] H01D33_A558HisProFec ;
   private String[] H01D33_A606MaqDsc ;
   private boolean[] H01D33_n606MaqDsc ;
   private String[] H01D33_A602MaqCod ;
   private String[] H01D33_A130BarCodPar ;
   private byte[] H01D33_A132BarCodReo ;
   private int[] H01D33_A129BarCod ;
   private String[] H01D33_A461Fase ;
   private String[] H01D33_A396EmprCod ;
   private java.util.Date[] H01D33_A4440HisProDTI ;
   private boolean[] H01D33_n4440HisProDTI ;
   private java.util.Date[] H01D33_A4441HisProDTF ;
   private boolean[] H01D33_n4441HisProDTF ;
   private String[] H01D34_A1166LecMaqCod ;
   private int[] H01D34_A1167LecBarCod ;
   private boolean[] H01D34_n1167LecBarCod ;
   private byte[] H01D34_A1168LecBarReo ;
   private boolean[] H01D34_n1168LecBarReo ;
   private String[] H01D34_A1169LecBarPar ;
   private boolean[] H01D34_n1169LecBarPar ;
   private short[] H01D34_A1188LecFasOrd ;
   private boolean[] H01D34_n1188LecFasOrd ;
   private java.util.Date[] H01D34_A1174LecFec ;
   private boolean[] H01D34_n1174LecFec ;
   private String[] H01D34_A1173LecHor ;
   private boolean[] H01D34_n1173LecHor ;
   private short[] H01D34_A1172LecParCod ;
   private boolean[] H01D34_n1172LecParCod ;
   private String[] H01D34_A1171LecFasCod ;
   private boolean[] H01D34_n1171LecFasCod ;
   private int[] H01D34_A1170LecOpeCod ;
   private boolean[] H01D34_n1170LecOpeCod ;
   private String[] H01D34_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV67DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV13GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV14GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class partesdeproduccionlector_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01D32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ,
                                          int AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ,
                                          String AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                          String AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                          int AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ,
                                          int AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ,
                                          short AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ,
                                          short AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ,
                                          String AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                          String AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                          java.util.Date AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                          java.util.Date AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                          String AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                          String AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                          byte AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ,
                                          byte AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ,
                                          java.math.BigDecimal AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                          java.math.BigDecimal AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                          short AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ,
                                          short AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ,
                                          String AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                          String AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                          String AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                          String AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                          short AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ,
                                          short AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A3610HisProLot ,
                                          String A867ParCodNom ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                          String AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                          String A7258FaseDsc ,
                                          String AV7EmprCod ,
                                          String AV8MaqCod ,
                                          java.util.Date AV9HisProFec ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[31];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.ParCod, T3.ParCodNom, T1.HisProLot, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.BarOrdLin, T1.GruOpeCod, T1.HisProLin, T1.HisProFec," ;
      scmdbuf += " T2.MaqDsc, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( ! (0==AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( ! (0==AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (0==AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (0==AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (0==AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (0==AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (0==AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (0==AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (0==AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (0==AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (0==AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV15OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec DESC, T1.HisProLin DESC" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLin" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLin DESC" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod DESC" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProF" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProF DESC" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV15OrderedBy == 12 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs" ;
      }
      else if ( ( AV15OrderedBy == 12 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs DESC" ;
      }
      else if ( ( AV15OrderedBy == 13 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLot" ;
      }
      else if ( ( AV15OrderedBy == 13 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLot DESC" ;
      }
      else if ( ( AV15OrderedBy == 14 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ParCodNom" ;
      }
      else if ( ( AV15OrderedBy == 14 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ParCodNom DESC" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H01D33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ,
                                          int AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ,
                                          String AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                          String AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                          int AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ,
                                          int AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ,
                                          short AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ,
                                          short AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ,
                                          String AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                          String AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                          java.util.Date AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                          java.util.Date AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                          String AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                          String AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                          byte AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ,
                                          byte AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ,
                                          java.math.BigDecimal AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                          java.math.BigDecimal AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                          short AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ,
                                          short AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ,
                                          String AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                          String AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                          String AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                          String AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                          short AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ,
                                          short AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A3610HisProLot ,
                                          String A867ParCodNom ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV115Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                          String AV114Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                          String A7258FaseDsc ,
                                          String AV7EmprCod ,
                                          String AV8MaqCod ,
                                          java.util.Date AV9HisProFec ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[31];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T1.ParCod, T3.ParCodNom, T1.HisProLot, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.BarOrdLin, T1.GruOpeCod, T1.HisProLin, T1.HisProFec," ;
      scmdbuf += " T2.MaqDsc, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( ! (0==AV104Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! (0==AV105Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV106Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (0==AV108Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (0==AV109Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (0==AV110Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (0==AV111Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV112Lectoroptico_partesdeproduccionlector_wcds_9_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV116Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV117Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV118Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (0==AV120Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (0==AV121Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (0==AV126Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (0==AV127Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV128Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV130Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (0==AV132Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! (0==AV133Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV15OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec DESC, T1.HisProLin DESC" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLin" ;
      }
      else if ( ( AV15OrderedBy == 2 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLin DESC" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod DESC" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProF" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProF DESC" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV15OrderedBy == 9 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV15OrderedBy == 10 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV15OrderedBy == 11 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV15OrderedBy == 12 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs" ;
      }
      else if ( ( AV15OrderedBy == 12 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs DESC" ;
      }
      else if ( ( AV15OrderedBy == 13 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLot" ;
      }
      else if ( ( AV15OrderedBy == 13 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLot DESC" ;
      }
      else if ( ( AV15OrderedBy == 14 ) && ! AV16OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ParCodNom" ;
      }
      else if ( ( AV15OrderedBy == 14 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ParCodNom DESC" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_H01D32(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Boolean) dynConstraints[45]).booleanValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] );
            case 1 :
                  return conditional_H01D33(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Boolean) dynConstraints[45]).booleanValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01D32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01D33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01D34", "SELECT LecMaqCod, LecBarCod, LecBarReo, LecBarPar, LecFasOrd, LecFec, LecHor, LecParCod, LecFasCod, LecOpeCod, EmprCod FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 6);
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               ((String[]) buf[20])[0] = rslt.getString(18, 8);
               ((String[]) buf[21])[0] = rslt.getString(19, 3);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 6);
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               ((String[]) buf[20])[0] = rslt.getString(18, 8);
               ((String[]) buf[21])[0] = rslt.getString(19, 3);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[44], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[45], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[44], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[45], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

