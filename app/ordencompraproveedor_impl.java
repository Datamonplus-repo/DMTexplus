package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ordencompraproveedor_impl extends GXWebComponent
{
   public ordencompraproveedor_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ordencompraproveedor_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ordencompraproveedor_impl.class ));
   }

   public ordencompraproveedor_impl( int remoteHandle ,
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
               AV78Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Emprcod", AV78Emprcod);
               AV79PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79PrvNum), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV78Emprcod,Integer.valueOf(AV79PrvNum)});
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
      nRC_GXsfl_29 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_29"))) ;
      nGXsfl_29_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_29_idx"))) ;
      sGXsfl_29_idx = httpContext.GetPar( "sGXsfl_29_idx") ;
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
      AV109Pgmname = httpContext.GetPar( "Pgmname") ;
      AV28OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV84TFSDTCompraProductoQuimico__PrdNum = httpContext.GetPar( "TFSDTCompraProductoQuimico__PrdNum") ;
      AV85TFSDTCompraProductoQuimico__PrdNum_Sel = httpContext.GetPar( "TFSDTCompraProductoQuimico__PrdNum_Sel") ;
      AV95TFSDTCompraProductoQuimico__PrdNom = httpContext.GetPar( "TFSDTCompraProductoQuimico__PrdNom") ;
      AV96TFSDTCompraProductoQuimico__PrdNom_Sel = httpContext.GetPar( "TFSDTCompraProductoQuimico__PrdNom_Sel") ;
      AV78Emprcod = httpContext.GetPar( "Emprcod") ;
      AV79PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV87SDTCompraProductoQuimicoAux);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV74SDTCompraProductoQuimico);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1YE2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Tabla PROPRV", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ordencompraproveedor", new String[] {GXutil.URLEncode(GXutil.rtrim(AV78Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV79PrvNum,6,0))}, new String[] {"Emprcod","PrvNum"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vORDEREDBY", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV28OrderedBy), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"OrdenCompraProveedor");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV109Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ordencompraproveedor:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtcompraproductoquimico", AV74SDTCompraProductoQuimico);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtcompraproductoquimico", AV74SDTCompraProductoQuimico);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_29", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_29, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV12DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV12DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV78Emprcod", GXutil.rtrim( wcpOAV78Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV79PrvNum", GXutil.ltrim( localUtil.ntoc( wcpOAV79PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV28OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vORDEREDBY", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV28OrderedBy), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM", GXutil.rtrim( AV84TFSDTCompraProductoQuimico__PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL", GXutil.rtrim( AV85TFSDTCompraProductoQuimico__PrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM", GXutil.rtrim( AV95TFSDTCompraProductoQuimico__PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL", GXutil.rtrim( AV96TFSDTCompraProductoQuimico__PrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV78Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUM", GXutil.ltrim( localUtil.ntoc( AV79PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTCOMPRAPRODUCTOQUIMICOAUX", AV87SDTCompraProductoQuimicoAux);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTCOMPRAPRODUCTOQUIMICOAUX", AV87SDTCompraProductoQuimicoAux);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTCOMPRAPRODUCTOQUIMICO", AV74SDTCompraProductoQuimico);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTCOMPRAPRODUCTOQUIMICO", AV74SDTCompraProductoQuimico);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVALORTOTAL", GXutil.ltrim( localUtil.ntoc( AV64ValorTotal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNOM_SEL", GXutil.rtrim( AV94PrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
   }

   public void renderHtmlCloseForm1YE2( )
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
      return "OrdenCompraProveedor" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla PROPRV", "") ;
   }

   public void wb1YE0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ordencompraproveedor");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 29, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111ye1_client"+"'", TempTags, "", 2, "HLP_OrdenCompraProveedor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 29, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_OrdenCompraProveedor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_24_1YE2( true) ;
      }
      else
      {
         wb_table1_24_1YE2( false) ;
      }
      return  ;
   }

   public void wb_table1_24_1YE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol29( ) ;
      }
      if ( wbEnd == 29 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_29 = (int)(nGXsfl_29_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            AV99GXV1 = nGXsfl_29_idx ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop15", "Right", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblValorstring_Internalname, lblValorstring_Caption, "", "", lblValorstring_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_OrdenCompraProveedor.htm");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablehidden_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnum_sel_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'" + sPrefix + "',false,'" + sGXsfl_29_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_sel_Internalname, GXutil.rtrim( AV89PrdNum_Sel), GXutil.rtrim( localUtil.format( AV89PrdNum_Sel, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_sel_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnum_sel_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_OrdenCompraProveedor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedcod_Internalname, httpContext.getMessage( "Nº Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'" + sPrefix + "',false,'" + sGXsfl_29_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV80PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPedcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV80PedCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV80PedCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_OrdenCompraProveedor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedtot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedtot_Internalname, httpContext.getMessage( "PedTot", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'" + sGXsfl_29_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedtot_Internalname, GXutil.ltrim( localUtil.ntoc( AV5PedTot, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPedtot_Enabled!=0) ? localUtil.format( AV5PedTot, "ZZZ,ZZZ,ZZ9.99") : localUtil.format( AV5PedTot, "ZZZ,ZZZ,ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,62);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedtot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedtot_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_OrdenCompraProveedor.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableinvisible_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbexplicar_Internalname, httpContext.getMessage( "Estas acciones no están visibles en ejecución, solo utilizamos para poder llamar al emergente de ww+", ""), "", "", lblTbexplicar_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_OrdenCompraProveedor.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 29, 2, 0)+","+"null"+");", httpContext.getMessage( "Imprimir", ""), bttBtnimprimir_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOIMPRIMIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_OrdenCompraProveedor.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV109Pgmname), GXutil.rtrim( localUtil.format( AV109Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_OrdenCompraProveedor.htm");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV12DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table2_80_1YE2( true) ;
      }
      else
      {
         wb_table2_80_1YE2( false) ;
      }
      return  ;
   }

   public void wb_table2_80_1YE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 29 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               AV99GXV1 = nGXsfl_29_idx ;
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

   public void start1YE2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla PROPRV", ""), (short)(0)) ;
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
            strup1YE0( ) ;
         }
      }
   }

   public void ws1YE2( )
   {
      start1YE2( ) ;
      evt1YE2( ) ;
   }

   public void evt1YE2( )
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
                              strup1YE0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YE0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121YE2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YE0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131YE2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YE0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoImprimir' */
                                 e141YE2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YE0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e151YE2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YE0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavPrdnum_sel_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YE0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 54), "SDTCOMPRAPRODUCTOQUIMICO__CANTIDAD.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 55), "SDTCOMPRAPRODUCTOQUIMICO__PRDPREACT.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YE0( ) ;
                           }
                           nGXsfl_29_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_292( ) ;
                           AV99GXV1 = nGXsfl_29_idx ;
                           if ( ( AV74SDTCompraProductoQuimico.size() >= AV99GXV1 ) && ( AV99GXV1 > 0 ) )
                           {
                              AV74SDTCompraProductoQuimico.currentItem( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)) );
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
                                       GX_FocusControl = edtavPrdnum_sel_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e161YE2 ();
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
                                       GX_FocusControl = edtavPrdnum_sel_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e171YE2 ();
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
                                       GX_FocusControl = edtavPrdnum_sel_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e181YE2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTCOMPRAPRODUCTOQUIMICO__CANTIDAD.CONTROLVALUECHANGED") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavPrdnum_sel_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191YE2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "SDTCOMPRAPRODUCTOQUIMICO__PRDPREACT.CONTROLVALUECHANGED") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavPrdnum_sel_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e201YE2 ();
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
                                    strup1YE0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavPrdnum_sel_Internalname ;
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

   public void we1YE2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1YE2( ) ;
         }
      }
   }

   public void pa1YE2( )
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
            GX_FocusControl = edtavPrdnum_sel_Internalname ;
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
      subsflControlProps_292( ) ;
      while ( nGXsfl_29_idx <= nRC_GXsfl_29 )
      {
         sendrow_292( ) ;
         nGXsfl_29_idx = ((subGrid_Islastpage==1)&&(nGXsfl_29_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_29_idx+1) ;
         sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_292( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV109Pgmname ,
                                 short AV28OrderedBy ,
                                 String AV84TFSDTCompraProductoQuimico__PrdNum ,
                                 String AV85TFSDTCompraProductoQuimico__PrdNum_Sel ,
                                 String AV95TFSDTCompraProductoQuimico__PrdNom ,
                                 String AV96TFSDTCompraProductoQuimico__PrdNom_Sel ,
                                 String AV78Emprcod ,
                                 int AV79PrvNum ,
                                 GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> AV87SDTCompraProductoQuimicoAux ,
                                 GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> AV74SDTCompraProductoQuimico ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171YE2 ();
      GRID_nCurrentRecord = 0 ;
      rf1YE2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"OrdenCompraProveedor");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV109Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ordencompraproveedor:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_29_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1YE2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV109Pgmname = "OrdenCompraProveedor" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109Pgmname", AV109Pgmname);
      Gx_err = (short)(0) ;
      edtavSdtcompraproductoquimico__prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__prdnum_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__prdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__prdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__prdnom_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__prdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__prdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__prdexialm_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__prdcanpen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__prdcanpen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__prdcanpen_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__disponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__disponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__disponible_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__valdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__valdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__valdsc_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__valor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__valor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__valor_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1YE2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(29) ;
      /* Execute user event: Refresh */
      e171YE2 ();
      nGXsfl_29_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_292( ) ;
      bGXsfl_29_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_292( ) ;
         e181YE2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_29_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e181YE2 ();
         }
         wbEnd = (short)(29) ;
         wb1YE0( ) ;
      }
      bGXsfl_29_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1YE2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV28OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vORDEREDBY", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV28OrderedBy), "ZZZ9")));
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
      return AV74SDTCompraProductoQuimico.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
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
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV109Pgmname = "OrdenCompraProveedor" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109Pgmname", AV109Pgmname);
      Gx_err = (short)(0) ;
      edtavSdtcompraproductoquimico__prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__prdnum_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__prdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__prdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__prdnom_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__prdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__prdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__prdexialm_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__prdcanpen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__prdcanpen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__prdcanpen_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__disponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__disponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__disponible_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__valdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__valdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__valdsc_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavSdtcompraproductoquimico__valor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__valor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__valor_Enabled), 5, 0), !bGXsfl_29_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1YE0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161YE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtcompraproductoquimico"), AV74SDTCompraProductoQuimico);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV12DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTCOMPRAPRODUCTOQUIMICO"), AV74SDTCompraProductoQuimico);
         /* Read saved values. */
         nRC_GXsfl_29 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_29"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV78Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV78Emprcod") ;
         wcpOAV79PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV79PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         nRC_GXsfl_29 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_29"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_29_fel_idx = 0 ;
         while ( nGXsfl_29_fel_idx < nRC_GXsfl_29 )
         {
            nGXsfl_29_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_29_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_29_fel_idx+1) ;
            sGXsfl_29_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_292( ) ;
            AV99GXV1 = nGXsfl_29_fel_idx ;
            if ( ( AV74SDTCompraProductoQuimico.size() >= AV99GXV1 ) && ( AV99GXV1 > 0 ) )
            {
               AV74SDTCompraProductoQuimico.currentItem( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)) );
            }
         }
         if ( nGXsfl_29_fel_idx == 0 )
         {
            nGXsfl_29_idx = 1 ;
            sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_292( ) ;
         }
         nGXsfl_29_fel_idx = 1 ;
         /* Read variables values. */
         AV89PrdNum_Sel = httpContext.cgiGet( edtavPrdnum_sel_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89PrdNum_Sel", AV89PrdNum_Sel);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPedcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPedcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDCOD");
            GX_FocusControl = edtavPedcod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV80PedCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80PedCod), 8, 0));
         }
         else
         {
            AV80PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavPedcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80PedCod), 8, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPedtot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPedtot_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDTOT");
            GX_FocusControl = edtavPedtot_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5PedTot = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5PedTot", GXutil.ltrimstr( AV5PedTot, 12, 2));
         }
         else
         {
            AV5PedTot = localUtil.ctond( httpContext.cgiGet( edtavPedtot_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5PedTot", GXutil.ltrimstr( AV5PedTot, 12, 2));
         }
         AV109Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109Pgmname", AV109Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"OrdenCompraProveedor");
         AV109Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109Pgmname", AV109Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV109Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ordencompraproveedor:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e161YE2 ();
      if (returnInSub) return;
   }

   public void e161YE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV110Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ordencompraproveedor_impl.this.GXt_char1 = GXv_char2[0] ;
      AV110Station = GXt_char1 ;
      GXv_char2[0] = AV78Emprcod ;
      GXv_char3[0] = AV111Emprnom ;
      GXv_char4[0] = AV112Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV110Station, GXv_char2, GXv_char3, GXv_char4) ;
      ordencompraproveedor_impl.this.AV78Emprcod = GXv_char2[0] ;
      ordencompraproveedor_impl.this.AV111Emprnom = GXv_char3[0] ;
      ordencompraproveedor_impl.this.AV112Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Emprcod", AV78Emprcod);
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      if ( AV28OrderedBy < 1 )
      {
         AV28OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28OrderedBy), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vORDEREDBY", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV28OrderedBy), "ZZZ9")));
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV12DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV12DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      GXt_objcol_SdtSDTCompraProductoQuimico_Item7 = AV74SDTCompraProductoQuimico ;
      GXv_objcol_SdtSDTCompraProductoQuimico_Item8[0] = GXt_objcol_SdtSDTCompraProductoQuimico_Item7 ;
      new app.dpcompraproductoquimico(remoteHandle, context).execute( AV78Emprcod, AV79PrvNum, AV89PrdNum_Sel, AV94PrdNom_Sel, GXv_objcol_SdtSDTCompraProductoQuimico_Item8) ;
      GXt_objcol_SdtSDTCompraProductoQuimico_Item7 = GXv_objcol_SdtSDTCompraProductoQuimico_Item8[0] ;
      AV74SDTCompraProductoQuimico = GXt_objcol_SdtSDTCompraProductoQuimico_Item7 ;
      gx_BV29 = true ;
      AV87SDTCompraProductoQuimicoAux = AV74SDTCompraProductoQuimico ;
      AV86Websession.setValue("SDTCompraProductoQuimico", AV74SDTCompraProductoQuimico.toJSonString(false));
      GXv_int9[0] = AV10Copias ;
      new app.pbuscon(remoteHandle, context).execute( AV78Emprcod, httpContext.getMessage( "COPCAR", ""), GXv_int9) ;
      ordencompraproveedor_impl.this.AV10Copias = (short)((short)(GXv_int9[0])) ;
      AV10Copias = (short)(((AV10Copias==0) ? 1 : AV10Copias)) ;
   }

   public void e171YE2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV65WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV65WWPContext = GXv_SdtWWPContext10[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV74SDTCompraProductoQuimico", AV74SDTCompraProductoQuimico);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV87SDTCompraProductoQuimicoAux", AV87SDTCompraProductoQuimicoAux);
   }

   public void e121YE2( )
   {
      AV99GXV1 = nGXsfl_29_idx ;
      if ( ( AV99GXV1 > 0 ) && ( AV74SDTCompraProductoQuimico.size() >= AV99GXV1 ) )
      {
         AV74SDTCompraProductoQuimico.currentItem( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)) );
      }
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( 1 == 2 )
      {
         if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
         {
            if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SDTCompraProductoQuimico__PrdNum") == 0 )
            {
               AV84TFSDTCompraProductoQuimico__PrdNum = Ddo_grid_Filteredtext_get ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFSDTCompraProductoQuimico__PrdNum", AV84TFSDTCompraProductoQuimico__PrdNum);
               AV85TFSDTCompraProductoQuimico__PrdNum_Sel = Ddo_grid_Selectedvalue_get ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFSDTCompraProductoQuimico__PrdNum_Sel", AV85TFSDTCompraProductoQuimico__PrdNum_Sel);
            }
            else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SDTCompraProductoQuimico__PrdNom") == 0 )
            {
               AV95TFSDTCompraProductoQuimico__PrdNom = Ddo_grid_Filteredtext_get ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFSDTCompraProductoQuimico__PrdNom", AV95TFSDTCompraProductoQuimico__PrdNom);
               AV96TFSDTCompraProductoQuimico__PrdNom_Sel = Ddo_grid_Selectedvalue_get ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFSDTCompraProductoQuimico__PrdNom_Sel", AV96TFSDTCompraProductoQuimico__PrdNom_Sel);
            }
            subgrid_firstpage( ) ;
         }
      }
      if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SDTCompraProductoQuimico__PrdNum") == 0 )
         {
            AV84TFSDTCompraProductoQuimico__PrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFSDTCompraProductoQuimico__PrdNum", AV84TFSDTCompraProductoQuimico__PrdNum);
            AV85TFSDTCompraProductoQuimico__PrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFSDTCompraProductoQuimico__PrdNum_Sel", AV85TFSDTCompraProductoQuimico__PrdNum_Sel);
            /* Execute user subroutine: 'LOADGRIDAFTER' */
            S142 ();
            if (returnInSub) return;
            AV89PrdNum_Sel = "" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89PrdNum_Sel", AV89PrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SDTCompraProductoQuimico__PrdNom") == 0 )
         {
            AV95TFSDTCompraProductoQuimico__PrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFSDTCompraProductoQuimico__PrdNom", AV95TFSDTCompraProductoQuimico__PrdNom);
            AV96TFSDTCompraProductoQuimico__PrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFSDTCompraProductoQuimico__PrdNom_Sel", AV96TFSDTCompraProductoQuimico__PrdNom_Sel);
            /* Execute user subroutine: 'LOADGRIDAFTER' */
            S142 ();
            if (returnInSub) return;
            AV94PrdNom_Sel = "" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94PrdNom_Sel", AV94PrdNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV87SDTCompraProductoQuimicoAux", AV87SDTCompraProductoQuimicoAux);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV74SDTCompraProductoQuimico", AV74SDTCompraProductoQuimico);
      nGXsfl_29_bak_idx = nGXsfl_29_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
      nGXsfl_29_idx = nGXsfl_29_bak_idx ;
      sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_292( ) ;
   }

   private void e181YE2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV99GXV1 = 1 ;
      while ( AV99GXV1 <= AV74SDTCompraProductoQuimico.size() )
      {
         AV74SDTCompraProductoQuimico.currentItem( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)) );
         edtavSdtcompraproductoquimico__cantidad_Backcolor = GXutil.getColor( 0, 255, 0) ;
         edtavSdtcompraproductoquimico__cantidad_Forecolor = GXutil.getColor( 0, 0, 0) ;
         edtavSdtcompraproductoquimico__prdpreact_Backcolor = GXutil.getColor( 0, 255, 0) ;
         edtavSdtcompraproductoquimico__prdpreact_Forecolor = GXutil.getColor( 0, 0, 0) ;
         if ( ! ( GXutil.roundDecimal( ((app.SdtSDTCompraProductoQuimico_Item)(AV74SDTCompraProductoQuimico.currentItem())).getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad().multiply(((app.SdtSDTCompraProductoQuimico_Item)(AV74SDTCompraProductoQuimico.currentItem())).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact()), 2).doubleValue() > 0 ) )
         {
            edtavSdtcompraproductoquimico__valor_Backcolor = GXutil.getColor( 255, 255, 0) ;
            edtavSdtcompraproductoquimico__valor_Forecolor = GXutil.getColor( 0, 0, 0) ;
         }
         else
         {
            edtavSdtcompraproductoquimico__valor_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavSdtcompraproductoquimico__valor_Forecolor = GXutil.getColor( 0, 0, 0) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(29) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_292( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_29_Refreshing )
         {
            httpContext.doAjaxLoad(29, GridRow);
         }
         AV99GXV1 = (int)(AV99GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e141YE2( )
   {
      /* 'DoImprimir' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webseleccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV78Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV80PedCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(AV5PedTot))}, new String[] {"EmprCod","PedCod","PedTot"}) , new Object[] {"AV80PedCod","AV5PedTot"});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      if ( gx_BV29 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV74SDTCompraProductoQuimico", AV74SDTCompraProductoQuimico);
         nGXsfl_29_bak_idx = nGXsfl_29_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
         nGXsfl_29_idx = nGXsfl_29_bak_idx ;
         sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_292( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV87SDTCompraProductoQuimicoAux", AV87SDTCompraProductoQuimicoAux);
   }

   public void e131YE2( )
   {
      AV99GXV1 = nGXsfl_29_idx ;
      if ( ( AV99GXV1 > 0 ) && ( AV74SDTCompraProductoQuimico.size() >= AV99GXV1 ) )
      {
         AV74SDTCompraProductoQuimico.currentItem( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)) );
      }
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV74SDTCompraProductoQuimico", AV74SDTCompraProductoQuimico);
      nGXsfl_29_bak_idx = nGXsfl_29_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
      nGXsfl_29_idx = nGXsfl_29_bak_idx ;
      sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_292( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV87SDTCompraProductoQuimicoAux", AV87SDTCompraProductoQuimicoAux);
   }

   public void e151YE2( )
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

   public void S132( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      if ( ( ! (GXutil.strcmp("", AV84TFSDTCompraProductoQuimico__PrdNum)==0) || ! (GXutil.strcmp("", AV85TFSDTCompraProductoQuimico__PrdNum_Sel)==0) ) || ( ! (GXutil.strcmp("", AV95TFSDTCompraProductoQuimico__PrdNom)==0) || ! (GXutil.strcmp("", AV96TFSDTCompraProductoQuimico__PrdNom_Sel)==0) ) )
      {
         /* Execute user subroutine: 'LOADGRIDAFTER' */
         S142 ();
         if (returnInSub) return;
         AV89PrdNum_Sel = ((GXutil.strcmp("", AV85TFSDTCompraProductoQuimico__PrdNum_Sel)==0) ? AV84TFSDTCompraProductoQuimico__PrdNum : AV85TFSDTCompraProductoQuimico__PrdNum_Sel) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89PrdNum_Sel", AV89PrdNum_Sel);
         AV94PrdNom_Sel = ((GXutil.strcmp("", AV96TFSDTCompraProductoQuimico__PrdNom_Sel)==0) ? AV95TFSDTCompraProductoQuimico__PrdNom : AV96TFSDTCompraProductoQuimico__PrdNom_Sel) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94PrdNom_Sel", AV94PrdNom_Sel);
         GXt_objcol_SdtSDTCompraProductoQuimico_Item7 = AV74SDTCompraProductoQuimico ;
         GXv_objcol_SdtSDTCompraProductoQuimico_Item8[0] = GXt_objcol_SdtSDTCompraProductoQuimico_Item7 ;
         new app.dpcompraproductoquimico(remoteHandle, context).execute( AV78Emprcod, AV79PrvNum, AV89PrdNum_Sel, AV94PrdNom_Sel, GXv_objcol_SdtSDTCompraProductoQuimico_Item8) ;
         GXt_objcol_SdtSDTCompraProductoQuimico_Item7 = GXv_objcol_SdtSDTCompraProductoQuimico_Item8[0] ;
         AV74SDTCompraProductoQuimico = GXt_objcol_SdtSDTCompraProductoQuimico_Item7 ;
         gx_BV29 = true ;
         AV85TFSDTCompraProductoQuimico__PrdNum_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFSDTCompraProductoQuimico__PrdNum_Sel", AV85TFSDTCompraProductoQuimico__PrdNum_Sel);
         AV84TFSDTCompraProductoQuimico__PrdNum = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFSDTCompraProductoQuimico__PrdNum", AV84TFSDTCompraProductoQuimico__PrdNum);
         AV95TFSDTCompraProductoQuimico__PrdNom = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFSDTCompraProductoQuimico__PrdNom", AV95TFSDTCompraProductoQuimico__PrdNom);
         AV96TFSDTCompraProductoQuimico__PrdNom_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFSDTCompraProductoQuimico__PrdNom_Sel", AV96TFSDTCompraProductoQuimico__PrdNom_Sel);
      }
   }

   public void S152( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      GXt_int11 = AV80PedCod ;
      GXv_int9[0] = GXt_int11 ;
      new app.pset_compraproductoquimico(remoteHandle, context).execute( AV74SDTCompraProductoQuimico, AV78Emprcod, AV79PrvNum, GXv_int9) ;
      ordencompraproveedor_impl.this.GXt_int11 = GXv_int9[0] ;
      AV80PedCod = GXt_int11 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80PedCod), 8, 0));
      httpContext.popup(formatLink("app.tpedobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV78Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV80PedCod,8,0))}, new String[] {"Mode","EmprCod","PedCod"}) , new Object[] {});
      httpContext.popup(formatLink("app.tpedido_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV78Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV80PedCod,8,0))}, new String[] {"Mode","EmprCod","PedCod"}) , new Object[] {});
      httpContext.popup(formatLink("app.rmod001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV78Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV80PedCod,8,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(DecimalUtil.decToString(AV64ValorTotal))}, new String[] {"EmprCod","PedCod","ImpCod","TotPed"}) , new Object[] {"","AV64ValorTotal"});
      Gx_msg = httpContext.getMessage( "Generado el pedido Nº ", "") + GXutil.str( AV80PedCod, 8, 0) ;
      httpContext.GX_msglist.addItem(Gx_msg);
      GXt_objcol_SdtSDTCompraProductoQuimico_Item7 = AV74SDTCompraProductoQuimico ;
      GXv_objcol_SdtSDTCompraProductoQuimico_Item8[0] = GXt_objcol_SdtSDTCompraProductoQuimico_Item7 ;
      new app.dpcompraproductoquimico(remoteHandle, context).execute( AV78Emprcod, AV79PrvNum, AV89PrdNum_Sel, AV94PrdNom_Sel, GXv_objcol_SdtSDTCompraProductoQuimico_Item8) ;
      GXt_objcol_SdtSDTCompraProductoQuimico_Item7 = GXv_objcol_SdtSDTCompraProductoQuimico_Item8[0] ;
      AV74SDTCompraProductoQuimico = GXt_objcol_SdtSDTCompraProductoQuimico_Item7 ;
      gx_BV29 = true ;
      AV87SDTCompraProductoQuimicoAux = AV74SDTCompraProductoQuimico ;
      /* Execute user subroutine: 'LOADGRIDAFTER' */
      S142 ();
      if (returnInSub) return;
      AV86Websession.setValue("SDTCompraProductoQuimico", AV74SDTCompraProductoQuimico.toJSonString(false));
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV42Session.getValue(AV109Pgmname+"GridState"), "") == 0 )
      {
         AV18GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV109Pgmname+"GridState"), null, null);
      }
      else
      {
         AV18GridState.fromxml(AV42Session.getValue(AV109Pgmname+"GridState"), null, null);
      }
      AV28OrderedBy = AV18GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28OrderedBy), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vORDEREDBY", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV28OrderedBy), "ZZZ9")));
      AV114GXV11 = 1 ;
      while ( AV114GXV11 <= AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV11));
         if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM") == 0 )
         {
            AV84TFSDTCompraProductoQuimico__PrdNum = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFSDTCompraProductoQuimico__PrdNum", AV84TFSDTCompraProductoQuimico__PrdNum);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL") == 0 )
         {
            AV85TFSDTCompraProductoQuimico__PrdNum_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFSDTCompraProductoQuimico__PrdNum_Sel", AV85TFSDTCompraProductoQuimico__PrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM") == 0 )
         {
            AV95TFSDTCompraProductoQuimico__PrdNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFSDTCompraProductoQuimico__PrdNom", AV95TFSDTCompraProductoQuimico__PrdNom);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL") == 0 )
         {
            AV96TFSDTCompraProductoQuimico__PrdNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96TFSDTCompraProductoQuimico__PrdNom_Sel", AV96TFSDTCompraProductoQuimico__PrdNom_Sel);
         }
         AV114GXV11 = (int)(AV114GXV11+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV85TFSDTCompraProductoQuimico__PrdNum_Sel)==0), AV85TFSDTCompraProductoQuimico__PrdNum_Sel, GXv_char4) ;
      ordencompraproveedor_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV96TFSDTCompraProductoQuimico__PrdNom_Sel)==0), AV96TFSDTCompraProductoQuimico__PrdNom_Sel, GXv_char3) ;
      ordencompraproveedor_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFSDTCompraProductoQuimico__PrdNum)==0), AV84TFSDTCompraProductoQuimico__PrdNum, GXv_char4) ;
      ordencompraproveedor_impl.this.GXt_char12 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV95TFSDTCompraProductoQuimico__PrdNom)==0), AV95TFSDTCompraProductoQuimico__PrdNom, GXv_char3) ;
      ordencompraproveedor_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char12+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV18GridState.fromxml(AV42Session.getValue(AV109Pgmname+"GridState"), null, null);
      AV18GridState.setgxTv_SdtWWPGridState_Orderedby( AV28OrderedBy );
      AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState13[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM", "", !(GXutil.strcmp("", AV84TFSDTCompraProductoQuimico__PrdNum)==0), (short)(0), AV84TFSDTCompraProductoQuimico__PrdNum, "", !(GXutil.strcmp("", AV85TFSDTCompraProductoQuimico__PrdNum_Sel)==0), AV85TFSDTCompraProductoQuimico__PrdNum_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM", "", !(GXutil.strcmp("", AV95TFSDTCompraProductoQuimico__PrdNom)==0), (short)(0), AV95TFSDTCompraProductoQuimico__PrdNom, "", !(GXutil.strcmp("", AV96TFSDTCompraProductoQuimico__PrdNom_Sel)==0), AV96TFSDTCompraProductoQuimico__PrdNom_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState13[0] ;
      if ( ! (GXutil.strcmp("", AV78Emprcod)==0) )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV78Emprcod );
         AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV19GridStateFilterValue, 0);
      }
      if ( ! (0==AV79PrvNum) )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUM" );
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV79PrvNum, 6, 0) );
         AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV19GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV109Pgmname+"GridState", AV18GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e191YE2( )
   {
      AV99GXV1 = nGXsfl_29_idx ;
      if ( ( AV99GXV1 > 0 ) && ( AV74SDTCompraProductoQuimico.size() >= AV99GXV1 ) )
      {
         AV74SDTCompraProductoQuimico.currentItem( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)) );
      }
      /* Sdtcompraproductoquimico__cantidad_Controlvaluechanged Routine */
      returnInSub = false ;
      AV37PrdPreAct = ((app.SdtSDTCompraProductoQuimico_Item)(AV74SDTCompraProductoQuimico.currentItem())).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact() ;
      ((app.SdtSDTCompraProductoQuimico_Item)(AV74SDTCompraProductoQuimico.currentItem())).setgxTv_SdtSDTCompraProductoQuimico_Item_Valor( GXutil.roundDecimal( ((app.SdtSDTCompraProductoQuimico_Item)(AV74SDTCompraProductoQuimico.currentItem())).getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad().multiply(AV37PrdPreAct), 2) );
      edtavSdtcompraproductoquimico__valor_Backcolor = (!(GXutil.roundDecimal( ((app.SdtSDTCompraProductoQuimico_Item)(AV74SDTCompraProductoQuimico.currentItem())).getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad().multiply(AV37PrdPreAct), 2).doubleValue()>0) ? GXutil.getColor( 255, 255, 0) : GXutil.getColor( 0, 255, 0)) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__valor_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__valor_Backcolor), 9, 0), !bGXsfl_29_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV74SDTCompraProductoQuimico", AV74SDTCompraProductoQuimico);
      nGXsfl_29_bak_idx = nGXsfl_29_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
      nGXsfl_29_idx = nGXsfl_29_bak_idx ;
      sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_292( ) ;
   }

   public void e201YE2( )
   {
      AV99GXV1 = nGXsfl_29_idx ;
      if ( ( AV99GXV1 > 0 ) && ( AV74SDTCompraProductoQuimico.size() >= AV99GXV1 ) )
      {
         AV74SDTCompraProductoQuimico.currentItem( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)) );
      }
      /* Sdtcompraproductoquimico__prdpreact_Controlvaluechanged Routine */
      returnInSub = false ;
      AV37PrdPreAct = ((app.SdtSDTCompraProductoQuimico_Item)(AV74SDTCompraProductoQuimico.currentItem())).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact() ;
      ((app.SdtSDTCompraProductoQuimico_Item)(AV74SDTCompraProductoQuimico.currentItem())).setgxTv_SdtSDTCompraProductoQuimico_Item_Valor( GXutil.roundDecimal( ((app.SdtSDTCompraProductoQuimico_Item)(AV74SDTCompraProductoQuimico.currentItem())).getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad().multiply(AV37PrdPreAct), 2) );
      edtavSdtcompraproductoquimico__valor_Backcolor = (!(GXutil.roundDecimal( ((app.SdtSDTCompraProductoQuimico_Item)(AV74SDTCompraProductoQuimico.currentItem())).getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad().multiply(AV37PrdPreAct), 2).doubleValue()>0) ? GXutil.getColor( 255, 255, 0) : GXutil.getColor( 0, 255, 0)) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtcompraproductoquimico__valor_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtcompraproductoquimico__valor_Backcolor), 9, 0), !bGXsfl_29_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV74SDTCompraProductoQuimico", AV74SDTCompraProductoQuimico);
      nGXsfl_29_bak_idx = nGXsfl_29_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV109Pgmname, AV28OrderedBy, AV84TFSDTCompraProductoQuimico__PrdNum, AV85TFSDTCompraProductoQuimico__PrdNum_Sel, AV95TFSDTCompraProductoQuimico__PrdNom, AV96TFSDTCompraProductoQuimico__PrdNom_Sel, AV78Emprcod, AV79PrvNum, AV87SDTCompraProductoQuimicoAux, AV74SDTCompraProductoQuimico, sPrefix) ;
      nGXsfl_29_idx = nGXsfl_29_bak_idx ;
      sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_292( ) ;
   }

   public void S142( )
   {
      /* 'LOADGRIDAFTER' Routine */
      returnInSub = false ;
      AV64ValorTotal = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64ValorTotal", GXutil.ltrimstr( AV64ValorTotal, 12, 2));
      AV87SDTCompraProductoQuimicoAux.sort("PrdNum");
      AV74SDTCompraProductoQuimico.sort("PrdNum");
      gx_BV29 = true ;
      AV115GXV12 = 1 ;
      while ( AV115GXV12 <= AV87SDTCompraProductoQuimicoAux.size() )
      {
         AV92SDTCompraProductoQuimicoAuxItem = (app.SdtSDTCompraProductoQuimico_Item)((app.SdtSDTCompraProductoQuimico_Item)AV87SDTCompraProductoQuimicoAux.elementAt(-1+AV115GXV12));
         AV116GXV13 = 1 ;
         while ( AV116GXV13 <= AV74SDTCompraProductoQuimico.size() )
         {
            AV88SDTCompraProductoQuimicoItem = (app.SdtSDTCompraProductoQuimico_Item)((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV116GXV13));
            if ( GXutil.strcmp(AV88SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum(), AV92SDTCompraProductoQuimicoAuxItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum()) == 0 )
            {
               AV92SDTCompraProductoQuimicoAuxItem.setgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad( AV88SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad() );
               AV92SDTCompraProductoQuimicoAuxItem.setgxTv_SdtSDTCompraProductoQuimico_Item_Disponible( AV88SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Disponible() );
               AV92SDTCompraProductoQuimicoAuxItem.setgxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen( AV88SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen() );
               AV92SDTCompraProductoQuimicoAuxItem.setgxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm( AV88SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm() );
               AV92SDTCompraProductoQuimicoAuxItem.setgxTv_SdtSDTCompraProductoQuimico_Item_Prdnom( AV88SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnom() );
               AV92SDTCompraProductoQuimicoAuxItem.setgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact( AV88SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact() );
               AV92SDTCompraProductoQuimicoAuxItem.setgxTv_SdtSDTCompraProductoQuimico_Item_Valdsc( AV88SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Valdsc() );
               AV92SDTCompraProductoQuimicoAuxItem.setgxTv_SdtSDTCompraProductoQuimico_Item_Valor( AV88SDTCompraProductoQuimicoItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Valor() );
            }
            AV116GXV13 = (int)(AV116GXV13+1) ;
         }
         AV64ValorTotal = AV64ValorTotal.add((AV92SDTCompraProductoQuimicoAuxItem.getgxTv_SdtSDTCompraProductoQuimico_Item_Valor())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64ValorTotal", GXutil.ltrimstr( AV64ValorTotal, 12, 2));
         AV115GXV12 = (int)(AV115GXV12+1) ;
      }
      AV74SDTCompraProductoQuimico = AV87SDTCompraProductoQuimicoAux ;
      gx_BV29 = true ;
      lblValorstring_Caption = httpContext.getMessage( "<H1> Total : ", "")+localUtil.format( AV64ValorTotal, "ZZZZZZZZ9.99")+httpContext.getMessage( "</h1>", "") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblValorstring_Internalname, "Caption", lblValorstring_Caption, true);
   }

   public void wb_table2_80_1YE2( boolean wbgen )
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
         wb_table2_80_1YE2e( true) ;
      }
      else
      {
         wb_table2_80_1YE2e( false) ;
      }
   }

   public void wb_table1_24_1YE2( boolean wbgen )
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
         wb_table1_24_1YE2e( true) ;
      }
      else
      {
         wb_table1_24_1YE2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV78Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Emprcod", AV78Emprcod);
      AV79PrvNum = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79PrvNum), 6, 0));
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
      pa1YE2( ) ;
      ws1YE2( ) ;
      we1YE2( ) ;
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
      sCtrlAV78Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV79PrvNum = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1YE2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ordencompraproveedor", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1YE2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV78Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Emprcod", AV78Emprcod);
         AV79PrvNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79PrvNum), 6, 0));
      }
      wcpOAV78Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV78Emprcod") ;
      wcpOAV79PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV79PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV78Emprcod, wcpOAV78Emprcod) != 0 ) || ( AV79PrvNum != wcpOAV79PrvNum ) ) )
      {
         setjustcreated();
      }
      wcpOAV78Emprcod = AV78Emprcod ;
      wcpOAV79PrvNum = AV79PrvNum ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV78Emprcod = httpContext.cgiGet( sPrefix+"AV78Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV78Emprcod) > 0 )
      {
         AV78Emprcod = httpContext.cgiGet( sCtrlAV78Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Emprcod", AV78Emprcod);
      }
      else
      {
         AV78Emprcod = httpContext.cgiGet( sPrefix+"AV78Emprcod_PARM") ;
      }
      sCtrlAV79PrvNum = httpContext.cgiGet( sPrefix+"AV79PrvNum_CTRL") ;
      if ( GXutil.len( sCtrlAV79PrvNum) > 0 )
      {
         AV79PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV79PrvNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79PrvNum), 6, 0));
      }
      else
      {
         AV79PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV79PrvNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1YE2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1YE2( ) ;
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
      ws1YE2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78Emprcod_PARM", GXutil.rtrim( AV78Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV78Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78Emprcod_CTRL", GXutil.rtrim( sCtrlAV78Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV79PrvNum_PARM", GXutil.ltrim( localUtil.ntoc( AV79PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV79PrvNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV79PrvNum_CTRL", GXutil.rtrim( sCtrlAV79PrvNum));
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
      we1YE2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610746", true, true);
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
      httpContext.AddJavascriptSource("ordencompraproveedor.js", "?20268211610746", false, true);
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

   public void subsflControlProps_292( )
   {
      edtavSdtcompraproductoquimico__prdnum_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDNUM_"+sGXsfl_29_idx ;
      edtavSdtcompraproductoquimico__prdnom_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDNOM_"+sGXsfl_29_idx ;
      edtavSdtcompraproductoquimico__prdexialm_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDEXIALM_"+sGXsfl_29_idx ;
      edtavSdtcompraproductoquimico__prdcanpen_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDCANPEN_"+sGXsfl_29_idx ;
      edtavSdtcompraproductoquimico__disponible_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__DISPONIBLE_"+sGXsfl_29_idx ;
      edtavSdtcompraproductoquimico__valdsc_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__VALDSC_"+sGXsfl_29_idx ;
      edtavSdtcompraproductoquimico__cantidad_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__CANTIDAD_"+sGXsfl_29_idx ;
      edtavSdtcompraproductoquimico__prdpreact_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDPREACT_"+sGXsfl_29_idx ;
      edtavSdtcompraproductoquimico__valor_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__VALOR_"+sGXsfl_29_idx ;
   }

   public void subsflControlProps_fel_292( )
   {
      edtavSdtcompraproductoquimico__prdnum_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDNUM_"+sGXsfl_29_fel_idx ;
      edtavSdtcompraproductoquimico__prdnom_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDNOM_"+sGXsfl_29_fel_idx ;
      edtavSdtcompraproductoquimico__prdexialm_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDEXIALM_"+sGXsfl_29_fel_idx ;
      edtavSdtcompraproductoquimico__prdcanpen_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDCANPEN_"+sGXsfl_29_fel_idx ;
      edtavSdtcompraproductoquimico__disponible_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__DISPONIBLE_"+sGXsfl_29_fel_idx ;
      edtavSdtcompraproductoquimico__valdsc_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__VALDSC_"+sGXsfl_29_fel_idx ;
      edtavSdtcompraproductoquimico__cantidad_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__CANTIDAD_"+sGXsfl_29_fel_idx ;
      edtavSdtcompraproductoquimico__prdpreact_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDPREACT_"+sGXsfl_29_fel_idx ;
      edtavSdtcompraproductoquimico__valor_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__VALOR_"+sGXsfl_29_fel_idx ;
   }

   public void sendrow_292( )
   {
      subsflControlProps_292( ) ;
      wb1YE0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_29_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_29_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_29_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtcompraproductoquimico__prdnum_Internalname,GXutil.rtrim( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtcompraproductoquimico__prdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtcompraproductoquimico__prdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtcompraproductoquimico__prdnom_Internalname,GXutil.rtrim( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtcompraproductoquimico__prdnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtcompraproductoquimico__prdnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtcompraproductoquimico__prdexialm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtcompraproductoquimico__prdexialm_Enabled!=0) ? localUtil.format( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm(), "ZZZZZZ9.9999") : localUtil.format( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm(), "ZZZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtcompraproductoquimico__prdexialm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtcompraproductoquimico__prdexialm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtcompraproductoquimico__prdcanpen_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtcompraproductoquimico__prdcanpen_Enabled!=0) ? localUtil.format( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen(), "ZZZZZZ9.9999") : localUtil.format( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen(), "ZZZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtcompraproductoquimico__prdcanpen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtcompraproductoquimico__prdcanpen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtcompraproductoquimico__disponible_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Disponible(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtcompraproductoquimico__disponible_Enabled!=0) ? localUtil.format( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Disponible(), "ZZZZZZ9.9999") : localUtil.format( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Disponible(), "ZZZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtcompraproductoquimico__disponible_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtcompraproductoquimico__disponible_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtcompraproductoquimico__valdsc_Internalname,GXutil.rtrim( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Valdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtcompraproductoquimico__valdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtcompraproductoquimico__valdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavSdtcompraproductoquimico__cantidad_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSdtcompraproductoquimico__cantidad_Enabled!=0)&&(edtavSdtcompraproductoquimico__cantidad_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 36,'"+sPrefix+"',false,'"+sGXsfl_29_idx+"',29)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtcompraproductoquimico__cantidad_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad(), "ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavSdtcompraproductoquimico__cantidad_Enabled!=0)&&(edtavSdtcompraproductoquimico__cantidad_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,36);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtcompraproductoquimico__cantidad_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavSdtcompraproductoquimico__cantidad_Forecolor)+";"+((edtavSdtcompraproductoquimico__cantidad_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavSdtcompraproductoquimico__cantidad_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavSdtcompraproductoquimico__prdpreact_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSdtcompraproductoquimico__prdpreact_Enabled!=0)&&(edtavSdtcompraproductoquimico__prdpreact_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 37,'"+sPrefix+"',false,'"+sGXsfl_29_idx+"',29)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtcompraproductoquimico__prdpreact_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact(), (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact(), "ZZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavSdtcompraproductoquimico__prdpreact_Enabled!=0)&&(edtavSdtcompraproductoquimico__prdpreact_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,37);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtcompraproductoquimico__prdpreact_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavSdtcompraproductoquimico__prdpreact_Forecolor)+";"+((edtavSdtcompraproductoquimico__prdpreact_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavSdtcompraproductoquimico__prdpreact_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavSdtcompraproductoquimico__valor_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtcompraproductoquimico__valor_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Valor(), (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtcompraproductoquimico__valor_Enabled!=0) ? localUtil.format( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Valor(), "ZZZZZZZ9.99") : localUtil.format( ((app.SdtSDTCompraProductoQuimico_Item)AV74SDTCompraProductoQuimico.elementAt(-1+AV99GXV1)).getgxTv_SdtSDTCompraProductoQuimico_Item_Valor(), "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtcompraproductoquimico__valor_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavSdtcompraproductoquimico__valor_Forecolor)+";"+((edtavSdtcompraproductoquimico__valor_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavSdtcompraproductoquimico__valor_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtcompraproductoquimico__valor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1YE2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_29_idx = ((subGrid_Islastpage==1)&&(nGXsfl_29_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_29_idx+1) ;
         sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_292( ) ;
      }
      /* End function sendrow_292 */
   }

   public void startgridcontrol29( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"29\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pendiente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__prdnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__prdexialm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__prdcanpen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__disponible_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__valdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__cantidad_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__cantidad_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__prdpreact_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__prdpreact_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__valor_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__valor_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtcompraproductoquimico__valor_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      edtavSdtcompraproductoquimico__prdnum_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDNUM" ;
      edtavSdtcompraproductoquimico__prdnom_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDNOM" ;
      edtavSdtcompraproductoquimico__prdexialm_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDEXIALM" ;
      edtavSdtcompraproductoquimico__prdcanpen_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDCANPEN" ;
      edtavSdtcompraproductoquimico__disponible_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__DISPONIBLE" ;
      edtavSdtcompraproductoquimico__valdsc_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__VALDSC" ;
      edtavSdtcompraproductoquimico__cantidad_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__CANTIDAD" ;
      edtavSdtcompraproductoquimico__prdpreact_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__PRDPREACT" ;
      edtavSdtcompraproductoquimico__valor_Internalname = sPrefix+"SDTCOMPRAPRODUCTOQUIMICO__VALOR" ;
      lblValorstring_Internalname = sPrefix+"VALORSTRING" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtavPrdnum_sel_Internalname = sPrefix+"vPRDNUM_SEL" ;
      edtavPedcod_Internalname = sPrefix+"vPEDCOD" ;
      edtavPedtot_Internalname = sPrefix+"vPEDTOT" ;
      divTablehidden_Internalname = sPrefix+"TABLEHIDDEN" ;
      lblTbexplicar_Internalname = sPrefix+"TBEXPLICAR" ;
      bttBtnimprimir_Internalname = sPrefix+"BTNIMPRIMIR" ;
      divTableinvisible_Internalname = sPrefix+"TABLEINVISIBLE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_confirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtavSdtcompraproductoquimico__valor_Jsonclick = "" ;
      edtavSdtcompraproductoquimico__valor_Forecolor = (int)(0x000000) ;
      edtavSdtcompraproductoquimico__valor_Enabled = 0 ;
      edtavSdtcompraproductoquimico__valor_Backcolor = -1 ;
      edtavSdtcompraproductoquimico__prdpreact_Jsonclick = "" ;
      edtavSdtcompraproductoquimico__prdpreact_Forecolor = (int)(0x000000) ;
      edtavSdtcompraproductoquimico__prdpreact_Visible = -1 ;
      edtavSdtcompraproductoquimico__prdpreact_Enabled = 1 ;
      edtavSdtcompraproductoquimico__prdpreact_Backcolor = -1 ;
      edtavSdtcompraproductoquimico__cantidad_Jsonclick = "" ;
      edtavSdtcompraproductoquimico__cantidad_Forecolor = (int)(0x000000) ;
      edtavSdtcompraproductoquimico__cantidad_Visible = -1 ;
      edtavSdtcompraproductoquimico__cantidad_Enabled = 1 ;
      edtavSdtcompraproductoquimico__cantidad_Backcolor = -1 ;
      edtavSdtcompraproductoquimico__valdsc_Jsonclick = "" ;
      edtavSdtcompraproductoquimico__valdsc_Enabled = 0 ;
      edtavSdtcompraproductoquimico__disponible_Jsonclick = "" ;
      edtavSdtcompraproductoquimico__disponible_Enabled = 0 ;
      edtavSdtcompraproductoquimico__prdcanpen_Jsonclick = "" ;
      edtavSdtcompraproductoquimico__prdcanpen_Enabled = 0 ;
      edtavSdtcompraproductoquimico__prdexialm_Jsonclick = "" ;
      edtavSdtcompraproductoquimico__prdexialm_Enabled = 0 ;
      edtavSdtcompraproductoquimico__prdnom_Jsonclick = "" ;
      edtavSdtcompraproductoquimico__prdnom_Enabled = 0 ;
      edtavSdtcompraproductoquimico__prdnum_Jsonclick = "" ;
      edtavSdtcompraproductoquimico__prdnum_Enabled = 0 ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavSdtcompraproductoquimico__valor_Enabled = -1 ;
      edtavSdtcompraproductoquimico__valdsc_Enabled = -1 ;
      edtavSdtcompraproductoquimico__disponible_Enabled = -1 ;
      edtavSdtcompraproductoquimico__prdcanpen_Enabled = -1 ;
      edtavSdtcompraproductoquimico__prdexialm_Enabled = -1 ;
      edtavSdtcompraproductoquimico__prdnom_Enabled = -1 ;
      edtavSdtcompraproductoquimico__prdnum_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavPedtot_Jsonclick = "" ;
      edtavPedtot_Enabled = 1 ;
      edtavPedcod_Jsonclick = "" ;
      edtavPedcod_Enabled = 1 ;
      edtavPrdnum_sel_Jsonclick = "" ;
      edtavPrdnum_sel_Enabled = 1 ;
      lblValorstring_Caption = "0,00" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma la Orden de Compra?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_grid_Datalistproc = "OrdenCompraProveedorGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T" ;
      Ddo_grid_Filtertype = "Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Columnssortvalues = "|" ;
      Ddo_grid_Columnids = "0:SDTCompraProductoQuimico__PrdNum|1:SDTCompraProductoQuimico__PrdNom" ;
      Ddo_grid_Gridinternalname = "" ;
      subGrid_Rows = 50 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV78Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9',hsh:true},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV89PrdNum_Sel',fld:'vPRDNUM_SEL',pic:''},{av:'AV94PrdNom_Sel',fld:'vPRDNOM_SEL',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV64ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e121YE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9',hsh:true},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV78Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV89PrdNum_Sel',fld:'vPRDNUM_SEL',pic:''},{av:'AV94PrdNom_Sel',fld:'vPRDNOM_SEL',pic:''},{av:'AV64ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181YE2',iparms:[{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29}]");
      setEventMetadata("GRID.LOAD",",oparms:[{ctrl:'SDTCOMPRAPRODUCTOQUIMICO__CANTIDAD',prop:'Backcolor'},{ctrl:'SDTCOMPRAPRODUCTOQUIMICO__CANTIDAD',prop:'Forecolor'},{ctrl:'SDTCOMPRAPRODUCTOQUIMICO__PRDPREACT',prop:'Backcolor'},{ctrl:'SDTCOMPRAPRODUCTOQUIMICO__PRDPREACT',prop:'Forecolor'},{ctrl:'SDTCOMPRAPRODUCTOQUIMICO__VALOR',prop:'Backcolor'},{ctrl:'SDTCOMPRAPRODUCTOQUIMICO__VALOR',prop:'Forecolor'}]}");
      setEventMetadata("'DOIMPRIMIR'","{handler:'e141YE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9',hsh:true},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV78Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'sPrefix'},{av:'AV80PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV5PedTot',fld:'vPEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'}]");
      setEventMetadata("'DOIMPRIMIR'",",oparms:[{av:'AV5PedTot',fld:'vPEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'},{av:'AV80PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV89PrdNum_Sel',fld:'vPRDNUM_SEL',pic:''},{av:'AV94PrdNom_Sel',fld:'vPRDNOM_SEL',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV64ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111YE1',iparms:[{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e131YE2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'AV78Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV64ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'AV89PrdNum_Sel',fld:'vPRDNUM_SEL',pic:''},{av:'AV94PrdNom_Sel',fld:'vPRDNOM_SEL',pic:''},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9',hsh:true},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV80PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV64ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e151YE2',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("SDTCOMPRAPRODUCTOQUIMICO__CANTIDAD.CONTROLVALUECHANGED","{handler:'e191YE2',iparms:[{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV78Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9',hsh:true},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("SDTCOMPRAPRODUCTOQUIMICO__CANTIDAD.CONTROLVALUECHANGED",",oparms:[{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{ctrl:'SDTCOMPRAPRODUCTOQUIMICO__VALOR',prop:'Backcolor'}]}");
      setEventMetadata("SDTCOMPRAPRODUCTOQUIMICO__PRDPREACT.CONTROLVALUECHANGED","{handler:'e201YE2',iparms:[{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV78Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9',hsh:true},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("SDTCOMPRAPRODUCTOQUIMICO__PRDPREACT.CONTROLVALUECHANGED",",oparms:[{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{ctrl:'SDTCOMPRAPRODUCTOQUIMICO__VALOR',prop:'Backcolor'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9',hsh:true},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV78Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV89PrdNum_Sel',fld:'vPRDNUM_SEL',pic:''},{av:'AV94PrdNom_Sel',fld:'vPRDNOM_SEL',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV64ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9',hsh:true},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV78Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV89PrdNum_Sel',fld:'vPRDNUM_SEL',pic:''},{av:'AV94PrdNom_Sel',fld:'vPRDNOM_SEL',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV64ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9',hsh:true},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV78Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV89PrdNum_Sel',fld:'vPRDNUM_SEL',pic:''},{av:'AV94PrdNom_Sel',fld:'vPRDNOM_SEL',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV64ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9',hsh:true},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV78Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV89PrdNum_Sel',fld:'vPRDNUM_SEL',pic:''},{av:'AV94PrdNom_Sel',fld:'vPRDNOM_SEL',pic:''},{av:'AV74SDTCompraProductoQuimico',fld:'vSDTCOMPRAPRODUCTOQUIMICO',grid:29,pic:''},{av:'nGXsfl_29_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:29},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_29',ctrl:'GRID',prop:'GridRC',grid:29},{av:'AV85TFSDTCompraProductoQuimico__PrdNum_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM_SEL',pic:''},{av:'AV84TFSDTCompraProductoQuimico__PrdNum',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNUM',pic:''},{av:'AV95TFSDTCompraProductoQuimico__PrdNom',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM',pic:''},{av:'AV96TFSDTCompraProductoQuimico__PrdNom_Sel',fld:'vTFSDTCOMPRAPRODUCTOQUIMICO__PRDNOM_SEL',pic:''},{av:'AV64ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'AV87SDTCompraProductoQuimicoAux',fld:'vSDTCOMPRAPRODUCTOQUIMICOAUX',pic:''},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv10',iparms:[]");
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
      wcpOAV78Emprcod = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV78Emprcod = "" ;
      AV109Pgmname = "" ;
      AV84TFSDTCompraProductoQuimico__PrdNum = "" ;
      AV85TFSDTCompraProductoQuimico__PrdNum_Sel = "" ;
      AV95TFSDTCompraProductoQuimico__PrdNom = "" ;
      AV96TFSDTCompraProductoQuimico__PrdNom_Sel = "" ;
      AV87SDTCompraProductoQuimicoAux = new GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item>(app.SdtSDTCompraProductoQuimico_Item.class, "Item", "TexplusNET", remoteHandle);
      AV74SDTCompraProductoQuimico = new GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item>(app.SdtSDTCompraProductoQuimico_Item.class, "Item", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV12DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV64ValorTotal = DecimalUtil.ZERO ;
      AV94PrdNom_Sel = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      lblValorstring_Jsonclick = "" ;
      AV89PrdNum_Sel = "" ;
      AV5PedTot = DecimalUtil.ZERO ;
      lblTbexplicar_Jsonclick = "" ;
      bttBtnimprimir_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      hsh = "" ;
      AV110Station = "" ;
      GXv_char2 = new String[1] ;
      AV111Emprnom = "" ;
      AV112Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV86Websession = httpContext.getWebSession();
      AV65WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_int9 = new int[1] ;
      Gx_msg = "" ;
      GXt_objcol_SdtSDTCompraProductoQuimico_Item7 = new GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item>(app.SdtSDTCompraProductoQuimico_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTCompraProductoQuimico_Item8 = new GXBaseCollection[1] ;
      AV42Session = httpContext.getWebSession();
      AV18GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState13 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV37PrdPreAct = DecimalUtil.ZERO ;
      AV92SDTCompraProductoQuimicoAuxItem = new app.SdtSDTCompraProductoQuimico_Item(remoteHandle, context);
      AV88SDTCompraProductoQuimicoItem = new app.SdtSDTCompraProductoQuimico_Item(remoteHandle, context);
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV78Emprcod = "" ;
      sCtrlAV79PrvNum = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV109Pgmname = "OrdenCompraProveedor" ;
      /* GeneXus formulas. */
      AV109Pgmname = "OrdenCompraProveedor" ;
      Gx_err = (short)(0) ;
      edtavSdtcompraproductoquimico__prdnum_Enabled = 0 ;
      edtavSdtcompraproductoquimico__prdnom_Enabled = 0 ;
      edtavSdtcompraproductoquimico__prdexialm_Enabled = 0 ;
      edtavSdtcompraproductoquimico__prdcanpen_Enabled = 0 ;
      edtavSdtcompraproductoquimico__disponible_Enabled = 0 ;
      edtavSdtcompraproductoquimico__valdsc_Enabled = 0 ;
      edtavSdtcompraproductoquimico__valor_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV28OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV10Copias ;
   private int wcpOAV79PrvNum ;
   private int nRC_GXsfl_29 ;
   private int AV79PrvNum ;
   private int subGrid_Rows ;
   private int nGXsfl_29_idx=1 ;
   private int AV99GXV1 ;
   private int edtavPrdnum_sel_Enabled ;
   private int AV80PedCod ;
   private int edtavPedcod_Enabled ;
   private int edtavPedtot_Enabled ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavSdtcompraproductoquimico__prdnum_Enabled ;
   private int edtavSdtcompraproductoquimico__prdnom_Enabled ;
   private int edtavSdtcompraproductoquimico__prdexialm_Enabled ;
   private int edtavSdtcompraproductoquimico__prdcanpen_Enabled ;
   private int edtavSdtcompraproductoquimico__disponible_Enabled ;
   private int edtavSdtcompraproductoquimico__valdsc_Enabled ;
   private int edtavSdtcompraproductoquimico__valor_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_29_fel_idx=1 ;
   private int nGXsfl_29_bak_idx=1 ;
   private int edtavSdtcompraproductoquimico__cantidad_Backcolor ;
   private int edtavSdtcompraproductoquimico__cantidad_Forecolor ;
   private int edtavSdtcompraproductoquimico__prdpreact_Backcolor ;
   private int edtavSdtcompraproductoquimico__prdpreact_Forecolor ;
   private int edtavSdtcompraproductoquimico__valor_Backcolor ;
   private int edtavSdtcompraproductoquimico__valor_Forecolor ;
   private int GXt_int11 ;
   private int GXv_int9[] ;
   private int AV114GXV11 ;
   private int AV115GXV12 ;
   private int AV116GXV13 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavSdtcompraproductoquimico__cantidad_Enabled ;
   private int edtavSdtcompraproductoquimico__cantidad_Visible ;
   private int edtavSdtcompraproductoquimico__prdpreact_Enabled ;
   private int edtavSdtcompraproductoquimico__prdpreact_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV64ValorTotal ;
   private java.math.BigDecimal AV5PedTot ;
   private java.math.BigDecimal AV37PrdPreAct ;
   private String wcpOAV78Emprcod ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV78Emprcod ;
   private String sGXsfl_29_idx="0001" ;
   private String AV109Pgmname ;
   private String AV84TFSDTCompraProductoQuimico__PrdNum ;
   private String AV85TFSDTCompraProductoQuimico__PrdNum_Sel ;
   private String AV95TFSDTCompraProductoQuimico__PrdNom ;
   private String AV96TFSDTCompraProductoQuimico__PrdNom_Sel ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV94PrdNom_Sel ;
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
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTableheader_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String divTableactions_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String lblValorstring_Internalname ;
   private String lblValorstring_Caption ;
   private String lblValorstring_Jsonclick ;
   private String divTablehidden_Internalname ;
   private String edtavPrdnum_sel_Internalname ;
   private String AV89PrdNum_Sel ;
   private String edtavPrdnum_sel_Jsonclick ;
   private String edtavPedcod_Internalname ;
   private String edtavPedcod_Jsonclick ;
   private String edtavPedtot_Internalname ;
   private String edtavPedtot_Jsonclick ;
   private String divTableinvisible_Internalname ;
   private String lblTbexplicar_Internalname ;
   private String lblTbexplicar_Jsonclick ;
   private String bttBtnimprimir_Internalname ;
   private String bttBtnimprimir_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String edtavSdtcompraproductoquimico__prdnum_Internalname ;
   private String edtavSdtcompraproductoquimico__prdnom_Internalname ;
   private String edtavSdtcompraproductoquimico__prdexialm_Internalname ;
   private String edtavSdtcompraproductoquimico__prdcanpen_Internalname ;
   private String edtavSdtcompraproductoquimico__disponible_Internalname ;
   private String edtavSdtcompraproductoquimico__valdsc_Internalname ;
   private String edtavSdtcompraproductoquimico__valor_Internalname ;
   private String sGXsfl_29_fel_idx="0001" ;
   private String hsh ;
   private String AV110Station ;
   private String GXv_char2[] ;
   private String AV111Emprnom ;
   private String AV112Usurcod ;
   private String Gx_msg ;
   private String GXt_char12 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV78Emprcod ;
   private String sCtrlAV79PrvNum ;
   private String edtavSdtcompraproductoquimico__cantidad_Internalname ;
   private String edtavSdtcompraproductoquimico__prdpreact_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSdtcompraproductoquimico__prdnum_Jsonclick ;
   private String edtavSdtcompraproductoquimico__prdnom_Jsonclick ;
   private String edtavSdtcompraproductoquimico__prdexialm_Jsonclick ;
   private String edtavSdtcompraproductoquimico__prdcanpen_Jsonclick ;
   private String edtavSdtcompraproductoquimico__disponible_Jsonclick ;
   private String edtavSdtcompraproductoquimico__valdsc_Jsonclick ;
   private String edtavSdtcompraproductoquimico__cantidad_Jsonclick ;
   private String edtavSdtcompraproductoquimico__prdpreact_Jsonclick ;
   private String edtavSdtcompraproductoquimico__valor_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_29_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV29 ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV42Session ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV86Websession ;
   private GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> AV87SDTCompraProductoQuimicoAux ;
   private GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> AV74SDTCompraProductoQuimico ;
   private GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> GXt_objcol_SdtSDTCompraProductoQuimico_Item7 ;
   private GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> GXv_objcol_SdtSDTCompraProductoQuimico_Item8[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV12DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV18GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState13[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV19GridStateFilterValue ;
   private app.SdtSDTCompraProductoQuimico_Item AV92SDTCompraProductoQuimicoAuxItem ;
   private app.SdtSDTCompraProductoQuimico_Item AV88SDTCompraProductoQuimicoItem ;
   private app.wwpbaseobjects.SdtWWPContext AV65WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
}

