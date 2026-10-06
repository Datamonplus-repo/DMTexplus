package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaensayoslaboratoriocolorantes_wp_impl extends GXDataArea
{
   public entradaensayoslaboratoriocolorantes_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaensayoslaboratoriocolorantes_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayoslaboratoriocolorantes_wp_impl.class ));
   }

   public entradaensayoslaboratoriocolorantes_wp_impl( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactiongroup1 = new HTMLChoice();
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
            AV47EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV48Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Lb_numero), 8, 0));
               AV49Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49Lb_opcion", AV49Lb_opcion);
               AV50Lb_Rb = CommonUtil.decimalVal( httpContext.GetPar( "Lb_Rb"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50Lb_Rb", GXutil.ltrimstr( AV50Lb_Rb, 7, 2));
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
      nRC_GXsfl_92 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_92"))) ;
      nGXsfl_92_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_92_idx"))) ;
      sGXsfl_92_idx = httpContext.GetPar( "sGXsfl_92_idx") ;
      edtPrdGots_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), !bGXsfl_92_Refreshing);
      edtPrdCtwSt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), !bGXsfl_92_Refreshing);
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
      AV47EmprCod = httpContext.GetPar( "EmprCod") ;
      AV48Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
      AV49Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
      AV16TFLb_LineaC = (short)(GXutil.lval( httpContext.GetPar( "TFLb_LineaC"))) ;
      AV17TFLb_LineaC_To = (short)(GXutil.lval( httpContext.GetPar( "TFLb_LineaC_To"))) ;
      AV18TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV19TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV61TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV62TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV24TFLB_CantC = CommonUtil.decimalVal( httpContext.GetPar( "TFLB_CantC"), ".") ;
      AV25TFLB_CantC_To = CommonUtil.decimalVal( httpContext.GetPar( "TFLB_CantC_To"), ".") ;
      AV20TFForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "TFForPrdUMe"))) ;
      AV21TFForPrdUMe_To = (byte)(GXutil.lval( httpContext.GetPar( "TFForPrdUMe_To"))) ;
      AV22TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV23TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV69TFPrdFibra = httpContext.GetPar( "TFPrdFibra") ;
      AV70TFPrdFibra_Sel = httpContext.GetPar( "TFPrdFibra_Sel") ;
      AV28TFLb_fibra = httpContext.GetPar( "TFLb_fibra") ;
      AV29TFLb_fibra_Sel = httpContext.GetPar( "TFLb_fibra_Sel") ;
      AV30TFPrdGots = httpContext.GetPar( "TFPrdGots") ;
      AV31TFPrdGots_Sel = httpContext.GetPar( "TFPrdGots_Sel") ;
      AV32TFPrdCtwSt = httpContext.GetPar( "TFPrdCtwSt") ;
      AV33TFPrdCtwSt_Sel = httpContext.GetPar( "TFPrdCtwSt_Sel") ;
      AV74Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV65TotLB_CantC = CommonUtil.decimalVal( httpContext.GetPar( "TotLB_CantC"), ".") ;
      edtPrdGots_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), !bGXsfl_92_Refreshing);
      edtPrdCtwSt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), !bGXsfl_92_Refreshing);
      AV56Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, AV16TFLb_LineaC, AV17TFLb_LineaC_To, AV18TFPrdNum, AV19TFPrdNum_Sel, AV61TFPrdNom, AV62TFPrdNom_Sel, AV24TFLB_CantC, AV25TFLB_CantC_To, AV20TFForPrdUMe, AV21TFForPrdUMe_To, AV22TFForPrdDsc, AV23TFForPrdDsc_Sel, AV69TFPrdFibra, AV70TFPrdFibra_Sel, AV28TFLb_fibra, AV29TFLb_fibra_Sel, AV30TFPrdGots, AV31TFPrdGots_Sel, AV32TFPrdCtwSt, AV33TFPrdCtwSt_Sel, AV74Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65TotLB_CantC, AV56Moda21) ;
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
      pa28H2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start28H2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.entradaensayoslaboratoriocolorantes_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV49Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV50Lb_Rb))}, new String[] {"EmprCod","Lb_numero","Lb_opcion","Lb_Rb"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTLB_CANTC", getSecureSignedToken( "", localUtil.format( AV65TotLB_CantC, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayosLaboratorioColorantes_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV74Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayoslaboratoriocolorantes_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_92", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_92, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV45PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV45PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV36GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV37GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_LINEAC", GXutil.ltrim( localUtil.ntoc( AV16TFLb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_LINEAC_TO", GXutil.ltrim( localUtil.ntoc( AV17TFLb_LineaC_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV18TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV19TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV61TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV62TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_CANTC", GXutil.ltrim( localUtil.ntoc( AV24TFLB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_CANTC_TO", GXutil.ltrim( localUtil.ntoc( AV25TFLB_CantC_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDUME", GXutil.ltrim( localUtil.ntoc( AV20TFForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDUME_TO", GXutil.ltrim( localUtil.ntoc( AV21TFForPrdUMe_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC", GXutil.rtrim( AV22TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC_SEL", GXutil.rtrim( AV23TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFIBRA", GXutil.rtrim( AV69TFPrdFibra));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFIBRA_SEL", GXutil.rtrim( AV70TFPrdFibra_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_FIBRA", GXutil.rtrim( AV28TFLb_fibra));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLB_FIBRA_SEL", GXutil.rtrim( AV29TFLb_fibra_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGOTS", GXutil.rtrim( AV30TFPrdGots));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDGOTS_SEL", GXutil.rtrim( AV31TFPrdGots_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCTWST", AV32TFPrdCtwSt);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCTWST_SEL", AV33TFPrdCtwSt_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV47EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_NUMERO", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_OPCION", GXutil.rtrim( A5555Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTLB_CANTC", GXutil.ltrim( localUtil.ntoc( AV65TotLB_CantC, (byte)(18), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTLB_CANTC", getSecureSignedToken( "", localUtil.format( AV65TotLB_CantC, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV56Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_LINEAC_SELECTED", GXutil.ltrim( localUtil.ntoc( AV64Lb_LineaC_Selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_RB", GXutil.ltrim( localUtil.ntoc( AV50Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV51Station));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_get", GXutil.rtrim( Combo_prdnum_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDGOTS_Visible", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTWST_Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
         we28H2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt28H2( ) ;
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
      return formatLink("app.gestionlaboratorio.entradaensayoslaboratoriocolorantes_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV49Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV50Lb_Rb))}, new String[] {"EmprCod","Lb_numero","Lb_opcion","Lb_Rb"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.EntradaEnsayosLaboratorioColorantes_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Colorantes (Ensayos)", "") ;
   }

   public void wb28H0( )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_numero_Internalname, GXutil.ltrim( localUtil.ntoc( AV48Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48Lb_numero), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV48Lb_numero), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_numero_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_numero_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_opcion_Internalname, GXutil.rtrim( AV49Lb_opcion), GXutil.rtrim( localUtil.format( AV49Lb_opcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_opcion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_opcion_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_lineac_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_lineac_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_lineac_Internalname, GXutil.ltrim( localUtil.ntoc( AV38Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_lineac_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV38Lb_LineaC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV38Lb_LineaC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_lineac_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_lineac_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_prdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockcombo_prdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
         ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
         ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
         ucCombo_prdnum.setProperty("DropDownOptionsData", AV45PrdNum_Data);
         ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_cantc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_cantc_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_cantc_Internalname, GXutil.ltrim( localUtil.ntoc( AV40LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_cantc_Enabled!=0) ? localUtil.format( AV40LB_CantC, "ZZZZ9.99999") : localUtil.format( AV40LB_CantC, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_cantc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_cantc_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedforprdume_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockforprdume_Internalname, httpContext.getMessage( "Und", ""), "", "", lblTextblockforprdume_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_52_28H2( true) ;
      }
      else
      {
         wb_table1_52_28H2( false) ;
      }
      return  ;
   }

   public void wb_table1_52_28H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprddsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprddsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprddsc_Internalname, GXutil.rtrim( AV42ForPrdDsc), GXutil.rtrim( localUtil.format( AV42ForPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprddsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprddsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_fibra_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_fibra_Internalname, httpContext.getMessage( "Comp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_fibra_Internalname, GXutil.rtrim( AV43Lb_fibra), GXutil.rtrim( localUtil.format( AV43Lb_fibra, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_fibra_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_fibra_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_ptinc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_ptinc_Internalname, httpContext.getMessage( "Nº Fibra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_ptinc_Internalname, GXutil.ltrim( localUtil.ntoc( AV44Lb_PTinC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_ptinc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV44Lb_PTinC), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV44Lb_PTinC), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_ptinc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_ptinc_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 92, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiarvariables_Internalname, "gx.evt.setGridEvt("+GXutil.str( 92, 2, 0)+","+"null"+");", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiarvariables_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIARVARIABLES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnproductosvariables_Internalname, "gx.evt.setGridEvt("+GXutil.str( 92, 2, 0)+","+"null"+");", httpContext.getMessage( "Productos (#)", ""), bttBtnproductosvariables_Jsonclick, 5, httpContext.getMessage( "Productos (#)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPRODUCTOSVARIABLES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 92, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol92( ) ;
      }
      if ( wbEnd == 92 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_92 = (int)(nGXsfl_92_idx-1) ;
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
         wb_table2_110_28H2( true) ;
      }
      else
      {
         wb_table2_110_28H2( false) ;
      }
      return  ;
   }

   public void wb_table2_110_28H2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV36GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV37GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV74Pgmname), GXutil.rtrim( localUtil.format( AV74Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, GXutil.rtrim( AV39PrdNum), GXutil.rtrim( localUtil.format( AV39PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrdnum_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV34DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table3_144_28H2( true) ;
      }
      else
      {
         wb_table3_144_28H2( false) ;
      }
      return  ;
   }

   public void wb_table3_144_28H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_149_28H2( true) ;
      }
      else
      {
         wb_table4_149_28H2( false) ;
      }
      return  ;
   }

   public void wb_table4_149_28H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_154_28H2( true) ;
      }
      else
      {
         wb_table5_154_28H2( false) ;
      }
      return  ;
   }

   public void wb_table5_154_28H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 92 )
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

   public void start28H2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Colorantes (Ensayos)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup28H0( ) ;
   }

   public void ws28H2( )
   {
      start28H2( ) ;
      evt28H2( ) ;
   }

   public void evt28H2( )
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
                           e1128H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1228H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1328H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1428H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1528H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1628H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CERRAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1728H2 ();
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
                                 e1828H2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIARVARIABLES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiarVariables' */
                           e1928H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPRODUCTOSVARIABLES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoProductosVariables' */
                           e2028H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e2128H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VLB_LINEAC.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2228H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORPRDUME.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2328H2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "LB_LINEAC.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "LB_LINEAC.CLICK") == 0 ) )
                        {
                           nGXsfl_92_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_922( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV60GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridActionGroup1), 4, 0));
                           A5557Lb_LineaC = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_LineaC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A5558LB_CantC = localUtil.ctond( httpContext.cgiGet( edtLB_CantC_Internalname)) ;
                           A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A14094PrdFibra = httpContext.cgiGet( edtPrdFibra_Internalname) ;
                           n14094PrdFibra = false ;
                           A14096Lb_fibra = httpContext.cgiGet( edtLb_fibra_Internalname) ;
                           A10936PrdCtw1 = httpContext.cgiGet( edtPrdCtw1_Internalname) ;
                           A10937PrdCtw2 = httpContext.cgiGet( edtPrdCtw2_Internalname) ;
                           A10938PrdCtw3 = httpContext.cgiGet( edtPrdCtw3_Internalname) ;
                           A11663PrdCtw4 = httpContext.cgiGet( edtPrdCtw4_Internalname) ;
                           A11363PrdGots = httpContext.cgiGet( edtPrdGots_Internalname) ;
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
                                 e2428H2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2528H2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2628H2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LB_LINEAC.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2728H2 ();
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

   public void we28H2( )
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

   public void pa28H2( )
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
            GX_FocusControl = edtavLb_lineac_Internalname ;
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
      subsflControlProps_922( ) ;
      while ( nGXsfl_92_idx <= nRC_GXsfl_92 )
      {
         sendrow_922( ) ;
         nGXsfl_92_idx = ((subGrid_Islastpage==1)&&(nGXsfl_92_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_92_idx+1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_922( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV47EmprCod ,
                                 int AV48Lb_numero ,
                                 String AV49Lb_opcion ,
                                 short AV16TFLb_LineaC ,
                                 short AV17TFLb_LineaC_To ,
                                 String AV18TFPrdNum ,
                                 String AV19TFPrdNum_Sel ,
                                 String AV61TFPrdNom ,
                                 String AV62TFPrdNom_Sel ,
                                 java.math.BigDecimal AV24TFLB_CantC ,
                                 java.math.BigDecimal AV25TFLB_CantC_To ,
                                 byte AV20TFForPrdUMe ,
                                 byte AV21TFForPrdUMe_To ,
                                 String AV22TFForPrdDsc ,
                                 String AV23TFForPrdDsc_Sel ,
                                 String AV69TFPrdFibra ,
                                 String AV70TFPrdFibra_Sel ,
                                 String AV28TFLb_fibra ,
                                 String AV29TFLb_fibra_Sel ,
                                 String AV30TFPrdGots ,
                                 String AV31TFPrdGots_Sel ,
                                 String AV32TFPrdCtwSt ,
                                 String AV33TFPrdCtwSt_Sel ,
                                 String AV74Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV65TotLB_CantC ,
                                 short AV56Moda21 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2528H2 ();
      GRID_nCurrentRecord = 0 ;
      rf28H2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayosLaboratorioColorantes_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV74Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayoslaboratoriocolorantes_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf28H2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV74Pgmname = "GestionLaboratorio.EntradaEnsayosLaboratorioColorantes_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
      Gx_err = (short)(0) ;
      edtavLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_numero_Enabled), 5, 0), true);
      edtavLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_opcion_Enabled), 5, 0), true);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavTotvaluelb_cantc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluelb_cantc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluelb_cantc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV16TFLb_LineaC ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV17TFLb_LineaC_To ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV18TFPrdNum ;
      AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV19TFPrdNum_Sel ;
      AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV61TFPrdNom ;
      AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV62TFPrdNom_Sel ;
      AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV24TFLB_CantC ;
      AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV25TFLB_CantC_To ;
      AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV20TFForPrdUMe ;
      AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV21TFForPrdUMe_To ;
      AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV22TFForPrdDsc ;
      AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV69TFPrdFibra ;
      AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV70TFPrdFibra_Sel ;
      AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV28TFLb_fibra ;
      AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV29TFLb_fibra_Sel ;
      AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV30TFPrdGots ;
      AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV32TFPrdCtwSt ;
      AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV33TFPrdCtwSt_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) ,
                                           Short.valueOf(AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) ,
                                           AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                           AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                           AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                           AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                           AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                           AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                           Byte.valueOf(AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) ,
                                           AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                           AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                           AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                           AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                           AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                           AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                           AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                           AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                           Short.valueOf(A5557Lb_LineaC) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5558LB_CantC ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A14094PrdFibra ,
                                           A14096Lb_fibra ,
                                           A11363PrdGots ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                           AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           AV47EmprCod ,
                                           Integer.valueOf(AV48Lb_numero) ,
                                           AV49Lb_opcion ,
                                           A396EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum), 6, "%") ;
      lV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom), 26, "%") ;
      lV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc), 5, "%") ;
      lV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = GXutil.padr( GXutil.rtrim( AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra), 4, "%") ;
      lV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = GXutil.padr( GXutil.rtrim( AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra), 4, "%") ;
      lV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = GXutil.padr( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots), 1, "%") ;
      /* Using cursor H028H2 */
      pr_default.execute(0, new Object[] {AV47EmprCod, Integer.valueOf(AV48Lb_numero), AV49Lb_opcion, Short.valueOf(AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac), Short.valueOf(AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to), lV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum, AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel, lV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom, AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel, AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc, AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to, Byte.valueOf(AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume), Byte.valueOf(AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to), lV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc, AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel, lV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra, AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel, lV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra, AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel, lV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots, AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = H028H2_A5555Lb_opcion[0] ;
         A5532Lb_numero = H028H2_A5532Lb_numero[0] ;
         A11363PrdGots = H028H2_A11363PrdGots[0] ;
         A11663PrdCtw4 = H028H2_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = H028H2_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = H028H2_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = H028H2_A10936PrdCtw1[0] ;
         A14096Lb_fibra = H028H2_A14096Lb_fibra[0] ;
         A14094PrdFibra = H028H2_A14094PrdFibra[0] ;
         n14094PrdFibra = H028H2_n14094PrdFibra[0] ;
         A488ForPrdDsc = H028H2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H028H2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = H028H2_A490ForPrdUMe[0] ;
         A5558LB_CantC = H028H2_A5558LB_CantC[0] ;
         A718PrdNom = H028H2_A718PrdNom[0] ;
         A5557Lb_LineaC = H028H2_A5557Lb_LineaC[0] ;
         A719PrdNum = H028H2_A719PrdNum[0] ;
         A396EmprCod = H028H2_A396EmprCod[0] ;
         A11363PrdGots = H028H2_A11363PrdGots[0] ;
         A11663PrdCtw4 = H028H2_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = H028H2_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = H028H2_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = H028H2_A10936PrdCtw1[0] ;
         A14094PrdFibra = H028H2_A14094PrdFibra[0] ;
         n14094PrdFibra = H028H2_n14094PrdFibra[0] ;
         A718PrdNom = H028H2_A718PrdNom[0] ;
         A488ForPrdDsc = H028H2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H028H2_n488ForPrdDsc[0] ;
         GXt_char1 = A14097PrdCtwSt ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char4[0] = GXt_char1 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         entradaensayoslaboratoriocolorantes_wp_impl.this.A396EmprCod = GXv_char2[0] ;
         entradaensayoslaboratoriocolorantes_wp_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14097PrdCtwSt = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel) == 0 ) ) )
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

   public void rf28H2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(92) ;
      /* Execute user event: Refresh */
      e2528H2 ();
      nGXsfl_92_idx = 1 ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_922( ) ;
      bGXsfl_92_Refreshing = true ;
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
         subsflControlProps_922( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Short.valueOf(AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) ,
                                              Short.valueOf(AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) ,
                                              AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                              AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                              AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                              AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                              AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                              AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                              Byte.valueOf(AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) ,
                                              Byte.valueOf(AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) ,
                                              AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                              AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                              AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                              AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                              AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                              AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                              AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                              AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                              Short.valueOf(A5557Lb_LineaC) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A5558LB_CantC ,
                                              Byte.valueOf(A490ForPrdUMe) ,
                                              A488ForPrdDsc ,
                                              A14094PrdFibra ,
                                              A14096Lb_fibra ,
                                              A11363PrdGots ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                              AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                              A14097PrdCtwSt ,
                                              AV47EmprCod ,
                                              Integer.valueOf(AV48Lb_numero) ,
                                              AV49Lb_opcion ,
                                              A396EmprCod ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              A5555Lb_opcion } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum), 6, "%") ;
         lV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom), 26, "%") ;
         lV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc), 5, "%") ;
         lV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = GXutil.padr( GXutil.rtrim( AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra), 4, "%") ;
         lV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = GXutil.padr( GXutil.rtrim( AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra), 4, "%") ;
         lV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = GXutil.padr( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots), 1, "%") ;
         /* Using cursor H028H3 */
         pr_default.execute(1, new Object[] {AV47EmprCod, Integer.valueOf(AV48Lb_numero), AV49Lb_opcion, Short.valueOf(AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac), Short.valueOf(AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to), lV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum, AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel, lV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom, AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel, AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc, AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to, Byte.valueOf(AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume), Byte.valueOf(AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to), lV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc, AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel, lV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra, AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel, lV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra, AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel, lV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots, AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel});
         nGXsfl_92_idx = 1 ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_922( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5555Lb_opcion = H028H3_A5555Lb_opcion[0] ;
            A5532Lb_numero = H028H3_A5532Lb_numero[0] ;
            A11363PrdGots = H028H3_A11363PrdGots[0] ;
            A11663PrdCtw4 = H028H3_A11663PrdCtw4[0] ;
            A10938PrdCtw3 = H028H3_A10938PrdCtw3[0] ;
            A10937PrdCtw2 = H028H3_A10937PrdCtw2[0] ;
            A10936PrdCtw1 = H028H3_A10936PrdCtw1[0] ;
            A14096Lb_fibra = H028H3_A14096Lb_fibra[0] ;
            A14094PrdFibra = H028H3_A14094PrdFibra[0] ;
            n14094PrdFibra = H028H3_n14094PrdFibra[0] ;
            A488ForPrdDsc = H028H3_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H028H3_n488ForPrdDsc[0] ;
            A490ForPrdUMe = H028H3_A490ForPrdUMe[0] ;
            A5558LB_CantC = H028H3_A5558LB_CantC[0] ;
            A718PrdNom = H028H3_A718PrdNom[0] ;
            A5557Lb_LineaC = H028H3_A5557Lb_LineaC[0] ;
            A719PrdNum = H028H3_A719PrdNum[0] ;
            A396EmprCod = H028H3_A396EmprCod[0] ;
            A11363PrdGots = H028H3_A11363PrdGots[0] ;
            A11663PrdCtw4 = H028H3_A11663PrdCtw4[0] ;
            A10938PrdCtw3 = H028H3_A10938PrdCtw3[0] ;
            A10937PrdCtw2 = H028H3_A10937PrdCtw2[0] ;
            A10936PrdCtw1 = H028H3_A10936PrdCtw1[0] ;
            A14094PrdFibra = H028H3_A14094PrdFibra[0] ;
            n14094PrdFibra = H028H3_n14094PrdFibra[0] ;
            A718PrdNom = H028H3_A718PrdNom[0] ;
            A488ForPrdDsc = H028H3_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H028H3_n488ForPrdDsc[0] ;
            GXt_char1 = A14097PrdCtwSt ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            entradaensayoslaboratoriocolorantes_wp_impl.this.A396EmprCod = GXv_char4[0] ;
            entradaensayoslaboratoriocolorantes_wp_impl.this.A719PrdNum = GXv_char3[0] ;
            entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A14097PrdCtwSt = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel) == 0 ) ) )
               {
                  e2628H2 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(92) ;
         wb28H0( ) ;
      }
      bGXsfl_92_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes28H2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTLB_CANTC", GXutil.ltrim( localUtil.ntoc( AV65TotLB_CantC, (byte)(18), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTLB_CANTC", getSecureSignedToken( "", localUtil.format( AV65TotLB_CantC, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV56Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56Moda21), "ZZZ9")));
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
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV16TFLb_LineaC ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV17TFLb_LineaC_To ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV18TFPrdNum ;
      AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV19TFPrdNum_Sel ;
      AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV61TFPrdNom ;
      AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV62TFPrdNom_Sel ;
      AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV24TFLB_CantC ;
      AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV25TFLB_CantC_To ;
      AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV20TFForPrdUMe ;
      AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV21TFForPrdUMe_To ;
      AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV22TFForPrdDsc ;
      AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV69TFPrdFibra ;
      AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV70TFPrdFibra_Sel ;
      AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV28TFLb_fibra ;
      AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV29TFLb_fibra_Sel ;
      AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV30TFPrdGots ;
      AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV32TFPrdCtwSt ;
      AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV33TFPrdCtwSt_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, AV16TFLb_LineaC, AV17TFLb_LineaC_To, AV18TFPrdNum, AV19TFPrdNum_Sel, AV61TFPrdNom, AV62TFPrdNom_Sel, AV24TFLB_CantC, AV25TFLB_CantC_To, AV20TFForPrdUMe, AV21TFForPrdUMe_To, AV22TFForPrdDsc, AV23TFForPrdDsc_Sel, AV69TFPrdFibra, AV70TFPrdFibra_Sel, AV28TFLb_fibra, AV29TFLb_fibra_Sel, AV30TFPrdGots, AV31TFPrdGots_Sel, AV32TFPrdCtwSt, AV33TFPrdCtwSt_Sel, AV74Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65TotLB_CantC, AV56Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV16TFLb_LineaC ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV17TFLb_LineaC_To ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV18TFPrdNum ;
      AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV19TFPrdNum_Sel ;
      AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV61TFPrdNom ;
      AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV62TFPrdNom_Sel ;
      AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV24TFLB_CantC ;
      AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV25TFLB_CantC_To ;
      AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV20TFForPrdUMe ;
      AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV21TFForPrdUMe_To ;
      AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV22TFForPrdDsc ;
      AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV69TFPrdFibra ;
      AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV70TFPrdFibra_Sel ;
      AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV28TFLb_fibra ;
      AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV29TFLb_fibra_Sel ;
      AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV30TFPrdGots ;
      AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV32TFPrdCtwSt ;
      AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV33TFPrdCtwSt_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, AV16TFLb_LineaC, AV17TFLb_LineaC_To, AV18TFPrdNum, AV19TFPrdNum_Sel, AV61TFPrdNom, AV62TFPrdNom_Sel, AV24TFLB_CantC, AV25TFLB_CantC_To, AV20TFForPrdUMe, AV21TFForPrdUMe_To, AV22TFForPrdDsc, AV23TFForPrdDsc_Sel, AV69TFPrdFibra, AV70TFPrdFibra_Sel, AV28TFLb_fibra, AV29TFLb_fibra_Sel, AV30TFPrdGots, AV31TFPrdGots_Sel, AV32TFPrdCtwSt, AV33TFPrdCtwSt_Sel, AV74Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65TotLB_CantC, AV56Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV16TFLb_LineaC ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV17TFLb_LineaC_To ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV18TFPrdNum ;
      AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV19TFPrdNum_Sel ;
      AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV61TFPrdNom ;
      AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV62TFPrdNom_Sel ;
      AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV24TFLB_CantC ;
      AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV25TFLB_CantC_To ;
      AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV20TFForPrdUMe ;
      AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV21TFForPrdUMe_To ;
      AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV22TFForPrdDsc ;
      AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV69TFPrdFibra ;
      AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV70TFPrdFibra_Sel ;
      AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV28TFLb_fibra ;
      AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV29TFLb_fibra_Sel ;
      AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV30TFPrdGots ;
      AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV32TFPrdCtwSt ;
      AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV33TFPrdCtwSt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, AV16TFLb_LineaC, AV17TFLb_LineaC_To, AV18TFPrdNum, AV19TFPrdNum_Sel, AV61TFPrdNom, AV62TFPrdNom_Sel, AV24TFLB_CantC, AV25TFLB_CantC_To, AV20TFForPrdUMe, AV21TFForPrdUMe_To, AV22TFForPrdDsc, AV23TFForPrdDsc_Sel, AV69TFPrdFibra, AV70TFPrdFibra_Sel, AV28TFLb_fibra, AV29TFLb_fibra_Sel, AV30TFPrdGots, AV31TFPrdGots_Sel, AV32TFPrdCtwSt, AV33TFPrdCtwSt_Sel, AV74Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65TotLB_CantC, AV56Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV16TFLb_LineaC ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV17TFLb_LineaC_To ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV18TFPrdNum ;
      AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV19TFPrdNum_Sel ;
      AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV61TFPrdNom ;
      AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV62TFPrdNom_Sel ;
      AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV24TFLB_CantC ;
      AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV25TFLB_CantC_To ;
      AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV20TFForPrdUMe ;
      AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV21TFForPrdUMe_To ;
      AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV22TFForPrdDsc ;
      AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV69TFPrdFibra ;
      AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV70TFPrdFibra_Sel ;
      AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV28TFLb_fibra ;
      AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV29TFLb_fibra_Sel ;
      AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV30TFPrdGots ;
      AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV32TFPrdCtwSt ;
      AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV33TFPrdCtwSt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, AV16TFLb_LineaC, AV17TFLb_LineaC_To, AV18TFPrdNum, AV19TFPrdNum_Sel, AV61TFPrdNom, AV62TFPrdNom_Sel, AV24TFLB_CantC, AV25TFLB_CantC_To, AV20TFForPrdUMe, AV21TFForPrdUMe_To, AV22TFForPrdDsc, AV23TFForPrdDsc_Sel, AV69TFPrdFibra, AV70TFPrdFibra_Sel, AV28TFLb_fibra, AV29TFLb_fibra_Sel, AV30TFPrdGots, AV31TFPrdGots_Sel, AV32TFPrdCtwSt, AV33TFPrdCtwSt_Sel, AV74Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65TotLB_CantC, AV56Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV16TFLb_LineaC ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV17TFLb_LineaC_To ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV18TFPrdNum ;
      AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV19TFPrdNum_Sel ;
      AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV61TFPrdNom ;
      AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV62TFPrdNom_Sel ;
      AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV24TFLB_CantC ;
      AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV25TFLB_CantC_To ;
      AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV20TFForPrdUMe ;
      AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV21TFForPrdUMe_To ;
      AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV22TFForPrdDsc ;
      AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV69TFPrdFibra ;
      AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV70TFPrdFibra_Sel ;
      AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV28TFLb_fibra ;
      AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV29TFLb_fibra_Sel ;
      AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV30TFPrdGots ;
      AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV32TFPrdCtwSt ;
      AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV33TFPrdCtwSt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, AV16TFLb_LineaC, AV17TFLb_LineaC_To, AV18TFPrdNum, AV19TFPrdNum_Sel, AV61TFPrdNom, AV62TFPrdNom_Sel, AV24TFLB_CantC, AV25TFLB_CantC_To, AV20TFForPrdUMe, AV21TFForPrdUMe_To, AV22TFForPrdDsc, AV23TFForPrdDsc_Sel, AV69TFPrdFibra, AV70TFPrdFibra_Sel, AV28TFLb_fibra, AV29TFLb_fibra_Sel, AV30TFPrdGots, AV31TFPrdGots_Sel, AV32TFPrdCtwSt, AV33TFPrdCtwSt_Sel, AV74Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65TotLB_CantC, AV56Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV74Pgmname = "GestionLaboratorio.EntradaEnsayosLaboratorioColorantes_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
      Gx_err = (short)(0) ;
      edtavLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_numero_Enabled), 5, 0), true);
      edtavLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_opcion_Enabled), 5, 0), true);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavTotvaluelb_cantc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluelb_cantc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluelb_cantc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
      fix_multi_value_controls( ) ;
   }

   public void strup28H0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2428H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV45PrdNum_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV34DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_92 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_92"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV36GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV37GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV64Lb_LineaC_Selected = (short)(localUtil.ctol( httpContext.cgiGet( "vLB_LINEAC_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
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
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         Dvelop_confirmpanel_cerrar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Result") ;
         Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_lineac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_lineac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_LINEAC");
            GX_FocusControl = edtavLb_lineac_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38Lb_LineaC = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Lb_LineaC), 4, 0));
         }
         else
         {
            AV38Lb_LineaC = (short)(localUtil.ctol( httpContext.cgiGet( edtavLb_lineac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Lb_LineaC), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavLb_cantc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavLb_cantc_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_CANTC");
            GX_FocusControl = edtavLb_cantc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40LB_CantC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40LB_CantC", GXutil.ltrimstr( AV40LB_CantC, 11, 5));
         }
         else
         {
            AV40LB_CantC = localUtil.ctond( httpContext.cgiGet( edtavLb_cantc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40LB_CantC", GXutil.ltrimstr( AV40LB_CantC, 11, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORPRDUME");
            GX_FocusControl = edtavForprdume_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41ForPrdUMe = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
         }
         else
         {
            AV41ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
         }
         AV42ForPrdDsc = httpContext.cgiGet( edtavForprddsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42ForPrdDsc", AV42ForPrdDsc);
         AV43Lb_fibra = httpContext.cgiGet( edtavLb_fibra_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43Lb_fibra", AV43Lb_fibra);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_ptinc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLb_ptinc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_PTINC");
            GX_FocusControl = edtavLb_ptinc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44Lb_PTinC = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_PTinC), 2, 0));
         }
         else
         {
            AV44Lb_PTinC = (byte)(localUtil.ctol( httpContext.cgiGet( edtavLb_ptinc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_PTinC), 2, 0));
         }
         AV66TotValueLB_CantC = httpContext.cgiGet( edtavTotvaluelb_cantc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66TotValueLB_CantC", AV66TotValueLB_CantC);
         AV74Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
         AV39PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39PrdNum", AV39PrdNum);
         /* Read subfile selected row values. */
         nGXsfl_92_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_922( ) ;
         if ( nGXsfl_92_idx > 0 )
         {
            cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
            cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
            AV60GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridActionGroup1), 4, 0));
            A5557Lb_LineaC = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_LineaC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A5558LB_CantC = localUtil.ctond( httpContext.cgiGet( edtLB_CantC_Internalname)) ;
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
            n488ForPrdDsc = false ;
            A14094PrdFibra = httpContext.cgiGet( edtPrdFibra_Internalname) ;
            n14094PrdFibra = false ;
            A14096Lb_fibra = httpContext.cgiGet( edtLb_fibra_Internalname) ;
            A10936PrdCtw1 = httpContext.cgiGet( edtPrdCtw1_Internalname) ;
            A10937PrdCtw2 = httpContext.cgiGet( edtPrdCtw2_Internalname) ;
            A10938PrdCtw3 = httpContext.cgiGet( edtPrdCtw3_Internalname) ;
            A11663PrdCtw4 = httpContext.cgiGet( edtPrdCtw4_Internalname) ;
            A11363PrdGots = httpContext.cgiGet( edtPrdGots_Internalname) ;
            A14097PrdCtwSt = httpContext.cgiGet( edtPrdCtwSt_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayosLaboratorioColorantes_WP");
         AV74Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV74Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\entradaensayoslaboratoriocolorantes_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2428H2 ();
      if (returnInSub) return;
   }

   public void e2428H2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV51Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV51Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Station", AV51Station);
      GXv_char4[0] = AV47EmprCod ;
      GXv_char3[0] = AV52EmprNom ;
      GXv_char2[0] = AV53UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV51Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV47EmprCod = GXv_char4[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV52EmprNom = GXv_char3[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV53UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
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
      Form.setCaption( httpContext.getMessage( "Colorantes (Ensayos)", "") );
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
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV34DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV34DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = AV38Lb_LineaC ;
      GXv_int8[0] = GXt_int7 ;
      new app.formulaciontinte.getcolorantesensayos(remoteHandle, context).execute( AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, GXv_int8) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV38Lb_LineaC = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Lb_LineaC), 4, 0));
      GXt_int9 = (byte)(AV56Moda21) ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV47EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int10) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_int9 = GXv_int10[0] ;
      AV56Moda21 = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56Moda21), "ZZZ9")));
      GXt_int9 = (byte)(AV57fibracolorante) ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV47EmprCod, httpContext.getMessage( "FIBCOL", ""), GXv_int10) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_int9 = GXv_int10[0] ;
      AV57fibracolorante = GXt_int9 ;
      edtavForprdume_Enabled = ((AV56Moda21==1) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprdume_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprdume_Enabled), 5, 0), true);
   }

   public void e2528H2( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV36GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GridCurrentPage), 10, 0));
      AV37GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      cmbavGridactiongroup1.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Columnheaderclass", cmbavGridactiongroup1.getColumnHeaderClass(), !bGXsfl_92_Refreshing);
      edtLb_LineaC_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaC_Internalname, "Columnheaderclass", edtLb_LineaC_Columnheaderclass, !bGXsfl_92_Refreshing);
      edtPrdNum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Columnheaderclass", edtPrdNum_Columnheaderclass, !bGXsfl_92_Refreshing);
      edtPrdNom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Columnheaderclass", edtPrdNom_Columnheaderclass, !bGXsfl_92_Refreshing);
      edtLB_CantC_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLB_CantC_Internalname, "Columnheaderclass", edtLB_CantC_Columnheaderclass, !bGXsfl_92_Refreshing);
      edtForPrdUMe_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Columnheaderclass", edtForPrdUMe_Columnheaderclass, !bGXsfl_92_Refreshing);
      edtForPrdDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Columnheaderclass", edtForPrdDsc_Columnheaderclass, !bGXsfl_92_Refreshing);
      edtPrdFibra_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFibra_Internalname, "Columnheaderclass", edtPrdFibra_Columnheaderclass, !bGXsfl_92_Refreshing);
      edtLb_fibra_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fibra_Internalname, "Columnheaderclass", edtLb_fibra_Columnheaderclass, !bGXsfl_92_Refreshing);
      edtPrdGots_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Columnheaderclass", edtPrdGots_Columnheaderclass, !bGXsfl_92_Refreshing);
      edtPrdCtwSt_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Columnheaderclass", edtPrdCtwSt_Columnheaderclass, !bGXsfl_92_Refreshing);
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV16TFLb_LineaC ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV17TFLb_LineaC_To ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV18TFPrdNum ;
      AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV19TFPrdNum_Sel ;
      AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV61TFPrdNom ;
      AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV62TFPrdNom_Sel ;
      AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV24TFLB_CantC ;
      AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV25TFLB_CantC_To ;
      AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV20TFForPrdUMe ;
      AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV21TFForPrdUMe_To ;
      AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV22TFForPrdDsc ;
      AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV69TFPrdFibra ;
      AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV70TFPrdFibra_Sel ;
      AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV28TFLb_fibra ;
      AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV29TFLb_fibra_Sel ;
      AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV30TFPrdGots ;
      AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV32TFPrdCtwSt ;
      AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV33TFPrdCtwSt_Sel ;
      /*  Sending Event outputs  */
   }

   public void e1228H2( )
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
         AV35PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV35PageToGo) ;
      }
   }

   public void e1328H2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1428H2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_LineaC") == 0 )
         {
            AV16TFLb_LineaC = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFLb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFLb_LineaC), 4, 0));
            AV17TFLb_LineaC_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFLb_LineaC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFLb_LineaC_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV18TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFPrdNum", AV18TFPrdNum);
            AV19TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFPrdNum_Sel", AV19TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV61TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrdNom", AV61TFPrdNom);
            AV62TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrdNom_Sel", AV62TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LB_CantC") == 0 )
         {
            AV24TFLB_CantC = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFLB_CantC", GXutil.ltrimstr( AV24TFLB_CantC, 11, 5));
            AV25TFLB_CantC_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFLB_CantC_To", GXutil.ltrimstr( AV25TFLB_CantC_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdUMe") == 0 )
         {
            AV20TFForPrdUMe = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFForPrdUMe", GXutil.str( AV20TFForPrdUMe, 1, 0));
            AV21TFForPrdUMe_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFForPrdUMe_To", GXutil.str( AV21TFForPrdUMe_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV22TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFForPrdDsc", AV22TFForPrdDsc);
            AV23TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFForPrdDsc_Sel", AV23TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdFibra") == 0 )
         {
            AV69TFPrdFibra = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrdFibra", AV69TFPrdFibra);
            AV70TFPrdFibra_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFPrdFibra_Sel", AV70TFPrdFibra_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_fibra") == 0 )
         {
            AV28TFLb_fibra = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFLb_fibra", AV28TFLb_fibra);
            AV29TFLb_fibra_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFLb_fibra_Sel", AV29TFLb_fibra_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdGots") == 0 )
         {
            AV30TFPrdGots = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrdGots", AV30TFPrdGots);
            AV31TFPrdGots_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrdGots_Sel", AV31TFPrdGots_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCtwSt") == 0 )
         {
            AV32TFPrdCtwSt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrdCtwSt", AV32TFPrdCtwSt);
            AV33TFPrdCtwSt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrdCtwSt_Sel", AV33TFPrdCtwSt_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2628H2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactiongroup1.removeAllItems();
         cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.setColumnClass( (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWActionGroupColumn WWColumnWarning WWColumnWarningFirstColumn" : "WWActionGroupColumn") );
         edtLb_LineaC_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtPrdNum_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtPrdNom_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtLB_CantC_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtForPrdUMe_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtForPrdDsc_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtPrdFibra_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtLb_fibra_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtPrdGots_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtPrdCtwSt_Columnclass = (((GXutil.strcmp(A10936PrdCtw1, "  ")!=0)||(GXutil.strcmp(A10937PrdCtw2, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0)||(GXutil.strcmp(A10938PrdCtw3, "  ")!=0))&&(AV56Moda21==1) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(92) ;
         }
         sendrow_922( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_92_Refreshing )
      {
         httpContext.doAjaxLoad(92, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV60GridActionGroup1, 4, 0)) );
   }

   public void e1528H2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1828H2 ();
      if (returnInSub) return;
   }

   public void e1828H2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( (0==AV38Lb_LineaC) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta #", ""));
         GX_FocusControl = edtavLb_cantc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (GXutil.strcmp("", AV39PrdNum)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Producto", ""));
            GX_FocusControl = edtavPrdnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXt_char1 = AV68ForPrdDsccontrol ;
            GXv_char4[0] = GXt_char1 ;
            new app.get_forprddsc(remoteHandle, context).execute( AV47EmprCod, AV41ForPrdUMe, GXv_char4) ;
            entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char1 = GXv_char4[0] ;
            AV68ForPrdDsccontrol = GXt_char1 ;
            if ( GXutil.strcmp(AV68ForPrdDsccontrol, httpContext.getMessage( "Error", "")) == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "NO es una UNIDAD Valida", ""));
               GX_FocusControl = edtavForprdume_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40LB_CantC)==0) )
               {
                  Dvelop_confirmpanel_enter_Confirmationtext = httpContext.getMessage( "Existem linhas com quantidade zero. Deseja continuar?", "") ;
                  ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                  this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
               }
               else
               {
                  /* Execute user subroutine: 'DO ACTION ENTER' */
                  S212 ();
                  if (returnInSub) return;
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1628H2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1928H2( )
   {
      /* 'DoLimpiarVariables' Routine */
      returnInSub = false ;
      AV41ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
      AV40LB_CantC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40LB_CantC", GXutil.ltrimstr( AV40LB_CantC, 11, 5));
      AV39PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39PrdNum", AV39PrdNum);
      AV44Lb_PTinC = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_PTinC), 2, 0));
      AV43Lb_fibra = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lb_fibra", AV43Lb_fibra);
      AV42ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ForPrdDsc", AV42ForPrdDsc);
      AV41ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
      Combo_prdnum_Selectedvalue_set = AV39PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      GXt_int7 = AV38Lb_LineaC ;
      GXv_int8[0] = GXt_int7 ;
      new app.formulaciontinte.getcolorantesensayos(remoteHandle, context).execute( AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, GXv_int8) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV38Lb_LineaC = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Lb_LineaC), 4, 0));
      GX_FocusControl = edtavLb_lineac_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2028H2( )
   {
      /* 'DoProductosVariables' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.gestionlaboratorio.entradaensayoslaboratorioproductos__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV49Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV50Lb_Rb))}, new String[] {"EmprCod","Lb_numero","Lb_opcion","Lb_Rb"}) , new Object[] {});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2128H2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV71mensaje ;
      new app.gestionlaboratorio.existenlineasconcantidadacero(remoteHandle, context).execute( AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, httpContext.getMessage( "ENS003", ""), GXv_char4) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV71mensaje = GXv_char4[0] ;
      if ( (GXutil.strcmp("", AV71mensaje)==0) )
      {
         /* Execute user subroutine: 'DO ACTION CERRAR' */
         S222 ();
         if (returnInSub) return;
      }
      else
      {
         Dvelop_confirmpanel_cerrar_Confirmationtext = AV71mensaje+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_cerrar.sendProperty(context, "", false, Dvelop_confirmpanel_cerrar_Internalname, "ConfirmationText", Dvelop_confirmpanel_cerrar_Confirmationtext);
         Dvelop_confirmpanel_cerrar_Confirmationtext = Dvelop_confirmpanel_cerrar_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
         ucDvelop_confirmpanel_cerrar.sendProperty(context, "", false, Dvelop_confirmpanel_cerrar_Internalname, "ConfirmationText", Dvelop_confirmpanel_cerrar_Confirmationtext);
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CERRARContainer", "Confirm", "", new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e1728H2( )
   {
      /* Dvelop_confirmpanel_cerrar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_cerrar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CERRAR' */
         S222 ();
         if (returnInSub) return;
      }
   }

   public void e1128H2( )
   {
      /* Combo_prdnum_Onoptionclicked Routine */
      returnInSub = false ;
      AV39PrdNum = Combo_prdnum_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39PrdNum", AV39PrdNum);
      /* Execute user subroutine: 'UNIDADPRODUCTO' */
      S232 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S192( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV64Lb_LineaC_Selected = A5557Lb_LineaC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Lb_LineaC_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Lb_LineaC_Selected), 4, 0));
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S202( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.formulaciontinte.ensayoscolorantes_del(remoteHandle, context).execute( AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, AV64Lb_LineaC_Selected) ;
      GXt_int7 = AV38Lb_LineaC ;
      GXv_int8[0] = GXt_int7 ;
      new app.formulaciontinte.getcolorantesensayos(remoteHandle, context).execute( AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, GXv_int8) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV38Lb_LineaC = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Lb_LineaC), 4, 0));
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      new app.formulaciontinte.ensayoscolorantes_ins(remoteHandle, context).execute( AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, AV38Lb_LineaC, AV39PrdNum, AV41ForPrdUMe, AV40LB_CantC, AV44Lb_PTinC, AV43Lb_fibra) ;
      new app.formulaciontinte.ensayoscolorantes_lb_ultlc(remoteHandle, context).execute( AV47EmprCod, AV48Lb_numero, AV49Lb_opcion) ;
      GXv_char4[0] = AV47EmprCod ;
      GXv_int12[0] = AV48Lb_numero ;
      GXv_char3[0] = AV49Lb_opcion ;
      GXv_decimal13[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int14[0] = (int)(DecimalUtil.decToDouble(AV50Lb_Rb)) ;
      GXv_char2[0] = " " ;
      GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
      new app.gestionlaboratorio.pens003x(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_decimal13, GXv_int14, GXv_char2, GXv_decimal15) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV47EmprCod = GXv_char4[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV48Lb_numero = GXv_int12[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV49Lb_opcion = GXv_char3[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV50Lb_Rb = DecimalUtil.doubleToDec(GXv_int14[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV48Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV49Lb_opcion", AV49Lb_opcion);
      httpContext.ajax_rsp_assign_attri("", false, "AV50Lb_Rb", GXutil.ltrimstr( AV50Lb_Rb, 7, 2));
      GXv_char4[0] = AV47EmprCod ;
      GXv_char3[0] = AV51Station ;
      GXv_decimal15[0] = DecimalUtil.doubleToDec(AV59Coste_cor) ;
      GXv_decimal13[0] = AV58Lb_costec ;
      new app.gestionlaboratorio.costecoloranteycostetotal(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal15, GXv_decimal13) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV47EmprCod = GXv_char4[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV51Station = GXv_char3[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV59Coste_cor = (short)(DecimalUtil.decToDouble(GXv_decimal15[0])) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV58Lb_costec = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV51Station", AV51Station);
      GXv_char4[0] = AV47EmprCod ;
      GXv_int14[0] = AV48Lb_numero ;
      GXv_char3[0] = AV49Lb_opcion ;
      GXv_decimal15[0] = DecimalUtil.doubleToDec(AV59Coste_cor) ;
      GXv_decimal13[0] = AV58Lb_costec ;
      new app.gestionlaboratorio.pens004(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_char3, GXv_decimal15, GXv_decimal13) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV47EmprCod = GXv_char4[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV48Lb_numero = GXv_int14[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV49Lb_opcion = GXv_char3[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV59Coste_cor = (short)(DecimalUtil.decToDouble(GXv_decimal15[0])) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV58Lb_costec = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV48Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Lb_numero), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV49Lb_opcion", AV49Lb_opcion);
      AV41ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
      AV40LB_CantC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40LB_CantC", GXutil.ltrimstr( AV40LB_CantC, 11, 5));
      AV39PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39PrdNum", AV39PrdNum);
      AV44Lb_PTinC = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_PTinC), 2, 0));
      AV43Lb_fibra = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lb_fibra", AV43Lb_fibra);
      AV42ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ForPrdDsc", AV42ForPrdDsc);
      AV41ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
      Combo_prdnum_Selectedvalue_set = AV39PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      GXt_int7 = AV38Lb_LineaC ;
      GXv_int8[0] = GXt_int7 ;
      new app.formulaciontinte.getcolorantesensayos(remoteHandle, context).execute( AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, GXv_int8) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV38Lb_LineaC = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Lb_LineaC), 4, 0));
      GX_FocusControl = edtavLb_lineac_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
   }

   public void S222( )
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
      if ( GXutil.strcmp(AV15Session.getValue(AV74Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV74Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV15Session.getValue(AV74Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      AV95GXV1 = 1 ;
      while ( AV95GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV95GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LINEAC") == 0 )
         {
            AV16TFLb_LineaC = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFLb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFLb_LineaC), 4, 0));
            AV17TFLb_LineaC_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFLb_LineaC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFLb_LineaC_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV18TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFPrdNum", AV18TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV19TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFPrdNum_Sel", AV19TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV61TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrdNom", AV61TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV62TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrdNom_Sel", AV62TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CANTC") == 0 )
         {
            AV24TFLB_CantC = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFLB_CantC", GXutil.ltrimstr( AV24TFLB_CantC, 11, 5));
            AV25TFLB_CantC_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFLB_CantC_To", GXutil.ltrimstr( AV25TFLB_CantC_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV20TFForPrdUMe = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFForPrdUMe", GXutil.str( AV20TFForPrdUMe, 1, 0));
            AV21TFForPrdUMe_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFForPrdUMe_To", GXutil.str( AV21TFForPrdUMe_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV22TFForPrdDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFForPrdDsc", AV22TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV23TFForPrdDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFForPrdDsc_Sel", AV23TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFIBRA") == 0 )
         {
            AV69TFPrdFibra = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFPrdFibra", AV69TFPrdFibra);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFIBRA_SEL") == 0 )
         {
            AV70TFPrdFibra_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFPrdFibra_Sel", AV70TFPrdFibra_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FIBRA") == 0 )
         {
            AV28TFLb_fibra = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFLb_fibra", AV28TFLb_fibra);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FIBRA_SEL") == 0 )
         {
            AV29TFLb_fibra_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFLb_fibra_Sel", AV29TFLb_fibra_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV30TFPrdGots = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrdGots", AV30TFPrdGots);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV31TFPrdGots_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrdGots_Sel", AV31TFPrdGots_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCTWST") == 0 )
         {
            AV32TFPrdCtwSt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrdCtwSt", AV32TFPrdCtwSt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCTWST_SEL") == 0 )
         {
            AV33TFPrdCtwSt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrdCtwSt_Sel", AV33TFPrdCtwSt_Sel);
         }
         AV95GXV1 = (int)(AV95GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFPrdNum_Sel)==0), AV19TFPrdNum_Sel, GXv_char4) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFPrdNom_Sel)==0), AV62TFPrdNom_Sel, GXv_char3) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFForPrdDsc_Sel)==0), AV23TFForPrdDsc_Sel, GXv_char2) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFPrdFibra_Sel)==0), AV70TFPrdFibra_Sel, GXv_char19) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFLb_fibra_Sel)==0), AV29TFLb_fibra_Sel, GXv_char21) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFPrdGots_Sel)==0), AV31TFPrdGots_Sel, GXv_char23) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFPrdCtwSt_Sel)==0), AV33TFPrdCtwSt_Sel, GXv_char25) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char24 = GXv_char25[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char16+"|||"+GXt_char17+"|"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFPrdNum)==0), AV18TFPrdNum, GXv_char25) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFPrdNom)==0), AV61TFPrdNom, GXv_char23) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFForPrdDsc)==0), AV22TFForPrdDsc, GXv_char21) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFPrdFibra)==0), AV69TFPrdFibra, GXv_char19) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFLb_fibra)==0), AV28TFLb_fibra, GXv_char4) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFPrdGots)==0), AV30TFPrdGots, GXv_char3) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPrdCtwSt)==0), AV32TFPrdCtwSt, GXv_char2) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV16TFLb_LineaC) ? "" : GXutil.str( AV16TFLb_LineaC, 4, 0))+"|"+GXt_char24+"|"+GXt_char22+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFLB_CantC)==0) ? "" : GXutil.str( AV24TFLB_CantC, 11, 5))+"|"+((0==AV20TFForPrdUMe) ? "" : GXutil.str( AV20TFForPrdUMe, 1, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char17+"|"+GXt_char16+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV17TFLb_LineaC_To) ? "" : GXutil.str( AV17TFLb_LineaC_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFLB_CantC_To)==0) ? "" : GXutil.str( AV25TFLB_CantC_To, 11, 5))+"|"+((0==AV21TFForPrdUMe_To) ? "" : GXutil.str( AV21TFForPrdUMe_To, 1, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV15Session.getValue(AV74Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLB_LINEAC", "", !((0==AV16TFLb_LineaC)&&(0==AV17TFLb_LineaC_To)), (short)(0), GXutil.trim( GXutil.str( AV16TFLb_LineaC, 4, 0)), GXutil.trim( GXutil.str( AV17TFLb_LineaC_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFPRDNUM", "", !(GXutil.strcmp("", AV18TFPrdNum)==0), (short)(0), AV18TFPrdNum, "", !(GXutil.strcmp("", AV19TFPrdNum_Sel)==0), AV19TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFPRDNOM", "", !(GXutil.strcmp("", AV61TFPrdNom)==0), (short)(0), AV61TFPrdNom, "", !(GXutil.strcmp("", AV62TFPrdNom_Sel)==0), AV62TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLB_CANTC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFLB_CantC)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFLB_CantC_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV24TFLB_CantC, 11, 5)), GXutil.trim( GXutil.str( AV25TFLB_CantC_To, 11, 5))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORPRDUME", "", !((0==AV20TFForPrdUMe)&&(0==AV21TFForPrdUMe_To)), (short)(0), GXutil.trim( GXutil.str( AV20TFForPrdUMe, 1, 0)), GXutil.trim( GXutil.str( AV21TFForPrdUMe_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV22TFForPrdDsc)==0), (short)(0), AV22TFForPrdDsc, "", !(GXutil.strcmp("", AV23TFForPrdDsc_Sel)==0), AV23TFForPrdDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFPRDFIBRA", "", !(GXutil.strcmp("", AV69TFPrdFibra)==0), (short)(0), AV69TFPrdFibra, "", !(GXutil.strcmp("", AV70TFPrdFibra_Sel)==0), AV70TFPrdFibra_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLB_FIBRA", "", !(GXutil.strcmp("", AV28TFLb_fibra)==0), (short)(0), AV28TFLb_fibra, "", !(GXutil.strcmp("", AV29TFLb_fibra_Sel)==0), AV29TFLb_fibra_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFPRDGOTS", "", !(GXutil.strcmp("", AV30TFPrdGots)==0), (short)(0), AV30TFPrdGots, "", !(GXutil.strcmp("", AV31TFPrdGots_Sel)==0), AV31TFPrdGots_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFPRDCTWST", "", !(GXutil.strcmp("", AV32TFPrdCtwSt)==0), (short)(0), AV32TFPrdCtwSt, "", !(GXutil.strcmp("", AV33TFPrdCtwSt_Sel)==0), AV33TFPrdCtwSt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV74Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV74Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.TENS001" );
      AV15Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV15Session.getValue(AV74Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV74Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV15Session.getValue(AV74Pgmname+"GridState"), null, null);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV47EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtPrdGots_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), !bGXsfl_92_Refreshing);
         GXv_SdtWWPGridState26[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState26, "TFPRDGOTS", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState26[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV74Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV47EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
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
         httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), !bGXsfl_92_Refreshing);
         GXv_SdtWWPGridState26[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState26, "TFPRDCTWST", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState26[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV74Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV65TotLB_CantC = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TotLB_CantC", GXutil.ltrimstr( AV65TotLB_CantC, 18, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTLB_CANTC", getSecureSignedToken( "", localUtil.format( AV65TotLB_CantC, "ZZZZ9.99999")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV16TFLb_LineaC ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV17TFLb_LineaC_To ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV18TFPrdNum ;
      AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV19TFPrdNum_Sel ;
      AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV61TFPrdNom ;
      AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV62TFPrdNom_Sel ;
      AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV24TFLB_CantC ;
      AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV25TFLB_CantC_To ;
      AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV20TFForPrdUMe ;
      AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV21TFForPrdUMe_To ;
      AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV22TFForPrdDsc ;
      AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV23TFForPrdDsc_Sel ;
      AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV69TFPrdFibra ;
      AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV70TFPrdFibra_Sel ;
      AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV28TFLb_fibra ;
      AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV29TFLb_fibra_Sel ;
      AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV30TFPrdGots ;
      AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV31TFPrdGots_Sel ;
      AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV32TFPrdCtwSt ;
      AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV33TFPrdCtwSt_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) ,
                                           Short.valueOf(AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) ,
                                           AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                           AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                           AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                           AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                           AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                           AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                           Byte.valueOf(AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) ,
                                           AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                           AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                           AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                           AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                           AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                           AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                           AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                           AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                           Short.valueOf(A5557Lb_LineaC) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5558LB_CantC ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A14094PrdFibra ,
                                           A14096Lb_fibra ,
                                           A11363PrdGots ,
                                           AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                           AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           AV47EmprCod ,
                                           Integer.valueOf(AV48Lb_numero) ,
                                           AV49Lb_opcion ,
                                           A396EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum), 6, "%") ;
      lV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom), 26, "%") ;
      lV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc), 5, "%") ;
      lV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = GXutil.padr( GXutil.rtrim( AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra), 4, "%") ;
      lV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = GXutil.padr( GXutil.rtrim( AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra), 4, "%") ;
      lV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = GXutil.padr( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots), 1, "%") ;
      /* Using cursor H028H4 */
      pr_default.execute(2, new Object[] {AV47EmprCod, Integer.valueOf(AV48Lb_numero), AV49Lb_opcion, Short.valueOf(AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac), Short.valueOf(AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to), lV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum, AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel, lV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom, AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel, AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc, AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to, Byte.valueOf(AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume), Byte.valueOf(AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to), lV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc, AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel, lV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra, AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel, lV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra, AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel, lV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots, AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5555Lb_opcion = H028H4_A5555Lb_opcion[0] ;
         A5532Lb_numero = H028H4_A5532Lb_numero[0] ;
         A11363PrdGots = H028H4_A11363PrdGots[0] ;
         A14096Lb_fibra = H028H4_A14096Lb_fibra[0] ;
         A14094PrdFibra = H028H4_A14094PrdFibra[0] ;
         n14094PrdFibra = H028H4_n14094PrdFibra[0] ;
         A488ForPrdDsc = H028H4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H028H4_n488ForPrdDsc[0] ;
         A490ForPrdUMe = H028H4_A490ForPrdUMe[0] ;
         A5558LB_CantC = H028H4_A5558LB_CantC[0] ;
         A718PrdNom = H028H4_A718PrdNom[0] ;
         A5557Lb_LineaC = H028H4_A5557Lb_LineaC[0] ;
         A719PrdNum = H028H4_A719PrdNum[0] ;
         A396EmprCod = H028H4_A396EmprCod[0] ;
         A11363PrdGots = H028H4_A11363PrdGots[0] ;
         A14094PrdFibra = H028H4_A14094PrdFibra[0] ;
         n14094PrdFibra = H028H4_n14094PrdFibra[0] ;
         A718PrdNom = H028H4_A718PrdNom[0] ;
         A488ForPrdDsc = H028H4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H028H4_n488ForPrdDsc[0] ;
         GXt_char24 = A14097PrdCtwSt ;
         GXv_char25[0] = A396EmprCod ;
         GXv_char23[0] = A719PrdNum ;
         GXv_char21[0] = GXt_char24 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char25, GXv_char23, GXv_char21) ;
         entradaensayoslaboratoriocolorantes_wp_impl.this.A396EmprCod = GXv_char25[0] ;
         entradaensayoslaboratoriocolorantes_wp_impl.this.A719PrdNum = GXv_char23[0] ;
         entradaensayoslaboratoriocolorantes_wp_impl.this.GXt_char24 = GXv_char21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14097PrdCtwSt = GXt_char24 ;
         if ( ! ( (GXutil.strcmp("", AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel) == 0 ) ) )
            {
               AV65TotLB_CantC = A5558LB_CantC.add(AV65TotLB_CantC) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65TotLB_CantC", GXutil.ltrimstr( AV65TotLB_CantC, 18, 5));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTLB_CANTC", getSecureSignedToken( "", localUtil.format( AV65TotLB_CantC, "ZZZZ9.99999")));
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV66TotValueLB_CantC = localUtil.format( AV65TotLB_CantC, "ZZZZ9.99999") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TotValueLB_CantC", AV66TotValueLB_CantC);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      /* Using cursor H028H5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H028H5_A396EmprCod[0] ;
         A856ValCod = H028H5_A856ValCod[0] ;
         A13747PrdCDsc = H028H5_A13747PrdCDsc[0] ;
         A719PrdNum = H028H5_A719PrdNum[0] ;
         A718PrdNom = H028H5_A718PrdNom[0] ;
         AV46Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV46Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV46Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV45PrdNum_Data.add(AV46Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_prdnum_Selectedvalue_set = AV39PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
   }

   public void e2228H2( )
   {
      /* Lb_lineac_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_decimal15[0] = AV40LB_CantC ;
      GXv_char25[0] = AV43Lb_fibra ;
      GXv_int10[0] = AV44Lb_PTinC ;
      GXv_char23[0] = AV39PrdNum ;
      GXv_int27[0] = AV41ForPrdUMe ;
      GXv_char21[0] = AV42ForPrdDsc ;
      new app.obtengovaloreslb_lineac(remoteHandle, context).execute( AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, AV38Lb_LineaC, GXv_decimal15, GXv_char25, GXv_int10, GXv_char23, GXv_int27, GXv_char21) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV40LB_CantC = GXv_decimal15[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV43Lb_fibra = GXv_char25[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV44Lb_PTinC = GXv_int10[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV39PrdNum = GXv_char23[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV41ForPrdUMe = GXv_int27[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV42ForPrdDsc = GXv_char21[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40LB_CantC", GXutil.ltrimstr( AV40LB_CantC, 11, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lb_fibra", AV43Lb_fibra);
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_PTinC), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39PrdNum", AV39PrdNum);
      httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV42ForPrdDsc", AV42ForPrdDsc);
      Combo_prdnum_Selectedvalue_set = AV39PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      /*  Sending Event outputs  */
   }

   public void e2728H2( )
   {
      /* Lb_LineaC_Click Routine */
      returnInSub = false ;
      AV67Acciongridmodificar = (short)(1) ;
      AV38Lb_LineaC = A5557Lb_LineaC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Lb_LineaC), 4, 0));
      GXv_decimal15[0] = AV40LB_CantC ;
      GXv_char25[0] = AV43Lb_fibra ;
      GXv_int27[0] = AV44Lb_PTinC ;
      GXv_char23[0] = AV39PrdNum ;
      GXv_int10[0] = AV41ForPrdUMe ;
      GXv_char21[0] = AV42ForPrdDsc ;
      new app.obtengovaloreslb_lineac(remoteHandle, context).execute( AV47EmprCod, AV48Lb_numero, AV49Lb_opcion, AV38Lb_LineaC, GXv_decimal15, GXv_char25, GXv_int27, GXv_char23, GXv_int10, GXv_char21) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV40LB_CantC = GXv_decimal15[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV43Lb_fibra = GXv_char25[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV44Lb_PTinC = GXv_int27[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV39PrdNum = GXv_char23[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV41ForPrdUMe = GXv_int10[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV42ForPrdDsc = GXv_char21[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40LB_CantC", GXutil.ltrimstr( AV40LB_CantC, 11, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lb_fibra", AV43Lb_fibra);
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lb_PTinC), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39PrdNum", AV39PrdNum);
      httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV42ForPrdDsc", AV42ForPrdDsc);
      Combo_prdnum_Selectedvalue_set = AV39PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      GX_FocusControl = edtavLb_cantc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2328H2( )
   {
      /* Forprdume_Isvalid Routine */
      returnInSub = false ;
      GXv_char25[0] = AV47EmprCod ;
      GXv_int27[0] = AV41ForPrdUMe ;
      GXv_char23[0] = AV42ForPrdDsc ;
      new app.pbusumed(remoteHandle, context).execute( GXv_char25, GXv_int27, GXv_char23) ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV47EmprCod = GXv_char25[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV41ForPrdUMe = GXv_int27[0] ;
      entradaensayoslaboratoriocolorantes_wp_impl.this.AV42ForPrdDsc = GXv_char23[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV42ForPrdDsc", AV42ForPrdDsc);
      /*  Sending Event outputs  */
   }

   public void S232( )
   {
      /* 'UNIDADPRODUCTO' Routine */
      returnInSub = false ;
      AV41ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
      AV42ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ForPrdDsc", AV42ForPrdDsc);
      /* Using cursor H028H6 */
      pr_default.execute(4, new Object[] {AV47EmprCod, AV39PrdNum});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A719PrdNum = H028H6_A719PrdNum[0] ;
         A396EmprCod = H028H6_A396EmprCod[0] ;
         A4338PrdUMeFo = H028H6_A4338PrdUMeFo[0] ;
         AV41ForPrdUMe = A4338PrdUMeFo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV41ForPrdUMe > 0 )
      {
         GXv_char25[0] = AV47EmprCod ;
         GXv_int27[0] = AV41ForPrdUMe ;
         GXv_char23[0] = AV42ForPrdDsc ;
         new app.pbusumed(remoteHandle, context).execute( GXv_char25, GXv_int27, GXv_char23) ;
         entradaensayoslaboratoriocolorantes_wp_impl.this.AV47EmprCod = GXv_char25[0] ;
         entradaensayoslaboratoriocolorantes_wp_impl.this.AV41ForPrdUMe = GXv_int27[0] ;
         entradaensayoslaboratoriocolorantes_wp_impl.this.AV42ForPrdDsc = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV41ForPrdUMe", GXutil.str( AV41ForPrdUMe, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV42ForPrdDsc", AV42ForPrdDsc);
      }
   }

   public void wb_table5_154_28H2( boolean wbgen )
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
         wb_table5_154_28H2e( true) ;
      }
      else
      {
         wb_table5_154_28H2e( false) ;
      }
   }

   public void wb_table4_149_28H2( boolean wbgen )
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
         wb_table4_149_28H2e( true) ;
      }
      else
      {
         wb_table4_149_28H2e( false) ;
      }
   }

   public void wb_table3_144_28H2( boolean wbgen )
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
         wb_table3_144_28H2e( true) ;
      }
      else
      {
         wb_table3_144_28H2e( false) ;
      }
   }

   public void wb_table2_110_28H2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluelb_cantc_Internalname, httpContext.getMessage( "Tot Value LB_Cant C", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluelb_cantc_Internalname, AV66TotValueLB_CantC, GXutil.rtrim( localUtil.format( AV66TotValueLB_CantC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluelb_cantc_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluelb_cantc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
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
         wb_table2_110_28H2e( true) ;
      }
      else
      {
         wb_table2_110_28H2e( false) ;
      }
   }

   public void wb_table1_52_28H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedforprdume_Internalname, tblTablemergedforprdume_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprdume_Internalname, httpContext.getMessage( "For Prd UMe", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprdume_Internalname, GXutil.ltrim( localUtil.ntoc( AV41ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41ForPrdUMe), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprdume_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprdume_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_forprdume_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_forprdume_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_forprdume_Internalname, sImgUrl, imgPrompt_forprdume_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_GestionLaboratorio\\EntradaEnsayosLaboratorioColorantes_WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_52_28H2e( true) ;
      }
      else
      {
         wb_table1_52_28H2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV47EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
      AV48Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Lb_numero), 8, 0));
      AV49Lb_opcion = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Lb_opcion", AV49Lb_opcion);
      AV50Lb_Rb = (java.math.BigDecimal)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Lb_Rb", GXutil.ltrimstr( AV50Lb_Rb, 7, 2));
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
      pa28H2( ) ;
      ws28H2( ) ;
      we28H2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615978", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/entradaensayoslaboratoriocolorantes_wp.js", "?20268211615978", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_922( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_92_idx );
      edtLb_LineaC_Internalname = "LB_LINEAC_"+sGXsfl_92_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_92_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_92_idx ;
      edtLB_CantC_Internalname = "LB_CANTC_"+sGXsfl_92_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_92_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_92_idx ;
      edtPrdFibra_Internalname = "PRDFIBRA_"+sGXsfl_92_idx ;
      edtLb_fibra_Internalname = "LB_FIBRA_"+sGXsfl_92_idx ;
      edtPrdCtw1_Internalname = "PRDCTW1_"+sGXsfl_92_idx ;
      edtPrdCtw2_Internalname = "PRDCTW2_"+sGXsfl_92_idx ;
      edtPrdCtw3_Internalname = "PRDCTW3_"+sGXsfl_92_idx ;
      edtPrdCtw4_Internalname = "PRDCTW4_"+sGXsfl_92_idx ;
      edtPrdGots_Internalname = "PRDGOTS_"+sGXsfl_92_idx ;
      edtPrdCtwSt_Internalname = "PRDCTWST_"+sGXsfl_92_idx ;
   }

   public void subsflControlProps_fel_922( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_92_fel_idx );
      edtLb_LineaC_Internalname = "LB_LINEAC_"+sGXsfl_92_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_92_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_92_fel_idx ;
      edtLB_CantC_Internalname = "LB_CANTC_"+sGXsfl_92_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_92_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_92_fel_idx ;
      edtPrdFibra_Internalname = "PRDFIBRA_"+sGXsfl_92_fel_idx ;
      edtLb_fibra_Internalname = "LB_FIBRA_"+sGXsfl_92_fel_idx ;
      edtPrdCtw1_Internalname = "PRDCTW1_"+sGXsfl_92_fel_idx ;
      edtPrdCtw2_Internalname = "PRDCTW2_"+sGXsfl_92_fel_idx ;
      edtPrdCtw3_Internalname = "PRDCTW3_"+sGXsfl_92_fel_idx ;
      edtPrdCtw4_Internalname = "PRDCTW4_"+sGXsfl_92_fel_idx ;
      edtPrdGots_Internalname = "PRDGOTS_"+sGXsfl_92_fel_idx ;
      edtPrdCtwSt_Internalname = "PRDCTWST_"+sGXsfl_92_fel_idx ;
   }

   public void sendrow_922( )
   {
      subsflControlProps_922( ) ;
      wb28H0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_92_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_92_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_92_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 93,'',false,'"+sGXsfl_92_idx+"',92)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_92_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV60GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV60GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV60GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e2828h2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactiongroup1.getColumnClass(),cmbavGridactiongroup1.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,93);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV60GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_92_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_LineaC_Internalname,GXutil.ltrim( localUtil.ntoc( A5557Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5557Lb_LineaC), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"ELB_LINEAC.CLICK."+sGXsfl_92_idx+"'","","","","",edtLb_LineaC_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtLb_LineaC_Columnclass,edtLb_LineaC_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrdNum_Columnclass,edtPrdNum_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrdNom_Columnclass,edtPrdNom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLB_CantC_Internalname,GXutil.ltrim( localUtil.ntoc( A5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5558LB_CantC, "ZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLB_CantC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLB_CantC_Columnclass,edtLB_CantC_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForPrdUMe_Columnclass,edtForPrdUMe_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForPrdDsc_Columnclass,edtForPrdDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFibra_Internalname,GXutil.rtrim( A14094PrdFibra),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFibra_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrdFibra_Columnclass,edtPrdFibra_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_fibra_Internalname,GXutil.rtrim( A14096Lb_fibra),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_fibra_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtLb_fibra_Columnclass,edtLb_fibra_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw1_Internalname,GXutil.rtrim( A10936PrdCtw1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw2_Internalname,GXutil.rtrim( A10937PrdCtw2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw3_Internalname,GXutil.rtrim( A10938PrdCtw3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw4_Internalname,GXutil.rtrim( A11663PrdCtw4),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdGots_Internalname,GXutil.rtrim( A11363PrdGots),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdGots_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrdGots_Columnclass,edtPrdGots_Columnheaderclass,Integer.valueOf(edtPrdGots_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdCtwSt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtwSt_Internalname,A14097PrdCtwSt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtwSt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrdCtwSt_Columnclass,edtPrdCtwSt_Columnheaderclass,Integer.valueOf(edtPrdCtwSt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes28H2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_92_idx = ((subGrid_Islastpage==1)&&(nGXsfl_92_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_92_idx+1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_922( ) ;
      }
      /* End function sendrow_922 */
   }

   public void startgridcontrol92( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"92\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dsc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Comp.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Fibra", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Formaldeido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Airlaminas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Apeo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PFC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdGots_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "GOTS", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV60GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactiongroup1.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactiongroup1.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5557Lb_LineaC, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_LineaC_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_LineaC_Columnheaderclass));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5558LB_CantC, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLB_CantC_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLB_CantC_Columnheaderclass));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14094PrdFibra));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPrdFibra_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPrdFibra_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14096Lb_fibra));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtLb_fibra_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtLb_fibra_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10936PrdCtw1));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10937PrdCtw2));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10938PrdCtw3));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11663PrdCtw4));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11363PrdGots));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPrdGots_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPrdGots_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavLb_lineac_Internalname = "vLB_LINEAC" ;
      lblTextblockcombo_prdnum_Internalname = "TEXTBLOCKCOMBO_PRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      edtavLb_cantc_Internalname = "vLB_CANTC" ;
      lblTextblockforprdume_Internalname = "TEXTBLOCKFORPRDUME" ;
      edtavForprdume_Internalname = "vFORPRDUME" ;
      imgPrompt_forprdume_Internalname = "PROMPT_FORPRDUME" ;
      tblTablemergedforprdume_Internalname = "TABLEMERGEDFORPRDUME" ;
      divTablesplittedforprdume_Internalname = "TABLESPLITTEDFORPRDUME" ;
      edtavForprddsc_Internalname = "vFORPRDDSC" ;
      edtavLb_fibra_Internalname = "vLB_FIBRA" ;
      edtavLb_ptinc_Internalname = "vLB_PTINC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnlimpiarvariables_Internalname = "BTNLIMPIARVARIABLES" ;
      bttBtnproductosvariables_Internalname = "BTNPRODUCTOSVARIABLES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtLb_LineaC_Internalname = "LB_LINEAC" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtLB_CantC_Internalname = "LB_CANTC" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtPrdFibra_Internalname = "PRDFIBRA" ;
      edtLb_fibra_Internalname = "LB_FIBRA" ;
      edtPrdCtw1_Internalname = "PRDCTW1" ;
      edtPrdCtw2_Internalname = "PRDCTW2" ;
      edtPrdCtw3_Internalname = "PRDCTW3" ;
      edtPrdCtw4_Internalname = "PRDCTW4" ;
      edtPrdGots_Internalname = "PRDGOTS" ;
      edtPrdCtwSt_Internalname = "PRDCTWST" ;
      edtavTotvaluelb_cantc_Internalname = "vTOTVALUELB_CANTC" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavPrdnum_Internalname = "vPRDNUM" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      edtPrdGots_Jsonclick = "" ;
      edtPrdGots_Columnclass = "WWColumn" ;
      edtPrdCtw4_Jsonclick = "" ;
      edtPrdCtw3_Jsonclick = "" ;
      edtPrdCtw2_Jsonclick = "" ;
      edtPrdCtw1_Jsonclick = "" ;
      edtLb_fibra_Jsonclick = "" ;
      edtLb_fibra_Columnclass = "WWColumn" ;
      edtPrdFibra_Jsonclick = "" ;
      edtPrdFibra_Columnclass = "WWColumn" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Columnclass = "WWColumn" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Columnclass = "WWColumn" ;
      edtLB_CantC_Jsonclick = "" ;
      edtLB_CantC_Columnclass = "WWColumn" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Columnclass = "WWColumn" ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Columnclass = "WWColumn" ;
      edtLb_LineaC_Jsonclick = "" ;
      edtLb_LineaC_Columnclass = "WWColumn" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      cmbavGridactiongroup1.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      imgPrompt_forprdume_Link = "" ;
      edtavForprdume_Jsonclick = "" ;
      edtavTotvaluelb_cantc_Jsonclick = "" ;
      edtavTotvaluelb_cantc_Enabled = 1 ;
      edtPrdCtwSt_Columnheaderclass = "" ;
      edtPrdGots_Columnheaderclass = "" ;
      edtLb_fibra_Columnheaderclass = "" ;
      edtPrdFibra_Columnheaderclass = "" ;
      edtForPrdDsc_Columnheaderclass = "" ;
      edtForPrdUMe_Columnheaderclass = "" ;
      edtLB_CantC_Columnheaderclass = "" ;
      edtPrdNom_Columnheaderclass = "" ;
      edtPrdNum_Columnheaderclass = "" ;
      edtLb_LineaC_Columnheaderclass = "" ;
      cmbavGridactiongroup1.setColumnHeaderClass( "" );
      edtavForprdume_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavLb_ptinc_Jsonclick = "" ;
      edtavLb_ptinc_Enabled = 1 ;
      edtavLb_fibra_Jsonclick = "" ;
      edtavLb_fibra_Enabled = 1 ;
      edtavForprddsc_Jsonclick = "" ;
      edtavForprddsc_Enabled = 1 ;
      edtavLb_cantc_Jsonclick = "" ;
      edtavLb_cantc_Enabled = 1 ;
      edtavLb_lineac_Jsonclick = "" ;
      edtavLb_lineac_Enabled = 1 ;
      edtavLb_opcion_Jsonclick = "" ;
      edtavLb_opcion_Enabled = 0 ;
      edtavLb_numero_Jsonclick = "" ;
      edtavLb_numero_Enabled = 0 ;
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
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma linea?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Deseas eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.EntradaEnsayosLaboratorioColorantes_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|||T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "T|||T|T|||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Numeric|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|" ;
      Ddo_grid_Columnids = "1:Lb_LineaC|2:PrdNum|3:PrdNom|4:LB_CantC|5:ForPrdUMe|6:ForPrdDsc|7:PrdFibra|8:Lb_fibra|13:PrdGots|14:PrdCtwSt" ;
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
      Dvpanel_tableheader_Title = "" ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Colorantes (Ensayos)", "") );
      edtPrdCtwSt_Visible = -1 ;
      edtPrdGots_Visible = -1 ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_92_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV60GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV60GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridActionGroup1), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5558LB_CantC',fld:'LB_CANTC',pic:'ZZZZ9.99999'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{av:'edtLb_LineaC_Columnheaderclass',ctrl:'LB_LINEAC',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantC_Columnheaderclass',ctrl:'LB_CANTC',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtPrdFibra_Columnheaderclass',ctrl:'PRDFIBRA',prop:'Columnheaderclass'},{av:'edtLb_fibra_Columnheaderclass',ctrl:'LB_FIBRA',prop:'Columnheaderclass'},{av:'edtPrdGots_Columnheaderclass',ctrl:'PRDGOTS',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'AV66TotValueLB_CantC',fld:'vTOTVALUELB_CANTC',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1228H2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1328H2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1428H2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2628H2',iparms:[{av:'A10936PrdCtw1',fld:'PRDCTW1',pic:''},{av:'A10937PrdCtw2',fld:'PRDCTW2',pic:''},{av:'A10938PrdCtw3',fld:'PRDCTW3',pic:''},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV60GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'edtLb_LineaC_Columnclass',ctrl:'LB_LINEAC',prop:'Columnclass'},{av:'edtPrdNum_Columnclass',ctrl:'PRDNUM',prop:'Columnclass'},{av:'edtPrdNom_Columnclass',ctrl:'PRDNOM',prop:'Columnclass'},{av:'edtLB_CantC_Columnclass',ctrl:'LB_CANTC',prop:'Columnclass'},{av:'edtForPrdUMe_Columnclass',ctrl:'FORPRDUME',prop:'Columnclass'},{av:'edtForPrdDsc_Columnclass',ctrl:'FORPRDDSC',prop:'Columnclass'},{av:'edtPrdFibra_Columnclass',ctrl:'PRDFIBRA',prop:'Columnclass'},{av:'edtLb_fibra_Columnclass',ctrl:'LB_FIBRA',prop:'Columnclass'},{av:'edtPrdGots_Columnclass',ctrl:'PRDGOTS',prop:'Columnclass'},{av:'edtPrdCtwSt_Columnclass',ctrl:'PRDCTWST',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2828H2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV60GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A5557Lb_LineaC',fld:'LB_LINEAC',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV60GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV64Lb_LineaC_Selected',fld:'vLB_LINEAC_SELECTED',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e1528H2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV64Lb_LineaC_Selected',fld:'vLB_LINEAC_SELECTED',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5558LB_CantC',fld:'LB_CANTC',pic:'ZZZZ9.99999'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV38Lb_LineaC',fld:'vLB_LINEAC',pic:'ZZZ9'},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{av:'edtLb_LineaC_Columnheaderclass',ctrl:'LB_LINEAC',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantC_Columnheaderclass',ctrl:'LB_CANTC',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtPrdFibra_Columnheaderclass',ctrl:'PRDFIBRA',prop:'Columnheaderclass'},{av:'edtLb_fibra_Columnheaderclass',ctrl:'LB_FIBRA',prop:'Columnheaderclass'},{av:'edtPrdGots_Columnheaderclass',ctrl:'PRDGOTS',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'AV66TotValueLB_CantC',fld:'vTOTVALUELB_CANTC',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e1828H2',iparms:[{av:'AV38Lb_LineaC',fld:'vLB_LINEAC',pic:'ZZZ9'},{av:'AV40LB_CantC',fld:'vLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV39PrdNum',fld:'vPRDNUM',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV44Lb_PTinC',fld:'vLB_PTINC',pic:'Z9'},{av:'AV43Lb_fibra',fld:'vLB_FIBRA',pic:''},{av:'AV50Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV51Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5558LB_CantC',fld:'LB_CANTC',pic:'ZZZZ9.99999'}]");
      setEventMetadata("ENTER",",oparms:[{av:'Dvelop_confirmpanel_enter_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'ConfirmationText'},{av:'AV50Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51Station',fld:'vSTATION',pic:''},{av:'AV41ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV40LB_CantC',fld:'vLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV39PrdNum',fld:'vPRDNUM',pic:''},{av:'AV44Lb_PTinC',fld:'vLB_PTINC',pic:'Z9'},{av:'AV43Lb_fibra',fld:'vLB_FIBRA',pic:''},{av:'AV42ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV38Lb_LineaC',fld:'vLB_LINEAC',pic:'ZZZ9'},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{av:'edtLb_LineaC_Columnheaderclass',ctrl:'LB_LINEAC',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantC_Columnheaderclass',ctrl:'LB_CANTC',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtPrdFibra_Columnheaderclass',ctrl:'PRDFIBRA',prop:'Columnheaderclass'},{av:'edtLb_fibra_Columnheaderclass',ctrl:'LB_FIBRA',prop:'Columnheaderclass'},{av:'edtPrdGots_Columnheaderclass',ctrl:'PRDGOTS',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'AV66TotValueLB_CantC',fld:'vTOTVALUELB_CANTC',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e1628H2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV38Lb_LineaC',fld:'vLB_LINEAC',pic:'ZZZ9'},{av:'AV39PrdNum',fld:'vPRDNUM',pic:''},{av:'AV41ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV40LB_CantC',fld:'vLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV44Lb_PTinC',fld:'vLB_PTINC',pic:'Z9'},{av:'AV43Lb_fibra',fld:'vLB_FIBRA',pic:''},{av:'AV50Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV51Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5558LB_CantC',fld:'LB_CANTC',pic:'ZZZZ9.99999'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV50Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51Station',fld:'vSTATION',pic:''},{av:'AV41ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV40LB_CantC',fld:'vLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV39PrdNum',fld:'vPRDNUM',pic:''},{av:'AV44Lb_PTinC',fld:'vLB_PTINC',pic:'Z9'},{av:'AV43Lb_fibra',fld:'vLB_FIBRA',pic:''},{av:'AV42ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV38Lb_LineaC',fld:'vLB_LINEAC',pic:'ZZZ9'},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{av:'edtLb_LineaC_Columnheaderclass',ctrl:'LB_LINEAC',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantC_Columnheaderclass',ctrl:'LB_CANTC',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtPrdFibra_Columnheaderclass',ctrl:'PRDFIBRA',prop:'Columnheaderclass'},{av:'edtLb_fibra_Columnheaderclass',ctrl:'LB_FIBRA',prop:'Columnheaderclass'},{av:'edtPrdGots_Columnheaderclass',ctrl:'PRDGOTS',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'AV66TotValueLB_CantC',fld:'vTOTVALUELB_CANTC',pic:''}]}");
      setEventMetadata("'DOLIMPIARVARIABLES'","{handler:'e1928H2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5558LB_CantC',fld:'LB_CANTC',pic:'ZZZZ9.99999'}]");
      setEventMetadata("'DOLIMPIARVARIABLES'",",oparms:[{av:'AV41ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV40LB_CantC',fld:'vLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV39PrdNum',fld:'vPRDNUM',pic:''},{av:'AV44Lb_PTinC',fld:'vLB_PTINC',pic:'Z9'},{av:'AV43Lb_fibra',fld:'vLB_FIBRA',pic:''},{av:'AV42ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV38Lb_LineaC',fld:'vLB_LINEAC',pic:'ZZZ9'},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{av:'edtLb_LineaC_Columnheaderclass',ctrl:'LB_LINEAC',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantC_Columnheaderclass',ctrl:'LB_CANTC',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtPrdFibra_Columnheaderclass',ctrl:'PRDFIBRA',prop:'Columnheaderclass'},{av:'edtLb_fibra_Columnheaderclass',ctrl:'LB_FIBRA',prop:'Columnheaderclass'},{av:'edtPrdGots_Columnheaderclass',ctrl:'PRDGOTS',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'AV66TotValueLB_CantC',fld:'vTOTVALUELB_CANTC',pic:''}]}");
      setEventMetadata("'DOPRODUCTOSVARIABLES'","{handler:'e2028H2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV50Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5558LB_CantC',fld:'LB_CANTC',pic:'ZZZZ9.99999'}]");
      setEventMetadata("'DOPRODUCTOSVARIABLES'",",oparms:[{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{av:'edtLb_LineaC_Columnheaderclass',ctrl:'LB_LINEAC',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantC_Columnheaderclass',ctrl:'LB_CANTC',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtPrdFibra_Columnheaderclass',ctrl:'PRDFIBRA',prop:'Columnheaderclass'},{av:'edtLb_fibra_Columnheaderclass',ctrl:'LB_FIBRA',prop:'Columnheaderclass'},{av:'edtPrdGots_Columnheaderclass',ctrl:'PRDGOTS',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'AV66TotValueLB_CantC',fld:'vTOTVALUELB_CANTC',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e2128H2',iparms:[{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'Dvelop_confirmpanel_cerrar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE","{handler:'e1728H2',iparms:[{av:'Dvelop_confirmpanel_cerrar_Result',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'Result'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE",",oparms:[]}");
      setEventMetadata("COMBO_PRDNUM.ONOPTIONCLICKED","{handler:'e1128H2',iparms:[{av:'Combo_prdnum_Selectedvalue_get',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_get'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39PrdNum',fld:'vPRDNUM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'}]");
      setEventMetadata("COMBO_PRDNUM.ONOPTIONCLICKED",",oparms:[{av:'AV39PrdNum',fld:'vPRDNUM',pic:''},{av:'AV41ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV42ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VLB_LINEAC.CONTROLVALUECHANGED","{handler:'e2228H2',iparms:[{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV38Lb_LineaC',fld:'vLB_LINEAC',pic:'ZZZ9'}]");
      setEventMetadata("VLB_LINEAC.CONTROLVALUECHANGED",",oparms:[{av:'AV42ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV41ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV39PrdNum',fld:'vPRDNUM',pic:''},{av:'AV44Lb_PTinC',fld:'vLB_PTINC',pic:'Z9'},{av:'AV43Lb_fibra',fld:'vLB_FIBRA',pic:''},{av:'AV40LB_CantC',fld:'vLB_CANTC',pic:'ZZZZ9.99999'},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'}]}");
      setEventMetadata("LB_LINEAC.CLICK","{handler:'e2728H2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV49Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV16TFLb_LineaC',fld:'vTFLB_LINEAC',pic:'ZZZ9'},{av:'AV17TFLb_LineaC_To',fld:'vTFLB_LINEAC_TO',pic:'ZZZ9'},{av:'AV18TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV19TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV61TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV62TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV24TFLB_CantC',fld:'vTFLB_CANTC',pic:'ZZZZ9.99999'},{av:'AV25TFLB_CantC_To',fld:'vTFLB_CANTC_TO',pic:'ZZZZ9.99999'},{av:'AV20TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV21TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV22TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV23TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV69TFPrdFibra',fld:'vTFPRDFIBRA',pic:''},{av:'AV70TFPrdFibra_Sel',fld:'vTFPRDFIBRA_SEL',pic:''},{av:'AV28TFLb_fibra',fld:'vTFLB_FIBRA',pic:''},{av:'AV29TFLb_fibra_Sel',fld:'vTFLB_FIBRA_SEL',pic:''},{av:'AV30TFPrdGots',fld:'vTFPRDGOTS',pic:''},{av:'AV31TFPrdGots_Sel',fld:'vTFPRDGOTS_SEL',pic:''},{av:'AV32TFPrdCtwSt',fld:'vTFPRDCTWST',pic:''},{av:'AV33TFPrdCtwSt_Sel',fld:'vTFPRDCTWST_SEL',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'edtPrdGots_Visible',ctrl:'PRDGOTS',prop:'Visible'},{av:'edtPrdCtwSt_Visible',ctrl:'PRDCTWST',prop:'Visible'},{av:'AV56Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A5557Lb_LineaC',fld:'LB_LINEAC',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5558LB_CantC',fld:'LB_CANTC',pic:'ZZZZ9.99999'}]");
      setEventMetadata("LB_LINEAC.CLICK",",oparms:[{av:'AV38Lb_LineaC',fld:'vLB_LINEAC',pic:'ZZZ9'},{av:'AV42ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV41ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV39PrdNum',fld:'vPRDNUM',pic:''},{av:'AV44Lb_PTinC',fld:'vLB_PTINC',pic:'Z9'},{av:'AV43Lb_fibra',fld:'vLB_FIBRA',pic:''},{av:'AV40LB_CantC',fld:'vLB_CANTC',pic:'ZZZZ9.99999'},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV36GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV37GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{av:'edtLb_LineaC_Columnheaderclass',ctrl:'LB_LINEAC',prop:'Columnheaderclass'},{av:'edtPrdNum_Columnheaderclass',ctrl:'PRDNUM',prop:'Columnheaderclass'},{av:'edtPrdNom_Columnheaderclass',ctrl:'PRDNOM',prop:'Columnheaderclass'},{av:'edtLB_CantC_Columnheaderclass',ctrl:'LB_CANTC',prop:'Columnheaderclass'},{av:'edtForPrdUMe_Columnheaderclass',ctrl:'FORPRDUME',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtPrdFibra_Columnheaderclass',ctrl:'PRDFIBRA',prop:'Columnheaderclass'},{av:'edtLb_fibra_Columnheaderclass',ctrl:'LB_FIBRA',prop:'Columnheaderclass'},{av:'edtPrdGots_Columnheaderclass',ctrl:'PRDGOTS',prop:'Columnheaderclass'},{av:'edtPrdCtwSt_Columnheaderclass',ctrl:'PRDCTWST',prop:'Columnheaderclass'},{av:'AV65TotLB_CantC',fld:'vTOTLB_CANTC',pic:'ZZZZ9.99999',hsh:true},{av:'AV66TotValueLB_CantC',fld:'vTOTVALUELB_CANTC',pic:''}]}");
      setEventMetadata("VFORPRDUME.ISVALID","{handler:'e2328H2',iparms:[{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41ForPrdUMe',fld:'vFORPRDUME',pic:'9'}]");
      setEventMetadata("VFORPRDUME.ISVALID",",oparms:[{av:'AV42ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV41ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      wcpOAV47EmprCod = "" ;
      wcpOAV49Lb_opcion = "" ;
      wcpOAV50Lb_Rb = DecimalUtil.ZERO ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Dvelop_confirmpanel_cerrar_Result = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV47EmprCod = "" ;
      AV49Lb_opcion = "" ;
      AV50Lb_Rb = DecimalUtil.ZERO ;
      AV18TFPrdNum = "" ;
      AV19TFPrdNum_Sel = "" ;
      AV61TFPrdNom = "" ;
      AV62TFPrdNom_Sel = "" ;
      AV24TFLB_CantC = DecimalUtil.ZERO ;
      AV25TFLB_CantC_To = DecimalUtil.ZERO ;
      AV22TFForPrdDsc = "" ;
      AV23TFForPrdDsc_Sel = "" ;
      AV69TFPrdFibra = "" ;
      AV70TFPrdFibra_Sel = "" ;
      AV28TFLb_fibra = "" ;
      AV29TFLb_fibra_Sel = "" ;
      AV30TFPrdGots = "" ;
      AV31TFPrdGots_Sel = "" ;
      AV32TFPrdCtwSt = "" ;
      AV33TFPrdCtwSt_Sel = "" ;
      AV74Pgmname = "" ;
      AV65TotLB_CantC = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV45PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV34DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A5555Lb_opcion = "" ;
      AV51Station = "" ;
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
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcombo_prdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV40LB_CantC = DecimalUtil.ZERO ;
      lblTextblockforprdume_Jsonclick = "" ;
      AV42ForPrdDsc = "" ;
      AV43Lb_fibra = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnlimpiarvariables_Jsonclick = "" ;
      bttBtnproductosvariables_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV39PrdNum = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A14094PrdFibra = "" ;
      A14096Lb_fibra = "" ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      A11363PrdGots = "" ;
      A14097PrdCtwSt = "" ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = "" ;
      AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = "" ;
      AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = "" ;
      AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = "" ;
      AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = DecimalUtil.ZERO ;
      AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = DecimalUtil.ZERO ;
      AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = "" ;
      AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = "" ;
      AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = "" ;
      AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = "" ;
      AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = "" ;
      AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = "" ;
      AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = "" ;
      AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = "" ;
      AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = "" ;
      AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = "" ;
      scmdbuf = "" ;
      lV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = "" ;
      lV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = "" ;
      lV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = "" ;
      lV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = "" ;
      lV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = "" ;
      lV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = "" ;
      H028H2_A5555Lb_opcion = new String[] {""} ;
      H028H2_A5532Lb_numero = new int[1] ;
      H028H2_A11363PrdGots = new String[] {""} ;
      H028H2_A11663PrdCtw4 = new String[] {""} ;
      H028H2_A10938PrdCtw3 = new String[] {""} ;
      H028H2_A10937PrdCtw2 = new String[] {""} ;
      H028H2_A10936PrdCtw1 = new String[] {""} ;
      H028H2_A14096Lb_fibra = new String[] {""} ;
      H028H2_A14094PrdFibra = new String[] {""} ;
      H028H2_n14094PrdFibra = new boolean[] {false} ;
      H028H2_A488ForPrdDsc = new String[] {""} ;
      H028H2_n488ForPrdDsc = new boolean[] {false} ;
      H028H2_A490ForPrdUMe = new byte[1] ;
      H028H2_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H028H2_A718PrdNom = new String[] {""} ;
      H028H2_A5557Lb_LineaC = new short[1] ;
      H028H2_A719PrdNum = new String[] {""} ;
      H028H2_A396EmprCod = new String[] {""} ;
      H028H3_A5555Lb_opcion = new String[] {""} ;
      H028H3_A5532Lb_numero = new int[1] ;
      H028H3_A11363PrdGots = new String[] {""} ;
      H028H3_A11663PrdCtw4 = new String[] {""} ;
      H028H3_A10938PrdCtw3 = new String[] {""} ;
      H028H3_A10937PrdCtw2 = new String[] {""} ;
      H028H3_A10936PrdCtw1 = new String[] {""} ;
      H028H3_A14096Lb_fibra = new String[] {""} ;
      H028H3_A14094PrdFibra = new String[] {""} ;
      H028H3_n14094PrdFibra = new boolean[] {false} ;
      H028H3_A488ForPrdDsc = new String[] {""} ;
      H028H3_n488ForPrdDsc = new boolean[] {false} ;
      H028H3_A490ForPrdUMe = new byte[1] ;
      H028H3_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H028H3_A718PrdNom = new String[] {""} ;
      H028H3_A5557Lb_LineaC = new short[1] ;
      H028H3_A719PrdNum = new String[] {""} ;
      H028H3_A396EmprCod = new String[] {""} ;
      AV66TotValueLB_CantC = "" ;
      hsh = "" ;
      AV52EmprNom = "" ;
      AV53UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV68ForPrdDsccontrol = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      AV71mensaje = "" ;
      ucDvelop_confirmpanel_cerrar = new com.genexus.webpanels.GXUserControl();
      GXv_int12 = new int[1] ;
      AV58Lb_costec = DecimalUtil.ZERO ;
      GXv_int14 = new int[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int8 = new short[1] ;
      AV15Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char22 = "" ;
      GXt_char20 = "" ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_SdtWWPGridState26 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      H028H4_A5555Lb_opcion = new String[] {""} ;
      H028H4_A5532Lb_numero = new int[1] ;
      H028H4_A11363PrdGots = new String[] {""} ;
      H028H4_A14096Lb_fibra = new String[] {""} ;
      H028H4_A14094PrdFibra = new String[] {""} ;
      H028H4_n14094PrdFibra = new boolean[] {false} ;
      H028H4_A488ForPrdDsc = new String[] {""} ;
      H028H4_n488ForPrdDsc = new boolean[] {false} ;
      H028H4_A490ForPrdUMe = new byte[1] ;
      H028H4_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H028H4_A718PrdNom = new String[] {""} ;
      H028H4_A5557Lb_LineaC = new short[1] ;
      H028H4_A719PrdNum = new String[] {""} ;
      H028H4_A396EmprCod = new String[] {""} ;
      GXt_char24 = "" ;
      H028H5_A396EmprCod = new String[] {""} ;
      H028H5_A856ValCod = new byte[1] ;
      H028H5_A13747PrdCDsc = new String[] {""} ;
      H028H5_A719PrdNum = new String[] {""} ;
      H028H5_A718PrdNom = new String[] {""} ;
      A13747PrdCDsc = "" ;
      AV46Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char21 = new String[1] ;
      H028H6_A719PrdNum = new String[] {""} ;
      H028H6_A396EmprCod = new String[] {""} ;
      H028H6_A4338PrdUMeFo = new byte[1] ;
      GXv_char25 = new String[1] ;
      GXv_int27 = new byte[1] ;
      GXv_char23 = new String[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      imgPrompt_forprdume_gximage = "" ;
      sImgUrl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayoslaboratoriocolorantes_wp__default(),
         new Object[] {
             new Object[] {
            H028H2_A5555Lb_opcion, H028H2_A5532Lb_numero, H028H2_A11363PrdGots, H028H2_A11663PrdCtw4, H028H2_A10938PrdCtw3, H028H2_A10937PrdCtw2, H028H2_A10936PrdCtw1, H028H2_A14096Lb_fibra, H028H2_A14094PrdFibra, H028H2_n14094PrdFibra,
            H028H2_A488ForPrdDsc, H028H2_n488ForPrdDsc, H028H2_A490ForPrdUMe, H028H2_A5558LB_CantC, H028H2_A718PrdNom, H028H2_A5557Lb_LineaC, H028H2_A719PrdNum, H028H2_A396EmprCod
            }
            , new Object[] {
            H028H3_A5555Lb_opcion, H028H3_A5532Lb_numero, H028H3_A11363PrdGots, H028H3_A11663PrdCtw4, H028H3_A10938PrdCtw3, H028H3_A10937PrdCtw2, H028H3_A10936PrdCtw1, H028H3_A14096Lb_fibra, H028H3_A14094PrdFibra, H028H3_n14094PrdFibra,
            H028H3_A488ForPrdDsc, H028H3_n488ForPrdDsc, H028H3_A490ForPrdUMe, H028H3_A5558LB_CantC, H028H3_A718PrdNom, H028H3_A5557Lb_LineaC, H028H3_A719PrdNum, H028H3_A396EmprCod
            }
            , new Object[] {
            H028H4_A5555Lb_opcion, H028H4_A5532Lb_numero, H028H4_A11363PrdGots, H028H4_A14096Lb_fibra, H028H4_A14094PrdFibra, H028H4_n14094PrdFibra, H028H4_A488ForPrdDsc, H028H4_n488ForPrdDsc, H028H4_A490ForPrdUMe, H028H4_A5558LB_CantC,
            H028H4_A718PrdNom, H028H4_A5557Lb_LineaC, H028H4_A719PrdNum, H028H4_A396EmprCod
            }
            , new Object[] {
            H028H5_A396EmprCod, H028H5_A856ValCod, H028H5_A13747PrdCDsc, H028H5_A719PrdNum, H028H5_A718PrdNom
            }
            , new Object[] {
            H028H6_A719PrdNum, H028H6_A396EmprCod, H028H6_A4338PrdUMeFo
            }
         }
      );
      AV74Pgmname = "GestionLaboratorio.EntradaEnsayosLaboratorioColorantes_WP" ;
      /* GeneXus formulas. */
      AV74Pgmname = "GestionLaboratorio.EntradaEnsayosLaboratorioColorantes_WP" ;
      Gx_err = (short)(0) ;
      edtavLb_numero_Enabled = 0 ;
      edtavLb_opcion_Enabled = 0 ;
      edtavForprddsc_Enabled = 0 ;
      edtavTotvaluelb_cantc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV20TFForPrdUMe ;
   private byte AV21TFForPrdUMe_To ;
   private byte gxajaxcallmode ;
   private byte A4338PrdUMeFo ;
   private byte AV44Lb_PTinC ;
   private byte A490ForPrdUMe ;
   private byte nDonePA ;
   private byte AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ;
   private byte AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV41ForPrdUMe ;
   private byte GXt_int9 ;
   private byte A856ValCod ;
   private byte GXv_int10[] ;
   private byte GXv_int27[] ;
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
   private short AV16TFLb_LineaC ;
   private short AV17TFLb_LineaC_To ;
   private short AV12OrderedBy ;
   private short AV56Moda21 ;
   private short AV64Lb_LineaC_Selected ;
   private short wbEnd ;
   private short wbStart ;
   private short AV38Lb_LineaC ;
   private short AV60GridActionGroup1 ;
   private short A5557Lb_LineaC ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ;
   private short AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ;
   private short AV57fibracolorante ;
   private short AV59Coste_cor ;
   private short GXt_int7 ;
   private short GXv_int8[] ;
   private short AV67Acciongridmodificar ;
   private int wcpOAV48Lb_numero ;
   private int edtPrdGots_Visible ;
   private int edtPrdCtwSt_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_92 ;
   private int AV48Lb_numero ;
   private int nGXsfl_92_idx=1 ;
   private int A5532Lb_numero ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavLb_numero_Enabled ;
   private int edtavLb_opcion_Enabled ;
   private int edtavLb_lineac_Enabled ;
   private int edtavLb_cantc_Enabled ;
   private int edtavForprddsc_Enabled ;
   private int edtavLb_fibra_Enabled ;
   private int edtavLb_ptinc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavPrdnum_Visible ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluelb_cantc_Enabled ;
   private int edtavForprdume_Enabled ;
   private int AV35PageToGo ;
   private int GXv_int12[] ;
   private int GXv_int14[] ;
   private int AV95GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV36GridCurrentPage ;
   private long AV37GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV50Lb_Rb ;
   private java.math.BigDecimal AV50Lb_Rb ;
   private java.math.BigDecimal AV24TFLB_CantC ;
   private java.math.BigDecimal AV25TFLB_CantC_To ;
   private java.math.BigDecimal AV65TotLB_CantC ;
   private java.math.BigDecimal AV40LB_CantC ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ;
   private java.math.BigDecimal AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ;
   private java.math.BigDecimal AV58Lb_costec ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private String wcpOAV47EmprCod ;
   private String wcpOAV49Lb_opcion ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Dvelop_confirmpanel_cerrar_Result ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV47EmprCod ;
   private String AV49Lb_opcion ;
   private String sGXsfl_92_idx="0001" ;
   private String edtPrdGots_Internalname ;
   private String edtPrdCtwSt_Internalname ;
   private String AV18TFPrdNum ;
   private String AV19TFPrdNum_Sel ;
   private String AV61TFPrdNom ;
   private String AV62TFPrdNom_Sel ;
   private String AV22TFForPrdDsc ;
   private String AV23TFForPrdDsc_Sel ;
   private String AV69TFPrdFibra ;
   private String AV70TFPrdFibra_Sel ;
   private String AV28TFLb_fibra ;
   private String AV29TFLb_fibra_Sel ;
   private String AV30TFPrdGots ;
   private String AV31TFPrdGots_Sel ;
   private String AV74Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A5555Lb_opcion ;
   private String AV51Station ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
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
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavLb_numero_Internalname ;
   private String edtavLb_numero_Jsonclick ;
   private String edtavLb_opcion_Internalname ;
   private String edtavLb_opcion_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavLb_lineac_Internalname ;
   private String TempTags ;
   private String edtavLb_lineac_Jsonclick ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Internalname ;
   private String edtavLb_cantc_Internalname ;
   private String edtavLb_cantc_Jsonclick ;
   private String divTablesplittedforprdume_Internalname ;
   private String lblTextblockforprdume_Internalname ;
   private String lblTextblockforprdume_Jsonclick ;
   private String edtavForprddsc_Internalname ;
   private String AV42ForPrdDsc ;
   private String edtavForprddsc_Jsonclick ;
   private String edtavLb_fibra_Internalname ;
   private String AV43Lb_fibra ;
   private String edtavLb_fibra_Jsonclick ;
   private String edtavLb_ptinc_Internalname ;
   private String edtavLb_ptinc_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnlimpiarvariables_Internalname ;
   private String bttBtnlimpiarvariables_Jsonclick ;
   private String bttBtnproductosvariables_Internalname ;
   private String bttBtnproductosvariables_Jsonclick ;
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
   private String AV39PrdNum ;
   private String edtavPrdnum_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtLb_LineaC_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtLB_CantC_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String A14094PrdFibra ;
   private String edtPrdFibra_Internalname ;
   private String A14096Lb_fibra ;
   private String edtLb_fibra_Internalname ;
   private String A10936PrdCtw1 ;
   private String edtPrdCtw1_Internalname ;
   private String A10937PrdCtw2 ;
   private String edtPrdCtw2_Internalname ;
   private String A10938PrdCtw3 ;
   private String edtPrdCtw3_Internalname ;
   private String A11663PrdCtw4 ;
   private String edtPrdCtw4_Internalname ;
   private String A11363PrdGots ;
   private String edtavTotvaluelb_cantc_Internalname ;
   private String imgPrompt_forprdume_Link ;
   private String imgPrompt_forprdume_Internalname ;
   private String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ;
   private String AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ;
   private String AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ;
   private String AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ;
   private String AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ;
   private String AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ;
   private String AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ;
   private String AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ;
   private String AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ;
   private String AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ;
   private String AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ;
   private String AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ;
   private String scmdbuf ;
   private String lV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ;
   private String lV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ;
   private String lV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ;
   private String lV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ;
   private String lV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ;
   private String lV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ;
   private String edtavForprdume_Internalname ;
   private String hsh ;
   private String AV52EmprNom ;
   private String AV53UsurCod ;
   private String edtLb_LineaC_Columnheaderclass ;
   private String edtPrdNum_Columnheaderclass ;
   private String edtPrdNom_Columnheaderclass ;
   private String edtLB_CantC_Columnheaderclass ;
   private String edtForPrdUMe_Columnheaderclass ;
   private String edtForPrdDsc_Columnheaderclass ;
   private String edtPrdFibra_Columnheaderclass ;
   private String edtLb_fibra_Columnheaderclass ;
   private String edtPrdGots_Columnheaderclass ;
   private String edtPrdCtwSt_Columnheaderclass ;
   private String edtLb_LineaC_Columnclass ;
   private String edtPrdNum_Columnclass ;
   private String edtPrdNom_Columnclass ;
   private String edtLB_CantC_Columnclass ;
   private String edtForPrdUMe_Columnclass ;
   private String edtForPrdDsc_Columnclass ;
   private String edtPrdFibra_Columnclass ;
   private String edtLb_fibra_Columnclass ;
   private String edtPrdGots_Columnclass ;
   private String edtPrdCtwSt_Columnclass ;
   private String AV68ForPrdDsccontrol ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_cerrar_Internalname ;
   private String GXt_char22 ;
   private String GXt_char20 ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char24 ;
   private String GXv_char21[] ;
   private String GXv_char25[] ;
   private String GXv_char23[] ;
   private String tblTabledvelop_confirmpanel_cerrar_Internalname ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluelb_cantc_Jsonclick ;
   private String tblTablemergedforprdume_Internalname ;
   private String edtavForprdume_Jsonclick ;
   private String imgPrompt_forprdume_gximage ;
   private String sImgUrl ;
   private String sGXsfl_92_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtLb_LineaC_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtLB_CantC_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtPrdFibra_Jsonclick ;
   private String edtLb_fibra_Jsonclick ;
   private String edtPrdCtw1_Jsonclick ;
   private String edtPrdCtw2_Jsonclick ;
   private String edtPrdCtw3_Jsonclick ;
   private String edtPrdCtw4_Jsonclick ;
   private String edtPrdGots_Jsonclick ;
   private String edtPrdCtwSt_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_92_Refreshing=false ;
   private boolean AV13OrderedDsc ;
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
   private boolean n14094PrdFibra ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV32TFPrdCtwSt ;
   private String AV33TFPrdCtwSt_Sel ;
   private String A14097PrdCtwSt ;
   private String AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ;
   private String AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ;
   private String AV66TotValueLB_CantC ;
   private String AV71mensaje ;
   private String A13747PrdCDsc ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_cerrar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private String[] H028H2_A5555Lb_opcion ;
   private int[] H028H2_A5532Lb_numero ;
   private String[] H028H2_A11363PrdGots ;
   private String[] H028H2_A11663PrdCtw4 ;
   private String[] H028H2_A10938PrdCtw3 ;
   private String[] H028H2_A10937PrdCtw2 ;
   private String[] H028H2_A10936PrdCtw1 ;
   private String[] H028H2_A14096Lb_fibra ;
   private String[] H028H2_A14094PrdFibra ;
   private boolean[] H028H2_n14094PrdFibra ;
   private String[] H028H2_A488ForPrdDsc ;
   private boolean[] H028H2_n488ForPrdDsc ;
   private byte[] H028H2_A490ForPrdUMe ;
   private java.math.BigDecimal[] H028H2_A5558LB_CantC ;
   private String[] H028H2_A718PrdNom ;
   private short[] H028H2_A5557Lb_LineaC ;
   private String[] H028H2_A719PrdNum ;
   private String[] H028H2_A396EmprCod ;
   private String[] H028H3_A5555Lb_opcion ;
   private int[] H028H3_A5532Lb_numero ;
   private String[] H028H3_A11363PrdGots ;
   private String[] H028H3_A11663PrdCtw4 ;
   private String[] H028H3_A10938PrdCtw3 ;
   private String[] H028H3_A10937PrdCtw2 ;
   private String[] H028H3_A10936PrdCtw1 ;
   private String[] H028H3_A14096Lb_fibra ;
   private String[] H028H3_A14094PrdFibra ;
   private boolean[] H028H3_n14094PrdFibra ;
   private String[] H028H3_A488ForPrdDsc ;
   private boolean[] H028H3_n488ForPrdDsc ;
   private byte[] H028H3_A490ForPrdUMe ;
   private java.math.BigDecimal[] H028H3_A5558LB_CantC ;
   private String[] H028H3_A718PrdNom ;
   private short[] H028H3_A5557Lb_LineaC ;
   private String[] H028H3_A719PrdNum ;
   private String[] H028H3_A396EmprCod ;
   private String[] H028H4_A5555Lb_opcion ;
   private int[] H028H4_A5532Lb_numero ;
   private String[] H028H4_A11363PrdGots ;
   private String[] H028H4_A14096Lb_fibra ;
   private String[] H028H4_A14094PrdFibra ;
   private boolean[] H028H4_n14094PrdFibra ;
   private String[] H028H4_A488ForPrdDsc ;
   private boolean[] H028H4_n488ForPrdDsc ;
   private byte[] H028H4_A490ForPrdUMe ;
   private java.math.BigDecimal[] H028H4_A5558LB_CantC ;
   private String[] H028H4_A718PrdNom ;
   private short[] H028H4_A5557Lb_LineaC ;
   private String[] H028H4_A719PrdNum ;
   private String[] H028H4_A396EmprCod ;
   private String[] H028H5_A396EmprCod ;
   private byte[] H028H5_A856ValCod ;
   private String[] H028H5_A13747PrdCDsc ;
   private String[] H028H5_A719PrdNum ;
   private String[] H028H5_A718PrdNom ;
   private String[] H028H6_A719PrdNum ;
   private String[] H028H6_A396EmprCod ;
   private byte[] H028H6_A4338PrdUMeFo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV45PrdNum_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState26[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV34DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV46Combo_DataItem ;
}

final  class entradaensayoslaboratoriocolorantes_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H028H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ,
                                          short AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ,
                                          String AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                          String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                          String AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                          String AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                          java.math.BigDecimal AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                          byte AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ,
                                          byte AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ,
                                          String AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                          String AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                          String AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                          String AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                          String AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                          String AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                          String AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                          String AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                          short A5557Lb_LineaC ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5558LB_CantC ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A14094PrdFibra ,
                                          String A14096Lb_fibra ,
                                          String A11363PrdGots ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                          String AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String AV47EmprCod ,
                                          int AV48Lb_numero ,
                                          String AV49Lb_opcion ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[21];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T2.PrdGots, T2.PrdCtw4, T2.PrdCtw3, T2.PrdCtw2, T2.PrdCtw1, T1.Lb_fibra, T2.PrdFibra, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantC," ;
      scmdbuf += " T2.PrdNom, T1.Lb_LineaC, T1.PrdNum, T1.EmprCod FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ?)");
      if ( ! (0==AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC >= ?)");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC <= ?)");
      }
      else
      {
         GXv_int28[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int28[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC >= ?)");
      }
      else
      {
         GXv_int28[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC <= ?)");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int28[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) && ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdFibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFibra = ?)");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) && ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_fibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_fibra = ?)");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdGots = ?)");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_LineaC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_LineaC DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LB_CantC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LB_CantC DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdFibra" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdFibra DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_fibra" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_fibra DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdGots DESC" ;
      }
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_H028H3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ,
                                          short AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ,
                                          String AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                          String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                          String AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                          String AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                          java.math.BigDecimal AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                          byte AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ,
                                          byte AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ,
                                          String AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                          String AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                          String AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                          String AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                          String AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                          String AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                          String AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                          String AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                          short A5557Lb_LineaC ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5558LB_CantC ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A14094PrdFibra ,
                                          String A14096Lb_fibra ,
                                          String A11363PrdGots ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                          String AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String AV47EmprCod ,
                                          int AV48Lb_numero ,
                                          String AV49Lb_opcion ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[21];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T2.PrdGots, T2.PrdCtw4, T2.PrdCtw3, T2.PrdCtw2, T2.PrdCtw1, T1.Lb_fibra, T2.PrdFibra, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantC," ;
      scmdbuf += " T2.PrdNom, T1.Lb_LineaC, T1.PrdNum, T1.EmprCod FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ?)");
      if ( ! (0==AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC >= ?)");
      }
      else
      {
         GXv_int30[3] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC <= ?)");
      }
      else
      {
         GXv_int30[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int30[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int30[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC >= ?)");
      }
      else
      {
         GXv_int30[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC <= ?)");
      }
      else
      {
         GXv_int30[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int30[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int30[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int30[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) && ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdFibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFibra = ?)");
      }
      else
      {
         GXv_int30[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) && ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_fibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_fibra = ?)");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdGots = ?)");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_LineaC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_LineaC DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LB_CantC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LB_CantC DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdFibra" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdFibra DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_fibra" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_fibra DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdGots" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdGots DESC" ;
      }
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
   }

   protected Object[] conditional_H028H4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ,
                                          short AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ,
                                          String AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                          String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                          String AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                          String AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                          java.math.BigDecimal AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                          byte AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ,
                                          byte AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ,
                                          String AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                          String AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                          String AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                          String AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                          String AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                          String AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                          String AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                          String AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                          short A5557Lb_LineaC ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5558LB_CantC ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A14094PrdFibra ,
                                          String A14096Lb_fibra ,
                                          String A11363PrdGots ,
                                          String AV94Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                          String AV93Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String AV47EmprCod ,
                                          int AV48Lb_numero ,
                                          String AV49Lb_opcion ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[21];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T2.PrdGots, T1.Lb_fibra, T2.PrdFibra, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantC, T2.PrdNom, T1.Lb_LineaC, T1.PrdNum, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ?)");
      if ( ! (0==AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC >= ?)");
      }
      else
      {
         GXv_int32[3] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC <= ?)");
      }
      else
      {
         GXv_int32[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC >= ?)");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC <= ?)");
      }
      else
      {
         GXv_int32[10] = (byte)(1) ;
      }
      if ( ! (0==AV83Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int32[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int32[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) && ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdFibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFibra = ?)");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) && ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_fibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_fibra = ?)");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdGots = ?)");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
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
                  return conditional_H028H2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] );
            case 1 :
                  return conditional_H028H3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] );
            case 2 :
                  return conditional_H028H4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H028H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028H3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028H4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028H5", "SELECT EmprCod, ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom FROM TXPPRODUC WHERE ValCod >= 1 and ValCod <= 2 and SUBSTR(PrdNum, 1, 1) <> '#' and SUBSTR(PrdNum, 1, 1) <> 'C' ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028H6", "SELECT PrdNum, EmprCod, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((String[]) buf[17])[0] = rslt.getString(16, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((String[]) buf[17])[0] = rslt.getString(16, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

