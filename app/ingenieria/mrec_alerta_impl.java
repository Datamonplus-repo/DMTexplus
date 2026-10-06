package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_alerta_impl extends GXDataArea
{
   public mrec_alerta_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_alerta_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_alerta_impl.class ));
   }

   public mrec_alerta_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavFuerarango = UIFactory.getCheckbox(this);
      chkavDatos__mprecer = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Fsgrid1") == 0 )
         {
            gxnrfsgrid1_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Fsgrid1") == 0 )
         {
            gxgrfsgrid1_refresh_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridmrec_alertasdts") == 0 )
         {
            gxnrgridmrec_alertasdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridmrec_alertasdts") == 0 )
         {
            gxgrgridmrec_alertasdts_refresh_invoke( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrfsgrid1_newrow_invoke( )
   {
      nRC_GXsfl_109 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_109"))) ;
      nGXsfl_109_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_109_idx"))) ;
      sGXsfl_109_idx = httpContext.GetPar( "sGXsfl_109_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrfsgrid1_newrow( ) ;
      /* End function gxnrFsgrid1_newrow_invoke */
   }

   public void gxgrfsgrid1_refresh_invoke( )
   {
      subGridmrec_alertasdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridmrec_alertasdts_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV56MaqCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18FasCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV91Hdr);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV66ParFasCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV59Maquinas);
      AV21FueraRango = GXutil.strtobool( httpContext.GetPar( "FueraRango")) ;
      AV17EmprCod = httpContext.GetPar( "EmprCod") ;
      AV9ContCod = httpContext.GetPar( "ContCod") ;
      AV98MaqCodJSON = httpContext.GetPar( "MaqCodJSON") ;
      AV83FasCodJSON = httpContext.GetPar( "FasCodJSON") ;
      AV84HdrJSON = httpContext.GetPar( "HdrJSON") ;
      AV85ParFasCodJSON = httpContext.GetPar( "ParFasCodJSON") ;
      AV102UsurCod = httpContext.GetPar( "UsurCod") ;
      AV93Ip = httpContext.GetPar( "Ip") ;
      AV103Version = httpContext.GetPar( "Version") ;
      AV145Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrfsgrid1_refresh( subGridmrec_alertasdts_Rows, AV56MaqCod, AV18FasCod, AV91Hdr, AV66ParFasCod, AV59Maquinas, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrFsgrid1_refresh_invoke */
   }

   public void gxnrgridmrec_alertasdts_newrow_invoke( )
   {
      nRC_GXsfl_145 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_145"))) ;
      nGXsfl_145_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_145_idx"))) ;
      sGXsfl_145_idx = httpContext.GetPar( "sGXsfl_145_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridmrec_alertasdts_newrow( ) ;
      /* End function gxnrGridmrec_alertasdts_newrow_invoke */
   }

   public void gxgrgridmrec_alertasdts_refresh_invoke( )
   {
      subGridmrec_alertasdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridmrec_alertasdts_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV12Datos);
      AV21FueraRango = GXutil.strtobool( httpContext.GetPar( "FueraRango")) ;
      AV17EmprCod = httpContext.GetPar( "EmprCod") ;
      AV9ContCod = httpContext.GetPar( "ContCod") ;
      AV98MaqCodJSON = httpContext.GetPar( "MaqCodJSON") ;
      AV83FasCodJSON = httpContext.GetPar( "FasCodJSON") ;
      AV84HdrJSON = httpContext.GetPar( "HdrJSON") ;
      AV85ParFasCodJSON = httpContext.GetPar( "ParFasCodJSON") ;
      AV102UsurCod = httpContext.GetPar( "UsurCod") ;
      AV93Ip = httpContext.GetPar( "Ip") ;
      AV103Version = httpContext.GetPar( "Version") ;
      AV145Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmrec_alertasdts_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa1WB2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WB2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Chronometer/ChronometerRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_alerta", new String[] {}, new String[] {}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV98MaqCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83FasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDRJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV84HdrJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85ParFasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERSION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV103Version, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MRec_Alerta");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV145Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alerta:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Maquinas", AV59Maquinas);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Maquinas", AV59Maquinas);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Datos", AV12Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Datos", AV12Datos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_109", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_109, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_145", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_145, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSEGUNDOS_DATA", AV100Segundos_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSEGUNDOS_DATA", AV100Segundos_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV57MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV57MaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV19FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV19FasCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vHDR_DATA", AV92Hdr_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vHDR_DATA", AV92Hdr_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD_DATA", AV67ParFasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD_DATA", AV67ParFasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDMREC_ALERTASDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV47GridMRec_AlertaSDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDMREC_ALERTASDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV48GridMRec_AlertaSDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDATOS", AV12Datos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDATOS", AV12Datos);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD", AV56MaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD", AV56MaqCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD", AV18FasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD", AV18FasCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vHDR", AV91Hdr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vHDR", AV91Hdr);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD", AV66ParFasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD", AV66ParFasCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQUINAS", AV59Maquinas);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQUINAS", AV59Maquinas);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV9ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODJSON", AV98MaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV98MaqCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCODJSON", AV83FasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83FasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHDRJSON", AV84HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDRJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV84HdrJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARFASCODJSON", AV85ParFasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85ParFasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDESDE", localUtil.ttoc( AV86Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASTA", localUtil.ttoc( AV89Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV102UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIP", AV93Ip);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOW", localUtil.ttoc( AV105Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vINFILTKN", AV111InFilTkn);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vCRONOMETROSTART", AV82CronometroStart);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vINFILSDT", AV107InFilSDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vINFILSDT", AV107InFilSDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRMAQCOD", GXutil.rtrim( A14693MEPrMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRFASCOD", GXutil.rtrim( A14691MEPrFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRHDR", GXutil.rtrim( A14697MEPrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRUSU", GXutil.rtrim( A14698MEPrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRIP", A14699MEPrIp);
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRREG", localUtil.ttoc( A14700MEPrReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRTKN", A14701MEPrTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "MEPROBJ", A14702MEPrObj);
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRPARCOD", GXutil.ltrim( localUtil.ntoc( A14695MEPrParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRPARDSC", GXutil.rtrim( A14696MEPrParDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRFASDSC", GXutil.rtrim( A14692MEPrFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRMAQDSC", GXutil.rtrim( A14694MEPrMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERSION", GXutil.rtrim( AV103Version));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERSION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV103Version, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Cls", GXutil.rtrim( Combo_segundos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Selectedvalue_set", GXutil.rtrim( Combo_segundos_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Selectedtext_set", GXutil.rtrim( Combo_segundos_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Emptyitem", GXutil.booltostr( Combo_segundos_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Allowmultipleselection", GXutil.booltostr( Combo_maqcod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_maqcod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Multiplevaluestype", GXutil.rtrim( Combo_maqcod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Emptyitemtext", GXutil.rtrim( Combo_maqcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_set", GXutil.rtrim( Combo_fascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Allowmultipleselection", GXutil.booltostr( Combo_fascod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_fascod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitem", GXutil.booltostr( Combo_fascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Multiplevaluestype", GXutil.rtrim( Combo_fascod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Cls", GXutil.rtrim( Combo_hdr_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Selectedvalue_set", GXutil.rtrim( Combo_hdr_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Allowmultipleselection", GXutil.booltostr( Combo_hdr_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Includeonlyselectedoption", GXutil.booltostr( Combo_hdr_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Emptyitem", GXutil.booltostr( Combo_hdr_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Multiplevaluestype", GXutil.rtrim( Combo_hdr_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Cls", GXutil.rtrim( Combo_parfascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_set", GXutil.rtrim( Combo_parfascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Allowmultipleselection", GXutil.booltostr( Combo_parfascod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_parfascod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Emptyitem", GXutil.booltostr( Combo_parfascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Multiplevaluestype", GXutil.rtrim( Combo_parfascod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "UC_CHROMETER_Tickinterval", GXutil.ltrim( localUtil.ntoc( Uc_chrometer_Tickinterval, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UC_CHROMETER_Visible", GXutil.booltostr( Uc_chrometer_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Width", GXutil.rtrim( Dvpanel_panelfiltros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Autowidth", GXutil.booltostr( Dvpanel_panelfiltros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Autoheight", GXutil.booltostr( Dvpanel_panelfiltros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Cls", GXutil.rtrim( Dvpanel_panelfiltros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Title", GXutil.rtrim( Dvpanel_panelfiltros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Collapsible", GXutil.booltostr( Dvpanel_panelfiltros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Collapsed", GXutil.booltostr( Dvpanel_panelfiltros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelfiltros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Iconposition", GXutil.rtrim( Dvpanel_panelfiltros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panelfiltros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Class", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridmrec_alertasdtspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Previous", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Next", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Caption", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Width", GXutil.rtrim( Dvpanel_panelgeneral_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Autowidth", GXutil.booltostr( Dvpanel_panelgeneral_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Autoheight", GXutil.booltostr( Dvpanel_panelgeneral_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Cls", GXutil.rtrim( Dvpanel_panelgeneral_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Title", GXutil.rtrim( Dvpanel_panelgeneral_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Collapsible", GXutil.booltostr( Dvpanel_panelgeneral_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Collapsed", GXutil.booltostr( Dvpanel_panelgeneral_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Showcollapseicon", GXutil.booltostr( Dvpanel_panelgeneral_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Iconposition", GXutil.rtrim( Dvpanel_panelgeneral_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Autoscroll", GXutil.booltostr( Dvpanel_panelgeneral_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs1_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Class", GXutil.rtrim( Gxuitabspanel_tabs1_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs1_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "VERERRRORMAQUINA_MODAL_Width", GXutil.rtrim( Vererrrormaquina_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "VERERRRORMAQUINA_MODAL_Title", GXutil.rtrim( Vererrrormaquina_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "VERERRRORMAQUINA_MODAL_Confirmtype", GXutil.rtrim( Vererrrormaquina_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "VERERRRORMAQUINA_MODAL_Bodytype", GXutil.rtrim( Vererrrormaquina_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridmrec_alertasdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "FSGRID1_Class", GXutil.rtrim( subFsgrid1_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "FSGRID1_Paged", GXutil.rtrim( subFsgrid1_Paged));
      app.GxWebStd.gx_hidden_field( httpContext, "FSGRID1_Showpagecontroller", GXutil.rtrim( subFsgrid1_Showpagecontroller));
      app.GxWebStd.gx_hidden_field( httpContext, "FSGRID1_Showarrows", GXutil.rtrim( subFsgrid1_Showarrows));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_get", GXutil.rtrim( Combo_parfascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Selectedvalue_get", GXutil.rtrim( Combo_hdr_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Selectedvalue_get", GXutil.rtrim( Combo_segundos_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridmrec_alertasdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Selectedvalue_get", GXutil.rtrim( Combo_hdr_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Selectedvalue_get", GXutil.rtrim( Combo_segundos_Selectedvalue_get));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
      if ( ! ( WebComp_Wcmrec_detalle == null ) )
      {
         WebComp_Wcmrec_detalle.componentjscripts();
      }
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1WB2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WB2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.ingenieria.mrec_alerta", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MRec_Alerta" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Alertas", "") ;
   }

   public void wb1WB0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelfiltros.setProperty("Width", Dvpanel_panelfiltros_Width);
         ucDvpanel_panelfiltros.setProperty("AutoWidth", Dvpanel_panelfiltros_Autowidth);
         ucDvpanel_panelfiltros.setProperty("AutoHeight", Dvpanel_panelfiltros_Autoheight);
         ucDvpanel_panelfiltros.setProperty("Cls", Dvpanel_panelfiltros_Cls);
         ucDvpanel_panelfiltros.setProperty("Title", Dvpanel_panelfiltros_Title);
         ucDvpanel_panelfiltros.setProperty("Collapsible", Dvpanel_panelfiltros_Collapsible);
         ucDvpanel_panelfiltros.setProperty("Collapsed", Dvpanel_panelfiltros_Collapsed);
         ucDvpanel_panelfiltros.setProperty("ShowCollapseIcon", Dvpanel_panelfiltros_Showcollapseicon);
         ucDvpanel_panelfiltros.setProperty("IconPosition", Dvpanel_panelfiltros_Iconposition);
         ucDvpanel_panelfiltros.setProperty("AutoScroll", Dvpanel_panelfiltros_Autoscroll);
         ucDvpanel_panelfiltros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelfiltros_Internalname, "DVPANEL_PANELFILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELFILTROSContainer"+"PanelFiltros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelfiltros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedsegundos_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_segundos_Internalname, httpContext.getMessage( "Intervalo ", ""), "", "", lblTextblockcombo_segundos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Alerta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_segundos.setProperty("Caption", Combo_segundos_Caption);
         ucCombo_segundos.setProperty("Cls", Combo_segundos_Cls);
         ucCombo_segundos.setProperty("EmptyItem", Combo_segundos_Emptyitem);
         ucCombo_segundos.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_segundos.setProperty("DropDownOptionsData", AV100Segundos_Data);
         ucCombo_segundos.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_segundos_Internalname, "COMBO_SEGUNDOSContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Máquina(s)", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Alerta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("AllowMultipleSelection", Combo_maqcod_Allowmultipleselection);
         ucCombo_maqcod.setProperty("IncludeOnlySelectedOption", Combo_maqcod_Includeonlyselectedoption);
         ucCombo_maqcod.setProperty("MultipleValuesType", Combo_maqcod_Multiplevaluestype);
         ucCombo_maqcod.setProperty("EmptyItemText", Combo_maqcod_Emptyitemtext);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV57MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fascod_Internalname, httpContext.getMessage( "Fase(s)", ""), "", "", lblTextblockcombo_fascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Alerta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
         ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
         ucCombo_fascod.setProperty("AllowMultipleSelection", Combo_fascod_Allowmultipleselection);
         ucCombo_fascod.setProperty("IncludeOnlySelectedOption", Combo_fascod_Includeonlyselectedoption);
         ucCombo_fascod.setProperty("EmptyItem", Combo_fascod_Emptyitem);
         ucCombo_fascod.setProperty("MultipleValuesType", Combo_fascod_Multiplevaluestype);
         ucCombo_fascod.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_fascod.setProperty("DropDownOptionsData", AV19FasCod_Data);
         ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedhdr_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_hdr_Internalname, httpContext.getMessage( "Hdr(s)", ""), "", "", lblTextblockcombo_hdr_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Alerta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_hdr.setProperty("Caption", Combo_hdr_Caption);
         ucCombo_hdr.setProperty("Cls", Combo_hdr_Cls);
         ucCombo_hdr.setProperty("AllowMultipleSelection", Combo_hdr_Allowmultipleselection);
         ucCombo_hdr.setProperty("IncludeOnlySelectedOption", Combo_hdr_Includeonlyselectedoption);
         ucCombo_hdr.setProperty("EmptyItem", Combo_hdr_Emptyitem);
         ucCombo_hdr.setProperty("MultipleValuesType", Combo_hdr_Multiplevaluestype);
         ucCombo_hdr.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_hdr.setProperty("DropDownOptionsData", AV92Hdr_Data);
         ucCombo_hdr.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_hdr_Internalname, "COMBO_HDRContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedparfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_parfascod_Internalname, httpContext.getMessage( "Parámetro(s)", ""), "", "", lblTextblockcombo_parfascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Alerta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_parfascod.setProperty("Caption", Combo_parfascod_Caption);
         ucCombo_parfascod.setProperty("Cls", Combo_parfascod_Cls);
         ucCombo_parfascod.setProperty("AllowMultipleSelection", Combo_parfascod_Allowmultipleselection);
         ucCombo_parfascod.setProperty("IncludeOnlySelectedOption", Combo_parfascod_Includeonlyselectedoption);
         ucCombo_parfascod.setProperty("EmptyItem", Combo_parfascod_Emptyitem);
         ucCombo_parfascod.setProperty("MultipleValuesType", Combo_parfascod_Multiplevaluestype);
         ucCombo_parfascod.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_parfascod.setProperty("DropDownOptionsData", AV67ParFasCod_Data);
         ucCombo_parfascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parfascod_Internalname, "COMBO_PARFASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavFuerarango.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavFuerarango.getInternalname(), httpContext.getMessage( "Error", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavFuerarango.getInternalname(), GXutil.booltostr( AV21FueraRango), "", httpContext.getMessage( "Error", ""), 1, chkavFuerarango.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(61, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,61);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop30", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblActualizar_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fas fa-search fa-3x\"></i>", ""), "", "", lblActualizar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOACTUALIZAR\\'."+"'", "", lblActualizar_Class, 5, httpContext.getMessage( "Actualizar resultados...", ""), 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Alerta.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablerango_Internalname, divTablerango_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDesdefechahora_Internalname, httpContext.getMessage( "Desde Fecha Hora", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDesdefechahora_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDesdefechahora_Internalname, localUtil.ttoc( AV87DesdeFechaHora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV87DesdeFechaHora, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDesdefechahora_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDesdefechahora_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_Alerta.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDesdefechahora_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDesdefechahora_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRec_Alerta.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHastafechahora_Internalname, httpContext.getMessage( "Hasta Fecha Hora", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHastafechahora_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHastafechahora_Internalname, localUtil.ttoc( AV90HastaFechaHora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV90HastaFechaHora, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHastafechahora_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHastafechahora_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_Alerta.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHastafechahora_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHastafechahora_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRec_Alerta.htm");
         httpContext.writeTextNL( "</div>") ;
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
         wb_table1_76_1WB2( true) ;
      }
      else
      {
         wb_table1_76_1WB2( false) ;
      }
      return  ;
   }

   public void wb_table1_76_1WB2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUc_chrometer.render(context, "wwp.chronometer", Uc_chrometer_Internalname, "UC_CHROMETERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarraprogreso.render(context, "gxprogressindicator", Barraprogreso_Internalname, "BARRAPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_tabs1.setProperty("PageCount", Gxuitabspanel_tabs1_Pagecount);
         ucGxuitabspanel_tabs1.setProperty("Class", Gxuitabspanel_tabs1_Class);
         ucGxuitabspanel_tabs1.setProperty("HistoryManagement", Gxuitabspanel_tabs1_Historymanagement);
         ucGxuitabspanel_tabs1.render(context, "tab", Gxuitabspanel_tabs1_Internalname, "GXUITABSPANEL_TABS1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabgeneral_title_Internalname, httpContext.getMessage( "Alerta", ""), "", "", lblTabgeneral_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Alerta.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabGeneral") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegeneral_Internalname, divTablegeneral_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelgeneral.setProperty("Width", Dvpanel_panelgeneral_Width);
         ucDvpanel_panelgeneral.setProperty("AutoWidth", Dvpanel_panelgeneral_Autowidth);
         ucDvpanel_panelgeneral.setProperty("AutoHeight", Dvpanel_panelgeneral_Autoheight);
         ucDvpanel_panelgeneral.setProperty("Cls", Dvpanel_panelgeneral_Cls);
         ucDvpanel_panelgeneral.setProperty("Title", Dvpanel_panelgeneral_Title);
         ucDvpanel_panelgeneral.setProperty("Collapsible", Dvpanel_panelgeneral_Collapsible);
         ucDvpanel_panelgeneral.setProperty("Collapsed", Dvpanel_panelgeneral_Collapsed);
         ucDvpanel_panelgeneral.setProperty("ShowCollapseIcon", Dvpanel_panelgeneral_Showcollapseicon);
         ucDvpanel_panelgeneral.setProperty("IconPosition", Dvpanel_panelgeneral_Iconposition);
         ucDvpanel_panelgeneral.setProperty("AutoScroll", Dvpanel_panelgeneral_Autoscroll);
         ucDvpanel_panelgeneral.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelgeneral_Internalname, "DVPANEL_PANELGENERALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELGENERALContainer"+"PanelGeneral"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelgeneral_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTitulogeneral_Internalname, lblTitulogeneral_Caption, "", "", lblTitulogeneral_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Alerta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemaquinas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Fsgrid1Container.SetIsFreestyle(true);
         Fsgrid1Container.SetWrapped(nGXWrapped);
         startgridcontrol109( ) ;
      }
      if ( wbEnd == 109 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_109 = (int)(nGXsfl_109_idx-1) ;
         if ( Fsgrid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV124GXV1 = nGXsfl_109_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Fsgrid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Fsgrid1", Fsgrid1Container, subFsgrid1_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Fsgrid1ContainerData", Fsgrid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Fsgrid1ContainerData"+"V", Fsgrid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Fsgrid1ContainerData"+"V"+"\" value='"+Fsgrid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridmrec_alertasdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridmrec_alertasdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol145( ) ;
      }
      if ( wbEnd == 145 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_145 = (int)(nGXsfl_145_idx-1) ;
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV126GXV3 = nGXsfl_145_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridmrec_alertasdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridmrec_alertasdts", Gridmrec_alertasdtsContainer, subGridmrec_alertasdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridmrec_alertasdtsContainerData", Gridmrec_alertasdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridmrec_alertasdtsContainerData"+"V", Gridmrec_alertasdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridmrec_alertasdtsContainerData"+"V"+"\" value='"+Gridmrec_alertasdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridmrec_alertasdtspaginationbar.setProperty("Class", Gridmrec_alertasdtspaginationbar_Class);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowFirst", Gridmrec_alertasdtspaginationbar_Showfirst);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowPrevious", Gridmrec_alertasdtspaginationbar_Showprevious);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowNext", Gridmrec_alertasdtspaginationbar_Shownext);
         ucGridmrec_alertasdtspaginationbar.setProperty("ShowLast", Gridmrec_alertasdtspaginationbar_Showlast);
         ucGridmrec_alertasdtspaginationbar.setProperty("PagesToShow", Gridmrec_alertasdtspaginationbar_Pagestoshow);
         ucGridmrec_alertasdtspaginationbar.setProperty("PagingButtonsPosition", Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition);
         ucGridmrec_alertasdtspaginationbar.setProperty("PagingCaptionPosition", Gridmrec_alertasdtspaginationbar_Pagingcaptionposition);
         ucGridmrec_alertasdtspaginationbar.setProperty("EmptyGridClass", Gridmrec_alertasdtspaginationbar_Emptygridclass);
         ucGridmrec_alertasdtspaginationbar.setProperty("RowsPerPageSelector", Gridmrec_alertasdtspaginationbar_Rowsperpageselector);
         ucGridmrec_alertasdtspaginationbar.setProperty("RowsPerPageOptions", Gridmrec_alertasdtspaginationbar_Rowsperpageoptions);
         ucGridmrec_alertasdtspaginationbar.setProperty("Previous", Gridmrec_alertasdtspaginationbar_Previous);
         ucGridmrec_alertasdtspaginationbar.setProperty("Next", Gridmrec_alertasdtspaginationbar_Next);
         ucGridmrec_alertasdtspaginationbar.setProperty("Caption", Gridmrec_alertasdtspaginationbar_Caption);
         ucGridmrec_alertasdtspaginationbar.setProperty("EmptyGridCaption", Gridmrec_alertasdtspaginationbar_Emptygridcaption);
         ucGridmrec_alertasdtspaginationbar.setProperty("RowsPerPageCaption", Gridmrec_alertasdtspaginationbar_Rowsperpagecaption);
         ucGridmrec_alertasdtspaginationbar.setProperty("CurrentPage", AV47GridMRec_AlertaSDTsCurrentPage);
         ucGridmrec_alertasdtspaginationbar.setProperty("PageCount", AV48GridMRec_AlertaSDTsPageCount);
         ucGridmrec_alertasdtspaginationbar.render(context, "dvelop.dvpaginationbar", Gridmrec_alertasdtspaginationbar_Internalname, "GRIDMREC_ALERTASDTSPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabdetalle_title_Internalname, httpContext.getMessage( "Detalle", ""), "", "", lblTabdetalle_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Alerta.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabDetalle") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabletabdetalle_Internalname, divTabletabdetalle_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemasdetalles_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0178"+"", GXutil.rtrim( WebComp_Wcmrec_detalle_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0178"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_109_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcmrec_detalle_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcmrec_detalle), GXutil.lower( WebComp_Wcmrec_detalle_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0178"+"");
                  }
                  WebComp_Wcmrec_detalle.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcmrec_detalle), GXutil.lower( WebComp_Wcmrec_detalle_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV145Pgmname), GXutil.rtrim( localUtil.format( AV145Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_Alerta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamon.render(context, "datamonjs", Datamon_Internalname, "DATAMONContainer");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSegundos_Internalname, GXutil.ltrim( localUtil.ntoc( AV69Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV69Segundos), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSegundos_Jsonclick, 0, "Attribute", "", "", "", "", edtavSegundos_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_Alerta.htm");
         wb_table2_190_1WB2( true) ;
      }
      else
      {
         wb_table2_190_1WB2( false) ;
      }
      return  ;
   }

   public void wb_table2_190_1WB2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGridmrec_alertasdts_empowerer.render(context, "wwp.gridempowerer", Gridmrec_alertasdts_empowerer_Internalname, "GRIDMREC_ALERTASDTS_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0197"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0197"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_109_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0197"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
            if ( Fsgrid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV124GXV1 = nGXsfl_109_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Fsgrid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Fsgrid1", Fsgrid1Container, subFsgrid1_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Fsgrid1ContainerData", Fsgrid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Fsgrid1ContainerData"+"V", Fsgrid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Fsgrid1ContainerData"+"V"+"\" value='"+Fsgrid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 145 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV126GXV3 = nGXsfl_145_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridmrec_alertasdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridmrec_alertasdts", Gridmrec_alertasdtsContainer, subGridmrec_alertasdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridmrec_alertasdtsContainerData", Gridmrec_alertasdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridmrec_alertasdtsContainerData"+"V", Gridmrec_alertasdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridmrec_alertasdtsContainerData"+"V"+"\" value='"+Gridmrec_alertasdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1WB2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Alertas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WB0( ) ;
   }

   public void ws1WB2( )
   {
      start1WB2( ) ;
      evt1WB2( ) ;
   }

   public void evt1WB2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_SEGUNDOS.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_MAQCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_FASCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_HDR.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "UC_CHROMETER.TICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOACTUALIZAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoActualizar' */
                           e181WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSEGUNDOS.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e191WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDESDEFECHAHORA.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e201WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VHASTAFECHAHORA.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e211WB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "FSGRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_109_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1092( ) ;
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Width = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Width", Dvpanel_unnamedtable1_Width);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoWidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoHeight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Cls", Dvpanel_unnamedtable1_Cls);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Title = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Title", Dvpanel_unnamedtable1_Title);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "ShowCollapseIcon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "IconPosition", Dvpanel_unnamedtable1_Iconposition);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoScroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
                           AV124GXV1 = nGXsfl_109_idx ;
                           if ( ( AV59Maquinas.size() >= AV124GXV1 ) && ( AV124GXV1 > 0 ) )
                           {
                              AV59Maquinas.currentItem( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV59Maquinas.elementAt(-1+AV124GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e221WB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e231WB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "FSGRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e241WB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 24), "GRIDMREC_ALERTASDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "VDETALLELINEA.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "VDETALLELINEA.CLICK") == 0 ) )
                        {
                           nGXsfl_145_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_145_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_145_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1453( ) ;
                           AV126GXV3 = (int)(nGXsfl_145_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
                           if ( ( AV12Datos.size() >= AV126GXV3 ) && ( AV126GXV3 > 0 ) )
                           {
                              AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)) );
                              AV88DetalleLinea = httpContext.cgiGet( edtavDetallelinea_Internalname) ;
                              httpContext.ajax_rsp_assign_prop("", false, edtavDetallelinea_Internalname, "Bitmap", ((GXutil.strcmp("", AV88DetalleLinea)==0) ? AV146Detallelinea_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV88DetalleLinea))), !bGXsfl_145_Refreshing);
                              httpContext.ajax_rsp_assign_prop("", false, edtavDetallelinea_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV88DetalleLinea), true);
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRIDMREC_ALERTASDTS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e251WB3 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VDETALLELINEA.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e261WB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 178 )
                     {
                        OldWcmrec_detalle = httpContext.cgiGet( "W0178") ;
                        if ( ( GXutil.len( OldWcmrec_detalle) == 0 ) || ( GXutil.strcmp(OldWcmrec_detalle, WebComp_Wcmrec_detalle_Component) != 0 ) )
                        {
                           WebComp_Wcmrec_detalle = WebUtils.getWebComponent(getClass(), "app." + OldWcmrec_detalle + "_impl", remoteHandle, context);
                           WebComp_Wcmrec_detalle_Component = OldWcmrec_detalle ;
                        }
                        if ( GXutil.len( WebComp_Wcmrec_detalle_Component) != 0 )
                        {
                           WebComp_Wcmrec_detalle.componentprocess("W0178", "", sEvt);
                        }
                        WebComp_Wcmrec_detalle_Component = OldWcmrec_detalle ;
                     }
                     else if ( nCmpId == 197 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0197") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0197", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1WB2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa1WB2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = chkavFuerarango.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrfsgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1092( ) ;
      while ( nGXsfl_109_idx <= nRC_GXsfl_109 )
      {
         sendrow_1092( ) ;
         nGXsfl_109_idx = ((subFsgrid1_Islastpage==1)&&(nGXsfl_109_idx+1>subfsgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_109_idx+1) ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Fsgrid1Container)) ;
      /* End function gxnrFsgrid1_newrow */
   }

   public void gxnrgridmrec_alertasdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1453( ) ;
      while ( nGXsfl_145_idx <= nRC_GXsfl_145 )
      {
         sendrow_1453( ) ;
         nGXsfl_145_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_145_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_145_idx+1) ;
         sGXsfl_145_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_145_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1453( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridmrec_alertasdtsContainer)) ;
      /* End function gxnrGridmrec_alertasdts_newrow */
   }

   public void gxgrfsgrid1_refresh( int subGridmrec_alertasdts_Rows ,
                                    GXSimpleCollection<String> AV56MaqCod ,
                                    GXSimpleCollection<String> AV18FasCod ,
                                    GXSimpleCollection<String> AV91Hdr ,
                                    GXSimpleCollection<Short> AV66ParFasCod ,
                                    GXBaseCollection<app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item> AV59Maquinas ,
                                    boolean AV21FueraRango ,
                                    String AV17EmprCod ,
                                    String AV9ContCod ,
                                    String AV98MaqCodJSON ,
                                    String AV83FasCodJSON ,
                                    String AV84HdrJSON ,
                                    String AV85ParFasCodJSON ,
                                    String AV102UsurCod ,
                                    String AV93Ip ,
                                    String AV103Version ,
                                    String AV145Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e231WB2 ();
      FSGRID1_nCurrentRecord = 0 ;
      rf1WB2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MRec_Alerta");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV145Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alerta:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrFsgrid1_refresh */
   }

   public void gxgrgridmrec_alertasdts_refresh( int subGridmrec_alertasdts_Rows ,
                                                GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV12Datos ,
                                                boolean AV21FueraRango ,
                                                String AV17EmprCod ,
                                                String AV9ContCod ,
                                                String AV98MaqCodJSON ,
                                                String AV83FasCodJSON ,
                                                String AV84HdrJSON ,
                                                String AV85ParFasCodJSON ,
                                                String AV102UsurCod ,
                                                String AV93Ip ,
                                                String AV103Version ,
                                                String AV145Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e231WB2 ();
      GRIDMREC_ALERTASDTS_nCurrentRecord = 0 ;
      rf1WB3( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MRec_Alerta");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV145Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alerta:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGridmrec_alertasdts_refresh */
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
      AV21FueraRango = GXutil.strtobool( GXutil.booltostr( AV21FueraRango)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21FueraRango", AV21FueraRango);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1WB2( ) ;
      rf1WB3( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV145Pgmname = "Ingenieria.MRec_Alerta" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV145Pgmname", AV145Pgmname);
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__emprcod_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__menvord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__menvord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__menvord_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mreclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mreclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mreclin_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mprecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecfec_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcod_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodreo_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodpar_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqcod_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqdsc_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mprecplc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecplc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecplc_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fascod_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fasdsc_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfascod_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfasdsc_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mprecvalmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmn_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mprecval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecval_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mprecvalmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmx_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      chkavDatos__mprecer.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavDatos__mprecer.getInternalname(), "Enabled", GXutil.ltrimstr( chkavDatos__mprecer.getEnabled(), 5, 0), !bGXsfl_145_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Fsgrid1Container.ClearRows();
      }
      wbStart = (short)(109) ;
      /* Execute user event: Refresh */
      e231WB2 ();
      nGXsfl_109_idx = 1 ;
      sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1092( ) ;
      bGXsfl_109_Refreshing = true ;
      Fsgrid1Container.AddObjectProperty("GridName", "Fsgrid1");
      Fsgrid1Container.AddObjectProperty("CmpContext", "");
      Fsgrid1Container.AddObjectProperty("InMasterPage", "false");
      Fsgrid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      Fsgrid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Fsgrid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Fsgrid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Fsgrid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Fsgrid1Container.setPageSize( subfsgrid1_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcmrec_detalle_Component) != 0 )
            {
               WebComp_Wcmrec_detalle.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1092( ) ;
         e241WB2 ();
         wbEnd = (short)(109) ;
         wb1WB0( ) ;
      }
      bGXsfl_109_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1WB2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV9ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODJSON", AV98MaqCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV98MaqCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCODJSON", AV83FasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83FasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHDRJSON", AV84HdrJSON);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDRJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV84HdrJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARFASCODJSON", AV85ParFasCodJSON);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85ParFasCodJSON, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV102UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIP", AV93Ip);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERSION", GXutil.rtrim( AV103Version));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERSION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV103Version, ""))));
   }

   public void rf1WB3( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridmrec_alertasdtsContainer.ClearRows();
      }
      wbStart = (short)(145) ;
      nGXsfl_145_idx = 1 ;
      sGXsfl_145_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_145_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1453( ) ;
      bGXsfl_145_Refreshing = true ;
      Gridmrec_alertasdtsContainer.AddObjectProperty("GridName", "Gridmrec_alertasdts");
      Gridmrec_alertasdtsContainer.AddObjectProperty("CmpContext", "");
      Gridmrec_alertasdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridmrec_alertasdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      Gridmrec_alertasdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.setPageSize( subgridmrec_alertasdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1453( ) ;
         e251WB3 ();
         if ( ( GRIDMREC_ALERTASDTS_nCurrentRecord > 0 ) && ( GRIDMREC_ALERTASDTS_nGridOutOfScope == 0 ) && ( nGXsfl_145_idx == 1 ) )
         {
            GRIDMREC_ALERTASDTS_nCurrentRecord = 0 ;
            GRIDMREC_ALERTASDTS_nGridOutOfScope = 1 ;
            subgridmrec_alertasdts_firstpage( ) ;
            e251WB3 ();
         }
         wbEnd = (short)(145) ;
         wb1WB0( ) ;
      }
      bGXsfl_145_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1WB3( )
   {
   }

   public int subfsgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subfsgrid1_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subfsgrid1_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subfsgrid1_fnc_currentpage( )
   {
      return -1 ;
   }

   public int subgridmrec_alertasdts_fnc_pagecount( )
   {
      GRIDMREC_ALERTASDTS_nRecordCount = subgridmrec_alertasdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDMREC_ALERTASDTS_nRecordCount) % (subgridmrec_alertasdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDMREC_ALERTASDTS_nRecordCount/ (double) (subgridmrec_alertasdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDMREC_ALERTASDTS_nRecordCount/ (double) (subgridmrec_alertasdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridmrec_alertasdts_fnc_recordcount( )
   {
      return AV12Datos.size() ;
   }

   public int subgridmrec_alertasdts_fnc_recordsperpage( )
   {
      if ( subGridmrec_alertasdts_Rows > 0 )
      {
         return subGridmrec_alertasdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridmrec_alertasdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDMREC_ALERTASDTS_nFirstRecordOnPage/ (double) (subgridmrec_alertasdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridmrec_alertasdts_firstpage( )
   {
      GRIDMREC_ALERTASDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridmrec_alertasdts_nextpage( )
   {
      GRIDMREC_ALERTASDTS_nRecordCount = subgridmrec_alertasdts_fnc_recordcount( ) ;
      if ( ( GRIDMREC_ALERTASDTS_nRecordCount >= subgridmrec_alertasdts_fnc_recordsperpage( ) ) && ( GRIDMREC_ALERTASDTS_nEOF == 0 ) )
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nFirstRecordOnPage+subgridmrec_alertasdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridmrec_alertasdtsContainer.AddObjectProperty("GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GRIDMREC_ALERTASDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDMREC_ALERTASDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridmrec_alertasdts_previouspage( )
   {
      if ( GRIDMREC_ALERTASDTS_nFirstRecordOnPage >= subgridmrec_alertasdts_fnc_recordsperpage( ) )
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nFirstRecordOnPage-subgridmrec_alertasdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridmrec_alertasdts_lastpage( )
   {
      GRIDMREC_ALERTASDTS_nRecordCount = subgridmrec_alertasdts_fnc_recordcount( ) ;
      if ( GRIDMREC_ALERTASDTS_nRecordCount > subgridmrec_alertasdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDMREC_ALERTASDTS_nRecordCount) % (subgridmrec_alertasdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nRecordCount-subgridmrec_alertasdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(GRIDMREC_ALERTASDTS_nRecordCount-((int)((GRIDMREC_ALERTASDTS_nRecordCount) % (subgridmrec_alertasdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridmrec_alertasdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = (long)(subgridmrec_alertasdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV145Pgmname = "Ingenieria.MRec_Alerta" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV145Pgmname", AV145Pgmname);
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__emprcod_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__menvord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__menvord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__menvord_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mreclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mreclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mreclin_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mprecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecfec_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcod_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodreo_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__barcodpar_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqcod_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__maqdsc_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mprecplc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecplc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecplc_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fascod_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__fasdsc_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfascod_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__parfasdsc_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mprecvalmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmn_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mprecval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecval_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      edtavDatos__mprecvalmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDatos__mprecvalmx_Enabled), 5, 0), !bGXsfl_145_Refreshing);
      chkavDatos__mprecer.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavDatos__mprecer.getInternalname(), "Enabled", GXutil.ltrimstr( chkavDatos__mprecer.getEnabled(), 5, 0), !bGXsfl_145_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e221WB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Maquinas"), AV59Maquinas);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Datos"), AV12Datos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV13DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSEGUNDOS_DATA"), AV100Segundos_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV57MaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV19FasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vHDR_DATA"), AV92Hdr_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD_DATA"), AV67ParFasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDATOS"), AV12Datos);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD"), AV66ParFasCod);
         /* Read saved values. */
         nRC_GXsfl_109 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_109"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_145 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_145"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV47GridMRec_AlertaSDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDMREC_ALERTASDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV48GridMRec_AlertaSDTsPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDMREC_ALERTASDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV82CronometroStart = GXutil.strtobool( httpContext.cgiGet( "vCRONOMETROSTART")) ;
         AV111InFilTkn = httpContext.cgiGet( "vINFILTKN") ;
         AV105Now = localUtil.ctot( httpContext.cgiGet( "vNOW"), 0) ;
         AV93Ip = httpContext.cgiGet( "vIP") ;
         AV102UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         AV89Hasta = localUtil.ctot( httpContext.cgiGet( "vHASTA"), 0) ;
         AV86Desde = localUtil.ctot( httpContext.cgiGet( "vDESDE"), 0) ;
         AV85ParFasCodJSON = httpContext.cgiGet( "vPARFASCODJSON") ;
         AV84HdrJSON = httpContext.cgiGet( "vHDRJSON") ;
         AV83FasCodJSON = httpContext.cgiGet( "vFASCODJSON") ;
         AV98MaqCodJSON = httpContext.cgiGet( "vMAQCODJSON") ;
         AV9ContCod = httpContext.cgiGet( "vCONTCOD") ;
         AV17EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         GRIDMREC_ALERTASDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDMREC_ALERTASDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridmrec_alertasdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_segundos_Cls = httpContext.cgiGet( "COMBO_SEGUNDOS_Cls") ;
         Combo_segundos_Selectedvalue_set = httpContext.cgiGet( "COMBO_SEGUNDOS_Selectedvalue_set") ;
         Combo_segundos_Selectedtext_set = httpContext.cgiGet( "COMBO_SEGUNDOS_Selectedtext_set") ;
         Combo_segundos_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_SEGUNDOS_Emptyitem")) ;
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
         Combo_maqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Allowmultipleselection")) ;
         Combo_maqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Includeonlyselectedoption")) ;
         Combo_maqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_MAQCOD_Multiplevaluestype") ;
         Combo_maqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCOD_Emptyitemtext") ;
         Combo_fascod_Cls = httpContext.cgiGet( "COMBO_FASCOD_Cls") ;
         Combo_fascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_set") ;
         Combo_fascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Allowmultipleselection")) ;
         Combo_fascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeonlyselectedoption")) ;
         Combo_fascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Emptyitem")) ;
         Combo_fascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluestype") ;
         Combo_hdr_Cls = httpContext.cgiGet( "COMBO_HDR_Cls") ;
         Combo_hdr_Selectedvalue_set = httpContext.cgiGet( "COMBO_HDR_Selectedvalue_set") ;
         Combo_hdr_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_HDR_Allowmultipleselection")) ;
         Combo_hdr_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_HDR_Includeonlyselectedoption")) ;
         Combo_hdr_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_HDR_Emptyitem")) ;
         Combo_hdr_Multiplevaluestype = httpContext.cgiGet( "COMBO_HDR_Multiplevaluestype") ;
         Combo_parfascod_Cls = httpContext.cgiGet( "COMBO_PARFASCOD_Cls") ;
         Combo_parfascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_set") ;
         Combo_parfascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Allowmultipleselection")) ;
         Combo_parfascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeonlyselectedoption")) ;
         Combo_parfascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitem")) ;
         Combo_parfascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluestype") ;
         Uc_chrometer_Tickinterval = (int)(localUtil.ctol( httpContext.cgiGet( "UC_CHROMETER_Tickinterval"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Uc_chrometer_Visible = GXutil.strtobool( httpContext.cgiGet( "UC_CHROMETER_Visible")) ;
         Dvpanel_panelfiltros_Width = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Width") ;
         Dvpanel_panelfiltros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Autowidth")) ;
         Dvpanel_panelfiltros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Autoheight")) ;
         Dvpanel_panelfiltros_Cls = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Cls") ;
         Dvpanel_panelfiltros_Title = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Title") ;
         Dvpanel_panelfiltros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Collapsible")) ;
         Dvpanel_panelfiltros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Collapsed")) ;
         Dvpanel_panelfiltros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Showcollapseicon")) ;
         Dvpanel_panelfiltros_Iconposition = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Iconposition") ;
         Dvpanel_panelfiltros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Autoscroll")) ;
         Gridmrec_alertasdtspaginationbar_Class = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Class") ;
         Gridmrec_alertasdtspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showfirst")) ;
         Gridmrec_alertasdtspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showprevious")) ;
         Gridmrec_alertasdtspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Shownext")) ;
         Gridmrec_alertasdtspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Showlast")) ;
         Gridmrec_alertasdtspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridmrec_alertasdtspaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridmrec_alertasdtspaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridclass") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridmrec_alertasdtspaginationbar_Previous = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Previous") ;
         Gridmrec_alertasdtspaginationbar_Next = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Next") ;
         Gridmrec_alertasdtspaginationbar_Caption = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Caption") ;
         Gridmrec_alertasdtspaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Emptygridcaption") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_panelgeneral_Width = httpContext.cgiGet( "DVPANEL_PANELGENERAL_Width") ;
         Dvpanel_panelgeneral_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Autowidth")) ;
         Dvpanel_panelgeneral_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Autoheight")) ;
         Dvpanel_panelgeneral_Cls = httpContext.cgiGet( "DVPANEL_PANELGENERAL_Cls") ;
         Dvpanel_panelgeneral_Title = httpContext.cgiGet( "DVPANEL_PANELGENERAL_Title") ;
         Dvpanel_panelgeneral_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Collapsible")) ;
         Dvpanel_panelgeneral_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Collapsed")) ;
         Dvpanel_panelgeneral_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Showcollapseicon")) ;
         Dvpanel_panelgeneral_Iconposition = httpContext.cgiGet( "DVPANEL_PANELGENERAL_Iconposition") ;
         Dvpanel_panelgeneral_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Autoscroll")) ;
         Gxuitabspanel_tabs1_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs1_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS1_Class") ;
         Gxuitabspanel_tabs1_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Historymanagement")) ;
         Vererrrormaquina_modal_Width = httpContext.cgiGet( "VERERRRORMAQUINA_MODAL_Width") ;
         Vererrrormaquina_modal_Title = httpContext.cgiGet( "VERERRRORMAQUINA_MODAL_Title") ;
         Vererrrormaquina_modal_Confirmtype = httpContext.cgiGet( "VERERRRORMAQUINA_MODAL_Confirmtype") ;
         Vererrrormaquina_modal_Bodytype = httpContext.cgiGet( "VERERRRORMAQUINA_MODAL_Bodytype") ;
         Gridmrec_alertasdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDMREC_ALERTASDTS_EMPOWERER_Gridinternalname") ;
         subFsgrid1_Class = httpContext.cgiGet( "FSGRID1_Class") ;
         subFsgrid1_Paged = httpContext.cgiGet( "FSGRID1_Paged") ;
         subFsgrid1_Showpagecontroller = httpContext.cgiGet( "FSGRID1_Showpagecontroller") ;
         subFsgrid1_Showarrows = httpContext.cgiGet( "FSGRID1_Showarrows") ;
         Gridmrec_alertasdtspaginationbar_Selectedpage = httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Selectedpage") ;
         Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDMREC_ALERTASDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Combo_hdr_Selectedvalue_get = httpContext.cgiGet( "COMBO_HDR_Selectedvalue_get") ;
         Combo_fascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_get") ;
         Combo_maqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_get") ;
         Combo_segundos_Selectedvalue_get = httpContext.cgiGet( "COMBO_SEGUNDOS_Selectedvalue_get") ;
         nRC_GXsfl_109 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_109"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_109_fel_idx = 0 ;
         while ( nGXsfl_109_fel_idx < nRC_GXsfl_109 )
         {
            nGXsfl_109_fel_idx = ((subFsgrid1_Islastpage==1)&&(nGXsfl_109_fel_idx+1>subfsgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_109_fel_idx+1) ;
            sGXsfl_109_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1092( ) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_109_fel_idx ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( GXCCtl) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_109_fel_idx ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_109_fel_idx ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_109_fel_idx ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( GXCCtl) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_109_fel_idx ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( GXCCtl) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_109_fel_idx ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_109_fel_idx ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_109_fel_idx ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_109_fel_idx ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( GXCCtl) ;
            GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_109_fel_idx ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
            AV124GXV1 = nGXsfl_109_fel_idx ;
            if ( ( AV59Maquinas.size() >= AV124GXV1 ) && ( AV124GXV1 > 0 ) )
            {
               AV59Maquinas.currentItem( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV59Maquinas.elementAt(-1+AV124GXV1)) );
            }
         }
         if ( nGXsfl_109_fel_idx == 0 )
         {
            nGXsfl_109_idx = 1 ;
            sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1092( ) ;
         }
         nGXsfl_109_fel_idx = 1 ;
         nRC_GXsfl_145 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_145"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_145_fel_idx = 0 ;
         while ( nGXsfl_145_fel_idx < nRC_GXsfl_145 )
         {
            nGXsfl_145_fel_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_145_fel_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_145_fel_idx+1) ;
            sGXsfl_145_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_145_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1453( ) ;
            AV126GXV3 = (int)(nGXsfl_145_fel_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
            if ( ( AV12Datos.size() >= AV126GXV3 ) && ( AV126GXV3 > 0 ) )
            {
               AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)) );
               AV88DetalleLinea = httpContext.cgiGet( edtavDetallelinea_Internalname) ;
            }
         }
         if ( nGXsfl_145_fel_idx == 0 )
         {
            nGXsfl_145_idx = 1 ;
            sGXsfl_145_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_145_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1453( ) ;
         }
         nGXsfl_145_fel_idx = 1 ;
         /* Read variables values. */
         AV21FueraRango = GXutil.strtobool( httpContext.cgiGet( chkavFuerarango.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21FueraRango", AV21FueraRango);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavDesdefechahora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vDESDEFECHAHORA");
            GX_FocusControl = edtavDesdefechahora_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV87DesdeFechaHora = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV87DesdeFechaHora", localUtil.ttoc( AV87DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV87DesdeFechaHora = localUtil.ctot( httpContext.cgiGet( edtavDesdefechahora_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87DesdeFechaHora", localUtil.ttoc( AV87DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHastafechahora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHASTAFECHAHORA");
            GX_FocusControl = edtavHastafechahora_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90HastaFechaHora = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV90HastaFechaHora", localUtil.ttoc( AV90HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV90HastaFechaHora = localUtil.ctot( httpContext.cgiGet( edtavHastafechahora_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90HastaFechaHora", localUtil.ttoc( AV90HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV145Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV145Pgmname", AV145Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSegundos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSegundos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSEGUNDOS");
            GX_FocusControl = edtavSegundos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV69Segundos = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Segundos), 6, 0));
         }
         else
         {
            AV69Segundos = (int)(localUtil.ctol( httpContext.cgiGet( edtavSegundos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Segundos), 6, 0));
         }
         /* Read subfile selected row values. */
         nGXsfl_145_idx = (int)(localUtil.cton( httpContext.cgiGet( subGridmrec_alertasdts_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_145_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_145_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1453( ) ;
         AV126GXV3 = (int)(nGXsfl_145_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
         if ( nGXsfl_145_idx > 0 )
         {
            AV126GXV3 = (int)(nGXsfl_145_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
            if ( ( AV12Datos.size() >= AV126GXV3 ) && ( AV126GXV3 > 0 ) )
            {
               AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)) );
               AV88DetalleLinea = httpContext.cgiGet( edtavDetallelinea_Internalname) ;
            }
            if ( ( AV126GXV3 > 0 ) && ( AV12Datos.size() >= AV126GXV3 ) )
            {
               AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MRec_Alerta");
         AV145Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV145Pgmname", AV145Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV145Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ingenieria\\mrec_alerta:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e221WB2 ();
      if (returnInSub) return;
   }

   public void e221WB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      if ( 0 == 2 )
      {
         new app.ingenieria.ming_init(remoteHandle, context).execute( ) ;
      }
      GXt_char1 = AV17EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.vxparam_acaemp(remoteHandle, context).execute( GXv_char2) ;
      mrec_alerta_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17EmprCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      if ( (GXutil.strcmp("", AV17EmprCod)==0) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "No se encontró el parametro ACAEMP en parametros de GAIA", ""), "", "", "", "", "", "", "", "", ""), AV145Pgmname) ;
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "El parametro ACAEMP es %1", ""), AV17EmprCod, "", "", "", "", "", "", "", ""), AV145Pgmname) ;
      }
      AV9ContCod = httpContext.getMessage( "INGSIM", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ContCod", AV9ContCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      GXv_SdtWWPContext3[0] = AV106WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext3) ;
      AV106WWPContext = GXv_SdtWWPContext3[0] ;
      AV102UsurCod = AV106WWPContext.getgxTv_SdtWWPContext_Usurcod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102UsurCod", AV102UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      AV93Ip = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Ip", AV93Ip);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93Ip, ""))));
      AV120ProgressIndicator.hide();
      AV69Segundos = 600 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Segundos), 6, 0));
      AV21FueraRango = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21FueraRango", AV21FueraRango);
      AV90HastaFechaHora = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90HastaFechaHora", localUtil.ttoc( AV90HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV87DesdeFechaHora = GXutil.dtadd( AV90HastaFechaHora, 3600*(-6)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87DesdeFechaHora", localUtil.ttoc( AV87DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      divTablegeneral_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
      divTabletabdetalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabletabdetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletabdetalle_Visible), 5, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 = AV13DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5[0] ;
      AV13DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4;
      edtavSegundos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSegundos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSegundos_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOSEGUNDOS' */
      S112 ();
      if (returnInSub) return;
      AV113BuscandoInFilSDT.fromJSonString(AV110WebSession.getValue("TexplusNET_FiltrosAlerta"), null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Filtros Session:%1", ""), AV113BuscandoInFilSDT.toJSonString(false, true), "", "", "", "", "", "", "", ""), AV145Pgmname) ;
      if ( ( GXutil.strcmp(AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilusu(), AV102UsurCod) == 0 ) && ( GXutil.strcmp(AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilip(), AV93Ip) == 0 ) )
      {
         AV69Segundos = AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Intervalo() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Segundos), 6, 0));
         Combo_segundos_Selectedtext_set = GXutil.trim( GXutil.str( AV69Segundos, 6, 0)) ;
         ucCombo_segundos.sendProperty(context, "", false, Combo_segundos_Internalname, "SelectedText_set", Combo_segundos_Selectedtext_set);
         /* Execute user subroutine: 'LOADCOMBOSEGUNDOS' */
         S112 ();
         if (returnInSub) return;
         AV56MaqCod.fromJSonString(AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilmaq(), null);
         AV18FasCod.fromJSonString(AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilfase(), null);
         Combo_maqcod_Selectedvalue_set = AV56MaqCod.toJSonString(false) ;
         ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
         Combo_fascod_Selectedvalue_set = AV18FasCod.toJSonString(false) ;
         ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
         AV87DesdeFechaHora = AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilfini() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87DesdeFechaHora", localUtil.ttoc( AV87DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV90HastaFechaHora = AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilffin() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90HastaFechaHora", localUtil.ttoc( AV90HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV21FueraRango = AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilerr() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21FueraRango", AV21FueraRango);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Filtros Session:Intervalo:%1, maquinas:%2, fases:%3.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Segundos), 6, 0), AV56MaqCod.toJSonString(false), AV18FasCod.toJSonString(false), "", "", "", "", "", ""), AV145Pgmname) ;
         if ( AV56MaqCod.size() > 0 )
         {
            /* Execute user subroutine: 'ORGANIZAR FILTRO' */
            S122 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
            S132 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADCOMBOFASCOD' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADCOMBOHDR' */
            S152 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
            S162 ();
            if (returnInSub) return;
         }
         AV99MRasTxt = GXutil.format( httpContext.getMessage( "Filtros Session:Intervalo:%1, maquinas:%2, fases:%3. Ahora:%4", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Segundos), 6, 0), AV56MaqCod.toJSonString(false), AV18FasCod.toJSonString(false), localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname, AV99MRasTxt) ;
         /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
         S172 ();
         if (returnInSub) return;
      }
      if ( 1 == 0 )
      {
         GXt_char1 = AV116Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         mrec_alerta_impl.this.GXt_char1 = GXv_char2[0] ;
         AV116Station = GXt_char1 ;
         GXv_char2[0] = AV17EmprCod ;
         GXv_char6[0] = AV117EmprNom ;
         GXv_char7[0] = AV102UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV116Station, GXv_char2, GXv_char6, GXv_char7) ;
         mrec_alerta_impl.this.AV17EmprCod = GXv_char2[0] ;
         mrec_alerta_impl.this.AV117EmprNom = GXv_char6[0] ;
         mrec_alerta_impl.this.AV102UsurCod = GXv_char7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "AV102UsurCod", AV102UsurCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
         GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 = AV13DDO_TitleSettingsIcons;
         GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4;
         new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5) ;
         GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5[0] ;
         AV13DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4;
         edtavSegundos_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavSegundos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSegundos_Visible), 5, 0), true);
         /* Execute user subroutine: 'LOADCOMBOSEGUNDOS' */
         S112 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOFASCOD' */
         S142 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOHDR' */
         S152 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
         S162 ();
         if (returnInSub) return;
         Gridmrec_alertasdts_empowerer_Gridinternalname = subGridmrec_alertasdts_Internalname ;
         ucGridmrec_alertasdts_empowerer.sendProperty(context, "", false, Gridmrec_alertasdts_empowerer_Internalname, "GridInternalName", Gridmrec_alertasdts_empowerer_Gridinternalname);
         subGridmrec_alertasdts_Rows = 10 ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
         edtavMaquinas__maqcod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavMaquinas__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaquinas__maqcod_Visible), 5, 0), !bGXsfl_109_Refreshing);
         Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = subGridmrec_alertasdts_Rows ;
         ucGridmrec_alertasdtspaginationbar.sendProperty(context, "", false, Gridmrec_alertasdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      }
      Gridmrec_alertasdts_empowerer_Gridinternalname = subGridmrec_alertasdts_Internalname ;
      ucGridmrec_alertasdts_empowerer.sendProperty(context, "", false, Gridmrec_alertasdts_empowerer_Internalname, "GridInternalName", Gridmrec_alertasdts_empowerer_Gridinternalname);
      edtavMaquinas__maqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaquinas__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaquinas__maqcod_Visible), 5, 0), !bGXsfl_109_Refreshing);
      subGridmrec_alertasdts_Rows = 5 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = subGridmrec_alertasdts_Rows ;
      ucGridmrec_alertasdtspaginationbar.sendProperty(context, "", false, Gridmrec_alertasdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      divTablerango_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablerango_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerango_Visible), 5, 0), true);
      if ( AV69Segundos == 999999 )
      {
         divTablerango_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablerango_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerango_Visible), 5, 0), true);
      }
      this.executeUsercontrolMethod("", false, "UC_CHROMETERContainer", "Start", "", new Object[] {});
      Uc_chrometer_Visible = true ;
      ucUc_chrometer.sendProperty(context, "", false, Uc_chrometer_Internalname, "Visible", GXutil.booltostr( Uc_chrometer_Visible));
      Uc_chrometer_Tickinterval = 90 ;
      ucUc_chrometer.sendProperty(context, "", false, Uc_chrometer_Internalname, "TickInterval", GXutil.ltrimstr( DecimalUtil.doubleToDec(Uc_chrometer_Tickinterval), 9, 0));
   }

   public void e231WB2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV47GridMRec_AlertaSDTsCurrentPage = subgridmrec_alertasdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47GridMRec_AlertaSDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridMRec_AlertaSDTsCurrentPage), 10, 0));
      AV48GridMRec_AlertaSDTsPageCount = subgridmrec_alertasdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GridMRec_AlertaSDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridMRec_AlertaSDTsPageCount), 10, 0));
      edtavDetallelinea_Columnheaderclass = "WWActionColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetallelinea_Internalname, "Columnheaderclass", edtavDetallelinea_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__mprecfec_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecfec_Internalname, "Columnheaderclass", edtavDatos__mprecfec_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__barcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcod_Internalname, "Columnheaderclass", edtavDatos__barcod_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__barcodreo_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcodreo_Internalname, "Columnheaderclass", edtavDatos__barcodreo_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__barcodpar_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__barcodpar_Internalname, "Columnheaderclass", edtavDatos__barcodpar_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__maqcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__maqcod_Internalname, "Columnheaderclass", edtavDatos__maqcod_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__maqdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__maqdsc_Internalname, "Columnheaderclass", edtavDatos__maqdsc_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__mprecplc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecplc_Internalname, "Columnheaderclass", edtavDatos__mprecplc_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__fascod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__fascod_Internalname, "Columnheaderclass", edtavDatos__fascod_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__fasdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__fasdsc_Internalname, "Columnheaderclass", edtavDatos__fasdsc_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__parfascod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfascod_Internalname, "Columnheaderclass", edtavDatos__parfascod_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__parfasdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__parfasdsc_Internalname, "Columnheaderclass", edtavDatos__parfasdsc_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__mprecvalmn_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmn_Internalname, "Columnheaderclass", edtavDatos__mprecvalmn_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__mprecval_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecval_Internalname, "Columnheaderclass", edtavDatos__mprecval_Columnheaderclass, !bGXsfl_145_Refreshing);
      edtavDatos__mprecvalmx_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDatos__mprecvalmx_Internalname, "Columnheaderclass", edtavDatos__mprecvalmx_Columnheaderclass, !bGXsfl_145_Refreshing);
      chkavDatos__mprecer.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, chkavDatos__mprecer.getInternalname(), "Columnheaderclass", chkavDatos__mprecer.getColumnHeaderClass(), !bGXsfl_145_Refreshing);
      /*  Sending Event outputs  */
   }

   private void e241WB2( )
   {
      /* Fsgrid1_Load Routine */
      returnInSub = false ;
      AV124GXV1 = 1 ;
      while ( AV124GXV1 <= AV59Maquinas.size() )
      {
         AV59Maquinas.currentItem( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV59Maquinas.elementAt(-1+AV124GXV1)) );
         AV98MaqCodJSON = AV56MaqCod.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98MaqCodJSON", AV98MaqCodJSON);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV98MaqCodJSON, ""))));
         AV83FasCodJSON = AV18FasCod.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83FasCodJSON", AV83FasCodJSON);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83FasCodJSON, ""))));
         AV84HdrJSON = AV91Hdr.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84HdrJSON", AV84HdrJSON);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHDRJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV84HdrJSON, ""))));
         AV85ParFasCodJSON = AV66ParFasCod.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85ParFasCodJSON", AV85ParFasCodJSON);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCODJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85ParFasCodJSON, ""))));
         lblTbmaquina_Caption = ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)(AV59Maquinas.currentItem())).getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod() ;
         if ( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)(AV59Maquinas.currentItem())).getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr().doubleValue() == 0 )
         {
            lblImgcircle_Caption = httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px; color:green; '></i>", "") ;
         }
         else
         {
            lblImgcircle_Caption = httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px; color:red; '></i>", "") ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(109) ;
         }
         sendrow_1092( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_109_Refreshing )
         {
            httpContext.doAjaxLoad(109, Fsgrid1Row);
         }
         AV124GXV1 = (int)(AV124GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e161WB2( )
   {
      /* Gridmrec_alertasdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridmrec_alertasdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridmrec_alertasdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridmrec_alertasdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV63PageToGo = subgridmrec_alertasdts_fnc_currentpage( ) ;
         AV63PageToGo = (int)(AV63PageToGo+1) ;
         subgridmrec_alertasdts_gotopage( AV63PageToGo) ;
      }
      else
      {
         AV63PageToGo = (int)(GXutil.lval( Gridmrec_alertasdtspaginationbar_Selectedpage)) ;
         subgridmrec_alertasdts_gotopage( AV63PageToGo) ;
      }
   }

   public void e171WB2( )
   {
      /* Gridmrec_alertasdtspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridmrec_alertasdts_Rows = Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridmrec_alertasdts_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e181WB2( )
   {
      AV126GXV3 = (int)(nGXsfl_145_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
      if ( ( AV126GXV3 > 0 ) && ( AV12Datos.size() >= AV126GXV3 ) )
      {
         AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)) );
      }
      AV124GXV1 = nGXsfl_109_idx ;
      if ( ( AV124GXV1 > 0 ) && ( AV59Maquinas.size() >= AV124GXV1 ) )
      {
         AV59Maquinas.currentItem( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV59Maquinas.elementAt(-1+AV124GXV1)) );
      }
      /* 'DoActualizar' Routine */
      returnInSub = false ;
      lblActualizar_Class = httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px; color:green; '></i>", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblActualizar_Internalname, "Class", lblActualizar_Class, true);
      lblActualizar_Jsonclick = httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px; color:green; '></i>", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblActualizar_Internalname, "Jsonclick", lblActualizar_Jsonclick, true);
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S172 ();
      if (returnInSub) return;
      AV82CronometroStart = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82CronometroStart", AV82CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S182 ();
      if (returnInSub) return;
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABS1Container", "SelectTab", "", new Object[] {Integer.valueOf(1)});
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      if ( gx_BV145 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12Datos", AV12Datos);
         nGXsfl_145_bak_idx = nGXsfl_145_idx ;
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
         nGXsfl_145_idx = nGXsfl_145_bak_idx ;
         sGXsfl_145_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_145_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1453( ) ;
      }
      if ( gx_BV109 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59Maquinas", AV59Maquinas);
         nGXsfl_109_bak_idx = nGXsfl_109_idx ;
         gxgrfsgrid1_refresh( subGridmrec_alertasdts_Rows, AV56MaqCod, AV18FasCod, AV91Hdr, AV66ParFasCod, AV59Maquinas, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
         nGXsfl_109_idx = nGXsfl_109_bak_idx ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
      }
   }

   public void e141WB2( )
   {
      /* Combo_hdr_Onoptionclicked Routine */
      returnInSub = false ;
      AV91Hdr.fromJSonString(Combo_hdr_Selectedvalue_get, null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "llamando a parametros", ""), "", "", "", "", "", "", "", "", ""), AV145Pgmname) ;
      /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV91Hdr", AV91Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67ParFasCod_Data", AV67ParFasCod_Data);
   }

   public void e131WB2( )
   {
      /* Combo_fascod_Onoptionclicked Routine */
      returnInSub = false ;
      AV82CronometroStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82CronometroStart", AV82CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S182 ();
      if (returnInSub) return;
      AV18FasCod.fromJSonString(Combo_fascod_Selectedvalue_get, null);
      /* Execute user subroutine: 'LOADCOMBOHDR' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18FasCod", AV18FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV92Hdr_Data", AV92Hdr_Data);
   }

   public void e121WB2( )
   {
      /* Combo_maqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV82CronometroStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82CronometroStart", AV82CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S182 ();
      if (returnInSub) return;
      AV56MaqCod.fromJSonString(Combo_maqcod_Selectedvalue_get, null);
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S142 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56MaqCod", AV56MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19FasCod_Data", AV19FasCod_Data);
   }

   public void e111WB2( )
   {
      /* Combo_segundos_Onoptionclicked Routine */
      returnInSub = false ;
      AV69Segundos = (int)(GXutil.lval( Combo_segundos_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Segundos), 6, 0));
      /* Execute user subroutine: 'SOLICITAR RANGO FECHA' */
      S192 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56MaqCod", AV56MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18FasCod", AV18FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV91Hdr", AV91Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66ParFasCod", AV66ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57MaqCod_Data", AV57MaqCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19FasCod_Data", AV19FasCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV92Hdr_Data", AV92Hdr_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67ParFasCod_Data", AV67ParFasCod_Data);
   }

   public void S162( )
   {
      /* 'LOADCOMBOPARFASCOD' Routine */
      returnInSub = false ;
      AV67ParFasCod_Data.clear();
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Cargue Parametros: HDRs=%1, Fases:%2, Maquinas:%3.", ""), AV91Hdr.toJSonString(false), AV18FasCod.toJSonString(false), AV56MaqCod.toJSonString(false), "", "", "", "", "", ""), AV145Pgmname) ;
      if ( ( AV18FasCod.size() > 0 ) && ( AV56MaqCod.size() > 0 ) && ( AV91Hdr.size() > 0 ) )
      {
         AV147GXLvl358 = (byte)(0) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A14693MEPrMaqCod ,
                                              AV56MaqCod ,
                                              A14691MEPrFasCod ,
                                              AV18FasCod ,
                                              A14697MEPrHdr ,
                                              AV91Hdr ,
                                              A14700MEPrReg ,
                                              AV105Now ,
                                              A14698MEPrUsu ,
                                              AV102UsurCod ,
                                              A14699MEPrIp ,
                                              AV93Ip ,
                                              A14701MEPrTkn ,
                                              AV111InFilTkn ,
                                              A14702MEPrObj ,
                                              AV145Pgmname ,
                                              AV17EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01WB2 */
         pr_default.execute(0, new Object[] {AV17EmprCod, AV105Now, AV102UsurCod, AV93Ip, AV111InFilTkn, AV145Pgmname});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A14702MEPrObj = H01WB2_A14702MEPrObj[0] ;
            A14701MEPrTkn = H01WB2_A14701MEPrTkn[0] ;
            A14700MEPrReg = H01WB2_A14700MEPrReg[0] ;
            A14699MEPrIp = H01WB2_A14699MEPrIp[0] ;
            A14698MEPrUsu = H01WB2_A14698MEPrUsu[0] ;
            A14697MEPrHdr = H01WB2_A14697MEPrHdr[0] ;
            A14691MEPrFasCod = H01WB2_A14691MEPrFasCod[0] ;
            A14693MEPrMaqCod = H01WB2_A14693MEPrMaqCod[0] ;
            A396EmprCod = H01WB2_A396EmprCod[0] ;
            A14696MEPrParDsc = H01WB2_A14696MEPrParDsc[0] ;
            A14695MEPrParCod = H01WB2_A14695MEPrParCod[0] ;
            AV147GXLvl358 = (byte)(1) ;
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( A14695MEPrParCod, 4, 0) );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.str( A14695MEPrParCod, 4, 0), GXutil.trim( A14696MEPrParDsc), "", "", "", "", "", "", "") );
            AV67ParFasCod_Data.add(AV8Combo_DataItem, 0);
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV147GXLvl358 == 0 )
         {
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
            AV67ParFasCod_Data.add(AV8Combo_DataItem, 0);
         }
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Parametros %1.", ""), AV67ParFasCod_Data.toJSonString(false), "", "", "", "", "", "", "", ""), AV145Pgmname) ;
      }
      else
      {
         AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
         AV67ParFasCod_Data.add(AV8Combo_DataItem, 0);
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "No se ha seleccionado Hdrs", ""), "", "", "", "", "", "", "", "", ""));
      }
      AV67ParFasCod_Data.sort("Title");
      Combo_parfascod_Selectedvalue_set = AV66ParFasCod.toJSonString(false) ;
      ucCombo_parfascod.sendProperty(context, "", false, Combo_parfascod_Internalname, "SelectedValue_set", Combo_parfascod_Selectedvalue_set);
   }

   public void S152( )
   {
      /* 'LOADCOMBOHDR' Routine */
      returnInSub = false ;
      AV92Hdr_Data.clear();
      if ( ( AV18FasCod.size() > 0 ) && ( AV56MaqCod.size() > 0 ) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "cargando HDR con fases:%1, maquinas:%2, empresa:%3.", ""), AV18FasCod.toJSonString(false), AV56MaqCod.toJSonString(false), AV17EmprCod, "", "", "", "", "", ""), AV145Pgmname) ;
         AV148GXLvl410 = (byte)(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A14691MEPrFasCod ,
                                              AV18FasCod ,
                                              A14693MEPrMaqCod ,
                                              AV56MaqCod ,
                                              A14700MEPrReg ,
                                              AV105Now ,
                                              A14698MEPrUsu ,
                                              AV102UsurCod ,
                                              A14699MEPrIp ,
                                              AV93Ip ,
                                              A14701MEPrTkn ,
                                              AV111InFilTkn ,
                                              A14702MEPrObj ,
                                              AV145Pgmname ,
                                              AV17EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01WB3 */
         pr_default.execute(1, new Object[] {AV17EmprCod, AV105Now, AV102UsurCod, AV93Ip, AV111InFilTkn, AV145Pgmname});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14702MEPrObj = H01WB3_A14702MEPrObj[0] ;
            A14701MEPrTkn = H01WB3_A14701MEPrTkn[0] ;
            A14700MEPrReg = H01WB3_A14700MEPrReg[0] ;
            A14699MEPrIp = H01WB3_A14699MEPrIp[0] ;
            A14698MEPrUsu = H01WB3_A14698MEPrUsu[0] ;
            A14693MEPrMaqCod = H01WB3_A14693MEPrMaqCod[0] ;
            A14691MEPrFasCod = H01WB3_A14691MEPrFasCod[0] ;
            A396EmprCod = H01WB3_A396EmprCod[0] ;
            A14697MEPrHdr = H01WB3_A14697MEPrHdr[0] ;
            A130BarCodPar = H01WB3_A130BarCodPar[0] ;
            A132BarCodReo = H01WB3_A132BarCodReo[0] ;
            A129BarCod = H01WB3_A129BarCod[0] ;
            AV148GXLvl410 = (byte)(1) ;
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.format( "%1%2%3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, "", "", "", "", "", "") );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1%2%3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, "", "", "", "", "", "") );
            AV92Hdr_Data.add(AV8Combo_DataItem, 0);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV148GXLvl410 == 0 )
         {
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
            AV92Hdr_Data.add(AV8Combo_DataItem, 0);
         }
      }
      else
      {
         AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
         AV92Hdr_Data.add(AV8Combo_DataItem, 0);
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "No se ha seleccionado Maquinas o fases", ""), "", "", "", "", "", "", "", "", ""));
      }
      AV92Hdr_Data.sort("Title");
      Combo_hdr_Selectedvalue_set = AV91Hdr.toJSonString(false) ;
      ucCombo_hdr.sendProperty(context, "", false, Combo_hdr_Internalname, "SelectedValue_set", Combo_hdr_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      AV19FasCod_Data.clear();
      if ( AV56MaqCod.size() > 0 )
      {
         AV149GXLvl456 = (byte)(0) ;
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              A14693MEPrMaqCod ,
                                              AV56MaqCod ,
                                              A14700MEPrReg ,
                                              AV105Now ,
                                              A14698MEPrUsu ,
                                              AV102UsurCod ,
                                              A14699MEPrIp ,
                                              AV93Ip ,
                                              A14701MEPrTkn ,
                                              AV111InFilTkn ,
                                              A14702MEPrObj ,
                                              AV145Pgmname ,
                                              AV17EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01WB4 */
         pr_default.execute(2, new Object[] {AV17EmprCod, AV105Now, AV102UsurCod, AV93Ip, AV111InFilTkn, AV145Pgmname});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A14702MEPrObj = H01WB4_A14702MEPrObj[0] ;
            A14701MEPrTkn = H01WB4_A14701MEPrTkn[0] ;
            A14700MEPrReg = H01WB4_A14700MEPrReg[0] ;
            A14699MEPrIp = H01WB4_A14699MEPrIp[0] ;
            A14698MEPrUsu = H01WB4_A14698MEPrUsu[0] ;
            A14693MEPrMaqCod = H01WB4_A14693MEPrMaqCod[0] ;
            A396EmprCod = H01WB4_A396EmprCod[0] ;
            A14692MEPrFasDsc = H01WB4_A14692MEPrFasDsc[0] ;
            A14691MEPrFasCod = H01WB4_A14691MEPrFasCod[0] ;
            AV149GXLvl456 = (byte)(1) ;
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A14691MEPrFasCod );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", A14691MEPrFasCod, A14692MEPrFasDsc, "", "", "", "", "", "", "") );
            AV19FasCod_Data.add(AV8Combo_DataItem, 0);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV149GXLvl456 == 0 )
         {
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
            AV19FasCod_Data.add(AV8Combo_DataItem, 0);
         }
      }
      else
      {
         AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
         AV19FasCod_Data.add(AV8Combo_DataItem, 0);
      }
      AV19FasCod_Data.sort("Title");
      Combo_fascod_Selectedvalue_set = AV18FasCod.toJSonString(false) ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      AV57MaqCod_Data.clear();
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "LoadComboMaqCod ANTES: &EmprCod:%1, &UsurCod:%2, &Ip:%3, &Now:%4, &InFilTkn:%5", ""), AV17EmprCod, AV102UsurCod, AV93Ip, localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV111InFilTkn, "", "", "", "")) ;
      AV150GXLvl498 = (byte)(0) ;
      /* Using cursor H01WB5 */
      pr_default.execute(3, new Object[] {AV17EmprCod, AV105Now, AV102UsurCod, AV93Ip, AV111InFilTkn, AV145Pgmname});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14702MEPrObj = H01WB5_A14702MEPrObj[0] ;
         A14701MEPrTkn = H01WB5_A14701MEPrTkn[0] ;
         A14700MEPrReg = H01WB5_A14700MEPrReg[0] ;
         A14699MEPrIp = H01WB5_A14699MEPrIp[0] ;
         A14698MEPrUsu = H01WB5_A14698MEPrUsu[0] ;
         A396EmprCod = H01WB5_A396EmprCod[0] ;
         A14694MEPrMaqDsc = H01WB5_A14694MEPrMaqDsc[0] ;
         A14693MEPrMaqCod = H01WB5_A14693MEPrMaqCod[0] ;
         AV150GXLvl498 = (byte)(1) ;
         AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A14693MEPrMaqCod );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", A14693MEPrMaqCod, GXutil.trim( A14694MEPrMaqDsc), "", "", "", "", "", "", "") );
         AV57MaqCod_Data.add(AV8Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV150GXLvl498 == 0 )
      {
         AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
         AV57MaqCod_Data.add(AV8Combo_DataItem, 0);
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "LoadComboMaqCod Sale:&MaqCod_Data:%1, &MaqCod:%2", ""), AV57MaqCod_Data.toJSonString(false), AV56MaqCod.toJSonString(false), "", "", "", "", "", "", ""), AV145Pgmname) ;
      AV57MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV56MaqCod.toJSonString(false) ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOSEGUNDOS' Routine */
      returnInSub = false ;
      AV100Segundos_Data.clear();
      AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "300" );
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "5 m", ""), "", "", "", "", "", "", "", "", "") );
      AV100Segundos_Data.add(AV8Combo_DataItem, 0);
      AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "600" );
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "10 m", ""), "", "", "", "", "", "", "", "", "") );
      AV100Segundos_Data.add(AV8Combo_DataItem, 0);
      AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "900" );
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "15 m", ""), "", "", "", "", "", "", "", "", "") );
      AV100Segundos_Data.add(AV8Combo_DataItem, 0);
      AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "1200" );
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "20 m", ""), "", "", "", "", "", "", "", "", "") );
      AV100Segundos_Data.add(AV8Combo_DataItem, 0);
      AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "1500" );
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "25 m", ""), "", "", "", "", "", "", "", "", "") );
      AV100Segundos_Data.add(AV8Combo_DataItem, 0);
      AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "1800" );
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "30 m", ""), "", "", "", "", "", "", "", "", "") );
      AV100Segundos_Data.add(AV8Combo_DataItem, 0);
      AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "2700" );
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "45 m", ""), "", "", "", "", "", "", "", "", "") );
      AV100Segundos_Data.add(AV8Combo_DataItem, 0);
      AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "3600" );
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "1 h", ""), "", "", "", "", "", "", "", "", "") );
      AV100Segundos_Data.add(AV8Combo_DataItem, 0);
      AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "7200" );
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "2 h", ""), "", "", "", "", "", "", "", "", "") );
      AV100Segundos_Data.add(AV8Combo_DataItem, 0);
      AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "999999" );
      AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "Rango", ""), "", "", "", "", "", "", "", "", "") );
      AV100Segundos_Data.add(AV8Combo_DataItem, 0);
      Combo_segundos_Selectedvalue_set = ((0==AV69Segundos) ? "" : GXutil.trim( GXutil.str( AV69Segundos, 6, 0))) ;
      ucCombo_segundos.sendProperty(context, "", false, Combo_segundos_Internalname, "SelectedValue_set", Combo_segundos_Selectedvalue_set);
   }

   public void e191WB2( )
   {
      /* Segundos_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SOLICITAR RANGO FECHA' */
      S192 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56MaqCod", AV56MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18FasCod", AV18FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV91Hdr", AV91Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66ParFasCod", AV66ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57MaqCod_Data", AV57MaqCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19FasCod_Data", AV19FasCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV92Hdr_Data", AV92Hdr_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67ParFasCod_Data", AV67ParFasCod_Data);
   }

   public void e261WB2( )
   {
      AV126GXV3 = (int)(nGXsfl_145_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
      if ( ( AV126GXV3 > 0 ) && ( AV12Datos.size() >= AV126GXV3 ) )
      {
         AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)) );
      }
      /* Detallelinea_Click Routine */
      returnInSub = false ;
      AV96LineaMaqCod.clear();
      AV96LineaMaqCod.add(((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Maqcod(), 0);
      AV94LineaFasCod.clear();
      AV94LineaFasCod.add(((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Fascod(), 0);
      AV95LineaHdr.clear();
      AV95LineaHdr.add(GXutil.format( "%1%2%3", GXutil.ltrimstr( ((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Barcod(), 8, 0), GXutil.str( ((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo(), 1, 0), ((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Barcodpar(), "", "", "", "", "", ""), 0);
      AV97LineaParFasCod.clear();
      AV97LineaParFasCod.add((short)(((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), 0);
      AV121Titulo = GXutil.format( httpContext.getMessage( "Actualizando Intervalo:%1--%2, Maquinas:%3, Fases:%4, HDRs:%5, Parametros:%6.", ""), localUtil.ttoc( AV86Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV89Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV96LineaMaqCod.toJSonString(false), AV94LineaFasCod.toJSonString(false), AV95LineaHdr.toJSonString(false), AV97LineaParFasCod.toJSonString(false), "", "", "") ;
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV121Titulo, 50, true, (byte)(1)) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Antes de graficar:EmprCod:%1, ContCod:%2, Intervalo:%3, Maquinas:%4, Fases;%5, &HDR:%6, Parametro:%7, Error:%7, %8.", ""), ((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod(), AV9ContCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Segundos), 6, 0), AV96LineaMaqCod.toJSonString(false), AV94LineaFasCod.toJSonString(false), AV95LineaHdr.toJSonString(false), AV97LineaParFasCod.toJSonString(false), GXutil.booltostr( ((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()), GXutil.format( httpContext.getMessage( "Fechas:%1-%2, Usuario:%3, Ip:%4, Now:%5", ""), localUtil.ttoc( AV86Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV89Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV102UsurCod, AV93Ip, localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "")), AV145Pgmname) ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcmrec_detalle = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmrec_detalle_Component), GXutil.lower( "Ingenieria.MRec_AlertaDetalle")) != 0 )
      {
         WebComp_Wcmrec_detalle = WebUtils.getWebComponent(getClass(), "app.ingenieria.mrec_alertadetalle_impl", remoteHandle, context);
         WebComp_Wcmrec_detalle_Component = "Ingenieria.MRec_AlertaDetalle" ;
      }
      if ( GXutil.len( WebComp_Wcmrec_detalle_Component) != 0 )
      {
         WebComp_Wcmrec_detalle.setjustcreated();
         WebComp_Wcmrec_detalle.componentprepare(new Object[] {"W0178","",((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod(),AV9ContCod,Integer.valueOf(AV69Segundos),AV96LineaMaqCod.toJSonString(false),AV94LineaFasCod.toJSonString(false),AV95LineaHdr.toJSonString(false),AV97LineaParFasCod.toJSonString(false),((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer(),AV86Desde,AV89Hasta,AV102UsurCod,AV93Ip,AV105Now,AV111InFilTkn});
         WebComp_Wcmrec_detalle.componentbind(new Object[] {"","","vSEGUNDOS",""+"",""+"",""+"",""+"","","","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcmrec_detalle )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0178"+"");
         WebComp_Wcmrec_detalle.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABS1Container", "SelectTab", "", new Object[] {Integer.valueOf(2)});
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV121Titulo, 90, true, (byte)(1)) ;
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV121Titulo, 100, false, (byte)(1)) ;
      /*  Sending Event outputs  */
   }

   public void e151WB2( )
   {
      AV126GXV3 = (int)(nGXsfl_145_idx+GRIDMREC_ALERTASDTS_nFirstRecordOnPage) ;
      if ( ( AV126GXV3 > 0 ) && ( AV12Datos.size() >= AV126GXV3 ) )
      {
         AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)) );
      }
      AV124GXV1 = nGXsfl_109_idx ;
      if ( ( AV124GXV1 > 0 ) && ( AV59Maquinas.size() >= AV124GXV1 ) )
      {
         AV59Maquinas.currentItem( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV59Maquinas.elementAt(-1+AV124GXV1)) );
      }
      /* Uc_chrometer_Tick Routine */
      returnInSub = false ;
      AV99MRasTxt = GXutil.format( httpContext.getMessage( "Inicia   TimerEvent %1", ""), localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", "", "", "") ;
      new app.ingenieria.crearrastro(remoteHandle, context).execute( AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname, AV99MRasTxt) ;
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S172 ();
      if (returnInSub) return;
      AV99MRasTxt = GXutil.format( httpContext.getMessage( "Finaliza TimerEvent %1", ""), localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", "", "", "") ;
      new app.ingenieria.crearrastro(remoteHandle, context).execute( AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname, AV99MRasTxt) ;
      httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Actualizada consulta %1", ""), localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", "", "", ""));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      if ( gx_BV145 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12Datos", AV12Datos);
         nGXsfl_145_bak_idx = nGXsfl_145_idx ;
         gxgrgridmrec_alertasdts_refresh( subGridmrec_alertasdts_Rows, AV12Datos, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
         nGXsfl_145_idx = nGXsfl_145_bak_idx ;
         sGXsfl_145_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_145_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1453( ) ;
      }
      if ( gx_BV109 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59Maquinas", AV59Maquinas);
         nGXsfl_109_bak_idx = nGXsfl_109_idx ;
         gxgrfsgrid1_refresh( subGridmrec_alertasdts_Rows, AV56MaqCod, AV18FasCod, AV91Hdr, AV66ParFasCod, AV59Maquinas, AV21FueraRango, AV17EmprCod, AV9ContCod, AV98MaqCodJSON, AV83FasCodJSON, AV84HdrJSON, AV85ParFasCodJSON, AV102UsurCod, AV93Ip, AV103Version, AV145Pgmname) ;
         nGXsfl_109_idx = nGXsfl_109_bak_idx ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
      }
   }

   public void e201WB2( )
   {
      /* Desdefechahora_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ORGANIZAR FILTRO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LIMPIAR FILTROS' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56MaqCod", AV56MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18FasCod", AV18FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV91Hdr", AV91Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66ParFasCod", AV66ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57MaqCod_Data", AV57MaqCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19FasCod_Data", AV19FasCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV92Hdr_Data", AV92Hdr_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67ParFasCod_Data", AV67ParFasCod_Data);
   }

   public void e211WB2( )
   {
      /* Hastafechahora_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ORGANIZAR FILTRO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LIMPIAR FILTROS' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56MaqCod", AV56MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18FasCod", AV18FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV91Hdr", AV91Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66ParFasCod", AV66ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57MaqCod_Data", AV57MaqCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19FasCod_Data", AV19FasCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV92Hdr_Data", AV92Hdr_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67ParFasCod_Data", AV67ParFasCod_Data);
   }

   public void S172( )
   {
      /* 'ACTUALIZAR PANTALLA' Routine */
      returnInSub = false ;
      lblTitulogeneral_Caption = GXutil.format( httpContext.getMessage( "%7Actualizando", ""), httpContext.getMessage( "<i class='fa fa-search' style='color:red; '></i>", ""), "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblTitulogeneral_Internalname, "Caption", lblTitulogeneral_Caption, true);
      divTablegeneral_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
      divTabletabdetalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabletabdetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletabdetalle_Visible), 5, 0), true);
      if ( ! ( AV69Segundos > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Seleccionar Intervalo", ""));
      }
      else if ( ! ( AV56MaqCod.size() > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Seleccionar Maquina(s)", ""));
      }
      else if ( ! ( AV18FasCod.size() > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Seleccionar Fase(s)", ""));
      }
      else
      {
         AV121Titulo = GXutil.format( httpContext.getMessage( "Actualizando Intervalo:%1--%2, Maquinas:%3, Fases:%4, HDRs:%5.", ""), localUtil.ttoc( AV86Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV89Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV56MaqCod.toJSonString(false), AV18FasCod.toJSonString(false), AV91Hdr.toJSonString(false), "", "", "", "") ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV121Titulo, 25, true, (byte)(1)) ;
         AV105Now = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105Now", localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         if ( AV69Segundos == 999999 )
         {
            AV86Desde = AV87DesdeFechaHora ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86Desde", localUtil.ttoc( AV86Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV89Hasta = (AV90HastaFechaHora.after(AV105Now) ? GXutil.dtadd( AV105Now, 60*(-1)) : AV90HastaFechaHora) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89Hasta", localUtil.ttoc( AV89Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV104SegundosMenos = (int)(AV69Segundos*-1) ;
            AV86Desde = GXutil.dtadd( AV105Now, AV104SegundosMenos) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86Desde", localUtil.ttoc( AV86Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV89Hasta = GXutil.dtadd( AV105Now, 60*(-1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89Hasta", localUtil.ttoc( AV89Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilusu( AV102UsurCod );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilip( AV93Ip );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilobj( AV145Pgmname );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfreg( AV105Now );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfini( AV86Desde );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilffin( AV89Hasta );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilmaq( AV56MaqCod.toJSonString(false) );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfase( AV18FasCod.toJSonString(false) );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilhdr( AV91Hdr.toJSonString(false) );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilpar( AV66ParFasCod.toJSonString(false) );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilerr( AV21FueraRango );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilemp( AV17EmprCod );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infiltkn( " " );
         GXt_boolean8 = AV108ExisteFiltro ;
         GXv_int9[0] = AV109InFilId ;
         GXv_char7[0] = AV111InFilTkn ;
         GXv_boolean10[0] = GXt_boolean8 ;
         new app.ingenieria.crearfiltro(remoteHandle, context).execute( AV107InFilSDT, GXv_int9, GXv_char7, GXv_boolean10) ;
         mrec_alerta_impl.this.AV109InFilId = GXv_int9[0] ;
         mrec_alerta_impl.this.AV111InFilTkn = GXv_char7[0] ;
         mrec_alerta_impl.this.GXt_boolean8 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111InFilTkn", AV111InFilTkn);
         AV108ExisteFiltro = GXt_boolean8 ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV121Titulo, 35, true, (byte)(1)) ;
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilid( AV109InFilId );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infiltkn( AV111InFilTkn );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Intervalo( AV69Segundos );
         AV110WebSession.setValue("TexplusNET_FiltrosAlerta", AV107InFilSDT.toJSonString(false, true));
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV121Titulo, 60, true, (byte)(1)) ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Trae Datos I: inicia", ""), "", "", "", "", "", "", "", "", ""), AV145Pgmname) ;
         GXt_objcol_SdtMRec_AlertaSDT_Item11 = AV12Datos ;
         GXv_objcol_SdtMRec_AlertaSDT_Item12[0] = GXt_objcol_SdtMRec_AlertaSDT_Item11 ;
         new app.ingenieria.mrec_alertapr(remoteHandle, context).execute( AV17EmprCod, AV9ContCod, AV69Segundos, AV56MaqCod, AV18FasCod, AV91Hdr, AV66ParFasCod, AV21FueraRango, AV86Desde, AV89Hasta, AV102UsurCod, AV93Ip, AV105Now, AV111InFilTkn, GXv_objcol_SdtMRec_AlertaSDT_Item12) ;
         GXt_objcol_SdtMRec_AlertaSDT_Item11 = GXv_objcol_SdtMRec_AlertaSDT_Item12[0] ;
         AV12Datos = GXt_objcol_SdtMRec_AlertaSDT_Item11 ;
         gx_BV145 = true ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Trae Datos F: registros=%1--sdt=%2.", ""), GXutil.ltrimstr( AV12Datos.size(), 9, 0), AV12Datos.toJSonString(false), "", "", "", "", "", "", ""), AV145Pgmname) ;
         AV76DatosClone.clear();
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "SDT Maquinas paso 1:%1", ""), AV76DatosClone.toJSonString(false), "", "", "", "", "", "", "", ""), AV145Pgmname) ;
         AV76DatosClone = AV12Datos.Clone() ;
         AV76DatosClone.sort(httpContext.getMessage( "MaqCod", ""));
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "SDT Maquinas paso 2:%1", ""), AV76DatosClone.toJSonString(false), "", "", "", "", "", "", "", ""), AV145Pgmname) ;
         AV59Maquinas.clear();
         gx_BV109 = true ;
         AV151GXV22 = 1 ;
         while ( AV151GXV22 <= AV76DatosClone.size() )
         {
            AV11Dato = (app.ingenieria.SdtMRec_AlertaSDT_Item)((app.ingenieria.SdtMRec_AlertaSDT_Item)AV76DatosClone.elementAt(-1+AV151GXV22));
            AV78Index = (short)(0) ;
            AV50i = 1 ;
            while ( AV50i <= AV59Maquinas.size() )
            {
               if ( GXutil.strcmp(((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV59Maquinas.elementAt(-1+(int)(AV50i))).getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod(), AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Maqcod()) == 0 )
               {
                  AV78Index = (short)(AV50i) ;
                  if (true) break;
               }
               AV50i = (long)(AV50i+1) ;
            }
            if ( AV78Index == 0 )
            {
               AV58Maquina = (app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)new app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item(remoteHandle, context);
               AV58Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod( AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Emprcod() );
               AV58Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod( AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Barcod() );
               AV58Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo( AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo() );
               AV58Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar( AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Barcodpar() );
               AV58Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord( AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Menvord() );
               AV58Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin( AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Mreclin() );
               AV58Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod( AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Maqcod() );
               AV58Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc( AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Maqdsc() );
               AV58Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr( DecimalUtil.doubleToDec(0) );
               AV59Maquinas.add(AV58Maquina, 0);
               gx_BV109 = true ;
            }
            AV151GXV22 = (int)(AV151GXV22+1) ;
         }
         AV50i = 1 ;
         while ( AV50i <= AV59Maquinas.size() )
         {
            AV152GXV23 = 1 ;
            while ( AV152GXV23 <= AV76DatosClone.size() )
            {
               AV11Dato = (app.ingenieria.SdtMRec_AlertaSDT_Item)((app.ingenieria.SdtMRec_AlertaSDT_Item)AV76DatosClone.elementAt(-1+AV152GXV23));
               if ( ( AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Mprecer() ) && ( GXutil.strcmp(AV11Dato.getgxTv_SdtMRec_AlertaSDT_Item_Maqcod(), ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV59Maquinas.elementAt(-1+(int)(AV50i))).getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod()) == 0 ) )
               {
                  ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV59Maquinas.elementAt(-1+(int)(AV50i))).setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr( DecimalUtil.doubleToDec(1) );
                  if (true) break;
               }
               AV152GXV23 = (int)(AV152GXV23+1) ;
            }
            AV50i = (long)(AV50i+1) ;
         }
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "SDT Maquinas paso 3:%1--%2.", ""), GXutil.ltrimstr( AV59Maquinas.size(), 9, 0), AV59Maquinas.toJSonString(false), "", "", "", "", "", "", ""), AV145Pgmname) ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV121Titulo, 90, true, (byte)(1)) ;
         AV76DatosClone.clear();
         lblTitulogeneral_Caption = GXutil.format( httpContext.getMessage( "%7Actualizado a:%8, con el Intervalo:%1, Maquinas:%2, Fases:%3, Hdrs:%4, Parametro:%5, Error:%6.", ""), GXutil.format( " %1 (%2-%3) ", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Segundos), 6, 0), localUtil.ttoc( AV86Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV89Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", ""), AV56MaqCod.toJSonString(false), AV18FasCod.toJSonString(false), AV91Hdr.toJSonString(false), AV66ParFasCod.toJSonString(false), GXutil.booltostr( AV21FueraRango), httpContext.getMessage( "<i class='fa fa-search' style='color:green; '></i>", ""), localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTitulogeneral_Internalname, "Caption", lblTitulogeneral_Caption, true);
         divTablegeneral_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
         divTabletabdetalle_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTabletabdetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletabdetalle_Visible), 5, 0), true);
         this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABS1Container", "SelectTab", "", new Object[] {Integer.valueOf(1)});
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV121Titulo, 100, false, (byte)(1)) ;
      }
   }

   public void S182( )
   {
      /* 'INICIARPARARCRONOMETRO' Routine */
      returnInSub = false ;
      if ( AV82CronometroStart )
      {
         this.executeUsercontrolMethod("", false, "UC_CHROMETERContainer", "Start", "", new Object[] {});
         lblCronometrostartstop_Caption = httpContext.getMessage( "<i class=\"fas fa-play fa-2x\"></i>", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblCronometrostartstop_Internalname, "Caption", lblCronometrostartstop_Caption, true);
         lblTbmensajeactualizar_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmensajeactualizar_Internalname, "Caption", lblTbmensajeactualizar_Caption, true);
      }
      else
      {
         this.executeUsercontrolMethod("", false, "UC_CHROMETERContainer", "Stop", "", new Object[] {});
         lblCronometrostartstop_Caption = httpContext.getMessage( "<i class=\"fas fa-pause fa-2x\"></i>", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblCronometrostartstop_Internalname, "Caption", lblCronometrostartstop_Caption, true);
         lblTbmensajeactualizar_Caption = GXutil.format( httpContext.getMessage( "Cronómetro parado ó filtros cambiados, Activar cronometro %1 ó clic en actualizar %2 para activarlos...", ""), httpContext.getMessage( "<i class=\"fas fa-play\"></i>", ""), httpContext.getMessage( "<i class='fa fa-search' style='color:gray; '></i>", ""), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmensajeactualizar_Internalname, "Caption", lblTbmensajeactualizar_Caption, true);
      }
   }

   public void S192( )
   {
      /* 'SOLICITAR RANGO FECHA' Routine */
      returnInSub = false ;
      divTablerango_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablerango_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerango_Visible), 5, 0), true);
      if ( AV69Segundos == 999999 )
      {
         divTablerango_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablerango_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerango_Visible), 5, 0), true);
      }
      AV82CronometroStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82CronometroStart", AV82CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ORGANIZAR FILTRO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LIMPIAR FILTROS' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S132 ();
      if (returnInSub) return;
   }

   public void S122( )
   {
      /* 'ORGANIZAR FILTRO' Routine */
      returnInSub = false ;
      AV105Now = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105Now", localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      if ( AV69Segundos == 999999 )
      {
         AV86Desde = AV87DesdeFechaHora ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86Desde", localUtil.ttoc( AV86Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV89Hasta = (AV90HastaFechaHora.after(AV105Now) ? GXutil.dtadd( AV105Now, -30) : AV90HastaFechaHora) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Hasta", localUtil.ttoc( AV89Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         if ( AV89Hasta.before( AV86Desde ) )
         {
            AV86Desde = GXutil.dtadd( AV89Hasta, 60*(-2)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86Desde", localUtil.ttoc( AV86Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
      }
      else
      {
         AV104SegundosMenos = (int)(AV69Segundos*-1) ;
         AV86Desde = GXutil.dtadd( AV105Now, AV104SegundosMenos) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86Desde", localUtil.ttoc( AV86Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV89Hasta = GXutil.dtadd( AV105Now, -30) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Hasta", localUtil.ttoc( AV89Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilusu( AV102UsurCod );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilip( AV93Ip );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilobj( AV145Pgmname );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfreg( AV105Now );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfini( AV86Desde );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilffin( AV89Hasta );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilmaq( " " );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfase( " " );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilhdr( " " );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilpar( " " );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilerr( false );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilemp( AV17EmprCod );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infiltkn( " " );
      GXt_boolean8 = AV108ExisteFiltro ;
      GXv_int9[0] = AV109InFilId ;
      GXv_char7[0] = AV111InFilTkn ;
      GXv_boolean10[0] = GXt_boolean8 ;
      new app.ingenieria.crearfiltro(remoteHandle, context).execute( AV107InFilSDT, GXv_int9, GXv_char7, GXv_boolean10) ;
      mrec_alerta_impl.this.AV109InFilId = GXv_int9[0] ;
      mrec_alerta_impl.this.AV111InFilTkn = GXv_char7[0] ;
      mrec_alerta_impl.this.GXt_boolean8 = GXv_boolean10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111InFilTkn", AV111InFilTkn);
      AV108ExisteFiltro = GXt_boolean8 ;
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilid( AV109InFilId );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infiltkn( AV111InFilTkn );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Intervalo( AV69Segundos );
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Solicita Intervalo: %1--%2 y crea filtro: %3", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Segundos), 6, 0), localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV107InFilSDT.toJSonString(false, true), "", "", "", "", "", ""), AV145Pgmname) ;
   }

   public void S202( )
   {
      /* 'LIMPIAR FILTROS' Routine */
      returnInSub = false ;
      AV56MaqCod.clear();
      Combo_maqcod_Selectedvalue_set = " " ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
      Combo_maqcod_Selectedvalue_set = AV56MaqCod.toJSonString(false) ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
      AV18FasCod.clear();
      Combo_fascod_Selectedvalue_set = AV18FasCod.toJSonString(false) ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
      AV91Hdr.clear();
      Combo_hdr_Selectedvalue_set = AV91Hdr.toJSonString(false) ;
      ucCombo_hdr.sendProperty(context, "", false, Combo_hdr_Internalname, "SelectedValue_set", Combo_hdr_Selectedvalue_set);
      AV66ParFasCod.clear();
      Combo_parfascod_Selectedvalue_set = AV66ParFasCod.toJSonString(false) ;
      ucCombo_parfascod.sendProperty(context, "", false, Combo_parfascod_Internalname, "SelectedValue_set", Combo_parfascod_Selectedvalue_set);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOHDR' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
      S162 ();
      if (returnInSub) return;
      divTablegeneral_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
      divTabletabdetalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabletabdetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletabdetalle_Visible), 5, 0), true);
   }

   private void e251WB3( )
   {
      /* Gridmrec_alertasdts_Load Routine */
      returnInSub = false ;
      AV126GXV3 = 1 ;
      while ( AV126GXV3 <= AV12Datos.size() )
      {
         AV12Datos.currentItem( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)) );
         edtavDetallelinea_gximage = "ActionDisplay" ;
         AV88DetalleLinea = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetallelinea_Internalname, AV88DetalleLinea);
         AV146Detallelinea_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         edtavDetallelinea_Tooltiptext = "" ;
         edtavDetallelinea_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWActionColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWActionColumn") ;
         edtavDatos__mprecfec_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__barcod_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__barcodreo_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__barcodpar_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__maqcod_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__maqdsc_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecplc_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__fascod_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__fasdsc_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__parfascod_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__parfasdsc_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecvalmn_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecval_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         edtavDatos__mprecvalmx_Columnclass = ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") ;
         chkavDatos__mprecer.setColumnClass( ((((app.ingenieria.SdtMRec_AlertaSDT_Item)(AV12Datos.currentItem())).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()) ? "WWColumn WWColumnDanger" : "WWColumn") );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(145) ;
         }
         if ( ( subGridmrec_alertasdts_Islastpage == 1 ) || ( subGridmrec_alertasdts_Rows == 0 ) || ( ( GRIDMREC_ALERTASDTS_nCurrentRecord >= GRIDMREC_ALERTASDTS_nFirstRecordOnPage ) && ( GRIDMREC_ALERTASDTS_nCurrentRecord < GRIDMREC_ALERTASDTS_nFirstRecordOnPage + subgridmrec_alertasdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1453( ) ;
            GRIDMREC_ALERTASDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDMREC_ALERTASDTS_nCurrentRecord + 1 >= subgridmrec_alertasdts_fnc_recordcount( ) )
            {
               GRIDMREC_ALERTASDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDMREC_ALERTASDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMREC_ALERTASDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDMREC_ALERTASDTS_nCurrentRecord = (long)(GRIDMREC_ALERTASDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_145_Refreshing )
         {
            httpContext.doAjaxLoad(145, Gridmrec_alertasdtsRow);
         }
         AV126GXV3 = (int)(AV126GXV3+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void wb_table2_190_1WB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablevererrrormaquina_modal_Internalname, tblTablevererrrormaquina_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucVererrrormaquina_modal.setProperty("Width", Vererrrormaquina_modal_Width);
         ucVererrrormaquina_modal.setProperty("Title", Vererrrormaquina_modal_Title);
         ucVererrrormaquina_modal.setProperty("ConfirmType", Vererrrormaquina_modal_Confirmtype);
         ucVererrrormaquina_modal.setProperty("BodyType", Vererrrormaquina_modal_Bodytype);
         ucVererrrormaquina_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Vererrrormaquina_modal_Internalname, "VERERRRORMAQUINA_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"VERERRRORMAQUINA_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_190_1WB2e( true) ;
      }
      else
      {
         wb_table2_190_1WB2e( false) ;
      }
   }

   public void wb_table1_76_1WB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedcronometrostartstop_Internalname, tblTablemergedcronometrostartstop_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCronometrostartstop_Internalname, lblCronometrostartstop_Caption, "", "", lblCronometrostartstop_Jsonclick, "'"+""+"'"+",false,"+"'"+"e271wb1_client"+"'", "", "TextBlock", 7, httpContext.getMessage( "Iniciar / parar actualización automática de datos", ""), 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Alerta.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmensajeactualizar_Internalname, lblTbmensajeactualizar_Caption, "", "", lblTbmensajeactualizar_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Alerta.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_76_1WB2e( true) ;
      }
      else
      {
         wb_table1_76_1WB2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa1WB2( ) ;
      ws1WB2( ) ;
      we1WB2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("HorizontalGrid/horizontalgrid.min.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("HorizontalGrid/horizontalgrid.min.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcmrec_detalle == null ) )
      {
         if ( GXutil.len( WebComp_Wcmrec_detalle_Component) != 0 )
         {
            WebComp_Wcmrec_detalle.componentthemes();
         }
      }
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116144278", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/mrec_alerta.js", "?202682116144280", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Chronometer/ChronometerRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1092( )
   {
      lblTbmaquina_Internalname = "TBMAQUINA_"+sGXsfl_109_idx ;
      lblVererrrormaquina_Internalname = "VERERRRORMAQUINA_"+sGXsfl_109_idx ;
      lblImgcircle_Internalname = "IMGCIRCLE_"+sGXsfl_109_idx ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1_"+sGXsfl_109_idx ;
      edtavMaquinas__maqcod_Internalname = "MAQUINAS__MAQCOD_"+sGXsfl_109_idx ;
   }

   public void subsflControlProps_fel_1092( )
   {
      lblTbmaquina_Internalname = "TBMAQUINA_"+sGXsfl_109_fel_idx ;
      lblVererrrormaquina_Internalname = "VERERRRORMAQUINA_"+sGXsfl_109_fel_idx ;
      lblImgcircle_Internalname = "IMGCIRCLE_"+sGXsfl_109_fel_idx ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1_"+sGXsfl_109_fel_idx ;
      edtavMaquinas__maqcod_Internalname = "MAQUINAS__MAQCOD_"+sGXsfl_109_fel_idx ;
   }

   public void sendrow_1092( )
   {
      subsflControlProps_1092( ) ;
      wb1WB0( ) ;
      Fsgrid1Row = GXWebRow.GetNew(context,Fsgrid1Container) ;
      if ( subFsgrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
         {
            subFsgrid1_Linesclass = subFsgrid1_Class+"Odd" ;
         }
      }
      else if ( subFsgrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(0) ;
         subFsgrid1_Backcolor = subFsgrid1_Allbackcolor ;
         if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
         {
            subFsgrid1_Linesclass = subFsgrid1_Class+"Uniform" ;
         }
      }
      else if ( subFsgrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
         {
            subFsgrid1_Linesclass = subFsgrid1_Class+"Odd" ;
         }
         subFsgrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subFsgrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_109_idx) % (2))) == 0 )
         {
            subFsgrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
            {
               subFsgrid1_Linesclass = subFsgrid1_Class+"Even" ;
            }
         }
         else
         {
            subFsgrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
            {
               subFsgrid1_Linesclass = subFsgrid1_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subFsgrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_109_idx+"\">") ;
      }
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divFsgrid1layouttable_Internalname+"_"+sGXsfl_109_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 CellMarginLeft CellMarginBottom","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* User Defined Control */
      Fsgrid1Row.AddColumnProperties("usercontrol", -1, isAjaxCallMode( ), new Object[] {"DVPANEL_UNNAMEDTABLE1Container"+"_"+sGXsfl_109_idx,Integer.valueOf(-1)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("usercontrolcontainer", -1, isAjaxCallMode( ), new Object[] {"DVPANEL_UNNAMEDTABLE1Container","UnnamedTable1"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable1_Internalname+"_"+sGXsfl_109_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","Center","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Table start */
      Fsgrid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTablemergedtbmaquina_Internalname+"_"+sGXsfl_109_idx,Integer.valueOf(1),"TableMerged","","","","","","",Integer.valueOf(0),Integer.valueOf(0),"","","","px","px",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","","MergeDataCell"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Text block */
      Fsgrid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTbmaquina_Internalname,lblTbmaquina_Caption,"","",lblTbmaquina_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(1)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("cell");
      }
      Fsgrid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Text block */
      Fsgrid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblVererrrormaquina_Internalname,httpContext.getMessage( "<i class=\"fas fa-chevron-down\"></i>", ""),"","",lblVererrrormaquina_Jsonclick,"'"+""+"'"+",false,"+"'"+"e281wb2_client"+"'","","TextBlock",Integer.valueOf(7),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(1)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("cell");
      }
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("row");
      }
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("table");
      }
      /* End of table */
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"Center","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","Center","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable2_Internalname+"_"+sGXsfl_109_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","Center","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Text block */
      Fsgrid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblImgcircle_Internalname,lblImgcircle_Caption,"","",lblImgcircle_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(2)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"Center","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"Center","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable3_Internalname+"_"+sGXsfl_109_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 Invisible","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Table start */
      Fsgrid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblUnnamedtablecontentfsfsgrid1_Internalname+"_"+sGXsfl_109_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Attribute/Variable Label */
      Fsgrid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavMaquinas__maqcod_Internalname,httpContext.getMessage( "Código Máquina", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Single line edit */
      TempTags = " " + ((edtavMaquinas__maqcod_Enabled!=0)&&(edtavMaquinas__maqcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 139,'',false,'"+sGXsfl_109_idx+"',109)\"" : " ") ;
      ROClassString = "Attribute" ;
      Fsgrid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaquinas__maqcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV59Maquinas.elementAt(-1+AV124GXV1)).getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaquinas__maqcod_Enabled!=0)&&(edtavMaquinas__maqcod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,139);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaquinas__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtavMaquinas__maqcod_Visible),Integer.valueOf(edtavMaquinas__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("cell");
      }
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("row");
      }
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         Fsgrid1Container.CloseTag("table");
      }
      /* End of table */
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      send_integrity_lvl_hashes1WB2( ) ;
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      /* End of Columns property logic. */
      Fsgrid1Container.AddRow(Fsgrid1Row);
      nGXsfl_109_idx = ((subFsgrid1_Islastpage==1)&&(nGXsfl_109_idx+1>subfsgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_109_idx+1) ;
      sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1092( ) ;
      /* End function sendrow_1092 */
   }

   public void subsflControlProps_1453( )
   {
      edtavDetallelinea_Internalname = "vDETALLELINEA_"+sGXsfl_145_idx ;
      edtavDatos__emprcod_Internalname = "DATOS__EMPRCOD_"+sGXsfl_145_idx ;
      edtavDatos__menvord_Internalname = "DATOS__MENVORD_"+sGXsfl_145_idx ;
      edtavDatos__mreclin_Internalname = "DATOS__MRECLIN_"+sGXsfl_145_idx ;
      edtavDatos__mprecfec_Internalname = "DATOS__MPRECFEC_"+sGXsfl_145_idx ;
      edtavDatos__barcod_Internalname = "DATOS__BARCOD_"+sGXsfl_145_idx ;
      edtavDatos__barcodreo_Internalname = "DATOS__BARCODREO_"+sGXsfl_145_idx ;
      edtavDatos__barcodpar_Internalname = "DATOS__BARCODPAR_"+sGXsfl_145_idx ;
      edtavDatos__maqcod_Internalname = "DATOS__MAQCOD_"+sGXsfl_145_idx ;
      edtavDatos__maqdsc_Internalname = "DATOS__MAQDSC_"+sGXsfl_145_idx ;
      edtavDatos__mprecplc_Internalname = "DATOS__MPRECPLC_"+sGXsfl_145_idx ;
      edtavDatos__fascod_Internalname = "DATOS__FASCOD_"+sGXsfl_145_idx ;
      edtavDatos__fasdsc_Internalname = "DATOS__FASDSC_"+sGXsfl_145_idx ;
      edtavDatos__parfascod_Internalname = "DATOS__PARFASCOD_"+sGXsfl_145_idx ;
      edtavDatos__parfasdsc_Internalname = "DATOS__PARFASDSC_"+sGXsfl_145_idx ;
      edtavDatos__mprecvalmn_Internalname = "DATOS__MPRECVALMN_"+sGXsfl_145_idx ;
      edtavDatos__mprecval_Internalname = "DATOS__MPRECVAL_"+sGXsfl_145_idx ;
      edtavDatos__mprecvalmx_Internalname = "DATOS__MPRECVALMX_"+sGXsfl_145_idx ;
      chkavDatos__mprecer.setInternalname( "DATOS__MPRECER_"+sGXsfl_145_idx );
   }

   public void subsflControlProps_fel_1453( )
   {
      edtavDetallelinea_Internalname = "vDETALLELINEA_"+sGXsfl_145_fel_idx ;
      edtavDatos__emprcod_Internalname = "DATOS__EMPRCOD_"+sGXsfl_145_fel_idx ;
      edtavDatos__menvord_Internalname = "DATOS__MENVORD_"+sGXsfl_145_fel_idx ;
      edtavDatos__mreclin_Internalname = "DATOS__MRECLIN_"+sGXsfl_145_fel_idx ;
      edtavDatos__mprecfec_Internalname = "DATOS__MPRECFEC_"+sGXsfl_145_fel_idx ;
      edtavDatos__barcod_Internalname = "DATOS__BARCOD_"+sGXsfl_145_fel_idx ;
      edtavDatos__barcodreo_Internalname = "DATOS__BARCODREO_"+sGXsfl_145_fel_idx ;
      edtavDatos__barcodpar_Internalname = "DATOS__BARCODPAR_"+sGXsfl_145_fel_idx ;
      edtavDatos__maqcod_Internalname = "DATOS__MAQCOD_"+sGXsfl_145_fel_idx ;
      edtavDatos__maqdsc_Internalname = "DATOS__MAQDSC_"+sGXsfl_145_fel_idx ;
      edtavDatos__mprecplc_Internalname = "DATOS__MPRECPLC_"+sGXsfl_145_fel_idx ;
      edtavDatos__fascod_Internalname = "DATOS__FASCOD_"+sGXsfl_145_fel_idx ;
      edtavDatos__fasdsc_Internalname = "DATOS__FASDSC_"+sGXsfl_145_fel_idx ;
      edtavDatos__parfascod_Internalname = "DATOS__PARFASCOD_"+sGXsfl_145_fel_idx ;
      edtavDatos__parfasdsc_Internalname = "DATOS__PARFASDSC_"+sGXsfl_145_fel_idx ;
      edtavDatos__mprecvalmn_Internalname = "DATOS__MPRECVALMN_"+sGXsfl_145_fel_idx ;
      edtavDatos__mprecval_Internalname = "DATOS__MPRECVAL_"+sGXsfl_145_fel_idx ;
      edtavDatos__mprecvalmx_Internalname = "DATOS__MPRECVALMX_"+sGXsfl_145_fel_idx ;
      chkavDatos__mprecer.setInternalname( "DATOS__MPRECER_"+sGXsfl_145_fel_idx );
   }

   public void sendrow_1453( )
   {
      subsflControlProps_1453( ) ;
      wb1WB0( ) ;
      if ( ( subGridmrec_alertasdts_Rows * 1 == 0 ) || ( nGXsfl_145_idx <= subgridmrec_alertasdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridmrec_alertasdtsRow = GXWebRow.GetNew(context,Gridmrec_alertasdtsContainer) ;
         if ( subGridmrec_alertasdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Odd" ;
            }
         }
         else if ( subGridmrec_alertasdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(0) ;
            subGridmrec_alertasdts_Backcolor = subGridmrec_alertasdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Uniform" ;
            }
         }
         else if ( subGridmrec_alertasdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Odd" ;
            }
            subGridmrec_alertasdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridmrec_alertasdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridmrec_alertasdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_145_idx) % (2))) == 0 )
            {
               subGridmrec_alertasdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Even" ;
               }
            }
            else
            {
               subGridmrec_alertasdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridmrec_alertasdts_Class, "") != 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_145_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavDetallelinea_Enabled!=0)&&(edtavDetallelinea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 146,'',false,'',145)\"" : " ") ;
         ClassString = "ActionBaseColorAttribute" + " " + ((GXutil.strcmp(edtavDetallelinea_gximage, "")==0) ? "" : "GX_Image_"+edtavDetallelinea_gximage+"_Class") ;
         StyleString = "" ;
         AV88DetalleLinea_IsBlob = (boolean)(((GXutil.strcmp("", AV88DetalleLinea)==0)&&(GXutil.strcmp("", AV146Detallelinea_GXI)==0))||!(GXutil.strcmp("", AV88DetalleLinea)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV88DetalleLinea)==0) ? AV146Detallelinea_GXI : httpContext.getResourceRelative(AV88DetalleLinea)) ;
         Gridmrec_alertasdtsRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDetallelinea_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"",edtavDetallelinea_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavDetallelinea_Jsonclick,"'"+""+"'"+",false,"+"'"+"EVDETALLELINEA.CLICK."+sGXsfl_145_idx+"'",StyleString,ClassString,edtavDetallelinea_Columnclass,edtavDetallelinea_Columnheaderclass,"","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV88DetalleLinea_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__emprcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Emprcod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__menvord_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__menvord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Menvord()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__menvord_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__menvord_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mreclin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin(), (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mreclin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin()), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mreclin()), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mreclin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavDatos__mreclin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecfec_Internalname,localUtil.ttoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecfec(), 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecfec(), "99/99/99 99:99:99.999"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecfec_Columnclass,edtavDatos__mprecfec_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__barcod_Columnclass,edtavDatos__barcod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__barcodreo_Columnclass,edtavDatos__barcodreo_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__barcodpar_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Barcodpar()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__barcodpar_Columnclass,edtavDatos__barcodpar_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Maqcod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__maqcod_Columnclass,edtavDatos__maqcod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__maqdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Maqdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__maqdsc_Columnclass,edtavDatos__maqdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecplc_Internalname,((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecplc(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecplc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecplc_Columnclass,edtavDatos__mprecplc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecplc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fascod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Fascod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__fascod_Columnclass,edtavDatos__fascod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__fasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Fasdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__fasdsc_Columnclass,edtavDatos__fasdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfascod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__parfascod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Parfascod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__parfascod_Columnclass,edtavDatos__parfascod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfascod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__parfasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Parfasdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__parfasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__parfasdsc_Columnclass,edtavDatos__parfasdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__parfasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmn_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmn_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn(), "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecvalmn_Columnclass,edtavDatos__mprecvalmn_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecval_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecval_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecval(), "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecval_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecval_Columnclass,edtavDatos__mprecval_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecval_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridmrec_alertasdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDatos__mprecvalmx_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDatos__mprecvalmx_Enabled!=0) ? localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), "ZZZZZZZZ9.99") : localUtil.format( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx(), "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDatos__mprecvalmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDatos__mprecvalmx_Columnclass,edtavDatos__mprecvalmx_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDatos__mprecvalmx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(145),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DATOS__MPRECER_" + sGXsfl_145_idx ;
         chkavDatos__mprecer.setName( GXCCtl );
         chkavDatos__mprecer.setWebtags( "" );
         chkavDatos__mprecer.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavDatos__mprecer.getInternalname(), "TitleCaption", chkavDatos__mprecer.getCaption(), !bGXsfl_145_Refreshing);
         chkavDatos__mprecer.setCheckedValue( "false" );
         Gridmrec_alertasdtsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavDatos__mprecer.getInternalname(),GXutil.booltostr( ((app.ingenieria.SdtMRec_AlertaSDT_Item)AV12Datos.elementAt(-1+AV126GXV3)).getgxTv_SdtMRec_AlertaSDT_Item_Mprecer()),"","",Integer.valueOf(-1),Integer.valueOf(chkavDatos__mprecer.getEnabled()),"true","",StyleString,ClassString,chkavDatos__mprecer.getColumnClass(),chkavDatos__mprecer.getColumnHeaderClass(),""});
         send_integrity_lvl_hashes1WB3( ) ;
         Gridmrec_alertasdtsContainer.AddRow(Gridmrec_alertasdtsRow);
         nGXsfl_145_idx = ((subGridmrec_alertasdts_Islastpage==1)&&(nGXsfl_145_idx+1>subgridmrec_alertasdts_fnc_recordsperpage( )) ? 1 : nGXsfl_145_idx+1) ;
         sGXsfl_145_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_145_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1453( ) ;
      }
      /* End function sendrow_1453 */
   }

   public void startgridcontrol109( )
   {
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Fsgrid1Container"+"DivS\" data-gxgridid=\"109\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subFsgrid1_Internalname, subFsgrid1_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         Fsgrid1Container.AddObjectProperty("GridName", "Fsgrid1");
      }
      else
      {
         Fsgrid1Container.AddObjectProperty("GridName", "Fsgrid1");
         Fsgrid1Container.AddObjectProperty("Header", subFsgrid1_Header);
         Fsgrid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         Fsgrid1Container.AddObjectProperty("Class", "FreeStyleGrid");
         Fsgrid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("CmpContext", "");
         Fsgrid1Container.AddObjectProperty("InMasterPage", "false");
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaquinas__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Fsgrid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaquinas__maqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol145( )
   {
      if ( Gridmrec_alertasdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridmrec_alertasdtsContainer"+"DivS\" data-gxgridid=\"145\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridmrec_alertasdts_Internalname, subGridmrec_alertasdts_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridmrec_alertasdts_Backcolorstyle == 0 )
         {
            subGridmrec_alertasdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridmrec_alertasdts_Class) > 0 )
            {
               subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Title" ;
            }
         }
         else
         {
            subGridmrec_alertasdts_Titlebackstyle = (byte)(1) ;
            if ( subGridmrec_alertasdts_Backcolorstyle == 1 )
            {
               subGridmrec_alertasdts_Titlebackcolor = subGridmrec_alertasdts_Allbackcolor ;
               if ( GXutil.len( subGridmrec_alertasdts_Class) > 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridmrec_alertasdts_Class) > 0 )
               {
                  subGridmrec_alertasdts_Linesclass = subGridmrec_alertasdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ActionBaseColorAttribute"+" "+((GXutil.strcmp(edtavDetallelinea_gximage, "")==0) ? "" : "GX_Image_"+edtavDetallelinea_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Línea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Máq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PLC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C.Par.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Parámetro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mínimo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máximo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Error", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridmrec_alertasdtsContainer.AddObjectProperty("GridName", "Gridmrec_alertasdts");
      }
      else
      {
         Gridmrec_alertasdtsContainer.AddObjectProperty("GridName", "Gridmrec_alertasdts");
         Gridmrec_alertasdtsContainer.AddObjectProperty("Header", subGridmrec_alertasdts_Header);
         Gridmrec_alertasdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         Gridmrec_alertasdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("CmpContext", "");
         Gridmrec_alertasdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Value", httpContext.convertURL( AV88DetalleLinea));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDetallelinea_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDetallelinea_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavDetallelinea_Tooltiptext));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__menvord_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mreclin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecfec_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecfec_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecfec_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__barcod_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__barcod_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__barcodreo_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__barcodreo_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__barcodpar_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__barcodpar_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__maqcod_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__maqcod_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__maqdsc_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__maqdsc_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecplc_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecplc_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecplc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__fascod_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__fascod_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__fasdsc_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__fasdsc_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__parfascod_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__parfascod_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__parfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__parfasdsc_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__parfasdsc_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__parfasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecvalmn_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecvalmn_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecvalmn_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecval_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecval_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecval_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDatos__mprecvalmx_Columnclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDatos__mprecvalmx_Columnheaderclass));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDatos__mprecvalmx_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavDatos__mprecer.getColumnClass()));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavDatos__mprecer.getColumnHeaderClass()));
         Gridmrec_alertasdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavDatos__mprecer.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddColumnProperties(Gridmrec_alertasdtsColumn);
         Gridmrec_alertasdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridmrec_alertasdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridmrec_alertasdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_segundos_Internalname = "TEXTBLOCKCOMBO_SEGUNDOS" ;
      Combo_segundos_Internalname = "COMBO_SEGUNDOS" ;
      divTablesplittedsegundos_Internalname = "TABLESPLITTEDSEGUNDOS" ;
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      lblTextblockcombo_fascod_Internalname = "TEXTBLOCKCOMBO_FASCOD" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      lblTextblockcombo_hdr_Internalname = "TEXTBLOCKCOMBO_HDR" ;
      Combo_hdr_Internalname = "COMBO_HDR" ;
      divTablesplittedhdr_Internalname = "TABLESPLITTEDHDR" ;
      lblTextblockcombo_parfascod_Internalname = "TEXTBLOCKCOMBO_PARFASCOD" ;
      Combo_parfascod_Internalname = "COMBO_PARFASCOD" ;
      divTablesplittedparfascod_Internalname = "TABLESPLITTEDPARFASCOD" ;
      chkavFuerarango.setInternalname( "vFUERARANGO" );
      lblActualizar_Internalname = "ACTUALIZAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavDesdefechahora_Internalname = "vDESDEFECHAHORA" ;
      edtavHastafechahora_Internalname = "vHASTAFECHAHORA" ;
      divTablerango_Internalname = "TABLERANGO" ;
      lblCronometrostartstop_Internalname = "CRONOMETROSTARTSTOP" ;
      lblTbmensajeactualizar_Internalname = "TBMENSAJEACTUALIZAR" ;
      tblTablemergedcronometrostartstop_Internalname = "TABLEMERGEDCRONOMETROSTARTSTOP" ;
      Uc_chrometer_Internalname = "UC_CHROMETER" ;
      Barraprogreso_Internalname = "BARRAPROGRESO" ;
      divPanelfiltros_Internalname = "PANELFILTROS" ;
      Dvpanel_panelfiltros_Internalname = "DVPANEL_PANELFILTROS" ;
      lblTabgeneral_title_Internalname = "TABGENERAL_TITLE" ;
      lblTitulogeneral_Internalname = "TITULOGENERAL" ;
      lblTbmaquina_Internalname = "TBMAQUINA" ;
      lblVererrrormaquina_Internalname = "VERERRRORMAQUINA" ;
      tblTablemergedtbmaquina_Internalname = "TABLEMERGEDTBMAQUINA" ;
      lblImgcircle_Internalname = "IMGCIRCLE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavMaquinas__maqcod_Internalname = "MAQUINAS__MAQCOD" ;
      tblUnnamedtablecontentfsfsgrid1_Internalname = "UNNAMEDTABLECONTENTFSFSGRID1" ;
      divFsgrid1layouttable_Internalname = "FSGRID1LAYOUTTABLE" ;
      divTablemaquinas_Internalname = "TABLEMAQUINAS" ;
      edtavDetallelinea_Internalname = "vDETALLELINEA" ;
      edtavDatos__emprcod_Internalname = "DATOS__EMPRCOD" ;
      edtavDatos__menvord_Internalname = "DATOS__MENVORD" ;
      edtavDatos__mreclin_Internalname = "DATOS__MRECLIN" ;
      edtavDatos__mprecfec_Internalname = "DATOS__MPRECFEC" ;
      edtavDatos__barcod_Internalname = "DATOS__BARCOD" ;
      edtavDatos__barcodreo_Internalname = "DATOS__BARCODREO" ;
      edtavDatos__barcodpar_Internalname = "DATOS__BARCODPAR" ;
      edtavDatos__maqcod_Internalname = "DATOS__MAQCOD" ;
      edtavDatos__maqdsc_Internalname = "DATOS__MAQDSC" ;
      edtavDatos__mprecplc_Internalname = "DATOS__MPRECPLC" ;
      edtavDatos__fascod_Internalname = "DATOS__FASCOD" ;
      edtavDatos__fasdsc_Internalname = "DATOS__FASDSC" ;
      edtavDatos__parfascod_Internalname = "DATOS__PARFASCOD" ;
      edtavDatos__parfasdsc_Internalname = "DATOS__PARFASDSC" ;
      edtavDatos__mprecvalmn_Internalname = "DATOS__MPRECVALMN" ;
      edtavDatos__mprecval_Internalname = "DATOS__MPRECVAL" ;
      edtavDatos__mprecvalmx_Internalname = "DATOS__MPRECVALMX" ;
      chkavDatos__mprecer.setInternalname( "DATOS__MPRECER" );
      Gridmrec_alertasdtspaginationbar_Internalname = "GRIDMREC_ALERTASDTSPAGINATIONBAR" ;
      divGridmrec_alertasdtstablewithpaginationbar_Internalname = "GRIDMREC_ALERTASDTSTABLEWITHPAGINATIONBAR" ;
      divPanelgeneral_Internalname = "PANELGENERAL" ;
      Dvpanel_panelgeneral_Internalname = "DVPANEL_PANELGENERAL" ;
      divTablegeneral_Internalname = "TABLEGENERAL" ;
      lblTabdetalle_title_Internalname = "TABDETALLE_TITLE" ;
      divTablemasdetalles_Internalname = "TABLEMASDETALLES" ;
      divTabletabdetalle_Internalname = "TABLETABDETALLE" ;
      Gxuitabspanel_tabs1_Internalname = "GXUITABSPANEL_TABS1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamon_Internalname = "DATAMON" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavSegundos_Internalname = "vSEGUNDOS" ;
      Vererrrormaquina_modal_Internalname = "VERERRRORMAQUINA_MODAL" ;
      tblTablevererrrormaquina_modal_Internalname = "TABLEVERERRRORMAQUINA_MODAL" ;
      Gridmrec_alertasdts_empowerer_Internalname = "GRIDMREC_ALERTASDTS_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subFsgrid1_Internalname = "FSGRID1" ;
      subGridmrec_alertasdts_Internalname = "GRIDMREC_ALERTASDTS" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      subGridmrec_alertasdts_Allowcollapsing = (byte)(0) ;
      subGridmrec_alertasdts_Allowhovering = (byte)(-1) ;
      subGridmrec_alertasdts_Allowselection = (byte)(1) ;
      subGridmrec_alertasdts_Header = "" ;
      subFsgrid1_Allowcollapsing = (byte)(0) ;
      chkavDatos__mprecer.setCaption( "" );
      chkavDatos__mprecer.setColumnHeaderClass( "" );
      chkavDatos__mprecer.setColumnClass( "WWColumn" );
      chkavDatos__mprecer.setEnabled( 0 );
      edtavDatos__mprecvalmx_Jsonclick = "" ;
      edtavDatos__mprecvalmx_Columnheaderclass = "" ;
      edtavDatos__mprecvalmx_Columnclass = "WWColumn" ;
      edtavDatos__mprecvalmx_Enabled = 0 ;
      edtavDatos__mprecval_Jsonclick = "" ;
      edtavDatos__mprecval_Columnheaderclass = "" ;
      edtavDatos__mprecval_Columnclass = "WWColumn" ;
      edtavDatos__mprecval_Enabled = 0 ;
      edtavDatos__mprecvalmn_Jsonclick = "" ;
      edtavDatos__mprecvalmn_Columnheaderclass = "" ;
      edtavDatos__mprecvalmn_Columnclass = "WWColumn" ;
      edtavDatos__mprecvalmn_Enabled = 0 ;
      edtavDatos__parfasdsc_Jsonclick = "" ;
      edtavDatos__parfasdsc_Columnheaderclass = "" ;
      edtavDatos__parfasdsc_Columnclass = "WWColumn" ;
      edtavDatos__parfasdsc_Enabled = 0 ;
      edtavDatos__parfascod_Jsonclick = "" ;
      edtavDatos__parfascod_Columnheaderclass = "" ;
      edtavDatos__parfascod_Columnclass = "WWColumn" ;
      edtavDatos__parfascod_Enabled = 0 ;
      edtavDatos__fasdsc_Jsonclick = "" ;
      edtavDatos__fasdsc_Columnheaderclass = "" ;
      edtavDatos__fasdsc_Columnclass = "WWColumn" ;
      edtavDatos__fasdsc_Enabled = 0 ;
      edtavDatos__fascod_Jsonclick = "" ;
      edtavDatos__fascod_Columnheaderclass = "" ;
      edtavDatos__fascod_Columnclass = "WWColumn" ;
      edtavDatos__fascod_Enabled = 0 ;
      edtavDatos__mprecplc_Jsonclick = "" ;
      edtavDatos__mprecplc_Columnheaderclass = "" ;
      edtavDatos__mprecplc_Columnclass = "WWColumn" ;
      edtavDatos__mprecplc_Enabled = 0 ;
      edtavDatos__maqdsc_Jsonclick = "" ;
      edtavDatos__maqdsc_Columnheaderclass = "" ;
      edtavDatos__maqdsc_Columnclass = "WWColumn" ;
      edtavDatos__maqdsc_Enabled = 0 ;
      edtavDatos__maqcod_Jsonclick = "" ;
      edtavDatos__maqcod_Columnheaderclass = "" ;
      edtavDatos__maqcod_Columnclass = "WWColumn" ;
      edtavDatos__maqcod_Enabled = 0 ;
      edtavDatos__barcodpar_Jsonclick = "" ;
      edtavDatos__barcodpar_Columnheaderclass = "" ;
      edtavDatos__barcodpar_Columnclass = "WWColumn" ;
      edtavDatos__barcodpar_Enabled = 0 ;
      edtavDatos__barcodreo_Jsonclick = "" ;
      edtavDatos__barcodreo_Columnheaderclass = "" ;
      edtavDatos__barcodreo_Columnclass = "WWColumn" ;
      edtavDatos__barcodreo_Enabled = 0 ;
      edtavDatos__barcod_Jsonclick = "" ;
      edtavDatos__barcod_Columnheaderclass = "" ;
      edtavDatos__barcod_Columnclass = "WWColumn" ;
      edtavDatos__barcod_Enabled = 0 ;
      edtavDatos__mprecfec_Jsonclick = "" ;
      edtavDatos__mprecfec_Columnheaderclass = "" ;
      edtavDatos__mprecfec_Columnclass = "WWColumn" ;
      edtavDatos__mprecfec_Enabled = 0 ;
      edtavDatos__mreclin_Jsonclick = "" ;
      edtavDatos__mreclin_Enabled = 0 ;
      edtavDatos__menvord_Jsonclick = "" ;
      edtavDatos__menvord_Enabled = 0 ;
      edtavDatos__emprcod_Jsonclick = "" ;
      edtavDatos__emprcod_Enabled = 0 ;
      edtavDetallelinea_Jsonclick = "" ;
      edtavDetallelinea_Columnclass = "WWActionColumn" ;
      edtavDetallelinea_gximage = "" ;
      edtavDetallelinea_Visible = -1 ;
      edtavDetallelinea_Enabled = 1 ;
      edtavDetallelinea_Tooltiptext = "" ;
      subGridmrec_alertasdts_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGridmrec_alertasdts_Backcolorstyle = (byte)(0) ;
      edtavMaquinas__maqcod_Jsonclick = "" ;
      edtavMaquinas__maqcod_Enabled = 1 ;
      edtavMaquinas__maqcod_Visible = 1 ;
      lblImgcircle_Caption = httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px'></i>", "") ;
      lblTbmaquina_Caption = httpContext.getMessage( "MaquinaNombre", "") ;
      lblTbmensajeactualizar_Caption = " " ;
      lblCronometrostartstop_Caption = httpContext.getMessage( "<i class=\"fas fa-pause fas fa-pause  fa-2x\"></i>", "") ;
      edtavDetallelinea_Columnheaderclass = "" ;
      subFsgrid1_Backcolorstyle = (byte)(0) ;
      chkavDatos__mprecer.setEnabled( -1 );
      edtavDatos__mprecvalmx_Enabled = -1 ;
      edtavDatos__mprecval_Enabled = -1 ;
      edtavDatos__mprecvalmn_Enabled = -1 ;
      edtavDatos__parfasdsc_Enabled = -1 ;
      edtavDatos__parfascod_Enabled = -1 ;
      edtavDatos__fasdsc_Enabled = -1 ;
      edtavDatos__fascod_Enabled = -1 ;
      edtavDatos__mprecplc_Enabled = -1 ;
      edtavDatos__maqdsc_Enabled = -1 ;
      edtavDatos__maqcod_Enabled = -1 ;
      edtavDatos__barcodpar_Enabled = -1 ;
      edtavDatos__barcodreo_Enabled = -1 ;
      edtavDatos__barcod_Enabled = -1 ;
      edtavDatos__mprecfec_Enabled = -1 ;
      edtavDatos__mreclin_Enabled = -1 ;
      edtavDatos__menvord_Enabled = -1 ;
      edtavDatos__emprcod_Enabled = -1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtavSegundos_Jsonclick = "" ;
      edtavSegundos_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divTabletabdetalle_Visible = 1 ;
      lblTitulogeneral_Caption = httpContext.getMessage( " Titulo", "") ;
      divTablegeneral_Visible = 1 ;
      edtavHastafechahora_Jsonclick = "" ;
      edtavHastafechahora_Enabled = 1 ;
      edtavDesdefechahora_Jsonclick = "" ;
      edtavDesdefechahora_Enabled = 1 ;
      divTablerango_Visible = 1 ;
      lblActualizar_Class = "TextBlock" ;
      chkavFuerarango.setEnabled( 1 );
      Combo_parfascod_Caption = "" ;
      Combo_hdr_Caption = "" ;
      Combo_fascod_Caption = "" ;
      Combo_maqcod_Caption = "" ;
      Combo_segundos_Caption = "" ;
      subFsgrid1_Showarrows = GXutil.ltrimstr( DecimalUtil.doubleToDec(-1), 9, 0) ;
      subFsgrid1_Showpagecontroller = GXutil.ltrimstr( DecimalUtil.doubleToDec(0), 9, 0) ;
      subFsgrid1_Paged = GXutil.ltrimstr( DecimalUtil.doubleToDec(-1), 9, 0) ;
      subFsgrid1_Class = "FreeStyleGrid" ;
      Vererrrormaquina_modal_Bodytype = "WebComponent" ;
      Vererrrormaquina_modal_Confirmtype = "" ;
      Vererrrormaquina_modal_Title = httpContext.getMessage( "Aletas máquina", "") ;
      Vererrrormaquina_modal_Width = "1100" ;
      Gxuitabspanel_tabs1_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs1_Class = "" ;
      Gxuitabspanel_tabs1_Pagecount = 2 ;
      Dvpanel_panelgeneral_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Iconposition = "Right" ;
      Dvpanel_panelgeneral_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelgeneral_Title = "" ;
      Dvpanel_panelgeneral_Cls = "PanelNoHeader" ;
      Dvpanel_panelgeneral_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelgeneral_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Width = "100%" ;
      Gridmrec_alertasdtspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridmrec_alertasdtspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridmrec_alertasdtspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridmrec_alertasdtspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridmrec_alertasdtspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridmrec_alertasdtspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridmrec_alertasdtspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridmrec_alertasdtspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridmrec_alertasdtspaginationbar_Pagingcaptionposition = "Left" ;
      Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridmrec_alertasdtspaginationbar_Pagestoshow = 5 ;
      Gridmrec_alertasdtspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridmrec_alertasdtspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridmrec_alertasdtspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridmrec_alertasdtspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridmrec_alertasdtspaginationbar_Class = "PaginationBar" ;
      Dvpanel_panelfiltros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Iconposition = "Right" ;
      Dvpanel_panelfiltros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelfiltros_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_panelfiltros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelfiltros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelfiltros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Width = "100%" ;
      Uc_chrometer_Visible = GXutil.toBoolean( -1) ;
      Uc_chrometer_Tickinterval = 1 ;
      Combo_parfascod_Multiplevaluestype = "Tags" ;
      Combo_parfascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_parfascod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_parfascod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_parfascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_hdr_Multiplevaluestype = "Tags" ;
      Combo_hdr_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_hdr_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_hdr_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_hdr_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fascod_Multiplevaluestype = "Tags" ;
      Combo_fascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fascod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_fascod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_fascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod_Emptyitemtext = "" ;
      Combo_maqcod_Multiplevaluestype = "Tags" ;
      Combo_maqcod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_maqcod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_segundos_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_segundos_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Alertas", "") );
      subGridmrec_alertasdts_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavFuerarango.setName( "vFUERARANGO" );
      chkavFuerarango.setWebtags( "" );
      chkavFuerarango.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavFuerarango.getInternalname(), "TitleCaption", chkavFuerarango.getCaption(), true);
      chkavFuerarango.setCheckedValue( "false" );
      AV21FueraRango = GXutil.strtobool( GXutil.booltostr( AV21FueraRango)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21FueraRango", AV21FueraRango);
      GXCCtl = "DATOS__MPRECER_" + sGXsfl_145_idx ;
      chkavDatos__mprecer.setName( GXCCtl );
      chkavDatos__mprecer.setWebtags( "" );
      chkavDatos__mprecer.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavDatos__mprecer.getInternalname(), "TitleCaption", chkavDatos__mprecer.getCaption(), !bGXsfl_145_Refreshing);
      chkavDatos__mprecer.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'FSGRID1_nFirstRecordOnPage'},{av:'FSGRID1_nEOF'},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV59Maquinas',fld:'vMAQUINAS',grid:109,pic:''},{av:'nGXsfl_109_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:109},{av:'nRC_GXsfl_109',ctrl:'FSGRID1',prop:'GridRC',grid:109},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV12Datos',fld:'vDATOS',grid:145,pic:''},{av:'nGXsfl_145_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:145},{av:'nRC_GXsfl_145',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:145},{av:'AV21FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV98MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV83FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV84HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV85ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'AV103Version',fld:'vVERSION',pic:'',hsh:true},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV47GridMRec_AlertaSDTsCurrentPage',fld:'vGRIDMREC_ALERTASDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV48GridMRec_AlertaSDTsPageCount',fld:'vGRIDMREC_ALERTASDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavDetallelinea_Columnheaderclass',ctrl:'vDETALLELINEA',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECFEC',prop:'Columnheaderclass'},{ctrl:'DATOS__BARCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__BARCODREO',prop:'Columnheaderclass'},{ctrl:'DATOS__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'DATOS__MAQCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__MAQDSC',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECPLC',prop:'Columnheaderclass'},{ctrl:'DATOS__FASCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__FASDSC',prop:'Columnheaderclass'},{ctrl:'DATOS__PARFASCOD',prop:'Columnheaderclass'},{ctrl:'DATOS__PARFASDSC',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVALMN',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVAL',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECVALMX',prop:'Columnheaderclass'},{ctrl:'DATOS__MPRECER',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDMREC_ALERTASDTS.LOAD","{handler:'e251WB3',iparms:[{av:'AV12Datos',fld:'vDATOS',grid:145,pic:''},{av:'nGXsfl_145_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:145},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_145',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:145}]");
      setEventMetadata("GRIDMREC_ALERTASDTS.LOAD",",oparms:[{av:'AV88DetalleLinea',fld:'vDETALLELINEA',pic:''},{av:'edtavDetallelinea_Tooltiptext',ctrl:'vDETALLELINEA',prop:'Tooltiptext'},{av:'edtavDetallelinea_Columnclass',ctrl:'vDETALLELINEA',prop:'Columnclass'},{ctrl:'DATOS__MPRECFEC',prop:'Columnclass'},{ctrl:'DATOS__BARCOD',prop:'Columnclass'},{ctrl:'DATOS__BARCODREO',prop:'Columnclass'},{ctrl:'DATOS__BARCODPAR',prop:'Columnclass'},{ctrl:'DATOS__MAQCOD',prop:'Columnclass'},{ctrl:'DATOS__MAQDSC',prop:'Columnclass'},{ctrl:'DATOS__MPRECPLC',prop:'Columnclass'},{ctrl:'DATOS__FASCOD',prop:'Columnclass'},{ctrl:'DATOS__FASDSC',prop:'Columnclass'},{ctrl:'DATOS__PARFASCOD',prop:'Columnclass'},{ctrl:'DATOS__PARFASDSC',prop:'Columnclass'},{ctrl:'DATOS__MPRECVALMN',prop:'Columnclass'},{ctrl:'DATOS__MPRECVAL',prop:'Columnclass'},{ctrl:'DATOS__MPRECVALMX',prop:'Columnclass'},{ctrl:'DATOS__MPRECER',prop:'Columnclass'}]}");
      setEventMetadata("FSGRID1.LOAD","{handler:'e241WB2',iparms:[{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV59Maquinas',fld:'vMAQUINAS',grid:109,pic:''},{av:'nGXsfl_109_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:109},{av:'FSGRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_109',ctrl:'FSGRID1',prop:'GridRC',grid:109}]");
      setEventMetadata("FSGRID1.LOAD",",oparms:[{av:'AV98MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV83FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV84HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV85ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'lblTbmaquina_Caption',ctrl:'TBMAQUINA',prop:'Caption'},{av:'lblImgcircle_Caption',ctrl:'IMGCIRCLE',prop:'Caption'}]}");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e161WB2',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV12Datos',fld:'vDATOS',grid:145,pic:''},{av:'nGXsfl_145_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:145},{av:'nRC_GXsfl_145',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:145},{av:'AV21FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV98MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV83FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV84HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV85ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'AV103Version',fld:'vVERSION',pic:'',hsh:true},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'Gridmrec_alertasdtspaginationbar_Selectedpage',ctrl:'GRIDMREC_ALERTASDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e171WB2',iparms:[{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV12Datos',fld:'vDATOS',grid:145,pic:''},{av:'nGXsfl_145_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:145},{av:'nRC_GXsfl_145',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:145},{av:'AV21FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV98MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV83FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV84HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV85ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'AV103Version',fld:'vVERSION',pic:'',hsh:true},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDMREC_ALERTASDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDMREC_ALERTASDTSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'}]}");
      setEventMetadata("'DOVERERRRORMAQUINA'","{handler:'e281WB2',iparms:[]");
      setEventMetadata("'DOVERERRRORMAQUINA'",",oparms:[]}");
      setEventMetadata("'DOCRONOMETROSTARTSTOP'","{handler:'e271WB1',iparms:[{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''}]");
      setEventMetadata("'DOCRONOMETROSTARTSTOP'",",oparms:[{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'}]}");
      setEventMetadata("'DOACTUALIZAR'","{handler:'e181WB2',iparms:[{av:'AV69Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'AV86Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV89Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV87DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV90HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV21FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV59Maquinas',fld:'vMAQUINAS',grid:109,pic:''},{av:'nGXsfl_109_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:109},{av:'FSGRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_109',ctrl:'FSGRID1',prop:'GridRC',grid:109},{av:'FSGRID1_nEOF'},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV12Datos',fld:'vDATOS',grid:145,pic:''},{av:'nGXsfl_145_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:145},{av:'nRC_GXsfl_145',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:145},{av:'AV98MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV83FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV84HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV85ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true},{av:'AV103Version',fld:'vVERSION',pic:'',hsh:true}]");
      setEventMetadata("'DOACTUALIZAR'",",oparms:[{av:'lblActualizar_Class',ctrl:'ACTUALIZAR',prop:'Class'},{av:'lblActualizar_Jsonclick',ctrl:'ACTUALIZAR',prop:'Jsonclick'},{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'lblTitulogeneral_Caption',ctrl:'TITULOGENERAL',prop:'Caption'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV86Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV89Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV12Datos',fld:'vDATOS',grid:145,pic:''},{av:'nGXsfl_145_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:145},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_145',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:145},{av:'AV59Maquinas',fld:'vMAQUINAS',grid:109,pic:''},{av:'nGXsfl_109_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:109},{av:'FSGRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_109',ctrl:'FSGRID1',prop:'GridRC',grid:109},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'}]}");
      setEventMetadata("COMBO_HDR.ONOPTIONCLICKED","{handler:'e141WB2',iparms:[{av:'Combo_hdr_Selectedvalue_get',ctrl:'COMBO_HDR',prop:'SelectedValue_get'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("COMBO_HDR.ONOPTIONCLICKED",",oparms:[{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'AV67ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("COMBO_FASCOD.ONOPTIONCLICKED","{handler:'e131WB2',iparms:[{av:'Combo_fascod_Selectedvalue_get',ctrl:'COMBO_FASCOD',prop:'SelectedValue_get'},{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV91Hdr',fld:'vHDR',pic:''}]");
      setEventMetadata("COMBO_FASCOD.ONOPTIONCLICKED",",oparms:[{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV92Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'}]}");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED","{handler:'e121WB2',iparms:[{av:'Combo_maqcod_Selectedvalue_get',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_get'},{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''}]");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV19FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("COMBO_SEGUNDOS.ONOPTIONCLICKED","{handler:'e111WB2',iparms:[{av:'Combo_segundos_Selectedvalue_get',ctrl:'COMBO_SEGUNDOS',prop:'SelectedValue_get'},{av:'AV69Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV87DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV90HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("COMBO_SEGUNDOS.ONOPTIONCLICKED",",oparms:[{av:'AV69Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'divTablerango_Visible',ctrl:'TABLERANGO',prop:'Visible'},{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV86Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV89Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'Combo_maqcod_Selectedvalue_set',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_set'},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV57MaqCod_Data',fld:'vMAQCOD_DATA',pic:''},{av:'AV19FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'AV92Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'AV67ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''}]}");
      setEventMetadata("VSEGUNDOS.CONTROLVALUECHANGED","{handler:'e191WB2',iparms:[{av:'AV69Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV87DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV90HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("VSEGUNDOS.CONTROLVALUECHANGED",",oparms:[{av:'divTablerango_Visible',ctrl:'TABLERANGO',prop:'Visible'},{av:'AV82CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV86Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV89Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'Combo_maqcod_Selectedvalue_set',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_set'},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV57MaqCod_Data',fld:'vMAQCOD_DATA',pic:''},{av:'AV19FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'AV92Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'AV67ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''}]}");
      setEventMetadata("VDETALLELINEA.CLICK","{handler:'e261WB2',iparms:[{av:'AV12Datos',fld:'vDATOS',grid:145,pic:''},{av:'nGXsfl_145_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:145},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_145',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:145},{av:'AV86Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV89Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV69Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''}]");
      setEventMetadata("VDETALLELINEA.CLICK",",oparms:[{ctrl:'WCMREC_DETALLE'}]}");
      setEventMetadata("UC_CHROMETER.TICK","{handler:'e151WB2',iparms:[{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'AV103Version',fld:'vVERSION',pic:'',hsh:true},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'AV69Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'AV86Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV89Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV87DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV90HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV21FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV59Maquinas',fld:'vMAQUINAS',grid:109,pic:''},{av:'nGXsfl_109_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:109},{av:'FSGRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_109',ctrl:'FSGRID1',prop:'GridRC',grid:109},{av:'FSGRID1_nEOF'},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'GRIDMREC_ALERTASDTS_nEOF'},{av:'subGridmrec_alertasdts_Rows',ctrl:'GRIDMREC_ALERTASDTS',prop:'Rows'},{av:'AV12Datos',fld:'vDATOS',grid:145,pic:''},{av:'nGXsfl_145_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:145},{av:'nRC_GXsfl_145',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:145},{av:'AV98MaqCodJSON',fld:'vMAQCODJSON',pic:'',hsh:true},{av:'AV83FasCodJSON',fld:'vFASCODJSON',pic:'',hsh:true},{av:'AV84HdrJSON',fld:'vHDRJSON',pic:'',hsh:true},{av:'AV85ParFasCodJSON',fld:'vPARFASCODJSON',pic:'',hsh:true}]");
      setEventMetadata("UC_CHROMETER.TICK",",oparms:[{av:'lblTitulogeneral_Caption',ctrl:'TITULOGENERAL',prop:'Caption'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV86Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV89Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV12Datos',fld:'vDATOS',grid:145,pic:''},{av:'nGXsfl_145_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:145},{av:'GRIDMREC_ALERTASDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_145',ctrl:'GRIDMREC_ALERTASDTS',prop:'GridRC',grid:145},{av:'AV59Maquinas',fld:'vMAQUINAS',grid:109,pic:''},{av:'nGXsfl_109_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:109},{av:'FSGRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_109',ctrl:'FSGRID1',prop:'GridRC',grid:109}]}");
      setEventMetadata("VDESDEFECHAHORA.CONTROLVALUECHANGED","{handler:'e201WB2',iparms:[{av:'AV69Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV87DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV90HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("VDESDEFECHAHORA.CONTROLVALUECHANGED",",oparms:[{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV86Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV89Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'Combo_maqcod_Selectedvalue_set',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_set'},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV57MaqCod_Data',fld:'vMAQCOD_DATA',pic:''},{av:'AV19FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'AV92Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'AV67ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''}]}");
      setEventMetadata("VHASTAFECHAHORA.CONTROLVALUECHANGED","{handler:'e211WB2',iparms:[{av:'AV69Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV87DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV90HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV93Ip',fld:'vIP',pic:'',hsh:true},{av:'AV145Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("VHASTAFECHAHORA.CONTROLVALUECHANGED",",oparms:[{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV86Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV89Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV56MaqCod',fld:'vMAQCOD',pic:''},{av:'Combo_maqcod_Selectedvalue_set',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_set'},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'},{av:'AV91Hdr',fld:'vHDR',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'},{av:'AV66ParFasCod',fld:'vPARFASCOD',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV57MaqCod_Data',fld:'vMAQCOD_DATA',pic:''},{av:'AV19FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'AV92Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'AV67ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv2',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv21',iparms:[]");
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
      Gridmrec_alertasdtspaginationbar_Selectedpage = "" ;
      Combo_parfascod_Selectedvalue_get = "" ;
      Combo_hdr_Selectedvalue_get = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      Combo_segundos_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV56MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV91Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV59Maquinas = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item>(app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV17EmprCod = "" ;
      AV9ContCod = "" ;
      AV98MaqCodJSON = "" ;
      AV83FasCodJSON = "" ;
      AV84HdrJSON = "" ;
      AV85ParFasCodJSON = "" ;
      AV102UsurCod = "" ;
      AV93Ip = "" ;
      AV103Version = "" ;
      AV145Pgmname = "" ;
      AV12Datos = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV100Segundos_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV57MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV19FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV92Hdr_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV67ParFasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV86Desde = GXutil.resetTime( GXutil.nullDate() );
      AV89Hasta = GXutil.resetTime( GXutil.nullDate() );
      AV105Now = GXutil.resetTime( GXutil.nullDate() );
      AV111InFilTkn = "" ;
      AV107InFilSDT = new app.ingenieria.SdtInFilSDT(remoteHandle, context);
      A396EmprCod = "" ;
      A14693MEPrMaqCod = "" ;
      A14691MEPrFasCod = "" ;
      A14697MEPrHdr = "" ;
      A14698MEPrUsu = "" ;
      A14699MEPrIp = "" ;
      A14700MEPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14701MEPrTkn = "" ;
      A14702MEPrObj = "" ;
      A14696MEPrParDsc = "" ;
      A130BarCodPar = "" ;
      A14692MEPrFasDsc = "" ;
      A14694MEPrMaqDsc = "" ;
      Combo_segundos_Selectedvalue_set = "" ;
      Combo_segundos_Selectedtext_set = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Combo_hdr_Selectedvalue_set = "" ;
      Combo_parfascod_Selectedvalue_set = "" ;
      Gridmrec_alertasdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelfiltros = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_segundos_Jsonclick = "" ;
      ucCombo_segundos = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_fascod_Jsonclick = "" ;
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_hdr_Jsonclick = "" ;
      ucCombo_hdr = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_parfascod_Jsonclick = "" ;
      ucCombo_parfascod = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblActualizar_Jsonclick = "" ;
      AV87DesdeFechaHora = GXutil.resetTime( GXutil.nullDate() );
      AV90HastaFechaHora = GXutil.resetTime( GXutil.nullDate() );
      ucUc_chrometer = new com.genexus.webpanels.GXUserControl();
      ucBarraprogreso = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs1 = new com.genexus.webpanels.GXUserControl();
      lblTabgeneral_title_Jsonclick = "" ;
      ucDvpanel_panelgeneral = new com.genexus.webpanels.GXUserControl();
      lblTitulogeneral_Jsonclick = "" ;
      Fsgrid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      Gridmrec_alertasdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      ucGridmrec_alertasdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      lblTabdetalle_title_Jsonclick = "" ;
      WebComp_Wcmrec_detalle_Component = "" ;
      OldWcmrec_detalle = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucGridmrec_alertasdts_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV88DetalleLinea = "" ;
      AV146Detallelinea_GXI = "" ;
      hsh = "" ;
      AV106WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext3 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV120ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV113BuscandoInFilSDT = new app.ingenieria.SdtInFilSDT(remoteHandle, context);
      AV110WebSession = httpContext.getWebSession();
      AV99MRasTxt = "" ;
      AV116Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV117EmprNom = "" ;
      GXv_char6 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      Fsgrid1Row = new com.genexus.webpanels.GXWebRow();
      scmdbuf = "" ;
      H01WB2_A14702MEPrObj = new String[] {""} ;
      H01WB2_A14701MEPrTkn = new String[] {""} ;
      H01WB2_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H01WB2_A14699MEPrIp = new String[] {""} ;
      H01WB2_A14698MEPrUsu = new String[] {""} ;
      H01WB2_A14697MEPrHdr = new String[] {""} ;
      H01WB2_A14691MEPrFasCod = new String[] {""} ;
      H01WB2_A14693MEPrMaqCod = new String[] {""} ;
      H01WB2_A396EmprCod = new String[] {""} ;
      H01WB2_A14696MEPrParDsc = new String[] {""} ;
      H01WB2_A14695MEPrParCod = new short[1] ;
      AV8Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01WB3_A14702MEPrObj = new String[] {""} ;
      H01WB3_A14701MEPrTkn = new String[] {""} ;
      H01WB3_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H01WB3_A14699MEPrIp = new String[] {""} ;
      H01WB3_A14698MEPrUsu = new String[] {""} ;
      H01WB3_A14693MEPrMaqCod = new String[] {""} ;
      H01WB3_A14691MEPrFasCod = new String[] {""} ;
      H01WB3_A396EmprCod = new String[] {""} ;
      H01WB3_A14697MEPrHdr = new String[] {""} ;
      H01WB3_A130BarCodPar = new String[] {""} ;
      H01WB3_A132BarCodReo = new byte[1] ;
      H01WB3_A129BarCod = new int[1] ;
      H01WB4_A14702MEPrObj = new String[] {""} ;
      H01WB4_A14701MEPrTkn = new String[] {""} ;
      H01WB4_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H01WB4_A14699MEPrIp = new String[] {""} ;
      H01WB4_A14698MEPrUsu = new String[] {""} ;
      H01WB4_A14693MEPrMaqCod = new String[] {""} ;
      H01WB4_A396EmprCod = new String[] {""} ;
      H01WB4_A14692MEPrFasDsc = new String[] {""} ;
      H01WB4_A14691MEPrFasCod = new String[] {""} ;
      H01WB5_A14702MEPrObj = new String[] {""} ;
      H01WB5_A14701MEPrTkn = new String[] {""} ;
      H01WB5_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H01WB5_A14699MEPrIp = new String[] {""} ;
      H01WB5_A14698MEPrUsu = new String[] {""} ;
      H01WB5_A396EmprCod = new String[] {""} ;
      H01WB5_A14694MEPrMaqDsc = new String[] {""} ;
      H01WB5_A14693MEPrMaqCod = new String[] {""} ;
      AV96LineaMaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV94LineaFasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV95LineaHdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV97LineaParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV121Titulo = "" ;
      GXt_objcol_SdtMRec_AlertaSDT_Item11 = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRec_AlertaSDT_Item12 = new GXBaseCollection[1] ;
      AV76DatosClone = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item>(app.ingenieria.SdtMRec_AlertaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV11Dato = new app.ingenieria.SdtMRec_AlertaSDT_Item(remoteHandle, context);
      AV58Maquina = new app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item(remoteHandle, context);
      GXv_int9 = new long[1] ;
      GXv_char7 = new String[1] ;
      GXv_boolean10 = new boolean[1] ;
      Gridmrec_alertasdtsRow = new com.genexus.webpanels.GXWebRow();
      ucVererrrormaquina_modal = new com.genexus.webpanels.GXUserControl();
      lblCronometrostartstop_Jsonclick = "" ;
      lblTbmensajeactualizar_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subFsgrid1_Linesclass = "" ;
      Fsgrid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTbmaquina_Jsonclick = "" ;
      lblVererrrormaquina_Jsonclick = "" ;
      lblImgcircle_Jsonclick = "" ;
      ROClassString = "" ;
      subGridmrec_alertasdts_Linesclass = "" ;
      sImgUrl = "" ;
      subFsgrid1_Header = "" ;
      Gridmrec_alertasdtsColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_alerta__default(),
         new Object[] {
             new Object[] {
            H01WB2_A14702MEPrObj, H01WB2_A14701MEPrTkn, H01WB2_A14700MEPrReg, H01WB2_A14699MEPrIp, H01WB2_A14698MEPrUsu, H01WB2_A14697MEPrHdr, H01WB2_A14691MEPrFasCod, H01WB2_A14693MEPrMaqCod, H01WB2_A396EmprCod, H01WB2_A14696MEPrParDsc,
            H01WB2_A14695MEPrParCod
            }
            , new Object[] {
            H01WB3_A14702MEPrObj, H01WB3_A14701MEPrTkn, H01WB3_A14700MEPrReg, H01WB3_A14699MEPrIp, H01WB3_A14698MEPrUsu, H01WB3_A14693MEPrMaqCod, H01WB3_A14691MEPrFasCod, H01WB3_A396EmprCod, H01WB3_A14697MEPrHdr, H01WB3_A130BarCodPar,
            H01WB3_A132BarCodReo, H01WB3_A129BarCod
            }
            , new Object[] {
            H01WB4_A14702MEPrObj, H01WB4_A14701MEPrTkn, H01WB4_A14700MEPrReg, H01WB4_A14699MEPrIp, H01WB4_A14698MEPrUsu, H01WB4_A14693MEPrMaqCod, H01WB4_A396EmprCod, H01WB4_A14692MEPrFasDsc, H01WB4_A14691MEPrFasCod
            }
            , new Object[] {
            H01WB5_A14702MEPrObj, H01WB5_A14701MEPrTkn, H01WB5_A14700MEPrReg, H01WB5_A14699MEPrIp, H01WB5_A14698MEPrUsu, H01WB5_A396EmprCod, H01WB5_A14694MEPrMaqDsc, H01WB5_A14693MEPrMaqCod
            }
         }
      );
      AV145Pgmname = "Ingenieria.MRec_Alerta" ;
      /* GeneXus formulas. */
      AV145Pgmname = "Ingenieria.MRec_Alerta" ;
      Gx_err = (short)(0) ;
      edtavDatos__emprcod_Enabled = 0 ;
      edtavDatos__menvord_Enabled = 0 ;
      edtavDatos__mreclin_Enabled = 0 ;
      edtavDatos__mprecfec_Enabled = 0 ;
      edtavDatos__barcod_Enabled = 0 ;
      edtavDatos__barcodreo_Enabled = 0 ;
      edtavDatos__barcodpar_Enabled = 0 ;
      edtavDatos__maqcod_Enabled = 0 ;
      edtavDatos__maqdsc_Enabled = 0 ;
      edtavDatos__mprecplc_Enabled = 0 ;
      edtavDatos__fascod_Enabled = 0 ;
      edtavDatos__fasdsc_Enabled = 0 ;
      edtavDatos__parfascod_Enabled = 0 ;
      edtavDatos__parfasdsc_Enabled = 0 ;
      edtavDatos__mprecvalmn_Enabled = 0 ;
      edtavDatos__mprecval_Enabled = 0 ;
      edtavDatos__mprecvalmx_Enabled = 0 ;
      chkavDatos__mprecer.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcmrec_detalle = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRIDMREC_ALERTASDTS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subFsgrid1_Backcolorstyle ;
   private byte subGridmrec_alertasdts_Backcolorstyle ;
   private byte FSGRID1_nEOF ;
   private byte AV147GXLvl358 ;
   private byte AV148GXLvl410 ;
   private byte AV149GXLvl456 ;
   private byte AV150GXLvl498 ;
   private byte nGXWrapped ;
   private byte subFsgrid1_Backstyle ;
   private byte subGridmrec_alertasdts_Backstyle ;
   private byte subFsgrid1_Allowselection ;
   private byte subFsgrid1_Allowhovering ;
   private byte subFsgrid1_Allowcollapsing ;
   private byte subFsgrid1_Collapsed ;
   private byte subGridmrec_alertasdts_Titlebackstyle ;
   private byte subGridmrec_alertasdts_Allowselection ;
   private byte subGridmrec_alertasdts_Allowhovering ;
   private byte subGridmrec_alertasdts_Allowcollapsing ;
   private byte subGridmrec_alertasdts_Collapsed ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A14695MEPrParCod ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV78Index ;
   private int Gridmrec_alertasdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_109 ;
   private int nRC_GXsfl_145 ;
   private int subGridmrec_alertasdts_Rows ;
   private int nGXsfl_109_idx=1 ;
   private int nGXsfl_145_idx=1 ;
   private int A129BarCod ;
   private int Uc_chrometer_Tickinterval ;
   private int Gridmrec_alertasdtspaginationbar_Pagestoshow ;
   private int Gxuitabspanel_tabs1_Pagecount ;
   private int divTablerango_Visible ;
   private int edtavDesdefechahora_Enabled ;
   private int edtavHastafechahora_Enabled ;
   private int divTablegeneral_Visible ;
   private int AV124GXV1 ;
   private int AV126GXV3 ;
   private int divTabletabdetalle_Visible ;
   private int edtavPgmname_Enabled ;
   private int AV69Segundos ;
   private int edtavSegundos_Visible ;
   private int subFsgrid1_Islastpage ;
   private int subGridmrec_alertasdts_Islastpage ;
   private int edtavDatos__emprcod_Enabled ;
   private int edtavDatos__menvord_Enabled ;
   private int edtavDatos__mreclin_Enabled ;
   private int edtavDatos__mprecfec_Enabled ;
   private int edtavDatos__barcod_Enabled ;
   private int edtavDatos__barcodreo_Enabled ;
   private int edtavDatos__barcodpar_Enabled ;
   private int edtavDatos__maqcod_Enabled ;
   private int edtavDatos__maqdsc_Enabled ;
   private int edtavDatos__mprecplc_Enabled ;
   private int edtavDatos__fascod_Enabled ;
   private int edtavDatos__fasdsc_Enabled ;
   private int edtavDatos__parfascod_Enabled ;
   private int edtavDatos__parfasdsc_Enabled ;
   private int edtavDatos__mprecvalmn_Enabled ;
   private int edtavDatos__mprecval_Enabled ;
   private int edtavDatos__mprecvalmx_Enabled ;
   private int GRIDMREC_ALERTASDTS_nGridOutOfScope ;
   private int nGXsfl_109_fel_idx=1 ;
   private int nGXsfl_145_fel_idx=1 ;
   private int edtavMaquinas__maqcod_Visible ;
   private int AV63PageToGo ;
   private int nGXsfl_145_bak_idx=1 ;
   private int nGXsfl_109_bak_idx=1 ;
   private int AV104SegundosMenos ;
   private int AV151GXV22 ;
   private int AV152GXV23 ;
   private int idxLst ;
   private int subFsgrid1_Backcolor ;
   private int subFsgrid1_Allbackcolor ;
   private int edtavMaquinas__maqcod_Enabled ;
   private int subGridmrec_alertasdts_Backcolor ;
   private int subGridmrec_alertasdts_Allbackcolor ;
   private int edtavDetallelinea_Enabled ;
   private int edtavDetallelinea_Visible ;
   private int subFsgrid1_Selectedindex ;
   private int subFsgrid1_Selectioncolor ;
   private int subFsgrid1_Hoveringcolor ;
   private int subGridmrec_alertasdts_Titlebackcolor ;
   private int subGridmrec_alertasdts_Selectedindex ;
   private int subGridmrec_alertasdts_Selectioncolor ;
   private int subGridmrec_alertasdts_Hoveringcolor ;
   private long GRIDMREC_ALERTASDTS_nFirstRecordOnPage ;
   private long AV47GridMRec_AlertaSDTsCurrentPage ;
   private long AV48GridMRec_AlertaSDTsPageCount ;
   private long FSGRID1_nCurrentRecord ;
   private long GRIDMREC_ALERTASDTS_nCurrentRecord ;
   private long GRIDMREC_ALERTASDTS_nRecordCount ;
   private long FSGRID1_nFirstRecordOnPage ;
   private long AV109InFilId ;
   private long AV50i ;
   private long GXv_int9[] ;
   private String Gridmrec_alertasdtspaginationbar_Selectedpage ;
   private String Combo_parfascod_Selectedvalue_get ;
   private String Combo_hdr_Selectedvalue_get ;
   private String Combo_fascod_Selectedvalue_get ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String Combo_segundos_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_109_idx="0001" ;
   private String AV17EmprCod ;
   private String AV9ContCod ;
   private String AV102UsurCod ;
   private String AV103Version ;
   private String AV145Pgmname ;
   private String sGXsfl_145_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A14693MEPrMaqCod ;
   private String A14691MEPrFasCod ;
   private String A14697MEPrHdr ;
   private String A14698MEPrUsu ;
   private String A14696MEPrParDsc ;
   private String A130BarCodPar ;
   private String A14692MEPrFasDsc ;
   private String A14694MEPrMaqDsc ;
   private String Combo_segundos_Cls ;
   private String Combo_segundos_Selectedvalue_set ;
   private String Combo_segundos_Selectedtext_set ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Combo_maqcod_Multiplevaluestype ;
   private String Combo_maqcod_Emptyitemtext ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Selectedvalue_set ;
   private String Combo_fascod_Multiplevaluestype ;
   private String Combo_hdr_Cls ;
   private String Combo_hdr_Selectedvalue_set ;
   private String Combo_hdr_Multiplevaluestype ;
   private String Combo_parfascod_Cls ;
   private String Combo_parfascod_Selectedvalue_set ;
   private String Combo_parfascod_Multiplevaluestype ;
   private String Dvpanel_panelfiltros_Width ;
   private String Dvpanel_panelfiltros_Cls ;
   private String Dvpanel_panelfiltros_Title ;
   private String Dvpanel_panelfiltros_Iconposition ;
   private String Gridmrec_alertasdtspaginationbar_Class ;
   private String Gridmrec_alertasdtspaginationbar_Pagingbuttonsposition ;
   private String Gridmrec_alertasdtspaginationbar_Pagingcaptionposition ;
   private String Gridmrec_alertasdtspaginationbar_Emptygridclass ;
   private String Gridmrec_alertasdtspaginationbar_Rowsperpageoptions ;
   private String Gridmrec_alertasdtspaginationbar_Previous ;
   private String Gridmrec_alertasdtspaginationbar_Next ;
   private String Gridmrec_alertasdtspaginationbar_Caption ;
   private String Gridmrec_alertasdtspaginationbar_Emptygridcaption ;
   private String Gridmrec_alertasdtspaginationbar_Rowsperpagecaption ;
   private String Dvpanel_panelgeneral_Width ;
   private String Dvpanel_panelgeneral_Cls ;
   private String Dvpanel_panelgeneral_Title ;
   private String Dvpanel_panelgeneral_Iconposition ;
   private String Gxuitabspanel_tabs1_Class ;
   private String Vererrrormaquina_modal_Width ;
   private String Vererrrormaquina_modal_Title ;
   private String Vererrrormaquina_modal_Confirmtype ;
   private String Vererrrormaquina_modal_Bodytype ;
   private String Gridmrec_alertasdts_empowerer_Gridinternalname ;
   private String subFsgrid1_Class ;
   private String subFsgrid1_Paged ;
   private String subFsgrid1_Showpagecontroller ;
   private String subFsgrid1_Showarrows ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panelfiltros_Internalname ;
   private String divPanelfiltros_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedsegundos_Internalname ;
   private String lblTextblockcombo_segundos_Internalname ;
   private String lblTextblockcombo_segundos_Jsonclick ;
   private String Combo_segundos_Caption ;
   private String Combo_segundos_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String divTablesplittedfascod_Internalname ;
   private String lblTextblockcombo_fascod_Internalname ;
   private String lblTextblockcombo_fascod_Jsonclick ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Internalname ;
   private String divTablesplittedhdr_Internalname ;
   private String lblTextblockcombo_hdr_Internalname ;
   private String lblTextblockcombo_hdr_Jsonclick ;
   private String Combo_hdr_Caption ;
   private String Combo_hdr_Internalname ;
   private String divTablesplittedparfascod_Internalname ;
   private String lblTextblockcombo_parfascod_Internalname ;
   private String lblTextblockcombo_parfascod_Jsonclick ;
   private String Combo_parfascod_Caption ;
   private String Combo_parfascod_Internalname ;
   private String TempTags ;
   private String lblActualizar_Internalname ;
   private String lblActualizar_Jsonclick ;
   private String lblActualizar_Class ;
   private String divTablerango_Internalname ;
   private String edtavDesdefechahora_Internalname ;
   private String edtavDesdefechahora_Jsonclick ;
   private String edtavHastafechahora_Internalname ;
   private String edtavHastafechahora_Jsonclick ;
   private String Uc_chrometer_Internalname ;
   private String Barraprogreso_Internalname ;
   private String Gxuitabspanel_tabs1_Internalname ;
   private String lblTabgeneral_title_Internalname ;
   private String lblTabgeneral_title_Jsonclick ;
   private String divTablegeneral_Internalname ;
   private String Dvpanel_panelgeneral_Internalname ;
   private String divPanelgeneral_Internalname ;
   private String lblTitulogeneral_Internalname ;
   private String lblTitulogeneral_Caption ;
   private String lblTitulogeneral_Jsonclick ;
   private String divTablemaquinas_Internalname ;
   private String sStyleString ;
   private String subFsgrid1_Internalname ;
   private String divGridmrec_alertasdtstablewithpaginationbar_Internalname ;
   private String subGridmrec_alertasdts_Internalname ;
   private String Gridmrec_alertasdtspaginationbar_Internalname ;
   private String lblTabdetalle_title_Internalname ;
   private String lblTabdetalle_title_Jsonclick ;
   private String divTabletabdetalle_Internalname ;
   private String divTablemasdetalles_Internalname ;
   private String WebComp_Wcmrec_detalle_Component ;
   private String OldWcmrec_detalle ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamon_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavSegundos_Internalname ;
   private String edtavSegundos_Jsonclick ;
   private String Gridmrec_alertasdts_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String edtavDetallelinea_Internalname ;
   private String edtavDatos__emprcod_Internalname ;
   private String edtavDatos__menvord_Internalname ;
   private String edtavDatos__mreclin_Internalname ;
   private String edtavDatos__mprecfec_Internalname ;
   private String edtavDatos__barcod_Internalname ;
   private String edtavDatos__barcodreo_Internalname ;
   private String edtavDatos__barcodpar_Internalname ;
   private String edtavDatos__maqcod_Internalname ;
   private String edtavDatos__maqdsc_Internalname ;
   private String edtavDatos__mprecplc_Internalname ;
   private String edtavDatos__fascod_Internalname ;
   private String edtavDatos__fasdsc_Internalname ;
   private String edtavDatos__parfascod_Internalname ;
   private String edtavDatos__parfasdsc_Internalname ;
   private String edtavDatos__mprecvalmn_Internalname ;
   private String edtavDatos__mprecval_Internalname ;
   private String edtavDatos__mprecvalmx_Internalname ;
   private String sGXsfl_109_fel_idx="0001" ;
   private String sGXsfl_145_fel_idx="0001" ;
   private String hsh ;
   private String AV116Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV117EmprNom ;
   private String GXv_char6[] ;
   private String edtavMaquinas__maqcod_Internalname ;
   private String edtavDetallelinea_Columnheaderclass ;
   private String edtavDatos__mprecfec_Columnheaderclass ;
   private String edtavDatos__barcod_Columnheaderclass ;
   private String edtavDatos__barcodreo_Columnheaderclass ;
   private String edtavDatos__barcodpar_Columnheaderclass ;
   private String edtavDatos__maqcod_Columnheaderclass ;
   private String edtavDatos__maqdsc_Columnheaderclass ;
   private String edtavDatos__mprecplc_Columnheaderclass ;
   private String edtavDatos__fascod_Columnheaderclass ;
   private String edtavDatos__fasdsc_Columnheaderclass ;
   private String edtavDatos__parfascod_Columnheaderclass ;
   private String edtavDatos__parfasdsc_Columnheaderclass ;
   private String edtavDatos__mprecvalmn_Columnheaderclass ;
   private String edtavDatos__mprecval_Columnheaderclass ;
   private String edtavDatos__mprecvalmx_Columnheaderclass ;
   private String lblTbmaquina_Caption ;
   private String lblImgcircle_Caption ;
   private String scmdbuf ;
   private String lblCronometrostartstop_Caption ;
   private String lblCronometrostartstop_Internalname ;
   private String lblTbmensajeactualizar_Caption ;
   private String lblTbmensajeactualizar_Internalname ;
   private String GXv_char7[] ;
   private String edtavDetallelinea_gximage ;
   private String edtavDetallelinea_Tooltiptext ;
   private String edtavDetallelinea_Columnclass ;
   private String edtavDatos__mprecfec_Columnclass ;
   private String edtavDatos__barcod_Columnclass ;
   private String edtavDatos__barcodreo_Columnclass ;
   private String edtavDatos__barcodpar_Columnclass ;
   private String edtavDatos__maqcod_Columnclass ;
   private String edtavDatos__maqdsc_Columnclass ;
   private String edtavDatos__mprecplc_Columnclass ;
   private String edtavDatos__fascod_Columnclass ;
   private String edtavDatos__fasdsc_Columnclass ;
   private String edtavDatos__parfascod_Columnclass ;
   private String edtavDatos__parfasdsc_Columnclass ;
   private String edtavDatos__mprecvalmn_Columnclass ;
   private String edtavDatos__mprecval_Columnclass ;
   private String edtavDatos__mprecvalmx_Columnclass ;
   private String tblTablevererrrormaquina_modal_Internalname ;
   private String Vererrrormaquina_modal_Internalname ;
   private String tblTablemergedcronometrostartstop_Internalname ;
   private String lblCronometrostartstop_Jsonclick ;
   private String lblTbmensajeactualizar_Jsonclick ;
   private String lblTbmaquina_Internalname ;
   private String lblVererrrormaquina_Internalname ;
   private String lblImgcircle_Internalname ;
   private String subFsgrid1_Linesclass ;
   private String divFsgrid1layouttable_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String tblTablemergedtbmaquina_Internalname ;
   private String lblTbmaquina_Jsonclick ;
   private String lblVererrrormaquina_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String lblImgcircle_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String tblUnnamedtablecontentfsfsgrid1_Internalname ;
   private String ROClassString ;
   private String edtavMaquinas__maqcod_Jsonclick ;
   private String subGridmrec_alertasdts_Class ;
   private String subGridmrec_alertasdts_Linesclass ;
   private String sImgUrl ;
   private String edtavDetallelinea_Jsonclick ;
   private String edtavDatos__emprcod_Jsonclick ;
   private String edtavDatos__menvord_Jsonclick ;
   private String edtavDatos__mreclin_Jsonclick ;
   private String edtavDatos__mprecfec_Jsonclick ;
   private String edtavDatos__barcod_Jsonclick ;
   private String edtavDatos__barcodreo_Jsonclick ;
   private String edtavDatos__barcodpar_Jsonclick ;
   private String edtavDatos__maqcod_Jsonclick ;
   private String edtavDatos__maqdsc_Jsonclick ;
   private String edtavDatos__mprecplc_Jsonclick ;
   private String edtavDatos__fascod_Jsonclick ;
   private String edtavDatos__fasdsc_Jsonclick ;
   private String edtavDatos__parfascod_Jsonclick ;
   private String edtavDatos__parfasdsc_Jsonclick ;
   private String edtavDatos__mprecvalmn_Jsonclick ;
   private String edtavDatos__mprecval_Jsonclick ;
   private String edtavDatos__mprecvalmx_Jsonclick ;
   private String subFsgrid1_Header ;
   private String subGridmrec_alertasdts_Header ;
   private java.util.Date AV86Desde ;
   private java.util.Date AV89Hasta ;
   private java.util.Date AV105Now ;
   private java.util.Date A14700MEPrReg ;
   private java.util.Date AV87DesdeFechaHora ;
   private java.util.Date AV90HastaFechaHora ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV21FueraRango ;
   private boolean AV82CronometroStart ;
   private boolean Combo_segundos_Emptyitem ;
   private boolean Combo_maqcod_Allowmultipleselection ;
   private boolean Combo_maqcod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Allowmultipleselection ;
   private boolean Combo_fascod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Emptyitem ;
   private boolean Combo_hdr_Allowmultipleselection ;
   private boolean Combo_hdr_Includeonlyselectedoption ;
   private boolean Combo_hdr_Emptyitem ;
   private boolean Combo_parfascod_Allowmultipleselection ;
   private boolean Combo_parfascod_Includeonlyselectedoption ;
   private boolean Combo_parfascod_Emptyitem ;
   private boolean Uc_chrometer_Visible ;
   private boolean Dvpanel_panelfiltros_Autowidth ;
   private boolean Dvpanel_panelfiltros_Autoheight ;
   private boolean Dvpanel_panelfiltros_Collapsible ;
   private boolean Dvpanel_panelfiltros_Collapsed ;
   private boolean Dvpanel_panelfiltros_Showcollapseicon ;
   private boolean Dvpanel_panelfiltros_Autoscroll ;
   private boolean Gridmrec_alertasdtspaginationbar_Showfirst ;
   private boolean Gridmrec_alertasdtspaginationbar_Showprevious ;
   private boolean Gridmrec_alertasdtspaginationbar_Shownext ;
   private boolean Gridmrec_alertasdtspaginationbar_Showlast ;
   private boolean Gridmrec_alertasdtspaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panelgeneral_Autowidth ;
   private boolean Dvpanel_panelgeneral_Autoheight ;
   private boolean Dvpanel_panelgeneral_Collapsible ;
   private boolean Dvpanel_panelgeneral_Collapsed ;
   private boolean Dvpanel_panelgeneral_Showcollapseicon ;
   private boolean Dvpanel_panelgeneral_Autoscroll ;
   private boolean Gxuitabspanel_tabs1_Historymanagement ;
   private boolean wbLoad ;
   private boolean bGXsfl_109_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean bGXsfl_145_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean bDynCreated_Wcmrec_detalle ;
   private boolean AV108ExisteFiltro ;
   private boolean gx_BV145 ;
   private boolean gx_BV109 ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean10[] ;
   private boolean AV88DetalleLinea_IsBlob ;
   private String AV99MRasTxt ;
   private String AV98MaqCodJSON ;
   private String AV83FasCodJSON ;
   private String AV84HdrJSON ;
   private String AV85ParFasCodJSON ;
   private String AV93Ip ;
   private String AV111InFilTkn ;
   private String A14699MEPrIp ;
   private String A14701MEPrTkn ;
   private String A14702MEPrObj ;
   private String AV146Detallelinea_GXI ;
   private String AV121Titulo ;
   private String AV88DetalleLinea ;
   private GXSimpleCollection<Short> AV66ParFasCod ;
   private GXSimpleCollection<Short> AV97LineaParFasCod ;
   private com.genexus.webpanels.GXWebGrid Fsgrid1Container ;
   private com.genexus.webpanels.GXWebGrid Gridmrec_alertasdtsContainer ;
   private com.genexus.webpanels.GXWebRow Fsgrid1Row ;
   private com.genexus.webpanels.GXWebRow Gridmrec_alertasdtsRow ;
   private com.genexus.webpanels.GXWebColumn Fsgrid1Column ;
   private com.genexus.webpanels.GXWebColumn Gridmrec_alertasdtsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcmrec_detalle ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.WebSession AV110WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelfiltros ;
   private com.genexus.webpanels.GXUserControl ucCombo_segundos ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.webpanels.GXUserControl ucCombo_hdr ;
   private com.genexus.webpanels.GXUserControl ucCombo_parfascod ;
   private com.genexus.webpanels.GXUserControl ucUc_chrometer ;
   private com.genexus.webpanels.GXUserControl ucBarraprogreso ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelgeneral ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_alertasdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucGridmrec_alertasdts_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucVererrrormaquina_modal ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavFuerarango ;
   private ICheckbox chkavDatos__mprecer ;
   private IDataStoreProvider pr_default ;
   private String[] H01WB2_A14702MEPrObj ;
   private String[] H01WB2_A14701MEPrTkn ;
   private java.util.Date[] H01WB2_A14700MEPrReg ;
   private String[] H01WB2_A14699MEPrIp ;
   private String[] H01WB2_A14698MEPrUsu ;
   private String[] H01WB2_A14697MEPrHdr ;
   private String[] H01WB2_A14691MEPrFasCod ;
   private String[] H01WB2_A14693MEPrMaqCod ;
   private String[] H01WB2_A396EmprCod ;
   private String[] H01WB2_A14696MEPrParDsc ;
   private short[] H01WB2_A14695MEPrParCod ;
   private String[] H01WB3_A14702MEPrObj ;
   private String[] H01WB3_A14701MEPrTkn ;
   private java.util.Date[] H01WB3_A14700MEPrReg ;
   private String[] H01WB3_A14699MEPrIp ;
   private String[] H01WB3_A14698MEPrUsu ;
   private String[] H01WB3_A14693MEPrMaqCod ;
   private String[] H01WB3_A14691MEPrFasCod ;
   private String[] H01WB3_A396EmprCod ;
   private String[] H01WB3_A14697MEPrHdr ;
   private String[] H01WB3_A130BarCodPar ;
   private byte[] H01WB3_A132BarCodReo ;
   private int[] H01WB3_A129BarCod ;
   private String[] H01WB4_A14702MEPrObj ;
   private String[] H01WB4_A14701MEPrTkn ;
   private java.util.Date[] H01WB4_A14700MEPrReg ;
   private String[] H01WB4_A14699MEPrIp ;
   private String[] H01WB4_A14698MEPrUsu ;
   private String[] H01WB4_A14693MEPrMaqCod ;
   private String[] H01WB4_A396EmprCod ;
   private String[] H01WB4_A14692MEPrFasDsc ;
   private String[] H01WB4_A14691MEPrFasCod ;
   private String[] H01WB5_A14702MEPrObj ;
   private String[] H01WB5_A14701MEPrTkn ;
   private java.util.Date[] H01WB5_A14700MEPrReg ;
   private String[] H01WB5_A14699MEPrIp ;
   private String[] H01WB5_A14698MEPrUsu ;
   private String[] H01WB5_A396EmprCod ;
   private String[] H01WB5_A14694MEPrMaqDsc ;
   private String[] H01WB5_A14693MEPrMaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV56MaqCod ;
   private GXSimpleCollection<String> AV18FasCod ;
   private GXSimpleCollection<String> AV91Hdr ;
   private GXSimpleCollection<String> AV96LineaMaqCod ;
   private GXSimpleCollection<String> AV94LineaFasCod ;
   private GXSimpleCollection<String> AV95LineaHdr ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV100Segundos_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV57MaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV19FasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV92Hdr_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV67ParFasCod_Data ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV12Datos ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> GXt_objcol_SdtMRec_AlertaSDT_Item11 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> GXv_objcol_SdtMRec_AlertaSDT_Item12[] ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaSDT_Item> AV76DatosClone ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item> AV59Maquinas ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV8Combo_DataItem ;
   private app.ingenieria.SdtMRec_AlertaSDT_Item AV11Dato ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV13DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5[] ;
   private app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item AV58Maquina ;
   private app.wwpbaseobjects.SdtWWPContext AV106WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext3[] ;
   private app.ingenieria.SdtInFilSDT AV107InFilSDT ;
   private app.ingenieria.SdtInFilSDT AV113BuscandoInFilSDT ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV120ProgressIndicator ;
}

final  class mrec_alerta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01WB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14693MEPrMaqCod ,
                                          GXSimpleCollection<String> AV56MaqCod ,
                                          String A14691MEPrFasCod ,
                                          GXSimpleCollection<String> AV18FasCod ,
                                          String A14697MEPrHdr ,
                                          GXSimpleCollection<String> AV91Hdr ,
                                          java.util.Date A14700MEPrReg ,
                                          java.util.Date AV105Now ,
                                          String A14698MEPrUsu ,
                                          String AV102UsurCod ,
                                          String A14699MEPrIp ,
                                          String AV93Ip ,
                                          String A14701MEPrTkn ,
                                          String AV111InFilTkn ,
                                          String A14702MEPrObj ,
                                          String AV145Pgmname ,
                                          String AV17EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[6];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS MEPrObj, NULL AS MEPrTkn, NULL AS MEPrReg, NULL AS MEPrIp, NULL AS MEPrUsu, NULL AS MEPrHdr, NULL AS MEPrFasCod, NULL AS MEPrMaqCod, NULL" ;
      scmdbuf += " AS EmprCod, MEPrParDsc, MEPrParCod FROM ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, MEPrHdr, MEPrFasCod, MEPrMaqCod, EmprCod, MEPrParDsc, MEPrParCod FROM" ;
      scmdbuf += " MEPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV56MaqCod, "MEPrMaqCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV18FasCod, "MEPrFasCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91Hdr, "MEPrHdr IN (", ")")+")");
      addWhere(sWhereString, "(MEPrReg >= ?)");
      addWhere(sWhereString, "(MEPrUsu = ?)");
      addWhere(sWhereString, "(MEPrIp = ?)");
      addWhere(sWhereString, "(MEPrTkn = ?)");
      addWhere(sWhereString, "(MEPrObj = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H01WB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14691MEPrFasCod ,
                                          GXSimpleCollection<String> AV18FasCod ,
                                          String A14693MEPrMaqCod ,
                                          GXSimpleCollection<String> AV56MaqCod ,
                                          java.util.Date A14700MEPrReg ,
                                          java.util.Date AV105Now ,
                                          String A14698MEPrUsu ,
                                          String AV102UsurCod ,
                                          String A14699MEPrIp ,
                                          String AV93Ip ,
                                          String A14701MEPrTkn ,
                                          String AV111InFilTkn ,
                                          String A14702MEPrObj ,
                                          String AV145Pgmname ,
                                          String AV17EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[6];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS MEPrObj, NULL AS MEPrTkn, NULL AS MEPrReg, NULL AS MEPrIp, NULL AS MEPrUsu, NULL AS MEPrMaqCod, NULL AS MEPrFasCod, EmprCod, MEPrHdr, BarCodPar," ;
      scmdbuf += " BarCodReo, BarCod FROM ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, MEPrMaqCod, MEPrFasCod, EmprCod, MEPrHdr, BarCodPar, BarCodReo, BarCod FROM MEPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV18FasCod, "MEPrFasCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV56MaqCod, "MEPrMaqCod IN (", ")")+")");
      addWhere(sWhereString, "(MEPrReg >= ?)");
      addWhere(sWhereString, "(MEPrUsu = ?)");
      addWhere(sWhereString, "(MEPrIp = ?)");
      addWhere(sWhereString, "(MEPrTkn = ?)");
      addWhere(sWhereString, "(MEPrObj = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT" ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H01WB4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14693MEPrMaqCod ,
                                          GXSimpleCollection<String> AV56MaqCod ,
                                          java.util.Date A14700MEPrReg ,
                                          java.util.Date AV105Now ,
                                          String A14698MEPrUsu ,
                                          String AV102UsurCod ,
                                          String A14699MEPrIp ,
                                          String AV93Ip ,
                                          String A14701MEPrTkn ,
                                          String AV111InFilTkn ,
                                          String A14702MEPrObj ,
                                          String AV145Pgmname ,
                                          String AV17EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[6];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS MEPrObj, NULL AS MEPrTkn, NULL AS MEPrReg, NULL AS MEPrIp, NULL AS MEPrUsu, NULL AS MEPrMaqCod, NULL AS EmprCod, MEPrFasDsc, MEPrFasCod FROM" ;
      scmdbuf += " ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, MEPrMaqCod, EmprCod, MEPrFasDsc, MEPrFasCod FROM MEPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV56MaqCod, "MEPrMaqCod IN (", ")")+")");
      addWhere(sWhereString, "(MEPrReg >= ?)");
      addWhere(sWhereString, "(MEPrUsu = ?)");
      addWhere(sWhereString, "(MEPrIp = ?)");
      addWhere(sWhereString, "(MEPrTkn = ?)");
      addWhere(sWhereString, "(MEPrObj = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_H01WB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
            case 1 :
                  return conditional_H01WB3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 2 :
                  return conditional_H01WB4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WB4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WB5", "SELECT DISTINCT NULL AS MEPrObj, MEPrTkn, NULL AS MEPrReg, MEPrIp, MEPrUsu, EmprCod, MEPrMaqDsc, MEPrMaqCod FROM ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, EmprCod, MEPrMaqDsc, MEPrMaqCod FROM MEPr WHERE (EmprCod = ?) AND (MEPrReg >= ?) AND (MEPrUsu = ?) AND (MEPrIp = ?) AND (MEPrTkn = ?) AND (MEPrObj = ?) ORDER BY EmprCod) DistinctT ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 256);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 129);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 256);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 129);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 256);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 129);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDateTime(2, (java.util.Date)parms[1], false, true);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 20);
               stmt.setVarchar(5, (String)parms[4], 256);
               stmt.setString(6, (String)parms[5], 129);
               return;
      }
   }

}

