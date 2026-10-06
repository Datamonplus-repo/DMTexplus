package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetasdeacabado03_wp_impl extends GXDataArea
{
   public recetasdeacabado03_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetasdeacabado03_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado03_wp_impl.class ));
   }

   public recetasdeacabado03_wp_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGrupodeacciones = new HTMLChoice();
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV19FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV29ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24ColumnsSelector);
      AV30TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV31TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV32TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV33TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV34TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV35TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV46TFRecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "TFRecLinMaq"))) ;
      AV47TFRecLinMaq_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLinMaq_To"))) ;
      AV48TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV49TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV71TFRecTotKgs = CommonUtil.decimalVal( httpContext.GetPar( "TFRecTotKgs"), ".") ;
      AV72TFRecTotKgs_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecTotKgs_To"), ".") ;
      AV73TFRecFA = CommonUtil.decimalVal( httpContext.GetPar( "TFRecFA"), ".") ;
      AV74TFRecFA_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecFA_To"), ".") ;
      AV50TFRecVolPrd = (int)(GXutil.lval( httpContext.GetPar( "TFRecVolPrd"))) ;
      AV51TFRecVolPrd_To = (int)(GXutil.lval( httpContext.GetPar( "TFRecVolPrd_To"))) ;
      AV52TFRecFecAlt = localUtil.parseDTimeParm( httpContext.GetPar( "TFRecFecAlt")) ;
      AV56TFRecUsrCod = httpContext.GetPar( "TFRecUsrCod") ;
      AV57TFRecUsrCod_Sel = httpContext.GetPar( "TFRecUsrCod_Sel") ;
      AV58TFRecFecMod = localUtil.parseDTimeParm( httpContext.GetPar( "TFRecFecMod")) ;
      AV62TFRecUsrMod = httpContext.GetPar( "TFRecUsrMod") ;
      AV63TFRecUsrMod_Sel = httpContext.GetPar( "TFRecUsrMod_Sel") ;
      AV102Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV17OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV7EmprCod = httpContext.GetPar( "EmprCod") ;
      AV5UsurCod = httpContext.GetPar( "UsurCod") ;
      AV6Station = httpContext.GetPar( "Station") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV46TFRecLinMaq, AV47TFRecLinMaq_To, AV48TFMaqCod, AV49TFMaqCod_Sel, AV71TFRecTotKgs, AV72TFRecTotKgs_To, AV73TFRecFA, AV74TFRecFA_To, AV50TFRecVolPrd, AV51TFRecVolPrd_To, AV52TFRecFecAlt, AV56TFRecUsrCod, AV57TFRecUsrCod_Sel, AV58TFRecFecMod, AV62TFRecUsrMod, AV63TFRecUsrMod_Sel, AV102Pgmname, AV16OrderedBy, AV17OrderedDsc, AV7EmprCod, AV5UsurCod, AV6Station) ;
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
      pa1HJ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1HJ2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdeacabado03_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV19FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV66GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV67GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV64DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV64DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV29ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR", GXutil.rtrim( AV30TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR_SEL", GXutil.rtrim( AV31TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV32TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV33TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC", GXutil.rtrim( AV34TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC_SEL", GXutil.rtrim( AV35TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV46TFRecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINMAQ_TO", GXutil.ltrim( localUtil.ntoc( AV47TFRecLinMaq_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD", GXutil.rtrim( AV48TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD_SEL", GXutil.rtrim( AV49TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECTOTKGS", GXutil.ltrim( localUtil.ntoc( AV71TFRecTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECTOTKGS_TO", GXutil.ltrim( localUtil.ntoc( AV72TFRecTotKgs_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFA", GXutil.ltrim( localUtil.ntoc( AV73TFRecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFA_TO", GXutil.ltrim( localUtil.ntoc( AV74TFRecFA_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECVOLPRD", GXutil.ltrim( localUtil.ntoc( AV50TFRecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECVOLPRD_TO", GXutil.ltrim( localUtil.ntoc( AV51TFRecVolPrd_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFECALT", localUtil.ttoc( AV52TFRecFecAlt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECUSRCOD", GXutil.rtrim( AV56TFRecUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECUSRCOD_SEL", GXutil.rtrim( AV57TFRecUsrCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFECMOD", localUtil.ttoc( AV58TFRecFecMod, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECUSRMOD", GXutil.rtrim( AV62TFRecUsrMod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECUSRMOD_SEL", GXutil.rtrim( AV63TFRecUsrMod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV102Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV16OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV17OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV14GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV69ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV5UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV6Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV103Emprcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV104Barcod_selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV105Barcodreo_selected, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR_SELECTED", GXutil.rtrim( AV106Barcodpar_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ_SELECTED", GXutil.ltrim( localUtil.ntoc( AV107Reclinmaq_selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
         we1HJ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1HJ2( ) ;
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
      return formatLink("app.recetasdeacabado03_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "RecetasdeAcabado03_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas de Acabado (Mto)", "") ;
   }

   public void wb1HJ0( )
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
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado03_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado03_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado03_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1HJ2( true) ;
      }
      else
      {
         wb_table1_23_1HJ2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1HJ2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV66GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV67GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV64DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV64DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV24ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_69_1HJ2( true) ;
      }
      else
      {
         wb_table2_69_1HJ2( false) ;
      }
      return  ;
   }

   public void wb_table2_69_1HJ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_recfecaltauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_recfecaltauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_recfecaltauxdate_Internalname, localUtil.format(AV54DDO_RecFecAltAuxDate, "99/99/99"), localUtil.format( AV54DDO_RecFecAltAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_recfecaltauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado03_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_recfecaltauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RecetasdeAcabado03_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_recfecmodauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_recfecmodauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_recfecmodauxdate_Internalname, localUtil.format(AV60DDO_RecFecModAuxDate, "99/99/99"), localUtil.format( AV60DDO_RecFecModAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_recfecmodauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado03_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_recfecmodauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RecetasdeAcabado03_WP.htm");
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

   public void start1HJ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recetas de Acabado (Mto)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1HJ0( ) ;
   }

   public void ws1HJ2( )
   {
      start1HJ2( ) ;
      evt1HJ2( ) ;
   }

   public void evt1HJ2( )
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
                           e111HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e171HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e181HJ2 ();
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
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV68GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68GrupodeAcciones), 4, 0));
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A4259RecTotKgs = localUtil.ctond( httpContext.cgiGet( edtRecTotKgs_Internalname)) ;
                           A2806RecFA = localUtil.ctond( httpContext.cgiGet( edtRecFA_Internalname)) ;
                           A2805RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4866RecFecAlt = localUtil.ctot( httpContext.cgiGet( edtRecFecAlt_Internalname), 0) ;
                           n4866RecFecAlt = false ;
                           A4402RecUsrCod = httpContext.cgiGet( edtRecUsrCod_Internalname) ;
                           A4867RecFecMod = localUtil.ctot( httpContext.cgiGet( edtRecFecMod_Internalname), 0) ;
                           n4867RecFecMod = false ;
                           A4868RecUsrMod = GXutil.upper( httpContext.cgiGet( edtRecUsrMod_Internalname)) ;
                           n4868RecUsrMod = false ;
                           A9812RecHdrLts = httpContext.cgiGet( edtRecHdrLts_Internalname) ;
                           n9812RecHdrLts = false ;
                           A9764RecLtsSR = (int)(localUtil.ctol( httpContext.cgiGet( edtRecLtsSR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9764RecLtsSR = false ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e191HJ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e201HJ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e211HJ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV19FilterFullText) != 0 )
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

   public void we1HJ2( )
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

   public void pa1HJ2( )
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
                                 String AV19FilterFullText ,
                                 byte AV29ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ,
                                 String AV30TFBarNHdr ,
                                 String AV31TFBarNHdr_Sel ,
                                 String AV32TFBarSer ,
                                 String AV33TFBarSer_Sel ,
                                 String AV34TFBarSerDsc ,
                                 String AV35TFBarSerDsc_Sel ,
                                 short AV46TFRecLinMaq ,
                                 short AV47TFRecLinMaq_To ,
                                 String AV48TFMaqCod ,
                                 String AV49TFMaqCod_Sel ,
                                 java.math.BigDecimal AV71TFRecTotKgs ,
                                 java.math.BigDecimal AV72TFRecTotKgs_To ,
                                 java.math.BigDecimal AV73TFRecFA ,
                                 java.math.BigDecimal AV74TFRecFA_To ,
                                 int AV50TFRecVolPrd ,
                                 int AV51TFRecVolPrd_To ,
                                 java.util.Date AV52TFRecFecAlt ,
                                 String AV56TFRecUsrCod ,
                                 String AV57TFRecUsrCod_Sel ,
                                 java.util.Date AV58TFRecFecMod ,
                                 String AV62TFRecUsrMod ,
                                 String AV63TFRecUsrMod_Sel ,
                                 String AV102Pgmname ,
                                 short AV16OrderedBy ,
                                 boolean AV17OrderedDsc ,
                                 String AV7EmprCod ,
                                 String AV5UsurCod ,
                                 String AV6Station )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201HJ2 ();
      GRID_nCurrentRecord = 0 ;
      rf1HJ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13696BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNHDR", GXutil.rtrim( A13696BarNHdr));
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
      rf1HJ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV102Pgmname = "RecetasdeAcabado03_WP" ;
      Gx_err = (short)(0) ;
   }

   public void rf1HJ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e201HJ2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
                                              AV79Recetasdeacabado03_wpds_1_filterfulltext ,
                                              AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                              AV80Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                              AV83Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                              AV82Recetasdeacabado03_wpds_4_tfbarser ,
                                              AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                              AV84Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                              Short.valueOf(AV86Recetasdeacabado03_wpds_8_tfreclinmaq) ,
                                              Short.valueOf(AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to) ,
                                              AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                              AV88Recetasdeacabado03_wpds_10_tfmaqcod ,
                                              AV90Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                              AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                              AV92Recetasdeacabado03_wpds_14_tfrecfa ,
                                              AV93Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                              Integer.valueOf(AV94Recetasdeacabado03_wpds_16_tfrecvolprd) ,
                                              Integer.valueOf(AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to) ,
                                              AV96Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                              AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                              AV97Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                              AV99Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                              AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                              AV100Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              Short.valueOf(A2804RecLinMaq) ,
                                              A602MaqCod ,
                                              A4259RecTotKgs ,
                                              A2806RecFA ,
                                              Integer.valueOf(A2805RecVolPrd) ,
                                              A4402RecUsrCod ,
                                              A4868RecUsrMod ,
                                              A4866RecFecAlt ,
                                              A4867RecFecMod ,
                                              Short.valueOf(AV16OrderedBy) ,
                                              Boolean.valueOf(AV17OrderedDsc) ,
                                              A6039RecAcab } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         });
         lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
         lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
         lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
         lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
         lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
         lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
         lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
         lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
         lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
         lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
         lV80Recetasdeacabado03_wpds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV80Recetasdeacabado03_wpds_2_tfbarnhdr), 11, "%") ;
         lV82Recetasdeacabado03_wpds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV82Recetasdeacabado03_wpds_4_tfbarser), 16, "%") ;
         lV84Recetasdeacabado03_wpds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Recetasdeacabado03_wpds_6_tfbarserdsc), 26, "%") ;
         lV88Recetasdeacabado03_wpds_10_tfmaqcod = GXutil.padr( GXutil.rtrim( AV88Recetasdeacabado03_wpds_10_tfmaqcod), 6, "%") ;
         lV97Recetasdeacabado03_wpds_19_tfrecusrcod = GXutil.padr( GXutil.rtrim( AV97Recetasdeacabado03_wpds_19_tfrecusrcod), 8, "%") ;
         lV100Recetasdeacabado03_wpds_22_tfrecusrmod = GXutil.padr( GXutil.rtrim( AV100Recetasdeacabado03_wpds_22_tfrecusrmod), 8, "%") ;
         /* Using cursor H01HJ2 */
         pr_default.execute(0, new Object[] {lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV80Recetasdeacabado03_wpds_2_tfbarnhdr, AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel, lV82Recetasdeacabado03_wpds_4_tfbarser, AV83Recetasdeacabado03_wpds_5_tfbarser_sel, lV84Recetasdeacabado03_wpds_6_tfbarserdsc, AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel, Short.valueOf(AV86Recetasdeacabado03_wpds_8_tfreclinmaq), Short.valueOf(AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to), lV88Recetasdeacabado03_wpds_10_tfmaqcod, AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel, AV90Recetasdeacabado03_wpds_12_tfrectotkgs, AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to, AV92Recetasdeacabado03_wpds_14_tfrecfa, AV93Recetasdeacabado03_wpds_15_tfrecfa_to, Integer.valueOf(AV94Recetasdeacabado03_wpds_16_tfrecvolprd), Integer.valueOf(AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to), AV96Recetasdeacabado03_wpds_18_tfrecfecalt, lV97Recetasdeacabado03_wpds_19_tfrecusrcod, AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel, AV99Recetasdeacabado03_wpds_21_tfrecfecmod, lV100Recetasdeacabado03_wpds_22_tfrecusrmod, AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A6039RecAcab = H01HJ2_A6039RecAcab[0] ;
            n6039RecAcab = H01HJ2_n6039RecAcab[0] ;
            A396EmprCod = H01HJ2_A396EmprCod[0] ;
            A9764RecLtsSR = H01HJ2_A9764RecLtsSR[0] ;
            n9764RecLtsSR = H01HJ2_n9764RecLtsSR[0] ;
            A9812RecHdrLts = H01HJ2_A9812RecHdrLts[0] ;
            n9812RecHdrLts = H01HJ2_n9812RecHdrLts[0] ;
            A4868RecUsrMod = H01HJ2_A4868RecUsrMod[0] ;
            n4868RecUsrMod = H01HJ2_n4868RecUsrMod[0] ;
            A4867RecFecMod = H01HJ2_A4867RecFecMod[0] ;
            n4867RecFecMod = H01HJ2_n4867RecFecMod[0] ;
            A4402RecUsrCod = H01HJ2_A4402RecUsrCod[0] ;
            A4866RecFecAlt = H01HJ2_A4866RecFecAlt[0] ;
            n4866RecFecAlt = H01HJ2_n4866RecFecAlt[0] ;
            A2805RecVolPrd = H01HJ2_A2805RecVolPrd[0] ;
            A2806RecFA = H01HJ2_A2806RecFA[0] ;
            A4259RecTotKgs = H01HJ2_A4259RecTotKgs[0] ;
            A602MaqCod = H01HJ2_A602MaqCod[0] ;
            A2804RecLinMaq = H01HJ2_A2804RecLinMaq[0] ;
            A1652BarSerDsc = H01HJ2_A1652BarSerDsc[0] ;
            A212BarSer = H01HJ2_A212BarSer[0] ;
            A130BarCodPar = H01HJ2_A130BarCodPar[0] ;
            A132BarCodReo = H01HJ2_A132BarCodReo[0] ;
            A129BarCod = H01HJ2_A129BarCod[0] ;
            A1652BarSerDsc = H01HJ2_A1652BarSerDsc[0] ;
            A212BarSer = H01HJ2_A212BarSer[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e211HJ2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb1HJ0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1HJ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV102Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARNHDR"+"_"+sGXsfl_41_idx, getSecureSignedToken( sGXsfl_41_idx, GXutil.rtrim( localUtil.format( A13696BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV5UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV6Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
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
      AV79Recetasdeacabado03_wpds_1_filterfulltext = AV19FilterFullText ;
      AV80Recetasdeacabado03_wpds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV82Recetasdeacabado03_wpds_4_tfbarser = AV32TFBarSer ;
      AV83Recetasdeacabado03_wpds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV84Recetasdeacabado03_wpds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV86Recetasdeacabado03_wpds_8_tfreclinmaq = AV46TFRecLinMaq ;
      AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV47TFRecLinMaq_To ;
      AV88Recetasdeacabado03_wpds_10_tfmaqcod = AV48TFMaqCod ;
      AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV49TFMaqCod_Sel ;
      AV90Recetasdeacabado03_wpds_12_tfrectotkgs = AV71TFRecTotKgs ;
      AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV72TFRecTotKgs_To ;
      AV92Recetasdeacabado03_wpds_14_tfrecfa = AV73TFRecFA ;
      AV93Recetasdeacabado03_wpds_15_tfrecfa_to = AV74TFRecFA_To ;
      AV94Recetasdeacabado03_wpds_16_tfrecvolprd = AV50TFRecVolPrd ;
      AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV51TFRecVolPrd_To ;
      AV96Recetasdeacabado03_wpds_18_tfrecfecalt = AV52TFRecFecAlt ;
      AV97Recetasdeacabado03_wpds_19_tfrecusrcod = AV56TFRecUsrCod ;
      AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV57TFRecUsrCod_Sel ;
      AV99Recetasdeacabado03_wpds_21_tfrecfecmod = AV58TFRecFecMod ;
      AV100Recetasdeacabado03_wpds_22_tfrecusrmod = AV62TFRecUsrMod ;
      AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV63TFRecUsrMod_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV79Recetasdeacabado03_wpds_1_filterfulltext ,
                                           AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                           AV80Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                           AV83Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                           AV82Recetasdeacabado03_wpds_4_tfbarser ,
                                           AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                           AV84Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                           Short.valueOf(AV86Recetasdeacabado03_wpds_8_tfreclinmaq) ,
                                           Short.valueOf(AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to) ,
                                           AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                           AV88Recetasdeacabado03_wpds_10_tfmaqcod ,
                                           AV90Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                           AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                           AV92Recetasdeacabado03_wpds_14_tfrecfa ,
                                           AV93Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                           Integer.valueOf(AV94Recetasdeacabado03_wpds_16_tfrecvolprd) ,
                                           Integer.valueOf(AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to) ,
                                           AV96Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                           AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                           AV97Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                           AV99Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                           AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                           AV100Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A4259RecTotKgs ,
                                           A2806RecFA ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           A4866RecFecAlt ,
                                           A4867RecFecMod ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV79Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV80Recetasdeacabado03_wpds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV80Recetasdeacabado03_wpds_2_tfbarnhdr), 11, "%") ;
      lV82Recetasdeacabado03_wpds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV82Recetasdeacabado03_wpds_4_tfbarser), 16, "%") ;
      lV84Recetasdeacabado03_wpds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Recetasdeacabado03_wpds_6_tfbarserdsc), 26, "%") ;
      lV88Recetasdeacabado03_wpds_10_tfmaqcod = GXutil.padr( GXutil.rtrim( AV88Recetasdeacabado03_wpds_10_tfmaqcod), 6, "%") ;
      lV97Recetasdeacabado03_wpds_19_tfrecusrcod = GXutil.padr( GXutil.rtrim( AV97Recetasdeacabado03_wpds_19_tfrecusrcod), 8, "%") ;
      lV100Recetasdeacabado03_wpds_22_tfrecusrmod = GXutil.padr( GXutil.rtrim( AV100Recetasdeacabado03_wpds_22_tfrecusrmod), 8, "%") ;
      /* Using cursor H01HJ3 */
      pr_default.execute(1, new Object[] {lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV79Recetasdeacabado03_wpds_1_filterfulltext, lV80Recetasdeacabado03_wpds_2_tfbarnhdr, AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel, lV82Recetasdeacabado03_wpds_4_tfbarser, AV83Recetasdeacabado03_wpds_5_tfbarser_sel, lV84Recetasdeacabado03_wpds_6_tfbarserdsc, AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel, Short.valueOf(AV86Recetasdeacabado03_wpds_8_tfreclinmaq), Short.valueOf(AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to), lV88Recetasdeacabado03_wpds_10_tfmaqcod, AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel, AV90Recetasdeacabado03_wpds_12_tfrectotkgs, AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to, AV92Recetasdeacabado03_wpds_14_tfrecfa, AV93Recetasdeacabado03_wpds_15_tfrecfa_to, Integer.valueOf(AV94Recetasdeacabado03_wpds_16_tfrecvolprd), Integer.valueOf(AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to), AV96Recetasdeacabado03_wpds_18_tfrecfecalt, lV97Recetasdeacabado03_wpds_19_tfrecusrcod, AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel, AV99Recetasdeacabado03_wpds_21_tfrecfecmod, lV100Recetasdeacabado03_wpds_22_tfrecusrmod, AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel});
      GRID_nRecordCount = H01HJ3_AGRID_nRecordCount[0] ;
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
      AV79Recetasdeacabado03_wpds_1_filterfulltext = AV19FilterFullText ;
      AV80Recetasdeacabado03_wpds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV82Recetasdeacabado03_wpds_4_tfbarser = AV32TFBarSer ;
      AV83Recetasdeacabado03_wpds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV84Recetasdeacabado03_wpds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV86Recetasdeacabado03_wpds_8_tfreclinmaq = AV46TFRecLinMaq ;
      AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV47TFRecLinMaq_To ;
      AV88Recetasdeacabado03_wpds_10_tfmaqcod = AV48TFMaqCod ;
      AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV49TFMaqCod_Sel ;
      AV90Recetasdeacabado03_wpds_12_tfrectotkgs = AV71TFRecTotKgs ;
      AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV72TFRecTotKgs_To ;
      AV92Recetasdeacabado03_wpds_14_tfrecfa = AV73TFRecFA ;
      AV93Recetasdeacabado03_wpds_15_tfrecfa_to = AV74TFRecFA_To ;
      AV94Recetasdeacabado03_wpds_16_tfrecvolprd = AV50TFRecVolPrd ;
      AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV51TFRecVolPrd_To ;
      AV96Recetasdeacabado03_wpds_18_tfrecfecalt = AV52TFRecFecAlt ;
      AV97Recetasdeacabado03_wpds_19_tfrecusrcod = AV56TFRecUsrCod ;
      AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV57TFRecUsrCod_Sel ;
      AV99Recetasdeacabado03_wpds_21_tfrecfecmod = AV58TFRecFecMod ;
      AV100Recetasdeacabado03_wpds_22_tfrecusrmod = AV62TFRecUsrMod ;
      AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV63TFRecUsrMod_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV46TFRecLinMaq, AV47TFRecLinMaq_To, AV48TFMaqCod, AV49TFMaqCod_Sel, AV71TFRecTotKgs, AV72TFRecTotKgs_To, AV73TFRecFA, AV74TFRecFA_To, AV50TFRecVolPrd, AV51TFRecVolPrd_To, AV52TFRecFecAlt, AV56TFRecUsrCod, AV57TFRecUsrCod_Sel, AV58TFRecFecMod, AV62TFRecUsrMod, AV63TFRecUsrMod_Sel, AV102Pgmname, AV16OrderedBy, AV17OrderedDsc, AV7EmprCod, AV5UsurCod, AV6Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV79Recetasdeacabado03_wpds_1_filterfulltext = AV19FilterFullText ;
      AV80Recetasdeacabado03_wpds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV82Recetasdeacabado03_wpds_4_tfbarser = AV32TFBarSer ;
      AV83Recetasdeacabado03_wpds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV84Recetasdeacabado03_wpds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV86Recetasdeacabado03_wpds_8_tfreclinmaq = AV46TFRecLinMaq ;
      AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV47TFRecLinMaq_To ;
      AV88Recetasdeacabado03_wpds_10_tfmaqcod = AV48TFMaqCod ;
      AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV49TFMaqCod_Sel ;
      AV90Recetasdeacabado03_wpds_12_tfrectotkgs = AV71TFRecTotKgs ;
      AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV72TFRecTotKgs_To ;
      AV92Recetasdeacabado03_wpds_14_tfrecfa = AV73TFRecFA ;
      AV93Recetasdeacabado03_wpds_15_tfrecfa_to = AV74TFRecFA_To ;
      AV94Recetasdeacabado03_wpds_16_tfrecvolprd = AV50TFRecVolPrd ;
      AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV51TFRecVolPrd_To ;
      AV96Recetasdeacabado03_wpds_18_tfrecfecalt = AV52TFRecFecAlt ;
      AV97Recetasdeacabado03_wpds_19_tfrecusrcod = AV56TFRecUsrCod ;
      AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV57TFRecUsrCod_Sel ;
      AV99Recetasdeacabado03_wpds_21_tfrecfecmod = AV58TFRecFecMod ;
      AV100Recetasdeacabado03_wpds_22_tfrecusrmod = AV62TFRecUsrMod ;
      AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV63TFRecUsrMod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV46TFRecLinMaq, AV47TFRecLinMaq_To, AV48TFMaqCod, AV49TFMaqCod_Sel, AV71TFRecTotKgs, AV72TFRecTotKgs_To, AV73TFRecFA, AV74TFRecFA_To, AV50TFRecVolPrd, AV51TFRecVolPrd_To, AV52TFRecFecAlt, AV56TFRecUsrCod, AV57TFRecUsrCod_Sel, AV58TFRecFecMod, AV62TFRecUsrMod, AV63TFRecUsrMod_Sel, AV102Pgmname, AV16OrderedBy, AV17OrderedDsc, AV7EmprCod, AV5UsurCod, AV6Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV79Recetasdeacabado03_wpds_1_filterfulltext = AV19FilterFullText ;
      AV80Recetasdeacabado03_wpds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV82Recetasdeacabado03_wpds_4_tfbarser = AV32TFBarSer ;
      AV83Recetasdeacabado03_wpds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV84Recetasdeacabado03_wpds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV86Recetasdeacabado03_wpds_8_tfreclinmaq = AV46TFRecLinMaq ;
      AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV47TFRecLinMaq_To ;
      AV88Recetasdeacabado03_wpds_10_tfmaqcod = AV48TFMaqCod ;
      AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV49TFMaqCod_Sel ;
      AV90Recetasdeacabado03_wpds_12_tfrectotkgs = AV71TFRecTotKgs ;
      AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV72TFRecTotKgs_To ;
      AV92Recetasdeacabado03_wpds_14_tfrecfa = AV73TFRecFA ;
      AV93Recetasdeacabado03_wpds_15_tfrecfa_to = AV74TFRecFA_To ;
      AV94Recetasdeacabado03_wpds_16_tfrecvolprd = AV50TFRecVolPrd ;
      AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV51TFRecVolPrd_To ;
      AV96Recetasdeacabado03_wpds_18_tfrecfecalt = AV52TFRecFecAlt ;
      AV97Recetasdeacabado03_wpds_19_tfrecusrcod = AV56TFRecUsrCod ;
      AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV57TFRecUsrCod_Sel ;
      AV99Recetasdeacabado03_wpds_21_tfrecfecmod = AV58TFRecFecMod ;
      AV100Recetasdeacabado03_wpds_22_tfrecusrmod = AV62TFRecUsrMod ;
      AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV63TFRecUsrMod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV46TFRecLinMaq, AV47TFRecLinMaq_To, AV48TFMaqCod, AV49TFMaqCod_Sel, AV71TFRecTotKgs, AV72TFRecTotKgs_To, AV73TFRecFA, AV74TFRecFA_To, AV50TFRecVolPrd, AV51TFRecVolPrd_To, AV52TFRecFecAlt, AV56TFRecUsrCod, AV57TFRecUsrCod_Sel, AV58TFRecFecMod, AV62TFRecUsrMod, AV63TFRecUsrMod_Sel, AV102Pgmname, AV16OrderedBy, AV17OrderedDsc, AV7EmprCod, AV5UsurCod, AV6Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV79Recetasdeacabado03_wpds_1_filterfulltext = AV19FilterFullText ;
      AV80Recetasdeacabado03_wpds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV82Recetasdeacabado03_wpds_4_tfbarser = AV32TFBarSer ;
      AV83Recetasdeacabado03_wpds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV84Recetasdeacabado03_wpds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV86Recetasdeacabado03_wpds_8_tfreclinmaq = AV46TFRecLinMaq ;
      AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV47TFRecLinMaq_To ;
      AV88Recetasdeacabado03_wpds_10_tfmaqcod = AV48TFMaqCod ;
      AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV49TFMaqCod_Sel ;
      AV90Recetasdeacabado03_wpds_12_tfrectotkgs = AV71TFRecTotKgs ;
      AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV72TFRecTotKgs_To ;
      AV92Recetasdeacabado03_wpds_14_tfrecfa = AV73TFRecFA ;
      AV93Recetasdeacabado03_wpds_15_tfrecfa_to = AV74TFRecFA_To ;
      AV94Recetasdeacabado03_wpds_16_tfrecvolprd = AV50TFRecVolPrd ;
      AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV51TFRecVolPrd_To ;
      AV96Recetasdeacabado03_wpds_18_tfrecfecalt = AV52TFRecFecAlt ;
      AV97Recetasdeacabado03_wpds_19_tfrecusrcod = AV56TFRecUsrCod ;
      AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV57TFRecUsrCod_Sel ;
      AV99Recetasdeacabado03_wpds_21_tfrecfecmod = AV58TFRecFecMod ;
      AV100Recetasdeacabado03_wpds_22_tfrecusrmod = AV62TFRecUsrMod ;
      AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV63TFRecUsrMod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV46TFRecLinMaq, AV47TFRecLinMaq_To, AV48TFMaqCod, AV49TFMaqCod_Sel, AV71TFRecTotKgs, AV72TFRecTotKgs_To, AV73TFRecFA, AV74TFRecFA_To, AV50TFRecVolPrd, AV51TFRecVolPrd_To, AV52TFRecFecAlt, AV56TFRecUsrCod, AV57TFRecUsrCod_Sel, AV58TFRecFecMod, AV62TFRecUsrMod, AV63TFRecUsrMod_Sel, AV102Pgmname, AV16OrderedBy, AV17OrderedDsc, AV7EmprCod, AV5UsurCod, AV6Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV79Recetasdeacabado03_wpds_1_filterfulltext = AV19FilterFullText ;
      AV80Recetasdeacabado03_wpds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV82Recetasdeacabado03_wpds_4_tfbarser = AV32TFBarSer ;
      AV83Recetasdeacabado03_wpds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV84Recetasdeacabado03_wpds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV86Recetasdeacabado03_wpds_8_tfreclinmaq = AV46TFRecLinMaq ;
      AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV47TFRecLinMaq_To ;
      AV88Recetasdeacabado03_wpds_10_tfmaqcod = AV48TFMaqCod ;
      AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV49TFMaqCod_Sel ;
      AV90Recetasdeacabado03_wpds_12_tfrectotkgs = AV71TFRecTotKgs ;
      AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV72TFRecTotKgs_To ;
      AV92Recetasdeacabado03_wpds_14_tfrecfa = AV73TFRecFA ;
      AV93Recetasdeacabado03_wpds_15_tfrecfa_to = AV74TFRecFA_To ;
      AV94Recetasdeacabado03_wpds_16_tfrecvolprd = AV50TFRecVolPrd ;
      AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV51TFRecVolPrd_To ;
      AV96Recetasdeacabado03_wpds_18_tfrecfecalt = AV52TFRecFecAlt ;
      AV97Recetasdeacabado03_wpds_19_tfrecusrcod = AV56TFRecUsrCod ;
      AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV57TFRecUsrCod_Sel ;
      AV99Recetasdeacabado03_wpds_21_tfrecfecmod = AV58TFRecFecMod ;
      AV100Recetasdeacabado03_wpds_22_tfrecusrmod = AV62TFRecUsrMod ;
      AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV63TFRecUsrMod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV19FilterFullText, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV46TFRecLinMaq, AV47TFRecLinMaq_To, AV48TFMaqCod, AV49TFMaqCod_Sel, AV71TFRecTotKgs, AV72TFRecTotKgs_To, AV73TFRecFA, AV74TFRecFA_To, AV50TFRecVolPrd, AV51TFRecVolPrd_To, AV52TFRecFecAlt, AV56TFRecUsrCod, AV57TFRecUsrCod_Sel, AV58TFRecFecMod, AV62TFRecUsrMod, AV63TFRecUsrMod_Sel, AV102Pgmname, AV16OrderedBy, AV17OrderedDsc, AV7EmprCod, AV5UsurCod, AV6Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV102Pgmname = "RecetasdeAcabado03_WP" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1HJ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191HJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV27ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV64DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV24ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV66GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV67GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV69ImpCod = httpContext.cgiGet( "vIMPCOD") ;
         AV103Emprcod_selected = httpContext.cgiGet( "vEMPRCOD_SELECTED") ;
         AV104Barcod_selected = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV105Barcodreo_selected = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV106Barcodpar_selected = httpContext.cgiGet( "vBARCODPAR_SELECTED") ;
         AV107Reclinmaq_selected = (short)(localUtil.ctol( httpContext.cgiGet( "vRECLINMAQ_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         AV19FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_recfecaltauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RECFECALTAUXDATE");
            GX_FocusControl = edtavDdo_recfecaltauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54DDO_RecFecAltAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_RecFecAltAuxDate", localUtil.format(AV54DDO_RecFecAltAuxDate, "99/99/99"));
         }
         else
         {
            AV54DDO_RecFecAltAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_recfecaltauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_RecFecAltAuxDate", localUtil.format(AV54DDO_RecFecAltAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_recfecmodauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RECFECMODAUXDATE");
            GX_FocusControl = edtavDdo_recfecmodauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60DDO_RecFecModAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60DDO_RecFecModAuxDate", localUtil.format(AV60DDO_RecFecModAuxDate, "99/99/99"));
         }
         else
         {
            AV60DDO_RecFecModAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_recfecmodauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60DDO_RecFecModAuxDate", localUtil.format(AV60DDO_RecFecModAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_41_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         if ( nGXsfl_41_idx > 0 )
         {
            cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
            cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
            AV68GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68GrupodeAcciones), 4, 0));
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            A4259RecTotKgs = localUtil.ctond( httpContext.cgiGet( edtRecTotKgs_Internalname)) ;
            A2806RecFA = localUtil.ctond( httpContext.cgiGet( edtRecFA_Internalname)) ;
            A2805RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4866RecFecAlt = localUtil.ctot( httpContext.cgiGet( edtRecFecAlt_Internalname)) ;
            n4866RecFecAlt = false ;
            A4402RecUsrCod = httpContext.cgiGet( edtRecUsrCod_Internalname) ;
            A4867RecFecMod = localUtil.ctot( httpContext.cgiGet( edtRecFecMod_Internalname)) ;
            n4867RecFecMod = false ;
            A4868RecUsrMod = GXutil.upper( httpContext.cgiGet( edtRecUsrMod_Internalname)) ;
            n4868RecUsrMod = false ;
            A9812RecHdrLts = httpContext.cgiGet( edtRecHdrLts_Internalname) ;
            n9812RecHdrLts = false ;
            A9764RecLtsSR = (int)(localUtil.ctol( httpContext.cgiGet( edtRecLtsSR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9764RecLtsSR = false ;
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV19FilterFullText) != 0 )
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
      e191HJ2 ();
      if (returnInSub) return;
   }

   public void e191HJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV5UsurCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5UsurCod", AV5UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5UsurCod, "@!"))));
      GXt_char1 = AV6Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetasdeacabado03_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV6Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Station", AV6Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV5UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV6Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetasdeacabado03_wp_impl.this.AV7EmprCod = GXv_char2[0] ;
      recetasdeacabado03_wp_impl.this.AV8EmprNom = GXv_char3[0] ;
      recetasdeacabado03_wp_impl.this.AV5UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV5UsurCod", AV5UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5UsurCod, "@!"))));
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV77Carvitin)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      recetasdeacabado03_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV77Carvitin = DecimalUtil.doubleToDec(GXt_int5) ;
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV78Automata)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "AUTOMA", ""), GXv_int6) ;
      recetasdeacabado03_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV78Automata = DecimalUtil.doubleToDec(GXt_int5) ;
      GXt_char1 = AV6Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetasdeacabado03_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV6Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Station", AV6Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV5UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV6Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetasdeacabado03_wp_impl.this.AV7EmprCod = GXv_char4[0] ;
      recetasdeacabado03_wp_impl.this.AV8EmprNom = GXv_char3[0] ;
      recetasdeacabado03_wp_impl.this.AV5UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV5UsurCod", AV5UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5UsurCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      if ( GXutil.strcmp(AV11HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Recetas de Acabado (Mto)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV16OrderedBy < 1 )
      {
         AV16OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV64DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV64DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201HJ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV10WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV29ManageFiltersExecutionStep == 1 )
      {
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV29ManageFiltersExecutionStep == 2 )
      {
         AV29ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV26Session.getValue("RecetasdeAcabado03_WPColumnsSelector"), "") != 0 )
      {
         AV22ColumnsSelectorXML = AV26Session.getValue("RecetasdeAcabado03_WPColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV22ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecLinMaq_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecTotKgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecTotKgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTotKgs_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecFA_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFA_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecVolPrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecVolPrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecVolPrd_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecFecAlt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecAlt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecAlt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecUsrCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUsrCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUsrCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecFecMod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecMod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecMod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecUsrMod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUsrMod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUsrMod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV66GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridCurrentPage), 10, 0));
      AV67GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67GridPageCount), 10, 0));
      AV79Recetasdeacabado03_wpds_1_filterfulltext = AV19FilterFullText ;
      AV80Recetasdeacabado03_wpds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV82Recetasdeacabado03_wpds_4_tfbarser = AV32TFBarSer ;
      AV83Recetasdeacabado03_wpds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV84Recetasdeacabado03_wpds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV86Recetasdeacabado03_wpds_8_tfreclinmaq = AV46TFRecLinMaq ;
      AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV47TFRecLinMaq_To ;
      AV88Recetasdeacabado03_wpds_10_tfmaqcod = AV48TFMaqCod ;
      AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV49TFMaqCod_Sel ;
      AV90Recetasdeacabado03_wpds_12_tfrectotkgs = AV71TFRecTotKgs ;
      AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV72TFRecTotKgs_To ;
      AV92Recetasdeacabado03_wpds_14_tfrecfa = AV73TFRecFA ;
      AV93Recetasdeacabado03_wpds_15_tfrecfa_to = AV74TFRecFA_To ;
      AV94Recetasdeacabado03_wpds_16_tfrecvolprd = AV50TFRecVolPrd ;
      AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV51TFRecVolPrd_To ;
      AV96Recetasdeacabado03_wpds_18_tfrecfecalt = AV52TFRecFecAlt ;
      AV97Recetasdeacabado03_wpds_19_tfrecusrcod = AV56TFRecUsrCod ;
      AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV57TFRecUsrCod_Sel ;
      AV99Recetasdeacabado03_wpds_21_tfrecfecmod = AV58TFRecFecMod ;
      AV100Recetasdeacabado03_wpds_22_tfrecusrmod = AV62TFRecUsrMod ;
      AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV63TFRecUsrMod_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e121HJ2( )
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
         AV65PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV65PageToGo) ;
      }
   }

   public void e131HJ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141HJ2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV16OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         AV17OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV30TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarNHdr", AV30TFBarNHdr);
            AV31TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarNHdr_Sel", AV31TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV32TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarSer", AV32TFBarSer);
            AV33TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarSer_Sel", AV33TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV34TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarSerDsc", AV34TFBarSerDsc);
            AV35TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarSerDsc_Sel", AV35TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinMaq") == 0 )
         {
            AV46TFRecLinMaq = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFRecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFRecLinMaq), 4, 0));
            AV47TFRecLinMaq_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFRecLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFRecLinMaq_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV48TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFMaqCod", AV48TFMaqCod);
            AV49TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMaqCod_Sel", AV49TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecTotKgs") == 0 )
         {
            AV71TFRecTotKgs = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFRecTotKgs", GXutil.ltrimstr( AV71TFRecTotKgs, 10, 2));
            AV72TFRecTotKgs_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFRecTotKgs_To", GXutil.ltrimstr( AV72TFRecTotKgs_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecFA") == 0 )
         {
            AV73TFRecFA = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFRecFA", GXutil.ltrimstr( AV73TFRecFA, 6, 2));
            AV74TFRecFA_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFRecFA_To", GXutil.ltrimstr( AV74TFRecFA_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecVolPrd") == 0 )
         {
            AV50TFRecVolPrd = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFRecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFRecVolPrd), 5, 0));
            AV51TFRecVolPrd_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFRecVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFRecVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecFecAlt") == 0 )
         {
            AV52TFRecFecAlt = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFRecFecAlt", localUtil.ttoc( AV52TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecUsrCod") == 0 )
         {
            AV56TFRecUsrCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecUsrCod", AV56TFRecUsrCod);
            AV57TFRecUsrCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFRecUsrCod_Sel", AV57TFRecUsrCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecFecMod") == 0 )
         {
            AV58TFRecFecMod = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFRecFecMod", localUtil.ttoc( AV58TFRecFecMod, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecUsrMod") == 0 )
         {
            AV62TFRecUsrMod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFRecUsrMod", AV62TFRecUsrMod);
            AV63TFRecUsrMod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFRecUsrMod_Sel", AV63TFRecUsrMod_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e211HJ2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fas fa-file-powerpoint", "", "", "", "", "", "", ""), (short)(0));
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
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV68GrupodeAcciones, 4, 0)) );
   }

   public void e151HJ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV22ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV24ColumnsSelector.fromJSonString(AV22ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "RecetasdeAcabado03_WPColumnsSelector", ((GXutil.strcmp("", AV22ColumnsSelectorXML)==0) ? "" : AV24ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e111HJ2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("RecetasdeAcabado03_WPFilters")),GXutil.URLEncode(GXutil.rtrim(AV102Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("RecetasdeAcabado03_WPFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV28ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "RecetasdeAcabado03_WPFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         recetasdeacabado03_wp_impl.this.GXt_char1 = GXv_char4[0] ;
         AV28ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV28ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV102Pgmname+"GridState", AV28ManageFiltersXml) ;
            AV14GridState.fromxml(AV28ManageFiltersXml, null, null);
            AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
            AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e161HJ2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e171HJ2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV20ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.recetasdeacabado03_wpexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      recetasdeacabado03_wp_impl.this.AV20ExcelFilename = GXv_char4[0] ;
      recetasdeacabado03_wp_impl.this.AV21ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV20ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV20ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e181HJ2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.recetasdeacabado03_wpexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV16OrderedBy, 4, 0))+":"+(AV17OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarNHdr", "", "N Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarSer", "", "Articulo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarSerDsc", "", "Descripcion", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecLinMaq", "", "#", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MaqCod", "", "Código Máquina", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecTotKgs", "Total", "Kilos", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecFA", "", "Fact.Abs.", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecVolPrd", "", "Volumen", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecFecAlt", "Alta", "Fecha", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecUsrCod", "Alta", "Usuario", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecFecMod", "Modificacion", "Fecha", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecUsrMod", "Modificacion", "Usuario", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV23UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "RecetasdeAcabado03_WPColumnsSelector", GXv_char4) ;
      recetasdeacabado03_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV23UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV23UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV27ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "RecetasdeAcabado03_WPFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV27ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV19FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
      AV30TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarNHdr", AV30TFBarNHdr);
      AV31TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarNHdr_Sel", AV31TFBarNHdr_Sel);
      AV32TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarSer", AV32TFBarSer);
      AV33TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarSer_Sel", AV33TFBarSer_Sel);
      AV34TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarSerDsc", AV34TFBarSerDsc);
      AV35TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarSerDsc_Sel", AV35TFBarSerDsc_Sel);
      AV46TFRecLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFRecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFRecLinMaq), 4, 0));
      AV47TFRecLinMaq_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFRecLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFRecLinMaq_To), 4, 0));
      AV48TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFMaqCod", AV48TFMaqCod);
      AV49TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFMaqCod_Sel", AV49TFMaqCod_Sel);
      AV71TFRecTotKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFRecTotKgs", GXutil.ltrimstr( AV71TFRecTotKgs, 10, 2));
      AV72TFRecTotKgs_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFRecTotKgs_To", GXutil.ltrimstr( AV72TFRecTotKgs_To, 10, 2));
      AV73TFRecFA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFRecFA", GXutil.ltrimstr( AV73TFRecFA, 6, 2));
      AV74TFRecFA_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFRecFA_To", GXutil.ltrimstr( AV74TFRecFA_To, 6, 2));
      AV50TFRecVolPrd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFRecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFRecVolPrd), 5, 0));
      AV51TFRecVolPrd_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFRecVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFRecVolPrd_To), 5, 0));
      AV52TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFRecFecAlt", localUtil.ttoc( AV52TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV56TFRecUsrCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecUsrCod", AV56TFRecUsrCod);
      AV57TFRecUsrCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFRecUsrCod_Sel", AV57TFRecUsrCod_Sel);
      AV58TFRecFecMod = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFRecFecMod", localUtil.ttoc( AV58TFRecFecMod, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV62TFRecUsrMod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFRecUsrMod", AV62TFRecUsrMod);
      AV63TFRecUsrMod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFRecUsrMod_Sel", AV63TFRecUsrMod_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.recetadeacabados02_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim("UPD"))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Mode"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Desea eliminar la receta ", "")+GXutil.trim( A13696BarNHdr)+" / "+GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0))+"?" ;
      ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
      AV103Emprcod_selected = A396EmprCod ;
      AV104Barcod_selected = A129BarCod ;
      AV105Barcodreo_selected = A132BarCodReo ;
      AV106Barcodpar_selected = A130BarCodPar ;
      AV107Reclinmaq_selected = A2804RecLinMaq ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S222( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9812RecHdrLts ;
      GXv_int14[0] = A9764RecLtsSR ;
      new app.prac105(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int14) ;
      recetasdeacabado03_wp_impl.this.A396EmprCod = GXv_char4[0] ;
      recetasdeacabado03_wp_impl.this.A9812RecHdrLts = GXv_char3[0] ;
      recetasdeacabado03_wp_impl.this.A9764RecLtsSR = GXv_int14[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int14[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int15[0] = A2804RecLinMaq ;
      new app.pbajrec(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int6, GXv_char3, GXv_int15) ;
      recetasdeacabado03_wp_impl.this.A396EmprCod = GXv_char4[0] ;
      recetasdeacabado03_wp_impl.this.A129BarCod = GXv_int14[0] ;
      recetasdeacabado03_wp_impl.this.A132BarCodReo = GXv_int6[0] ;
      recetasdeacabado03_wp_impl.this.A130BarCodPar = GXv_char3[0] ;
      recetasdeacabado03_wp_impl.this.A2804RecLinMaq = GXv_int15[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int14[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int15[0] = A2804RecLinMaq ;
      new app.pdelrec3(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int6, GXv_char3, GXv_int15) ;
      recetasdeacabado03_wp_impl.this.A396EmprCod = GXv_char4[0] ;
      recetasdeacabado03_wp_impl.this.A129BarCod = GXv_int14[0] ;
      recetasdeacabado03_wp_impl.this.A132BarCodReo = GXv_int6[0] ;
      recetasdeacabado03_wp_impl.this.A130BarCodPar = GXv_char3[0] ;
      recetasdeacabado03_wp_impl.this.A2804RecLinMaq = GXv_int15[0] ;
      AV70Inc_obs = httpContext.getMessage( "Eliminacion RECETA QUIMICA DE ACABADO", "") + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV102Pgmname, 1, 10), AV5UsurCod, AV6Station, AV70Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.rrac006", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(A2805RecVolPrd,5,0)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(AV69ImpCod)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Output"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A602MaqCod","","A2805RecVolPrd","A2804RecLinMaq","AV69ImpCod",""});
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue(AV102Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV102Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV26Session.getValue(AV102Pgmname+"GridState"), null, null);
      }
      AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
      AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV108GXV1 = 1 ;
      while ( AV108GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV108GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV19FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV30TFBarNHdr = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarNHdr", AV30TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV31TFBarNHdr_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarNHdr_Sel", AV31TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV32TFBarSer = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarSer", AV32TFBarSer);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV33TFBarSer_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarSer_Sel", AV33TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV34TFBarSerDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarSerDsc", AV34TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV35TFBarSerDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarSerDsc_Sel", AV35TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV46TFRecLinMaq = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFRecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFRecLinMaq), 4, 0));
            AV47TFRecLinMaq_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFRecLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFRecLinMaq_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV48TFMaqCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFMaqCod", AV48TFMaqCod);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV49TFMaqCod_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMaqCod_Sel", AV49TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGS") == 0 )
         {
            AV71TFRecTotKgs = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFRecTotKgs", GXutil.ltrimstr( AV71TFRecTotKgs, 10, 2));
            AV72TFRecTotKgs_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFRecTotKgs_To", GXutil.ltrimstr( AV72TFRecTotKgs_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFA") == 0 )
         {
            AV73TFRecFA = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFRecFA", GXutil.ltrimstr( AV73TFRecFA, 6, 2));
            AV74TFRecFA_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFRecFA_To", GXutil.ltrimstr( AV74TFRecFA_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV50TFRecVolPrd = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFRecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFRecVolPrd), 5, 0));
            AV51TFRecVolPrd_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFRecVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFRecVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV52TFRecFecAlt = localUtil.ctot( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFRecFecAlt", localUtil.ttoc( AV52TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV54DDO_RecFecAltAuxDate = GXutil.resetTime(AV52TFRecFecAlt) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_RecFecAltAuxDate", localUtil.format(AV54DDO_RecFecAltAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRCOD") == 0 )
         {
            AV56TFRecUsrCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecUsrCod", AV56TFRecUsrCod);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRCOD_SEL") == 0 )
         {
            AV57TFRecUsrCod_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFRecUsrCod_Sel", AV57TFRecUsrCod_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECMOD") == 0 )
         {
            AV58TFRecFecMod = localUtil.ctot( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFRecFecMod", localUtil.ttoc( AV58TFRecFecMod, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV60DDO_RecFecModAuxDate = GXutil.resetTime(AV58TFRecFecMod) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60DDO_RecFecModAuxDate", localUtil.format(AV60DDO_RecFecModAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRMOD") == 0 )
         {
            AV62TFRecUsrMod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFRecUsrMod", AV62TFRecUsrMod);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRMOD_SEL") == 0 )
         {
            AV63TFRecUsrMod_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFRecUsrMod_Sel", AV63TFRecUsrMod_Sel);
         }
         AV108GXV1 = (int)(AV108GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFBarNHdr_Sel)==0), AV31TFBarNHdr_Sel, GXv_char4) ;
      recetasdeacabado03_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarSer_Sel)==0), AV33TFBarSer_Sel, GXv_char3) ;
      recetasdeacabado03_wp_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarSerDsc_Sel)==0), AV35TFBarSerDsc_Sel, GXv_char2) ;
      recetasdeacabado03_wp_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFMaqCod_Sel)==0), AV49TFMaqCod_Sel, GXv_char19) ;
      recetasdeacabado03_wp_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFRecUsrCod_Sel)==0), AV57TFRecUsrCod_Sel, GXv_char21) ;
      recetasdeacabado03_wp_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFRecUsrMod_Sel)==0), AV63TFRecUsrMod_Sel, GXv_char23) ;
      recetasdeacabado03_wp_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char16+"|"+GXt_char17+"||"+GXt_char18+"|||||"+GXt_char20+"||"+GXt_char22 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFBarNHdr)==0), AV30TFBarNHdr, GXv_char23) ;
      recetasdeacabado03_wp_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarSer)==0), AV32TFBarSer, GXv_char21) ;
      recetasdeacabado03_wp_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarSerDsc)==0), AV34TFBarSerDsc, GXv_char19) ;
      recetasdeacabado03_wp_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFMaqCod)==0), AV48TFMaqCod, GXv_char4) ;
      recetasdeacabado03_wp_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFRecUsrCod)==0), AV56TFRecUsrCod, GXv_char3) ;
      recetasdeacabado03_wp_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFRecUsrMod)==0), AV62TFRecUsrMod, GXv_char2) ;
      recetasdeacabado03_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+((0==AV46TFRecLinMaq) ? "" : GXutil.str( AV46TFRecLinMaq, 4, 0))+"|"+GXt_char17+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFRecTotKgs)==0) ? "" : GXutil.str( AV71TFRecTotKgs, 10, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFRecFA)==0) ? "" : GXutil.str( AV73TFRecFA, 6, 2))+"|"+((0==AV50TFRecVolPrd) ? "" : GXutil.str( AV50TFRecVolPrd, 5, 0))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV52TFRecFecAlt) ? "" : localUtil.dtoc( AV54DDO_RecFecAltAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char16+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV58TFRecFecMod) ? "" : localUtil.dtoc( AV60DDO_RecFecModAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||"+((0==AV47TFRecLinMaq_To) ? "" : GXutil.str( AV47TFRecLinMaq_To, 4, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFRecTotKgs_To)==0) ? "" : GXutil.str( AV72TFRecTotKgs_To, 10, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFRecFA_To)==0) ? "" : GXutil.str( AV74TFRecFA_To, 6, 2))+"|"+((0==AV51TFRecVolPrd_To) ? "" : GXutil.str( AV51TFRecVolPrd_To, 5, 0))+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV26Session.getValue(AV102Pgmname+"GridState"), null, null);
      AV14GridState.setgxTv_SdtWWPGridState_Orderedby( AV16OrderedBy );
      AV14GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV17OrderedDsc );
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV19FilterFullText)==0), (short)(0), AV19FilterFullText, "") ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARNHDR", "", !(GXutil.strcmp("", AV30TFBarNHdr)==0), (short)(0), AV30TFBarNHdr, "", !(GXutil.strcmp("", AV31TFBarNHdr_Sel)==0), AV31TFBarNHdr_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARSER", "", !(GXutil.strcmp("", AV32TFBarSer)==0), (short)(0), AV32TFBarSer, "", !(GXutil.strcmp("", AV33TFBarSer_Sel)==0), AV33TFBarSer_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARSERDSC", "", !(GXutil.strcmp("", AV34TFBarSerDsc)==0), (short)(0), AV34TFBarSerDsc, "", !(GXutil.strcmp("", AV35TFBarSerDsc_Sel)==0), AV35TFBarSerDsc_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECLINMAQ", "", !((0==AV46TFRecLinMaq)&&(0==AV47TFRecLinMaq_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFRecLinMaq, 4, 0)), GXutil.trim( GXutil.str( AV47TFRecLinMaq_To, 4, 0))) ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFMAQCOD", "", !(GXutil.strcmp("", AV48TFMaqCod)==0), (short)(0), AV48TFMaqCod, "", !(GXutil.strcmp("", AV49TFMaqCod_Sel)==0), AV49TFMaqCod_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECTOTKGS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFRecTotKgs)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFRecTotKgs_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV71TFRecTotKgs, 10, 2)), GXutil.trim( GXutil.str( AV72TFRecTotKgs_To, 10, 2))) ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECFA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFRecFA)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFRecFA_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV73TFRecFA, 6, 2)), GXutil.trim( GXutil.str( AV74TFRecFA_To, 6, 2))) ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECVOLPRD", "", !((0==AV50TFRecVolPrd)&&(0==AV51TFRecVolPrd_To)), (short)(0), GXutil.trim( GXutil.str( AV50TFRecVolPrd, 5, 0)), GXutil.trim( GXutil.str( AV51TFRecVolPrd_To, 5, 0))) ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECFECALT", "", !GXutil.dateCompare(GXutil.nullDate(), AV52TFRecFecAlt), (short)(0), GXutil.trim( localUtil.ttoc( AV52TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECUSRCOD", "", !(GXutil.strcmp("", AV56TFRecUsrCod)==0), (short)(0), AV56TFRecUsrCod, "", !(GXutil.strcmp("", AV57TFRecUsrCod_Sel)==0), AV57TFRecUsrCod_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECFECMOD", "", !GXutil.dateCompare(GXutil.nullDate(), AV58TFRecFecMod), (short)(0), GXutil.trim( localUtil.ttoc( AV58TFRecFecMod, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFRECUSRMOD", "", !(GXutil.strcmp("", AV62TFRecUsrMod)==0), (short)(0), AV62TFRecUsrMod, "", !(GXutil.strcmp("", AV63TFRecUsrMod_Sel)==0), AV63TFRecUsrMod_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState24[0] ;
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV102Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV12TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV102Pgmname );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "RECMAQ" );
      AV26Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_69_1HJ2( boolean wbgen )
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
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_69_1HJ2e( true) ;
      }
      else
      {
         wb_table2_69_1HJ2e( false) ;
      }
   }

   public void wb_table1_23_1HJ2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV27ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_1HJ2( true) ;
      }
      else
      {
         wb_table3_28_1HJ2( false) ;
      }
      return  ;
   }

   public void wb_table3_28_1HJ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1HJ2e( true) ;
      }
      else
      {
         wb_table1_23_1HJ2e( false) ;
      }
   }

   public void wb_table3_28_1HJ2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV19FilterFullText, GXutil.rtrim( localUtil.format( AV19FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_RecetasdeAcabado03_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1HJ2e( true) ;
      }
      else
      {
         wb_table3_28_1HJ2e( false) ;
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
      pa1HJ2( ) ;
      ws1HJ2( ) ;
      we1HJ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116133970", true, true);
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
      httpContext.AddJavascriptSource("recetasdeacabado03_wp.js", "?202682116133971", false, true);
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

   public void subsflControlProps_412( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_41_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_41_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_41_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_41_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_41_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_41_idx ;
      edtRecTotKgs_Internalname = "RECTOTKGS_"+sGXsfl_41_idx ;
      edtRecFA_Internalname = "RECFA_"+sGXsfl_41_idx ;
      edtRecVolPrd_Internalname = "RECVOLPRD_"+sGXsfl_41_idx ;
      edtRecFecAlt_Internalname = "RECFECALT_"+sGXsfl_41_idx ;
      edtRecUsrCod_Internalname = "RECUSRCOD_"+sGXsfl_41_idx ;
      edtRecFecMod_Internalname = "RECFECMOD_"+sGXsfl_41_idx ;
      edtRecUsrMod_Internalname = "RECUSRMOD_"+sGXsfl_41_idx ;
      edtRecHdrLts_Internalname = "RECHDRLTS_"+sGXsfl_41_idx ;
      edtRecLtsSR_Internalname = "RECLTSSR_"+sGXsfl_41_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_41_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_41_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_41_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_41_fel_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_41_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_41_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_41_fel_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_41_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_41_fel_idx ;
      edtRecTotKgs_Internalname = "RECTOTKGS_"+sGXsfl_41_fel_idx ;
      edtRecFA_Internalname = "RECFA_"+sGXsfl_41_fel_idx ;
      edtRecVolPrd_Internalname = "RECVOLPRD_"+sGXsfl_41_fel_idx ;
      edtRecFecAlt_Internalname = "RECFECALT_"+sGXsfl_41_fel_idx ;
      edtRecUsrCod_Internalname = "RECUSRCOD_"+sGXsfl_41_fel_idx ;
      edtRecFecMod_Internalname = "RECFECMOD_"+sGXsfl_41_fel_idx ;
      edtRecUsrMod_Internalname = "RECUSRMOD_"+sGXsfl_41_fel_idx ;
      edtRecHdrLts_Internalname = "RECHDRLTS_"+sGXsfl_41_fel_idx ;
      edtRecLtsSR_Internalname = "RECLTSSR_"+sGXsfl_41_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_41_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_41_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_41_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1HJ0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_41_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV68GrupodeAcciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV68GrupodeAcciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68GrupodeAcciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV68GrupodeAcciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e221hj2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV68GrupodeAcciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecLinMaq_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecLinMaq_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecTotKgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecTotKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A4259RecTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4259RecTotKgs, "ZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecTotKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecTotKgs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecFA_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFA_Internalname,GXutil.ltrim( localUtil.ntoc( A2806RecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecFA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecFA_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecVolPrd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecVolPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2805RecVolPrd), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecVolPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecVolPrd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecFecAlt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFecAlt_Internalname,localUtil.ttoc( A4866RecFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4866RecFecAlt, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecFecAlt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecFecAlt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecUsrCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecUsrCod_Internalname,GXutil.rtrim( A4402RecUsrCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecUsrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecUsrCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecFecMod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFecMod_Internalname,localUtil.ttoc( A4867RecFecMod, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4867RecFecMod, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecFecMod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecFecMod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecUsrMod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecUsrMod_Internalname,GXutil.rtrim( A4868RecUsrMod),GXutil.rtrim( localUtil.format( A4868RecUsrMod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecUsrMod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecUsrMod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecHdrLts_Internalname,GXutil.rtrim( A9812RecHdrLts),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecHdrLts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLtsSR_Internalname,GXutil.ltrim( localUtil.ntoc( A9764RecLtsSR, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9764RecLtsSR), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLtsSR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1HJ2( ) ;
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
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLinMaq_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecTotKgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecFA_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fact.Abs.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecVolPrd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecFecAlt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecUsrCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecFecMod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecUsrMod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV68GrupodeAcciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLinMaq_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4259RecTotKgs, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecTotKgs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2806RecFA, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecFA_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecVolPrd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4866RecFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecFecAlt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4402RecUsrCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecUsrCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4867RecFecMod, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecFecMod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4868RecUsrMod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecUsrMod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9812RecHdrLts));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9764RecLtsSR, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES" );
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtRecTotKgs_Internalname = "RECTOTKGS" ;
      edtRecFA_Internalname = "RECFA" ;
      edtRecVolPrd_Internalname = "RECVOLPRD" ;
      edtRecFecAlt_Internalname = "RECFECALT" ;
      edtRecUsrCod_Internalname = "RECUSRCOD" ;
      edtRecFecMod_Internalname = "RECFECMOD" ;
      edtRecUsrMod_Internalname = "RECUSRMOD" ;
      edtRecHdrLts_Internalname = "RECHDRLTS" ;
      edtRecLtsSR_Internalname = "RECLTSSR" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_recfecaltauxdate_Internalname = "vDDO_RECFECALTAUXDATE" ;
      divDdo_recfecaltauxdates_Internalname = "DDO_RECFECALTAUXDATES" ;
      edtavDdo_recfecmodauxdate_Internalname = "vDDO_RECFECMODAUXDATE" ;
      divDdo_recfecmodauxdates_Internalname = "DDO_RECFECMODAUXDATES" ;
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
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtRecLtsSR_Jsonclick = "" ;
      edtRecHdrLts_Jsonclick = "" ;
      edtRecUsrMod_Jsonclick = "" ;
      edtRecFecMod_Jsonclick = "" ;
      edtRecUsrCod_Jsonclick = "" ;
      edtRecFecAlt_Jsonclick = "" ;
      edtRecVolPrd_Jsonclick = "" ;
      edtRecFA_Jsonclick = "" ;
      edtRecTotKgs_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtRecUsrMod_Visible = -1 ;
      edtRecFecMod_Visible = -1 ;
      edtRecUsrCod_Visible = -1 ;
      edtRecFecAlt_Visible = -1 ;
      edtRecVolPrd_Visible = -1 ;
      edtRecFA_Visible = -1 ;
      edtRecTotKgs_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      edtRecLinMaq_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_recfecmodauxdate_Jsonclick = "" ;
      edtavDdo_recfecaltauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;Total;;;Alta;Alta;Modificacion;Modificacion;;;;;;" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la Receta?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "RecetasdeAcabado03_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic||Dynamic|||||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|T||T|||||T||T" ;
      Ddo_grid_Filterisrange = "|||T||T|T|T||||" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Date|Character|Date|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|1|5|6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "1:BarNHdr|2:BarSer|3:BarSerDsc|4:RecLinMaq|5:MaqCod|6:RecTotKgs|7:RecFA|8:RecVolPrd|9:RecFecAlt|10:RecUsrCod|11:RecFecMod|12:RecUsrMod" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Recetas de Acabado (Mto)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_41_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
         AV68GrupodeAcciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV68GrupodeAcciones, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68GrupodeAcciones), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecTotKgs_Visible',ctrl:'RECTOTKGS',prop:'Visible'},{av:'edtRecFA_Visible',ctrl:'RECFA',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtRecUsrCod_Visible',ctrl:'RECUSRCOD',prop:'Visible'},{av:'edtRecFecMod_Visible',ctrl:'RECFECMOD',prop:'Visible'},{av:'edtRecUsrMod_Visible',ctrl:'RECUSRMOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121HJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131HJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141HJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211HJ2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV68GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151HJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecTotKgs_Visible',ctrl:'RECTOTKGS',prop:'Visible'},{av:'edtRecFA_Visible',ctrl:'RECFA',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtRecUsrCod_Visible',ctrl:'RECUSRCOD',prop:'Visible'},{av:'edtRecFecMod_Visible',ctrl:'RECFECMOD',prop:'Visible'},{av:'edtRecUsrMod_Visible',ctrl:'RECUSRMOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111HJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV54DDO_RecFecAltAuxDate',fld:'vDDO_RECFECALTAUXDATE',pic:''},{av:'AV60DDO_RecFecModAuxDate',fld:'vDDO_RECFECMODAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV60DDO_RecFecModAuxDate',fld:'vDDO_RECFECMODAUXDATE',pic:''},{av:'AV54DDO_RecFecAltAuxDate',fld:'vDDO_RECFECALTAUXDATE',pic:''},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecTotKgs_Visible',ctrl:'RECTOTKGS',prop:'Visible'},{av:'edtRecFA_Visible',ctrl:'RECFA',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtRecUsrCod_Visible',ctrl:'RECUSRCOD',prop:'Visible'},{av:'edtRecFecMod_Visible',ctrl:'RECFECMOD',prop:'Visible'},{av:'edtRecUsrMod_Visible',ctrl:'RECUSRMOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e221HJ2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV68GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'AV69ImpCod',fld:'vIMPCOD',pic:''}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV68GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'AV69ImpCod',fld:'vIMPCOD',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e161HJ2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9812RecHdrLts',fld:'RECHDRLTS',pic:''},{av:'A9764RecLtsSR',fld:'RECLTSSR',pic:'ZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A9764RecLtsSR',fld:'RECLTSSR',pic:'ZZZZ9'},{av:'A9812RecHdrLts',fld:'RECHDRLTS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecTotKgs_Visible',ctrl:'RECTOTKGS',prop:'Visible'},{av:'edtRecFA_Visible',ctrl:'RECFA',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtRecUsrCod_Visible',ctrl:'RECUSRCOD',prop:'Visible'},{av:'edtRecFecMod_Visible',ctrl:'RECFECMOD',prop:'Visible'},{av:'edtRecUsrMod_Visible',ctrl:'RECUSRMOD',prop:'Visible'},{av:'AV66GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV67GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171HJ2',iparms:[{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV54DDO_RecFecAltAuxDate',fld:'vDDO_RECFECALTAUXDATE',pic:''},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV60DDO_RecFecModAuxDate',fld:'vDDO_RECFECMODAUXDATE',pic:''},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV60DDO_RecFecModAuxDate',fld:'vDDO_RECFECMODAUXDATE',pic:''},{av:'AV54DDO_RecFecAltAuxDate',fld:'vDDO_RECFECALTAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181HJ2',iparms:[{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV54DDO_RecFecAltAuxDate',fld:'vDDO_RECFECALTAUXDATE',pic:''},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV60DDO_RecFecModAuxDate',fld:'vDDO_RECFECMODAUXDATE',pic:''},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV47TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV48TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV49TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV71TFRecTotKgs',fld:'vTFRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV72TFRecTotKgs_To',fld:'vTFRECTOTKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV73TFRecFA',fld:'vTFRECFA',pic:'ZZ9.99'},{av:'AV74TFRecFA_To',fld:'vTFRECFA_TO',pic:'ZZ9.99'},{av:'AV50TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV51TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFRecUsrCod',fld:'vTFRECUSRCOD',pic:''},{av:'AV57TFRecUsrCod_Sel',fld:'vTFRECUSRCOD_SEL',pic:''},{av:'AV58TFRecFecMod',fld:'vTFRECFECMOD',pic:'99/99/99 99:99'},{av:'AV62TFRecUsrMod',fld:'vTFRECUSRMOD',pic:'@!'},{av:'AV63TFRecUsrMod_Sel',fld:'vTFRECUSRMOD_SEL',pic:'@!'},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV60DDO_RecFecModAuxDate',fld:'vDDO_RECFECMODAUXDATE',pic:''},{av:'AV54DDO_RecFecAltAuxDate',fld:'vDDO_RECFECALTAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
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
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV19FilterFullText = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV30TFBarNHdr = "" ;
      AV31TFBarNHdr_Sel = "" ;
      AV32TFBarSer = "" ;
      AV33TFBarSer_Sel = "" ;
      AV34TFBarSerDsc = "" ;
      AV35TFBarSerDsc_Sel = "" ;
      AV48TFMaqCod = "" ;
      AV49TFMaqCod_Sel = "" ;
      AV71TFRecTotKgs = DecimalUtil.ZERO ;
      AV72TFRecTotKgs_To = DecimalUtil.ZERO ;
      AV73TFRecFA = DecimalUtil.ZERO ;
      AV74TFRecFA_To = DecimalUtil.ZERO ;
      AV52TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV56TFRecUsrCod = "" ;
      AV57TFRecUsrCod_Sel = "" ;
      AV58TFRecFecMod = GXutil.resetTime( GXutil.nullDate() );
      AV62TFRecUsrMod = "" ;
      AV63TFRecUsrMod_Sel = "" ;
      AV102Pgmname = "" ;
      AV7EmprCod = "" ;
      AV5UsurCod = "" ;
      AV6Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV27ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV64DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV69ImpCod = "" ;
      AV103Emprcod_selected = "" ;
      AV106Barcodpar_selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
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
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV54DDO_RecFecAltAuxDate = GXutil.nullDate() ;
      AV60DDO_RecFecModAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A602MaqCod = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A2806RecFA = DecimalUtil.ZERO ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4402RecUsrCod = "" ;
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4868RecUsrMod = "" ;
      A9812RecHdrLts = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      lV79Recetasdeacabado03_wpds_1_filterfulltext = "" ;
      lV80Recetasdeacabado03_wpds_2_tfbarnhdr = "" ;
      lV82Recetasdeacabado03_wpds_4_tfbarser = "" ;
      lV84Recetasdeacabado03_wpds_6_tfbarserdsc = "" ;
      lV88Recetasdeacabado03_wpds_10_tfmaqcod = "" ;
      lV97Recetasdeacabado03_wpds_19_tfrecusrcod = "" ;
      lV100Recetasdeacabado03_wpds_22_tfrecusrmod = "" ;
      AV79Recetasdeacabado03_wpds_1_filterfulltext = "" ;
      AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel = "" ;
      AV80Recetasdeacabado03_wpds_2_tfbarnhdr = "" ;
      AV83Recetasdeacabado03_wpds_5_tfbarser_sel = "" ;
      AV82Recetasdeacabado03_wpds_4_tfbarser = "" ;
      AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel = "" ;
      AV84Recetasdeacabado03_wpds_6_tfbarserdsc = "" ;
      AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel = "" ;
      AV88Recetasdeacabado03_wpds_10_tfmaqcod = "" ;
      AV90Recetasdeacabado03_wpds_12_tfrectotkgs = DecimalUtil.ZERO ;
      AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to = DecimalUtil.ZERO ;
      AV92Recetasdeacabado03_wpds_14_tfrecfa = DecimalUtil.ZERO ;
      AV93Recetasdeacabado03_wpds_15_tfrecfa_to = DecimalUtil.ZERO ;
      AV96Recetasdeacabado03_wpds_18_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel = "" ;
      AV97Recetasdeacabado03_wpds_19_tfrecusrcod = "" ;
      AV99Recetasdeacabado03_wpds_21_tfrecfecmod = GXutil.resetTime( GXutil.nullDate() );
      AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel = "" ;
      AV100Recetasdeacabado03_wpds_22_tfrecusrmod = "" ;
      A6039RecAcab = "" ;
      H01HJ2_A6039RecAcab = new String[] {""} ;
      H01HJ2_n6039RecAcab = new boolean[] {false} ;
      H01HJ2_A396EmprCod = new String[] {""} ;
      H01HJ2_A9764RecLtsSR = new int[1] ;
      H01HJ2_n9764RecLtsSR = new boolean[] {false} ;
      H01HJ2_A9812RecHdrLts = new String[] {""} ;
      H01HJ2_n9812RecHdrLts = new boolean[] {false} ;
      H01HJ2_A4868RecUsrMod = new String[] {""} ;
      H01HJ2_n4868RecUsrMod = new boolean[] {false} ;
      H01HJ2_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      H01HJ2_n4867RecFecMod = new boolean[] {false} ;
      H01HJ2_A4402RecUsrCod = new String[] {""} ;
      H01HJ2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      H01HJ2_n4866RecFecAlt = new boolean[] {false} ;
      H01HJ2_A2805RecVolPrd = new int[1] ;
      H01HJ2_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HJ2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HJ2_A602MaqCod = new String[] {""} ;
      H01HJ2_A2804RecLinMaq = new short[1] ;
      H01HJ2_A1652BarSerDsc = new String[] {""} ;
      H01HJ2_A212BarSer = new String[] {""} ;
      H01HJ2_A130BarCodPar = new String[] {""} ;
      H01HJ2_A132BarCodReo = new byte[1] ;
      H01HJ2_A129BarCod = new int[1] ;
      H01HJ3_AGRID_nRecordCount = new long[1] ;
      AV8EmprNom = "" ;
      AV77Carvitin = DecimalUtil.ZERO ;
      AV78Automata = DecimalUtil.ZERO ;
      AV11HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26Session = httpContext.getWebSession();
      AV22ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV28ManageFiltersXml = "" ;
      AV20ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV23UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      GXv_int14 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int15 = new short[1] ;
      AV70Inc_obs = "" ;
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado03_wp__default(),
         new Object[] {
             new Object[] {
            H01HJ2_A6039RecAcab, H01HJ2_n6039RecAcab, H01HJ2_A396EmprCod, H01HJ2_A9764RecLtsSR, H01HJ2_n9764RecLtsSR, H01HJ2_A9812RecHdrLts, H01HJ2_n9812RecHdrLts, H01HJ2_A4868RecUsrMod, H01HJ2_n4868RecUsrMod, H01HJ2_A4867RecFecMod,
            H01HJ2_n4867RecFecMod, H01HJ2_A4402RecUsrCod, H01HJ2_A4866RecFecAlt, H01HJ2_n4866RecFecAlt, H01HJ2_A2805RecVolPrd, H01HJ2_A2806RecFA, H01HJ2_A4259RecTotKgs, H01HJ2_A602MaqCod, H01HJ2_A2804RecLinMaq, H01HJ2_A1652BarSerDsc,
            H01HJ2_A212BarSer, H01HJ2_A130BarCodPar, H01HJ2_A132BarCodReo, H01HJ2_A129BarCod
            }
            , new Object[] {
            H01HJ3_AGRID_nRecordCount
            }
         }
      );
      AV102Pgmname = "RecetasdeAcabado03_WP" ;
      /* GeneXus formulas. */
      AV102Pgmname = "RecetasdeAcabado03_WP" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV29ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte AV105Barcodreo_selected ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV46TFRecLinMaq ;
   private short AV47TFRecLinMaq_To ;
   private short AV16OrderedBy ;
   private short AV107Reclinmaq_selected ;
   private short wbEnd ;
   private short wbStart ;
   private short AV68GrupodeAcciones ;
   private short A2804RecLinMaq ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV86Recetasdeacabado03_wpds_8_tfreclinmaq ;
   private short AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to ;
   private short GXv_int15[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int AV50TFRecVolPrd ;
   private int AV51TFRecVolPrd_To ;
   private int AV104Barcod_selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A2805RecVolPrd ;
   private int A9764RecLtsSR ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV94Recetasdeacabado03_wpds_16_tfrecvolprd ;
   private int AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to ;
   private int edtBarNHdr_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtRecLinMaq_Visible ;
   private int edtMaqCod_Visible ;
   private int edtRecTotKgs_Visible ;
   private int edtRecFA_Visible ;
   private int edtRecVolPrd_Visible ;
   private int edtRecFecAlt_Visible ;
   private int edtRecUsrCod_Visible ;
   private int edtRecFecMod_Visible ;
   private int edtRecUsrMod_Visible ;
   private int AV65PageToGo ;
   private int GXv_int14[] ;
   private int AV108GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV66GridCurrentPage ;
   private long AV67GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV71TFRecTotKgs ;
   private java.math.BigDecimal AV72TFRecTotKgs_To ;
   private java.math.BigDecimal AV73TFRecFA ;
   private java.math.BigDecimal AV74TFRecFA_To ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal AV90Recetasdeacabado03_wpds_12_tfrectotkgs ;
   private java.math.BigDecimal AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to ;
   private java.math.BigDecimal AV92Recetasdeacabado03_wpds_14_tfrecfa ;
   private java.math.BigDecimal AV93Recetasdeacabado03_wpds_15_tfrecfa_to ;
   private java.math.BigDecimal AV77Carvitin ;
   private java.math.BigDecimal AV78Automata ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_41_idx="0001" ;
   private String AV30TFBarNHdr ;
   private String AV31TFBarNHdr_Sel ;
   private String AV32TFBarSer ;
   private String AV33TFBarSer_Sel ;
   private String AV34TFBarSerDsc ;
   private String AV35TFBarSerDsc_Sel ;
   private String AV48TFMaqCod ;
   private String AV49TFMaqCod_Sel ;
   private String AV56TFRecUsrCod ;
   private String AV57TFRecUsrCod_Sel ;
   private String AV62TFRecUsrMod ;
   private String AV63TFRecUsrMod_Sel ;
   private String AV102Pgmname ;
   private String AV7EmprCod ;
   private String AV5UsurCod ;
   private String AV6Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV69ImpCod ;
   private String AV103Emprcod_selected ;
   private String AV106Barcodpar_selected ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_recfecaltauxdates_Internalname ;
   private String edtavDdo_recfecaltauxdate_Internalname ;
   private String edtavDdo_recfecaltauxdate_Jsonclick ;
   private String divDdo_recfecmodauxdates_Internalname ;
   private String edtavDdo_recfecmodauxdate_Internalname ;
   private String edtavDdo_recfecmodauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String edtRecTotKgs_Internalname ;
   private String edtRecFA_Internalname ;
   private String edtRecVolPrd_Internalname ;
   private String edtRecFecAlt_Internalname ;
   private String A4402RecUsrCod ;
   private String edtRecUsrCod_Internalname ;
   private String edtRecFecMod_Internalname ;
   private String A4868RecUsrMod ;
   private String edtRecUsrMod_Internalname ;
   private String A9812RecHdrLts ;
   private String edtRecHdrLts_Internalname ;
   private String edtRecLtsSR_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV80Recetasdeacabado03_wpds_2_tfbarnhdr ;
   private String lV82Recetasdeacabado03_wpds_4_tfbarser ;
   private String lV84Recetasdeacabado03_wpds_6_tfbarserdsc ;
   private String lV88Recetasdeacabado03_wpds_10_tfmaqcod ;
   private String lV97Recetasdeacabado03_wpds_19_tfrecusrcod ;
   private String lV100Recetasdeacabado03_wpds_22_tfrecusrmod ;
   private String AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel ;
   private String AV80Recetasdeacabado03_wpds_2_tfbarnhdr ;
   private String AV83Recetasdeacabado03_wpds_5_tfbarser_sel ;
   private String AV82Recetasdeacabado03_wpds_4_tfbarser ;
   private String AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel ;
   private String AV84Recetasdeacabado03_wpds_6_tfbarserdsc ;
   private String AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel ;
   private String AV88Recetasdeacabado03_wpds_10_tfmaqcod ;
   private String AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel ;
   private String AV97Recetasdeacabado03_wpds_19_tfrecusrcod ;
   private String AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel ;
   private String AV100Recetasdeacabado03_wpds_22_tfrecusrmod ;
   private String A6039RecAcab ;
   private String AV8EmprNom ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtRecTotKgs_Jsonclick ;
   private String edtRecFA_Jsonclick ;
   private String edtRecVolPrd_Jsonclick ;
   private String edtRecFecAlt_Jsonclick ;
   private String edtRecUsrCod_Jsonclick ;
   private String edtRecFecMod_Jsonclick ;
   private String edtRecUsrMod_Jsonclick ;
   private String edtRecHdrLts_Jsonclick ;
   private String edtRecLtsSR_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV52TFRecFecAlt ;
   private java.util.Date AV58TFRecFecMod ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date AV96Recetasdeacabado03_wpds_18_tfrecfecalt ;
   private java.util.Date AV99Recetasdeacabado03_wpds_21_tfrecfecmod ;
   private java.util.Date AV54DDO_RecFecAltAuxDate ;
   private java.util.Date AV60DDO_RecFecModAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV17OrderedDsc ;
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
   private boolean n4866RecFecAlt ;
   private boolean n4867RecFecMod ;
   private boolean n4868RecUsrMod ;
   private boolean n9812RecHdrLts ;
   private boolean n9764RecLtsSR ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n6039RecAcab ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV22ColumnsSelectorXML ;
   private String AV28ManageFiltersXml ;
   private String AV23UserCustomValue ;
   private String AV19FilterFullText ;
   private String lV79Recetasdeacabado03_wpds_1_filterfulltext ;
   private String AV79Recetasdeacabado03_wpds_1_filterfulltext ;
   private String AV20ExcelFilename ;
   private String AV21ErrorMessage ;
   private String AV70Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGrupodeacciones ;
   private IDataStoreProvider pr_default ;
   private String[] H01HJ2_A6039RecAcab ;
   private boolean[] H01HJ2_n6039RecAcab ;
   private String[] H01HJ2_A396EmprCod ;
   private int[] H01HJ2_A9764RecLtsSR ;
   private boolean[] H01HJ2_n9764RecLtsSR ;
   private String[] H01HJ2_A9812RecHdrLts ;
   private boolean[] H01HJ2_n9812RecHdrLts ;
   private String[] H01HJ2_A4868RecUsrMod ;
   private boolean[] H01HJ2_n4868RecUsrMod ;
   private java.util.Date[] H01HJ2_A4867RecFecMod ;
   private boolean[] H01HJ2_n4867RecFecMod ;
   private String[] H01HJ2_A4402RecUsrCod ;
   private java.util.Date[] H01HJ2_A4866RecFecAlt ;
   private boolean[] H01HJ2_n4866RecFecAlt ;
   private int[] H01HJ2_A2805RecVolPrd ;
   private java.math.BigDecimal[] H01HJ2_A2806RecFA ;
   private java.math.BigDecimal[] H01HJ2_A4259RecTotKgs ;
   private String[] H01HJ2_A602MaqCod ;
   private short[] H01HJ2_A2804RecLinMaq ;
   private String[] H01HJ2_A1652BarSerDsc ;
   private String[] H01HJ2_A212BarSer ;
   private String[] H01HJ2_A130BarCodPar ;
   private byte[] H01HJ2_A132BarCodReo ;
   private int[] H01HJ2_A129BarCod ;
   private long[] H01HJ3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV27ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV64DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class recetasdeacabado03_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01HJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV79Recetasdeacabado03_wpds_1_filterfulltext ,
                                          String AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                          String AV80Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                          String AV83Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                          String AV82Recetasdeacabado03_wpds_4_tfbarser ,
                                          String AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                          String AV84Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                          short AV86Recetasdeacabado03_wpds_8_tfreclinmaq ,
                                          short AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to ,
                                          String AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                          String AV88Recetasdeacabado03_wpds_10_tfmaqcod ,
                                          java.math.BigDecimal AV90Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                          java.math.BigDecimal AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                          java.math.BigDecimal AV92Recetasdeacabado03_wpds_14_tfrecfa ,
                                          java.math.BigDecimal AV93Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                          int AV94Recetasdeacabado03_wpds_16_tfrecvolprd ,
                                          int AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to ,
                                          java.util.Date AV96Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                          String AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                          String AV97Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                          java.util.Date AV99Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                          String AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                          String AV100Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A4259RecTotKgs ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date A4867RecFecMod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[37];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.RecAcab, T1.EmprCod, T1.RecLtsSR, T1.RecHdrLts, T1.RecUsrMod, T1.RecFecMod, T1.RecUsrCod, T1.RecFecAlt, T1.RecVolPrd, T1.RecFA, T1.RecTotKgs, T1.MaqCod, T1.RecLinMaq," ;
      sSelectString += " T2.BarSerDsc, T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod" ;
      sFromString = " FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV79Recetasdeacabado03_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecTotKgs,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecFA,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int25[0] = (byte)(1) ;
         GXv_int25[1] = (byte)(1) ;
         GXv_int25[2] = (byte)(1) ;
         GXv_int25[3] = (byte)(1) ;
         GXv_int25[4] = (byte)(1) ;
         GXv_int25[5] = (byte)(1) ;
         GXv_int25[6] = (byte)(1) ;
         GXv_int25[7] = (byte)(1) ;
         GXv_int25[8] = (byte)(1) ;
         GXv_int25[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetasdeacabado03_wpds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Recetasdeacabado03_wpds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Recetasdeacabado03_wpds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Recetasdeacabado03_wpds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Recetasdeacabado03_wpds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Recetasdeacabado03_wpds_8_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (0==AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetasdeacabado03_wpds_10_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Recetasdeacabado03_wpds_12_tfrectotkgs)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs >= ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs <= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Recetasdeacabado03_wpds_14_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA >= ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Recetasdeacabado03_wpds_15_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA <= ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Recetasdeacabado03_wpds_16_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Recetasdeacabado03_wpds_18_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV97Recetasdeacabado03_wpds_19_tfrecusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrCod = ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Recetasdeacabado03_wpds_21_tfrecfecmod) )
      {
         addWhere(sWhereString, "(T1.RecFecMod >= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) && ( ! (GXutil.strcmp("", AV100Recetasdeacabado03_wpds_22_tfrecusrmod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrMod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrMod = ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLinMaq" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLinMaq DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecTotKgs" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecTotKgs DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecFA" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecFA DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecVolPrd" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecVolPrd DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecFecAlt" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecFecAlt DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecUsrCod" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecUsrCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecFecMod" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecFecMod DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecUsrMod" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecUsrMod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H01HJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV79Recetasdeacabado03_wpds_1_filterfulltext ,
                                          String AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                          String AV80Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                          String AV83Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                          String AV82Recetasdeacabado03_wpds_4_tfbarser ,
                                          String AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                          String AV84Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                          short AV86Recetasdeacabado03_wpds_8_tfreclinmaq ,
                                          short AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to ,
                                          String AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                          String AV88Recetasdeacabado03_wpds_10_tfmaqcod ,
                                          java.math.BigDecimal AV90Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                          java.math.BigDecimal AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                          java.math.BigDecimal AV92Recetasdeacabado03_wpds_14_tfrecfa ,
                                          java.math.BigDecimal AV93Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                          int AV94Recetasdeacabado03_wpds_16_tfrecvolprd ,
                                          int AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to ,
                                          java.util.Date AV96Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                          String AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                          String AV97Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                          java.util.Date AV99Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                          String AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                          String AV100Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A4259RecTotKgs ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date A4867RecFecMod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[32];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV79Recetasdeacabado03_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecTotKgs,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecFA,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int27[0] = (byte)(1) ;
         GXv_int27[1] = (byte)(1) ;
         GXv_int27[2] = (byte)(1) ;
         GXv_int27[3] = (byte)(1) ;
         GXv_int27[4] = (byte)(1) ;
         GXv_int27[5] = (byte)(1) ;
         GXv_int27[6] = (byte)(1) ;
         GXv_int27[7] = (byte)(1) ;
         GXv_int27[8] = (byte)(1) ;
         GXv_int27[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV80Recetasdeacabado03_wpds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Recetasdeacabado03_wpds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Recetasdeacabado03_wpds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Recetasdeacabado03_wpds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Recetasdeacabado03_wpds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Recetasdeacabado03_wpds_8_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (0==AV87Recetasdeacabado03_wpds_9_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetasdeacabado03_wpds_10_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Recetasdeacabado03_wpds_12_tfrectotkgs)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs >= ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Recetasdeacabado03_wpds_13_tfrectotkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs <= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Recetasdeacabado03_wpds_14_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA >= ?)");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Recetasdeacabado03_wpds_15_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA <= ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Recetasdeacabado03_wpds_16_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Recetasdeacabado03_wpds_17_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Recetasdeacabado03_wpds_18_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV97Recetasdeacabado03_wpds_19_tfrecusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrCod = ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Recetasdeacabado03_wpds_21_tfrecfecmod) )
      {
         addWhere(sWhereString, "(T1.RecFecMod >= ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) && ( ! (GXutil.strcmp("", AV100Recetasdeacabado03_wpds_22_tfrecusrmod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrMod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrMod = ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
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
                  return conditional_H01HJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Boolean) dynConstraints[38]).booleanValue() , (String)dynConstraints[39] );
            case 1 :
                  return conditional_H01HJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Boolean) dynConstraints[38]).booleanValue() , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01HJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[17])[0] = rslt.getString(12, 6);
               ((short[]) buf[18])[0] = rslt.getShort(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((int[]) buf[23])[0] = rslt.getInt(18);
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
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[58], false);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               return;
      }
   }

}

