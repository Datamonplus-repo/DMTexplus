package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class actualizacionensayoencolorteca_wc_impl extends GXWebComponent
{
   public actualizacionensayoencolorteca_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public actualizacionensayoencolorteca_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizacionensayoencolorteca_wc_impl.class ));
   }

   public actualizacionensayoencolorteca_wc_impl( int remoteHandle ,
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
               AV5Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicod), 6, 0));
               AV27Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Lb_Numero), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV16Emprcod,Integer.valueOf(AV5Clicod),Integer.valueOf(AV27Lb_Numero)});
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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
      AV18FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV16Emprcod = httpContext.GetPar( "Emprcod") ;
      AV5Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV27Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
      AV29ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV6ColumnsSelector);
      AV55TFLb_numero = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero"))) ;
      AV56TFLb_numero_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero_To"))) ;
      AV37TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV38TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV39TFLb_ArtCod = httpContext.GetPar( "TFLb_ArtCod") ;
      AV40TFLb_ArtCod_Sel = httpContext.GetPar( "TFLb_ArtCod_Sel") ;
      AV43TFLb_ColNomC = httpContext.GetPar( "TFLb_ColNomC") ;
      AV44TFLb_ColNomC_Sel = httpContext.GetPar( "TFLb_ColNomC_Sel") ;
      AV45TFLb_ColNum = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum"))) ;
      AV46TFLb_ColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum_To"))) ;
      AV79TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV80TFTipColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod_To"))) ;
      AV61TFLb_Rb = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_Rb"), ".") ;
      AV62TFLb_Rb_To = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_Rb_To"), ".") ;
      AV59TFLb_opcion = httpContext.GetPar( "TFLb_opcion") ;
      AV60TFLb_opcion_Sel = httpContext.GetPar( "TFLb_opcion_Sel") ;
      AV57TFLb_numop = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_numop"))) ;
      AV58TFLb_numop_To = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_numop_To"))) ;
      AV41TFLb_Cartaz = httpContext.GetPar( "TFLb_Cartaz") ;
      AV42TFLb_Cartaz_Sel = httpContext.GetPar( "TFLb_Cartaz_Sel") ;
      AV49TFLb_FechaE = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaE")) ;
      AV51TFLb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaEn")) ;
      AV53TFLb_FechaR = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaR")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV47TFLb_Estado_Sels);
      AV91TFLb_RGB = GXutil.lval( httpContext.GetPar( "TFLb_RGB")) ;
      AV92TFLb_RGB_To = GXutil.lval( httpContext.GetPar( "TFLb_RGB_To")) ;
      AV93TFLb_CosteE = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_CosteE"), ".") ;
      AV94TFLb_CosteE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_CosteE_To"), ".") ;
      AV97Pgmname = httpContext.GetPar( "Pgmname") ;
      AV31OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV33OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV17F_Cformu = (short)(GXutil.lval( httpContext.GetPar( "F_Cformu"))) ;
      AV20ForUltUti = localUtil.parseDateParm( httpContext.GetPar( "ForUltUti")) ;
      AV19ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
      Gx_msg = httpContext.GetPar( "Gx_msg") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV68Col_Lb_numero);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV69Col_Lb_opcion);
      AV83Carvitin = (short)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV16Emprcod, AV5Clicod, AV27Lb_Numero, AV29ManageFiltersExecutionStep, AV6ColumnsSelector, AV55TFLb_numero, AV56TFLb_numero_To, AV37TFCliCod, AV38TFCliCod_To, AV39TFLb_ArtCod, AV40TFLb_ArtCod_Sel, AV43TFLb_ColNomC, AV44TFLb_ColNomC_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV79TFTipColCod, AV80TFTipColCod_To, AV61TFLb_Rb, AV62TFLb_Rb_To, AV59TFLb_opcion, AV60TFLb_opcion_Sel, AV57TFLb_numop, AV58TFLb_numop_To, AV41TFLb_Cartaz, AV42TFLb_Cartaz_Sel, AV49TFLb_FechaE, AV51TFLb_FechaEn, AV53TFLb_FechaR, AV47TFLb_Estado_Sels, AV91TFLb_RGB, AV92TFLb_RGB_To, AV93TFLb_CosteE, AV94TFLb_CosteE_To, AV97Pgmname, AV31OrderedBy, AV33OrderedDsc, AV17F_Cformu, AV20ForUltUti, AV19ForNumCol, Gx_msg, AV68Col_Lb_numero, AV69Col_Lb_opcion, AV83Carvitin, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1TT2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Actualizacion Ensayo en Colorteca", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.actualizacionensayoencolorteca_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV16Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV27Lb_Numero,8,0))}, new String[] {"Emprcod","Clicod","Lb_Numero"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV20ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMSG", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV83Carvitin), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ActualizacionEnsayoenColorteca_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\actualizacionensayoencolorteca_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV18FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_50, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV28ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV28ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV21GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV22GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV6ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV6ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16Emprcod", GXutil.rtrim( wcpOAV16Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV5Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27Lb_Numero", GXutil.ltrim( localUtil.ntoc( wcpOAV27Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV29ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV55TFLb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO_TO", GXutil.ltrim( localUtil.ntoc( AV56TFLb_numero_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV37TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV38TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTCOD", GXutil.rtrim( AV39TFLb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTCOD_SEL", GXutil.rtrim( AV40TFLb_ArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOMC", GXutil.rtrim( AV43TFLb_ColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOMC_SEL", GXutil.rtrim( AV44TFLb_ColNomC_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV45TFLb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV46TFLb_ColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV79TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV80TFTipColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_RB", GXutil.ltrim( localUtil.ntoc( AV61TFLb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_RB_TO", GXutil.ltrim( localUtil.ntoc( AV62TFLb_Rb_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION", GXutil.rtrim( AV59TFLb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_OPCION_SEL", GXutil.rtrim( AV60TFLb_opcion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMOP", GXutil.ltrim( localUtil.ntoc( AV57TFLb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMOP_TO", GXutil.ltrim( localUtil.ntoc( AV58TFLb_numop_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ", GXutil.rtrim( AV41TFLb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ_SEL", GXutil.rtrim( AV42TFLb_Cartaz_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAE", localUtil.dtoc( AV49TFLb_FechaE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAEN", localUtil.dtoc( AV51TFLb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAR", localUtil.dtoc( AV53TFLb_FechaR, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFLB_ESTADO_SELS", AV47TFLb_Estado_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFLB_ESTADO_SELS", AV47TFLb_Estado_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_RGB", GXutil.ltrim( localUtil.ntoc( AV91TFLb_RGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_RGB_TO", GXutil.ltrim( localUtil.ntoc( AV92TFLb_RGB_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COSTEE", GXutil.ltrim( localUtil.ntoc( AV93TFLb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COSTEE_TO", GXutil.ltrim( localUtil.ntoc( AV94TFLb_CosteE_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV31OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV33OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV16Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV5Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV27Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_COLNOM", GXutil.rtrim( A5536Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORULTUTI", localUtil.dtoc( AV20ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV20ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMSG", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_NUMERO", AV68Col_Lb_numero);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_NUMERO", AV68Col_Lb_numero);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_OPCION", AV69Col_Lb_opcion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_OPCION", AV69Col_Lb_opcion);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV23GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV23GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ESTADO_SELSJSON", AV48TFLb_Estado_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUMFORM", GXutil.ltrim( localUtil.ntoc( AV82Numform, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV83Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV83Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV70i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlCloseForm1TT2( )
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
      return "GestionLaboratorio.ActualizacionEnsayoenColorteca_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Actualizacion Ensayo en Colorteca", "") ;
   }

   public void wb1TT0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.actualizacionensayoencolorteca_wc");
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
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_1TT2( true) ;
      }
      else
      {
         wb_table1_19_1TT2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_1TT2e( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelr_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelr_Jsonclick, 7, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111tt1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
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
         startgridcontrol50( ) ;
      }
      if ( wbEnd == 50 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_50 = (int)(nGXsfl_50_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV21GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV22GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV97Pgmname), GXutil.rtrim( localUtil.format( AV97Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV6ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_82_1TT2( true) ;
      }
      else
      {
         wb_table2_82_1TT2( false) ;
      }
      return  ;
   }

   public void wb_table2_82_1TT2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaeauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'" + sPrefix + "',false,'" + sGXsfl_50_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaeauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaeauxdate_Internalname, localUtil.format(AV9DDO_Lb_FechaEAuxDate, "99/99/99"), localUtil.format( AV9DDO_Lb_FechaEAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,90);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaeauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaeauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'" + sPrefix + "',false,'" + sGXsfl_50_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaenauxdate_Internalname, localUtil.format(AV11DDO_Lb_FechaEnAuxDate, "99/99/99"), localUtil.format( AV11DDO_Lb_FechaEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,92);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fecharauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'" + sPrefix + "',false,'" + sGXsfl_50_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fecharauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fecharauxdate_Internalname, localUtil.format(AV13DDO_Lb_FechaRAuxDate, "99/99/99"), localUtil.format( AV13DDO_Lb_FechaRAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fecharauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fecharauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 50 )
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

   public void start1TT2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Actualizacion Ensayo en Colorteca", ""), (short)(0)) ;
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
            strup1TT0( ) ;
         }
      }
   }

   public void ws1TT2( )
   {
      start1TT2( ) ;
      evt1TT2( ) ;
   }

   public void evt1TT2( )
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
                              strup1TT0( ) ;
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
                              strup1TT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121TT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131TT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141TT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151TT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161TT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171TT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoConfirmar' */
                                 e181TT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1TT0( ) ;
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
                              strup1TT0( ) ;
                           }
                           nGXsfl_50_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_502( ) ;
                           AV35Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV35Seleccionar);
                           A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
                           A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
                           A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n831TipColCod = false ;
                           A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
                           A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
                           A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_numop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
                           A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
                           A5567Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaEn_Internalname), 0)) ;
                           A5563Lb_FechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaR_Internalname), 0)) ;
                           cmbLb_Estado.setName( cmbLb_Estado.getInternalname() );
                           cmbLb_Estado.setValue( httpContext.cgiGet( cmbLb_Estado.getInternalname()) );
                           A5566Lb_Estado = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_Estado.getInternalname()))) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_CFORMU");
                              GX_FocusControl = edtavF_cformu_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV17F_Cformu = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17F_Cformu), 4, 0));
                           }
                           else
                           {
                              AV17F_Cformu = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_cformu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17F_Cformu), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFornumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORNUMCOL");
                              GX_FocusControl = edtavFornumcol_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV19ForNumCol = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ForNumCol), 8, 0));
                           }
                           else
                           {
                              AV19ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtavFornumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ForNumCol), 8, 0));
                           }
                           A5599Lb_RGB = localUtil.ctol( httpContext.cgiGet( edtLb_RGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( edtLb_CosteE_Internalname)) ;
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
                                       e191TT2 ();
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
                                       e201TT2 ();
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
                                       e211TT2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV18FilterFullText) != 0 )
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
                                    strup1TT0( ) ;
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

   public void we1TT2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1TT2( ) ;
         }
      }
   }

   public void pa1TT2( )
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
      subsflControlProps_502( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         sendrow_502( ) ;
         nGXsfl_50_idx = ((subGrid_Islastpage==1)&&(nGXsfl_50_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV18FilterFullText ,
                                 String AV16Emprcod ,
                                 int AV5Clicod ,
                                 int AV27Lb_Numero ,
                                 byte AV29ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelector ,
                                 int AV55TFLb_numero ,
                                 int AV56TFLb_numero_To ,
                                 int AV37TFCliCod ,
                                 int AV38TFCliCod_To ,
                                 String AV39TFLb_ArtCod ,
                                 String AV40TFLb_ArtCod_Sel ,
                                 String AV43TFLb_ColNomC ,
                                 String AV44TFLb_ColNomC_Sel ,
                                 int AV45TFLb_ColNum ,
                                 int AV46TFLb_ColNum_To ,
                                 byte AV79TFTipColCod ,
                                 byte AV80TFTipColCod_To ,
                                 java.math.BigDecimal AV61TFLb_Rb ,
                                 java.math.BigDecimal AV62TFLb_Rb_To ,
                                 String AV59TFLb_opcion ,
                                 String AV60TFLb_opcion_Sel ,
                                 byte AV57TFLb_numop ,
                                 byte AV58TFLb_numop_To ,
                                 String AV41TFLb_Cartaz ,
                                 String AV42TFLb_Cartaz_Sel ,
                                 java.util.Date AV49TFLb_FechaE ,
                                 java.util.Date AV51TFLb_FechaEn ,
                                 java.util.Date AV53TFLb_FechaR ,
                                 GXSimpleCollection<Byte> AV47TFLb_Estado_Sels ,
                                 long AV91TFLb_RGB ,
                                 long AV92TFLb_RGB_To ,
                                 java.math.BigDecimal AV93TFLb_CosteE ,
                                 java.math.BigDecimal AV94TFLb_CosteE_To ,
                                 String AV97Pgmname ,
                                 short AV31OrderedBy ,
                                 boolean AV33OrderedDsc ,
                                 short AV17F_Cformu ,
                                 java.util.Date AV20ForUltUti ,
                                 int AV19ForNumCol ,
                                 String Gx_msg ,
                                 GXSimpleCollection<Integer> AV68Col_Lb_numero ,
                                 GXSimpleCollection<String> AV69Col_Lb_opcion ,
                                 short AV83Carvitin ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201TT2 ();
      GRID_nCurrentRecord = 0 ;
      rf1TT2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ActualizacionEnsayoenColorteca_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\actualizacionensayoencolorteca_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMOP", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_NUMOP", GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMERO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_NUMERO", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_OPCION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_OPCION", GXutil.rtrim( A5555Lb_opcion));
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
      rf1TT2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV97Pgmname = "GestionLaboratorio.ActualizacionEnsayoenColorteca_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
      Gx_err = (short)(0) ;
      edtavF_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavF_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_cformu_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavFornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1TT2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(50) ;
      /* Execute user event: Refresh */
      e201TT2 ();
      nGXsfl_50_idx = 1 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_502( ) ;
      bGXsfl_50_Refreshing = true ;
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
         subsflControlProps_502( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A5566Lb_Estado) ,
                                              AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                              AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                              Integer.valueOf(AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) ,
                                              Integer.valueOf(AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) ,
                                              Integer.valueOf(AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) ,
                                              Integer.valueOf(AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) ,
                                              AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                              AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                              AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                              AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                              Integer.valueOf(AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) ,
                                              Integer.valueOf(AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) ,
                                              Byte.valueOf(AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) ,
                                              Byte.valueOf(AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) ,
                                              AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                              AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                              AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                              AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                              Byte.valueOf(AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) ,
                                              Byte.valueOf(AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) ,
                                              AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                              AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                              AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                              AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                              AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                              Integer.valueOf(AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels.size()) ,
                                              Long.valueOf(AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) ,
                                              Long.valueOf(AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) ,
                                              AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                              AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                              Integer.valueOf(AV5Clicod) ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A5533Lb_ArtCod ,
                                              A5538Lb_ColNomC ,
                                              Integer.valueOf(A5537Lb_ColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A5547Lb_Rb ,
                                              A5555Lb_opcion ,
                                              Byte.valueOf(A5718Lb_numop) ,
                                              A5540Lb_Cartaz ,
                                              Long.valueOf(A5599Lb_RGB) ,
                                              A5565Lb_CosteE ,
                                              A5541Lb_FechaE ,
                                              A5567Lb_FechaEn ,
                                              A5563Lb_FechaR ,
                                              Short.valueOf(AV31OrderedBy) ,
                                              Boolean.valueOf(AV33OrderedDsc) ,
                                              Byte.valueOf(A5569Lb_EstEns) ,
                                              AV16Emprcod ,
                                              Integer.valueOf(AV27Lb_Numero) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
         lV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod), 16, "%") ;
         lV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc), 13, "%") ;
         lV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = GXutil.padr( GXutil.rtrim( AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion), 1, "%") ;
         lV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz), 20, "%") ;
         /* Using cursor H01TT2 */
         pr_default.execute(0, new Object[] {AV16Emprcod, Integer.valueOf(AV27Lb_Numero), lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, Integer.valueOf(AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero), Integer.valueOf(AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to), Integer.valueOf(AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod), Integer.valueOf(AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to), lV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod, AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel, lV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc, AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum), Integer.valueOf(AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to), Byte.valueOf(AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod), Byte.valueOf(AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to), AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb, AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to, lV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion, AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel, Byte.valueOf(AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop), Byte.valueOf(AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to), lV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz, AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel, AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae, AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen, AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar, Long.valueOf(AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb), Long.valueOf(AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to), AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee, AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to, Integer.valueOf(AV5Clicod), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_50_idx = 1 ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5569Lb_EstEns = H01TT2_A5569Lb_EstEns[0] ;
            A396EmprCod = H01TT2_A396EmprCod[0] ;
            A5536Lb_ColNom = H01TT2_A5536Lb_ColNom[0] ;
            A279CliNom = H01TT2_A279CliNom[0] ;
            A5565Lb_CosteE = H01TT2_A5565Lb_CosteE[0] ;
            A5599Lb_RGB = H01TT2_A5599Lb_RGB[0] ;
            A5566Lb_Estado = H01TT2_A5566Lb_Estado[0] ;
            A5563Lb_FechaR = H01TT2_A5563Lb_FechaR[0] ;
            A5567Lb_FechaEn = H01TT2_A5567Lb_FechaEn[0] ;
            A5541Lb_FechaE = H01TT2_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = H01TT2_A5540Lb_Cartaz[0] ;
            A5718Lb_numop = H01TT2_A5718Lb_numop[0] ;
            A5555Lb_opcion = H01TT2_A5555Lb_opcion[0] ;
            A5547Lb_Rb = H01TT2_A5547Lb_Rb[0] ;
            A831TipColCod = H01TT2_A831TipColCod[0] ;
            n831TipColCod = H01TT2_n831TipColCod[0] ;
            A5537Lb_ColNum = H01TT2_A5537Lb_ColNum[0] ;
            A5538Lb_ColNomC = H01TT2_A5538Lb_ColNomC[0] ;
            A5533Lb_ArtCod = H01TT2_A5533Lb_ArtCod[0] ;
            A252CliCod = H01TT2_A252CliCod[0] ;
            A5532Lb_numero = H01TT2_A5532Lb_numero[0] ;
            A5569Lb_EstEns = H01TT2_A5569Lb_EstEns[0] ;
            A5536Lb_ColNom = H01TT2_A5536Lb_ColNom[0] ;
            A5599Lb_RGB = H01TT2_A5599Lb_RGB[0] ;
            A5541Lb_FechaE = H01TT2_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = H01TT2_A5540Lb_Cartaz[0] ;
            A5547Lb_Rb = H01TT2_A5547Lb_Rb[0] ;
            A831TipColCod = H01TT2_A831TipColCod[0] ;
            n831TipColCod = H01TT2_n831TipColCod[0] ;
            A5537Lb_ColNum = H01TT2_A5537Lb_ColNum[0] ;
            A5538Lb_ColNomC = H01TT2_A5538Lb_ColNomC[0] ;
            A5533Lb_ArtCod = H01TT2_A5533Lb_ArtCod[0] ;
            A252CliCod = H01TT2_A252CliCod[0] ;
            A279CliNom = H01TT2_A279CliNom[0] ;
            e211TT2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(50) ;
         wb1TT0( ) ;
      }
      bGXsfl_50_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1TT2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORULTUTI", localUtil.dtoc( AV20ForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV20ForUltUti));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMSG", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMOP"+"_"+sGXsfl_50_idx, getSecureSignedToken( sPrefix+sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV83Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV83Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_NUMERO"+"_"+sGXsfl_50_idx, getSecureSignedToken( sPrefix+sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_OPCION"+"_"+sGXsfl_50_idx, getSecureSignedToken( sPrefix+sGXsfl_50_idx, GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))));
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
      AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV18FilterFullText ;
      AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV55TFLb_numero ;
      AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV56TFLb_numero_To ;
      AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV37TFCliCod ;
      AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV38TFCliCod_To ;
      AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV39TFLb_ArtCod ;
      AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV40TFLb_ArtCod_Sel ;
      AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV43TFLb_ColNomC ;
      AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV44TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV45TFLb_ColNum ;
      AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV79TFTipColCod ;
      AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV80TFTipColCod_To ;
      AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV61TFLb_Rb ;
      AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV62TFLb_Rb_To ;
      AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV59TFLb_opcion ;
      AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV60TFLb_opcion_Sel ;
      AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV57TFLb_numop ;
      AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV58TFLb_numop_To ;
      AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV41TFLb_Cartaz ;
      AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV42TFLb_Cartaz_Sel ;
      AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV49TFLb_FechaE ;
      AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV51TFLb_FechaEn ;
      AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV53TFLb_FechaR ;
      AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV47TFLb_Estado_Sels ;
      AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV91TFLb_RGB ;
      AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV92TFLb_RGB_To ;
      AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV93TFLb_CosteE ;
      AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV94TFLb_CosteE_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                           AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) ,
                                           AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                           AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                           AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                           AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) ,
                                           Byte.valueOf(AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) ,
                                           Byte.valueOf(AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) ,
                                           AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                           AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                           AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                           AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                           Byte.valueOf(AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) ,
                                           Byte.valueOf(AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) ,
                                           AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                           AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                           AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                           AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                           AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                           Integer.valueOf(AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels.size()) ,
                                           Long.valueOf(AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) ,
                                           Long.valueOf(AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) ,
                                           AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                           AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                           Integer.valueOf(AV5Clicod) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           Long.valueOf(A5599Lb_RGB) ,
                                           A5565Lb_CosteE ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV33OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV16Emprcod ,
                                           Integer.valueOf(AV27Lb_Numero) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod), 16, "%") ;
      lV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc), 13, "%") ;
      lV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = GXutil.padr( GXutil.rtrim( AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion), 1, "%") ;
      lV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz), 20, "%") ;
      /* Using cursor H01TT3 */
      pr_default.execute(1, new Object[] {AV16Emprcod, Integer.valueOf(AV27Lb_Numero), lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, Integer.valueOf(AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero), Integer.valueOf(AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to), Integer.valueOf(AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod), Integer.valueOf(AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to), lV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod, AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel, lV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc, AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum), Integer.valueOf(AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to), Byte.valueOf(AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod), Byte.valueOf(AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to), AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb, AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to, lV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion, AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel, Byte.valueOf(AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop), Byte.valueOf(AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to), lV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz, AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel, AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae, AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen, AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar, Long.valueOf(AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb), Long.valueOf(AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to), AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee, AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to, Integer.valueOf(AV5Clicod)});
      GRID_nRecordCount = H01TT3_AGRID_nRecordCount[0] ;
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
      AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV18FilterFullText ;
      AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV55TFLb_numero ;
      AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV56TFLb_numero_To ;
      AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV37TFCliCod ;
      AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV38TFCliCod_To ;
      AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV39TFLb_ArtCod ;
      AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV40TFLb_ArtCod_Sel ;
      AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV43TFLb_ColNomC ;
      AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV44TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV45TFLb_ColNum ;
      AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV79TFTipColCod ;
      AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV80TFTipColCod_To ;
      AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV61TFLb_Rb ;
      AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV62TFLb_Rb_To ;
      AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV59TFLb_opcion ;
      AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV60TFLb_opcion_Sel ;
      AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV57TFLb_numop ;
      AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV58TFLb_numop_To ;
      AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV41TFLb_Cartaz ;
      AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV42TFLb_Cartaz_Sel ;
      AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV49TFLb_FechaE ;
      AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV51TFLb_FechaEn ;
      AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV53TFLb_FechaR ;
      AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV47TFLb_Estado_Sels ;
      AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV91TFLb_RGB ;
      AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV92TFLb_RGB_To ;
      AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV93TFLb_CosteE ;
      AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV94TFLb_CosteE_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV16Emprcod, AV5Clicod, AV27Lb_Numero, AV29ManageFiltersExecutionStep, AV6ColumnsSelector, AV55TFLb_numero, AV56TFLb_numero_To, AV37TFCliCod, AV38TFCliCod_To, AV39TFLb_ArtCod, AV40TFLb_ArtCod_Sel, AV43TFLb_ColNomC, AV44TFLb_ColNomC_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV79TFTipColCod, AV80TFTipColCod_To, AV61TFLb_Rb, AV62TFLb_Rb_To, AV59TFLb_opcion, AV60TFLb_opcion_Sel, AV57TFLb_numop, AV58TFLb_numop_To, AV41TFLb_Cartaz, AV42TFLb_Cartaz_Sel, AV49TFLb_FechaE, AV51TFLb_FechaEn, AV53TFLb_FechaR, AV47TFLb_Estado_Sels, AV91TFLb_RGB, AV92TFLb_RGB_To, AV93TFLb_CosteE, AV94TFLb_CosteE_To, AV97Pgmname, AV31OrderedBy, AV33OrderedDsc, AV17F_Cformu, AV20ForUltUti, AV19ForNumCol, Gx_msg, AV68Col_Lb_numero, AV69Col_Lb_opcion, AV83Carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV18FilterFullText ;
      AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV55TFLb_numero ;
      AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV56TFLb_numero_To ;
      AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV37TFCliCod ;
      AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV38TFCliCod_To ;
      AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV39TFLb_ArtCod ;
      AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV40TFLb_ArtCod_Sel ;
      AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV43TFLb_ColNomC ;
      AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV44TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV45TFLb_ColNum ;
      AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV79TFTipColCod ;
      AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV80TFTipColCod_To ;
      AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV61TFLb_Rb ;
      AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV62TFLb_Rb_To ;
      AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV59TFLb_opcion ;
      AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV60TFLb_opcion_Sel ;
      AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV57TFLb_numop ;
      AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV58TFLb_numop_To ;
      AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV41TFLb_Cartaz ;
      AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV42TFLb_Cartaz_Sel ;
      AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV49TFLb_FechaE ;
      AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV51TFLb_FechaEn ;
      AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV53TFLb_FechaR ;
      AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV47TFLb_Estado_Sels ;
      AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV91TFLb_RGB ;
      AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV92TFLb_RGB_To ;
      AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV93TFLb_CosteE ;
      AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV94TFLb_CosteE_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV16Emprcod, AV5Clicod, AV27Lb_Numero, AV29ManageFiltersExecutionStep, AV6ColumnsSelector, AV55TFLb_numero, AV56TFLb_numero_To, AV37TFCliCod, AV38TFCliCod_To, AV39TFLb_ArtCod, AV40TFLb_ArtCod_Sel, AV43TFLb_ColNomC, AV44TFLb_ColNomC_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV79TFTipColCod, AV80TFTipColCod_To, AV61TFLb_Rb, AV62TFLb_Rb_To, AV59TFLb_opcion, AV60TFLb_opcion_Sel, AV57TFLb_numop, AV58TFLb_numop_To, AV41TFLb_Cartaz, AV42TFLb_Cartaz_Sel, AV49TFLb_FechaE, AV51TFLb_FechaEn, AV53TFLb_FechaR, AV47TFLb_Estado_Sels, AV91TFLb_RGB, AV92TFLb_RGB_To, AV93TFLb_CosteE, AV94TFLb_CosteE_To, AV97Pgmname, AV31OrderedBy, AV33OrderedDsc, AV17F_Cformu, AV20ForUltUti, AV19ForNumCol, Gx_msg, AV68Col_Lb_numero, AV69Col_Lb_opcion, AV83Carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV18FilterFullText ;
      AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV55TFLb_numero ;
      AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV56TFLb_numero_To ;
      AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV37TFCliCod ;
      AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV38TFCliCod_To ;
      AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV39TFLb_ArtCod ;
      AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV40TFLb_ArtCod_Sel ;
      AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV43TFLb_ColNomC ;
      AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV44TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV45TFLb_ColNum ;
      AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV79TFTipColCod ;
      AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV80TFTipColCod_To ;
      AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV61TFLb_Rb ;
      AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV62TFLb_Rb_To ;
      AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV59TFLb_opcion ;
      AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV60TFLb_opcion_Sel ;
      AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV57TFLb_numop ;
      AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV58TFLb_numop_To ;
      AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV41TFLb_Cartaz ;
      AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV42TFLb_Cartaz_Sel ;
      AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV49TFLb_FechaE ;
      AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV51TFLb_FechaEn ;
      AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV53TFLb_FechaR ;
      AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV47TFLb_Estado_Sels ;
      AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV91TFLb_RGB ;
      AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV92TFLb_RGB_To ;
      AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV93TFLb_CosteE ;
      AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV94TFLb_CosteE_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV16Emprcod, AV5Clicod, AV27Lb_Numero, AV29ManageFiltersExecutionStep, AV6ColumnsSelector, AV55TFLb_numero, AV56TFLb_numero_To, AV37TFCliCod, AV38TFCliCod_To, AV39TFLb_ArtCod, AV40TFLb_ArtCod_Sel, AV43TFLb_ColNomC, AV44TFLb_ColNomC_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV79TFTipColCod, AV80TFTipColCod_To, AV61TFLb_Rb, AV62TFLb_Rb_To, AV59TFLb_opcion, AV60TFLb_opcion_Sel, AV57TFLb_numop, AV58TFLb_numop_To, AV41TFLb_Cartaz, AV42TFLb_Cartaz_Sel, AV49TFLb_FechaE, AV51TFLb_FechaEn, AV53TFLb_FechaR, AV47TFLb_Estado_Sels, AV91TFLb_RGB, AV92TFLb_RGB_To, AV93TFLb_CosteE, AV94TFLb_CosteE_To, AV97Pgmname, AV31OrderedBy, AV33OrderedDsc, AV17F_Cformu, AV20ForUltUti, AV19ForNumCol, Gx_msg, AV68Col_Lb_numero, AV69Col_Lb_opcion, AV83Carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV18FilterFullText ;
      AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV55TFLb_numero ;
      AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV56TFLb_numero_To ;
      AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV37TFCliCod ;
      AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV38TFCliCod_To ;
      AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV39TFLb_ArtCod ;
      AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV40TFLb_ArtCod_Sel ;
      AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV43TFLb_ColNomC ;
      AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV44TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV45TFLb_ColNum ;
      AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV79TFTipColCod ;
      AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV80TFTipColCod_To ;
      AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV61TFLb_Rb ;
      AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV62TFLb_Rb_To ;
      AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV59TFLb_opcion ;
      AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV60TFLb_opcion_Sel ;
      AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV57TFLb_numop ;
      AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV58TFLb_numop_To ;
      AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV41TFLb_Cartaz ;
      AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV42TFLb_Cartaz_Sel ;
      AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV49TFLb_FechaE ;
      AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV51TFLb_FechaEn ;
      AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV53TFLb_FechaR ;
      AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV47TFLb_Estado_Sels ;
      AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV91TFLb_RGB ;
      AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV92TFLb_RGB_To ;
      AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV93TFLb_CosteE ;
      AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV94TFLb_CosteE_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV16Emprcod, AV5Clicod, AV27Lb_Numero, AV29ManageFiltersExecutionStep, AV6ColumnsSelector, AV55TFLb_numero, AV56TFLb_numero_To, AV37TFCliCod, AV38TFCliCod_To, AV39TFLb_ArtCod, AV40TFLb_ArtCod_Sel, AV43TFLb_ColNomC, AV44TFLb_ColNomC_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV79TFTipColCod, AV80TFTipColCod_To, AV61TFLb_Rb, AV62TFLb_Rb_To, AV59TFLb_opcion, AV60TFLb_opcion_Sel, AV57TFLb_numop, AV58TFLb_numop_To, AV41TFLb_Cartaz, AV42TFLb_Cartaz_Sel, AV49TFLb_FechaE, AV51TFLb_FechaEn, AV53TFLb_FechaR, AV47TFLb_Estado_Sels, AV91TFLb_RGB, AV92TFLb_RGB_To, AV93TFLb_CosteE, AV94TFLb_CosteE_To, AV97Pgmname, AV31OrderedBy, AV33OrderedDsc, AV17F_Cformu, AV20ForUltUti, AV19ForNumCol, Gx_msg, AV68Col_Lb_numero, AV69Col_Lb_opcion, AV83Carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV18FilterFullText ;
      AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV55TFLb_numero ;
      AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV56TFLb_numero_To ;
      AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV37TFCliCod ;
      AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV38TFCliCod_To ;
      AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV39TFLb_ArtCod ;
      AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV40TFLb_ArtCod_Sel ;
      AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV43TFLb_ColNomC ;
      AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV44TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV45TFLb_ColNum ;
      AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV79TFTipColCod ;
      AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV80TFTipColCod_To ;
      AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV61TFLb_Rb ;
      AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV62TFLb_Rb_To ;
      AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV59TFLb_opcion ;
      AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV60TFLb_opcion_Sel ;
      AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV57TFLb_numop ;
      AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV58TFLb_numop_To ;
      AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV41TFLb_Cartaz ;
      AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV42TFLb_Cartaz_Sel ;
      AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV49TFLb_FechaE ;
      AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV51TFLb_FechaEn ;
      AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV53TFLb_FechaR ;
      AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV47TFLb_Estado_Sels ;
      AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV91TFLb_RGB ;
      AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV92TFLb_RGB_To ;
      AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV93TFLb_CosteE ;
      AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV94TFLb_CosteE_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV16Emprcod, AV5Clicod, AV27Lb_Numero, AV29ManageFiltersExecutionStep, AV6ColumnsSelector, AV55TFLb_numero, AV56TFLb_numero_To, AV37TFCliCod, AV38TFCliCod_To, AV39TFLb_ArtCod, AV40TFLb_ArtCod_Sel, AV43TFLb_ColNomC, AV44TFLb_ColNomC_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV79TFTipColCod, AV80TFTipColCod_To, AV61TFLb_Rb, AV62TFLb_Rb_To, AV59TFLb_opcion, AV60TFLb_opcion_Sel, AV57TFLb_numop, AV58TFLb_numop_To, AV41TFLb_Cartaz, AV42TFLb_Cartaz_Sel, AV49TFLb_FechaE, AV51TFLb_FechaEn, AV53TFLb_FechaR, AV47TFLb_Estado_Sels, AV91TFLb_RGB, AV92TFLb_RGB_To, AV93TFLb_CosteE, AV94TFLb_CosteE_To, AV97Pgmname, AV31OrderedBy, AV33OrderedDsc, AV17F_Cformu, AV20ForUltUti, AV19ForNumCol, Gx_msg, AV68Col_Lb_numero, AV69Col_Lb_opcion, AV83Carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV97Pgmname = "GestionLaboratorio.ActualizacionEnsayoenColorteca_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
      Gx_err = (short)(0) ;
      edtavF_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavF_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_cformu_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavFornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1TT0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191TT2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV28ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV15DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV6ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_OPCION"), AV69Col_Lb_opcion);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_NUMERO"), AV68Col_Lb_numero);
         /* Read saved values. */
         nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV21GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV22GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV16Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV16Emprcod") ;
         wcpOAV5Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV27Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV70i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV18FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
         AV97Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaeauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAEAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaeauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9DDO_Lb_FechaEAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9DDO_Lb_FechaEAuxDate", localUtil.format(AV9DDO_Lb_FechaEAuxDate, "99/99/99"));
         }
         else
         {
            AV9DDO_Lb_FechaEAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaeauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9DDO_Lb_FechaEAuxDate", localUtil.format(AV9DDO_Lb_FechaEAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAENAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11DDO_Lb_FechaEnAuxDate", localUtil.format(AV11DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         else
         {
            AV11DDO_Lb_FechaEnAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11DDO_Lb_FechaEnAuxDate", localUtil.format(AV11DDO_Lb_FechaEnAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHARAUXDATE");
            GX_FocusControl = edtavDdo_lb_fecharauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13DDO_Lb_FechaRAuxDate", localUtil.format(AV13DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         else
         {
            AV13DDO_Lb_FechaRAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fecharauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13DDO_Lb_FechaRAuxDate", localUtil.format(AV13DDO_Lb_FechaRAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ActualizacionEnsayoenColorteca_WC");
         AV97Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\actualizacionensayoencolorteca_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV18FilterFullText) != 0 )
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
      e191TT2 ();
      if (returnInSub) return;
   }

   public void e191TT2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV98Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      actualizacionensayoencolorteca_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV98Station = GXt_char1 ;
      GXv_char2[0] = AV16Emprcod ;
      GXv_char3[0] = AV99Emprnom ;
      GXv_char4[0] = AV100Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV98Station, GXv_char2, GXv_char3, GXv_char4) ;
      actualizacionensayoencolorteca_wc_impl.this.AV16Emprcod = GXv_char2[0] ;
      actualizacionensayoencolorteca_wc_impl.this.AV99Emprnom = GXv_char3[0] ;
      actualizacionensayoencolorteca_wc_impl.this.AV100Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
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
      if ( AV31OrderedBy < 1 )
      {
         AV31OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV15DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV15DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201TT2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV66WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV66WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV29ManageFiltersExecutionStep == 1 )
      {
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV29ManageFiltersExecutionStep == 2 )
      {
         AV29ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV36Session.getValue("GestionLaboratorio.ActualizacionEnsayoenColorteca_WCColumnsSelector"), "") != 0 )
      {
         AV8ColumnsSelectorXML = AV36Session.getValue("GestionLaboratorio.ActualizacionEnsayoenColorteca_WCColumnsSelector") ;
         AV6ColumnsSelector.fromxml(AV8ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_ArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtCod_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_ColNomC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNomC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNomC_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_ColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNum_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtTipColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_Rb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Rb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Rb_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_opcion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_opcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_numop_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numop_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numop_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_Cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Cartaz_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_FechaE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaE_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_FechaEn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaEn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaEn_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_FechaR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaR_Visible), 5, 0), !bGXsfl_50_Refreshing);
      cmbLb_Estado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Visible", GXutil.ltrimstr( cmbLb_Estado.getVisible(), 5, 0), !bGXsfl_50_Refreshing);
      edtavF_cformu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavF_cformu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_cformu_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtavFornumcol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFornumcol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_RGB_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_RGB_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_RGB_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtLb_CosteE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_CosteE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_CosteE_Visible), 5, 0), !bGXsfl_50_Refreshing);
      AV21GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridCurrentPage), 10, 0));
      AV22GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GridPageCount), 10, 0));
      AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV18FilterFullText ;
      AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV55TFLb_numero ;
      AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV56TFLb_numero_To ;
      AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV37TFCliCod ;
      AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV38TFCliCod_To ;
      AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV39TFLb_ArtCod ;
      AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV40TFLb_ArtCod_Sel ;
      AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV43TFLb_ColNomC ;
      AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV44TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV45TFLb_ColNum ;
      AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV79TFTipColCod ;
      AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV80TFTipColCod_To ;
      AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV61TFLb_Rb ;
      AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV62TFLb_Rb_To ;
      AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV59TFLb_opcion ;
      AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV60TFLb_opcion_Sel ;
      AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV57TFLb_numop ;
      AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV58TFLb_numop_To ;
      AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV41TFLb_Cartaz ;
      AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV42TFLb_Cartaz_Sel ;
      AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV49TFLb_FechaE ;
      AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV51TFLb_FechaEn ;
      AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV53TFLb_FechaR ;
      AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV47TFLb_Estado_Sels ;
      AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV91TFLb_RGB ;
      AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV92TFLb_RGB_To ;
      AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV93TFLb_CosteE ;
      AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV94TFLb_CosteE_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23GridState", AV23GridState);
   }

   public void e131TT2( )
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
         AV34PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV34PageToGo) ;
      }
   }

   public void e141TT2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e151TT2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV31OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
         AV33OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33OrderedDsc", AV33OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numero") == 0 )
         {
            AV55TFLb_numero = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFLb_numero), 8, 0));
            AV56TFLb_numero_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV37TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod), 6, 0));
            AV38TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ArtCod") == 0 )
         {
            AV39TFLb_ArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFLb_ArtCod", AV39TFLb_ArtCod);
            AV40TFLb_ArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFLb_ArtCod_Sel", AV40TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNomC") == 0 )
         {
            AV43TFLb_ColNomC = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFLb_ColNomC", AV43TFLb_ColNomC);
            AV44TFLb_ColNomC_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFLb_ColNomC_Sel", AV44TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNum") == 0 )
         {
            AV45TFLb_ColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_ColNum), 6, 0));
            AV46TFLb_ColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV79TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFTipColCod), 2, 0));
            AV80TFTipColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Rb") == 0 )
         {
            AV61TFLb_Rb = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFLb_Rb", GXutil.ltrimstr( AV61TFLb_Rb, 7, 2));
            AV62TFLb_Rb_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_Rb_To", GXutil.ltrimstr( AV62TFLb_Rb_To, 7, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_opcion") == 0 )
         {
            AV59TFLb_opcion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFLb_opcion", AV59TFLb_opcion);
            AV60TFLb_opcion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFLb_opcion_Sel", AV60TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numop") == 0 )
         {
            AV57TFLb_numop = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFLb_numop), 2, 0));
            AV58TFLb_numop_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFLb_numop_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Cartaz") == 0 )
         {
            AV41TFLb_Cartaz = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFLb_Cartaz", AV41TFLb_Cartaz);
            AV42TFLb_Cartaz_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFLb_Cartaz_Sel", AV42TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaE") == 0 )
         {
            AV49TFLb_FechaE = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFLb_FechaE", localUtil.format(AV49TFLb_FechaE, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaEn") == 0 )
         {
            AV51TFLb_FechaEn = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFLb_FechaEn", localUtil.format(AV51TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaR") == 0 )
         {
            AV53TFLb_FechaR = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFLb_FechaR", localUtil.format(AV53TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Estado") == 0 )
         {
            AV48TFLb_Estado_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFLb_Estado_SelsJson", AV48TFLb_Estado_SelsJson);
            AV47TFLb_Estado_Sels.fromJSonString(GXutil.strReplace( AV48TFLb_Estado_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_RGB") == 0 )
         {
            AV91TFLb_RGB = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_RGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFLb_RGB), 10, 0));
            AV92TFLb_RGB_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFLb_RGB_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFLb_RGB_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_CosteE") == 0 )
         {
            AV93TFLb_CosteE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFLb_CosteE", GXutil.ltrimstr( AV93TFLb_CosteE, 11, 5));
            AV94TFLb_CosteE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFLb_CosteE_To", GXutil.ltrimstr( AV94TFLb_CosteE_To, 11, 5));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47TFLb_Estado_Sels", AV47TFLb_Estado_Sels);
   }

   private void e211TT2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A252CliCod ;
      GXv_char3[0] = A5533Lb_ArtCod ;
      GXv_char2[0] = A5536Lb_ColNom ;
      GXv_int9[0] = A5537Lb_ColNum ;
      GXv_int10[0] = A831TipColCod ;
      GXv_int11[0] = (byte)(AV17F_Cformu) ;
      GXv_date12[0] = AV20ForUltUti ;
      GXv_int13[0] = AV19ForNumCol ;
      GXv_char14[0] = Gx_msg ;
      new app.pens011(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_int9, GXv_int10, GXv_int11, GXv_date12, GXv_int13, GXv_char14) ;
      actualizacionensayoencolorteca_wc_impl.this.A396EmprCod = GXv_char4[0] ;
      actualizacionensayoencolorteca_wc_impl.this.A252CliCod = GXv_int8[0] ;
      actualizacionensayoencolorteca_wc_impl.this.A5533Lb_ArtCod = GXv_char3[0] ;
      actualizacionensayoencolorteca_wc_impl.this.A5536Lb_ColNom = GXv_char2[0] ;
      actualizacionensayoencolorteca_wc_impl.this.A5537Lb_ColNum = GXv_int9[0] ;
      actualizacionensayoencolorteca_wc_impl.this.A831TipColCod = GXv_int10[0] ;
      actualizacionensayoencolorteca_wc_impl.this.AV17F_Cformu = GXv_int11[0] ;
      actualizacionensayoencolorteca_wc_impl.this.AV20ForUltUti = GXv_date12[0] ;
      actualizacionensayoencolorteca_wc_impl.this.AV19ForNumCol = GXv_int13[0] ;
      actualizacionensayoencolorteca_wc_impl.this.Gx_msg = GXv_char14[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5536Lb_ColNom", A5536Lb_ColNom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17F_Cformu), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20ForUltUti", localUtil.format(AV20ForUltUti, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORULTUTI", getSecureSignedToken( sPrefix, AV20ForUltUti));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ForNumCol), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_msg", Gx_msg);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMSG", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      AV35Seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV35Seleccionar);
      AV70i = (short)(1) ;
      while ( AV70i <= AV68Col_Lb_numero.size() )
      {
         if ( ( ((Number) AV68Col_Lb_numero.elementAt(-1+AV70i)).intValue() == A5532Lb_numero ) && ( GXutil.strcmp((String)AV69Col_Lb_opcion.elementAt(-1+AV70i), A5555Lb_opcion) == 0 ) )
         {
            AV35Seleccionar = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV35Seleccionar);
            if (true) break;
         }
         AV70i = (short)(AV70i+1) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(50) ;
      }
      sendrow_502( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_50_Refreshing )
      {
         httpContext.doAjaxLoad(50, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e161TT2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV8ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV6ColumnsSelector.fromJSonString(AV8ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.ActualizacionEnsayoenColorteca_WCColumnsSelector", ((GXutil.strcmp("", AV8ColumnsSelectorXML)==0) ? "" : AV6ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23GridState", AV23GridState);
   }

   public void e121TT2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.ActualizacionEnsayoenColorteca_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV97Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.ActualizacionEnsayoenColorteca_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV30ManageFiltersXml ;
         GXv_char14[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.ActualizacionEnsayoenColorteca_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char14) ;
         actualizacionensayoencolorteca_wc_impl.this.GXt_char1 = GXv_char14[0] ;
         AV30ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV30ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV30ManageFiltersXml) ;
            AV23GridState.fromxml(AV30ManageFiltersXml, null, null);
            AV31OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
            AV33OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33OrderedDsc", AV33OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23GridState", AV23GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47TFLb_Estado_Sels", AV47TFLb_Estado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
   }

   public void e181TT2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      AV70i = (short)(1) ;
      while ( AV70i <= AV68Col_Lb_numero.size() )
      {
         AV77F_CformuGrid = AV17F_Cformu ;
         AV73Clinom = A279CliNom ;
         AV75Lb_colnomc = A5538Lb_ColNomC ;
         AV76Lb_colnum = A5537Lb_ColNum ;
         AV78Tipcolcod = A831TipColCod ;
         AV81ForNumColGrid = AV19ForNumCol ;
         AV70i = (short)(AV70i+1) ;
      }
      if ( (0==AV68Col_Lb_numero.size()) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO ha selecciona ninguna linea¡", ""));
      }
      else
      {
         if ( AV68Col_Lb_numero.size() > 1 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo puede haber una opcion del Nº de Ensayo", ""));
         }
         else
         {
            if ( AV77F_CformuGrid == 0 )
            {
               Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.getMessage( "Este Nº Ensayo, NO existe en Colorteca.", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_confirmar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
               Dvelop_confirmpanel_confirmar_Confirmationtext = Dvelop_confirmpanel_confirmar_Confirmationtext+httpContext.getMessage( "Desea crear el COLOR:", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_confirmar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
               Dvelop_confirmpanel_confirmar_Confirmationtext = Dvelop_confirmpanel_confirmar_Confirmationtext+httpContext.getMessage( "Cliente ", "")+GXutil.trim( AV73Clinom)+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_confirmar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
               Dvelop_confirmpanel_confirmar_Confirmationtext = Dvelop_confirmpanel_confirmar_Confirmationtext+httpContext.getMessage( "Color ", "")+GXutil.trim( AV75Lb_colnomc)+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_confirmar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
               Dvelop_confirmpanel_confirmar_Confirmationtext = Dvelop_confirmpanel_confirmar_Confirmationtext+httpContext.getMessage( "Numero ", "")+GXutil.trim( GXutil.str( AV76Lb_colnum, 6, 0))+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_confirmar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
               Dvelop_confirmpanel_confirmar_Confirmationtext = Dvelop_confirmpanel_confirmar_Confirmationtext+httpContext.getMessage( "Numero ", "")+GXutil.trim( GXutil.str( AV78Tipcolcod, 2, 0))+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_confirmar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
               Dvelop_confirmpanel_confirmar_Confirmationtext = Dvelop_confirmpanel_confirmar_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
               ucDvelop_confirmpanel_confirmar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
            }
            else
            {
               GXv_char14[0] = AV16Emprcod ;
               GXv_int13[0] = AV19ForNumCol ;
               GXv_int9[0] = AV82Numform ;
               new app.pfornumcol(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_int9) ;
               actualizacionensayoencolorteca_wc_impl.this.AV16Emprcod = GXv_char14[0] ;
               actualizacionensayoencolorteca_wc_impl.this.AV19ForNumCol = GXv_int13[0] ;
               actualizacionensayoencolorteca_wc_impl.this.AV82Numform = (short)((short)(GXv_int9[0])) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFornumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ForNumCol), 8, 0));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82Numform", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82Numform), 4, 0));
               Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.getMessage( "Este Nº Ensayo, EXISTE en Colorteca.", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_confirmar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
               Dvelop_confirmpanel_confirmar_Confirmationtext = Dvelop_confirmpanel_confirmar_Confirmationtext+httpContext.getMessage( "Se eliminaran: COLORANTES y PRODUCTOS(#)", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_confirmar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
               Dvelop_confirmpanel_confirmar_Confirmationtext = Dvelop_confirmpanel_confirmar_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
               ucDvelop_confirmpanel_confirmar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
            }
            this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_CONFIRMARContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e171TT2( )
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
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV31OrderedBy, 4, 0))+":"+(AV33OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV6ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&Seleccionar", "", "", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliCod", "", "Cliente", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_ColNum", "", "Numero", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "TipColCod", "", "TC", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_Rb", "", "Rb", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_opcion", "", "Opcion", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_numop", "", "Nº", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_FechaE", "Fecha", "Entrada", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_FechaEn", "Fecha", "Envio", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_FechaR", "Fecha", "Recepcion", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_Estado", "", "Estado", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&F_Cformu", "", "Cformu", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&ForNumCol", "", "Nº Formula", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_RGB", "", "RGB", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Lb_CosteE", "", "Coste", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXt_char1 = AV65UserCustomValue ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.ActualizacionEnsayoenColorteca_WCColumnsSelector", GXv_char14) ;
      actualizacionensayoencolorteca_wc_impl.this.GXt_char1 = GXv_char14[0] ;
      AV65UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV65UserCustomValue)==0) ) )
      {
         AV7ColumnsSelectorAux.fromxml(AV65UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector15[0] = AV7ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector16[0] = AV6ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, GXv_SdtWWPColumnsSelector16) ;
         AV7ColumnsSelectorAux = GXv_SdtWWPColumnsSelector15[0] ;
         AV6ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = AV28ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.ActualizacionEnsayoenColorteca_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[0] ;
      AV28ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV18FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
      AV55TFLb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFLb_numero), 8, 0));
      AV56TFLb_numero_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFLb_numero_To), 8, 0));
      AV37TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod), 6, 0));
      AV38TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod_To), 6, 0));
      AV39TFLb_ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFLb_ArtCod", AV39TFLb_ArtCod);
      AV40TFLb_ArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFLb_ArtCod_Sel", AV40TFLb_ArtCod_Sel);
      AV43TFLb_ColNomC = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFLb_ColNomC", AV43TFLb_ColNomC);
      AV44TFLb_ColNomC_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFLb_ColNomC_Sel", AV44TFLb_ColNomC_Sel);
      AV45TFLb_ColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_ColNum), 6, 0));
      AV46TFLb_ColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFLb_ColNum_To), 6, 0));
      AV79TFTipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFTipColCod), 2, 0));
      AV80TFTipColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFTipColCod_To), 2, 0));
      AV61TFLb_Rb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFLb_Rb", GXutil.ltrimstr( AV61TFLb_Rb, 7, 2));
      AV62TFLb_Rb_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_Rb_To", GXutil.ltrimstr( AV62TFLb_Rb_To, 7, 2));
      AV59TFLb_opcion = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFLb_opcion", AV59TFLb_opcion);
      AV60TFLb_opcion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFLb_opcion_Sel", AV60TFLb_opcion_Sel);
      AV57TFLb_numop = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFLb_numop), 2, 0));
      AV58TFLb_numop_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFLb_numop_To), 2, 0));
      AV41TFLb_Cartaz = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFLb_Cartaz", AV41TFLb_Cartaz);
      AV42TFLb_Cartaz_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFLb_Cartaz_Sel", AV42TFLb_Cartaz_Sel);
      AV49TFLb_FechaE = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFLb_FechaE", localUtil.format(AV49TFLb_FechaE, "99/99/99"));
      AV51TFLb_FechaEn = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFLb_FechaEn", localUtil.format(AV51TFLb_FechaEn, "99/99/99"));
      AV53TFLb_FechaR = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFLb_FechaR", localUtil.format(AV53TFLb_FechaR, "99/99/99"));
      AV47TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV91TFLb_RGB = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_RGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFLb_RGB), 10, 0));
      AV92TFLb_RGB_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFLb_RGB_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFLb_RGB_To), 10, 0));
      AV93TFLb_CosteE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFLb_CosteE", GXutil.ltrimstr( AV93TFLb_CosteE, 11, 5));
      AV94TFLb_CosteE_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFLb_CosteE_To", GXutil.ltrimstr( AV94TFLb_CosteE_To, 11, 5));
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
      AV70i = (short)(1) ;
      while ( AV70i <= AV68Col_Lb_numero.size() )
      {
         AV71IN_Lb_numero = ((Number) AV68Col_Lb_numero.elementAt(-1+AV70i)).intValue() ;
         AV72IN_Lb_opcion = (String)AV69Col_Lb_opcion.elementAt(-1+AV70i) ;
         AV87F_ldform = (short)(0) ;
         AV88F_lprfor = (short)(0) ;
         AV89Num_color = GXutil.trim( GXutil.str( A5537Lb_ColNum, 6, 0)) + GXutil.trim( GXutil.str( A5718Lb_numop, 2, 0)) ;
         AV90N_color = (int)(GXutil.lval( GXutil.substring( AV89Num_color, 1, 6))) ;
         AV90N_color = A5537Lb_ColNum ;
         AV84Lb_colnom = ((AV83Carvitin==1) ? GXutil.trim( A5536Lb_ColNom)+"/"+GXutil.trim( GXutil.str( A5718Lb_numop, 2, 0)) : GXutil.trim( A5536Lb_ColNom)) ;
         GXv_char14[0] = AV16Emprcod ;
         GXv_int13[0] = AV71IN_Lb_numero ;
         GXv_char4[0] = AV84Lb_colnom ;
         GXv_int9[0] = A5537Lb_ColNum ;
         new app.pens09c(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_char4, GXv_int9) ;
         actualizacionensayoencolorteca_wc_impl.this.AV16Emprcod = GXv_char14[0] ;
         actualizacionensayoencolorteca_wc_impl.this.AV71IN_Lb_numero = GXv_int13[0] ;
         actualizacionensayoencolorteca_wc_impl.this.AV84Lb_colnom = GXv_char4[0] ;
         actualizacionensayoencolorteca_wc_impl.this.A5537Lb_ColNum = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
         GXv_char14[0] = AV16Emprcod ;
         GXv_int13[0] = AV71IN_Lb_numero ;
         GXv_char4[0] = AV72IN_Lb_opcion ;
         GXv_date12[0] = A5563Lb_FechaR ;
         GXv_decimal19[0] = A5565Lb_CosteE ;
         GXv_int20[0] = A5599Lb_RGB ;
         GXv_int11[0] = (byte)(AV17F_Cformu) ;
         GXv_int10[0] = (byte)(AV87F_ldform) ;
         GXv_int21[0] = (byte)(AV88F_lprfor) ;
         GXv_int9[0] = AV90N_color ;
         GXv_char3[0] = httpContext.getMessage( "N", "") ;
         new app.gestionlaboratorio.pens009(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_char4, GXv_date12, GXv_decimal19, GXv_int20, GXv_int11, GXv_int10, GXv_int21, GXv_int9, GXv_char3) ;
         actualizacionensayoencolorteca_wc_impl.this.AV16Emprcod = GXv_char14[0] ;
         actualizacionensayoencolorteca_wc_impl.this.AV71IN_Lb_numero = GXv_int13[0] ;
         actualizacionensayoencolorteca_wc_impl.this.AV72IN_Lb_opcion = GXv_char4[0] ;
         actualizacionensayoencolorteca_wc_impl.this.A5563Lb_FechaR = GXv_date12[0] ;
         actualizacionensayoencolorteca_wc_impl.this.A5565Lb_CosteE = GXv_decimal19[0] ;
         actualizacionensayoencolorteca_wc_impl.this.A5599Lb_RGB = GXv_int20[0] ;
         actualizacionensayoencolorteca_wc_impl.this.AV17F_Cformu = GXv_int11[0] ;
         actualizacionensayoencolorteca_wc_impl.this.AV87F_ldform = GXv_int10[0] ;
         actualizacionensayoencolorteca_wc_impl.this.AV88F_lprfor = GXv_int21[0] ;
         actualizacionensayoencolorteca_wc_impl.this.AV90N_color = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavF_cformu_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17F_Cformu), 4, 0));
         AV70i = (short)(AV70i+1) ;
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue(AV97Pgmname+"GridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV97Pgmname+"GridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV36Session.getValue(AV97Pgmname+"GridState"), null, null);
      }
      AV31OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
      AV33OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33OrderedDsc", AV33OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV23GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV23GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV23GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV131GXV1 = 1 ;
      while ( AV131GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV131GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18FilterFullText", AV18FilterFullText);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV55TFLb_numero = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFLb_numero), 8, 0));
            AV56TFLb_numero_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV37TFCliCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod), 6, 0));
            AV38TFCliCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV39TFLb_ArtCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFLb_ArtCod", AV39TFLb_ArtCod);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV40TFLb_ArtCod_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFLb_ArtCod_Sel", AV40TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV43TFLb_ColNomC = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFLb_ColNomC", AV43TFLb_ColNomC);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV44TFLb_ColNomC_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFLb_ColNomC_Sel", AV44TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV45TFLb_ColNum = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_ColNum), 6, 0));
            AV46TFLb_ColNum_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV79TFTipColCod = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFTipColCod), 2, 0));
            AV80TFTipColCod_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV61TFLb_Rb = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFLb_Rb", GXutil.ltrimstr( AV61TFLb_Rb, 7, 2));
            AV62TFLb_Rb_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_Rb_To", GXutil.ltrimstr( AV62TFLb_Rb_To, 7, 2));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV59TFLb_opcion = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFLb_opcion", AV59TFLb_opcion);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV60TFLb_opcion_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFLb_opcion_Sel", AV60TFLb_opcion_Sel);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV57TFLb_numop = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFLb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFLb_numop), 2, 0));
            AV58TFLb_numop_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFLb_numop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFLb_numop_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV41TFLb_Cartaz = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFLb_Cartaz", AV41TFLb_Cartaz);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV42TFLb_Cartaz_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFLb_Cartaz_Sel", AV42TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV49TFLb_FechaE = localUtil.ctod( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFLb_FechaE", localUtil.format(AV49TFLb_FechaE, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV51TFLb_FechaEn = localUtil.ctod( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFLb_FechaEn", localUtil.format(AV51TFLb_FechaEn, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV53TFLb_FechaR = localUtil.ctod( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFLb_FechaR", localUtil.format(AV53TFLb_FechaR, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV48TFLb_Estado_SelsJson = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFLb_Estado_SelsJson", AV48TFLb_Estado_SelsJson);
            AV47TFLb_Estado_Sels.fromJSonString(AV48TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RGB") == 0 )
         {
            AV91TFLb_RGB = GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFLb_RGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFLb_RGB), 10, 0));
            AV92TFLb_RGB_To = GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFLb_RGB_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFLb_RGB_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COSTEE") == 0 )
         {
            AV93TFLb_CosteE = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFLb_CosteE", GXutil.ltrimstr( AV93TFLb_CosteE, 11, 5));
            AV94TFLb_CosteE_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFLb_CosteE_To", GXutil.ltrimstr( AV94TFLb_CosteE_To, 11, 5));
         }
         AV131GXV1 = (int)(AV131GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFLb_ArtCod_Sel)==0), AV40TFLb_ArtCod_Sel, GXv_char14) ;
      actualizacionensayoencolorteca_wc_impl.this.GXt_char1 = GXv_char14[0] ;
      GXt_char22 = "" ;
      GXv_char4[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFLb_ColNomC_Sel)==0), AV44TFLb_ColNomC_Sel, GXv_char4) ;
      actualizacionensayoencolorteca_wc_impl.this.GXt_char22 = GXv_char4[0] ;
      GXt_char23 = "" ;
      GXv_char3[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFLb_opcion_Sel)==0), AV60TFLb_opcion_Sel, GXv_char3) ;
      actualizacionensayoencolorteca_wc_impl.this.GXt_char23 = GXv_char3[0] ;
      GXt_char24 = "" ;
      GXv_char2[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFLb_Cartaz_Sel)==0), AV42TFLb_Cartaz_Sel, GXv_char2) ;
      actualizacionensayoencolorteca_wc_impl.this.GXt_char24 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char22+"||||"+GXt_char23+"||"+GXt_char24+"||||"+((AV47TFLb_Estado_Sels.size()==0) ? "" : AV48TFLb_Estado_SelsJson)+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char24 = "" ;
      GXv_char14[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFLb_ArtCod)==0), AV39TFLb_ArtCod, GXv_char14) ;
      actualizacionensayoencolorteca_wc_impl.this.GXt_char24 = GXv_char14[0] ;
      GXt_char23 = "" ;
      GXv_char4[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFLb_ColNomC)==0), AV43TFLb_ColNomC, GXv_char4) ;
      actualizacionensayoencolorteca_wc_impl.this.GXt_char23 = GXv_char4[0] ;
      GXt_char22 = "" ;
      GXv_char3[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFLb_opcion)==0), AV59TFLb_opcion, GXv_char3) ;
      actualizacionensayoencolorteca_wc_impl.this.GXt_char22 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFLb_Cartaz)==0), AV41TFLb_Cartaz, GXv_char2) ;
      actualizacionensayoencolorteca_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV55TFLb_numero) ? "" : GXutil.str( AV55TFLb_numero, 8, 0))+"|"+((0==AV37TFCliCod) ? "" : GXutil.str( AV37TFCliCod, 6, 0))+"|"+GXt_char24+"|"+GXt_char23+"|"+((0==AV45TFLb_ColNum) ? "" : GXutil.str( AV45TFLb_ColNum, 6, 0))+"|"+((0==AV79TFTipColCod) ? "" : GXutil.str( AV79TFTipColCod, 2, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFLb_Rb)==0) ? "" : GXutil.str( AV61TFLb_Rb, 7, 2))+"|"+GXt_char22+"|"+((0==AV57TFLb_numop) ? "" : GXutil.str( AV57TFLb_numop, 2, 0))+"|"+GXt_char1+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFLb_FechaE)) ? "" : localUtil.dtoc( AV49TFLb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51TFLb_FechaEn)) ? "" : localUtil.dtoc( AV51TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFLb_FechaR)) ? "" : localUtil.dtoc( AV53TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||||"+((0==AV91TFLb_RGB) ? "" : GXutil.str( AV91TFLb_RGB, 10, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFLb_CosteE)==0) ? "" : GXutil.str( AV93TFLb_CosteE, 11, 5)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV56TFLb_numero_To) ? "" : GXutil.str( AV56TFLb_numero_To, 8, 0))+"|"+((0==AV38TFCliCod_To) ? "" : GXutil.str( AV38TFCliCod_To, 6, 0))+"|||"+((0==AV46TFLb_ColNum_To) ? "" : GXutil.str( AV46TFLb_ColNum_To, 6, 0))+"|"+((0==AV80TFTipColCod_To) ? "" : GXutil.str( AV80TFTipColCod_To, 2, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFLb_Rb_To)==0) ? "" : GXutil.str( AV62TFLb_Rb_To, 7, 2))+"||"+((0==AV58TFLb_numop_To) ? "" : GXutil.str( AV58TFLb_numop_To, 2, 0))+"||||||||"+((0==AV92TFLb_RGB_To) ? "" : GXutil.str( AV92TFLb_RGB_To, 10, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV94TFLb_CosteE_To)==0) ? "" : GXutil.str( AV94TFLb_CosteE_To, 11, 5)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV23GridState.fromxml(AV36Session.getValue(AV97Pgmname+"GridState"), null, null);
      AV23GridState.setgxTv_SdtWWPGridState_Orderedby( AV31OrderedBy );
      AV23GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV33OrderedDsc );
      AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV18FilterFullText)==0), (short)(0), AV18FilterFullText, "") ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_NUMERO", "", !((0==AV55TFLb_numero)&&(0==AV56TFLb_numero_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFLb_numero, 8, 0)), GXutil.trim( GXutil.str( AV56TFLb_numero_To, 8, 0))) ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFCLICOD", "", !((0==AV37TFCliCod)&&(0==AV38TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV37TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV38TFCliCod_To, 6, 0))) ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_ARTCOD", "", !(GXutil.strcmp("", AV39TFLb_ArtCod)==0), (short)(0), AV39TFLb_ArtCod, "", !(GXutil.strcmp("", AV40TFLb_ArtCod_Sel)==0), AV40TFLb_ArtCod_Sel, "") ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_COLNOMC", "", !(GXutil.strcmp("", AV43TFLb_ColNomC)==0), (short)(0), AV43TFLb_ColNomC, "", !(GXutil.strcmp("", AV44TFLb_ColNomC_Sel)==0), AV44TFLb_ColNomC_Sel, "") ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_COLNUM", "", !((0==AV45TFLb_ColNum)&&(0==AV46TFLb_ColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV45TFLb_ColNum, 6, 0)), GXutil.trim( GXutil.str( AV46TFLb_ColNum_To, 6, 0))) ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFTIPCOLCOD", "", !((0==AV79TFTipColCod)&&(0==AV80TFTipColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV79TFTipColCod, 2, 0)), GXutil.trim( GXutil.str( AV80TFTipColCod_To, 2, 0))) ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_RB", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFLb_Rb)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFLb_Rb_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV61TFLb_Rb, 7, 2)), GXutil.trim( GXutil.str( AV62TFLb_Rb_To, 7, 2))) ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_OPCION", "", !(GXutil.strcmp("", AV59TFLb_opcion)==0), (short)(0), AV59TFLb_opcion, "", !(GXutil.strcmp("", AV60TFLb_opcion_Sel)==0), AV60TFLb_opcion_Sel, "") ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_NUMOP", "", !((0==AV57TFLb_numop)&&(0==AV58TFLb_numop_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFLb_numop, 2, 0)), GXutil.trim( GXutil.str( AV58TFLb_numop_To, 2, 0))) ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_CARTAZ", "", !(GXutil.strcmp("", AV41TFLb_Cartaz)==0), (short)(0), AV41TFLb_Cartaz, "", !(GXutil.strcmp("", AV42TFLb_Cartaz_Sel)==0), AV42TFLb_Cartaz_Sel, "") ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_FECHAE", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFLb_FechaE)), (short)(0), GXutil.trim( localUtil.dtoc( AV49TFLb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_FECHAEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51TFLb_FechaEn)), (short)(0), GXutil.trim( localUtil.dtoc( AV51TFLb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_FECHAR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFLb_FechaR)), (short)(0), GXutil.trim( localUtil.dtoc( AV53TFLb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_ESTADO_SEL", "", !(AV47TFLb_Estado_Sels.size()==0), (short)(0), AV47TFLb_Estado_Sels.toJSonString(false), "") ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_RGB", "", !((0==AV91TFLb_RGB)&&(0==AV92TFLb_RGB_To)), (short)(0), GXutil.trim( GXutil.str( AV91TFLb_RGB, 10, 0)), GXutil.trim( GXutil.str( AV92TFLb_RGB_To, 10, 0))) ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_COSTEE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFLb_CosteE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV94TFLb_CosteE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV93TFLb_CosteE, 11, 5)), GXutil.trim( GXutil.str( AV94TFLb_CosteE_To, 11, 5))) ;
      AV23GridState = GXv_SdtWWPGridState25[0] ;
      if ( ! (GXutil.strcmp("", AV16Emprcod)==0) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV16Emprcod );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      if ( ! (0==AV5Clicod) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV5Clicod, 6, 0) );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      if ( ! (0==AV27Lb_Numero) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV27Lb_Numero, 8, 0) );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      AV23GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV23GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV23GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV63TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV63TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV97Pgmname );
      AV63TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV63TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV25HTTPRequest.getScriptName()+"?"+AV25HTTPRequest.getQuerystring() );
      AV63TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.TENS003" );
      AV36Session.setValue("TrnContext", AV63TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_82_1TT2( boolean wbgen )
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
         wb_table2_82_1TT2e( true) ;
      }
      else
      {
         wb_table2_82_1TT2e( false) ;
      }
   }

   public void wb_table1_19_1TT2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV28ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_24_1TT2( true) ;
      }
      else
      {
         wb_table3_24_1TT2( false) ;
      }
      return  ;
   }

   public void wb_table3_24_1TT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_1TT2e( true) ;
      }
      else
      {
         wb_table1_19_1TT2e( false) ;
      }
   }

   public void wb_table3_24_1TT2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'" + sPrefix + "',false,'" + sGXsfl_50_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV18FilterFullText, GXutil.rtrim( localUtil.format( AV18FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\ActualizacionEnsayoenColorteca_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_24_1TT2e( true) ;
      }
      else
      {
         wb_table3_24_1TT2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV16Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
      AV5Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicod), 6, 0));
      AV27Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Lb_Numero), 8, 0));
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
      pa1TT2( ) ;
      ws1TT2( ) ;
      we1TT2( ) ;
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
      sCtrlAV5Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV27Lb_Numero = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1TT2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\actualizacionensayoencolorteca_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1TT2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV16Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Emprcod", AV16Emprcod);
         AV5Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicod), 6, 0));
         AV27Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Lb_Numero), 8, 0));
      }
      wcpOAV16Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV16Emprcod") ;
      wcpOAV5Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV27Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV16Emprcod, wcpOAV16Emprcod) != 0 ) || ( AV5Clicod != wcpOAV5Clicod ) || ( AV27Lb_Numero != wcpOAV27Lb_Numero ) ) )
      {
         setjustcreated();
      }
      wcpOAV16Emprcod = AV16Emprcod ;
      wcpOAV5Clicod = AV5Clicod ;
      wcpOAV27Lb_Numero = AV27Lb_Numero ;
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
      sCtrlAV5Clicod = httpContext.cgiGet( sPrefix+"AV5Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Clicod) > 0 )
      {
         AV5Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicod), 6, 0));
      }
      else
      {
         AV5Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV27Lb_Numero = httpContext.cgiGet( sPrefix+"AV27Lb_Numero_CTRL") ;
      if ( GXutil.len( sCtrlAV27Lb_Numero) > 0 )
      {
         AV27Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV27Lb_Numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Lb_Numero), 8, 0));
      }
      else
      {
         AV27Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV27Lb_Numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1TT2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1TT2( ) ;
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
      ws1TT2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV5Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Clicod_CTRL", GXutil.rtrim( sCtrlAV5Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27Lb_Numero_PARM", GXutil.ltrim( localUtil.ntoc( AV27Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27Lb_Numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27Lb_Numero_CTRL", GXutil.rtrim( sCtrlAV27Lb_Numero));
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
      we1TT2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116627", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/actualizacionensayoencolorteca_wc.js", "?202682116627", false, true);
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

   public void subsflControlProps_502( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_50_idx );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_50_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_50_idx ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD_"+sGXsfl_50_idx ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC_"+sGXsfl_50_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_50_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_50_idx ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB_"+sGXsfl_50_idx ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_50_idx ;
      edtLb_numop_Internalname = sPrefix+"LB_NUMOP_"+sGXsfl_50_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_50_idx ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE_"+sGXsfl_50_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_50_idx ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR_"+sGXsfl_50_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_50_idx );
      edtavF_cformu_Internalname = sPrefix+"vF_CFORMU_"+sGXsfl_50_idx ;
      edtavFornumcol_Internalname = sPrefix+"vFORNUMCOL_"+sGXsfl_50_idx ;
      edtLb_RGB_Internalname = sPrefix+"LB_RGB_"+sGXsfl_50_idx ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_502( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_50_fel_idx );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_50_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_50_fel_idx ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD_"+sGXsfl_50_fel_idx ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC_"+sGXsfl_50_fel_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_50_fel_idx ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD_"+sGXsfl_50_fel_idx ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB_"+sGXsfl_50_fel_idx ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION_"+sGXsfl_50_fel_idx ;
      edtLb_numop_Internalname = sPrefix+"LB_NUMOP_"+sGXsfl_50_fel_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_50_fel_idx ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE_"+sGXsfl_50_fel_idx ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN_"+sGXsfl_50_fel_idx ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR_"+sGXsfl_50_fel_idx ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO_"+sGXsfl_50_fel_idx );
      edtavF_cformu_Internalname = sPrefix+"vF_CFORMU_"+sGXsfl_50_fel_idx ;
      edtavFornumcol_Internalname = sPrefix+"vFORNUMCOL_"+sGXsfl_50_fel_idx ;
      edtLb_RGB_Internalname = sPrefix+"LB_RGB_"+sGXsfl_50_fel_idx ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE_"+sGXsfl_50_fel_idx ;
   }

   public void sendrow_502( )
   {
      subsflControlProps_502( ) ;
      wb1TT0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_50_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_50_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'"+sPrefix+"',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_50_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_50_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV35Seleccionar),"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,51);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_numero_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtCod_Internalname,GXutil.rtrim( A5533Lb_ArtCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNomC_Internalname,GXutil.rtrim( A5538Lb_ColNomC),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNomC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ColNomC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTipColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_Rb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Rb_Internalname,GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Rb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_Rb_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_opcion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_opcion_Internalname,GXutil.rtrim( A5555Lb_opcion),GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_opcion_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numop_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numop_Internalname,GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_numop_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_numop_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Cartaz_Internalname,GXutil.rtrim( A5540Lb_Cartaz),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_Cartaz_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaE_Internalname,localUtil.format(A5541Lb_FechaE, "99/99/99"),localUtil.format( A5541Lb_FechaE, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_FechaE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaEn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaEn_Internalname,localUtil.format(A5567Lb_FechaEn, "99/99/99"),localUtil.format( A5567Lb_FechaEn, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_FechaEn_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaR_Internalname,localUtil.format(A5563Lb_FechaR, "99/99/99"),localUtil.format( A5563Lb_FechaR, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_FechaR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbLb_Estado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbLb_Estado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "LB_ESTADO_" + sGXsfl_50_idx ;
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
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbLb_Estado.getInternalname(), "Values", cmbLb_Estado.ToJavascriptSource(), !bGXsfl_50_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavF_cformu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavF_cformu_Enabled!=0)&&(edtavF_cformu_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'"+sPrefix+"',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavF_cformu_Internalname,GXutil.ltrim( localUtil.ntoc( AV17F_Cformu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavF_cformu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17F_Cformu), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17F_Cformu), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavF_cformu_Enabled!=0)&&(edtavF_cformu_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavF_cformu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavF_cformu_Visible),Integer.valueOf(edtavF_cformu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFornumcol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFornumcol_Enabled!=0)&&(edtavFornumcol_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'"+sPrefix+"',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFornumcol_Internalname,GXutil.ltrim( localUtil.ntoc( AV19ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFornumcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19ForNumCol), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavFornumcol_Enabled!=0)&&(edtavFornumcol_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFornumcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFornumcol_Visible),Integer.valueOf(edtavFornumcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_RGB_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_RGB_Internalname,GXutil.ltrim( localUtil.ntoc( A5599Lb_RGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5599Lb_RGB), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_RGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_RGB_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_CosteE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_CosteE_Internalname,GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5565Lb_CosteE, "ZZZZ9.99999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_CosteE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_CosteE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1TT2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_50_idx = ((subGrid_Islastpage==1)&&(nGXsfl_50_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
      }
      /* End function sendrow_502 */
   }

   public void startgridcontrol50( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"50\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Rb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_opcion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_numop_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaEn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaR_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbLb_Estado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavF_cformu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cformu", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFornumcol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Formula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_RGB_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RGB", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_CosteE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV35Seleccionar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5533Lb_ArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5538Lb_ColNomC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNomC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Rb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5555Lb_opcion));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_opcion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_numop_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5540Lb_Cartaz));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Cartaz_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5541Lb_FechaE, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FechaE_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17F_Cformu, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavF_cformu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavF_cformu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV19ForNumCol, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFornumcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFornumcol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5599Lb_RGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_RGB_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_CosteE_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncancelr_Internalname = sPrefix+"BTNCANCELR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD" ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC" ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM" ;
      edtTipColCod_Internalname = sPrefix+"TIPCOLCOD" ;
      edtLb_Rb_Internalname = sPrefix+"LB_RB" ;
      edtLb_opcion_Internalname = sPrefix+"LB_OPCION" ;
      edtLb_numop_Internalname = sPrefix+"LB_NUMOP" ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ" ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE" ;
      edtLb_FechaEn_Internalname = sPrefix+"LB_FECHAEN" ;
      edtLb_FechaR_Internalname = sPrefix+"LB_FECHAR" ;
      cmbLb_Estado.setInternalname( sPrefix+"LB_ESTADO" );
      edtavF_cformu_Internalname = sPrefix+"vF_CFORMU" ;
      edtavFornumcol_Internalname = sPrefix+"vFORNUMCOL" ;
      edtLb_RGB_Internalname = sPrefix+"LB_RGB" ;
      edtLb_CosteE_Internalname = sPrefix+"LB_COSTEE" ;
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
      edtavDdo_lb_fechaeauxdate_Internalname = sPrefix+"vDDO_LB_FECHAEAUXDATE" ;
      divDdo_lb_fechaeauxdates_Internalname = sPrefix+"DDO_LB_FECHAEAUXDATES" ;
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
      edtLb_CosteE_Jsonclick = "" ;
      edtLb_RGB_Jsonclick = "" ;
      edtavFornumcol_Jsonclick = "" ;
      edtavFornumcol_Enabled = 1 ;
      edtavF_cformu_Jsonclick = "" ;
      edtavF_cformu_Enabled = 1 ;
      cmbLb_Estado.setJsonclick( "" );
      edtLb_FechaR_Jsonclick = "" ;
      edtLb_FechaEn_Jsonclick = "" ;
      edtLb_FechaE_Jsonclick = "" ;
      edtLb_Cartaz_Jsonclick = "" ;
      edtLb_numop_Jsonclick = "" ;
      edtLb_opcion_Jsonclick = "" ;
      edtLb_Rb_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtLb_ColNum_Jsonclick = "" ;
      edtLb_ColNomC_Jsonclick = "" ;
      edtLb_ArtCod_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtLb_numero_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtLb_CosteE_Visible = -1 ;
      edtLb_RGB_Visible = -1 ;
      edtavFornumcol_Visible = -1 ;
      edtavF_cformu_Visible = -1 ;
      cmbLb_Estado.setVisible( -1 );
      edtLb_FechaR_Visible = -1 ;
      edtLb_FechaEn_Visible = -1 ;
      edtLb_FechaE_Visible = -1 ;
      edtLb_Cartaz_Visible = -1 ;
      edtLb_numop_Visible = -1 ;
      edtLb_opcion_Visible = -1 ;
      edtLb_Rb_Visible = -1 ;
      edtTipColCod_Visible = -1 ;
      edtLb_ColNum_Visible = -1 ;
      edtLb_ColNomC_Visible = -1 ;
      edtLb_ArtCod_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtLb_numero_Visible = -1 ;
      chkavSeleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lb_fecharauxdate_Jsonclick = "" ;
      edtavDdo_lb_fechaenauxdate_Jsonclick = "" ;
      edtavDdo_lb_fechaeauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable2_Height = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;Fecha;Fecha;Fecha;;;;;" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma la actualizacion en Colorteca?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.ActualizacionEnsayoenColorteca_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||||1:Enviado,2:Recepcionado||||" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||||T||||" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic||||Dynamic||Dynamic||||FixedValues||||" ;
      Ddo_grid_Includedatalist = "|||T|T||||T||T||||T||||" ;
      Ddo_grid_Filterisrange = "|T|T|||T|T|T||T||||||||T|T" ;
      Ddo_grid_Filtertype = "|Numeric|Numeric|Character|Character|Numeric|Numeric|Numeric|Character|Numeric|Character|Date|Date|Date||||Numeric|Numeric" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T|T|T|T|T|T|T||||T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T|T|T|T|||T|T" ;
      Ddo_grid_Columnssortvalues = "|2|1|4|5|6|7|8|3|9|10|11|12|13|14|||15|16" ;
      Ddo_grid_Columnids = "0:Seleccionar|1:Lb_numero|2:CliCod|3:Lb_ArtCod|4:Lb_ColNomC|5:Lb_ColNum|6:TipColCod|7:Lb_Rb|8:Lb_opcion|9:Lb_numop|10:Lb_Cartaz|11:Lb_FechaE|12:Lb_FechaEn|13:Lb_FechaR|14:Lb_Estado|15:F_Cformu|16:ForNumCol|17:Lb_RGB|18:Lb_CosteE" ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_50_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_50_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
      GXCCtl = "LB_ESTADO_" + sGXsfl_50_idx ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV19ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV68Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV69Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'sPrefix'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV27Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV55TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV56TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV40TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV43TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV44TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV61TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV62TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV59TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV60TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV57TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV58TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV41TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV42TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV49TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV51TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV53TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV47TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV91TFLb_RGB',fld:'vTFLB_RGB',pic:'ZZZZZZZZZ9'},{av:'AV92TFLb_RGB_To',fld:'vTFLB_RGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV93TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV94TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV83Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtavF_cformu_Visible',ctrl:'vF_CFORMU',prop:'Visible'},{av:'edtavFornumcol_Visible',ctrl:'vFORNUMCOL',prop:'Visible'},{av:'edtLb_RGB_Visible',ctrl:'LB_RGB',prop:'Visible'},{av:'edtLb_CosteE_Visible',ctrl:'LB_COSTEE',prop:'Visible'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV23GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131TT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV27Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV56TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV40TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV43TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV44TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV61TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV62TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV59TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV60TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV57TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV58TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV41TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV42TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV49TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV51TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV53TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV47TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV91TFLb_RGB',fld:'vTFLB_RGB',pic:'ZZZZZZZZZ9'},{av:'AV92TFLb_RGB_To',fld:'vTFLB_RGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV93TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV94TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV20ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV19ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV68Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV69Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV83Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141TT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV27Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV56TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV40TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV43TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV44TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV61TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV62TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV59TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV60TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV57TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV58TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV41TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV42TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV49TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV51TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV53TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV47TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV91TFLb_RGB',fld:'vTFLB_RGB',pic:'ZZZZZZZZZ9'},{av:'AV92TFLb_RGB_To',fld:'vTFLB_RGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV93TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV94TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV20ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV19ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV68Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV69Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV83Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e151TT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV27Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV56TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV40TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV43TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV44TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV61TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV62TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV59TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV60TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV57TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV58TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV41TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV42TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV49TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV51TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV53TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV47TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV91TFLb_RGB',fld:'vTFLB_RGB',pic:'ZZZZZZZZZ9'},{av:'AV92TFLb_RGB_To',fld:'vTFLB_RGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV93TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV94TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV20ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV19ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV68Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV69Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV83Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV94TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV91TFLb_RGB',fld:'vTFLB_RGB',pic:'ZZZZZZZZZ9'},{av:'AV92TFLb_RGB_To',fld:'vTFLB_RGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV48TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV47TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV53TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV51TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV49TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV41TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV42TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV57TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV58TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV59TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV60TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV61TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV62TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV44TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV39TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV40TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV55TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV56TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211TT2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV20ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV19ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV68Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV69Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV19ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV20ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'A5533Lb_ArtCod',fld:'LB_ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV35Seleccionar',fld:'vSELECCIONAR',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e161TT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV27Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV56TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV40TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV43TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV44TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV61TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV62TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV59TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV60TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV57TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV58TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV41TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV42TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV49TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV51TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV53TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV47TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV91TFLb_RGB',fld:'vTFLB_RGB',pic:'ZZZZZZZZZ9'},{av:'AV92TFLb_RGB_To',fld:'vTFLB_RGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV93TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV94TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV20ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV19ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV68Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV69Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV83Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtavF_cformu_Visible',ctrl:'vF_CFORMU',prop:'Visible'},{av:'edtavFornumcol_Visible',ctrl:'vFORNUMCOL',prop:'Visible'},{av:'edtLb_RGB_Visible',ctrl:'LB_RGB',prop:'Visible'},{av:'edtLb_CosteE_Visible',ctrl:'LB_COSTEE',prop:'Visible'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV23GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121TT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV27Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV56TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV40TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV43TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV44TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV61TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV62TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV59TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV60TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV57TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV58TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV41TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV42TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV49TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV51TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV53TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV47TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV91TFLb_RGB',fld:'vTFLB_RGB',pic:'ZZZZZZZZZ9'},{av:'AV92TFLb_RGB_To',fld:'vTFLB_RGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV93TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV94TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'AV20ForUltUti',fld:'vFORULTUTI',pic:'',hsh:true},{av:'AV19ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV68Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV69Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'AV83Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV23GridState',fld:'vGRIDSTATE',pic:''},{av:'AV48TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV56TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV40TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV43TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV44TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV61TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV62TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV59TFLb_opcion',fld:'vTFLB_OPCION',pic:'@!'},{av:'AV60TFLb_opcion_Sel',fld:'vTFLB_OPCION_SEL',pic:'@!'},{av:'AV57TFLb_numop',fld:'vTFLB_NUMOP',pic:'Z9'},{av:'AV58TFLb_numop_To',fld:'vTFLB_NUMOP_TO',pic:'Z9'},{av:'AV41TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV42TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV49TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV51TFLb_FechaEn',fld:'vTFLB_FECHAEN',pic:''},{av:'AV53TFLb_FechaR',fld:'vTFLB_FECHAR',pic:''},{av:'AV47TFLb_Estado_Sels',fld:'vTFLB_ESTADO_SELS',pic:''},{av:'AV91TFLb_RGB',fld:'vTFLB_RGB',pic:'ZZZZZZZZZ9'},{av:'AV92TFLb_RGB_To',fld:'vTFLB_RGB_TO',pic:'ZZZZZZZZZ9'},{av:'AV93TFLb_CosteE',fld:'vTFLB_COSTEE',pic:'ZZZZ9.99999'},{av:'AV94TFLb_CosteE_To',fld:'vTFLB_COSTEE_TO',pic:'ZZZZ9.99999'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV48TFLb_Estado_SelsJson',fld:'vTFLB_ESTADO_SELSJSON',pic:''},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_opcion_Visible',ctrl:'LB_OPCION',prop:'Visible'},{av:'edtLb_numop_Visible',ctrl:'LB_NUMOP',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_FechaEn_Visible',ctrl:'LB_FECHAEN',prop:'Visible'},{av:'edtLb_FechaR_Visible',ctrl:'LB_FECHAR',prop:'Visible'},{av:'cmbLb_Estado'},{av:'edtavF_cformu_Visible',ctrl:'vF_CFORMU',prop:'Visible'},{av:'edtavFornumcol_Visible',ctrl:'vFORNUMCOL',prop:'Visible'},{av:'edtLb_RGB_Visible',ctrl:'LB_RGB',prop:'Visible'},{av:'edtLb_CosteE_Visible',ctrl:'LB_COSTEE',prop:'Visible'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e181TT2',iparms:[{av:'AV68Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5538Lb_ColNomC',fld:'LB_COLNOMC',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV19ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV82Numform',fld:'vNUMFORM',pic:'ZZZ9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV82Numform',fld:'vNUMFORM',pic:'ZZZ9'},{av:'AV19ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e171TT2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV68Col_Lb_numero',fld:'vCOL_LB_NUMERO',pic:''},{av:'AV69Col_Lb_opcion',fld:'vCOL_LB_OPCION',pic:''},{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'A5718Lb_numop',fld:'LB_NUMOP',pic:'Z9',hsh:true},{av:'AV83Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'A5536Lb_ColNom',fld:'LB_COLNOM',pic:''},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''},{av:'A5565Lb_CosteE',fld:'LB_COSTEE',pic:'ZZZZ9.99999'},{av:'A5599Lb_RGB',fld:'LB_RGB',pic:'ZZZZZZZZZ9'},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'A5537Lb_ColNum',fld:'LB_COLNUM',pic:'ZZZZZ9'},{av:'AV16Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17F_Cformu',fld:'vF_CFORMU',pic:'ZZZ9'},{av:'A5599Lb_RGB',fld:'LB_RGB',pic:'ZZZZZZZZZ9'},{av:'A5565Lb_CosteE',fld:'LB_COSTEE',pic:'ZZZZ9.99999'},{av:'A5563Lb_FechaR',fld:'LB_FECHAR',pic:''}]}");
      setEventMetadata("'DOCANCELR'","{handler:'e111TT1',iparms:[]");
      setEventMetadata("'DOCANCELR'",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_costee',iparms:[]");
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
      AV16Emprcod = "" ;
      AV18FilterFullText = "" ;
      AV6ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39TFLb_ArtCod = "" ;
      AV40TFLb_ArtCod_Sel = "" ;
      AV43TFLb_ColNomC = "" ;
      AV44TFLb_ColNomC_Sel = "" ;
      AV61TFLb_Rb = DecimalUtil.ZERO ;
      AV62TFLb_Rb_To = DecimalUtil.ZERO ;
      AV59TFLb_opcion = "" ;
      AV60TFLb_opcion_Sel = "" ;
      AV41TFLb_Cartaz = "" ;
      AV42TFLb_Cartaz_Sel = "" ;
      AV49TFLb_FechaE = GXutil.nullDate() ;
      AV51TFLb_FechaEn = GXutil.nullDate() ;
      AV53TFLb_FechaR = GXutil.nullDate() ;
      AV47TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV93TFLb_CosteE = DecimalUtil.ZERO ;
      AV94TFLb_CosteE_To = DecimalUtil.ZERO ;
      AV97Pgmname = "" ;
      AV20ForUltUti = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV68Col_Lb_numero = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV69Col_Lb_opcion = new GXSimpleCollection<String>(String.class, "internal", "");
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV28ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV15DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A5536Lb_ColNom = "" ;
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48TFLb_Estado_SelsJson = "" ;
      A279CliNom = "" ;
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
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncancelr_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV9DDO_Lb_FechaEAuxDate = GXutil.nullDate() ;
      AV11DDO_Lb_FechaEnAuxDate = GXutil.nullDate() ;
      AV13DDO_Lb_FechaRAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      A5540Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = "" ;
      lV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = "" ;
      lV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = "" ;
      lV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = "" ;
      lV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = "" ;
      AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = "" ;
      AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = "" ;
      AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = "" ;
      AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = "" ;
      AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = "" ;
      AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = DecimalUtil.ZERO ;
      AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = DecimalUtil.ZERO ;
      AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = "" ;
      AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = "" ;
      AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = "" ;
      AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = "" ;
      AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = GXutil.nullDate() ;
      AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = GXutil.nullDate() ;
      AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = GXutil.nullDate() ;
      AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = DecimalUtil.ZERO ;
      AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = DecimalUtil.ZERO ;
      H01TT2_A5569Lb_EstEns = new byte[1] ;
      H01TT2_A396EmprCod = new String[] {""} ;
      H01TT2_A5536Lb_ColNom = new String[] {""} ;
      H01TT2_A279CliNom = new String[] {""} ;
      H01TT2_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TT2_A5599Lb_RGB = new long[1] ;
      H01TT2_A5566Lb_Estado = new byte[1] ;
      H01TT2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      H01TT2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      H01TT2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      H01TT2_A5540Lb_Cartaz = new String[] {""} ;
      H01TT2_A5718Lb_numop = new byte[1] ;
      H01TT2_A5555Lb_opcion = new String[] {""} ;
      H01TT2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01TT2_A831TipColCod = new byte[1] ;
      H01TT2_n831TipColCod = new boolean[] {false} ;
      H01TT2_A5537Lb_ColNum = new int[1] ;
      H01TT2_A5538Lb_ColNomC = new String[] {""} ;
      H01TT2_A5533Lb_ArtCod = new String[] {""} ;
      H01TT2_A252CliCod = new int[1] ;
      H01TT2_A5532Lb_numero = new int[1] ;
      H01TT3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV98Station = "" ;
      AV99Emprnom = "" ;
      AV100Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV66WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36Session = httpContext.getWebSession();
      AV8ColumnsSelectorXML = "" ;
      GXv_int8 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV30ManageFiltersXml = "" ;
      AV73Clinom = "" ;
      AV75Lb_colnomc = "" ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      AV65UserCustomValue = "" ;
      AV7ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = new GXBaseCollection[1] ;
      AV72IN_Lb_opcion = "" ;
      AV89Num_color = "" ;
      AV84Lb_colnom = "" ;
      GXv_int13 = new int[1] ;
      GXv_date12 = new java.util.Date[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_int20 = new long[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int21 = new byte[1] ;
      GXv_int9 = new int[1] ;
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char24 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState25 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV63TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV25HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV16Emprcod = "" ;
      sCtrlAV5Clicod = "" ;
      sCtrlAV27Lb_Numero = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.actualizacionensayoencolorteca_wc__default(),
         new Object[] {
             new Object[] {
            H01TT2_A5569Lb_EstEns, H01TT2_A396EmprCod, H01TT2_A5536Lb_ColNom, H01TT2_A279CliNom, H01TT2_A5565Lb_CosteE, H01TT2_A5599Lb_RGB, H01TT2_A5566Lb_Estado, H01TT2_A5563Lb_FechaR, H01TT2_A5567Lb_FechaEn, H01TT2_A5541Lb_FechaE,
            H01TT2_A5540Lb_Cartaz, H01TT2_A5718Lb_numop, H01TT2_A5555Lb_opcion, H01TT2_A5547Lb_Rb, H01TT2_A831TipColCod, H01TT2_n831TipColCod, H01TT2_A5537Lb_ColNum, H01TT2_A5538Lb_ColNomC, H01TT2_A5533Lb_ArtCod, H01TT2_A252CliCod,
            H01TT2_A5532Lb_numero
            }
            , new Object[] {
            H01TT3_AGRID_nRecordCount
            }
         }
      );
      AV97Pgmname = "GestionLaboratorio.ActualizacionEnsayoenColorteca_WC" ;
      /* GeneXus formulas. */
      AV97Pgmname = "GestionLaboratorio.ActualizacionEnsayoenColorteca_WC" ;
      Gx_err = (short)(0) ;
      edtavF_cformu_Enabled = 0 ;
      edtavFornumcol_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV29ManageFiltersExecutionStep ;
   private byte AV79TFTipColCod ;
   private byte AV80TFTipColCod_To ;
   private byte AV57TFLb_numop ;
   private byte AV58TFLb_numop_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A831TipColCod ;
   private byte A5718Lb_numop ;
   private byte A5566Lb_Estado ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod ;
   private byte AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to ;
   private byte AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop ;
   private byte AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to ;
   private byte A5569Lb_EstEns ;
   private byte AV78Tipcolcod ;
   private byte GXv_int11[] ;
   private byte GXv_int10[] ;
   private byte GXv_int21[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV31OrderedBy ;
   private short AV17F_Cformu ;
   private short AV83Carvitin ;
   private short AV82Numform ;
   private short AV70i ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV77F_CformuGrid ;
   private short AV87F_ldform ;
   private short AV88F_lprfor ;
   private int wcpOAV5Clicod ;
   private int wcpOAV27Lb_Numero ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_50 ;
   private int AV5Clicod ;
   private int AV27Lb_Numero ;
   private int nGXsfl_50_idx=1 ;
   private int AV55TFLb_numero ;
   private int AV56TFLb_numero_To ;
   private int AV37TFCliCod ;
   private int AV38TFCliCod_To ;
   private int AV45TFLb_ColNum ;
   private int AV46TFLb_ColNum_To ;
   private int AV19ForNumCol ;
   private int Gridpaginationbar_Pagestoshow ;
   private int divUnnamedtable2_Height ;
   private int edtavPgmname_Enabled ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int subGrid_Islastpage ;
   private int edtavF_cformu_Enabled ;
   private int edtavFornumcol_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size ;
   private int AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero ;
   private int AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to ;
   private int AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod ;
   private int AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to ;
   private int AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum ;
   private int AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to ;
   private int edtLb_numero_Visible ;
   private int edtCliCod_Visible ;
   private int edtLb_ArtCod_Visible ;
   private int edtLb_ColNomC_Visible ;
   private int edtLb_ColNum_Visible ;
   private int edtTipColCod_Visible ;
   private int edtLb_Rb_Visible ;
   private int edtLb_opcion_Visible ;
   private int edtLb_numop_Visible ;
   private int edtLb_Cartaz_Visible ;
   private int edtLb_FechaE_Visible ;
   private int edtLb_FechaEn_Visible ;
   private int edtLb_FechaR_Visible ;
   private int edtavF_cformu_Visible ;
   private int edtavFornumcol_Visible ;
   private int edtLb_RGB_Visible ;
   private int edtLb_CosteE_Visible ;
   private int AV34PageToGo ;
   private int GXv_int8[] ;
   private int AV76Lb_colnum ;
   private int AV81ForNumColGrid ;
   private int AV71IN_Lb_numero ;
   private int AV90N_color ;
   private int GXv_int13[] ;
   private int GXv_int9[] ;
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
   private long AV91TFLb_RGB ;
   private long AV92TFLb_RGB_To ;
   private long AV21GridCurrentPage ;
   private long AV22GridPageCount ;
   private long A5599Lb_RGB ;
   private long GRID_nCurrentRecord ;
   private long AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb ;
   private long AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to ;
   private long GRID_nRecordCount ;
   private long GXv_int20[] ;
   private java.math.BigDecimal AV61TFLb_Rb ;
   private java.math.BigDecimal AV62TFLb_Rb_To ;
   private java.math.BigDecimal AV93TFLb_CosteE ;
   private java.math.BigDecimal AV94TFLb_CosteE_To ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ;
   private java.math.BigDecimal AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ;
   private java.math.BigDecimal AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ;
   private java.math.BigDecimal AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private String wcpOAV16Emprcod ;
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
   private String AV16Emprcod ;
   private String sGXsfl_50_idx="0001" ;
   private String AV39TFLb_ArtCod ;
   private String AV40TFLb_ArtCod_Sel ;
   private String AV43TFLb_ColNomC ;
   private String AV44TFLb_ColNomC_Sel ;
   private String AV59TFLb_opcion ;
   private String AV60TFLb_opcion_Sel ;
   private String AV41TFLb_Cartaz ;
   private String AV42TFLb_Cartaz_Sel ;
   private String AV97Pgmname ;
   private String Gx_msg ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncancelr_Internalname ;
   private String bttBtncancelr_Jsonclick ;
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
   private String divDdo_lb_fechaeauxdates_Internalname ;
   private String edtavDdo_lb_fechaeauxdate_Internalname ;
   private String edtavDdo_lb_fechaeauxdate_Jsonclick ;
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
   private String edtCliCod_Internalname ;
   private String A5533Lb_ArtCod ;
   private String edtLb_ArtCod_Internalname ;
   private String A5538Lb_ColNomC ;
   private String edtLb_ColNomC_Internalname ;
   private String edtLb_ColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String edtLb_Rb_Internalname ;
   private String A5555Lb_opcion ;
   private String edtLb_opcion_Internalname ;
   private String edtLb_numop_Internalname ;
   private String A5540Lb_Cartaz ;
   private String edtLb_Cartaz_Internalname ;
   private String edtLb_FechaE_Internalname ;
   private String edtLb_FechaEn_Internalname ;
   private String edtLb_FechaR_Internalname ;
   private String edtavF_cformu_Internalname ;
   private String edtavFornumcol_Internalname ;
   private String edtLb_RGB_Internalname ;
   private String edtLb_CosteE_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ;
   private String lV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ;
   private String lV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ;
   private String lV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ;
   private String AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ;
   private String AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ;
   private String AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ;
   private String AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ;
   private String AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ;
   private String AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ;
   private String AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ;
   private String AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ;
   private String hsh ;
   private String AV98Station ;
   private String AV99Emprnom ;
   private String AV100Usurcod ;
   private String AV73Clinom ;
   private String AV75Lb_colnomc ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String AV72IN_Lb_opcion ;
   private String AV89Num_color ;
   private String AV84Lb_colnom ;
   private String GXt_char24 ;
   private String GXv_char14[] ;
   private String GXt_char23 ;
   private String GXv_char4[] ;
   private String GXt_char22 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV16Emprcod ;
   private String sCtrlAV5Clicod ;
   private String sCtrlAV27Lb_Numero ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtLb_numero_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtLb_ArtCod_Jsonclick ;
   private String edtLb_ColNomC_Jsonclick ;
   private String edtLb_ColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtLb_Rb_Jsonclick ;
   private String edtLb_opcion_Jsonclick ;
   private String edtLb_numop_Jsonclick ;
   private String edtLb_Cartaz_Jsonclick ;
   private String edtLb_FechaE_Jsonclick ;
   private String edtLb_FechaEn_Jsonclick ;
   private String edtLb_FechaR_Jsonclick ;
   private String edtavF_cformu_Jsonclick ;
   private String edtavFornumcol_Jsonclick ;
   private String edtLb_RGB_Jsonclick ;
   private String edtLb_CosteE_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV49TFLb_FechaE ;
   private java.util.Date AV51TFLb_FechaEn ;
   private java.util.Date AV53TFLb_FechaR ;
   private java.util.Date AV20ForUltUti ;
   private java.util.Date AV9DDO_Lb_FechaEAuxDate ;
   private java.util.Date AV11DDO_Lb_FechaEnAuxDate ;
   private java.util.Date AV13DDO_Lb_FechaRAuxDate ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ;
   private java.util.Date AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ;
   private java.util.Date AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ;
   private java.util.Date GXv_date12[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV33OrderedDsc ;
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
   private boolean AV35Seleccionar ;
   private boolean n831TipColCod ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV48TFLb_Estado_SelsJson ;
   private String AV8ColumnsSelectorXML ;
   private String AV30ManageFiltersXml ;
   private String AV65UserCustomValue ;
   private String AV18FilterFullText ;
   private String lV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ;
   private String AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ;
   private GXSimpleCollection<Byte> AV47TFLb_Estado_Sels ;
   private GXSimpleCollection<Integer> AV68Col_Lb_numero ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV25HTTPRequest ;
   private com.genexus.webpanels.WebSession AV36Session ;
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
   private byte[] H01TT2_A5569Lb_EstEns ;
   private String[] H01TT2_A396EmprCod ;
   private String[] H01TT2_A5536Lb_ColNom ;
   private String[] H01TT2_A279CliNom ;
   private java.math.BigDecimal[] H01TT2_A5565Lb_CosteE ;
   private long[] H01TT2_A5599Lb_RGB ;
   private byte[] H01TT2_A5566Lb_Estado ;
   private java.util.Date[] H01TT2_A5563Lb_FechaR ;
   private java.util.Date[] H01TT2_A5567Lb_FechaEn ;
   private java.util.Date[] H01TT2_A5541Lb_FechaE ;
   private String[] H01TT2_A5540Lb_Cartaz ;
   private byte[] H01TT2_A5718Lb_numop ;
   private String[] H01TT2_A5555Lb_opcion ;
   private java.math.BigDecimal[] H01TT2_A5547Lb_Rb ;
   private byte[] H01TT2_A831TipColCod ;
   private boolean[] H01TT2_n831TipColCod ;
   private int[] H01TT2_A5537Lb_ColNum ;
   private String[] H01TT2_A5538Lb_ColNomC ;
   private String[] H01TT2_A5533Lb_ArtCod ;
   private int[] H01TT2_A252CliCod ;
   private int[] H01TT2_A5532Lb_numero ;
   private long[] H01TT3_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV69Col_Lb_opcion ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV28ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV7ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV15DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState25[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV63TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV66WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class actualizacionensayoencolorteca_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01TT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                          String AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                          int AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero ,
                                          int AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to ,
                                          int AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod ,
                                          int AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to ,
                                          String AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                          String AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                          String AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                          String AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                          int AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum ,
                                          int AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to ,
                                          byte AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod ,
                                          byte AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to ,
                                          java.math.BigDecimal AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                          java.math.BigDecimal AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                          String AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                          String AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                          byte AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop ,
                                          byte AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to ,
                                          String AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                          String AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                          java.util.Date AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                          java.util.Date AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                          java.util.Date AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                          int AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size ,
                                          long AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb ,
                                          long AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to ,
                                          java.math.BigDecimal AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                          java.math.BigDecimal AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                          int AV5Clicod ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          long A5599Lb_RGB ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          short AV31OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          String AV16Emprcod ,
                                          int AV27Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[48];
      Object[] GXv_Object27 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.Lb_EstEns, T1.EmprCod, T2.Lb_ColNom, T3.CliNom, T1.Lb_CosteE, T2.Lb_RGB, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop," ;
      sSelectString += " T1.Lb_opcion, T2.Lb_Rb, T2.TipColCod, T2.Lb_ColNum, T2.Lb_ColNomC, T2.Lb_ArtCod, T2.CliCod, T1.Lb_numero" ;
      sFromString = " FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T2.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns = 0)");
      addWhere(sWhereString, "(Not (T1.Lb_FechaR = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_RGB,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_CosteE,'99990.99999'), 2) like '%' || ?))");
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
         GXv_int26[10] = (byte)(1) ;
         GXv_int26[11] = (byte)(1) ;
         GXv_int26[12] = (byte)(1) ;
         GXv_int26[13] = (byte)(1) ;
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (0==AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (0==AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) )
      {
         addWhere(sWhereString, "(T2.TipColCod >= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T2.TipColCod <= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB >= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( ! (0==AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB <= ?)");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int26[41] = (byte)(1) ;
      }
      if ( ! (0==AV5Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int26[42] = (byte)(1) ;
      }
      if ( ( AV31OrderedBy == 1 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ArtCod" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ArtCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ColNomC" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ColNomC DESC" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_ColNum" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_ColNum DESC" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.TipColCod" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.TipColCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_Rb" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_Rb DESC" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numop" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numop DESC" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV31OrderedBy == 11 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_FechaE" ;
      }
      else if ( ( AV31OrderedBy == 11 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_FechaE DESC" ;
      }
      else if ( ( AV31OrderedBy == 12 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV31OrderedBy == 12 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV31OrderedBy == 13 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV31OrderedBy == 13 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV31OrderedBy == 14 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV31OrderedBy == 14 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( ( AV31OrderedBy == 15 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.Lb_RGB" ;
      }
      else if ( ( AV31OrderedBy == 15 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.Lb_RGB DESC" ;
      }
      else if ( ( AV31OrderedBy == 16 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_CosteE" ;
      }
      else if ( ( AV31OrderedBy == 16 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_CosteE DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H01TT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                          String AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                          int AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero ,
                                          int AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to ,
                                          int AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod ,
                                          int AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to ,
                                          String AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                          String AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                          String AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                          String AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                          int AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum ,
                                          int AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to ,
                                          byte AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod ,
                                          byte AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to ,
                                          java.math.BigDecimal AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                          java.math.BigDecimal AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                          String AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                          String AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                          byte AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop ,
                                          byte AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to ,
                                          String AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                          String AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                          java.util.Date AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                          java.util.Date AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                          java.util.Date AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                          int AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size ,
                                          long AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb ,
                                          long AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to ,
                                          java.math.BigDecimal AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                          java.math.BigDecimal AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                          int AV5Clicod ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          long A5599Lb_RGB ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          short AV31OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          String AV16Emprcod ,
                                          int AV27Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[43];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns = 0)");
      addWhere(sWhereString, "(Not (T1.Lb_FechaR = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_RGB,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_CosteE,'99990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
         GXv_int29[3] = (byte)(1) ;
         GXv_int29[4] = (byte)(1) ;
         GXv_int29[5] = (byte)(1) ;
         GXv_int29[6] = (byte)(1) ;
         GXv_int29[7] = (byte)(1) ;
         GXv_int29[8] = (byte)(1) ;
         GXv_int29[9] = (byte)(1) ;
         GXv_int29[10] = (byte)(1) ;
         GXv_int29[11] = (byte)(1) ;
         GXv_int29[12] = (byte)(1) ;
         GXv_int29[13] = (byte)(1) ;
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (0==AV102Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (0==AV103Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV106Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) )
      {
         addWhere(sWhereString, "(T2.TipColCod >= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T2.TipColCod <= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV116Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (0==AV119Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV122Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV126Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB >= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (0==AV127Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB <= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! (0==AV5Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV31OrderedBy == 1 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 11 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 11 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 12 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 12 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 13 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 13 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 14 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 14 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 15 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 15 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 16 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 16 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
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
                  return conditional_H01TT2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , ((Number) dynConstraints[28]).longValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.math.BigDecimal)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).longValue() , (java.math.BigDecimal)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Boolean) dynConstraints[48]).booleanValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] );
            case 1 :
                  return conditional_H01TT3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , ((Number) dynConstraints[28]).longValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.math.BigDecimal)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).longValue() , (java.math.BigDecimal)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Boolean) dynConstraints[48]).booleanValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01TT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01TT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((String[]) buf[18])[0] = rslt.getString(18, 16);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((int[]) buf[20])[0] = rslt.getInt(20);
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
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[85]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[86]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[87]).longValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 5);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 5);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[81]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[82]).longValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 5);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               return;
      }
   }

}

