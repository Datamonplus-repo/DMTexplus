package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultamaquinasproduccionww_impl extends GXDataArea
{
   public consultamaquinasproduccionww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultamaquinasproduccionww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultamaquinasproduccionww_impl.class ));
   }

   public consultamaquinasproduccionww_impl( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavLecestado = new HTMLChoice();
      cmbLecEstado = new HTMLChoice();
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_88 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_88"))) ;
      nGXsfl_88_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_88_idx"))) ;
      sGXsfl_88_idx = httpContext.GetPar( "sGXsfl_88_idx") ;
      AV93EmprCod = httpContext.GetPar( "EmprCod") ;
      AV44MaqDsc = httpContext.GetPar( "MaqDsc") ;
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
      cmbavLecestado.fromJSonString( httpContext.GetNextPar( ));
      AV99LecEstado = httpContext.GetPar( "LecEstado") ;
      AV33LecMaqCod = httpContext.GetPar( "LecMaqCod") ;
      AV108LecMaqCod_To = httpContext.GetPar( "LecMaqCod_To") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5ColumnsSelector);
      AV110LoadGridData = GXutil.strtobool( httpContext.GetPar( "LoadGridData")) ;
      AV151Pgmname = httpContext.GetPar( "Pgmname") ;
      AV46OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV48OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV73TFLecMaqCod = httpContext.GetPar( "TFLecMaqCod") ;
      AV74TFLecMaqCod_Sel = httpContext.GetPar( "TFLecMaqCod_Sel") ;
      AV67TFLecFec = localUtil.parseDateParm( httpContext.GetPar( "TFLecFec")) ;
      AV77TFLecOpeCod = (int)(GXutil.lval( httpContext.GetPar( "TFLecOpeCod"))) ;
      AV78TFLecOpeCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFLecOpeCod_To"))) ;
      AV69TFLecHdr = httpContext.GetPar( "TFLecHdr") ;
      AV70TFLecHdr_Sel = httpContext.GetPar( "TFLecHdr_Sel") ;
      AV98TFLecEstado_Sel = httpContext.GetPar( "TFLecEstado_Sel") ;
      AV79TFLecParCod = (short)(GXutil.lval( httpContext.GetPar( "TFLecParCod"))) ;
      AV80TFLecParCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFLecParCod_To"))) ;
      AV141TFlecOpeNom = httpContext.GetPar( "TFlecOpeNom") ;
      AV142TFlecOpeNom_Sel = httpContext.GetPar( "TFlecOpeNom_Sel") ;
      AV143TFLecFasDsc = httpContext.GetPar( "TFLecFasDsc") ;
      AV144TFLecFasDsc_Sel = httpContext.GetPar( "TFLecFasDsc_Sel") ;
      AV145TFLecParNom = httpContext.GetPar( "TFLecParNom") ;
      AV146TFLecParNom_Sel = httpContext.GetPar( "TFLecParNom_Sel") ;
      AV93EmprCod = httpContext.GetPar( "EmprCod") ;
      AV44MaqDsc = httpContext.GetPar( "MaqDsc") ;
      A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
      A867ParCodNom = httpContext.GetPar( "ParCodNom") ;
      n867ParCodNom = false ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      A153BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
      A460FasDsc = httpContext.GetPar( "FasDsc") ;
      AV89vEstParo = httpContext.GetPar( "vEstParo") ;
      AV21InicioParo = localUtil.parseDTimeParm( httpContext.GetPar( "InicioParo")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV99LecEstado, AV33LecMaqCod, AV108LecMaqCod_To, AV5ColumnsSelector, AV110LoadGridData, AV151Pgmname, AV46OrderedBy, AV48OrderedDsc, AV73TFLecMaqCod, AV74TFLecMaqCod_Sel, AV67TFLecFec, AV77TFLecOpeCod, AV78TFLecOpeCod_To, AV69TFLecHdr, AV70TFLecHdr_Sel, AV98TFLecEstado_Sel, AV79TFLecParCod, AV80TFLecParCod_To, AV141TFlecOpeNom, AV142TFlecOpeNom_Sel, AV143TFLecFasDsc, AV144TFLecFasDsc_Sel, AV145TFLecParNom, AV146TFLecParNom_Sel, AV93EmprCod, AV44MaqDsc, A656ParCod, A867ParCodNom, A129BarCod, A132BarCodReo, A130BarCodPar, A194BarOrdLin, A153BarFasEst, A460FasDsc, AV89vEstParo, AV21InicioParo) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
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
      paIY2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startIY2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consultamaquinasproduccionww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINICIOPARO", getSecureSignedToken( "", localUtil.format( AV21InicioParo, "99/99/99 99:99:99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ConsultaMaquinasProduccionWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV151Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultamaquinasproduccionww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vLECESTADO", GXutil.rtrim( AV99LecEstado));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vLECMAQCOD", GXutil.rtrim( AV33LecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vLECMAQCOD_TO", GXutil.rtrim( AV108LecMaqCod_To));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_88", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_88, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV10DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV10DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLECMAQCOD_DATA", AV107LecMaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLECMAQCOD_DATA", AV107LecMaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLECMAQCOD_TO_DATA", AV109LecMaqCod_To_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLECMAQCOD_TO_DATA", AV109LecMaqCod_To_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV16GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV17GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADGRIDDATA", AV110LoadGridData);
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV46OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV48OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECMAQCOD", GXutil.rtrim( AV73TFLecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECMAQCOD_SEL", GXutil.rtrim( AV74TFLecMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFEC", localUtil.dtoc( AV67TFLecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECOPECOD", GXutil.ltrim( localUtil.ntoc( AV77TFLecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV78TFLecOpeCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECHDR", GXutil.rtrim( AV69TFLecHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECHDR_SEL", GXutil.rtrim( AV70TFLecHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECESTADO_SEL", GXutil.rtrim( AV98TFLecEstado_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECPARCOD", GXutil.ltrim( localUtil.ntoc( AV79TFLecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECPARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV80TFLecParCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECOPENOM", GXutil.rtrim( AV141TFlecOpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECOPENOM_SEL", GXutil.rtrim( AV142TFlecOpeNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASDSC", GXutil.rtrim( AV143TFLecFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASDSC_SEL", GXutil.rtrim( AV144TFLecFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECPARNOM", GXutil.rtrim( AV145TFLecParNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECPARNOM_SEL", GXutil.rtrim( AV146TFLecParNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCODNOM", GXutil.rtrim( A867ParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vINICIOPARO", localUtil.ttoc( AV21InicioParo, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINICIOPARO", getSecureSignedToken( "", localUtil.format( AV21InicioParo, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LECFASCOD", GXutil.rtrim( A1171LecFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Cls", GXutil.rtrim( Combo_lecmaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_lecmaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Emptyitemtext", GXutil.rtrim( Combo_lecmaqcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_TO_Cls", GXutil.rtrim( Combo_lecmaqcod_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_TO_Selectedvalue_set", GXutil.rtrim( Combo_lecmaqcod_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_TO_Emptyitemtext", GXutil.rtrim( Combo_lecmaqcod_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_GENERALES_Width", GXutil.rtrim( Dvpanel_panel_generales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_GENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_generales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_GENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_generales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_GENERALES_Cls", GXutil.rtrim( Dvpanel_panel_generales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_GENERALES_Title", GXutil.rtrim( Dvpanel_panel_generales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_GENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_generales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_GENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_generales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_GENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_generales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_GENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_generales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_GENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_generales_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Width", GXutil.rtrim( Dvpanel_panel_filtros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Cls", GXutil.rtrim( Dvpanel_panel_filtros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Title", GXutil.rtrim( Dvpanel_panel_filtros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADOS_Width", GXutil.rtrim( Dvpanel_panel_resultados_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADOS_Autowidth", GXutil.booltostr( Dvpanel_panel_resultados_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADOS_Autoheight", GXutil.booltostr( Dvpanel_panel_resultados_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADOS_Cls", GXutil.rtrim( Dvpanel_panel_resultados_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADOS_Title", GXutil.rtrim( Dvpanel_panel_resultados_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADOS_Collapsible", GXutil.booltostr( Dvpanel_panel_resultados_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADOS_Collapsed", GXutil.booltostr( Dvpanel_panel_resultados_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADOS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_resultados_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADOS_Iconposition", GXutil.rtrim( Dvpanel_panel_resultados_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADOS_Autoscroll", GXutil.booltostr( Dvpanel_panel_resultados_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_lecmaqcod_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_lecmaqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_lecmaqcod_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LECMAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_lecmaqcod_Selectedvalue_get));
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
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
         weIY2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtIY2( ) ;
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
      return formatLink("app.consultamaquinasproduccionww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ConsultaMaquinasProduccionWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Maquinas Produccion", "") ;
   }

   public void wbIY0( )
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
         ucDvpanel_panel_filtros.setProperty("Width", Dvpanel_panel_filtros_Width);
         ucDvpanel_panel_filtros.setProperty("AutoWidth", Dvpanel_panel_filtros_Autowidth);
         ucDvpanel_panel_filtros.setProperty("AutoHeight", Dvpanel_panel_filtros_Autoheight);
         ucDvpanel_panel_filtros.setProperty("Cls", Dvpanel_panel_filtros_Cls);
         ucDvpanel_panel_filtros.setProperty("Title", Dvpanel_panel_filtros_Title);
         ucDvpanel_panel_filtros.setProperty("Collapsible", Dvpanel_panel_filtros_Collapsible);
         ucDvpanel_panel_filtros.setProperty("Collapsed", Dvpanel_panel_filtros_Collapsed);
         ucDvpanel_panel_filtros.setProperty("ShowCollapseIcon", Dvpanel_panel_filtros_Showcollapseicon);
         ucDvpanel_panel_filtros.setProperty("IconPosition", Dvpanel_panel_filtros_Iconposition);
         ucDvpanel_panel_filtros.setProperty("AutoScroll", Dvpanel_panel_filtros_Autoscroll);
         ucDvpanel_panel_filtros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtros_Internalname, "DVPANEL_PANEL_FILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSContainer"+"Panel_Filtros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_generales.setProperty("Width", Dvpanel_panel_generales_Width);
         ucDvpanel_panel_generales.setProperty("AutoWidth", Dvpanel_panel_generales_Autowidth);
         ucDvpanel_panel_generales.setProperty("AutoHeight", Dvpanel_panel_generales_Autoheight);
         ucDvpanel_panel_generales.setProperty("Cls", Dvpanel_panel_generales_Cls);
         ucDvpanel_panel_generales.setProperty("Title", Dvpanel_panel_generales_Title);
         ucDvpanel_panel_generales.setProperty("Collapsible", Dvpanel_panel_generales_Collapsible);
         ucDvpanel_panel_generales.setProperty("Collapsed", Dvpanel_panel_generales_Collapsed);
         ucDvpanel_panel_generales.setProperty("ShowCollapseIcon", Dvpanel_panel_generales_Showcollapseicon);
         ucDvpanel_panel_generales.setProperty("IconPosition", Dvpanel_panel_generales_Iconposition);
         ucDvpanel_panel_generales.setProperty("AutoScroll", Dvpanel_panel_generales_Autoscroll);
         ucDvpanel_panel_generales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_generales_Internalname, "DVPANEL_PANEL_GENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_GENERALESContainer"+"Panel_Generales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_generales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablerightheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefilters_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedlecmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_lecmaqcod_Internalname, httpContext.getMessage( "Máquina Inicial", ""), "", "", lblTextblockcombo_lecmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ConsultaMaquinasProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_lecmaqcod.setProperty("Caption", Combo_lecmaqcod_Caption);
         ucCombo_lecmaqcod.setProperty("Cls", Combo_lecmaqcod_Cls);
         ucCombo_lecmaqcod.setProperty("EmptyItemText", Combo_lecmaqcod_Emptyitemtext);
         ucCombo_lecmaqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_lecmaqcod.setProperty("DropDownOptionsData", AV107LecMaqCod_Data);
         ucCombo_lecmaqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lecmaqcod_Internalname, "COMBO_LECMAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedlecmaqcod_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_lecmaqcod_to_Internalname, httpContext.getMessage( "Máquina Final", ""), "", "", lblTextblockcombo_lecmaqcod_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ConsultaMaquinasProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_lecmaqcod_to.setProperty("Caption", Combo_lecmaqcod_to_Caption);
         ucCombo_lecmaqcod_to.setProperty("Cls", Combo_lecmaqcod_to_Cls);
         ucCombo_lecmaqcod_to.setProperty("EmptyItemText", Combo_lecmaqcod_to_Emptyitemtext);
         ucCombo_lecmaqcod_to.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_lecmaqcod_to.setProperty("DropDownOptionsData", AV109LecMaqCod_To_Data);
         ucCombo_lecmaqcod_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lecmaqcod_to_Internalname, "COMBO_LECMAQCOD_TOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavLecestado.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavLecestado.getInternalname(), httpContext.getMessage( "Estado", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavLecestado, cmbavLecestado.getInternalname(), GXutil.rtrim( AV99LecEstado), 1, cmbavLecestado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavLecestado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "", true, (byte)(0), "HLP_ConsultaMaquinasProduccionWW.htm");
         cmbavLecestado.setValue( GXutil.rtrim( AV99LecEstado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavLecestado.getInternalname(), "Values", cmbavLecestado.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsearch_Internalname, "gx.evt.setGridEvt("+GXutil.str( 88, 2, 0)+","+"null"+");", httpContext.getMessage( "Ver resultado", ""), bttBtnsearch_Jsonclick, 5, httpContext.getMessage( "GX_BtnSearch", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSEARCH\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaMaquinasProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 88, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaMaquinasProduccionWW.htm");
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
         /* User Defined Control */
         ucDatamon.render(context, "datamonjs", Datamon_Internalname, "DATAMONContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_resultados.setProperty("Width", Dvpanel_panel_resultados_Width);
         ucDvpanel_panel_resultados.setProperty("AutoWidth", Dvpanel_panel_resultados_Autowidth);
         ucDvpanel_panel_resultados.setProperty("AutoHeight", Dvpanel_panel_resultados_Autoheight);
         ucDvpanel_panel_resultados.setProperty("Cls", Dvpanel_panel_resultados_Cls);
         ucDvpanel_panel_resultados.setProperty("Title", Dvpanel_panel_resultados_Title);
         ucDvpanel_panel_resultados.setProperty("Collapsible", Dvpanel_panel_resultados_Collapsible);
         ucDvpanel_panel_resultados.setProperty("Collapsed", Dvpanel_panel_resultados_Collapsed);
         ucDvpanel_panel_resultados.setProperty("ShowCollapseIcon", Dvpanel_panel_resultados_Showcollapseicon);
         ucDvpanel_panel_resultados.setProperty("IconPosition", Dvpanel_panel_resultados_Iconposition);
         ucDvpanel_panel_resultados.setProperty("AutoScroll", Dvpanel_panel_resultados_Autoscroll);
         ucDvpanel_panel_resultados.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_resultados_Internalname, "DVPANEL_PANEL_RESULTADOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_RESULTADOSContainer"+"Panel_Resultados"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_resultados_Internalname, divPanel_resultados_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginBottom", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebarraprogreso_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 88, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaMaquinasProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 88, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaMaquinasProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 88, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaMaquinasProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol88( ) ;
      }
      if ( wbEnd == 88 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_88 = (int)(nGXsfl_88_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV16GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV17GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0125"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0125"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_88_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0125"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV151Pgmname), GXutil.rtrim( localUtil.format( AV151Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultaMaquinasProduccionWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecmaqcod_Internalname, GXutil.rtrim( AV33LecMaqCod), GXutil.rtrim( localUtil.format( AV33LecMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecmaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavLecmaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultaMaquinasProduccionWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecmaqcod_to_Internalname, GXutil.rtrim( AV108LecMaqCod_To), GXutil.rtrim( localUtil.format( AV108LecMaqCod_To, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecmaqcod_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavLecmaqcod_to_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultaMaquinasProduccionWW.htm");
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
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV5ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lecfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lecfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lecfecauxdate_Internalname, localUtil.format(AV8DDO_LecFecAuxDate, "99/99/99"), localUtil.format( AV8DDO_LecFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lecfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultaMaquinasProduccionWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lecfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultaMaquinasProduccionWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 88 )
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
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startIY2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Maquinas Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupIY0( ) ;
   }

   public void wsIY2( )
   {
      startIY2( ) ;
      evtIY2( ) ;
   }

   public void evtIY2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_LECMAQCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11IY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_LECMAQCOD_TO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12IY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13IY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14IY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15IY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16IY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSEARCH'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSearch' */
                           e17IY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e18IY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e19IY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e20IY2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_88_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_882( ) ;
                           AV104DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV104DetailWebComponent);
                           A1166LecMaqCod = httpContext.cgiGet( edtLecMaqCod_Internalname) ;
                           AV44MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqdsc_Internalname, AV44MaqDsc);
                           A1174LecFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLecFec_Internalname), 0)) ;
                           n1174LecFec = false ;
                           A1170LecOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtLecOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1170LecOpeCod = false ;
                           AV45OpeNom = httpContext.cgiGet( edtavOpenom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavOpenom_Internalname, AV45OpeNom);
                           A13721LecHdr = httpContext.cgiGet( edtLecHdr_Internalname) ;
                           cmbLecEstado.setName( cmbLecEstado.getInternalname() );
                           cmbLecEstado.setValue( httpContext.cgiGet( cmbLecEstado.getInternalname()) );
                           A13722LecEstado = httpContext.cgiGet( cmbLecEstado.getInternalname()) ;
                           A1172LecParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtLecParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1172LecParCod = false ;
                           AV50ParCodNom = httpContext.cgiGet( edtavParcodnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavParcodnom_Internalname, AV50ParCodNom);
                           AV53Texto1 = httpContext.cgiGet( edtavTexto1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTexto1_Internalname, AV53Texto1);
                           AV93EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavEmprcod_Internalname, AV93EmprCod);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
                           A1167LecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtLecBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1167LecBarCod = false ;
                           A1168LecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtLecBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1168LecBarReo = false ;
                           A1169LecBarPar = httpContext.cgiGet( edtLecBarPar_Internalname) ;
                           n1169LecBarPar = false ;
                           A1188LecFasOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtLecFasOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1188LecFasOrd = false ;
                           AV14Fin = httpContext.cgiGet( edtavFin_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFin_Internalname, AV14Fin);
                           AV89vEstParo = httpContext.cgiGet( edtavVestparo_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavVestparo_Internalname, AV89vEstParo);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVESTPARO"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV89vEstParo, ""))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
                              GX_FocusControl = edtavClicod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV116CliCod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
                           }
                           else
                           {
                              AV116CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
                           }
                           AV117CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV117CliNom);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
                           AV118BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV118BarSer);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
                           AV119BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV119BarSerDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
                           AV120BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV120BarColNom);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
                              GX_FocusControl = edtavBarcolnum_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV121BarColNum = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
                           }
                           else
                           {
                              AV121BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
                              GX_FocusControl = edtavHisprodti_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV122HisProdti = GXutil.resetTime( GXutil.nullDate() );
                              httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           else
                           {
                              AV122HisProdti = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname), 0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
                              GX_FocusControl = edtavHisprodtf_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV123HisProdtf = GXutil.resetTime( GXutil.nullDate() );
                              httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           else
                           {
                              AV123HisProdtf = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname), 0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           AV124HisProF = GXutil.upper( httpContext.cgiGet( edtavHisprof_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHisprof_Internalname, AV124HisProF);
                           A14259lecOpeNom = httpContext.cgiGet( edtlecOpeNom_Internalname) ;
                           A14260LecFasDsc = httpContext.cgiGet( edtLecFasDsc_Internalname) ;
                           A14261LecParNom = httpContext.cgiGet( edtLecParNom_Internalname) ;
                           AV148PedidoCliente = httpContext.cgiGet( edtavPedidocliente_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPedidocliente_Internalname, AV148PedidoCliente);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV148PedidoCliente, ""))));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e21IY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e22IY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e23IY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Lecestado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vLECESTADO"), AV99LecEstado) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Lecmaqcod Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vLECMAQCOD"), AV33LecMaqCod) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Lecmaqcod_to Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vLECMAQCOD_TO"), AV108LecMaqCod_To) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
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
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 125 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0125") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0125", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weIY2( )
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

   public void paIY2( )
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
            GX_FocusControl = cmbavLecestado.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_882( ) ;
      while ( nGXsfl_88_idx <= nRC_GXsfl_88 )
      {
         sendrow_882( ) ;
         nGXsfl_88_idx = ((subGrid_Islastpage==1)&&(nGXsfl_88_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_88_idx+1) ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_882( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV99LecEstado ,
                                 String AV33LecMaqCod ,
                                 String AV108LecMaqCod_To ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ,
                                 boolean AV110LoadGridData ,
                                 String AV151Pgmname ,
                                 short AV46OrderedBy ,
                                 boolean AV48OrderedDsc ,
                                 String AV73TFLecMaqCod ,
                                 String AV74TFLecMaqCod_Sel ,
                                 java.util.Date AV67TFLecFec ,
                                 int AV77TFLecOpeCod ,
                                 int AV78TFLecOpeCod_To ,
                                 String AV69TFLecHdr ,
                                 String AV70TFLecHdr_Sel ,
                                 String AV98TFLecEstado_Sel ,
                                 short AV79TFLecParCod ,
                                 short AV80TFLecParCod_To ,
                                 String AV141TFlecOpeNom ,
                                 String AV142TFlecOpeNom_Sel ,
                                 String AV143TFLecFasDsc ,
                                 String AV144TFLecFasDsc_Sel ,
                                 String AV145TFLecParNom ,
                                 String AV146TFLecParNom_Sel ,
                                 String AV93EmprCod ,
                                 String AV44MaqDsc ,
                                 short A656ParCod ,
                                 String A867ParCodNom ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 short A194BarOrdLin ,
                                 byte A153BarFasEst ,
                                 String A460FasDsc ,
                                 String AV89vEstParo ,
                                 java.util.Date AV21InicioParo )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e22IY2 ();
      GRID_nCurrentRecord = 0 ;
      rfIY2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ConsultaMaquinasProduccionWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV151Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultamaquinasproduccionww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVESTPARO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89vEstParo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVESTPARO", GXutil.rtrim( AV89vEstParo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV93EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LECBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1167LecBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARCOD", GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LECBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1168LecBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARREO", GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LECBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A1169LecBarPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARPAR", GXutil.rtrim( A1169LecBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV116CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV117CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV148PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDIDOCLIENTE", GXutil.rtrim( AV148PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV118BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV119BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM", GXutil.rtrim( AV120BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV121BarColNum, (byte)(6), (byte)(0), ".", "")));
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
      if ( cmbavLecestado.getItemCount() > 0 )
      {
         AV99LecEstado = cmbavLecestado.getValidValue(AV99LecEstado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99LecEstado", AV99LecEstado);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavLecestado.setValue( GXutil.rtrim( AV99LecEstado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavLecestado.getInternalname(), "Values", cmbavLecestado.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfIY2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV151Pgmname = "ConsultaMaquinasProduccionWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV151Pgmname", AV151Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavParcodnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavParcodnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavParcodnom_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavTexto1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto1_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFin_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavVestparo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVestparo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVestparo_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavHisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodti_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavHisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodtf_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavHisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprof_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV74TFLecMaqCod_Sel ,
                                           AV73TFLecMaqCod ,
                                           AV67TFLecFec ,
                                           Integer.valueOf(AV77TFLecOpeCod) ,
                                           Integer.valueOf(AV78TFLecOpeCod_To) ,
                                           AV70TFLecHdr_Sel ,
                                           AV69TFLecHdr ,
                                           Short.valueOf(AV79TFLecParCod) ,
                                           Short.valueOf(AV80TFLecParCod_To) ,
                                           Boolean.valueOf(AV110LoadGridData) ,
                                           AV33LecMaqCod ,
                                           AV108LecMaqCod_To ,
                                           A1166LecMaqCod ,
                                           A1174LecFec ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A396EmprCod ,
                                           Short.valueOf(AV46OrderedBy) ,
                                           Boolean.valueOf(AV48OrderedDsc) ,
                                           AV99LecEstado ,
                                           A13722LecEstado ,
                                           AV98TFLecEstado_Sel ,
                                           AV142TFlecOpeNom_Sel ,
                                           AV141TFlecOpeNom ,
                                           A14259lecOpeNom ,
                                           AV144TFLecFasDsc_Sel ,
                                           AV143TFLecFasDsc ,
                                           A14260LecFasDsc ,
                                           AV146TFLecParNom_Sel ,
                                           AV145TFLecParNom ,
                                           A14261LecParNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73TFLecMaqCod = GXutil.padr( GXutil.rtrim( AV73TFLecMaqCod), 6, "%") ;
      lV69TFLecHdr = GXutil.padr( GXutil.rtrim( AV69TFLecHdr), 11, "%") ;
      /* Using cursor H00IY2 */
      pr_default.execute(0, new Object[] {lV73TFLecMaqCod, AV74TFLecMaqCod_Sel, AV67TFLecFec, Integer.valueOf(AV77TFLecOpeCod), Integer.valueOf(AV78TFLecOpeCod_To), lV69TFLecHdr, AV70TFLecHdr_Sel, Short.valueOf(AV79TFLecParCod), Short.valueOf(AV80TFLecParCod_To), AV33LecMaqCod, AV108LecMaqCod_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13721LecHdr = H00IY2_A13721LecHdr[0] ;
         A1174LecFec = H00IY2_A1174LecFec[0] ;
         n1174LecFec = H00IY2_n1174LecFec[0] ;
         A1166LecMaqCod = H00IY2_A1166LecMaqCod[0] ;
         A1188LecFasOrd = H00IY2_A1188LecFasOrd[0] ;
         n1188LecFasOrd = H00IY2_n1188LecFasOrd[0] ;
         A1169LecBarPar = H00IY2_A1169LecBarPar[0] ;
         n1169LecBarPar = H00IY2_n1169LecBarPar[0] ;
         A1168LecBarReo = H00IY2_A1168LecBarReo[0] ;
         n1168LecBarReo = H00IY2_n1168LecBarReo[0] ;
         A1167LecBarCod = H00IY2_A1167LecBarCod[0] ;
         n1167LecBarCod = H00IY2_n1167LecBarCod[0] ;
         A1170LecOpeCod = H00IY2_A1170LecOpeCod[0] ;
         n1170LecOpeCod = H00IY2_n1170LecOpeCod[0] ;
         A1171LecFasCod = H00IY2_A1171LecFasCod[0] ;
         n1171LecFasCod = H00IY2_n1171LecFasCod[0] ;
         A1172LecParCod = H00IY2_A1172LecParCod[0] ;
         n1172LecParCod = H00IY2_n1172LecParCod[0] ;
         A396EmprCod = H00IY2_A396EmprCod[0] ;
         GXt_char1 = A13722LecEstado ;
         GXv_char2[0] = GXt_char1 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char2) ;
         consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char2[0] ;
         A13722LecEstado = GXt_char1 ;
         if ( (GXutil.strcmp("", AV99LecEstado)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV99LecEstado) == 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV98TFLecEstado_Sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV98TFLecEstado_Sel) == 0 ) ) )
            {
               GXt_char1 = A14259lecOpeNom ;
               GXv_char2[0] = GXt_char1 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char2) ;
               consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char2[0] ;
               A14259lecOpeNom = GXt_char1 ;
               if ( ! ( (GXutil.strcmp("", AV142TFlecOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV141TFlecOpeNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV141TFlecOpeNom) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV142TFlecOpeNom_Sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV142TFlecOpeNom_Sel) == 0 ) ) )
                  {
                     GXt_char1 = A14260LecFasDsc ;
                     GXv_char2[0] = GXt_char1 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char2) ;
                     consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char2[0] ;
                     A14260LecFasDsc = GXt_char1 ;
                     if ( ! ( (GXutil.strcmp("", AV144TFLecFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV143TFLecFasDsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV143TFLecFasDsc) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV144TFLecFasDsc_Sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV144TFLecFasDsc_Sel) == 0 ) ) )
                        {
                           GXt_char1 = A14261LecParNom ;
                           GXv_char2[0] = GXt_char1 ;
                           new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char2) ;
                           consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char2[0] ;
                           A14261LecParNom = GXt_char1 ;
                           if ( ! ( (GXutil.strcmp("", AV146TFLecParNom_Sel)==0) && ( ! (GXutil.strcmp("", AV145TFLecParNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV145TFLecParNom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV146TFLecParNom_Sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV146TFLecParNom_Sel) == 0 ) ) )
                              {
                                 GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfIY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(88) ;
      /* Execute user event: Refresh */
      e22IY2 ();
      nGXsfl_88_idx = 1 ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_882( ) ;
      bGXsfl_88_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_882( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV74TFLecMaqCod_Sel ,
                                              AV73TFLecMaqCod ,
                                              AV67TFLecFec ,
                                              Integer.valueOf(AV77TFLecOpeCod) ,
                                              Integer.valueOf(AV78TFLecOpeCod_To) ,
                                              AV70TFLecHdr_Sel ,
                                              AV69TFLecHdr ,
                                              Short.valueOf(AV79TFLecParCod) ,
                                              Short.valueOf(AV80TFLecParCod_To) ,
                                              Boolean.valueOf(AV110LoadGridData) ,
                                              AV33LecMaqCod ,
                                              AV108LecMaqCod_To ,
                                              A1166LecMaqCod ,
                                              A1174LecFec ,
                                              Integer.valueOf(A1170LecOpeCod) ,
                                              Integer.valueOf(A1167LecBarCod) ,
                                              Byte.valueOf(A1168LecBarReo) ,
                                              A1169LecBarPar ,
                                              Short.valueOf(A1172LecParCod) ,
                                              A396EmprCod ,
                                              Short.valueOf(AV46OrderedBy) ,
                                              Boolean.valueOf(AV48OrderedDsc) ,
                                              AV99LecEstado ,
                                              A13722LecEstado ,
                                              AV98TFLecEstado_Sel ,
                                              AV142TFlecOpeNom_Sel ,
                                              AV141TFlecOpeNom ,
                                              A14259lecOpeNom ,
                                              AV144TFLecFasDsc_Sel ,
                                              AV143TFLecFasDsc ,
                                              A14260LecFasDsc ,
                                              AV146TFLecParNom_Sel ,
                                              AV145TFLecParNom ,
                                              A14261LecParNom } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV73TFLecMaqCod = GXutil.padr( GXutil.rtrim( AV73TFLecMaqCod), 6, "%") ;
         lV69TFLecHdr = GXutil.padr( GXutil.rtrim( AV69TFLecHdr), 11, "%") ;
         /* Using cursor H00IY3 */
         pr_default.execute(1, new Object[] {lV73TFLecMaqCod, AV74TFLecMaqCod_Sel, AV67TFLecFec, Integer.valueOf(AV77TFLecOpeCod), Integer.valueOf(AV78TFLecOpeCod_To), lV69TFLecHdr, AV70TFLecHdr_Sel, Short.valueOf(AV79TFLecParCod), Short.valueOf(AV80TFLecParCod_To), AV33LecMaqCod, AV108LecMaqCod_To});
         nGXsfl_88_idx = 1 ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_882( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13721LecHdr = H00IY3_A13721LecHdr[0] ;
            A1174LecFec = H00IY3_A1174LecFec[0] ;
            n1174LecFec = H00IY3_n1174LecFec[0] ;
            A1166LecMaqCod = H00IY3_A1166LecMaqCod[0] ;
            A1188LecFasOrd = H00IY3_A1188LecFasOrd[0] ;
            n1188LecFasOrd = H00IY3_n1188LecFasOrd[0] ;
            A1169LecBarPar = H00IY3_A1169LecBarPar[0] ;
            n1169LecBarPar = H00IY3_n1169LecBarPar[0] ;
            A1168LecBarReo = H00IY3_A1168LecBarReo[0] ;
            n1168LecBarReo = H00IY3_n1168LecBarReo[0] ;
            A1167LecBarCod = H00IY3_A1167LecBarCod[0] ;
            n1167LecBarCod = H00IY3_n1167LecBarCod[0] ;
            A1170LecOpeCod = H00IY3_A1170LecOpeCod[0] ;
            n1170LecOpeCod = H00IY3_n1170LecOpeCod[0] ;
            A1171LecFasCod = H00IY3_A1171LecFasCod[0] ;
            n1171LecFasCod = H00IY3_n1171LecFasCod[0] ;
            A1172LecParCod = H00IY3_A1172LecParCod[0] ;
            n1172LecParCod = H00IY3_n1172LecParCod[0] ;
            A396EmprCod = H00IY3_A396EmprCod[0] ;
            GXt_char1 = A13722LecEstado ;
            GXv_char2[0] = GXt_char1 ;
            new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char2) ;
            consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char2[0] ;
            A13722LecEstado = GXt_char1 ;
            if ( (GXutil.strcmp("", AV99LecEstado)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV99LecEstado) == 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV98TFLecEstado_Sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV98TFLecEstado_Sel) == 0 ) ) )
               {
                  GXt_char1 = A14259lecOpeNom ;
                  GXv_char2[0] = GXt_char1 ;
                  new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char2) ;
                  consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char2[0] ;
                  A14259lecOpeNom = GXt_char1 ;
                  if ( ! ( (GXutil.strcmp("", AV142TFlecOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV141TFlecOpeNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV141TFlecOpeNom) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV142TFlecOpeNom_Sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV142TFlecOpeNom_Sel) == 0 ) ) )
                     {
                        GXt_char1 = A14260LecFasDsc ;
                        GXv_char2[0] = GXt_char1 ;
                        new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char2) ;
                        consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char2[0] ;
                        A14260LecFasDsc = GXt_char1 ;
                        if ( ! ( (GXutil.strcmp("", AV144TFLecFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV143TFLecFasDsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV143TFLecFasDsc) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV144TFLecFasDsc_Sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV144TFLecFasDsc_Sel) == 0 ) ) )
                           {
                              GXt_char1 = A14261LecParNom ;
                              GXv_char2[0] = GXt_char1 ;
                              new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char2) ;
                              consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char2[0] ;
                              A14261LecParNom = GXt_char1 ;
                              if ( ! ( (GXutil.strcmp("", AV146TFLecParNom_Sel)==0) && ( ! (GXutil.strcmp("", AV145TFLecParNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV145TFLecParNom) , 255 , "%"),  ' ' ) ) )
                              {
                                 if ( (GXutil.strcmp("", AV146TFLecParNom_Sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV146TFLecParNom_Sel) == 0 ) ) )
                                 {
                                    e23IY2 ();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(88) ;
         wbIY0( ) ;
      }
      bGXsfl_88_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesIY2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVESTPARO"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV89vEstParo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINICIOPARO", localUtil.ttoc( AV21InicioParo, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINICIOPARO", getSecureSignedToken( "", localUtil.format( AV21InicioParo, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LECBARCOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(A1167LecBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LECBARREO"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(A1168LecBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LECBARPAR"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( A1169LecBarPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV148PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV99LecEstado, AV33LecMaqCod, AV108LecMaqCod_To, AV5ColumnsSelector, AV110LoadGridData, AV151Pgmname, AV46OrderedBy, AV48OrderedDsc, AV73TFLecMaqCod, AV74TFLecMaqCod_Sel, AV67TFLecFec, AV77TFLecOpeCod, AV78TFLecOpeCod_To, AV69TFLecHdr, AV70TFLecHdr_Sel, AV98TFLecEstado_Sel, AV79TFLecParCod, AV80TFLecParCod_To, AV141TFlecOpeNom, AV142TFlecOpeNom_Sel, AV143TFLecFasDsc, AV144TFLecFasDsc_Sel, AV145TFLecParNom, AV146TFLecParNom_Sel, AV93EmprCod, AV44MaqDsc, A656ParCod, A867ParCodNom, A129BarCod, A132BarCodReo, A130BarCodPar, A194BarOrdLin, A153BarFasEst, A460FasDsc, AV89vEstParo, AV21InicioParo) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV99LecEstado, AV33LecMaqCod, AV108LecMaqCod_To, AV5ColumnsSelector, AV110LoadGridData, AV151Pgmname, AV46OrderedBy, AV48OrderedDsc, AV73TFLecMaqCod, AV74TFLecMaqCod_Sel, AV67TFLecFec, AV77TFLecOpeCod, AV78TFLecOpeCod_To, AV69TFLecHdr, AV70TFLecHdr_Sel, AV98TFLecEstado_Sel, AV79TFLecParCod, AV80TFLecParCod_To, AV141TFlecOpeNom, AV142TFlecOpeNom_Sel, AV143TFLecFasDsc, AV144TFLecFasDsc_Sel, AV145TFLecParNom, AV146TFLecParNom_Sel, AV93EmprCod, AV44MaqDsc, A656ParCod, A867ParCodNom, A129BarCod, A132BarCodReo, A130BarCodPar, A194BarOrdLin, A153BarFasEst, A460FasDsc, AV89vEstParo, AV21InicioParo) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV99LecEstado, AV33LecMaqCod, AV108LecMaqCod_To, AV5ColumnsSelector, AV110LoadGridData, AV151Pgmname, AV46OrderedBy, AV48OrderedDsc, AV73TFLecMaqCod, AV74TFLecMaqCod_Sel, AV67TFLecFec, AV77TFLecOpeCod, AV78TFLecOpeCod_To, AV69TFLecHdr, AV70TFLecHdr_Sel, AV98TFLecEstado_Sel, AV79TFLecParCod, AV80TFLecParCod_To, AV141TFlecOpeNom, AV142TFlecOpeNom_Sel, AV143TFLecFasDsc, AV144TFLecFasDsc_Sel, AV145TFLecParNom, AV146TFLecParNom_Sel, AV93EmprCod, AV44MaqDsc, A656ParCod, A867ParCodNom, A129BarCod, A132BarCodReo, A130BarCodPar, A194BarOrdLin, A153BarFasEst, A460FasDsc, AV89vEstParo, AV21InicioParo) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV99LecEstado, AV33LecMaqCod, AV108LecMaqCod_To, AV5ColumnsSelector, AV110LoadGridData, AV151Pgmname, AV46OrderedBy, AV48OrderedDsc, AV73TFLecMaqCod, AV74TFLecMaqCod_Sel, AV67TFLecFec, AV77TFLecOpeCod, AV78TFLecOpeCod_To, AV69TFLecHdr, AV70TFLecHdr_Sel, AV98TFLecEstado_Sel, AV79TFLecParCod, AV80TFLecParCod_To, AV141TFlecOpeNom, AV142TFlecOpeNom_Sel, AV143TFLecFasDsc, AV144TFLecFasDsc_Sel, AV145TFLecParNom, AV146TFLecParNom_Sel, AV93EmprCod, AV44MaqDsc, A656ParCod, A867ParCodNom, A129BarCod, A132BarCodReo, A130BarCodPar, A194BarOrdLin, A153BarFasEst, A460FasDsc, AV89vEstParo, AV21InicioParo) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV99LecEstado, AV33LecMaqCod, AV108LecMaqCod_To, AV5ColumnsSelector, AV110LoadGridData, AV151Pgmname, AV46OrderedBy, AV48OrderedDsc, AV73TFLecMaqCod, AV74TFLecMaqCod_Sel, AV67TFLecFec, AV77TFLecOpeCod, AV78TFLecOpeCod_To, AV69TFLecHdr, AV70TFLecHdr_Sel, AV98TFLecEstado_Sel, AV79TFLecParCod, AV80TFLecParCod_To, AV141TFlecOpeNom, AV142TFlecOpeNom_Sel, AV143TFLecFasDsc, AV144TFLecFasDsc_Sel, AV145TFLecParNom, AV146TFLecParNom_Sel, AV93EmprCod, AV44MaqDsc, A656ParCod, A867ParCodNom, A129BarCod, A132BarCodReo, A130BarCodPar, A194BarOrdLin, A153BarFasEst, A460FasDsc, AV89vEstParo, AV21InicioParo) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV151Pgmname = "ConsultaMaquinasProduccionWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV151Pgmname", AV151Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavParcodnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavParcodnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavParcodnom_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavTexto1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto1_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFin_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavVestparo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVestparo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVestparo_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavHisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodti_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavHisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodtf_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavHisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprof_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavPedidocliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupIY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e21IY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV10DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLECMAQCOD_DATA"), AV107LecMaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLECMAQCOD_TO_DATA"), AV109LecMaqCod_To_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV5ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_88 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_88"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV16GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV17GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_lecmaqcod_Cls = httpContext.cgiGet( "COMBO_LECMAQCOD_Cls") ;
         Combo_lecmaqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_LECMAQCOD_Selectedvalue_set") ;
         Combo_lecmaqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_LECMAQCOD_Emptyitemtext") ;
         Combo_lecmaqcod_to_Cls = httpContext.cgiGet( "COMBO_LECMAQCOD_TO_Cls") ;
         Combo_lecmaqcod_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_LECMAQCOD_TO_Selectedvalue_set") ;
         Combo_lecmaqcod_to_Emptyitemtext = httpContext.cgiGet( "COMBO_LECMAQCOD_TO_Emptyitemtext") ;
         Dvpanel_panel_generales_Width = httpContext.cgiGet( "DVPANEL_PANEL_GENERALES_Width") ;
         Dvpanel_panel_generales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_GENERALES_Autowidth")) ;
         Dvpanel_panel_generales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_GENERALES_Autoheight")) ;
         Dvpanel_panel_generales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_GENERALES_Cls") ;
         Dvpanel_panel_generales_Title = httpContext.cgiGet( "DVPANEL_PANEL_GENERALES_Title") ;
         Dvpanel_panel_generales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_GENERALES_Collapsible")) ;
         Dvpanel_panel_generales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_GENERALES_Collapsed")) ;
         Dvpanel_panel_generales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_GENERALES_Showcollapseicon")) ;
         Dvpanel_panel_generales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_GENERALES_Iconposition") ;
         Dvpanel_panel_generales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_GENERALES_Autoscroll")) ;
         Dvpanel_panel_filtros_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Width") ;
         Dvpanel_panel_filtros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autowidth")) ;
         Dvpanel_panel_filtros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoheight")) ;
         Dvpanel_panel_filtros_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Cls") ;
         Dvpanel_panel_filtros_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Title") ;
         Dvpanel_panel_filtros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsible")) ;
         Dvpanel_panel_filtros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsed")) ;
         Dvpanel_panel_filtros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Showcollapseicon")) ;
         Dvpanel_panel_filtros_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Iconposition") ;
         Dvpanel_panel_filtros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_panel_resultados_Width = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADOS_Width") ;
         Dvpanel_panel_resultados_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADOS_Autowidth")) ;
         Dvpanel_panel_resultados_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADOS_Autoheight")) ;
         Dvpanel_panel_resultados_Cls = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADOS_Cls") ;
         Dvpanel_panel_resultados_Title = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADOS_Title") ;
         Dvpanel_panel_resultados_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADOS_Collapsible")) ;
         Dvpanel_panel_resultados_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADOS_Collapsed")) ;
         Dvpanel_panel_resultados_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADOS_Showcollapseicon")) ;
         Dvpanel_panel_resultados_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADOS_Iconposition") ;
         Dvpanel_panel_resultados_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADOS_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Combo_lecmaqcod_to_Selectedvalue_get = httpContext.cgiGet( "COMBO_LECMAQCOD_TO_Selectedvalue_get") ;
         Combo_lecmaqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_LECMAQCOD_Selectedvalue_get") ;
         /* Read variables values. */
         cmbavLecestado.setName( cmbavLecestado.getInternalname() );
         cmbavLecestado.setValue( httpContext.cgiGet( cmbavLecestado.getInternalname()) );
         AV99LecEstado = httpContext.cgiGet( cmbavLecestado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99LecEstado", AV99LecEstado);
         AV151Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV151Pgmname", AV151Pgmname);
         AV33LecMaqCod = httpContext.cgiGet( edtavLecmaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33LecMaqCod", AV33LecMaqCod);
         AV108LecMaqCod_To = httpContext.cgiGet( edtavLecmaqcod_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108LecMaqCod_To", AV108LecMaqCod_To);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lecfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LECFECAUXDATE");
            GX_FocusControl = edtavDdo_lecfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8DDO_LecFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DDO_LecFecAuxDate", localUtil.format(AV8DDO_LecFecAuxDate, "99/99/99"));
         }
         else
         {
            AV8DDO_LecFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lecfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DDO_LecFecAuxDate", localUtil.format(AV8DDO_LecFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_88_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_882( ) ;
         if ( nGXsfl_88_idx > 0 )
         {
            AV104DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV104DetailWebComponent);
            A1166LecMaqCod = httpContext.cgiGet( edtLecMaqCod_Internalname) ;
            AV44MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMaqdsc_Internalname, AV44MaqDsc);
            A1174LecFec = localUtil.ctod( httpContext.cgiGet( edtLecFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n1174LecFec = false ;
            A1170LecOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtLecOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1170LecOpeCod = false ;
            AV45OpeNom = httpContext.cgiGet( edtavOpenom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavOpenom_Internalname, AV45OpeNom);
            A13721LecHdr = httpContext.cgiGet( edtLecHdr_Internalname) ;
            cmbLecEstado.setName( cmbLecEstado.getInternalname() );
            cmbLecEstado.setValue( httpContext.cgiGet( cmbLecEstado.getInternalname()) );
            A13722LecEstado = httpContext.cgiGet( cmbLecEstado.getInternalname()) ;
            A1172LecParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtLecParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1172LecParCod = false ;
            AV50ParCodNom = httpContext.cgiGet( edtavParcodnom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavParcodnom_Internalname, AV50ParCodNom);
            AV53Texto1 = httpContext.cgiGet( edtavTexto1_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavTexto1_Internalname, AV53Texto1);
            AV93EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavEmprcod_Internalname, AV93EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
            A1167LecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtLecBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1167LecBarCod = false ;
            A1168LecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtLecBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1168LecBarReo = false ;
            A1169LecBarPar = httpContext.cgiGet( edtLecBarPar_Internalname) ;
            n1169LecBarPar = false ;
            A1188LecFasOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtLecFasOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1188LecFasOrd = false ;
            AV14Fin = httpContext.cgiGet( edtavFin_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavFin_Internalname, AV14Fin);
            AV89vEstParo = httpContext.cgiGet( edtavVestparo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavVestparo_Internalname, AV89vEstParo);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVESTPARO"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV89vEstParo, ""))));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
               GX_FocusControl = edtavClicod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV116CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
            }
            else
            {
               AV116CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
            }
            AV117CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV117CliNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
            AV118BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV118BarSer);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
            AV119BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV119BarSerDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
            AV120BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV120BarColNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
               GX_FocusControl = edtavBarcolnum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV121BarColNum = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
            }
            else
            {
               AV121BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
               GX_FocusControl = edtavHisprodti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV122HisProdti = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               AV122HisProdti = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
               GX_FocusControl = edtavHisprodtf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV123HisProdtf = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               AV123HisProdtf = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            AV124HisProF = GXutil.upper( httpContext.cgiGet( edtavHisprof_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavHisprof_Internalname, AV124HisProF);
            A14259lecOpeNom = httpContext.cgiGet( edtlecOpeNom_Internalname) ;
            A14260LecFasDsc = httpContext.cgiGet( edtLecFasDsc_Internalname) ;
            A14261LecParNom = httpContext.cgiGet( edtLecParNom_Internalname) ;
            AV148PedidoCliente = httpContext.cgiGet( edtavPedidocliente_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavPedidocliente_Internalname, AV148PedidoCliente);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV148PedidoCliente, ""))));
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ConsultaMaquinasProduccionWW");
         AV151Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV151Pgmname", AV151Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV151Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("consultamaquinasproduccionww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vLECESTADO"), AV99LecEstado) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vLECMAQCOD"), AV33LecMaqCod) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vLECMAQCOD_TO"), AV108LecMaqCod_To) != 0 )
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
      e21IY2 ();
      if (returnInSub) return;
   }

   public void e21IY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV92Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV92Station = GXt_char1 ;
      GXv_char2[0] = AV93EmprCod ;
      GXv_char3[0] = AV94EmprNom ;
      GXv_char4[0] = AV95UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV92Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultamaquinasproduccionww_impl.this.AV93EmprCod = GXv_char2[0] ;
      consultamaquinasproduccionww_impl.this.AV94EmprNom = GXv_char3[0] ;
      consultamaquinasproduccionww_impl.this.AV95UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavEmprcod_Internalname, AV93EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      divPanel_resultados_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divPanel_resultados_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divPanel_resultados_Visible), 5, 0), true);
      GXt_char1 = AV92Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV92Station = GXt_char1 ;
      GXv_char4[0] = AV93EmprCod ;
      GXv_char3[0] = AV94EmprNom ;
      GXv_char2[0] = AV95UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV92Station, GXv_char4, GXv_char3, GXv_char2) ;
      consultamaquinasproduccionww_impl.this.AV93EmprCod = GXv_char4[0] ;
      consultamaquinasproduccionww_impl.this.AV94EmprNom = GXv_char3[0] ;
      consultamaquinasproduccionww_impl.this.AV95UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavEmprcod_Internalname, AV93EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV10DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV10DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavLecmaqcod_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecmaqcod_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecmaqcod_to_Visible), 5, 0), true);
      edtavLecmaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecmaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecmaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOLECMAQCOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOLECMAQCOD_TO' */
      S122 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      AV99LecEstado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99LecEstado", AV99LecEstado);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Consulta Maquinas Produccion", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV46OrderedBy < 1 )
      {
         AV46OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV10DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV10DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV113flag = (byte)(1) ;
   }

   public void e22IY2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV90WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV90WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV51Session.getValue("ConsultaMaquinasProduccionWWColumnsSelector"), "") != 0 )
      {
         AV7ColumnsSelectorXML = AV51Session.getValue("ConsultaMaquinasProduccionWWColumnsSelector") ;
         AV5ColumnsSelector.fromxml(AV7ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      edtLecMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavMaqdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtLecFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFec_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtLecOpeCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecOpeCod_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavOpenom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtLecHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecHdr_Visible), 5, 0), !bGXsfl_88_Refreshing);
      cmbLecEstado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLecEstado.getInternalname(), "Visible", GXutil.ltrimstr( cmbLecEstado.getVisible(), 5, 0), !bGXsfl_88_Refreshing);
      edtLecParCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecParCod_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavParcodnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavParcodnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavParcodnom_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavTexto1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto1_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavClicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavClinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavBarcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavHisprodti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprodti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodti_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavHisprodtf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprodtf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodtf_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavHisprof_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprof_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprof_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtlecOpeNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtlecOpeNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlecOpeNom_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtLecFasDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasDsc_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtLecParNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecParNom_Visible), 5, 0), !bGXsfl_88_Refreshing);
      edtavPedidocliente_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedidocliente_Visible), 5, 0), !bGXsfl_88_Refreshing);
      Gridpaginationbar_Emptygridcaption = (AV110LoadGridData ? httpContext.getMessage( "No existen registros", "") : httpContext.getMessage( "WWP_PressSearchToShowData", "")) ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
      AV16GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridCurrentPage), 10, 0));
      AV17GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17GridPageCount), 10, 0));
      edtavDetailwebcomponent_Columnheaderclass = "WWIconActionColumn WCD_ActionColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Columnheaderclass", edtavDetailwebcomponent_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtLecMaqCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Columnheaderclass", edtLecMaqCod_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavMaqdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Columnheaderclass", edtavMaqdsc_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtLecFec_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFec_Internalname, "Columnheaderclass", edtLecFec_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtLecOpeCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecOpeCod_Internalname, "Columnheaderclass", edtLecOpeCod_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavOpenom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom_Internalname, "Columnheaderclass", edtavOpenom_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtLecHdr_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecHdr_Internalname, "Columnheaderclass", edtLecHdr_Columnheaderclass, !bGXsfl_88_Refreshing);
      cmbLecEstado.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbLecEstado.getInternalname(), "Columnheaderclass", cmbLecEstado.getColumnHeaderClass(), !bGXsfl_88_Refreshing);
      edtLecParCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParCod_Internalname, "Columnheaderclass", edtLecParCod_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavParcodnom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavParcodnom_Internalname, "Columnheaderclass", edtavParcodnom_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavTexto1_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto1_Internalname, "Columnheaderclass", edtavTexto1_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavClicod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Columnheaderclass", edtavClicod_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavClinom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Columnheaderclass", edtavClinom_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavBarser_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Columnheaderclass", edtavBarser_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavBarserdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Columnheaderclass", edtavBarserdsc_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavBarcolnom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Columnheaderclass", edtavBarcolnom_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavBarcolnum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Columnheaderclass", edtavBarcolnum_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavHisprodti_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprodti_Internalname, "Columnheaderclass", edtavHisprodti_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavHisprodtf_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprodtf_Internalname, "Columnheaderclass", edtavHisprodtf_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavHisprof_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHisprof_Internalname, "Columnheaderclass", edtavHisprof_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtlecOpeNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtlecOpeNom_Internalname, "Columnheaderclass", edtlecOpeNom_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtLecFasDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasDsc_Internalname, "Columnheaderclass", edtLecFasDsc_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtLecParNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParNom_Internalname, "Columnheaderclass", edtLecParNom_Columnheaderclass, !bGXsfl_88_Refreshing);
      edtavPedidocliente_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedidocliente_Internalname, "Columnheaderclass", edtavPedidocliente_Columnheaderclass, !bGXsfl_88_Refreshing);
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV115WebSession.getValue("ConsultaMaquinasProduccionWW"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV115WebSession.remove("ConsultaMaquinasProduccionWW");
         AV114ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV114ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV125i = GXutil.sleep( 2) ;
         AV114ProgressIndicator.hide();
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV114ProgressIndicator", AV114ProgressIndicator);
   }

   public void e17IY2( )
   {
      /* 'DoSearch' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      divPanel_resultados_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, divPanel_resultados_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divPanel_resultados_Visible), 5, 0), true);
      AV110LoadGridData = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110LoadGridData", AV110LoadGridData);
      httpContext.doAjaxRefresh();
      AV115WebSession.setValue("ConsultaMaquinasProduccionWW", httpContext.getMessage( "FINALIZADO", ""));
      AV114ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV114ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV114ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV114ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV114ProgressIndicator.show();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV114ProgressIndicator", AV114ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5ColumnsSelector", AV5ColumnsSelector);
   }

   public void e13IY2( )
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
         AV49PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV49PageToGo) ;
      }
   }

   public void e14IY2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15IY2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV46OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46OrderedBy), 4, 0));
         AV48OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48OrderedDsc", AV48OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecMaqCod") == 0 )
         {
            AV73TFLecMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFLecMaqCod", AV73TFLecMaqCod);
            AV74TFLecMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFLecMaqCod_Sel", AV74TFLecMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecFec") == 0 )
         {
            AV67TFLecFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFLecFec", localUtil.format(AV67TFLecFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecOpeCod") == 0 )
         {
            AV77TFLecOpeCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFLecOpeCod), 6, 0));
            AV78TFLecOpeCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFLecOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFLecOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecHdr") == 0 )
         {
            AV69TFLecHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFLecHdr", AV69TFLecHdr);
            AV70TFLecHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFLecHdr_Sel", AV70TFLecHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecEstado") == 0 )
         {
            AV98TFLecEstado_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFLecEstado_Sel", AV98TFLecEstado_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecParCod") == 0 )
         {
            AV79TFLecParCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFLecParCod), 4, 0));
            AV80TFLecParCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFLecParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFLecParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "lecOpeNom") == 0 )
         {
            AV141TFlecOpeNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV141TFlecOpeNom", AV141TFlecOpeNom);
            AV142TFlecOpeNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV142TFlecOpeNom_Sel", AV142TFlecOpeNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecFasDsc") == 0 )
         {
            AV143TFLecFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV143TFLecFasDsc", AV143TFLecFasDsc);
            AV144TFLecFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144TFLecFasDsc_Sel", AV144TFLecFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecParNom") == 0 )
         {
            AV145TFLecParNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145TFLecParNom", AV145TFLecParNom);
            AV146TFLecParNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146TFLecParNom_Sel", AV146TFLecParNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e23IY2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV104DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV104DetailWebComponent);
         GXt_char1 = AV44MaqDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A1166LecMaqCod, GXv_char4) ;
         consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV44MaqDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqdsc_Internalname, AV44MaqDsc);
         edtavMaqdsc_Tooltiptext = GXutil.format( "%1-%2%3", GXutil.trim( GXutil.str( A1167LecBarCod, 8, 0)), GXutil.trim( GXutil.str( A1168LecBarReo, 1, 0)), GXutil.trim( A1169LecBarPar), "", "", "", "", "", "") ;
         GXt_char1 = AV45OpeNom ;
         GXv_char4[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char4) ;
         consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV45OpeNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavOpenom_Internalname, AV45OpeNom);
         AV152GXLvl238 = (byte)(0) ;
         /* Using cursor H00IY4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A656ParCod = H00IY4_A656ParCod[0] ;
            A867ParCodNom = H00IY4_A867ParCodNom[0] ;
            n867ParCodNom = H00IY4_n867ParCodNom[0] ;
            AV152GXLvl238 = (byte)(1) ;
            AV50ParCodNom = A867ParCodNom ;
            httpContext.ajax_rsp_assign_attri("", false, edtavParcodnom_Internalname, AV50ParCodNom);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV152GXLvl238 == 0 )
         {
            AV50ParCodNom = " " ;
            httpContext.ajax_rsp_assign_attri("", false, edtavParcodnom_Internalname, AV50ParCodNom);
         }
         GXt_char1 = AV53Texto1 ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A1167LecBarCod ;
         GXv_int9[0] = A1168LecBarReo ;
         GXv_char3[0] = A1169LecBarPar ;
         GXv_int10[0] = A1188LecFasOrd ;
         GXv_char2[0] = A1171LecFasCod ;
         GXv_char11[0] = A1166LecMaqCod ;
         GXv_char12[0] = A13721LecHdr ;
         GXv_int13[0] = A1172LecParCod ;
         GXv_char14[0] = GXt_char1 ;
         new app.procedure3(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_int10, GXv_char2, GXv_char11, GXv_char12, GXv_int13, GXv_char14) ;
         consultamaquinasproduccionww_impl.this.A396EmprCod = GXv_char4[0] ;
         consultamaquinasproduccionww_impl.this.A1167LecBarCod = GXv_int8[0] ;
         consultamaquinasproduccionww_impl.this.A1168LecBarReo = GXv_int9[0] ;
         consultamaquinasproduccionww_impl.this.A1169LecBarPar = GXv_char3[0] ;
         consultamaquinasproduccionww_impl.this.A1188LecFasOrd = GXv_int10[0] ;
         consultamaquinasproduccionww_impl.this.A1171LecFasCod = GXv_char2[0] ;
         consultamaquinasproduccionww_impl.this.A1166LecMaqCod = GXv_char11[0] ;
         consultamaquinasproduccionww_impl.this.A13721LecHdr = GXv_char12[0] ;
         consultamaquinasproduccionww_impl.this.A1172LecParCod = GXv_int13[0] ;
         consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1171LecFasCod", A1171LecFasCod);
         AV53Texto1 = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavTexto1_Internalname, AV53Texto1);
         AV14Fin = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFin_Internalname, AV14Fin);
         /* Using cursor H00IY5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n1167LecBarCod), Integer.valueOf(A1167LecBarCod), Boolean.valueOf(n1168LecBarReo), Byte.valueOf(A1168LecBarReo), Boolean.valueOf(n1169LecBarPar), A1169LecBarPar, Boolean.valueOf(n1188LecFasOrd), Short.valueOf(A1188LecFasOrd)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A457FasCod = H00IY5_A457FasCod[0] ;
            A129BarCod = H00IY5_A129BarCod[0] ;
            A132BarCodReo = H00IY5_A132BarCodReo[0] ;
            A130BarCodPar = H00IY5_A130BarCodPar[0] ;
            A194BarOrdLin = H00IY5_A194BarOrdLin[0] ;
            A153BarFasEst = H00IY5_A153BarFasEst[0] ;
            A460FasDsc = H00IY5_A460FasDsc[0] ;
            A460FasDsc = H00IY5_A460FasDsc[0] ;
            AV14Fin = ((A153BarFasEst==1) ? "P" : ((A153BarFasEst==2) ? "F" : "-")) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavFin_Internalname, AV14Fin);
            AV105FasDsc = A460FasDsc ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A1167LecBarCod ;
         GXv_int9[0] = A1168LecBarReo ;
         GXv_char12[0] = A1169LecBarPar ;
         GXv_int13[0] = A1188LecFasOrd ;
         GXv_char11[0] = A1166LecMaqCod ;
         GXv_int10[0] = A1172LecParCod ;
         GXv_char4[0] = AV89vEstParo ;
         GXv_dtime15[0] = AV21InicioParo ;
         new app.pstparo(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_int9, GXv_char12, GXv_int13, GXv_char11, GXv_int10, GXv_char4, GXv_dtime15) ;
         consultamaquinasproduccionww_impl.this.A396EmprCod = GXv_char14[0] ;
         consultamaquinasproduccionww_impl.this.A1167LecBarCod = GXv_int8[0] ;
         consultamaquinasproduccionww_impl.this.A1168LecBarReo = GXv_int9[0] ;
         consultamaquinasproduccionww_impl.this.A1169LecBarPar = GXv_char12[0] ;
         consultamaquinasproduccionww_impl.this.A1188LecFasOrd = GXv_int13[0] ;
         consultamaquinasproduccionww_impl.this.A1166LecMaqCod = GXv_char11[0] ;
         consultamaquinasproduccionww_impl.this.A1172LecParCod = GXv_int10[0] ;
         consultamaquinasproduccionww_impl.this.AV89vEstParo = GXv_char4[0] ;
         consultamaquinasproduccionww_impl.this.AV21InicioParo = GXv_dtime15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, edtavVestparo_Internalname, AV89vEstParo);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVESTPARO"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV89vEstParo, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV21InicioParo", localUtil.ttoc( AV21InicioParo, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINICIOPARO", getSecureSignedToken( "", localUtil.format( AV21InicioParo, "99/99/99 99:99:99")));
         GXv_int8[0] = AV116CliCod ;
         GXv_char14[0] = AV117CliNom ;
         GXv_char12[0] = AV118BarSer ;
         GXv_char11[0] = AV119BarSerDsc ;
         GXv_char4[0] = AV120BarColNom ;
         GXv_int16[0] = AV121BarColNum ;
         GXv_dtime15[0] = AV122HisProdti ;
         GXv_dtime17[0] = AV123HisProdtf ;
         GXv_char3[0] = AV124HisProF ;
         new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV93EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int8, GXv_char14, GXv_char12, GXv_char11, GXv_char4, GXv_int16, GXv_dtime15, GXv_dtime17, GXv_char3) ;
         consultamaquinasproduccionww_impl.this.AV116CliCod = GXv_int8[0] ;
         consultamaquinasproduccionww_impl.this.AV117CliNom = GXv_char14[0] ;
         consultamaquinasproduccionww_impl.this.AV118BarSer = GXv_char12[0] ;
         consultamaquinasproduccionww_impl.this.AV119BarSerDsc = GXv_char11[0] ;
         consultamaquinasproduccionww_impl.this.AV120BarColNom = GXv_char4[0] ;
         consultamaquinasproduccionww_impl.this.AV121BarColNum = GXv_int16[0] ;
         consultamaquinasproduccionww_impl.this.AV122HisProdti = GXv_dtime15[0] ;
         consultamaquinasproduccionww_impl.this.AV123HisProdtf = GXv_dtime17[0] ;
         consultamaquinasproduccionww_impl.this.AV124HisProF = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV117CliNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV118BarSer);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV119BarSerDsc);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV120BarColNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprof_Internalname, AV124HisProF);
         GXv_int16[0] = AV116CliCod ;
         GXv_char14[0] = AV117CliNom ;
         GXv_char12[0] = AV118BarSer ;
         GXv_char11[0] = AV119BarSerDsc ;
         GXv_char4[0] = AV120BarColNom ;
         GXv_int8[0] = AV121BarColNum ;
         GXv_dtime17[0] = AV122HisProdti ;
         GXv_dtime15[0] = AV123HisProdtf ;
         GXv_char3[0] = AV124HisProF ;
         new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV93EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int16, GXv_char14, GXv_char12, GXv_char11, GXv_char4, GXv_int8, GXv_dtime17, GXv_dtime15, GXv_char3) ;
         consultamaquinasproduccionww_impl.this.AV116CliCod = GXv_int16[0] ;
         consultamaquinasproduccionww_impl.this.AV117CliNom = GXv_char14[0] ;
         consultamaquinasproduccionww_impl.this.AV118BarSer = GXv_char12[0] ;
         consultamaquinasproduccionww_impl.this.AV119BarSerDsc = GXv_char11[0] ;
         consultamaquinasproduccionww_impl.this.AV120BarColNom = GXv_char4[0] ;
         consultamaquinasproduccionww_impl.this.AV121BarColNum = GXv_int8[0] ;
         consultamaquinasproduccionww_impl.this.AV122HisProdti = GXv_dtime17[0] ;
         consultamaquinasproduccionww_impl.this.AV123HisProdtf = GXv_dtime15[0] ;
         consultamaquinasproduccionww_impl.this.AV124HisProF = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV117CliNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV118BarSer);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV119BarSerDsc);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV120BarColNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprof_Internalname, AV124HisProF);
         GXv_int16[0] = AV116CliCod ;
         GXv_char14[0] = AV117CliNom ;
         GXv_char12[0] = AV118BarSer ;
         GXv_char11[0] = AV119BarSerDsc ;
         GXv_char4[0] = AV120BarColNom ;
         GXv_int8[0] = AV121BarColNum ;
         GXv_dtime17[0] = AV122HisProdti ;
         GXv_dtime15[0] = AV123HisProdtf ;
         GXv_char3[0] = AV124HisProF ;
         new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV93EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int16, GXv_char14, GXv_char12, GXv_char11, GXv_char4, GXv_int8, GXv_dtime17, GXv_dtime15, GXv_char3) ;
         consultamaquinasproduccionww_impl.this.AV116CliCod = GXv_int16[0] ;
         consultamaquinasproduccionww_impl.this.AV117CliNom = GXv_char14[0] ;
         consultamaquinasproduccionww_impl.this.AV118BarSer = GXv_char12[0] ;
         consultamaquinasproduccionww_impl.this.AV119BarSerDsc = GXv_char11[0] ;
         consultamaquinasproduccionww_impl.this.AV120BarColNom = GXv_char4[0] ;
         consultamaquinasproduccionww_impl.this.AV121BarColNum = GXv_int8[0] ;
         consultamaquinasproduccionww_impl.this.AV122HisProdti = GXv_dtime17[0] ;
         consultamaquinasproduccionww_impl.this.AV123HisProdtf = GXv_dtime15[0] ;
         consultamaquinasproduccionww_impl.this.AV124HisProF = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV117CliNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV118BarSer);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV119BarSerDsc);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV120BarColNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprof_Internalname, AV124HisProF);
         GXv_int16[0] = AV116CliCod ;
         GXv_char14[0] = AV117CliNom ;
         GXv_char12[0] = AV118BarSer ;
         GXv_char11[0] = AV119BarSerDsc ;
         GXv_char4[0] = AV120BarColNom ;
         GXv_int8[0] = AV121BarColNum ;
         GXv_dtime17[0] = AV122HisProdti ;
         GXv_dtime15[0] = AV123HisProdtf ;
         GXv_char3[0] = AV124HisProF ;
         new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV93EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int16, GXv_char14, GXv_char12, GXv_char11, GXv_char4, GXv_int8, GXv_dtime17, GXv_dtime15, GXv_char3) ;
         consultamaquinasproduccionww_impl.this.AV116CliCod = GXv_int16[0] ;
         consultamaquinasproduccionww_impl.this.AV117CliNom = GXv_char14[0] ;
         consultamaquinasproduccionww_impl.this.AV118BarSer = GXv_char12[0] ;
         consultamaquinasproduccionww_impl.this.AV119BarSerDsc = GXv_char11[0] ;
         consultamaquinasproduccionww_impl.this.AV120BarColNom = GXv_char4[0] ;
         consultamaquinasproduccionww_impl.this.AV121BarColNum = GXv_int8[0] ;
         consultamaquinasproduccionww_impl.this.AV122HisProdti = GXv_dtime17[0] ;
         consultamaquinasproduccionww_impl.this.AV123HisProdtf = GXv_dtime15[0] ;
         consultamaquinasproduccionww_impl.this.AV124HisProF = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV117CliNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV118BarSer);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV119BarSerDsc);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV120BarColNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprof_Internalname, AV124HisProF);
         GXv_int16[0] = AV116CliCod ;
         GXv_char14[0] = AV117CliNom ;
         GXv_char12[0] = AV118BarSer ;
         GXv_char11[0] = AV119BarSerDsc ;
         GXv_char4[0] = AV120BarColNom ;
         GXv_int8[0] = AV121BarColNum ;
         GXv_dtime17[0] = AV122HisProdti ;
         GXv_dtime15[0] = AV123HisProdtf ;
         GXv_char3[0] = AV124HisProF ;
         new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV93EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int16, GXv_char14, GXv_char12, GXv_char11, GXv_char4, GXv_int8, GXv_dtime17, GXv_dtime15, GXv_char3) ;
         consultamaquinasproduccionww_impl.this.AV116CliCod = GXv_int16[0] ;
         consultamaquinasproduccionww_impl.this.AV117CliNom = GXv_char14[0] ;
         consultamaquinasproduccionww_impl.this.AV118BarSer = GXv_char12[0] ;
         consultamaquinasproduccionww_impl.this.AV119BarSerDsc = GXv_char11[0] ;
         consultamaquinasproduccionww_impl.this.AV120BarColNom = GXv_char4[0] ;
         consultamaquinasproduccionww_impl.this.AV121BarColNum = GXv_int8[0] ;
         consultamaquinasproduccionww_impl.this.AV122HisProdti = GXv_dtime17[0] ;
         consultamaquinasproduccionww_impl.this.AV123HisProdtf = GXv_dtime15[0] ;
         consultamaquinasproduccionww_impl.this.AV124HisProF = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV117CliNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV118BarSer);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV119BarSerDsc);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV120BarColNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprof_Internalname, AV124HisProF);
         GXv_int16[0] = AV116CliCod ;
         GXv_char14[0] = AV117CliNom ;
         GXv_char12[0] = AV118BarSer ;
         GXv_char11[0] = AV119BarSerDsc ;
         GXv_char4[0] = AV120BarColNom ;
         GXv_int8[0] = AV121BarColNum ;
         GXv_dtime17[0] = AV122HisProdti ;
         GXv_dtime15[0] = AV123HisProdtf ;
         GXv_char3[0] = AV124HisProF ;
         new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV93EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int16, GXv_char14, GXv_char12, GXv_char11, GXv_char4, GXv_int8, GXv_dtime17, GXv_dtime15, GXv_char3) ;
         consultamaquinasproduccionww_impl.this.AV116CliCod = GXv_int16[0] ;
         consultamaquinasproduccionww_impl.this.AV117CliNom = GXv_char14[0] ;
         consultamaquinasproduccionww_impl.this.AV118BarSer = GXv_char12[0] ;
         consultamaquinasproduccionww_impl.this.AV119BarSerDsc = GXv_char11[0] ;
         consultamaquinasproduccionww_impl.this.AV120BarColNom = GXv_char4[0] ;
         consultamaquinasproduccionww_impl.this.AV121BarColNum = GXv_int8[0] ;
         consultamaquinasproduccionww_impl.this.AV122HisProdti = GXv_dtime17[0] ;
         consultamaquinasproduccionww_impl.this.AV123HisProdtf = GXv_dtime15[0] ;
         consultamaquinasproduccionww_impl.this.AV124HisProF = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV117CliNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV118BarSer);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV119BarSerDsc);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV120BarColNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprof_Internalname, AV124HisProF);
         GXv_int16[0] = AV116CliCod ;
         GXv_char14[0] = AV117CliNom ;
         GXv_char12[0] = AV118BarSer ;
         GXv_char11[0] = AV119BarSerDsc ;
         GXv_char4[0] = AV120BarColNom ;
         GXv_int8[0] = AV121BarColNum ;
         GXv_dtime17[0] = AV122HisProdti ;
         GXv_dtime15[0] = AV123HisProdtf ;
         GXv_char3[0] = AV124HisProF ;
         new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV93EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int16, GXv_char14, GXv_char12, GXv_char11, GXv_char4, GXv_int8, GXv_dtime17, GXv_dtime15, GXv_char3) ;
         consultamaquinasproduccionww_impl.this.AV116CliCod = GXv_int16[0] ;
         consultamaquinasproduccionww_impl.this.AV117CliNom = GXv_char14[0] ;
         consultamaquinasproduccionww_impl.this.AV118BarSer = GXv_char12[0] ;
         consultamaquinasproduccionww_impl.this.AV119BarSerDsc = GXv_char11[0] ;
         consultamaquinasproduccionww_impl.this.AV120BarColNom = GXv_char4[0] ;
         consultamaquinasproduccionww_impl.this.AV121BarColNum = GXv_int8[0] ;
         consultamaquinasproduccionww_impl.this.AV122HisProdti = GXv_dtime17[0] ;
         consultamaquinasproduccionww_impl.this.AV123HisProdtf = GXv_dtime15[0] ;
         consultamaquinasproduccionww_impl.this.AV124HisProF = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV117CliNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV118BarSer);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV119BarSerDsc);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV120BarColNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprof_Internalname, AV124HisProF);
         GXv_int16[0] = AV116CliCod ;
         GXv_char14[0] = AV117CliNom ;
         GXv_char12[0] = AV118BarSer ;
         GXv_char11[0] = AV119BarSerDsc ;
         GXv_char4[0] = AV120BarColNom ;
         GXv_int8[0] = AV121BarColNum ;
         GXv_dtime17[0] = AV122HisProdti ;
         GXv_dtime15[0] = AV123HisProdtf ;
         GXv_char3[0] = AV124HisProF ;
         new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV93EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int16, GXv_char14, GXv_char12, GXv_char11, GXv_char4, GXv_int8, GXv_dtime17, GXv_dtime15, GXv_char3) ;
         consultamaquinasproduccionww_impl.this.AV116CliCod = GXv_int16[0] ;
         consultamaquinasproduccionww_impl.this.AV117CliNom = GXv_char14[0] ;
         consultamaquinasproduccionww_impl.this.AV118BarSer = GXv_char12[0] ;
         consultamaquinasproduccionww_impl.this.AV119BarSerDsc = GXv_char11[0] ;
         consultamaquinasproduccionww_impl.this.AV120BarColNom = GXv_char4[0] ;
         consultamaquinasproduccionww_impl.this.AV121BarColNum = GXv_int8[0] ;
         consultamaquinasproduccionww_impl.this.AV122HisProdti = GXv_dtime17[0] ;
         consultamaquinasproduccionww_impl.this.AV123HisProdtf = GXv_dtime15[0] ;
         consultamaquinasproduccionww_impl.this.AV124HisProF = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116CliCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV117CliNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV117CliNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV118BarSer);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV118BarSer, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV119BarSerDsc);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV119BarSerDsc, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV120BarColNom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV120BarColNom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121BarColNum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodti_Internalname, localUtil.ttoc( AV122HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprodtf_Internalname, localUtil.ttoc( AV123HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, edtavHisprof_Internalname, AV124HisProF);
         GXt_char1 = AV148PedidoCliente ;
         GXv_char14[0] = GXt_char1 ;
         new app.produccion.pedidocliente_pr(remoteHandle, context).execute( AV93EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, GXv_char14) ;
         consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char14[0] ;
         AV148PedidoCliente = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPedidocliente_Internalname, AV148PedidoCliente);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV148PedidoCliente, ""))));
         if ( ( GXutil.strcmp(AV14Fin, httpContext.getMessage( "P", "")) == 0 ) && ( A1172LecParCod == 0 ) )
         {
            edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn WWColumnSuccess WWColumnSuccessFirstColumn" ;
            edtLecMaqCod_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtavMaqdsc_Columnclass = "WWColumn WWColumnSuccess" ;
            edtLecFec_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtLecOpeCod_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtavOpenom_Columnclass = "WWColumn WWColumnSuccess" ;
            edtLecHdr_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            cmbLecEstado.setColumnClass( "WWColumn WWColumnSuccess hidden-xs" );
            edtLecParCod_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtavParcodnom_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavTexto1_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavClicod_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavClinom_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavBarser_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavBarserdsc_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavBarcolnom_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavBarcolnum_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavHisprodti_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavHisprodtf_Columnclass = "WWColumn WWColumnSuccess" ;
            edtavHisprof_Columnclass = "WWColumn WWColumnSuccess" ;
            edtlecOpeNom_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtLecFasDsc_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtLecParNom_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
            edtavPedidocliente_Columnclass = "WWColumn WWColumnSuccess" ;
         }
         else if ( ( GXutil.strcmp(AV89vEstParo, httpContext.getMessage( "INICIADO", "")) == 0 ) && ( A1172LecParCod > 0 ) )
         {
            edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn WWColumnDanger WWColumnDangerFirstColumn" ;
            edtLecMaqCod_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtavMaqdsc_Columnclass = "WWColumn WWColumnDanger" ;
            edtLecFec_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtLecOpeCod_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtavOpenom_Columnclass = "WWColumn WWColumnDanger" ;
            edtLecHdr_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            cmbLecEstado.setColumnClass( "WWColumn WWColumnDanger hidden-xs" );
            edtLecParCod_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtavParcodnom_Columnclass = "WWColumn WWColumnDanger" ;
            edtavTexto1_Columnclass = "WWColumn WWColumnDanger" ;
            edtavClicod_Columnclass = "WWColumn WWColumnDanger" ;
            edtavClinom_Columnclass = "WWColumn WWColumnDanger" ;
            edtavBarser_Columnclass = "WWColumn WWColumnDanger" ;
            edtavBarserdsc_Columnclass = "WWColumn WWColumnDanger" ;
            edtavBarcolnom_Columnclass = "WWColumn WWColumnDanger" ;
            edtavBarcolnum_Columnclass = "WWColumn WWColumnDanger" ;
            edtavHisprodti_Columnclass = "WWColumn WWColumnDanger" ;
            edtavHisprodtf_Columnclass = "WWColumn WWColumnDanger" ;
            edtavHisprof_Columnclass = "WWColumn WWColumnDanger" ;
            edtlecOpeNom_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtLecFasDsc_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtLecParNom_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
            edtavPedidocliente_Columnclass = "WWColumn WWColumnDanger" ;
         }
         else
         {
            edtavDetailwebcomponent_Columnclass = httpContext.getMessage( "WWIconActionColumn WCD_ActionColumn", "") ;
            edtLecMaqCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtavMaqdsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtLecFec_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtLecOpeCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtavOpenom_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtLecHdr_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            cmbLecEstado.setColumnClass( httpContext.getMessage( "WWColumn hidden-xs", "") );
            edtLecParCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtavParcodnom_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavTexto1_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavClicod_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavClinom_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavBarser_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavBarserdsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavBarcolnom_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavBarcolnum_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavHisprodti_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavHisprodtf_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavHisprof_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtlecOpeNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtLecFasDsc_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtLecParNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtavPedidocliente_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(88) ;
         }
         sendrow_882( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_88_Refreshing )
      {
         httpContext.doAjaxLoad(88, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e16IY2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV7ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV5ColumnsSelector.fromJSonString(AV7ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ConsultaMaquinasProduccionWWColumnsSelector", ((GXutil.strcmp("", AV7ColumnsSelectorXML)==0) ? "" : AV5ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV114ProgressIndicator", AV114ProgressIndicator);
   }

   public void e18IY2( )
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

   public void e19IY2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV115WebSession.setValue("FiltroConsultaMaquinasProduccion_LecMaqCod", AV33LecMaqCod);
      AV115WebSession.setValue("FiltroConsultaMaquinasProduccion_LecMaqCod_To", AV108LecMaqCod_To);
      AV115WebSession.setValue("FiltroConsultaMaquinasProduccion_LecEstado", AV99LecEstado);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      GXv_char14[0] = AV13ExcelFilename ;
      GXv_char12[0] = AV11ErrorMessage ;
      new app.consultamaquinasproduccionwwexport(remoteHandle, context).execute( GXv_char14, GXv_char12) ;
      consultamaquinasproduccionww_impl.this.AV13ExcelFilename = GXv_char14[0] ;
      consultamaquinasproduccionww_impl.this.AV11ErrorMessage = GXv_char12[0] ;
      if ( GXutil.strcmp(AV13ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV13ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV11ErrorMessage);
      }
      /*  Sending Event outputs  */
      cmbavLecestado.setValue( GXutil.rtrim( AV99LecEstado) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavLecestado.getInternalname(), "Values", cmbavLecestado.ToJavascriptSource(), true);
   }

   public void e20IY2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV115WebSession.setValue("FiltroConsultaMaquinasProduccion_LecMaqCod", AV33LecMaqCod);
      AV115WebSession.setValue("FiltroConsultaMaquinasProduccion_LecMaqCod_To", AV108LecMaqCod_To);
      AV115WebSession.setValue("FiltroConsultaMaquinasProduccion_LecEstado", AV99LecEstado);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.consultamaquinasproduccionwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      cmbavLecestado.setValue( GXutil.rtrim( AV99LecEstado) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavLecestado.getInternalname(), "Values", cmbavLecestado.ToJavascriptSource(), true);
   }

   public void e12IY2( )
   {
      /* Combo_lecmaqcod_to_Onoptionclicked Routine */
      returnInSub = false ;
      AV108LecMaqCod_To = Combo_lecmaqcod_to_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108LecMaqCod_To", AV108LecMaqCod_To);
      /*  Sending Event outputs  */
   }

   public void e11IY2( )
   {
      /* Combo_lecmaqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV33LecMaqCod = Combo_lecmaqcod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33LecMaqCod", AV33LecMaqCod);
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV46OrderedBy, 4, 0))+":"+(AV48OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV5ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecMaqCod", "", "Máquina", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&MaqDsc", "", "Descrip.Máquina", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecFec", "", "Fecha", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecOpeCod", "", "Operario", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&OpeNom", "", "Nombre", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecHdr", "", "Hdr", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecEstado", "", "Estado", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecParCod", "", "Paro", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&ParCodNom", "", "Descripción", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&Texto1", "", "Observación", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&CliCod", "", "Cliente", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&CliNom", "", "Nombre", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarSer", "", "Artículo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarSerDsc", "", "Descrip.Artículo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarColNom", "", "Color", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarColNum", "", "Número", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&HisProdti", "", "Inicio", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&HisProdtf", "", "Fin", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&HisProF", "", "Fin?", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "lecOpeNom", "", "Nombre", false, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecFasDsc", "", "Descripcion", false, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecParNom", "", "Descripcion", false, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&PedidoCliente", "", "", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXt_char1 = AV87UserCustomValue ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultaMaquinasProduccionWWColumnsSelector", GXv_char14) ;
      consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char14[0] ;
      AV87UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV87UserCustomValue)==0) ) )
      {
         AV6ColumnsSelectorAux.fromxml(AV87UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector18[0] = AV6ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector19[0] = AV5ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, GXv_SdtWWPColumnsSelector19) ;
         AV6ColumnsSelectorAux = GXv_SdtWWPColumnsSelector18[0] ;
         AV5ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      }
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV51Session.getValue(AV151Pgmname+"GridState"), "") == 0 )
      {
         AV18GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV151Pgmname+"GridState"), null, null);
      }
      else
      {
         AV18GridState.fromxml(AV51Session.getValue(AV151Pgmname+"GridState"), null, null);
      }
      AV46OrderedBy = AV18GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46OrderedBy), 4, 0));
      AV48OrderedDsc = AV18GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48OrderedDsc", AV48OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      AV154GXV1 = 1 ;
      while ( AV154GXV1 <= AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV154GXV1));
         if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "LECESTADO") == 0 )
         {
            AV99LecEstado = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99LecEstado", AV99LecEstado);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV73TFLecMaqCod = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFLecMaqCod", AV73TFLecMaqCod);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD_SEL") == 0 )
         {
            AV74TFLecMaqCod_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFLecMaqCod_Sel", AV74TFLecMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV67TFLecFec = localUtil.ctod( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFLecFec", localUtil.format(AV67TFLecFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV77TFLecOpeCod = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFLecOpeCod), 6, 0));
            AV78TFLecOpeCod_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFLecOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFLecOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR") == 0 )
         {
            AV69TFLecHdr = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFLecHdr", AV69TFLecHdr);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR_SEL") == 0 )
         {
            AV70TFLecHdr_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFLecHdr_Sel", AV70TFLecHdr_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV98TFLecEstado_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFLecEstado_Sel", AV98TFLecEstado_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV79TFLecParCod = (short)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFLecParCod), 4, 0));
            AV80TFLecParCod_To = (short)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFLecParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFLecParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV141TFlecOpeNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV141TFlecOpeNom", AV141TFlecOpeNom);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM_SEL") == 0 )
         {
            AV142TFlecOpeNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV142TFlecOpeNom_Sel", AV142TFlecOpeNom_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV143TFLecFasDsc = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV143TFLecFasDsc", AV143TFLecFasDsc);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC_SEL") == 0 )
         {
            AV144TFLecFasDsc_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144TFLecFasDsc_Sel", AV144TFLecFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV145TFLecParNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145TFLecParNom", AV145TFLecParNom);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM_SEL") == 0 )
         {
            AV146TFLecParNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146TFLecParNom_Sel", AV146TFLecParNom_Sel);
         }
         AV154GXV1 = (int)(AV154GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFLecMaqCod_Sel)==0), AV74TFLecMaqCod_Sel, GXv_char14) ;
      consultamaquinasproduccionww_impl.this.GXt_char1 = GXv_char14[0] ;
      GXt_char20 = "" ;
      GXv_char12[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFLecHdr_Sel)==0), AV70TFLecHdr_Sel, GXv_char12) ;
      consultamaquinasproduccionww_impl.this.GXt_char20 = GXv_char12[0] ;
      GXt_char21 = "" ;
      GXv_char11[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV98TFLecEstado_Sel)==0), AV98TFLecEstado_Sel, GXv_char11) ;
      consultamaquinasproduccionww_impl.this.GXt_char21 = GXv_char11[0] ;
      GXt_char22 = "" ;
      GXv_char4[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV142TFlecOpeNom_Sel)==0), AV142TFlecOpeNom_Sel, GXv_char4) ;
      consultamaquinasproduccionww_impl.this.GXt_char22 = GXv_char4[0] ;
      GXt_char23 = "" ;
      GXv_char3[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV144TFLecFasDsc_Sel)==0), AV144TFLecFasDsc_Sel, GXv_char3) ;
      consultamaquinasproduccionww_impl.this.GXt_char23 = GXv_char3[0] ;
      GXt_char24 = "" ;
      GXv_char2[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV146TFLecParNom_Sel)==0), AV146TFLecParNom_Sel, GXv_char2) ;
      consultamaquinasproduccionww_impl.this.GXt_char24 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||"+GXt_char20+"|"+GXt_char21+"||"+GXt_char22+"|"+GXt_char23+"|"+GXt_char24+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char24 = "" ;
      GXv_char14[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFLecMaqCod)==0), AV73TFLecMaqCod, GXv_char14) ;
      consultamaquinasproduccionww_impl.this.GXt_char24 = GXv_char14[0] ;
      GXt_char23 = "" ;
      GXv_char12[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFLecHdr)==0), AV69TFLecHdr, GXv_char12) ;
      consultamaquinasproduccionww_impl.this.GXt_char23 = GXv_char12[0] ;
      GXt_char22 = "" ;
      GXv_char11[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV141TFlecOpeNom)==0), AV141TFlecOpeNom, GXv_char11) ;
      consultamaquinasproduccionww_impl.this.GXt_char22 = GXv_char11[0] ;
      GXt_char21 = "" ;
      GXv_char4[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV143TFLecFasDsc)==0), AV143TFLecFasDsc, GXv_char4) ;
      consultamaquinasproduccionww_impl.this.GXt_char21 = GXv_char4[0] ;
      GXt_char20 = "" ;
      GXv_char3[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV145TFLecParNom)==0), AV145TFLecParNom, GXv_char3) ;
      consultamaquinasproduccionww_impl.this.GXt_char20 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char24+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFLecFec)) ? "" : localUtil.dtoc( AV67TFLecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV77TFLecOpeCod) ? "" : GXutil.str( AV77TFLecOpeCod, 6, 0))+"|"+GXt_char23+"||"+((0==AV79TFLecParCod) ? "" : GXutil.str( AV79TFLecParCod, 4, 0))+"|"+GXt_char22+"|"+GXt_char21+"|"+GXt_char20+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV78TFLecOpeCod_To) ? "" : GXutil.str( AV78TFLecOpeCod_To, 6, 0))+"|||"+((0==AV80TFLecParCod_To) ? "" : GXutil.str( AV80TFLecParCod_To, 4, 0))+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV18GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV18GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV18GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV18GridState.fromxml(AV51Session.getValue(AV151Pgmname+"GridState"), null, null);
      AV18GridState.setgxTv_SdtWWPGridState_Orderedby( AV46OrderedBy );
      AV18GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV48OrderedDsc );
      AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState25[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "LECESTADO", "", !(GXutil.strcmp("", AV99LecEstado)==0), (short)(0), AV99LecEstado, "") ;
      AV18GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLECMAQCOD", "", !(GXutil.strcmp("", AV73TFLecMaqCod)==0), (short)(0), AV73TFLecMaqCod, "", !(GXutil.strcmp("", AV74TFLecMaqCod_Sel)==0), AV74TFLecMaqCod_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLECFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFLecFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV67TFLecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV18GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLECOPECOD", "", !((0==AV77TFLecOpeCod)&&(0==AV78TFLecOpeCod_To)), (short)(0), GXutil.trim( GXutil.str( AV77TFLecOpeCod, 6, 0)), GXutil.trim( GXutil.str( AV78TFLecOpeCod_To, 6, 0))) ;
      AV18GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLECHDR", "", !(GXutil.strcmp("", AV69TFLecHdr)==0), (short)(0), AV69TFLecHdr, "", !(GXutil.strcmp("", AV70TFLecHdr_Sel)==0), AV70TFLecHdr_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLECESTADO_SEL", "", !(GXutil.strcmp("", AV98TFLecEstado_Sel)==0), (short)(0), AV98TFLecEstado_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLECPARCOD", "", !((0==AV79TFLecParCod)&&(0==AV80TFLecParCod_To)), (short)(0), GXutil.trim( GXutil.str( AV79TFLecParCod, 4, 0)), GXutil.trim( GXutil.str( AV80TFLecParCod_To, 4, 0))) ;
      AV18GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLECOPENOM", "", !(GXutil.strcmp("", AV141TFlecOpeNom)==0), (short)(0), AV141TFlecOpeNom, "", !(GXutil.strcmp("", AV142TFlecOpeNom_Sel)==0), AV142TFlecOpeNom_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLECFASDSC", "", !(GXutil.strcmp("", AV143TFLecFasDsc)==0), (short)(0), AV143TFLecFasDsc, "", !(GXutil.strcmp("", AV144TFLecFasDsc_Sel)==0), AV144TFLecFasDsc_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLECPARNOM", "", !(GXutil.strcmp("", AV145TFLecParNom)==0), (short)(0), AV145TFLecParNom, "", !(GXutil.strcmp("", AV146TFLecParNom_Sel)==0), AV146TFLecParNom_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState25[0] ;
      AV18GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV18GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV151Pgmname+"GridState", AV18GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV85TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV85TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV151Pgmname );
      AV85TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV85TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV20HTTPRequest.getScriptName()+"?"+AV20HTTPRequest.getQuerystring() );
      AV85TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TLECTOR" );
      AV51Session.setValue("TrnContext", AV85TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S122( )
   {
      /* 'LOADCOMBOLECMAQCOD_TO' Routine */
      returnInSub = false ;
      GXt_char24 = AV92Station ;
      GXv_char14[0] = GXt_char24 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char14) ;
      consultamaquinasproduccionww_impl.this.GXt_char24 = GXv_char14[0] ;
      AV92Station = GXt_char24 ;
      GXv_char14[0] = AV93EmprCod ;
      GXv_char12[0] = AV94EmprNom ;
      GXv_char11[0] = AV95UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV92Station, GXv_char14, GXv_char12, GXv_char11) ;
      consultamaquinasproduccionww_impl.this.AV93EmprCod = GXv_char14[0] ;
      consultamaquinasproduccionww_impl.this.AV94EmprNom = GXv_char12[0] ;
      consultamaquinasproduccionww_impl.this.AV95UsurCod = GXv_char11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavEmprcod_Internalname, AV93EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      AV109LecMaqCod_To_Data.clear();
      /* Using cursor H00IY6 */
      pr_default.execute(4, new Object[] {AV93EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = H00IY6_A396EmprCod[0] ;
         A1166LecMaqCod = H00IY6_A1166LecMaqCod[0] ;
         GXt_char24 = AV44MaqDsc ;
         GXv_char14[0] = GXt_char24 ;
         new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A1166LecMaqCod, GXv_char14) ;
         consultamaquinasproduccionww_impl.this.GXt_char24 = GXv_char14[0] ;
         AV44MaqDsc = GXt_char24 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqdsc_Internalname, AV44MaqDsc);
         GXt_char24 = AV126MaqEst ;
         GXv_char14[0] = GXt_char24 ;
         new app.produccion.maquinaestado_pr(remoteHandle, context).execute( AV93EmprCod, A1166LecMaqCod, GXv_char14) ;
         consultamaquinasproduccionww_impl.this.GXt_char24 = GXv_char14[0] ;
         AV126MaqEst = GXt_char24 ;
         if ( GXutil.strcmp(AV126MaqEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV106Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV106Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A1166LecMaqCod) );
            AV106Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A1166LecMaqCod), AV44MaqDsc, "", "", "", "", "", "", "") );
            AV109LecMaqCod_To_Data.add(AV106Combo_DataItem, 0);
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV109LecMaqCod_To_Data.sort("Title");
      Combo_lecmaqcod_to_Selectedvalue_set = AV108LecMaqCod_To ;
      ucCombo_lecmaqcod_to.sendProperty(context, "", false, Combo_lecmaqcod_to_Internalname, "SelectedValue_set", Combo_lecmaqcod_to_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOLECMAQCOD' Routine */
      returnInSub = false ;
      GXt_char24 = AV92Station ;
      GXv_char14[0] = GXt_char24 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char14) ;
      consultamaquinasproduccionww_impl.this.GXt_char24 = GXv_char14[0] ;
      AV92Station = GXt_char24 ;
      GXv_char14[0] = AV93EmprCod ;
      GXv_char12[0] = AV94EmprNom ;
      GXv_char11[0] = AV95UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV92Station, GXv_char14, GXv_char12, GXv_char11) ;
      consultamaquinasproduccionww_impl.this.AV93EmprCod = GXv_char14[0] ;
      consultamaquinasproduccionww_impl.this.AV94EmprNom = GXv_char12[0] ;
      consultamaquinasproduccionww_impl.this.AV95UsurCod = GXv_char11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavEmprcod_Internalname, AV93EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD"+"_"+sGXsfl_88_idx, getSecureSignedToken( sGXsfl_88_idx, GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      AV107LecMaqCod_Data.clear();
      /* Using cursor H00IY7 */
      pr_default.execute(5, new Object[] {AV93EmprCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = H00IY7_A396EmprCod[0] ;
         A1166LecMaqCod = H00IY7_A1166LecMaqCod[0] ;
         GXt_char24 = AV44MaqDsc ;
         GXv_char14[0] = GXt_char24 ;
         new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A1166LecMaqCod, GXv_char14) ;
         consultamaquinasproduccionww_impl.this.GXt_char24 = GXv_char14[0] ;
         AV44MaqDsc = GXt_char24 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqdsc_Internalname, AV44MaqDsc);
         GXt_char24 = AV126MaqEst ;
         GXv_char14[0] = GXt_char24 ;
         new app.produccion.maquinaestado_pr(remoteHandle, context).execute( AV93EmprCod, A1166LecMaqCod, GXv_char14) ;
         consultamaquinasproduccionww_impl.this.GXt_char24 = GXv_char14[0] ;
         AV126MaqEst = GXt_char24 ;
         if ( GXutil.strcmp(AV126MaqEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV106Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV106Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A1166LecMaqCod) );
            AV106Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A1166LecMaqCod), AV44MaqDsc, "", "", "", "", "", "", "") );
            AV107LecMaqCod_Data.add(AV106Combo_DataItem, 0);
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      AV107LecMaqCod_Data.sort("Title");
      Combo_lecmaqcod_Selectedvalue_set = AV33LecMaqCod ;
      ucCombo_lecmaqcod.sendProperty(context, "", false, Combo_lecmaqcod_Internalname, "SelectedValue_set", Combo_lecmaqcod_Selectedvalue_set);
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
      paIY2( ) ;
      wsIY2( ) ;
      weIY2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116122233", true, true);
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
      httpContext.AddJavascriptSource("consultamaquinasproduccionww.js", "?202682116122234", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_882( )
   {
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_88_idx ;
      edtLecMaqCod_Internalname = "LECMAQCOD_"+sGXsfl_88_idx ;
      edtavMaqdsc_Internalname = "vMAQDSC_"+sGXsfl_88_idx ;
      edtLecFec_Internalname = "LECFEC_"+sGXsfl_88_idx ;
      edtLecOpeCod_Internalname = "LECOPECOD_"+sGXsfl_88_idx ;
      edtavOpenom_Internalname = "vOPENOM_"+sGXsfl_88_idx ;
      edtLecHdr_Internalname = "LECHDR_"+sGXsfl_88_idx ;
      cmbLecEstado.setInternalname( "LECESTADO_"+sGXsfl_88_idx );
      edtLecParCod_Internalname = "LECPARCOD_"+sGXsfl_88_idx ;
      edtavParcodnom_Internalname = "vPARCODNOM_"+sGXsfl_88_idx ;
      edtavTexto1_Internalname = "vTEXTO1_"+sGXsfl_88_idx ;
      edtavEmprcod_Internalname = "vEMPRCOD_"+sGXsfl_88_idx ;
      edtLecBarCod_Internalname = "LECBARCOD_"+sGXsfl_88_idx ;
      edtLecBarReo_Internalname = "LECBARREO_"+sGXsfl_88_idx ;
      edtLecBarPar_Internalname = "LECBARPAR_"+sGXsfl_88_idx ;
      edtLecFasOrd_Internalname = "LECFASORD_"+sGXsfl_88_idx ;
      edtavFin_Internalname = "vFIN_"+sGXsfl_88_idx ;
      edtavVestparo_Internalname = "vVESTPARO_"+sGXsfl_88_idx ;
      edtavClicod_Internalname = "vCLICOD_"+sGXsfl_88_idx ;
      edtavClinom_Internalname = "vCLINOM_"+sGXsfl_88_idx ;
      edtavBarser_Internalname = "vBARSER_"+sGXsfl_88_idx ;
      edtavBarserdsc_Internalname = "vBARSERDSC_"+sGXsfl_88_idx ;
      edtavBarcolnom_Internalname = "vBARCOLNOM_"+sGXsfl_88_idx ;
      edtavBarcolnum_Internalname = "vBARCOLNUM_"+sGXsfl_88_idx ;
      edtavHisprodti_Internalname = "vHISPRODTI_"+sGXsfl_88_idx ;
      edtavHisprodtf_Internalname = "vHISPRODTF_"+sGXsfl_88_idx ;
      edtavHisprof_Internalname = "vHISPROF_"+sGXsfl_88_idx ;
      edtlecOpeNom_Internalname = "LECOPENOM_"+sGXsfl_88_idx ;
      edtLecFasDsc_Internalname = "LECFASDSC_"+sGXsfl_88_idx ;
      edtLecParNom_Internalname = "LECPARNOM_"+sGXsfl_88_idx ;
      edtavPedidocliente_Internalname = "vPEDIDOCLIENTE_"+sGXsfl_88_idx ;
   }

   public void subsflControlProps_fel_882( )
   {
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_88_fel_idx ;
      edtLecMaqCod_Internalname = "LECMAQCOD_"+sGXsfl_88_fel_idx ;
      edtavMaqdsc_Internalname = "vMAQDSC_"+sGXsfl_88_fel_idx ;
      edtLecFec_Internalname = "LECFEC_"+sGXsfl_88_fel_idx ;
      edtLecOpeCod_Internalname = "LECOPECOD_"+sGXsfl_88_fel_idx ;
      edtavOpenom_Internalname = "vOPENOM_"+sGXsfl_88_fel_idx ;
      edtLecHdr_Internalname = "LECHDR_"+sGXsfl_88_fel_idx ;
      cmbLecEstado.setInternalname( "LECESTADO_"+sGXsfl_88_fel_idx );
      edtLecParCod_Internalname = "LECPARCOD_"+sGXsfl_88_fel_idx ;
      edtavParcodnom_Internalname = "vPARCODNOM_"+sGXsfl_88_fel_idx ;
      edtavTexto1_Internalname = "vTEXTO1_"+sGXsfl_88_fel_idx ;
      edtavEmprcod_Internalname = "vEMPRCOD_"+sGXsfl_88_fel_idx ;
      edtLecBarCod_Internalname = "LECBARCOD_"+sGXsfl_88_fel_idx ;
      edtLecBarReo_Internalname = "LECBARREO_"+sGXsfl_88_fel_idx ;
      edtLecBarPar_Internalname = "LECBARPAR_"+sGXsfl_88_fel_idx ;
      edtLecFasOrd_Internalname = "LECFASORD_"+sGXsfl_88_fel_idx ;
      edtavFin_Internalname = "vFIN_"+sGXsfl_88_fel_idx ;
      edtavVestparo_Internalname = "vVESTPARO_"+sGXsfl_88_fel_idx ;
      edtavClicod_Internalname = "vCLICOD_"+sGXsfl_88_fel_idx ;
      edtavClinom_Internalname = "vCLINOM_"+sGXsfl_88_fel_idx ;
      edtavBarser_Internalname = "vBARSER_"+sGXsfl_88_fel_idx ;
      edtavBarserdsc_Internalname = "vBARSERDSC_"+sGXsfl_88_fel_idx ;
      edtavBarcolnom_Internalname = "vBARCOLNOM_"+sGXsfl_88_fel_idx ;
      edtavBarcolnum_Internalname = "vBARCOLNUM_"+sGXsfl_88_fel_idx ;
      edtavHisprodti_Internalname = "vHISPRODTI_"+sGXsfl_88_fel_idx ;
      edtavHisprodtf_Internalname = "vHISPRODTF_"+sGXsfl_88_fel_idx ;
      edtavHisprof_Internalname = "vHISPROF_"+sGXsfl_88_fel_idx ;
      edtlecOpeNom_Internalname = "LECOPENOM_"+sGXsfl_88_fel_idx ;
      edtLecFasDsc_Internalname = "LECFASDSC_"+sGXsfl_88_fel_idx ;
      edtLecParNom_Internalname = "LECPARNOM_"+sGXsfl_88_fel_idx ;
      edtavPedidocliente_Internalname = "vPEDIDOCLIENTE_"+sGXsfl_88_fel_idx ;
   }

   public void sendrow_882( )
   {
      subsflControlProps_882( ) ;
      wbIY0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_88_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_88_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_88_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV104DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,89);\"" : " "),"'"+""+"'"+",false,"+"'"+"e24iy2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,edtavDetailwebcomponent_Columnclass,edtavDetailwebcomponent_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecMaqCod_Internalname,GXutil.rtrim( A1166LecMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLecMaqCod_Columnclass,edtLecMaqCod_Columnheaderclass,Integer.valueOf(edtLecMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavMaqdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqdsc_Enabled!=0)&&(edtavMaqdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 91,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqdsc_Internalname,GXutil.rtrim( AV44MaqDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqdsc_Enabled!=0)&&(edtavMaqdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,91);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","",edtavMaqdsc_Tooltiptext,"",edtavMaqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavMaqdsc_Columnclass,edtavMaqdsc_Columnheaderclass,Integer.valueOf(edtavMaqdsc_Visible),Integer.valueOf(edtavMaqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLecFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecFec_Internalname,localUtil.format(A1174LecFec, "99/99/99"),localUtil.format( A1174LecFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLecFec_Columnclass,edtLecFec_Columnheaderclass,Integer.valueOf(edtLecFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLecOpeCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1170LecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1170LecOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLecOpeCod_Columnclass,edtLecOpeCod_Columnheaderclass,Integer.valueOf(edtLecOpeCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavOpenom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOpenom_Enabled!=0)&&(edtavOpenom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 94,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOpenom_Internalname,GXutil.rtrim( AV45OpeNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavOpenom_Enabled!=0)&&(edtavOpenom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,94);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavOpenom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavOpenom_Columnclass,edtavOpenom_Columnheaderclass,Integer.valueOf(edtavOpenom_Visible),Integer.valueOf(edtavOpenom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecHdr_Internalname,GXutil.rtrim( A13721LecHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLecHdr_Columnclass,edtLecHdr_Columnheaderclass,Integer.valueOf(edtLecHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbLecEstado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         GXCCtl = "LECESTADO_" + sGXsfl_88_idx ;
         cmbLecEstado.setName( GXCCtl );
         cmbLecEstado.setWebtags( "" );
         cmbLecEstado.addItem("P", httpContext.getMessage( "Proceso", ""), (short)(0));
         cmbLecEstado.addItem("F", httpContext.getMessage( "Finalizadas", ""), (short)(0));
         if ( cmbLecEstado.getItemCount() > 0 )
         {
            A13722LecEstado = cmbLecEstado.getValidValue(A13722LecEstado) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLecEstado,cmbLecEstado.getInternalname(),GXutil.rtrim( A13722LecEstado),Integer.valueOf(1),cmbLecEstado.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbLecEstado.getVisible()),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbLecEstado.getColumnClass(),cmbLecEstado.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLecEstado.setValue( GXutil.rtrim( A13722LecEstado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbLecEstado.getInternalname(), "Values", cmbLecEstado.ToJavascriptSource(), !bGXsfl_88_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLecParCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecParCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1172LecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1172LecParCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecParCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLecParCod_Columnclass,edtLecParCod_Columnheaderclass,Integer.valueOf(edtLecParCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavParcodnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavParcodnom_Enabled!=0)&&(edtavParcodnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 98,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavParcodnom_Internalname,GXutil.rtrim( AV50ParCodNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavParcodnom_Enabled!=0)&&(edtavParcodnom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,98);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavParcodnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavParcodnom_Columnclass,edtavParcodnom_Columnheaderclass,Integer.valueOf(edtavParcodnom_Visible),Integer.valueOf(edtavParcodnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavTexto1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTexto1_Enabled!=0)&&(edtavTexto1_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 99,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTexto1_Internalname,AV53Texto1,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTexto1_Enabled!=0)&&(edtavTexto1_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,99);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTexto1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavTexto1_Columnclass,edtavTexto1_Columnheaderclass,Integer.valueOf(edtavTexto1_Visible),Integer.valueOf(edtavTexto1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEmprcod_Enabled!=0)&&(edtavEmprcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEmprcod_Internalname,GXutil.rtrim( AV93EmprCod),GXutil.rtrim( localUtil.format( AV93EmprCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavEmprcod_Enabled!=0)&&(edtavEmprcod_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,100);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavEmprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEmprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1167LecBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1168LecBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecBarPar_Internalname,GXutil.rtrim( A1169LecBarPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecFasOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A1188LecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1188LecFasOrd), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecFasOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFin_Enabled!=0)&&(edtavFin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFin_Internalname,GXutil.rtrim( AV14Fin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFin_Enabled!=0)&&(edtavFin_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,105);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavVestparo_Enabled!=0)&&(edtavVestparo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 106,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavVestparo_Internalname,GXutil.rtrim( AV89vEstParo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavVestparo_Enabled!=0)&&(edtavVestparo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,106);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavVestparo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavVestparo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavClicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavClicod_Enabled!=0)&&(edtavClicod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClicod_Internalname,GXutil.ltrim( localUtil.ntoc( AV116CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV116CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavClicod_Enabled!=0)&&(edtavClicod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,107);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavClicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavClicod_Columnclass,edtavClicod_Columnheaderclass,Integer.valueOf(edtavClicod_Visible),Integer.valueOf(edtavClicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavClinom_Enabled!=0)&&(edtavClinom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClinom_Internalname,GXutil.rtrim( AV117CliNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavClinom_Enabled!=0)&&(edtavClinom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,108);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavClinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavClinom_Columnclass,edtavClinom_Columnheaderclass,Integer.valueOf(edtavClinom_Visible),Integer.valueOf(edtavClinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarser_Enabled!=0)&&(edtavBarser_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 109,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarser_Internalname,GXutil.rtrim( AV118BarSer),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarser_Enabled!=0)&&(edtavBarser_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,109);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavBarser_Columnclass,edtavBarser_Columnheaderclass,Integer.valueOf(edtavBarser_Visible),Integer.valueOf(edtavBarser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarserdsc_Enabled!=0)&&(edtavBarserdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarserdsc_Internalname,GXutil.rtrim( AV119BarSerDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarserdsc_Enabled!=0)&&(edtavBarserdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,110);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavBarserdsc_Columnclass,edtavBarserdsc_Columnheaderclass,Integer.valueOf(edtavBarserdsc_Visible),Integer.valueOf(edtavBarserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcolnom_Enabled!=0)&&(edtavBarcolnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnom_Internalname,GXutil.rtrim( AV120BarColNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarcolnom_Enabled!=0)&&(edtavBarcolnom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,111);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavBarcolnom_Columnclass,edtavBarcolnom_Columnheaderclass,Integer.valueOf(edtavBarcolnom_Visible),Integer.valueOf(edtavBarcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcolnum_Enabled!=0)&&(edtavBarcolnum_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( AV121BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV121BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcolnum_Enabled!=0)&&(edtavBarcolnum_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,112);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavBarcolnum_Columnclass,edtavBarcolnum_Columnheaderclass,Integer.valueOf(edtavBarcolnum_Visible),Integer.valueOf(edtavBarcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHisprodti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHisprodti_Enabled!=0)&&(edtavHisprodti_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprodti_Internalname,localUtil.ttoc( AV122HisProdti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV122HisProdti, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavHisprodti_Enabled!=0)&&(edtavHisprodti_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,113);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHisprodti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHisprodti_Columnclass,edtavHisprodti_Columnheaderclass,Integer.valueOf(edtavHisprodti_Visible),Integer.valueOf(edtavHisprodti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHisprodtf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHisprodtf_Enabled!=0)&&(edtavHisprodtf_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 114,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprodtf_Internalname,localUtil.ttoc( AV123HisProdtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV123HisProdtf, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavHisprodtf_Enabled!=0)&&(edtavHisprodtf_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,114);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHisprodtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHisprodtf_Columnclass,edtavHisprodtf_Columnheaderclass,Integer.valueOf(edtavHisprodtf_Visible),Integer.valueOf(edtavHisprodtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHisprof_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHisprof_Enabled!=0)&&(edtavHisprof_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprof_Internalname,GXutil.rtrim( AV124HisProF),GXutil.rtrim( localUtil.format( AV124HisProF, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavHisprof_Enabled!=0)&&(edtavHisprof_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,115);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHisprof_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHisprof_Columnclass,edtavHisprof_Columnheaderclass,Integer.valueOf(edtavHisprof_Visible),Integer.valueOf(edtavHisprof_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtlecOpeNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtlecOpeNom_Internalname,GXutil.rtrim( A14259lecOpeNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtlecOpeNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtlecOpeNom_Columnclass,edtlecOpeNom_Columnheaderclass,Integer.valueOf(edtlecOpeNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecFasDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecFasDsc_Internalname,GXutil.rtrim( A14260LecFasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLecFasDsc_Columnclass,edtLecFasDsc_Columnheaderclass,Integer.valueOf(edtLecFasDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecParNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecParNom_Internalname,GXutil.rtrim( A14261LecParNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecParNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLecParNom_Columnclass,edtLecParNom_Columnheaderclass,Integer.valueOf(edtLecParNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPedidocliente_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPedidocliente_Enabled!=0)&&(edtavPedidocliente_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 119,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPedidocliente_Internalname,GXutil.rtrim( AV148PedidoCliente),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPedidocliente_Enabled!=0)&&(edtavPedidocliente_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,119);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPedidocliente_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPedidocliente_Columnclass,edtavPedidocliente_Columnheaderclass,Integer.valueOf(edtavPedidocliente_Visible),Integer.valueOf(edtavPedidocliente_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesIY2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_88_idx = ((subGrid_Islastpage==1)&&(nGXsfl_88_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_88_idx+1) ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_882( ) ;
      }
      /* End function sendrow_882 */
   }

   public void startgridcontrol88( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"88\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMaqdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descrip.Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecOpeCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavOpenom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbLecEstado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecParCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavParcodnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTexto1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observación", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavClicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descrip.Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Número", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHisprodti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHisprodtf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHisprof_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtlecOpeNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecFasDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecParNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPedidocliente_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV104DetailWebComponent));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDetailwebcomponent_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDetailwebcomponent_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1166LecMaqCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLecMaqCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLecMaqCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV44MaqDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavMaqdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavMaqdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavMaqdsc_Tooltiptext));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A1174LecFec, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLecFec_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLecFec_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1170LecOpeCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLecOpeCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLecOpeCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecOpeCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV45OpeNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavOpenom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavOpenom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13721LecHdr));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLecHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLecHdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13722LecEstado));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbLecEstado.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbLecEstado.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbLecEstado.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1172LecParCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLecParCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLecParCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecParCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV50ParCodNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavParcodnom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavParcodnom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavParcodnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavParcodnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV53Texto1);
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavTexto1_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavTexto1_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTexto1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTexto1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV93EmprCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEmprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1169LecBarPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1188LecFasOrd, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV14Fin));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV89vEstParo));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavVestparo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV116CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavClicod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavClicod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV117CliNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavClinom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavClinom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV118BarSer));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavBarser_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavBarser_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV119BarSerDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavBarserdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavBarserdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV120BarColNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavBarcolnom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavBarcolnom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV121BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavBarcolnum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavBarcolnum_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( AV122HisProdti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHisprodti_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHisprodti_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprodti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHisprodti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( AV123HisProdtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHisprodtf_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHisprodtf_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprodtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHisprodtf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV124HisProF));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHisprof_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHisprof_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprof_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHisprof_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14259lecOpeNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtlecOpeNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtlecOpeNom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtlecOpeNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14260LecFasDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLecFasDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLecFasDsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecFasDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14261LecParNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLecParNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLecParNom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecParNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV148PedidoCliente));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPedidocliente_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPedidocliente_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPedidocliente_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPedidocliente_Visible, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblockcombo_lecmaqcod_Internalname = "TEXTBLOCKCOMBO_LECMAQCOD" ;
      Combo_lecmaqcod_Internalname = "COMBO_LECMAQCOD" ;
      divTablesplittedlecmaqcod_Internalname = "TABLESPLITTEDLECMAQCOD" ;
      lblTextblockcombo_lecmaqcod_to_Internalname = "TEXTBLOCKCOMBO_LECMAQCOD_TO" ;
      Combo_lecmaqcod_to_Internalname = "COMBO_LECMAQCOD_TO" ;
      divTablesplittedlecmaqcod_to_Internalname = "TABLESPLITTEDLECMAQCOD_TO" ;
      cmbavLecestado.setInternalname( "vLECESTADO" );
      divTablefilters_Internalname = "TABLEFILTERS" ;
      divTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divPanel_generales_Internalname = "PANEL_GENERALES" ;
      Dvpanel_panel_generales_Internalname = "DVPANEL_PANEL_GENERALES" ;
      bttBtnsearch_Internalname = "BTNSEARCH" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      Datamon_Internalname = "DATAMON" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTablebarraprogreso_Internalname = "TABLEBARRAPROGRESO" ;
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      edtLecMaqCod_Internalname = "LECMAQCOD" ;
      edtavMaqdsc_Internalname = "vMAQDSC" ;
      edtLecFec_Internalname = "LECFEC" ;
      edtLecOpeCod_Internalname = "LECOPECOD" ;
      edtavOpenom_Internalname = "vOPENOM" ;
      edtLecHdr_Internalname = "LECHDR" ;
      cmbLecEstado.setInternalname( "LECESTADO" );
      edtLecParCod_Internalname = "LECPARCOD" ;
      edtavParcodnom_Internalname = "vPARCODNOM" ;
      edtavTexto1_Internalname = "vTEXTO1" ;
      edtavEmprcod_Internalname = "vEMPRCOD" ;
      edtLecBarCod_Internalname = "LECBARCOD" ;
      edtLecBarReo_Internalname = "LECBARREO" ;
      edtLecBarPar_Internalname = "LECBARPAR" ;
      edtLecFasOrd_Internalname = "LECFASORD" ;
      edtavFin_Internalname = "vFIN" ;
      edtavVestparo_Internalname = "vVESTPARO" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavHisprodti_Internalname = "vHISPRODTI" ;
      edtavHisprodtf_Internalname = "vHISPRODTF" ;
      edtavHisprof_Internalname = "vHISPROF" ;
      edtlecOpeNom_Internalname = "LECOPENOM" ;
      edtLecFasDsc_Internalname = "LECFASDSC" ;
      edtLecParNom_Internalname = "LECPARNOM" ;
      edtavPedidocliente_Internalname = "vPEDIDOCLIENTE" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divPanel_resultados_Internalname = "PANEL_RESULTADOS" ;
      Dvpanel_panel_resultados_Internalname = "DVPANEL_PANEL_RESULTADOS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavLecmaqcod_Internalname = "vLECMAQCOD" ;
      edtavLecmaqcod_to_Internalname = "vLECMAQCOD_TO" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_lecfecauxdate_Internalname = "vDDO_LECFECAUXDATE" ;
      divDdo_lecfecauxdates_Internalname = "DDO_LECFECAUXDATES" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavPedidocliente_Jsonclick = "" ;
      edtavPedidocliente_Columnclass = "WWColumn" ;
      edtavPedidocliente_Enabled = 1 ;
      edtLecParNom_Jsonclick = "" ;
      edtLecParNom_Columnclass = "WWColumn hidden-xs" ;
      edtLecFasDsc_Jsonclick = "" ;
      edtLecFasDsc_Columnclass = "WWColumn hidden-xs" ;
      edtlecOpeNom_Jsonclick = "" ;
      edtlecOpeNom_Columnclass = "WWColumn hidden-xs" ;
      edtavHisprof_Jsonclick = "" ;
      edtavHisprof_Columnclass = "WWColumn" ;
      edtavHisprof_Enabled = 1 ;
      edtavHisprodtf_Jsonclick = "" ;
      edtavHisprodtf_Columnclass = "WWColumn" ;
      edtavHisprodtf_Enabled = 1 ;
      edtavHisprodti_Jsonclick = "" ;
      edtavHisprodti_Columnclass = "WWColumn" ;
      edtavHisprodti_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Columnclass = "WWColumn" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Columnclass = "WWColumn" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Columnclass = "WWColumn" ;
      edtavBarserdsc_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Columnclass = "WWColumn" ;
      edtavBarser_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Columnclass = "WWColumn" ;
      edtavClinom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Columnclass = "WWColumn" ;
      edtavClicod_Enabled = 1 ;
      edtavVestparo_Jsonclick = "" ;
      edtavVestparo_Visible = 0 ;
      edtavVestparo_Enabled = 1 ;
      edtavFin_Jsonclick = "" ;
      edtavFin_Visible = 0 ;
      edtavFin_Enabled = 1 ;
      edtLecFasOrd_Jsonclick = "" ;
      edtLecBarPar_Jsonclick = "" ;
      edtLecBarReo_Jsonclick = "" ;
      edtLecBarCod_Jsonclick = "" ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Visible = 0 ;
      edtavEmprcod_Enabled = 1 ;
      edtavTexto1_Jsonclick = "" ;
      edtavTexto1_Columnclass = "WWColumn" ;
      edtavTexto1_Enabled = 1 ;
      edtavParcodnom_Jsonclick = "" ;
      edtavParcodnom_Columnclass = "WWColumn" ;
      edtavParcodnom_Enabled = 1 ;
      edtLecParCod_Jsonclick = "" ;
      edtLecParCod_Columnclass = "WWColumn hidden-xs" ;
      cmbLecEstado.setJsonclick( "" );
      cmbLecEstado.setColumnClass( "WWColumn hidden-xs" );
      edtLecHdr_Jsonclick = "" ;
      edtLecHdr_Columnclass = "WWColumn hidden-xs" ;
      edtavOpenom_Jsonclick = "" ;
      edtavOpenom_Columnclass = "WWColumn" ;
      edtavOpenom_Enabled = 1 ;
      edtLecOpeCod_Jsonclick = "" ;
      edtLecOpeCod_Columnclass = "WWColumn hidden-xs" ;
      edtLecFec_Jsonclick = "" ;
      edtLecFec_Columnclass = "WWColumn hidden-xs" ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Columnclass = "WWColumn" ;
      edtavMaqdsc_Tooltiptext = "" ;
      edtavMaqdsc_Enabled = 1 ;
      edtLecMaqCod_Jsonclick = "" ;
      edtLecMaqCod_Columnclass = "WWColumn hidden-xs" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavPedidocliente_Columnheaderclass = "" ;
      edtLecParNom_Columnheaderclass = "" ;
      edtLecFasDsc_Columnheaderclass = "" ;
      edtlecOpeNom_Columnheaderclass = "" ;
      edtavHisprof_Columnheaderclass = "" ;
      edtavHisprodtf_Columnheaderclass = "" ;
      edtavHisprodti_Columnheaderclass = "" ;
      edtavBarcolnum_Columnheaderclass = "" ;
      edtavBarcolnom_Columnheaderclass = "" ;
      edtavBarserdsc_Columnheaderclass = "" ;
      edtavBarser_Columnheaderclass = "" ;
      edtavClinom_Columnheaderclass = "" ;
      edtavClicod_Columnheaderclass = "" ;
      edtavTexto1_Columnheaderclass = "" ;
      edtavParcodnom_Columnheaderclass = "" ;
      edtLecParCod_Columnheaderclass = "" ;
      cmbLecEstado.setColumnHeaderClass( "" );
      edtLecHdr_Columnheaderclass = "" ;
      edtavOpenom_Columnheaderclass = "" ;
      edtLecOpeCod_Columnheaderclass = "" ;
      edtLecFec_Columnheaderclass = "" ;
      edtavMaqdsc_Columnheaderclass = "" ;
      edtLecMaqCod_Columnheaderclass = "" ;
      edtavDetailwebcomponent_Columnheaderclass = "" ;
      edtavPedidocliente_Visible = -1 ;
      edtLecParNom_Visible = -1 ;
      edtLecFasDsc_Visible = -1 ;
      edtlecOpeNom_Visible = -1 ;
      edtavHisprof_Visible = -1 ;
      edtavHisprodtf_Visible = -1 ;
      edtavHisprodti_Visible = -1 ;
      edtavBarcolnum_Visible = -1 ;
      edtavBarcolnom_Visible = -1 ;
      edtavBarserdsc_Visible = -1 ;
      edtavBarser_Visible = -1 ;
      edtavClinom_Visible = -1 ;
      edtavClicod_Visible = -1 ;
      edtavTexto1_Visible = -1 ;
      edtavParcodnom_Visible = -1 ;
      edtLecParCod_Visible = -1 ;
      cmbLecEstado.setVisible( -1 );
      edtLecHdr_Visible = -1 ;
      edtavOpenom_Visible = -1 ;
      edtLecOpeCod_Visible = -1 ;
      edtLecFec_Visible = -1 ;
      edtavMaqdsc_Visible = -1 ;
      edtLecMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lecfecauxdate_Jsonclick = "" ;
      edtavLecmaqcod_to_Jsonclick = "" ;
      edtavLecmaqcod_to_Visible = 1 ;
      edtavLecmaqcod_Jsonclick = "" ;
      edtavLecmaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      divPanel_resultados_Visible = 1 ;
      cmbavLecestado.setJsonclick( "" );
      cmbavLecestado.setEnabled( 1 );
      Combo_lecmaqcod_to_Caption = "" ;
      Combo_lecmaqcod_Caption = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "ConsultaMaquinasProduccionWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||P:Proceso,F:Finalizadas|||||" ;
      Ddo_grid_Datalisttype = "Dynamic|||Dynamic|FixedValues||Dynamic|Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "T|||T|T||T|T|T|" ;
      Ddo_grid_Filterisrange = "||T|||T||||" ;
      Ddo_grid_Filtertype = "Character|Date|Numeric|Character|Character|Numeric|Character|Character|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T||||" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4||5||||" ;
      Ddo_grid_Columnids = "1:LecMaqCod|3:LecFec|4:LecOpeCod|6:LecHdr|7:LecEstado|8:LecParCod|27:lecOpeNom|28:LecFasDsc|29:LecParNom|30:PedidoCliente" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_panel_resultados_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultados_Iconposition = "Right" ;
      Dvpanel_panel_resultados_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultados_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultados_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultados_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultados", "") ;
      Dvpanel_panel_resultados_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultados_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultados_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultados_Width = "100%" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "No existen registros" ;
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
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Filtros", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Dvpanel_panel_generales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_generales_Iconposition = "Right" ;
      Dvpanel_panel_generales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_generales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_generales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_generales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_generales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_generales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_generales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_generales_Width = "100%" ;
      Combo_lecmaqcod_to_Emptyitemtext = "Todas" ;
      Combo_lecmaqcod_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lecmaqcod_Emptyitemtext = "Todas" ;
      Combo_lecmaqcod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consulta Maquinas Produccion", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavLecestado.setName( "vLECESTADO" );
      cmbavLecestado.setWebtags( "" );
      cmbavLecestado.addItem("", httpContext.getMessage( "WWP_AllInCombo", ""), (short)(0));
      cmbavLecestado.addItem("P", httpContext.getMessage( "Proceso", ""), (short)(0));
      cmbavLecestado.addItem("F", httpContext.getMessage( "Finalizadas", ""), (short)(0));
      if ( cmbavLecestado.getItemCount() > 0 )
      {
         AV99LecEstado = cmbavLecestado.getValidValue(AV99LecEstado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99LecEstado", AV99LecEstado);
      }
      GXCCtl = "LECESTADO_" + sGXsfl_88_idx ;
      cmbLecEstado.setName( GXCCtl );
      cmbLecEstado.setWebtags( "" );
      cmbLecEstado.addItem("P", httpContext.getMessage( "Proceso", ""), (short)(0));
      cmbLecEstado.addItem("F", httpContext.getMessage( "Finalizadas", ""), (short)(0));
      if ( cmbLecEstado.getItemCount() > 0 )
      {
         A13722LecEstado = cmbLecEstado.getValidValue(A13722LecEstado) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV44MaqDsc',fld:'vMAQDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV89vEstParo',fld:'vVESTPARO',pic:'',hsh:true},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV110LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavLecestado'},{av:'AV99LecEstado',fld:'vLECESTADO',pic:''},{av:'AV151Pgmname',fld:'vPGMNAME',pic:''},{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV21InicioParo',fld:'vINICIOPARO',pic:'99/99/99 99:99:99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLecMaqCod_Visible',ctrl:'LECMAQCOD',prop:'Visible'},{av:'edtavMaqdsc_Visible',ctrl:'vMAQDSC',prop:'Visible'},{av:'edtLecFec_Visible',ctrl:'LECFEC',prop:'Visible'},{av:'edtLecOpeCod_Visible',ctrl:'LECOPECOD',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtLecHdr_Visible',ctrl:'LECHDR',prop:'Visible'},{av:'cmbLecEstado'},{av:'edtLecParCod_Visible',ctrl:'LECPARCOD',prop:'Visible'},{av:'edtavParcodnom_Visible',ctrl:'vPARCODNOM',prop:'Visible'},{av:'edtavTexto1_Visible',ctrl:'vTEXTO1',prop:'Visible'},{av:'edtavClicod_Visible',ctrl:'vCLICOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarser_Visible',ctrl:'vBARSER',prop:'Visible'},{av:'edtavBarserdsc_Visible',ctrl:'vBARSERDSC',prop:'Visible'},{av:'edtavBarcolnom_Visible',ctrl:'vBARCOLNOM',prop:'Visible'},{av:'edtavBarcolnum_Visible',ctrl:'vBARCOLNUM',prop:'Visible'},{av:'edtavHisprodti_Visible',ctrl:'vHISPRODTI',prop:'Visible'},{av:'edtavHisprodtf_Visible',ctrl:'vHISPRODTF',prop:'Visible'},{av:'edtavHisprof_Visible',ctrl:'vHISPROF',prop:'Visible'},{av:'edtlecOpeNom_Visible',ctrl:'LECOPENOM',prop:'Visible'},{av:'edtLecFasDsc_Visible',ctrl:'LECFASDSC',prop:'Visible'},{av:'edtLecParNom_Visible',ctrl:'LECPARNOM',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtLecMaqCod_Columnheaderclass',ctrl:'LECMAQCOD',prop:'Columnheaderclass'},{av:'edtavMaqdsc_Columnheaderclass',ctrl:'vMAQDSC',prop:'Columnheaderclass'},{av:'edtLecFec_Columnheaderclass',ctrl:'LECFEC',prop:'Columnheaderclass'},{av:'edtLecOpeCod_Columnheaderclass',ctrl:'LECOPECOD',prop:'Columnheaderclass'},{av:'edtavOpenom_Columnheaderclass',ctrl:'vOPENOM',prop:'Columnheaderclass'},{av:'edtLecHdr_Columnheaderclass',ctrl:'LECHDR',prop:'Columnheaderclass'},{av:'edtLecParCod_Columnheaderclass',ctrl:'LECPARCOD',prop:'Columnheaderclass'},{av:'edtavParcodnom_Columnheaderclass',ctrl:'vPARCODNOM',prop:'Columnheaderclass'},{av:'edtavTexto1_Columnheaderclass',ctrl:'vTEXTO1',prop:'Columnheaderclass'},{av:'edtavClicod_Columnheaderclass',ctrl:'vCLICOD',prop:'Columnheaderclass'},{av:'edtavClinom_Columnheaderclass',ctrl:'vCLINOM',prop:'Columnheaderclass'},{av:'edtavBarser_Columnheaderclass',ctrl:'vBARSER',prop:'Columnheaderclass'},{av:'edtavBarserdsc_Columnheaderclass',ctrl:'vBARSERDSC',prop:'Columnheaderclass'},{av:'edtavBarcolnom_Columnheaderclass',ctrl:'vBARCOLNOM',prop:'Columnheaderclass'},{av:'edtavBarcolnum_Columnheaderclass',ctrl:'vBARCOLNUM',prop:'Columnheaderclass'},{av:'edtavHisprodti_Columnheaderclass',ctrl:'vHISPRODTI',prop:'Columnheaderclass'},{av:'edtavHisprodtf_Columnheaderclass',ctrl:'vHISPRODTF',prop:'Columnheaderclass'},{av:'edtavHisprof_Columnheaderclass',ctrl:'vHISPROF',prop:'Columnheaderclass'},{av:'edtlecOpeNom_Columnheaderclass',ctrl:'LECOPENOM',prop:'Columnheaderclass'},{av:'edtLecFasDsc_Columnheaderclass',ctrl:'LECFASDSC',prop:'Columnheaderclass'},{av:'edtLecParNom_Columnheaderclass',ctrl:'LECPARNOM',prop:'Columnheaderclass'},{av:'edtavPedidocliente_Columnheaderclass',ctrl:'vPEDIDOCLIENTE',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOSEARCH'","{handler:'e17IY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavLecestado'},{av:'AV99LecEstado',fld:'vLECESTADO',pic:''},{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV110LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV151Pgmname',fld:'vPGMNAME',pic:''},{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV44MaqDsc',fld:'vMAQDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV89vEstParo',fld:'vVESTPARO',pic:'',hsh:true},{av:'AV21InicioParo',fld:'vINICIOPARO',pic:'99/99/99 99:99:99',hsh:true}]");
      setEventMetadata("'DOSEARCH'",",oparms:[{av:'divPanel_resultados_Visible',ctrl:'PANEL_RESULTADOS',prop:'Visible'},{av:'AV110LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLecMaqCod_Visible',ctrl:'LECMAQCOD',prop:'Visible'},{av:'edtavMaqdsc_Visible',ctrl:'vMAQDSC',prop:'Visible'},{av:'edtLecFec_Visible',ctrl:'LECFEC',prop:'Visible'},{av:'edtLecOpeCod_Visible',ctrl:'LECOPECOD',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtLecHdr_Visible',ctrl:'LECHDR',prop:'Visible'},{av:'cmbLecEstado'},{av:'edtLecParCod_Visible',ctrl:'LECPARCOD',prop:'Visible'},{av:'edtavParcodnom_Visible',ctrl:'vPARCODNOM',prop:'Visible'},{av:'edtavTexto1_Visible',ctrl:'vTEXTO1',prop:'Visible'},{av:'edtavClicod_Visible',ctrl:'vCLICOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarser_Visible',ctrl:'vBARSER',prop:'Visible'},{av:'edtavBarserdsc_Visible',ctrl:'vBARSERDSC',prop:'Visible'},{av:'edtavBarcolnom_Visible',ctrl:'vBARCOLNOM',prop:'Visible'},{av:'edtavBarcolnum_Visible',ctrl:'vBARCOLNUM',prop:'Visible'},{av:'edtavHisprodti_Visible',ctrl:'vHISPRODTI',prop:'Visible'},{av:'edtavHisprodtf_Visible',ctrl:'vHISPRODTF',prop:'Visible'},{av:'edtavHisprof_Visible',ctrl:'vHISPROF',prop:'Visible'},{av:'edtlecOpeNom_Visible',ctrl:'LECOPENOM',prop:'Visible'},{av:'edtLecFasDsc_Visible',ctrl:'LECFASDSC',prop:'Visible'},{av:'edtLecParNom_Visible',ctrl:'LECPARNOM',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtLecMaqCod_Columnheaderclass',ctrl:'LECMAQCOD',prop:'Columnheaderclass'},{av:'edtavMaqdsc_Columnheaderclass',ctrl:'vMAQDSC',prop:'Columnheaderclass'},{av:'edtLecFec_Columnheaderclass',ctrl:'LECFEC',prop:'Columnheaderclass'},{av:'edtLecOpeCod_Columnheaderclass',ctrl:'LECOPECOD',prop:'Columnheaderclass'},{av:'edtavOpenom_Columnheaderclass',ctrl:'vOPENOM',prop:'Columnheaderclass'},{av:'edtLecHdr_Columnheaderclass',ctrl:'LECHDR',prop:'Columnheaderclass'},{av:'edtLecParCod_Columnheaderclass',ctrl:'LECPARCOD',prop:'Columnheaderclass'},{av:'edtavParcodnom_Columnheaderclass',ctrl:'vPARCODNOM',prop:'Columnheaderclass'},{av:'edtavTexto1_Columnheaderclass',ctrl:'vTEXTO1',prop:'Columnheaderclass'},{av:'edtavClicod_Columnheaderclass',ctrl:'vCLICOD',prop:'Columnheaderclass'},{av:'edtavClinom_Columnheaderclass',ctrl:'vCLINOM',prop:'Columnheaderclass'},{av:'edtavBarser_Columnheaderclass',ctrl:'vBARSER',prop:'Columnheaderclass'},{av:'edtavBarserdsc_Columnheaderclass',ctrl:'vBARSERDSC',prop:'Columnheaderclass'},{av:'edtavBarcolnom_Columnheaderclass',ctrl:'vBARCOLNOM',prop:'Columnheaderclass'},{av:'edtavBarcolnum_Columnheaderclass',ctrl:'vBARCOLNUM',prop:'Columnheaderclass'},{av:'edtavHisprodti_Columnheaderclass',ctrl:'vHISPRODTI',prop:'Columnheaderclass'},{av:'edtavHisprodtf_Columnheaderclass',ctrl:'vHISPRODTF',prop:'Columnheaderclass'},{av:'edtavHisprof_Columnheaderclass',ctrl:'vHISPROF',prop:'Columnheaderclass'},{av:'edtlecOpeNom_Columnheaderclass',ctrl:'LECOPENOM',prop:'Columnheaderclass'},{av:'edtLecFasDsc_Columnheaderclass',ctrl:'LECFASDSC',prop:'Columnheaderclass'},{av:'edtLecParNom_Columnheaderclass',ctrl:'LECPARNOM',prop:'Columnheaderclass'},{av:'edtavPedidocliente_Columnheaderclass',ctrl:'vPEDIDOCLIENTE',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e13IY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavLecestado'},{av:'AV99LecEstado',fld:'vLECESTADO',pic:''},{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV110LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV151Pgmname',fld:'vPGMNAME',pic:''},{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV44MaqDsc',fld:'vMAQDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV89vEstParo',fld:'vVESTPARO',pic:'',hsh:true},{av:'AV21InicioParo',fld:'vINICIOPARO',pic:'99/99/99 99:99:99',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e14IY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavLecestado'},{av:'AV99LecEstado',fld:'vLECESTADO',pic:''},{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV110LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV151Pgmname',fld:'vPGMNAME',pic:''},{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV44MaqDsc',fld:'vMAQDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV89vEstParo',fld:'vVESTPARO',pic:'',hsh:true},{av:'AV21InicioParo',fld:'vINICIOPARO',pic:'99/99/99 99:99:99',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15IY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavLecestado'},{av:'AV99LecEstado',fld:'vLECESTADO',pic:''},{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV110LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV151Pgmname',fld:'vPGMNAME',pic:''},{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV44MaqDsc',fld:'vMAQDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV89vEstParo',fld:'vVESTPARO',pic:'',hsh:true},{av:'AV21InicioParo',fld:'vINICIOPARO',pic:'99/99/99 99:99:99',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e23IY2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:''},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9',hsh:true},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:'',hsh:true},{av:'A1170LecOpeCod',fld:'LECOPECOD',pic:'ZZZZZ9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A1172LecParCod',fld:'LECPARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A1188LecFasOrd',fld:'LECFASORD',pic:'ZZZ9'},{av:'A1171LecFasCod',fld:'LECFASCOD',pic:''},{av:'A13721LecHdr',fld:'LECHDR',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV89vEstParo',fld:'vVESTPARO',pic:'',hsh:true},{av:'AV21InicioParo',fld:'vINICIOPARO',pic:'99/99/99 99:99:99',hsh:true},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV104DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV44MaqDsc',fld:'vMAQDSC',pic:''},{av:'edtavMaqdsc_Tooltiptext',ctrl:'vMAQDSC',prop:'Tooltiptext'},{av:'AV45OpeNom',fld:'vOPENOM',pic:''},{av:'AV50ParCodNom',fld:'vPARCODNOM',pic:''},{av:'AV53Texto1',fld:'vTEXTO1',pic:''},{av:'AV14Fin',fld:'vFIN',pic:''},{av:'AV21InicioParo',fld:'vINICIOPARO',pic:'99/99/99 99:99:99',hsh:true},{av:'AV89vEstParo',fld:'vVESTPARO',pic:'',hsh:true},{av:'A1172LecParCod',fld:'LECPARCOD',pic:'ZZZ9'},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:''},{av:'A1188LecFasOrd',fld:'LECFASORD',pic:'ZZZ9'},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:'',hsh:true},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9',hsh:true},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV124HisProF',fld:'vHISPROF',pic:'@!'},{av:'AV123HisProdtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV122HisProdti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV121BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV120BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV119BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV118BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV117CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV116CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV148PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'edtavDetailwebcomponent_Columnclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnclass'},{av:'edtLecMaqCod_Columnclass',ctrl:'LECMAQCOD',prop:'Columnclass'},{av:'edtavMaqdsc_Columnclass',ctrl:'vMAQDSC',prop:'Columnclass'},{av:'edtLecFec_Columnclass',ctrl:'LECFEC',prop:'Columnclass'},{av:'edtLecOpeCod_Columnclass',ctrl:'LECOPECOD',prop:'Columnclass'},{av:'edtavOpenom_Columnclass',ctrl:'vOPENOM',prop:'Columnclass'},{av:'edtLecHdr_Columnclass',ctrl:'LECHDR',prop:'Columnclass'},{av:'cmbLecEstado'},{av:'edtLecParCod_Columnclass',ctrl:'LECPARCOD',prop:'Columnclass'},{av:'edtavParcodnom_Columnclass',ctrl:'vPARCODNOM',prop:'Columnclass'},{av:'edtavTexto1_Columnclass',ctrl:'vTEXTO1',prop:'Columnclass'},{av:'edtavClicod_Columnclass',ctrl:'vCLICOD',prop:'Columnclass'},{av:'edtavClinom_Columnclass',ctrl:'vCLINOM',prop:'Columnclass'},{av:'edtavBarser_Columnclass',ctrl:'vBARSER',prop:'Columnclass'},{av:'edtavBarserdsc_Columnclass',ctrl:'vBARSERDSC',prop:'Columnclass'},{av:'edtavBarcolnom_Columnclass',ctrl:'vBARCOLNOM',prop:'Columnclass'},{av:'edtavBarcolnum_Columnclass',ctrl:'vBARCOLNUM',prop:'Columnclass'},{av:'edtavHisprodti_Columnclass',ctrl:'vHISPRODTI',prop:'Columnclass'},{av:'edtavHisprodtf_Columnclass',ctrl:'vHISPRODTF',prop:'Columnclass'},{av:'edtavHisprof_Columnclass',ctrl:'vHISPROF',prop:'Columnclass'},{av:'edtlecOpeNom_Columnclass',ctrl:'LECOPENOM',prop:'Columnclass'},{av:'edtLecFasDsc_Columnclass',ctrl:'LECFASDSC',prop:'Columnclass'},{av:'edtLecParNom_Columnclass',ctrl:'LECPARNOM',prop:'Columnclass'},{av:'edtavPedidocliente_Columnclass',ctrl:'vPEDIDOCLIENTE',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16IY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavLecestado'},{av:'AV99LecEstado',fld:'vLECESTADO',pic:''},{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV110LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV151Pgmname',fld:'vPGMNAME',pic:''},{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV44MaqDsc',fld:'vMAQDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV89vEstParo',fld:'vVESTPARO',pic:'',hsh:true},{av:'AV21InicioParo',fld:'vINICIOPARO',pic:'99/99/99 99:99:99',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLecMaqCod_Visible',ctrl:'LECMAQCOD',prop:'Visible'},{av:'edtavMaqdsc_Visible',ctrl:'vMAQDSC',prop:'Visible'},{av:'edtLecFec_Visible',ctrl:'LECFEC',prop:'Visible'},{av:'edtLecOpeCod_Visible',ctrl:'LECOPECOD',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtLecHdr_Visible',ctrl:'LECHDR',prop:'Visible'},{av:'cmbLecEstado'},{av:'edtLecParCod_Visible',ctrl:'LECPARCOD',prop:'Visible'},{av:'edtavParcodnom_Visible',ctrl:'vPARCODNOM',prop:'Visible'},{av:'edtavTexto1_Visible',ctrl:'vTEXTO1',prop:'Visible'},{av:'edtavClicod_Visible',ctrl:'vCLICOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarser_Visible',ctrl:'vBARSER',prop:'Visible'},{av:'edtavBarserdsc_Visible',ctrl:'vBARSERDSC',prop:'Visible'},{av:'edtavBarcolnom_Visible',ctrl:'vBARCOLNOM',prop:'Visible'},{av:'edtavBarcolnum_Visible',ctrl:'vBARCOLNUM',prop:'Visible'},{av:'edtavHisprodti_Visible',ctrl:'vHISPRODTI',prop:'Visible'},{av:'edtavHisprodtf_Visible',ctrl:'vHISPRODTF',prop:'Visible'},{av:'edtavHisprof_Visible',ctrl:'vHISPROF',prop:'Visible'},{av:'edtlecOpeNom_Visible',ctrl:'LECOPENOM',prop:'Visible'},{av:'edtLecFasDsc_Visible',ctrl:'LECFASDSC',prop:'Visible'},{av:'edtLecParNom_Visible',ctrl:'LECPARNOM',prop:'Visible'},{av:'edtavPedidocliente_Visible',ctrl:'vPEDIDOCLIENTE',prop:'Visible'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtLecMaqCod_Columnheaderclass',ctrl:'LECMAQCOD',prop:'Columnheaderclass'},{av:'edtavMaqdsc_Columnheaderclass',ctrl:'vMAQDSC',prop:'Columnheaderclass'},{av:'edtLecFec_Columnheaderclass',ctrl:'LECFEC',prop:'Columnheaderclass'},{av:'edtLecOpeCod_Columnheaderclass',ctrl:'LECOPECOD',prop:'Columnheaderclass'},{av:'edtavOpenom_Columnheaderclass',ctrl:'vOPENOM',prop:'Columnheaderclass'},{av:'edtLecHdr_Columnheaderclass',ctrl:'LECHDR',prop:'Columnheaderclass'},{av:'edtLecParCod_Columnheaderclass',ctrl:'LECPARCOD',prop:'Columnheaderclass'},{av:'edtavParcodnom_Columnheaderclass',ctrl:'vPARCODNOM',prop:'Columnheaderclass'},{av:'edtavTexto1_Columnheaderclass',ctrl:'vTEXTO1',prop:'Columnheaderclass'},{av:'edtavClicod_Columnheaderclass',ctrl:'vCLICOD',prop:'Columnheaderclass'},{av:'edtavClinom_Columnheaderclass',ctrl:'vCLINOM',prop:'Columnheaderclass'},{av:'edtavBarser_Columnheaderclass',ctrl:'vBARSER',prop:'Columnheaderclass'},{av:'edtavBarserdsc_Columnheaderclass',ctrl:'vBARSERDSC',prop:'Columnheaderclass'},{av:'edtavBarcolnom_Columnheaderclass',ctrl:'vBARCOLNOM',prop:'Columnheaderclass'},{av:'edtavBarcolnum_Columnheaderclass',ctrl:'vBARCOLNUM',prop:'Columnheaderclass'},{av:'edtavHisprodti_Columnheaderclass',ctrl:'vHISPRODTI',prop:'Columnheaderclass'},{av:'edtavHisprodtf_Columnheaderclass',ctrl:'vHISPRODTF',prop:'Columnheaderclass'},{av:'edtavHisprof_Columnheaderclass',ctrl:'vHISPROF',prop:'Columnheaderclass'},{av:'edtlecOpeNom_Columnheaderclass',ctrl:'LECOPENOM',prop:'Columnheaderclass'},{av:'edtLecFasDsc_Columnheaderclass',ctrl:'LECFASDSC',prop:'Columnheaderclass'},{av:'edtLecParNom_Columnheaderclass',ctrl:'LECPARNOM',prop:'Columnheaderclass'},{av:'edtavPedidocliente_Columnheaderclass',ctrl:'vPEDIDOCLIENTE',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e18IY2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e19IY2',iparms:[{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''},{av:'cmbavLecestado'},{av:'AV99LecEstado',fld:'vLECESTADO',pic:''},{av:'AV151Pgmname',fld:'vPGMNAME',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'cmbavLecestado'},{av:'AV99LecEstado',fld:'vLECESTADO',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV110LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV151Pgmname',fld:'vPGMNAME',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV44MaqDsc',fld:'vMAQDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV89vEstParo',fld:'vVESTPARO',pic:'',hsh:true},{av:'AV21InicioParo',fld:'vINICIOPARO',pic:'99/99/99 99:99:99',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e20IY2',iparms:[{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''},{av:'cmbavLecestado'},{av:'AV99LecEstado',fld:'vLECESTADO',pic:''},{av:'AV151Pgmname',fld:'vPGMNAME',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV46OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV48OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV146TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV145TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV144TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV143TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV142TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV141TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV79TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV80TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV98TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV70TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV69TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV77TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV78TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV67TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV74TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV73TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'cmbavLecestado'},{av:'AV99LecEstado',fld:'vLECESTADO',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV110LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV151Pgmname',fld:'vPGMNAME',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV44MaqDsc',fld:'vMAQDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV89vEstParo',fld:'vVESTPARO',pic:'',hsh:true},{av:'AV21InicioParo',fld:'vINICIOPARO',pic:'99/99/99 99:99:99',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e24IY2',iparms:[{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9',hsh:true},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:'',hsh:true},{av:'AV116CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV117CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV148PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV118BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV119BarSerDsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV120BarColNom',fld:'vBARCOLNOM',pic:'',hsh:true},{av:'AV121BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("COMBO_LECMAQCOD_TO.ONOPTIONCLICKED","{handler:'e12IY2',iparms:[{av:'Combo_lecmaqcod_to_Selectedvalue_get',ctrl:'COMBO_LECMAQCOD_TO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_LECMAQCOD_TO.ONOPTIONCLICKED",",oparms:[{av:'AV108LecMaqCod_To',fld:'vLECMAQCOD_TO',pic:''}]}");
      setEventMetadata("COMBO_LECMAQCOD.ONOPTIONCLICKED","{handler:'e11IY2',iparms:[{av:'Combo_lecmaqcod_Selectedvalue_get',ctrl:'COMBO_LECMAQCOD',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_LECMAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV33LecMaqCod',fld:'vLECMAQCOD',pic:''}]}");
      setEventMetadata("VALID_LECOPECOD","{handler:'valid_Lecopecod',iparms:[]");
      setEventMetadata("VALID_LECOPECOD",",oparms:[]}");
      setEventMetadata("VALID_LECESTADO","{handler:'valid_Lecestado',iparms:[]");
      setEventMetadata("VALID_LECESTADO",",oparms:[]}");
      setEventMetadata("VALID_LECPARCOD","{handler:'valid_Lecparcod',iparms:[]");
      setEventMetadata("VALID_LECPARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_LECBARCOD","{handler:'valid_Lecbarcod',iparms:[]");
      setEventMetadata("VALID_LECBARCOD",",oparms:[]}");
      setEventMetadata("VALID_LECBARREO","{handler:'valid_Lecbarreo',iparms:[]");
      setEventMetadata("VALID_LECBARREO",",oparms:[]}");
      setEventMetadata("VALID_LECBARPAR","{handler:'valid_Lecbarpar',iparms:[]");
      setEventMetadata("VALID_LECBARPAR",",oparms:[]}");
      setEventMetadata("VALID_LECFASORD","{handler:'valid_Lecfasord',iparms:[]");
      setEventMetadata("VALID_LECFASORD",",oparms:[]}");
      setEventMetadata("VALIDV_HISPROF","{handler:'validv_Hisprof',iparms:[]");
      setEventMetadata("VALIDV_HISPROF",",oparms:[]}");
      setEventMetadata("VALID_LECOPENOM","{handler:'valid_Lecopenom',iparms:[]");
      setEventMetadata("VALID_LECOPENOM",",oparms:[]}");
      setEventMetadata("VALID_LECFASDSC","{handler:'valid_Lecfasdsc',iparms:[]");
      setEventMetadata("VALID_LECFASDSC",",oparms:[]}");
      setEventMetadata("VALID_LECPARNOM","{handler:'valid_Lecparnom',iparms:[]");
      setEventMetadata("VALID_LECPARNOM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Pedidocliente',iparms:[]");
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
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Combo_lecmaqcod_to_Selectedvalue_get = "" ;
      Combo_lecmaqcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV93EmprCod = "" ;
      AV44MaqDsc = "" ;
      AV99LecEstado = "" ;
      AV33LecMaqCod = "" ;
      AV108LecMaqCod_To = "" ;
      AV5ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV151Pgmname = "" ;
      AV73TFLecMaqCod = "" ;
      AV74TFLecMaqCod_Sel = "" ;
      AV67TFLecFec = GXutil.nullDate() ;
      AV69TFLecHdr = "" ;
      AV70TFLecHdr_Sel = "" ;
      AV98TFLecEstado_Sel = "" ;
      AV141TFlecOpeNom = "" ;
      AV142TFlecOpeNom_Sel = "" ;
      AV143TFLecFasDsc = "" ;
      AV144TFLecFasDsc_Sel = "" ;
      AV145TFLecParNom = "" ;
      AV146TFLecParNom_Sel = "" ;
      A867ParCodNom = "" ;
      A130BarCodPar = "" ;
      A460FasDsc = "" ;
      AV89vEstParo = "" ;
      AV21InicioParo = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV10DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV107LecMaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV109LecMaqCod_To_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A396EmprCod = "" ;
      A1171LecFasCod = "" ;
      Combo_lecmaqcod_Selectedvalue_set = "" ;
      Combo_lecmaqcod_to_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_generales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_lecmaqcod_Jsonclick = "" ;
      ucCombo_lecmaqcod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_lecmaqcod_to_Jsonclick = "" ;
      ucCombo_lecmaqcod_to = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnsearch_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultados = new com.genexus.webpanels.GXUserControl();
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV8DDO_LecFecAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV104DetailWebComponent = "" ;
      A1166LecMaqCod = "" ;
      A1174LecFec = GXutil.nullDate() ;
      AV45OpeNom = "" ;
      A13721LecHdr = "" ;
      A13722LecEstado = "" ;
      AV50ParCodNom = "" ;
      AV53Texto1 = "" ;
      A1169LecBarPar = "" ;
      AV14Fin = "" ;
      AV117CliNom = "" ;
      AV118BarSer = "" ;
      AV119BarSerDsc = "" ;
      AV120BarColNom = "" ;
      AV122HisProdti = GXutil.resetTime( GXutil.nullDate() );
      AV123HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      AV124HisProF = "" ;
      A14259lecOpeNom = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      AV148PedidoCliente = "" ;
      scmdbuf = "" ;
      lV73TFLecMaqCod = "" ;
      lV69TFLecHdr = "" ;
      H00IY2_A13721LecHdr = new String[] {""} ;
      H00IY2_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00IY2_n1174LecFec = new boolean[] {false} ;
      H00IY2_A1166LecMaqCod = new String[] {""} ;
      H00IY2_A1188LecFasOrd = new short[1] ;
      H00IY2_n1188LecFasOrd = new boolean[] {false} ;
      H00IY2_A1169LecBarPar = new String[] {""} ;
      H00IY2_n1169LecBarPar = new boolean[] {false} ;
      H00IY2_A1168LecBarReo = new byte[1] ;
      H00IY2_n1168LecBarReo = new boolean[] {false} ;
      H00IY2_A1167LecBarCod = new int[1] ;
      H00IY2_n1167LecBarCod = new boolean[] {false} ;
      H00IY2_A1170LecOpeCod = new int[1] ;
      H00IY2_n1170LecOpeCod = new boolean[] {false} ;
      H00IY2_A1171LecFasCod = new String[] {""} ;
      H00IY2_n1171LecFasCod = new boolean[] {false} ;
      H00IY2_A1172LecParCod = new short[1] ;
      H00IY2_n1172LecParCod = new boolean[] {false} ;
      H00IY2_A396EmprCod = new String[] {""} ;
      H00IY3_A13721LecHdr = new String[] {""} ;
      H00IY3_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00IY3_n1174LecFec = new boolean[] {false} ;
      H00IY3_A1166LecMaqCod = new String[] {""} ;
      H00IY3_A1188LecFasOrd = new short[1] ;
      H00IY3_n1188LecFasOrd = new boolean[] {false} ;
      H00IY3_A1169LecBarPar = new String[] {""} ;
      H00IY3_n1169LecBarPar = new boolean[] {false} ;
      H00IY3_A1168LecBarReo = new byte[1] ;
      H00IY3_n1168LecBarReo = new boolean[] {false} ;
      H00IY3_A1167LecBarCod = new int[1] ;
      H00IY3_n1167LecBarCod = new boolean[] {false} ;
      H00IY3_A1170LecOpeCod = new int[1] ;
      H00IY3_n1170LecOpeCod = new boolean[] {false} ;
      H00IY3_A1171LecFasCod = new String[] {""} ;
      H00IY3_n1171LecFasCod = new boolean[] {false} ;
      H00IY3_A1172LecParCod = new short[1] ;
      H00IY3_n1172LecParCod = new boolean[] {false} ;
      H00IY3_A396EmprCod = new String[] {""} ;
      hsh = "" ;
      AV92Station = "" ;
      AV94EmprNom = "" ;
      AV95UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV90WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV51Session = httpContext.getWebSession();
      AV7ColumnsSelectorXML = "" ;
      AV115WebSession = httpContext.getWebSession();
      AV114ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      H00IY4_A396EmprCod = new String[] {""} ;
      H00IY4_A656ParCod = new short[1] ;
      H00IY4_A867ParCodNom = new String[] {""} ;
      H00IY4_n867ParCodNom = new boolean[] {false} ;
      H00IY5_A758ProCod = new String[] {""} ;
      H00IY5_A457FasCod = new String[] {""} ;
      H00IY5_A396EmprCod = new String[] {""} ;
      H00IY5_A129BarCod = new int[1] ;
      H00IY5_A132BarCodReo = new byte[1] ;
      H00IY5_A130BarCodPar = new String[] {""} ;
      H00IY5_A194BarOrdLin = new short[1] ;
      H00IY5_A153BarFasEst = new byte[1] ;
      H00IY5_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      AV105FasDsc = "" ;
      GXv_int9 = new byte[1] ;
      GXv_int13 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_int16 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_dtime17 = new java.util.Date[1] ;
      GXv_dtime15 = new java.util.Date[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV13ExcelFilename = "" ;
      AV11ErrorMessage = "" ;
      AV87UserCustomValue = "" ;
      AV6ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector18 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector19 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV18GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char23 = "" ;
      GXt_char22 = "" ;
      GXt_char21 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState25 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV85TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV20HTTPRequest = httpContext.getHttpRequest();
      H00IY6_A396EmprCod = new String[] {""} ;
      H00IY6_A1166LecMaqCod = new String[] {""} ;
      AV126MaqEst = "" ;
      AV106Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_char12 = new String[1] ;
      GXv_char11 = new String[1] ;
      H00IY7_A396EmprCod = new String[] {""} ;
      H00IY7_A1166LecMaqCod = new String[] {""} ;
      GXt_char24 = "" ;
      GXv_char14 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultamaquinasproduccionww__default(),
         new Object[] {
             new Object[] {
            H00IY2_A13721LecHdr, H00IY2_A1174LecFec, H00IY2_n1174LecFec, H00IY2_A1166LecMaqCod, H00IY2_A1188LecFasOrd, H00IY2_n1188LecFasOrd, H00IY2_A1169LecBarPar, H00IY2_n1169LecBarPar, H00IY2_A1168LecBarReo, H00IY2_n1168LecBarReo,
            H00IY2_A1167LecBarCod, H00IY2_n1167LecBarCod, H00IY2_A1170LecOpeCod, H00IY2_n1170LecOpeCod, H00IY2_A1171LecFasCod, H00IY2_n1171LecFasCod, H00IY2_A1172LecParCod, H00IY2_n1172LecParCod, H00IY2_A396EmprCod
            }
            , new Object[] {
            H00IY3_A13721LecHdr, H00IY3_A1174LecFec, H00IY3_n1174LecFec, H00IY3_A1166LecMaqCod, H00IY3_A1188LecFasOrd, H00IY3_n1188LecFasOrd, H00IY3_A1169LecBarPar, H00IY3_n1169LecBarPar, H00IY3_A1168LecBarReo, H00IY3_n1168LecBarReo,
            H00IY3_A1167LecBarCod, H00IY3_n1167LecBarCod, H00IY3_A1170LecOpeCod, H00IY3_n1170LecOpeCod, H00IY3_A1171LecFasCod, H00IY3_n1171LecFasCod, H00IY3_A1172LecParCod, H00IY3_n1172LecParCod, H00IY3_A396EmprCod
            }
            , new Object[] {
            H00IY4_A396EmprCod, H00IY4_A656ParCod, H00IY4_A867ParCodNom, H00IY4_n867ParCodNom
            }
            , new Object[] {
            H00IY5_A758ProCod, H00IY5_A457FasCod, H00IY5_A396EmprCod, H00IY5_A129BarCod, H00IY5_A132BarCodReo, H00IY5_A130BarCodPar, H00IY5_A194BarOrdLin, H00IY5_A153BarFasEst, H00IY5_A460FasDsc
            }
            , new Object[] {
            H00IY6_A396EmprCod, H00IY6_A1166LecMaqCod
            }
            , new Object[] {
            H00IY7_A396EmprCod, H00IY7_A1166LecMaqCod
            }
         }
      );
      AV151Pgmname = "ConsultaMaquinasProduccionWW" ;
      /* GeneXus formulas. */
      AV151Pgmname = "ConsultaMaquinasProduccionWW" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavMaqdsc_Enabled = 0 ;
      edtavOpenom_Enabled = 0 ;
      edtavParcodnom_Enabled = 0 ;
      edtavTexto1_Enabled = 0 ;
      edtavEmprcod_Enabled = 0 ;
      edtavFin_Enabled = 0 ;
      edtavVestparo_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavHisprodti_Enabled = 0 ;
      edtavHisprodtf_Enabled = 0 ;
      edtavHisprof_Enabled = 0 ;
      edtavPedidocliente_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte gxajaxcallmode ;
   private byte A1168LecBarReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV113flag ;
   private byte AV152GXLvl238 ;
   private byte GXv_int9[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV46OrderedBy ;
   private short AV79TFLecParCod ;
   private short AV80TFLecParCod_To ;
   private short A656ParCod ;
   private short A194BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short A1172LecParCod ;
   private short A1188LecFasOrd ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV125i ;
   private short GXv_int13[] ;
   private short GXv_int10[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_88 ;
   private int nGXsfl_88_idx=1 ;
   private int AV77TFLecOpeCod ;
   private int AV78TFLecOpeCod_To ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int divPanel_resultados_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtavLecmaqcod_Visible ;
   private int edtavLecmaqcod_to_Visible ;
   private int A1170LecOpeCod ;
   private int A1167LecBarCod ;
   private int AV116CliCod ;
   private int AV121BarColNum ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavMaqdsc_Enabled ;
   private int edtavOpenom_Enabled ;
   private int edtavParcodnom_Enabled ;
   private int edtavTexto1_Enabled ;
   private int edtavEmprcod_Enabled ;
   private int edtavFin_Enabled ;
   private int edtavVestparo_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavHisprodti_Enabled ;
   private int edtavHisprodtf_Enabled ;
   private int edtavHisprof_Enabled ;
   private int edtavPedidocliente_Enabled ;
   private int edtLecMaqCod_Visible ;
   private int edtavMaqdsc_Visible ;
   private int edtLecFec_Visible ;
   private int edtLecOpeCod_Visible ;
   private int edtavOpenom_Visible ;
   private int edtLecHdr_Visible ;
   private int edtLecParCod_Visible ;
   private int edtavParcodnom_Visible ;
   private int edtavTexto1_Visible ;
   private int edtavClicod_Visible ;
   private int edtavClinom_Visible ;
   private int edtavBarser_Visible ;
   private int edtavBarserdsc_Visible ;
   private int edtavBarcolnom_Visible ;
   private int edtavBarcolnum_Visible ;
   private int edtavHisprodti_Visible ;
   private int edtavHisprodtf_Visible ;
   private int edtavHisprof_Visible ;
   private int edtlecOpeNom_Visible ;
   private int edtLecFasDsc_Visible ;
   private int edtLecParNom_Visible ;
   private int edtavPedidocliente_Visible ;
   private int AV49PageToGo ;
   private int GXv_int16[] ;
   private int GXv_int8[] ;
   private int AV154GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavEmprcod_Visible ;
   private int edtavFin_Visible ;
   private int edtavVestparo_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV16GridCurrentPage ;
   private long AV17GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Combo_lecmaqcod_to_Selectedvalue_get ;
   private String Combo_lecmaqcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_88_idx="0001" ;
   private String AV93EmprCod ;
   private String AV44MaqDsc ;
   private String AV99LecEstado ;
   private String AV33LecMaqCod ;
   private String AV108LecMaqCod_To ;
   private String AV151Pgmname ;
   private String AV73TFLecMaqCod ;
   private String AV74TFLecMaqCod_Sel ;
   private String AV69TFLecHdr ;
   private String AV70TFLecHdr_Sel ;
   private String AV98TFLecEstado_Sel ;
   private String AV141TFlecOpeNom ;
   private String AV142TFlecOpeNom_Sel ;
   private String AV143TFLecFasDsc ;
   private String AV144TFLecFasDsc_Sel ;
   private String AV145TFLecParNom ;
   private String AV146TFLecParNom_Sel ;
   private String A867ParCodNom ;
   private String A130BarCodPar ;
   private String A460FasDsc ;
   private String AV89vEstParo ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A1171LecFasCod ;
   private String Combo_lecmaqcod_Cls ;
   private String Combo_lecmaqcod_Selectedvalue_set ;
   private String Combo_lecmaqcod_Emptyitemtext ;
   private String Combo_lecmaqcod_to_Cls ;
   private String Combo_lecmaqcod_to_Selectedvalue_set ;
   private String Combo_lecmaqcod_to_Emptyitemtext ;
   private String Dvpanel_panel_generales_Width ;
   private String Dvpanel_panel_generales_Cls ;
   private String Dvpanel_panel_generales_Title ;
   private String Dvpanel_panel_generales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
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
   private String Dvpanel_panel_resultados_Width ;
   private String Dvpanel_panel_resultados_Cls ;
   private String Dvpanel_panel_resultados_Title ;
   private String Dvpanel_panel_resultados_Iconposition ;
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
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_generales_Internalname ;
   private String divPanel_generales_Internalname ;
   private String divTablerightheader_Internalname ;
   private String divTablefilters_Internalname ;
   private String divTablesplittedlecmaqcod_Internalname ;
   private String lblTextblockcombo_lecmaqcod_Internalname ;
   private String lblTextblockcombo_lecmaqcod_Jsonclick ;
   private String Combo_lecmaqcod_Caption ;
   private String Combo_lecmaqcod_Internalname ;
   private String divTablesplittedlecmaqcod_to_Internalname ;
   private String lblTextblockcombo_lecmaqcod_to_Internalname ;
   private String lblTextblockcombo_lecmaqcod_to_Jsonclick ;
   private String Combo_lecmaqcod_to_Caption ;
   private String Combo_lecmaqcod_to_Internalname ;
   private String TempTags ;
   private String divTable_acciones_Internalname ;
   private String bttBtnsearch_Internalname ;
   private String bttBtnsearch_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Datamon_Internalname ;
   private String Dvpanel_panel_resultados_Internalname ;
   private String divPanel_resultados_Internalname ;
   private String divTablebarraprogreso_Internalname ;
   private String Progressbar_Internalname ;
   private String divTableactions_Internalname ;
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
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavLecmaqcod_Internalname ;
   private String edtavLecmaqcod_Jsonclick ;
   private String edtavLecmaqcod_to_Internalname ;
   private String edtavLecmaqcod_to_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_lecfecauxdates_Internalname ;
   private String edtavDdo_lecfecauxdate_Internalname ;
   private String edtavDdo_lecfecauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV104DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A1166LecMaqCod ;
   private String edtLecMaqCod_Internalname ;
   private String edtavMaqdsc_Internalname ;
   private String edtLecFec_Internalname ;
   private String edtLecOpeCod_Internalname ;
   private String AV45OpeNom ;
   private String edtavOpenom_Internalname ;
   private String A13721LecHdr ;
   private String edtLecHdr_Internalname ;
   private String A13722LecEstado ;
   private String edtLecParCod_Internalname ;
   private String AV50ParCodNom ;
   private String edtavParcodnom_Internalname ;
   private String edtavTexto1_Internalname ;
   private String edtavEmprcod_Internalname ;
   private String edtLecBarCod_Internalname ;
   private String edtLecBarReo_Internalname ;
   private String A1169LecBarPar ;
   private String edtLecBarPar_Internalname ;
   private String edtLecFasOrd_Internalname ;
   private String AV14Fin ;
   private String edtavFin_Internalname ;
   private String edtavVestparo_Internalname ;
   private String edtavClicod_Internalname ;
   private String AV117CliNom ;
   private String edtavClinom_Internalname ;
   private String AV118BarSer ;
   private String edtavBarser_Internalname ;
   private String AV119BarSerDsc ;
   private String edtavBarserdsc_Internalname ;
   private String AV120BarColNom ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnum_Internalname ;
   private String edtavHisprodti_Internalname ;
   private String edtavHisprodtf_Internalname ;
   private String AV124HisProF ;
   private String edtavHisprof_Internalname ;
   private String A14259lecOpeNom ;
   private String edtlecOpeNom_Internalname ;
   private String A14260LecFasDsc ;
   private String edtLecFasDsc_Internalname ;
   private String A14261LecParNom ;
   private String edtLecParNom_Internalname ;
   private String AV148PedidoCliente ;
   private String edtavPedidocliente_Internalname ;
   private String scmdbuf ;
   private String lV73TFLecMaqCod ;
   private String lV69TFLecHdr ;
   private String hsh ;
   private String AV92Station ;
   private String AV94EmprNom ;
   private String AV95UsurCod ;
   private String edtavDetailwebcomponent_Columnheaderclass ;
   private String edtLecMaqCod_Columnheaderclass ;
   private String edtavMaqdsc_Columnheaderclass ;
   private String edtLecFec_Columnheaderclass ;
   private String edtLecOpeCod_Columnheaderclass ;
   private String edtavOpenom_Columnheaderclass ;
   private String edtLecHdr_Columnheaderclass ;
   private String edtLecParCod_Columnheaderclass ;
   private String edtavParcodnom_Columnheaderclass ;
   private String edtavTexto1_Columnheaderclass ;
   private String edtavClicod_Columnheaderclass ;
   private String edtavClinom_Columnheaderclass ;
   private String edtavBarser_Columnheaderclass ;
   private String edtavBarserdsc_Columnheaderclass ;
   private String edtavBarcolnom_Columnheaderclass ;
   private String edtavBarcolnum_Columnheaderclass ;
   private String edtavHisprodti_Columnheaderclass ;
   private String edtavHisprodtf_Columnheaderclass ;
   private String edtavHisprof_Columnheaderclass ;
   private String edtlecOpeNom_Columnheaderclass ;
   private String edtLecFasDsc_Columnheaderclass ;
   private String edtLecParNom_Columnheaderclass ;
   private String edtavPedidocliente_Columnheaderclass ;
   private String edtavMaqdsc_Tooltiptext ;
   private String A457FasCod ;
   private String AV105FasDsc ;
   private String edtavDetailwebcomponent_Columnclass ;
   private String edtLecMaqCod_Columnclass ;
   private String edtavMaqdsc_Columnclass ;
   private String edtLecFec_Columnclass ;
   private String edtLecOpeCod_Columnclass ;
   private String edtavOpenom_Columnclass ;
   private String edtLecHdr_Columnclass ;
   private String edtLecParCod_Columnclass ;
   private String edtavParcodnom_Columnclass ;
   private String edtavTexto1_Columnclass ;
   private String edtavClicod_Columnclass ;
   private String edtavClinom_Columnclass ;
   private String edtavBarser_Columnclass ;
   private String edtavBarserdsc_Columnclass ;
   private String edtavBarcolnom_Columnclass ;
   private String edtavBarcolnum_Columnclass ;
   private String edtavHisprodti_Columnclass ;
   private String edtavHisprodtf_Columnclass ;
   private String edtavHisprof_Columnclass ;
   private String edtlecOpeNom_Columnclass ;
   private String edtLecFasDsc_Columnclass ;
   private String edtLecParNom_Columnclass ;
   private String edtavPedidocliente_Columnclass ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char23 ;
   private String GXt_char22 ;
   private String GXt_char21 ;
   private String GXv_char4[] ;
   private String GXt_char20 ;
   private String GXv_char3[] ;
   private String AV126MaqEst ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String GXt_char24 ;
   private String GXv_char14[] ;
   private String sGXsfl_88_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtLecMaqCod_Jsonclick ;
   private String edtavMaqdsc_Jsonclick ;
   private String edtLecFec_Jsonclick ;
   private String edtLecOpeCod_Jsonclick ;
   private String edtavOpenom_Jsonclick ;
   private String edtLecHdr_Jsonclick ;
   private String GXCCtl ;
   private String edtLecParCod_Jsonclick ;
   private String edtavParcodnom_Jsonclick ;
   private String edtavTexto1_Jsonclick ;
   private String edtavEmprcod_Jsonclick ;
   private String edtLecBarCod_Jsonclick ;
   private String edtLecBarReo_Jsonclick ;
   private String edtLecBarPar_Jsonclick ;
   private String edtLecFasOrd_Jsonclick ;
   private String edtavFin_Jsonclick ;
   private String edtavVestparo_Jsonclick ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavHisprodti_Jsonclick ;
   private String edtavHisprodtf_Jsonclick ;
   private String edtavHisprof_Jsonclick ;
   private String edtlecOpeNom_Jsonclick ;
   private String edtLecFasDsc_Jsonclick ;
   private String edtLecParNom_Jsonclick ;
   private String edtavPedidocliente_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV21InicioParo ;
   private java.util.Date AV122HisProdti ;
   private java.util.Date AV123HisProdtf ;
   private java.util.Date GXv_dtime17[] ;
   private java.util.Date GXv_dtime15[] ;
   private java.util.Date AV67TFLecFec ;
   private java.util.Date AV8DDO_LecFecAuxDate ;
   private java.util.Date A1174LecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV110LoadGridData ;
   private boolean AV48OrderedDsc ;
   private boolean n867ParCodNom ;
   private boolean Dvpanel_panel_generales_Autowidth ;
   private boolean Dvpanel_panel_generales_Autoheight ;
   private boolean Dvpanel_panel_generales_Collapsible ;
   private boolean Dvpanel_panel_generales_Collapsed ;
   private boolean Dvpanel_panel_generales_Showcollapseicon ;
   private boolean Dvpanel_panel_generales_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panel_resultados_Autowidth ;
   private boolean Dvpanel_panel_resultados_Autoheight ;
   private boolean Dvpanel_panel_resultados_Collapsible ;
   private boolean Dvpanel_panel_resultados_Collapsed ;
   private boolean Dvpanel_panel_resultados_Showcollapseicon ;
   private boolean Dvpanel_panel_resultados_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_88_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n1174LecFec ;
   private boolean n1170LecOpeCod ;
   private boolean n1172LecParCod ;
   private boolean n1167LecBarCod ;
   private boolean n1168LecBarReo ;
   private boolean n1169LecBarPar ;
   private boolean n1188LecFasOrd ;
   private boolean n1171LecFasCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV7ColumnsSelectorXML ;
   private String AV87UserCustomValue ;
   private String AV53Texto1 ;
   private String AV13ExcelFilename ;
   private String AV11ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV20HTTPRequest ;
   private com.genexus.webpanels.WebSession AV51Session ;
   private com.genexus.webpanels.WebSession AV115WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_generales ;
   private com.genexus.webpanels.GXUserControl ucCombo_lecmaqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_lecmaqcod_to ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultados ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV114ProgressIndicator ;
   private HTMLChoice cmbavLecestado ;
   private HTMLChoice cmbLecEstado ;
   private IDataStoreProvider pr_default ;
   private String[] H00IY2_A13721LecHdr ;
   private java.util.Date[] H00IY2_A1174LecFec ;
   private boolean[] H00IY2_n1174LecFec ;
   private String[] H00IY2_A1166LecMaqCod ;
   private short[] H00IY2_A1188LecFasOrd ;
   private boolean[] H00IY2_n1188LecFasOrd ;
   private String[] H00IY2_A1169LecBarPar ;
   private boolean[] H00IY2_n1169LecBarPar ;
   private byte[] H00IY2_A1168LecBarReo ;
   private boolean[] H00IY2_n1168LecBarReo ;
   private int[] H00IY2_A1167LecBarCod ;
   private boolean[] H00IY2_n1167LecBarCod ;
   private int[] H00IY2_A1170LecOpeCod ;
   private boolean[] H00IY2_n1170LecOpeCod ;
   private String[] H00IY2_A1171LecFasCod ;
   private boolean[] H00IY2_n1171LecFasCod ;
   private short[] H00IY2_A1172LecParCod ;
   private boolean[] H00IY2_n1172LecParCod ;
   private String[] H00IY2_A396EmprCod ;
   private String[] H00IY3_A13721LecHdr ;
   private java.util.Date[] H00IY3_A1174LecFec ;
   private boolean[] H00IY3_n1174LecFec ;
   private String[] H00IY3_A1166LecMaqCod ;
   private short[] H00IY3_A1188LecFasOrd ;
   private boolean[] H00IY3_n1188LecFasOrd ;
   private String[] H00IY3_A1169LecBarPar ;
   private boolean[] H00IY3_n1169LecBarPar ;
   private byte[] H00IY3_A1168LecBarReo ;
   private boolean[] H00IY3_n1168LecBarReo ;
   private int[] H00IY3_A1167LecBarCod ;
   private boolean[] H00IY3_n1167LecBarCod ;
   private int[] H00IY3_A1170LecOpeCod ;
   private boolean[] H00IY3_n1170LecOpeCod ;
   private String[] H00IY3_A1171LecFasCod ;
   private boolean[] H00IY3_n1171LecFasCod ;
   private short[] H00IY3_A1172LecParCod ;
   private boolean[] H00IY3_n1172LecParCod ;
   private String[] H00IY3_A396EmprCod ;
   private String[] H00IY4_A396EmprCod ;
   private short[] H00IY4_A656ParCod ;
   private String[] H00IY4_A867ParCodNom ;
   private boolean[] H00IY4_n867ParCodNom ;
   private String[] H00IY5_A758ProCod ;
   private String[] H00IY5_A457FasCod ;
   private String[] H00IY5_A396EmprCod ;
   private int[] H00IY5_A129BarCod ;
   private byte[] H00IY5_A132BarCodReo ;
   private String[] H00IY5_A130BarCodPar ;
   private short[] H00IY5_A194BarOrdLin ;
   private byte[] H00IY5_A153BarFasEst ;
   private String[] H00IY5_A460FasDsc ;
   private String[] H00IY6_A396EmprCod ;
   private String[] H00IY6_A1166LecMaqCod ;
   private String[] H00IY7_A396EmprCod ;
   private String[] H00IY7_A1166LecMaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV107LecMaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV109LecMaqCod_To_Data ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector18[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector19[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV106Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV10DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV18GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState25[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV19GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV85TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV90WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class consultamaquinasproduccionww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00IY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74TFLecMaqCod_Sel ,
                                          String AV73TFLecMaqCod ,
                                          java.util.Date AV67TFLecFec ,
                                          int AV77TFLecOpeCod ,
                                          int AV78TFLecOpeCod_To ,
                                          String AV70TFLecHdr_Sel ,
                                          String AV69TFLecHdr ,
                                          short AV79TFLecParCod ,
                                          short AV80TFLecParCod_To ,
                                          boolean AV110LoadGridData ,
                                          String AV33LecMaqCod ,
                                          String AV108LecMaqCod_To ,
                                          String A1166LecMaqCod ,
                                          java.util.Date A1174LecFec ,
                                          int A1170LecOpeCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          short A1172LecParCod ,
                                          String A396EmprCod ,
                                          short AV46OrderedBy ,
                                          boolean AV48OrderedDsc ,
                                          String AV99LecEstado ,
                                          String A13722LecEstado ,
                                          String AV98TFLecEstado_Sel ,
                                          String AV142TFlecOpeNom_Sel ,
                                          String AV141TFlecOpeNom ,
                                          String A14259lecOpeNom ,
                                          String AV144TFLecFasDsc_Sel ,
                                          String AV143TFLecFasDsc ,
                                          String A14260LecFasDsc ,
                                          String AV146TFLecParNom_Sel ,
                                          String AV145TFLecParNom ,
                                          String A14261LecParNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[11];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE( LecBarPar, '') AS LecHdr, LecFec," ;
      scmdbuf += " LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV74TFLecMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFLecMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFLecMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFLecFec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (0==AV77TFLecOpeCod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( ! (0==AV78TFLecOpeCod_To) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70TFLecHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV69TFLecHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70TFLecHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (0==AV79TFLecParCod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (0==AV80TFLecParCod_To) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! AV110LoadGridData )
      {
         addWhere(sWhereString, "(EmprCod IS NULL and Not EmprCod IS NULL and LecMaqCod IS NULL)");
      }
      if ( ! (GXutil.strcmp("", AV33LecMaqCod)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod >= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108LecMaqCod_To)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod <= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV46OrderedBy == 1 ) && ! AV48OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV46OrderedBy == 1 ) && ( AV48OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV46OrderedBy == 2 ) && ! AV48OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV46OrderedBy == 2 ) && ( AV48OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV46OrderedBy == 3 ) && ! AV48OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV46OrderedBy == 3 ) && ( AV48OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV46OrderedBy == 4 ) && ! AV48OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHdr" ;
      }
      else if ( ( AV46OrderedBy == 4 ) && ( AV48OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHdr DESC" ;
      }
      else if ( ( AV46OrderedBy == 5 ) && ! AV48OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV46OrderedBy == 5 ) && ( AV48OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H00IY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74TFLecMaqCod_Sel ,
                                          String AV73TFLecMaqCod ,
                                          java.util.Date AV67TFLecFec ,
                                          int AV77TFLecOpeCod ,
                                          int AV78TFLecOpeCod_To ,
                                          String AV70TFLecHdr_Sel ,
                                          String AV69TFLecHdr ,
                                          short AV79TFLecParCod ,
                                          short AV80TFLecParCod_To ,
                                          boolean AV110LoadGridData ,
                                          String AV33LecMaqCod ,
                                          String AV108LecMaqCod_To ,
                                          String A1166LecMaqCod ,
                                          java.util.Date A1174LecFec ,
                                          int A1170LecOpeCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          short A1172LecParCod ,
                                          String A396EmprCod ,
                                          short AV46OrderedBy ,
                                          boolean AV48OrderedDsc ,
                                          String AV99LecEstado ,
                                          String A13722LecEstado ,
                                          String AV98TFLecEstado_Sel ,
                                          String AV142TFlecOpeNom_Sel ,
                                          String AV141TFlecOpeNom ,
                                          String A14259lecOpeNom ,
                                          String AV144TFLecFasDsc_Sel ,
                                          String AV143TFLecFasDsc ,
                                          String A14260LecFasDsc ,
                                          String AV146TFLecParNom_Sel ,
                                          String AV145TFLecParNom ,
                                          String A14261LecParNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[11];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE( LecBarPar, '') AS LecHdr, LecFec," ;
      scmdbuf += " LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV74TFLecMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFLecMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFLecMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int28[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFLecFec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int28[2] = (byte)(1) ;
      }
      if ( ! (0==AV77TFLecOpeCod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      if ( ! (0==AV78TFLecOpeCod_To) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int28[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70TFLecHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV69TFLecHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70TFLecHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      if ( ! (0==AV79TFLecParCod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int28[7] = (byte)(1) ;
      }
      if ( ! (0==AV80TFLecParCod_To) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int28[8] = (byte)(1) ;
      }
      if ( ! AV110LoadGridData )
      {
         addWhere(sWhereString, "(EmprCod IS NULL and Not EmprCod IS NULL and LecMaqCod IS NULL)");
      }
      if ( ! (GXutil.strcmp("", AV33LecMaqCod)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod >= ?)");
      }
      else
      {
         GXv_int28[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108LecMaqCod_To)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod <= ?)");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV46OrderedBy == 1 ) && ! AV48OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV46OrderedBy == 1 ) && ( AV48OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV46OrderedBy == 2 ) && ! AV48OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV46OrderedBy == 2 ) && ( AV48OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV46OrderedBy == 3 ) && ! AV48OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV46OrderedBy == 3 ) && ( AV48OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV46OrderedBy == 4 ) && ! AV48OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHdr" ;
      }
      else if ( ( AV46OrderedBy == 4 ) && ( AV48OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHdr DESC" ;
      }
      else if ( ( AV46OrderedBy == 5 ) && ! AV48OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV46OrderedBy == 5 ) && ( AV48OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
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
                  return conditional_H00IY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Boolean) dynConstraints[9]).booleanValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Boolean) dynConstraints[21]).booleanValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 1 :
                  return conditional_H00IY3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Boolean) dynConstraints[9]).booleanValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Boolean) dynConstraints[21]).booleanValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00IY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IY4", "SELECT EmprCod, ParCod, ParCodNom FROM TXPCODPAR WHERE EmprCod = ? and ParCod = ? ORDER BY EmprCod, ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00IY5", "SELECT T1.ProCod, T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.BarFasEst, T2.FasDsc FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IY6", "SELECT EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IY7", "SELECT EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 11);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 11);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

