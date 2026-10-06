package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class noaceptacionensayo_wc_impl extends GXWebComponent
{
   public noaceptacionensayo_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public noaceptacionensayo_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( noaceptacionensayo_wc_impl.class ));
   }

   public noaceptacionensayo_wc_impl( int remoteHandle ,
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
               AV21EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21EmprCod", AV21EmprCod);
               AV42Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Lb_Numero), 8, 0));
               AV40Lb_fechaR = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaR")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Lb_fechaR", localUtil.format(AV40Lb_fechaR, "99/99/99"));
               AV97Lb_ObsCR = httpContext.GetPar( "Lb_ObsCR") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Lb_ObsCR", AV97Lb_ObsCR);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV21EmprCod,Integer.valueOf(AV42Lb_Numero),AV40Lb_fechaR,AV97Lb_ObsCR});
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
      nRC_GXsfl_54 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_54"))) ;
      nGXsfl_54_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_54_idx"))) ;
      sGXsfl_54_idx = httpContext.GetPar( "sGXsfl_54_idx") ;
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
      AV25FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV21EmprCod = httpContext.GetPar( "EmprCod") ;
      AV42Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
      AV46ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV11ColumnsSelector);
      AV76TFLb_numero = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero"))) ;
      AV77TFLb_numero_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero_To"))) ;
      AV80TFLb_opcion = httpContext.GetPar( "TFLb_opcion") ;
      AV81TFLb_opcion_Sel = httpContext.GetPar( "TFLb_opcion_Sel") ;
      AV66TFLb_ColNom = httpContext.GetPar( "TFLb_ColNom") ;
      AV67TFLb_ColNom_Sel = httpContext.GetPar( "TFLb_ColNom_Sel") ;
      AV68TFLb_ColNum = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum"))) ;
      AV69TFLb_ColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum_To"))) ;
      AV58TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV59TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV60TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV61TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV62TFLb_Cartaz = httpContext.GetPar( "TFLb_Cartaz") ;
      AV63TFLb_Cartaz_Sel = httpContext.GetPar( "TFLb_Cartaz_Sel") ;
      AV64TFLb_cartazf = localUtil.parseDateParm( httpContext.GetPar( "TFLb_cartazf")) ;
      AV72TFLb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaEn")) ;
      AV74TFLb_FechaR = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaR")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV103TFLb_Estado_Sels);
      AV89TFLb_FecNoa1 = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FecNoa1")) ;
      AV93TFLb_hhnoa1 = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFLb_hhnoa1"))) ;
      AV106Pgmname = httpContext.GetPar( "Pgmname") ;
      AV50OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV52OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV40Lb_fechaR = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaR")) ;
      AV97Lb_ObsCR = httpContext.GetPar( "Lb_ObsCR") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV7Col_Lb_numero);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV9Col_Lb_opcion);
      AV101Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV21EmprCod, AV42Lb_Numero, AV46ManageFiltersExecutionStep, AV11ColumnsSelector, AV76TFLb_numero, AV77TFLb_numero_To, AV80TFLb_opcion, AV81TFLb_opcion_Sel, AV66TFLb_ColNom, AV67TFLb_ColNom_Sel, AV68TFLb_ColNum, AV69TFLb_ColNum_To, AV58TFCliCod, AV59TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV62TFLb_Cartaz, AV63TFLb_Cartaz_Sel, AV64TFLb_cartazf, AV72TFLb_FechaEn, AV74TFLb_FechaR, AV103TFLb_Estado_Sels, AV89TFLb_FecNoa1, AV93TFLb_hhnoa1, AV106Pgmname, AV50OrderedBy, AV52OrderedDsc, AV40Lb_fechaR, AV97Lb_ObsCR, AV7Col_Lb_numero, AV9Col_Lb_opcion, AV101Moda21, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1U62( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "NO Aceptacion Ensayo", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.noaceptacionensayo_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV42Lb_Numero,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV40Lb_fechaR)),GXutil.URLEncode(GXutil.rtrim(AV97Lb_ObsCR))}, new String[] {"EmprCod","Lb_Numero","Lb_fechaR","Lb_ObsCR"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV101Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"NoAceptacionEnsayo_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\noaceptacionensayo_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV25FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_54, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV45ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV45ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV11ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV11ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21EmprCod", GXutil.rtrim( wcpOAV21EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42Lb_Numero", GXutil.ltrim( localUtil.ntoc( wcpOAV42Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40Lb_fechaR", localUtil.dtoc( wcpOAV40Lb_fechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV97Lb_ObsCR", wcpOAV97Lb_ObsCR);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV46ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV76TFLb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO_TO", GXutil.ltrim( localUtil.ntoc( AV77TFLb_numero_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION", GXutil.rtrim( AV80TFLb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION_SEL", GXutil.rtrim( AV81TFLb_opcion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOM", GXutil.rtrim( AV66TFLb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOM_SEL", GXutil.rtrim( AV67TFLb_ColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV68TFLb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV69TFLb_ColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV58TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV59TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV60TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV61TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ", GXutil.rtrim( AV62TFLb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ_SEL", GXutil.rtrim( AV63TFLb_Cartaz_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZF", localUtil.dtoc( AV64TFLb_cartazf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAEN", localUtil.dtoc( AV72TFLb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAR", localUtil.dtoc( AV74TFLb_FechaR, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFLB_ESTADO_SELS", AV103TFLb_Estado_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFLB_ESTADO_SELS", AV103TFLb_Estado_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECNOA1", localUtil.dtoc( AV89TFLb_FecNoa1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_HHNOA1", localUtil.ttoc( AV93TFLb_hhnoa1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV50OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV52OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV21EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV42Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAR", localUtil.dtoc( AV40Lb_fechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_OBSCR", AV97Lb_ObsCR);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_NUMERO", AV7Col_Lb_numero);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_NUMERO", AV7Col_Lb_numero);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_OPCION", AV9Col_Lb_opcion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_OPCION", AV9Col_Lb_opcion);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV28GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV28GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ESTADO_SELSJSON", AV102TFLb_Estado_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV101Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV101Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV33i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
   }

   public void renderHtmlCloseForm1U62( )
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
      return "GestionLaboratorio.NoAceptacionEnsayo_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "NO Aceptacion Ensayo", "") ;
   }

   public void wb1U60( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.noaceptacionensayo_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1U62( true) ;
      }
      else
      {
         wb_table1_23_1U62( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1U62e( boolean wbgen )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111u61_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
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
         startgridcontrol54( ) ;
      }
      if ( wbEnd == 54 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_54 = (int)(nGXsfl_54_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV106Pgmname), GXutil.rtrim( localUtil.format( AV106Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV11ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_82_1U62( true) ;
      }
      else
      {
         wb_table2_82_1U62( false) ;
      }
      return  ;
   }

   public void wb_table2_82_1U62e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_cartazfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_cartazfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_cartazfauxdate_Internalname, localUtil.format(AV14DDO_Lb_cartazfAuxDate, "99/99/99"), localUtil.format( AV14DDO_Lb_cartazfAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,90);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_cartazfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_cartazfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaenauxdate_Internalname, localUtil.format(AV16DDO_Lb_FechaEnAuxDate, "99/99/99"), localUtil.format( AV16DDO_Lb_FechaEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,92);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fecharauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fecharauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fecharauxdate_Internalname, localUtil.format(AV18DDO_Lb_FechaRAuxDate, "99/99/99"), localUtil.format( AV18DDO_Lb_FechaRAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fecharauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fecharauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fecnoa1auxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fecnoa1auxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fecnoa1auxdate_Internalname, localUtil.format(AV91DDO_Lb_FecNoa1AuxDate, "99/99/99"), localUtil.format( AV91DDO_Lb_FecNoa1AuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fecnoa1auxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fecnoa1auxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_hhnoa1auxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_hhnoa1auxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_hhnoa1auxdate_Internalname, localUtil.format(AV95DDO_Lb_hhnoa1AuxDate, "99/99/99"), localUtil.format( AV95DDO_Lb_hhnoa1AuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,98);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_hhnoa1auxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_hhnoa1auxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 54 )
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

   public void start1U62( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "NO Aceptacion Ensayo", ""), (short)(0)) ;
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
            strup1U60( ) ;
         }
      }
   }

   public void ws1U62( )
   {
      start1U62( ) ;
      evt1U62( ) ;
   }

   public void evt1U62( )
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
                              strup1U60( ) ;
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
                              strup1U60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121U62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131U62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141U62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151U62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161U62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171U62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e181U62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e191U62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e201U62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1U60( ) ;
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
                              strup1U60( ) ;
                           }
                           nGXsfl_54_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_542( ) ;
                           AV54Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV54Seleccionar);
                           A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
                           A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
                           A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
                           A5594Lb_cartazf = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_cartazf_Internalname), 0)) ;
                           A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
                           A5563Lb_FechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaR_Internalname), 0)) ;
                           cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
                           cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
                           A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n831TipColCod = false ;
                           A6461Lb_FecNoa1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FecNoa1_Internalname), 0)) ;
                           A10082Lb_hhnoa1 = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_hhnoa1_Internalname), 0)) ;
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
                                       e211U62 ();
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
                                       e221U62 ();
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
                                       e231U62 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV25FilterFullText) != 0 )
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
                                    strup1U60( ) ;
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

   public void we1U62( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1U62( ) ;
         }
      }
   }

   public void pa1U62( )
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
      subsflControlProps_542( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         sendrow_542( ) ;
         nGXsfl_54_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV25FilterFullText ,
                                 String AV21EmprCod ,
                                 int AV42Lb_Numero ,
                                 byte AV46ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelector ,
                                 int AV76TFLb_numero ,
                                 int AV77TFLb_numero_To ,
                                 String AV80TFLb_opcion ,
                                 String AV81TFLb_opcion_Sel ,
                                 String AV66TFLb_ColNom ,
                                 String AV67TFLb_ColNom_Sel ,
                                 int AV68TFLb_ColNum ,
                                 int AV69TFLb_ColNum_To ,
                                 int AV58TFCliCod ,
                                 int AV59TFCliCod_To ,
                                 String AV60TFCliNom ,
                                 String AV61TFCliNom_Sel ,
                                 String AV62TFLb_Cartaz ,
                                 String AV63TFLb_Cartaz_Sel ,
                                 java.util.Date AV64TFLb_cartazf ,
                                 java.util.Date AV72TFLb_FechaEn ,
                                 java.util.Date AV74TFLb_FechaR ,
                                 GXSimpleCollection<Byte> AV103TFLb_Estado_Sels ,
                                 java.util.Date AV89TFLb_FecNoa1 ,
                                 java.util.Date AV93TFLb_hhnoa1 ,
                                 String AV106Pgmname ,
                                 short AV50OrderedBy ,
                                 boolean AV52OrderedDsc ,
                                 java.util.Date AV40Lb_fechaR ,
                                 String AV97Lb_ObsCR ,
                                 GXSimpleCollection<Integer> AV7Col_Lb_numero ,
                                 GXSimpleCollection<String> AV9Col_Lb_opcion ,
                                 short AV101Moda21 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e221U62 ();
      GRID_nCurrentRecord = 0 ;
      rf1U62( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"NoAceptacionEnsayo_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\noaceptacionensayo_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_OPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_OPCION", GXutil.rtrim( A5555Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMERO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_NUMERO", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
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
      rf1U62( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV106Pgmname = "GestionLaboratorio.NoAceptacionEnsayo_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Pgmname", AV106Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1U62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(54) ;
      /* Execute user event: Refresh */
      e221U62 ();
      nGXsfl_54_idx = 1 ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      bGXsfl_54_Refreshing = true ;
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
         subsflControlProps_542( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A5566Lb_Estado) ,
                                              AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                              AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                              Integer.valueOf(AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) ,
                                              Integer.valueOf(AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) ,
                                              AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                              AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                              AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                              AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                              Integer.valueOf(AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) ,
                                              Integer.valueOf(AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) ,
                                              Integer.valueOf(AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) ,
                                              Integer.valueOf(AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) ,
                                              AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                              AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                              AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                              AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                              AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                              AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                              AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                              Integer.valueOf(AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels.size()) ,
                                              AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                              AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              A5555Lb_opcion ,
                                              A5536Lb_ColNom ,
                                              Integer.valueOf(A5537Lb_ColNum) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A5540Lb_Cartaz ,
                                              A5594Lb_cartazf ,
                                              A5567Lb_FechaEn ,
                                              A5563Lb_FechaR ,
                                              A6461Lb_FecNoa1 ,
                                              A10082Lb_hhnoa1 ,
                                              Short.valueOf(AV50OrderedBy) ,
                                              Boolean.valueOf(AV52OrderedDsc) ,
                                              AV21EmprCod ,
                                              Integer.valueOf(AV42Lb_Numero) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
         lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
         lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
         lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
         lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
         lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
         lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
         lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
         lV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion), 1, "%") ;
         lV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom), 13, "%") ;
         lV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom), 30, "%") ;
         lV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz), 20, "%") ;
         /* Using cursor H01U62 */
         pr_default.execute(0, new Object[] {AV21EmprCod, Integer.valueOf(AV42Lb_Numero), lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, Integer.valueOf(AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero), Integer.valueOf(AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to), lV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion, AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel, lV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom, AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum), Integer.valueOf(AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to), Integer.valueOf(AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod), Integer.valueOf(AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to), lV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom, AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel, lV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz, AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel, AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf, AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen, AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar, AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1, AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_54_idx = 1 ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01U62_A396EmprCod[0] ;
            A10082Lb_hhnoa1 = H01U62_A10082Lb_hhnoa1[0] ;
            A6461Lb_FecNoa1 = H01U62_A6461Lb_FecNoa1[0] ;
            A831TipColCod = H01U62_A831TipColCod[0] ;
            n831TipColCod = H01U62_n831TipColCod[0] ;
            A5566Lb_Estado = H01U62_A5566Lb_Estado[0] ;
            A5563Lb_FechaR = H01U62_A5563Lb_FechaR[0] ;
            A5567Lb_FechaEn = H01U62_A5567Lb_FechaEn[0] ;
            A5594Lb_cartazf = H01U62_A5594Lb_cartazf[0] ;
            A5540Lb_Cartaz = H01U62_A5540Lb_Cartaz[0] ;
            A279CliNom = H01U62_A279CliNom[0] ;
            A252CliCod = H01U62_A252CliCod[0] ;
            A5537Lb_ColNum = H01U62_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = H01U62_A5536Lb_ColNom[0] ;
            A5555Lb_opcion = H01U62_A5555Lb_opcion[0] ;
            A5532Lb_numero = H01U62_A5532Lb_numero[0] ;
            A831TipColCod = H01U62_A831TipColCod[0] ;
            n831TipColCod = H01U62_n831TipColCod[0] ;
            A5594Lb_cartazf = H01U62_A5594Lb_cartazf[0] ;
            A5540Lb_Cartaz = H01U62_A5540Lb_Cartaz[0] ;
            A252CliCod = H01U62_A252CliCod[0] ;
            A5537Lb_ColNum = H01U62_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = H01U62_A5536Lb_ColNom[0] ;
            A279CliNom = H01U62_A279CliNom[0] ;
            e231U62 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(54) ;
         wb1U60( ) ;
      }
      bGXsfl_54_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1U62( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_OPCION"+"_"+sGXsfl_54_idx, getSecureSignedToken( sPrefix+sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV101Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV101Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMERO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sPrefix+sGXsfl_54_idx, localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")));
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
      AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV25FilterFullText ;
      AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV76TFLb_numero ;
      AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV77TFLb_numero_To ;
      AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV80TFLb_opcion ;
      AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV81TFLb_opcion_Sel ;
      AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV66TFLb_ColNom ;
      AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV67TFLb_ColNom_Sel ;
      AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV68TFLb_ColNum ;
      AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV69TFLb_ColNum_To ;
      AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV58TFCliCod ;
      AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV59TFCliCod_To ;
      AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV60TFCliNom ;
      AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV61TFCliNom_Sel ;
      AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV62TFLb_Cartaz ;
      AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV63TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV64TFLb_cartazf ;
      AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV72TFLb_FechaEn ;
      AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV74TFLb_FechaR ;
      AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV103TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV89TFLb_FecNoa1 ;
      AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV93TFLb_hhnoa1 ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                           AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) ,
                                           AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                           AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                           AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                           AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) ,
                                           Integer.valueOf(AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) ,
                                           Integer.valueOf(AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) ,
                                           AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                           AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                           AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                           AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                           AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                           AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                           AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                           Integer.valueOf(AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels.size()) ,
                                           AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                           AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           Short.valueOf(AV50OrderedBy) ,
                                           Boolean.valueOf(AV52OrderedDsc) ,
                                           AV21EmprCod ,
                                           Integer.valueOf(AV42Lb_Numero) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom), 30, "%") ;
      lV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz), 20, "%") ;
      /* Using cursor H01U63 */
      pr_default.execute(1, new Object[] {AV21EmprCod, Integer.valueOf(AV42Lb_Numero), lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, Integer.valueOf(AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero), Integer.valueOf(AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to), lV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion, AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel, lV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom, AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum), Integer.valueOf(AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to), Integer.valueOf(AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod), Integer.valueOf(AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to), lV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom, AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel, lV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz, AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel, AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf, AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen, AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar, AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1, AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1});
      GRID_nRecordCount = H01U63_AGRID_nRecordCount[0] ;
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
      AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV25FilterFullText ;
      AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV76TFLb_numero ;
      AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV77TFLb_numero_To ;
      AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV80TFLb_opcion ;
      AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV81TFLb_opcion_Sel ;
      AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV66TFLb_ColNom ;
      AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV67TFLb_ColNom_Sel ;
      AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV68TFLb_ColNum ;
      AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV69TFLb_ColNum_To ;
      AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV58TFCliCod ;
      AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV59TFCliCod_To ;
      AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV60TFCliNom ;
      AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV61TFCliNom_Sel ;
      AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV62TFLb_Cartaz ;
      AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV63TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV64TFLb_cartazf ;
      AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV72TFLb_FechaEn ;
      AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV74TFLb_FechaR ;
      AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV103TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV89TFLb_FecNoa1 ;
      AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV93TFLb_hhnoa1 ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV21EmprCod, AV42Lb_Numero, AV46ManageFiltersExecutionStep, AV11ColumnsSelector, AV76TFLb_numero, AV77TFLb_numero_To, AV80TFLb_opcion, AV81TFLb_opcion_Sel, AV66TFLb_ColNom, AV67TFLb_ColNom_Sel, AV68TFLb_ColNum, AV69TFLb_ColNum_To, AV58TFCliCod, AV59TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV62TFLb_Cartaz, AV63TFLb_Cartaz_Sel, AV64TFLb_cartazf, AV72TFLb_FechaEn, AV74TFLb_FechaR, AV103TFLb_Estado_Sels, AV89TFLb_FecNoa1, AV93TFLb_hhnoa1, AV106Pgmname, AV50OrderedBy, AV52OrderedDsc, AV40Lb_fechaR, AV97Lb_ObsCR, AV7Col_Lb_numero, AV9Col_Lb_opcion, AV101Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV25FilterFullText ;
      AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV76TFLb_numero ;
      AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV77TFLb_numero_To ;
      AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV80TFLb_opcion ;
      AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV81TFLb_opcion_Sel ;
      AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV66TFLb_ColNom ;
      AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV67TFLb_ColNom_Sel ;
      AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV68TFLb_ColNum ;
      AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV69TFLb_ColNum_To ;
      AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV58TFCliCod ;
      AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV59TFCliCod_To ;
      AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV60TFCliNom ;
      AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV61TFCliNom_Sel ;
      AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV62TFLb_Cartaz ;
      AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV63TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV64TFLb_cartazf ;
      AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV72TFLb_FechaEn ;
      AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV74TFLb_FechaR ;
      AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV103TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV89TFLb_FecNoa1 ;
      AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV93TFLb_hhnoa1 ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV21EmprCod, AV42Lb_Numero, AV46ManageFiltersExecutionStep, AV11ColumnsSelector, AV76TFLb_numero, AV77TFLb_numero_To, AV80TFLb_opcion, AV81TFLb_opcion_Sel, AV66TFLb_ColNom, AV67TFLb_ColNom_Sel, AV68TFLb_ColNum, AV69TFLb_ColNum_To, AV58TFCliCod, AV59TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV62TFLb_Cartaz, AV63TFLb_Cartaz_Sel, AV64TFLb_cartazf, AV72TFLb_FechaEn, AV74TFLb_FechaR, AV103TFLb_Estado_Sels, AV89TFLb_FecNoa1, AV93TFLb_hhnoa1, AV106Pgmname, AV50OrderedBy, AV52OrderedDsc, AV40Lb_fechaR, AV97Lb_ObsCR, AV7Col_Lb_numero, AV9Col_Lb_opcion, AV101Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV25FilterFullText ;
      AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV76TFLb_numero ;
      AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV77TFLb_numero_To ;
      AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV80TFLb_opcion ;
      AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV81TFLb_opcion_Sel ;
      AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV66TFLb_ColNom ;
      AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV67TFLb_ColNom_Sel ;
      AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV68TFLb_ColNum ;
      AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV69TFLb_ColNum_To ;
      AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV58TFCliCod ;
      AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV59TFCliCod_To ;
      AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV60TFCliNom ;
      AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV61TFCliNom_Sel ;
      AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV62TFLb_Cartaz ;
      AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV63TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV64TFLb_cartazf ;
      AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV72TFLb_FechaEn ;
      AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV74TFLb_FechaR ;
      AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV103TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV89TFLb_FecNoa1 ;
      AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV93TFLb_hhnoa1 ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV21EmprCod, AV42Lb_Numero, AV46ManageFiltersExecutionStep, AV11ColumnsSelector, AV76TFLb_numero, AV77TFLb_numero_To, AV80TFLb_opcion, AV81TFLb_opcion_Sel, AV66TFLb_ColNom, AV67TFLb_ColNom_Sel, AV68TFLb_ColNum, AV69TFLb_ColNum_To, AV58TFCliCod, AV59TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV62TFLb_Cartaz, AV63TFLb_Cartaz_Sel, AV64TFLb_cartazf, AV72TFLb_FechaEn, AV74TFLb_FechaR, AV103TFLb_Estado_Sels, AV89TFLb_FecNoa1, AV93TFLb_hhnoa1, AV106Pgmname, AV50OrderedBy, AV52OrderedDsc, AV40Lb_fechaR, AV97Lb_ObsCR, AV7Col_Lb_numero, AV9Col_Lb_opcion, AV101Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV25FilterFullText ;
      AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV76TFLb_numero ;
      AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV77TFLb_numero_To ;
      AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV80TFLb_opcion ;
      AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV81TFLb_opcion_Sel ;
      AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV66TFLb_ColNom ;
      AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV67TFLb_ColNom_Sel ;
      AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV68TFLb_ColNum ;
      AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV69TFLb_ColNum_To ;
      AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV58TFCliCod ;
      AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV59TFCliCod_To ;
      AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV60TFCliNom ;
      AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV61TFCliNom_Sel ;
      AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV62TFLb_Cartaz ;
      AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV63TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV64TFLb_cartazf ;
      AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV72TFLb_FechaEn ;
      AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV74TFLb_FechaR ;
      AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV103TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV89TFLb_FecNoa1 ;
      AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV93TFLb_hhnoa1 ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV21EmprCod, AV42Lb_Numero, AV46ManageFiltersExecutionStep, AV11ColumnsSelector, AV76TFLb_numero, AV77TFLb_numero_To, AV80TFLb_opcion, AV81TFLb_opcion_Sel, AV66TFLb_ColNom, AV67TFLb_ColNom_Sel, AV68TFLb_ColNum, AV69TFLb_ColNum_To, AV58TFCliCod, AV59TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV62TFLb_Cartaz, AV63TFLb_Cartaz_Sel, AV64TFLb_cartazf, AV72TFLb_FechaEn, AV74TFLb_FechaR, AV103TFLb_Estado_Sels, AV89TFLb_FecNoa1, AV93TFLb_hhnoa1, AV106Pgmname, AV50OrderedBy, AV52OrderedDsc, AV40Lb_fechaR, AV97Lb_ObsCR, AV7Col_Lb_numero, AV9Col_Lb_opcion, AV101Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV25FilterFullText ;
      AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV76TFLb_numero ;
      AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV77TFLb_numero_To ;
      AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV80TFLb_opcion ;
      AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV81TFLb_opcion_Sel ;
      AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV66TFLb_ColNom ;
      AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV67TFLb_ColNom_Sel ;
      AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV68TFLb_ColNum ;
      AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV69TFLb_ColNum_To ;
      AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV58TFCliCod ;
      AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV59TFCliCod_To ;
      AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV60TFCliNom ;
      AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV61TFCliNom_Sel ;
      AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV62TFLb_Cartaz ;
      AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV63TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV64TFLb_cartazf ;
      AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV72TFLb_FechaEn ;
      AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV74TFLb_FechaR ;
      AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV103TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV89TFLb_FecNoa1 ;
      AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV93TFLb_hhnoa1 ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25FilterFullText, AV21EmprCod, AV42Lb_Numero, AV46ManageFiltersExecutionStep, AV11ColumnsSelector, AV76TFLb_numero, AV77TFLb_numero_To, AV80TFLb_opcion, AV81TFLb_opcion_Sel, AV66TFLb_ColNom, AV67TFLb_ColNom_Sel, AV68TFLb_ColNum, AV69TFLb_ColNum_To, AV58TFCliCod, AV59TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV62TFLb_Cartaz, AV63TFLb_Cartaz_Sel, AV64TFLb_cartazf, AV72TFLb_FechaEn, AV74TFLb_FechaR, AV103TFLb_Estado_Sels, AV89TFLb_FecNoa1, AV93TFLb_hhnoa1, AV106Pgmname, AV50OrderedBy, AV52OrderedDsc, AV40Lb_fechaR, AV97Lb_ObsCR, AV7Col_Lb_numero, AV9Col_Lb_opcion, AV101Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV106Pgmname = "GestionLaboratorio.NoAceptacionEnsayo_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Pgmname", AV106Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1U60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e211U62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV45ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV20DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV11ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_OPCION"), AV9Col_Lb_opcion);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_NUMERO"), AV7Col_Lb_numero);
         /* Read saved values. */
         nRC_GXsfl_54 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_54"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV21EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV21EmprCod") ;
         wcpOAV42Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV40Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV40Lb_fechaR"), 0) ;
         wcpOAV97Lb_ObsCR = httpContext.cgiGet( sPrefix+"wcpOAV97Lb_ObsCR") ;
         AV33i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
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
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         AV25FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25FilterFullText", AV25FilterFullText);
         AV106Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Pgmname", AV106Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_cartazfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_CARTAZFAUXDATE");
            GX_FocusControl = edtavDdo_lb_cartazfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14DDO_Lb_cartazfAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14DDO_Lb_cartazfAuxDate", localUtil.format(AV14DDO_Lb_cartazfAuxDate, "99/99/99"));
         }
         else
         {
            AV14DDO_Lb_cartazfAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_cartazfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14DDO_Lb_cartazfAuxDate", localUtil.format(AV14DDO_Lb_cartazfAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAENAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DDO_Lb_FechaEnAuxDate", localUtil.format(AV16DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         else
         {
            AV16DDO_Lb_FechaEnAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DDO_Lb_FechaEnAuxDate", localUtil.format(AV16DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHARAUXDATE");
            GX_FocusControl = edtavDdo_lb_fecharauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18DDO_Lb_FechaRAuxDate", localUtil.format(AV18DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         else
         {
            AV18DDO_Lb_FechaRAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18DDO_Lb_FechaRAuxDate", localUtil.format(AV18DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fecnoa1auxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECNOA1AUXDATE");
            GX_FocusControl = edtavDdo_lb_fecnoa1auxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV91DDO_Lb_FecNoa1AuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91DDO_Lb_FecNoa1AuxDate", localUtil.format(AV91DDO_Lb_FecNoa1AuxDate, "99/99/99"));
         }
         else
         {
            AV91DDO_Lb_FecNoa1AuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fecnoa1auxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91DDO_Lb_FecNoa1AuxDate", localUtil.format(AV91DDO_Lb_FecNoa1AuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_hhnoa1auxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_HHNOA1AUXDATE");
            GX_FocusControl = edtavDdo_lb_hhnoa1auxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV95DDO_Lb_hhnoa1AuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95DDO_Lb_hhnoa1AuxDate", localUtil.format(AV95DDO_Lb_hhnoa1AuxDate, "99/99/99"));
         }
         else
         {
            AV95DDO_Lb_hhnoa1AuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_hhnoa1auxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95DDO_Lb_hhnoa1AuxDate", localUtil.format(AV95DDO_Lb_hhnoa1AuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"NoAceptacionEnsayo_WC");
         AV106Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Pgmname", AV106Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\noaceptacionensayo_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV25FilterFullText) != 0 )
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
      e211U62 ();
      if (returnInSub) return;
   }

   public void e211U62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV101Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      noaceptacionensayo_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV101Moda21 = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV101Moda21), "ZZZ9")));
      GXt_char3 = AV107Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      noaceptacionensayo_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      AV107Station = GXt_char3 ;
      GXv_char4[0] = AV21EmprCod ;
      GXv_char5[0] = AV108Emprnom ;
      GXv_char6[0] = AV109Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV107Station, GXv_char4, GXv_char5, GXv_char6) ;
      noaceptacionensayo_wc_impl.this.AV21EmprCod = GXv_char4[0] ;
      noaceptacionensayo_wc_impl.this.AV108Emprnom = GXv_char5[0] ;
      noaceptacionensayo_wc_impl.this.AV109Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21EmprCod", AV21EmprCod);
      divUnnamedtable2_Height = 10 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable2_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Height), 9, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
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
      if ( AV50OrderedBy < 1 )
      {
         AV50OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV20DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV20DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e221U62( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV87WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV87WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV46ManageFiltersExecutionStep == 1 )
      {
         AV46ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46ManageFiltersExecutionStep", GXutil.str( AV46ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV46ManageFiltersExecutionStep == 2 )
      {
         AV46ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46ManageFiltersExecutionStep", GXutil.str( AV46ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV56Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCColumnsSelector"), "") != 0 )
      {
         AV13ColumnsSelectorXML = AV56Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCColumnsSelector") ;
         AV11ColumnsSelector.fromxml(AV13ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_54_Refreshing);
      edtLb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtLb_opcion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_opcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtLb_ColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNom_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtLb_ColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNum_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtLb_Cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Cartaz_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtLb_cartazf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_cartazf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_cartazf_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtLb_FechaEn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaEn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaEn_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtLb_FechaR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaR_Visible), 5, 0), !bGXsfl_54_Refreshing);
      cmbLb_Estado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Visible", GXutil.ltrimstr( cmbLb_Estado.getVisible(), 5, 0), !bGXsfl_54_Refreshing);
      edtLb_FecNoa1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FecNoa1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FecNoa1_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtLb_hhnoa1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_hhnoa1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_hhnoa1_Visible), 5, 0), !bGXsfl_54_Refreshing);
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV25FilterFullText ;
      AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV76TFLb_numero ;
      AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV77TFLb_numero_To ;
      AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV80TFLb_opcion ;
      AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV81TFLb_opcion_Sel ;
      AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV66TFLb_ColNom ;
      AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV67TFLb_ColNom_Sel ;
      AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV68TFLb_ColNum ;
      AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV69TFLb_ColNum_To ;
      AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV58TFCliCod ;
      AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV59TFCliCod_To ;
      AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV60TFCliNom ;
      AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV61TFCliNom_Sel ;
      AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV62TFLb_Cartaz ;
      AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV63TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV64TFLb_cartazf ;
      AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV72TFLb_FechaEn ;
      AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV74TFLb_FechaR ;
      AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV103TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV89TFLb_FecNoa1 ;
      AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV93TFLb_hhnoa1 ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45ManageFiltersData", AV45ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28GridState", AV28GridState);
   }

   public void e131U62( )
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
         AV53PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV53PageToGo) ;
      }
   }

   public void e141U62( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e151U62( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV50OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50OrderedBy), 4, 0));
         AV52OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52OrderedDsc", AV52OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numero") == 0 )
         {
            AV76TFLb_numero = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFLb_numero), 8, 0));
            AV77TFLb_numero_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_opcion") == 0 )
         {
            AV80TFLb_opcion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_opcion", AV80TFLb_opcion);
            AV81TFLb_opcion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFLb_opcion_Sel", AV81TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNom") == 0 )
         {
            AV66TFLb_ColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFLb_ColNom", AV66TFLb_ColNom);
            AV67TFLb_ColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFLb_ColNom_Sel", AV67TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNum") == 0 )
         {
            AV68TFLb_ColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFLb_ColNum), 6, 0));
            AV69TFLb_ColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV58TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod), 6, 0));
            AV59TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV60TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCliNom", AV60TFCliNom);
            AV61TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFCliNom_Sel", AV61TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Cartaz") == 0 )
         {
            AV62TFLb_Cartaz = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_Cartaz", AV62TFLb_Cartaz);
            AV63TFLb_Cartaz_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFLb_Cartaz_Sel", AV63TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_cartazf") == 0 )
         {
            AV64TFLb_cartazf = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFLb_cartazf", localUtil.format(AV64TFLb_cartazf, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaEn") == 0 )
         {
            AV72TFLb_FechaEn = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFLb_FechaEn", localUtil.format(AV72TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaR") == 0 )
         {
            AV74TFLb_FechaR = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFLb_FechaR", localUtil.format(AV74TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Estado") == 0 )
         {
            AV102TFLb_Estado_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFLb_Estado_SelsJson", AV102TFLb_Estado_SelsJson);
            AV103TFLb_Estado_Sels.fromJSonString(GXutil.strReplace( AV102TFLb_Estado_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FecNoa1") == 0 )
         {
            AV89TFLb_FecNoa1 = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFLb_FecNoa1", localUtil.format(AV89TFLb_FecNoa1, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_hhnoa1") == 0 )
         {
            AV93TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFLb_hhnoa1", localUtil.ttoc( AV93TFLb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV103TFLb_Estado_Sels", AV103TFLb_Estado_Sels);
   }

   private void e231U62( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      chkavSeleccionar.setVisible( 1 );
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
      {
         chkavSeleccionar.setVisible( 0 );
      }
      AV54Seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV54Seleccionar);
      AV33i = (short)(1) ;
      while ( AV33i <= AV7Col_Lb_numero.size() )
      {
         if ( ( ((Number) AV7Col_Lb_numero.elementAt(-1+AV33i)).intValue() == A5532Lb_numero ) && ( GXutil.strcmp((String)AV9Col_Lb_opcion.elementAt(-1+AV33i), A5555Lb_opcion) == 0 ) )
         {
            AV54Seleccionar = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV54Seleccionar);
            if (true) break;
         }
         AV33i = (short)(AV33i+1) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(54) ;
      }
      sendrow_542( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_54_Refreshing )
      {
         httpContext.doAjaxLoad(54, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e161U62( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV13ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV11ColumnsSelector.fromJSonString(AV13ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.NoAceptacionEnsayo_WCColumnsSelector", ((GXutil.strcmp("", AV13ColumnsSelectorXML)==0) ? "" : AV11ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45ManageFiltersData", AV45ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28GridState", AV28GridState);
   }

   public void e121U62( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.NoAceptacionEnsayo_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV106Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV46ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46ManageFiltersExecutionStep", GXutil.str( AV46ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.NoAceptacionEnsayo_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV46ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46ManageFiltersExecutionStep", GXutil.str( AV46ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char3 = AV47ManageFiltersXml ;
         GXv_char6[0] = GXt_char3 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.NoAceptacionEnsayo_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char6) ;
         noaceptacionensayo_wc_impl.this.GXt_char3 = GXv_char6[0] ;
         AV47ManageFiltersXml = GXt_char3 ;
         if ( (GXutil.strcmp("", AV47ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV106Pgmname+"GridState", AV47ManageFiltersXml) ;
            AV28GridState.fromxml(AV47ManageFiltersXml, null, null);
            AV50OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50OrderedBy), 4, 0));
            AV52OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52OrderedDsc", AV52OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV103TFLb_Estado_Sels", AV103TFLb_Estado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45ManageFiltersData", AV45ManageFiltersData);
   }

   public void e171U62( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45ManageFiltersData", AV45ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28GridState", AV28GridState);
   }

   public void e181U62( )
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

   public void e191U62( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV23ExcelFilename ;
      GXv_char5[0] = AV22ErrorMessage ;
      new app.gestionlaboratorio.noaceptacionensayo_wcexport(remoteHandle, context).execute( GXv_char6, GXv_char5) ;
      noaceptacionensayo_wc_impl.this.AV23ExcelFilename = GXv_char6[0] ;
      noaceptacionensayo_wc_impl.this.AV22ErrorMessage = GXv_char5[0] ;
      if ( GXutil.strcmp(AV23ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV23ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV22ErrorMessage);
      }
   }

   public void e201U62( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.gestionlaboratorio.noaceptacionensayo_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV50OrderedBy, 4, 0))+":"+(AV52OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV11ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&Seleccionar", "", "", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_opcion", "", "Opcion", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_ColNom", "", "Color", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_ColNum", "", "Numero", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCod", "", "Cliente", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNom", "", "Nombre", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_cartazf", "", "Fecha Cole.", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_FechaEn", "", "Fecha Env.", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_FechaR", "", "Fecha Recep.", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_Estado", "", "E", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_FecNoa1", "No Aceptacion", "Fecha", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Lb_hhnoa1", "No Aceptacion", "Hora", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char3 = AV86UserCustomValue ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.NoAceptacionEnsayo_WCColumnsSelector", GXv_char6) ;
      noaceptacionensayo_wc_impl.this.GXt_char3 = GXv_char6[0] ;
      AV86UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV86UserCustomValue)==0) ) )
      {
         AV12ColumnsSelectorAux.fromxml(AV86UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV12ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV11ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV12ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV11ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV45ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.NoAceptacionEnsayo_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV45ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV25FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25FilterFullText", AV25FilterFullText);
      AV76TFLb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFLb_numero), 8, 0));
      AV77TFLb_numero_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFLb_numero_To), 8, 0));
      AV80TFLb_opcion = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_opcion", AV80TFLb_opcion);
      AV81TFLb_opcion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFLb_opcion_Sel", AV81TFLb_opcion_Sel);
      AV66TFLb_ColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFLb_ColNom", AV66TFLb_ColNom);
      AV67TFLb_ColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFLb_ColNom_Sel", AV67TFLb_ColNom_Sel);
      AV68TFLb_ColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFLb_ColNum), 6, 0));
      AV69TFLb_ColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFLb_ColNum_To), 6, 0));
      AV58TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod), 6, 0));
      AV59TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod_To), 6, 0));
      AV60TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCliNom", AV60TFCliNom);
      AV61TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFCliNom_Sel", AV61TFCliNom_Sel);
      AV62TFLb_Cartaz = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_Cartaz", AV62TFLb_Cartaz);
      AV63TFLb_Cartaz_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFLb_Cartaz_Sel", AV63TFLb_Cartaz_Sel);
      AV64TFLb_cartazf = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFLb_cartazf", localUtil.format(AV64TFLb_cartazf, "99/99/99"));
      AV72TFLb_FechaEn = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFLb_FechaEn", localUtil.format(AV72TFLb_FechaEn, "99/99/99"));
      AV74TFLb_FechaR = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFLb_FechaR", localUtil.format(AV74TFLb_FechaR, "99/99/99"));
      AV103TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV89TFLb_FecNoa1 = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFLb_FecNoa1", localUtil.format(AV89TFLb_FecNoa1, "99/99/99"));
      AV93TFLb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFLb_hhnoa1", localUtil.ttoc( AV93TFLb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV98Lb_opcions = " " ;
      AV99Lb_hhnoa1 = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      AV33i = (short)(1) ;
      while ( AV33i <= AV7Col_Lb_numero.size() )
      {
         AV34IN_Lb_numero = ((Number) AV7Col_Lb_numero.elementAt(-1+AV33i)).intValue() ;
         AV35IN_Lb_opcion = (String)AV9Col_Lb_opcion.elementAt(-1+AV33i) ;
         GXv_char6[0] = AV21EmprCod ;
         GXv_int14[0] = AV34IN_Lb_numero ;
         GXv_char5[0] = AV35IN_Lb_opcion ;
         GXv_date15[0] = AV40Lb_fechaR ;
         GXv_dtime16[0] = AV99Lb_hhnoa1 ;
         GXv_char4[0] = AV97Lb_ObsCR ;
         new app.gestionlaboratorio.pens044(remoteHandle, context).execute( GXv_char6, GXv_int14, GXv_char5, GXv_date15, GXv_dtime16, GXv_char4) ;
         noaceptacionensayo_wc_impl.this.AV21EmprCod = GXv_char6[0] ;
         noaceptacionensayo_wc_impl.this.AV34IN_Lb_numero = GXv_int14[0] ;
         noaceptacionensayo_wc_impl.this.AV35IN_Lb_opcion = GXv_char5[0] ;
         noaceptacionensayo_wc_impl.this.AV40Lb_fechaR = GXv_date15[0] ;
         noaceptacionensayo_wc_impl.this.AV99Lb_hhnoa1 = GXv_dtime16[0] ;
         noaceptacionensayo_wc_impl.this.AV97Lb_ObsCR = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21EmprCod", AV21EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Lb_fechaR", localUtil.format(AV40Lb_fechaR, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Lb_ObsCR", AV97Lb_ObsCR);
         if ( GXutil.strcmp(AV98Lb_opcions, " ") == 0 )
         {
            AV98Lb_opcions = GXutil.trim( A5555Lb_opcion) + "+" ;
         }
         else
         {
            AV98Lb_opcions += GXutil.concat( A5555Lb_opcion, "+", "") ;
         }
         GXv_char6[0] = AV21EmprCod ;
         GXv_int14[0] = AV34IN_Lb_numero ;
         new app.gestionlaboratorio.pdbgl01(remoteHandle, context).execute( GXv_char6, GXv_int14) ;
         noaceptacionensayo_wc_impl.this.AV21EmprCod = GXv_char6[0] ;
         noaceptacionensayo_wc_impl.this.AV34IN_Lb_numero = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21EmprCod", AV21EmprCod);
         AV100CliCod = A252CliCod ;
         AV33i = (short)(AV33i+1) ;
      }
      if ( AV101Moda21 == 1 )
      {
         GXv_char6[0] = AV21EmprCod ;
         GXv_int14[0] = AV42Lb_Numero ;
         GXv_char5[0] = AV98Lb_opcions ;
         GXv_date15[0] = AV40Lb_fechaR ;
         GXv_int17[0] = AV100CliCod ;
         new app.gestionlaboratorio.pregcor9(remoteHandle, context).execute( GXv_char6, GXv_int14, GXv_char5, GXv_date15, GXv_int17) ;
         noaceptacionensayo_wc_impl.this.AV21EmprCod = GXv_char6[0] ;
         noaceptacionensayo_wc_impl.this.AV42Lb_Numero = GXv_int14[0] ;
         noaceptacionensayo_wc_impl.this.AV98Lb_opcions = GXv_char5[0] ;
         noaceptacionensayo_wc_impl.this.AV40Lb_fechaR = GXv_date15[0] ;
         noaceptacionensayo_wc_impl.this.AV100CliCod = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21EmprCod", AV21EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Lb_Numero), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Lb_fechaR", localUtil.format(AV40Lb_fechaR, "99/99/99"));
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV56Session.getValue(AV106Pgmname+"GridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV106Pgmname+"GridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV56Session.getValue(AV106Pgmname+"GridState"), null, null);
      }
      AV50OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50OrderedBy), 4, 0));
      AV52OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52OrderedDsc", AV52OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV28GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV28GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV28GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV131GXV1 = 1 ;
      while ( AV131GXV1 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV131GXV1));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV25FilterFullText = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25FilterFullText", AV25FilterFullText);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV76TFLb_numero = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFLb_numero), 8, 0));
            AV77TFLb_numero_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV80TFLb_opcion = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFLb_opcion", AV80TFLb_opcion);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV81TFLb_opcion_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFLb_opcion_Sel", AV81TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV66TFLb_ColNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFLb_ColNom", AV66TFLb_ColNom);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV67TFLb_ColNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFLb_ColNom_Sel", AV67TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV68TFLb_ColNum = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFLb_ColNum), 6, 0));
            AV69TFLb_ColNum_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV58TFCliCod = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod), 6, 0));
            AV59TFCliCod_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV60TFCliNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCliNom", AV60TFCliNom);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV61TFCliNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFCliNom_Sel", AV61TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV62TFLb_Cartaz = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_Cartaz", AV62TFLb_Cartaz);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV63TFLb_Cartaz_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFLb_Cartaz_Sel", AV63TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV64TFLb_cartazf = localUtil.ctod( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFLb_cartazf", localUtil.format(AV64TFLb_cartazf, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV72TFLb_FechaEn = localUtil.ctod( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFLb_FechaEn", localUtil.format(AV72TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV74TFLb_FechaR = localUtil.ctod( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFLb_FechaR", localUtil.format(AV74TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV102TFLb_Estado_SelsJson = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFLb_Estado_SelsJson", AV102TFLb_Estado_SelsJson);
            AV103TFLb_Estado_Sels.fromJSonString(AV102TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECNOA1") == 0 )
         {
            AV89TFLb_FecNoa1 = localUtil.ctod( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFLb_FecNoa1", localUtil.format(AV89TFLb_FecNoa1, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HHNOA1") == 0 )
         {
            AV93TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFLb_hhnoa1", localUtil.ttoc( AV93TFLb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV95DDO_Lb_hhnoa1AuxDate = GXutil.resetTime(AV93TFLb_hhnoa1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95DDO_Lb_hhnoa1AuxDate", localUtil.format(AV95DDO_Lb_hhnoa1AuxDate, "99/99/99"));
         }
         AV131GXV1 = (int)(AV131GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFLb_opcion_Sel)==0), AV81TFLb_opcion_Sel, GXv_char6) ;
      noaceptacionensayo_wc_impl.this.GXt_char3 = GXv_char6[0] ;
      GXt_char18 = "" ;
      GXv_char5[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFLb_ColNom_Sel)==0), AV67TFLb_ColNom_Sel, GXv_char5) ;
      noaceptacionensayo_wc_impl.this.GXt_char18 = GXv_char5[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFCliNom_Sel)==0), AV61TFCliNom_Sel, GXv_char4) ;
      noaceptacionensayo_wc_impl.this.GXt_char19 = GXv_char4[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFLb_Cartaz_Sel)==0), AV63TFLb_Cartaz_Sel, GXv_char21) ;
      noaceptacionensayo_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char3+"|"+GXt_char18+"|||"+GXt_char19+"|"+GXt_char20+"||||"+((AV103TFLb_Estado_Sels.size()==0) ? "" : AV102TFLb_Estado_SelsJson)+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFLb_opcion)==0), AV80TFLb_opcion, GXv_char21) ;
      noaceptacionensayo_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char19 = "" ;
      GXv_char6[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFLb_ColNom)==0), AV66TFLb_ColNom, GXv_char6) ;
      noaceptacionensayo_wc_impl.this.GXt_char19 = GXv_char6[0] ;
      GXt_char18 = "" ;
      GXv_char5[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFCliNom)==0), AV60TFCliNom, GXv_char5) ;
      noaceptacionensayo_wc_impl.this.GXt_char18 = GXv_char5[0] ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFLb_Cartaz)==0), AV62TFLb_Cartaz, GXv_char4) ;
      noaceptacionensayo_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV76TFLb_numero) ? "" : GXutil.str( AV76TFLb_numero, 8, 0))+"|"+GXt_char20+"|"+GXt_char19+"|"+((0==AV68TFLb_ColNum) ? "" : GXutil.str( AV68TFLb_ColNum, 6, 0))+"|"+((0==AV58TFCliCod) ? "" : GXutil.str( AV58TFCliCod, 6, 0))+"|"+GXt_char18+"|"+GXt_char3+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFLb_cartazf)) ? "" : localUtil.dtoc( AV64TFLb_cartazf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72TFLb_FechaEn)) ? "" : localUtil.dtoc( AV72TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74TFLb_FechaR)) ? "" : localUtil.dtoc( AV74TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89TFLb_FecNoa1)) ? "" : localUtil.dtoc( AV89TFLb_FecNoa1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV93TFLb_hhnoa1) ? "" : localUtil.dtoc( AV95DDO_Lb_hhnoa1AuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV77TFLb_numero_To) ? "" : GXutil.str( AV77TFLb_numero_To, 8, 0))+"|||"+((0==AV69TFLb_ColNum_To) ? "" : GXutil.str( AV69TFLb_ColNum_To, 6, 0))+"|"+((0==AV59TFCliCod_To) ? "" : GXutil.str( AV59TFCliCod_To, 6, 0))+"||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV28GridState.fromxml(AV56Session.getValue(AV106Pgmname+"GridState"), null, null);
      AV28GridState.setgxTv_SdtWWPGridState_Orderedby( AV50OrderedBy );
      AV28GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV52OrderedDsc );
      AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV25FilterFullText)==0), (short)(0), AV25FilterFullText, "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_NUMERO", "", !((0==AV76TFLb_numero)&&(0==AV77TFLb_numero_To)), (short)(0), GXutil.trim( GXutil.str( AV76TFLb_numero, 8, 0)), GXutil.trim( GXutil.str( AV77TFLb_numero_To, 8, 0))) ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_OPCION", "", !(GXutil.strcmp("", AV80TFLb_opcion)==0), (short)(0), AV80TFLb_opcion, "", !(GXutil.strcmp("", AV81TFLb_opcion_Sel)==0), AV81TFLb_opcion_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_COLNOM", "", !(GXutil.strcmp("", AV66TFLb_ColNom)==0), (short)(0), AV66TFLb_ColNom, "", !(GXutil.strcmp("", AV67TFLb_ColNom_Sel)==0), AV67TFLb_ColNom_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_COLNUM", "", !((0==AV68TFLb_ColNum)&&(0==AV69TFLb_ColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV68TFLb_ColNum, 6, 0)), GXutil.trim( GXutil.str( AV69TFLb_ColNum_To, 6, 0))) ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLICOD", "", !((0==AV58TFCliCod)&&(0==AV59TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV59TFCliCod_To, 6, 0))) ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLINOM", "", !(GXutil.strcmp("", AV60TFCliNom)==0), (short)(0), AV60TFCliNom, "", !(GXutil.strcmp("", AV61TFCliNom_Sel)==0), AV61TFCliNom_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_CARTAZ", "", !(GXutil.strcmp("", AV62TFLb_Cartaz)==0), (short)(0), AV62TFLb_Cartaz, "", !(GXutil.strcmp("", AV63TFLb_Cartaz_Sel)==0), AV63TFLb_Cartaz_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_CARTAZF", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFLb_cartazf)), (short)(0), GXutil.trim( localUtil.dtoc( AV64TFLb_cartazf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_FECHAEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72TFLb_FechaEn)), (short)(0), GXutil.trim( localUtil.dtoc( AV72TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_FECHAR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74TFLb_FechaR)), (short)(0), GXutil.trim( localUtil.dtoc( AV74TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_ESTADO_SEL", "", !(AV103TFLb_Estado_Sels.size()==0), (short)(0), AV103TFLb_Estado_Sels.toJSonString(false), "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_FECNOA1", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89TFLb_FecNoa1)), (short)(0), GXutil.trim( localUtil.dtoc( AV89TFLb_FecNoa1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFLB_HHNOA1", "", !GXutil.dateCompare(GXutil.nullDate(), AV93TFLb_hhnoa1), (short)(0), GXutil.trim( localUtil.ttoc( AV93TFLb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV28GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV21EmprCod)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV21EmprCod );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (0==AV42Lb_Numero) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV42Lb_Numero, 8, 0) );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40Lb_fechaR)) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAR" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV40Lb_fechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV97Lb_ObsCR)==0) )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_OBSCR" );
         AV29GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV97Lb_ObsCR );
         AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV29GridStateFilterValue, 0);
      }
      AV28GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV28GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV106Pgmname+"GridState", AV28GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV84TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV84TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV106Pgmname );
      AV84TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV84TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV32HTTPRequest.getScriptName()+"?"+AV32HTTPRequest.getQuerystring() );
      AV84TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.TENS003" );
      AV56Session.setValue("TrnContext", AV84TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_82_1U62( boolean wbgen )
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
         wb_table2_82_1U62e( true) ;
      }
      else
      {
         wb_table2_82_1U62e( false) ;
      }
   }

   public void wb_table1_23_1U62( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV45ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_1U62( true) ;
      }
      else
      {
         wb_table3_28_1U62( false) ;
      }
      return  ;
   }

   public void wb_table3_28_1U62e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1U62e( true) ;
      }
      else
      {
         wb_table1_23_1U62e( false) ;
      }
   }

   public void wb_table3_28_1U62( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV25FilterFullText, GXutil.rtrim( localUtil.format( AV25FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1U62e( true) ;
      }
      else
      {
         wb_table3_28_1U62e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV21EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21EmprCod", AV21EmprCod);
      AV42Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Lb_Numero), 8, 0));
      AV40Lb_fechaR = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Lb_fechaR", localUtil.format(AV40Lb_fechaR, "99/99/99"));
      AV97Lb_ObsCR = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Lb_ObsCR", AV97Lb_ObsCR);
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
      pa1U62( ) ;
      ws1U62( ) ;
      we1U62( ) ;
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
      sCtrlAV21EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV42Lb_Numero = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV40Lb_fechaR = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV97Lb_ObsCR = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1U62( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\noaceptacionensayo_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1U62( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV21EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21EmprCod", AV21EmprCod);
         AV42Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Lb_Numero), 8, 0));
         AV40Lb_fechaR = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Lb_fechaR", localUtil.format(AV40Lb_fechaR, "99/99/99"));
         AV97Lb_ObsCR = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Lb_ObsCR", AV97Lb_ObsCR);
      }
      wcpOAV21EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV21EmprCod") ;
      wcpOAV42Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV42Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV40Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV40Lb_fechaR"), 0) ;
      wcpOAV97Lb_ObsCR = httpContext.cgiGet( sPrefix+"wcpOAV97Lb_ObsCR") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV21EmprCod, wcpOAV21EmprCod) != 0 ) || ( AV42Lb_Numero != wcpOAV42Lb_Numero ) || !( GXutil.dateCompare(GXutil.resetTime(AV40Lb_fechaR), GXutil.resetTime(wcpOAV40Lb_fechaR)) ) || ( GXutil.strcmp(AV97Lb_ObsCR, wcpOAV97Lb_ObsCR) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV21EmprCod = AV21EmprCod ;
      wcpOAV42Lb_Numero = AV42Lb_Numero ;
      wcpOAV40Lb_fechaR = AV40Lb_fechaR ;
      wcpOAV97Lb_ObsCR = AV97Lb_ObsCR ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV21EmprCod = httpContext.cgiGet( sPrefix+"AV21EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV21EmprCod) > 0 )
      {
         AV21EmprCod = httpContext.cgiGet( sCtrlAV21EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21EmprCod", AV21EmprCod);
      }
      else
      {
         AV21EmprCod = httpContext.cgiGet( sPrefix+"AV21EmprCod_PARM") ;
      }
      sCtrlAV42Lb_Numero = httpContext.cgiGet( sPrefix+"AV42Lb_Numero_CTRL") ;
      if ( GXutil.len( sCtrlAV42Lb_Numero) > 0 )
      {
         AV42Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV42Lb_Numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Lb_Numero), 8, 0));
      }
      else
      {
         AV42Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV42Lb_Numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV40Lb_fechaR = httpContext.cgiGet( sPrefix+"AV40Lb_fechaR_CTRL") ;
      if ( GXutil.len( sCtrlAV40Lb_fechaR) > 0 )
      {
         AV40Lb_fechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV40Lb_fechaR), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Lb_fechaR", localUtil.format(AV40Lb_fechaR, "99/99/99"));
      }
      else
      {
         AV40Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV40Lb_fechaR_PARM"), 0) ;
      }
      sCtrlAV97Lb_ObsCR = httpContext.cgiGet( sPrefix+"AV97Lb_ObsCR_CTRL") ;
      if ( GXutil.len( sCtrlAV97Lb_ObsCR) > 0 )
      {
         AV97Lb_ObsCR = httpContext.cgiGet( sCtrlAV97Lb_ObsCR) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Lb_ObsCR", AV97Lb_ObsCR);
      }
      else
      {
         AV97Lb_ObsCR = httpContext.cgiGet( sPrefix+"AV97Lb_ObsCR_PARM") ;
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
      pa1U62( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1U62( ) ;
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
      ws1U62( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21EmprCod_PARM", GXutil.rtrim( AV21EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21EmprCod_CTRL", GXutil.rtrim( sCtrlAV21EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Lb_Numero_PARM", GXutil.ltrim( localUtil.ntoc( AV42Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42Lb_Numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Lb_Numero_CTRL", GXutil.rtrim( sCtrlAV42Lb_Numero));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40Lb_fechaR_PARM", localUtil.dtoc( AV40Lb_fechaR, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40Lb_fechaR)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40Lb_fechaR_CTRL", GXutil.rtrim( sCtrlAV40Lb_fechaR));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97Lb_ObsCR_PARM", AV97Lb_ObsCR);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV97Lb_ObsCR)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97Lb_ObsCR_CTRL", GXutil.rtrim( sCtrlAV97Lb_ObsCR));
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
      we1U62( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655938", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/noaceptacionensayo_wc.js", "?20268211655938", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_542( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_54_idx );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_54_idx ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_54_idx ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM_"+sGXsfl_54_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_54_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_54_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_54_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_54_idx ;
      edtLb_cartazf_Internalname = sPrefix+"LB_CARTAZF_"+sGXsfl_54_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_54_idx ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR_"+sGXsfl_54_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_54_idx );
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_54_idx ;
      edtLb_FecNoa1_Internalname = sPrefix+"LB_FECNOA1_"+sGXsfl_54_idx ;
      edtLb_hhnoa1_Internalname = sPrefix+"LB_HHNOA1_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_542( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_54_fel_idx );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_54_fel_idx ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_54_fel_idx ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM_"+sGXsfl_54_fel_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_54_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_54_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_54_fel_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_54_fel_idx ;
      edtLb_cartazf_Internalname = sPrefix+"LB_CARTAZF_"+sGXsfl_54_fel_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_54_fel_idx ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR_"+sGXsfl_54_fel_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_54_fel_idx );
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_54_fel_idx ;
      edtLb_FecNoa1_Internalname = sPrefix+"LB_FECNOA1_"+sGXsfl_54_fel_idx ;
      edtLb_hhnoa1_Internalname = sPrefix+"LB_HHNOA1_"+sGXsfl_54_fel_idx ;
   }

   public void sendrow_542( )
   {
      subsflControlProps_542( ) ;
      wb1U60( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_54_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_54_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'"+sPrefix+"',false,'"+sGXsfl_54_idx+"',54)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_54_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_54_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV54Seleccionar),"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,55);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_numero_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_opcion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_opcion_Internalname,GXutil.rtrim( A5555Lb_opcion),GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_opcion_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNom_Internalname,GXutil.rtrim( A5536Lb_ColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Cartaz_Internalname,GXutil.rtrim( A5540Lb_Cartaz),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_Cartaz_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_cartazf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_cartazf_Internalname,localUtil.format(A5594Lb_cartazf, "99/99/99"),localUtil.format( A5594Lb_cartazf, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_cartazf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_cartazf_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaEn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaEn_Internalname,localUtil.format(A5567Lb_FechaEn, "99/99/99"),localUtil.format( A5567Lb_FechaEn, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_FechaEn_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaR_Internalname,localUtil.format(A5563Lb_FechaR, "99/99/99"),localUtil.format( A5563Lb_FechaR, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_FechaR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbLb_Estado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbLb_Estado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "LB_ESTADO_" + sGXsfl_54_idx ;
            cmbLb_Estado.setName( GXCCtl );
            cmbLb_Estado.setWebtags( "" );
            cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
            cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
            if ( cmbLb_Estado.getItemCount() > 0 )
            {
               A5566Lb_Estado = (byte)(GXutil.lval( cmbLb_Estado.getValidValue(GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLb_Estado,cmbLb_Estado.getInternalname(),GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)),Integer.valueOf(1),cmbLb_Estado.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbLb_Estado.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLb_Estado.setValue( GXutil.trim( GXutil.str( A5566Lb_Estado, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Values", cmbLb_Estado.ToJavascriptSource(), !bGXsfl_54_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FecNoa1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FecNoa1_Internalname,localUtil.format(A6461Lb_FecNoa1, "99/99/99"),localUtil.format( A6461Lb_FecNoa1, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FecNoa1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_FecNoa1_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_hhnoa1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_hhnoa1_Internalname,localUtil.ttoc( A10082Lb_hhnoa1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10082Lb_hhnoa1, "99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_hhnoa1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_hhnoa1_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1U62( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_54_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      /* End function sendrow_542 */
   }

   public void startgridcontrol54( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"54\">") ;
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
         httpContext.writeValue( "") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FecNoa1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_hhnoa1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV54Seleccionar));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A6461Lb_FecNoa1, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FecNoa1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10082Lb_hhnoa1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_hhnoa1_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO" ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION" ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM" ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ" ;
      edtLb_cartazf_Internalname = sPrefix+"LB_CARTAZF" ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN" ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR" ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO" );
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD" ;
      edtLb_FecNoa1_Internalname = sPrefix+"LB_FECNOA1" ;
      edtLb_hhnoa1_Internalname = sPrefix+"LB_HHNOA1" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_confirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_lb_cartazfauxdate_Internalname = sPrefix+"vDDO_LB_CARTAZFAUXDATE" ;
      divDdo_lb_cartazfauxdates_Internalname = sPrefix+"DDO_LB_CARTAZFAUXDATES" ;
      edtavDdo_lb_fechaenauxdate_Internalname = sPrefix+"vDDO_LB_FECHAENAUXDATE" ;
      divDdo_lb_fechaenauxdates_Internalname = sPrefix+"DDO_LB_FECHAENAUXDATES" ;
      edtavDdo_lb_fecharauxdate_Internalname = sPrefix+"vDDO_LB_FECHARAUXDATE" ;
      divDdo_lb_fecharauxdates_Internalname = sPrefix+"DDO_LB_FECHARAUXDATES" ;
      edtavDdo_lb_fecnoa1auxdate_Internalname = sPrefix+"vDDO_LB_FECNOA1AUXDATE" ;
      divDdo_lb_fecnoa1auxdates_Internalname = sPrefix+"DDO_LB_FECNOA1AUXDATES" ;
      edtavDdo_lb_hhnoa1auxdate_Internalname = sPrefix+"vDDO_LB_HHNOA1AUXDATE" ;
      divDdo_lb_hhnoa1auxdates_Internalname = sPrefix+"DDO_LB_HHNOA1AUXDATES" ;
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
      edtLb_hhnoa1_Jsonclick = "" ;
      edtLb_FecNoa1_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      cmbLb_Estado.setJsonclick( "" );
      edtLb_FechaR_Jsonclick = "" ;
      edtLb_FechaEn_Jsonclick = "" ;
      edtLb_cartazf_Jsonclick = "" ;
      edtLb_Cartaz_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
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
      edtLb_hhnoa1_Visible = -1 ;
      edtLb_FecNoa1_Visible = -1 ;
      cmbLb_Estado.setVisible( -1 );
      edtLb_FechaR_Visible = -1 ;
      edtLb_FechaEn_Visible = -1 ;
      edtLb_cartazf_Visible = -1 ;
      edtLb_Cartaz_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtLb_ColNum_Visible = -1 ;
      edtLb_ColNom_Visible = -1 ;
      edtLb_opcion_Visible = -1 ;
      edtLb_numero_Visible = -1 ;
      chkavSeleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lb_hhnoa1auxdate_Jsonclick = "" ;
      edtavDdo_lb_fecnoa1auxdate_Jsonclick = "" ;
      edtavDdo_lb_fecharauxdate_Jsonclick = "" ;
      edtavDdo_lb_fechaenauxdate_Jsonclick = "" ;
      edtavDdo_lb_cartazfauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable2_Height = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;No Aceptacion;No Aceptacion" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma la NO Aceptacion?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.NoAceptacionEnsayo_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||1:Enviado,2:Recepcionado||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||T||" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic|||Dynamic|Dynamic||||FixedValues||" ;
      Ddo_grid_Includedatalist = "||T|T|||T|T||||T||" ;
      Ddo_grid_Filterisrange = "|T|||T|T||||||||" ;
      Ddo_grid_Filtertype = "|Numeric|Character|Character|Numeric|Numeric|Character|Character|Date|Date|Date||Date|Date" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T|T|T|T||T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4|5|6|7|8|9|10|11|12|13" ;
      Ddo_grid_Columnids = "0:Seleccionar|1:Lb_numero|2:Lb_opcion|3:Lb_ColNom|4:Lb_ColNum|5:CliCod|6:CliNom|7:Lb_Cartaz|8:Lb_cartazf|9:Lb_FechaEn|10:Lb_FechaR|11:Lb_Estado|13:Lb_FecNoa1|14:Lb_hhnoa1" ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_54_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_54_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
      GXCCtl = "LB_ESTADO_" + sGXsfl_54_idx ;
      cmbLb_Estado.setName( GXCCtl );
      cmbLb_Estado.setWebtags( "" );
      cmbLb_Estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
      cmbLb_Estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
      if ( cmbLb_Estado.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV7Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'sPrefix'},{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV76TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV77TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV81TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV66TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV67TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV68TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV69TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV63TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV64TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV72TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV74TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV103TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV89TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV93TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV50OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV52OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV97Lb_ObsCR',fld:'vLB_OBSCR',pic:''},{av:'AV101Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtLb_FecNoa1_Visible',ctrl:'LB_FECNOA1',prop:'Visible'},{av:'edtLb_hhnoa1_Visible',ctrl:'LB_HHNOA1',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV45ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131U62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV77TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV81TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV66TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV67TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV68TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV69TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV63TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV64TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV72TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV74TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV103TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV89TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV93TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV50OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV52OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV97Lb_ObsCR',fld:'vLB_OBSCR',pic:''},{av:'AV7Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV101Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141U62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV77TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV81TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV66TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV67TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV68TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV69TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV63TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV64TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV72TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV74TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV103TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV89TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV93TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV50OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV52OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV97Lb_ObsCR',fld:'vLB_OBSCR',pic:''},{av:'AV7Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV101Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e151U62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV77TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV81TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV66TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV67TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV68TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV69TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV63TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV64TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV72TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV74TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV103TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV89TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV93TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV50OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV52OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV97Lb_ObsCR',fld:'vLB_OBSCR',pic:''},{av:'AV7Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV101Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV50OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV52OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV89TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV102TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV103TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV74TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV72TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV64TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV62TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV63TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV69TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV67TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV80TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV81TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV76TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV77TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e231U62',iparms:[{av:'A6461Lb_FecNoa1',fld:'LB_FECNOA1',pic:''},{av:'AV7Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'AV54Seleccionar',fld:'vSELECCIONAR',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e161U62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV77TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV81TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV66TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV67TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV68TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV69TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV63TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV64TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV72TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV74TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV103TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV89TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV93TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV50OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV52OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV97Lb_ObsCR',fld:'vLB_OBSCR',pic:''},{av:'AV7Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV101Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtLb_FecNoa1_Visible',ctrl:'LB_FECNOA1',prop:'Visible'},{av:'edtLb_hhnoa1_Visible',ctrl:'LB_HHNOA1',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV45ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121U62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV77TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV81TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV66TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV67TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV68TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV69TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV63TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV64TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV72TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV74TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV103TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV89TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV93TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV50OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV52OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV97Lb_ObsCR',fld:'vLB_OBSCR',pic:''},{av:'AV7Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV101Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV102TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV95DDO_Lb_hhnoa1AuxDate',fld:'vDDO_LB_HHNOA1AUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV50OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV52OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV76TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV77TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV81TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV66TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV67TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV68TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV69TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV63TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV64TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV72TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV74TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV103TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV89TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV93TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV95DDO_Lb_hhnoa1AuxDate',fld:'vDDO_LB_HHNOA1AUXDATE',pic:''},{av:'AV102TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtLb_FecNoa1_Visible',ctrl:'LB_FECNOA1',prop:'Visible'},{av:'edtLb_hhnoa1_Visible',ctrl:'LB_HHNOA1',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV45ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111U61',iparms:[{av:'AV7Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e171U62',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV76TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV77TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV80TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV81TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV66TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV67TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV68TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV69TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV58TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV59TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV62TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV63TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV64TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV72TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV74TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV103TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV89TFLb_FecNoa1',fld:'vTFLB_FECNOA1',pic:''},{av:'AV93TFLb_hhnoa1',fld:'vTFLB_HHNOA1',pic:'99:99'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV50OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV52OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV97Lb_ObsCR',fld:'vLB_OBSCR',pic:''},{av:'AV7Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV9Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV101Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV97Lb_ObsCR',fld:'vLB_OBSCR',pic:''},{av:'AV40Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV46ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtLb_FecNoa1_Visible',ctrl:'LB_FECNOA1',prop:'Visible'},{av:'edtLb_hhnoa1_Visible',ctrl:'LB_HHNOA1',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV45ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e181U62',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e191U62',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e201U62',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_hhnoa1',iparms:[]");
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
      wcpOAV21EmprCod = "" ;
      wcpOAV40Lb_fechaR = GXutil.nullDate() ;
      wcpOAV97Lb_ObsCR = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV21EmprCod = "" ;
      AV40Lb_fechaR = GXutil.nullDate() ;
      AV97Lb_ObsCR = "" ;
      AV25FilterFullText = "" ;
      AV11ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV80TFLb_opcion = "" ;
      AV81TFLb_opcion_Sel = "" ;
      AV66TFLb_ColNom = "" ;
      AV67TFLb_ColNom_Sel = "" ;
      AV60TFCliNom = "" ;
      AV61TFCliNom_Sel = "" ;
      AV62TFLb_Cartaz = "" ;
      AV63TFLb_Cartaz_Sel = "" ;
      AV64TFLb_cartazf = GXutil.nullDate() ;
      AV72TFLb_FechaEn = GXutil.nullDate() ;
      AV74TFLb_FechaR = GXutil.nullDate() ;
      AV103TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV89TFLb_FecNoa1 = GXutil.nullDate() ;
      AV93TFLb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV106Pgmname = "" ;
      AV7Col_Lb_numero = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV9Col_Lb_opcion = new GXSimpleCollection<String>(String.class, "internal", "");
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV45ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV20DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV102TFLb_Estado_SelsJson = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
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
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV14DDO_Lb_cartazfAuxDate = GXutil.nullDate() ;
      AV16DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
      AV18DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
      AV91DDO_Lb_FecNoa1AuxDate = GXutil.nullDate() ;
      AV95DDO_Lb_hhnoa1AuxDate = GXutil.nullDate() ;
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
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = "" ;
      lV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = "" ;
      lV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = "" ;
      lV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = "" ;
      lV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = "" ;
      AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = "" ;
      AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = "" ;
      AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = "" ;
      AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = "" ;
      AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = "" ;
      AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = "" ;
      AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = "" ;
      AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = "" ;
      AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = "" ;
      AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = GXutil.nullDate() ;
      AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = GXutil.nullDate() ;
      AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = GXutil.nullDate() ;
      AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = GXutil.nullDate() ;
      AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      H01U62_A396EmprCod = new String[] {""} ;
      H01U62_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      H01U62_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      H01U62_A831TipColCod = new byte[1] ;
      H01U62_n831TipColCod = new boolean[] {false} ;
      H01U62_A5566Lb_Estado = new byte[1] ;
      H01U62_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      H01U62_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      H01U62_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      H01U62_A5540Lb_Cartaz = new String[] {""} ;
      H01U62_A279CliNom = new String[] {""} ;
      H01U62_A252CliCod = new int[1] ;
      H01U62_A5537Lb_ColNum = new int[1] ;
      H01U62_A5536Lb_ColNom = new String[] {""} ;
      H01U62_A5555Lb_opcion = new String[] {""} ;
      H01U62_A5532Lb_numero = new int[1] ;
      H01U63_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      GXv_int2 = new byte[1] ;
      AV107Station = "" ;
      AV108Emprnom = "" ;
      AV109Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV87WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV56Session = httpContext.getWebSession();
      AV13ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV47ManageFiltersXml = "" ;
      AV23ExcelFilename = "" ;
      AV22ErrorMessage = "" ;
      AV86UserCustomValue = "" ;
      AV12ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV98Lb_opcions = "" ;
      AV99Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV35IN_Lb_opcion = "" ;
      GXv_dtime16 = new java.util.Date[1] ;
      GXv_int14 = new int[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_int17 = new int[1] ;
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV84TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV32HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV21EmprCod = "" ;
      sCtrlAV42Lb_Numero = "" ;
      sCtrlAV40Lb_fechaR = "" ;
      sCtrlAV97Lb_ObsCR = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.noaceptacionensayo_wc__default(),
         new Object[] {
             new Object[] {
            H01U62_A396EmprCod, H01U62_A10082Lb_hhnoa1, H01U62_A6461Lb_FecNoa1, H01U62_A831TipColCod, H01U62_n831TipColCod, H01U62_A5566Lb_Estado, H01U62_A5563Lb_FechaR, H01U62_A5567Lb_FechaEn, H01U62_A5594Lb_cartazf, H01U62_A5540Lb_Cartaz,
            H01U62_A279CliNom, H01U62_A252CliCod, H01U62_A5537Lb_ColNum, H01U62_A5536Lb_ColNom, H01U62_A5555Lb_opcion, H01U62_A5532Lb_numero
            }
            , new Object[] {
            H01U63_AGRID_nRecordCount
            }
         }
      );
      AV106Pgmname = "GestionLaboratorio.NoAceptacionEnsayo_WC" ;
      /* GeneXus formulas. */
      AV106Pgmname = "GestionLaboratorio.NoAceptacionEnsayo_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV46ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A5566Lb_Estado ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV50OrderedBy ;
   private short AV101Moda21 ;
   private short AV33i ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV42Lb_Numero ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_54 ;
   private int AV42Lb_Numero ;
   private int nGXsfl_54_idx=1 ;
   private int AV76TFLb_numero ;
   private int AV77TFLb_numero_To ;
   private int AV68TFLb_ColNum ;
   private int AV69TFLb_ColNum_To ;
   private int AV58TFCliCod ;
   private int AV59TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int divUnnamedtable2_Height ;
   private int edtavPgmname_Enabled ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ;
   private int AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ;
   private int AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ;
   private int AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ;
   private int AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ;
   private int AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ;
   private int AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ;
   private int edtLb_numero_Visible ;
   private int edtLb_opcion_Visible ;
   private int edtLb_ColNom_Visible ;
   private int edtLb_ColNum_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtLb_Cartaz_Visible ;
   private int edtLb_cartazf_Visible ;
   private int edtLb_FechaEn_Visible ;
   private int edtLb_FechaR_Visible ;
   private int edtLb_FecNoa1_Visible ;
   private int edtLb_hhnoa1_Visible ;
   private int AV53PageToGo ;
   private int AV34IN_Lb_numero ;
   private int AV100CliCod ;
   private int GXv_int14[] ;
   private int GXv_int17[] ;
   private int AV131GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV21EmprCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV21EmprCod ;
   private String sGXsfl_54_idx="0001" ;
   private String AV80TFLb_opcion ;
   private String AV81TFLb_opcion_Sel ;
   private String AV66TFLb_ColNom ;
   private String AV67TFLb_ColNom_Sel ;
   private String AV60TFCliNom ;
   private String AV61TFCliNom_Sel ;
   private String AV62TFLb_Cartaz ;
   private String AV63TFLb_Cartaz_Sel ;
   private String AV106Pgmname ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
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
   private String Grid_titlescategories_Internalname ;
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
   private String divDdo_lb_fecnoa1auxdates_Internalname ;
   private String edtavDdo_lb_fecnoa1auxdate_Internalname ;
   private String edtavDdo_lb_fecnoa1auxdate_Jsonclick ;
   private String divDdo_lb_hhnoa1auxdates_Internalname ;
   private String edtavDdo_lb_hhnoa1auxdate_Internalname ;
   private String edtavDdo_lb_hhnoa1auxdate_Jsonclick ;
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
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A5540Lb_Cartaz ;
   private String edtLb_Cartaz_Internalname ;
   private String edtLb_cartazf_Internalname ;
   private String edtLb_FechaEn_Internalname ;
   private String edtLb_FechaR_Internalname ;
   private String edtTipColCod_Internalname ;
   private String edtLb_FecNoa1_Internalname ;
   private String edtLb_hhnoa1_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ;
   private String lV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ;
   private String lV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ;
   private String lV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ;
   private String AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ;
   private String AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ;
   private String AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ;
   private String AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ;
   private String AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ;
   private String AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ;
   private String AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ;
   private String AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV107Station ;
   private String AV108Emprnom ;
   private String AV109Usurcod ;
   private String AV98Lb_opcions ;
   private String AV35IN_Lb_opcion ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char19 ;
   private String GXv_char6[] ;
   private String GXt_char18 ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV21EmprCod ;
   private String sCtrlAV42Lb_Numero ;
   private String sCtrlAV40Lb_fechaR ;
   private String sCtrlAV97Lb_ObsCR ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtLb_numero_Jsonclick ;
   private String edtLb_opcion_Jsonclick ;
   private String edtLb_ColNom_Jsonclick ;
   private String edtLb_ColNum_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtLb_Cartaz_Jsonclick ;
   private String edtLb_cartazf_Jsonclick ;
   private String edtLb_FechaEn_Jsonclick ;
   private String edtLb_FechaR_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtLb_FecNoa1_Jsonclick ;
   private String edtLb_hhnoa1_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV93TFLb_hhnoa1 ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ;
   private java.util.Date AV99Lb_hhnoa1 ;
   private java.util.Date GXv_dtime16[] ;
   private java.util.Date wcpOAV40Lb_fechaR ;
   private java.util.Date AV40Lb_fechaR ;
   private java.util.Date AV64TFLb_cartazf ;
   private java.util.Date AV72TFLb_FechaEn ;
   private java.util.Date AV74TFLb_FechaR ;
   private java.util.Date AV89TFLb_FecNoa1 ;
   private java.util.Date AV14DDO_Lb_cartazfAuxDate ;
   private java.util.Date AV16DDO_Lb_FechaEnAuxDate ;
   private java.util.Date AV18DDO_Lb_FechaRAuxDate ;
   private java.util.Date AV91DDO_Lb_FecNoa1AuxDate ;
   private java.util.Date AV95DDO_Lb_hhnoa1AuxDate ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ;
   private java.util.Date AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ;
   private java.util.Date AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ;
   private java.util.Date AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ;
   private java.util.Date GXv_date15[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV52OrderedDsc ;
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
   private boolean AV54Seleccionar ;
   private boolean n831TipColCod ;
   private boolean bGXsfl_54_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV102TFLb_Estado_SelsJson ;
   private String AV13ColumnsSelectorXML ;
   private String AV47ManageFiltersXml ;
   private String AV86UserCustomValue ;
   private String wcpOAV97Lb_ObsCR ;
   private String AV97Lb_ObsCR ;
   private String AV25FilterFullText ;
   private String lV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ;
   private String AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ;
   private String AV23ExcelFilename ;
   private String AV22ErrorMessage ;
   private GXSimpleCollection<Byte> AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ;
   private GXSimpleCollection<Byte> AV103TFLb_Estado_Sels ;
   private GXSimpleCollection<Integer> AV7Col_Lb_numero ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV32HTTPRequest ;
   private com.genexus.webpanels.WebSession AV56Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSeleccionar ;
   private HTMLChoice cmbLb_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H01U62_A396EmprCod ;
   private java.util.Date[] H01U62_A10082Lb_hhnoa1 ;
   private java.util.Date[] H01U62_A6461Lb_FecNoa1 ;
   private byte[] H01U62_A831TipColCod ;
   private boolean[] H01U62_n831TipColCod ;
   private byte[] H01U62_A5566Lb_Estado ;
   private java.util.Date[] H01U62_A5563Lb_FechaR ;
   private java.util.Date[] H01U62_A5567Lb_FechaEn ;
   private java.util.Date[] H01U62_A5594Lb_cartazf ;
   private String[] H01U62_A5540Lb_Cartaz ;
   private String[] H01U62_A279CliNom ;
   private int[] H01U62_A252CliCod ;
   private int[] H01U62_A5537Lb_ColNum ;
   private String[] H01U62_A5536Lb_ColNom ;
   private String[] H01U62_A5555Lb_opcion ;
   private int[] H01U62_A5532Lb_numero ;
   private long[] H01U63_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV9Col_Lb_opcion ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV45ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV12ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV20DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV84TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV87WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class noaceptacionensayo_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01U62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                          String AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                          int AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ,
                                          int AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ,
                                          String AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                          String AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                          String AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                          String AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                          int AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ,
                                          int AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ,
                                          int AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ,
                                          int AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ,
                                          String AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                          String AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                          String AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                          String AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                          java.util.Date AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                          java.util.Date AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                          java.util.Date AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                          int AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ,
                                          java.util.Date AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                          java.util.Date AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          short AV50OrderedBy ,
                                          boolean AV52OrderedDsc ,
                                          String AV21EmprCod ,
                                          int AV42Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[34];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.Lb_hhnoa1, T1.Lb_FecNoa1, T2.TipColCod, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod, T2.Lb_ColNum," ;
      sSelectString += " T2.Lb_ColNom, T1.Lb_opcion, T1.Lb_numero" ;
      sFromString = " FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T2.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_Estado = 1)");
      if ( ! (GXutil.strcmp("", AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
         GXv_int23[3] = (byte)(1) ;
         GXv_int23[4] = (byte)(1) ;
         GXv_int23[5] = (byte)(1) ;
         GXv_int23[6] = (byte)(1) ;
         GXv_int23[7] = (byte)(1) ;
         GXv_int23[8] = (byte)(1) ;
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (0==AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (0==AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (0==AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(T1.Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(T1.Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ( AV50OrderedBy == 1 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV50OrderedBy == 1 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV50OrderedBy == 2 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV50OrderedBy == 2 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV50OrderedBy == 3 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ColNom" ;
      }
      else if ( ( AV50OrderedBy == 3 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ColNom DESC" ;
      }
      else if ( ( AV50OrderedBy == 4 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ColNum" ;
      }
      else if ( ( AV50OrderedBy == 4 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ColNum DESC" ;
      }
      else if ( ( AV50OrderedBy == 5 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV50OrderedBy == 5 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV50OrderedBy == 6 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV50OrderedBy == 6 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV50OrderedBy == 7 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV50OrderedBy == 7 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV50OrderedBy == 8 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_cartazf" ;
      }
      else if ( ( AV50OrderedBy == 8 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_cartazf DESC" ;
      }
      else if ( ( AV50OrderedBy == 9 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV50OrderedBy == 9 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV50OrderedBy == 10 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV50OrderedBy == 10 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV50OrderedBy == 11 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV50OrderedBy == 11 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( ( AV50OrderedBy == 12 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FecNoa1" ;
      }
      else if ( ( AV50OrderedBy == 12 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FecNoa1 DESC" ;
      }
      else if ( ( AV50OrderedBy == 13 ) && ! AV52OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_hhnoa1" ;
      }
      else if ( ( AV50OrderedBy == 13 ) && ( AV52OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_hhnoa1 DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H01U63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                          String AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                          int AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ,
                                          int AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ,
                                          String AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                          String AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                          String AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                          String AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                          int AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ,
                                          int AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ,
                                          int AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ,
                                          int AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ,
                                          String AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                          String AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                          String AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                          String AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                          java.util.Date AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                          java.util.Date AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                          java.util.Date AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                          int AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ,
                                          java.util.Date AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                          java.util.Date AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          short AV50OrderedBy ,
                                          boolean AV52OrderedDsc ,
                                          String AV21EmprCod ,
                                          int AV42Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[29];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_Estado = 1)");
      if ( ! (GXutil.strcmp("", AV110Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
         GXv_int26[3] = (byte)(1) ;
         GXv_int26[4] = (byte)(1) ;
         GXv_int26[5] = (byte)(1) ;
         GXv_int26[6] = (byte)(1) ;
         GXv_int26[7] = (byte)(1) ;
         GXv_int26[8] = (byte)(1) ;
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (0==AV112Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV115Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (0==AV117Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (0==AV118Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (0==AV119Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (0==AV120Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV123Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(T1.Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(T1.Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV50OrderedBy == 1 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 1 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 2 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 2 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 3 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 3 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 4 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 4 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 5 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 5 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 6 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 6 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 7 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 7 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 8 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 8 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 9 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 9 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 10 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 10 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 11 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 11 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 12 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 12 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 13 ) && ! AV52OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV50OrderedBy == 13 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
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
                  return conditional_H01U62(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] );
            case 1 :
                  return conditional_H01U63(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01U62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01U63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = GXutil.resetDate(rslt.getGXDateTime(2));
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((int[]) buf[15])[0] = rslt.getInt(15);
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
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], true);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], true);
               }
               return;
      }
   }

}

