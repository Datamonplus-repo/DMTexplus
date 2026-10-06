package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidad_ccsta_wp_impl extends GXDataArea
{
   public controlcalidad_ccsta_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidad_ccsta_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccsta_wp_impl.class ));
   }

   public controlcalidad_ccsta_wp_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavCcsauto = UIFactory.getCheckbox(this);
      cmbCCTLinTpoD = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridcontrolcalidad_ccsta_sdts") == 0 )
         {
            gxnrgridcontrolcalidad_ccsta_sdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridcontrolcalidad_ccsta_sdts") == 0 )
         {
            gxgrgridcontrolcalidad_ccsta_sdts_refresh_invoke( ) ;
            return  ;
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
            AV10EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
               AV9CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9CliNom", AV9CliNom);
               AV5ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5ArtCod", AV5ArtCod);
               AV6CCFColNom = httpContext.GetPar( "CCFColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6CCFColNom", AV6CCFColNom);
               AV7CCFColNum = (int)(GXutil.lval( httpContext.GetPar( "CCFColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CCFColNum), 6, 0));
               AV15CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CCTCod), 6, 0));
               AV16CCTDsc = httpContext.GetPar( "CCTDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16CCTDsc", AV16CCTDsc);
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

   public void gxnrgridcontrolcalidad_ccsta_sdts_newrow_invoke( )
   {
      nRC_GXsfl_106 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_106"))) ;
      nGXsfl_106_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_106_idx"))) ;
      sGXsfl_106_idx = httpContext.GetPar( "sGXsfl_106_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridcontrolcalidad_ccsta_sdts_newrow( ) ;
      /* End function gxnrGridcontrolcalidad_ccsta_sdts_newrow_invoke */
   }

   public void gxgrgridcontrolcalidad_ccsta_sdts_refresh_invoke( )
   {
      subGridcontrolcalidad_ccsta_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolcalidad_ccsta_sdts_Rows"))) ;
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV17CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
      AV92Pgmname = httpContext.GetPar( "Pgmname") ;
      AV26OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV27OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV44TFCCTLin = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin"))) ;
      AV45TFCCTLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin_To"))) ;
      AV46TFCCTLinDsc = httpContext.GetPar( "TFCCTLinDsc") ;
      AV47TFCCTLinDsc_Sel = httpContext.GetPar( "TFCCTLinDsc_Sel") ;
      AV36TFCCSMetodo = httpContext.GetPar( "TFCCSMetodo") ;
      AV37TFCCSMetodo_Sel = httpContext.GetPar( "TFCCSMetodo_Sel") ;
      AV32TFCCSEspecif = httpContext.GetPar( "TFCCSEspecif") ;
      AV33TFCCSEspecif_Sel = httpContext.GetPar( "TFCCSEspecif_Sel") ;
      AV30TFCCSAuto = (byte)(GXutil.lval( httpContext.GetPar( "TFCCSAuto"))) ;
      AV31TFCCSAuto_To = (byte)(GXutil.lval( httpContext.GetPar( "TFCCSAuto_To"))) ;
      AV42TFCCSVTol = CommonUtil.decimalVal( httpContext.GetPar( "TFCCSVTol"), ".") ;
      AV43TFCCSVTol_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCCSVTol_To"), ".") ;
      AV38TFCCSMin = httpContext.GetPar( "TFCCSMin") ;
      AV39TFCCSMin_Sel = httpContext.GetPar( "TFCCSMin_Sel") ;
      AV40TFCCSVal = httpContext.GetPar( "TFCCSVal") ;
      AV41TFCCSVal_Sel = httpContext.GetPar( "TFCCSVal_Sel") ;
      AV34TFCCSMax = httpContext.GetPar( "TFCCSMax") ;
      AV35TFCCSMax_Sel = httpContext.GetPar( "TFCCSMax_Sel") ;
      AV11CCSAuto = (byte)(GXutil.lval( httpContext.GetPar( "CCSAuto"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridcontrolcalidad_ccsta_sdts_refresh_invoke */
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_141 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_141"))) ;
      nGXsfl_141_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_141_idx"))) ;
      sGXsfl_141_idx = httpContext.GetPar( "sGXsfl_141_idx") ;
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
      subGridcontrolcalidad_ccsta_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridcontrolcalidad_ccsta_sdts_Rows"))) ;
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV10EmprCod = httpContext.GetPar( "EmprCod") ;
      AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV5ArtCod = httpContext.GetPar( "ArtCod") ;
      AV6CCFColNom = httpContext.GetPar( "CCFColNom") ;
      AV7CCFColNum = (int)(GXutil.lval( httpContext.GetPar( "CCFColNum"))) ;
      AV15CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
      AV17CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
      AV92Pgmname = httpContext.GetPar( "Pgmname") ;
      AV26OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV27OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV44TFCCTLin = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin"))) ;
      AV45TFCCTLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFCCTLin_To"))) ;
      AV46TFCCTLinDsc = httpContext.GetPar( "TFCCTLinDsc") ;
      AV47TFCCTLinDsc_Sel = httpContext.GetPar( "TFCCTLinDsc_Sel") ;
      AV36TFCCSMetodo = httpContext.GetPar( "TFCCSMetodo") ;
      AV37TFCCSMetodo_Sel = httpContext.GetPar( "TFCCSMetodo_Sel") ;
      AV32TFCCSEspecif = httpContext.GetPar( "TFCCSEspecif") ;
      AV33TFCCSEspecif_Sel = httpContext.GetPar( "TFCCSEspecif_Sel") ;
      AV30TFCCSAuto = (byte)(GXutil.lval( httpContext.GetPar( "TFCCSAuto"))) ;
      AV31TFCCSAuto_To = (byte)(GXutil.lval( httpContext.GetPar( "TFCCSAuto_To"))) ;
      AV42TFCCSVTol = CommonUtil.decimalVal( httpContext.GetPar( "TFCCSVTol"), ".") ;
      AV43TFCCSVTol_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCCSVTol_To"), ".") ;
      AV38TFCCSMin = httpContext.GetPar( "TFCCSMin") ;
      AV39TFCCSMin_Sel = httpContext.GetPar( "TFCCSMin_Sel") ;
      AV40TFCCSVal = httpContext.GetPar( "TFCCSVal") ;
      AV41TFCCSVal_Sel = httpContext.GetPar( "TFCCSVal_Sel") ;
      AV34TFCCSMax = httpContext.GetPar( "TFCCSMax") ;
      AV35TFCCSMax_Sel = httpContext.GetPar( "TFCCSMax_Sel") ;
      AV11CCSAuto = (byte)(GXutil.lval( httpContext.GetPar( "CCSAuto"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
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
      pa2BY2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2BY2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidad_ccsta_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9CliNom)),GXutil.URLEncode(GXutil.rtrim(AV5ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV6CCFColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV7CCFColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV16CCTDsc))}, new String[] {"EmprCod","CliCod","CliNom","ArtCod","CCFColNom","CCFColNum","CCTCod","CCTDsc"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCSTA_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_ccsta_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Controlcalidad_ccsta_sdt", AV74ControlCalidad_CCSTA_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Controlcalidad_ccsta_sdt", AV74ControlCalidad_CCSTA_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_106", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_106, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_141", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_141, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV19DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCCTLIN_DATA", AV60CCTLin_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCCTLIN_DATA", AV60CCTLin_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV76GridControlCalidad_CCSTA_SDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV77GridControlCalidad_CCSTA_SDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV20GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV21GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV26OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV27OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLIN", GXutil.ltrim( localUtil.ntoc( AV44TFCCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLIN_TO", GXutil.ltrim( localUtil.ntoc( AV45TFCCTLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINDSC", GXutil.rtrim( AV46TFCCTLinDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCTLINDSC_SEL", GXutil.rtrim( AV47TFCCTLinDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSMETODO", GXutil.rtrim( AV36TFCCSMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSMETODO_SEL", GXutil.rtrim( AV37TFCCSMetodo_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSESPECIF", GXutil.rtrim( AV32TFCCSEspecif));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSESPECIF_SEL", GXutil.rtrim( AV33TFCCSEspecif_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSAUTO", GXutil.ltrim( localUtil.ntoc( AV30TFCCSAuto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSAUTO_TO", GXutil.ltrim( localUtil.ntoc( AV31TFCCSAuto_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSVTOL", GXutil.ltrim( localUtil.ntoc( AV42TFCCSVTol, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSVTOL_TO", GXutil.ltrim( localUtil.ntoc( AV43TFCCSVTol_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSMIN", GXutil.rtrim( AV38TFCCSMin));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSMIN_SEL", GXutil.rtrim( AV39TFCCSMin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSVAL", GXutil.rtrim( AV40TFCCSVal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSVAL_SEL", GXutil.rtrim( AV41TFCCSVal_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSMAX", GXutil.rtrim( AV34TFCCSMax));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSMAX_SEL", GXutil.rtrim( AV35TFCCSMax_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR", GXutil.rtrim( AV85valor));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCSVCOD", GXutil.rtrim( AV68CCSVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCSESPECIF", GXutil.rtrim( AV12CCSEspecif));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCSMETODO", GXutil.rtrim( AV13CCSMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CCFCOLNOM", GXutil.rtrim( A4058CCFColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CCFCOLNUM", GXutil.ltrim( localUtil.ntoc( A4059CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTCOD", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALLIN", GXutil.ltrim( localUtil.ntoc( A4049CCTValLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVAL", GXutil.rtrim( A4051CCTVal));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALDSC", GXutil.rtrim( A4050CCTValDsc));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCONTROLCALIDAD_CCSTA_SDT", AV74ControlCalidad_CCSTA_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCONTROLCALIDAD_CCSTA_SDT", AV74ControlCalidad_CCSTA_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTLIN_Cls", GXutil.rtrim( Combo_cctlin_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTLIN_Selectedvalue_set", GXutil.rtrim( Combo_cctlin_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTLIN_Enabled", GXutil.booltostr( Combo_cctlin_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTLIN_Emptyitem", GXutil.booltostr( Combo_cctlin_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Class", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridcontrolcalidad_ccsta_sdtspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridcontrolcalidad_ccsta_sdtspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridcontrolcalidad_ccsta_sdtspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridcontrolcalidad_ccsta_sdtspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Previous", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Next", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Caption", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTLIN_Selectedvalue_get", GXutil.rtrim( Combo_cctlin_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridcontrolcalidad_ccsta_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTLIN_Selectedvalue_get", GXutil.rtrim( Combo_cctlin_Selectedvalue_get));
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
         we2BY2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2BY2( ) ;
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
      return formatLink("app.controlcalidadhtd.controlcalidad_ccsta_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9CliNom)),GXutil.URLEncode(GXutil.rtrim(AV5ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV6CCFColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV7CCFColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV16CCTDsc))}, new String[] {"EmprCod","CliCod","CliNom","ArtCod","CCFColNom","CCFColNum","CCTCod","CCTDsc"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidad_CCSTA_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Valores Estandars", "") ;
   }

   public void wb2BY0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV9CliNom), GXutil.rtrim( localUtil.format( AV9CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_Internalname, GXutil.rtrim( AV5ArtCod), GXutil.rtrim( localUtil.format( AV5ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcfcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcfcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcfcolnom_Internalname, GXutil.rtrim( AV6CCFColNom), GXutil.rtrim( localUtil.format( AV6CCFColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcfcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcfcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcfcolnum_Internalname, httpContext.getMessage( "Número", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcfcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV7CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCcfcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7CCFColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7CCFColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcfcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctcod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV15CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCctcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctcod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctdsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctdsc_Internalname, GXutil.rtrim( AV16CCTDsc), GXutil.rtrim( localUtil.format( AV16CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctdsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop WWFiltersCell", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcctlin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cctlin_Internalname, "#", "", "", lblTextblockcombo_cctlin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cctlin.setProperty("Caption", Combo_cctlin_Caption);
         ucCombo_cctlin.setProperty("Cls", Combo_cctlin_Cls);
         ucCombo_cctlin.setProperty("EmptyItem", Combo_cctlin_Emptyitem);
         ucCombo_cctlin.setProperty("DropDownOptionsTitleSettingsIcons", AV19DDO_TitleSettingsIcons);
         ucCombo_cctlin.setProperty("DropDownOptionsData", AV60CCTLin_Data);
         ucCombo_cctlin.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cctlin_Internalname, "COMBO_CCTLINContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavCcsauto.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavCcsauto.getInternalname(), httpContext.getMessage( "Auto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_106_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavCcsauto.getInternalname(), GXutil.str( AV11CCSAuto, 1, 0), "", httpContext.getMessage( "Auto", ""), 1, chkavCcsauto.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(67, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcval_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcval_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_106_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcval_Internalname, GXutil.rtrim( AV72CCVal), GXutil.rtrim( localUtil.format( AV72CCVal, edtavCcval_Picture)), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcval_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcval_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, edtavCcval_Picture, "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcsvtol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcsvtol_Internalname, httpContext.getMessage( "Tolerancia (%)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_106_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcsvtol_Internalname, GXutil.ltrim( localUtil.ntoc( AV14CCSVTol, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV14CCSVTol, "Z9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcsvtol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcsvtol_Enabled, 1, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divValores_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcsmin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcsmin_Internalname, httpContext.getMessage( "Valor Mínimo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_106_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcsmin_Internalname, GXutil.rtrim( AV57CCSMin), GXutil.rtrim( localUtil.format( AV57CCSMin, edtavCcsmin_Picture)), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcsmin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcsmin_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, edtavCcsmin_Picture, "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcsval_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcsval_Internalname, httpContext.getMessage( "Valor Ideal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_106_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcsval_Internalname, GXutil.rtrim( AV58CCSVal), GXutil.rtrim( localUtil.format( AV58CCSVal, edtavCcsval_Picture)), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcsval_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcsval_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, edtavCcsval_Picture, "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcsmax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcsmax_Internalname, httpContext.getMessage( "Valor Máximo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_106_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcsmax_Internalname, GXutil.rtrim( AV59CCSMax), GXutil.rtrim( localUtil.format( AV59CCSMax, edtavCcsmax_Picture)), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcsmax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcsmax_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, edtavCcsmax_Picture, "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMask_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMask_Internalname, httpContext.getMessage( "Mascara", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_106_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMask_Internalname, AV67Mask, GXutil.rtrim( localUtil.format( AV67Mask, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMask_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMask_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridcontrolcalidad_ccsta_sdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridcontrolcalidad_ccsta_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol106( ) ;
      }
      if ( wbEnd == 106 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_106 = (int)(nGXsfl_106_idx-1) ;
         if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV88GXV1 = nGXsfl_106_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_ccsta_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridcontrolcalidad_ccsta_sdts", Gridcontrolcalidad_ccsta_sdtsContainer, subGridcontrolcalidad_ccsta_sdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_ccsta_sdtsContainerData", Gridcontrolcalidad_ccsta_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_ccsta_sdtsContainerData"+"V", Gridcontrolcalidad_ccsta_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcontrolcalidad_ccsta_sdtsContainerData"+"V"+"\" value='"+Gridcontrolcalidad_ccsta_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("Class", Gridcontrolcalidad_ccsta_sdtspaginationbar_Class);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("ShowFirst", Gridcontrolcalidad_ccsta_sdtspaginationbar_Showfirst);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("ShowPrevious", Gridcontrolcalidad_ccsta_sdtspaginationbar_Showprevious);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("ShowNext", Gridcontrolcalidad_ccsta_sdtspaginationbar_Shownext);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("ShowLast", Gridcontrolcalidad_ccsta_sdtspaginationbar_Showlast);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("PagesToShow", Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagestoshow);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("PagingButtonsPosition", Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagingbuttonsposition);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("PagingCaptionPosition", Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagingcaptionposition);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("EmptyGridClass", Gridcontrolcalidad_ccsta_sdtspaginationbar_Emptygridclass);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("RowsPerPageSelector", Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselector);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("RowsPerPageOptions", Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageoptions);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("Previous", Gridcontrolcalidad_ccsta_sdtspaginationbar_Previous);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("Next", Gridcontrolcalidad_ccsta_sdtspaginationbar_Next);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("Caption", Gridcontrolcalidad_ccsta_sdtspaginationbar_Caption);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("EmptyGridCaption", Gridcontrolcalidad_ccsta_sdtspaginationbar_Emptygridcaption);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("RowsPerPageCaption", Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpagecaption);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("CurrentPage", AV76GridControlCalidad_CCSTA_SDTsCurrentPage);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.setProperty("PageCount", AV77GridControlCalidad_CCSTA_SDTsPageCount);
         ucGridcontrolcalidad_ccsta_sdtspaginationbar.render(context, "dvelop.dvpaginationbar", Gridcontrolcalidad_ccsta_sdtspaginationbar_Internalname, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 106, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiarvariables_Internalname, "gx.evt.setGridEvt("+GXutil.str( 106, 3, 0)+","+"null"+");", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiarvariables_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIARVARIABLES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 106, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
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
         wb_table1_127_2BY2( true) ;
      }
      else
      {
         wb_table1_127_2BY2( false) ;
      }
      return  ;
   }

   public void wb_table1_127_2BY2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
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
         startgridcontrol141( ) ;
      }
      if ( wbEnd == 141 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_141 = (int)(nGXsfl_141_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV20GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV21GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV92Pgmname), GXutil.rtrim( localUtil.format( AV92Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'" + sGXsfl_106_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV17CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17CCTLin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,168);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctlin_Jsonclick, 0, "Attribute", "", "", "", "", edtavCctlin_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCSTA_WP.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV19DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_170_2BY2( true) ;
      }
      else
      {
         wb_table2_170_2BY2( false) ;
      }
      return  ;
   }

   public void wb_table2_170_2BY2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* User Defined Control */
         ucGridcontrolcalidad_ccsta_sdts_empowerer.render(context, "wwp.gridempowerer", Gridcontrolcalidad_ccsta_sdts_empowerer_Internalname, "GRIDCONTROLCALIDAD_CCSTA_SDTS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 106 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV88GXV1 = nGXsfl_106_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_ccsta_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridcontrolcalidad_ccsta_sdts", Gridcontrolcalidad_ccsta_sdtsContainer, subGridcontrolcalidad_ccsta_sdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_ccsta_sdtsContainerData", Gridcontrolcalidad_ccsta_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridcontrolcalidad_ccsta_sdtsContainerData"+"V", Gridcontrolcalidad_ccsta_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridcontrolcalidad_ccsta_sdtsContainerData"+"V"+"\" value='"+Gridcontrolcalidad_ccsta_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 141 )
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

   public void start2BY2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Valores Estandars", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2BY0( ) ;
   }

   public void ws2BY2( )
   {
      start2BY2( ) ;
      evt2BY2( ) ;
   }

   public void evt2BY2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_CCTLIN.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172BY2 ();
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
                                 e182BY2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIARVARIABLES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiarVariables' */
                           e192BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e202BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCSVAL.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e212BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCSMAX.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e222BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCSMIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e232BY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCSAUTO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e242BY2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 34), "GRIDCONTROLCALIDAD_CCSTA_SDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_106_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1062( ) ;
                           AV88GXV1 = (int)(nGXsfl_106_idx+GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage) ;
                           if ( ( AV74ControlCalidad_CCSTA_SDT.size() >= AV88GXV1 ) && ( AV88GXV1 > 0 ) )
                           {
                              AV74ControlCalidad_CCSTA_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV74ControlCalidad_CCSTA_SDT.elementAt(-1+AV88GXV1)) );
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
                                 e252BY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e262BY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDCONTROLCALIDAD_CCSTA_SDTS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e272BY2 ();
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
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "CCTLIN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "GRID.REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "CCTLIN.CLICK") == 0 ) )
                        {
                           nGXsfl_141_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1413( ) ;
                           A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
                           A13247CCSMetodo = httpContext.cgiGet( edtCCSMetodo_Internalname) ;
                           n13247CCSMetodo = false ;
                           A13248CCSEspecif = httpContext.cgiGet( edtCCSEspecif_Internalname) ;
                           n13248CCSEspecif = false ;
                           A11530CCSAuto = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCSAuto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A11532CCSVTol = localUtil.ctond( httpContext.cgiGet( edtCCSVTol_Internalname)) ;
                           A11482CCSMin = httpContext.cgiGet( edtCCSMin_Internalname) ;
                           n11482CCSMin = false ;
                           A4060CCSVal = httpContext.cgiGet( edtCCSVal_Internalname) ;
                           n4060CCSVal = false ;
                           A11483CCSMax = httpContext.cgiGet( edtCCSMax_Internalname) ;
                           n11483CCSMax = false ;
                           A11531CCSVCod = httpContext.cgiGet( edtCCSVCod_Internalname) ;
                           cmbCCTLinTpoD.setName( cmbCCTLinTpoD.getInternalname() );
                           cmbCCTLinTpoD.setValue( httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) );
                           A4044CCTLinTpoD = httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) ;
                           A4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4046CCTLinPict = httpContext.cgiGet( edtCCTLinPict_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e282BY3 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "CCTLIN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e292BY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e302BY3 ();
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

   public void we2BY2( )
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

   public void pa2BY2( )
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
            GX_FocusControl = chkavCcsauto.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridcontrolcalidad_ccsta_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1062( ) ;
      while ( nGXsfl_106_idx <= nRC_GXsfl_106 )
      {
         sendrow_1062( ) ;
         nGXsfl_106_idx = ((subGridcontrolcalidad_ccsta_sdts_Islastpage==1)&&(nGXsfl_106_idx+1>subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_106_idx+1) ;
         sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1062( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridcontrolcalidad_ccsta_sdtsContainer)) ;
      /* End function gxnrGridcontrolcalidad_ccsta_sdts_newrow */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1413( ) ;
      while ( nGXsfl_141_idx <= nRC_GXsfl_141 )
      {
         sendrow_1413( ) ;
         nGXsfl_141_idx = ((subGrid_Islastpage==1)&&(nGXsfl_141_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_141_idx+1) ;
         sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1413( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgridcontrolcalidad_ccsta_sdts_refresh( int subGridcontrolcalidad_ccsta_sdts_Rows ,
                                                          int subGrid_Rows ,
                                                          short AV17CCTLin ,
                                                          String AV92Pgmname ,
                                                          short AV26OrderedBy ,
                                                          boolean AV27OrderedDsc ,
                                                          short AV44TFCCTLin ,
                                                          short AV45TFCCTLin_To ,
                                                          String AV46TFCCTLinDsc ,
                                                          String AV47TFCCTLinDsc_Sel ,
                                                          String AV36TFCCSMetodo ,
                                                          String AV37TFCCSMetodo_Sel ,
                                                          String AV32TFCCSEspecif ,
                                                          String AV33TFCCSEspecif_Sel ,
                                                          byte AV30TFCCSAuto ,
                                                          byte AV31TFCCSAuto_To ,
                                                          java.math.BigDecimal AV42TFCCSVTol ,
                                                          java.math.BigDecimal AV43TFCCSVTol_To ,
                                                          String AV38TFCCSMin ,
                                                          String AV39TFCCSMin_Sel ,
                                                          String AV40TFCCSVal ,
                                                          String AV41TFCCSVal_Sel ,
                                                          String AV34TFCCSMax ,
                                                          String AV35TFCCSMax_Sel ,
                                                          byte AV11CCSAuto )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e262BY2 ();
      GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord = 0 ;
      rf2BY2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCSTA_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_ccsta_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGridcontrolcalidad_ccsta_sdts_refresh */
   }

   public void gxgrgrid_refresh( int subGridcontrolcalidad_ccsta_sdts_Rows ,
                                 int subGrid_Rows ,
                                 String AV10EmprCod ,
                                 int AV8CliCod ,
                                 String AV5ArtCod ,
                                 String AV6CCFColNom ,
                                 int AV7CCFColNum ,
                                 int AV15CCTCod ,
                                 short AV17CCTLin ,
                                 String AV92Pgmname ,
                                 short AV26OrderedBy ,
                                 boolean AV27OrderedDsc ,
                                 short AV44TFCCTLin ,
                                 short AV45TFCCTLin_To ,
                                 String AV46TFCCTLinDsc ,
                                 String AV47TFCCTLinDsc_Sel ,
                                 String AV36TFCCSMetodo ,
                                 String AV37TFCCSMetodo_Sel ,
                                 String AV32TFCCSEspecif ,
                                 String AV33TFCCSEspecif_Sel ,
                                 byte AV30TFCCSAuto ,
                                 byte AV31TFCCSAuto_To ,
                                 java.math.BigDecimal AV42TFCCSVTol ,
                                 java.math.BigDecimal AV43TFCCSVTol_To ,
                                 String AV38TFCCSMin ,
                                 String AV39TFCCSMin_Sel ,
                                 String AV40TFCCSVal ,
                                 String AV41TFCCSVal_Sel ,
                                 String AV34TFCCSMax ,
                                 String AV35TFCCSMax_Sel ,
                                 byte AV11CCSAuto )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e262BY2 ();
      GRID_nCurrentRecord = 0 ;
      rf2BY3( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCSTA_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_ccsta_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      AV11CCSAuto = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV11CCSAuto, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11CCSAuto", GXutil.str( AV11CCSAuto, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2BY2( ) ;
      rf2BY3( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV92Pgmname = "ControlCalidadHTD.ControlCalidad_CCSTA_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Pgmname", AV92Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Enabled), 5, 0), true);
      edtavCcfcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcfcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcfcolnom_Enabled), 5, 0), true);
      edtavCcfcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcfcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcfcolnum_Enabled), 5, 0), true);
      edtavCctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcod_Enabled), 5, 0), true);
      edtavCctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdsc_Enabled), 5, 0), true);
      edtavMask_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMask_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMask_Enabled), 5, 0), true);
      edtavControlcalidad_ccsta_sdt__cctvallin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctvallin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctvallin_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtavControlcalidad_ccsta_sdt__cctval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctval_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridcontrolcalidad_ccsta_sdtsContainer.ClearRows();
      }
      wbStart = (short)(106) ;
      /* Execute user event: Refresh */
      e262BY2 ();
      nGXsfl_106_idx = 1 ;
      sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1062( ) ;
      bGXsfl_106_Refreshing = true ;
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_ccsta_sdts");
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("CmpContext", "");
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridcontrolcalidad_ccsta_sdtsContainer.setPageSize( subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1062( ) ;
         e272BY2 ();
         if ( ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord > 0 ) && ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_106_idx == 1 ) )
         {
            GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord = 0 ;
            GRIDCONTROLCALIDAD_CCSTA_SDTS_nGridOutOfScope = 1 ;
            subgridcontrolcalidad_ccsta_sdts_firstpage( ) ;
            e272BY2 ();
         }
         wbEnd = (short)(106) ;
         wb2BY0( ) ;
      }
      bGXsfl_106_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2BY2( )
   {
   }

   public void rf2BY3( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(141) ;
      e302BY3 ();
      nGXsfl_141_idx = 1 ;
      sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1413( ) ;
      bGXsfl_141_Refreshing = true ;
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
         subsflControlProps_1413( ) ;
         GXPagingFrom3 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo3 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) ,
                                              Short.valueOf(AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) ,
                                              AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                              AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                              AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                              AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                              AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                              AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                              Byte.valueOf(AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) ,
                                              Byte.valueOf(AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) ,
                                              AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                              AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                              AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                              AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                              AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                              AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                              AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                              AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                              Short.valueOf(A4034CCTLin) ,
                                              A4043CCTLinDsc ,
                                              A13247CCSMetodo ,
                                              A13248CCSEspecif ,
                                              Byte.valueOf(A11530CCSAuto) ,
                                              A11532CCSVTol ,
                                              A11482CCSMin ,
                                              A4060CCSVal ,
                                              A11483CCSMax ,
                                              Short.valueOf(AV26OrderedBy) ,
                                              Boolean.valueOf(AV27OrderedDsc) ,
                                              AV10EmprCod ,
                                              Integer.valueOf(AV8CliCod) ,
                                              AV5ArtCod ,
                                              AV6CCFColNom ,
                                              Integer.valueOf(AV7CCFColNum) ,
                                              Integer.valueOf(AV15CCTCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) ,
                                              A65ArtCod ,
                                              A4058CCFColNom ,
                                              Integer.valueOf(A4059CCFColNum) ,
                                              Integer.valueOf(A4031CCTCod) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                              }
         });
         lV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc), 30, "%") ;
         lV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = GXutil.padr( GXutil.rtrim( AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo), 30, "%") ;
         lV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = GXutil.padr( GXutil.rtrim( AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif), 30, "%") ;
         lV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = GXutil.padr( GXutil.rtrim( AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin), 40, "%") ;
         lV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = GXutil.padr( GXutil.rtrim( AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval), 40, "%") ;
         lV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = GXutil.padr( GXutil.rtrim( AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax), 40, "%") ;
         /* Using cursor H02BY2 */
         pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV8CliCod), AV5ArtCod, AV6CCFColNom, Integer.valueOf(AV7CCFColNum), Integer.valueOf(AV15CCTCod), Short.valueOf(AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin), Short.valueOf(AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to), lV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc, AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel, lV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo, AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel, lV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif, AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel, Byte.valueOf(AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto), Byte.valueOf(AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to), AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol, AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to, lV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin, AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel, lV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval, AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel, lV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax, AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel, Integer.valueOf(GXPagingFrom3), Integer.valueOf(GXPagingTo3), Integer.valueOf(GXPagingTo3), Integer.valueOf(GXPagingFrom3), Integer.valueOf(GXPagingFrom3)});
         nGXsfl_141_idx = 1 ;
         sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1413( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4031CCTCod = H02BY2_A4031CCTCod[0] ;
            A4059CCFColNum = H02BY2_A4059CCFColNum[0] ;
            A4058CCFColNom = H02BY2_A4058CCFColNom[0] ;
            A65ArtCod = H02BY2_A65ArtCod[0] ;
            A252CliCod = H02BY2_A252CliCod[0] ;
            A396EmprCod = H02BY2_A396EmprCod[0] ;
            A4046CCTLinPict = H02BY2_A4046CCTLinPict[0] ;
            A4045CCTLinLgoD = H02BY2_A4045CCTLinLgoD[0] ;
            A4044CCTLinTpoD = H02BY2_A4044CCTLinTpoD[0] ;
            A11531CCSVCod = H02BY2_A11531CCSVCod[0] ;
            A11483CCSMax = H02BY2_A11483CCSMax[0] ;
            n11483CCSMax = H02BY2_n11483CCSMax[0] ;
            A4060CCSVal = H02BY2_A4060CCSVal[0] ;
            n4060CCSVal = H02BY2_n4060CCSVal[0] ;
            A11482CCSMin = H02BY2_A11482CCSMin[0] ;
            n11482CCSMin = H02BY2_n11482CCSMin[0] ;
            A11532CCSVTol = H02BY2_A11532CCSVTol[0] ;
            A11530CCSAuto = H02BY2_A11530CCSAuto[0] ;
            A13248CCSEspecif = H02BY2_A13248CCSEspecif[0] ;
            n13248CCSEspecif = H02BY2_n13248CCSEspecif[0] ;
            A13247CCSMetodo = H02BY2_A13247CCSMetodo[0] ;
            n13247CCSMetodo = H02BY2_n13247CCSMetodo[0] ;
            A4043CCTLinDsc = H02BY2_A4043CCTLinDsc[0] ;
            A4034CCTLin = H02BY2_A4034CCTLin[0] ;
            A4046CCTLinPict = H02BY2_A4046CCTLinPict[0] ;
            A4045CCTLinLgoD = H02BY2_A4045CCTLinLgoD[0] ;
            A4044CCTLinTpoD = H02BY2_A4044CCTLinTpoD[0] ;
            A4043CCTLinDsc = H02BY2_A4043CCTLinDsc[0] ;
            e282BY3 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(141) ;
         wb2BY0( ) ;
      }
      bGXsfl_141_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2BY3( )
   {
   }

   public int subgridcontrolcalidad_ccsta_sdts_fnc_pagecount( )
   {
      GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount = subgridcontrolcalidad_ccsta_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount) % (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount/ (double) (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount/ (double) (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridcontrolcalidad_ccsta_sdts_fnc_recordcount( )
   {
      return AV74ControlCalidad_CCSTA_SDT.size() ;
   }

   public int subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )
   {
      if ( subGridcontrolcalidad_ccsta_sdts_Rows > 0 )
      {
         return subGridcontrolcalidad_ccsta_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridcontrolcalidad_ccsta_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage/ (double) (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridcontrolcalidad_ccsta_sdts_firstpage( )
   {
      GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridcontrolcalidad_ccsta_sdts_nextpage( )
   {
      GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount = subgridcontrolcalidad_ccsta_sdts_fnc_recordcount( ) ;
      if ( ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount >= subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) ) && ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF == 0 ) )
      {
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage+subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridcontrolcalidad_ccsta_sdts_previouspage( )
   {
      if ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage >= subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) )
      {
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage-subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridcontrolcalidad_ccsta_sdts_lastpage( )
   {
      GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount = subgridcontrolcalidad_ccsta_sdts_fnc_recordcount( ) ;
      if ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount > subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount) % (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount-subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = (long)(GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount-((int)((GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount) % (subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridcontrolcalidad_ccsta_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = (long)(subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
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
      AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV44TFCCTLin ;
      AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV45TFCCTLin_To ;
      AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV46TFCCTLinDsc ;
      AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV47TFCCTLinDsc_Sel ;
      AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV36TFCCSMetodo ;
      AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV37TFCCSMetodo_Sel ;
      AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV30TFCCSAuto ;
      AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV31TFCCSAuto_To ;
      AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV42TFCCSVTol ;
      AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV43TFCCSVTol_To ;
      AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV38TFCCSMin ;
      AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV39TFCCSMin_Sel ;
      AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV40TFCCSVal ;
      AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV41TFCCSVal_Sel ;
      AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV34TFCCSMax ;
      AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV35TFCCSMax_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) ,
                                           AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                           AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                           AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                           AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                           AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                           AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                           Byte.valueOf(AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) ,
                                           Byte.valueOf(AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) ,
                                           AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                           AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                           AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                           AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                           AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                           AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                           AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                           AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A13247CCSMetodo ,
                                           A13248CCSEspecif ,
                                           Byte.valueOf(A11530CCSAuto) ,
                                           A11532CCSVTol ,
                                           A11482CCSMin ,
                                           A4060CCSVal ,
                                           A11483CCSMax ,
                                           Short.valueOf(AV26OrderedBy) ,
                                           Boolean.valueOf(AV27OrderedDsc) ,
                                           AV10EmprCod ,
                                           Integer.valueOf(AV8CliCod) ,
                                           AV5ArtCod ,
                                           AV6CCFColNom ,
                                           Integer.valueOf(AV7CCFColNum) ,
                                           Integer.valueOf(AV15CCTCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           A4058CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Integer.valueOf(A4031CCTCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc), 30, "%") ;
      lV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = GXutil.padr( GXutil.rtrim( AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo), 30, "%") ;
      lV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = GXutil.padr( GXutil.rtrim( AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif), 30, "%") ;
      lV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = GXutil.padr( GXutil.rtrim( AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin), 40, "%") ;
      lV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = GXutil.padr( GXutil.rtrim( AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval), 40, "%") ;
      lV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = GXutil.padr( GXutil.rtrim( AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax), 40, "%") ;
      /* Using cursor H02BY3 */
      pr_default.execute(1, new Object[] {AV10EmprCod, Integer.valueOf(AV8CliCod), AV5ArtCod, AV6CCFColNom, Integer.valueOf(AV7CCFColNum), Integer.valueOf(AV15CCTCod), Short.valueOf(AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin), Short.valueOf(AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to), lV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc, AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel, lV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo, AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel, lV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif, AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel, Byte.valueOf(AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto), Byte.valueOf(AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to), AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol, AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to, lV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin, AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel, lV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval, AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel, lV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax, AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel});
      GRID_nRecordCount = H02BY3_AGRID_nRecordCount[0] ;
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
      AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV44TFCCTLin ;
      AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV45TFCCTLin_To ;
      AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV46TFCCTLinDsc ;
      AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV47TFCCTLinDsc_Sel ;
      AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV36TFCCSMetodo ;
      AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV37TFCCSMetodo_Sel ;
      AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV30TFCCSAuto ;
      AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV31TFCCSAuto_To ;
      AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV42TFCCSVTol ;
      AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV43TFCCSVTol_To ;
      AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV38TFCCSMin ;
      AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV39TFCCSMin_Sel ;
      AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV40TFCCSVal ;
      AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV41TFCCSVal_Sel ;
      AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV34TFCCSMax ;
      AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV35TFCCSMax_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV44TFCCTLin ;
      AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV45TFCCTLin_To ;
      AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV46TFCCTLinDsc ;
      AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV47TFCCTLinDsc_Sel ;
      AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV36TFCCSMetodo ;
      AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV37TFCCSMetodo_Sel ;
      AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV30TFCCSAuto ;
      AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV31TFCCSAuto_To ;
      AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV42TFCCSVTol ;
      AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV43TFCCSVTol_To ;
      AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV38TFCCSMin ;
      AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV39TFCCSMin_Sel ;
      AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV40TFCCSVal ;
      AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV41TFCCSVal_Sel ;
      AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV34TFCCSMax ;
      AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV35TFCCSMax_Sel ;
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
         gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV44TFCCTLin ;
      AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV45TFCCTLin_To ;
      AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV46TFCCTLinDsc ;
      AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV47TFCCTLinDsc_Sel ;
      AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV36TFCCSMetodo ;
      AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV37TFCCSMetodo_Sel ;
      AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV30TFCCSAuto ;
      AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV31TFCCSAuto_To ;
      AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV42TFCCSVTol ;
      AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV43TFCCSVTol_To ;
      AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV38TFCCSMin ;
      AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV39TFCCSMin_Sel ;
      AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV40TFCCSVal ;
      AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV41TFCCSVal_Sel ;
      AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV34TFCCSMax ;
      AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV35TFCCSMax_Sel ;
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
         gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV44TFCCTLin ;
      AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV45TFCCTLin_To ;
      AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV46TFCCTLinDsc ;
      AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV47TFCCTLinDsc_Sel ;
      AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV36TFCCSMetodo ;
      AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV37TFCCSMetodo_Sel ;
      AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV30TFCCSAuto ;
      AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV31TFCCSAuto_To ;
      AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV42TFCCSVTol ;
      AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV43TFCCSVTol_To ;
      AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV38TFCCSMin ;
      AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV39TFCCSMin_Sel ;
      AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV40TFCCSVal ;
      AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV41TFCCSVal_Sel ;
      AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV34TFCCSMax ;
      AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV35TFCCSMax_Sel ;
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
         gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV44TFCCTLin ;
      AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV45TFCCTLin_To ;
      AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV46TFCCTLinDsc ;
      AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV47TFCCTLinDsc_Sel ;
      AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV36TFCCSMetodo ;
      AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV37TFCCSMetodo_Sel ;
      AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV30TFCCSAuto ;
      AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV31TFCCSAuto_To ;
      AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV42TFCCSVTol ;
      AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV43TFCCSVTol_To ;
      AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV38TFCCSMin ;
      AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV39TFCCSMin_Sel ;
      AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV40TFCCSVal ;
      AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV41TFCCSVal_Sel ;
      AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV34TFCCSMax ;
      AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV35TFCCSMax_Sel ;
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
         gxgrgrid_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV92Pgmname = "ControlCalidadHTD.ControlCalidad_CCSTA_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Pgmname", AV92Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavArtcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcod_Enabled), 5, 0), true);
      edtavCcfcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcfcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcfcolnom_Enabled), 5, 0), true);
      edtavCcfcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcfcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcfcolnum_Enabled), 5, 0), true);
      edtavCctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctcod_Enabled), 5, 0), true);
      edtavCctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctdsc_Enabled), 5, 0), true);
      edtavMask_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMask_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMask_Enabled), 5, 0), true);
      edtavControlcalidad_ccsta_sdt__cctvallin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctvallin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctvallin_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtavControlcalidad_ccsta_sdt__cctval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavControlcalidad_ccsta_sdt__cctval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavControlcalidad_ccsta_sdt__cctval_Enabled), 5, 0), !bGXsfl_106_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e252BY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Controlcalidad_ccsta_sdt"), AV74ControlCalidad_CCSTA_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV19DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCCTLIN_DATA"), AV60CCTLin_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCONTROLCALIDAD_CCSTA_SDT"), AV74ControlCalidad_CCSTA_SDT);
         /* Read saved values. */
         nRC_GXsfl_106 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_106"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_141 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_141"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV76GridControlCalidad_CCSTA_SDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV77GridControlCalidad_CCSTA_SDTsPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV20GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV21GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridcontrolcalidad_ccsta_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Combo_cctlin_Cls = httpContext.cgiGet( "COMBO_CCTLIN_Cls") ;
         Combo_cctlin_Selectedvalue_set = httpContext.cgiGet( "COMBO_CCTLIN_Selectedvalue_set") ;
         Combo_cctlin_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CCTLIN_Enabled")) ;
         Combo_cctlin_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CCTLIN_Emptyitem")) ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Class = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Class") ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Showfirst")) ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Showprevious")) ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Shownext")) ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Showlast")) ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Emptygridclass") ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Previous = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Previous") ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Next = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Next") ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Caption = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Caption") ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Emptygridcaption") ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
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
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTS_EMPOWERER_Gridinternalname") ;
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
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Selectedpage = httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Selectedpage") ;
         Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Combo_cctlin_Selectedvalue_get = httpContext.cgiGet( "COMBO_CCTLIN_Selectedvalue_get") ;
         nRC_GXsfl_106 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_106"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_106_fel_idx = 0 ;
         while ( nGXsfl_106_fel_idx < nRC_GXsfl_106 )
         {
            nGXsfl_106_fel_idx = ((subGridcontrolcalidad_ccsta_sdts_Islastpage==1)&&(nGXsfl_106_fel_idx+1>subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_106_fel_idx+1) ;
            sGXsfl_106_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1062( ) ;
            AV88GXV1 = (int)(nGXsfl_106_fel_idx+GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage) ;
            if ( ( AV74ControlCalidad_CCSTA_SDT.size() >= AV88GXV1 ) && ( AV88GXV1 > 0 ) )
            {
               AV74ControlCalidad_CCSTA_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV74ControlCalidad_CCSTA_SDT.elementAt(-1+AV88GXV1)) );
            }
         }
         if ( nGXsfl_106_fel_idx == 0 )
         {
            nGXsfl_106_idx = 1 ;
            sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1062( ) ;
         }
         nGXsfl_106_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavCcsauto.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavCcsauto.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSAUTO");
            GX_FocusControl = chkavCcsauto.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11CCSAuto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CCSAuto", GXutil.str( AV11CCSAuto, 1, 0));
         }
         else
         {
            AV11CCSAuto = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavCcsauto.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CCSAuto", GXutil.str( AV11CCSAuto, 1, 0));
         }
         AV72CCVal = httpContext.cgiGet( edtavCcval_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72CCVal", AV72CCVal);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCcsvtol_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcsvtol_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSVTOL");
            GX_FocusControl = edtavCcsvtol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14CCSVTol = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CCSVTol", GXutil.ltrimstr( AV14CCSVTol, 5, 2));
         }
         else
         {
            AV14CCSVTol = localUtil.ctond( httpContext.cgiGet( edtavCcsvtol_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CCSVTol", GXutil.ltrimstr( AV14CCSVTol, 5, 2));
         }
         AV57CCSMin = httpContext.cgiGet( edtavCcsmin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57CCSMin", AV57CCSMin);
         AV58CCSVal = httpContext.cgiGet( edtavCcsval_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58CCSVal", AV58CCSVal);
         AV59CCSMax = httpContext.cgiGet( edtavCcsmax_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59CCSMax", AV59CCSMax);
         AV67Mask = httpContext.cgiGet( edtavMask_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
         AV92Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92Pgmname", AV92Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTLIN");
            GX_FocusControl = edtavCctlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17CCTLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CCTLin), 4, 0));
         }
         else
         {
            AV17CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavCctlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CCTLin), 4, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCSTA_WP");
         AV92Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92Pgmname", AV92Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV92Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlcalidadhtd\\controlcalidad_ccsta_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
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
      e252BY2 ();
      if (returnInSub) return;
   }

   public void e252BY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV62Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV62Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV63EmprNom ;
      GXv_char4[0] = AV64UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidad_ccsta_wp_impl.this.AV10EmprCod = GXv_char2[0] ;
      controlcalidad_ccsta_wp_impl.this.AV63EmprNom = GXv_char3[0] ;
      controlcalidad_ccsta_wp_impl.this.AV64UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV19DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV19DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavCctlin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctlin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctlin_Visible), 5, 0), true);
      Combo_cctlin_Enabled = false ;
      ucCombo_cctlin.sendProperty(context, "", false, Combo_cctlin_Internalname, "Enabled", GXutil.booltostr( Combo_cctlin_Enabled));
      /* Execute user subroutine: 'LOADCOMBOCCTLIN' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Valores Estandars", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV26OrderedBy < 1 )
      {
         AV26OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV19DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV19DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname = subGridcontrolcalidad_ccsta_sdts_Internalname ;
      ucGridcontrolcalidad_ccsta_sdts_empowerer.sendProperty(context, "", false, Gridcontrolcalidad_ccsta_sdts_empowerer_Internalname, "GridInternalName", Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname);
      subGridcontrolcalidad_ccsta_sdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue = subGridcontrolcalidad_ccsta_sdts_Rows ;
      ucGridcontrolcalidad_ccsta_sdtspaginationbar.sendProperty(context, "", false, Gridcontrolcalidad_ccsta_sdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e262BY2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV56WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV56WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV20GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridCurrentPage), 10, 0));
      AV21GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridPageCount), 10, 0));
      AV76GridControlCalidad_CCSTA_SDTsCurrentPage = subgridcontrolcalidad_ccsta_sdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76GridControlCalidad_CCSTA_SDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76GridControlCalidad_CCSTA_SDTsCurrentPage), 10, 0));
      AV77GridControlCalidad_CCSTA_SDTsPageCount = subgridcontrolcalidad_ccsta_sdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77GridControlCalidad_CCSTA_SDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77GridControlCalidad_CCSTA_SDTsPageCount), 10, 0));
      if ( (0==AV17CCTLin) )
      {
         edtavCcsmin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsmin_Enabled), 5, 0), true);
         edtavCcsval_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsval_Enabled), 5, 0), true);
         edtavCcsmax_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsmax_Enabled), 5, 0), true);
         chkavCcsauto.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkavCcsauto.getInternalname(), "Enabled", GXutil.ltrimstr( chkavCcsauto.getEnabled(), 5, 0), true);
         edtavCcsvtol_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsvtol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsvtol_Enabled), 5, 0), true);
         edtavCcval_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcval_Enabled), 5, 0), true);
      }
      else
      {
         edtavCcsmin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsmin_Enabled), 5, 0), true);
         edtavCcsval_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsval_Enabled), 5, 0), true);
         edtavCcsmax_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsmax_Enabled), 5, 0), true);
         chkavCcsauto.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, chkavCcsauto.getInternalname(), "Enabled", GXutil.ltrimstr( chkavCcsauto.getEnabled(), 5, 0), true);
         edtavCcsvtol_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsvtol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsvtol_Enabled), 5, 0), true);
         edtavCcval_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcval_Enabled), 5, 0), true);
      }
      /*  Sending Event outputs  */
   }

   public void e142BY2( )
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
         AV28PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV28PageToGo) ;
      }
   }

   public void e152BY2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e162BY2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV26OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrderedBy), 4, 0));
         AV27OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27OrderedDsc", AV27OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLin") == 0 )
         {
            AV44TFCCTLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFCCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFCCTLin), 4, 0));
            AV45TFCCTLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFCCTLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFCCTLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCTLinDsc") == 0 )
         {
            AV46TFCCTLinDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFCCTLinDsc", AV46TFCCTLinDsc);
            AV47TFCCTLinDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFCCTLinDsc_Sel", AV47TFCCTLinDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCSMetodo") == 0 )
         {
            AV36TFCCSMetodo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCCSMetodo", AV36TFCCSMetodo);
            AV37TFCCSMetodo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCCSMetodo_Sel", AV37TFCCSMetodo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCSEspecif") == 0 )
         {
            AV32TFCCSEspecif = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCCSEspecif", AV32TFCCSEspecif);
            AV33TFCCSEspecif_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCCSEspecif_Sel", AV33TFCCSEspecif_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCSAuto") == 0 )
         {
            AV30TFCCSAuto = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCCSAuto", GXutil.str( AV30TFCCSAuto, 1, 0));
            AV31TFCCSAuto_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCCSAuto_To", GXutil.str( AV31TFCCSAuto_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCSVTol") == 0 )
         {
            AV42TFCCSVTol = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCCSVTol", GXutil.ltrimstr( AV42TFCCSVTol, 5, 2));
            AV43TFCCSVTol_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFCCSVTol_To", GXutil.ltrimstr( AV43TFCCSVTol_To, 5, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCSMin") == 0 )
         {
            AV38TFCCSMin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFCCSMin", AV38TFCCSMin);
            AV39TFCCSMin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFCCSMin_Sel", AV39TFCCSMin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCSVal") == 0 )
         {
            AV40TFCCSVal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFCCSVal", AV40TFCCSVal);
            AV41TFCCSVal_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFCCSVal_Sel", AV41TFCCSVal_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCSMax") == 0 )
         {
            AV34TFCCSMax = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCCSMax", AV34TFCCSMax);
            AV35TFCCSMax_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCCSMax_Sel", AV35TFCCSMax_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e182BY2 ();
      if (returnInSub) return;
   }

   public void e182BY2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( AV11CCSAuto == 1 )
      {
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
      }
      else
      {
         lblTbmessage_Caption = " " ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GXv_char4[0] = AV65mensaje ;
         GXv_int8[0] = (byte)(AV66var_ok) ;
         GXv_char3[0] = AV67Mask ;
         new app.controlcalidadhtd.controlcalidad_auditovalorentrado(remoteHandle, context).execute( AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV58CCSVal, GXv_char4, GXv_int8, GXv_char3) ;
         controlcalidad_ccsta_wp_impl.this.AV65mensaje = GXv_char4[0] ;
         controlcalidad_ccsta_wp_impl.this.AV66var_ok = GXv_int8[0] ;
         controlcalidad_ccsta_wp_impl.this.AV67Mask = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
         if ( ! (GXutil.strcmp("", AV65mensaje)==0) && ! (GXutil.strcmp("", AV58CCSVal)==0) )
         {
            GX_FocusControl = edtavCcsval_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            lblTbmessage_Caption = AV65mensaje ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            AV85valor = AV58CCSVal ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85valor", AV85valor);
            /* Execute user subroutine: 'CONTROLMASCARA' */
            S162 ();
            if (returnInSub) return;
            if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
            {
               GX_FocusControl = edtavCcsval_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               httpContext.doAjaxRefresh();
               lblTbmessage_Caption = AV65mensaje ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
            else
            {
               GXv_char4[0] = AV65mensaje ;
               GXv_int8[0] = (byte)(AV66var_ok) ;
               GXv_char3[0] = AV67Mask ;
               new app.controlcalidadhtd.controlcalidad_auditovalorentrado(remoteHandle, context).execute( AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV59CCSMax, GXv_char4, GXv_int8, GXv_char3) ;
               controlcalidad_ccsta_wp_impl.this.AV65mensaje = GXv_char4[0] ;
               controlcalidad_ccsta_wp_impl.this.AV66var_ok = GXv_int8[0] ;
               controlcalidad_ccsta_wp_impl.this.AV67Mask = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
               if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
               {
                  GX_FocusControl = edtavCcsmax_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
                  lblTbmessage_Caption = AV65mensaje ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               }
               else
               {
                  AV85valor = AV59CCSMax ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV85valor", AV85valor);
                  /* Execute user subroutine: 'CONTROLMASCARA' */
                  S162 ();
                  if (returnInSub) return;
                  if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
                  {
                     GX_FocusControl = edtavCcsmax_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                     httpContext.doAjaxRefresh();
                     lblTbmessage_Caption = AV65mensaje ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  }
                  else
                  {
                     GXv_char4[0] = AV65mensaje ;
                     GXv_int8[0] = (byte)(AV66var_ok) ;
                     GXv_char3[0] = AV67Mask ;
                     new app.controlcalidadhtd.controlcalidad_auditovalorentrado(remoteHandle, context).execute( AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV57CCSMin, GXv_char4, GXv_int8, GXv_char3) ;
                     controlcalidad_ccsta_wp_impl.this.AV65mensaje = GXv_char4[0] ;
                     controlcalidad_ccsta_wp_impl.this.AV66var_ok = GXv_int8[0] ;
                     controlcalidad_ccsta_wp_impl.this.AV67Mask = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
                     if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
                     {
                        GX_FocusControl = edtavCcsmin_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                        lblTbmessage_Caption = AV65mensaje ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     }
                     else
                     {
                        AV85valor = AV57CCSMin ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV85valor", AV85valor);
                        /* Execute user subroutine: 'CONTROLMASCARA' */
                        S162 ();
                        if (returnInSub) return;
                        if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
                        {
                           GX_FocusControl = edtavCcsmin_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                           httpContext.doAjaxRefresh();
                           lblTbmessage_Caption = AV65mensaje ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        }
                        else
                        {
                           this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e172BY2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e192BY2( )
   {
      /* 'DoLimpiarVariables' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      AV17CCTLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CCTLin), 4, 0));
      Combo_cctlin_Selectedvalue_set = ((0==AV17CCTLin) ? "" : GXutil.trim( GXutil.str( AV17CCTLin, 4, 0))) ;
      ucCombo_cctlin.sendProperty(context, "", false, Combo_cctlin_Internalname, "SelectedValue_set", Combo_cctlin_Selectedvalue_set);
      AV57CCSMin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57CCSMin", AV57CCSMin);
      AV58CCSVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58CCSVal", AV58CCSVal);
      AV59CCSMax = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59CCSMax", AV59CCSMax);
      AV11CCSAuto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11CCSAuto", GXutil.str( AV11CCSAuto, 1, 0));
      AV68CCSVCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68CCSVCod", AV68CCSVCod);
      AV14CCSVTol = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCSVTol", GXutil.ltrimstr( AV14CCSVTol, 5, 2));
      AV12CCSEspecif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12CCSEspecif", AV12CCSEspecif);
      AV13CCSMetodo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CCSMetodo", AV13CCSMetodo);
      AV67Mask = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
      AV72CCVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72CCVal", AV72CCVal);
      /* Execute user subroutine: 'HABILITAR' */
      S182 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e202BY2( )
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

   private void e272BY2( )
   {
      /* Gridcontrolcalidad_ccsta_sdts_Load Routine */
      returnInSub = false ;
      AV88GXV1 = 1 ;
      while ( AV88GXV1 <= AV74ControlCalidad_CCSTA_SDT.size() )
      {
         AV74ControlCalidad_CCSTA_SDT.currentItem( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV74ControlCalidad_CCSTA_SDT.elementAt(-1+AV88GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(106) ;
         }
         if ( ( subGridcontrolcalidad_ccsta_sdts_Islastpage == 1 ) || ( subGridcontrolcalidad_ccsta_sdts_Rows == 0 ) || ( ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord >= GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage ) && ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord < GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage + subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1062( ) ;
            GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord + 1 >= subgridcontrolcalidad_ccsta_sdts_fnc_recordcount( ) )
            {
               GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord = (long)(GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_106_Refreshing )
         {
            httpContext.doAjaxLoad(106, Gridcontrolcalidad_ccsta_sdtsRow);
         }
         AV88GXV1 = (int)(AV88GXV1+1) ;
      }
   }

   public void e122BY2( )
   {
      /* Gridcontrolcalidad_ccsta_sdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridcontrolcalidad_ccsta_sdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridcontrolcalidad_ccsta_sdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridcontrolcalidad_ccsta_sdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV28PageToGo = subgridcontrolcalidad_ccsta_sdts_fnc_currentpage( ) ;
         AV28PageToGo = (int)(AV28PageToGo+1) ;
         subgridcontrolcalidad_ccsta_sdts_gotopage( AV28PageToGo) ;
      }
      else
      {
         AV28PageToGo = (int)(GXutil.lval( Gridcontrolcalidad_ccsta_sdtspaginationbar_Selectedpage)) ;
         subgridcontrolcalidad_ccsta_sdts_gotopage( AV28PageToGo) ;
      }
   }

   public void e132BY2( )
   {
      /* Gridcontrolcalidad_ccsta_sdtspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridcontrolcalidad_ccsta_sdts_Rows = Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDCONTROLCALIDAD_CCSTA_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridcontrolcalidad_ccsta_sdts_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e112BY2( )
   {
      /* Combo_cctlin_Onoptionclicked Routine */
      returnInSub = false ;
      AV17CCTLin = (short)(GXutil.lval( Combo_cctlin_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CCTLin), 4, 0));
      GXv_char4[0] = AV13CCSMetodo ;
      GXv_char3[0] = AV12CCSEspecif ;
      GXv_int8[0] = AV11CCSAuto ;
      GXv_decimal9[0] = AV14CCSVTol ;
      GXv_char2[0] = AV57CCSMin ;
      GXv_char10[0] = AV58CCSVal ;
      GXv_char11[0] = AV59CCSMax ;
      GXv_char12[0] = AV67Mask ;
      new app.controlcalidadhtd.controlcalidad_ccsta_get(remoteHandle, context).execute( AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, GXv_char4, GXv_char3, GXv_int8, GXv_decimal9, GXv_char2, GXv_char10, GXv_char11, GXv_char12) ;
      controlcalidad_ccsta_wp_impl.this.AV13CCSMetodo = GXv_char4[0] ;
      controlcalidad_ccsta_wp_impl.this.AV12CCSEspecif = GXv_char3[0] ;
      controlcalidad_ccsta_wp_impl.this.AV11CCSAuto = GXv_int8[0] ;
      controlcalidad_ccsta_wp_impl.this.AV14CCSVTol = GXv_decimal9[0] ;
      controlcalidad_ccsta_wp_impl.this.AV57CCSMin = GXv_char2[0] ;
      controlcalidad_ccsta_wp_impl.this.AV58CCSVal = GXv_char10[0] ;
      controlcalidad_ccsta_wp_impl.this.AV59CCSMax = GXv_char11[0] ;
      controlcalidad_ccsta_wp_impl.this.AV67Mask = GXv_char12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CCSMetodo", AV13CCSMetodo);
      httpContext.ajax_rsp_assign_attri("", false, "AV12CCSEspecif", AV12CCSEspecif);
      httpContext.ajax_rsp_assign_attri("", false, "AV11CCSAuto", GXutil.str( AV11CCSAuto, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCSVTol", GXutil.ltrimstr( AV14CCSVTol, 5, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV57CCSMin", AV57CCSMin);
      httpContext.ajax_rsp_assign_attri("", false, "AV58CCSVal", AV58CCSVal);
      httpContext.ajax_rsp_assign_attri("", false, "AV59CCSMax", AV59CCSMax);
      httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
      edtavCcsval_Picture = AV67Mask ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcsval_Internalname, "Picture", edtavCcsval_Picture, true);
      edtavCcsmin_Picture = AV67Mask ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcsmin_Internalname, "Picture", edtavCcsmin_Picture, true);
      edtavCcsmax_Picture = AV67Mask ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcsmax_Internalname, "Picture", edtavCcsmax_Picture, true);
      AV72CCVal = ((AV11CCSAuto==1) ? AV58CCSVal : " ") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72CCVal", AV72CCVal);
      edtavCcval_Picture = AV67Mask ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcval_Internalname, "Picture", edtavCcval_Picture, true);
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV26OrderedBy, 4, 0))+":"+(AV27OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      AV58CCSVal = ((AV11CCSAuto==1) ? AV72CCVal : AV58CCSVal) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58CCSVal", AV58CCSVal);
      GXv_char12[0] = AV10EmprCod ;
      GXv_int13[0] = AV8CliCod ;
      GXv_char11[0] = AV5ArtCod ;
      GXv_char10[0] = AV6CCFColNom ;
      GXv_int14[0] = AV7CCFColNum ;
      GXv_int15[0] = AV15CCTCod ;
      GXv_int16[0] = AV17CCTLin ;
      GXv_char4[0] = AV57CCSMin ;
      GXv_char3[0] = AV58CCSVal ;
      GXv_char2[0] = AV59CCSMax ;
      GXv_int8[0] = AV11CCSAuto ;
      GXv_char17[0] = AV68CCSVCod ;
      GXv_decimal9[0] = AV14CCSVTol ;
      GXv_char18[0] = AV12CCSEspecif ;
      GXv_char19[0] = AV13CCSMetodo ;
      GXv_char20[0] = "E" ;
      new app.controlcalidadhtd.pccstdact(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_char11, GXv_char10, GXv_int14, GXv_int15, GXv_int16, GXv_char4, GXv_char3, GXv_char2, GXv_int8, GXv_char17, GXv_decimal9, GXv_char18, GXv_char19, GXv_char20) ;
      controlcalidad_ccsta_wp_impl.this.AV10EmprCod = GXv_char12[0] ;
      controlcalidad_ccsta_wp_impl.this.AV8CliCod = GXv_int13[0] ;
      controlcalidad_ccsta_wp_impl.this.AV5ArtCod = GXv_char11[0] ;
      controlcalidad_ccsta_wp_impl.this.AV6CCFColNom = GXv_char10[0] ;
      controlcalidad_ccsta_wp_impl.this.AV7CCFColNum = GXv_int14[0] ;
      controlcalidad_ccsta_wp_impl.this.AV15CCTCod = GXv_int15[0] ;
      controlcalidad_ccsta_wp_impl.this.AV17CCTLin = GXv_int16[0] ;
      controlcalidad_ccsta_wp_impl.this.AV57CCSMin = GXv_char4[0] ;
      controlcalidad_ccsta_wp_impl.this.AV58CCSVal = GXv_char3[0] ;
      controlcalidad_ccsta_wp_impl.this.AV59CCSMax = GXv_char2[0] ;
      controlcalidad_ccsta_wp_impl.this.AV11CCSAuto = GXv_int8[0] ;
      controlcalidad_ccsta_wp_impl.this.AV68CCSVCod = GXv_char17[0] ;
      controlcalidad_ccsta_wp_impl.this.AV14CCSVTol = GXv_decimal9[0] ;
      controlcalidad_ccsta_wp_impl.this.AV12CCSEspecif = GXv_char18[0] ;
      controlcalidad_ccsta_wp_impl.this.AV13CCSMetodo = GXv_char19[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5ArtCod", AV5ArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6CCFColNom", AV6CCFColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV7CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CCFColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV15CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CCTCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CCTLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV57CCSMin", AV57CCSMin);
      httpContext.ajax_rsp_assign_attri("", false, "AV58CCSVal", AV58CCSVal);
      httpContext.ajax_rsp_assign_attri("", false, "AV59CCSMax", AV59CCSMax);
      httpContext.ajax_rsp_assign_attri("", false, "AV11CCSAuto", GXutil.str( AV11CCSAuto, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV68CCSVCod", AV68CCSVCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCSVTol", GXutil.ltrimstr( AV14CCSVTol, 5, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV12CCSEspecif", AV12CCSEspecif);
      httpContext.ajax_rsp_assign_attri("", false, "AV13CCSMetodo", AV13CCSMetodo);
      AV17CCTLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CCTLin), 4, 0));
      Combo_cctlin_Selectedvalue_set = ((0==AV17CCTLin) ? "" : GXutil.trim( GXutil.str( AV17CCTLin, 4, 0))) ;
      ucCombo_cctlin.sendProperty(context, "", false, Combo_cctlin_Internalname, "SelectedValue_set", Combo_cctlin_Selectedvalue_set);
      AV57CCSMin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57CCSMin", AV57CCSMin);
      AV58CCSVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58CCSVal", AV58CCSVal);
      AV59CCSMax = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59CCSMax", AV59CCSMax);
      AV11CCSAuto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11CCSAuto", GXutil.str( AV11CCSAuto, 1, 0));
      AV68CCSVCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68CCSVCod", AV68CCSVCod);
      AV14CCSVTol = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCSVTol", GXutil.ltrimstr( AV14CCSVTol, 5, 2));
      AV12CCSEspecif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12CCSEspecif", AV12CCSEspecif);
      AV13CCSMetodo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CCSMetodo", AV13CCSMetodo);
      AV72CCVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72CCVal", AV72CCVal);
      AV67Mask = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
      /* Execute user subroutine: 'HABILITAR' */
      S182 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue(AV92Pgmname+"GridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV92Pgmname+"GridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV29Session.getValue(AV92Pgmname+"GridState"), null, null);
      }
      AV26OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26OrderedBy), 4, 0));
      AV27OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27OrderedDsc", AV27OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV93GXV5 = 1 ;
      while ( AV93GXV5 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV93GXV5));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV44TFCCTLin = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFCCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFCCTLin), 4, 0));
            AV45TFCCTLin_To = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFCCTLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFCCTLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC") == 0 )
         {
            AV46TFCCTLinDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFCCTLinDsc", AV46TFCCTLinDsc);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC_SEL") == 0 )
         {
            AV47TFCCTLinDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFCCTLinDsc_Sel", AV47TFCCTLinDsc_Sel);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMETODO") == 0 )
         {
            AV36TFCCSMetodo = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCCSMetodo", AV36TFCCSMetodo);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMETODO_SEL") == 0 )
         {
            AV37TFCCSMetodo_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCCSMetodo_Sel", AV37TFCCSMetodo_Sel);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSESPECIF") == 0 )
         {
            AV32TFCCSEspecif = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCCSEspecif", AV32TFCCSEspecif);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSESPECIF_SEL") == 0 )
         {
            AV33TFCCSEspecif_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCCSEspecif_Sel", AV33TFCCSEspecif_Sel);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSAUTO") == 0 )
         {
            AV30TFCCSAuto = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCCSAuto", GXutil.str( AV30TFCCSAuto, 1, 0));
            AV31TFCCSAuto_To = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCCSAuto_To", GXutil.str( AV31TFCCSAuto_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSVTOL") == 0 )
         {
            AV42TFCCSVTol = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCCSVTol", GXutil.ltrimstr( AV42TFCCSVTol, 5, 2));
            AV43TFCCSVTol_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFCCSVTol_To", GXutil.ltrimstr( AV43TFCCSVTol_To, 5, 2));
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMIN") == 0 )
         {
            AV38TFCCSMin = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFCCSMin", AV38TFCCSMin);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMIN_SEL") == 0 )
         {
            AV39TFCCSMin_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFCCSMin_Sel", AV39TFCCSMin_Sel);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSVAL") == 0 )
         {
            AV40TFCCSVal = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFCCSVal", AV40TFCCSVal);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSVAL_SEL") == 0 )
         {
            AV41TFCCSVal_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFCCSVal_Sel", AV41TFCCSVal_Sel);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMAX") == 0 )
         {
            AV34TFCCSMax = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCCSMax", AV34TFCCSMax);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMAX_SEL") == 0 )
         {
            AV35TFCCSMax_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCCSMax_Sel", AV35TFCCSMax_Sel);
         }
         AV93GXV5 = (int)(AV93GXV5+1) ;
      }
      GXt_char1 = "" ;
      GXv_char20[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFCCTLinDsc_Sel)==0), AV47TFCCTLinDsc_Sel, GXv_char20) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char1 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char19[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFCCSMetodo_Sel)==0), AV37TFCCSMetodo_Sel, GXv_char19) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char21 = GXv_char19[0] ;
      GXt_char22 = "" ;
      GXv_char18[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFCCSEspecif_Sel)==0), AV33TFCCSEspecif_Sel, GXv_char18) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char22 = GXv_char18[0] ;
      GXt_char23 = "" ;
      GXv_char17[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFCCSMin_Sel)==0), AV39TFCCSMin_Sel, GXv_char17) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char23 = GXv_char17[0] ;
      GXt_char24 = "" ;
      GXv_char12[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFCCSVal_Sel)==0), AV41TFCCSVal_Sel, GXv_char12) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char24 = GXv_char12[0] ;
      GXt_char25 = "" ;
      GXv_char11[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFCCSMax_Sel)==0), AV35TFCCSMax_Sel, GXv_char11) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char25 = GXv_char11[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char21+"|"+GXt_char22+"|||"+GXt_char23+"|"+GXt_char24+"|"+GXt_char25 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char25 = "" ;
      GXv_char20[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFCCTLinDsc)==0), AV46TFCCTLinDsc, GXv_char20) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char25 = GXv_char20[0] ;
      GXt_char24 = "" ;
      GXv_char19[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFCCSMetodo)==0), AV36TFCCSMetodo, GXv_char19) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char24 = GXv_char19[0] ;
      GXt_char23 = "" ;
      GXv_char18[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFCCSEspecif)==0), AV32TFCCSEspecif, GXv_char18) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char23 = GXv_char18[0] ;
      GXt_char22 = "" ;
      GXv_char17[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFCCSMin)==0), AV38TFCCSMin, GXv_char17) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char22 = GXv_char17[0] ;
      GXt_char21 = "" ;
      GXv_char12[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFCCSVal)==0), AV40TFCCSVal, GXv_char12) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char21 = GXv_char12[0] ;
      GXt_char1 = "" ;
      GXv_char11[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFCCSMax)==0), AV34TFCCSMax, GXv_char11) ;
      controlcalidad_ccsta_wp_impl.this.GXt_char1 = GXv_char11[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV44TFCCTLin) ? "" : GXutil.str( AV44TFCCTLin, 4, 0))+"|"+GXt_char25+"|"+GXt_char24+"|"+GXt_char23+"|"+((0==AV30TFCCSAuto) ? "" : GXutil.str( AV30TFCCSAuto, 1, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFCCSVTol)==0) ? "" : GXutil.str( AV42TFCCSVTol, 5, 2))+"|"+GXt_char22+"|"+GXt_char21+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV45TFCCTLin_To) ? "" : GXutil.str( AV45TFCCTLin_To, 4, 0))+"||||"+((0==AV31TFCCSAuto_To) ? "" : GXutil.str( AV31TFCCSAuto_To, 1, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFCCSVTol_To)==0) ? "" : GXutil.str( AV43TFCCSVTol_To, 5, 2))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV22GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV22GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV22GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV22GridState.fromxml(AV29Session.getValue(AV92Pgmname+"GridState"), null, null);
      AV22GridState.setgxTv_SdtWWPGridState_Orderedby( AV26OrderedBy );
      AV22GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV27OrderedDsc );
      AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState26[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCCTLIN", "", !((0==AV44TFCCTLin)&&(0==AV45TFCCTLin_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFCCTLin, 4, 0)), GXutil.trim( GXutil.str( AV45TFCCTLin_To, 4, 0))) ;
      AV22GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCCTLINDSC", "", !(GXutil.strcmp("", AV46TFCCTLinDsc)==0), (short)(0), AV46TFCCTLinDsc, "", !(GXutil.strcmp("", AV47TFCCTLinDsc_Sel)==0), AV47TFCCTLinDsc_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCCSMETODO", "", !(GXutil.strcmp("", AV36TFCCSMetodo)==0), (short)(0), AV36TFCCSMetodo, "", !(GXutil.strcmp("", AV37TFCCSMetodo_Sel)==0), AV37TFCCSMetodo_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCCSESPECIF", "", !(GXutil.strcmp("", AV32TFCCSEspecif)==0), (short)(0), AV32TFCCSEspecif, "", !(GXutil.strcmp("", AV33TFCCSEspecif_Sel)==0), AV33TFCCSEspecif_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCCSAUTO", "", !((0==AV30TFCCSAuto)&&(0==AV31TFCCSAuto_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFCCSAuto, 1, 0)), GXutil.trim( GXutil.str( AV31TFCCSAuto_To, 1, 0))) ;
      AV22GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCCSVTOL", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFCCSVTol)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFCCSVTol_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFCCSVTol, 5, 2)), GXutil.trim( GXutil.str( AV43TFCCSVTol_To, 5, 2))) ;
      AV22GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCCSMIN", "", !(GXutil.strcmp("", AV38TFCCSMin)==0), (short)(0), AV38TFCCSMin, "", !(GXutil.strcmp("", AV39TFCCSMin_Sel)==0), AV39TFCCSMin_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCCSVAL", "", !(GXutil.strcmp("", AV40TFCCSVal)==0), (short)(0), AV40TFCCSVal, "", !(GXutil.strcmp("", AV41TFCCSVal_Sel)==0), AV41TFCCSVal_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFCCSMAX", "", !(GXutil.strcmp("", AV34TFCCSMax)==0), (short)(0), AV34TFCCSMax, "", !(GXutil.strcmp("", AV35TFCCSMax_Sel)==0), AV35TFCCSMax_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState26[0] ;
      AV22GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV22GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV92Pgmname+"GridState", AV22GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV54TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV54TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV92Pgmname );
      AV54TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV54TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV24HTTPRequest.getScriptName()+"?"+AV24HTTPRequest.getQuerystring() );
      AV54TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ControlCalidadHTD.ControlCalidad_CCSTA" );
      AV29Session.setValue("TrnContext", AV54TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'LOADCOMBOCCTLIN' Routine */
      returnInSub = false ;
      AV60CCTLin_Data.clear();
      /* Using cursor H02BY4 */
      pr_default.execute(2, new Object[] {AV10EmprCod, Integer.valueOf(AV8CliCod), AV5ArtCod, AV6CCFColNom, Integer.valueOf(AV7CCFColNum), Integer.valueOf(AV15CCTCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4031CCTCod = H02BY4_A4031CCTCod[0] ;
         A4059CCFColNum = H02BY4_A4059CCFColNum[0] ;
         A4058CCFColNom = H02BY4_A4058CCFColNom[0] ;
         A65ArtCod = H02BY4_A65ArtCod[0] ;
         A252CliCod = H02BY4_A252CliCod[0] ;
         A396EmprCod = H02BY4_A396EmprCod[0] ;
         A4043CCTLinDsc = H02BY4_A4043CCTLinDsc[0] ;
         A4034CCTLin = H02BY4_A4034CCTLin[0] ;
         A4043CCTLinDsc = H02BY4_A4043CCTLinDsc[0] ;
         AV61Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV61Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4034CCTLin, 4, 0)) );
         AV61Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.padl( GXutil.trim( GXutil.str( A4034CCTLin, 2, 0)), (short)(2), "0")+"-"+GXutil.trim( A4043CCTLinDsc) );
         AV60CCTLin_Data.add(AV61Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV60CCTLin_Data.sort("Title");
      Combo_cctlin_Selectedvalue_set = ((0==AV17CCTLin) ? "" : GXutil.trim( GXutil.str( AV17CCTLin, 4, 0))) ;
      ucCombo_cctlin.sendProperty(context, "", false, Combo_cctlin_Internalname, "SelectedValue_set", Combo_cctlin_Selectedvalue_set);
   }

   public void e212BY2( )
   {
      /* Ccsval_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV58CCSVal)==0) )
      {
         if ( ! (GXutil.strcmp("", AV58CCSVal)==0) )
         {
            GXv_char20[0] = AV65mensaje ;
            GXv_int8[0] = (byte)(AV66var_ok) ;
            GXv_char19[0] = AV67Mask ;
            new app.controlcalidadhtd.controlcalidad_auditovalorentrado(remoteHandle, context).execute( AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV58CCSVal, GXv_char20, GXv_int8, GXv_char19) ;
            controlcalidad_ccsta_wp_impl.this.AV65mensaje = GXv_char20[0] ;
            controlcalidad_ccsta_wp_impl.this.AV66var_ok = GXv_int8[0] ;
            controlcalidad_ccsta_wp_impl.this.AV67Mask = GXv_char19[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
            if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
            {
               GX_FocusControl = edtavCcsval_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               httpContext.doAjaxRefresh();
               lblTbmessage_Caption = AV65mensaje ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
            else
            {
               AV85valor = AV58CCSVal ;
               httpContext.ajax_rsp_assign_attri("", false, "AV85valor", AV85valor);
               /* Execute user subroutine: 'CONTROLMASCARA' */
               S162 ();
               if (returnInSub) return;
               if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
               {
                  GX_FocusControl = edtavCcsval_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
                  httpContext.doAjaxRefresh();
                  lblTbmessage_Caption = AV65mensaje ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e222BY2( )
   {
      /* Ccsmax_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV59CCSMax)==0) )
      {
         GXv_char20[0] = AV65mensaje ;
         GXv_int8[0] = (byte)(AV66var_ok) ;
         GXv_char19[0] = AV67Mask ;
         new app.controlcalidadhtd.controlcalidad_auditovalorentrado(remoteHandle, context).execute( AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV59CCSMax, GXv_char20, GXv_int8, GXv_char19) ;
         controlcalidad_ccsta_wp_impl.this.AV65mensaje = GXv_char20[0] ;
         controlcalidad_ccsta_wp_impl.this.AV66var_ok = GXv_int8[0] ;
         controlcalidad_ccsta_wp_impl.this.AV67Mask = GXv_char19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
         if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
         {
            GX_FocusControl = edtavCcsmax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            lblTbmessage_Caption = AV65mensaje ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            AV85valor = AV59CCSMax ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85valor", AV85valor);
            /* Execute user subroutine: 'CONTROLMASCARA' */
            S162 ();
            if (returnInSub) return;
            if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
            {
               GX_FocusControl = edtavCcsmax_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               httpContext.doAjaxRefresh();
               lblTbmessage_Caption = AV65mensaje ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e232BY2( )
   {
      /* Ccsmin_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV57CCSMin)==0) )
      {
         GXv_char20[0] = AV65mensaje ;
         GXv_int8[0] = (byte)(AV66var_ok) ;
         GXv_char19[0] = AV67Mask ;
         new app.controlcalidadhtd.controlcalidad_auditovalorentrado(remoteHandle, context).execute( AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, AV17CCTLin, AV57CCSMin, GXv_char20, GXv_int8, GXv_char19) ;
         controlcalidad_ccsta_wp_impl.this.AV65mensaje = GXv_char20[0] ;
         controlcalidad_ccsta_wp_impl.this.AV66var_ok = GXv_int8[0] ;
         controlcalidad_ccsta_wp_impl.this.AV67Mask = GXv_char19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
         if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
         {
            GX_FocusControl = edtavCcsmin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            lblTbmessage_Caption = AV65mensaje ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            AV85valor = AV57CCSMin ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85valor", AV85valor);
            /* Execute user subroutine: 'CONTROLMASCARA' */
            S162 ();
            if (returnInSub) return;
            if ( ! (GXutil.strcmp("", AV65mensaje)==0) )
            {
               GX_FocusControl = edtavCcsmin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               httpContext.doAjaxRefresh();
               lblTbmessage_Caption = AV65mensaje ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e292BY2( )
   {
      /* CCTLin_Click Routine */
      returnInSub = false ;
      GXv_char20[0] = AV13CCSMetodo ;
      GXv_char19[0] = AV12CCSEspecif ;
      GXv_int8[0] = AV11CCSAuto ;
      GXv_decimal9[0] = AV14CCSVTol ;
      GXv_char18[0] = AV57CCSMin ;
      GXv_char17[0] = AV58CCSVal ;
      GXv_char12[0] = AV59CCSMax ;
      GXv_char11[0] = AV67Mask ;
      new app.controlcalidadhtd.controlcalidad_ccsta_get(remoteHandle, context).execute( AV10EmprCod, AV8CliCod, AV5ArtCod, AV6CCFColNom, AV7CCFColNum, AV15CCTCod, A4034CCTLin, GXv_char20, GXv_char19, GXv_int8, GXv_decimal9, GXv_char18, GXv_char17, GXv_char12, GXv_char11) ;
      controlcalidad_ccsta_wp_impl.this.AV13CCSMetodo = GXv_char20[0] ;
      controlcalidad_ccsta_wp_impl.this.AV12CCSEspecif = GXv_char19[0] ;
      controlcalidad_ccsta_wp_impl.this.AV11CCSAuto = GXv_int8[0] ;
      controlcalidad_ccsta_wp_impl.this.AV14CCSVTol = GXv_decimal9[0] ;
      controlcalidad_ccsta_wp_impl.this.AV57CCSMin = GXv_char18[0] ;
      controlcalidad_ccsta_wp_impl.this.AV58CCSVal = GXv_char17[0] ;
      controlcalidad_ccsta_wp_impl.this.AV59CCSMax = GXv_char12[0] ;
      controlcalidad_ccsta_wp_impl.this.AV67Mask = GXv_char11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CCSMetodo", AV13CCSMetodo);
      httpContext.ajax_rsp_assign_attri("", false, "AV12CCSEspecif", AV12CCSEspecif);
      httpContext.ajax_rsp_assign_attri("", false, "AV11CCSAuto", GXutil.str( AV11CCSAuto, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCSVTol", GXutil.ltrimstr( AV14CCSVTol, 5, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV57CCSMin", AV57CCSMin);
      httpContext.ajax_rsp_assign_attri("", false, "AV58CCSVal", AV58CCSVal);
      httpContext.ajax_rsp_assign_attri("", false, "AV59CCSMax", AV59CCSMax);
      httpContext.ajax_rsp_assign_attri("", false, "AV67Mask", AV67Mask);
      AV17CCTLin = A4034CCTLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCTLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CCTLin), 4, 0));
      AV72CCVal = ((AV11CCSAuto==1) ? AV58CCSVal : " ") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72CCVal", AV72CCVal);
      /* Execute user subroutine: 'HABILITAR' */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'VALORES' */
      S192 ();
      if (returnInSub) return;
      Combo_cctlin_Selectedvalue_set = ((0==AV17CCTLin) ? "" : GXutil.trim( GXutil.str( AV17CCTLin, 4, 0))) ;
      ucCombo_cctlin.sendProperty(context, "", false, Combo_cctlin_Internalname, "SelectedValue_set", Combo_cctlin_Selectedvalue_set);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      if ( gx_BV106 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV74ControlCalidad_CCSTA_SDT", AV74ControlCalidad_CCSTA_SDT);
         nGXsfl_106_bak_idx = nGXsfl_106_idx ;
         gxgrgridcontrolcalidad_ccsta_sdts_refresh( subGridcontrolcalidad_ccsta_sdts_Rows, subGrid_Rows, AV17CCTLin, AV92Pgmname, AV26OrderedBy, AV27OrderedDsc, AV44TFCCTLin, AV45TFCCTLin_To, AV46TFCCTLinDsc, AV47TFCCTLinDsc_Sel, AV36TFCCSMetodo, AV37TFCCSMetodo_Sel, AV32TFCCSEspecif, AV33TFCCSEspecif_Sel, AV30TFCCSAuto, AV31TFCCSAuto_To, AV42TFCCSVTol, AV43TFCCSVTol_To, AV38TFCCSMin, AV39TFCCSMin_Sel, AV40TFCCSVal, AV41TFCCSVal_Sel, AV34TFCCSMax, AV35TFCCSMax_Sel, AV11CCSAuto) ;
         nGXsfl_106_idx = nGXsfl_106_bak_idx ;
         sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1062( ) ;
      }
   }

   public void e242BY2( )
   {
      /* Ccsauto_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'HABILITAR' */
      S182 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S192( )
   {
      /* 'VALORES' Routine */
      returnInSub = false ;
      AV74ControlCalidad_CCSTA_SDT.clear();
      gx_BV106 = true ;
      /* Using cursor H02BY5 */
      pr_default.execute(3, new Object[] {AV10EmprCod, Integer.valueOf(AV8CliCod), AV5ArtCod, AV6CCFColNom, Integer.valueOf(AV7CCFColNum), Integer.valueOf(AV15CCTCod), Short.valueOf(AV17CCTLin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4034CCTLin = H02BY5_A4034CCTLin[0] ;
         A4031CCTCod = H02BY5_A4031CCTCod[0] ;
         A396EmprCod = H02BY5_A396EmprCod[0] ;
         A4059CCFColNum = H02BY5_A4059CCFColNum[0] ;
         A4058CCFColNom = H02BY5_A4058CCFColNom[0] ;
         A65ArtCod = H02BY5_A65ArtCod[0] ;
         A252CliCod = H02BY5_A252CliCod[0] ;
         A11530CCSAuto = H02BY5_A11530CCSAuto[0] ;
         if ( A11530CCSAuto == 0 )
         {
            /* Using cursor H02BY6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4049CCTValLin = H02BY6_A4049CCTValLin[0] ;
               A4051CCTVal = H02BY6_A4051CCTVal[0] ;
               A4050CCTValDsc = H02BY6_A4050CCTValDsc[0] ;
               AV75ControlCalidad_CCSTA_SDT_item = (app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)new app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item(remoteHandle, context);
               AV75ControlCalidad_CCSTA_SDT_item.setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin( A4049CCTValLin );
               AV75ControlCalidad_CCSTA_SDT_item.setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval( A4051CCTVal );
               AV75ControlCalidad_CCSTA_SDT_item.setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc( A4050CCTValDsc );
               AV74ControlCalidad_CCSTA_SDT.add(AV75ControlCalidad_CCSTA_SDT_item, 0);
               gx_BV106 = true ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S182( )
   {
      /* 'HABILITAR' Routine */
      returnInSub = false ;
      if ( AV11CCSAuto == 1 )
      {
         edtavCcsvtol_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsvtol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsvtol_Enabled), 5, 0), true);
         edtavCcsval_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsval_Enabled), 5, 0), true);
         edtavCcsmin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsmin_Enabled), 5, 0), true);
         edtavCcsmax_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsmax_Enabled), 5, 0), true);
         GX_FocusControl = edtavCcsvtol_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         edtavCcsval_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsval_Enabled), 5, 0), true);
         edtavCcsmin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsmin_Enabled), 5, 0), true);
         edtavCcsmax_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsmax_Enabled), 5, 0), true);
         edtavCcsvtol_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCcsvtol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcsvtol_Enabled), 5, 0), true);
         GX_FocusControl = edtavCcsmin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   public void S202( )
   {
      /* 'PICTURETOREGEXNUMBER' Routine */
      returnInSub = false ;
      AV69Regex = "^" ;
      AV70i = (short)(1) ;
      while ( AV70i <= GXutil.len( AV67Mask) )
      {
         AV71c = GXutil.substring( AV67Mask, AV70i, 1) ;
         if ( GXutil.strcmp(AV71c, "9") == 0 )
         {
            AV69Regex += httpContext.getMessage( "\\d", "") ;
         }
         else if ( GXutil.strcmp(AV71c, httpContext.getMessage( "Z", "")) == 0 )
         {
            AV69Regex += httpContext.getMessage( "\\d?", "") ;
         }
         else if ( GXutil.strcmp(AV71c, "#") == 0 )
         {
            AV69Regex += httpContext.getMessage( "\\d?", "") ;
         }
         else if ( GXutil.strcmp(AV71c, ".") == 0 )
         {
            AV69Regex += "\\." ;
         }
         else if ( GXutil.strcmp(AV71c, ",") == 0 )
         {
            AV69Regex += "," ;
         }
         else
         {
            AV69Regex += AV71c ;
         }
         AV70i = (short)(AV70i+1) ;
      }
      AV69Regex += "$" ;
   }

   public void S162( )
   {
      /* 'CONTROLMASCARA' Routine */
      returnInSub = false ;
      AV83PosPunto = (short)(GXutil.strSearch( AV67Mask, ".", 1)) ;
      AV82Length = DecimalUtil.doubleToDec(GXutil.len( AV67Mask)) ;
      if ( AV83PosPunto > 0 )
      {
         AV79EnterosPermitidos = (short)(AV83PosPunto-1) ;
         AV84DecimalesPermitidos = (short)(DecimalUtil.decToDouble(AV82Length.subtract(DecimalUtil.doubleToDec(AV83PosPunto)))) ;
      }
      else
      {
         AV79EnterosPermitidos = (short)(DecimalUtil.decToDouble(AV82Length)) ;
         AV84DecimalesPermitidos = (short)(0) ;
      }
      AV81PosPuntoValor = (short)(GXutil.strSearch( AV85valor, ".", 1)) ;
      AV82Length = DecimalUtil.doubleToDec(GXutil.len( AV85valor)) ;
      if ( AV81PosPuntoValor > 0 )
      {
         AV78CantEnteros = (short)(AV81PosPuntoValor-1) ;
         AV80CantDecimales = (short)(DecimalUtil.decToDouble(AV82Length.subtract(DecimalUtil.doubleToDec(AV81PosPuntoValor)))) ;
      }
      else
      {
         AV78CantEnteros = (short)(DecimalUtil.decToDouble(AV82Length)) ;
         AV80CantDecimales = (short)(0) ;
      }
      if ( AV78CantEnteros > AV79EnterosPermitidos )
      {
         AV65mensaje = (GXutil.format( httpContext.getMessage( "Máximo %1 enteros", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79EnterosPermitidos), 4, 0), "", "", "", "", "", "", "", "")) ;
      }
      if ( AV80CantDecimales > AV84DecimalesPermitidos )
      {
         AV65mensaje = (GXutil.format( httpContext.getMessage( "Máximo %1 decimales", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84DecimalesPermitidos), 4, 0), "", "", "", "", "", "", "", "")) ;
      }
   }

   private void e282BY3( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(141) ;
      }
      sendrow_1413( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_141_Refreshing )
      {
         httpContext.doAjaxLoad(141, GridRow);
      }
   }

   public void e302BY3( )
   {
      /* Grid_Refresh Routine */
      returnInSub = false ;
      AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV44TFCCTLin ;
      AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV45TFCCTLin_To ;
      AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV46TFCCTLinDsc ;
      AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV47TFCCTLinDsc_Sel ;
      AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV36TFCCSMetodo ;
      AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV37TFCCSMetodo_Sel ;
      AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV30TFCCSAuto ;
      AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV31TFCCSAuto_To ;
      AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV42TFCCSVTol ;
      AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV43TFCCSVTol_To ;
      AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV38TFCCSMin ;
      AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV39TFCCSMin_Sel ;
      AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV40TFCCSVal ;
      AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV41TFCCSVal_Sel ;
      AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV34TFCCSMax ;
      AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV35TFCCSMax_Sel ;
   }

   public void wb_table2_170_2BY2( boolean wbgen )
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
         wb_table2_170_2BY2e( true) ;
      }
      else
      {
         wb_table2_170_2BY2e( false) ;
      }
   }

   public void wb_table1_127_2BY2( boolean wbgen )
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
         wb_table1_127_2BY2e( true) ;
      }
      else
      {
         wb_table1_127_2BY2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV10EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      AV8CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
      AV9CliNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9CliNom", AV9CliNom);
      AV5ArtCod = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5ArtCod", AV5ArtCod);
      AV6CCFColNom = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CCFColNom", AV6CCFColNom);
      AV7CCFColNum = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CCFColNum), 6, 0));
      AV15CCTCod = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CCTCod), 6, 0));
      AV16CCTDsc = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CCTDsc", AV16CCTDsc);
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
      pa2BY2( ) ;
      ws2BY2( ) ;
      we2BY2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116153731", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidad_ccsta_wp.js", "?202682116153731", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1062( )
   {
      edtavControlcalidad_ccsta_sdt__cctvallin_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALLIN_"+sGXsfl_106_idx ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALDSC_"+sGXsfl_106_idx ;
      edtavControlcalidad_ccsta_sdt__cctval_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVAL_"+sGXsfl_106_idx ;
   }

   public void subsflControlProps_fel_1062( )
   {
      edtavControlcalidad_ccsta_sdt__cctvallin_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALLIN_"+sGXsfl_106_fel_idx ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALDSC_"+sGXsfl_106_fel_idx ;
      edtavControlcalidad_ccsta_sdt__cctval_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVAL_"+sGXsfl_106_fel_idx ;
   }

   public void sendrow_1062( )
   {
      subsflControlProps_1062( ) ;
      wb2BY0( ) ;
      if ( ( subGridcontrolcalidad_ccsta_sdts_Rows * 1 == 0 ) || ( nGXsfl_106_idx <= subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridcontrolcalidad_ccsta_sdtsRow = GXWebRow.GetNew(context,Gridcontrolcalidad_ccsta_sdtsContainer) ;
         if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridcontrolcalidad_ccsta_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridcontrolcalidad_ccsta_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridcontrolcalidad_ccsta_sdts_Backstyle = (byte)(0) ;
            subGridcontrolcalidad_ccsta_sdts_Backcolor = subGridcontrolcalidad_ccsta_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridcontrolcalidad_ccsta_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridcontrolcalidad_ccsta_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridcontrolcalidad_ccsta_sdts_Class, "") != 0 )
            {
               subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Odd" ;
            }
            subGridcontrolcalidad_ccsta_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridcontrolcalidad_ccsta_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_106_idx) % (2))) == 0 )
            {
               subGridcontrolcalidad_ccsta_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridcontrolcalidad_ccsta_sdts_Class, "") != 0 )
               {
                  subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridcontrolcalidad_ccsta_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridcontrolcalidad_ccsta_sdts_Class, "") != 0 )
               {
                  subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_106_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_ccsta_sdt__cctvallin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV74ControlCalidad_CCSTA_SDT.elementAt(-1+AV88GXV1)).getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavControlcalidad_ccsta_sdt__cctvallin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV74ControlCalidad_CCSTA_SDT.elementAt(-1+AV88GXV1)).getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV74ControlCalidad_CCSTA_SDT.elementAt(-1+AV88GXV1)).getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_ccsta_sdt__cctvallin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_ccsta_sdt__cctvallin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(106),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV74ControlCalidad_CCSTA_SDT.elementAt(-1+AV88GXV1)).getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_ccsta_sdt__cctvaldsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(106),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridcontrolcalidad_ccsta_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavControlcalidad_ccsta_sdt__cctval_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)AV74ControlCalidad_CCSTA_SDT.elementAt(-1+AV88GXV1)).getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavControlcalidad_ccsta_sdt__cctval_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavControlcalidad_ccsta_sdt__cctval_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(106),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2BY2( ) ;
         Gridcontrolcalidad_ccsta_sdtsContainer.AddRow(Gridcontrolcalidad_ccsta_sdtsRow);
         nGXsfl_106_idx = ((subGridcontrolcalidad_ccsta_sdts_Islastpage==1)&&(nGXsfl_106_idx+1>subgridcontrolcalidad_ccsta_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_106_idx+1) ;
         sGXsfl_106_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_106_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1062( ) ;
      }
      /* End function sendrow_1062 */
   }

   public void subsflControlProps_1413( )
   {
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_141_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_141_idx ;
      edtCCSMetodo_Internalname = "CCSMETODO_"+sGXsfl_141_idx ;
      edtCCSEspecif_Internalname = "CCSESPECIF_"+sGXsfl_141_idx ;
      edtCCSAuto_Internalname = "CCSAUTO_"+sGXsfl_141_idx ;
      edtCCSVTol_Internalname = "CCSVTOL_"+sGXsfl_141_idx ;
      edtCCSMin_Internalname = "CCSMIN_"+sGXsfl_141_idx ;
      edtCCSVal_Internalname = "CCSVAL_"+sGXsfl_141_idx ;
      edtCCSMax_Internalname = "CCSMAX_"+sGXsfl_141_idx ;
      edtCCSVCod_Internalname = "CCSVCOD_"+sGXsfl_141_idx ;
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD_"+sGXsfl_141_idx );
      edtCCTLinLgoD_Internalname = "CCTLINLGOD_"+sGXsfl_141_idx ;
      edtCCTLinPict_Internalname = "CCTLINPICT_"+sGXsfl_141_idx ;
   }

   public void subsflControlProps_fel_1413( )
   {
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_141_fel_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_141_fel_idx ;
      edtCCSMetodo_Internalname = "CCSMETODO_"+sGXsfl_141_fel_idx ;
      edtCCSEspecif_Internalname = "CCSESPECIF_"+sGXsfl_141_fel_idx ;
      edtCCSAuto_Internalname = "CCSAUTO_"+sGXsfl_141_fel_idx ;
      edtCCSVTol_Internalname = "CCSVTOL_"+sGXsfl_141_fel_idx ;
      edtCCSMin_Internalname = "CCSMIN_"+sGXsfl_141_fel_idx ;
      edtCCSVal_Internalname = "CCSVAL_"+sGXsfl_141_fel_idx ;
      edtCCSMax_Internalname = "CCSMAX_"+sGXsfl_141_fel_idx ;
      edtCCSVCod_Internalname = "CCSVCOD_"+sGXsfl_141_fel_idx ;
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD_"+sGXsfl_141_fel_idx );
      edtCCTLinLgoD_Internalname = "CCTLINLGOD_"+sGXsfl_141_fel_idx ;
      edtCCTLinPict_Internalname = "CCTLINPICT_"+sGXsfl_141_fel_idx ;
   }

   public void sendrow_1413( )
   {
      subsflControlProps_1413( ) ;
      wb2BY0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_141_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_141_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_141_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"ECCTLIN.CLICK."+sGXsfl_141_idx+"'","","","","",edtCCTLin_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDsc_Internalname,GXutil.rtrim( A4043CCTLinDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCSMetodo_Internalname,GXutil.rtrim( A13247CCSMetodo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCSMetodo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCSEspecif_Internalname,GXutil.rtrim( A13248CCSEspecif),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCSEspecif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCSAuto_Internalname,GXutil.ltrim( localUtil.ntoc( A11530CCSAuto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11530CCSAuto), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCSAuto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCSVTol_Internalname,GXutil.ltrim( localUtil.ntoc( A11532CCSVTol, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11532CCSVTol, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCSVTol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCSMin_Internalname,GXutil.rtrim( A11482CCSMin),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCSMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCSVal_Internalname,GXutil.rtrim( A4060CCSVal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCSVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCSMax_Internalname,GXutil.rtrim( A11483CCSMax),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCSMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCSVCod_Internalname,GXutil.rtrim( A11531CCSVCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCSVCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         GXCCtl = "CCTLINTPOD_" + sGXsfl_141_idx ;
         cmbCCTLinTpoD.setName( GXCCtl );
         cmbCCTLinTpoD.setWebtags( "" );
         cmbCCTLinTpoD.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
         cmbCCTLinTpoD.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
         cmbCCTLinTpoD.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
         cmbCCTLinTpoD.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
         cmbCCTLinTpoD.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
         if ( cmbCCTLinTpoD.getItemCount() > 0 )
         {
            A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCCTLinTpoD,cmbCCTLinTpoD.getInternalname(),GXutil.rtrim( A4044CCTLinTpoD),Integer.valueOf(1),cmbCCTLinTpoD.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), !bGXsfl_141_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinLgoD_Internalname,GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinLgoD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinPict_Internalname,GXutil.rtrim( A4046CCTLinPict),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinPict_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(141),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2BY3( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_141_idx = ((subGrid_Islastpage==1)&&(nGXsfl_141_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_141_idx+1) ;
         sGXsfl_141_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_141_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1413( ) ;
      }
      /* End function sendrow_1413 */
   }

   public void startgridcontrol106( )
   {
      if ( Gridcontrolcalidad_ccsta_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridcontrolcalidad_ccsta_sdtsContainer"+"DivS\" data-gxgridid=\"106\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridcontrolcalidad_ccsta_sdts_Internalname, subGridcontrolcalidad_ccsta_sdts_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 0 )
         {
            subGridcontrolcalidad_ccsta_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridcontrolcalidad_ccsta_sdts_Class) > 0 )
            {
               subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridcontrolcalidad_ccsta_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle == 1 )
            {
               subGridcontrolcalidad_ccsta_sdts_Titlebackcolor = subGridcontrolcalidad_ccsta_sdts_Allbackcolor ;
               if ( GXutil.len( subGridcontrolcalidad_ccsta_sdts_Class) > 0 )
               {
                  subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridcontrolcalidad_ccsta_sdts_Class) > 0 )
               {
                  subGridcontrolcalidad_ccsta_sdts_Linesclass = subGridcontrolcalidad_ccsta_sdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_ccsta_sdts");
      }
      else
      {
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("GridName", "Gridcontrolcalidad_ccsta_sdts");
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Header", subGridcontrolcalidad_ccsta_sdts_Header);
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("CmpContext", "");
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridcontrolcalidad_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_ccsta_sdt__cctvallin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_ccsta_sdtsColumn);
         Gridcontrolcalidad_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_ccsta_sdtsColumn);
         Gridcontrolcalidad_ccsta_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridcontrolcalidad_ccsta_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavControlcalidad_ccsta_sdt__cctval_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddColumnProperties(Gridcontrolcalidad_ccsta_sdtsColumn);
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridcontrolcalidad_ccsta_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridcontrolcalidad_ccsta_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol141( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"141\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Lín", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metodo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Especificacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Auto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tolerancia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Minimo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Standar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maximo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Variable", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Largo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Picture", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4043CCTLinDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13247CCSMetodo));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13248CCSEspecif));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11530CCSAuto, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11532CCSVTol, (byte)(5), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11482CCSMin));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4060CCSVal));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11483CCSMax));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11531CCSVCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4044CCTLinTpoD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4046CCTLinPict));
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
      edtavCcfcolnom_Internalname = "vCCFCOLNOM" ;
      edtavCcfcolnum_Internalname = "vCCFCOLNUM" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavCctcod_Internalname = "vCCTCOD" ;
      edtavCctdsc_Internalname = "vCCTDSC" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockcombo_cctlin_Internalname = "TEXTBLOCKCOMBO_CCTLIN" ;
      Combo_cctlin_Internalname = "COMBO_CCTLIN" ;
      divTablesplittedcctlin_Internalname = "TABLESPLITTEDCCTLIN" ;
      chkavCcsauto.setInternalname( "vCCSAUTO" );
      edtavCcval_Internalname = "vCCVAL" ;
      edtavCcsvtol_Internalname = "vCCSVTOL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavCcsmin_Internalname = "vCCSMIN" ;
      edtavCcsval_Internalname = "vCCSVAL" ;
      edtavCcsmax_Internalname = "vCCSMAX" ;
      edtavMask_Internalname = "vMASK" ;
      divValores_Internalname = "VALORES" ;
      edtavControlcalidad_ccsta_sdt__cctvallin_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALLIN" ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVALDSC" ;
      edtavControlcalidad_ccsta_sdt__cctval_Internalname = "CONTROLCALIDAD_CCSTA_SDT__CCTVAL" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Internalname = "GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR" ;
      divGridcontrolcalidad_ccsta_sdtstablewithpaginationbar_Internalname = "GRIDCONTROLCALIDAD_CCSTA_SDTSTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnlimpiarvariables_Internalname = "BTNLIMPIARVARIABLES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      edtCCSMetodo_Internalname = "CCSMETODO" ;
      edtCCSEspecif_Internalname = "CCSESPECIF" ;
      edtCCSAuto_Internalname = "CCSAUTO" ;
      edtCCSVTol_Internalname = "CCSVTOL" ;
      edtCCSMin_Internalname = "CCSMIN" ;
      edtCCSVal_Internalname = "CCSVAL" ;
      edtCCSMax_Internalname = "CCSMAX" ;
      edtCCSVCod_Internalname = "CCSVCOD" ;
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD" );
      edtCCTLinLgoD_Internalname = "CCTLINLGOD" ;
      edtCCTLinPict_Internalname = "CCTLINPICT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCctlin_Internalname = "vCCTLIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      Gridcontrolcalidad_ccsta_sdts_empowerer_Internalname = "GRIDCONTROLCALIDAD_CCSTA_SDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridcontrolcalidad_ccsta_sdts_Internalname = "GRIDCONTROLCALIDAD_CCSTA_SDTS" ;
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
      subGridcontrolcalidad_ccsta_sdts_Allowcollapsing = (byte)(0) ;
      subGridcontrolcalidad_ccsta_sdts_Allowselection = (byte)(0) ;
      subGridcontrolcalidad_ccsta_sdts_Header = "" ;
      edtCCTLinPict_Jsonclick = "" ;
      edtCCTLinLgoD_Jsonclick = "" ;
      cmbCCTLinTpoD.setJsonclick( "" );
      edtCCSVCod_Jsonclick = "" ;
      edtCCSMax_Jsonclick = "" ;
      edtCCSVal_Jsonclick = "" ;
      edtCCSMin_Jsonclick = "" ;
      edtCCSVTol_Jsonclick = "" ;
      edtCCSAuto_Jsonclick = "" ;
      edtCCSEspecif_Jsonclick = "" ;
      edtCCSMetodo_Jsonclick = "" ;
      edtCCTLinDsc_Jsonclick = "" ;
      edtCCTLin_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavControlcalidad_ccsta_sdt__cctval_Jsonclick = "" ;
      edtavControlcalidad_ccsta_sdt__cctval_Enabled = 0 ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Jsonclick = "" ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled = 0 ;
      edtavControlcalidad_ccsta_sdt__cctvallin_Jsonclick = "" ;
      edtavControlcalidad_ccsta_sdt__cctvallin_Enabled = 0 ;
      subGridcontrolcalidad_ccsta_sdts_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridcontrolcalidad_ccsta_sdts_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavControlcalidad_ccsta_sdt__cctval_Enabled = -1 ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled = -1 ;
      edtavControlcalidad_ccsta_sdt__cctvallin_Enabled = -1 ;
      edtavCctlin_Jsonclick = "" ;
      edtavCctlin_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "" ;
      edtavMask_Jsonclick = "" ;
      edtavMask_Enabled = 1 ;
      edtavCcsmax_Jsonclick = "" ;
      edtavCcsmax_Picture = "" ;
      edtavCcsmax_Enabled = 1 ;
      edtavCcsval_Jsonclick = "" ;
      edtavCcsval_Picture = "" ;
      edtavCcsval_Enabled = 1 ;
      edtavCcsmin_Jsonclick = "" ;
      edtavCcsmin_Picture = "" ;
      edtavCcsmin_Enabled = 1 ;
      edtavCcsvtol_Jsonclick = "" ;
      edtavCcsvtol_Enabled = 1 ;
      edtavCcval_Jsonclick = "" ;
      edtavCcval_Picture = "" ;
      edtavCcval_Enabled = 1 ;
      chkavCcsauto.setEnabled( 1 );
      Combo_cctlin_Caption = "" ;
      edtavCctdsc_Jsonclick = "" ;
      edtavCctdsc_Enabled = 0 ;
      edtavCctcod_Jsonclick = "" ;
      edtavCctcod_Enabled = 0 ;
      edtavCcfcolnum_Jsonclick = "" ;
      edtavCcfcolnum_Enabled = 0 ;
      edtavCcfcolnom_Jsonclick = "" ;
      edtavCcfcolnom_Enabled = 0 ;
      edtavArtcod_Jsonclick = "" ;
      edtavArtcod_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;Valor;Valor;Valor;;;;" ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma el valor?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Ddo_grid_Datalistproc = "ControlCalidadHTD.ControlCalidad_CCSTA_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T|||T|T|T" ;
      Ddo_grid_Filterisrange = "T||||T|T|||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Numeric|Numeric|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "0:CCTLin|1:CCTLinDsc|2:CCSMetodo|3:CCSEspecif|4:CCSAuto|5:CCSVTol|6:CCSMin|7:CCSVal|8:CCSMax" ;
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
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Valores", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagingcaptionposition = "Left" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagestoshow = 5 ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Class = "PaginationBar" ;
      Combo_cctlin_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_cctlin_Enabled = GXutil.toBoolean( -1) ;
      Combo_cctlin_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
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
      Form.setCaption( httpContext.getMessage( " Valores Estandars", "") );
      subGrid_Rows = 0 ;
      subGridcontrolcalidad_ccsta_sdts_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavCcsauto.setName( "vCCSAUTO" );
      chkavCcsauto.setWebtags( "" );
      chkavCcsauto.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavCcsauto.getInternalname(), "TitleCaption", chkavCcsauto.getCaption(), true);
      chkavCcsauto.setCheckedValue( "0" );
      AV11CCSAuto = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV11CCSAuto, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11CCSAuto", GXutil.str( AV11CCSAuto, 1, 0));
      GXCCtl = "CCTLINTPOD_" + sGXsfl_141_idx ;
      cmbCCTLinTpoD.setName( GXCCtl );
      cmbCCTLinTpoD.setWebtags( "" );
      cmbCCTLinTpoD.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbCCTLinTpoD.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
      cmbCCTLinTpoD.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbCCTLinTpoD.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
      cmbCCTLinTpoD.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV76GridControlCalidad_CCSTA_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridControlCalidad_CCSTA_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavCcsmin_Enabled',ctrl:'vCCSMIN',prop:'Enabled'},{av:'edtavCcsval_Enabled',ctrl:'vCCSVAL',prop:'Enabled'},{av:'edtavCcsmax_Enabled',ctrl:'vCCSMAX',prop:'Enabled'},{av:'chkavCcsauto.getEnabled()',ctrl:'vCCSAUTO',prop:'Enabled'},{av:'edtavCcsvtol_Enabled',ctrl:'vCCSVTOL',prop:'Enabled'},{av:'edtavCcval_Enabled',ctrl:'vCCVAL',prop:'Enabled'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e142BY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e152BY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e162BY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e282BY3',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e182BY2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'AV58CCSVal',fld:'vCCSVAL',pic:''},{av:'AV59CCSMax',fld:'vCCSMAX',pic:''},{av:'AV57CCSMin',fld:'vCCSMIN',pic:''},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV85valor',fld:'vVALOR',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV85valor',fld:'vVALOR',pic:''},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV76GridControlCalidad_CCSTA_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridControlCalidad_CCSTA_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavCcsmin_Enabled',ctrl:'vCCSMIN',prop:'Enabled'},{av:'edtavCcsval_Enabled',ctrl:'vCCSVAL',prop:'Enabled'},{av:'edtavCcsmax_Enabled',ctrl:'vCCSMAX',prop:'Enabled'},{av:'chkavCcsauto.getEnabled()',ctrl:'vCCSAUTO',prop:'Enabled'},{av:'edtavCcsvtol_Enabled',ctrl:'vCCSVTOL',prop:'Enabled'},{av:'edtavCcval_Enabled',ctrl:'vCCVAL',prop:'Enabled'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e172BY2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV72CCVal',fld:'vCCVAL',pic:''},{av:'AV58CCSVal',fld:'vCCSVAL',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'AV57CCSMin',fld:'vCCSMIN',pic:''},{av:'AV59CCSMax',fld:'vCCSMAX',pic:''},{av:'AV68CCSVCod',fld:'vCCSVCOD',pic:''},{av:'AV14CCSVTol',fld:'vCCSVTOL',pic:'Z9.99'},{av:'AV12CCSEspecif',fld:'vCCSESPECIF',pic:''},{av:'AV13CCSMetodo',fld:'vCCSMETODO',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV58CCSVal',fld:'vCCSVAL',pic:''},{av:'AV13CCSMetodo',fld:'vCCSMETODO',pic:''},{av:'AV12CCSEspecif',fld:'vCCSESPECIF',pic:''},{av:'AV14CCSVTol',fld:'vCCSVTOL',pic:'Z9.99'},{av:'AV68CCSVCod',fld:'vCCSVCOD',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV59CCSMax',fld:'vCCSMAX',pic:''},{av:'AV57CCSMin',fld:'vCCSMIN',pic:''},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Combo_cctlin_Selectedvalue_set',ctrl:'COMBO_CCTLIN',prop:'SelectedValue_set'},{av:'AV72CCVal',fld:'vCCVAL',pic:''},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'edtavCcsvtol_Enabled',ctrl:'vCCSVTOL',prop:'Enabled'},{av:'edtavCcsval_Enabled',ctrl:'vCCSVAL',prop:'Enabled'},{av:'edtavCcsmin_Enabled',ctrl:'vCCSMIN',prop:'Enabled'},{av:'edtavCcsmax_Enabled',ctrl:'vCCSMAX',prop:'Enabled'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV76GridControlCalidad_CCSTA_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridControlCalidad_CCSTA_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavCcsauto.getEnabled()',ctrl:'vCCSAUTO',prop:'Enabled'},{av:'edtavCcval_Enabled',ctrl:'vCCVAL',prop:'Enabled'}]}");
      setEventMetadata("'DOLIMPIARVARIABLES'","{handler:'e192BY2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV14CCSVTol',fld:'vCCSVTOL',pic:'Z9.99'},{av:'AV57CCSMin',fld:'vCCSMIN',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOLIMPIARVARIABLES'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'Combo_cctlin_Selectedvalue_set',ctrl:'COMBO_CCTLIN',prop:'SelectedValue_set'},{av:'AV57CCSMin',fld:'vCCSMIN',pic:''},{av:'AV58CCSVal',fld:'vCCSVAL',pic:''},{av:'AV59CCSMax',fld:'vCCSMAX',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV68CCSVCod',fld:'vCCSVCOD',pic:''},{av:'AV14CCSVTol',fld:'vCCSVTOL',pic:'Z9.99'},{av:'AV12CCSEspecif',fld:'vCCSESPECIF',pic:''},{av:'AV13CCSMetodo',fld:'vCCSMETODO',pic:''},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV72CCVal',fld:'vCCVAL',pic:''},{av:'edtavCcsvtol_Enabled',ctrl:'vCCSVTOL',prop:'Enabled'},{av:'edtavCcsval_Enabled',ctrl:'vCCSVAL',prop:'Enabled'},{av:'edtavCcsmin_Enabled',ctrl:'vCCSMIN',prop:'Enabled'},{av:'edtavCcsmax_Enabled',ctrl:'vCCSMAX',prop:'Enabled'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV76GridControlCalidad_CCSTA_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridControlCalidad_CCSTA_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavCcsauto.getEnabled()',ctrl:'vCCSAUTO',prop:'Enabled'},{av:'edtavCcval_Enabled',ctrl:'vCCVAL',prop:'Enabled'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e202BY2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS.LOAD","{handler:'e272BY2',iparms:[]");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e122BY2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'Gridcontrolcalidad_ccsta_sdtspaginationbar_Selectedpage',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132BY2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDCONTROLCALIDAD_CCSTA_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'}]}");
      setEventMetadata("COMBO_CCTLIN.ONOPTIONCLICKED","{handler:'e112BY2',iparms:[{av:'Combo_cctlin_Selectedvalue_get',ctrl:'COMBO_CCTLIN',prop:'SelectedValue_get'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("COMBO_CCTLIN.ONOPTIONCLICKED",",oparms:[{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV59CCSMax',fld:'vCCSMAX',pic:''},{av:'AV58CCSVal',fld:'vCCSVAL',pic:''},{av:'AV57CCSMin',fld:'vCCSMIN',pic:''},{av:'AV14CCSVTol',fld:'vCCSVTOL',pic:'Z9.99'},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV12CCSEspecif',fld:'vCCSESPECIF',pic:''},{av:'AV13CCSMetodo',fld:'vCCSMETODO',pic:''},{av:'edtavCcsval_Picture',ctrl:'vCCSVAL',prop:'Picture'},{av:'edtavCcsmin_Picture',ctrl:'vCCSMIN',prop:'Picture'},{av:'edtavCcsmax_Picture',ctrl:'vCCSMAX',prop:'Picture'},{av:'AV72CCVal',fld:'vCCVAL',pic:''},{av:'edtavCcval_Picture',ctrl:'vCCVAL',prop:'Picture'}]}");
      setEventMetadata("VCCSVAL.ISVALID","{handler:'e212BY2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV58CCSVal',fld:'vCCSVAL',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV85valor',fld:'vVALOR',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'}]");
      setEventMetadata("VCCSVAL.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV85valor',fld:'vVALOR',pic:''},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV76GridControlCalidad_CCSTA_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridControlCalidad_CCSTA_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavCcsmin_Enabled',ctrl:'vCCSMIN',prop:'Enabled'},{av:'edtavCcsval_Enabled',ctrl:'vCCSVAL',prop:'Enabled'},{av:'edtavCcsmax_Enabled',ctrl:'vCCSMAX',prop:'Enabled'},{av:'chkavCcsauto.getEnabled()',ctrl:'vCCSAUTO',prop:'Enabled'},{av:'edtavCcsvtol_Enabled',ctrl:'vCCSVTOL',prop:'Enabled'},{av:'edtavCcval_Enabled',ctrl:'vCCVAL',prop:'Enabled'}]}");
      setEventMetadata("VCCSMAX.ISVALID","{handler:'e222BY2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV59CCSMax',fld:'vCCSMAX',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV85valor',fld:'vVALOR',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'}]");
      setEventMetadata("VCCSMAX.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV85valor',fld:'vVALOR',pic:''},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV76GridControlCalidad_CCSTA_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridControlCalidad_CCSTA_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavCcsmin_Enabled',ctrl:'vCCSMIN',prop:'Enabled'},{av:'edtavCcsval_Enabled',ctrl:'vCCSVAL',prop:'Enabled'},{av:'edtavCcsmax_Enabled',ctrl:'vCCSMAX',prop:'Enabled'},{av:'chkavCcsauto.getEnabled()',ctrl:'vCCSAUTO',prop:'Enabled'},{av:'edtavCcsvtol_Enabled',ctrl:'vCCSVTOL',prop:'Enabled'},{av:'edtavCcval_Enabled',ctrl:'vCCVAL',prop:'Enabled'}]}");
      setEventMetadata("VCCSMIN.ISVALID","{handler:'e232BY2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV57CCSMin',fld:'vCCSMIN',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV85valor',fld:'vVALOR',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'}]");
      setEventMetadata("VCCSMIN.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV85valor',fld:'vVALOR',pic:''},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV76GridControlCalidad_CCSTA_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridControlCalidad_CCSTA_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavCcsmin_Enabled',ctrl:'vCCSMIN',prop:'Enabled'},{av:'edtavCcsval_Enabled',ctrl:'vCCSVAL',prop:'Enabled'},{av:'edtavCcsmax_Enabled',ctrl:'vCCSMAX',prop:'Enabled'},{av:'chkavCcsauto.getEnabled()',ctrl:'vCCSAUTO',prop:'Enabled'},{av:'edtavCcsvtol_Enabled',ctrl:'vCCSVTOL',prop:'Enabled'},{av:'edtavCcval_Enabled',ctrl:'vCCVAL',prop:'Enabled'}]}");
      setEventMetadata("CCTLIN.CLICK","{handler:'e292BY2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'AV14CCSVTol',fld:'vCCSVTOL',pic:'Z9.99'},{av:'AV57CCSMin',fld:'vCCSMIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4058CCFColNom',fld:'CCFCOLNOM',pic:''},{av:'A4059CCFColNum',fld:'CCFCOLNUM',pic:'ZZZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A11530CCSAuto',fld:'CCSAUTO',pic:'9'},{av:'A4049CCTValLin',fld:'CCTVALLIN',pic:'Z9'},{av:'A4051CCTVal',fld:'CCTVAL',pic:''},{av:'A4050CCTValDsc',fld:'CCTVALDSC',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'}]");
      setEventMetadata("CCTLIN.CLICK",",oparms:[{av:'AV67Mask',fld:'vMASK',pic:''},{av:'AV59CCSMax',fld:'vCCSMAX',pic:''},{av:'AV58CCSVal',fld:'vCCSVAL',pic:''},{av:'AV57CCSMin',fld:'vCCSMIN',pic:''},{av:'AV14CCSVTol',fld:'vCCSVTOL',pic:'Z9.99'},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV12CCSEspecif',fld:'vCCSESPECIF',pic:''},{av:'AV13CCSMetodo',fld:'vCCSMETODO',pic:''},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV72CCVal',fld:'vCCVAL',pic:''},{av:'Combo_cctlin_Selectedvalue_set',ctrl:'COMBO_CCTLIN',prop:'SelectedValue_set'},{av:'edtavCcsvtol_Enabled',ctrl:'vCCSVTOL',prop:'Enabled'},{av:'edtavCcsval_Enabled',ctrl:'vCCSVAL',prop:'Enabled'},{av:'edtavCcsmin_Enabled',ctrl:'vCCSMIN',prop:'Enabled'},{av:'edtavCcsmax_Enabled',ctrl:'vCCSMAX',prop:'Enabled'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV76GridControlCalidad_CCSTA_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridControlCalidad_CCSTA_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavCcsauto.getEnabled()',ctrl:'vCCSAUTO',prop:'Enabled'},{av:'edtavCcval_Enabled',ctrl:'vCCVAL',prop:'Enabled'}]}");
      setEventMetadata("VCCSAUTO.ISVALID","{handler:'e242BY2',iparms:[{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage'},{av:'GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF'},{av:'AV74ControlCalidad_CCSTA_SDT',fld:'vCONTROLCALIDAD_CCSTA_SDT',grid:106,pic:''},{av:'nGXsfl_106_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:106},{av:'nRC_GXsfl_106',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'GridRC',grid:106},{av:'subGridcontrolcalidad_ccsta_sdts_Rows',ctrl:'GRIDCONTROLCALIDAD_CCSTA_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17CCTLin',fld:'vCCTLIN',pic:'ZZZ9'},{av:'AV92Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV27OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFCCTLin',fld:'vTFCCTLIN',pic:'ZZZ9'},{av:'AV45TFCCTLin_To',fld:'vTFCCTLIN_TO',pic:'ZZZ9'},{av:'AV46TFCCTLinDsc',fld:'vTFCCTLINDSC',pic:''},{av:'AV47TFCCTLinDsc_Sel',fld:'vTFCCTLINDSC_SEL',pic:''},{av:'AV36TFCCSMetodo',fld:'vTFCCSMETODO',pic:''},{av:'AV37TFCCSMetodo_Sel',fld:'vTFCCSMETODO_SEL',pic:''},{av:'AV32TFCCSEspecif',fld:'vTFCCSESPECIF',pic:''},{av:'AV33TFCCSEspecif_Sel',fld:'vTFCCSESPECIF_SEL',pic:''},{av:'AV30TFCCSAuto',fld:'vTFCCSAUTO',pic:'9'},{av:'AV31TFCCSAuto_To',fld:'vTFCCSAUTO_TO',pic:'9'},{av:'AV42TFCCSVTol',fld:'vTFCCSVTOL',pic:'Z9.99'},{av:'AV43TFCCSVTol_To',fld:'vTFCCSVTOL_TO',pic:'Z9.99'},{av:'AV38TFCCSMin',fld:'vTFCCSMIN',pic:''},{av:'AV39TFCCSMin_Sel',fld:'vTFCCSMIN_SEL',pic:''},{av:'AV40TFCCSVal',fld:'vTFCCSVAL',pic:''},{av:'AV41TFCCSVal_Sel',fld:'vTFCCSVAL_SEL',pic:''},{av:'AV34TFCCSMax',fld:'vTFCCSMAX',pic:''},{av:'AV35TFCCSMax_Sel',fld:'vTFCCSMAX_SEL',pic:''},{av:'AV11CCSAuto',fld:'vCCSAUTO',pic:'9'},{av:'AV14CCSVTol',fld:'vCCSVTOL',pic:'Z9.99'},{av:'AV57CCSMin',fld:'vCCSMIN',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6CCFColNom',fld:'vCCFCOLNOM',pic:''},{av:'AV7CCFColNum',fld:'vCCFCOLNUM',pic:'ZZZZZ9'},{av:'AV15CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VCCSAUTO.ISVALID",",oparms:[{av:'edtavCcsvtol_Enabled',ctrl:'vCCSVTOL',prop:'Enabled'},{av:'edtavCcsval_Enabled',ctrl:'vCCSVAL',prop:'Enabled'},{av:'edtavCcsmin_Enabled',ctrl:'vCCSMIN',prop:'Enabled'},{av:'edtavCcsmax_Enabled',ctrl:'vCCSMAX',prop:'Enabled'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV76GridControlCalidad_CCSTA_SDTsCurrentPage',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV77GridControlCalidad_CCSTA_SDTsPageCount',fld:'vGRIDCONTROLCALIDAD_CCSTA_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavCcsauto.getEnabled()',ctrl:'vCCSAUTO',prop:'Enabled'},{av:'edtavCcval_Enabled',ctrl:'vCCVAL',prop:'Enabled'}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_ARTCOD","{handler:'validv_Artcod',iparms:[]");
      setEventMetadata("VALIDV_ARTCOD",",oparms:[]}");
      setEventMetadata("VALIDV_CCFCOLNOM","{handler:'validv_Ccfcolnom',iparms:[]");
      setEventMetadata("VALIDV_CCFCOLNOM",",oparms:[]}");
      setEventMetadata("VALIDV_CCFCOLNUM","{handler:'validv_Ccfcolnum',iparms:[]");
      setEventMetadata("VALIDV_CCFCOLNUM",",oparms:[]}");
      setEventMetadata("VALIDV_CCTCOD","{handler:'validv_Cctcod',iparms:[]");
      setEventMetadata("VALIDV_CCTCOD",",oparms:[]}");
      setEventMetadata("VALIDV_CCTLIN","{handler:'validv_Cctlin',iparms:[]");
      setEventMetadata("VALIDV_CCTLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv4',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[]");
      setEventMetadata("VALID_CCTLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cctlinpict',iparms:[]");
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
      wcpOAV10EmprCod = "" ;
      wcpOAV9CliNom = "" ;
      wcpOAV5ArtCod = "" ;
      wcpOAV6CCFColNom = "" ;
      wcpOAV16CCTDsc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Gridcontrolcalidad_ccsta_sdtspaginationbar_Selectedpage = "" ;
      Combo_cctlin_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV10EmprCod = "" ;
      AV9CliNom = "" ;
      AV5ArtCod = "" ;
      AV6CCFColNom = "" ;
      AV16CCTDsc = "" ;
      AV92Pgmname = "" ;
      AV46TFCCTLinDsc = "" ;
      AV47TFCCTLinDsc_Sel = "" ;
      AV36TFCCSMetodo = "" ;
      AV37TFCCSMetodo_Sel = "" ;
      AV32TFCCSEspecif = "" ;
      AV33TFCCSEspecif_Sel = "" ;
      AV42TFCCSVTol = DecimalUtil.ZERO ;
      AV43TFCCSVTol_To = DecimalUtil.ZERO ;
      AV38TFCCSMin = "" ;
      AV39TFCCSMin_Sel = "" ;
      AV40TFCCSVal = "" ;
      AV41TFCCSVal_Sel = "" ;
      AV34TFCCSMax = "" ;
      AV35TFCCSMax_Sel = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV74ControlCalidad_CCSTA_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item>(app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV19DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV60CCTLin_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV85valor = "" ;
      AV68CCSVCod = "" ;
      AV12CCSEspecif = "" ;
      AV13CCSMetodo = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A4058CCFColNom = "" ;
      A4051CCTVal = "" ;
      A4050CCTValDsc = "" ;
      Combo_cctlin_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_cctlin_Jsonclick = "" ;
      ucCombo_cctlin = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV72CCVal = "" ;
      AV14CCSVTol = DecimalUtil.ZERO ;
      AV57CCSMin = "" ;
      AV58CCSVal = "" ;
      AV59CCSMax = "" ;
      AV67Mask = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      Gridcontrolcalidad_ccsta_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridcontrolcalidad_ccsta_sdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      bttBtnenter_Jsonclick = "" ;
      bttBtnlimpiarvariables_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGridcontrolcalidad_ccsta_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A4043CCTLinDsc = "" ;
      A13247CCSMetodo = "" ;
      A13248CCSEspecif = "" ;
      A11532CCSVTol = DecimalUtil.ZERO ;
      A11482CCSMin = "" ;
      A4060CCSVal = "" ;
      A11483CCSMax = "" ;
      A11531CCSVCod = "" ;
      A4044CCTLinTpoD = "" ;
      A4046CCTLinPict = "" ;
      scmdbuf = "" ;
      lV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = "" ;
      lV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = "" ;
      lV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = "" ;
      lV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = "" ;
      lV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = "" ;
      lV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = "" ;
      AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = "" ;
      AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = "" ;
      AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = "" ;
      AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = "" ;
      AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = "" ;
      AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = "" ;
      AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = DecimalUtil.ZERO ;
      AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = DecimalUtil.ZERO ;
      AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = "" ;
      AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = "" ;
      AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = "" ;
      AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = "" ;
      AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = "" ;
      AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = "" ;
      H02BY2_A4031CCTCod = new int[1] ;
      H02BY2_A4059CCFColNum = new int[1] ;
      H02BY2_A4058CCFColNom = new String[] {""} ;
      H02BY2_A65ArtCod = new String[] {""} ;
      H02BY2_A252CliCod = new int[1] ;
      H02BY2_A396EmprCod = new String[] {""} ;
      H02BY2_A4046CCTLinPict = new String[] {""} ;
      H02BY2_A4045CCTLinLgoD = new short[1] ;
      H02BY2_A4044CCTLinTpoD = new String[] {""} ;
      H02BY2_A11531CCSVCod = new String[] {""} ;
      H02BY2_A11483CCSMax = new String[] {""} ;
      H02BY2_n11483CCSMax = new boolean[] {false} ;
      H02BY2_A4060CCSVal = new String[] {""} ;
      H02BY2_n4060CCSVal = new boolean[] {false} ;
      H02BY2_A11482CCSMin = new String[] {""} ;
      H02BY2_n11482CCSMin = new boolean[] {false} ;
      H02BY2_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02BY2_A11530CCSAuto = new byte[1] ;
      H02BY2_A13248CCSEspecif = new String[] {""} ;
      H02BY2_n13248CCSEspecif = new boolean[] {false} ;
      H02BY2_A13247CCSMetodo = new String[] {""} ;
      H02BY2_n13247CCSMetodo = new boolean[] {false} ;
      H02BY2_A4043CCTLinDsc = new String[] {""} ;
      H02BY2_A4034CCTLin = new short[1] ;
      H02BY3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV62Station = "" ;
      AV63EmprNom = "" ;
      AV64UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV56WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV65mensaje = "" ;
      Gridcontrolcalidad_ccsta_sdtsRow = new com.genexus.webpanels.GXWebRow();
      GXv_int13 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int15 = new int[1] ;
      GXv_int16 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV29Session = httpContext.getWebSession();
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char25 = "" ;
      GXt_char24 = "" ;
      GXt_char23 = "" ;
      GXt_char22 = "" ;
      GXt_char21 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState26 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV54TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV24HTTPRequest = httpContext.getHttpRequest();
      H02BY4_A4031CCTCod = new int[1] ;
      H02BY4_A4059CCFColNum = new int[1] ;
      H02BY4_A4058CCFColNom = new String[] {""} ;
      H02BY4_A65ArtCod = new String[] {""} ;
      H02BY4_A252CliCod = new int[1] ;
      H02BY4_A396EmprCod = new String[] {""} ;
      H02BY4_A4043CCTLinDsc = new String[] {""} ;
      H02BY4_A4034CCTLin = new short[1] ;
      AV61Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_char20 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char18 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char11 = new String[1] ;
      H02BY5_A4034CCTLin = new short[1] ;
      H02BY5_A4031CCTCod = new int[1] ;
      H02BY5_A396EmprCod = new String[] {""} ;
      H02BY5_A4059CCFColNum = new int[1] ;
      H02BY5_A4058CCFColNom = new String[] {""} ;
      H02BY5_A65ArtCod = new String[] {""} ;
      H02BY5_A252CliCod = new int[1] ;
      H02BY5_A11530CCSAuto = new byte[1] ;
      H02BY6_A396EmprCod = new String[] {""} ;
      H02BY6_A4031CCTCod = new int[1] ;
      H02BY6_A4034CCTLin = new short[1] ;
      H02BY6_A4049CCTValLin = new byte[1] ;
      H02BY6_A4051CCTVal = new String[] {""} ;
      H02BY6_A4050CCTValDsc = new String[] {""} ;
      AV75ControlCalidad_CCSTA_SDT_item = new app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item(remoteHandle, context);
      AV69Regex = "" ;
      AV71c = "" ;
      AV82Length = DecimalUtil.ZERO ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridcontrolcalidad_ccsta_sdts_Linesclass = "" ;
      ROClassString = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      Gridcontrolcalidad_ccsta_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccsta_wp__default(),
         new Object[] {
             new Object[] {
            H02BY2_A4031CCTCod, H02BY2_A4059CCFColNum, H02BY2_A4058CCFColNom, H02BY2_A65ArtCod, H02BY2_A252CliCod, H02BY2_A396EmprCod, H02BY2_A4046CCTLinPict, H02BY2_A4045CCTLinLgoD, H02BY2_A4044CCTLinTpoD, H02BY2_A11531CCSVCod,
            H02BY2_A11483CCSMax, H02BY2_n11483CCSMax, H02BY2_A4060CCSVal, H02BY2_n4060CCSVal, H02BY2_A11482CCSMin, H02BY2_n11482CCSMin, H02BY2_A11532CCSVTol, H02BY2_A11530CCSAuto, H02BY2_A13248CCSEspecif, H02BY2_n13248CCSEspecif,
            H02BY2_A13247CCSMetodo, H02BY2_n13247CCSMetodo, H02BY2_A4043CCTLinDsc, H02BY2_A4034CCTLin
            }
            , new Object[] {
            H02BY3_AGRID_nRecordCount
            }
            , new Object[] {
            H02BY4_A4031CCTCod, H02BY4_A4059CCFColNum, H02BY4_A4058CCFColNom, H02BY4_A65ArtCod, H02BY4_A252CliCod, H02BY4_A396EmprCod, H02BY4_A4043CCTLinDsc, H02BY4_A4034CCTLin
            }
            , new Object[] {
            H02BY5_A4034CCTLin, H02BY5_A4031CCTCod, H02BY5_A396EmprCod, H02BY5_A4059CCFColNum, H02BY5_A4058CCFColNom, H02BY5_A65ArtCod, H02BY5_A252CliCod, H02BY5_A11530CCSAuto
            }
            , new Object[] {
            H02BY6_A396EmprCod, H02BY6_A4031CCTCod, H02BY6_A4034CCTLin, H02BY6_A4049CCTValLin, H02BY6_A4051CCTVal, H02BY6_A4050CCTValDsc
            }
         }
      );
      AV92Pgmname = "ControlCalidadHTD.ControlCalidad_CCSTA_WP" ;
      /* GeneXus formulas. */
      AV92Pgmname = "ControlCalidadHTD.ControlCalidad_CCSTA_WP" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavArtcod_Enabled = 0 ;
      edtavCcfcolnom_Enabled = 0 ;
      edtavCcfcolnum_Enabled = 0 ;
      edtavCctcod_Enabled = 0 ;
      edtavCctdsc_Enabled = 0 ;
      edtavMask_Enabled = 0 ;
      edtavControlcalidad_ccsta_sdt__cctvallin_Enabled = 0 ;
      edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled = 0 ;
      edtavControlcalidad_ccsta_sdt__cctval_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRIDCONTROLCALIDAD_CCSTA_SDTS_nEOF ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV30TFCCSAuto ;
   private byte AV31TFCCSAuto_To ;
   private byte AV11CCSAuto ;
   private byte gxajaxcallmode ;
   private byte A4049CCTValLin ;
   private byte A11530CCSAuto ;
   private byte nDonePA ;
   private byte subGridcontrolcalidad_ccsta_sdts_Backcolorstyle ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto ;
   private byte AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGridcontrolcalidad_ccsta_sdts_Backstyle ;
   private byte subGrid_Backstyle ;
   private byte subGridcontrolcalidad_ccsta_sdts_Titlebackstyle ;
   private byte subGridcontrolcalidad_ccsta_sdts_Allowselection ;
   private byte subGridcontrolcalidad_ccsta_sdts_Allowhovering ;
   private byte subGridcontrolcalidad_ccsta_sdts_Allowcollapsing ;
   private byte subGridcontrolcalidad_ccsta_sdts_Collapsed ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV17CCTLin ;
   private short AV26OrderedBy ;
   private short AV44TFCCTLin ;
   private short AV45TFCCTLin_To ;
   private short wbEnd ;
   private short wbStart ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin ;
   private short AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to ;
   private short AV66var_ok ;
   private short GXv_int16[] ;
   private short AV70i ;
   private short AV83PosPunto ;
   private short AV79EnterosPermitidos ;
   private short AV84DecimalesPermitidos ;
   private short AV81PosPuntoValor ;
   private short AV78CantEnteros ;
   private short AV80CantDecimales ;
   private int wcpOAV8CliCod ;
   private int wcpOAV7CCFColNum ;
   private int wcpOAV15CCTCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_106 ;
   private int nRC_GXsfl_141 ;
   private int subGridcontrolcalidad_ccsta_sdts_Rows ;
   private int AV8CliCod ;
   private int AV7CCFColNum ;
   private int AV15CCTCod ;
   private int nGXsfl_106_idx=1 ;
   private int nGXsfl_141_idx=1 ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int A4031CCTCod ;
   private int Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagestoshow ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavArtcod_Enabled ;
   private int edtavCcfcolnom_Enabled ;
   private int edtavCcfcolnum_Enabled ;
   private int edtavCctcod_Enabled ;
   private int edtavCctdsc_Enabled ;
   private int edtavCcval_Enabled ;
   private int edtavCcsvtol_Enabled ;
   private int edtavCcsmin_Enabled ;
   private int edtavCcsval_Enabled ;
   private int edtavCcsmax_Enabled ;
   private int edtavMask_Enabled ;
   private int AV88GXV1 ;
   private int edtavPgmname_Enabled ;
   private int edtavCctlin_Visible ;
   private int subGridcontrolcalidad_ccsta_sdts_Islastpage ;
   private int subGrid_Islastpage ;
   private int edtavControlcalidad_ccsta_sdt__cctvallin_Enabled ;
   private int edtavControlcalidad_ccsta_sdt__cctvaldsc_Enabled ;
   private int edtavControlcalidad_ccsta_sdt__cctval_Enabled ;
   private int GRIDCONTROLCALIDAD_CCSTA_SDTS_nGridOutOfScope ;
   private int GXPagingFrom3 ;
   private int GXPagingTo3 ;
   private int nGXsfl_106_fel_idx=1 ;
   private int AV28PageToGo ;
   private int GXv_int13[] ;
   private int GXv_int14[] ;
   private int GXv_int15[] ;
   private int AV93GXV5 ;
   private int nGXsfl_106_bak_idx=1 ;
   private int idxLst ;
   private int subGridcontrolcalidad_ccsta_sdts_Backcolor ;
   private int subGridcontrolcalidad_ccsta_sdts_Allbackcolor ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGridcontrolcalidad_ccsta_sdts_Titlebackcolor ;
   private int subGridcontrolcalidad_ccsta_sdts_Selectedindex ;
   private int subGridcontrolcalidad_ccsta_sdts_Selectioncolor ;
   private int subGridcontrolcalidad_ccsta_sdts_Hoveringcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRIDCONTROLCALIDAD_CCSTA_SDTS_nFirstRecordOnPage ;
   private long GRID_nFirstRecordOnPage ;
   private long AV76GridControlCalidad_CCSTA_SDTsCurrentPage ;
   private long AV77GridControlCalidad_CCSTA_SDTsPageCount ;
   private long AV20GridCurrentPage ;
   private long AV21GridPageCount ;
   private long GRIDCONTROLCALIDAD_CCSTA_SDTS_nCurrentRecord ;
   private long GRID_nCurrentRecord ;
   private long GRIDCONTROLCALIDAD_CCSTA_SDTS_nRecordCount ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV42TFCCSVTol ;
   private java.math.BigDecimal AV43TFCCSVTol_To ;
   private java.math.BigDecimal AV14CCSVTol ;
   private java.math.BigDecimal A11532CCSVTol ;
   private java.math.BigDecimal AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ;
   private java.math.BigDecimal AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV82Length ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV9CliNom ;
   private String wcpOAV5ArtCod ;
   private String wcpOAV6CCFColNom ;
   private String wcpOAV16CCTDsc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Selectedpage ;
   private String Combo_cctlin_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV10EmprCod ;
   private String AV9CliNom ;
   private String AV5ArtCod ;
   private String AV6CCFColNom ;
   private String AV16CCTDsc ;
   private String sGXsfl_106_idx="0001" ;
   private String AV92Pgmname ;
   private String AV46TFCCTLinDsc ;
   private String AV47TFCCTLinDsc_Sel ;
   private String AV36TFCCSMetodo ;
   private String AV37TFCCSMetodo_Sel ;
   private String AV32TFCCSEspecif ;
   private String AV33TFCCSEspecif_Sel ;
   private String AV38TFCCSMin ;
   private String AV39TFCCSMin_Sel ;
   private String AV40TFCCSVal ;
   private String AV41TFCCSVal_Sel ;
   private String AV34TFCCSMax ;
   private String AV35TFCCSMax_Sel ;
   private String sGXsfl_141_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV85valor ;
   private String AV68CCSVCod ;
   private String AV12CCSEspecif ;
   private String AV13CCSMetodo ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_cctlin_Cls ;
   private String Combo_cctlin_Selectedvalue_set ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Class ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagingbuttonsposition ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Pagingcaptionposition ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Emptygridclass ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageoptions ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Previous ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Next ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Caption ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Emptygridcaption ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpagecaption ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
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
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Gridcontrolcalidad_ccsta_sdts_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavArtcod_Internalname ;
   private String edtavArtcod_Jsonclick ;
   private String edtavCcfcolnom_Internalname ;
   private String edtavCcfcolnom_Jsonclick ;
   private String edtavCcfcolnum_Internalname ;
   private String edtavCcfcolnum_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavCctcod_Internalname ;
   private String edtavCctcod_Jsonclick ;
   private String edtavCctdsc_Internalname ;
   private String edtavCctdsc_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedcctlin_Internalname ;
   private String lblTextblockcombo_cctlin_Internalname ;
   private String lblTextblockcombo_cctlin_Jsonclick ;
   private String Combo_cctlin_Caption ;
   private String Combo_cctlin_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String edtavCcval_Internalname ;
   private String AV72CCVal ;
   private String edtavCcval_Picture ;
   private String edtavCcval_Jsonclick ;
   private String edtavCcsvtol_Internalname ;
   private String edtavCcsvtol_Jsonclick ;
   private String divValores_Internalname ;
   private String edtavCcsmin_Internalname ;
   private String AV57CCSMin ;
   private String edtavCcsmin_Picture ;
   private String edtavCcsmin_Jsonclick ;
   private String edtavCcsval_Internalname ;
   private String AV58CCSVal ;
   private String edtavCcsval_Picture ;
   private String edtavCcsval_Jsonclick ;
   private String edtavCcsmax_Internalname ;
   private String AV59CCSMax ;
   private String edtavCcsmax_Picture ;
   private String edtavCcsmax_Jsonclick ;
   private String edtavMask_Internalname ;
   private String edtavMask_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divGridcontrolcalidad_ccsta_sdtstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridcontrolcalidad_ccsta_sdts_Internalname ;
   private String Gridcontrolcalidad_ccsta_sdtspaginationbar_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnlimpiarvariables_Internalname ;
   private String bttBtnlimpiarvariables_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavCctlin_Internalname ;
   private String edtavCctlin_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String Gridcontrolcalidad_ccsta_sdts_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCCTLin_Internalname ;
   private String A4043CCTLinDsc ;
   private String edtCCTLinDsc_Internalname ;
   private String A13247CCSMetodo ;
   private String edtCCSMetodo_Internalname ;
   private String A13248CCSEspecif ;
   private String edtCCSEspecif_Internalname ;
   private String edtCCSAuto_Internalname ;
   private String edtCCSVTol_Internalname ;
   private String A11482CCSMin ;
   private String edtCCSMin_Internalname ;
   private String A4060CCSVal ;
   private String edtCCSVal_Internalname ;
   private String A11483CCSMax ;
   private String edtCCSMax_Internalname ;
   private String A11531CCSVCod ;
   private String edtCCSVCod_Internalname ;
   private String A4044CCTLinTpoD ;
   private String edtCCTLinLgoD_Internalname ;
   private String A4046CCTLinPict ;
   private String edtCCTLinPict_Internalname ;
   private String edtavControlcalidad_ccsta_sdt__cctvallin_Internalname ;
   private String edtavControlcalidad_ccsta_sdt__cctvaldsc_Internalname ;
   private String edtavControlcalidad_ccsta_sdt__cctval_Internalname ;
   private String scmdbuf ;
   private String lV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ;
   private String lV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ;
   private String lV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ;
   private String lV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ;
   private String lV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ;
   private String lV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ;
   private String AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ;
   private String AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ;
   private String AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ;
   private String AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ;
   private String AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ;
   private String AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ;
   private String AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ;
   private String AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ;
   private String AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ;
   private String AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ;
   private String AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ;
   private String AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ;
   private String sGXsfl_106_fel_idx="0001" ;
   private String hsh ;
   private String AV62Station ;
   private String AV63EmprNom ;
   private String AV64UsurCod ;
   private String GXv_char10[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char25 ;
   private String GXt_char24 ;
   private String GXt_char23 ;
   private String GXt_char22 ;
   private String GXt_char21 ;
   private String GXt_char1 ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String subGridcontrolcalidad_ccsta_sdts_Class ;
   private String subGridcontrolcalidad_ccsta_sdts_Linesclass ;
   private String ROClassString ;
   private String edtavControlcalidad_ccsta_sdt__cctvallin_Jsonclick ;
   private String edtavControlcalidad_ccsta_sdt__cctvaldsc_Jsonclick ;
   private String edtavControlcalidad_ccsta_sdt__cctval_Jsonclick ;
   private String sGXsfl_141_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtCCTLin_Jsonclick ;
   private String edtCCTLinDsc_Jsonclick ;
   private String edtCCSMetodo_Jsonclick ;
   private String edtCCSEspecif_Jsonclick ;
   private String edtCCSAuto_Jsonclick ;
   private String edtCCSVTol_Jsonclick ;
   private String edtCCSMin_Jsonclick ;
   private String edtCCSVal_Jsonclick ;
   private String edtCCSMax_Jsonclick ;
   private String edtCCSVCod_Jsonclick ;
   private String GXCCtl ;
   private String edtCCTLinLgoD_Jsonclick ;
   private String edtCCTLinPict_Jsonclick ;
   private String subGridcontrolcalidad_ccsta_sdts_Header ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV27OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_cctlin_Enabled ;
   private boolean Combo_cctlin_Emptyitem ;
   private boolean Gridcontrolcalidad_ccsta_sdtspaginationbar_Showfirst ;
   private boolean Gridcontrolcalidad_ccsta_sdtspaginationbar_Showprevious ;
   private boolean Gridcontrolcalidad_ccsta_sdtspaginationbar_Shownext ;
   private boolean Gridcontrolcalidad_ccsta_sdtspaginationbar_Showlast ;
   private boolean Gridcontrolcalidad_ccsta_sdtspaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
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
   private boolean n13247CCSMetodo ;
   private boolean n13248CCSEspecif ;
   private boolean n11482CCSMin ;
   private boolean n4060CCSVal ;
   private boolean n11483CCSMax ;
   private boolean bGXsfl_106_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean bGXsfl_141_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV106 ;
   private String AV67Mask ;
   private String AV65mensaje ;
   private String AV69Regex ;
   private String AV71c ;
   private com.genexus.webpanels.GXWebGrid Gridcontrolcalidad_ccsta_sdtsContainer ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow Gridcontrolcalidad_ccsta_sdtsRow ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn Gridcontrolcalidad_ccsta_sdtsColumn ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV24HTTPRequest ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_cctlin ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucGridcontrolcalidad_ccsta_sdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGridcontrolcalidad_ccsta_sdts_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavCcsauto ;
   private HTMLChoice cmbCCTLinTpoD ;
   private IDataStoreProvider pr_default ;
   private int[] H02BY2_A4031CCTCod ;
   private int[] H02BY2_A4059CCFColNum ;
   private String[] H02BY2_A4058CCFColNom ;
   private String[] H02BY2_A65ArtCod ;
   private int[] H02BY2_A252CliCod ;
   private String[] H02BY2_A396EmprCod ;
   private String[] H02BY2_A4046CCTLinPict ;
   private short[] H02BY2_A4045CCTLinLgoD ;
   private String[] H02BY2_A4044CCTLinTpoD ;
   private String[] H02BY2_A11531CCSVCod ;
   private String[] H02BY2_A11483CCSMax ;
   private boolean[] H02BY2_n11483CCSMax ;
   private String[] H02BY2_A4060CCSVal ;
   private boolean[] H02BY2_n4060CCSVal ;
   private String[] H02BY2_A11482CCSMin ;
   private boolean[] H02BY2_n11482CCSMin ;
   private java.math.BigDecimal[] H02BY2_A11532CCSVTol ;
   private byte[] H02BY2_A11530CCSAuto ;
   private String[] H02BY2_A13248CCSEspecif ;
   private boolean[] H02BY2_n13248CCSEspecif ;
   private String[] H02BY2_A13247CCSMetodo ;
   private boolean[] H02BY2_n13247CCSMetodo ;
   private String[] H02BY2_A4043CCTLinDsc ;
   private short[] H02BY2_A4034CCTLin ;
   private long[] H02BY3_AGRID_nRecordCount ;
   private int[] H02BY4_A4031CCTCod ;
   private int[] H02BY4_A4059CCFColNum ;
   private String[] H02BY4_A4058CCFColNom ;
   private String[] H02BY4_A65ArtCod ;
   private int[] H02BY4_A252CliCod ;
   private String[] H02BY4_A396EmprCod ;
   private String[] H02BY4_A4043CCTLinDsc ;
   private short[] H02BY4_A4034CCTLin ;
   private short[] H02BY5_A4034CCTLin ;
   private int[] H02BY5_A4031CCTCod ;
   private String[] H02BY5_A396EmprCod ;
   private int[] H02BY5_A4059CCFColNum ;
   private String[] H02BY5_A4058CCFColNom ;
   private String[] H02BY5_A65ArtCod ;
   private int[] H02BY5_A252CliCod ;
   private byte[] H02BY5_A11530CCSAuto ;
   private String[] H02BY6_A396EmprCod ;
   private int[] H02BY6_A4031CCTCod ;
   private short[] H02BY6_A4034CCTLin ;
   private byte[] H02BY6_A4049CCTValLin ;
   private String[] H02BY6_A4051CCTVal ;
   private String[] H02BY6_A4050CCTValDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV60CCTLin_Data ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item> AV74ControlCalidad_CCSTA_SDT ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV61Combo_DataItem ;
   private app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item AV75ControlCalidad_CCSTA_SDT_item ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV19DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState26[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV54TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV56WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class controlcalidad_ccsta_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02BY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin ,
                                          short AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to ,
                                          String AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                          String AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                          String AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                          String AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                          String AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                          String AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                          byte AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto ,
                                          byte AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to ,
                                          java.math.BigDecimal AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                          java.math.BigDecimal AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                          String AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                          String AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                          String AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                          String AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                          String AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                          String AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A13247CCSMetodo ,
                                          String A13248CCSEspecif ,
                                          byte A11530CCSAuto ,
                                          java.math.BigDecimal A11532CCSVTol ,
                                          String A11482CCSMin ,
                                          String A4060CCSVal ,
                                          String A11483CCSMax ,
                                          short AV26OrderedBy ,
                                          boolean AV27OrderedDsc ,
                                          String AV10EmprCod ,
                                          int AV8CliCod ,
                                          String AV5ArtCod ,
                                          String AV6CCFColNom ,
                                          int AV7CCFColNum ,
                                          int AV15CCTCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A4058CCFColNom ,
                                          int A4059CCFColNum ,
                                          int A4031CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[29];
      Object[] GXv_Object28 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.CCTCod, T1.CCFColNum, T1.CCFColNom, T1.ArtCod, T1.CliCod, T1.EmprCod, T2.CCTLinPict, T2.CCTLinLgoD, T2.CCTLinTpoD, T1.CCSVCod, T1.CCSMax, T1.CCSVal, T1.CCSMin," ;
      sSelectString += " T1.CCSVTol, T1.CCSAuto, T1.CCSEspecif, T1.CCSMetodo, T2.CCTLinDsc, T1.CCTLin" ;
      sFromString = " FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.CCFColNom = ? and T1.CCFColNum = ? and T1.CCTCod = ?)");
      if ( ! (0==AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( ! (0==AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMetodo = ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) && ( ! (GXutil.strcmp("", AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSEspecif = ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( ! (0==AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) )
      {
         addWhere(sWhereString, "(T1.CCSAuto >= ?)");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (0==AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) )
      {
         addWhere(sWhereString, "(T1.CCSAuto <= ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol >= ?)");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol <= ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) && ( ! (GXutil.strcmp("", AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMin = ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) && ( ! (GXutil.strcmp("", AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVal = ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) && ( ! (GXutil.strcmp("", AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMax = ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( AV26OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCTLin" ;
      }
      else if ( ( AV26OrderedBy == 2 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCTLin" ;
      }
      else if ( ( AV26OrderedBy == 2 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCTLin DESC" ;
      }
      else if ( ( AV26OrderedBy == 3 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CCTLinDsc" ;
      }
      else if ( ( AV26OrderedBy == 3 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CCTLinDsc DESC" ;
      }
      else if ( ( AV26OrderedBy == 4 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCSMetodo" ;
      }
      else if ( ( AV26OrderedBy == 4 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCSMetodo DESC" ;
      }
      else if ( ( AV26OrderedBy == 5 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCSEspecif" ;
      }
      else if ( ( AV26OrderedBy == 5 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCSEspecif DESC" ;
      }
      else if ( ( AV26OrderedBy == 6 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCSAuto" ;
      }
      else if ( ( AV26OrderedBy == 6 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCSAuto DESC" ;
      }
      else if ( ( AV26OrderedBy == 7 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCSVTol" ;
      }
      else if ( ( AV26OrderedBy == 7 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCSVTol DESC" ;
      }
      else if ( ( AV26OrderedBy == 8 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCSMin" ;
      }
      else if ( ( AV26OrderedBy == 8 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCSMin DESC" ;
      }
      else if ( ( AV26OrderedBy == 9 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCSVal" ;
      }
      else if ( ( AV26OrderedBy == 9 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCSVal DESC" ;
      }
      else if ( ( AV26OrderedBy == 10 ) && ! AV27OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCSMax" ;
      }
      else if ( ( AV26OrderedBy == 10 ) && ( AV27OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCSMax DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCTLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_H02BY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin ,
                                          short AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to ,
                                          String AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                          String AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                          String AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                          String AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                          String AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                          String AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                          byte AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto ,
                                          byte AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to ,
                                          java.math.BigDecimal AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                          java.math.BigDecimal AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                          String AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                          String AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                          String AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                          String AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                          String AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                          String AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A13247CCSMetodo ,
                                          String A13248CCSEspecif ,
                                          byte A11530CCSAuto ,
                                          java.math.BigDecimal A11532CCSVTol ,
                                          String A11482CCSMin ,
                                          String A4060CCSVal ,
                                          String A11483CCSMax ,
                                          short AV26OrderedBy ,
                                          boolean AV27OrderedDsc ,
                                          String AV10EmprCod ,
                                          int AV8CliCod ,
                                          String AV5ArtCod ,
                                          String AV6CCFColNom ,
                                          int AV7CCFColNum ,
                                          int AV15CCTCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A4058CCFColNom ,
                                          int A4059CCFColNum ,
                                          int A4031CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[24];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.CCFColNom = ? and T1.CCFColNum = ? and T1.CCTCod = ?)");
      if ( ! (0==AV97Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! (0==AV98Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV99Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV101Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMetodo = ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) && ( ! (GXutil.strcmp("", AV103Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSEspecif = ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (0==AV105Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) )
      {
         addWhere(sWhereString, "(T1.CCSAuto >= ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (0==AV106Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) )
      {
         addWhere(sWhereString, "(T1.CCSAuto <= ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol >= ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol <= ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) && ( ! (GXutil.strcmp("", AV109Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMin = ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) && ( ! (GXutil.strcmp("", AV111Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVal = ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) && ( ! (GXutil.strcmp("", AV113Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMax = ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV26OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 2 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 2 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 3 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 3 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 4 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 4 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 5 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 5 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 6 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 6 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 7 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 7 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 8 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 8 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 9 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 9 ) && ( AV27OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 10 ) && ! AV27OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV26OrderedBy == 10 ) && ( AV27OrderedDsc ) )
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
                  return conditional_H02BY2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() );
            case 1 :
                  return conditional_H02BY3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Boolean) dynConstraints[28]).booleanValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02BY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BY4", "SELECT T1.CCTCod, T1.CCFColNum, T1.CCFColNom, T1.ArtCod, T1.CliCod, T1.EmprCod, T2.CCTLinDsc, T1.CCTLin FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.CCFColNom = ? and T1.CCFColNum = ? and T1.CCTCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BY5", "SELECT CCTLin, CCTCod, EmprCod, CCFColNum, CCFColNom, ArtCod, CliCod, CCSAuto FROM TXPCCSta WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02BY6", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTVal, CCTValDsc FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(18, 30);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 40);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 40);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 40);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

