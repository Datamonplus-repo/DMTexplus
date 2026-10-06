package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cambiodenumerodeprogramaenensayos_impl extends GXDataArea
{
   public cambiodenumerodeprogramaenensayos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cambiodenumerodeprogramaenensayos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiodenumerodeprogramaenensayos_impl.class ));
   }

   public cambiodenumerodeprogramaenensayos_impl( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSeleccion = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
            AV5EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6MacProCod = httpContext.GetPar( "MacProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6MacProCod", AV6MacProCod);
               AV7MacProDsc = httpContext.GetPar( "MacProDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7MacProDsc", AV7MacProDsc);
               AV8MacProDsc2 = httpContext.GetPar( "MacProDsc2") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8MacProDsc2", AV8MacProDsc2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPRODSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8MacProDsc2, ""))));
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_62 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_62"))) ;
      nGXsfl_62_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_62_idx"))) ;
      sGXsfl_62_idx = httpContext.GetPar( "sGXsfl_62_idx") ;
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
      AV20FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV6MacProCod = httpContext.GetPar( "MacProCod") ;
      AV28ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV23ColumnsSelector);
      AV29TFLb_numero = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero"))) ;
      AV30TFLb_numero_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero_To"))) ;
      AV31TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV32TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV33TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV34TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV35TFLb_ArtCod = httpContext.GetPar( "TFLb_ArtCod") ;
      AV36TFLb_ArtCod_Sel = httpContext.GetPar( "TFLb_ArtCod_Sel") ;
      AV37TFLb_ArtDsc = httpContext.GetPar( "TFLb_ArtDsc") ;
      AV38TFLb_ArtDsc_Sel = httpContext.GetPar( "TFLb_ArtDsc_Sel") ;
      AV39TFLb_TipArt = (short)(GXutil.lval( httpContext.GetPar( "TFLb_TipArt"))) ;
      AV40TFLb_TipArt_To = (short)(GXutil.lval( httpContext.GetPar( "TFLb_TipArt_To"))) ;
      AV41TFLb_TipArtDsc = httpContext.GetPar( "TFLb_TipArtDsc") ;
      AV42TFLb_TipArtDsc_Sel = httpContext.GetPar( "TFLb_TipArtDsc_Sel") ;
      AV43TFLb_ColNom = httpContext.GetPar( "TFLb_ColNom") ;
      AV44TFLb_ColNom_Sel = httpContext.GetPar( "TFLb_ColNom_Sel") ;
      AV45TFLb_ColNum = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum"))) ;
      AV46TFLb_ColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum_To"))) ;
      AV47TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV48TFTipColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod_To"))) ;
      AV49TFTipColDsc = httpContext.GetPar( "TFTipColDsc") ;
      AV50TFTipColDsc_Sel = httpContext.GetPar( "TFTipColDsc_Sel") ;
      AV83Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV18OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV8MacProDsc2 = httpContext.GetPar( "MacProDsc2") ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV6MacProCod, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLb_numero, AV30TFLb_numero_To, AV31TFCliCod, AV32TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV35TFLb_ArtCod, AV36TFLb_ArtCod_Sel, AV37TFLb_ArtDsc, AV38TFLb_ArtDsc_Sel, AV39TFLb_TipArt, AV40TFLb_TipArt_To, AV41TFLb_TipArtDsc, AV42TFLb_TipArtDsc_Sel, AV43TFLb_ColNom, AV44TFLb_ColNom_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV47TFTipColCod, AV48TFTipColCod_To, AV49TFTipColDsc, AV50TFTipColDsc_Sel, AV83Pgmname, AV17OrderedBy, AV18OrderedDsc, AV8MacProDsc2, AV5EmprCod) ;
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
      pa1K12( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1K12( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.cambiodenumerodeprogramaenensayos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6MacProCod)),GXutil.URLEncode(GXutil.rtrim(AV7MacProDsc)),GXutil.URLEncode(GXutil.rtrim(AV8MacProDsc2))}, new String[] {"EmprCod","MacProCod","MacProDsc","MacProDsc2"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPRODSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8MacProDsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV20FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_62", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_62, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV53GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV54GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV51DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV51DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV28ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV29TFLb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_NUMERO_TO", GXutil.ltrim( localUtil.ntoc( AV30TFLb_numero_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV31TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV32TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV33TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV34TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ARTCOD", GXutil.rtrim( AV35TFLb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ARTCOD_SEL", GXutil.rtrim( AV36TFLb_ArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ARTDSC", GXutil.rtrim( AV37TFLb_ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ARTDSC_SEL", GXutil.rtrim( AV38TFLb_ArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_TIPART", GXutil.ltrim( localUtil.ntoc( AV39TFLb_TipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_TIPART_TO", GXutil.ltrim( localUtil.ntoc( AV40TFLb_TipArt_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_TIPARTDSC", GXutil.rtrim( AV41TFLb_TipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_TIPARTDSC_SEL", GXutil.rtrim( AV42TFLb_TipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNOM", GXutil.rtrim( AV43TFLb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNOM_SEL", GXutil.rtrim( AV44TFLb_ColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV45TFLb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV46TFLb_ColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV47TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV48TFTipColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLDSC", GXutil.rtrim( AV49TFTipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLDSC_SEL", GXutil.rtrim( AV50TFTipColDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV83Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV17OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV18OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV15GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV15GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMACPRODSC2", GXutil.rtrim( AV8MacProDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPRODSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8MacProDsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Width", GXutil.rtrim( Dvpanel_panelacciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Autowidth", GXutil.booltostr( Dvpanel_panelacciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Autoheight", GXutil.booltostr( Dvpanel_panelacciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Cls", GXutil.rtrim( Dvpanel_panelacciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Title", GXutil.rtrim( Dvpanel_panelacciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Collapsible", GXutil.booltostr( Dvpanel_panelacciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Collapsed", GXutil.booltostr( Dvpanel_panelacciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_panelacciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Iconposition", GXutil.rtrim( Dvpanel_panelacciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Autoscroll", GXutil.booltostr( Dvpanel_panelacciones_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
         we1K12( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1K12( ) ;
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
      return formatLink("app.formulaciontinte.cambiodenumerodeprogramaenensayos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6MacProCod)),GXutil.URLEncode(GXutil.rtrim(AV7MacProDsc)),GXutil.URLEncode(GXutil.rtrim(AV8MacProDsc2))}, new String[] {"EmprCod","MacProCod","MacProDsc","MacProDsc2"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.CambiodeNumerodeProgramaenEnsayos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ensayos de Laboratorio", "") ;
   }

   public void wb1K10( )
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CambiodeNumerodeProgramaenEnsayos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", "++", bttBtnmarcartodas_Jsonclick, 7, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111k11_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\CambiodeNumerodeProgramaenEnsayos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", "--", bttBtndesmarcartodas_Jsonclick, 7, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121k11_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\CambiodeNumerodeProgramaenEnsayos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1K12( true) ;
      }
      else
      {
         wb_table1_23_1K12( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1K12e( boolean wbgen )
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
         /* User Defined Control */
         ucDvpanel_panelacciones.setProperty("Width", Dvpanel_panelacciones_Width);
         ucDvpanel_panelacciones.setProperty("AutoWidth", Dvpanel_panelacciones_Autowidth);
         ucDvpanel_panelacciones.setProperty("AutoHeight", Dvpanel_panelacciones_Autoheight);
         ucDvpanel_panelacciones.setProperty("Cls", Dvpanel_panelacciones_Cls);
         ucDvpanel_panelacciones.setProperty("Title", Dvpanel_panelacciones_Title);
         ucDvpanel_panelacciones.setProperty("Collapsible", Dvpanel_panelacciones_Collapsible);
         ucDvpanel_panelacciones.setProperty("Collapsed", Dvpanel_panelacciones_Collapsed);
         ucDvpanel_panelacciones.setProperty("ShowCollapseIcon", Dvpanel_panelacciones_Showcollapseicon);
         ucDvpanel_panelacciones.setProperty("IconPosition", Dvpanel_panelacciones_Iconposition);
         ucDvpanel_panelacciones.setProperty("AutoScroll", Dvpanel_panelacciones_Autoscroll);
         ucDvpanel_panelacciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelacciones_Internalname, "DVPANEL_PANELACCIONESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELACCIONESContainer"+"PanelAcciones"+"\" style=\"display:none;\">") ;
         wb_table2_37_1K12( true) ;
      }
      else
      {
         wb_table2_37_1K12( false) ;
      }
      return  ;
   }

   public void wb_table2_37_1K12e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol62( ) ;
      }
      if ( wbEnd == 62 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_62 = (int)(nGXsfl_62_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV53GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV54GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV51DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV51DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV23ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table3_85_1K12( true) ;
      }
      else
      {
         wb_table3_85_1K12( false) ;
      }
      return  ;
   }

   public void wb_table3_85_1K12e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 62 )
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

   public void start1K12( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ensayos de Laboratorio", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1K10( ) ;
   }

   public void ws1K12( )
   {
      start1K12( ) ;
      evt1K12( ) ;
   }

   public void evt1K12( )
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131K12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141K12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151K12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161K12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171K12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181K12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCancelar' */
                           e191K12 ();
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
                           nGXsfl_62_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_622( ) ;
                           AV9Seleccion = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccion.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSeleccion.getInternalname(), AV9Seleccion);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
                           A5534Lb_ArtDsc = httpContext.cgiGet( edtLb_ArtDsc_Internalname) ;
                           A5535Lb_TipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5552Lb_TipArtD = httpContext.cgiGet( edtLb_TipArtD_Internalname) ;
                           A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
                           A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n831TipColCod = false ;
                           A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
                           n832TipColDsc = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e201K12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e211K12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221K12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV20FilterFullText) != 0 )
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1K12( )
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

   public void pa1K12( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
      subsflControlProps_622( ) ;
      while ( nGXsfl_62_idx <= nRC_GXsfl_62 )
      {
         sendrow_622( ) ;
         nGXsfl_62_idx = ((subGrid_Islastpage==1)&&(nGXsfl_62_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_62_idx+1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV20FilterFullText ,
                                 String AV6MacProCod ,
                                 byte AV28ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ,
                                 int AV29TFLb_numero ,
                                 int AV30TFLb_numero_To ,
                                 int AV31TFCliCod ,
                                 int AV32TFCliCod_To ,
                                 String AV33TFCliNom ,
                                 String AV34TFCliNom_Sel ,
                                 String AV35TFLb_ArtCod ,
                                 String AV36TFLb_ArtCod_Sel ,
                                 String AV37TFLb_ArtDsc ,
                                 String AV38TFLb_ArtDsc_Sel ,
                                 short AV39TFLb_TipArt ,
                                 short AV40TFLb_TipArt_To ,
                                 String AV41TFLb_TipArtDsc ,
                                 String AV42TFLb_TipArtDsc_Sel ,
                                 String AV43TFLb_ColNom ,
                                 String AV44TFLb_ColNom_Sel ,
                                 int AV45TFLb_ColNum ,
                                 int AV46TFLb_ColNum_To ,
                                 byte AV47TFTipColCod ,
                                 byte AV48TFTipColCod_To ,
                                 String AV49TFTipColDsc ,
                                 String AV50TFTipColDsc_Sel ,
                                 String AV83Pgmname ,
                                 short AV17OrderedBy ,
                                 boolean AV18OrderedDsc ,
                                 String AV8MacProDsc2 ,
                                 String AV5EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211K12 ();
      GRID_nCurrentRecord = 0 ;
      rf1K12( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      rf1K12( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV83Pgmname = "FormulacionTinte.CambiodeNumerodeProgramaenEnsayos" ;
      Gx_err = (short)(0) ;
      edtavMacprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMacprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMacprocod_Enabled), 5, 0), true);
      edtavMacprodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMacprodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMacprodsc_Enabled), 5, 0), true);
   }

   public void rf1K12( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(62) ;
      /* Execute user event: Refresh */
      e211K12 ();
      nGXsfl_62_idx = 1 ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_622( ) ;
      bGXsfl_62_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_622( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                              Integer.valueOf(AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) ,
                                              Integer.valueOf(AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) ,
                                              Integer.valueOf(AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) ,
                                              Integer.valueOf(AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) ,
                                              AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                              AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                              AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                              AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                              AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                              AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                              Short.valueOf(AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) ,
                                              Short.valueOf(AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) ,
                                              AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                              AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                              AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                              AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                              Integer.valueOf(AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) ,
                                              Integer.valueOf(AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) ,
                                              Byte.valueOf(AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) ,
                                              Byte.valueOf(AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) ,
                                              AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                              AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A5533Lb_ArtCod ,
                                              A5534Lb_ArtDsc ,
                                              Short.valueOf(A5535Lb_TipArt) ,
                                              A5552Lb_TipArtD ,
                                              A5536Lb_ColNom ,
                                              Integer.valueOf(A5537Lb_ColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A832TipColDsc ,
                                              Short.valueOf(AV17OrderedBy) ,
                                              Boolean.valueOf(AV18OrderedDsc) ,
                                              A1514MacProCod ,
                                              AV6MacProCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING
                                              }
         });
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
         lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom), 30, "%") ;
         lV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod), 16, "%") ;
         lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc), 26, "%") ;
         lV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc), 30, "%") ;
         lV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = GXutil.padr( GXutil.rtrim( AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom), 13, "%") ;
         lV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc), 30, "%") ;
         /* Using cursor H01K12 */
         pr_default.execute(0, new Object[] {AV6MacProCod, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, Integer.valueOf(AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero), Integer.valueOf(AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to), Integer.valueOf(AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod), Integer.valueOf(AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to), lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom, AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel, lV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod, AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel, lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc, AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel, Short.valueOf(AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart), Short.valueOf(AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to), lV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc, AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel, lV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom, AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel, Integer.valueOf(AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum), Integer.valueOf(AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to), Byte.valueOf(AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod), Byte.valueOf(AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to), lV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc, AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_62_idx = 1 ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1514MacProCod = H01K12_A1514MacProCod[0] ;
            n1514MacProCod = H01K12_n1514MacProCod[0] ;
            A832TipColDsc = H01K12_A832TipColDsc[0] ;
            n832TipColDsc = H01K12_n832TipColDsc[0] ;
            A831TipColCod = H01K12_A831TipColCod[0] ;
            n831TipColCod = H01K12_n831TipColCod[0] ;
            A5537Lb_ColNum = H01K12_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = H01K12_A5536Lb_ColNom[0] ;
            A5552Lb_TipArtD = H01K12_A5552Lb_TipArtD[0] ;
            A5535Lb_TipArt = H01K12_A5535Lb_TipArt[0] ;
            A5534Lb_ArtDsc = H01K12_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = H01K12_A5533Lb_ArtCod[0] ;
            A279CliNom = H01K12_A279CliNom[0] ;
            A252CliCod = H01K12_A252CliCod[0] ;
            A407EmprNom = H01K12_A407EmprNom[0] ;
            n407EmprNom = H01K12_n407EmprNom[0] ;
            A5532Lb_numero = H01K12_A5532Lb_numero[0] ;
            A396EmprCod = H01K12_A396EmprCod[0] ;
            A407EmprNom = H01K12_A407EmprNom[0] ;
            n407EmprNom = H01K12_n407EmprNom[0] ;
            A279CliNom = H01K12_A279CliNom[0] ;
            A832TipColDsc = H01K12_A832TipColDsc[0] ;
            n832TipColDsc = H01K12_n832TipColDsc[0] ;
            e221K12 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(62) ;
         wb1K10( ) ;
      }
      bGXsfl_62_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1K12( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV83Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMACPRODSC2", GXutil.rtrim( AV8MacProDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPRODSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8MacProDsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
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
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV20FilterFullText ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV29TFLb_numero ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV30TFLb_numero_To ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV31TFCliCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV32TFCliCod_To ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV33TFCliNom ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV34TFCliNom_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV35TFLb_ArtCod ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV36TFLb_ArtCod_Sel ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV37TFLb_ArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV38TFLb_ArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV39TFLb_TipArt ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV40TFLb_TipArt_To ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV41TFLb_TipArtDsc ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV42TFLb_TipArtDsc_Sel ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV43TFLb_ColNom ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV44TFLb_ColNom_Sel ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV45TFLb_ColNum ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV47TFTipColCod ;
      AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV48TFTipColCod_To ;
      AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV49TFTipColDsc ;
      AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV50TFTipColDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) ,
                                           AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                           AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                           AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                           AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                           AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                           AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                           Short.valueOf(AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) ,
                                           Short.valueOf(AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) ,
                                           AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                           AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                           AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                           AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                           Integer.valueOf(AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) ,
                                           Integer.valueOf(AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) ,
                                           Byte.valueOf(AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) ,
                                           Byte.valueOf(AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) ,
                                           AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                           AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           Short.valueOf(A5535Lb_TipArt) ,
                                           A5552Lb_TipArtD ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Short.valueOf(AV17OrderedBy) ,
                                           Boolean.valueOf(AV18OrderedDsc) ,
                                           A1514MacProCod ,
                                           AV6MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom), 30, "%") ;
      lV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod), 16, "%") ;
      lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc), 26, "%") ;
      lV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc), 30, "%") ;
      lV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = GXutil.padr( GXutil.rtrim( AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom), 13, "%") ;
      lV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc), 30, "%") ;
      /* Using cursor H01K13 */
      pr_default.execute(1, new Object[] {AV6MacProCod, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, Integer.valueOf(AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero), Integer.valueOf(AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to), Integer.valueOf(AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod), Integer.valueOf(AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to), lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom, AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel, lV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod, AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel, lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc, AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel, Short.valueOf(AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart), Short.valueOf(AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to), lV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc, AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel, lV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom, AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel, Integer.valueOf(AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum), Integer.valueOf(AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to), Byte.valueOf(AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod), Byte.valueOf(AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to), lV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc, AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel});
      GRID_nRecordCount = H01K13_AGRID_nRecordCount[0] ;
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
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV20FilterFullText ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV29TFLb_numero ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV30TFLb_numero_To ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV31TFCliCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV32TFCliCod_To ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV33TFCliNom ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV34TFCliNom_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV35TFLb_ArtCod ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV36TFLb_ArtCod_Sel ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV37TFLb_ArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV38TFLb_ArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV39TFLb_TipArt ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV40TFLb_TipArt_To ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV41TFLb_TipArtDsc ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV42TFLb_TipArtDsc_Sel ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV43TFLb_ColNom ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV44TFLb_ColNom_Sel ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV45TFLb_ColNum ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV47TFTipColCod ;
      AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV48TFTipColCod_To ;
      AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV49TFTipColDsc ;
      AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV50TFTipColDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV6MacProCod, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLb_numero, AV30TFLb_numero_To, AV31TFCliCod, AV32TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV35TFLb_ArtCod, AV36TFLb_ArtCod_Sel, AV37TFLb_ArtDsc, AV38TFLb_ArtDsc_Sel, AV39TFLb_TipArt, AV40TFLb_TipArt_To, AV41TFLb_TipArtDsc, AV42TFLb_TipArtDsc_Sel, AV43TFLb_ColNom, AV44TFLb_ColNom_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV47TFTipColCod, AV48TFTipColCod_To, AV49TFTipColDsc, AV50TFTipColDsc_Sel, AV83Pgmname, AV17OrderedBy, AV18OrderedDsc, AV8MacProDsc2, AV5EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV20FilterFullText ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV29TFLb_numero ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV30TFLb_numero_To ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV31TFCliCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV32TFCliCod_To ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV33TFCliNom ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV34TFCliNom_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV35TFLb_ArtCod ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV36TFLb_ArtCod_Sel ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV37TFLb_ArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV38TFLb_ArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV39TFLb_TipArt ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV40TFLb_TipArt_To ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV41TFLb_TipArtDsc ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV42TFLb_TipArtDsc_Sel ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV43TFLb_ColNom ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV44TFLb_ColNom_Sel ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV45TFLb_ColNum ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV47TFTipColCod ;
      AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV48TFTipColCod_To ;
      AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV49TFTipColDsc ;
      AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV50TFTipColDsc_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV6MacProCod, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLb_numero, AV30TFLb_numero_To, AV31TFCliCod, AV32TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV35TFLb_ArtCod, AV36TFLb_ArtCod_Sel, AV37TFLb_ArtDsc, AV38TFLb_ArtDsc_Sel, AV39TFLb_TipArt, AV40TFLb_TipArt_To, AV41TFLb_TipArtDsc, AV42TFLb_TipArtDsc_Sel, AV43TFLb_ColNom, AV44TFLb_ColNom_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV47TFTipColCod, AV48TFTipColCod_To, AV49TFTipColDsc, AV50TFTipColDsc_Sel, AV83Pgmname, AV17OrderedBy, AV18OrderedDsc, AV8MacProDsc2, AV5EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV20FilterFullText ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV29TFLb_numero ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV30TFLb_numero_To ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV31TFCliCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV32TFCliCod_To ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV33TFCliNom ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV34TFCliNom_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV35TFLb_ArtCod ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV36TFLb_ArtCod_Sel ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV37TFLb_ArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV38TFLb_ArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV39TFLb_TipArt ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV40TFLb_TipArt_To ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV41TFLb_TipArtDsc ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV42TFLb_TipArtDsc_Sel ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV43TFLb_ColNom ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV44TFLb_ColNom_Sel ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV45TFLb_ColNum ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV47TFTipColCod ;
      AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV48TFTipColCod_To ;
      AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV49TFTipColDsc ;
      AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV50TFTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV6MacProCod, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLb_numero, AV30TFLb_numero_To, AV31TFCliCod, AV32TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV35TFLb_ArtCod, AV36TFLb_ArtCod_Sel, AV37TFLb_ArtDsc, AV38TFLb_ArtDsc_Sel, AV39TFLb_TipArt, AV40TFLb_TipArt_To, AV41TFLb_TipArtDsc, AV42TFLb_TipArtDsc_Sel, AV43TFLb_ColNom, AV44TFLb_ColNom_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV47TFTipColCod, AV48TFTipColCod_To, AV49TFTipColDsc, AV50TFTipColDsc_Sel, AV83Pgmname, AV17OrderedBy, AV18OrderedDsc, AV8MacProDsc2, AV5EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV20FilterFullText ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV29TFLb_numero ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV30TFLb_numero_To ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV31TFCliCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV32TFCliCod_To ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV33TFCliNom ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV34TFCliNom_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV35TFLb_ArtCod ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV36TFLb_ArtCod_Sel ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV37TFLb_ArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV38TFLb_ArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV39TFLb_TipArt ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV40TFLb_TipArt_To ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV41TFLb_TipArtDsc ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV42TFLb_TipArtDsc_Sel ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV43TFLb_ColNom ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV44TFLb_ColNom_Sel ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV45TFLb_ColNum ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV47TFTipColCod ;
      AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV48TFTipColCod_To ;
      AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV49TFTipColDsc ;
      AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV50TFTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV6MacProCod, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLb_numero, AV30TFLb_numero_To, AV31TFCliCod, AV32TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV35TFLb_ArtCod, AV36TFLb_ArtCod_Sel, AV37TFLb_ArtDsc, AV38TFLb_ArtDsc_Sel, AV39TFLb_TipArt, AV40TFLb_TipArt_To, AV41TFLb_TipArtDsc, AV42TFLb_TipArtDsc_Sel, AV43TFLb_ColNom, AV44TFLb_ColNom_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV47TFTipColCod, AV48TFTipColCod_To, AV49TFTipColDsc, AV50TFTipColDsc_Sel, AV83Pgmname, AV17OrderedBy, AV18OrderedDsc, AV8MacProDsc2, AV5EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV20FilterFullText ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV29TFLb_numero ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV30TFLb_numero_To ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV31TFCliCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV32TFCliCod_To ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV33TFCliNom ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV34TFCliNom_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV35TFLb_ArtCod ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV36TFLb_ArtCod_Sel ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV37TFLb_ArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV38TFLb_ArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV39TFLb_TipArt ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV40TFLb_TipArt_To ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV41TFLb_TipArtDsc ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV42TFLb_TipArtDsc_Sel ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV43TFLb_ColNom ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV44TFLb_ColNom_Sel ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV45TFLb_ColNum ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV47TFTipColCod ;
      AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV48TFTipColCod_To ;
      AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV49TFTipColDsc ;
      AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV50TFTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV6MacProCod, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLb_numero, AV30TFLb_numero_To, AV31TFCliCod, AV32TFCliCod_To, AV33TFCliNom, AV34TFCliNom_Sel, AV35TFLb_ArtCod, AV36TFLb_ArtCod_Sel, AV37TFLb_ArtDsc, AV38TFLb_ArtDsc_Sel, AV39TFLb_TipArt, AV40TFLb_TipArt_To, AV41TFLb_TipArtDsc, AV42TFLb_TipArtDsc_Sel, AV43TFLb_ColNom, AV44TFLb_ColNom_Sel, AV45TFLb_ColNum, AV46TFLb_ColNum_To, AV47TFTipColCod, AV48TFTipColCod_To, AV49TFTipColDsc, AV50TFTipColDsc_Sel, AV83Pgmname, AV17OrderedBy, AV18OrderedDsc, AV8MacProDsc2, AV5EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV83Pgmname = "FormulacionTinte.CambiodeNumerodeProgramaenEnsayos" ;
      Gx_err = (short)(0) ;
      edtavMacprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMacprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMacprocod_Enabled), 5, 0), true);
      edtavMacprodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMacprodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMacprodsc_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1K10( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201K12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV26ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV51DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV23ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_62 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_62"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV53GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV54GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( "DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( "DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
         Dvpanel_panelacciones_Width = httpContext.cgiGet( "DVPANEL_PANELACCIONES_Width") ;
         Dvpanel_panelacciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Autowidth")) ;
         Dvpanel_panelacciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Autoheight")) ;
         Dvpanel_panelacciones_Cls = httpContext.cgiGet( "DVPANEL_PANELACCIONES_Cls") ;
         Dvpanel_panelacciones_Title = httpContext.cgiGet( "DVPANEL_PANELACCIONES_Title") ;
         Dvpanel_panelacciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Collapsible")) ;
         Dvpanel_panelacciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Collapsed")) ;
         Dvpanel_panelacciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Showcollapseicon")) ;
         Dvpanel_panelacciones_Iconposition = httpContext.cgiGet( "DVPANEL_PANELACCIONES_Iconposition") ;
         Dvpanel_panelacciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Autoscroll")) ;
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
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
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
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         AV20FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20FilterFullText", AV20FilterFullText);
         AV6MacProCod = httpContext.cgiGet( edtavMacprocod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6MacProCod", AV6MacProCod);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV20FilterFullText) != 0 )
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
      e201K12 ();
      if (returnInSub) return;
   }

   public void e201K12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV57Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV58Emprnom ;
      GXv_char4[0] = AV59Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV57Station, GXv_char2, GXv_char3, GXv_char4) ;
      cambiodenumerodeprogramaenensayos_impl.this.AV5EmprCod = GXv_char2[0] ;
      cambiodenumerodeprogramaenensayos_impl.this.AV58Emprnom = GXv_char3[0] ;
      cambiodenumerodeprogramaenensayos_impl.this.AV59Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV12HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Ensayos de Laboratorio", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV17OrderedBy < 1 )
      {
         AV17OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV51DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV51DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e211K12( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV11WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV28ManageFiltersExecutionStep == 1 )
      {
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV28ManageFiltersExecutionStep == 2 )
      {
         AV28ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25Session.getValue("FormulacionTinte.CambiodeNumerodeProgramaenEnsayosColumnsSelector"), "") != 0 )
      {
         AV21ColumnsSelectorXML = AV25Session.getValue("FormulacionTinte.CambiodeNumerodeProgramaenEnsayosColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV21ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      chkavSeleccion.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccion.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccion.getVisible(), 5, 0), !bGXsfl_62_Refreshing);
      edtLb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Visible), 5, 0), !bGXsfl_62_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_62_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_62_Refreshing);
      edtLb_ArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtCod_Visible), 5, 0), !bGXsfl_62_Refreshing);
      edtLb_ArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtDsc_Visible), 5, 0), !bGXsfl_62_Refreshing);
      edtLb_TipArt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TipArt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TipArt_Visible), 5, 0), !bGXsfl_62_Refreshing);
      edtLb_TipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TipArtD_Visible), 5, 0), !bGXsfl_62_Refreshing);
      edtLb_ColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNom_Visible), 5, 0), !bGXsfl_62_Refreshing);
      edtLb_ColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNum_Visible), 5, 0), !bGXsfl_62_Refreshing);
      edtTipColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), !bGXsfl_62_Refreshing);
      edtTipColDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Visible), 5, 0), !bGXsfl_62_Refreshing);
      AV53GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridCurrentPage), 10, 0));
      AV54GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridPageCount), 10, 0));
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV20FilterFullText ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV29TFLb_numero ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV30TFLb_numero_To ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV31TFCliCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV32TFCliCod_To ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV33TFCliNom ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV34TFCliNom_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV35TFLb_ArtCod ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV36TFLb_ArtCod_Sel ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV37TFLb_ArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV38TFLb_ArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV39TFLb_TipArt ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV40TFLb_TipArt_To ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV41TFLb_TipArtDsc ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV42TFLb_TipArtDsc_Sel ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV43TFLb_ColNom ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV44TFLb_ColNom_Sel ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV45TFLb_ColNum ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV47TFTipColCod ;
      AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV48TFTipColCod_To ;
      AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV49TFTipColDsc ;
      AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV50TFTipColDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15GridState", AV15GridState);
   }

   public void e141K12( )
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
         AV52PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV52PageToGo) ;
      }
   }

   public void e151K12( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e161K12( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV17OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         AV18OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedDsc", AV18OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numero") == 0 )
         {
            AV29TFLb_numero = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFLb_numero), 8, 0));
            AV30TFLb_numero_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV31TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod), 6, 0));
            AV32TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV33TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom", AV33TFCliNom);
            AV34TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom_Sel", AV34TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ArtCod") == 0 )
         {
            AV35TFLb_ArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFLb_ArtCod", AV35TFLb_ArtCod);
            AV36TFLb_ArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFLb_ArtCod_Sel", AV36TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ArtDsc") == 0 )
         {
            AV37TFLb_ArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFLb_ArtDsc", AV37TFLb_ArtDsc);
            AV38TFLb_ArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFLb_ArtDsc_Sel", AV38TFLb_ArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_TipArt") == 0 )
         {
            AV39TFLb_TipArt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFLb_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFLb_TipArt), 4, 0));
            AV40TFLb_TipArt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLb_TipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFLb_TipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_TipArtDsc") == 0 )
         {
            AV41TFLb_TipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFLb_TipArtDsc", AV41TFLb_TipArtDsc);
            AV42TFLb_TipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFLb_TipArtDsc_Sel", AV42TFLb_TipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNom") == 0 )
         {
            AV43TFLb_ColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFLb_ColNom", AV43TFLb_ColNom);
            AV44TFLb_ColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFLb_ColNom_Sel", AV44TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNum") == 0 )
         {
            AV45TFLb_ColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_ColNum), 6, 0));
            AV46TFLb_ColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV47TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFTipColCod), 2, 0));
            AV48TFTipColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColDsc") == 0 )
         {
            AV49TFTipColDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFTipColDsc", AV49TFTipColDsc);
            AV50TFTipColDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFTipColDsc_Sel", AV50TFTipColDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e221K12( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV9Seleccion = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccion.getInternalname(), AV9Seleccion);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(62) ;
      }
      sendrow_622( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_62_Refreshing )
      {
         httpContext.doAjaxLoad(62, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e171K12( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV21ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV23ColumnsSelector.fromJSonString(AV21ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CambiodeNumerodeProgramaenEnsayosColumnsSelector", ((GXutil.strcmp("", AV21ColumnsSelectorXML)==0) ? "" : AV23ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15GridState", AV15GridState);
   }

   public void e131K12( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.CambiodeNumerodeProgramaenEnsayosFilters")),GXutil.URLEncode(GXutil.rtrim(AV83Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.CambiodeNumerodeProgramaenEnsayosFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV27ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.CambiodeNumerodeProgramaenEnsayosFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         cambiodenumerodeprogramaenensayos_impl.this.GXt_char1 = GXv_char4[0] ;
         AV27ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV27ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV83Pgmname+"GridState", AV27ManageFiltersXml) ;
            AV15GridState.fromxml(AV27ManageFiltersXml, null, null);
            AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
            AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedDsc", AV18OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15GridState", AV15GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26ManageFiltersData", AV26ManageFiltersData);
   }

   public void e181K12( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e191K12( )
   {
      /* 'DoCancelar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV5EmprCod,AV6MacProCod,AV7MacProDsc,AV8MacProDsc2});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6MacProCod","AV7MacProDsc","AV8MacProDsc2"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV17OrderedBy, 4, 0))+":"+(AV18OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Seleccion", "", "Op", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ArtCod", "", "Codigo Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ArtDsc", "", "Descripcion Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_TipArt", "", "Tipo de Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_TipArtDsc", "", "Descripcion Tipo de Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ColNom", "", "Nombre de Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Lb_ColNum", "", "Numero Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipColCod", "", "Codigo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipColDsc", "", "Tipo Colorante", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV22UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CambiodeNumerodeProgramaenEnsayosColumnsSelector", GXv_char4) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV26ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.CambiodeNumerodeProgramaenEnsayosFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV26ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV20FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FilterFullText", AV20FilterFullText);
      AV29TFLb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFLb_numero), 8, 0));
      AV30TFLb_numero_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFLb_numero_To), 8, 0));
      AV31TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod), 6, 0));
      AV32TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod_To), 6, 0));
      AV33TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom", AV33TFCliNom);
      AV34TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom_Sel", AV34TFCliNom_Sel);
      AV35TFLb_ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFLb_ArtCod", AV35TFLb_ArtCod);
      AV36TFLb_ArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFLb_ArtCod_Sel", AV36TFLb_ArtCod_Sel);
      AV37TFLb_ArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFLb_ArtDsc", AV37TFLb_ArtDsc);
      AV38TFLb_ArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFLb_ArtDsc_Sel", AV38TFLb_ArtDsc_Sel);
      AV39TFLb_TipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFLb_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFLb_TipArt), 4, 0));
      AV40TFLb_TipArt_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFLb_TipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFLb_TipArt_To), 4, 0));
      AV41TFLb_TipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFLb_TipArtDsc", AV41TFLb_TipArtDsc);
      AV42TFLb_TipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFLb_TipArtDsc_Sel", AV42TFLb_TipArtDsc_Sel);
      AV43TFLb_ColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFLb_ColNom", AV43TFLb_ColNom);
      AV44TFLb_ColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFLb_ColNom_Sel", AV44TFLb_ColNom_Sel);
      AV45TFLb_ColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_ColNum), 6, 0));
      AV46TFLb_ColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFLb_ColNum_To), 6, 0));
      AV47TFTipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFTipColCod), 2, 0));
      AV48TFTipColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFTipColCod_To), 2, 0));
      AV49TFTipColDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFTipColDsc", AV49TFTipColDsc);
      AV50TFTipColDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFTipColDsc_Sel", AV50TFTipColDsc_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV83Pgmname+"GridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV83Pgmname+"GridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV25Session.getValue(AV83Pgmname+"GridState"), null, null);
      }
      AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
      AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedDsc", AV18OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV15GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV15GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV15GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV84GXV1 = 1 ;
      while ( AV84GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20FilterFullText", AV20FilterFullText);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV29TFLb_numero = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFLb_numero), 8, 0));
            AV30TFLb_numero_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV31TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod), 6, 0));
            AV32TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV33TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom", AV33TFCliNom);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV34TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom_Sel", AV34TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV35TFLb_ArtCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFLb_ArtCod", AV35TFLb_ArtCod);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV36TFLb_ArtCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFLb_ArtCod_Sel", AV36TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV37TFLb_ArtDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFLb_ArtDsc", AV37TFLb_ArtDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV38TFLb_ArtDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFLb_ArtDsc_Sel", AV38TFLb_ArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPART") == 0 )
         {
            AV39TFLb_TipArt = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFLb_TipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFLb_TipArt), 4, 0));
            AV40TFLb_TipArt_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLb_TipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFLb_TipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPARTDSC") == 0 )
         {
            AV41TFLb_TipArtDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFLb_TipArtDsc", AV41TFLb_TipArtDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPARTDSC_SEL") == 0 )
         {
            AV42TFLb_TipArtDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFLb_TipArtDsc_Sel", AV42TFLb_TipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV43TFLb_ColNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFLb_ColNom", AV43TFLb_ColNom);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV44TFLb_ColNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFLb_ColNom_Sel", AV44TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV45TFLb_ColNum = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_ColNum), 6, 0));
            AV46TFLb_ColNum_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV47TFTipColCod = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFTipColCod), 2, 0));
            AV48TFTipColCod_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV49TFTipColDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFTipColDsc", AV49TFTipColDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV50TFTipColDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFTipColDsc_Sel", AV50TFTipColDsc_Sel);
         }
         AV84GXV1 = (int)(AV84GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFCliNom_Sel)==0), AV34TFCliNom_Sel, GXv_char4) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFLb_ArtCod_Sel)==0), AV36TFLb_ArtCod_Sel, GXv_char3) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFLb_ArtDsc_Sel)==0), AV38TFLb_ArtDsc_Sel, GXv_char2) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFLb_TipArtDsc_Sel)==0), AV42TFLb_TipArtDsc_Sel, GXv_char15) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFLb_ColNom_Sel)==0), AV44TFLb_ColNom_Sel, GXv_char17) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFTipColDsc_Sel)==0), AV50TFTipColDsc_Sel, GXv_char19) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char18 = GXv_char19[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"||"+GXt_char14+"|"+GXt_char16+"|||"+GXt_char18 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFCliNom)==0), AV33TFCliNom, GXv_char19) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFLb_ArtCod)==0), AV35TFLb_ArtCod, GXv_char17) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFLb_ArtDsc)==0), AV37TFLb_ArtDsc, GXv_char15) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFLb_TipArtDsc)==0), AV41TFLb_TipArtDsc, GXv_char4) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFLb_ColNom)==0), AV43TFLb_ColNom, GXv_char3) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFTipColDsc)==0), AV49TFTipColDsc, GXv_char2) ;
      cambiodenumerodeprogramaenensayos_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV29TFLb_numero) ? "" : GXutil.str( AV29TFLb_numero, 8, 0))+"|"+((0==AV31TFCliCod) ? "" : GXutil.str( AV31TFCliCod, 6, 0))+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+((0==AV39TFLb_TipArt) ? "" : GXutil.str( AV39TFLb_TipArt, 4, 0))+"|"+GXt_char13+"|"+GXt_char12+"|"+((0==AV45TFLb_ColNum) ? "" : GXutil.str( AV45TFLb_ColNum, 6, 0))+"|"+((0==AV47TFTipColCod) ? "" : GXutil.str( AV47TFTipColCod, 2, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV30TFLb_numero_To) ? "" : GXutil.str( AV30TFLb_numero_To, 8, 0))+"|"+((0==AV32TFCliCod_To) ? "" : GXutil.str( AV32TFCliCod_To, 6, 0))+"||||"+((0==AV40TFLb_TipArt_To) ? "" : GXutil.str( AV40TFLb_TipArt_To, 4, 0))+"|||"+((0==AV46TFLb_ColNum_To) ? "" : GXutil.str( AV46TFLb_ColNum_To, 6, 0))+"|"+((0==AV48TFTipColCod_To) ? "" : GXutil.str( AV48TFTipColCod_To, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV15GridState.fromxml(AV25Session.getValue(AV83Pgmname+"GridState"), null, null);
      AV15GridState.setgxTv_SdtWWPGridState_Orderedby( AV17OrderedBy );
      AV15GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV18OrderedDsc );
      AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV20FilterFullText)==0), (short)(0), AV20FilterFullText, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_NUMERO", "", !((0==AV29TFLb_numero)&&(0==AV30TFLb_numero_To)), (short)(0), GXutil.trim( GXutil.str( AV29TFLb_numero, 8, 0)), GXutil.trim( GXutil.str( AV30TFLb_numero_To, 8, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCLICOD", "", !((0==AV31TFCliCod)&&(0==AV32TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV31TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV32TFCliCod_To, 6, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCLINOM", "", !(GXutil.strcmp("", AV33TFCliNom)==0), (short)(0), AV33TFCliNom, "", !(GXutil.strcmp("", AV34TFCliNom_Sel)==0), AV34TFCliNom_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_ARTCOD", "", !(GXutil.strcmp("", AV35TFLb_ArtCod)==0), (short)(0), AV35TFLb_ArtCod, "", !(GXutil.strcmp("", AV36TFLb_ArtCod_Sel)==0), AV36TFLb_ArtCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_ARTDSC", "", !(GXutil.strcmp("", AV37TFLb_ArtDsc)==0), (short)(0), AV37TFLb_ArtDsc, "", !(GXutil.strcmp("", AV38TFLb_ArtDsc_Sel)==0), AV38TFLb_ArtDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_TIPART", "", !((0==AV39TFLb_TipArt)&&(0==AV40TFLb_TipArt_To)), (short)(0), GXutil.trim( GXutil.str( AV39TFLb_TipArt, 4, 0)), GXutil.trim( GXutil.str( AV40TFLb_TipArt_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_TIPARTDSC", "", !(GXutil.strcmp("", AV41TFLb_TipArtDsc)==0), (short)(0), AV41TFLb_TipArtDsc, "", !(GXutil.strcmp("", AV42TFLb_TipArtDsc_Sel)==0), AV42TFLb_TipArtDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_COLNOM", "", !(GXutil.strcmp("", AV43TFLb_ColNom)==0), (short)(0), AV43TFLb_ColNom, "", !(GXutil.strcmp("", AV44TFLb_ColNom_Sel)==0), AV44TFLb_ColNom_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_COLNUM", "", !((0==AV45TFLb_ColNum)&&(0==AV46TFLb_ColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV45TFLb_ColNum, 6, 0)), GXutil.trim( GXutil.str( AV46TFLb_ColNum_To, 6, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFTIPCOLCOD", "", !((0==AV47TFTipColCod)&&(0==AV48TFTipColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV47TFTipColCod, 2, 0)), GXutil.trim( GXutil.str( AV48TFTipColCod_To, 2, 0))) ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFTIPCOLDSC", "", !(GXutil.strcmp("", AV49TFTipColDsc)==0), (short)(0), AV49TFTipColDsc, "", !(GXutil.strcmp("", AV50TFTipColDsc_Sel)==0), AV50TFTipColDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState20[0] ;
      AV15GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV15GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV83Pgmname+"GridState", AV15GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV13TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV83Pgmname );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TENS000" );
      AV25Session.setValue("TrnContext", AV13TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S192( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_62 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_62"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_62_fel_idx = 0 ;
      while ( nGXsfl_62_fel_idx < nRC_GXsfl_62 )
      {
         nGXsfl_62_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_62_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_62_fel_idx+1) ;
         sGXsfl_62_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_622( ) ;
         AV9Seleccion = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccion.getInternalname()), "S")==0) ? "S" : "N") ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
         A5534Lb_ArtDsc = httpContext.cgiGet( edtLb_ArtDsc_Internalname) ;
         A5535Lb_TipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5552Lb_TipArtD = httpContext.cgiGet( edtLb_TipArtD_Internalname) ;
         A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
         A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n831TipColCod = false ;
         A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
         n832TipColDsc = false ;
         if ( GXutil.strcmp(AV9Seleccion, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char19[0] = A396EmprCod ;
            GXv_int21[0] = A5532Lb_numero ;
            GXv_char17[0] = AV6MacProCod ;
            new app.formulaciontinte.pmacforg(remoteHandle, context).execute( GXv_char19, GXv_int21, GXv_char17) ;
            cambiodenumerodeprogramaenensayos_impl.this.A396EmprCod = GXv_char19[0] ;
            cambiodenumerodeprogramaenensayos_impl.this.A5532Lb_numero = GXv_int21[0] ;
            cambiodenumerodeprogramaenensayos_impl.this.AV6MacProCod = GXv_char17[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6MacProCod", AV6MacProCod);
         }
         /* End For Each Line */
      }
      if ( nGXsfl_62_fel_idx == 0 )
      {
         nGXsfl_62_idx = 1 ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      nGXsfl_62_fel_idx = 1 ;
      httpContext.setWebReturnParms(new Object[] {AV5EmprCod,AV6MacProCod,AV7MacProDsc,AV8MacProDsc2});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6MacProCod","AV7MacProDsc","AV8MacProDsc2"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void wb_table3_85_1K12( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_85_1K12e( true) ;
      }
      else
      {
         wb_table3_85_1K12e( false) ;
      }
   }

   public void wb_table2_37_1K12( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPanelacciones_Internalname, tblPanelacciones_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e231k11_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\CambiodeNumerodeProgramaenEnsayos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CambiodeNumerodeProgramaenEnsayos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMacprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMacprocod_Internalname, httpContext.getMessage( "Nº de Programa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMacprocod_Internalname, GXutil.rtrim( AV6MacProCod), GXutil.rtrim( localUtil.format( AV6MacProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMacprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMacprocod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\CambiodeNumerodeProgramaenEnsayos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMacprodsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMacprodsc_Internalname, httpContext.getMessage( "Descripción del Nº Programa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMacprodsc_Internalname, GXutil.rtrim( AV7MacProDsc), GXutil.rtrim( localUtil.format( AV7MacProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMacprodsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMacprodsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\CambiodeNumerodeProgramaenEnsayos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_37_1K12e( true) ;
      }
      else
      {
         wb_table2_37_1K12e( false) ;
      }
   }

   public void wb_table1_23_1K12( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV26ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_28_1K12( true) ;
      }
      else
      {
         wb_table4_28_1K12( false) ;
      }
      return  ;
   }

   public void wb_table4_28_1K12e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1K12e( true) ;
      }
      else
      {
         wb_table1_23_1K12e( false) ;
      }
   }

   public void wb_table4_28_1K12( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV20FilterFullText, GXutil.rtrim( localUtil.format( AV20FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\CambiodeNumerodeProgramaenEnsayos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_28_1K12e( true) ;
      }
      else
      {
         wb_table4_28_1K12e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5EmprCod, "@!"))));
      AV6MacProCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6MacProCod", AV6MacProCod);
      AV7MacProDsc = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7MacProDsc", AV7MacProDsc);
      AV8MacProDsc2 = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8MacProDsc2", AV8MacProDsc2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPRODSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8MacProDsc2, ""))));
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
      pa1K12( ) ;
      ws1K12( ) ;
      we1K12( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116134644", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/cambiodenumerodeprogramaenensayos.js", "?202682116134644", false, true);
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

   public void subsflControlProps_622( )
   {
      chkavSeleccion.setInternalname( "vSELECCION_"+sGXsfl_62_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_62_idx ;
      edtLb_numero_Internalname = "LB_NUMERO_"+sGXsfl_62_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_62_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_62_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_62_idx ;
      edtLb_ArtCod_Internalname = "LB_ARTCOD_"+sGXsfl_62_idx ;
      edtLb_ArtDsc_Internalname = "LB_ARTDSC_"+sGXsfl_62_idx ;
      edtLb_TipArt_Internalname = "LB_TIPART_"+sGXsfl_62_idx ;
      edtLb_TipArtD_Internalname = "LB_TIPARTD_"+sGXsfl_62_idx ;
      edtLb_ColNom_Internalname = "LB_COLNOM_"+sGXsfl_62_idx ;
      edtLb_ColNum_Internalname = "LB_COLNUM_"+sGXsfl_62_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_62_idx ;
      edtTipColDsc_Internalname = "TIPCOLDSC_"+sGXsfl_62_idx ;
   }

   public void subsflControlProps_fel_622( )
   {
      chkavSeleccion.setInternalname( "vSELECCION_"+sGXsfl_62_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_62_fel_idx ;
      edtLb_numero_Internalname = "LB_NUMERO_"+sGXsfl_62_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_62_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_62_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_62_fel_idx ;
      edtLb_ArtCod_Internalname = "LB_ARTCOD_"+sGXsfl_62_fel_idx ;
      edtLb_ArtDsc_Internalname = "LB_ARTDSC_"+sGXsfl_62_fel_idx ;
      edtLb_TipArt_Internalname = "LB_TIPART_"+sGXsfl_62_fel_idx ;
      edtLb_TipArtD_Internalname = "LB_TIPARTD_"+sGXsfl_62_fel_idx ;
      edtLb_ColNom_Internalname = "LB_COLNOM_"+sGXsfl_62_fel_idx ;
      edtLb_ColNum_Internalname = "LB_COLNUM_"+sGXsfl_62_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_62_fel_idx ;
      edtTipColDsc_Internalname = "TIPCOLDSC_"+sGXsfl_62_fel_idx ;
   }

   public void sendrow_622( )
   {
      subsflControlProps_622( ) ;
      wb1K10( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_62_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_62_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_62_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccion.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccion.getEnabled()!=0)&&(chkavSeleccion.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCION_" + sGXsfl_62_idx ;
         chkavSeleccion.setName( GXCCtl );
         chkavSeleccion.setWebtags( "" );
         chkavSeleccion.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccion.getInternalname(), "TitleCaption", chkavSeleccion.getCaption(), !bGXsfl_62_Refreshing);
         chkavSeleccion.setCheckedValue( "N" );
         AV9Seleccion = ((GXutil.strcmp(GXutil.rtrim( AV9Seleccion), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccion.getInternalname(), AV9Seleccion);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccion.getInternalname(),AV9Seleccion,"","",Integer.valueOf(chkavSeleccion.getVisible()),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(63, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccion.getEnabled()!=0)&&(chkavSeleccion.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_numero_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtCod_Internalname,GXutil.rtrim( A5533Lb_ArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtDsc_Internalname,GXutil.rtrim( A5534Lb_ArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_TipArt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_TipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A5535Lb_TipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5535Lb_TipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_TipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_TipArt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_TipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_TipArtD_Internalname,GXutil.rtrim( A5552Lb_TipArtD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_TipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_TipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNom_Internalname,GXutil.rtrim( A5536Lb_ColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipColDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColDsc_Internalname,GXutil.rtrim( A832TipColDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1K12( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_62_idx = ((subGrid_Islastpage==1)&&(nGXsfl_62_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_62_idx+1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      /* End function sendrow_622 */
   }

   public void startgridcontrol62( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"62\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccion.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº de Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_TipArt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo de Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_TipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Tipo de Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre de Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Colorante", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV9Seleccion));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccion.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5533Lb_ArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5534Lb_ArtDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ArtDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5535Lb_TipArt, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_TipArt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5552Lb_TipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_TipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A832TipColDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColDsc_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      bttBtnmarcartodas_Internalname = "BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = "BTNDESMARCARTODAS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncancelar_Internalname = "BTNCANCELAR" ;
      edtavMacprocod_Internalname = "vMACPROCOD" ;
      edtavMacprodsc_Internalname = "vMACPRODSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      tblPanelacciones_Internalname = "PANELACCIONES" ;
      Dvpanel_panelacciones_Internalname = "DVPANEL_PANELACCIONES" ;
      chkavSeleccion.setInternalname( "vSELECCION" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtLb_numero_Internalname = "LB_NUMERO" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtLb_ArtCod_Internalname = "LB_ARTCOD" ;
      edtLb_ArtDsc_Internalname = "LB_ARTDSC" ;
      edtLb_TipArt_Internalname = "LB_TIPART" ;
      edtLb_TipArtD_Internalname = "LB_TIPARTD" ;
      edtLb_ColNom_Internalname = "LB_COLNOM" ;
      edtLb_ColNum_Internalname = "LB_COLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtLb_ColNum_Jsonclick = "" ;
      edtLb_ColNom_Jsonclick = "" ;
      edtLb_TipArtD_Jsonclick = "" ;
      edtLb_TipArt_Jsonclick = "" ;
      edtLb_ArtDsc_Jsonclick = "" ;
      edtLb_ArtCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtLb_numero_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      chkavSeleccion.setCaption( "" );
      chkavSeleccion.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavMacprodsc_Jsonclick = "" ;
      edtavMacprodsc_Enabled = 0 ;
      edtavMacprocod_Jsonclick = "" ;
      edtavMacprocod_Enabled = 0 ;
      edtTipColDsc_Visible = -1 ;
      edtTipColCod_Visible = -1 ;
      edtLb_ColNum_Visible = -1 ;
      edtLb_ColNom_Visible = -1 ;
      edtLb_TipArtD_Visible = -1 ;
      edtLb_TipArt_Visible = -1 ;
      edtLb_ArtDsc_Visible = -1 ;
      edtLb_ArtCod_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtLb_numero_Visible = -1 ;
      chkavSeleccion.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma los datos seleccionados?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "FormulacionTinte.CambiodeNumerodeProgramaenEnsayosGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|Dynamic||Dynamic|Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "|||T|T|T||T|T|||T" ;
      Ddo_grid_Filterisrange = "|T|T||||T|||T|T|" ;
      Ddo_grid_Filtertype = "|Numeric|Numeric|Character|Character|Character|Numeric|Character|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|5|6|7|8|9|10|11|12" ;
      Ddo_grid_Columnids = "0:Seleccion|2:Lb_numero|4:CliCod|5:CliNom|6:Lb_ArtCod|7:Lb_ArtDsc|8:Lb_TipArt|9:Lb_TipArtDsc|10:Lb_ColNom|11:Lb_ColNum|12:TipColCod|13:TipColDsc" ;
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
      Dvpanel_panelacciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelacciones_Iconposition = "Right" ;
      Dvpanel_panelacciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelacciones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelacciones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelacciones_Title = "" ;
      Dvpanel_panelacciones_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelacciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelacciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelacciones_Width = "100%" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Ensayos de Laboratorio", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vSELECCION_" + sGXsfl_62_idx ;
      chkavSeleccion.setName( GXCCtl );
      chkavSeleccion.setWebtags( "" );
      chkavSeleccion.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccion.getInternalname(), "TitleCaption", chkavSeleccion.getCaption(), !bGXsfl_62_Refreshing);
      chkavSeleccion.setCheckedValue( "N" );
      AV9Seleccion = ((GXutil.strcmp(GXutil.rtrim( AV9Seleccion), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccion.getInternalname(), AV9Seleccion);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV6MacProCod',fld:'vMACPROCOD',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV36TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV37TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV38TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV39TFLb_TipArt',fld:'vTFLB_TIPART',pic:'ZZZ9'},{av:'AV40TFLb_TipArt_To',fld:'vTFLB_TIPART_TO',pic:'ZZZ9'},{av:'AV41TFLb_TipArtDsc',fld:'vTFLB_TIPARTDSC',pic:''},{av:'AV42TFLb_TipArtDsc_Sel',fld:'vTFLB_TIPARTDSC_SEL',pic:''},{av:'AV43TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV44TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV47TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV48TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV49TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV50TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8MacProDsc2',fld:'vMACPRODSC2',pic:'',hsh:true},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccion.getVisible()',ctrl:'vSELECCION',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_TipArt_Visible',ctrl:'LB_TIPART',prop:'Visible'},{av:'edtLb_TipArtD_Visible',ctrl:'LB_TIPARTD',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e141K12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV6MacProCod',fld:'vMACPROCOD',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV36TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV37TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV38TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV39TFLb_TipArt',fld:'vTFLB_TIPART',pic:'ZZZ9'},{av:'AV40TFLb_TipArt_To',fld:'vTFLB_TIPART_TO',pic:'ZZZ9'},{av:'AV41TFLb_TipArtDsc',fld:'vTFLB_TIPARTDSC',pic:''},{av:'AV42TFLb_TipArtDsc_Sel',fld:'vTFLB_TIPARTDSC_SEL',pic:''},{av:'AV43TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV44TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV47TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV48TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV49TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV50TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8MacProDsc2',fld:'vMACPRODSC2',pic:'',hsh:true},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e151K12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV6MacProCod',fld:'vMACPROCOD',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV36TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV37TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV38TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV39TFLb_TipArt',fld:'vTFLB_TIPART',pic:'ZZZ9'},{av:'AV40TFLb_TipArt_To',fld:'vTFLB_TIPART_TO',pic:'ZZZ9'},{av:'AV41TFLb_TipArtDsc',fld:'vTFLB_TIPARTDSC',pic:''},{av:'AV42TFLb_TipArtDsc_Sel',fld:'vTFLB_TIPARTDSC_SEL',pic:''},{av:'AV43TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV44TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV47TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV48TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV49TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV50TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8MacProDsc2',fld:'vMACPRODSC2',pic:'',hsh:true},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e161K12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV6MacProCod',fld:'vMACPROCOD',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV36TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV37TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV38TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV39TFLb_TipArt',fld:'vTFLB_TIPART',pic:'ZZZ9'},{av:'AV40TFLb_TipArt_To',fld:'vTFLB_TIPART_TO',pic:'ZZZ9'},{av:'AV41TFLb_TipArtDsc',fld:'vTFLB_TIPARTDSC',pic:''},{av:'AV42TFLb_TipArtDsc_Sel',fld:'vTFLB_TIPARTDSC_SEL',pic:''},{av:'AV43TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV44TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV47TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV48TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV49TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV50TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8MacProDsc2',fld:'vMACPRODSC2',pic:'',hsh:true},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV49TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV50TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV47TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV48TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV44TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV41TFLb_TipArtDsc',fld:'vTFLB_TIPARTDSC',pic:''},{av:'AV42TFLb_TipArtDsc_Sel',fld:'vTFLB_TIPARTDSC_SEL',pic:''},{av:'AV39TFLb_TipArt',fld:'vTFLB_TIPART',pic:'ZZZ9'},{av:'AV40TFLb_TipArt_To',fld:'vTFLB_TIPART_TO',pic:'ZZZ9'},{av:'AV37TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV38TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV35TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV36TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV29TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221K12',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV9Seleccion',fld:'vSELECCION',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e171K12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV6MacProCod',fld:'vMACPROCOD',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV36TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV37TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV38TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV39TFLb_TipArt',fld:'vTFLB_TIPART',pic:'ZZZ9'},{av:'AV40TFLb_TipArt_To',fld:'vTFLB_TIPART_TO',pic:'ZZZ9'},{av:'AV41TFLb_TipArtDsc',fld:'vTFLB_TIPARTDSC',pic:''},{av:'AV42TFLb_TipArtDsc_Sel',fld:'vTFLB_TIPARTDSC_SEL',pic:''},{av:'AV43TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV44TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV47TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV48TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV49TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV50TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8MacProDsc2',fld:'vMACPRODSC2',pic:'',hsh:true},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccion.getVisible()',ctrl:'vSELECCION',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_TipArt_Visible',ctrl:'LB_TIPART',prop:'Visible'},{av:'edtLb_TipArtD_Visible',ctrl:'LB_TIPARTD',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e131K12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV6MacProCod',fld:'vMACPROCOD',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV36TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV37TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV38TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV39TFLb_TipArt',fld:'vTFLB_TIPART',pic:'ZZZ9'},{av:'AV40TFLb_TipArt_To',fld:'vTFLB_TIPART_TO',pic:'ZZZ9'},{av:'AV41TFLb_TipArtDsc',fld:'vTFLB_TIPARTDSC',pic:''},{av:'AV42TFLb_TipArtDsc_Sel',fld:'vTFLB_TIPARTDSC_SEL',pic:''},{av:'AV43TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV44TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV47TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV48TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV49TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV50TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8MacProDsc2',fld:'vMACPRODSC2',pic:'',hsh:true},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV34TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV36TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV37TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV38TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV39TFLb_TipArt',fld:'vTFLB_TIPART',pic:'ZZZ9'},{av:'AV40TFLb_TipArt_To',fld:'vTFLB_TIPART_TO',pic:'ZZZ9'},{av:'AV41TFLb_TipArtDsc',fld:'vTFLB_TIPARTDSC',pic:''},{av:'AV42TFLb_TipArtDsc_Sel',fld:'vTFLB_TIPARTDSC_SEL',pic:''},{av:'AV43TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV44TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV45TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV46TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV47TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV48TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV49TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV50TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccion.getVisible()',ctrl:'vSELECCION',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_TipArt_Visible',ctrl:'LB_TIPART',prop:'Visible'},{av:'edtLb_TipArtD_Visible',ctrl:'LB_TIPARTD',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e231K11',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e181K12',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV9Seleccion',fld:'vSELECCION',grid:62,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_62',ctrl:'GRID',grid:62,prop:'GridRC',grid:62},{av:'A396EmprCod',fld:'EMPRCOD',grid:62,pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',grid:62,pic:'ZZZZZZZ9'},{av:'AV6MacProCod',fld:'vMACPROCOD',pic:''},{av:'AV8MacProDsc2',fld:'vMACPRODSC2',pic:'',hsh:true},{av:'AV7MacProDsc',fld:'vMACPRODSC',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV6MacProCod',fld:'vMACPROCOD',pic:''},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e191K12',iparms:[{av:'AV8MacProDsc2',fld:'vMACPRODSC2',pic:'',hsh:true},{av:'AV7MacProDsc',fld:'vMACPRODSC',pic:''},{av:'AV6MacProCod',fld:'vMACPROCOD',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e111K11',iparms:[]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e121K11',iparms:[]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Tipcoldsc',iparms:[]");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV6MacProCod = "" ;
      wcpOAV7MacProDsc = "" ;
      wcpOAV8MacProDsc2 = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5EmprCod = "" ;
      AV6MacProCod = "" ;
      AV7MacProDsc = "" ;
      AV8MacProDsc2 = "" ;
      AV20FilterFullText = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV33TFCliNom = "" ;
      AV34TFCliNom_Sel = "" ;
      AV35TFLb_ArtCod = "" ;
      AV36TFLb_ArtCod_Sel = "" ;
      AV37TFLb_ArtDsc = "" ;
      AV38TFLb_ArtDsc_Sel = "" ;
      AV41TFLb_TipArtDsc = "" ;
      AV42TFLb_TipArtDsc_Sel = "" ;
      AV43TFLb_ColNom = "" ;
      AV44TFLb_ColNom_Sel = "" ;
      AV49TFTipColDsc = "" ;
      AV50TFTipColDsc_Sel = "" ;
      AV83Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV26ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV51DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
      ucDvpanel_panelacciones = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9Seleccion = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5552Lb_TipArtD = "" ;
      A5536Lb_ColNom = "" ;
      A832TipColDsc = "" ;
      scmdbuf = "" ;
      lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = "" ;
      lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = "" ;
      lV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = "" ;
      lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = "" ;
      lV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = "" ;
      lV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = "" ;
      lV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = "" ;
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = "" ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = "" ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = "" ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = "" ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = "" ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = "" ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = "" ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = "" ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = "" ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = "" ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = "" ;
      AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = "" ;
      AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = "" ;
      A1514MacProCod = "" ;
      H01K12_A1514MacProCod = new String[] {""} ;
      H01K12_n1514MacProCod = new boolean[] {false} ;
      H01K12_A832TipColDsc = new String[] {""} ;
      H01K12_n832TipColDsc = new boolean[] {false} ;
      H01K12_A831TipColCod = new byte[1] ;
      H01K12_n831TipColCod = new boolean[] {false} ;
      H01K12_A5537Lb_ColNum = new int[1] ;
      H01K12_A5536Lb_ColNom = new String[] {""} ;
      H01K12_A5552Lb_TipArtD = new String[] {""} ;
      H01K12_A5535Lb_TipArt = new short[1] ;
      H01K12_A5534Lb_ArtDsc = new String[] {""} ;
      H01K12_A5533Lb_ArtCod = new String[] {""} ;
      H01K12_A279CliNom = new String[] {""} ;
      H01K12_A252CliCod = new int[1] ;
      H01K12_A407EmprNom = new String[] {""} ;
      H01K12_n407EmprNom = new boolean[] {false} ;
      H01K12_A5532Lb_numero = new int[1] ;
      H01K12_A396EmprCod = new String[] {""} ;
      H01K13_AGRID_nRecordCount = new long[1] ;
      AV57Station = "" ;
      AV58Emprnom = "" ;
      AV59Usurcod = "" ;
      AV12HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV21ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV27ManageFiltersXml = "" ;
      AV22UserCustomValue = "" ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char18 = "" ;
      GXt_char16 = "" ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      GXv_char19 = new String[1] ;
      GXv_int21 = new int[1] ;
      GXv_char17 = new String[1] ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cambiodenumerodeprogramaenensayos__default(),
         new Object[] {
             new Object[] {
            H01K12_A1514MacProCod, H01K12_n1514MacProCod, H01K12_A832TipColDsc, H01K12_n832TipColDsc, H01K12_A831TipColCod, H01K12_n831TipColCod, H01K12_A5537Lb_ColNum, H01K12_A5536Lb_ColNom, H01K12_A5552Lb_TipArtD, H01K12_A5535Lb_TipArt,
            H01K12_A5534Lb_ArtDsc, H01K12_A5533Lb_ArtCod, H01K12_A279CliNom, H01K12_A252CliCod, H01K12_A407EmprNom, H01K12_n407EmprNom, H01K12_A5532Lb_numero, H01K12_A396EmprCod
            }
            , new Object[] {
            H01K13_AGRID_nRecordCount
            }
         }
      );
      AV83Pgmname = "FormulacionTinte.CambiodeNumerodeProgramaenEnsayos" ;
      /* GeneXus formulas. */
      AV83Pgmname = "FormulacionTinte.CambiodeNumerodeProgramaenEnsayos" ;
      Gx_err = (short)(0) ;
      edtavMacprocod_Enabled = 0 ;
      edtavMacprodsc_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV28ManageFiltersExecutionStep ;
   private byte AV47TFTipColCod ;
   private byte AV48TFTipColCod_To ;
   private byte gxajaxcallmode ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod ;
   private byte AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV39TFLb_TipArt ;
   private short AV40TFLb_TipArt_To ;
   private short AV17OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A5535Lb_TipArt ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart ;
   private short AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_62 ;
   private int nGXsfl_62_idx=1 ;
   private int AV29TFLb_numero ;
   private int AV30TFLb_numero_To ;
   private int AV31TFCliCod ;
   private int AV32TFCliCod_To ;
   private int AV45TFLb_ColNum ;
   private int AV46TFLb_ColNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int subGrid_Islastpage ;
   private int edtavMacprocod_Enabled ;
   private int edtavMacprodsc_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero ;
   private int AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to ;
   private int AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod ;
   private int AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to ;
   private int AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum ;
   private int AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to ;
   private int edtLb_numero_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtLb_ArtCod_Visible ;
   private int edtLb_ArtDsc_Visible ;
   private int edtLb_TipArt_Visible ;
   private int edtLb_TipArtD_Visible ;
   private int edtLb_ColNom_Visible ;
   private int edtLb_ColNum_Visible ;
   private int edtTipColCod_Visible ;
   private int edtTipColDsc_Visible ;
   private int AV52PageToGo ;
   private int AV84GXV1 ;
   private int nGXsfl_62_fel_idx=1 ;
   private int GXv_int21[] ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV53GridCurrentPage ;
   private long AV54GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV6MacProCod ;
   private String wcpOAV7MacProDsc ;
   private String wcpOAV8MacProDsc2 ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5EmprCod ;
   private String AV6MacProCod ;
   private String AV7MacProDsc ;
   private String AV8MacProDsc2 ;
   private String sGXsfl_62_idx="0001" ;
   private String AV33TFCliNom ;
   private String AV34TFCliNom_Sel ;
   private String AV35TFLb_ArtCod ;
   private String AV36TFLb_ArtCod_Sel ;
   private String AV37TFLb_ArtDsc ;
   private String AV38TFLb_ArtDsc_Sel ;
   private String AV41TFLb_TipArtDsc ;
   private String AV42TFLb_TipArtDsc_Sel ;
   private String AV43TFLb_ColNom ;
   private String AV44TFLb_ColNom_Sel ;
   private String AV49TFTipColDsc ;
   private String AV50TFTipColDsc_Sel ;
   private String AV83Pgmname ;
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
   private String Dvpanel_panelacciones_Width ;
   private String Dvpanel_panelacciones_Cls ;
   private String Dvpanel_panelacciones_Title ;
   private String Dvpanel_panelacciones_Iconposition ;
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
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
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
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String Dvpanel_panelacciones_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV9Seleccion ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtLb_numero_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A5533Lb_ArtCod ;
   private String edtLb_ArtCod_Internalname ;
   private String A5534Lb_ArtDsc ;
   private String edtLb_ArtDsc_Internalname ;
   private String edtLb_TipArt_Internalname ;
   private String A5552Lb_TipArtD ;
   private String edtLb_TipArtD_Internalname ;
   private String A5536Lb_ColNom ;
   private String edtLb_ColNom_Internalname ;
   private String edtLb_ColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavMacprocod_Internalname ;
   private String edtavMacprodsc_Internalname ;
   private String scmdbuf ;
   private String lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ;
   private String lV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ;
   private String lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ;
   private String lV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ;
   private String lV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ;
   private String lV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ;
   private String AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ;
   private String AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ;
   private String AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ;
   private String AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ;
   private String AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ;
   private String AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ;
   private String AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ;
   private String AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ;
   private String AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ;
   private String AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ;
   private String AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ;
   private String AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ;
   private String A1514MacProCod ;
   private String AV57Station ;
   private String AV58Emprnom ;
   private String AV59Usurcod ;
   private String GXt_char18 ;
   private String GXt_char16 ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String sGXsfl_62_fel_idx="0001" ;
   private String GXv_char19[] ;
   private String GXv_char17[] ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblPanelacciones_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String edtavMacprocod_Jsonclick ;
   private String edtavMacprodsc_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtLb_numero_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtLb_ArtCod_Jsonclick ;
   private String edtLb_ArtDsc_Jsonclick ;
   private String edtLb_TipArt_Jsonclick ;
   private String edtLb_TipArtD_Jsonclick ;
   private String edtLb_ColNom_Jsonclick ;
   private String edtLb_ColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtTipColDsc_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV18OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_panelacciones_Autowidth ;
   private boolean Dvpanel_panelacciones_Autoheight ;
   private boolean Dvpanel_panelacciones_Collapsible ;
   private boolean Dvpanel_panelacciones_Collapsed ;
   private boolean Dvpanel_panelacciones_Showcollapseicon ;
   private boolean Dvpanel_panelacciones_Autoscroll ;
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
   private boolean n407EmprNom ;
   private boolean n831TipColCod ;
   private boolean n832TipColDsc ;
   private boolean bGXsfl_62_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n1514MacProCod ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV21ColumnsSelectorXML ;
   private String AV27ManageFiltersXml ;
   private String AV22UserCustomValue ;
   private String AV20FilterFullText ;
   private String lV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ;
   private String AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelacciones ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private ICheckbox chkavSeleccion ;
   private IDataStoreProvider pr_default ;
   private String[] H01K12_A1514MacProCod ;
   private boolean[] H01K12_n1514MacProCod ;
   private String[] H01K12_A832TipColDsc ;
   private boolean[] H01K12_n832TipColDsc ;
   private byte[] H01K12_A831TipColCod ;
   private boolean[] H01K12_n831TipColCod ;
   private int[] H01K12_A5537Lb_ColNum ;
   private String[] H01K12_A5536Lb_ColNom ;
   private String[] H01K12_A5552Lb_TipArtD ;
   private short[] H01K12_A5535Lb_TipArt ;
   private String[] H01K12_A5534Lb_ArtDsc ;
   private String[] H01K12_A5533Lb_ArtCod ;
   private String[] H01K12_A279CliNom ;
   private int[] H01K12_A252CliCod ;
   private String[] H01K12_A407EmprNom ;
   private boolean[] H01K12_n407EmprNom ;
   private int[] H01K12_A5532Lb_numero ;
   private String[] H01K12_A396EmprCod ;
   private long[] H01K13_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV26ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV51DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class cambiodenumerodeprogramaenensayos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01K12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                          int AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero ,
                                          int AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to ,
                                          int AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod ,
                                          int AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to ,
                                          String AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                          String AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                          String AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                          String AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                          String AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                          String AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                          short AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart ,
                                          short AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to ,
                                          String AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                          String AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                          String AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                          String AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                          int AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum ,
                                          int AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to ,
                                          byte AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod ,
                                          byte AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to ,
                                          String AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                          String AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          short A5535Lb_TipArt ,
                                          String A5552Lb_TipArtD ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String A1514MacProCod ,
                                          String AV6MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[39];
      Object[] GXv_Object23 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.MacProCod, T4.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_TipArtD, T1.Lb_TipArt, T1.Lb_ArtDsc, T1.Lb_ArtCod, T3.CliNom, T1.CliCod, T2.EmprNom," ;
      sSelectString += " T1.Lb_numero, T1.EmprCod" ;
      sFromString = " FROM (((TXPENS001 T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN" ;
      sFromString += " TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_TipArt,'9990'), 2) like '%' || ?) or ( UPPER(T1.Lb_TipArtD) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T4.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
         GXv_int22[2] = (byte)(1) ;
         GXv_int22[3] = (byte)(1) ;
         GXv_int22[4] = (byte)(1) ;
         GXv_int22[5] = (byte)(1) ;
         GXv_int22[6] = (byte)(1) ;
         GXv_int22[7] = (byte)(1) ;
         GXv_int22[8] = (byte)(1) ;
         GXv_int22[9] = (byte)(1) ;
         GXv_int22[10] = (byte)(1) ;
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt >= ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt <= ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_TipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArtD = ?)");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( AV17OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.MacProCod" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_TipArt" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_TipArt DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_TipArtD" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_TipArtD DESC" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Lb_numero" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H01K13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                          int AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero ,
                                          int AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to ,
                                          int AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod ,
                                          int AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to ,
                                          String AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                          String AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                          String AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                          String AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                          String AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                          String AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                          short AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart ,
                                          short AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to ,
                                          String AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                          String AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                          String AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                          String AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                          int AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum ,
                                          int AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to ,
                                          byte AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod ,
                                          byte AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to ,
                                          String AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                          String AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          short A5535Lb_TipArt ,
                                          String A5552Lb_TipArtD ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String A1514MacProCod ,
                                          String AV6MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[34];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPENS001 T1 INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_TipArt,'9990'), 2) like '%' || ?) or ( UPPER(T1.Lb_TipArtD) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T4.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int24[1] = (byte)(1) ;
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
      if ( ! (0==AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt >= ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt <= ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_TipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArtD = ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV17OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_H01K12(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() , (String)dynConstraints[36] , (String)dynConstraints[37] );
            case 1 :
                  return conditional_H01K13(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() , (String)dynConstraints[36] , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01K12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 13);
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 3);
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
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
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
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               return;
      }
   }

}

