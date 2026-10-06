package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaensayoslaboratorioproductos__wp_impl extends GXDataArea
{
   public entradaensayoslaboratorioproductos__wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaensayoslaboratorioproductos__wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayoslaboratorioproductos__wp_impl.class ));
   }

   public entradaensayoslaboratorioproductos__wp_impl( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
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
            AV9EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV22Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Lb_numero), 8, 0));
               AV23Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Lb_opcion", AV23Lb_opcion);
               AV26Lb_Rb = CommonUtil.decimalVal( httpContext.GetPar( "Lb_Rb"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Lb_Rb", GXutil.ltrimstr( AV26Lb_Rb, 7, 2));
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
      nRC_GXsfl_83 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_83"))) ;
      nGXsfl_83_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_83_idx"))) ;
      sGXsfl_83_idx = httpContext.GetPar( "sGXsfl_83_idx") ;
      edtPrdCtwSt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), !bGXsfl_83_Refreshing);
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
      AV9EmprCod = httpContext.GetPar( "EmprCod") ;
      AV22Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
      AV23Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
      AV6Acciongridmodificar = (short)(GXutil.lval( httpContext.GetPar( "Acciongridmodificar"))) ;
      AV40TFLb_LineaPr = (short)(GXutil.lval( httpContext.GetPar( "TFLb_LineaPr"))) ;
      AV41TFLb_LineaPr_To = (short)(GXutil.lval( httpContext.GetPar( "TFLb_LineaPr_To"))) ;
      AV50TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV51TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV48TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV49TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV38TFLB_CantP = CommonUtil.decimalVal( httpContext.GetPar( "TFLB_CantP"), ".") ;
      AV39TFLB_CantP_To = CommonUtil.decimalVal( httpContext.GetPar( "TFLB_CantP_To"), ".") ;
      AV36TFForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "TFForPrdUMe"))) ;
      AV37TFForPrdUMe_To = (byte)(GXutil.lval( httpContext.GetPar( "TFForPrdUMe_To"))) ;
      AV34TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV35TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV42TFLb_orden = (short)(GXutil.lval( httpContext.GetPar( "TFLb_orden"))) ;
      AV43TFLb_orden_To = (short)(GXutil.lval( httpContext.GetPar( "TFLb_orden_To"))) ;
      AV44TFLb_PTinP = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_PTinP"))) ;
      AV45TFLb_PTinP_To = (byte)(GXutil.lval( httpContext.GetPar( "TFLb_PTinP_To"))) ;
      AV46TFPrdCtwSt = httpContext.GetPar( "TFPrdCtwSt") ;
      AV47TFPrdCtwSt_Sel = httpContext.GetPar( "TFPrdCtwSt_Sel") ;
      AV64Pgmname = httpContext.GetPar( "Pgmname") ;
      AV27OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV28OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV52TotLB_CantP = CommonUtil.decimalVal( httpContext.GetPar( "TotLB_CantP"), ".") ;
      edtPrdCtwSt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), !bGXsfl_83_Refreshing);
      AV61Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, AV6Acciongridmodificar, AV40TFLb_LineaPr, AV41TFLb_LineaPr_To, AV50TFPrdNum, AV51TFPrdNum_Sel, AV48TFPrdNom, AV49TFPrdNom_Sel, AV38TFLB_CantP, AV39TFLB_CantP_To, AV36TFForPrdUMe, AV37TFForPrdUMe_To, AV34TFForPrdDsc, AV35TFForPrdDsc_Sel, AV42TFLb_orden, AV43TFLb_orden_To, AV44TFLb_PTinP, AV45TFLb_PTinP_To, AV46TFPrdCtwSt, AV47TFPrdCtwSt_Sel, AV64Pgmname, AV27OrderedBy, AV28OrderedDsc, AV52TotLB_CantP, AV61Moda21) ;
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
      pa2BA2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2BA2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.entradaensayoslaboratorioproductos__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV22Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV23Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV26Lb_Rb))}, new String[] {"EmprCod","Lb_numero","Lb_opcion","Lb_Rb"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTLB_CANTP", getSecureSignedToken( "", localUtil.format( AV52TotLB_CantP, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayosLaboratorioProductos__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayoslaboratorioproductos__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_83", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_83, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV31PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV31PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV14GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV15GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV8DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV8DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vACCIONGRIDMODIFICAR", GXutil.ltrim( localUtil.ntoc( AV6Acciongridmodificar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_LINEAPR", GXutil.ltrim( localUtil.ntoc( AV40TFLb_LineaPr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_LINEAPR_TO", GXutil.ltrim( localUtil.ntoc( AV41TFLb_LineaPr_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV50TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV51TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV48TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV49TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_CANTP", GXutil.ltrim( localUtil.ntoc( AV38TFLB_CantP, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_CANTP_TO", GXutil.ltrim( localUtil.ntoc( AV39TFLB_CantP_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDUME", GXutil.ltrim( localUtil.ntoc( AV36TFForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDUME_TO", GXutil.ltrim( localUtil.ntoc( AV37TFForPrdUMe_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC", GXutil.rtrim( AV34TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC_SEL", GXutil.rtrim( AV35TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ORDEN", GXutil.ltrim( localUtil.ntoc( AV42TFLb_orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_ORDEN_TO", GXutil.ltrim( localUtil.ntoc( AV43TFLb_orden_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_PTINP", GXutil.ltrim( localUtil.ntoc( AV44TFLb_PTinP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_PTINP_TO", GXutil.ltrim( localUtil.ntoc( AV45TFLb_PTinP_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCTWST", AV46TFPrdCtwSt);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCTWST_SEL", AV47TFPrdCtwSt_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV27OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV28OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_NUMERO", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_OPCION", GXutil.rtrim( A5555Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTLB_CANTP", GXutil.ltrim( localUtil.ntoc( AV52TotLB_CantP, (byte)(18), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTLB_CANTP", getSecureSignedToken( "", localUtil.format( AV52TotLB_CantP, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW1", GXutil.rtrim( A10936PrdCtw1));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW2", GXutil.rtrim( A10937PrdCtw2));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW3", GXutil.rtrim( A10938PrdCtw3));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV61Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_RB", GXutil.ltrim( localUtil.ntoc( AV26Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV33Station));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_set", GXutil.rtrim( Combo_prdnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Title", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_get", GXutil.rtrim( Combo_prdnum_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTWST_Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_get", GXutil.rtrim( Combo_prdnum_Selectedvalue_get));
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
         we2BA2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2BA2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.gestionlaboratorio.entradaensayoslaboratorioproductos__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV22Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV23Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV26Lb_Rb))}, new String[] {"EmprCod","Lb_numero","Lb_opcion","Lb_Rb"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.EntradaEnsayosLaboratorioProductos__WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Entrada Ensayos Laboratorio Productos ", "") ;
   }

   public void wb2BA0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_numero_Internalname, GXutil.ltrim( localUtil.ntoc( AV22Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22Lb_numero), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22Lb_numero), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_numero_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_numero_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_opcion_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_opcion_Internalname, httpContext.getMessage( "Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_opcion_Internalname, GXutil.rtrim( AV23Lb_opcion), GXutil.rtrim( localUtil.format( AV23Lb_opcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_opcion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_opcion_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_lineapr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_lineapr_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_lineapr_Internalname, GXutil.ltrim( localUtil.ntoc( AV21Lb_LineaPr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_lineapr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21Lb_LineaPr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21Lb_LineaPr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_lineapr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_lineapr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_prdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockcombo_prdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
         ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
         ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
         ucCombo_prdnum.setProperty("DropDownOptionsData", AV31PrdNum_Data);
         ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_cantp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_cantp_Internalname, httpContext.getMessage( "Cant.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_cantp_Internalname, GXutil.ltrim( localUtil.ntoc( AV20LB_CantP, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_cantp_Enabled!=0) ? localUtil.format( AV20LB_CantP, "ZZZZ9.99999") : localUtil.format( AV20LB_CantP, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_cantp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_cantp_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprdume_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprdume_Internalname, httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprdume_Internalname, GXutil.ltrim( localUtil.ntoc( AV12ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForprdume_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(AV12ForPrdUMe), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprdume_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprdume_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "CellMarginTop35" + " " + ((GXutil.strcmp(imgUseraction1_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgUseraction1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgUseraction1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgUseraction1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprddsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprddsc_Internalname, httpContext.getMessage( "Desc.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprddsc_Internalname, GXutil.rtrim( AV11ForPrdDsc), GXutil.rtrim( localUtil.format( AV11ForPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprddsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprddsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_orden_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_orden_Internalname, "(#)", " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_orden_Internalname, GXutil.ltrim( localUtil.ntoc( AV24Lb_orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_orden_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24Lb_orden), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24Lb_orden), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_orden_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_orden_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "CellMarginTop35" + " " + ((GXutil.strcmp(imgUseraction2_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgUseraction2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgUseraction2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgUseraction2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_ptinp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_ptinp_Internalname, httpContext.getMessage( "Fibra", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_ptinp_Internalname, GXutil.ltrim( localUtil.ntoc( AV25Lb_PTinP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_ptinp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25Lb_PTinP), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV25Lb_PTinP), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_ptinp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_ptinp_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 83, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiarvariables_Internalname, "gx.evt.setGridEvt("+GXutil.str( 83, 2, 0)+","+"null"+");", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiarvariables_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIARVARIABLES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 83, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         startgridcontrol83( ) ;
      }
      if ( wbEnd == 83 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_83 = (int)(nGXsfl_83_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_96_2BA2( true) ;
      }
      else
      {
         wb_table1_96_2BA2( false) ;
      }
      return  ;
   }

   public void wb_table1_96_2BA2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV14GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV15GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV64Pgmname), GXutil.rtrim( localUtil.format( AV64Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, GXutil.rtrim( AV30PrdNum), GXutil.rtrim( localUtil.format( AV30PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrdnum_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV8DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_125_2BA2( true) ;
      }
      else
      {
         wb_table2_125_2BA2( false) ;
      }
      return  ;
   }

   public void wb_table2_125_2BA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_130_2BA2( true) ;
      }
      else
      {
         wb_table3_130_2BA2( false) ;
      }
      return  ;
   }

   public void wb_table3_130_2BA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 83 )
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

   public void start2BA2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Entrada Ensayos Laboratorio Productos ", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2BA0( ) ;
   }

   public void ws2BA2( )
   {
      start2BA2( ) ;
      evt2BA2( ) ;
   }

   public void evt2BA2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_PRDNUM.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CERRAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e172BA2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIARVARIABLES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiarVariables' */
                           e182BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e192BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e202BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction2' */
                           e212BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VLB_LINEAPR.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e222BA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORPRDUME.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e232BA2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "LB_LINEAPR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "LB_LINEAPR.CLICK") == 0 ) )
                        {
                           nGXsfl_83_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_832( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV13GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridActions), 4, 0));
                           A5560Lb_LineaPr = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_LineaPr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A5561LB_CantP = localUtil.ctond( httpContext.cgiGet( edtLB_CantP_Internalname)) ;
                           A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A5562Lb_orden = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_orden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6545Lb_PTinP = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_PTinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14097PrdCtwSt = httpContext.cgiGet( edtPrdCtwSt_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e242BA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e252BA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e262BA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e272BA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LB_LINEAPR.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e282BA2 ();
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

   public void we2BA2( )
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

   public void pa2BA2( )
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
            GX_FocusControl = edtavLb_lineapr_Internalname ;
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
      subsflControlProps_832( ) ;
      while ( nGXsfl_83_idx <= nRC_GXsfl_83 )
      {
         sendrow_832( ) ;
         nGXsfl_83_idx = ((subGrid_Islastpage==1)&&(nGXsfl_83_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_83_idx+1) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_832( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV9EmprCod ,
                                 int AV22Lb_numero ,
                                 String AV23Lb_opcion ,
                                 short AV6Acciongridmodificar ,
                                 short AV40TFLb_LineaPr ,
                                 short AV41TFLb_LineaPr_To ,
                                 String AV50TFPrdNum ,
                                 String AV51TFPrdNum_Sel ,
                                 String AV48TFPrdNom ,
                                 String AV49TFPrdNom_Sel ,
                                 java.math.BigDecimal AV38TFLB_CantP ,
                                 java.math.BigDecimal AV39TFLB_CantP_To ,
                                 byte AV36TFForPrdUMe ,
                                 byte AV37TFForPrdUMe_To ,
                                 String AV34TFForPrdDsc ,
                                 String AV35TFForPrdDsc_Sel ,
                                 short AV42TFLb_orden ,
                                 short AV43TFLb_orden_To ,
                                 byte AV44TFLb_PTinP ,
                                 byte AV45TFLb_PTinP_To ,
                                 String AV46TFPrdCtwSt ,
                                 String AV47TFPrdCtwSt_Sel ,
                                 String AV64Pgmname ,
                                 short AV27OrderedBy ,
                                 boolean AV28OrderedDsc ,
                                 java.math.BigDecimal AV52TotLB_CantP ,
                                 short AV61Moda21 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e252BA2 ();
      GRID_nCurrentRecord = 0 ;
      rf2BA2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayosLaboratorioProductos__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayoslaboratorioproductos__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2BA2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV64Pgmname = "GestionLaboratorio.EntradaEnsayosLaboratorioProductos__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
      Gx_err = (short)(0) ;
      edtavLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_numero_Enabled), 5, 0), true);
      edtavLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_opcion_Enabled), 5, 0), true);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavTotvaluelb_cantp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluelb_cantp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluelb_cantp_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV40TFLb_LineaPr ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV41TFLb_LineaPr_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV50TFPrdNum ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV48TFPrdNom ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV49TFPrdNom_Sel ;
      AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV38TFLB_CantP ;
      AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV39TFLB_CantP_To ;
      AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV36TFForPrdUMe ;
      AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV37TFForPrdUMe_To ;
      AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV34TFForPrdDsc ;
      AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV35TFForPrdDsc_Sel ;
      AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV42TFLb_orden ;
      AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV43TFLb_orden_To ;
      AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV44TFLb_PTinP ;
      AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV45TFLb_PTinP_To ;
      AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV46TFPrdCtwSt ;
      AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV47TFPrdCtwSt_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) ,
                                           Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) ,
                                           AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                           AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                           AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                           AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                           Byte.valueOf(AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) ,
                                           AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                           AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                           Short.valueOf(AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) ,
                                           Short.valueOf(AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) ,
                                           Byte.valueOf(AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) ,
                                           Byte.valueOf(AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) ,
                                           Short.valueOf(A5560Lb_LineaPr) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5561LB_CantP ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A5562Lb_orden) ,
                                           Byte.valueOf(A6545Lb_PTinP) ,
                                           Short.valueOf(AV27OrderedBy) ,
                                           Boolean.valueOf(AV28OrderedDsc) ,
                                           AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                           AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           AV9EmprCod ,
                                           Integer.valueOf(AV22Lb_numero) ,
                                           AV23Lb_opcion ,
                                           A396EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum), 6, "%") ;
      lV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom), 26, "%") ;
      lV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor H02BA2 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Integer.valueOf(AV22Lb_numero), AV23Lb_opcion, Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr), Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to), lV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum, AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel, lV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom, AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel, AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp, AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to, Byte.valueOf(AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume), Byte.valueOf(AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to), lV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc, AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel, Short.valueOf(AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden), Short.valueOf(AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to), Byte.valueOf(AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp), Byte.valueOf(AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = H02BA2_A5555Lb_opcion[0] ;
         A5532Lb_numero = H02BA2_A5532Lb_numero[0] ;
         A10938PrdCtw3 = H02BA2_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = H02BA2_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = H02BA2_A10936PrdCtw1[0] ;
         A6545Lb_PTinP = H02BA2_A6545Lb_PTinP[0] ;
         A5562Lb_orden = H02BA2_A5562Lb_orden[0] ;
         A488ForPrdDsc = H02BA2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H02BA2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = H02BA2_A490ForPrdUMe[0] ;
         A5561LB_CantP = H02BA2_A5561LB_CantP[0] ;
         A718PrdNom = H02BA2_A718PrdNom[0] ;
         A5560Lb_LineaPr = H02BA2_A5560Lb_LineaPr[0] ;
         A719PrdNum = H02BA2_A719PrdNum[0] ;
         A396EmprCod = H02BA2_A396EmprCod[0] ;
         A10938PrdCtw3 = H02BA2_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = H02BA2_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = H02BA2_A10936PrdCtw1[0] ;
         A718PrdNom = H02BA2_A718PrdNom[0] ;
         A488ForPrdDsc = H02BA2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H02BA2_n488ForPrdDsc[0] ;
         GXt_char1 = A14097PrdCtwSt ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char4[0] = GXt_char1 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         entradaensayoslaboratorioproductos__wp_impl.this.A396EmprCod = GXv_char2[0] ;
         entradaensayoslaboratorioproductos__wp_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaensayoslaboratorioproductos__wp_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14097PrdCtwSt = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel) == 0 ) ) )
            {
               GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf2BA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(83) ;
      /* Execute user event: Refresh */
      e252BA2 ();
      nGXsfl_83_idx = 1 ;
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_832( ) ;
      bGXsfl_83_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_832( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) ,
                                              Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) ,
                                              AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                              AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                              AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                              AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                              AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                              AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                              Byte.valueOf(AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) ,
                                              Byte.valueOf(AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) ,
                                              AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                              AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                              Short.valueOf(AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) ,
                                              Short.valueOf(AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) ,
                                              Byte.valueOf(AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) ,
                                              Byte.valueOf(AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) ,
                                              Short.valueOf(A5560Lb_LineaPr) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A5561LB_CantP ,
                                              Byte.valueOf(A490ForPrdUMe) ,
                                              A488ForPrdDsc ,
                                              Short.valueOf(A5562Lb_orden) ,
                                              Byte.valueOf(A6545Lb_PTinP) ,
                                              Short.valueOf(AV27OrderedBy) ,
                                              Boolean.valueOf(AV28OrderedDsc) ,
                                              AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                              AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                              A14097PrdCtwSt ,
                                              AV9EmprCod ,
                                              Integer.valueOf(AV22Lb_numero) ,
                                              AV23Lb_opcion ,
                                              A396EmprCod ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              A5555Lb_opcion } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum), 6, "%") ;
         lV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom), 26, "%") ;
         lV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc), 5, "%") ;
         /* Using cursor H02BA3 */
         pr_default.execute(1, new Object[] {AV9EmprCod, Integer.valueOf(AV22Lb_numero), AV23Lb_opcion, Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr), Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to), lV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum, AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel, lV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom, AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel, AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp, AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to, Byte.valueOf(AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume), Byte.valueOf(AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to), lV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc, AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel, Short.valueOf(AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden), Short.valueOf(AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to), Byte.valueOf(AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp), Byte.valueOf(AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to)});
         nGXsfl_83_idx = 1 ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_832( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5555Lb_opcion = H02BA3_A5555Lb_opcion[0] ;
            A5532Lb_numero = H02BA3_A5532Lb_numero[0] ;
            A10938PrdCtw3 = H02BA3_A10938PrdCtw3[0] ;
            A10937PrdCtw2 = H02BA3_A10937PrdCtw2[0] ;
            A10936PrdCtw1 = H02BA3_A10936PrdCtw1[0] ;
            A6545Lb_PTinP = H02BA3_A6545Lb_PTinP[0] ;
            A5562Lb_orden = H02BA3_A5562Lb_orden[0] ;
            A488ForPrdDsc = H02BA3_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H02BA3_n488ForPrdDsc[0] ;
            A490ForPrdUMe = H02BA3_A490ForPrdUMe[0] ;
            A5561LB_CantP = H02BA3_A5561LB_CantP[0] ;
            A718PrdNom = H02BA3_A718PrdNom[0] ;
            A5560Lb_LineaPr = H02BA3_A5560Lb_LineaPr[0] ;
            A719PrdNum = H02BA3_A719PrdNum[0] ;
            A396EmprCod = H02BA3_A396EmprCod[0] ;
            A10938PrdCtw3 = H02BA3_A10938PrdCtw3[0] ;
            A10937PrdCtw2 = H02BA3_A10937PrdCtw2[0] ;
            A10936PrdCtw1 = H02BA3_A10936PrdCtw1[0] ;
            A718PrdNom = H02BA3_A718PrdNom[0] ;
            A488ForPrdDsc = H02BA3_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H02BA3_n488ForPrdDsc[0] ;
            GXt_char1 = A14097PrdCtwSt ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            entradaensayoslaboratorioproductos__wp_impl.this.A396EmprCod = GXv_char4[0] ;
            entradaensayoslaboratorioproductos__wp_impl.this.A719PrdNum = GXv_char3[0] ;
            entradaensayoslaboratorioproductos__wp_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A14097PrdCtwSt = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel) == 0 ) ) )
               {
                  e262BA2 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(83) ;
         wb2BA0( ) ;
      }
      bGXsfl_83_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2BA2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTLB_CANTP", GXutil.ltrim( localUtil.ntoc( AV52TotLB_CantP, (byte)(18), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTLB_CANTP", getSecureSignedToken( "", localUtil.format( AV52TotLB_CantP, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV61Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61Moda21), "ZZZ9")));
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
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV40TFLb_LineaPr ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV41TFLb_LineaPr_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV50TFPrdNum ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV48TFPrdNom ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV49TFPrdNom_Sel ;
      AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV38TFLB_CantP ;
      AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV39TFLB_CantP_To ;
      AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV36TFForPrdUMe ;
      AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV37TFForPrdUMe_To ;
      AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV34TFForPrdDsc ;
      AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV35TFForPrdDsc_Sel ;
      AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV42TFLb_orden ;
      AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV43TFLb_orden_To ;
      AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV44TFLb_PTinP ;
      AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV45TFLb_PTinP_To ;
      AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV46TFPrdCtwSt ;
      AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV47TFPrdCtwSt_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, AV6Acciongridmodificar, AV40TFLb_LineaPr, AV41TFLb_LineaPr_To, AV50TFPrdNum, AV51TFPrdNum_Sel, AV48TFPrdNom, AV49TFPrdNom_Sel, AV38TFLB_CantP, AV39TFLB_CantP_To, AV36TFForPrdUMe, AV37TFForPrdUMe_To, AV34TFForPrdDsc, AV35TFForPrdDsc_Sel, AV42TFLb_orden, AV43TFLb_orden_To, AV44TFLb_PTinP, AV45TFLb_PTinP_To, AV46TFPrdCtwSt, AV47TFPrdCtwSt_Sel, AV64Pgmname, AV27OrderedBy, AV28OrderedDsc, AV52TotLB_CantP, AV61Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV40TFLb_LineaPr ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV41TFLb_LineaPr_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV50TFPrdNum ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV48TFPrdNom ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV49TFPrdNom_Sel ;
      AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV38TFLB_CantP ;
      AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV39TFLB_CantP_To ;
      AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV36TFForPrdUMe ;
      AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV37TFForPrdUMe_To ;
      AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV34TFForPrdDsc ;
      AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV35TFForPrdDsc_Sel ;
      AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV42TFLb_orden ;
      AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV43TFLb_orden_To ;
      AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV44TFLb_PTinP ;
      AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV45TFLb_PTinP_To ;
      AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV46TFPrdCtwSt ;
      AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV47TFPrdCtwSt_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, AV6Acciongridmodificar, AV40TFLb_LineaPr, AV41TFLb_LineaPr_To, AV50TFPrdNum, AV51TFPrdNum_Sel, AV48TFPrdNom, AV49TFPrdNom_Sel, AV38TFLB_CantP, AV39TFLB_CantP_To, AV36TFForPrdUMe, AV37TFForPrdUMe_To, AV34TFForPrdDsc, AV35TFForPrdDsc_Sel, AV42TFLb_orden, AV43TFLb_orden_To, AV44TFLb_PTinP, AV45TFLb_PTinP_To, AV46TFPrdCtwSt, AV47TFPrdCtwSt_Sel, AV64Pgmname, AV27OrderedBy, AV28OrderedDsc, AV52TotLB_CantP, AV61Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV40TFLb_LineaPr ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV41TFLb_LineaPr_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV50TFPrdNum ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV48TFPrdNom ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV49TFPrdNom_Sel ;
      AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV38TFLB_CantP ;
      AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV39TFLB_CantP_To ;
      AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV36TFForPrdUMe ;
      AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV37TFForPrdUMe_To ;
      AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV34TFForPrdDsc ;
      AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV35TFForPrdDsc_Sel ;
      AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV42TFLb_orden ;
      AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV43TFLb_orden_To ;
      AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV44TFLb_PTinP ;
      AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV45TFLb_PTinP_To ;
      AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV46TFPrdCtwSt ;
      AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV47TFPrdCtwSt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, AV6Acciongridmodificar, AV40TFLb_LineaPr, AV41TFLb_LineaPr_To, AV50TFPrdNum, AV51TFPrdNum_Sel, AV48TFPrdNom, AV49TFPrdNom_Sel, AV38TFLB_CantP, AV39TFLB_CantP_To, AV36TFForPrdUMe, AV37TFForPrdUMe_To, AV34TFForPrdDsc, AV35TFForPrdDsc_Sel, AV42TFLb_orden, AV43TFLb_orden_To, AV44TFLb_PTinP, AV45TFLb_PTinP_To, AV46TFPrdCtwSt, AV47TFPrdCtwSt_Sel, AV64Pgmname, AV27OrderedBy, AV28OrderedDsc, AV52TotLB_CantP, AV61Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV40TFLb_LineaPr ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV41TFLb_LineaPr_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV50TFPrdNum ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV48TFPrdNom ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV49TFPrdNom_Sel ;
      AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV38TFLB_CantP ;
      AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV39TFLB_CantP_To ;
      AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV36TFForPrdUMe ;
      AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV37TFForPrdUMe_To ;
      AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV34TFForPrdDsc ;
      AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV35TFForPrdDsc_Sel ;
      AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV42TFLb_orden ;
      AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV43TFLb_orden_To ;
      AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV44TFLb_PTinP ;
      AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV45TFLb_PTinP_To ;
      AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV46TFPrdCtwSt ;
      AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV47TFPrdCtwSt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, AV6Acciongridmodificar, AV40TFLb_LineaPr, AV41TFLb_LineaPr_To, AV50TFPrdNum, AV51TFPrdNum_Sel, AV48TFPrdNom, AV49TFPrdNom_Sel, AV38TFLB_CantP, AV39TFLB_CantP_To, AV36TFForPrdUMe, AV37TFForPrdUMe_To, AV34TFForPrdDsc, AV35TFForPrdDsc_Sel, AV42TFLb_orden, AV43TFLb_orden_To, AV44TFLb_PTinP, AV45TFLb_PTinP_To, AV46TFPrdCtwSt, AV47TFPrdCtwSt_Sel, AV64Pgmname, AV27OrderedBy, AV28OrderedDsc, AV52TotLB_CantP, AV61Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV40TFLb_LineaPr ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV41TFLb_LineaPr_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV50TFPrdNum ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV48TFPrdNom ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV49TFPrdNom_Sel ;
      AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV38TFLB_CantP ;
      AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV39TFLB_CantP_To ;
      AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV36TFForPrdUMe ;
      AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV37TFForPrdUMe_To ;
      AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV34TFForPrdDsc ;
      AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV35TFForPrdDsc_Sel ;
      AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV42TFLb_orden ;
      AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV43TFLb_orden_To ;
      AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV44TFLb_PTinP ;
      AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV45TFLb_PTinP_To ;
      AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV46TFPrdCtwSt ;
      AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV47TFPrdCtwSt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, AV6Acciongridmodificar, AV40TFLb_LineaPr, AV41TFLb_LineaPr_To, AV50TFPrdNum, AV51TFPrdNum_Sel, AV48TFPrdNom, AV49TFPrdNom_Sel, AV38TFLB_CantP, AV39TFLB_CantP_To, AV36TFForPrdUMe, AV37TFForPrdUMe_To, AV34TFForPrdDsc, AV35TFForPrdDsc_Sel, AV42TFLb_orden, AV43TFLb_orden_To, AV44TFLb_PTinP, AV45TFLb_PTinP_To, AV46TFPrdCtwSt, AV47TFPrdCtwSt_Sel, AV64Pgmname, AV27OrderedBy, AV28OrderedDsc, AV52TotLB_CantP, AV61Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV64Pgmname = "GestionLaboratorio.EntradaEnsayosLaboratorioProductos__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
      Gx_err = (short)(0) ;
      edtavLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_numero_Enabled), 5, 0), true);
      edtavLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_opcion_Enabled), 5, 0), true);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavTotvaluelb_cantp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluelb_cantp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluelb_cantp_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e242BA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV31PrdNum_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV8DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_83 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV14GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV15GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
         Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
         Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_cerrar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Title") ;
         Dvelop_confirmpanel_cerrar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Confirmationtext") ;
         Dvelop_confirmpanel_cerrar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_cerrar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
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
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         Dvelop_confirmpanel_cerrar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Result") ;
         Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_lineapr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_lineapr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_LINEAPR");
            GX_FocusControl = edtavLb_lineapr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21Lb_LineaPr = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Lb_LineaPr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Lb_LineaPr), 4, 0));
         }
         else
         {
            AV21Lb_LineaPr = (short)(localUtil.ctol( httpContext.cgiGet( edtavLb_lineapr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Lb_LineaPr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Lb_LineaPr), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavLb_cantp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavLb_cantp_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_CANTP");
            GX_FocusControl = edtavLb_cantp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20LB_CantP = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20LB_CantP", GXutil.ltrimstr( AV20LB_CantP, 11, 5));
         }
         else
         {
            AV20LB_CantP = localUtil.ctond( httpContext.cgiGet( edtavLb_cantp_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20LB_CantP", GXutil.ltrimstr( AV20LB_CantP, 11, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORPRDUME");
            GX_FocusControl = edtavForprdume_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12ForPrdUMe = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12ForPrdUMe", GXutil.str( AV12ForPrdUMe, 1, 0));
         }
         else
         {
            AV12ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12ForPrdUMe", GXutil.str( AV12ForPrdUMe, 1, 0));
         }
         AV11ForPrdDsc = httpContext.cgiGet( edtavForprddsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdDsc", AV11ForPrdDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_orden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_orden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_ORDEN");
            GX_FocusControl = edtavLb_orden_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24Lb_orden = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Lb_orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Lb_orden), 4, 0));
         }
         else
         {
            AV24Lb_orden = (short)(localUtil.ctol( httpContext.cgiGet( edtavLb_orden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Lb_orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Lb_orden), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_ptinp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_ptinp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_PTINP");
            GX_FocusControl = edtavLb_ptinp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25Lb_PTinP = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Lb_PTinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Lb_PTinP), 2, 0));
         }
         else
         {
            AV25Lb_PTinP = (byte)(localUtil.ctol( httpContext.cgiGet( edtavLb_ptinp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Lb_PTinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Lb_PTinP), 2, 0));
         }
         AV53TotValueLB_CantP = httpContext.cgiGet( edtavTotvaluelb_cantp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53TotValueLB_CantP", AV53TotValueLB_CantP);
         AV64Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
         AV30PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30PrdNum", AV30PrdNum);
         /* Read subfile selected row values. */
         nGXsfl_83_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_832( ) ;
         if ( nGXsfl_83_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV13GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridActions), 4, 0));
            A5560Lb_LineaPr = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_LineaPr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A5561LB_CantP = localUtil.ctond( httpContext.cgiGet( edtLB_CantP_Internalname)) ;
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
            n488ForPrdDsc = false ;
            A5562Lb_orden = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_orden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6545Lb_PTinP = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_PTinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14097PrdCtwSt = httpContext.cgiGet( edtPrdCtwSt_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayosLaboratorioProductos__WP");
         AV64Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\entradaensayoslaboratorioproductos__wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e242BA2 ();
      if (returnInSub) return;
   }

   public void e242BA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV33Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
      GXv_char4[0] = AV9EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char2[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV9EmprCod = GXv_char4[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV10EmprNom = GXv_char3[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV56UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      edtavPrdnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Entrada Ensayos Laboratorio Productos ", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV27OrderedBy < 1 )
      {
         AV27OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV8DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV8DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = AV21Lb_LineaPr ;
      GXv_int8[0] = GXt_int7 ;
      new app.formulaciontinte.getproductosensayos(remoteHandle, context).execute( AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, GXv_int8) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV21Lb_LineaPr = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lb_LineaPr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Lb_LineaPr), 4, 0));
      GXt_int9 = (byte)(AV61Moda21) ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int10) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_int9 = GXv_int10[0] ;
      AV61Moda21 = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61Moda21), "ZZZ9")));
   }

   public void e252BA2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV57WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV57WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV14GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14GridCurrentPage), 10, 0));
      AV15GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_83_Refreshing);
      edtLb_LineaPr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaPr_Internalname, "Columnheaderclass", edtLb_LineaPr_Columnheaderclass, !bGXsfl_83_Refreshing);
      edtPrdNum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Columnheaderclass", edtPrdNum_Columnheaderclass, !bGXsfl_83_Refreshing);
      edtPrdNom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Columnheaderclass", edtPrdNom_Columnheaderclass, !bGXsfl_83_Refreshing);
      edtLB_CantP_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLB_CantP_Internalname, "Columnheaderclass", edtLB_CantP_Columnheaderclass, !bGXsfl_83_Refreshing);
      edtForPrdUMe_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Columnheaderclass", edtForPrdUMe_Columnheaderclass, !bGXsfl_83_Refreshing);
      edtForPrdDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Columnheaderclass", edtForPrdDsc_Columnheaderclass, !bGXsfl_83_Refreshing);
      edtLb_orden_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_orden_Internalname, "Columnheaderclass", edtLb_orden_Columnheaderclass, !bGXsfl_83_Refreshing);
      edtLb_PTinP_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_PTinP_Internalname, "Columnheaderclass", edtLb_PTinP_Columnheaderclass, !bGXsfl_83_Refreshing);
      edtPrdCtwSt_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Columnheaderclass", edtPrdCtwSt_Columnheaderclass, !bGXsfl_83_Refreshing);
      if ( AV6Acciongridmodificar == 1 )
      {
         AV6Acciongridmodificar = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Acciongridmodificar), 4, 0));
      }
      else
      {
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "DisableFocus", "", new Object[] {imgUseraction1_Internalname});
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "DisableFocus", "", new Object[] {imgUseraction2_Internalname});
      }
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV40TFLb_LineaPr ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV41TFLb_LineaPr_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV50TFPrdNum ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV48TFPrdNom ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV49TFPrdNom_Sel ;
      AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV38TFLB_CantP ;
      AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV39TFLB_CantP_To ;
      AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV36TFForPrdUMe ;
      AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV37TFForPrdUMe_To ;
      AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV34TFForPrdDsc ;
      AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV35TFForPrdDsc_Sel ;
      AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV42TFLb_orden ;
      AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV43TFLb_orden_To ;
      AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV44TFLb_PTinP ;
      AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV45TFLb_PTinP_To ;
      AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV46TFPrdCtwSt ;
      AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV47TFPrdCtwSt_Sel ;
      /*  Sending Event outputs  */
   }

   public void e122BA2( )
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
         AV29PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV29PageToGo) ;
      }
   }

   public void e132BA2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142BA2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV27OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OrderedBy), 4, 0));
         AV28OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28OrderedDsc", AV28OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_LineaPr") == 0 )
         {
            AV40TFLb_LineaPr = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLb_LineaPr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFLb_LineaPr), 4, 0));
            AV41TFLb_LineaPr_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFLb_LineaPr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFLb_LineaPr_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV50TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdNum", AV50TFPrdNum);
            AV51TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdNum_Sel", AV51TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV48TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFPrdNom", AV48TFPrdNom);
            AV49TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFPrdNom_Sel", AV49TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LB_CantP") == 0 )
         {
            AV38TFLB_CantP = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFLB_CantP", GXutil.ltrimstr( AV38TFLB_CantP, 11, 5));
            AV39TFLB_CantP_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFLB_CantP_To", GXutil.ltrimstr( AV39TFLB_CantP_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdUMe") == 0 )
         {
            AV36TFForPrdUMe = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFForPrdUMe", GXutil.str( AV36TFForPrdUMe, 1, 0));
            AV37TFForPrdUMe_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFForPrdUMe_To", GXutil.str( AV37TFForPrdUMe_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV34TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFForPrdDsc", AV34TFForPrdDsc);
            AV35TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFForPrdDsc_Sel", AV35TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_orden") == 0 )
         {
            AV42TFLb_orden = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFLb_orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFLb_orden), 4, 0));
            AV43TFLb_orden_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFLb_orden_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFLb_orden_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_PTinP") == 0 )
         {
            AV44TFLb_PTinP = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFLb_PTinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFLb_PTinP), 2, 0));
            AV45TFLb_PTinP_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFLb_PTinP_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_PTinP_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCtwSt") == 0 )
         {
            AV46TFPrdCtwSt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdCtwSt", AV46TFPrdCtwSt);
            AV47TFPrdCtwSt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdCtwSt_Sel", AV47TFPrdCtwSt_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e262BA2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.setColumnClass( (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV61Moda21==1) ? "WWActionGroupColumn WWColumnWarning WWColumnWarningFirstColumn" : "WWActionGroupColumn") );
         edtLb_LineaPr_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV61Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtPrdNum_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV61Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtPrdNom_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV61Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtLB_CantP_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV61Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtForPrdUMe_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV61Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtForPrdDsc_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV61Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtLb_orden_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV61Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtLb_PTinP_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV61Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtPrdCtwSt_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV61Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(83) ;
         }
         sendrow_832( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_83_Refreshing )
      {
         httpContext.doAjaxLoad(83, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV13GridActions, 4, 0)) );
   }

   public void e272BA2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV13GridActions == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S192 ();
         if (returnInSub) return;
      }
      AV13GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV13GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e172BA2 ();
      if (returnInSub) return;
   }

   public void e172BA2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( (0==AV21Lb_LineaPr) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta #", ""));
         GX_FocusControl = edtavLb_lineapr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (GXutil.strcmp("", AV30PrdNum)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Producto", ""));
            GX_FocusControl = edtavPrdnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXt_char1 = AV59ForPrdDsccontrol ;
            GXv_char4[0] = GXt_char1 ;
            new app.get_forprddsc(remoteHandle, context).execute( AV9EmprCod, AV12ForPrdUMe, GXv_char4) ;
            entradaensayoslaboratorioproductos__wp_impl.this.GXt_char1 = GXv_char4[0] ;
            AV59ForPrdDsccontrol = GXt_char1 ;
            if ( GXutil.strcmp(AV59ForPrdDsccontrol, httpContext.getMessage( "Error", "")) == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "NO es una UNIDAD Valida", ""));
               GX_FocusControl = edtavForprdume_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20LB_CantP)==0) )
               {
                  Dvelop_confirmpanel_enter_Confirmationtext = httpContext.getMessage( "Existem linhas com quantidade zero. Deseja continuar?", "") ;
                  ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                  this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
               }
               else
               {
                  /* Execute user subroutine: 'DO ACTION ENTER' */
                  S202 ();
                  if (returnInSub) return;
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e152BA2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e182BA2( )
   {
      /* 'DoLimpiarVariables' Routine */
      returnInSub = false ;
      AV12ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForPrdUMe", GXutil.str( AV12ForPrdUMe, 1, 0));
      AV11ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdDsc", AV11ForPrdDsc);
      AV20LB_CantP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20LB_CantP", GXutil.ltrimstr( AV20LB_CantP, 11, 5));
      AV24Lb_orden = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lb_orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Lb_orden), 4, 0));
      AV30PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30PrdNum", AV30PrdNum);
      Combo_prdnum_Selectedvalue_set = AV30PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      GXt_int7 = AV21Lb_LineaPr ;
      GXv_int8[0] = GXt_int7 ;
      new app.formulaciontinte.getproductosensayos(remoteHandle, context).execute( AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, GXv_int8) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV21Lb_LineaPr = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lb_LineaPr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Lb_LineaPr), 4, 0));
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e192BA2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV60mensaje ;
      new app.gestionlaboratorio.existenlineasconcantidadacero(remoteHandle, context).execute( AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, httpContext.getMessage( "ENS004", ""), GXv_char4) ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV60mensaje = GXv_char4[0] ;
      if ( (GXutil.strcmp("", AV60mensaje)==0) )
      {
         /* Execute user subroutine: 'DO ACTION CERRAR' */
         S212 ();
         if (returnInSub) return;
      }
      else
      {
         Dvelop_confirmpanel_cerrar_Confirmationtext = AV60mensaje+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_cerrar.sendProperty(context, "", false, Dvelop_confirmpanel_cerrar_Internalname, "ConfirmationText", Dvelop_confirmpanel_cerrar_Confirmationtext);
         Dvelop_confirmpanel_cerrar_Confirmationtext = Dvelop_confirmpanel_cerrar_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
         ucDvelop_confirmpanel_cerrar.sendProperty(context, "", false, Dvelop_confirmpanel_cerrar_Internalname, "ConfirmationText", Dvelop_confirmpanel_cerrar_Confirmationtext);
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CERRARContainer", "Confirm", "", new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e162BA2( )
   {
      /* Dvelop_confirmpanel_cerrar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_cerrar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CERRAR' */
         S212 ();
         if (returnInSub) return;
      }
   }

   public void e202BA2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.tunmefoprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12ForPrdUMe,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11ForPrdDsc))}, new String[] {"InOutEmprCod","InOutForPrdUMe","InOutForPrdDsc"}) , new Object[] {"AV9EmprCod","AV12ForPrdUMe","AV11ForPrdDsc"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e212BA2( )
   {
      /* 'DoUserAction2' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.promptproductosvariables", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV24Lb_orden,4,0))}, new String[] {"InOutEmprCod","InOutForPrdNor"}) , new Object[] {"AV9EmprCod","AV24Lb_orden"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e112BA2( )
   {
      /* Combo_prdnum_Onoptionclicked Routine */
      returnInSub = false ;
      AV30PrdNum = Combo_prdnum_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30PrdNum", AV30PrdNum);
      /* Execute user subroutine: 'UNIDADPRODUCTO' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV27OrderedBy, 4, 0))+":"+(AV28OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S192( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      new app.formulaciontinte.ensayosproductos_del(remoteHandle, context).execute( AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, A5560Lb_LineaPr) ;
      GXt_int7 = AV21Lb_LineaPr ;
      GXv_int8[0] = GXt_int7 ;
      new app.formulaciontinte.getproductosensayos(remoteHandle, context).execute( AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, GXv_int8) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV21Lb_LineaPr = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lb_LineaPr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Lb_LineaPr), 4, 0));
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      new app.formulaciontinte.ensayosproductos_ins(remoteHandle, context).execute( AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, AV21Lb_LineaPr, AV30PrdNum, AV12ForPrdUMe, AV20LB_CantP, AV24Lb_orden, AV25Lb_PTinP) ;
      new app.formulaciontinte.ensayosproductos_lb_ultlp(remoteHandle, context).execute( AV9EmprCod, AV22Lb_numero, AV23Lb_opcion) ;
      GXv_char4[0] = AV9EmprCod ;
      GXv_int12[0] = AV22Lb_numero ;
      GXv_char3[0] = AV23Lb_opcion ;
      GXv_decimal13[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int14[0] = (int)(DecimalUtil.decToDouble(AV26Lb_Rb)) ;
      GXv_char2[0] = " " ;
      GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
      new app.gestionlaboratorio.pens003x(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_decimal13, GXv_int14, GXv_char2, GXv_decimal15) ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV9EmprCod = GXv_char4[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV22Lb_numero = GXv_int12[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV23Lb_opcion = GXv_char3[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV26Lb_Rb = DecimalUtil.doubleToDec(GXv_int14[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lb_opcion", AV23Lb_opcion);
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lb_Rb", GXutil.ltrimstr( AV26Lb_Rb, 7, 2));
      GXv_char4[0] = AV9EmprCod ;
      GXv_char3[0] = AV33Station ;
      GXv_decimal15[0] = AV58Coste_cor ;
      GXv_decimal13[0] = AV5Lb_costec ;
      new app.gestionlaboratorio.costecoloranteycostetotal(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal15, GXv_decimal13) ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV9EmprCod = GXv_char4[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV33Station = GXv_char3[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV58Coste_cor = GXv_decimal15[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV5Lb_costec = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
      GXv_char4[0] = AV9EmprCod ;
      GXv_int14[0] = AV22Lb_numero ;
      GXv_char3[0] = AV23Lb_opcion ;
      GXv_decimal15[0] = AV58Coste_cor ;
      GXv_decimal13[0] = AV5Lb_costec ;
      new app.gestionlaboratorio.pens004(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_char3, GXv_decimal15, GXv_decimal13) ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV9EmprCod = GXv_char4[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV22Lb_numero = GXv_int14[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV23Lb_opcion = GXv_char3[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV58Coste_cor = GXv_decimal15[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV5Lb_costec = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lb_opcion", AV23Lb_opcion);
      AV12ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForPrdUMe", GXutil.str( AV12ForPrdUMe, 1, 0));
      AV11ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdDsc", AV11ForPrdDsc);
      AV20LB_CantP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20LB_CantP", GXutil.ltrimstr( AV20LB_CantP, 11, 5));
      AV24Lb_orden = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lb_orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Lb_orden), 4, 0));
      AV30PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30PrdNum", AV30PrdNum);
      Combo_prdnum_Selectedvalue_set = AV30PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      GXt_int7 = AV21Lb_LineaPr ;
      GXv_int8[0] = GXt_int7 ;
      new app.formulaciontinte.getproductosensayos(remoteHandle, context).execute( AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, GXv_int8) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV21Lb_LineaPr = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lb_LineaPr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Lb_LineaPr), 4, 0));
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO ACTION CERRAR' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue(AV64Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV64Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV32Session.getValue(AV64Pgmname+"GridState"), null, null);
      }
      AV27OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OrderedBy), 4, 0));
      AV28OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28OrderedDsc", AV28OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV83GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LINEAPR") == 0 )
         {
            AV40TFLb_LineaPr = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLb_LineaPr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFLb_LineaPr), 4, 0));
            AV41TFLb_LineaPr_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFLb_LineaPr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFLb_LineaPr_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV50TFPrdNum = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdNum", AV50TFPrdNum);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV51TFPrdNum_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdNum_Sel", AV51TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV48TFPrdNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFPrdNom", AV48TFPrdNom);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV49TFPrdNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFPrdNom_Sel", AV49TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CANTP") == 0 )
         {
            AV38TFLB_CantP = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFLB_CantP", GXutil.ltrimstr( AV38TFLB_CantP, 11, 5));
            AV39TFLB_CantP_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFLB_CantP_To", GXutil.ltrimstr( AV39TFLB_CantP_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV36TFForPrdUMe = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFForPrdUMe", GXutil.str( AV36TFForPrdUMe, 1, 0));
            AV37TFForPrdUMe_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFForPrdUMe_To", GXutil.str( AV37TFForPrdUMe_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV34TFForPrdDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFForPrdDsc", AV34TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV35TFForPrdDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFForPrdDsc_Sel", AV35TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ORDEN") == 0 )
         {
            AV42TFLb_orden = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFLb_orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFLb_orden), 4, 0));
            AV43TFLb_orden_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFLb_orden_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFLb_orden_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PTINP") == 0 )
         {
            AV44TFLb_PTinP = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFLb_PTinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFLb_PTinP), 2, 0));
            AV45TFLb_PTinP_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFLb_PTinP_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_PTinP_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCTWST") == 0 )
         {
            AV46TFPrdCtwSt = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdCtwSt", AV46TFPrdCtwSt);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCTWST_SEL") == 0 )
         {
            AV47TFPrdCtwSt_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdCtwSt_Sel", AV47TFPrdCtwSt_Sel);
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFPrdNum_Sel)==0), AV51TFPrdNum_Sel, GXv_char4) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFPrdNom_Sel)==0), AV49TFPrdNom_Sel, GXv_char3) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFForPrdDsc_Sel)==0), AV35TFForPrdDsc_Sel, GXv_char2) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFPrdCtwSt_Sel)==0), AV47TFPrdCtwSt_Sel, GXv_char19) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_char18 = GXv_char19[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char16+"|||"+GXt_char17+"|||"+GXt_char18 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFPrdNum)==0), AV50TFPrdNum, GXv_char19) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFPrdNom)==0), AV48TFPrdNom, GXv_char4) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFForPrdDsc)==0), AV34TFForPrdDsc, GXv_char3) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFPrdCtwSt)==0), AV46TFPrdCtwSt, GXv_char2) ;
      entradaensayoslaboratorioproductos__wp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV40TFLb_LineaPr) ? "" : GXutil.str( AV40TFLb_LineaPr, 4, 0))+"|"+GXt_char18+"|"+GXt_char17+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFLB_CantP)==0) ? "" : GXutil.str( AV38TFLB_CantP, 11, 5))+"|"+((0==AV36TFForPrdUMe) ? "" : GXutil.str( AV36TFForPrdUMe, 1, 0))+"|"+GXt_char16+"|"+((0==AV42TFLb_orden) ? "" : GXutil.str( AV42TFLb_orden, 4, 0))+"|"+((0==AV44TFLb_PTinP) ? "" : GXutil.str( AV44TFLb_PTinP, 2, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV41TFLb_LineaPr_To) ? "" : GXutil.str( AV41TFLb_LineaPr_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFLB_CantP_To)==0) ? "" : GXutil.str( AV39TFLB_CantP_To, 11, 5))+"|"+((0==AV37TFForPrdUMe_To) ? "" : GXutil.str( AV37TFForPrdUMe_To, 1, 0))+"||"+((0==AV43TFLb_orden_To) ? "" : GXutil.str( AV43TFLb_orden_To, 4, 0))+"|"+((0==AV45TFLb_PTinP_To) ? "" : GXutil.str( AV45TFLb_PTinP_To, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV16GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV16GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV16GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV32Session.getValue(AV64Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV27OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV28OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_LINEAPR", "", !((0==AV40TFLb_LineaPr)&&(0==AV41TFLb_LineaPr_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFLb_LineaPr, 4, 0)), GXutil.trim( GXutil.str( AV41TFLb_LineaPr_To, 4, 0))) ;
      AV16GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFPRDNUM", "", !(GXutil.strcmp("", AV50TFPrdNum)==0), (short)(0), AV50TFPrdNum, "", !(GXutil.strcmp("", AV51TFPrdNum_Sel)==0), AV51TFPrdNum_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFPRDNOM", "", !(GXutil.strcmp("", AV48TFPrdNom)==0), (short)(0), AV48TFPrdNom, "", !(GXutil.strcmp("", AV49TFPrdNom_Sel)==0), AV49TFPrdNom_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_CANTP", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFLB_CantP)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFLB_CantP_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFLB_CantP, 11, 5)), GXutil.trim( GXutil.str( AV39TFLB_CantP_To, 11, 5))) ;
      AV16GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFFORPRDUME", "", !((0==AV36TFForPrdUMe)&&(0==AV37TFForPrdUMe_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFForPrdUMe, 1, 0)), GXutil.trim( GXutil.str( AV37TFForPrdUMe_To, 1, 0))) ;
      AV16GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV34TFForPrdDsc)==0), (short)(0), AV34TFForPrdDsc, "", !(GXutil.strcmp("", AV35TFForPrdDsc_Sel)==0), AV35TFForPrdDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_ORDEN", "", !((0==AV42TFLb_orden)&&(0==AV43TFLb_orden_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFLb_orden, 4, 0)), GXutil.trim( GXutil.str( AV43TFLb_orden_To, 4, 0))) ;
      AV16GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFLB_PTINP", "", !((0==AV44TFLb_PTinP)&&(0==AV45TFLb_PTinP_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFLb_PTinP, 2, 0)), GXutil.trim( GXutil.str( AV45TFLb_PTinP_To, 2, 0))) ;
      AV16GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFPRDCTWST", "", !(GXutil.strcmp("", AV46TFPrdCtwSt)==0), (short)(0), AV46TFPrdCtwSt, "", !(GXutil.strcmp("", AV47TFPrdCtwSt_Sel)==0), AV47TFPrdCtwSt_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState20[0] ;
      AV16GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV16GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV64Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV54TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV54TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV64Pgmname );
      AV54TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV54TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV18HTTPRequest.getScriptName()+"?"+AV18HTTPRequest.getQuerystring() );
      AV54TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.EntradaEnsayosLaboratorioProductos_TRN" );
      AV32Session.setValue("TrnContext", AV54TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue(AV64Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV64Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV32Session.getValue(AV64Pgmname+"GridState"), null, null);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV9EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtPrdCtwSt_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), !bGXsfl_83_Refreshing);
         GXv_SdtWWPGridState20[0] = AV16GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState20, "TFPRDCTWST", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV16GridState = GXv_SdtWWPGridState20[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV64Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV52TotLB_CantP = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TotLB_CantP", GXutil.ltrimstr( AV52TotLB_CantP, 18, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTLB_CANTP", getSecureSignedToken( "", localUtil.format( AV52TotLB_CantP, "ZZZZ9.99999")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV40TFLb_LineaPr ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV41TFLb_LineaPr_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV50TFPrdNum ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV48TFPrdNom ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV49TFPrdNom_Sel ;
      AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV38TFLB_CantP ;
      AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV39TFLB_CantP_To ;
      AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV36TFForPrdUMe ;
      AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV37TFForPrdUMe_To ;
      AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV34TFForPrdDsc ;
      AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV35TFForPrdDsc_Sel ;
      AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV42TFLb_orden ;
      AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV43TFLb_orden_To ;
      AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV44TFLb_PTinP ;
      AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV45TFLb_PTinP_To ;
      AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV46TFPrdCtwSt ;
      AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV47TFPrdCtwSt_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) ,
                                           Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) ,
                                           AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                           AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                           AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                           AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                           Byte.valueOf(AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) ,
                                           AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                           AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                           Short.valueOf(AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) ,
                                           Short.valueOf(AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) ,
                                           Byte.valueOf(AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) ,
                                           Byte.valueOf(AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) ,
                                           Short.valueOf(A5560Lb_LineaPr) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5561LB_CantP ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A5562Lb_orden) ,
                                           Byte.valueOf(A6545Lb_PTinP) ,
                                           AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                           AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           AV9EmprCod ,
                                           Integer.valueOf(AV22Lb_numero) ,
                                           AV23Lb_opcion ,
                                           A396EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum), 6, "%") ;
      lV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom), 26, "%") ;
      lV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor H02BA4 */
      pr_default.execute(2, new Object[] {AV9EmprCod, Integer.valueOf(AV22Lb_numero), AV23Lb_opcion, Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr), Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to), lV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum, AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel, lV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom, AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel, AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp, AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to, Byte.valueOf(AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume), Byte.valueOf(AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to), lV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc, AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel, Short.valueOf(AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden), Short.valueOf(AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to), Byte.valueOf(AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp), Byte.valueOf(AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5555Lb_opcion = H02BA4_A5555Lb_opcion[0] ;
         A5532Lb_numero = H02BA4_A5532Lb_numero[0] ;
         A6545Lb_PTinP = H02BA4_A6545Lb_PTinP[0] ;
         A5562Lb_orden = H02BA4_A5562Lb_orden[0] ;
         A488ForPrdDsc = H02BA4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H02BA4_n488ForPrdDsc[0] ;
         A490ForPrdUMe = H02BA4_A490ForPrdUMe[0] ;
         A5561LB_CantP = H02BA4_A5561LB_CantP[0] ;
         A718PrdNom = H02BA4_A718PrdNom[0] ;
         A5560Lb_LineaPr = H02BA4_A5560Lb_LineaPr[0] ;
         A719PrdNum = H02BA4_A719PrdNum[0] ;
         A396EmprCod = H02BA4_A396EmprCod[0] ;
         A718PrdNom = H02BA4_A718PrdNom[0] ;
         A488ForPrdDsc = H02BA4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H02BA4_n488ForPrdDsc[0] ;
         GXt_char18 = A14097PrdCtwSt ;
         GXv_char19[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = GXt_char18 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char19, GXv_char4, GXv_char3) ;
         entradaensayoslaboratorioproductos__wp_impl.this.A396EmprCod = GXv_char19[0] ;
         entradaensayoslaboratorioproductos__wp_impl.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratorioproductos__wp_impl.this.GXt_char18 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14097PrdCtwSt = GXt_char18 ;
         if ( ! ( (GXutil.strcmp("", AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel) == 0 ) ) )
            {
               AV52TotLB_CantP = A5561LB_CantP.add(AV52TotLB_CantP) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52TotLB_CantP", GXutil.ltrimstr( AV52TotLB_CantP, 18, 5));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTLB_CANTP", getSecureSignedToken( "", localUtil.format( AV52TotLB_CantP, "ZZZZ9.99999")));
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV53TotValueLB_CantP = localUtil.format( AV52TotLB_CantP, "ZZZZ9.99999") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TotValueLB_CantP", AV53TotValueLB_CantP);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      /* Using cursor H02BA5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H02BA5_A396EmprCod[0] ;
         A856ValCod = H02BA5_A856ValCod[0] ;
         A13747PrdCDsc = H02BA5_A13747PrdCDsc[0] ;
         A719PrdNum = H02BA5_A719PrdNum[0] ;
         A718PrdNom = H02BA5_A718PrdNom[0] ;
         AV7Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV7Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV7Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV31PrdNum_Data.add(AV7Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_prdnum_Selectedvalue_set = AV30PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
   }

   public void e222BA2( )
   {
      /* Lb_lineapr_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char19[0] = AV30PrdNum ;
      GXv_decimal15[0] = AV20LB_CantP ;
      GXv_int8[0] = AV24Lb_orden ;
      GXv_int10[0] = AV12ForPrdUMe ;
      GXv_char4[0] = AV11ForPrdDsc ;
      GXv_int21[0] = AV25Lb_PTinP ;
      new app.obtengovaloreslb_lb_lineapr(remoteHandle, context).execute( AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, AV21Lb_LineaPr, GXv_char19, GXv_decimal15, GXv_int8, GXv_int10, GXv_char4, GXv_int21) ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV30PrdNum = GXv_char19[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV20LB_CantP = GXv_decimal15[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV24Lb_orden = GXv_int8[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV12ForPrdUMe = GXv_int10[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV11ForPrdDsc = GXv_char4[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV25Lb_PTinP = GXv_int21[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30PrdNum", AV30PrdNum);
      httpContext.ajax_rsp_assign_attri("", false, "AV20LB_CantP", GXutil.ltrimstr( AV20LB_CantP, 11, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lb_orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Lb_orden), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForPrdUMe", GXutil.str( AV12ForPrdUMe, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdDsc", AV11ForPrdDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lb_PTinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Lb_PTinP), 2, 0));
      Combo_prdnum_Selectedvalue_set = AV30PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      /*  Sending Event outputs  */
   }

   public void e282BA2( )
   {
      /* Lb_LineaPr_Click Routine */
      returnInSub = false ;
      AV6Acciongridmodificar = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Acciongridmodificar), 4, 0));
      AV21Lb_LineaPr = A5560Lb_LineaPr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lb_LineaPr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Lb_LineaPr), 4, 0));
      GXv_char19[0] = AV30PrdNum ;
      GXv_decimal15[0] = AV20LB_CantP ;
      GXv_int8[0] = AV24Lb_orden ;
      GXv_int21[0] = AV12ForPrdUMe ;
      GXv_char4[0] = AV11ForPrdDsc ;
      GXv_int10[0] = AV25Lb_PTinP ;
      new app.obtengovaloreslb_lb_lineapr(remoteHandle, context).execute( AV9EmprCod, AV22Lb_numero, AV23Lb_opcion, AV21Lb_LineaPr, GXv_char19, GXv_decimal15, GXv_int8, GXv_int21, GXv_char4, GXv_int10) ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV30PrdNum = GXv_char19[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV20LB_CantP = GXv_decimal15[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV24Lb_orden = GXv_int8[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV12ForPrdUMe = GXv_int21[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV11ForPrdDsc = GXv_char4[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV25Lb_PTinP = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30PrdNum", AV30PrdNum);
      httpContext.ajax_rsp_assign_attri("", false, "AV20LB_CantP", GXutil.ltrimstr( AV20LB_CantP, 11, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lb_orden", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Lb_orden), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForPrdUMe", GXutil.str( AV12ForPrdUMe, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdDsc", AV11ForPrdDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lb_PTinP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Lb_PTinP), 2, 0));
      Combo_prdnum_Selectedvalue_set = AV30PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      GX_FocusControl = edtavLb_cantp_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e232BA2( )
   {
      /* Forprdume_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char19[0] = AV9EmprCod ;
      GXv_int21[0] = AV12ForPrdUMe ;
      GXv_char4[0] = AV11ForPrdDsc ;
      new app.pbusumed(remoteHandle, context).execute( GXv_char19, GXv_int21, GXv_char4) ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV9EmprCod = GXv_char19[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV12ForPrdUMe = GXv_int21[0] ;
      entradaensayoslaboratorioproductos__wp_impl.this.AV11ForPrdDsc = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForPrdUMe", GXutil.str( AV12ForPrdUMe, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdDsc", AV11ForPrdDsc);
      /*  Sending Event outputs  */
   }

   public void S222( )
   {
      /* 'UNIDADPRODUCTO' Routine */
      returnInSub = false ;
      AV12ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForPrdUMe", GXutil.str( AV12ForPrdUMe, 1, 0));
      AV11ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdDsc", AV11ForPrdDsc);
      /* Using cursor H02BA6 */
      pr_default.execute(4, new Object[] {AV9EmprCod, AV30PrdNum});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A719PrdNum = H02BA6_A719PrdNum[0] ;
         A396EmprCod = H02BA6_A396EmprCod[0] ;
         A4338PrdUMeFo = H02BA6_A4338PrdUMeFo[0] ;
         AV12ForPrdUMe = A4338PrdUMeFo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12ForPrdUMe", GXutil.str( AV12ForPrdUMe, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV12ForPrdUMe > 0 )
      {
         GXv_char19[0] = AV9EmprCod ;
         GXv_int21[0] = AV12ForPrdUMe ;
         GXv_char4[0] = AV11ForPrdDsc ;
         new app.pbusumed(remoteHandle, context).execute( GXv_char19, GXv_int21, GXv_char4) ;
         entradaensayoslaboratorioproductos__wp_impl.this.AV9EmprCod = GXv_char19[0] ;
         entradaensayoslaboratorioproductos__wp_impl.this.AV12ForPrdUMe = GXv_int21[0] ;
         entradaensayoslaboratorioproductos__wp_impl.this.AV11ForPrdDsc = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV12ForPrdUMe", GXutil.str( AV12ForPrdUMe, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdDsc", AV11ForPrdDsc);
      }
   }

   public void wb_table3_130_2BA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_cerrar_Internalname, tblTabledvelop_confirmpanel_cerrar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_cerrar.setProperty("Title", Dvelop_confirmpanel_cerrar_Title);
         ucDvelop_confirmpanel_cerrar.setProperty("ConfirmationText", Dvelop_confirmpanel_cerrar_Confirmationtext);
         ucDvelop_confirmpanel_cerrar.setProperty("YesButtonCaption", Dvelop_confirmpanel_cerrar_Yesbuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("NoButtonCaption", Dvelop_confirmpanel_cerrar_Nobuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_cerrar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("YesButtonPosition", Dvelop_confirmpanel_cerrar_Yesbuttonposition);
         ucDvelop_confirmpanel_cerrar.setProperty("ConfirmType", Dvelop_confirmpanel_cerrar_Confirmtype);
         ucDvelop_confirmpanel_cerrar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_cerrar_Internalname, "DVELOP_CONFIRMPANEL_CERRARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CERRARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_130_2BA2e( true) ;
      }
      else
      {
         wb_table3_130_2BA2e( false) ;
      }
   }

   public void wb_table2_125_2BA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_125_2BA2e( true) ;
      }
      else
      {
         wb_table2_125_2BA2e( false) ;
      }
   }

   public void wb_table1_96_2BA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluelb_cantp_Internalname, httpContext.getMessage( "Tot Value LB_Cant P", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluelb_cantp_Internalname, AV53TotValueLB_CantP, GXutil.rtrim( localUtil.format( AV53TotValueLB_CantP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluelb_cantp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluelb_cantp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioProductos__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_96_2BA2e( true) ;
      }
      else
      {
         wb_table1_96_2BA2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV9EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      AV22Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Lb_numero), 8, 0));
      AV23Lb_opcion = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lb_opcion", AV23Lb_opcion);
      AV26Lb_Rb = (java.math.BigDecimal)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lb_Rb", GXutil.ltrimstr( AV26Lb_Rb, 7, 2));
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
      pa2BA2( ) ;
      ws2BA2( ) ;
      we2BA2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116153437", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gestionlaboratorio/entradaensayoslaboratorioproductos__wp.js", "?202682116153438", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_832( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_83_idx );
      edtLb_LineaPr_Internalname = "LB_LINEAPR_"+sGXsfl_83_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_83_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_83_idx ;
      edtLB_CantP_Internalname = "LB_CANTP_"+sGXsfl_83_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_83_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_83_idx ;
      edtLb_orden_Internalname = "LB_ORDEN_"+sGXsfl_83_idx ;
      edtLb_PTinP_Internalname = "LB_PTINP_"+sGXsfl_83_idx ;
      edtPrdCtwSt_Internalname = "PRDCTWST_"+sGXsfl_83_idx ;
   }

   public void subsflControlProps_fel_832( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_83_fel_idx );
      edtLb_LineaPr_Internalname = "LB_LINEAPR_"+sGXsfl_83_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_83_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_83_fel_idx ;
      edtLB_CantP_Internalname = "LB_CANTP_"+sGXsfl_83_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_83_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_83_fel_idx ;
      edtLb_orden_Internalname = "LB_ORDEN_"+sGXsfl_83_fel_idx ;
      edtLb_PTinP_Internalname = "LB_PTINP_"+sGXsfl_83_fel_idx ;
      edtPrdCtwSt_Internalname = "PRDCTWST_"+sGXsfl_83_fel_idx ;
   }

   public void sendrow_832( )
   {
      subsflControlProps_832( ) ;
      wb2BA0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_83_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_83_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_83_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 84,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_83_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV13GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV13GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV13GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_83_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,84);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV13GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_83_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_LineaPr_Internalname,GXutil.ltrim( localUtil.ntoc( A5560Lb_LineaPr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5560Lb_LineaPr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"ELB_LINEAPR.CLICK."+sGXsfl_83_idx+"'","","","","",edtLb_LineaPr_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtLb_LineaPr_Columnclass,edtLb_LineaPr_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrdNum_Columnclass,edtPrdNum_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrdNom_Columnclass,edtPrdNom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLB_CantP_Internalname,GXutil.ltrim( localUtil.ntoc( A5561LB_CantP, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5561LB_CantP, "ZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLB_CantP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLB_CantP_Columnclass,edtLB_CantP_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForPrdUMe_Columnclass,edtForPrdUMe_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForPrdDsc_Columnclass,edtForPrdDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_orden_Internalname,GXutil.ltrim( localUtil.ntoc( A5562Lb_orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5562Lb_orden), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_orden_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_orden_Columnclass,edtLb_orden_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_PTinP_Internalname,GXutil.ltrim( localUtil.ntoc( A6545Lb_PTinP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6545Lb_PTinP), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_PTinP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_PTinP_Columnclass,edtLb_PTinP_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdCtwSt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtwSt_Internalname,A14097PrdCtwSt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtwSt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrdCtwSt_Columnclass,edtPrdCtwSt_Columnheaderclass,Integer.valueOf(edtPrdCtwSt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2BA2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_83_idx = ((subGrid_Islastpage==1)&&(nGXsfl_83_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_83_idx+1) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_832( ) ;
      }
      /* End function sendrow_832 */
   }

   public void startgridcontrol83( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"83\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desc.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden (#)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fibra", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCtwSt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV13GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5560Lb_LineaPr, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_LineaPr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_LineaPr_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPrdNum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPrdNum_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPrdNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPrdNom_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5561LB_CantP, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLB_CantP_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLB_CantP_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForPrdUMe_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForPrdUMe_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForPrdDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForPrdDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5562Lb_orden, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_orden_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_orden_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6545Lb_PTinP, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_PTinP_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_PTinP_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14097PrdCtwSt);
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPrdCtwSt_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPrdCtwSt_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavLb_numero_Internalname = "vLB_NUMERO" ;
      edtavLb_opcion_Internalname = "vLB_OPCION" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavLb_lineapr_Internalname = "vLB_LINEAPR" ;
      lblTextblockcombo_prdnum_Internalname = "TEXTBLOCKCOMBO_PRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      edtavLb_cantp_Internalname = "vLB_CANTP" ;
      edtavForprdume_Internalname = "vFORPRDUME" ;
      imgUseraction1_Internalname = "USERACTION1" ;
      edtavForprddsc_Internalname = "vFORPRDDSC" ;
      edtavLb_orden_Internalname = "vLB_ORDEN" ;
      imgUseraction2_Internalname = "USERACTION2" ;
      edtavLb_ptinp_Internalname = "vLB_PTINP" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnlimpiarvariables_Internalname = "BTNLIMPIARVARIABLES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtLb_LineaPr_Internalname = "LB_LINEAPR" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtLB_CantP_Internalname = "LB_CANTP" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtLb_orden_Internalname = "LB_ORDEN" ;
      edtLb_PTinP_Internalname = "LB_PTINP" ;
      edtPrdCtwSt_Internalname = "PRDCTWST" ;
      edtavTotvaluelb_cantp_Internalname = "vTOTVALUELB_CANTP" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavPrdnum_Internalname = "vPRDNUM" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      Dvelop_confirmpanel_cerrar_Internalname = "DVELOP_CONFIRMPANEL_CERRAR" ;
      tblTabledvelop_confirmpanel_cerrar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CERRAR" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtPrdCtwSt_Jsonclick = "" ;
      edtPrdCtwSt_Columnclass = "WWColumn" ;
      edtLb_PTinP_Jsonclick = "" ;
      edtLb_PTinP_Columnclass = "WWColumn" ;
      edtLb_orden_Jsonclick = "" ;
      edtLb_orden_Columnclass = "WWColumn" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Columnclass = "WWColumn" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Columnclass = "WWColumn" ;
      edtLB_CantP_Jsonclick = "" ;
      edtLB_CantP_Columnclass = "WWColumn" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Columnclass = "WWColumn" ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Columnclass = "WWColumn" ;
      edtLb_LineaPr_Jsonclick = "" ;
      edtLb_LineaPr_Columnclass = "WWColumn" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluelb_cantp_Jsonclick = "" ;
      edtavTotvaluelb_cantp_Enabled = 1 ;
      edtPrdCtwSt_Columnheaderclass = "" ;
      edtLb_PTinP_Columnheaderclass = "" ;
      edtLb_orden_Columnheaderclass = "" ;
      edtForPrdDsc_Columnheaderclass = "" ;
      edtForPrdUMe_Columnheaderclass = "" ;
      edtLB_CantP_Columnheaderclass = "" ;
      edtPrdNom_Columnheaderclass = "" ;
      edtPrdNum_Columnheaderclass = "" ;
      edtLb_LineaPr_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavLb_ptinp_Jsonclick = "" ;
      edtavLb_ptinp_Enabled = 1 ;
      edtavLb_orden_Jsonclick = "" ;
      edtavLb_orden_Enabled = 1 ;
      edtavForprddsc_Jsonclick = "" ;
      edtavForprddsc_Enabled = 1 ;
      edtavForprdume_Jsonclick = "" ;
      edtavForprdume_Enabled = 1 ;
      edtavLb_cantp_Jsonclick = "" ;
      edtavLb_cantp_Enabled = 1 ;
      edtavLb_lineapr_Jsonclick = "" ;
      edtavLb_lineapr_Enabled = 1 ;
      edtavLb_opcion_Jsonclick = "" ;
      edtavLb_opcion_Enabled = 0 ;
      edtavLb_numero_Jsonclick = "" ;
      edtavLb_numero_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_cerrar_Confirmtype = "1" ;
      Dvelop_confirmpanel_cerrar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_cerrar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_cerrar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_cerrar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_cerrar_Confirmationtext = "Existem linhas com quantidade zero, Deseja continuar?" ;
      Dvelop_confirmpanel_cerrar_Title = httpContext.getMessage( "Aviso", "") ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma la linea?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.EntradaEnsayosLaboratorioProductos__WPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|||Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|||T|||T" ;
      Ddo_grid_Filterisrange = "T|||T|T||T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Numeric|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|" ;
      Ddo_grid_Columnids = "1:Lb_LineaPr|2:PrdNum|3:PrdNom|4:LB_CantP|5:ForPrdUMe|6:ForPrdDsc|7:Lb_orden|8:Lb_PTinP|9:PrdCtwSt" ;
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
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Entrada Ensayos Laboratorio Productos ", "") );
      edtPrdCtwSt_Visible = -1 ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_83_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV13GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV13GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5561LB_CantP',fld:'LB_CANTP',pic:'ZZZZ9.99999'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtLb_LineaPr_Columnheaderclass',ctrl:'LB_LINEAPR',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantP_Columnheaderclass',ctrl:'LB_CANTP',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtLb_orden_Columnheaderclass',ctrl:'LB_ORDEN',prop:'Columnheaderclass'},{av:'edtLb_PTinP_Columnheaderclass',ctrl:'LB_PTINP',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'AV53TotValueLB_CantP',fld:'vTOTVALUELB_CANTP',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e262BA2',iparms:[{av:'A10936PrdCtw1',fld:'PRDCTW1',pic:''},{av:'A10937PrdCtw2',fld:'PRDCTW2',pic:''},{av:'A10938PrdCtw3',fld:'PRDCTW3',pic:''},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV13GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtLb_LineaPr_Columnclass',ctrl:'LB_LINEAPR',prop:'Columnclass'},{av:'edtPrdNum_Columnclass',ctrl:'PRDNUM',prop:'Columnclass'},{av:'edtPrdNom_Columnclass',ctrl:'PRDNOM',prop:'Columnclass'},{av:'edtLB_CantP_Columnclass',ctrl:'LB_CANTP',prop:'Columnclass'},{av:'edtForPrdUMe_Columnclass',ctrl:'FORPRDUME',prop:'Columnclass'},{av:'edtForPrdDsc_Columnclass',ctrl:'FORPRDDSC',prop:'Columnclass'},{av:'edtLb_orden_Columnclass',ctrl:'LB_ORDEN',prop:'Columnclass'},{av:'edtLb_PTinP_Columnclass',ctrl:'LB_PTINP',prop:'Columnclass'},{av:'edtPrdCtwSt_Columnclass',ctrl:'PRDCTWST',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e272BA2',iparms:[{av:'cmbavGridactions'},{av:'AV13GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A5560Lb_LineaPr',fld:'LB_LINEAPR',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5561LB_CantP',fld:'LB_CANTP',pic:'ZZZZ9.99999'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV13GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV21Lb_LineaPr',fld:'vLB_LINEAPR',pic:'ZZZ9'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtLb_LineaPr_Columnheaderclass',ctrl:'LB_LINEAPR',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantP_Columnheaderclass',ctrl:'LB_CANTP',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtLb_orden_Columnheaderclass',ctrl:'LB_ORDEN',prop:'Columnheaderclass'},{av:'edtLb_PTinP_Columnheaderclass',ctrl:'LB_PTINP',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'AV53TotValueLB_CantP',fld:'vTOTVALUELB_CANTP',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e172BA2',iparms:[{av:'AV21Lb_LineaPr',fld:'vLB_LINEAPR',pic:'ZZZ9'},{av:'AV30PrdNum',fld:'vPRDNUM',pic:''},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV20LB_CantP',fld:'vLB_CANTP',pic:'ZZZZ9.99999'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV24Lb_orden',fld:'vLB_ORDEN',pic:'ZZZ9'},{av:'AV25Lb_PTinP',fld:'vLB_PTINP',pic:'Z9'},{av:'AV26Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV33Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5561LB_CantP',fld:'LB_CANTP',pic:'ZZZZ9.99999'}]");
      setEventMetadata("ENTER",",oparms:[{av:'Dvelop_confirmpanel_enter_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'ConfirmationText'},{av:'AV26Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33Station',fld:'vSTATION',pic:''},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV11ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV20LB_CantP',fld:'vLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV24Lb_orden',fld:'vLB_ORDEN',pic:'ZZZ9'},{av:'AV30PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV21Lb_LineaPr',fld:'vLB_LINEAPR',pic:'ZZZ9'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtLb_LineaPr_Columnheaderclass',ctrl:'LB_LINEAPR',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantP_Columnheaderclass',ctrl:'LB_CANTP',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtLb_orden_Columnheaderclass',ctrl:'LB_ORDEN',prop:'Columnheaderclass'},{av:'edtLb_PTinP_Columnheaderclass',ctrl:'LB_PTINP',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'AV53TotValueLB_CantP',fld:'vTOTVALUELB_CANTP',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e152BA2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV21Lb_LineaPr',fld:'vLB_LINEAPR',pic:'ZZZ9'},{av:'AV30PrdNum',fld:'vPRDNUM',pic:''},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV20LB_CantP',fld:'vLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV24Lb_orden',fld:'vLB_ORDEN',pic:'ZZZ9'},{av:'AV25Lb_PTinP',fld:'vLB_PTINP',pic:'Z9'},{av:'AV26Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV33Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5561LB_CantP',fld:'LB_CANTP',pic:'ZZZZ9.99999'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV26Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33Station',fld:'vSTATION',pic:''},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV11ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV20LB_CantP',fld:'vLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV24Lb_orden',fld:'vLB_ORDEN',pic:'ZZZ9'},{av:'AV30PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV21Lb_LineaPr',fld:'vLB_LINEAPR',pic:'ZZZ9'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtLb_LineaPr_Columnheaderclass',ctrl:'LB_LINEAPR',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantP_Columnheaderclass',ctrl:'LB_CANTP',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtLb_orden_Columnheaderclass',ctrl:'LB_ORDEN',prop:'Columnheaderclass'},{av:'edtLb_PTinP_Columnheaderclass',ctrl:'LB_PTINP',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'AV53TotValueLB_CantP',fld:'vTOTVALUELB_CANTP',pic:''}]}");
      setEventMetadata("'DOLIMPIARVARIABLES'","{handler:'e182BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5561LB_CantP',fld:'LB_CANTP',pic:'ZZZZ9.99999'}]");
      setEventMetadata("'DOLIMPIARVARIABLES'",",oparms:[{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV11ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV20LB_CantP',fld:'vLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV24Lb_orden',fld:'vLB_ORDEN',pic:'ZZZ9'},{av:'AV30PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV21Lb_LineaPr',fld:'vLB_LINEAPR',pic:'ZZZ9'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtLb_LineaPr_Columnheaderclass',ctrl:'LB_LINEAPR',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantP_Columnheaderclass',ctrl:'LB_CANTP',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtLb_orden_Columnheaderclass',ctrl:'LB_ORDEN',prop:'Columnheaderclass'},{av:'edtLb_PTinP_Columnheaderclass',ctrl:'LB_PTINP',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'AV53TotValueLB_CantP',fld:'vTOTVALUELB_CANTP',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e192BA2',iparms:[{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'Dvelop_confirmpanel_cerrar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE","{handler:'e162BA2',iparms:[{av:'Dvelop_confirmpanel_cerrar_Result',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'Result'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e202BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV11ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5561LB_CantP',fld:'LB_CANTP',pic:'ZZZZ9.99999'}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV11ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtLb_LineaPr_Columnheaderclass',ctrl:'LB_LINEAPR',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantP_Columnheaderclass',ctrl:'LB_CANTP',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtLb_orden_Columnheaderclass',ctrl:'LB_ORDEN',prop:'Columnheaderclass'},{av:'edtLb_PTinP_Columnheaderclass',ctrl:'LB_PTINP',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'AV53TotValueLB_CantP',fld:'vTOTVALUELB_CANTP',pic:''}]}");
      setEventMetadata("'DOUSERACTION2'","{handler:'e212BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV24Lb_orden',fld:'vLB_ORDEN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5561LB_CantP',fld:'LB_CANTP',pic:'ZZZZ9.99999'}]");
      setEventMetadata("'DOUSERACTION2'",",oparms:[{av:'AV24Lb_orden',fld:'vLB_ORDEN',pic:'ZZZ9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtLb_LineaPr_Columnheaderclass',ctrl:'LB_LINEAPR',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantP_Columnheaderclass',ctrl:'LB_CANTP',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtLb_orden_Columnheaderclass',ctrl:'LB_ORDEN',prop:'Columnheaderclass'},{av:'edtLb_PTinP_Columnheaderclass',ctrl:'LB_PTINP',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'AV53TotValueLB_CantP',fld:'vTOTVALUELB_CANTP',pic:''}]}");
      setEventMetadata("COMBO_PRDNUM.ONOPTIONCLICKED","{handler:'e112BA2',iparms:[{av:'Combo_prdnum_Selectedvalue_get',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_get'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30PrdNum',fld:'vPRDNUM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'}]");
      setEventMetadata("COMBO_PRDNUM.ONOPTIONCLICKED",",oparms:[{av:'AV30PrdNum',fld:'vPRDNUM',pic:''},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV11ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VLB_LINEAPR.CONTROLVALUECHANGED","{handler:'e222BA2',iparms:[{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV21Lb_LineaPr',fld:'vLB_LINEAPR',pic:'ZZZ9'}]");
      setEventMetadata("VLB_LINEAPR.CONTROLVALUECHANGED",",oparms:[{av:'AV25Lb_PTinP',fld:'vLB_PTINP',pic:'Z9'},{av:'AV11ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV24Lb_orden',fld:'vLB_ORDEN',pic:'ZZZ9'},{av:'AV20LB_CantP',fld:'vLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV30PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'}]}");
      setEventMetadata("LB_LINEAPR.CLICK","{handler:'e282BA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV23Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV40TFLb_LineaPr',fld:'vTFLB_LINEAPR',pic:'ZZZ9'},{av:'AV41TFLb_LineaPr_To',fld:'vTFLB_LINEAPR_TO',pic:'ZZZ9'},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV48TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV49TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFLB_CantP',fld:'vTFLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV39TFLB_CantP_To',fld:'vTFLB_CANTP_TO',pic:'ZZZZ9.99999'},{av:'AV36TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV37TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV34TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV35TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV42TFLb_orden',fld:'vTFLB_ORDEN',pic:'ZZZ9'},{av:'AV43TFLb_orden_To',fld:'vTFLB_ORDEN_TO',pic:'ZZZ9'},{av:'AV44TFLb_PTinP',fld:'vTFLB_PTINP',pic:'Z9'},{av:'AV45TFLb_PTinP_To',fld:'vTFLB_PTINP_TO',pic:'Z9'},{av:'AV46TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV47TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV61Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A5560Lb_LineaPr',fld:'LB_LINEAPR',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5561LB_CantP',fld:'LB_CANTP',pic:'ZZZZ9.99999'}]");
      setEventMetadata("LB_LINEAPR.CLICK",",oparms:[{av:'AV6Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV21Lb_LineaPr',fld:'vLB_LINEAPR',pic:'ZZZ9'},{av:'AV25Lb_PTinP',fld:'vLB_PTINP',pic:'Z9'},{av:'AV11ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV24Lb_orden',fld:'vLB_ORDEN',pic:'ZZZ9'},{av:'AV20LB_CantP',fld:'vLB_CANTP',pic:'ZZZZ9.99999'},{av:'AV30PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtLb_LineaPr_Columnheaderclass',ctrl:'LB_LINEAPR',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantP_Columnheaderclass',ctrl:'LB_CANTP',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtLb_orden_Columnheaderclass',ctrl:'LB_ORDEN',prop:'Columnheaderclass'},{av:'edtLb_PTinP_Columnheaderclass',ctrl:'LB_PTINP',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV52TotLB_CantP',fld:'vTOTLB_CANTP',pic:'ZZZZ9.99999',hsh:true},{av:'AV53TotValueLB_CantP',fld:'vTOTVALUELB_CANTP',pic:''}]}");
      setEventMetadata("VFORPRDUME.CONTROLVALUECHANGED","{handler:'e232BA2',iparms:[{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'}]");
      setEventMetadata("VFORPRDUME.CONTROLVALUECHANGED",",oparms:[{av:'AV11ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV12ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_LB_NUMERO","{handler:'validv_Lb_numero',iparms:[]");
      setEventMetadata("VALIDV_LB_NUMERO",",oparms:[]}");
      setEventMetadata("VALIDV_LB_OPCION","{handler:'validv_Lb_opcion',iparms:[]");
      setEventMetadata("VALIDV_LB_OPCION",",oparms:[]}");
      setEventMetadata("VALIDV_FORPRDUME","{handler:'validv_Forprdume',iparms:[]");
      setEventMetadata("VALIDV_FORPRDUME",",oparms:[]}");
      setEventMetadata("VALIDV_PRDNUM","{handler:'validv_Prdnum',iparms:[]");
      setEventMetadata("VALIDV_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
      setEventMetadata("VALID_PRDCTWST","{handler:'valid_Prdctwst',iparms:[]");
      setEventMetadata("VALID_PRDCTWST",",oparms:[]}");
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
      wcpOAV9EmprCod = "" ;
      wcpOAV23Lb_opcion = "" ;
      wcpOAV26Lb_Rb = DecimalUtil.ZERO ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Dvelop_confirmpanel_cerrar_Result = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV9EmprCod = "" ;
      AV23Lb_opcion = "" ;
      AV26Lb_Rb = DecimalUtil.ZERO ;
      AV50TFPrdNum = "" ;
      AV51TFPrdNum_Sel = "" ;
      AV48TFPrdNom = "" ;
      AV49TFPrdNom_Sel = "" ;
      AV38TFLB_CantP = DecimalUtil.ZERO ;
      AV39TFLB_CantP_To = DecimalUtil.ZERO ;
      AV34TFForPrdDsc = "" ;
      AV35TFForPrdDsc_Sel = "" ;
      AV46TFPrdCtwSt = "" ;
      AV47TFPrdCtwSt_Sel = "" ;
      AV64Pgmname = "" ;
      AV52TotLB_CantP = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV31PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV8DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A5555Lb_opcion = "" ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      AV33Station = "" ;
      A396EmprCod = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcombo_prdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV20LB_CantP = DecimalUtil.ZERO ;
      ClassString = "" ;
      imgUseraction1_gximage = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      imgUseraction1_Jsonclick = "" ;
      AV11ForPrdDsc = "" ;
      imgUseraction2_gximage = "" ;
      imgUseraction2_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnlimpiarvariables_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV30PrdNum = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A14097PrdCtwSt = "" ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = "" ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = "" ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = "" ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = "" ;
      AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = DecimalUtil.ZERO ;
      AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = DecimalUtil.ZERO ;
      AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = "" ;
      AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = "" ;
      AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = "" ;
      AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = "" ;
      scmdbuf = "" ;
      lV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = "" ;
      lV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = "" ;
      lV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = "" ;
      H02BA2_A5555Lb_opcion = new String[] {""} ;
      H02BA2_A5532Lb_numero = new int[1] ;
      H02BA2_A10938PrdCtw3 = new String[] {""} ;
      H02BA2_A10937PrdCtw2 = new String[] {""} ;
      H02BA2_A10936PrdCtw1 = new String[] {""} ;
      H02BA2_A6545Lb_PTinP = new byte[1] ;
      H02BA2_A5562Lb_orden = new short[1] ;
      H02BA2_A488ForPrdDsc = new String[] {""} ;
      H02BA2_n488ForPrdDsc = new boolean[] {false} ;
      H02BA2_A490ForPrdUMe = new byte[1] ;
      H02BA2_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BA2_A718PrdNom = new String[] {""} ;
      H02BA2_A5560Lb_LineaPr = new short[1] ;
      H02BA2_A719PrdNum = new String[] {""} ;
      H02BA2_A396EmprCod = new String[] {""} ;
      H02BA3_A5555Lb_opcion = new String[] {""} ;
      H02BA3_A5532Lb_numero = new int[1] ;
      H02BA3_A10938PrdCtw3 = new String[] {""} ;
      H02BA3_A10937PrdCtw2 = new String[] {""} ;
      H02BA3_A10936PrdCtw1 = new String[] {""} ;
      H02BA3_A6545Lb_PTinP = new byte[1] ;
      H02BA3_A5562Lb_orden = new short[1] ;
      H02BA3_A488ForPrdDsc = new String[] {""} ;
      H02BA3_n488ForPrdDsc = new boolean[] {false} ;
      H02BA3_A490ForPrdUMe = new byte[1] ;
      H02BA3_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BA3_A718PrdNom = new String[] {""} ;
      H02BA3_A5560Lb_LineaPr = new short[1] ;
      H02BA3_A719PrdNum = new String[] {""} ;
      H02BA3_A396EmprCod = new String[] {""} ;
      AV53TotValueLB_CantP = "" ;
      hsh = "" ;
      AV10EmprNom = "" ;
      AV56UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV57WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV59ForPrdDsccontrol = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      AV60mensaje = "" ;
      ucDvelop_confirmpanel_cerrar = new com.genexus.webpanels.GXUserControl();
      GXv_int12 = new int[1] ;
      AV58Coste_cor = DecimalUtil.ZERO ;
      AV5Lb_costec = DecimalUtil.ZERO ;
      GXv_int14 = new int[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      AV32Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char17 = "" ;
      GXt_char16 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV54TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV18HTTPRequest = httpContext.getHttpRequest();
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      H02BA4_A5555Lb_opcion = new String[] {""} ;
      H02BA4_A5532Lb_numero = new int[1] ;
      H02BA4_A6545Lb_PTinP = new byte[1] ;
      H02BA4_A5562Lb_orden = new short[1] ;
      H02BA4_A488ForPrdDsc = new String[] {""} ;
      H02BA4_n488ForPrdDsc = new boolean[] {false} ;
      H02BA4_A490ForPrdUMe = new byte[1] ;
      H02BA4_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BA4_A718PrdNom = new String[] {""} ;
      H02BA4_A5560Lb_LineaPr = new short[1] ;
      H02BA4_A719PrdNum = new String[] {""} ;
      H02BA4_A396EmprCod = new String[] {""} ;
      GXt_char18 = "" ;
      GXv_char3 = new String[1] ;
      H02BA5_A396EmprCod = new String[] {""} ;
      H02BA5_A856ValCod = new byte[1] ;
      H02BA5_A13747PrdCDsc = new String[] {""} ;
      H02BA5_A719PrdNum = new String[] {""} ;
      H02BA5_A718PrdNom = new String[] {""} ;
      A13747PrdCDsc = "" ;
      AV7Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int8 = new short[1] ;
      GXv_int10 = new byte[1] ;
      H02BA6_A719PrdNum = new String[] {""} ;
      H02BA6_A396EmprCod = new String[] {""} ;
      H02BA6_A4338PrdUMeFo = new byte[1] ;
      GXv_char19 = new String[1] ;
      GXv_int21 = new byte[1] ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayoslaboratorioproductos__wp__default(),
         new Object[] {
             new Object[] {
            H02BA2_A5555Lb_opcion, H02BA2_A5532Lb_numero, H02BA2_A10938PrdCtw3, H02BA2_A10937PrdCtw2, H02BA2_A10936PrdCtw1, H02BA2_A6545Lb_PTinP, H02BA2_A5562Lb_orden, H02BA2_A488ForPrdDsc, H02BA2_n488ForPrdDsc, H02BA2_A490ForPrdUMe,
            H02BA2_A5561LB_CantP, H02BA2_A718PrdNom, H02BA2_A5560Lb_LineaPr, H02BA2_A719PrdNum, H02BA2_A396EmprCod
            }
            , new Object[] {
            H02BA3_A5555Lb_opcion, H02BA3_A5532Lb_numero, H02BA3_A10938PrdCtw3, H02BA3_A10937PrdCtw2, H02BA3_A10936PrdCtw1, H02BA3_A6545Lb_PTinP, H02BA3_A5562Lb_orden, H02BA3_A488ForPrdDsc, H02BA3_n488ForPrdDsc, H02BA3_A490ForPrdUMe,
            H02BA3_A5561LB_CantP, H02BA3_A718PrdNom, H02BA3_A5560Lb_LineaPr, H02BA3_A719PrdNum, H02BA3_A396EmprCod
            }
            , new Object[] {
            H02BA4_A5555Lb_opcion, H02BA4_A5532Lb_numero, H02BA4_A6545Lb_PTinP, H02BA4_A5562Lb_orden, H02BA4_A488ForPrdDsc, H02BA4_n488ForPrdDsc, H02BA4_A490ForPrdUMe, H02BA4_A5561LB_CantP, H02BA4_A718PrdNom, H02BA4_A5560Lb_LineaPr,
            H02BA4_A719PrdNum, H02BA4_A396EmprCod
            }
            , new Object[] {
            H02BA5_A396EmprCod, H02BA5_A856ValCod, H02BA5_A13747PrdCDsc, H02BA5_A719PrdNum, H02BA5_A718PrdNom
            }
            , new Object[] {
            H02BA6_A719PrdNum, H02BA6_A396EmprCod, H02BA6_A4338PrdUMeFo
            }
         }
      );
      AV64Pgmname = "GestionLaboratorio.EntradaEnsayosLaboratorioProductos__WP" ;
      /* GeneXus formulas. */
      AV64Pgmname = "GestionLaboratorio.EntradaEnsayosLaboratorioProductos__WP" ;
      Gx_err = (short)(0) ;
      edtavLb_numero_Enabled = 0 ;
      edtavLb_opcion_Enabled = 0 ;
      edtavForprddsc_Enabled = 0 ;
      edtavTotvaluelb_cantp_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV36TFForPrdUMe ;
   private byte AV37TFForPrdUMe_To ;
   private byte AV44TFLb_PTinP ;
   private byte AV45TFLb_PTinP_To ;
   private byte gxajaxcallmode ;
   private byte A4338PrdUMeFo ;
   private byte AV12ForPrdUMe ;
   private byte AV25Lb_PTinP ;
   private byte A490ForPrdUMe ;
   private byte A6545Lb_PTinP ;
   private byte nDonePA ;
   private byte AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume ;
   private byte AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to ;
   private byte AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp ;
   private byte AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int9 ;
   private byte A856ValCod ;
   private byte GXv_int10[] ;
   private byte GXv_int21[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV6Acciongridmodificar ;
   private short AV40TFLb_LineaPr ;
   private short AV41TFLb_LineaPr_To ;
   private short AV42TFLb_orden ;
   private short AV43TFLb_orden_To ;
   private short AV27OrderedBy ;
   private short AV61Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV21Lb_LineaPr ;
   private short AV24Lb_orden ;
   private short AV13GridActions ;
   private short A5560Lb_LineaPr ;
   private short A5562Lb_orden ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr ;
   private short AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to ;
   private short AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden ;
   private short AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to ;
   private short GXt_int7 ;
   private short GXv_int8[] ;
   private int wcpOAV22Lb_numero ;
   private int edtPrdCtwSt_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_83 ;
   private int AV22Lb_numero ;
   private int nGXsfl_83_idx=1 ;
   private int A5532Lb_numero ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavLb_numero_Enabled ;
   private int edtavLb_opcion_Enabled ;
   private int edtavLb_lineapr_Enabled ;
   private int edtavLb_cantp_Enabled ;
   private int edtavForprdume_Enabled ;
   private int edtavForprddsc_Enabled ;
   private int edtavLb_orden_Enabled ;
   private int edtavLb_ptinp_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavPrdnum_Visible ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluelb_cantp_Enabled ;
   private int AV29PageToGo ;
   private int GXv_int12[] ;
   private int GXv_int14[] ;
   private int AV83GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV14GridCurrentPage ;
   private long AV15GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV26Lb_Rb ;
   private java.math.BigDecimal AV26Lb_Rb ;
   private java.math.BigDecimal AV38TFLB_CantP ;
   private java.math.BigDecimal AV39TFLB_CantP_To ;
   private java.math.BigDecimal AV52TotLB_CantP ;
   private java.math.BigDecimal AV20LB_CantP ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ;
   private java.math.BigDecimal AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ;
   private java.math.BigDecimal AV58Coste_cor ;
   private java.math.BigDecimal AV5Lb_costec ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private String wcpOAV9EmprCod ;
   private String wcpOAV23Lb_opcion ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Dvelop_confirmpanel_cerrar_Result ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV9EmprCod ;
   private String AV23Lb_opcion ;
   private String sGXsfl_83_idx="0001" ;
   private String edtPrdCtwSt_Internalname ;
   private String AV50TFPrdNum ;
   private String AV51TFPrdNum_Sel ;
   private String AV48TFPrdNom ;
   private String AV49TFPrdNom_Sel ;
   private String AV34TFForPrdDsc ;
   private String AV35TFForPrdDsc_Sel ;
   private String AV64Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A5555Lb_opcion ;
   private String A10936PrdCtw1 ;
   private String A10937PrdCtw2 ;
   private String A10938PrdCtw3 ;
   private String AV33Station ;
   private String A396EmprCod ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Selectedvalue_set ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Dvelop_confirmpanel_cerrar_Title ;
   private String Dvelop_confirmpanel_cerrar_Confirmationtext ;
   private String Dvelop_confirmpanel_cerrar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_cerrar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavLb_numero_Internalname ;
   private String edtavLb_numero_Jsonclick ;
   private String edtavLb_opcion_Internalname ;
   private String edtavLb_opcion_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavLb_lineapr_Internalname ;
   private String TempTags ;
   private String edtavLb_lineapr_Jsonclick ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Internalname ;
   private String edtavLb_cantp_Internalname ;
   private String edtavLb_cantp_Jsonclick ;
   private String edtavForprdume_Internalname ;
   private String edtavForprdume_Jsonclick ;
   private String ClassString ;
   private String imgUseraction1_gximage ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgUseraction1_Internalname ;
   private String imgUseraction1_Jsonclick ;
   private String edtavForprddsc_Internalname ;
   private String AV11ForPrdDsc ;
   private String edtavForprddsc_Jsonclick ;
   private String edtavLb_orden_Internalname ;
   private String edtavLb_orden_Jsonclick ;
   private String imgUseraction2_gximage ;
   private String imgUseraction2_Internalname ;
   private String imgUseraction2_Jsonclick ;
   private String edtavLb_ptinp_Internalname ;
   private String edtavLb_ptinp_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnlimpiarvariables_Internalname ;
   private String bttBtnlimpiarvariables_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPrdnum_Internalname ;
   private String AV30PrdNum ;
   private String edtavPrdnum_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtLb_LineaPr_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtLB_CantP_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtLb_orden_Internalname ;
   private String edtLb_PTinP_Internalname ;
   private String edtavTotvaluelb_cantp_Internalname ;
   private String AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ;
   private String AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ;
   private String AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ;
   private String AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ;
   private String AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ;
   private String AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ;
   private String lV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ;
   private String lV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ;
   private String hsh ;
   private String AV10EmprNom ;
   private String AV56UsurCod ;
   private String edtLb_LineaPr_Columnheaderclass ;
   private String edtPrdNum_Columnheaderclass ;
   private String edtPrdNom_Columnheaderclass ;
   private String edtLB_CantP_Columnheaderclass ;
   private String edtForPrdUMe_Columnheaderclass ;
   private String edtForPrdDsc_Columnheaderclass ;
   private String edtLb_orden_Columnheaderclass ;
   private String edtLb_PTinP_Columnheaderclass ;
   private String edtPrdCtwSt_Columnheaderclass ;
   private String edtLb_LineaPr_Columnclass ;
   private String edtPrdNum_Columnclass ;
   private String edtPrdNom_Columnclass ;
   private String edtLB_CantP_Columnclass ;
   private String edtForPrdUMe_Columnclass ;
   private String edtForPrdDsc_Columnclass ;
   private String edtLb_orden_Columnclass ;
   private String edtLb_PTinP_Columnclass ;
   private String edtPrdCtwSt_Columnclass ;
   private String AV59ForPrdDsccontrol ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_cerrar_Internalname ;
   private String GXt_char17 ;
   private String GXt_char16 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char18 ;
   private String GXv_char3[] ;
   private String GXv_char19[] ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_cerrar_Internalname ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluelb_cantp_Jsonclick ;
   private String sGXsfl_83_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtLb_LineaPr_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtLB_CantP_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtLb_orden_Jsonclick ;
   private String edtLb_PTinP_Jsonclick ;
   private String edtPrdCtwSt_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_83_Refreshing=false ;
   private boolean AV28OrderedDsc ;
   private boolean Combo_prdnum_Emptyitem ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n488ForPrdDsc ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV46TFPrdCtwSt ;
   private String AV47TFPrdCtwSt_Sel ;
   private String A14097PrdCtwSt ;
   private String AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ;
   private String AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ;
   private String AV53TotValueLB_CantP ;
   private String AV60mensaje ;
   private String A13747PrdCDsc ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV18HTTPRequest ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_cerrar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H02BA2_A5555Lb_opcion ;
   private int[] H02BA2_A5532Lb_numero ;
   private String[] H02BA2_A10938PrdCtw3 ;
   private String[] H02BA2_A10937PrdCtw2 ;
   private String[] H02BA2_A10936PrdCtw1 ;
   private byte[] H02BA2_A6545Lb_PTinP ;
   private short[] H02BA2_A5562Lb_orden ;
   private String[] H02BA2_A488ForPrdDsc ;
   private boolean[] H02BA2_n488ForPrdDsc ;
   private byte[] H02BA2_A490ForPrdUMe ;
   private java.math.BigDecimal[] H02BA2_A5561LB_CantP ;
   private String[] H02BA2_A718PrdNom ;
   private short[] H02BA2_A5560Lb_LineaPr ;
   private String[] H02BA2_A719PrdNum ;
   private String[] H02BA2_A396EmprCod ;
   private String[] H02BA3_A5555Lb_opcion ;
   private int[] H02BA3_A5532Lb_numero ;
   private String[] H02BA3_A10938PrdCtw3 ;
   private String[] H02BA3_A10937PrdCtw2 ;
   private String[] H02BA3_A10936PrdCtw1 ;
   private byte[] H02BA3_A6545Lb_PTinP ;
   private short[] H02BA3_A5562Lb_orden ;
   private String[] H02BA3_A488ForPrdDsc ;
   private boolean[] H02BA3_n488ForPrdDsc ;
   private byte[] H02BA3_A490ForPrdUMe ;
   private java.math.BigDecimal[] H02BA3_A5561LB_CantP ;
   private String[] H02BA3_A718PrdNom ;
   private short[] H02BA3_A5560Lb_LineaPr ;
   private String[] H02BA3_A719PrdNum ;
   private String[] H02BA3_A396EmprCod ;
   private String[] H02BA4_A5555Lb_opcion ;
   private int[] H02BA4_A5532Lb_numero ;
   private byte[] H02BA4_A6545Lb_PTinP ;
   private short[] H02BA4_A5562Lb_orden ;
   private String[] H02BA4_A488ForPrdDsc ;
   private boolean[] H02BA4_n488ForPrdDsc ;
   private byte[] H02BA4_A490ForPrdUMe ;
   private java.math.BigDecimal[] H02BA4_A5561LB_CantP ;
   private String[] H02BA4_A718PrdNom ;
   private short[] H02BA4_A5560Lb_LineaPr ;
   private String[] H02BA4_A719PrdNum ;
   private String[] H02BA4_A396EmprCod ;
   private String[] H02BA5_A396EmprCod ;
   private byte[] H02BA5_A856ValCod ;
   private String[] H02BA5_A13747PrdCDsc ;
   private String[] H02BA5_A719PrdNum ;
   private String[] H02BA5_A718PrdNom ;
   private String[] H02BA6_A719PrdNum ;
   private String[] H02BA6_A396EmprCod ;
   private byte[] H02BA6_A4338PrdUMeFo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV31PrdNum_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV7Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV8DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV54TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV57WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class entradaensayoslaboratorioproductos__wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02BA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr ,
                                          short AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to ,
                                          String AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                          String AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                          java.math.BigDecimal AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                          byte AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume ,
                                          byte AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to ,
                                          String AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                          String AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                          short AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden ,
                                          short AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to ,
                                          byte AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp ,
                                          byte AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to ,
                                          short A5560Lb_LineaPr ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5561LB_CantP ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A5562Lb_orden ,
                                          byte A6545Lb_PTinP ,
                                          short AV27OrderedBy ,
                                          boolean AV28OrderedDsc ,
                                          String AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                          String AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String AV9EmprCod ,
                                          int AV22Lb_numero ,
                                          String AV23Lb_opcion ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[19];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T2.PrdCtw3, T2.PrdCtw2, T2.PrdCtw1, T1.Lb_PTinP, T1.Lb_orden, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantP, T2.PrdNom, T1.Lb_LineaPr," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod FROM ((TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ?)");
      if ( ! (0==AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr >= ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr <= ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP >= ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP <= ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) )
      {
         addWhere(sWhereString, "(T1.Lb_orden >= ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) )
      {
         addWhere(sWhereString, "(T1.Lb_orden <= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP >= ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP <= ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV27OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_LineaPr" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_LineaPr DESC" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LB_CantP" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LB_CantP DESC" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV27OrderedBy == 8 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_orden" ;
      }
      else if ( ( AV27OrderedBy == 8 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_orden DESC" ;
      }
      else if ( ( AV27OrderedBy == 9 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_PTinP" ;
      }
      else if ( ( AV27OrderedBy == 9 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_PTinP DESC" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H02BA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr ,
                                          short AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to ,
                                          String AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                          String AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                          java.math.BigDecimal AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                          byte AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume ,
                                          byte AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to ,
                                          String AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                          String AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                          short AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden ,
                                          short AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to ,
                                          byte AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp ,
                                          byte AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to ,
                                          short A5560Lb_LineaPr ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5561LB_CantP ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A5562Lb_orden ,
                                          byte A6545Lb_PTinP ,
                                          short AV27OrderedBy ,
                                          boolean AV28OrderedDsc ,
                                          String AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                          String AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String AV9EmprCod ,
                                          int AV22Lb_numero ,
                                          String AV23Lb_opcion ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[19];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T2.PrdCtw3, T2.PrdCtw2, T2.PrdCtw1, T1.Lb_PTinP, T1.Lb_orden, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantP, T2.PrdNom, T1.Lb_LineaPr," ;
      scmdbuf += " T1.PrdNum, T1.EmprCod FROM ((TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ?)");
      if ( ! (0==AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr >= ?)");
      }
      else
      {
         GXv_int24[3] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr <= ?)");
      }
      else
      {
         GXv_int24[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int24[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int24[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP >= ?)");
      }
      else
      {
         GXv_int24[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP <= ?)");
      }
      else
      {
         GXv_int24[10] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int24[11] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) )
      {
         addWhere(sWhereString, "(T1.Lb_orden >= ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) )
      {
         addWhere(sWhereString, "(T1.Lb_orden <= ?)");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP >= ?)");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP <= ?)");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV27OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_LineaPr" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_LineaPr DESC" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LB_CantP" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LB_CantP DESC" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV27OrderedBy == 8 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_orden" ;
      }
      else if ( ( AV27OrderedBy == 8 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_orden DESC" ;
      }
      else if ( ( AV27OrderedBy == 9 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_PTinP" ;
      }
      else if ( ( AV27OrderedBy == 9 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_PTinP DESC" ;
      }
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_H02BA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr ,
                                          short AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to ,
                                          String AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                          String AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                          java.math.BigDecimal AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                          byte AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume ,
                                          byte AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to ,
                                          String AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                          String AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                          short AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden ,
                                          short AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to ,
                                          byte AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp ,
                                          byte AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to ,
                                          short A5560Lb_LineaPr ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5561LB_CantP ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A5562Lb_orden ,
                                          byte A6545Lb_PTinP ,
                                          String AV82Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                          String AV81Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String AV9EmprCod ,
                                          int AV22Lb_numero ,
                                          String AV23Lb_opcion ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[19];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T1.Lb_PTinP, T1.Lb_orden, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantP, T2.PrdNom, T1.Lb_LineaPr, T1.PrdNum, T1.EmprCod FROM ((TXPENS004" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ?)");
      if ( ! (0==AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr >= ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr <= ?)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP >= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP <= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) )
      {
         addWhere(sWhereString, "(T1.Lb_orden >= ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) )
      {
         addWhere(sWhereString, "(T1.Lb_orden <= ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP >= ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP <= ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
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
                  return conditional_H02BA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] );
            case 1 :
                  return conditional_H02BA3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] );
            case 2 :
                  return conditional_H02BA4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02BA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BA5", "SELECT EmprCod, ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom FROM TXPPRODUC WHERE ValCod >= 1 and ValCod <= 2 and SUBSTR(PrdNum, 1, 1) <> '#' and SUBSTR(PrdNum, 1, 1) <> 'C' ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BA6", "SELECT PrdNum, EmprCod, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

