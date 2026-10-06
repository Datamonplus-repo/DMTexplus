package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class precioporarticulo_wkp_impl extends GXDataArea
{
   public precioporarticulo_wkp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public precioporarticulo_wkp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporarticulo_wkp_impl.class ));
   }

   public precioporarticulo_wkp_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavIntpredef = UIFactory.getCheckbox(this);
      cmbavGridactions = new HTMLChoice();
      chkIntAct = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
            AV11emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11emprcod", AV11emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV7CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CliCod), "ZZZZZ9")));
               AV8CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8CliNom", AV8CliNom);
               AV5ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5ArtCod", AV5ArtCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5ArtCod, ""))));
               AV6ArtDsc = httpContext.GetPar( "ArtDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6ArtDsc", AV6ArtDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6ArtDsc, ""))));
               AV44TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TipColCod), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44TipColCod), "Z9")));
               AV45TipColDsc = httpContext.GetPar( "TipColDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45TipColDsc", AV45TipColDsc);
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
      nRC_GXsfl_98 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_98"))) ;
      nGXsfl_98_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_98_idx"))) ;
      sGXsfl_98_idx = httpContext.GetPar( "sGXsfl_98_idx") ;
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
      AV11emprcod = httpContext.GetPar( "emprcod") ;
      AV7CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV5ArtCod = httpContext.GetPar( "ArtCod") ;
      AV44TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV34TFIntCod = (byte)(GXutil.lval( httpContext.GetPar( "TFIntCod"))) ;
      AV35TFIntCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFIntCod_To"))) ;
      AV36TFIntDsc = httpContext.GetPar( "TFIntDsc") ;
      AV37TFIntDsc_Sel = httpContext.GetPar( "TFIntDsc_Sel") ;
      AV33TFIntAct_Sel = httpContext.GetPar( "TFIntAct_Sel") ;
      AV40TFIntPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFIntPreKgm"), ".") ;
      AV41TFIntPreKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFIntPreKgm_To"), ".") ;
      AV42TFIntPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFIntPreMtr"), ".") ;
      AV43TFIntPreMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFIntPreMtr_To"), ".") ;
      AV38TFIntPreDef = httpContext.GetPar( "TFIntPreDef") ;
      AV39TFIntPreDef_Sel = httpContext.GetPar( "TFIntPreDef_Sel") ;
      AV52Pgmname = httpContext.GetPar( "Pgmname") ;
      AV27OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV28OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV23IntPreDef = httpContext.GetPar( "IntPreDef") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      A65ArtCod = httpContext.GetPar( "ArtCod") ;
      A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV6ArtDsc = httpContext.GetPar( "ArtDsc") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV11emprcod, AV7CliCod, AV5ArtCod, AV44TipColCod, AV34TFIntCod, AV35TFIntCod_To, AV36TFIntDsc, AV37TFIntDsc_Sel, AV33TFIntAct_Sel, AV40TFIntPreKgm, AV41TFIntPreKgm_To, AV42TFIntPreMtr, AV43TFIntPreMtr_To, AV38TFIntPreDef, AV39TFIntPreDef_Sel, AV52Pgmname, AV27OrderedBy, AV28OrderedDsc, AV23IntPreDef, A396EmprCod, A252CliCod, A65ArtCod, A831TipColCod, AV6ArtDsc) ;
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
      pa2C62( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2C62( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.precioporarticulo_wkp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8CliNom)),GXutil.URLEncode(GXutil.rtrim(AV5ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV6ArtDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV44TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV45TipColDsc))}, new String[] {"emprcod","CliCod","CliNom","ArtCod","ArtDsc","TipColCod","TipColDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A65ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6ArtDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44TipColCod), "Z9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporArticulo_WKP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV52Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precioporarticulo_wkp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_98", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_98, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV14GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV15GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV10DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV10DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTCOD", GXutil.ltrim( localUtil.ntoc( AV34TFIntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV35TFIntCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTDSC", GXutil.rtrim( AV36TFIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTDSC_SEL", GXutil.rtrim( AV37TFIntDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTACT_SEL", GXutil.rtrim( AV33TFIntAct_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTPREKGM", GXutil.ltrim( localUtil.ntoc( AV40TFIntPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTPREKGM_TO", GXutil.ltrim( localUtil.ntoc( AV41TFIntPreKgm_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTPREMTR", GXutil.ltrim( localUtil.ntoc( AV42TFIntPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTPREMTR_TO", GXutil.ltrim( localUtil.ntoc( AV43TFIntPreMtr_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTPREDEF", GXutil.rtrim( AV38TFIntPreDef));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTPREDEF_SEL", GXutil.rtrim( AV39TFIntPreDef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV27OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV28OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A65ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV11emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV64Emprcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV65Clicod_selected, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD_SELECTED", GXutil.rtrim( AV66Artcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV67Tipcolcod_selected, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV68Intcod_selected, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
         we2C62( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2C62( ) ;
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
      return formatLink("app.facturacion.precioporarticulo_wkp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8CliNom)),GXutil.URLEncode(GXutil.rtrim(AV5ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV6ArtDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV44TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV45TipColDsc))}, new String[] {"emprcod","CliCod","CliNom","ArtCod","ArtDsc","TipColCod","TipColDsc"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.PrecioporArticulo_WKP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Precio por Articulo, Intensidades", "") ;
   }

   public void wb2C60( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV7CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV8CliNom), GXutil.rtrim( localUtil.format( AV8CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_Internalname, GXutil.rtrim( AV5ArtCod), GXutil.rtrim( localUtil.format( AV5ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtdsc_Internalname, GXutil.rtrim( AV6ArtDsc), GXutil.rtrim( localUtil.format( AV6ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolcod_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV44TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV44TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV44TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcoldsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcoldsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcoldsc_Internalname, GXutil.rtrim( AV45TipColDsc), GXutil.rtrim( localUtil.format( AV45TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcoldsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcoldsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncopiarprecios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 98, 2, 0)+","+"null"+");", httpContext.getMessage( "Copiar Precios", ""), bttBtncopiarprecios_Jsonclick, 5, httpContext.getMessage( "Copiar Precios", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCOPIARPRECIOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntcod_Internalname, httpContext.getMessage( "Intensidad", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_98_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV20IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20IntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV20IntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntcod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "CellMarginTop25" + " " + ((GXutil.strcmp(imgUseraction1_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgUseraction1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgUseraction1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgUseraction1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_98_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntdsc_Internalname, GXutil.rtrim( AV22IntDsc), GXutil.rtrim( localUtil.format( AV22IntDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntdsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntprekgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntprekgm_Internalname, httpContext.getMessage( "Precio Kg", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_98_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntprekgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV24IntPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntprekgm_Enabled!=0) ? localUtil.format( AV24IntPreKgm, "ZZZZZZ9.999") : localUtil.format( AV24IntPreKgm, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntprekgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntprekgm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntpremtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntpremtr_Internalname, httpContext.getMessage( "Precio Mt", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_98_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntpremtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV25IntPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntpremtr_Enabled!=0) ? localUtil.format( AV25IntPreMtr, "ZZZZZZ9.999") : localUtil.format( AV25IntPreMtr, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntpremtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntpremtr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavIntpredef.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavIntpredef.getInternalname(), httpContext.getMessage( "D?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_98_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavIntpredef.getInternalname(), AV23IntPreDef, "", httpContext.getMessage( "D?", ""), 1, chkavIntpredef.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(74, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,74);\"");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 98, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiarvariables_Internalname, "gx.evt.setGridEvt("+GXutil.str( 98, 2, 0)+","+"null"+");", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiarvariables_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIARVARIABLES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 98, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTxtmensaje_Internalname, lblTxtmensaje_Caption, "", "", lblTxtmensaje_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
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
         startgridcontrol98( ) ;
      }
      if ( wbEnd == 98 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_98 = (int)(nGXsfl_98_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV52Pgmname), GXutil.rtrim( localUtil.format( AV52Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporArticulo_WKP.htm");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_120_2C62( true) ;
      }
      else
      {
         wb_table1_120_2C62( false) ;
      }
      return  ;
   }

   public void wb_table1_120_2C62e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_125_2C62( true) ;
      }
      else
      {
         wb_table2_125_2C62( false) ;
      }
      return  ;
   }

   public void wb_table2_125_2C62e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 98 )
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

   public void start2C62( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Precio por Articulo, Intensidades", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2C60( ) ;
   }

   public void ws2C62( )
   {
      start2C62( ) ;
      evt2C62( ) ;
   }

   public void evt2C62( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112C62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122C62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132C62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142C62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152C62 ();
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
                                 e162C62 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIARVARIABLES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiarVariables' */
                           e172C62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e182C62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e192C62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCOPIARPRECIOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCopiarPrecios' */
                           e202C62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VINTCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e212C62 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_98_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_98_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_98_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_982( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV13GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridActions), 4, 0));
                           A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
                           n584IntDsc = false ;
                           A14255IntAct = ((GXutil.strcmp(httpContext.cgiGet( chkIntAct.getInternalname()), "S")==0) ? "S" : "N") ;
                           A586IntPreKgm = localUtil.ctond( httpContext.cgiGet( edtIntPreKgm_Internalname)) ;
                           n586IntPreKgm = false ;
                           A587IntPreMtr = localUtil.ctond( httpContext.cgiGet( edtIntPreMtr_Internalname)) ;
                           n587IntPreMtr = false ;
                           A585IntPreDef = GXutil.upper( httpContext.cgiGet( edtIntPreDef_Internalname)) ;
                           n585IntPreDef = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e222C62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e232C62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242C62 ();
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

   public void we2C62( )
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

   public void pa2C62( )
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
            GX_FocusControl = edtavIntcod_Internalname ;
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
      subsflControlProps_982( ) ;
      while ( nGXsfl_98_idx <= nRC_GXsfl_98 )
      {
         sendrow_982( ) ;
         nGXsfl_98_idx = ((subGrid_Islastpage==1)&&(nGXsfl_98_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_98_idx+1) ;
         sGXsfl_98_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_98_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_982( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV11emprcod ,
                                 int AV7CliCod ,
                                 String AV5ArtCod ,
                                 byte AV44TipColCod ,
                                 byte AV34TFIntCod ,
                                 byte AV35TFIntCod_To ,
                                 String AV36TFIntDsc ,
                                 String AV37TFIntDsc_Sel ,
                                 String AV33TFIntAct_Sel ,
                                 java.math.BigDecimal AV40TFIntPreKgm ,
                                 java.math.BigDecimal AV41TFIntPreKgm_To ,
                                 java.math.BigDecimal AV42TFIntPreMtr ,
                                 java.math.BigDecimal AV43TFIntPreMtr_To ,
                                 String AV38TFIntPreDef ,
                                 String AV39TFIntPreDef_Sel ,
                                 String AV52Pgmname ,
                                 short AV27OrderedBy ,
                                 boolean AV28OrderedDsc ,
                                 String AV23IntPreDef ,
                                 String A396EmprCod ,
                                 int A252CliCod ,
                                 String A65ArtCod ,
                                 byte A831TipColCod ,
                                 String AV6ArtDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e232C62 ();
      GRID_nCurrentRecord = 0 ;
      rf2C62( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporArticulo_WKP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV52Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precioporarticulo_wkp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "INTCOD", GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")));
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
      AV23IntPreDef = ((GXutil.strcmp(GXutil.rtrim( AV23IntPreDef), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23IntPreDef", AV23IntPreDef);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2C62( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV52Pgmname = "Facturacion.PrecioporArticulo_WKP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Enabled), 5, 0), true);
      edtavArtdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtdsc_Enabled), 5, 0), true);
      edtavTipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod_Enabled), 5, 0), true);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), true);
      edtavIntdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntdsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2C62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(98) ;
      /* Execute user event: Refresh */
      e232C62 ();
      nGXsfl_98_idx = 1 ;
      sGXsfl_98_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_98_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_982( ) ;
      bGXsfl_98_Refreshing = true ;
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
         subsflControlProps_982( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(AV53Facturacion_precioporarticulo_wkpds_1_tfintcod) ,
                                              Byte.valueOf(AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to) ,
                                              AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel ,
                                              AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc ,
                                              AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel ,
                                              AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm ,
                                              AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to ,
                                              AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr ,
                                              AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to ,
                                              AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel ,
                                              AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef ,
                                              Byte.valueOf(A583IntCod) ,
                                              A584IntDsc ,
                                              A14255IntAct ,
                                              A586IntPreKgm ,
                                              A587IntPreMtr ,
                                              A585IntPreDef ,
                                              Short.valueOf(AV27OrderedBy) ,
                                              Boolean.valueOf(AV28OrderedDsc) ,
                                              AV11emprcod ,
                                              Integer.valueOf(AV7CliCod) ,
                                              AV5ArtCod ,
                                              Byte.valueOf(AV44TipColCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) ,
                                              A65ArtCod ,
                                              Byte.valueOf(A831TipColCod) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.BYTE
                                              }
         });
         lV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = GXutil.padr( GXutil.rtrim( AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc), 30, "%") ;
         lV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = GXutil.padr( GXutil.rtrim( AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef), 1, "%") ;
         /* Using cursor H02C62 */
         pr_default.execute(0, new Object[] {AV11emprcod, Integer.valueOf(AV7CliCod), AV5ArtCod, Byte.valueOf(AV44TipColCod), Byte.valueOf(AV53Facturacion_precioporarticulo_wkpds_1_tfintcod), Byte.valueOf(AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to), lV55Facturacion_precioporarticulo_wkpds_3_tfintdsc, AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel, AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel, AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm, AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to, AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr, AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to, lV62Facturacion_precioporarticulo_wkpds_10_tfintpredef, AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_98_idx = 1 ;
         sGXsfl_98_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_98_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_982( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H02C62_A396EmprCod[0] ;
            A252CliCod = H02C62_A252CliCod[0] ;
            A65ArtCod = H02C62_A65ArtCod[0] ;
            A831TipColCod = H02C62_A831TipColCod[0] ;
            A585IntPreDef = H02C62_A585IntPreDef[0] ;
            n585IntPreDef = H02C62_n585IntPreDef[0] ;
            A587IntPreMtr = H02C62_A587IntPreMtr[0] ;
            n587IntPreMtr = H02C62_n587IntPreMtr[0] ;
            A586IntPreKgm = H02C62_A586IntPreKgm[0] ;
            n586IntPreKgm = H02C62_n586IntPreKgm[0] ;
            A14255IntAct = H02C62_A14255IntAct[0] ;
            A584IntDsc = H02C62_A584IntDsc[0] ;
            n584IntDsc = H02C62_n584IntDsc[0] ;
            A583IntCod = H02C62_A583IntCod[0] ;
            A14255IntAct = H02C62_A14255IntAct[0] ;
            A584IntDsc = H02C62_A584IntDsc[0] ;
            n584IntDsc = H02C62_n584IntDsc[0] ;
            e242C62 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(98) ;
         wb2C60( ) ;
      }
      bGXsfl_98_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2C62( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A65ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INTCOD"+"_"+sGXsfl_98_idx, getSecureSignedToken( sGXsfl_98_idx, localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")));
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
      AV53Facturacion_precioporarticulo_wkpds_1_tfintcod = AV34TFIntCod ;
      AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to = AV35TFIntCod_To ;
      AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = AV36TFIntDsc ;
      AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = AV37TFIntDsc_Sel ;
      AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel = AV33TFIntAct_Sel ;
      AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm = AV40TFIntPreKgm ;
      AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = AV41TFIntPreKgm_To ;
      AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr = AV42TFIntPreMtr ;
      AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = AV43TFIntPreMtr_To ;
      AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = AV38TFIntPreDef ;
      AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = AV39TFIntPreDef_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV53Facturacion_precioporarticulo_wkpds_1_tfintcod) ,
                                           Byte.valueOf(AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to) ,
                                           AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel ,
                                           AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc ,
                                           AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel ,
                                           AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm ,
                                           AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to ,
                                           AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr ,
                                           AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to ,
                                           AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel ,
                                           AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           A14255IntAct ,
                                           A586IntPreKgm ,
                                           A587IntPreMtr ,
                                           A585IntPreDef ,
                                           Short.valueOf(AV27OrderedBy) ,
                                           Boolean.valueOf(AV28OrderedDsc) ,
                                           AV11emprcod ,
                                           Integer.valueOf(AV7CliCod) ,
                                           AV5ArtCod ,
                                           Byte.valueOf(AV44TipColCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           Byte.valueOf(A831TipColCod) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = GXutil.padr( GXutil.rtrim( AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc), 30, "%") ;
      lV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = GXutil.padr( GXutil.rtrim( AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef), 1, "%") ;
      /* Using cursor H02C63 */
      pr_default.execute(1, new Object[] {AV11emprcod, Integer.valueOf(AV7CliCod), AV5ArtCod, Byte.valueOf(AV44TipColCod), Byte.valueOf(AV53Facturacion_precioporarticulo_wkpds_1_tfintcod), Byte.valueOf(AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to), lV55Facturacion_precioporarticulo_wkpds_3_tfintdsc, AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel, AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel, AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm, AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to, AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr, AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to, lV62Facturacion_precioporarticulo_wkpds_10_tfintpredef, AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel});
      GRID_nRecordCount = H02C63_AGRID_nRecordCount[0] ;
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
      AV53Facturacion_precioporarticulo_wkpds_1_tfintcod = AV34TFIntCod ;
      AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to = AV35TFIntCod_To ;
      AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = AV36TFIntDsc ;
      AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = AV37TFIntDsc_Sel ;
      AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel = AV33TFIntAct_Sel ;
      AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm = AV40TFIntPreKgm ;
      AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = AV41TFIntPreKgm_To ;
      AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr = AV42TFIntPreMtr ;
      AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = AV43TFIntPreMtr_To ;
      AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = AV38TFIntPreDef ;
      AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = AV39TFIntPreDef_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV11emprcod, AV7CliCod, AV5ArtCod, AV44TipColCod, AV34TFIntCod, AV35TFIntCod_To, AV36TFIntDsc, AV37TFIntDsc_Sel, AV33TFIntAct_Sel, AV40TFIntPreKgm, AV41TFIntPreKgm_To, AV42TFIntPreMtr, AV43TFIntPreMtr_To, AV38TFIntPreDef, AV39TFIntPreDef_Sel, AV52Pgmname, AV27OrderedBy, AV28OrderedDsc, AV23IntPreDef, A396EmprCod, A252CliCod, A65ArtCod, A831TipColCod, AV6ArtDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV53Facturacion_precioporarticulo_wkpds_1_tfintcod = AV34TFIntCod ;
      AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to = AV35TFIntCod_To ;
      AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = AV36TFIntDsc ;
      AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = AV37TFIntDsc_Sel ;
      AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel = AV33TFIntAct_Sel ;
      AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm = AV40TFIntPreKgm ;
      AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = AV41TFIntPreKgm_To ;
      AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr = AV42TFIntPreMtr ;
      AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = AV43TFIntPreMtr_To ;
      AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = AV38TFIntPreDef ;
      AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = AV39TFIntPreDef_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV11emprcod, AV7CliCod, AV5ArtCod, AV44TipColCod, AV34TFIntCod, AV35TFIntCod_To, AV36TFIntDsc, AV37TFIntDsc_Sel, AV33TFIntAct_Sel, AV40TFIntPreKgm, AV41TFIntPreKgm_To, AV42TFIntPreMtr, AV43TFIntPreMtr_To, AV38TFIntPreDef, AV39TFIntPreDef_Sel, AV52Pgmname, AV27OrderedBy, AV28OrderedDsc, AV23IntPreDef, A396EmprCod, A252CliCod, A65ArtCod, A831TipColCod, AV6ArtDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV53Facturacion_precioporarticulo_wkpds_1_tfintcod = AV34TFIntCod ;
      AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to = AV35TFIntCod_To ;
      AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = AV36TFIntDsc ;
      AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = AV37TFIntDsc_Sel ;
      AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel = AV33TFIntAct_Sel ;
      AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm = AV40TFIntPreKgm ;
      AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = AV41TFIntPreKgm_To ;
      AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr = AV42TFIntPreMtr ;
      AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = AV43TFIntPreMtr_To ;
      AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = AV38TFIntPreDef ;
      AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = AV39TFIntPreDef_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV11emprcod, AV7CliCod, AV5ArtCod, AV44TipColCod, AV34TFIntCod, AV35TFIntCod_To, AV36TFIntDsc, AV37TFIntDsc_Sel, AV33TFIntAct_Sel, AV40TFIntPreKgm, AV41TFIntPreKgm_To, AV42TFIntPreMtr, AV43TFIntPreMtr_To, AV38TFIntPreDef, AV39TFIntPreDef_Sel, AV52Pgmname, AV27OrderedBy, AV28OrderedDsc, AV23IntPreDef, A396EmprCod, A252CliCod, A65ArtCod, A831TipColCod, AV6ArtDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV53Facturacion_precioporarticulo_wkpds_1_tfintcod = AV34TFIntCod ;
      AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to = AV35TFIntCod_To ;
      AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = AV36TFIntDsc ;
      AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = AV37TFIntDsc_Sel ;
      AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel = AV33TFIntAct_Sel ;
      AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm = AV40TFIntPreKgm ;
      AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = AV41TFIntPreKgm_To ;
      AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr = AV42TFIntPreMtr ;
      AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = AV43TFIntPreMtr_To ;
      AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = AV38TFIntPreDef ;
      AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = AV39TFIntPreDef_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV11emprcod, AV7CliCod, AV5ArtCod, AV44TipColCod, AV34TFIntCod, AV35TFIntCod_To, AV36TFIntDsc, AV37TFIntDsc_Sel, AV33TFIntAct_Sel, AV40TFIntPreKgm, AV41TFIntPreKgm_To, AV42TFIntPreMtr, AV43TFIntPreMtr_To, AV38TFIntPreDef, AV39TFIntPreDef_Sel, AV52Pgmname, AV27OrderedBy, AV28OrderedDsc, AV23IntPreDef, A396EmprCod, A252CliCod, A65ArtCod, A831TipColCod, AV6ArtDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV53Facturacion_precioporarticulo_wkpds_1_tfintcod = AV34TFIntCod ;
      AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to = AV35TFIntCod_To ;
      AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = AV36TFIntDsc ;
      AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = AV37TFIntDsc_Sel ;
      AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel = AV33TFIntAct_Sel ;
      AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm = AV40TFIntPreKgm ;
      AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = AV41TFIntPreKgm_To ;
      AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr = AV42TFIntPreMtr ;
      AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = AV43TFIntPreMtr_To ;
      AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = AV38TFIntPreDef ;
      AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = AV39TFIntPreDef_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV11emprcod, AV7CliCod, AV5ArtCod, AV44TipColCod, AV34TFIntCod, AV35TFIntCod_To, AV36TFIntDsc, AV37TFIntDsc_Sel, AV33TFIntAct_Sel, AV40TFIntPreKgm, AV41TFIntPreKgm_To, AV42TFIntPreMtr, AV43TFIntPreMtr_To, AV38TFIntPreDef, AV39TFIntPreDef_Sel, AV52Pgmname, AV27OrderedBy, AV28OrderedDsc, AV23IntPreDef, A396EmprCod, A252CliCod, A65ArtCod, A831TipColCod, AV6ArtDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV52Pgmname = "Facturacion.PrecioporArticulo_WKP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Enabled), 5, 0), true);
      edtavArtdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtdsc_Enabled), 5, 0), true);
      edtavTipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod_Enabled), 5, 0), true);
      edtavTipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc_Enabled), 5, 0), true);
      edtavIntdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntdsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2C60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e222C62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV10DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_98 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_98"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV14GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV15GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV64Emprcod_selected = httpContext.cgiGet( "vEMPRCOD_SELECTED") ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         AV65Clicod_selected = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV66Artcod_selected = httpContext.cgiGet( "vARTCOD_SELECTED") ;
         A65ArtCod = httpContext.cgiGet( "ARTCOD") ;
         AV67Tipcolcod_selected = (byte)(localUtil.ctol( httpContext.cgiGet( "vTIPCOLCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "TIPCOLCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV68Intcod_selected = (byte)(localUtil.ctol( httpContext.cgiGet( "vINTCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
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
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCOD");
            GX_FocusControl = edtavIntcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20IntCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20IntCod), 2, 0));
         }
         else
         {
            AV20IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20IntCod), 2, 0));
         }
         AV22IntDsc = httpContext.cgiGet( edtavIntdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22IntDsc", AV22IntDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavIntprekgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavIntprekgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTPREKGM");
            GX_FocusControl = edtavIntprekgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24IntPreKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24IntPreKgm", GXutil.ltrimstr( AV24IntPreKgm, 13, 5));
         }
         else
         {
            AV24IntPreKgm = localUtil.ctond( httpContext.cgiGet( edtavIntprekgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24IntPreKgm", GXutil.ltrimstr( AV24IntPreKgm, 13, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavIntpremtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavIntpremtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTPREMTR");
            GX_FocusControl = edtavIntpremtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25IntPreMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25IntPreMtr", GXutil.ltrimstr( AV25IntPreMtr, 13, 5));
         }
         else
         {
            AV25IntPreMtr = localUtil.ctond( httpContext.cgiGet( edtavIntpremtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25IntPreMtr", GXutil.ltrimstr( AV25IntPreMtr, 13, 5));
         }
         AV23IntPreDef = ((GXutil.strcmp(httpContext.cgiGet( chkavIntpredef.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23IntPreDef", AV23IntPreDef);
         AV52Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporArticulo_WKP");
         AV52Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV52Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\precioporarticulo_wkp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e222C62 ();
      if (returnInSub) return;
   }

   public void e222C62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV32Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      precioporarticulo_wkp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Station = GXt_char1 ;
      GXv_char2[0] = AV11emprcod ;
      GXv_char3[0] = AV12EmprNom ;
      GXv_char4[0] = AV48UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV32Station, GXv_char2, GXv_char3, GXv_char4) ;
      precioporarticulo_wkp_impl.this.AV11emprcod = GXv_char2[0] ;
      precioporarticulo_wkp_impl.this.AV12EmprNom = GXv_char3[0] ;
      precioporarticulo_wkp_impl.this.AV48UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11emprcod", AV11emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Precio por Articulo, Intensidades", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV27OrderedBy < 1 )
      {
         AV27OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV10DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV10DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e232C62( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV49WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV49WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV14GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14GridCurrentPage), 10, 0));
      AV15GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridPageCount), 10, 0));
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "DisableFocus", "", new Object[] {imgUseraction1_Internalname});
      AV53Facturacion_precioporarticulo_wkpds_1_tfintcod = AV34TFIntCod ;
      AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to = AV35TFIntCod_To ;
      AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = AV36TFIntDsc ;
      AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = AV37TFIntDsc_Sel ;
      AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel = AV33TFIntAct_Sel ;
      AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm = AV40TFIntPreKgm ;
      AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = AV41TFIntPreKgm_To ;
      AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr = AV42TFIntPreMtr ;
      AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = AV43TFIntPreMtr_To ;
      AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = AV38TFIntPreDef ;
      AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = AV39TFIntPreDef_Sel ;
      /*  Sending Event outputs  */
   }

   public void e112C62( )
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

   public void e122C62( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132C62( )
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
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntCod") == 0 )
         {
            AV34TFIntCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFIntCod), 2, 0));
            AV35TFIntCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFIntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFIntCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntDsc") == 0 )
         {
            AV36TFIntDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFIntDsc", AV36TFIntDsc);
            AV37TFIntDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFIntDsc_Sel", AV37TFIntDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntAct") == 0 )
         {
            AV33TFIntAct_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFIntAct_Sel", AV33TFIntAct_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntPreKgm") == 0 )
         {
            AV40TFIntPreKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFIntPreKgm", GXutil.ltrimstr( AV40TFIntPreKgm, 13, 5));
            AV41TFIntPreKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFIntPreKgm_To", GXutil.ltrimstr( AV41TFIntPreKgm_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntPreMtr") == 0 )
         {
            AV42TFIntPreMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFIntPreMtr", GXutil.ltrimstr( AV42TFIntPreMtr, 13, 5));
            AV43TFIntPreMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFIntPreMtr_To", GXutil.ltrimstr( AV43TFIntPreMtr_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntPreDef") == 0 )
         {
            AV38TFIntPreDef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFIntPreDef", AV38TFIntPreDef);
            AV39TFIntPreDef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFIntPreDef_Sel", AV39TFIntPreDef_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e242C62( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(98) ;
      }
      sendrow_982( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_98_Refreshing )
      {
         httpContext.doAjaxLoad(98, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV13GridActions, 4, 0)) );
   }

   public void e142C62( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S162 ();
         if (returnInSub) return;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e162C62 ();
      if (returnInSub) return;
   }

   public void e162C62( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      if ( (0==AV20IntCod) )
      {
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavIntcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTxtmensaje_Caption = httpContext.getMessage( "Intensidad NO Valida", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      }
      else
      {
         GXv_char4[0] = AV22IntDsc ;
         GXv_char3[0] = AV19IntAct ;
         new app.facturacion.descripcionintensidad(remoteHandle, context).execute( AV11emprcod, AV20IntCod, GXv_char4, GXv_char3) ;
         precioporarticulo_wkp_impl.this.AV22IntDsc = GXv_char4[0] ;
         precioporarticulo_wkp_impl.this.AV19IntAct = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22IntDsc", AV22IntDsc);
         if ( GXutil.strcmp(AV22IntDsc, "Intensidad Inexistente") == 0 )
         {
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavIntcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            lblTxtmensaje_Caption = httpContext.getMessage( "Intensidad Inexistente", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
         }
         else
         {
            if ( GXutil.strcmp(AV19IntAct, "N") == 0 )
            {
               httpContext.doAjaxRefresh();
               GX_FocusControl = edtavIntcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               lblTxtmensaje_Caption = httpContext.getMessage( "Intensidad Inactiva", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
            }
            else
            {
               this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e152C62( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S172 ();
         if (returnInSub) return;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e172C62( )
   {
      /* 'DoLimpiarVariables' Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      /* Execute user subroutine: 'LIMPIARVARIABLES' */
      S182 ();
      if (returnInSub) return;
      GX_FocusControl = edtavIntcod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e182C62( )
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

   public void e192C62( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.tintensprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV20IntCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV22IntDsc))}, new String[] {"InOutEmprCod","InOutIntCod","InOutIntDsc"}) , new Object[] {"AV11emprcod","AV20IntCod","AV22IntDsc"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e202C62( )
   {
      /* 'DoCopiarPrecios' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.facturacion.copiarprecios_1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV5ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV6ArtDsc))}, new String[] {"emprcod","CliCod","ArtCod","ArtDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV27OrderedBy, 4, 0))+":"+(AV28OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      AV64Emprcod_selected = A396EmprCod ;
      AV65Clicod_selected = A252CliCod ;
      AV66Artcod_selected = A65ArtCod ;
      AV67Tipcolcod_selected = A831TipColCod ;
      AV68Intcod_selected = A583IntCod ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S162( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.facturacion.precioporarticulo_del(remoteHandle, context).execute( AV11emprcod, AV7CliCod, AV5ArtCod, AV44TipColCod, A583IntCod) ;
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      new app.facturacion.precioporarticulo_insupd(remoteHandle, context).execute( AV11emprcod, AV7CliCod, AV5ArtCod, AV44TipColCod, AV20IntCod, AV24IntPreKgm, AV25IntPreMtr, AV23IntPreDef) ;
      /* Execute user subroutine: 'LIMPIARVARIABLES' */
      S182 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue(AV52Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV52Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV31Session.getValue(AV52Pgmname+"GridState"), null, null);
      }
      AV27OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27OrderedBy), 4, 0));
      AV28OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28OrderedDsc", AV28OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV34TFIntCod = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFIntCod), 2, 0));
            AV35TFIntCod_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFIntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFIntCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV36TFIntDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFIntDsc", AV36TFIntDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV37TFIntDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFIntDsc_Sel", AV37TFIntDsc_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTACT_SEL") == 0 )
         {
            AV33TFIntAct_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFIntAct_Sel", AV33TFIntAct_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTPREKGM") == 0 )
         {
            AV40TFIntPreKgm = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFIntPreKgm", GXutil.ltrimstr( AV40TFIntPreKgm, 13, 5));
            AV41TFIntPreKgm_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFIntPreKgm_To", GXutil.ltrimstr( AV41TFIntPreKgm_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTPREMTR") == 0 )
         {
            AV42TFIntPreMtr = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFIntPreMtr", GXutil.ltrimstr( AV42TFIntPreMtr, 13, 5));
            AV43TFIntPreMtr_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFIntPreMtr_To", GXutil.ltrimstr( AV43TFIntPreMtr_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTPREDEF") == 0 )
         {
            AV38TFIntPreDef = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFIntPreDef", AV38TFIntPreDef);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTPREDEF_SEL") == 0 )
         {
            AV39TFIntPreDef_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFIntPreDef_Sel", AV39TFIntPreDef_Sel);
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFIntDsc_Sel)==0), AV37TFIntDsc_Sel, GXv_char4) ;
      precioporarticulo_wkp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFIntAct_Sel)==0), AV33TFIntAct_Sel, GXv_char3) ;
      precioporarticulo_wkp_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char9 = "" ;
      GXv_char2[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFIntPreDef_Sel)==0), AV39TFIntPreDef_Sel, GXv_char2) ;
      precioporarticulo_wkp_impl.this.GXt_char9 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char8+"|||"+GXt_char9 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char9 = "" ;
      GXv_char4[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFIntDsc)==0), AV36TFIntDsc, GXv_char4) ;
      precioporarticulo_wkp_impl.this.GXt_char9 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFIntPreDef)==0), AV38TFIntPreDef, GXv_char3) ;
      precioporarticulo_wkp_impl.this.GXt_char8 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV34TFIntCod) ? "" : GXutil.str( AV34TFIntCod, 2, 0))+"|"+GXt_char9+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFIntPreKgm)==0) ? "" : GXutil.str( AV40TFIntPreKgm, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFIntPreMtr)==0) ? "" : GXutil.str( AV42TFIntPreMtr, 13, 5))+"|"+GXt_char8 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV35TFIntCod_To) ? "" : GXutil.str( AV35TFIntCod_To, 2, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFIntPreKgm_To)==0) ? "" : GXutil.str( AV41TFIntPreKgm_To, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFIntPreMtr_To)==0) ? "" : GXutil.str( AV43TFIntPreMtr_To, 13, 5))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV16GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV16GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV16GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV31Session.getValue(AV52Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV27OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV28OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFINTCOD", "", !((0==AV34TFIntCod)&&(0==AV35TFIntCod_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFIntCod, 2, 0)), GXutil.trim( GXutil.str( AV35TFIntCod_To, 2, 0))) ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFINTDSC", "", !(GXutil.strcmp("", AV36TFIntDsc)==0), (short)(0), AV36TFIntDsc, "", !(GXutil.strcmp("", AV37TFIntDsc_Sel)==0), AV37TFIntDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFINTACT_SEL", "", !(GXutil.strcmp("", AV33TFIntAct_Sel)==0), (short)(0), AV33TFIntAct_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFINTPREKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFIntPreKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFIntPreKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFIntPreKgm, 13, 5)), GXutil.trim( GXutil.str( AV41TFIntPreKgm_To, 13, 5))) ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFINTPREMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFIntPreMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFIntPreMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFIntPreMtr, 13, 5)), GXutil.trim( GXutil.str( AV43TFIntPreMtr_To, 13, 5))) ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFINTPREDEF", "", !(GXutil.strcmp("", AV38TFIntPreDef)==0), (short)(0), AV38TFIntPreDef, "", !(GXutil.strcmp("", AV39TFIntPreDef_Sel)==0), AV39TFIntPreDef_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      AV16GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV16GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV52Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV46TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV46TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV52Pgmname );
      AV46TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV46TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV18HTTPRequest.getScriptName()+"?"+AV18HTTPRequest.getQuerystring() );
      AV46TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Facturacion.PrecioporArticulo_TRN" );
      AV31Session.setValue("TrnContext", AV46TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e212C62( )
   {
      /* Intcod_Isvalid Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      if ( (0==AV20IntCod) )
      {
         GX_FocusControl = edtavIntcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTxtmensaje_Caption = httpContext.getMessage( "Intensidad No Valida", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      }
      else
      {
         GXv_char4[0] = AV22IntDsc ;
         GXv_char3[0] = AV19IntAct ;
         new app.facturacion.descripcionintensidad(remoteHandle, context).execute( AV11emprcod, AV20IntCod, GXv_char4, GXv_char3) ;
         precioporarticulo_wkp_impl.this.AV22IntDsc = GXv_char4[0] ;
         precioporarticulo_wkp_impl.this.AV19IntAct = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22IntDsc", AV22IntDsc);
         if ( GXutil.strcmp(AV22IntDsc, "Intensidad Inexistente") == 0 )
         {
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavIntcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            lblTxtmensaje_Caption = httpContext.getMessage( "Intensidad Inexistente", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
         }
         else
         {
            if ( GXutil.strcmp(AV19IntAct, "N") == 0 )
            {
               httpContext.doAjaxRefresh();
               GX_FocusControl = edtavIntcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               lblTxtmensaje_Caption = httpContext.getMessage( "Intensidad Inactiva", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
            }
            else
            {
               GXv_decimal11[0] = AV24IntPreKgm ;
               GXv_decimal12[0] = AV25IntPreMtr ;
               GXv_char4[0] = AV23IntPreDef ;
               GXv_int13[0] = AV30pretin ;
               new app.facturacion.precioporarticulo_get(remoteHandle, context).execute( AV11emprcod, AV7CliCod, AV5ArtCod, AV44TipColCod, AV20IntCod, GXv_decimal11, GXv_decimal12, GXv_char4, GXv_int13) ;
               precioporarticulo_wkp_impl.this.AV24IntPreKgm = GXv_decimal11[0] ;
               precioporarticulo_wkp_impl.this.AV25IntPreMtr = GXv_decimal12[0] ;
               precioporarticulo_wkp_impl.this.AV23IntPreDef = GXv_char4[0] ;
               precioporarticulo_wkp_impl.this.AV30pretin = GXv_int13[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24IntPreKgm", GXutil.ltrimstr( AV24IntPreKgm, 13, 5));
               httpContext.ajax_rsp_assign_attri("", false, "AV25IntPreMtr", GXutil.ltrimstr( AV25IntPreMtr, 13, 5));
               httpContext.ajax_rsp_assign_attri("", false, "AV23IntPreDef", AV23IntPreDef);
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void S182( )
   {
      /* 'LIMPIARVARIABLES' Routine */
      returnInSub = false ;
      AV20IntCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20IntCod), 2, 0));
      AV22IntDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22IntDsc", AV22IntDsc);
      AV23IntPreDef = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23IntPreDef", AV23IntPreDef);
      AV24IntPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24IntPreKgm", GXutil.ltrimstr( AV24IntPreKgm, 13, 5));
      AV25IntPreMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25IntPreMtr", GXutil.ltrimstr( AV25IntPreMtr, 13, 5));
   }

   public void wb_table2_125_2C62( boolean wbgen )
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
         wb_table2_125_2C62e( true) ;
      }
      else
      {
         wb_table2_125_2C62e( false) ;
      }
   }

   public void wb_table1_120_2C62( boolean wbgen )
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
         wb_table1_120_2C62e( true) ;
      }
      else
      {
         wb_table1_120_2C62e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11emprcod", AV11emprcod);
      AV7CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CliCod), "ZZZZZ9")));
      AV8CliNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8CliNom", AV8CliNom);
      AV5ArtCod = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5ArtCod", AV5ArtCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5ArtCod, ""))));
      AV6ArtDsc = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6ArtDsc", AV6ArtDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6ArtDsc, ""))));
      AV44TipColCod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TipColCod), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44TipColCod), "Z9")));
      AV45TipColDsc = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TipColDsc", AV45TipColDsc);
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
      pa2C62( ) ;
      ws2C62( ) ;
      we2C62( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116153182", true, true);
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
      httpContext.AddJavascriptSource("facturacion/precioporarticulo_wkp.js", "?202682116153182", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_982( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_98_idx );
      edtIntCod_Internalname = "INTCOD_"+sGXsfl_98_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_98_idx ;
      chkIntAct.setInternalname( "INTACT_"+sGXsfl_98_idx );
      edtIntPreKgm_Internalname = "INTPREKGM_"+sGXsfl_98_idx ;
      edtIntPreMtr_Internalname = "INTPREMTR_"+sGXsfl_98_idx ;
      edtIntPreDef_Internalname = "INTPREDEF_"+sGXsfl_98_idx ;
   }

   public void subsflControlProps_fel_982( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_98_fel_idx );
      edtIntCod_Internalname = "INTCOD_"+sGXsfl_98_fel_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_98_fel_idx ;
      chkIntAct.setInternalname( "INTACT_"+sGXsfl_98_fel_idx );
      edtIntPreKgm_Internalname = "INTPREKGM_"+sGXsfl_98_fel_idx ;
      edtIntPreMtr_Internalname = "INTPREMTR_"+sGXsfl_98_fel_idx ;
      edtIntPreDef_Internalname = "INTPREDEF_"+sGXsfl_98_fel_idx ;
   }

   public void sendrow_982( )
   {
      subsflControlProps_982( ) ;
      wb2C60( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_98_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_98_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_98_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 99,'',false,'"+sGXsfl_98_idx+"',98)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_98_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV13GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV13GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV13GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e252c62_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,99);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV13GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_98_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntCod_Internalname,GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(98),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDsc_Internalname,GXutil.rtrim( A584IntDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(98),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "INTACT_" + sGXsfl_98_idx ;
         chkIntAct.setName( GXCCtl );
         chkIntAct.setWebtags( "" );
         chkIntAct.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkIntAct.getInternalname(), "TitleCaption", chkIntAct.getCaption(), !bGXsfl_98_Refreshing);
         chkIntAct.setCheckedValue( "N" );
         A14255IntAct = ((GXutil.strcmp(GXutil.rtrim( A14255IntAct), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkIntAct.getInternalname(),A14255IntAct,"","",Integer.valueOf(-1),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A586IntPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A586IntPreKgm, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(98),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A587IntPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A587IntPreMtr, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(98),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntPreDef_Internalname,GXutil.rtrim( A585IntPreDef),GXutil.rtrim( localUtil.format( A585IntPreDef, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntPreDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(98),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2C62( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_98_idx = ((subGrid_Islastpage==1)&&(nGXsfl_98_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_98_idx+1) ;
         sGXsfl_98_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_98_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_982( ) ;
      }
      /* End function sendrow_982 */
   }

   public void startgridcontrol98( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"98\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Def?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV13GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A584IntDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14255IntAct));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A586IntPreKgm, (byte)(13), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A587IntPreMtr, (byte)(13), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A585IntPreDef));
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
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavArtcod_Internalname = "vARTCOD" ;
      edtavArtdsc_Internalname = "vARTDSC" ;
      edtavTipcolcod_Internalname = "vTIPCOLCOD" ;
      edtavTipcoldsc_Internalname = "vTIPCOLDSC" ;
      bttBtncopiarprecios_Internalname = "BTNCOPIARPRECIOS" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavIntcod_Internalname = "vINTCOD" ;
      imgUseraction1_Internalname = "USERACTION1" ;
      edtavIntdsc_Internalname = "vINTDSC" ;
      edtavIntprekgm_Internalname = "vINTPREKGM" ;
      edtavIntpremtr_Internalname = "vINTPREMTR" ;
      chkavIntpredef.setInternalname( "vINTPREDEF" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnlimpiarvariables_Internalname = "BTNLIMPIARVARIABLES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTxtmensaje_Internalname = "TXTMENSAJE" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtIntCod_Internalname = "INTCOD" ;
      edtIntDsc_Internalname = "INTDSC" ;
      chkIntAct.setInternalname( "INTACT" );
      edtIntPreKgm_Internalname = "INTPREKGM" ;
      edtIntPreMtr_Internalname = "INTPREMTR" ;
      edtIntPreDef_Internalname = "INTPREDEF" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
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
      edtIntPreDef_Jsonclick = "" ;
      edtIntPreMtr_Jsonclick = "" ;
      edtIntPreKgm_Jsonclick = "" ;
      chkIntAct.setCaption( "" );
      edtIntDsc_Jsonclick = "" ;
      edtIntCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTxtmensaje_Caption = "" ;
      chkavIntpredef.setEnabled( 1 );
      edtavIntpremtr_Jsonclick = "" ;
      edtavIntpremtr_Enabled = 1 ;
      edtavIntprekgm_Jsonclick = "" ;
      edtavIntprekgm_Enabled = 1 ;
      edtavIntdsc_Jsonclick = "" ;
      edtavIntdsc_Enabled = 1 ;
      edtavIntcod_Jsonclick = "" ;
      edtavIntcod_Enabled = 1 ;
      edtavTipcoldsc_Jsonclick = "" ;
      edtavTipcoldsc_Enabled = 0 ;
      edtavTipcolcod_Jsonclick = "" ;
      edtavTipcolcod_Enabled = 0 ;
      edtavArtdsc_Jsonclick = "" ;
      edtavArtdsc_Enabled = 0 ;
      edtavArtcod_Jsonclick = "" ;
      edtavArtcod_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;Precio;Precio;Precio" ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma el dato?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Confirma la eliminacion?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "Facturacion.PrecioporArticulo_WKPGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||S:WWP_TSChecked,N:WWP_TSUnChecked|||" ;
      Ddo_grid_Datalisttype = "|Dynamic|FixedValues|||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|||T" ;
      Ddo_grid_Filterisrange = "T|||T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Character||Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T|T||T|T|T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "1:IntCod|2:IntDsc|3:IntAct|4:IntPreKgm|5:IntPreMtr|6:IntPreDef" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Precio por Articulo, Intensidades", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavIntpredef.setName( "vINTPREDEF" );
      chkavIntpredef.setWebtags( "" );
      chkavIntpredef.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavIntpredef.getInternalname(), "TitleCaption", chkavIntpredef.getCaption(), true);
      chkavIntpredef.setCheckedValue( "N" );
      AV23IntPreDef = ((GXutil.strcmp(GXutil.rtrim( AV23IntPreDef), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23IntPreDef", AV23IntPreDef);
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_98_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV13GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV13GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridActions), 4, 0));
      }
      GXCCtl = "INTACT_" + sGXsfl_98_idx ;
      chkIntAct.setName( GXCCtl );
      chkIntAct.setWebtags( "" );
      chkIntAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkIntAct.getInternalname(), "TitleCaption", chkIntAct.getCaption(), !bGXsfl_98_Refreshing);
      chkIntAct.setCheckedValue( "N" );
      A14255IntAct = ((GXutil.strcmp(GXutil.rtrim( A14255IntAct), "S")==0) ? "S" : "N") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112C62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122C62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132C62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e242C62',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV13GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e252C62',iparms:[{av:'cmbavGridactions'},{av:'AV13GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'A583IntCod',fld:'INTCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'cmbavGridactions'},{av:'AV13GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e142C62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e162C62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV20IntCod',fld:'vINTCOD',pic:'Z9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV22IntDsc',fld:'vINTDSC',pic:''},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e152C62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV20IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV24IntPreKgm',fld:'vINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV25IntPreMtr',fld:'vINTPREMTR',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV20IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV22IntDsc',fld:'vINTDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'AV24IntPreKgm',fld:'vINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV25IntPreMtr',fld:'vINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOLIMPIARVARIABLES'","{handler:'e172C62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV20IntCod',fld:'vINTCOD',pic:'Z9'}]");
      setEventMetadata("'DOLIMPIARVARIABLES'",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV20IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV22IntDsc',fld:'vINTDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'AV24IntPreKgm',fld:'vINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV25IntPreMtr',fld:'vINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e182C62',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e192C62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV20IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV22IntDsc',fld:'vINTDSC',pic:''}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV22IntDsc',fld:'vINTDSC',pic:''},{av:'AV20IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCOPIARPRECIOS'","{handler:'e202C62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true}]");
      setEventMetadata("'DOCOPIARPRECIOS'",",oparms:[{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VINTCOD.ISVALID","{handler:'e212C62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV5ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV44TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV34TFIntCod',fld:'vTFINTCOD',pic:'Z9'},{av:'AV35TFIntCod_To',fld:'vTFINTCOD_TO',pic:'Z9'},{av:'AV36TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV37TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV33TFIntAct_Sel',fld:'vTFINTACT_SEL',pic:''},{av:'AV40TFIntPreKgm',fld:'vTFINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV41TFIntPreKgm_To',fld:'vTFINTPREKGM_TO',pic:'ZZZZZZ9.999'},{av:'AV42TFIntPreMtr',fld:'vTFINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV43TFIntPreMtr_To',fld:'vTFINTPREMTR_TO',pic:'ZZZZZZ9.999'},{av:'AV38TFIntPreDef',fld:'vTFINTPREDEF',pic:'@!'},{av:'AV39TFIntPreDef_Sel',fld:'vTFINTPREDEF_SEL',pic:'@!'},{av:'AV52Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV28OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV6ArtDsc',fld:'vARTDSC',pic:'',hsh:true},{av:'AV20IntCod',fld:'vINTCOD',pic:'Z9'}]");
      setEventMetadata("VINTCOD.ISVALID",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV22IntDsc',fld:'vINTDSC',pic:''},{av:'AV23IntPreDef',fld:'vINTPREDEF',pic:'@!'},{av:'AV25IntPreMtr',fld:'vINTPREMTR',pic:'ZZZZZZ9.999'},{av:'AV24IntPreKgm',fld:'vINTPREKGM',pic:'ZZZZZZ9.999'},{av:'AV14GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV15GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_ARTCOD","{handler:'validv_Artcod',iparms:[]");
      setEventMetadata("VALIDV_ARTCOD",",oparms:[]}");
      setEventMetadata("VALIDV_TIPCOLCOD","{handler:'validv_Tipcolcod',iparms:[]");
      setEventMetadata("VALIDV_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALIDV_INTPREDEF","{handler:'validv_Intpredef',iparms:[]");
      setEventMetadata("VALIDV_INTPREDEF",",oparms:[]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[]");
      setEventMetadata("VALID_INTCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Intpredef',iparms:[]");
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
      wcpOAV11emprcod = "" ;
      wcpOAV8CliNom = "" ;
      wcpOAV5ArtCod = "" ;
      wcpOAV6ArtDsc = "" ;
      wcpOAV45TipColDsc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV11emprcod = "" ;
      AV8CliNom = "" ;
      AV5ArtCod = "" ;
      AV6ArtDsc = "" ;
      AV45TipColDsc = "" ;
      AV36TFIntDsc = "" ;
      AV37TFIntDsc_Sel = "" ;
      AV33TFIntAct_Sel = "" ;
      AV40TFIntPreKgm = DecimalUtil.ZERO ;
      AV41TFIntPreKgm_To = DecimalUtil.ZERO ;
      AV42TFIntPreMtr = DecimalUtil.ZERO ;
      AV43TFIntPreMtr_To = DecimalUtil.ZERO ;
      AV38TFIntPreDef = "" ;
      AV39TFIntPreDef_Sel = "" ;
      AV52Pgmname = "" ;
      AV23IntPreDef = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV10DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV64Emprcod_selected = "" ;
      AV66Artcod_selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtncopiarprecios_Jsonclick = "" ;
      imgUseraction1_gximage = "" ;
      sImgUrl = "" ;
      imgUseraction1_Jsonclick = "" ;
      AV22IntDsc = "" ;
      AV24IntPreKgm = DecimalUtil.ZERO ;
      AV25IntPreMtr = DecimalUtil.ZERO ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnlimpiarvariables_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTxtmensaje_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A584IntDsc = "" ;
      A14255IntAct = "" ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      scmdbuf = "" ;
      lV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = "" ;
      lV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = "" ;
      AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = "" ;
      AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc = "" ;
      AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel = "" ;
      AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm = DecimalUtil.ZERO ;
      AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = DecimalUtil.ZERO ;
      AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr = DecimalUtil.ZERO ;
      AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = DecimalUtil.ZERO ;
      AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = "" ;
      AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef = "" ;
      H02C62_A396EmprCod = new String[] {""} ;
      H02C62_A252CliCod = new int[1] ;
      H02C62_A65ArtCod = new String[] {""} ;
      H02C62_A831TipColCod = new byte[1] ;
      H02C62_A585IntPreDef = new String[] {""} ;
      H02C62_n585IntPreDef = new boolean[] {false} ;
      H02C62_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02C62_n587IntPreMtr = new boolean[] {false} ;
      H02C62_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02C62_n586IntPreKgm = new boolean[] {false} ;
      H02C62_A14255IntAct = new String[] {""} ;
      H02C62_A584IntDsc = new String[] {""} ;
      H02C62_n584IntDsc = new boolean[] {false} ;
      H02C62_A583IntCod = new byte[1] ;
      H02C63_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV32Station = "" ;
      AV12EmprNom = "" ;
      AV48UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV49WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV19IntAct = "" ;
      AV31Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char9 = "" ;
      GXt_char8 = "" ;
      GXv_SdtWWPGridState10 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV46TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV18HTTPRequest = httpContext.getHttpRequest();
      GXv_char3 = new String[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int13 = new short[1] ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo_wkp__default(),
         new Object[] {
             new Object[] {
            H02C62_A396EmprCod, H02C62_A252CliCod, H02C62_A65ArtCod, H02C62_A831TipColCod, H02C62_A585IntPreDef, H02C62_n585IntPreDef, H02C62_A587IntPreMtr, H02C62_n587IntPreMtr, H02C62_A586IntPreKgm, H02C62_n586IntPreKgm,
            H02C62_A14255IntAct, H02C62_A584IntDsc, H02C62_n584IntDsc, H02C62_A583IntCod
            }
            , new Object[] {
            H02C63_AGRID_nRecordCount
            }
         }
      );
      AV52Pgmname = "Facturacion.PrecioporArticulo_WKP" ;
      /* GeneXus formulas. */
      AV52Pgmname = "Facturacion.PrecioporArticulo_WKP" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavArtcod_Enabled = 0 ;
      edtavArtdsc_Enabled = 0 ;
      edtavTipcolcod_Enabled = 0 ;
      edtavTipcoldsc_Enabled = 0 ;
      edtavIntdsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV44TipColCod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV44TipColCod ;
   private byte AV34TFIntCod ;
   private byte AV35TFIntCod_To ;
   private byte A831TipColCod ;
   private byte gxajaxcallmode ;
   private byte AV67Tipcolcod_selected ;
   private byte AV68Intcod_selected ;
   private byte AV20IntCod ;
   private byte A583IntCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV53Facturacion_precioporarticulo_wkpds_1_tfintcod ;
   private byte AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV27OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV13GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV30pretin ;
   private short GXv_int13[] ;
   private int wcpOAV7CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_98 ;
   private int AV7CliCod ;
   private int nGXsfl_98_idx=1 ;
   private int A252CliCod ;
   private int AV65Clicod_selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavArtcod_Enabled ;
   private int edtavArtdsc_Enabled ;
   private int edtavTipcolcod_Enabled ;
   private int edtavTipcoldsc_Enabled ;
   private int edtavIntcod_Enabled ;
   private int edtavIntdsc_Enabled ;
   private int edtavIntprekgm_Enabled ;
   private int edtavIntpremtr_Enabled ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV29PageToGo ;
   private int AV69GXV1 ;
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
   private java.math.BigDecimal AV40TFIntPreKgm ;
   private java.math.BigDecimal AV41TFIntPreKgm_To ;
   private java.math.BigDecimal AV42TFIntPreMtr ;
   private java.math.BigDecimal AV43TFIntPreMtr_To ;
   private java.math.BigDecimal AV24IntPreKgm ;
   private java.math.BigDecimal AV25IntPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm ;
   private java.math.BigDecimal AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to ;
   private java.math.BigDecimal AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr ;
   private java.math.BigDecimal AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOAV11emprcod ;
   private String wcpOAV8CliNom ;
   private String wcpOAV5ArtCod ;
   private String wcpOAV6ArtDsc ;
   private String wcpOAV45TipColDsc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV11emprcod ;
   private String AV8CliNom ;
   private String AV5ArtCod ;
   private String AV6ArtDsc ;
   private String AV45TipColDsc ;
   private String sGXsfl_98_idx="0001" ;
   private String AV36TFIntDsc ;
   private String AV37TFIntDsc_Sel ;
   private String AV33TFIntAct_Sel ;
   private String AV38TFIntPreDef ;
   private String AV39TFIntPreDef_Sel ;
   private String AV52Pgmname ;
   private String AV23IntPreDef ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV64Emprcod_selected ;
   private String AV66Artcod_selected ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Ddo_grid_Datalistfixedvalues ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavArtcod_Internalname ;
   private String edtavArtcod_Jsonclick ;
   private String edtavArtdsc_Internalname ;
   private String edtavArtdsc_Jsonclick ;
   private String edtavTipcolcod_Internalname ;
   private String edtavTipcolcod_Jsonclick ;
   private String edtavTipcoldsc_Internalname ;
   private String edtavTipcoldsc_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtncopiarprecios_Internalname ;
   private String bttBtncopiarprecios_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavIntcod_Internalname ;
   private String edtavIntcod_Jsonclick ;
   private String imgUseraction1_gximage ;
   private String sImgUrl ;
   private String imgUseraction1_Internalname ;
   private String imgUseraction1_Jsonclick ;
   private String edtavIntdsc_Internalname ;
   private String AV22IntDsc ;
   private String edtavIntdsc_Jsonclick ;
   private String edtavIntprekgm_Internalname ;
   private String edtavIntprekgm_Jsonclick ;
   private String edtavIntpremtr_Internalname ;
   private String edtavIntpremtr_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnlimpiarvariables_Internalname ;
   private String bttBtnlimpiarvariables_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String lblTxtmensaje_Internalname ;
   private String lblTxtmensaje_Caption ;
   private String lblTxtmensaje_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtIntCod_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Internalname ;
   private String A14255IntAct ;
   private String edtIntPreKgm_Internalname ;
   private String edtIntPreMtr_Internalname ;
   private String A585IntPreDef ;
   private String edtIntPreDef_Internalname ;
   private String scmdbuf ;
   private String lV55Facturacion_precioporarticulo_wkpds_3_tfintdsc ;
   private String lV62Facturacion_precioporarticulo_wkpds_10_tfintpredef ;
   private String AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel ;
   private String AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc ;
   private String AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel ;
   private String AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel ;
   private String AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef ;
   private String hsh ;
   private String AV32Station ;
   private String AV12EmprNom ;
   private String AV48UsurCod ;
   private String AV19IntAct ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char9 ;
   private String GXt_char8 ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String sGXsfl_98_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtIntCod_Jsonclick ;
   private String edtIntDsc_Jsonclick ;
   private String edtIntPreKgm_Jsonclick ;
   private String edtIntPreMtr_Jsonclick ;
   private String edtIntPreDef_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV28OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n584IntDsc ;
   private boolean n586IntPreKgm ;
   private boolean n587IntPreMtr ;
   private boolean n585IntPreDef ;
   private boolean bGXsfl_98_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV18HTTPRequest ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavIntpredef ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkIntAct ;
   private IDataStoreProvider pr_default ;
   private String[] H02C62_A396EmprCod ;
   private int[] H02C62_A252CliCod ;
   private String[] H02C62_A65ArtCod ;
   private byte[] H02C62_A831TipColCod ;
   private String[] H02C62_A585IntPreDef ;
   private boolean[] H02C62_n585IntPreDef ;
   private java.math.BigDecimal[] H02C62_A587IntPreMtr ;
   private boolean[] H02C62_n587IntPreMtr ;
   private java.math.BigDecimal[] H02C62_A586IntPreKgm ;
   private boolean[] H02C62_n586IntPreKgm ;
   private String[] H02C62_A14255IntAct ;
   private String[] H02C62_A584IntDsc ;
   private boolean[] H02C62_n584IntDsc ;
   private byte[] H02C62_A583IntCod ;
   private long[] H02C63_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV10DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState10[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV46TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV49WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class precioporarticulo_wkp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02C62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV53Facturacion_precioporarticulo_wkpds_1_tfintcod ,
                                          byte AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to ,
                                          String AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel ,
                                          String AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc ,
                                          String AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel ,
                                          java.math.BigDecimal AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm ,
                                          java.math.BigDecimal AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to ,
                                          java.math.BigDecimal AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr ,
                                          java.math.BigDecimal AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to ,
                                          String AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel ,
                                          String AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          String A14255IntAct ,
                                          java.math.BigDecimal A586IntPreKgm ,
                                          java.math.BigDecimal A587IntPreMtr ,
                                          String A585IntPreDef ,
                                          short AV27OrderedBy ,
                                          boolean AV28OrderedDsc ,
                                          String AV11emprcod ,
                                          int AV7CliCod ,
                                          String AV5ArtCod ,
                                          byte AV44TipColCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          byte A831TipColCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[20];
      Object[] GXv_Object15 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T1.IntPreDef, T1.IntPreMtr, T1.IntPreKgm, T2.IntAct, T2.IntDsc, T1.IntCod" ;
      sFromString = " FROM (TXPPRETIN T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.TipColCod = ?)");
      if ( ! (0==AV53Facturacion_precioporarticulo_wkpds_1_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntAct = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreKgm >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreKgm <= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreMtr >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreMtr <= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel)==0) && ( ! (GXutil.strcmp("", AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IntPreDef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreDef = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( AV27OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T1.IntCod" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY T1.IntCod" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.IntCod DESC" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY T2.IntDsc" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.IntDsc DESC" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY T2.IntAct" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.IntAct DESC" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY T1.IntPreKgm" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.IntPreKgm DESC" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY T1.IntPreMtr" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.IntPreMtr DESC" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ! AV28OrderedDsc )
      {
         sOrderString += " ORDER BY T1.IntPreDef" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ( AV28OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.IntPreDef DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T1.IntCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H02C63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV53Facturacion_precioporarticulo_wkpds_1_tfintcod ,
                                          byte AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to ,
                                          String AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel ,
                                          String AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc ,
                                          String AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel ,
                                          java.math.BigDecimal AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm ,
                                          java.math.BigDecimal AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to ,
                                          java.math.BigDecimal AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr ,
                                          java.math.BigDecimal AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to ,
                                          String AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel ,
                                          String AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          String A14255IntAct ,
                                          java.math.BigDecimal A586IntPreKgm ,
                                          java.math.BigDecimal A587IntPreMtr ,
                                          String A585IntPreDef ,
                                          short AV27OrderedBy ,
                                          boolean AV28OrderedDsc ,
                                          String AV11emprcod ,
                                          int AV7CliCod ,
                                          String AV5ArtCod ,
                                          byte AV44TipColCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          byte A831TipColCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[15];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPPRETIN T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.TipColCod = ?)");
      if ( ! (0==AV53Facturacion_precioporarticulo_wkpds_1_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (0==AV54Facturacion_precioporarticulo_wkpds_2_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV55Facturacion_precioporarticulo_wkpds_3_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_precioporarticulo_wkpds_5_tfintact_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntAct = ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Facturacion_precioporarticulo_wkpds_6_tfintprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreKgm >= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreKgm <= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Facturacion_precioporarticulo_wkpds_8_tfintpremtr)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreMtr >= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreMtr <= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel)==0) && ( ! (GXutil.strcmp("", AV62Facturacion_precioporarticulo_wkpds_10_tfintpredef)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IntPreDef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreDef = ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV27OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 2 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 3 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 4 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 5 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 6 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ! AV28OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV27OrderedBy == 7 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_H02C62(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() );
            case 1 :
                  return conditional_H02C63(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02C62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02C63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               return;
      }
   }

}

