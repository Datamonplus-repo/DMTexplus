package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaensayolaboratorioww_impl extends GXDataArea
{
   public entradaensayolaboratorioww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaensayolaboratorioww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratorioww_impl.class ));
   }

   public entradaensayolaboratorioww_impl( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbLb_EstEns = new HTMLChoice();
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
      nRC_GXsfl_72 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_72"))) ;
      nGXsfl_72_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_72_idx"))) ;
      sGXsfl_72_idx = httpContext.GetPar( "sGXsfl_72_idx") ;
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
      AV90Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
      AV98Lb_FechaEfrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEfrom")) ;
      AV99Lb_FechaEto = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEto")) ;
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV86EmprCod = httpContext.GetPar( "EmprCod") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV107Ok = httpContext.GetPar( "Ok") ;
      AV26TFLb_numero = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero"))) ;
      AV27TFLb_numero_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero_To"))) ;
      AV28TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV29TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV30TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV31TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV32TFLb_ArtCod = httpContext.GetPar( "TFLb_ArtCod") ;
      AV33TFLb_ArtCod_Sel = httpContext.GetPar( "TFLb_ArtCod_Sel") ;
      AV34TFLb_ArtDsc = httpContext.GetPar( "TFLb_ArtDsc") ;
      AV35TFLb_ArtDsc_Sel = httpContext.GetPar( "TFLb_ArtDsc_Sel") ;
      AV40TFLb_ColNom = httpContext.GetPar( "TFLb_ColNom") ;
      AV41TFLb_ColNom_Sel = httpContext.GetPar( "TFLb_ColNom_Sel") ;
      AV42TFLb_ColNum = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum"))) ;
      AV43TFLb_ColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum_To"))) ;
      AV44TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV45TFTipColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod_To"))) ;
      AV48TFLb_ColNomC = httpContext.GetPar( "TFLb_ColNomC") ;
      AV49TFLb_ColNomC_Sel = httpContext.GetPar( "TFLb_ColNomC_Sel") ;
      AV50TFLb_ColNumC = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNumC"))) ;
      AV51TFLb_ColNumC_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNumC_To"))) ;
      AV52TFLb_Cartaz = httpContext.GetPar( "TFLb_Cartaz") ;
      AV53TFLb_Cartaz_Sel = httpContext.GetPar( "TFLb_Cartaz_Sel") ;
      AV58TFLb_HoraE = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFLb_HoraE"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV97TFLb_EstEns_Sels);
      AV74TFLb_Rb = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_Rb"), ".") ;
      AV75TFLb_Rb_To = CommonUtil.decimalVal( httpContext.GetPar( "TFLb_Rb_To"), ".") ;
      AV100TFLb_Pantone = httpContext.GetPar( "TFLb_Pantone") ;
      AV101TFLb_Pantone_Sel = httpContext.GetPar( "TFLb_Pantone_Sel") ;
      AV102TFLb_PedCod = httpContext.GetPar( "TFLb_PedCod") ;
      AV103TFLb_PedCod_Sel = httpContext.GetPar( "TFLb_PedCod_Sel") ;
      AV112Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV89Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV105ContVal = (int)(GXutil.lval( httpContext.GetPar( "ContVal"))) ;
      Gx_msg = httpContext.GetPar( "Gx_msg") ;
      AV85Station = httpContext.GetPar( "Station") ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV90Lb_numero, AV98Lb_FechaEfrom, AV99Lb_FechaEto, AV15FilterFullText, AV86EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV107Ok, AV26TFLb_numero, AV27TFLb_numero_To, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFLb_ArtCod, AV33TFLb_ArtCod_Sel, AV34TFLb_ArtDsc, AV35TFLb_ArtDsc_Sel, AV40TFLb_ColNom, AV41TFLb_ColNom_Sel, AV42TFLb_ColNum, AV43TFLb_ColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV48TFLb_ColNomC, AV49TFLb_ColNomC_Sel, AV50TFLb_ColNumC, AV51TFLb_ColNumC_To, AV52TFLb_Cartaz, AV53TFLb_Cartaz_Sel, AV58TFLb_HoraE, AV97TFLb_EstEns_Sels, AV74TFLb_Rb, AV75TFLb_Rb_To, AV100TFLb_Pantone, AV101TFLb_Pantone_Sel, AV102TFLb_PedCod, AV103TFLb_PedCod_Sel, AV112Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Moda21, AV105ContVal, Gx_msg, AV85Station, Gx_date) ;
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
      pa1U52( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1U52( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.entradaensayolaboratorioww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorioWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV112Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratorioww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV90Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vLB_FECHAEFROM", localUtil.format(AV98Lb_FechaEfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vLB_FECHAETO", localUtil.format(AV99Lb_FechaEto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_72", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_72, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV82GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV83GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV80DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV80DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV107Ok));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV26TFLb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_NUMERO_TO", GXutil.ltrim( localUtil.ntoc( AV27TFLb_numero_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV28TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV30TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV31TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ARTCOD", GXutil.rtrim( AV32TFLb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ARTCOD_SEL", GXutil.rtrim( AV33TFLb_ArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ARTDSC", GXutil.rtrim( AV34TFLb_ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ARTDSC_SEL", GXutil.rtrim( AV35TFLb_ArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNOM", GXutil.rtrim( AV40TFLb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNOM_SEL", GXutil.rtrim( AV41TFLb_ColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV42TFLb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV43TFLb_ColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV44TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV45TFTipColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNOMC", GXutil.rtrim( AV48TFLb_ColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNOMC_SEL", GXutil.rtrim( AV49TFLb_ColNomC_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNUMC", GXutil.ltrim( localUtil.ntoc( AV50TFLb_ColNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_COLNUMC_TO", GXutil.ltrim( localUtil.ntoc( AV51TFLb_ColNumC_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_CARTAZ", GXutil.rtrim( AV52TFLb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_CARTAZ_SEL", GXutil.rtrim( AV53TFLb_Cartaz_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_HORAE", localUtil.ttoc( AV58TFLb_HoraE, 10, 8, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFLB_ESTENS_SELS", AV97TFLb_EstEns_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFLB_ESTENS_SELS", AV97TFLb_EstEns_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_RB", GXutil.ltrim( localUtil.ntoc( AV74TFLb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_RB_TO", GXutil.ltrim( localUtil.ntoc( AV75TFLb_Rb_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_PANTONE", GXutil.rtrim( AV100TFLb_Pantone));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_PANTONE_SEL", GXutil.rtrim( AV101TFLb_Pantone_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_PEDCOD", GXutil.rtrim( AV102TFLb_PedCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_PEDCOD_SEL", GXutil.rtrim( AV103TFLb_PedCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV89Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89Moda21), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ESTENS_SELSJSON", AV96TFLb_EstEns_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV105ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV88UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV85Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV86EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_NUMERONEW", GXutil.ltrim( localUtil.ntoc( AV91lb_numeroNew, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Width", GXutil.rtrim( Dvpanel_totales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Autowidth", GXutil.booltostr( Dvpanel_totales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Autoheight", GXutil.booltostr( Dvpanel_totales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Cls", GXutil.rtrim( Dvpanel_totales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Title", GXutil.rtrim( Dvpanel_totales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Collapsible", GXutil.booltostr( Dvpanel_totales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Collapsed", GXutil.booltostr( Dvpanel_totales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Showcollapseicon", GXutil.booltostr( Dvpanel_totales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Iconposition", GXutil.rtrim( Dvpanel_totales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TOTALES_Autoscroll", GXutil.booltostr( Dvpanel_totales_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICAR_Title", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Title", GXutil.rtrim( Dvelop_confirmpanel_duplicarmasopcion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_duplicarmasopcion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicarmasopcion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicarmasopcion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicarmasopcion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_duplicarmasopcion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_duplicarmasopcion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_duplicarmasopcion_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_duplicarmasopcion_Result));
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
         we1U52( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1U52( ) ;
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
      return formatLink("app.gestionlaboratorio.entradaensayolaboratorioww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.EntradaEnsayoLaboratorioWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Entrada Ensayo Laboratorio", "") ;
   }

   public void wb1U50( )
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
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_numero_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_numero_Internalname, httpContext.getMessage( "Nº de Ensayo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_numero_Internalname, GXutil.ltrim( localUtil.ntoc( AV90Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV90Lb_numero), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV90Lb_numero), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_numero_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_numero_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_fechaefrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_fechaefrom_Internalname, httpContext.getMessage( "Fec. Ent. Ini.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavLb_fechaefrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_fechaefrom_Internalname, localUtil.format(AV98Lb_FechaEfrom, "99/99/99"), localUtil.format( AV98Lb_FechaEfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_fechaefrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_fechaefrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavLb_fechaefrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavLb_fechaefrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_fechaeto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_fechaeto_Internalname, httpContext.getMessage( "Fec. Ent. Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavLb_fechaeto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_fechaeto_Internalname, localUtil.format(AV99Lb_FechaEto, "99/99/99"), localUtil.format( AV99Lb_FechaEto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_fechaeto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_fechaeto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavLb_fechaeto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavLb_fechaeto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_40_1U52( true) ;
      }
      else
      {
         wb_table1_40_1U52( false) ;
      }
      return  ;
   }

   public void wb_table1_40_1U52e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_totales_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_totales_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_totales.setProperty("Width", Dvpanel_totales_Width);
         ucDvpanel_totales.setProperty("AutoWidth", Dvpanel_totales_Autowidth);
         ucDvpanel_totales.setProperty("AutoHeight", Dvpanel_totales_Autoheight);
         ucDvpanel_totales.setProperty("Cls", Dvpanel_totales_Cls);
         ucDvpanel_totales.setProperty("Title", Dvpanel_totales_Title);
         ucDvpanel_totales.setProperty("Collapsible", Dvpanel_totales_Collapsible);
         ucDvpanel_totales.setProperty("Collapsed", Dvpanel_totales_Collapsed);
         ucDvpanel_totales.setProperty("ShowCollapseIcon", Dvpanel_totales_Showcollapseicon);
         ucDvpanel_totales.setProperty("IconPosition", Dvpanel_totales_Iconposition);
         ucDvpanel_totales.setProperty("AutoScroll", Dvpanel_totales_Autoscroll);
         ucDvpanel_totales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_totales_Internalname, "DVPANEL_TOTALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TOTALESContainer"+"Totales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTotales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_60_1U52( true) ;
      }
      else
      {
         wb_table2_60_1U52( false) ;
      }
      return  ;
   }

   public void wb_table2_60_1U52e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         startgridcontrol72( ) ;
      }
      if ( wbEnd == 72 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_72 = (int)(nGXsfl_72_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV82GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV83GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV112Pgmname), GXutil.rtrim( localUtil.format( AV112Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV80DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV80DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table3_106_1U52( true) ;
      }
      else
      {
         wb_table3_106_1U52( false) ;
      }
      return  ;
   }

   public void wb_table3_106_1U52e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_111_1U52( true) ;
      }
      else
      {
         wb_table4_111_1U52( false) ;
      }
      return  ;
   }

   public void wb_table4_111_1U52e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_116_1U52( true) ;
      }
      else
      {
         wb_table5_116_1U52( false) ;
      }
      return  ;
   }

   public void wb_table5_116_1U52e( boolean wbgen )
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
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_horaeauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_horaeauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_horaeauxdate_Internalname, localUtil.format(AV60DDO_Lb_HoraEAuxDate, "99/99/99"), localUtil.format( AV60DDO_Lb_HoraEAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_horaeauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_horaeauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 72 )
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

   public void start1U52( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Entrada Ensayo Laboratorio", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1U50( ) ;
   }

   public void ws1U52( )
   {
      start1U52( ) ;
      evt1U52( ) ;
   }

   public void evt1U52( )
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
                           e111U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DUPLICAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e191U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e201U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e211U52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VLB_NUMERO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e221U52 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_72_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_722( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV84GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84GridActions), 4, 0));
                           A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
                           A5534Lb_ArtDsc = httpContext.cgiGet( edtLb_ArtDsc_Internalname) ;
                           A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
                           A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n831TipColCod = false ;
                           A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
                           A5539Lb_ColNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
                           A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
                           A5542Lb_HoraE = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtLb_HoraE_Internalname), 0)) ;
                           cmbLb_EstEns.setName( cmbLb_EstEns.getInternalname() );
                           cmbLb_EstEns.setValue( httpContext.cgiGet( cmbLb_EstEns.getInternalname()) );
                           A5569Lb_EstEns = (byte)(GXutil.lval( httpContext.cgiGet( cmbLb_EstEns.getInternalname()))) ;
                           A5547Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtLb_Rb_Internalname)) ;
                           A6546Lb_Pantone = httpContext.cgiGet( edtLb_Pantone_Internalname) ;
                           A6618Lb_PedCod = httpContext.cgiGet( edtLb_PedCod_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e231U52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e241U52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e251U52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e261U52 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Lb_numero Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vLB_NUMERO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV90Lb_numero )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Lb_fechaefrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vLB_FECHAEFROM"), 0), AV98Lb_FechaEfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Lb_fechaeto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vLB_FECHAETO"), 0), AV99Lb_FechaEto) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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

   public void we1U52( )
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

   public void pa1U52( )
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
            GX_FocusControl = edtavLb_numero_Internalname ;
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
      subsflControlProps_722( ) ;
      while ( nGXsfl_72_idx <= nRC_GXsfl_72 )
      {
         sendrow_722( ) ;
         nGXsfl_72_idx = ((subGrid_Islastpage==1)&&(nGXsfl_72_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_72_idx+1) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_722( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV90Lb_numero ,
                                 java.util.Date AV98Lb_FechaEfrom ,
                                 java.util.Date AV99Lb_FechaEto ,
                                 String AV15FilterFullText ,
                                 String AV86EmprCod ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV107Ok ,
                                 int AV26TFLb_numero ,
                                 int AV27TFLb_numero_To ,
                                 int AV28TFCliCod ,
                                 int AV29TFCliCod_To ,
                                 String AV30TFCliNom ,
                                 String AV31TFCliNom_Sel ,
                                 String AV32TFLb_ArtCod ,
                                 String AV33TFLb_ArtCod_Sel ,
                                 String AV34TFLb_ArtDsc ,
                                 String AV35TFLb_ArtDsc_Sel ,
                                 String AV40TFLb_ColNom ,
                                 String AV41TFLb_ColNom_Sel ,
                                 int AV42TFLb_ColNum ,
                                 int AV43TFLb_ColNum_To ,
                                 byte AV44TFTipColCod ,
                                 byte AV45TFTipColCod_To ,
                                 String AV48TFLb_ColNomC ,
                                 String AV49TFLb_ColNomC_Sel ,
                                 int AV50TFLb_ColNumC ,
                                 int AV51TFLb_ColNumC_To ,
                                 String AV52TFLb_Cartaz ,
                                 String AV53TFLb_Cartaz_Sel ,
                                 java.util.Date AV58TFLb_HoraE ,
                                 GXSimpleCollection<Byte> AV97TFLb_EstEns_Sels ,
                                 java.math.BigDecimal AV74TFLb_Rb ,
                                 java.math.BigDecimal AV75TFLb_Rb_To ,
                                 String AV100TFLb_Pantone ,
                                 String AV101TFLb_Pantone_Sel ,
                                 String AV102TFLb_PedCod ,
                                 String AV103TFLb_PedCod_Sel ,
                                 String AV112Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 short AV89Moda21 ,
                                 int AV105ContVal ,
                                 String Gx_msg ,
                                 String AV85Station ,
                                 java.util.Date Gx_date )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e241U52 ();
      GRID_nCurrentRecord = 0 ;
      rf1U52( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorioWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV112Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratorioww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LB_RB", getSecureSignedToken( "", localUtil.format( A5547Lb_Rb, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_RB", GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LB_ESTENS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5569Lb_EstEns), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_ESTENS", GXutil.ltrim( localUtil.ntoc( A5569Lb_EstEns, (byte)(1), (byte)(0), ".", "")));
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
      rf1U52( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV112Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorioWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112Pgmname", AV112Pgmname);
      Gx_err = (short)(0) ;
      edtavTotalproducto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotalproducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotalproducto_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1U52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(72) ;
      /* Execute user event: Refresh */
      e241U52 ();
      nGXsfl_72_idx = 1 ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_722( ) ;
      bGXsfl_72_Refreshing = true ;
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
         subsflControlProps_722( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A5569Lb_EstEns) ,
                                              AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                              AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                              Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                              Integer.valueOf(AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                              Integer.valueOf(AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                              Integer.valueOf(AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                              AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                              AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                              AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                              AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                              AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                              AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                              AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                              AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                              Integer.valueOf(AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                              Integer.valueOf(AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                              Byte.valueOf(AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                              Byte.valueOf(AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                              AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                              AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                              Integer.valueOf(AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                              Integer.valueOf(AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                              AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                              AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                              AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                              Integer.valueOf(AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                              AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                              AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                              AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                              AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                              AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                              AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                              AV98Lb_FechaEfrom ,
                                              AV99Lb_FechaEto ,
                                              Integer.valueOf(AV90Lb_numero) ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A5533Lb_ArtCod ,
                                              A5534Lb_ArtDsc ,
                                              A5536Lb_ColNom ,
                                              Integer.valueOf(A5537Lb_ColNum) ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A5538Lb_ColNomC ,
                                              Integer.valueOf(A5539Lb_ColNumC) ,
                                              A5540Lb_Cartaz ,
                                              A5547Lb_Rb ,
                                              A6546Lb_Pantone ,
                                              A6618Lb_PedCod ,
                                              A5542Lb_HoraE ,
                                              A5541Lb_FechaE ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV86EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
         lV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
         lV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
         lV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
         lV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
         lV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
         lV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
         lV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
         lV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
         /* Using cursor H01U52 */
         pr_default.execute(0, new Object[] {AV86EmprCod, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV98Lb_FechaEfrom, AV99Lb_FechaEto, Integer.valueOf(AV90Lb_numero), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_72_idx = 1 ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_722( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01U52_A396EmprCod[0] ;
            A6618Lb_PedCod = H01U52_A6618Lb_PedCod[0] ;
            A6546Lb_Pantone = H01U52_A6546Lb_Pantone[0] ;
            A5547Lb_Rb = H01U52_A5547Lb_Rb[0] ;
            A5569Lb_EstEns = H01U52_A5569Lb_EstEns[0] ;
            A5542Lb_HoraE = H01U52_A5542Lb_HoraE[0] ;
            A5541Lb_FechaE = H01U52_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = H01U52_A5540Lb_Cartaz[0] ;
            A5539Lb_ColNumC = H01U52_A5539Lb_ColNumC[0] ;
            A5538Lb_ColNomC = H01U52_A5538Lb_ColNomC[0] ;
            A831TipColCod = H01U52_A831TipColCod[0] ;
            n831TipColCod = H01U52_n831TipColCod[0] ;
            A5537Lb_ColNum = H01U52_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = H01U52_A5536Lb_ColNom[0] ;
            A5534Lb_ArtDsc = H01U52_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = H01U52_A5533Lb_ArtCod[0] ;
            A279CliNom = H01U52_A279CliNom[0] ;
            A252CliCod = H01U52_A252CliCod[0] ;
            A5532Lb_numero = H01U52_A5532Lb_numero[0] ;
            A279CliNom = H01U52_A279CliNom[0] ;
            e251U52 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(72) ;
         wb1U50( ) ;
      }
      bGXsfl_72_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1U52( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV89Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LB_RB"+"_"+sGXsfl_72_idx, getSecureSignedToken( sGXsfl_72_idx, localUtil.format( A5547Lb_Rb, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LB_ESTENS"+"_"+sGXsfl_72_idx, getSecureSignedToken( sGXsfl_72_idx, localUtil.format( DecimalUtil.doubleToDec(A5569Lb_EstEns), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV105ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_msg, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV85Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV15FilterFullText ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV26TFLb_numero ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV27TFLb_numero_To ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV28TFCliCod ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV30TFCliNom ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV31TFCliNom_Sel ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV32TFLb_ArtCod ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV33TFLb_ArtCod_Sel ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV34TFLb_ArtDsc ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV35TFLb_ArtDsc_Sel ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV40TFLb_ColNom ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV41TFLb_ColNom_Sel ;
      AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV42TFLb_ColNum ;
      AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV43TFLb_ColNum_To ;
      AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV44TFTipColCod ;
      AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV45TFTipColCod_To ;
      AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV48TFLb_ColNomC ;
      AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV49TFLb_ColNomC_Sel ;
      AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV50TFLb_ColNumC ;
      AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV51TFLb_ColNumC_To ;
      AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV52TFLb_Cartaz ;
      AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV53TFLb_Cartaz_Sel ;
      AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV58TFLb_HoraE ;
      AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV97TFLb_EstEns_Sels ;
      AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV74TFLb_Rb ;
      AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV75TFLb_Rb_To ;
      AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV100TFLb_Pantone ;
      AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV101TFLb_Pantone_Sel ;
      AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV102TFLb_PedCod ;
      AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV103TFLb_PedCod_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV98Lb_FechaEfrom ,
                                           AV99Lb_FechaEto ,
                                           Integer.valueOf(AV90Lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV86EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor H01U53 */
      pr_default.execute(1, new Object[] {AV86EmprCod, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV98Lb_FechaEfrom, AV99Lb_FechaEto, Integer.valueOf(AV90Lb_numero)});
      GRID_nRecordCount = H01U53_AGRID_nRecordCount[0] ;
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
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV15FilterFullText ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV26TFLb_numero ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV27TFLb_numero_To ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV28TFCliCod ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV30TFCliNom ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV31TFCliNom_Sel ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV32TFLb_ArtCod ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV33TFLb_ArtCod_Sel ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV34TFLb_ArtDsc ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV35TFLb_ArtDsc_Sel ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV40TFLb_ColNom ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV41TFLb_ColNom_Sel ;
      AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV42TFLb_ColNum ;
      AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV43TFLb_ColNum_To ;
      AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV44TFTipColCod ;
      AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV45TFTipColCod_To ;
      AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV48TFLb_ColNomC ;
      AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV49TFLb_ColNomC_Sel ;
      AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV50TFLb_ColNumC ;
      AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV51TFLb_ColNumC_To ;
      AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV52TFLb_Cartaz ;
      AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV53TFLb_Cartaz_Sel ;
      AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV58TFLb_HoraE ;
      AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV97TFLb_EstEns_Sels ;
      AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV74TFLb_Rb ;
      AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV75TFLb_Rb_To ;
      AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV100TFLb_Pantone ;
      AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV101TFLb_Pantone_Sel ;
      AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV102TFLb_PedCod ;
      AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV103TFLb_PedCod_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV90Lb_numero, AV98Lb_FechaEfrom, AV99Lb_FechaEto, AV15FilterFullText, AV86EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV107Ok, AV26TFLb_numero, AV27TFLb_numero_To, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFLb_ArtCod, AV33TFLb_ArtCod_Sel, AV34TFLb_ArtDsc, AV35TFLb_ArtDsc_Sel, AV40TFLb_ColNom, AV41TFLb_ColNom_Sel, AV42TFLb_ColNum, AV43TFLb_ColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV48TFLb_ColNomC, AV49TFLb_ColNomC_Sel, AV50TFLb_ColNumC, AV51TFLb_ColNumC_To, AV52TFLb_Cartaz, AV53TFLb_Cartaz_Sel, AV58TFLb_HoraE, AV97TFLb_EstEns_Sels, AV74TFLb_Rb, AV75TFLb_Rb_To, AV100TFLb_Pantone, AV101TFLb_Pantone_Sel, AV102TFLb_PedCod, AV103TFLb_PedCod_Sel, AV112Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Moda21, AV105ContVal, Gx_msg, AV85Station, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV15FilterFullText ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV26TFLb_numero ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV27TFLb_numero_To ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV28TFCliCod ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV30TFCliNom ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV31TFCliNom_Sel ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV32TFLb_ArtCod ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV33TFLb_ArtCod_Sel ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV34TFLb_ArtDsc ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV35TFLb_ArtDsc_Sel ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV40TFLb_ColNom ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV41TFLb_ColNom_Sel ;
      AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV42TFLb_ColNum ;
      AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV43TFLb_ColNum_To ;
      AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV44TFTipColCod ;
      AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV45TFTipColCod_To ;
      AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV48TFLb_ColNomC ;
      AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV49TFLb_ColNomC_Sel ;
      AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV50TFLb_ColNumC ;
      AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV51TFLb_ColNumC_To ;
      AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV52TFLb_Cartaz ;
      AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV53TFLb_Cartaz_Sel ;
      AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV58TFLb_HoraE ;
      AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV97TFLb_EstEns_Sels ;
      AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV74TFLb_Rb ;
      AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV75TFLb_Rb_To ;
      AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV100TFLb_Pantone ;
      AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV101TFLb_Pantone_Sel ;
      AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV102TFLb_PedCod ;
      AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV103TFLb_PedCod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV90Lb_numero, AV98Lb_FechaEfrom, AV99Lb_FechaEto, AV15FilterFullText, AV86EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV107Ok, AV26TFLb_numero, AV27TFLb_numero_To, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFLb_ArtCod, AV33TFLb_ArtCod_Sel, AV34TFLb_ArtDsc, AV35TFLb_ArtDsc_Sel, AV40TFLb_ColNom, AV41TFLb_ColNom_Sel, AV42TFLb_ColNum, AV43TFLb_ColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV48TFLb_ColNomC, AV49TFLb_ColNomC_Sel, AV50TFLb_ColNumC, AV51TFLb_ColNumC_To, AV52TFLb_Cartaz, AV53TFLb_Cartaz_Sel, AV58TFLb_HoraE, AV97TFLb_EstEns_Sels, AV74TFLb_Rb, AV75TFLb_Rb_To, AV100TFLb_Pantone, AV101TFLb_Pantone_Sel, AV102TFLb_PedCod, AV103TFLb_PedCod_Sel, AV112Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Moda21, AV105ContVal, Gx_msg, AV85Station, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV15FilterFullText ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV26TFLb_numero ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV27TFLb_numero_To ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV28TFCliCod ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV30TFCliNom ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV31TFCliNom_Sel ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV32TFLb_ArtCod ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV33TFLb_ArtCod_Sel ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV34TFLb_ArtDsc ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV35TFLb_ArtDsc_Sel ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV40TFLb_ColNom ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV41TFLb_ColNom_Sel ;
      AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV42TFLb_ColNum ;
      AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV43TFLb_ColNum_To ;
      AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV44TFTipColCod ;
      AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV45TFTipColCod_To ;
      AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV48TFLb_ColNomC ;
      AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV49TFLb_ColNomC_Sel ;
      AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV50TFLb_ColNumC ;
      AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV51TFLb_ColNumC_To ;
      AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV52TFLb_Cartaz ;
      AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV53TFLb_Cartaz_Sel ;
      AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV58TFLb_HoraE ;
      AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV97TFLb_EstEns_Sels ;
      AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV74TFLb_Rb ;
      AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV75TFLb_Rb_To ;
      AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV100TFLb_Pantone ;
      AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV101TFLb_Pantone_Sel ;
      AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV102TFLb_PedCod ;
      AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV103TFLb_PedCod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV90Lb_numero, AV98Lb_FechaEfrom, AV99Lb_FechaEto, AV15FilterFullText, AV86EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV107Ok, AV26TFLb_numero, AV27TFLb_numero_To, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFLb_ArtCod, AV33TFLb_ArtCod_Sel, AV34TFLb_ArtDsc, AV35TFLb_ArtDsc_Sel, AV40TFLb_ColNom, AV41TFLb_ColNom_Sel, AV42TFLb_ColNum, AV43TFLb_ColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV48TFLb_ColNomC, AV49TFLb_ColNomC_Sel, AV50TFLb_ColNumC, AV51TFLb_ColNumC_To, AV52TFLb_Cartaz, AV53TFLb_Cartaz_Sel, AV58TFLb_HoraE, AV97TFLb_EstEns_Sels, AV74TFLb_Rb, AV75TFLb_Rb_To, AV100TFLb_Pantone, AV101TFLb_Pantone_Sel, AV102TFLb_PedCod, AV103TFLb_PedCod_Sel, AV112Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Moda21, AV105ContVal, Gx_msg, AV85Station, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV15FilterFullText ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV26TFLb_numero ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV27TFLb_numero_To ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV28TFCliCod ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV30TFCliNom ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV31TFCliNom_Sel ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV32TFLb_ArtCod ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV33TFLb_ArtCod_Sel ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV34TFLb_ArtDsc ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV35TFLb_ArtDsc_Sel ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV40TFLb_ColNom ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV41TFLb_ColNom_Sel ;
      AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV42TFLb_ColNum ;
      AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV43TFLb_ColNum_To ;
      AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV44TFTipColCod ;
      AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV45TFTipColCod_To ;
      AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV48TFLb_ColNomC ;
      AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV49TFLb_ColNomC_Sel ;
      AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV50TFLb_ColNumC ;
      AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV51TFLb_ColNumC_To ;
      AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV52TFLb_Cartaz ;
      AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV53TFLb_Cartaz_Sel ;
      AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV58TFLb_HoraE ;
      AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV97TFLb_EstEns_Sels ;
      AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV74TFLb_Rb ;
      AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV75TFLb_Rb_To ;
      AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV100TFLb_Pantone ;
      AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV101TFLb_Pantone_Sel ;
      AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV102TFLb_PedCod ;
      AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV103TFLb_PedCod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV90Lb_numero, AV98Lb_FechaEfrom, AV99Lb_FechaEto, AV15FilterFullText, AV86EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV107Ok, AV26TFLb_numero, AV27TFLb_numero_To, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFLb_ArtCod, AV33TFLb_ArtCod_Sel, AV34TFLb_ArtDsc, AV35TFLb_ArtDsc_Sel, AV40TFLb_ColNom, AV41TFLb_ColNom_Sel, AV42TFLb_ColNum, AV43TFLb_ColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV48TFLb_ColNomC, AV49TFLb_ColNomC_Sel, AV50TFLb_ColNumC, AV51TFLb_ColNumC_To, AV52TFLb_Cartaz, AV53TFLb_Cartaz_Sel, AV58TFLb_HoraE, AV97TFLb_EstEns_Sels, AV74TFLb_Rb, AV75TFLb_Rb_To, AV100TFLb_Pantone, AV101TFLb_Pantone_Sel, AV102TFLb_PedCod, AV103TFLb_PedCod_Sel, AV112Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Moda21, AV105ContVal, Gx_msg, AV85Station, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV15FilterFullText ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV26TFLb_numero ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV27TFLb_numero_To ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV28TFCliCod ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV30TFCliNom ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV31TFCliNom_Sel ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV32TFLb_ArtCod ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV33TFLb_ArtCod_Sel ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV34TFLb_ArtDsc ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV35TFLb_ArtDsc_Sel ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV40TFLb_ColNom ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV41TFLb_ColNom_Sel ;
      AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV42TFLb_ColNum ;
      AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV43TFLb_ColNum_To ;
      AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV44TFTipColCod ;
      AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV45TFTipColCod_To ;
      AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV48TFLb_ColNomC ;
      AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV49TFLb_ColNomC_Sel ;
      AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV50TFLb_ColNumC ;
      AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV51TFLb_ColNumC_To ;
      AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV52TFLb_Cartaz ;
      AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV53TFLb_Cartaz_Sel ;
      AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV58TFLb_HoraE ;
      AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV97TFLb_EstEns_Sels ;
      AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV74TFLb_Rb ;
      AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV75TFLb_Rb_To ;
      AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV100TFLb_Pantone ;
      AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV101TFLb_Pantone_Sel ;
      AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV102TFLb_PedCod ;
      AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV103TFLb_PedCod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV90Lb_numero, AV98Lb_FechaEfrom, AV99Lb_FechaEto, AV15FilterFullText, AV86EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV107Ok, AV26TFLb_numero, AV27TFLb_numero_To, AV28TFCliCod, AV29TFCliCod_To, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFLb_ArtCod, AV33TFLb_ArtCod_Sel, AV34TFLb_ArtDsc, AV35TFLb_ArtDsc_Sel, AV40TFLb_ColNom, AV41TFLb_ColNom_Sel, AV42TFLb_ColNum, AV43TFLb_ColNum_To, AV44TFTipColCod, AV45TFTipColCod_To, AV48TFLb_ColNomC, AV49TFLb_ColNomC_Sel, AV50TFLb_ColNumC, AV51TFLb_ColNumC_To, AV52TFLb_Cartaz, AV53TFLb_Cartaz_Sel, AV58TFLb_HoraE, AV97TFLb_EstEns_Sels, AV74TFLb_Rb, AV75TFLb_Rb_To, AV100TFLb_Pantone, AV101TFLb_Pantone_Sel, AV102TFLb_PedCod, AV103TFLb_PedCod_Sel, AV112Pgmname, AV12OrderedBy, AV13OrderedDsc, AV89Moda21, AV105ContVal, Gx_msg, AV85Station, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV112Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorioWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112Pgmname", AV112Pgmname);
      Gx_err = (short)(0) ;
      edtavTotalproducto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotalproducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotalproducto_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1U50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e231U52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV80DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_72 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_72"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV82GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV83GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvpanel_totales_Width = httpContext.cgiGet( "DVPANEL_TOTALES_Width") ;
         Dvpanel_totales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Autowidth")) ;
         Dvpanel_totales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Autoheight")) ;
         Dvpanel_totales_Cls = httpContext.cgiGet( "DVPANEL_TOTALES_Cls") ;
         Dvpanel_totales_Title = httpContext.cgiGet( "DVPANEL_TOTALES_Title") ;
         Dvpanel_totales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Collapsible")) ;
         Dvpanel_totales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Collapsed")) ;
         Dvpanel_totales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Showcollapseicon")) ;
         Dvpanel_totales_Iconposition = httpContext.cgiGet( "DVPANEL_TOTALES_Iconposition") ;
         Dvpanel_totales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TOTALES_Autoscroll")) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
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
         Dvelop_confirmpanel_duplicar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICAR_Title") ;
         Dvelop_confirmpanel_duplicar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICAR_Confirmationtext") ;
         Dvelop_confirmpanel_duplicar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_duplicar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_duplicar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_duplicar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_duplicar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICAR_Confirmtype") ;
         Dvelop_confirmpanel_duplicarmasopcion_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Title") ;
         Dvelop_confirmpanel_duplicarmasopcion_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Confirmationtext") ;
         Dvelop_confirmpanel_duplicarmasopcion_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_duplicarmasopcion_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Nobuttoncaption") ;
         Dvelop_confirmpanel_duplicarmasopcion_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_duplicarmasopcion_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Yesbuttonposition") ;
         Dvelop_confirmpanel_duplicarmasopcion_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
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
         Dvelop_confirmpanel_duplicar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICAR_Result") ;
         Dvelop_confirmpanel_duplicarmasopcion_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_NUMERO");
            GX_FocusControl = edtavLb_numero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90Lb_numero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Lb_numero), 8, 0));
         }
         else
         {
            AV90Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtavLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Lb_numero), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavLb_fechaefrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vLB_FECHAEFROM");
            GX_FocusControl = edtavLb_fechaefrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV98Lb_FechaEfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_FechaEfrom", localUtil.format(AV98Lb_FechaEfrom, "99/99/99"));
         }
         else
         {
            AV98Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( edtavLb_fechaefrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_FechaEfrom", localUtil.format(AV98Lb_FechaEfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavLb_fechaeto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vLB_FECHAETO");
            GX_FocusControl = edtavLb_fechaeto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV99Lb_FechaEto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99Lb_FechaEto", localUtil.format(AV99Lb_FechaEto, "99/99/99"));
         }
         else
         {
            AV99Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( edtavLb_fechaeto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99Lb_FechaEto", localUtil.format(AV99Lb_FechaEto, "99/99/99"));
         }
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTotalproducto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTotalproducto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTALPRODUCTO");
            GX_FocusControl = edtavTotalproducto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV109TotalProducto = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109TotalProducto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109TotalProducto), 4, 0));
         }
         else
         {
            AV109TotalProducto = (short)(localUtil.ctol( httpContext.cgiGet( edtavTotalproducto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109TotalProducto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109TotalProducto), 4, 0));
         }
         AV112Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112Pgmname", AV112Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_horaeauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_HORAEAUXDATE");
            GX_FocusControl = edtavDdo_lb_horaeauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60DDO_Lb_HoraEAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60DDO_Lb_HoraEAuxDate", localUtil.format(AV60DDO_Lb_HoraEAuxDate, "99/99/99"));
         }
         else
         {
            AV60DDO_Lb_HoraEAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_horaeauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60DDO_Lb_HoraEAuxDate", localUtil.format(AV60DDO_Lb_HoraEAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorioWW");
         AV112Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112Pgmname", AV112Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV112Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\entradaensayolaboratorioww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vLB_NUMERO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV90Lb_numero )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vLB_FECHAEFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV98Lb_FechaEfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vLB_FECHAETO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV99Lb_FechaEto)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e231U52 ();
      if (returnInSub) return;
   }

   public void e231U52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV85Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaensayolaboratorioww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV85Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Station", AV85Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85Station, ""))));
      GXv_char2[0] = AV86EmprCod ;
      GXv_char3[0] = AV87EmprNom ;
      GXv_char4[0] = AV88UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV85Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaensayolaboratorioww_impl.this.AV86EmprCod = GXv_char2[0] ;
      entradaensayolaboratorioww_impl.this.AV87EmprNom = GXv_char3[0] ;
      entradaensayolaboratorioww_impl.this.AV88UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86EmprCod", AV86EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV88UsurCod", AV88UsurCod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Entrada Ensayo Laboratorio", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV80DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV80DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV89Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV86EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      entradaensayolaboratorioww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV89Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89Moda21), "ZZZ9")));
      GXt_int9 = AV105ContVal ;
      GXv_int10[0] = GXt_int9 ;
      new app.pbuscon(remoteHandle, context).execute( AV86EmprCod, httpContext.getMessage( "DLTENS", ""), GXv_int10) ;
      entradaensayolaboratorioww_impl.this.GXt_int9 = GXv_int10[0] ;
      AV105ContVal = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105ContVal), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105ContVal), "ZZZZZZZ9")));
      GXt_int7 = (byte)(AV106Existedltens) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV86EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      entradaensayolaboratorioww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV106Existedltens = GXt_int7 ;
      AV98Lb_FechaEfrom = GXutil.dadd(Gx_date,-(90)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_FechaEfrom", localUtil.format(AV98Lb_FechaEfrom, "99/99/99"));
      AV99Lb_FechaEto = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99Lb_FechaEto", localUtil.format(AV99Lb_FechaEto, "99/99/99"));
   }

   public void e241U52( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      edtLb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_ArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtCod_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_ArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtDsc_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_ColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNom_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_ColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNum_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtTipColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_ColNomC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ColNomC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNomC_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_ColNumC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_ColNumC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNumC_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_Cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Cartaz_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_FechaE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_FechaE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaE_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_HoraE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_HoraE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_HoraE_Visible), 5, 0), !bGXsfl_72_Refreshing);
      cmbLb_EstEns.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLb_EstEns.getInternalname(), "Visible", GXutil.ltrimstr( cmbLb_EstEns.getVisible(), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_Rb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Rb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Rb_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_Pantone_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Pantone_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Pantone_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtLb_PedCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_PedCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_PedCod_Visible), 5, 0), !bGXsfl_72_Refreshing);
      AV82GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridCurrentPage), 10, 0));
      AV83GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83GridPageCount), 10, 0));
      if ( GXutil.strcmp(AV107Ok, httpContext.getMessage( "S", "")) == 0 )
      {
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
      }
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV15FilterFullText ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV26TFLb_numero ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV27TFLb_numero_To ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV28TFCliCod ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV30TFCliNom ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV31TFCliNom_Sel ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV32TFLb_ArtCod ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV33TFLb_ArtCod_Sel ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV34TFLb_ArtDsc ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV35TFLb_ArtDsc_Sel ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV40TFLb_ColNom ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV41TFLb_ColNom_Sel ;
      AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV42TFLb_ColNum ;
      AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV43TFLb_ColNum_To ;
      AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV44TFTipColCod ;
      AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV45TFTipColCod_To ;
      AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV48TFLb_ColNomC ;
      AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV49TFLb_ColNomC_Sel ;
      AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV50TFLb_ColNumC ;
      AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV51TFLb_ColNumC_To ;
      AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV52TFLb_Cartaz ;
      AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV53TFLb_Cartaz_Sel ;
      AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV58TFLb_HoraE ;
      AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV97TFLb_EstEns_Sels ;
      AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV74TFLb_Rb ;
      AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV75TFLb_Rb_To ;
      AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV100TFLb_Pantone ;
      AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV101TFLb_Pantone_Sel ;
      AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV102TFLb_PedCod ;
      AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV103TFLb_PedCod_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121U52( )
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
         AV81PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV81PageToGo) ;
      }
   }

   public void e131U52( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141U52( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numero") == 0 )
         {
            AV26TFLb_numero = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFLb_numero), 8, 0));
            AV27TFLb_numero_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV28TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
            AV29TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV30TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliNom", AV30TFCliNom);
            AV31TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliNom_Sel", AV31TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ArtCod") == 0 )
         {
            AV32TFLb_ArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFLb_ArtCod", AV32TFLb_ArtCod);
            AV33TFLb_ArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFLb_ArtCod_Sel", AV33TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ArtDsc") == 0 )
         {
            AV34TFLb_ArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFLb_ArtDsc", AV34TFLb_ArtDsc);
            AV35TFLb_ArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFLb_ArtDsc_Sel", AV35TFLb_ArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNom") == 0 )
         {
            AV40TFLb_ColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLb_ColNom", AV40TFLb_ColNom);
            AV41TFLb_ColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFLb_ColNom_Sel", AV41TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNum") == 0 )
         {
            AV42TFLb_ColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFLb_ColNum), 6, 0));
            AV43TFLb_ColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV44TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFTipColCod), 2, 0));
            AV45TFTipColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNomC") == 0 )
         {
            AV48TFLb_ColNomC = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFLb_ColNomC", AV48TFLb_ColNomC);
            AV49TFLb_ColNomC_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFLb_ColNomC_Sel", AV49TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNumC") == 0 )
         {
            AV50TFLb_ColNumC = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFLb_ColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFLb_ColNumC), 6, 0));
            AV51TFLb_ColNumC_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFLb_ColNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFLb_ColNumC_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Cartaz") == 0 )
         {
            AV52TFLb_Cartaz = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFLb_Cartaz", AV52TFLb_Cartaz);
            AV53TFLb_Cartaz_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFLb_Cartaz_Sel", AV53TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_HoraE") == 0 )
         {
            AV58TFLb_HoraE = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFLb_HoraE", localUtil.ttoc( AV58TFLb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_EstEns") == 0 )
         {
            AV96TFLb_EstEns_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFLb_EstEns_SelsJson", AV96TFLb_EstEns_SelsJson);
            AV97TFLb_EstEns_Sels.fromJSonString(GXutil.strReplace( AV96TFLb_EstEns_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Rb") == 0 )
         {
            AV74TFLb_Rb = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFLb_Rb", GXutil.ltrimstr( AV74TFLb_Rb, 7, 2));
            AV75TFLb_Rb_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFLb_Rb_To", GXutil.ltrimstr( AV75TFLb_Rb_To, 7, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Pantone") == 0 )
         {
            AV100TFLb_Pantone = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFLb_Pantone", AV100TFLb_Pantone);
            AV101TFLb_Pantone_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFLb_Pantone_Sel", AV101TFLb_Pantone_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_PedCod") == 0 )
         {
            AV102TFLb_PedCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFLb_PedCod", AV102TFLb_PedCod);
            AV103TFLb_PedCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFLb_PedCod_Sel", AV103TFLb_PedCod_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97TFLb_EstEns_Sels", AV97TFLb_EstEns_Sels);
   }

   private void e251U52( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Opciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Informe", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Informe LIMPO", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Duplicar", ""), "fa fa-hand-holding", "", "", "", "", "", "", ""), (short)(0));
      if ( AV89Moda21 == 1 )
      {
         cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Duplicar mas Opcion", ""), "fa fa-hand-holding", "", "", "", "", "", "", ""), (short)(0));
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(72) ;
      }
      sendrow_722( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_72_Refreshing )
      {
         httpContext.doAjaxLoad(72, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV84GridActions, 4, 0)) );
   }

   public void e151U52( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EntradaEnsayoLaboratorioWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111U52( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.EntradaEnsayoLaboratorioWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV112Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.EntradaEnsayoLaboratorioWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.EntradaEnsayoLaboratorioWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         entradaensayolaboratorioww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV112Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S152 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97TFLb_EstEns_Sels", AV97TFLb_EstEns_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e261U52( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV84GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV84GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV84GridActions == 3 )
      {
         /* Execute user subroutine: 'DO OPCIONES' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV84GridActions == 4 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV84GridActions == 5 )
      {
         /* Execute user subroutine: 'DO INFORME' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV84GridActions == 6 )
      {
         /* Execute user subroutine: 'DO INFORMELIMPO' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV84GridActions == 7 )
      {
         /* Execute user subroutine: 'DO DUPLICAR' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV84GridActions == 8 )
      {
         /* Execute user subroutine: 'DO DUPLICARMASOPCION' */
         S272 ();
         if (returnInSub) return;
      }
      AV84GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV84GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e161U52( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S282 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e171U52( )
   {
      /* Dvelop_confirmpanel_duplicar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_duplicar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DUPLICAR' */
         S292 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e181U52( )
   {
      /* Dvelop_confirmpanel_duplicarmasopcion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_duplicarmasopcion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DUPLICARMASOPCION' */
         S302 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e191U52( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.gestionlaboratorio.entradaensayolaboratorio", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV86EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","Lb_numero"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e201U52( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV104Websession.setValue(httpContext.getMessage( "&EmprCod", ""), AV86EmprCod);
      AV104Websession.setValue(httpContext.getMessage( "&Lb_FechaEfrom", ""), GXutil.trim( localUtil.dtoc( AV98Lb_FechaEfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")));
      AV104Websession.setValue(httpContext.getMessage( "&Lb_FechaEto", ""), GXutil.trim( localUtil.dtoc( AV99Lb_FechaEto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")));
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.gestionlaboratorio.entradaensayolaboratoriowwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      entradaensayolaboratorioww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      entradaensayolaboratorioww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97TFLb_EstEns_Sels", AV97TFLb_EstEns_Sels);
   }

   public void e211U52( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV104Websession.setValue(httpContext.getMessage( "&EmprCod", ""), AV86EmprCod);
      AV104Websession.setValue(httpContext.getMessage( "&Lb_FechaEfrom", ""), GXutil.trim( localUtil.dtoc( AV98Lb_FechaEfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")));
      AV104Websession.setValue(httpContext.getMessage( "&Lb_FechaEto", ""), GXutil.trim( localUtil.dtoc( AV99Lb_FechaEto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")));
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.gestionlaboratorio.entradaensayolaboratoriowwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97TFLb_EstEns_Sels", AV97TFLb_EstEns_Sels);
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "CliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "CliNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_ArtDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_ColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_ColNum", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "TipColCod", "", "TC", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_ColNumC", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_FechaE", "Entrada", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_HoraE", "Entrada", "Hora", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_EstEns", "", "E", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_Rb", "", "Rb", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_Pantone", "", "Pantone", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Lb_PedCod", "", "V/Pedido", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EntradaEnsayoLaboratorioWWColumnsSelector", GXv_char4) ;
      entradaensayolaboratorioww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.EntradaEnsayoLaboratorioWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFLb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFLb_numero), 8, 0));
      AV27TFLb_numero_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFLb_numero_To), 8, 0));
      AV28TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
      AV29TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
      AV30TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliNom", AV30TFCliNom);
      AV31TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliNom_Sel", AV31TFCliNom_Sel);
      AV32TFLb_ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFLb_ArtCod", AV32TFLb_ArtCod);
      AV33TFLb_ArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFLb_ArtCod_Sel", AV33TFLb_ArtCod_Sel);
      AV34TFLb_ArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFLb_ArtDsc", AV34TFLb_ArtDsc);
      AV35TFLb_ArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFLb_ArtDsc_Sel", AV35TFLb_ArtDsc_Sel);
      AV40TFLb_ColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFLb_ColNom", AV40TFLb_ColNom);
      AV41TFLb_ColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFLb_ColNom_Sel", AV41TFLb_ColNom_Sel);
      AV42TFLb_ColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFLb_ColNum), 6, 0));
      AV43TFLb_ColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFLb_ColNum_To), 6, 0));
      AV44TFTipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFTipColCod), 2, 0));
      AV45TFTipColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFTipColCod_To), 2, 0));
      AV48TFLb_ColNomC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFLb_ColNomC", AV48TFLb_ColNomC);
      AV49TFLb_ColNomC_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFLb_ColNomC_Sel", AV49TFLb_ColNomC_Sel);
      AV50TFLb_ColNumC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFLb_ColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFLb_ColNumC), 6, 0));
      AV51TFLb_ColNumC_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFLb_ColNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFLb_ColNumC_To), 6, 0));
      AV52TFLb_Cartaz = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFLb_Cartaz", AV52TFLb_Cartaz);
      AV53TFLb_Cartaz_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFLb_Cartaz_Sel", AV53TFLb_Cartaz_Sel);
      AV58TFLb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFLb_HoraE", localUtil.ttoc( AV58TFLb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV97TFLb_EstEns_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV74TFLb_Rb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFLb_Rb", GXutil.ltrimstr( AV74TFLb_Rb, 7, 2));
      AV75TFLb_Rb_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFLb_Rb_To", GXutil.ltrimstr( AV75TFLb_Rb_To, 7, 2));
      AV100TFLb_Pantone = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TFLb_Pantone", AV100TFLb_Pantone);
      AV101TFLb_Pantone_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101TFLb_Pantone_Sel", AV101TFLb_Pantone_Sel);
      AV102TFLb_PedCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102TFLb_PedCod", AV102TFLb_PedCod);
      AV103TFLb_PedCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103TFLb_PedCod_Sel", AV103TFLb_PedCod_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S202( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.gestionlaboratorio.entradaensayolaboratorio", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5532Lb_numero,8,0))}, new String[] {"Mode","EmprCod","Lb_numero"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.gestionlaboratorio.entradaensayolaboratorio", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5532Lb_numero,8,0))}, new String[] {"Mode","EmprCod","Lb_numero"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO OPCIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.gestionlaboratorio.modalentradaensayolaboratorioopciones", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5532Lb_numero,8,0)),GXutil.URLEncode(DecimalUtil.decToString(A5547Lb_Rb))}, new String[] {"Emprcod","Lb_numero","Lb_Rb"}) , new Object[] {});
   }

   public void S232( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( A5569Lb_EstEns == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ensayo actualizado en Produccion", ""));
      }
      else
      {
         if ( A5569Lb_EstEns == 1 )
         {
            Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Atencion. Ensayo ", "")+GXutil.trim( GXutil.str( A5532Lb_numero, 8, 0))+httpContext.getMessage( ", actualizado en TEXPLUS!!. Confirma Eliminacion?", "") ;
            ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         }
         if ( A5569Lb_EstEns == 2 )
         {
            Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Atencion. Ensayo ", "")+GXutil.trim( GXutil.str( A5532Lb_numero, 8, 0))+httpContext.getMessage( ", cerrado en TEXPLUS!!. Confirma Eliminacion?", "") ;
            ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         }
         if ( A5569Lb_EstEns == 0 )
         {
            Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "¿Desea Eliminar el Ensayo ", "")+GXutil.trim( GXutil.str( A5532Lb_numero, 8, 0))+"?" ;
            ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         }
         AV107Ok = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107Ok", AV107Ok);
         httpContext.popup(formatLink("app.albaranes.pwdgrl", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV105ContVal,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"UsurPwd1","PwdBo"}) , new Object[] {"AV107Ok"});
         httpContext.doAjaxRefresh();
         if ( 1 == 2 )
         {
            AV145Emprcod_selected = A396EmprCod ;
            AV146Lb_numero_selected = A5532Lb_numero ;
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
         }
      }
   }

   public void S282( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A5532Lb_numero ;
      new app.pens012(remoteHandle, context).execute( GXv_char4, GXv_int10) ;
      entradaensayolaboratorioww_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorioww_impl.this.A5532Lb_numero = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      if ( AV89Moda21 == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_int16[0] = A5532Lb_numero ;
         new app.pregcor6(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int16) ;
         entradaensayolaboratorioww_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaensayolaboratorioww_impl.this.A252CliCod = GXv_int10[0] ;
         entradaensayolaboratorioww_impl.this.A5532Lb_numero = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      AV92Inc_obs = Gx_msg ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV112Pgmname, AV88UsurCod, AV85Station, AV92Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
      AV107Ok = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107Ok", AV107Ok);
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO INFORME' Routine */
      returnInSub = false ;
      if ( AV89Moda21 == 1 )
      {
         httpContext.popup(formatLink("app.gestionlaboratorio.rens101", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5532Lb_numero,8,0))}, new String[] {"EmprCod","Lb_numero"}) , new Object[] {"A396EmprCod","A5532Lb_numero"});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Inform NO definido", ""));
      }
   }

   public void S252( )
   {
      /* 'DO INFORMELIMPO' Routine */
      returnInSub = false ;
      if ( AV89Moda21 == 1 )
      {
         httpContext.popup(formatLink("app.gestionlaboratorio.rens101x", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5532Lb_numero,8,0))}, new String[] {"EmprCod","Lb_numero"}) , new Object[] {"A396EmprCod","A5532Lb_numero"});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Inform NO definido", ""));
      }
   }

   public void S262( )
   {
      /* 'DO DUPLICAR' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_duplicar_Confirmationtext = httpContext.getMessage( "¿Ha seleccionado el Nº Ensayo ", "")+GXutil.trim( GXutil.str( A5532Lb_numero, 8, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_duplicar.sendProperty(context, "", false, Dvelop_confirmpanel_duplicar_Internalname, "ConfirmationText", Dvelop_confirmpanel_duplicar_Confirmationtext);
      Dvelop_confirmpanel_duplicar_Confirmationtext = Dvelop_confirmpanel_duplicar_Confirmationtext+httpContext.getMessage( "Desea copiar los datos al nuevo Ensayo?", "") ;
      ucDvelop_confirmpanel_duplicar.sendProperty(context, "", false, Dvelop_confirmpanel_duplicar_Internalname, "ConfirmationText", Dvelop_confirmpanel_duplicar_Confirmationtext);
      AV145Emprcod_selected = A396EmprCod ;
      AV146Lb_numero_selected = A5532Lb_numero ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DUPLICARContainer", "Confirm", "", new Object[] {});
   }

   public void S292( )
   {
      /* 'DO ACTION DUPLICAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV86EmprCod ;
      GXv_int16[0] = A5532Lb_numero ;
      GXv_int10[0] = AV91lb_numeroNew ;
      GXv_char3[0] = AV88UsurCod ;
      new app.gestionlaboratorio.pdupnlab(remoteHandle, context).execute( GXv_char4, GXv_int16, GXv_int10, GXv_char3) ;
      entradaensayolaboratorioww_impl.this.AV86EmprCod = GXv_char4[0] ;
      entradaensayolaboratorioww_impl.this.A5532Lb_numero = GXv_int16[0] ;
      entradaensayolaboratorioww_impl.this.AV91lb_numeroNew = GXv_int10[0] ;
      entradaensayolaboratorioww_impl.this.AV88UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86EmprCod", AV86EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV91lb_numeroNew", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91lb_numeroNew), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV88UsurCod", AV88UsurCod);
      AV92Inc_obs = httpContext.getMessage( "N Lab creado ", "") + GXutil.str( AV91lb_numeroNew, 8, 0) + GXutil.newLine( ) ;
      AV92Inc_obs += httpContext.getMessage( "En funcion de ", "") + GXutil.str( AV90Lb_numero, 8, 0) + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( AV86EmprCod, AV112Pgmname, AV88UsurCod, AV85Station, AV92Inc_obs, AV91lb_numeroNew, (byte)(0), "") ;
      httpContext.doAjaxRefresh();
   }

   public void S272( )
   {
      /* 'DO DUPLICARMASOPCION' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_duplicar_Confirmationtext = httpContext.getMessage( "¿Ha seleccionado el Nº Ensayo ", "")+GXutil.trim( GXutil.str( A5532Lb_numero, 8, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_duplicar.sendProperty(context, "", false, Dvelop_confirmpanel_duplicar_Internalname, "ConfirmationText", Dvelop_confirmpanel_duplicar_Confirmationtext);
      Dvelop_confirmpanel_duplicar_Confirmationtext = Dvelop_confirmpanel_duplicar_Confirmationtext+httpContext.getMessage( "Desea copiar los datos al nuevo Ensayo?", "") ;
      ucDvelop_confirmpanel_duplicar.sendProperty(context, "", false, Dvelop_confirmpanel_duplicar_Internalname, "ConfirmationText", Dvelop_confirmpanel_duplicar_Confirmationtext);
      AV145Emprcod_selected = A396EmprCod ;
      AV146Lb_numero_selected = A5532Lb_numero ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCIONContainer", "Confirm", "", new Object[] {});
   }

   public void S302( )
   {
      /* 'DO ACTION DUPLICARMASOPCION' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int16[0] = A5532Lb_numero ;
      GXv_int10[0] = AV91lb_numeroNew ;
      GXv_char3[0] = AV88UsurCod ;
      new app.gestionlaboratorio.dupnlabconopcion(remoteHandle, context).execute( GXv_char4, GXv_int16, GXv_int10, GXv_char3) ;
      entradaensayolaboratorioww_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorioww_impl.this.A5532Lb_numero = GXv_int16[0] ;
      entradaensayolaboratorioww_impl.this.AV91lb_numeroNew = GXv_int10[0] ;
      entradaensayolaboratorioww_impl.this.AV88UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV91lb_numeroNew", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91lb_numeroNew), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV88UsurCod", AV88UsurCod);
      httpContext.doAjaxRefresh();
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV112Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV112Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV112Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV148GXV1 = 1 ;
      while ( AV148GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV148GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV26TFLb_numero = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFLb_numero), 8, 0));
            AV27TFLb_numero_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV28TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
            AV29TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV30TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliNom", AV30TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV31TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliNom_Sel", AV31TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV32TFLb_ArtCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFLb_ArtCod", AV32TFLb_ArtCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV33TFLb_ArtCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFLb_ArtCod_Sel", AV33TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV34TFLb_ArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFLb_ArtDsc", AV34TFLb_ArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV35TFLb_ArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFLb_ArtDsc_Sel", AV35TFLb_ArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV40TFLb_ColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLb_ColNom", AV40TFLb_ColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV41TFLb_ColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFLb_ColNom_Sel", AV41TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV42TFLb_ColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFLb_ColNum), 6, 0));
            AV43TFLb_ColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV44TFTipColCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFTipColCod), 2, 0));
            AV45TFTipColCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV48TFLb_ColNomC = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFLb_ColNomC", AV48TFLb_ColNomC);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV49TFLb_ColNomC_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFLb_ColNomC_Sel", AV49TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUMC") == 0 )
         {
            AV50TFLb_ColNumC = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFLb_ColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFLb_ColNumC), 6, 0));
            AV51TFLb_ColNumC_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFLb_ColNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFLb_ColNumC_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV52TFLb_Cartaz = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFLb_Cartaz", AV52TFLb_Cartaz);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV53TFLb_Cartaz_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFLb_Cartaz_Sel", AV53TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAE") == 0 )
         {
            AV58TFLb_HoraE = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFLb_HoraE", localUtil.ttoc( AV58TFLb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV60DDO_Lb_HoraEAuxDate = GXutil.resetTime(AV58TFLb_HoraE) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60DDO_Lb_HoraEAuxDate", localUtil.format(AV60DDO_Lb_HoraEAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTENS_SEL") == 0 )
         {
            AV96TFLb_EstEns_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFLb_EstEns_SelsJson", AV96TFLb_EstEns_SelsJson);
            AV97TFLb_EstEns_Sels.fromJSonString(AV96TFLb_EstEns_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV74TFLb_Rb = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFLb_Rb", GXutil.ltrimstr( AV74TFLb_Rb, 7, 2));
            AV75TFLb_Rb_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFLb_Rb_To", GXutil.ltrimstr( AV75TFLb_Rb_To, 7, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PANTONE") == 0 )
         {
            AV100TFLb_Pantone = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFLb_Pantone", AV100TFLb_Pantone);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PANTONE_SEL") == 0 )
         {
            AV101TFLb_Pantone_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFLb_Pantone_Sel", AV101TFLb_Pantone_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PEDCOD") == 0 )
         {
            AV102TFLb_PedCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFLb_PedCod", AV102TFLb_PedCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PEDCOD_SEL") == 0 )
         {
            AV103TFLb_PedCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFLb_PedCod_Sel", AV103TFLb_PedCod_Sel);
         }
         AV148GXV1 = (int)(AV148GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFCliNom_Sel)==0), AV31TFCliNom_Sel, GXv_char4) ;
      entradaensayolaboratorioww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char17 = "" ;
      GXv_char3[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFLb_ArtCod_Sel)==0), AV33TFLb_ArtCod_Sel, GXv_char3) ;
      entradaensayolaboratorioww_impl.this.GXt_char17 = GXv_char3[0] ;
      GXt_char18 = "" ;
      GXv_char2[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFLb_ArtDsc_Sel)==0), AV35TFLb_ArtDsc_Sel, GXv_char2) ;
      entradaensayolaboratorioww_impl.this.GXt_char18 = GXv_char2[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFLb_ColNom_Sel)==0), AV41TFLb_ColNom_Sel, GXv_char20) ;
      entradaensayolaboratorioww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFLb_ColNomC_Sel)==0), AV49TFLb_ColNomC_Sel, GXv_char22) ;
      entradaensayolaboratorioww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFLb_Cartaz_Sel)==0), AV53TFLb_Cartaz_Sel, GXv_char24) ;
      entradaensayolaboratorioww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFLb_Pantone_Sel)==0), AV101TFLb_Pantone_Sel, GXv_char26) ;
      entradaensayolaboratorioww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV103TFLb_PedCod_Sel)==0), AV103TFLb_PedCod_Sel, GXv_char28) ;
      entradaensayolaboratorioww_impl.this.GXt_char27 = GXv_char28[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char17+"|"+GXt_char18+"|"+GXt_char19+"|||"+GXt_char21+"||"+GXt_char23+"|||"+((AV97TFLb_EstEns_Sels.size()==0) ? "" : AV96TFLb_EstEns_SelsJson)+"||"+GXt_char25+"|"+GXt_char27 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFCliNom)==0), AV30TFCliNom, GXv_char28) ;
      entradaensayolaboratorioww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFLb_ArtCod)==0), AV32TFLb_ArtCod, GXv_char26) ;
      entradaensayolaboratorioww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFLb_ArtDsc)==0), AV34TFLb_ArtDsc, GXv_char24) ;
      entradaensayolaboratorioww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFLb_ColNom)==0), AV40TFLb_ColNom, GXv_char22) ;
      entradaensayolaboratorioww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFLb_ColNomC)==0), AV48TFLb_ColNomC, GXv_char20) ;
      entradaensayolaboratorioww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFLb_Cartaz)==0), AV52TFLb_Cartaz, GXv_char4) ;
      entradaensayolaboratorioww_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char17 = "" ;
      GXv_char3[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV100TFLb_Pantone)==0), AV100TFLb_Pantone, GXv_char3) ;
      entradaensayolaboratorioww_impl.this.GXt_char17 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFLb_PedCod)==0), AV102TFLb_PedCod, GXv_char2) ;
      entradaensayolaboratorioww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFLb_numero) ? "" : GXutil.str( AV26TFLb_numero, 8, 0))+"|"+((0==AV28TFCliCod) ? "" : GXutil.str( AV28TFCliCod, 6, 0))+"|"+GXt_char27+"|"+GXt_char25+"|"+GXt_char23+"|"+GXt_char21+"|"+((0==AV42TFLb_ColNum) ? "" : GXutil.str( AV42TFLb_ColNum, 6, 0))+"|"+((0==AV44TFTipColCod) ? "" : GXutil.str( AV44TFTipColCod, 2, 0))+"|"+GXt_char19+"|"+((0==AV50TFLb_ColNumC) ? "" : GXutil.str( AV50TFLb_ColNumC, 6, 0))+"|"+GXt_char18+"||"+(GXutil.dateCompare(GXutil.nullDate(), AV58TFLb_HoraE) ? "" : localUtil.dtoc( AV60DDO_Lb_HoraEAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFLb_Rb)==0) ? "" : GXutil.str( AV74TFLb_Rb, 7, 2))+"|"+GXt_char17+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFLb_numero_To) ? "" : GXutil.str( AV27TFLb_numero_To, 8, 0))+"|"+((0==AV29TFCliCod_To) ? "" : GXutil.str( AV29TFCliCod_To, 6, 0))+"|||||"+((0==AV43TFLb_ColNum_To) ? "" : GXutil.str( AV43TFLb_ColNum_To, 6, 0))+"|"+((0==AV45TFTipColCod_To) ? "" : GXutil.str( AV45TFTipColCod_To, 2, 0))+"||"+((0==AV51TFLb_ColNumC_To) ? "" : GXutil.str( AV51TFLb_ColNumC_To, 6, 0))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFLb_Rb_To)==0) ? "" : GXutil.str( AV75TFLb_Rb_To, 7, 2))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV112Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_NUMERO", "", !((0==AV26TFLb_numero)&&(0==AV27TFLb_numero_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFLb_numero, 8, 0)), GXutil.trim( GXutil.str( AV27TFLb_numero_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFCLICOD", "", !((0==AV28TFCliCod)&&(0==AV29TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV29TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFCLINOM", "", !(GXutil.strcmp("", AV30TFCliNom)==0), (short)(0), AV30TFCliNom, "", !(GXutil.strcmp("", AV31TFCliNom_Sel)==0), AV31TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_ARTCOD", "", !(GXutil.strcmp("", AV32TFLb_ArtCod)==0), (short)(0), AV32TFLb_ArtCod, "", !(GXutil.strcmp("", AV33TFLb_ArtCod_Sel)==0), AV33TFLb_ArtCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_ARTDSC", "", !(GXutil.strcmp("", AV34TFLb_ArtDsc)==0), (short)(0), AV34TFLb_ArtDsc, "", !(GXutil.strcmp("", AV35TFLb_ArtDsc_Sel)==0), AV35TFLb_ArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_COLNOM", "", !(GXutil.strcmp("", AV40TFLb_ColNom)==0), (short)(0), AV40TFLb_ColNom, "", !(GXutil.strcmp("", AV41TFLb_ColNom_Sel)==0), AV41TFLb_ColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_COLNUM", "", !((0==AV42TFLb_ColNum)&&(0==AV43TFLb_ColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFLb_ColNum, 6, 0)), GXutil.trim( GXutil.str( AV43TFLb_ColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFTIPCOLCOD", "", !((0==AV44TFTipColCod)&&(0==AV45TFTipColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFTipColCod, 2, 0)), GXutil.trim( GXutil.str( AV45TFTipColCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_COLNOMC", "", !(GXutil.strcmp("", AV48TFLb_ColNomC)==0), (short)(0), AV48TFLb_ColNomC, "", !(GXutil.strcmp("", AV49TFLb_ColNomC_Sel)==0), AV49TFLb_ColNomC_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_COLNUMC", "", !((0==AV50TFLb_ColNumC)&&(0==AV51TFLb_ColNumC_To)), (short)(0), GXutil.trim( GXutil.str( AV50TFLb_ColNumC, 6, 0)), GXutil.trim( GXutil.str( AV51TFLb_ColNumC_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_CARTAZ", "", !(GXutil.strcmp("", AV52TFLb_Cartaz)==0), (short)(0), AV52TFLb_Cartaz, "", !(GXutil.strcmp("", AV53TFLb_Cartaz_Sel)==0), AV53TFLb_Cartaz_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_HORAE", "", !GXutil.dateCompare(GXutil.nullDate(), AV58TFLb_HoraE), (short)(0), GXutil.trim( localUtil.ttoc( AV58TFLb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_ESTENS_SEL", "", !(AV97TFLb_EstEns_Sels.size()==0), (short)(0), AV97TFLb_EstEns_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_RB", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFLb_Rb)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFLb_Rb_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV74TFLb_Rb, 7, 2)), GXutil.trim( GXutil.str( AV75TFLb_Rb_To, 7, 2))) ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_PANTONE", "", !(GXutil.strcmp("", AV100TFLb_Pantone)==0), (short)(0), AV100TFLb_Pantone, "", !(GXutil.strcmp("", AV101TFLb_Pantone_Sel)==0), AV101TFLb_Pantone_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFLB_PEDCOD", "", !(GXutil.strcmp("", AV102TFLb_PedCod)==0), (short)(0), AV102TFLb_PedCod, "", !(GXutil.strcmp("", AV103TFLb_PedCod_Sel)==0), AV103TFLb_PedCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState29[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV112Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV112Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.EntradaEnsayoLaboratorio" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( 1 == 2 ) ) )
      {
         divDvpanel_totales_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_totales_cell_Internalname, "Class", divDvpanel_totales_cell_Class, true);
      }
      else
      {
         divDvpanel_totales_cell_Class = "hidden-xs hidden-sm hidden-md hidden-lg col-xs-12 WWFiltersCell" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_totales_cell_Internalname, "Class", divDvpanel_totales_cell_Class, true);
      }
   }

   public void e221U52( )
   {
      /* Lb_numero_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV90Lb_numero > 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         AV98Lb_FechaEfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_FechaEfrom", localUtil.format(AV98Lb_FechaEfrom, "99/99/99"));
         AV99Lb_FechaEto = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99Lb_FechaEto", localUtil.format(AV99Lb_FechaEto, "99/99/99"));
      }
      else
      {
         AV98Lb_FechaEfrom = GXutil.dadd(Gx_date,-(90)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98Lb_FechaEfrom", localUtil.format(AV98Lb_FechaEfrom, "99/99/99"));
         AV99Lb_FechaEto = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99Lb_FechaEto", localUtil.format(AV99Lb_FechaEto, "99/99/99"));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97TFLb_EstEns_Sels", AV97TFLb_EstEns_Sels);
   }

   public void wb_table5_116_1U52( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_duplicarmasopcion_Internalname, tblTabledvelop_confirmpanel_duplicarmasopcion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_duplicarmasopcion.setProperty("Title", Dvelop_confirmpanel_duplicarmasopcion_Title);
         ucDvelop_confirmpanel_duplicarmasopcion.setProperty("ConfirmationText", Dvelop_confirmpanel_duplicarmasopcion_Confirmationtext);
         ucDvelop_confirmpanel_duplicarmasopcion.setProperty("YesButtonCaption", Dvelop_confirmpanel_duplicarmasopcion_Yesbuttoncaption);
         ucDvelop_confirmpanel_duplicarmasopcion.setProperty("NoButtonCaption", Dvelop_confirmpanel_duplicarmasopcion_Nobuttoncaption);
         ucDvelop_confirmpanel_duplicarmasopcion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_duplicarmasopcion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_duplicarmasopcion.setProperty("YesButtonPosition", Dvelop_confirmpanel_duplicarmasopcion_Yesbuttonposition);
         ucDvelop_confirmpanel_duplicarmasopcion.setProperty("ConfirmType", Dvelop_confirmpanel_duplicarmasopcion_Confirmtype);
         ucDvelop_confirmpanel_duplicarmasopcion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_duplicarmasopcion_Internalname, "DVELOP_CONFIRMPANEL_DUPLICARMASOPCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_DUPLICARMASOPCIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_116_1U52e( true) ;
      }
      else
      {
         wb_table5_116_1U52e( false) ;
      }
   }

   public void wb_table4_111_1U52( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_duplicar_Internalname, tblTabledvelop_confirmpanel_duplicar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_duplicar.setProperty("Title", Dvelop_confirmpanel_duplicar_Title);
         ucDvelop_confirmpanel_duplicar.setProperty("ConfirmationText", Dvelop_confirmpanel_duplicar_Confirmationtext);
         ucDvelop_confirmpanel_duplicar.setProperty("YesButtonCaption", Dvelop_confirmpanel_duplicar_Yesbuttoncaption);
         ucDvelop_confirmpanel_duplicar.setProperty("NoButtonCaption", Dvelop_confirmpanel_duplicar_Nobuttoncaption);
         ucDvelop_confirmpanel_duplicar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_duplicar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_duplicar.setProperty("YesButtonPosition", Dvelop_confirmpanel_duplicar_Yesbuttonposition);
         ucDvelop_confirmpanel_duplicar.setProperty("ConfirmType", Dvelop_confirmpanel_duplicar_Confirmtype);
         ucDvelop_confirmpanel_duplicar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_duplicar_Internalname, "DVELOP_CONFIRMPANEL_DUPLICARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_DUPLICARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_111_1U52e( true) ;
      }
      else
      {
         wb_table4_111_1U52e( false) ;
      }
   }

   public void wb_table3_106_1U52( boolean wbgen )
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
         wb_table3_106_1U52e( true) ;
      }
      else
      {
         wb_table3_106_1U52e( false) ;
      }
   }

   public void wb_table2_60_1U52( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedtextblock1_Internalname, tblTablemergedtextblock1_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Total de Producto : ", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotalproducto_Internalname, httpContext.getMessage( "Total Producto", ""), "gx-form-item AttributeEmptyValueLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotalproducto_Internalname, GXutil.ltrim( localUtil.ntoc( AV109TotalProducto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotalproducto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV109TotalProducto), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV109TotalProducto), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotalproducto_Jsonclick, 0, "AttributeEmptyValue", "", "", "", "", 1, edtavTotalproducto_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_60_1U52e( true) ;
      }
      else
      {
         wb_table2_60_1U52e( false) ;
      }
   }

   public void wb_table1_40_1U52( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_45_1U52( true) ;
      }
      else
      {
         wb_table6_45_1U52( false) ;
      }
      return  ;
   }

   public void wb_table6_45_1U52e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_40_1U52e( true) ;
      }
      else
      {
         wb_table1_40_1U52e( false) ;
      }
   }

   public void wb_table6_45_1U52( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_45_1U52e( true) ;
      }
      else
      {
         wb_table6_45_1U52e( false) ;
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
      pa1U52( ) ;
      ws1U52( ) ;
      we1U52( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614694", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/entradaensayolaboratorioww.js", "?20268211614694", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_722( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_72_idx );
      edtLb_numero_Internalname = "LB_NUMERO_"+sGXsfl_72_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_72_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_72_idx ;
      edtLb_ArtCod_Internalname = "LB_ARTCOD_"+sGXsfl_72_idx ;
      edtLb_ArtDsc_Internalname = "LB_ARTDSC_"+sGXsfl_72_idx ;
      edtLb_ColNom_Internalname = "LB_COLNOM_"+sGXsfl_72_idx ;
      edtLb_ColNum_Internalname = "LB_COLNUM_"+sGXsfl_72_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_72_idx ;
      edtLb_ColNomC_Internalname = "LB_COLNOMC_"+sGXsfl_72_idx ;
      edtLb_ColNumC_Internalname = "LB_COLNUMC_"+sGXsfl_72_idx ;
      edtLb_Cartaz_Internalname = "LB_CARTAZ_"+sGXsfl_72_idx ;
      edtLb_FechaE_Internalname = "LB_FECHAE_"+sGXsfl_72_idx ;
      edtLb_HoraE_Internalname = "LB_HORAE_"+sGXsfl_72_idx ;
      cmbLb_EstEns.setInternalname( "LB_ESTENS_"+sGXsfl_72_idx );
      edtLb_Rb_Internalname = "LB_RB_"+sGXsfl_72_idx ;
      edtLb_Pantone_Internalname = "LB_PANTONE_"+sGXsfl_72_idx ;
      edtLb_PedCod_Internalname = "LB_PEDCOD_"+sGXsfl_72_idx ;
   }

   public void subsflControlProps_fel_722( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_72_fel_idx );
      edtLb_numero_Internalname = "LB_NUMERO_"+sGXsfl_72_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_72_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_72_fel_idx ;
      edtLb_ArtCod_Internalname = "LB_ARTCOD_"+sGXsfl_72_fel_idx ;
      edtLb_ArtDsc_Internalname = "LB_ARTDSC_"+sGXsfl_72_fel_idx ;
      edtLb_ColNom_Internalname = "LB_COLNOM_"+sGXsfl_72_fel_idx ;
      edtLb_ColNum_Internalname = "LB_COLNUM_"+sGXsfl_72_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_72_fel_idx ;
      edtLb_ColNomC_Internalname = "LB_COLNOMC_"+sGXsfl_72_fel_idx ;
      edtLb_ColNumC_Internalname = "LB_COLNUMC_"+sGXsfl_72_fel_idx ;
      edtLb_Cartaz_Internalname = "LB_CARTAZ_"+sGXsfl_72_fel_idx ;
      edtLb_FechaE_Internalname = "LB_FECHAE_"+sGXsfl_72_fel_idx ;
      edtLb_HoraE_Internalname = "LB_HORAE_"+sGXsfl_72_fel_idx ;
      cmbLb_EstEns.setInternalname( "LB_ESTENS_"+sGXsfl_72_fel_idx );
      edtLb_Rb_Internalname = "LB_RB_"+sGXsfl_72_fel_idx ;
      edtLb_Pantone_Internalname = "LB_PANTONE_"+sGXsfl_72_fel_idx ;
      edtLb_PedCod_Internalname = "LB_PEDCOD_"+sGXsfl_72_fel_idx ;
   }

   public void sendrow_722( )
   {
      subsflControlProps_722( ) ;
      wb1U50( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_72_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_72_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_72_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 73,'',false,'"+sGXsfl_72_idx+"',72)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_72_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV84GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV84GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV84GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_72_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,73);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV84GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_72_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_numero_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtCod_Internalname,GXutil.rtrim( A5533Lb_ArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtDsc_Internalname,GXutil.rtrim( A5534Lb_ArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNom_Internalname,GXutil.rtrim( A5536Lb_ColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTipColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNomC_Internalname,GXutil.rtrim( A5538Lb_ColNomC),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNomC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ColNomC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_ColNumC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNumC_Internalname,GXutil.ltrim( localUtil.ntoc( A5539Lb_ColNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5539Lb_ColNumC), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNumC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ColNumC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Cartaz_Internalname,GXutil.rtrim( A5540Lb_Cartaz),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_Cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_Cartaz_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaE_Internalname,localUtil.format(A5541Lb_FechaE, "99/99/99"),localUtil.format( A5541Lb_FechaE, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_FechaE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_HoraE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_HoraE_Internalname,localUtil.ttoc( A5542Lb_HoraE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5542Lb_HoraE, "99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_HoraE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_HoraE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbLb_EstEns.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbLb_EstEns.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "LB_ESTENS_" + sGXsfl_72_idx ;
            cmbLb_EstEns.setName( GXCCtl );
            cmbLb_EstEns.setWebtags( "" );
            cmbLb_EstEns.addItem("0", httpContext.getMessage( "Pdte. Act. Txp", ""), (short)(0));
            cmbLb_EstEns.addItem("1", httpContext.getMessage( "Act. en Txp", ""), (short)(0));
            cmbLb_EstEns.addItem("2", httpContext.getMessage( "Cerrado", ""), (short)(0));
            if ( cmbLb_EstEns.getItemCount() > 0 )
            {
               A5569Lb_EstEns = (byte)(GXutil.lval( cmbLb_EstEns.getValidValue(GXutil.trim( GXutil.str( A5569Lb_EstEns, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLb_EstEns,cmbLb_EstEns.getInternalname(),GXutil.trim( GXutil.str( A5569Lb_EstEns, 1, 0)),Integer.valueOf(1),cmbLb_EstEns.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbLb_EstEns.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLb_EstEns.setValue( GXutil.trim( GXutil.str( A5569Lb_EstEns, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbLb_EstEns.getInternalname(), "Values", cmbLb_EstEns.ToJavascriptSource(), !bGXsfl_72_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_Rb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Rb_Internalname,GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_Rb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_Rb_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Pantone_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Pantone_Internalname,GXutil.rtrim( A6546Lb_Pantone),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_Pantone_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_Pantone_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_PedCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_PedCod_Internalname,GXutil.rtrim( A6618Lb_PedCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_PedCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_PedCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1U52( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_72_idx = ((subGrid_Islastpage==1)&&(nGXsfl_72_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_72_idx+1) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_722( ) ;
      }
      /* End function sendrow_722 */
   }

   public void startgridcontrol72( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"72\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº de Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNumC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_HoraE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbLb_EstEns.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Rb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Pantone_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pantone", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_PedCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "V/Pedido", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV84GridActions, (byte)(4), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5538Lb_ColNomC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNomC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5539Lb_ColNumC, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNumC_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A5542Lb_HoraE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_HoraE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5569Lb_EstEns, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbLb_EstEns.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5547Lb_Rb, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Rb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6546Lb_Pantone));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Pantone_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6618Lb_PedCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_PedCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtninsert_Internalname = "BTNINSERT" ;
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      edtavLb_numero_Internalname = "vLB_NUMERO" ;
      edtavLb_fechaefrom_Internalname = "vLB_FECHAEFROM" ;
      edtavLb_fechaeto_Internalname = "vLB_FECHAETO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavTotalproducto_Internalname = "vTOTALPRODUCTO" ;
      tblTablemergedtextblock1_Internalname = "TABLEMERGEDTEXTBLOCK1" ;
      divTotales_Internalname = "TOTALES" ;
      Dvpanel_totales_Internalname = "DVPANEL_TOTALES" ;
      divDvpanel_totales_cell_Internalname = "DVPANEL_TOTALES_CELL" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtLb_numero_Internalname = "LB_NUMERO" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtLb_ArtCod_Internalname = "LB_ARTCOD" ;
      edtLb_ArtDsc_Internalname = "LB_ARTDSC" ;
      edtLb_ColNom_Internalname = "LB_COLNOM" ;
      edtLb_ColNum_Internalname = "LB_COLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtLb_ColNomC_Internalname = "LB_COLNOMC" ;
      edtLb_ColNumC_Internalname = "LB_COLNUMC" ;
      edtLb_Cartaz_Internalname = "LB_CARTAZ" ;
      edtLb_FechaE_Internalname = "LB_FECHAE" ;
      edtLb_HoraE_Internalname = "LB_HORAE" ;
      cmbLb_EstEns.setInternalname( "LB_ESTENS" );
      edtLb_Rb_Internalname = "LB_RB" ;
      edtLb_Pantone_Internalname = "LB_PANTONE" ;
      edtLb_PedCod_Internalname = "LB_PEDCOD" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_duplicar_Internalname = "DVELOP_CONFIRMPANEL_DUPLICAR" ;
      tblTabledvelop_confirmpanel_duplicar_Internalname = "TABLEDVELOP_CONFIRMPANEL_DUPLICAR" ;
      Dvelop_confirmpanel_duplicarmasopcion_Internalname = "DVELOP_CONFIRMPANEL_DUPLICARMASOPCION" ;
      tblTabledvelop_confirmpanel_duplicarmasopcion_Internalname = "TABLEDVELOP_CONFIRMPANEL_DUPLICARMASOPCION" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_lb_horaeauxdate_Internalname = "vDDO_LB_HORAEAUXDATE" ;
      divDdo_lb_horaeauxdates_Internalname = "DDO_LB_HORAEAUXDATES" ;
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
      edtLb_PedCod_Jsonclick = "" ;
      edtLb_Pantone_Jsonclick = "" ;
      edtLb_Rb_Jsonclick = "" ;
      cmbLb_EstEns.setJsonclick( "" );
      edtLb_HoraE_Jsonclick = "" ;
      edtLb_FechaE_Jsonclick = "" ;
      edtLb_Cartaz_Jsonclick = "" ;
      edtLb_ColNumC_Jsonclick = "" ;
      edtLb_ColNomC_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtLb_ColNum_Jsonclick = "" ;
      edtLb_ColNom_Jsonclick = "" ;
      edtLb_ArtDsc_Jsonclick = "" ;
      edtLb_ArtCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtLb_numero_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotalproducto_Jsonclick = "" ;
      edtavTotalproducto_Enabled = 1 ;
      edtLb_PedCod_Visible = -1 ;
      edtLb_Pantone_Visible = -1 ;
      edtLb_Rb_Visible = -1 ;
      cmbLb_EstEns.setVisible( -1 );
      edtLb_HoraE_Visible = -1 ;
      edtLb_FechaE_Visible = -1 ;
      edtLb_Cartaz_Visible = -1 ;
      edtLb_ColNumC_Visible = -1 ;
      edtLb_ColNomC_Visible = -1 ;
      edtTipColCod_Visible = -1 ;
      edtLb_ColNum_Visible = -1 ;
      edtLb_ColNom_Visible = -1 ;
      edtLb_ArtDsc_Visible = -1 ;
      edtLb_ArtCod_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtLb_numero_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lb_horaeauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divDvpanel_totales_cell_Class = "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg" ;
      edtavLb_fechaeto_Jsonclick = "" ;
      edtavLb_fechaeto_Enabled = 1 ;
      edtavLb_fechaefrom_Jsonclick = "" ;
      edtavLb_fechaefrom_Enabled = 1 ;
      edtavLb_numero_Jsonclick = "" ;
      edtavLb_numero_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;Entrada;Entrada;;;;" ;
      Dvelop_confirmpanel_duplicarmasopcion_Confirmtype = "1" ;
      Dvelop_confirmpanel_duplicarmasopcion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_duplicarmasopcion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_duplicarmasopcion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_duplicarmasopcion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_duplicarmasopcion_Confirmationtext = "¿Duplicar?" ;
      Dvelop_confirmpanel_duplicarmasopcion_Title = "" ;
      Dvelop_confirmpanel_duplicar_Confirmtype = "1" ;
      Dvelop_confirmpanel_duplicar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_duplicar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_duplicar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_duplicar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_duplicar_Confirmationtext = "¿Duplicar Ensayo?" ;
      Dvelop_confirmpanel_duplicar_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Deseas eliminar el Ensayo?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.EntradaEnsayoLaboratorioWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||0:Pdte. Act. Txp,1:Act. en Txp,2:Cerrado|||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||||T|||" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic||Dynamic|||FixedValues||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "||T|T|T|T|||T||T|||T||T|T" ;
      Ddo_grid_Filterisrange = "T|T|||||T|T||T|||||T||" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Character|Character|Character|Numeric|Numeric|Character|Numeric|Character||Date||Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T||T||T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17" ;
      Ddo_grid_Columnids = "1:Lb_numero|2:CliCod|3:CliNom|4:Lb_ArtCod|5:Lb_ArtDsc|6:Lb_ColNom|7:Lb_ColNum|8:TipColCod|9:Lb_ColNomC|10:Lb_ColNumC|11:Lb_Cartaz|12:Lb_FechaE|13:Lb_HoraE|14:Lb_EstEns|15:Lb_Rb|16:Lb_Pantone|17:Lb_PedCod" ;
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
      Dvpanel_totales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_totales_Iconposition = "Right" ;
      Dvpanel_totales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_totales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_totales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_totales_Title = "" ;
      Dvpanel_totales_Cls = "PanelNoHeader" ;
      Dvpanel_totales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_totales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_totales_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( " Entrada Ensayo Laboratorio", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_72_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV84GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV84GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84GridActions), 4, 0));
      }
      GXCCtl = "LB_ESTENS_" + sGXsfl_72_idx ;
      cmbLb_EstEns.setName( GXCCtl );
      cmbLb_EstEns.setWebtags( "" );
      cmbLb_EstEns.addItem("0", httpContext.getMessage( "Pdte. Act. Txp", ""), (short)(0));
      cmbLb_EstEns.addItem("1", httpContext.getMessage( "Act. en Txp", ""), (short)(0));
      cmbLb_EstEns.addItem("2", httpContext.getMessage( "Cerrado", ""), (short)(0));
      if ( cmbLb_EstEns.getItemCount() > 0 )
      {
         A5569Lb_EstEns = (byte)(GXutil.lval( cmbLb_EstEns.getValidValue(GXutil.trim( GXutil.str( A5569Lb_EstEns, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNumC_Visible',ctrl:'LB_COLNUMC',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_HoraE_Visible',ctrl:'LB_HORAE',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_Pantone_Visible',ctrl:'LB_PANTONE',prop:'Visible'},{av:'edtLb_PedCod_Visible',ctrl:'LB_PEDCOD',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121U52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131U52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141U52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV96TFLb_EstEns_SelsJson',fld:'vTFLB_ESTENS_SELSJSON',pic:''},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e251U52',iparms:[{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV84GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151U52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNumC_Visible',ctrl:'LB_COLNUMC',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_HoraE_Visible',ctrl:'LB_HORAE',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_Pantone_Visible',ctrl:'LB_PANTONE',prop:'Visible'},{av:'edtLb_PedCod_Visible',ctrl:'LB_PEDCOD',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111U52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV96TFLb_EstEns_SelsJson',fld:'vTFLB_ESTENS_SELSJSON',pic:''},{av:'AV60DDO_Lb_HoraEAuxDate',fld:'vDDO_LB_HORAEAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV96TFLb_EstEns_SelsJson',fld:'vTFLB_ESTENS_SELSJSON',pic:''},{av:'AV60DDO_Lb_HoraEAuxDate',fld:'vDDO_LB_HORAEAUXDATE',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNumC_Visible',ctrl:'LB_COLNUMC',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_HoraE_Visible',ctrl:'LB_HORAE',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_Pantone_Visible',ctrl:'LB_PANTONE',prop:'Visible'},{av:'edtLb_PedCod_Visible',ctrl:'LB_PEDCOD',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e261U52',iparms:[{av:'cmbavGridactions'},{av:'AV84GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5547Lb_Rb',fld:'LB_RB',pic:'ZZZ9.99',hsh:true},{av:'cmbLb_EstEns'},{av:'A5569Lb_EstEns',fld:'LB_ESTENS',pic:'9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV84GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'AV107Ok',fld:'vOK',pic:''},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_duplicar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_DUPLICAR',prop:'ConfirmationText'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNumC_Visible',ctrl:'LB_COLNUMC',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_HoraE_Visible',ctrl:'LB_HORAE',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_Pantone_Visible',ctrl:'LB_PANTONE',prop:'Visible'},{av:'edtLb_PedCod_Visible',ctrl:'LB_PEDCOD',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e161U52',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV88UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNumC_Visible',ctrl:'LB_COLNUMC',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_HoraE_Visible',ctrl:'LB_HORAE',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_Pantone_Visible',ctrl:'LB_PANTONE',prop:'Visible'},{av:'edtLb_PedCod_Visible',ctrl:'LB_PEDCOD',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DUPLICAR.CLOSE","{handler:'e171U52',iparms:[{av:'Dvelop_confirmpanel_duplicar_Result',ctrl:'DVELOP_CONFIRMPANEL_DUPLICAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV91lb_numeroNew',fld:'vLB_NUMERONEW',pic:'ZZZZZZZ9'},{av:'AV88UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DUPLICAR.CLOSE",",oparms:[{av:'AV88UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV91lb_numeroNew',fld:'vLB_NUMERONEW',pic:'ZZZZZZZ9'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNumC_Visible',ctrl:'LB_COLNUMC',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_HoraE_Visible',ctrl:'LB_HORAE',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_Pantone_Visible',ctrl:'LB_PANTONE',prop:'Visible'},{av:'edtLb_PedCod_Visible',ctrl:'LB_PEDCOD',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DUPLICARMASOPCION.CLOSE","{handler:'e181U52',iparms:[{av:'Dvelop_confirmpanel_duplicarmasopcion_Result',ctrl:'DVELOP_CONFIRMPANEL_DUPLICARMASOPCION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV91lb_numeroNew',fld:'vLB_NUMERONEW',pic:'ZZZZZZZ9'},{av:'AV88UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DUPLICARMASOPCION.CLOSE",",oparms:[{av:'AV88UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV91lb_numeroNew',fld:'vLB_NUMERONEW',pic:'ZZZZZZZ9'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNumC_Visible',ctrl:'LB_COLNUMC',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_HoraE_Visible',ctrl:'LB_HORAE',prop:'Visible'},{av:'cmbLb_EstEns'},{av:'edtLb_Rb_Visible',ctrl:'LB_RB',prop:'Visible'},{av:'edtLb_Pantone_Visible',ctrl:'LB_PANTONE',prop:'Visible'},{av:'edtLb_PedCod_Visible',ctrl:'LB_PEDCOD',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e191U52',iparms:[{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e201U52',iparms:[{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV96TFLb_EstEns_SelsJson',fld:'vTFLB_ESTENS_SELSJSON',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV60DDO_Lb_HoraEAuxDate',fld:'vDDO_LB_HORAEAUXDATE',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV96TFLb_EstEns_SelsJson',fld:'vTFLB_ESTENS_SELSJSON',pic:''},{av:'AV60DDO_Lb_HoraEAuxDate',fld:'vDDO_LB_HORAEAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e211U52',iparms:[{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV96TFLb_EstEns_SelsJson',fld:'vTFLB_ESTENS_SELSJSON',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV60DDO_Lb_HoraEAuxDate',fld:'vDDO_LB_HORAEAUXDATE',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV86EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV107Ok',fld:'vOK',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV89Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV105ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'Gx_msg',fld:'vMSG',pic:'',hsh:true},{av:'AV85Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV96TFLb_EstEns_SelsJson',fld:'vTFLB_ESTENS_SELSJSON',pic:''},{av:'AV60DDO_Lb_HoraEAuxDate',fld:'vDDO_LB_HORAEAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VLB_NUMERO.CONTROLVALUECHANGED","{handler:'e221U52',iparms:[{av:'AV90Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("VLB_NUMERO.CONTROLVALUECHANGED",",oparms:[{av:'AV98Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV99Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV27TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV33TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV34TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV35TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV41TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV42TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV43TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV45TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV48TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV49TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV50TFLb_ColNumC',fld:'vTFLB_COLNUMC',pic:'ZZZZZ9'},{av:'AV51TFLb_ColNumC_To',fld:'vTFLB_COLNUMC_TO',pic:'ZZZZZ9'},{av:'AV52TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV53TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV58TFLb_HoraE',fld:'vTFLB_HORAE',pic:'99:99'},{av:'AV97TFLb_EstEns_Sels',fld:'vTFLB_ESTENS_SELS',pic:''},{av:'AV74TFLb_Rb',fld:'vTFLB_RB',pic:'ZZZ9.99'},{av:'AV75TFLb_Rb_To',fld:'vTFLB_RB_TO',pic:'ZZZ9.99'},{av:'AV100TFLb_Pantone',fld:'vTFLB_PANTONE',pic:''},{av:'AV101TFLb_Pantone_Sel',fld:'vTFLB_PANTONE_SEL',pic:''},{av:'AV102TFLb_PedCod',fld:'vTFLB_PEDCOD',pic:''},{av:'AV103TFLb_PedCod_Sel',fld:'vTFLB_PEDCOD_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_pedcod',iparms:[]");
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
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_duplicar_Result = "" ;
      Dvelop_confirmpanel_duplicarmasopcion_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV98Lb_FechaEfrom = GXutil.nullDate() ;
      AV99Lb_FechaEto = GXutil.nullDate() ;
      AV15FilterFullText = "" ;
      AV86EmprCod = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV107Ok = "" ;
      AV30TFCliNom = "" ;
      AV31TFCliNom_Sel = "" ;
      AV32TFLb_ArtCod = "" ;
      AV33TFLb_ArtCod_Sel = "" ;
      AV34TFLb_ArtDsc = "" ;
      AV35TFLb_ArtDsc_Sel = "" ;
      AV40TFLb_ColNom = "" ;
      AV41TFLb_ColNom_Sel = "" ;
      AV48TFLb_ColNomC = "" ;
      AV49TFLb_ColNomC_Sel = "" ;
      AV52TFLb_Cartaz = "" ;
      AV53TFLb_Cartaz_Sel = "" ;
      AV58TFLb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      AV97TFLb_EstEns_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV74TFLb_Rb = DecimalUtil.ZERO ;
      AV75TFLb_Rb_To = DecimalUtil.ZERO ;
      AV100TFLb_Pantone = "" ;
      AV101TFLb_Pantone_Sel = "" ;
      AV102TFLb_PedCod = "" ;
      AV103TFLb_PedCod_Sel = "" ;
      AV112Pgmname = "" ;
      Gx_msg = "" ;
      AV85Station = "" ;
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV80DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV96TFLb_EstEns_SelsJson = "" ;
      A396EmprCod = "" ;
      AV88UsurCod = "" ;
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
      bttBtninsert_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_totales = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV60DDO_Lb_HoraEAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5540Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A6546Lb_Pantone = "" ;
      A6618Lb_PedCod = "" ;
      AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = "" ;
      lV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = "" ;
      lV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = "" ;
      lV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = "" ;
      lV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = "" ;
      lV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = "" ;
      lV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = "" ;
      lV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = "" ;
      lV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = "" ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = "" ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = "" ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = "" ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = "" ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = "" ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = "" ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = "" ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = "" ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = "" ;
      AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = "" ;
      AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = "" ;
      AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = "" ;
      AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = "" ;
      AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = GXutil.resetTime( GXutil.nullDate() );
      AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = DecimalUtil.ZERO ;
      AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = DecimalUtil.ZERO ;
      AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = "" ;
      AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = "" ;
      AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = "" ;
      AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = "" ;
      H01U52_A396EmprCod = new String[] {""} ;
      H01U52_A6618Lb_PedCod = new String[] {""} ;
      H01U52_A6546Lb_Pantone = new String[] {""} ;
      H01U52_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01U52_A5569Lb_EstEns = new byte[1] ;
      H01U52_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      H01U52_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      H01U52_A5540Lb_Cartaz = new String[] {""} ;
      H01U52_A5539Lb_ColNumC = new int[1] ;
      H01U52_A5538Lb_ColNomC = new String[] {""} ;
      H01U52_A831TipColCod = new byte[1] ;
      H01U52_n831TipColCod = new boolean[] {false} ;
      H01U52_A5537Lb_ColNum = new int[1] ;
      H01U52_A5536Lb_ColNom = new String[] {""} ;
      H01U52_A5534Lb_ArtDsc = new String[] {""} ;
      H01U52_A5533Lb_ArtCod = new String[] {""} ;
      H01U52_A279CliNom = new String[] {""} ;
      H01U52_A252CliCod = new int[1] ;
      H01U52_A5532Lb_numero = new int[1] ;
      H01U53_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV87EmprNom = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV104Websession = httpContext.getWebSession();
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      AV145Emprcod_selected = "" ;
      AV92Inc_obs = "" ;
      ucDvelop_confirmpanel_duplicar = new com.genexus.webpanels.GXUserControl();
      GXv_int16 = new int[1] ;
      GXv_int10 = new int[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState29 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDvelop_confirmpanel_duplicarmasopcion = new com.genexus.webpanels.GXUserControl();
      lblTextblock1_Jsonclick = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorioww__default(),
         new Object[] {
             new Object[] {
            H01U52_A396EmprCod, H01U52_A6618Lb_PedCod, H01U52_A6546Lb_Pantone, H01U52_A5547Lb_Rb, H01U52_A5569Lb_EstEns, H01U52_A5542Lb_HoraE, H01U52_A5541Lb_FechaE, H01U52_A5540Lb_Cartaz, H01U52_A5539Lb_ColNumC, H01U52_A5538Lb_ColNomC,
            H01U52_A831TipColCod, H01U52_n831TipColCod, H01U52_A5537Lb_ColNum, H01U52_A5536Lb_ColNom, H01U52_A5534Lb_ArtDsc, H01U52_A5533Lb_ArtCod, H01U52_A279CliNom, H01U52_A252CliCod, H01U52_A5532Lb_numero
            }
            , new Object[] {
            H01U53_AGRID_nRecordCount
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV112Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorioWW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV112Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorioWW" ;
      Gx_err = (short)(0) ;
      edtavTotalproducto_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV44TFTipColCod ;
   private byte AV45TFTipColCod_To ;
   private byte gxajaxcallmode ;
   private byte A831TipColCod ;
   private byte A5569Lb_EstEns ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ;
   private byte AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV12OrderedBy ;
   private short AV89Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV84GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV109TotalProducto ;
   private short AV106Existedltens ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_72 ;
   private int nGXsfl_72_idx=1 ;
   private int AV90Lb_numero ;
   private int AV26TFLb_numero ;
   private int AV27TFLb_numero_To ;
   private int AV28TFCliCod ;
   private int AV29TFCliCod_To ;
   private int AV42TFLb_ColNum ;
   private int AV43TFLb_ColNum_To ;
   private int AV50TFLb_ColNumC ;
   private int AV51TFLb_ColNumC_To ;
   private int AV105ContVal ;
   private int AV91lb_numeroNew ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavLb_numero_Enabled ;
   private int edtavLb_fechaefrom_Enabled ;
   private int edtavLb_fechaeto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int A5539Lb_ColNumC ;
   private int subGrid_Islastpage ;
   private int edtavTotalproducto_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ;
   private int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ;
   private int AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ;
   private int AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ;
   private int AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ;
   private int AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ;
   private int AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ;
   private int AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ;
   private int AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ;
   private int GXt_int9 ;
   private int edtLb_numero_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtLb_ArtCod_Visible ;
   private int edtLb_ArtDsc_Visible ;
   private int edtLb_ColNom_Visible ;
   private int edtLb_ColNum_Visible ;
   private int edtTipColCod_Visible ;
   private int edtLb_ColNomC_Visible ;
   private int edtLb_ColNumC_Visible ;
   private int edtLb_Cartaz_Visible ;
   private int edtLb_FechaE_Visible ;
   private int edtLb_HoraE_Visible ;
   private int edtLb_Rb_Visible ;
   private int edtLb_Pantone_Visible ;
   private int edtLb_PedCod_Visible ;
   private int AV81PageToGo ;
   private int AV146Lb_numero_selected ;
   private int GXv_int16[] ;
   private int GXv_int10[] ;
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
   private long AV82GridCurrentPage ;
   private long AV83GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV74TFLb_Rb ;
   private java.math.BigDecimal AV75TFLb_Rb_To ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ;
   private java.math.BigDecimal AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_duplicar_Result ;
   private String Dvelop_confirmpanel_duplicarmasopcion_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_72_idx="0001" ;
   private String AV86EmprCod ;
   private String AV107Ok ;
   private String AV30TFCliNom ;
   private String AV31TFCliNom_Sel ;
   private String AV32TFLb_ArtCod ;
   private String AV33TFLb_ArtCod_Sel ;
   private String AV34TFLb_ArtDsc ;
   private String AV35TFLb_ArtDsc_Sel ;
   private String AV40TFLb_ColNom ;
   private String AV41TFLb_ColNom_Sel ;
   private String AV48TFLb_ColNomC ;
   private String AV49TFLb_ColNomC_Sel ;
   private String AV52TFLb_Cartaz ;
   private String AV53TFLb_Cartaz_Sel ;
   private String AV100TFLb_Pantone ;
   private String AV101TFLb_Pantone_Sel ;
   private String AV102TFLb_PedCod ;
   private String AV103TFLb_PedCod_Sel ;
   private String AV112Pgmname ;
   private String Gx_msg ;
   private String AV85Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String AV88UsurCod ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_totales_Width ;
   private String Dvpanel_totales_Cls ;
   private String Dvpanel_totales_Title ;
   private String Dvpanel_totales_Iconposition ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_duplicar_Title ;
   private String Dvelop_confirmpanel_duplicar_Confirmationtext ;
   private String Dvelop_confirmpanel_duplicar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_duplicar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_duplicar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_duplicar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_duplicar_Confirmtype ;
   private String Dvelop_confirmpanel_duplicarmasopcion_Title ;
   private String Dvelop_confirmpanel_duplicarmasopcion_Confirmationtext ;
   private String Dvelop_confirmpanel_duplicarmasopcion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_duplicarmasopcion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_duplicarmasopcion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_duplicarmasopcion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_duplicarmasopcion_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
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
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavLb_numero_Internalname ;
   private String edtavLb_numero_Jsonclick ;
   private String edtavLb_fechaefrom_Internalname ;
   private String edtavLb_fechaefrom_Jsonclick ;
   private String edtavLb_fechaeto_Internalname ;
   private String edtavLb_fechaeto_Jsonclick ;
   private String divDvpanel_totales_cell_Internalname ;
   private String divDvpanel_totales_cell_Class ;
   private String Dvpanel_totales_Internalname ;
   private String divTotales_Internalname ;
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
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_lb_horaeauxdates_Internalname ;
   private String edtavDdo_lb_horaeauxdate_Internalname ;
   private String edtavDdo_lb_horaeauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtLb_numero_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A5533Lb_ArtCod ;
   private String edtLb_ArtCod_Internalname ;
   private String A5534Lb_ArtDsc ;
   private String edtLb_ArtDsc_Internalname ;
   private String A5536Lb_ColNom ;
   private String edtLb_ColNom_Internalname ;
   private String edtLb_ColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A5538Lb_ColNomC ;
   private String edtLb_ColNomC_Internalname ;
   private String edtLb_ColNumC_Internalname ;
   private String A5540Lb_Cartaz ;
   private String edtLb_Cartaz_Internalname ;
   private String edtLb_FechaE_Internalname ;
   private String edtLb_HoraE_Internalname ;
   private String edtLb_Rb_Internalname ;
   private String A6546Lb_Pantone ;
   private String edtLb_Pantone_Internalname ;
   private String A6618Lb_PedCod ;
   private String edtLb_PedCod_Internalname ;
   private String edtavTotalproducto_Internalname ;
   private String scmdbuf ;
   private String lV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ;
   private String lV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ;
   private String lV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ;
   private String lV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ;
   private String lV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ;
   private String lV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ;
   private String lV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ;
   private String lV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ;
   private String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ;
   private String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ;
   private String AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ;
   private String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ;
   private String AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ;
   private String AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ;
   private String AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ;
   private String AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ;
   private String AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ;
   private String AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ;
   private String AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ;
   private String AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ;
   private String AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ;
   private String AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ;
   private String AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ;
   private String AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV87EmprNom ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String AV145Emprcod_selected ;
   private String Dvelop_confirmpanel_duplicar_Internalname ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char18 ;
   private String GXv_char4[] ;
   private String GXt_char17 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_duplicarmasopcion_Internalname ;
   private String Dvelop_confirmpanel_duplicarmasopcion_Internalname ;
   private String tblTabledvelop_confirmpanel_duplicar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablemergedtextblock1_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavTotalproducto_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_72_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtLb_numero_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtLb_ArtCod_Jsonclick ;
   private String edtLb_ArtDsc_Jsonclick ;
   private String edtLb_ColNom_Jsonclick ;
   private String edtLb_ColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtLb_ColNomC_Jsonclick ;
   private String edtLb_ColNumC_Jsonclick ;
   private String edtLb_Cartaz_Jsonclick ;
   private String edtLb_FechaE_Jsonclick ;
   private String edtLb_HoraE_Jsonclick ;
   private String edtLb_Rb_Jsonclick ;
   private String edtLb_Pantone_Jsonclick ;
   private String edtLb_PedCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV58TFLb_HoraE ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ;
   private java.util.Date AV98Lb_FechaEfrom ;
   private java.util.Date AV99Lb_FechaEto ;
   private java.util.Date Gx_date ;
   private java.util.Date AV60DDO_Lb_HoraEAuxDate ;
   private java.util.Date A5541Lb_FechaE ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_totales_Autowidth ;
   private boolean Dvpanel_totales_Autoheight ;
   private boolean Dvpanel_totales_Collapsible ;
   private boolean Dvpanel_totales_Collapsed ;
   private boolean Dvpanel_totales_Showcollapseicon ;
   private boolean Dvpanel_totales_Autoscroll ;
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
   private boolean n831TipColCod ;
   private boolean bGXsfl_72_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV96TFLb_EstEns_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ;
   private String AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private String AV92Inc_obs ;
   private GXSimpleCollection<Byte> AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ;
   private GXSimpleCollection<Byte> AV97TFLb_EstEns_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_totales ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_duplicar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_duplicarmasopcion ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbLb_EstEns ;
   private IDataStoreProvider pr_default ;
   private String[] H01U52_A396EmprCod ;
   private String[] H01U52_A6618Lb_PedCod ;
   private String[] H01U52_A6546Lb_Pantone ;
   private java.math.BigDecimal[] H01U52_A5547Lb_Rb ;
   private byte[] H01U52_A5569Lb_EstEns ;
   private java.util.Date[] H01U52_A5542Lb_HoraE ;
   private java.util.Date[] H01U52_A5541Lb_FechaE ;
   private String[] H01U52_A5540Lb_Cartaz ;
   private int[] H01U52_A5539Lb_ColNumC ;
   private String[] H01U52_A5538Lb_ColNomC ;
   private byte[] H01U52_A831TipColCod ;
   private boolean[] H01U52_n831TipColCod ;
   private int[] H01U52_A5537Lb_ColNum ;
   private String[] H01U52_A5536Lb_ColNom ;
   private String[] H01U52_A5534Lb_ArtDsc ;
   private String[] H01U52_A5533Lb_ArtCod ;
   private String[] H01U52_A279CliNom ;
   private int[] H01U52_A252CliCod ;
   private int[] H01U52_A5532Lb_numero ;
   private long[] H01U53_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV104Websession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState29[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV80DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class entradaensayolaboratorioww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01U52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV98Lb_FechaEfrom ,
                                          java.util.Date AV99Lb_FechaEto ,
                                          int AV90Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV86EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[53];
      Object[] GXv_Object31 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.Lb_PedCod, T1.Lb_Pantone, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_FechaE, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T1.TipColCod, T1.Lb_ColNum," ;
      sSelectString += " T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod, T1.Lb_numero" ;
      sFromString = " FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int30[1] = (byte)(1) ;
         GXv_int30[2] = (byte)(1) ;
         GXv_int30[3] = (byte)(1) ;
         GXv_int30[4] = (byte)(1) ;
         GXv_int30[5] = (byte)(1) ;
         GXv_int30[6] = (byte)(1) ;
         GXv_int30[7] = (byte)(1) ;
         GXv_int30[8] = (byte)(1) ;
         GXv_int30[9] = (byte)(1) ;
         GXv_int30[10] = (byte)(1) ;
         GXv_int30[11] = (byte)(1) ;
         GXv_int30[12] = (byte)(1) ;
         GXv_int30[13] = (byte)(1) ;
         GXv_int30[14] = (byte)(1) ;
         GXv_int30[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int30[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int30[17] = (byte)(1) ;
      }
      if ( ! (0==AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( ! (0==AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int30[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int30[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( ! (0==AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( ! (0==AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int30[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int30[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int30[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int30[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int30[38] = (byte)(1) ;
      }
      if ( AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int30[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int30[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int30[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int30[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int30[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int30[46] = (byte)(1) ;
      }
      if ( ! (0==AV90Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int30[47] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_ColNumC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_ColNumC DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_HoraE" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_HoraE DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_EstEns" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_EstEns DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Rb" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Rb DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_Pantone" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_Pantone DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_PedCod" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_PedCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Lb_numero" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
   }

   protected Object[] conditional_H01U53( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV98Lb_FechaEfrom ,
                                          java.util.Date AV99Lb_FechaEto ,
                                          int AV90Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV86EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[48];
      Object[] GXv_Object34 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int33[1] = (byte)(1) ;
         GXv_int33[2] = (byte)(1) ;
         GXv_int33[3] = (byte)(1) ;
         GXv_int33[4] = (byte)(1) ;
         GXv_int33[5] = (byte)(1) ;
         GXv_int33[6] = (byte)(1) ;
         GXv_int33[7] = (byte)(1) ;
         GXv_int33[8] = (byte)(1) ;
         GXv_int33[9] = (byte)(1) ;
         GXv_int33[10] = (byte)(1) ;
         GXv_int33[11] = (byte)(1) ;
         GXv_int33[12] = (byte)(1) ;
         GXv_int33[13] = (byte)(1) ;
         GXv_int33[14] = (byte)(1) ;
         GXv_int33[15] = (byte)(1) ;
      }
      if ( ! (0==AV115Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( ! (0==AV117Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( ! (0==AV118Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV123Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( ! (0==AV129Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( ! (0==AV130Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV131Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV135Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV137Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int33[38] = (byte)(1) ;
      }
      if ( AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV138Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int33[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int33[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV141Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int33[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV143Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int33[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int33[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int33[46] = (byte)(1) ;
      }
      if ( ! (0==AV90Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int33[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
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
                  return conditional_H01U52(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , ((Boolean) dynConstraints[53]).booleanValue() , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 1 :
                  return conditional_H01U53(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , ((Boolean) dynConstraints[53]).booleanValue() , (String)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01U52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01U53", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
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
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[91], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[105]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
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
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
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
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
      }
   }

}

