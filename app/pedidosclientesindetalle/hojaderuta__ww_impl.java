package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta__ww_impl extends GXDataArea
{
   public hojaderuta__ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta__ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta__ww_impl.class ));
   }

   public hojaderuta__ww_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkBarAcc = UIFactory.getCheckbox(this);
      chkHayRec = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_111 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_111"))) ;
      nGXsfl_111_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_111_idx"))) ;
      sGXsfl_111_idx = httpContext.GetPar( "sGXsfl_111_idx") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV41BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV42BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV43BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV44CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV104BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      AV105BarFecGen_To = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_To")) ;
      AV106BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      AV107BarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "BarSit_To"))) ;
      AV38emprcod = httpContext.GetPar( "emprcod") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV111Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV28TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV29TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV30TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV31TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV53TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV54TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV55TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV56TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV57TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV58TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV59TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV60TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV65TFBarMaqCod = httpContext.GetPar( "TFBarMaqCod") ;
      AV66TFBarMaqCod_Sel = httpContext.GetPar( "TFBarMaqCod_Sel") ;
      AV73TFBarAcaQui = httpContext.GetPar( "TFBarAcaQui") ;
      AV74TFBarAcaQui_Sel = httpContext.GetPar( "TFBarAcaQui_Sel") ;
      AV108TFHayRec_Sel = (byte)(GXutil.lval( httpContext.GetPar( "TFHayRec_Sel"))) ;
      AV78Ensayos = (short)(GXutil.lval( httpContext.GetPar( "Ensayos"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV77moda21 = (short)(GXutil.lval( httpContext.GetPar( "moda21"))) ;
      AV89PATHPDF = httpContext.GetPar( "PATHPDF") ;
      AV79ImpCod = httpContext.GetPar( "ImpCod") ;
      AV47UsurCod = httpContext.GetPar( "UsurCod") ;
      AV39Station = httpContext.GetPar( "Station") ;
      A3594BarPriTin = (byte)(GXutil.lval( httpContext.GetPar( "BarPriTin"))) ;
      A2265BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
      n2265BarExt = false ;
      A13930BarAlbUlti = GXutil.lval( httpContext.GetPar( "BarAlbUlti")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV41BarCod, AV42BarCodReo, AV43BarCodPar, AV44CliCod, AV104BarFecGen, AV105BarFecGen_To, AV106BarSit, AV107BarSit_To, AV38emprcod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFPedidoCliente, AV31TFPedidoCliente_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV55TFBarSerDsc, AV56TFBarSerDsc_Sel, AV57TFBarColNom, AV58TFBarColNom_Sel, AV59TFBarColNum, AV60TFBarColNum_To, AV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV73TFBarAcaQui, AV74TFBarAcaQui_Sel, AV108TFHayRec_Sel, AV78Ensayos, Gx_mode, AV77moda21, AV89PATHPDF, AV79ImpCod, AV47UsurCod, AV39Station, A3594BarPriTin, A2265BarExt, A13930BarAlbUlti) ;
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
      pa29N2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29N2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta__ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78Ensayos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBULTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOD", GXutil.ltrim( localUtil.ntoc( AV41BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV42BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODPAR", GXutil.rtrim( AV43BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICOD", GXutil.ltrim( localUtil.ntoc( AV44CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGEN", localUtil.format(AV104BarFecGen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGEN_TO", localUtil.format(AV105BarFecGen_To, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSIT", GXutil.ltrim( localUtil.ntoc( AV106BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV107BarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_111", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_111, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV34GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV35GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV32DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV32DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV28TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV29TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDIDOCLIENTE", GXutil.rtrim( AV30TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV31TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV53TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV54TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC", GXutil.rtrim( AV55TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC_SEL", GXutil.rtrim( AV56TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM", GXutil.rtrim( AV57TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM_SEL", GXutil.rtrim( AV58TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV59TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV60TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMAQCOD", GXutil.rtrim( AV65TFBarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARMAQCOD_SEL", GXutil.rtrim( AV66TFBarMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARACAQUI", GXutil.rtrim( AV73TFBarAcaQui));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARACAQUI_SEL", GXutil.rtrim( AV74TFBarAcaQui_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHAYREC_SEL", GXutil.ltrim( localUtil.ntoc( AV108TFHayRec_Sel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vENSAYOS", GXutil.ltrim( localUtil.ntoc( AV78Ensayos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78Ensayos), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRITIN", GXutil.ltrim( localUtil.ntoc( A3594BarPriTin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAREXT", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV77moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF", GXutil.rtrim( AV89PATHPDF));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV79ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV38emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV47UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV39Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECGENFROM", localUtil.dtoc( AV45BarFecGenfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFECGENTO", localUtil.dtoc( AV46BarFecGento, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV36BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV37BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERHOJADERUTA__WW", AV81FilterHojadeRuta__WW);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERHOJADERUTA__WW", AV81FilterHojadeRuta__WW);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBULTI", GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBULTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Width", GXutil.rtrim( Situacionfases_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Title", GXutil.rtrim( Situacionfases_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Confirmtype", GXutil.rtrim( Situacionfases_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Bodytype", GXutil.rtrim( Situacionfases_modal_Bodytype));
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
         we29N2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29N2( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta__ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta__WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Hoja de Ruta", "") ;
   }

   public void wb29N0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_26_29N2( true) ;
      }
      else
      {
         wb_table1_26_29N2( false) ;
      }
      return  ;
   }

   public void wb_table1_26_29N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemanualfilter_Internalname, 1, 100, "%", 0, "px", "CellMarginTop24", "left", "top", " "+"data-gx-smarttable"+" ", "grid-template-columns:8fr 5fr 5fr 20fr 30fr 32fr;grid-template-rows:auto;grid-column-gap:8px;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablearcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextbarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "", "", lblFiltertextbarcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV41BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablearcodreo_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextbarcodreo_Internalname, httpContext.getMessage( "R", ""), "", "", lblFiltertextbarcodreo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV42BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV42BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablearcodpar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextbarcodpar_Internalname, httpContext.getMessage( "P", ""), "", "", lblFiltertextbarcodpar_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV43BarCodPar), GXutil.rtrim( localUtil.format( AV43BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablelicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblFiltertextclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cli Cod", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV44CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV44CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV44CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfiltertextbarfecgen_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextbarfecgen_Internalname, httpContext.getMessage( "Fecha Hdr", ""), "", "", lblFiltertextbarfecgen_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_77_29N2( true) ;
      }
      else
      {
         wb_table2_77_29N2( false) ;
      }
      return  ;
   }

   public void wb_table2_77_29N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", " "+"data-gx-smarttable-cell"+" ", "display:flex;align-items:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfiltertextbarsit_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextbarsit_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblFiltertextbarsit_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table3_93_29N2( true) ;
      }
      else
      {
         wb_table3_93_29N2( false) ;
      }
      return  ;
   }

   public void wb_table3_93_29N2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         startgridcontrol111( ) ;
      }
      if ( wbEnd == 111 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_111 = (int)(nGXsfl_111_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV34GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV35GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV111Pgmname), GXutil.rtrim( localUtil.format( AV111Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
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
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV32DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV32DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table4_160_29N2( true) ;
      }
      else
      {
         wb_table4_160_29N2( false) ;
      }
      return  ;
   }

   public void wb_table4_160_29N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_165_29N2( true) ;
      }
      else
      {
         wb_table5_165_29N2( false) ;
      }
      return  ;
   }

   public void wb_table5_165_29N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0172"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0172"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_111_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0172"+"");
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
      if ( wbEnd == 111 )
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

   public void start29N2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Hoja de Ruta", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29N0( ) ;
   }

   public void ws29N2( )
   {
      start29N2( ) ;
      evt29N2( ) ;
   }

   public void evt29N2( )
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
                           e1129N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1229N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1329N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1429N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1529N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1629N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SITUACIONFASES_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1729N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1829N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e1929N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2029N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2129N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2229N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARFECGENFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2329N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARFECGENTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2429N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARSITFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2529N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARSITTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2629N2 ();
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
                           nGXsfl_111_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1112( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV48GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
                           A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A118BarAcaQui = httpContext.cgiGet( edtBarAcaQui_Internalname) ;
                           A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A5253BarAcc = ((GXutil.strcmp(httpContext.cgiGet( chkBarAcc.getInternalname()), "S")==0) ? "S" : "N") ;
                           A14007E_Barser = (short)(localUtil.ctol( httpContext.cgiGet( edtE_Barser_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
                           A864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A209BarPri = httpContext.cgiGet( edtBarPri_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_COLOR");
                              GX_FocusControl = edtavF_color_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV50F_color = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50F_color), 4, 0));
                           }
                           else
                           {
                              AV50F_color = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50F_color), 4, 0));
                           }
                           A1923BarCodTN = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodTN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13710HayRec = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkHayRec.getInternalname()), "1")==0) ? 1 : 0)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2729N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2829N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2929N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e3029N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV41BarCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodreo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV42BarCodReo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodpar Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPAR"), AV43BarCodPar) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV44CliCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgen Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGEN"), 0), AV104BarFecGen) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgen_to Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGEN_TO"), 0), AV105BarFecGen_To) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsit Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV106BarSit )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsit_to Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV107BarSit_To )
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
                     if ( nCmpId == 172 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0172") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0172", "", sEvt);
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

   public void we29N2( )
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

   public void pa29N2( )
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
      subsflControlProps_1112( ) ;
      while ( nGXsfl_111_idx <= nRC_GXsfl_111 )
      {
         sendrow_1112( ) ;
         nGXsfl_111_idx = ((subGrid_Islastpage==1)&&(nGXsfl_111_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_111_idx+1) ;
         sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1112( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 int AV41BarCod ,
                                 byte AV42BarCodReo ,
                                 String AV43BarCodPar ,
                                 int AV44CliCod ,
                                 java.util.Date AV104BarFecGen ,
                                 java.util.Date AV105BarFecGen_To ,
                                 byte AV106BarSit ,
                                 byte AV107BarSit_To ,
                                 String AV38emprcod ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV111Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV28TFCliNom ,
                                 String AV29TFCliNom_Sel ,
                                 String AV30TFPedidoCliente ,
                                 String AV31TFPedidoCliente_Sel ,
                                 String AV53TFBarSer ,
                                 String AV54TFBarSer_Sel ,
                                 String AV55TFBarSerDsc ,
                                 String AV56TFBarSerDsc_Sel ,
                                 String AV57TFBarColNom ,
                                 String AV58TFBarColNom_Sel ,
                                 int AV59TFBarColNum ,
                                 int AV60TFBarColNum_To ,
                                 String AV65TFBarMaqCod ,
                                 String AV66TFBarMaqCod_Sel ,
                                 String AV73TFBarAcaQui ,
                                 String AV74TFBarAcaQui_Sel ,
                                 byte AV108TFHayRec_Sel ,
                                 short AV78Ensayos ,
                                 String Gx_mode ,
                                 short AV77moda21 ,
                                 String AV89PATHPDF ,
                                 String AV79ImpCod ,
                                 String AV47UsurCod ,
                                 String AV39Station ,
                                 byte A3594BarPriTin ,
                                 byte A2265BarExt ,
                                 long A13930BarAlbUlti )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2829N2 ();
      GRID_nCurrentRecord = 0 ;
      rf29N2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A228BarUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNIMED", GXutil.rtrim( A228BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPES", GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A212BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PEDIDOCLIE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A135BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A1652BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_HAYREC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13710HayRec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "HAYREC", GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A209BarPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRI", GXutil.rtrim( A209BarPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECGEN", getSecureSignedToken( "", A159BarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECGEN", localUtil.format(A159BarFecGen, "99/99/99"));
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
      rf29N2( ) ;
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
      AV111Pgmname = "PedidosClienteSinDetalle.HojadeRuta__WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavF_color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF_color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_color_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV41BarCod) ,
                                           Byte.valueOf(AV42BarCodReo) ,
                                           AV43BarCodPar ,
                                           Integer.valueOf(AV44CliCod) ,
                                           AV104BarFecGen ,
                                           AV105BarFecGen_To ,
                                           Byte.valueOf(AV106BarSit) ,
                                           Byte.valueOf(AV107BarSit_To) ,
                                           AV29TFCliNom_Sel ,
                                           AV28TFCliNom ,
                                           AV54TFBarSer_Sel ,
                                           AV53TFBarSer ,
                                           AV56TFBarSerDsc_Sel ,
                                           AV55TFBarSerDsc ,
                                           AV58TFBarColNom_Sel ,
                                           AV57TFBarColNom ,
                                           Integer.valueOf(AV59TFBarColNum) ,
                                           Integer.valueOf(AV60TFBarColNum_To) ,
                                           AV66TFBarMaqCod_Sel ,
                                           AV65TFBarMaqCod ,
                                           AV74TFBarAcaQui_Sel ,
                                           AV73TFBarAcaQui ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A118BarAcaQui ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV15FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV31TFPedidoCliente_Sel ,
                                           AV30TFPedidoCliente ,
                                           Byte.valueOf(AV108TFHayRec_Sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           AV38emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV28TFCliNom = GXutil.padr( GXutil.rtrim( AV28TFCliNom), 30, "%") ;
      lV53TFBarSer = GXutil.padr( GXutil.rtrim( AV53TFBarSer), 16, "%") ;
      lV55TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV55TFBarSerDsc), 26, "%") ;
      lV57TFBarColNom = GXutil.padr( GXutil.rtrim( AV57TFBarColNom), 13, "%") ;
      lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
      lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
      /* Using cursor H029N3 */
      pr_default.execute(0, new Object[] {AV38emprcod, Integer.valueOf(AV41BarCod), Byte.valueOf(AV42BarCodReo), AV43BarCodPar, Integer.valueOf(AV44CliCod), AV104BarFecGen, AV105BarFecGen_To, Byte.valueOf(AV106BarSit), Byte.valueOf(AV107BarSit_To), lV28TFCliNom, AV29TFCliNom_Sel, lV53TFBarSer, AV54TFBarSer_Sel, lV55TFBarSerDsc, AV56TFBarSerDsc_Sel, lV57TFBarColNom, AV58TFBarColNom_Sel, Integer.valueOf(AV59TFBarColNum), Integer.valueOf(AV60TFBarColNum_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3594BarPriTin = H029N3_A3594BarPriTin[0] ;
         A2265BarExt = H029N3_A2265BarExt[0] ;
         n2265BarExt = H029N3_n2265BarExt[0] ;
         A1923BarCodTN = H029N3_A1923BarCodTN[0] ;
         A209BarPri = H029N3_A209BarPri[0] ;
         A864BarPes = H029N3_A864BarPes[0] ;
         A228BarUniMed = H029N3_A228BarUniMed[0] ;
         A361DisCod = H029N3_A361DisCod[0] ;
         A5253BarAcc = H029N3_A5253BarAcc[0] ;
         A120BarAgrEst = H029N3_A120BarAgrEst[0] ;
         A118BarAcaQui = H029N3_A118BarAcaQui[0] ;
         A180BarMaqCod = H029N3_A180BarMaqCod[0] ;
         A213BarSit = H029N3_A213BarSit[0] ;
         A1235BarNumCli = H029N3_A1235BarNumCli[0] ;
         A1234BarNomCli = H029N3_A1234BarNomCli[0] ;
         A136BarColNum = H029N3_A136BarColNum[0] ;
         A135BarColNom = H029N3_A135BarColNom[0] ;
         A1652BarSerDsc = H029N3_A1652BarSerDsc[0] ;
         A159BarFecGen = H029N3_A159BarFecGen[0] ;
         A2010BarTipDis = H029N3_A2010BarTipDis[0] ;
         A13696BarNHdr = H029N3_A13696BarNHdr[0] ;
         A279CliNom = H029N3_A279CliNom[0] ;
         A184BarMtr = H029N3_A184BarMtr[0] ;
         A166BarKgm = H029N3_A166BarKgm[0] ;
         A143BarDisNum = H029N3_A143BarDisNum[0] ;
         A4812BarEncCli = H029N3_A4812BarEncCli[0] ;
         A199BarPie1 = H029N3_A199BarPie1[0] ;
         A365DisDes = H029N3_A365DisDes[0] ;
         A898BarPieNDes = H029N3_A898BarPieNDes[0] ;
         A212BarSer = H029N3_A212BarSer[0] ;
         A252CliCod = H029N3_A252CliCod[0] ;
         n252CliCod = H029N3_n252CliCod[0] ;
         A130BarCodPar = H029N3_A130BarCodPar[0] ;
         A132BarCodReo = H029N3_A132BarCodReo[0] ;
         A129BarCod = H029N3_A129BarCod[0] ;
         A396EmprCod = H029N3_A396EmprCod[0] ;
         A279CliNom = H029N3_A279CliNom[0] ;
         A184BarMtr = H029N3_A184BarMtr[0] ;
         A166BarKgm = H029N3_A166BarKgm[0] ;
         A199BarPie1 = H029N3_A199BarPie1[0] ;
         A898BarPieNDes = H029N3_A898BarPieNDes[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         hojaderuta__ww_impl.this.A396EmprCod = GXv_char2[0] ;
         hojaderuta__ww_impl.this.A4812BarEncCli = GXv_char3[0] ;
         hojaderuta__ww_impl.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta__ww_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( (GXutil.strcmp("", AV15FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV31TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV30TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV31TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV31TFPedidoCliente_Sel) == 0 ) ) )
               {
                  GXt_int6 = A14007E_Barser ;
                  GXv_int7[0] = GXt_int6 ;
                  new app.pedidosclientesindetalle.existearticulo(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, GXv_int7) ;
                  hojaderuta__ww_impl.this.GXt_int6 = GXv_int7[0] ;
                  A14007E_Barser = GXt_int6 ;
                  GXt_int8 = A13710HayRec ;
                  GXv_int9[0] = GXt_int8 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int9) ;
                  hojaderuta__ww_impl.this.GXt_int8 = GXv_int9[0] ;
                  A13710HayRec = GXt_int8 ;
                  if ( ( AV108TFHayRec_Sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV108TFHayRec_Sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        GXt_int10 = A13930BarAlbUlti ;
                        GXv_int11[0] = GXt_int10 ;
                        new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int11) ;
                        hojaderuta__ww_impl.this.GXt_int10 = GXv_int11[0] ;
                        A13930BarAlbUlti = GXt_int10 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13930BarAlbUlti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13930BarAlbUlti), 10, 0));
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBULTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9")));
                        if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                        {
                           A198BarPie = A898BarPieNDes ;
                        }
                        else
                        {
                           A198BarPie = A199BarPie1 ;
                        }
                        GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
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

   public void rf29N2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(111) ;
      /* Execute user event: Refresh */
      e2829N2 ();
      nGXsfl_111_idx = 1 ;
      sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1112( ) ;
      bGXsfl_111_Refreshing = true ;
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
         subsflControlProps_1112( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV41BarCod) ,
                                              Byte.valueOf(AV42BarCodReo) ,
                                              AV43BarCodPar ,
                                              Integer.valueOf(AV44CliCod) ,
                                              AV104BarFecGen ,
                                              AV105BarFecGen_To ,
                                              Byte.valueOf(AV106BarSit) ,
                                              Byte.valueOf(AV107BarSit_To) ,
                                              AV29TFCliNom_Sel ,
                                              AV28TFCliNom ,
                                              AV54TFBarSer_Sel ,
                                              AV53TFBarSer ,
                                              AV56TFBarSerDsc_Sel ,
                                              AV55TFBarSerDsc ,
                                              AV58TFBarColNom_Sel ,
                                              AV57TFBarColNom ,
                                              Integer.valueOf(AV59TFBarColNum) ,
                                              Integer.valueOf(AV60TFBarColNum_To) ,
                                              AV66TFBarMaqCod_Sel ,
                                              AV65TFBarMaqCod ,
                                              AV74TFBarAcaQui_Sel ,
                                              AV73TFBarAcaQui ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Integer.valueOf(A252CliCod) ,
                                              A159BarFecGen ,
                                              Byte.valueOf(A213BarSit) ,
                                              A279CliNom ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A180BarMaqCod ,
                                              A118BarAcaQui ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV15FilterFullText ,
                                              A13878PedidoClie ,
                                              A13696BarNHdr ,
                                              AV31TFPedidoCliente_Sel ,
                                              AV30TFPedidoCliente ,
                                              Byte.valueOf(AV108TFHayRec_Sel) ,
                                              Byte.valueOf(A13710HayRec) ,
                                              AV38emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV28TFCliNom = GXutil.padr( GXutil.rtrim( AV28TFCliNom), 30, "%") ;
         lV53TFBarSer = GXutil.padr( GXutil.rtrim( AV53TFBarSer), 16, "%") ;
         lV55TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV55TFBarSerDsc), 26, "%") ;
         lV57TFBarColNom = GXutil.padr( GXutil.rtrim( AV57TFBarColNom), 13, "%") ;
         lV65TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV65TFBarMaqCod), 6, "%") ;
         lV73TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV73TFBarAcaQui), 6, "%") ;
         /* Using cursor H029N5 */
         pr_default.execute(1, new Object[] {AV38emprcod, Integer.valueOf(AV41BarCod), Byte.valueOf(AV42BarCodReo), AV43BarCodPar, Integer.valueOf(AV44CliCod), AV104BarFecGen, AV105BarFecGen_To, Byte.valueOf(AV106BarSit), Byte.valueOf(AV107BarSit_To), lV28TFCliNom, AV29TFCliNom_Sel, lV53TFBarSer, AV54TFBarSer_Sel, lV55TFBarSerDsc, AV56TFBarSerDsc_Sel, lV57TFBarColNom, AV58TFBarColNom_Sel, Integer.valueOf(AV59TFBarColNum), Integer.valueOf(AV60TFBarColNum_To), lV65TFBarMaqCod, AV66TFBarMaqCod_Sel, lV73TFBarAcaQui, AV74TFBarAcaQui_Sel});
         nGXsfl_111_idx = 1 ;
         sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1112( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3594BarPriTin = H029N5_A3594BarPriTin[0] ;
            A2265BarExt = H029N5_A2265BarExt[0] ;
            n2265BarExt = H029N5_n2265BarExt[0] ;
            A1923BarCodTN = H029N5_A1923BarCodTN[0] ;
            A209BarPri = H029N5_A209BarPri[0] ;
            A864BarPes = H029N5_A864BarPes[0] ;
            A228BarUniMed = H029N5_A228BarUniMed[0] ;
            A361DisCod = H029N5_A361DisCod[0] ;
            A5253BarAcc = H029N5_A5253BarAcc[0] ;
            A120BarAgrEst = H029N5_A120BarAgrEst[0] ;
            A118BarAcaQui = H029N5_A118BarAcaQui[0] ;
            A180BarMaqCod = H029N5_A180BarMaqCod[0] ;
            A213BarSit = H029N5_A213BarSit[0] ;
            A1235BarNumCli = H029N5_A1235BarNumCli[0] ;
            A1234BarNomCli = H029N5_A1234BarNomCli[0] ;
            A136BarColNum = H029N5_A136BarColNum[0] ;
            A135BarColNom = H029N5_A135BarColNom[0] ;
            A1652BarSerDsc = H029N5_A1652BarSerDsc[0] ;
            A159BarFecGen = H029N5_A159BarFecGen[0] ;
            A2010BarTipDis = H029N5_A2010BarTipDis[0] ;
            A13696BarNHdr = H029N5_A13696BarNHdr[0] ;
            A279CliNom = H029N5_A279CliNom[0] ;
            A184BarMtr = H029N5_A184BarMtr[0] ;
            A166BarKgm = H029N5_A166BarKgm[0] ;
            A143BarDisNum = H029N5_A143BarDisNum[0] ;
            A4812BarEncCli = H029N5_A4812BarEncCli[0] ;
            A199BarPie1 = H029N5_A199BarPie1[0] ;
            A365DisDes = H029N5_A365DisDes[0] ;
            A898BarPieNDes = H029N5_A898BarPieNDes[0] ;
            A212BarSer = H029N5_A212BarSer[0] ;
            A252CliCod = H029N5_A252CliCod[0] ;
            n252CliCod = H029N5_n252CliCod[0] ;
            A130BarCodPar = H029N5_A130BarCodPar[0] ;
            A132BarCodReo = H029N5_A132BarCodReo[0] ;
            A129BarCod = H029N5_A129BarCod[0] ;
            A396EmprCod = H029N5_A396EmprCod[0] ;
            A279CliNom = H029N5_A279CliNom[0] ;
            A184BarMtr = H029N5_A184BarMtr[0] ;
            A166BarKgm = H029N5_A166BarKgm[0] ;
            A199BarPie1 = H029N5_A199BarPie1[0] ;
            A898BarPieNDes = H029N5_A898BarPieNDes[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            hojaderuta__ww_impl.this.A396EmprCod = GXv_char5[0] ;
            hojaderuta__ww_impl.this.A4812BarEncCli = GXv_char4[0] ;
            hojaderuta__ww_impl.this.A143BarDisNum = GXv_char3[0] ;
            hojaderuta__ww_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( (GXutil.strcmp("", AV15FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV15FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV15FilterFullText) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV31TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV30TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV30TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV31TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV31TFPedidoCliente_Sel) == 0 ) ) )
                  {
                     GXt_int6 = A14007E_Barser ;
                     GXv_int7[0] = GXt_int6 ;
                     new app.pedidosclientesindetalle.existearticulo(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, GXv_int7) ;
                     hojaderuta__ww_impl.this.GXt_int6 = GXv_int7[0] ;
                     A14007E_Barser = GXt_int6 ;
                     GXt_int8 = A13710HayRec ;
                     GXv_int9[0] = GXt_int8 ;
                     new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int9) ;
                     hojaderuta__ww_impl.this.GXt_int8 = GXv_int9[0] ;
                     A13710HayRec = GXt_int8 ;
                     if ( ( AV108TFHayRec_Sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                     {
                        if ( ( AV108TFHayRec_Sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                        {
                           GXt_int10 = A13930BarAlbUlti ;
                           GXv_int11[0] = GXt_int10 ;
                           new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int11) ;
                           hojaderuta__ww_impl.this.GXt_int10 = GXv_int11[0] ;
                           A13930BarAlbUlti = GXt_int10 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13930BarAlbUlti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13930BarAlbUlti), 10, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBULTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9")));
                           if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                           {
                              A198BarPie = A898BarPieNDes ;
                           }
                           else
                           {
                              A198BarPie = A199BarPie1 ;
                           }
                           e2929N2 ();
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
         wbEnd = (short)(111) ;
         wb29N0( ) ;
      }
      bGXsfl_111_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes29N2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vENSAYOS", GXutil.ltrim( localUtil.ntoc( AV78Ensayos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78Ensayos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSIT"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARUNIMED"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( A228BarUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPES"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSER"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( A212BarSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PEDIDOCLIE"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNOM"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( A135BarColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOLNUM"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIE"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARSERDSC"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( A1652BarSerDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARAGREST"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_HAYREC"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(A13710HayRec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRITIN", GXutil.ltrim( localUtil.ntoc( A3594BarPriTin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A3594BarPriTin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAREXT", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BAREXT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPRI"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( A209BarPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFECGEN"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, A159BarFecGen));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV77moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF", GXutil.rtrim( AV89PATHPDF));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV79ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBULTI", GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBULTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV47UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV39Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV41BarCod, AV42BarCodReo, AV43BarCodPar, AV44CliCod, AV104BarFecGen, AV105BarFecGen_To, AV106BarSit, AV107BarSit_To, AV38emprcod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFPedidoCliente, AV31TFPedidoCliente_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV55TFBarSerDsc, AV56TFBarSerDsc_Sel, AV57TFBarColNom, AV58TFBarColNom_Sel, AV59TFBarColNum, AV60TFBarColNum_To, AV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV73TFBarAcaQui, AV74TFBarAcaQui_Sel, AV108TFHayRec_Sel, AV78Ensayos, Gx_mode, AV77moda21, AV89PATHPDF, AV79ImpCod, AV47UsurCod, AV39Station, A3594BarPriTin, A2265BarExt, A13930BarAlbUlti) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV41BarCod, AV42BarCodReo, AV43BarCodPar, AV44CliCod, AV104BarFecGen, AV105BarFecGen_To, AV106BarSit, AV107BarSit_To, AV38emprcod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFPedidoCliente, AV31TFPedidoCliente_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV55TFBarSerDsc, AV56TFBarSerDsc_Sel, AV57TFBarColNom, AV58TFBarColNom_Sel, AV59TFBarColNum, AV60TFBarColNum_To, AV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV73TFBarAcaQui, AV74TFBarAcaQui_Sel, AV108TFHayRec_Sel, AV78Ensayos, Gx_mode, AV77moda21, AV89PATHPDF, AV79ImpCod, AV47UsurCod, AV39Station, A3594BarPriTin, A2265BarExt, A13930BarAlbUlti) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV41BarCod, AV42BarCodReo, AV43BarCodPar, AV44CliCod, AV104BarFecGen, AV105BarFecGen_To, AV106BarSit, AV107BarSit_To, AV38emprcod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFPedidoCliente, AV31TFPedidoCliente_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV55TFBarSerDsc, AV56TFBarSerDsc_Sel, AV57TFBarColNom, AV58TFBarColNom_Sel, AV59TFBarColNum, AV60TFBarColNum_To, AV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV73TFBarAcaQui, AV74TFBarAcaQui_Sel, AV108TFHayRec_Sel, AV78Ensayos, Gx_mode, AV77moda21, AV89PATHPDF, AV79ImpCod, AV47UsurCod, AV39Station, A3594BarPriTin, A2265BarExt, A13930BarAlbUlti) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV41BarCod, AV42BarCodReo, AV43BarCodPar, AV44CliCod, AV104BarFecGen, AV105BarFecGen_To, AV106BarSit, AV107BarSit_To, AV38emprcod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFPedidoCliente, AV31TFPedidoCliente_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV55TFBarSerDsc, AV56TFBarSerDsc_Sel, AV57TFBarColNom, AV58TFBarColNom_Sel, AV59TFBarColNum, AV60TFBarColNum_To, AV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV73TFBarAcaQui, AV74TFBarAcaQui_Sel, AV108TFHayRec_Sel, AV78Ensayos, Gx_mode, AV77moda21, AV89PATHPDF, AV79ImpCod, AV47UsurCod, AV39Station, A3594BarPriTin, A2265BarExt, A13930BarAlbUlti) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV41BarCod, AV42BarCodReo, AV43BarCodPar, AV44CliCod, AV104BarFecGen, AV105BarFecGen_To, AV106BarSit, AV107BarSit_To, AV38emprcod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV111Pgmname, AV12OrderedBy, AV13OrderedDsc, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFPedidoCliente, AV31TFPedidoCliente_Sel, AV53TFBarSer, AV54TFBarSer_Sel, AV55TFBarSerDsc, AV56TFBarSerDsc_Sel, AV57TFBarColNom, AV58TFBarColNom_Sel, AV59TFBarColNum, AV60TFBarColNum_To, AV65TFBarMaqCod, AV66TFBarMaqCod_Sel, AV73TFBarAcaQui, AV74TFBarAcaQui_Sel, AV108TFHayRec_Sel, AV78Ensayos, Gx_mode, AV77moda21, AV89PATHPDF, AV79ImpCod, AV47UsurCod, AV39Station, A3594BarPriTin, A2265BarExt, A13930BarAlbUlti) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV111Pgmname = "PedidosClienteSinDetalle.HojadeRuta__WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavF_color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF_color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavF_color_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29N0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2729N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV32DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_111 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_111"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV34GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV35GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Situacionfases_modal_Width = httpContext.cgiGet( "SITUACIONFASES_MODAL_Width") ;
         Situacionfases_modal_Title = httpContext.cgiGet( "SITUACIONFASES_MODAL_Title") ;
         Situacionfases_modal_Confirmtype = httpContext.cgiGet( "SITUACIONFASES_MODAL_Confirmtype") ;
         Situacionfases_modal_Bodytype = httpContext.cgiGet( "SITUACIONFASES_MODAL_Bodytype") ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarCod), 8, 0));
         }
         else
         {
            AV41BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42BarCodReo", GXutil.str( AV42BarCodReo, 1, 0));
         }
         else
         {
            AV42BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42BarCodReo", GXutil.str( AV42BarCodReo, 1, 0));
         }
         AV43BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43BarCodPar", AV43BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44CliCod), 6, 0));
         }
         else
         {
            AV44CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44CliCod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGEN");
            GX_FocusControl = edtavBarfecgen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV104BarFecGen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecGen", localUtil.format(AV104BarFecGen, "99/99/99"));
         }
         else
         {
            AV104BarFecGen = localUtil.ctod( httpContext.cgiGet( edtavBarfecgen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecGen", localUtil.format(AV104BarFecGen, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgen_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGEN_TO");
            GX_FocusControl = edtavBarfecgen_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV105BarFecGen_To = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105BarFecGen_To", localUtil.format(AV105BarFecGen_To, "99/99/99"));
         }
         else
         {
            AV105BarFecGen_To = localUtil.ctod( httpContext.cgiGet( edtavBarfecgen_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105BarFecGen_To", localUtil.format(AV105BarFecGen_To, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT");
            GX_FocusControl = edtavBarsit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV106BarSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarSit), 2, 0));
         }
         else
         {
            AV106BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarSit), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT_TO");
            GX_FocusControl = edtavBarsit_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV107BarSit_To = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarSit_To), 2, 0));
         }
         else
         {
            AV107BarSit_To = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarSit_To), 2, 0));
         }
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_111_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1112( ) ;
         if ( nGXsfl_111_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV48GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
            A159BarFecGen = localUtil.ctod( httpContext.cgiGet( edtBarFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
            A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
            A118BarAcaQui = httpContext.cgiGet( edtBarAcaQui_Internalname) ;
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A5253BarAcc = ((GXutil.strcmp(httpContext.cgiGet( chkBarAcc.getInternalname()), "S")==0) ? "S" : "N") ;
            A14007E_Barser = (short)(localUtil.ctol( httpContext.cgiGet( edtE_Barser_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
            A864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A209BarPri = httpContext.cgiGet( edtBarPri_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_COLOR");
               GX_FocusControl = edtavF_color_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV50F_color = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50F_color), 4, 0));
            }
            else
            {
               AV50F_color = (short)(localUtil.ctol( httpContext.cgiGet( edtavF_color_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50F_color), 4, 0));
            }
            A1923BarCodTN = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodTN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13710HayRec = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkHayRec.getInternalname()), "1")==0) ? 1 : 0)) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"HojadeRuta__WW");
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\hojaderuta__ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV41BarCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV42BarCodReo )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPAR"), AV43BarCodPar) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV44CliCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGEN"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV104BarFecGen)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGEN_TO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV105BarFecGen_To)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV106BarSit )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV107BarSit_To )
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
      e2729N2 ();
      if (returnInSub) return;
   }

   public void e2729N2( )
   {
      /* Start Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgento())) )
      {
         AV45BarFecGenfrom = AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarFecGenfrom", localUtil.format(AV45BarFecGenfrom, "99/99/99"));
         AV46BarFecGento = AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgento() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarFecGento", localUtil.format(AV46BarFecGento, "99/99/99"));
      }
      else
      {
         if ( (0==AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barcod()) )
         {
            AV45BarFecGenfrom = GXutil.dadd(GXutil.today( ),-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45BarFecGenfrom", localUtil.format(AV45BarFecGenfrom, "99/99/99"));
            AV104BarFecGen = GXutil.dadd(GXutil.today( ),-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecGen", localUtil.format(AV104BarFecGen, "99/99/99"));
            AV46BarFecGento = GXutil.today( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46BarFecGento", localUtil.format(AV46BarFecGento, "99/99/99"));
            AV105BarFecGen_To = GXutil.today( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105BarFecGen_To", localUtil.format(AV105BarFecGen_To, "99/99/99"));
            AV106BarSit = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarSit), 2, 0));
            AV107BarSit_To = (byte)(6) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarSit_To), 2, 0));
            AV36BarSitfrom = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarSitfrom), 2, 0));
            AV37BarSitto = (byte)(6) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarSitto), 2, 0));
         }
      }
      GXt_char1 = AV39Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      hojaderuta__ww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV39Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Station", AV39Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      GXv_char5[0] = AV38emprcod ;
      GXv_char4[0] = AV40EmprNom ;
      GXv_char3[0] = AV47UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char5, GXv_char4, GXv_char3) ;
      hojaderuta__ww_impl.this.AV38emprcod = GXv_char5[0] ;
      hojaderuta__ww_impl.this.AV40EmprNom = GXv_char4[0] ;
      hojaderuta__ww_impl.this.AV47UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38emprcod", AV38emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV47UsurCod", AV47UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47UsurCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Mantenimiento Hoja de Ruta", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = AV32DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13[0] ;
      AV32DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int8 = (byte)(AV77moda21) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV38emprcod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      hojaderuta__ww_impl.this.GXt_int8 = GXv_int9[0] ;
      AV77moda21 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV77moda21), "ZZZ9")));
      GXt_int8 = (byte)(AV78Ensayos) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV38emprcod, httpContext.getMessage( "ENS000", ""), GXv_int9) ;
      hojaderuta__ww_impl.this.GXt_int8 = GXv_int9[0] ;
      AV78Ensayos = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78Ensayos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78Ensayos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENSAYOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78Ensayos), "ZZZ9")));
      GXt_char1 = AV89PATHPDF ;
      GXv_char5[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV38emprcod, httpContext.getMessage( "WEBPDF", ""), GXv_char5) ;
      hojaderuta__ww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV89PATHPDF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89PATHPDF", AV89PATHPDF);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89PATHPDF, ""))));
      AV99Year = (short)(GXutil.year( Gx_date)) ;
      AV85Day = (byte)(GXutil.day( Gx_date)) ;
      AV87Mounth = (byte)(GXutil.month( Gx_date)) ;
      AV97strDate = localUtil.format( DecimalUtil.doubleToDec(AV99Year), "9999") + localUtil.format( DecimalUtil.doubleToDec(AV87Mounth), "99") + localUtil.format( DecimalUtil.doubleToDec(AV85Day), "99") ;
   }

   public void e2829N2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext14[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext14) ;
      AV6WWPContext = GXv_SdtWWPContext14[0] ;
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
      if ( GXutil.strcmp(AV22Session.getValue("PedidosClienteSinDetalle.HojadeRuta__WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("PedidosClienteSinDetalle.HojadeRuta__WWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_111_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_111_Refreshing);
      edtPedidoClie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Visible), 5, 0), !bGXsfl_111_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_111_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_111_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_111_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_111_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_111_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_111_Refreshing);
      edtBarMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Visible), 5, 0), !bGXsfl_111_Refreshing);
      edtBarAcaQui_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaQui_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaQui_Visible), 5, 0), !bGXsfl_111_Refreshing);
      chkHayRec.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "Visible", GXutil.ltrimstr( chkHayRec.getVisible(), 5, 0), !bGXsfl_111_Refreshing);
      AV34GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridCurrentPage), 10, 0));
      AV35GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_111_Refreshing);
      edtCliCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Columnheaderclass", edtCliCod_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtCliNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Columnheaderclass", edtCliNom_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtPedidoClie_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Columnheaderclass", edtPedidoClie_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtBarNHdr_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Columnheaderclass", edtBarNHdr_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtBarFecGen_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecGen_Internalname, "Columnheaderclass", edtBarFecGen_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtBarSer_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Columnheaderclass", edtBarSer_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtBarSerDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Columnheaderclass", edtBarSerDsc_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtBarColNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Columnheaderclass", edtBarColNom_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtBarColNum_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Columnheaderclass", edtBarColNum_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtBarMaqCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Columnheaderclass", edtBarMaqCod_Columnheaderclass, !bGXsfl_111_Refreshing);
      edtBarAcaQui_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaQui_Internalname, "Columnheaderclass", edtBarAcaQui_Columnheaderclass, !bGXsfl_111_Refreshing);
      chkHayRec.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "Columnheaderclass", chkHayRec.getColumnHeaderClass(), !bGXsfl_111_Refreshing);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "GridLayoutClean", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1229N2( )
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
         AV33PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV33PageToGo) ;
      }
   }

   public void e1329N2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1429N2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV28TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliNom", AV28TFCliNom);
            AV29TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedidoCliente") == 0 )
         {
            AV30TFPedidoCliente = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPedidoCliente", AV30TFPedidoCliente);
            AV31TFPedidoCliente_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPedidoCliente_Sel", AV31TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV53TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarSer", AV53TFBarSer);
            AV54TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarSer_Sel", AV54TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV55TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarSerDsc", AV55TFBarSerDsc);
            AV56TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarSerDsc_Sel", AV56TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV57TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarColNom", AV57TFBarColNom);
            AV58TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarColNom_Sel", AV58TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV59TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarColNum), 6, 0));
            AV60TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMaqCod") == 0 )
         {
            AV65TFBarMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFBarMaqCod", AV65TFBarMaqCod);
            AV66TFBarMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFBarMaqCod_Sel", AV66TFBarMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAcaQui") == 0 )
         {
            AV73TFBarAcaQui = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFBarAcaQui", AV73TFBarAcaQui);
            AV74TFBarAcaQui_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFBarAcaQui_Sel", AV74TFBarAcaQui_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HayRec") == 0 )
         {
            AV108TFHayRec_Sel = (byte)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFHayRec_Sel", GXutil.str( AV108TFHayRec_Sel, 1, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2929N2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Piezas v02", ""), "fa fa-store", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Procesos", ""), "fas fa-industry", "", "", "", "", "", "", ""), (short)(0));
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STDNOR", ""), GXv_int9) ;
         hojaderuta__ww_impl.this.GXt_int8 = GXv_int9[0] ;
         AV49TempBoolean = (boolean)((GXt_int8==1)) ;
         if ( AV49TempBoolean )
         {
            cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Normas Estandares Textil", ""), "fa fa-shapes", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Notas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir HDR", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
         if ( 1 == 2 )
         {
            cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Programas de Tingimento", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         GXt_int8 = (byte)(0) ;
         GXv_int9[0] = GXt_int8 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREUNI", ""), GXv_int9) ;
         hojaderuta__ww_impl.this.GXt_int8 = GXv_int9[0] ;
         AV49TempBoolean = (boolean)((GXt_int8==1)) ;
         if ( AV49TempBoolean )
         {
            cmbavGridactions.addItem("10", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar Precio", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("11", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("12", GXutil.format( "%1;%2", httpContext.getMessage( "Situacion Fases", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         if ( ( A213BarSit == 1 ) && ( A1923BarCodTN == 1 ) && ( AV78Ensayos == 1 ) )
         {
            AV50F_color = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50F_color), 4, 0));
         }
         else if ( ( A213BarSit == 1 ) && ( A1923BarCodTN != 1 ) && ( AV78Ensayos == 1 ) )
         {
            AV50F_color = (short)(2) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50F_color), 4, 0));
         }
         else
         {
            AV50F_color = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavF_color_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50F_color), 4, 0));
         }
         if ( AV50F_color == 2 )
         {
            cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnWarning WWColumnWarningFirstColumn" );
            edtCliCod_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtCliNom_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarSerDsc_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarMaqCod_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            edtBarAcaQui_Columnclass = "WWColumn WWColumnWarning hidden-xs" ;
            chkHayRec.setColumnClass( "WWColumn WWColumnWarning" );
         }
         else if ( AV50F_color == 1 )
         {
            cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnInfo WWColumnInfoFirstColumn" );
            edtCliCod_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtCliNom_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarSerDsc_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarMaqCod_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            edtBarAcaQui_Columnclass = "WWColumn WWColumnInfo hidden-xs" ;
            chkHayRec.setColumnClass( "WWColumn WWColumnInfo" );
         }
         else if ( AV50F_color == 0 )
         {
            cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnGray WWColumnGrayFirstColumn" );
            edtCliCod_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtCliNom_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtPedidoClie_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarNHdr_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarFecGen_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarSer_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarSerDsc_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarColNom_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarColNum_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarMaqCod_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            edtBarAcaQui_Columnclass = "WWColumn WWColumnGray hidden-xs" ;
            chkHayRec.setColumnClass( "WWColumn WWColumnGray" );
         }
         else
         {
            cmbavGridactions.setColumnClass( httpContext.getMessage( "WWActionGroupColumn", "") );
            edtCliCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtCliNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtPedidoClie_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarNHdr_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarFecGen_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarSer_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarSerDsc_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarColNom_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarColNum_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarMaqCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            edtBarAcaQui_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
            chkHayRec.setColumnClass( httpContext.getMessage( "WWColumn", "") );
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(111) ;
         }
         sendrow_1112( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_111_Refreshing )
      {
         httpContext.doAjaxLoad(111, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
   }

   public void e1529N2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta__WWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1129N2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("PedidosClienteSinDetalle.HojadeRuta__WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV111Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("PedidosClienteSinDetalle.HojadeRuta__WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta__WWFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         hojaderuta__ww_impl.this.GXt_char1 = GXv_char5[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV111Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e3029N2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV48GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 3 )
      {
         /* Execute user subroutine: 'DO PIEZASV02' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 4 )
      {
         /* Execute user subroutine: 'DO PROCESOS' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 5 )
      {
         /* Execute user subroutine: 'DO NORMAS' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 6 )
      {
         /* Execute user subroutine: 'DO NOTAS' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 7 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 8 )
      {
         /* Execute user subroutine: 'DO IMPRIMIRHDR' */
         S272 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 9 )
      {
         /* Execute user subroutine: 'DO PROGRAMATINTE' */
         S282 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 10 )
      {
         /* Execute user subroutine: 'DO MODIFICARPRECIO' */
         S292 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 11 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S302 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 12 )
      {
         /* Execute user subroutine: 'DO SITUACIONFASES' */
         S312 ();
         if (returnInSub) return;
      }
      AV48GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1629N2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S322 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1729N2( )
   {
      /* Situacionfases_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1829N2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      GXv_char5[0] = AV16ExcelFilename ;
      GXv_char4[0] = AV17ErrorMessage ;
      new app.pedidosclientesindetalle.hojaderuta__wwexport(remoteHandle, context).execute( AV38emprcod, AV44CliCod, AV41BarCod, AV42BarCodReo, AV43BarCodPar, AV45BarFecGenfrom, AV46BarFecGento, AV36BarSitfrom, AV37BarSitto, GXv_char5, GXv_char4) ;
      hojaderuta__ww_impl.this.AV16ExcelFilename = GXv_char5[0] ;
      hojaderuta__ww_impl.this.AV17ErrorMessage = GXv_char4[0] ;
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
   }

   public void e1929N2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta__wwexportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV44CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV42BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV43BarCodPar)),GXutil.URLEncode(GXutil.formatDateParm(AV45BarFecGenfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV46BarFecGento)),GXutil.URLEncode(GXutil.ltrimstr(AV36BarSitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarSitto,2,0))}, new String[] {"Emprcod","CliCod","BarCod","BarCodReo","BarCodPar","BarFecGenfrom","BarFecGento","BarSitfrom","BarSitto"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
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
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "CliNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNHdr", "", "N° Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecGen", "", "Fecha Creacion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSer", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSerDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarColNum", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarMaqCod", "", "Maquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAcaQui", "", "Acs", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HayRec", "", "Receta?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta__WWColumnsSelector", GXv_char5) ;
      hojaderuta__ww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector15[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, GXv_SdtWWPColumnsSelector16) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector15[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta__WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV41BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarCod), 8, 0));
      AV42BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42BarCodReo", GXutil.str( AV42BarCodReo, 1, 0));
      AV43BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43BarCodPar", AV43BarCodPar);
      AV44CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44CliCod), 6, 0));
      AV104BarFecGen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecGen", localUtil.format(AV104BarFecGen, "99/99/99"));
      AV105BarFecGen_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105BarFecGen_To", localUtil.format(AV105BarFecGen_To, "99/99/99"));
      AV106BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarSit), 2, 0));
      AV107BarSit_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarSit_To), 2, 0));
      AV28TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliNom", AV28TFCliNom);
      AV29TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
      AV30TFPedidoCliente = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFPedidoCliente", AV30TFPedidoCliente);
      AV31TFPedidoCliente_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFPedidoCliente_Sel", AV31TFPedidoCliente_Sel);
      AV53TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarSer", AV53TFBarSer);
      AV54TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarSer_Sel", AV54TFBarSer_Sel);
      AV55TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarSerDsc", AV55TFBarSerDsc);
      AV56TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarSerDsc_Sel", AV56TFBarSerDsc_Sel);
      AV57TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarColNom", AV57TFBarColNom);
      AV58TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarColNom_Sel", AV58TFBarColNom_Sel);
      AV59TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarColNum), 6, 0));
      AV60TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFBarColNum_To), 6, 0));
      AV65TFBarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFBarMaqCod", AV65TFBarMaqCod);
      AV66TFBarMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFBarMaqCod_Sel", AV66TFBarMaqCod_Sel);
      AV73TFBarAcaQui = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFBarAcaQui", AV73TFBarAcaQui);
      AV74TFBarAcaQui_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFBarAcaQui_Sel", AV74TFBarAcaQui_Sel);
      AV108TFHayRec_Sel = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108TFHayRec_Sel", GXutil.str( AV108TFHayRec_Sel, 1, 0));
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
      callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( A213BarSit >= 9 )
      {
         callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      if ( 1 == 2 )
      {
         callWebObject(formatLink("app.pedidosclientesindetalle.hojaderuta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S222( )
   {
      /* 'DO PIEZASV02' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta___piezas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A228BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(A864BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A198BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A166BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(A184BarMtr)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(A120BarAgrEst)),GXutil.URLEncode(GXutil.ltrimstr(A13710HayRec,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","Discod","BarUniMed","BarPes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrEst","Hayrec"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO PROCESOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta__procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A3594BarPriTin,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A2265BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A228BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(A864BarPes,4,0)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A198BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A166BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(A184BarMtr)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(A120BarAgrEst))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Discod","BarSit","BarExt","CliCod","Barunimed","Barpes","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc","BarAgrEst"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO NORMAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tdisnor", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S252( )
   {
      /* 'DO NOTAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tnotashdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A13878PedidoClie)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A198BarPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A166BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(A184BarMtr)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","DisCod","CliCod","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S262( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidos.disobs__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A209BarPri)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.formatDateParm(A159BarFecGen))}, new String[] {"Mode","EmprCod","DisCod","PriCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S272( )
   {
      /* 'DO IMPRIMIRHDR' Routine */
      returnInSub = false ;
      if ( AV77moda21 == 1 )
      {
         AV96shdr = localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") + "_" + localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") + A130BarCodPar ;
         AV93ReportOutPut = GXutil.format( "%1OS_%2.pdf", AV89PATHPDF, GXutil.trim( AV96shdr), "", "", "", "", "", "", "") ;
         AV86File.setSource( AV93ReportOutPut );
         if ( AV86File.exists() )
         {
            AV86File.delete();
         }
         AV92ReportInPut = GXutil.trim( AV89PATHPDF) ;
         AV98x = (short)(1) ;
         AV94Sdt_MergePDF.clear();
         AV84PathFile = GXutil.format( httpContext.getMessage( "%1Report_%2.pdf", ""), AV92ReportInPut, GXutil.trim( GXutil.str( AV98x, 4, 0)), "", "", "", "", "", "", "") ;
         new app.rhdrmodcopy1(remoteHandle, context).execute( AV84PathFile, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV79ImpCod, httpContext.getMessage( "SCR", "")) ;
         AV95Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
         AV95Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV84PathFile );
         AV94Sdt_MergePDF.add(AV95Sdt_MergePDF_Item, 0);
         AV101ListPdfJson = AV94Sdt_MergePDF.toJSonString(false) ;
         AV91PathPDFFull = AV103AppTool.merge(AV101ListPdfJson, AV93ReportOutPut, true) ;
         GXt_char1 = AV100Link ;
         GXv_char5[0] = GXt_char1 ;
         new app.viewfile(remoteHandle, context).execute( AV91PathPDFFull, "", GXv_char5) ;
         hojaderuta__ww_impl.this.GXt_char1 = GXv_char5[0] ;
         AV100Link = GXt_char1 ;
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {AV100Link,httpContext.getMessage( "_blank", "")});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definir el formato¡", ""));
      }
   }

   public void S282( )
   {
      /* 'DO PROGRAMATINTE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.facturacion.programasdetingimento_1ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom))}, new String[] {"Emprcod","CliCod","CliNom"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S292( )
   {
      /* 'DO MODIFICARPRECIO' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.almacensindetalle.preciounico_wp", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A5253BarAcc))}, new String[] {"Mode","Emprcod","Discod","Baracc"}) , new Object[] {"A396EmprCod","A361DisCod","A5253BarAcc"});
      httpContext.doAjaxRefresh();
   }

   public void S302( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( A13710HayRec == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta Hdr, esta en Receta de Tinte. No se permite su eliminacion", ""));
      }
      else
      {
         if ( A213BarSit > 8 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta Hdr, esta CERRADA.No se permite su eliminacion", ""));
         }
         else
         {
            if ( A13930BarAlbUlti > 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta Hdr, esta en el Documento ", "")+localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9")+httpContext.getMessage( ", NO se permite su elimacion", ""));
            }
            else
            {
               if ( ( A213BarSit == 1 ) || ( A213BarSit == 2 ) )
               {
                  Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Desea eliminar el Nº Hdr ", "")+GXutil.str( A129BarCod, 8, 0)+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar+" ?" ;
                  ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
                  AV114Emprcod_selected = A396EmprCod ;
                  AV115Barcod_selected = A129BarCod ;
                  AV116Barcodreo_selected = A132BarCodReo ;
                  AV117Barcodpar_selected = A130BarCodPar ;
                  this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
               }
               else
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "La situacion de la Hdr, ", "")+GXutil.str( A213BarSit, 2, 0)+httpContext.getMessage( " no permite su eliminacion", ""));
               }
            }
         }
      }
   }

   public void S322( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char5[0] = AV38emprcod ;
      GXv_int19[0] = A129BarCod ;
      GXv_int9[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_int20[0] = A361DisCod ;
      new app.pbordis(remoteHandle, context).execute( GXv_char5, GXv_int19, GXv_int9, GXv_char4, GXv_int20) ;
      hojaderuta__ww_impl.this.AV38emprcod = GXv_char5[0] ;
      hojaderuta__ww_impl.this.A129BarCod = GXv_int19[0] ;
      hojaderuta__ww_impl.this.A132BarCodReo = GXv_int9[0] ;
      hojaderuta__ww_impl.this.A130BarCodPar = GXv_char4[0] ;
      hojaderuta__ww_impl.this.A361DisCod = GXv_int20[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38emprcod", AV38emprcod);
      AV80Inc_obs = httpContext.getMessage( "->Eliminacion Hdr ", "") + GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( AV38emprcod, AV111Pgmname, AV47UsurCod, AV39Station, AV80Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      httpContext.doAjaxRefresh();
   }

   public void S312( )
   {
      /* 'DO SITUACIONFASES' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "SITUACIONFASES_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV111Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV111Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV111Pgmname+"GridState"), null, null);
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
      AV118GXV1 = 1 ;
      while ( AV118GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV118GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOD") == 0 )
         {
            AV41BarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarCod), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCODREO") == 0 )
         {
            AV42BarCodReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42BarCodReo", GXutil.str( AV42BarCodReo, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCODPAR") == 0 )
         {
            AV43BarCodPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43BarCodPar", AV43BarCodPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLICOD") == 0 )
         {
            AV44CliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44CliCod), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARFECGEN") == 0 )
         {
            AV104BarFecGen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecGen", localUtil.format(AV104BarFecGen, "99/99/99"));
            AV105BarFecGen_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105BarFecGen_To", localUtil.format(AV105BarFecGen_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSIT") == 0 )
         {
            AV106BarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarSit), 2, 0));
            AV107BarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV28TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliNom", AV28TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV29TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV30TFPedidoCliente = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPedidoCliente", AV30TFPedidoCliente);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV31TFPedidoCliente_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPedidoCliente_Sel", AV31TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV53TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarSer", AV53TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV54TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarSer_Sel", AV54TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV55TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarSerDsc", AV55TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV56TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarSerDsc_Sel", AV56TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV57TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarColNom", AV57TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV58TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarColNom_Sel", AV58TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV59TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarColNum), 6, 0));
            AV60TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV65TFBarMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFBarMaqCod", AV65TFBarMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV66TFBarMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFBarMaqCod_Sel", AV66TFBarMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI") == 0 )
         {
            AV73TFBarAcaQui = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFBarAcaQui", AV73TFBarAcaQui);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI_SEL") == 0 )
         {
            AV74TFBarAcaQui_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFBarAcaQui_Sel", AV74TFBarAcaQui_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHAYREC_SEL") == 0 )
         {
            AV108TFHayRec_Sel = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFHayRec_Sel", GXutil.str( AV108TFHayRec_Sel, 1, 0));
         }
         AV118GXV1 = (int)(AV118GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFCliNom_Sel)==0), AV29TFCliNom_Sel, GXv_char5) ;
      hojaderuta__ww_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char21 = "" ;
      GXv_char4[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFPedidoCliente_Sel)==0), AV31TFPedidoCliente_Sel, GXv_char4) ;
      hojaderuta__ww_impl.this.GXt_char21 = GXv_char4[0] ;
      GXt_char22 = "" ;
      GXv_char3[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFBarSer_Sel)==0), AV54TFBarSer_Sel, GXv_char3) ;
      hojaderuta__ww_impl.this.GXt_char22 = GXv_char3[0] ;
      GXt_char23 = "" ;
      GXv_char2[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFBarSerDsc_Sel)==0), AV56TFBarSerDsc_Sel, GXv_char2) ;
      hojaderuta__ww_impl.this.GXt_char23 = GXv_char2[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFBarColNom_Sel)==0), AV58TFBarColNom_Sel, GXv_char25) ;
      hojaderuta__ww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0), AV66TFBarMaqCod_Sel, GXv_char27) ;
      hojaderuta__ww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0), AV74TFBarAcaQui_Sel, GXv_char29) ;
      hojaderuta__ww_impl.this.GXt_char28 = GXv_char29[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char21+"|||"+GXt_char22+"|"+GXt_char23+"|"+GXt_char24+"||"+GXt_char26+"|"+GXt_char28+"|"+((0==AV108TFHayRec_Sel) ? "" : GXutil.str( AV108TFHayRec_Sel, 1, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFCliNom)==0), AV28TFCliNom, GXv_char29) ;
      hojaderuta__ww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFPedidoCliente)==0), AV30TFPedidoCliente, GXv_char27) ;
      hojaderuta__ww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFBarSer)==0), AV53TFBarSer, GXv_char25) ;
      hojaderuta__ww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char23 = "" ;
      GXv_char5[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFBarSerDsc)==0), AV55TFBarSerDsc, GXv_char5) ;
      hojaderuta__ww_impl.this.GXt_char23 = GXv_char5[0] ;
      GXt_char22 = "" ;
      GXv_char4[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFBarColNom)==0), AV57TFBarColNom, GXv_char4) ;
      hojaderuta__ww_impl.this.GXt_char22 = GXv_char4[0] ;
      GXt_char21 = "" ;
      GXv_char3[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFBarMaqCod)==0), AV65TFBarMaqCod, GXv_char3) ;
      hojaderuta__ww_impl.this.GXt_char21 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFBarAcaQui)==0), AV73TFBarAcaQui, GXv_char2) ;
      hojaderuta__ww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+GXt_char28+"|"+GXt_char26+"|||"+GXt_char24+"|"+GXt_char23+"|"+GXt_char22+"|"+((0==AV59TFBarColNum) ? "" : GXutil.str( AV59TFBarColNum, 6, 0))+"|"+GXt_char21+"|"+GXt_char1+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||||"+((0==AV60TFBarColNum_To) ? "" : GXutil.str( AV60TFBarColNum_To, 6, 0))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV111Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "BARCOD", "", !(0==AV41BarCod), (short)(0), GXutil.trim( GXutil.str( AV41BarCod, 8, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "BARCODREO", "", !(0==AV42BarCodReo), (short)(0), GXutil.trim( GXutil.str( AV42BarCodReo, 1, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "BARCODPAR", "", !(GXutil.strcmp("", AV43BarCodPar)==0), (short)(0), AV43BarCodPar, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "CLICOD", "", !(0==AV44CliCod), (short)(0), GXutil.trim( GXutil.str( AV44CliCod, 6, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "BARFECGEN", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104BarFecGen))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105BarFecGen_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV104BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV105BarFecGen_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "BARSIT", "", !((0==AV106BarSit)&&(0==AV107BarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV106BarSit, 2, 0)), GXutil.trim( GXutil.str( AV107BarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFCLINOM", "", !(GXutil.strcmp("", AV28TFCliNom)==0), (short)(0), AV28TFCliNom, "", !(GXutil.strcmp("", AV29TFCliNom_Sel)==0), AV29TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPEDIDOCLIENTE", "", !(GXutil.strcmp("", AV30TFPedidoCliente)==0), (short)(0), AV30TFPedidoCliente, "", !(GXutil.strcmp("", AV31TFPedidoCliente_Sel)==0), AV31TFPedidoCliente_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARSER", "", !(GXutil.strcmp("", AV53TFBarSer)==0), (short)(0), AV53TFBarSer, "", !(GXutil.strcmp("", AV54TFBarSer_Sel)==0), AV54TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARSERDSC", "", !(GXutil.strcmp("", AV55TFBarSerDsc)==0), (short)(0), AV55TFBarSerDsc, "", !(GXutil.strcmp("", AV56TFBarSerDsc_Sel)==0), AV56TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV57TFBarColNom)==0), (short)(0), AV57TFBarColNom, "", !(GXutil.strcmp("", AV58TFBarColNom_Sel)==0), AV58TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARCOLNUM", "", !((0==AV59TFBarColNum)&&(0==AV60TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV59TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV60TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARMAQCOD", "", !(GXutil.strcmp("", AV65TFBarMaqCod)==0), (short)(0), AV65TFBarMaqCod, "", !(GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0), AV66TFBarMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARACAQUI", "", !(GXutil.strcmp("", AV73TFBarAcaQui)==0), (short)(0), AV73TFBarAcaQui, "", !(GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0), AV74TFBarAcaQui_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFHAYREC_SEL", "", !(0==AV108TFHayRec_Sel), (short)(0), GXutil.trim( GXutil.str( AV108TFHayRec_Sel, 1, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV111Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV111Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PedidosClienteSinDetalle.HojadeRuta_TRN" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e2029N2( )
   {
      /* Barcod_Isvalid Routine */
      returnInSub = false ;
      if ( AV41BarCod > 0 )
      {
         AV45BarFecGenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarFecGenfrom", localUtil.format(AV45BarFecGenfrom, "99/99/99"));
         AV46BarFecGento = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarFecGento", localUtil.format(AV46BarFecGento, "99/99/99"));
         AV104BarFecGen = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecGen", localUtil.format(AV104BarFecGen, "99/99/99"));
         AV105BarFecGen_To = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105BarFecGen_To", localUtil.format(AV105BarFecGen_To, "99/99/99"));
         AV45BarFecGenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarFecGenfrom", localUtil.format(AV45BarFecGenfrom, "99/99/99"));
         AV46BarFecGento = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarFecGento", localUtil.format(AV46BarFecGento, "99/99/99"));
         AV36BarSitfrom = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarSitfrom), 2, 0));
         AV37BarSitto = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarSitto), 2, 0));
         AV44CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44CliCod), 6, 0));
         AV106BarSit = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarSit), 2, 0));
         AV107BarSit_To = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarSit_To), 2, 0));
      }
      else
      {
         AV45BarFecGenfrom = GXutil.dadd(GXutil.today( ),-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarFecGenfrom", localUtil.format(AV45BarFecGenfrom, "99/99/99"));
         AV104BarFecGen = GXutil.dadd(GXutil.today( ),-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecGen", localUtil.format(AV104BarFecGen, "99/99/99"));
         AV46BarFecGento = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarFecGento", localUtil.format(AV46BarFecGento, "99/99/99"));
         AV105BarFecGen_To = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105BarFecGen_To", localUtil.format(AV105BarFecGen_To, "99/99/99"));
         AV106BarSit = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarSit), 2, 0));
         AV107BarSit_To = (byte)(6) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarSit_To), 2, 0));
      }
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81FilterHojadeRuta__WW", AV81FilterHojadeRuta__WW);
   }

   public void e2129N2( )
   {
      /* Barcod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV41BarCod > 0 )
      {
         AV45BarFecGenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarFecGenfrom", localUtil.format(AV45BarFecGenfrom, "99/99/99"));
         AV46BarFecGento = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarFecGento", localUtil.format(AV46BarFecGento, "99/99/99"));
         AV104BarFecGen = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecGen", localUtil.format(AV104BarFecGen, "99/99/99"));
         AV105BarFecGen_To = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105BarFecGen_To", localUtil.format(AV105BarFecGen_To, "99/99/99"));
         AV45BarFecGenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarFecGenfrom", localUtil.format(AV45BarFecGenfrom, "99/99/99"));
         AV46BarFecGento = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarFecGento", localUtil.format(AV46BarFecGento, "99/99/99"));
         AV36BarSitfrom = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarSitfrom), 2, 0));
         AV37BarSitto = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarSitto), 2, 0));
         AV44CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44CliCod), 6, 0));
         AV106BarSit = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarSit), 2, 0));
         AV107BarSit_To = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarSit_To), 2, 0));
      }
      else
      {
         AV45BarFecGenfrom = GXutil.dadd(GXutil.today( ),-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarFecGenfrom", localUtil.format(AV45BarFecGenfrom, "99/99/99"));
         AV104BarFecGen = GXutil.dadd(GXutil.today( ),-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecGen", localUtil.format(AV104BarFecGen, "99/99/99"));
         AV46BarFecGento = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarFecGento", localUtil.format(AV46BarFecGento, "99/99/99"));
         AV105BarFecGen_To = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105BarFecGen_To", localUtil.format(AV105BarFecGen_To, "99/99/99"));
         AV36BarSitfrom = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarSitfrom), 2, 0));
         AV37BarSitto = (byte)(6) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarSitto), 2, 0));
         AV106BarSit = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarSit), 2, 0));
         AV107BarSit_To = (byte)(6) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107BarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107BarSit_To), 2, 0));
      }
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81FilterHojadeRuta__WW", AV81FilterHojadeRuta__WW);
   }

   public void e2229N2( )
   {
      /* Clicod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81FilterHojadeRuta__WW", AV81FilterHojadeRuta__WW);
   }

   public void e2329N2( )
   {
      /* Barfecgenfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81FilterHojadeRuta__WW", AV81FilterHojadeRuta__WW);
   }

   public void e2429N2( )
   {
      /* Barfecgento_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81FilterHojadeRuta__WW", AV81FilterHojadeRuta__WW);
   }

   public void e2529N2( )
   {
      /* Barsitfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81FilterHojadeRuta__WW", AV81FilterHojadeRuta__WW);
   }

   public void e2629N2( )
   {
      /* Barsitto_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81FilterHojadeRuta__WW", AV81FilterHojadeRuta__WW);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV81FilterHojadeRuta__WW.fromJSonString(AV82WebSession.getValue(httpContext.getMessage( "FilterHojadeRuta__WW", "")), null);
      AV44CliCod = AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Clicod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44CliCod), 6, 0));
      AV41BarCod = AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barcod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarCod), 8, 0));
      AV42BarCodReo = AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barcodreo() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42BarCodReo", GXutil.str( AV42BarCodReo, 1, 0));
      AV43BarCodPar = AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barcodpar() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43BarCodPar", AV43BarCodPar);
      AV45BarFecGenfrom = AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45BarFecGenfrom", localUtil.format(AV45BarFecGenfrom, "99/99/99"));
      AV46BarFecGento = AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barfecgento() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46BarFecGento", localUtil.format(AV46BarFecGento, "99/99/99"));
      AV36BarSitfrom = AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barsitfrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarSitfrom), 2, 0));
      AV37BarSitto = AV81FilterHojadeRuta__WW.getgxTv_SdtFilterHojadeRuta__WW_Barsitto() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarSitto), 2, 0));
   }

   public void S332( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV81FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Clicod( AV44CliCod );
      AV81FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barcod( AV41BarCod );
      AV81FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barcodreo( AV42BarCodReo );
      AV81FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barcodpar( AV43BarCodPar );
      AV81FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom( AV45BarFecGenfrom );
      AV81FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barfecgento( AV46BarFecGento );
      AV81FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barsitfrom( AV36BarSitfrom );
      AV81FilterHojadeRuta__WW.setgxTv_SdtFilterHojadeRuta__WW_Barsitto( AV37BarSitto );
      AV82WebSession.setValue(httpContext.getMessage( "FilterHojadeRuta__WW", ""), AV81FilterHojadeRuta__WW.toJSonString(false, true));
   }

   public void wb_table5_165_29N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablesituacionfases_modal_Internalname, tblTablesituacionfases_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucSituacionfases_modal.setProperty("Width", Situacionfases_modal_Width);
         ucSituacionfases_modal.setProperty("Title", Situacionfases_modal_Title);
         ucSituacionfases_modal.setProperty("ConfirmType", Situacionfases_modal_Confirmtype);
         ucSituacionfases_modal.setProperty("BodyType", Situacionfases_modal_Bodytype);
         ucSituacionfases_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Situacionfases_modal_Internalname, "SITUACIONFASES_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"SITUACIONFASES_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_165_29N2e( true) ;
      }
      else
      {
         wb_table5_165_29N2e( false) ;
      }
   }

   public void wb_table4_160_29N2( boolean wbgen )
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
         wb_table4_160_29N2e( true) ;
      }
      else
      {
         wb_table4_160_29N2e( false) ;
      }
   }

   public void wb_table3_93_29N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarsit_Internalname, tblTablemergedbarsit_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsit_Internalname, httpContext.getMessage( "Bar Sit", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsit_Internalname, GXutil.ltrim( localUtil.ntoc( AV106BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV106BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV106BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsit_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarsit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBarsit_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblBarsit_rangemiddletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsit_to_Internalname, httpContext.getMessage( "Bar Sit_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsit_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV107BarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsit_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV107BarSit_To), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV107BarSit_To), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsit_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarsit_to_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_93_29N2e( true) ;
      }
      else
      {
         wb_table3_93_29N2e( false) ;
      }
   }

   public void wb_table2_77_29N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarfecgen_Internalname, tblTablemergedbarfecgen_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgen_Internalname, httpContext.getMessage( "Bar Fec Gen", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgen_Internalname, localUtil.format(AV104BarFecGen, "99/99/99"), localUtil.format( AV104BarFecGen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgen_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarfecgen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBarfecgen_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblBarfecgen_rangemiddletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgen_to_Internalname, httpContext.getMessage( "Bar Fec Gen_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgen_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgen_to_Internalname, localUtil.format(AV105BarFecGen_To, "99/99/99"), localUtil.format( AV105BarFecGen_To, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgen_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarfecgen_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgen_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgen_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_77_29N2e( true) ;
      }
      else
      {
         wb_table2_77_29N2e( false) ;
      }
   }

   public void wb_table1_26_29N2( boolean wbgen )
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
         wb_table6_31_29N2( true) ;
      }
      else
      {
         wb_table6_31_29N2( false) ;
      }
      return  ;
   }

   public void wb_table6_31_29N2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_26_29N2e( true) ;
      }
      else
      {
         wb_table1_26_29N2e( false) ;
      }
   }

   public void wb_table6_31_29N2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_31_29N2e( true) ;
      }
      else
      {
         wb_table6_31_29N2e( false) ;
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
      pa29N2( ) ;
      ws29N2( ) ;
      we29N2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269321361539", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta__ww.js", "?20269321361540", false, true);
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

   public void subsflControlProps_1112( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_111_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_111_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_111_idx ;
      edtPedidoClie_Internalname = "PEDIDOCLIE_"+sGXsfl_111_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_111_idx ;
      edtBarTipDis_Internalname = "BARTIPDIS_"+sGXsfl_111_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_111_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_111_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_111_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_111_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_111_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_111_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_111_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_111_idx ;
      edtBarMaqCod_Internalname = "BARMAQCOD_"+sGXsfl_111_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_111_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_111_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_111_idx ;
      edtBarAcaQui_Internalname = "BARACAQUI_"+sGXsfl_111_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_111_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_111_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_111_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_111_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_111_idx ;
      chkBarAcc.setInternalname( "BARACC_"+sGXsfl_111_idx );
      edtE_Barser_Internalname = "E_BARSER_"+sGXsfl_111_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_111_idx ;
      edtBarUniMed_Internalname = "BARUNIMED_"+sGXsfl_111_idx ;
      edtBarPes_Internalname = "BARPES_"+sGXsfl_111_idx ;
      edtBarPri_Internalname = "BARPRI_"+sGXsfl_111_idx ;
      edtavF_color_Internalname = "vF_COLOR_"+sGXsfl_111_idx ;
      edtBarCodTN_Internalname = "BARCODTN_"+sGXsfl_111_idx ;
      chkHayRec.setInternalname( "HAYREC_"+sGXsfl_111_idx );
   }

   public void subsflControlProps_fel_1112( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_111_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_111_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_111_fel_idx ;
      edtPedidoClie_Internalname = "PEDIDOCLIE_"+sGXsfl_111_fel_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_111_fel_idx ;
      edtBarTipDis_Internalname = "BARTIPDIS_"+sGXsfl_111_fel_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_111_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_111_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_111_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_111_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_111_fel_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_111_fel_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_111_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_111_fel_idx ;
      edtBarMaqCod_Internalname = "BARMAQCOD_"+sGXsfl_111_fel_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_111_fel_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_111_fel_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_111_fel_idx ;
      edtBarAcaQui_Internalname = "BARACAQUI_"+sGXsfl_111_fel_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_111_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_111_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_111_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_111_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_111_fel_idx ;
      chkBarAcc.setInternalname( "BARACC_"+sGXsfl_111_fel_idx );
      edtE_Barser_Internalname = "E_BARSER_"+sGXsfl_111_fel_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_111_fel_idx ;
      edtBarUniMed_Internalname = "BARUNIMED_"+sGXsfl_111_fel_idx ;
      edtBarPes_Internalname = "BARPES_"+sGXsfl_111_fel_idx ;
      edtBarPri_Internalname = "BARPRI_"+sGXsfl_111_fel_idx ;
      edtavF_color_Internalname = "vF_COLOR_"+sGXsfl_111_fel_idx ;
      edtBarCodTN_Internalname = "BARCODTN_"+sGXsfl_111_fel_idx ;
      chkHayRec.setInternalname( "HAYREC_"+sGXsfl_111_fel_idx );
   }

   public void sendrow_1112( )
   {
      subsflControlProps_1112( ) ;
      wb29N0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_111_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_111_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_111_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_111_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV48GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV48GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV48GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_111_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,112);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_111_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCod_Columnclass,edtCliCod_Columnheaderclass,Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliNom_Columnclass,edtCliNom_Columnheaderclass,Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPedidoClie_Columnclass,edtPedidoClie_Columnheaderclass,Integer.valueOf(edtPedidoClie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNHdr_Columnclass,edtBarNHdr_Columnheaderclass,Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipDis_Internalname,GXutil.rtrim( A2010BarTipDis),GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarFecGen_Columnclass,edtBarFecGen_Columnheaderclass,Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarSer_Columnclass,edtBarSer_Columnheaderclass,Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarSerDsc_Columnclass,edtBarSerDsc_Columnheaderclass,Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarColNom_Columnclass,edtBarColNom_Columnheaderclass,Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarColNum_Columnclass,edtBarColNum_Columnheaderclass,Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMaqCod_Internalname,GXutil.rtrim( A180BarMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarMaqCod_Columnclass,edtBarMaqCod_Columnheaderclass,Integer.valueOf(edtBarMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAcaQui_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAcaQui_Internalname,GXutil.rtrim( A118BarAcaQui),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAcaQui_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarAcaQui_Columnclass,edtBarAcaQui_Columnheaderclass,Integer.valueOf(edtBarAcaQui_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrEst_Internalname,GXutil.rtrim( A120BarAgrEst),GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARACC_" + sGXsfl_111_idx ;
         chkBarAcc.setName( GXCCtl );
         chkBarAcc.setWebtags( "" );
         chkBarAcc.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "TitleCaption", chkBarAcc.getCaption(), !bGXsfl_111_Refreshing);
         chkBarAcc.setCheckedValue( "N" );
         A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarAcc.getInternalname(),A5253BarAcc,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtE_Barser_Internalname,GXutil.ltrim( localUtil.ntoc( A14007E_Barser, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14007E_Barser), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtE_Barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarUniMed_Internalname,GXutil.rtrim( A228BarUniMed),GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPes_Internalname,GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPri_Internalname,GXutil.rtrim( A209BarPri),GXutil.rtrim( localUtil.format( A209BarPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavF_color_Enabled!=0)&&(edtavF_color_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 142,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavF_color_Internalname,GXutil.ltrim( localUtil.ntoc( AV50F_color, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavF_color_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50F_color), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV50F_color), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavF_color_Enabled!=0)&&(edtavF_color_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,142);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavF_color_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavF_color_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodTN_Internalname,GXutil.ltrim( localUtil.ntoc( A1923BarCodTN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1923BarCodTN), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodTN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkHayRec.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "HAYREC_" + sGXsfl_111_idx ;
         chkHayRec.setName( GXCCtl );
         chkHayRec.setWebtags( "" );
         chkHayRec.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "TitleCaption", chkHayRec.getCaption(), !bGXsfl_111_Refreshing);
         chkHayRec.setCheckedValue( "0" );
         A13710HayRec = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkHayRec.getInternalname(),GXutil.str( A13710HayRec, 1, 0),"","",Integer.valueOf(chkHayRec.getVisible()),Integer.valueOf(0),"1","",StyleString,ClassString,chkHayRec.getColumnClass(),chkHayRec.getColumnHeaderClass(),""});
         send_integrity_lvl_hashes29N2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_111_idx = ((subGrid_Islastpage==1)&&(nGXsfl_111_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_111_idx+1) ;
         sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1112( ) ;
      }
      /* End function sendrow_1112 */
   }

   public void startgridcontrol111( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"111\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Creacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAcaQui_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkHayRec.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Receta?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV48GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliNom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPedidoClie_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPedidoClie_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedidoClie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarNHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarNHdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2010BarTipDis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarFecGen_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarFecGen_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecGen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarSer_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarSer_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarSerDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarSerDsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarColNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarColNom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarColNum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarColNum_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A180BarMaqCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarMaqCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarMaqCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A118BarAcaQui));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarAcaQui_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarAcaQui_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAcaQui_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A120BarAgrEst));
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
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5253BarAcc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14007E_Barser, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A228BarUniMed));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A209BarPri));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50F_color, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavF_color_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1923BarCodTN, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkHayRec.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkHayRec.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkHayRec.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblFiltertextbarcod_Internalname = "FILTERTEXTBARCOD" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      divUnnamedtablearcod_Internalname = "UNNAMEDTABLEARCOD" ;
      lblFiltertextbarcodreo_Internalname = "FILTERTEXTBARCODREO" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      divUnnamedtablearcodreo_Internalname = "UNNAMEDTABLEARCODREO" ;
      lblFiltertextbarcodpar_Internalname = "FILTERTEXTBARCODPAR" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtablearcodpar_Internalname = "UNNAMEDTABLEARCODPAR" ;
      lblFiltertextclicod_Internalname = "FILTERTEXTCLICOD" ;
      edtavClicod_Internalname = "vCLICOD" ;
      divUnnamedtablelicod_Internalname = "UNNAMEDTABLELICOD" ;
      lblFiltertextbarfecgen_Internalname = "FILTERTEXTBARFECGEN" ;
      edtavBarfecgen_Internalname = "vBARFECGEN" ;
      lblBarfecgen_rangemiddletext_Internalname = "BARFECGEN_RANGEMIDDLETEXT" ;
      edtavBarfecgen_to_Internalname = "vBARFECGEN_TO" ;
      tblTablemergedbarfecgen_Internalname = "TABLEMERGEDBARFECGEN" ;
      divTablesplittedfiltertextbarfecgen_Internalname = "TABLESPLITTEDFILTERTEXTBARFECGEN" ;
      lblFiltertextbarsit_Internalname = "FILTERTEXTBARSIT" ;
      edtavBarsit_Internalname = "vBARSIT" ;
      lblBarsit_rangemiddletext_Internalname = "BARSIT_RANGEMIDDLETEXT" ;
      edtavBarsit_to_Internalname = "vBARSIT_TO" ;
      tblTablemergedbarsit_Internalname = "TABLEMERGEDBARSIT" ;
      divTablesplittedfiltertextbarsit_Internalname = "TABLESPLITTEDFILTERTEXTBARSIT" ;
      divTablemanualfilter_Internalname = "TABLEMANUALFILTER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtPedidoClie_Internalname = "PEDIDOCLIE" ;
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtBarTipDis_Internalname = "BARTIPDIS" ;
      edtBarFecGen_Internalname = "BARFECGEN" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtBarMaqCod_Internalname = "BARMAQCOD" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtBarKgm_Internalname = "BARKGM" ;
      edtBarMtr_Internalname = "BARMTR" ;
      edtBarAcaQui_Internalname = "BARACAQUI" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      chkBarAcc.setInternalname( "BARACC" );
      edtE_Barser_Internalname = "E_BARSER" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      edtBarPes_Internalname = "BARPES" ;
      edtBarPri_Internalname = "BARPRI" ;
      edtavF_color_Internalname = "vF_COLOR" ;
      edtBarCodTN_Internalname = "BARCODTN" ;
      chkHayRec.setInternalname( "HAYREC" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Situacionfases_modal_Internalname = "SITUACIONFASES_MODAL" ;
      tblTablesituacionfases_modal_Internalname = "TABLESITUACIONFASES_MODAL" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
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
      chkHayRec.setCaption( "" );
      chkHayRec.setColumnClass( "WWColumn" );
      edtBarCodTN_Jsonclick = "" ;
      edtavF_color_Jsonclick = "" ;
      edtavF_color_Visible = 0 ;
      edtavF_color_Enabled = 1 ;
      edtBarPri_Jsonclick = "" ;
      edtBarPes_Jsonclick = "" ;
      edtBarUniMed_Jsonclick = "" ;
      edtDisCod_Jsonclick = "" ;
      edtE_Barser_Jsonclick = "" ;
      chkBarAcc.setCaption( "" );
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAcaQui_Jsonclick = "" ;
      edtBarAcaQui_Columnclass = "WWColumn hidden-xs" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarPie_Jsonclick = "" ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarMaqCod_Columnclass = "WWColumn hidden-xs" ;
      edtBarSit_Jsonclick = "" ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Columnclass = "WWColumn hidden-xs" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Columnclass = "WWColumn hidden-xs" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Columnclass = "WWColumn hidden-xs" ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Columnclass = "WWColumn hidden-xs" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarFecGen_Columnclass = "WWColumn hidden-xs" ;
      edtBarTipDis_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Columnclass = "WWColumn hidden-xs" ;
      edtPedidoClie_Jsonclick = "" ;
      edtPedidoClie_Columnclass = "WWColumn hidden-xs" ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Columnclass = "WWColumn hidden-xs" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Columnclass = "WWColumn hidden-xs" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavBarfecgen_to_Jsonclick = "" ;
      edtavBarfecgen_to_Enabled = 1 ;
      edtavBarfecgen_Jsonclick = "" ;
      edtavBarfecgen_Enabled = 1 ;
      edtavBarsit_to_Jsonclick = "" ;
      edtavBarsit_to_Enabled = 1 ;
      edtavBarsit_Jsonclick = "" ;
      edtavBarsit_Enabled = 1 ;
      chkHayRec.setColumnHeaderClass( "" );
      edtBarAcaQui_Columnheaderclass = "" ;
      edtBarMaqCod_Columnheaderclass = "" ;
      edtBarColNum_Columnheaderclass = "" ;
      edtBarColNom_Columnheaderclass = "" ;
      edtBarSerDsc_Columnheaderclass = "" ;
      edtBarSer_Columnheaderclass = "" ;
      edtBarFecGen_Columnheaderclass = "" ;
      edtBarNHdr_Columnheaderclass = "" ;
      edtPedidoClie_Columnheaderclass = "" ;
      edtCliNom_Columnheaderclass = "" ;
      edtCliCod_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      chkHayRec.setVisible( -1 );
      edtBarAcaQui_Visible = -1 ;
      edtBarMaqCod_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtPedidoClie_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Situacionfases_modal_Bodytype = "WebComponent" ;
      Situacionfases_modal_Confirmtype = "" ;
      Situacionfases_modal_Title = httpContext.getMessage( "Consulta de Fases Produccion", "") ;
      Situacionfases_modal_Width = "1500" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la produccion?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "PedidosClienteSinDetalle.HojadeRuta__WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||1:WWP_TSChecked,2:WWP_TSUnChecked" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|||Dynamic|Dynamic|Dynamic||Dynamic|Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "|T|T|||T|T|T||T|T|T" ;
      Ddo_grid_Filterisrange = "||||||||T|||" ;
      Ddo_grid_Filtertype = "|Character|Character|||Character|Character|Character|Numeric|Character|Character|" ;
      Ddo_grid_Includefilter = "|T|T|||T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "1|2||3|4|5|6|7|8|9|10|" ;
      Ddo_grid_Columnids = "1:CliCod|2:CliNom|3:PedidoCliente|4:BarNHdr|6:BarFecGen|7:BarSer|8:BarSerDsc|9:BarColNom|10:BarColNum|14:BarMaqCod|18:BarAcaQui|32:HayRec" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Hoja de Ruta", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_111_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV48GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV48GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
      }
      GXCCtl = "BARACC_" + sGXsfl_111_idx ;
      chkBarAcc.setName( GXCCtl );
      chkBarAcc.setWebtags( "" );
      chkBarAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "TitleCaption", chkBarAcc.getCaption(), !bGXsfl_111_Refreshing);
      chkBarAcc.setCheckedValue( "N" );
      A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
      GXCCtl = "HAYREC_" + sGXsfl_111_idx ;
      chkHayRec.setName( GXCCtl );
      chkHayRec.setWebtags( "" );
      chkHayRec.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkHayRec.getInternalname(), "TitleCaption", chkHayRec.getCaption(), !bGXsfl_111_Refreshing);
      chkHayRec.setCheckedValue( "0" );
      A13710HayRec = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1229N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1329N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1429N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2929N2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9',hsh:true},{av:'A1923BarCodTN',fld:'BARCODTN',pic:'ZZZZZ9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV50F_color',fld:'vF_COLOR',pic:'ZZZ9'},{av:'edtCliCod_Columnclass',ctrl:'CLICOD',prop:'Columnclass'},{av:'edtCliNom_Columnclass',ctrl:'CLINOM',prop:'Columnclass'},{av:'edtPedidoClie_Columnclass',ctrl:'PEDIDOCLIE',prop:'Columnclass'},{av:'edtBarNHdr_Columnclass',ctrl:'BARNHDR',prop:'Columnclass'},{av:'edtBarFecGen_Columnclass',ctrl:'BARFECGEN',prop:'Columnclass'},{av:'edtBarSer_Columnclass',ctrl:'BARSER',prop:'Columnclass'},{av:'edtBarSerDsc_Columnclass',ctrl:'BARSERDSC',prop:'Columnclass'},{av:'edtBarColNom_Columnclass',ctrl:'BARCOLNOM',prop:'Columnclass'},{av:'edtBarColNum_Columnclass',ctrl:'BARCOLNUM',prop:'Columnclass'},{av:'edtBarMaqCod_Columnclass',ctrl:'BARMAQCOD',prop:'Columnclass'},{av:'edtBarAcaQui_Columnclass',ctrl:'BARACAQUI',prop:'Columnclass'},{av:'chkHayRec.getColumnClass()',ctrl:'HAYREC',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1529N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1129N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e3029N2',iparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!',hsh:true},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9',hsh:true},{av:'A212BarSer',fld:'BARSER',pic:'',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:'',hsh:true},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9',hsh:true},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:'',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!',hsh:true},{av:'A13710HayRec',fld:'HAYREC',pic:'9',hsh:true},{av:'A209BarPri',fld:'BARPRI',pic:'9',hsh:true},{av:'A159BarFecGen',fld:'BARFECGEN',pic:'',hsh:true},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e1629N2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE","{handler:'e1729N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarMaqCod_Visible',ctrl:'BARMAQCOD',prop:'Visible'},{av:'edtBarAcaQui_Visible',ctrl:'BARACAQUI',prop:'Visible'},{av:'chkHayRec.getVisible()',ctrl:'HAYREC',prop:'Visible'},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtPedidoClie_Columnheaderclass',ctrl:'PEDIDOCLIE',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'edtBarFecGen_Columnheaderclass',ctrl:'BARFECGEN',prop:'Columnheaderclass'},{av:'edtBarSer_Columnheaderclass',ctrl:'BARSER',prop:'Columnheaderclass'},{av:'edtBarSerDsc_Columnheaderclass',ctrl:'BARSERDSC',prop:'Columnheaderclass'},{av:'edtBarColNom_Columnheaderclass',ctrl:'BARCOLNOM',prop:'Columnheaderclass'},{av:'edtBarColNum_Columnheaderclass',ctrl:'BARCOLNUM',prop:'Columnheaderclass'},{av:'edtBarMaqCod_Columnheaderclass',ctrl:'BARMAQCOD',prop:'Columnheaderclass'},{av:'edtBarAcaQui_Columnheaderclass',ctrl:'BARACAQUI',prop:'Columnheaderclass'},{av:'chkHayRec.getColumnHeaderClass()',ctrl:'HAYREC',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1829N2',iparms:[{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1929N2',iparms:[{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV38emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV31TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV53TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV54TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV55TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV56TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV57TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV58TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV59TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV60TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarMaqCod',fld:'vTFBARMAQCOD',pic:''},{av:'AV66TFBarMaqCod_Sel',fld:'vTFBARMAQCOD_SEL',pic:''},{av:'AV73TFBarAcaQui',fld:'vTFBARACAQUI',pic:''},{av:'AV74TFBarAcaQui_Sel',fld:'vTFBARACAQUI_SEL',pic:''},{av:'AV108TFHayRec_Sel',fld:'vTFHAYREC_SEL',pic:'9'},{av:'AV78Ensayos',fld:'vENSAYOS',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV77moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV89PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV79ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV47UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'A3594BarPriTin',fld:'BARPRITIN',pic:'Z9',hsh:true},{av:'A2265BarExt',fld:'BAREXT',pic:'9',hsh:true},{av:'A13930BarAlbUlti',fld:'BARALBULTI',pic:'ZZZZZZZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VBARCOD.ISVALID","{handler:'e2029N2',iparms:[{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARCOD.ISVALID",",oparms:[{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VBARCOD.CONTROLVALUECHANGED","{handler:'e2129N2',iparms:[{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV104BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV105BarFecGen_To',fld:'vBARFECGEN_TO',pic:''},{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV106BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV107BarSit_To',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED","{handler:'e2229N2',iparms:[{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED",",oparms:[{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VBARFECGENFROM.CONTROLVALUECHANGED","{handler:'e2329N2',iparms:[{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARFECGENFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VBARFECGENTO.CONTROLVALUECHANGED","{handler:'e2429N2',iparms:[{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARFECGENTO.CONTROLVALUECHANGED",",oparms:[{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VBARSITFROM.CONTROLVALUECHANGED","{handler:'e2529N2',iparms:[{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARSITFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VBARSITTO.CONTROLVALUECHANGED","{handler:'e2629N2',iparms:[{av:'AV44CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''},{av:'AV41BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV42BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV46BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV36BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV37BarSitto',fld:'vBARSITTO',pic:'Z9'}]");
      setEventMetadata("VBARSITTO.CONTROLVALUECHANGED",",oparms:[{av:'AV81FilterHojadeRuta__WW',fld:'vFILTERHOJADERUTA__WW',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARNHDR","{handler:'valid_Barnhdr',iparms:[]");
      setEventMetadata("VALID_BARNHDR",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARMAQCOD","{handler:'valid_Barmaqcod',iparms:[]");
      setEventMetadata("VALID_BARMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_BARACAQUI","{handler:'valid_Baracaqui',iparms:[]");
      setEventMetadata("VALID_BARACAQUI",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_HAYREC","{handler:'valid_Hayrec',iparms:[]");
      setEventMetadata("VALID_HAYREC",",oparms:[]}");
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
      AV15FilterFullText = "" ;
      AV43BarCodPar = "" ;
      AV104BarFecGen = GXutil.nullDate() ;
      AV105BarFecGen_To = GXutil.nullDate() ;
      AV38emprcod = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV111Pgmname = "" ;
      AV28TFCliNom = "" ;
      AV29TFCliNom_Sel = "" ;
      AV30TFPedidoCliente = "" ;
      AV31TFPedidoCliente_Sel = "" ;
      AV53TFBarSer = "" ;
      AV54TFBarSer_Sel = "" ;
      AV55TFBarSerDsc = "" ;
      AV56TFBarSerDsc_Sel = "" ;
      AV57TFBarColNom = "" ;
      AV58TFBarColNom_Sel = "" ;
      AV65TFBarMaqCod = "" ;
      AV66TFBarMaqCod_Sel = "" ;
      AV73TFBarAcaQui = "" ;
      AV74TFBarAcaQui_Sel = "" ;
      Gx_mode = "" ;
      AV89PATHPDF = "" ;
      AV79ImpCod = "" ;
      AV47UsurCod = "" ;
      AV39Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV32DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV45BarFecGenfrom = GXutil.nullDate() ;
      AV46BarFecGento = GXutil.nullDate() ;
      AV81FilterHojadeRuta__WW = new app.pedidosclientesindetalle.SdtFilterHojadeRuta__WW(remoteHandle, context);
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A365DisDes = "" ;
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
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      lblFiltertextbarcod_Jsonclick = "" ;
      lblFiltertextbarcodreo_Jsonclick = "" ;
      lblFiltertextbarcodpar_Jsonclick = "" ;
      lblFiltertextclicod_Jsonclick = "" ;
      lblFiltertextbarfecgen_Jsonclick = "" ;
      lblFiltertextbarsit_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A2010BarTipDis = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A180BarMaqCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A118BarAcaQui = "" ;
      A120BarAgrEst = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A5253BarAcc = "" ;
      A228BarUniMed = "" ;
      A209BarPri = "" ;
      Gx_date = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV15FilterFullText = "" ;
      lV28TFCliNom = "" ;
      lV53TFBarSer = "" ;
      lV55TFBarSerDsc = "" ;
      lV57TFBarColNom = "" ;
      lV65TFBarMaqCod = "" ;
      lV73TFBarAcaQui = "" ;
      H029N3_A3594BarPriTin = new byte[1] ;
      H029N3_A2265BarExt = new byte[1] ;
      H029N3_n2265BarExt = new boolean[] {false} ;
      H029N3_A1923BarCodTN = new int[1] ;
      H029N3_A209BarPri = new String[] {""} ;
      H029N3_A864BarPes = new short[1] ;
      H029N3_A228BarUniMed = new String[] {""} ;
      H029N3_A361DisCod = new int[1] ;
      H029N3_A5253BarAcc = new String[] {""} ;
      H029N3_A120BarAgrEst = new String[] {""} ;
      H029N3_A118BarAcaQui = new String[] {""} ;
      H029N3_A180BarMaqCod = new String[] {""} ;
      H029N3_A213BarSit = new byte[1] ;
      H029N3_A1235BarNumCli = new int[1] ;
      H029N3_A1234BarNomCli = new String[] {""} ;
      H029N3_A136BarColNum = new int[1] ;
      H029N3_A135BarColNom = new String[] {""} ;
      H029N3_A1652BarSerDsc = new String[] {""} ;
      H029N3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H029N3_A2010BarTipDis = new String[] {""} ;
      H029N3_A13696BarNHdr = new String[] {""} ;
      H029N3_A279CliNom = new String[] {""} ;
      H029N3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029N3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029N3_A143BarDisNum = new String[] {""} ;
      H029N3_A4812BarEncCli = new String[] {""} ;
      H029N3_A199BarPie1 = new short[1] ;
      H029N3_A365DisDes = new String[] {""} ;
      H029N3_A898BarPieNDes = new int[1] ;
      H029N3_A212BarSer = new String[] {""} ;
      H029N3_A252CliCod = new int[1] ;
      H029N3_n252CliCod = new boolean[] {false} ;
      H029N3_A130BarCodPar = new String[] {""} ;
      H029N3_A132BarCodReo = new byte[1] ;
      H029N3_A129BarCod = new int[1] ;
      H029N3_A396EmprCod = new String[] {""} ;
      H029N5_A3594BarPriTin = new byte[1] ;
      H029N5_A2265BarExt = new byte[1] ;
      H029N5_n2265BarExt = new boolean[] {false} ;
      H029N5_A1923BarCodTN = new int[1] ;
      H029N5_A209BarPri = new String[] {""} ;
      H029N5_A864BarPes = new short[1] ;
      H029N5_A228BarUniMed = new String[] {""} ;
      H029N5_A361DisCod = new int[1] ;
      H029N5_A5253BarAcc = new String[] {""} ;
      H029N5_A120BarAgrEst = new String[] {""} ;
      H029N5_A118BarAcaQui = new String[] {""} ;
      H029N5_A180BarMaqCod = new String[] {""} ;
      H029N5_A213BarSit = new byte[1] ;
      H029N5_A1235BarNumCli = new int[1] ;
      H029N5_A1234BarNomCli = new String[] {""} ;
      H029N5_A136BarColNum = new int[1] ;
      H029N5_A135BarColNom = new String[] {""} ;
      H029N5_A1652BarSerDsc = new String[] {""} ;
      H029N5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H029N5_A2010BarTipDis = new String[] {""} ;
      H029N5_A13696BarNHdr = new String[] {""} ;
      H029N5_A279CliNom = new String[] {""} ;
      H029N5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029N5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029N5_A143BarDisNum = new String[] {""} ;
      H029N5_A4812BarEncCli = new String[] {""} ;
      H029N5_A199BarPie1 = new short[1] ;
      H029N5_A365DisDes = new String[] {""} ;
      H029N5_A898BarPieNDes = new int[1] ;
      H029N5_A212BarSer = new String[] {""} ;
      H029N5_A252CliCod = new int[1] ;
      H029N5_n252CliCod = new boolean[] {false} ;
      H029N5_A130BarCodPar = new String[] {""} ;
      H029N5_A132BarCodReo = new byte[1] ;
      H029N5_A129BarCod = new int[1] ;
      H029N5_A396EmprCod = new String[] {""} ;
      GXv_int7 = new short[1] ;
      GXv_int11 = new long[1] ;
      hsh = "" ;
      AV40EmprNom = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV97strDate = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext14 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = new GXBaseCollection[1] ;
      AV96shdr = "" ;
      AV93ReportOutPut = "" ;
      AV86File = new com.genexus.util.GXFile();
      AV92ReportInPut = "" ;
      AV94Sdt_MergePDF = new GXBaseCollection<app.SdtSdt_MergePDF_PDF>(app.SdtSdt_MergePDF_PDF.class, "PDF", "TexplusNET", remoteHandle);
      AV84PathFile = "" ;
      AV95Sdt_MergePDF_Item = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV101ListPdfJson = "" ;
      AV91PathPDFFull = "" ;
      AV103AppTool = new app.SdtAppTool(remoteHandle, context);
      AV100Link = "" ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      AV114Emprcod_selected = "" ;
      AV117Barcodpar_selected = "" ;
      GXv_int19 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int20 = new int[1] ;
      AV80Inc_obs = "" ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char28 = "" ;
      GXv_char29 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState30 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV82WebSession = httpContext.getWebSession();
      ucSituacionfases_modal = new com.genexus.webpanels.GXUserControl();
      lblBarsit_rangemiddletext_Jsonclick = "" ;
      lblBarfecgen_rangemiddletext_Jsonclick = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta__ww__default(),
         new Object[] {
             new Object[] {
            H029N3_A3594BarPriTin, H029N3_A2265BarExt, H029N3_n2265BarExt, H029N3_A1923BarCodTN, H029N3_A209BarPri, H029N3_A864BarPes, H029N3_A228BarUniMed, H029N3_A361DisCod, H029N3_A5253BarAcc, H029N3_A120BarAgrEst,
            H029N3_A118BarAcaQui, H029N3_A180BarMaqCod, H029N3_A213BarSit, H029N3_A1235BarNumCli, H029N3_A1234BarNomCli, H029N3_A136BarColNum, H029N3_A135BarColNom, H029N3_A1652BarSerDsc, H029N3_A159BarFecGen, H029N3_A2010BarTipDis,
            H029N3_A13696BarNHdr, H029N3_A279CliNom, H029N3_A184BarMtr, H029N3_A166BarKgm, H029N3_A143BarDisNum, H029N3_A4812BarEncCli, H029N3_A199BarPie1, H029N3_A365DisDes, H029N3_A898BarPieNDes, H029N3_A212BarSer,
            H029N3_A252CliCod, H029N3_n252CliCod, H029N3_A130BarCodPar, H029N3_A132BarCodReo, H029N3_A129BarCod, H029N3_A396EmprCod
            }
            , new Object[] {
            H029N5_A3594BarPriTin, H029N5_A2265BarExt, H029N5_n2265BarExt, H029N5_A1923BarCodTN, H029N5_A209BarPri, H029N5_A864BarPes, H029N5_A228BarUniMed, H029N5_A361DisCod, H029N5_A5253BarAcc, H029N5_A120BarAgrEst,
            H029N5_A118BarAcaQui, H029N5_A180BarMaqCod, H029N5_A213BarSit, H029N5_A1235BarNumCli, H029N5_A1234BarNomCli, H029N5_A136BarColNum, H029N5_A135BarColNom, H029N5_A1652BarSerDsc, H029N5_A159BarFecGen, H029N5_A2010BarTipDis,
            H029N5_A13696BarNHdr, H029N5_A279CliNom, H029N5_A184BarMtr, H029N5_A166BarKgm, H029N5_A143BarDisNum, H029N5_A4812BarEncCli, H029N5_A199BarPie1, H029N5_A365DisDes, H029N5_A898BarPieNDes, H029N5_A212BarSer,
            H029N5_A252CliCod, H029N5_n252CliCod, H029N5_A130BarCodPar, H029N5_A132BarCodReo, H029N5_A129BarCod, H029N5_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV111Pgmname = "PedidosClienteSinDetalle.HojadeRuta__WW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV111Pgmname = "PedidosClienteSinDetalle.HojadeRuta__WW" ;
      Gx_err = (short)(0) ;
      edtavF_color_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV42BarCodReo ;
   private byte AV106BarSit ;
   private byte AV107BarSit_To ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV108TFHayRec_Sel ;
   private byte A3594BarPriTin ;
   private byte A2265BarExt ;
   private byte gxajaxcallmode ;
   private byte AV36BarSitfrom ;
   private byte AV37BarSitto ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A13710HayRec ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV85Day ;
   private byte AV87Mounth ;
   private byte GXt_int8 ;
   private byte AV116Barcodreo_selected ;
   private byte GXv_int9[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV12OrderedBy ;
   private short AV78Ensayos ;
   private short AV77moda21 ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV48GridActions ;
   private short A14007E_Barser ;
   private short A864BarPes ;
   private short AV50F_color ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXt_int6 ;
   private short GXv_int7[] ;
   private short AV99Year ;
   private short AV98x ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_111 ;
   private int nGXsfl_111_idx=1 ;
   private int AV41BarCod ;
   private int AV44CliCod ;
   private int AV59TFBarColNum ;
   private int AV60TFBarColNum_To ;
   private int A898BarPieNDes ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A198BarPie ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A1923BarCodTN ;
   private int subGrid_Islastpage ;
   private int edtavF_color_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtPedidoClie_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarMaqCod_Visible ;
   private int edtBarAcaQui_Visible ;
   private int AV33PageToGo ;
   private int AV115Barcod_selected ;
   private int GXv_int19[] ;
   private int GXv_int20[] ;
   private int AV118GXV1 ;
   private int edtavBarsit_Enabled ;
   private int edtavBarsit_to_Enabled ;
   private int edtavBarfecgen_Enabled ;
   private int edtavBarfecgen_to_Enabled ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavF_color_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A13930BarAlbUlti ;
   private long AV34GridCurrentPage ;
   private long AV35GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXt_int10 ;
   private long GXv_int11[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
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
   private String sGXsfl_111_idx="0001" ;
   private String AV43BarCodPar ;
   private String AV38emprcod ;
   private String AV111Pgmname ;
   private String AV28TFCliNom ;
   private String AV29TFCliNom_Sel ;
   private String AV30TFPedidoCliente ;
   private String AV31TFPedidoCliente_Sel ;
   private String AV53TFBarSer ;
   private String AV54TFBarSer_Sel ;
   private String AV55TFBarSerDsc ;
   private String AV56TFBarSerDsc_Sel ;
   private String AV57TFBarColNom ;
   private String AV58TFBarColNom_Sel ;
   private String AV65TFBarMaqCod ;
   private String AV66TFBarMaqCod_Sel ;
   private String AV73TFBarAcaQui ;
   private String AV74TFBarAcaQui_Sel ;
   private String Gx_mode ;
   private String AV89PATHPDF ;
   private String AV79ImpCod ;
   private String AV47UsurCod ;
   private String AV39Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A365DisDes ;
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
   private String Situacionfases_modal_Width ;
   private String Situacionfases_modal_Title ;
   private String Situacionfases_modal_Confirmtype ;
   private String Situacionfases_modal_Bodytype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable1_Internalname ;
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
   private String divTablemanualfilter_Internalname ;
   private String divUnnamedtablearcod_Internalname ;
   private String lblFiltertextbarcod_Internalname ;
   private String lblFiltertextbarcod_Jsonclick ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String divUnnamedtablearcodreo_Internalname ;
   private String lblFiltertextbarcodreo_Internalname ;
   private String lblFiltertextbarcodreo_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String divUnnamedtablearcodpar_Internalname ;
   private String lblFiltertextbarcodpar_Internalname ;
   private String lblFiltertextbarcodpar_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String divUnnamedtablelicod_Internalname ;
   private String lblFiltertextclicod_Internalname ;
   private String lblFiltertextclicod_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String divTablesplittedfiltertextbarfecgen_Internalname ;
   private String lblFiltertextbarfecgen_Internalname ;
   private String lblFiltertextbarfecgen_Jsonclick ;
   private String divTablesplittedfiltertextbarsit_Internalname ;
   private String lblFiltertextbarsit_Internalname ;
   private String lblFiltertextbarsit_Jsonclick ;
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
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A2010BarTipDis ;
   private String edtBarTipDis_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarNumCli_Internalname ;
   private String edtBarSit_Internalname ;
   private String A180BarMaqCod ;
   private String edtBarMaqCod_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String A118BarAcaQui ;
   private String edtBarAcaQui_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A5253BarAcc ;
   private String edtE_Barser_Internalname ;
   private String edtDisCod_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Internalname ;
   private String edtBarPes_Internalname ;
   private String A209BarPri ;
   private String edtBarPri_Internalname ;
   private String edtavF_color_Internalname ;
   private String edtBarCodTN_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV28TFCliNom ;
   private String lV53TFBarSer ;
   private String lV55TFBarSerDsc ;
   private String lV57TFBarColNom ;
   private String lV65TFBarMaqCod ;
   private String lV73TFBarAcaQui ;
   private String edtavBarfecgen_Internalname ;
   private String edtavBarfecgen_to_Internalname ;
   private String edtavBarsit_Internalname ;
   private String edtavBarsit_to_Internalname ;
   private String hsh ;
   private String AV40EmprNom ;
   private String edtCliCod_Columnheaderclass ;
   private String edtCliNom_Columnheaderclass ;
   private String edtPedidoClie_Columnheaderclass ;
   private String edtBarNHdr_Columnheaderclass ;
   private String edtBarFecGen_Columnheaderclass ;
   private String edtBarSer_Columnheaderclass ;
   private String edtBarSerDsc_Columnheaderclass ;
   private String edtBarColNom_Columnheaderclass ;
   private String edtBarColNum_Columnheaderclass ;
   private String edtBarMaqCod_Columnheaderclass ;
   private String edtBarAcaQui_Columnheaderclass ;
   private String edtCliCod_Columnclass ;
   private String edtCliNom_Columnclass ;
   private String edtPedidoClie_Columnclass ;
   private String edtBarNHdr_Columnclass ;
   private String edtBarFecGen_Columnclass ;
   private String edtBarSer_Columnclass ;
   private String edtBarSerDsc_Columnclass ;
   private String edtBarColNom_Columnclass ;
   private String edtBarColNum_Columnclass ;
   private String edtBarMaqCod_Columnclass ;
   private String edtBarAcaQui_Columnclass ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String AV114Emprcod_selected ;
   private String AV117Barcodpar_selected ;
   private String GXt_char28 ;
   private String GXv_char29[] ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
   private String GXt_char23 ;
   private String GXv_char5[] ;
   private String GXt_char22 ;
   private String GXv_char4[] ;
   private String GXt_char21 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablesituacionfases_modal_Internalname ;
   private String Situacionfases_modal_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablemergedbarsit_Internalname ;
   private String edtavBarsit_Jsonclick ;
   private String lblBarsit_rangemiddletext_Internalname ;
   private String lblBarsit_rangemiddletext_Jsonclick ;
   private String edtavBarsit_to_Jsonclick ;
   private String tblTablemergedbarfecgen_Internalname ;
   private String edtavBarfecgen_Jsonclick ;
   private String lblBarfecgen_rangemiddletext_Internalname ;
   private String lblBarfecgen_rangemiddletext_Jsonclick ;
   private String edtavBarfecgen_to_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_111_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarTipDis_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarNumCli_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarMaqCod_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarAcaQui_Jsonclick ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtE_Barser_Jsonclick ;
   private String edtDisCod_Jsonclick ;
   private String edtBarUniMed_Jsonclick ;
   private String edtBarPes_Jsonclick ;
   private String edtBarPri_Jsonclick ;
   private String edtavF_color_Jsonclick ;
   private String edtBarCodTN_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV104BarFecGen ;
   private java.util.Date AV105BarFecGen_To ;
   private java.util.Date AV45BarFecGenfrom ;
   private java.util.Date AV46BarFecGento ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean n2265BarExt ;
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
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_111_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV49TempBoolean ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV101ListPdfJson ;
   private String AV15FilterFullText ;
   private String lV15FilterFullText ;
   private String AV97strDate ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private String AV96shdr ;
   private String AV93ReportOutPut ;
   private String AV92ReportInPut ;
   private String AV84PathFile ;
   private String AV91PathPDFFull ;
   private String AV100Link ;
   private String AV80Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.WebSession AV82WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucSituacionfases_modal ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXFile AV86File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private app.SdtAppTool AV103AppTool ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkBarAcc ;
   private ICheckbox chkHayRec ;
   private IDataStoreProvider pr_default ;
   private byte[] H029N3_A3594BarPriTin ;
   private byte[] H029N3_A2265BarExt ;
   private boolean[] H029N3_n2265BarExt ;
   private int[] H029N3_A1923BarCodTN ;
   private String[] H029N3_A209BarPri ;
   private short[] H029N3_A864BarPes ;
   private String[] H029N3_A228BarUniMed ;
   private int[] H029N3_A361DisCod ;
   private String[] H029N3_A5253BarAcc ;
   private String[] H029N3_A120BarAgrEst ;
   private String[] H029N3_A118BarAcaQui ;
   private String[] H029N3_A180BarMaqCod ;
   private byte[] H029N3_A213BarSit ;
   private int[] H029N3_A1235BarNumCli ;
   private String[] H029N3_A1234BarNomCli ;
   private int[] H029N3_A136BarColNum ;
   private String[] H029N3_A135BarColNom ;
   private String[] H029N3_A1652BarSerDsc ;
   private java.util.Date[] H029N3_A159BarFecGen ;
   private String[] H029N3_A2010BarTipDis ;
   private String[] H029N3_A13696BarNHdr ;
   private String[] H029N3_A279CliNom ;
   private java.math.BigDecimal[] H029N3_A184BarMtr ;
   private java.math.BigDecimal[] H029N3_A166BarKgm ;
   private String[] H029N3_A143BarDisNum ;
   private String[] H029N3_A4812BarEncCli ;
   private short[] H029N3_A199BarPie1 ;
   private String[] H029N3_A365DisDes ;
   private int[] H029N3_A898BarPieNDes ;
   private String[] H029N3_A212BarSer ;
   private int[] H029N3_A252CliCod ;
   private boolean[] H029N3_n252CliCod ;
   private String[] H029N3_A130BarCodPar ;
   private byte[] H029N3_A132BarCodReo ;
   private int[] H029N3_A129BarCod ;
   private String[] H029N3_A396EmprCod ;
   private byte[] H029N5_A3594BarPriTin ;
   private byte[] H029N5_A2265BarExt ;
   private boolean[] H029N5_n2265BarExt ;
   private int[] H029N5_A1923BarCodTN ;
   private String[] H029N5_A209BarPri ;
   private short[] H029N5_A864BarPes ;
   private String[] H029N5_A228BarUniMed ;
   private int[] H029N5_A361DisCod ;
   private String[] H029N5_A5253BarAcc ;
   private String[] H029N5_A120BarAgrEst ;
   private String[] H029N5_A118BarAcaQui ;
   private String[] H029N5_A180BarMaqCod ;
   private byte[] H029N5_A213BarSit ;
   private int[] H029N5_A1235BarNumCli ;
   private String[] H029N5_A1234BarNomCli ;
   private int[] H029N5_A136BarColNum ;
   private String[] H029N5_A135BarColNom ;
   private String[] H029N5_A1652BarSerDsc ;
   private java.util.Date[] H029N5_A159BarFecGen ;
   private String[] H029N5_A2010BarTipDis ;
   private String[] H029N5_A13696BarNHdr ;
   private String[] H029N5_A279CliNom ;
   private java.math.BigDecimal[] H029N5_A184BarMtr ;
   private java.math.BigDecimal[] H029N5_A166BarKgm ;
   private String[] H029N5_A143BarDisNum ;
   private String[] H029N5_A4812BarEncCli ;
   private short[] H029N5_A199BarPie1 ;
   private String[] H029N5_A365DisDes ;
   private int[] H029N5_A898BarPieNDes ;
   private String[] H029N5_A212BarSer ;
   private int[] H029N5_A252CliCod ;
   private boolean[] H029N5_n252CliCod ;
   private String[] H029N5_A130BarCodPar ;
   private byte[] H029N5_A132BarCodReo ;
   private int[] H029N5_A129BarCod ;
   private String[] H029N5_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[] ;
   private GXBaseCollection<app.SdtSdt_MergePDF_PDF> AV94Sdt_MergePDF ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV32DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons13[] ;
   private app.pedidosclientesindetalle.SdtFilterHojadeRuta__WW AV81FilterHojadeRuta__WW ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState30[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.SdtSdt_MergePDF_PDF AV95Sdt_MergePDF_Item ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext14[] ;
}

final  class hojaderuta__ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H029N3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV41BarCod ,
                                          byte AV42BarCodReo ,
                                          String AV43BarCodPar ,
                                          int AV44CliCod ,
                                          java.util.Date AV104BarFecGen ,
                                          java.util.Date AV105BarFecGen_To ,
                                          byte AV106BarSit ,
                                          byte AV107BarSit_To ,
                                          String AV29TFCliNom_Sel ,
                                          String AV28TFCliNom ,
                                          String AV54TFBarSer_Sel ,
                                          String AV53TFBarSer ,
                                          String AV56TFBarSerDsc_Sel ,
                                          String AV55TFBarSerDsc ,
                                          String AV58TFBarColNom_Sel ,
                                          String AV57TFBarColNom ,
                                          int AV59TFBarColNum ,
                                          int AV60TFBarColNum_To ,
                                          String AV66TFBarMaqCod_Sel ,
                                          String AV65TFBarMaqCod ,
                                          String AV74TFBarAcaQui_Sel ,
                                          String AV73TFBarAcaQui ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A118BarAcaQui ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV15FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV31TFPedidoCliente_Sel ,
                                          String AV30TFPedidoCliente ,
                                          byte AV108TFHayRec_Sel ,
                                          byte A13710HayRec ,
                                          String AV38emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[23];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT T1.BarPriTin, T1.BarExt, T1.BarCodTN, T1.BarPri, T1.BarPes, T1.BarUniMed, T1.DisCod, T1.BarAcc, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarFecGen, T1.BarTipDis, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1," ;
      scmdbuf += " 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, T1.BarSer, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV41BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int31[1] = (byte)(1) ;
      }
      if ( ! (0==AV42BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int31[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43BarCodPar)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) = UPPER(?))");
      }
      else
      {
         GXv_int31[3] = (byte)(1) ;
      }
      if ( ! (0==AV44CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int31[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int31[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105BarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int31[6] = (byte)(1) ;
      }
      if ( ! (0==AV106BarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int31[7] = (byte)(1) ;
      }
      if ( ! (0==AV107BarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int31[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int31[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int31[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV55TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! (0==AV59TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (0==AV60TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarNHdr DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui DESC" ;
      }
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
   }

   protected Object[] conditional_H029N5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV41BarCod ,
                                          byte AV42BarCodReo ,
                                          String AV43BarCodPar ,
                                          int AV44CliCod ,
                                          java.util.Date AV104BarFecGen ,
                                          java.util.Date AV105BarFecGen_To ,
                                          byte AV106BarSit ,
                                          byte AV107BarSit_To ,
                                          String AV29TFCliNom_Sel ,
                                          String AV28TFCliNom ,
                                          String AV54TFBarSer_Sel ,
                                          String AV53TFBarSer ,
                                          String AV56TFBarSerDsc_Sel ,
                                          String AV55TFBarSerDsc ,
                                          String AV58TFBarColNom_Sel ,
                                          String AV57TFBarColNom ,
                                          int AV59TFBarColNum ,
                                          int AV60TFBarColNum_To ,
                                          String AV66TFBarMaqCod_Sel ,
                                          String AV65TFBarMaqCod ,
                                          String AV74TFBarAcaQui_Sel ,
                                          String AV73TFBarAcaQui ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A118BarAcaQui ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV15FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV31TFPedidoCliente_Sel ,
                                          String AV30TFPedidoCliente ,
                                          byte AV108TFHayRec_Sel ,
                                          byte A13710HayRec ,
                                          String AV38emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[23];
      Object[] GXv_Object34 = new Object[2];
      scmdbuf = "SELECT T1.BarPriTin, T1.BarExt, T1.BarCodTN, T1.BarPri, T1.BarPes, T1.BarUniMed, T1.DisCod, T1.BarAcc, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarFecGen, T1.BarTipDis, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1," ;
      scmdbuf += " 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, T1.BarSer, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV41BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int33[1] = (byte)(1) ;
      }
      if ( ! (0==AV42BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int33[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43BarCodPar)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) = UPPER(?))");
      }
      else
      {
         GXv_int33[3] = (byte)(1) ;
      }
      if ( ! (0==AV44CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int33[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int33[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105BarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int33[6] = (byte)(1) ;
      }
      if ( ! (0==AV106BarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int33[7] = (byte)(1) ;
      }
      if ( ! (0==AV107BarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int33[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV29TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV28TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int33[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int33[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV55TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int33[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( ! (0==AV59TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( ! (0==AV60TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV65TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV73TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarNHdr DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui DESC" ;
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
                  return conditional_H029N3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 1 :
                  return conditional_H029N5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029N3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029N5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 26);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 11);
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[24])[0] = rslt.getString(24, 8);
               ((String[]) buf[25])[0] = rslt.getString(25, 20);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((String[]) buf[27])[0] = rslt.getString(27, 1);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 16);
               ((int[]) buf[30])[0] = rslt.getInt(30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(31, 1);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((int[]) buf[34])[0] = rslt.getInt(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 26);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 11);
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[24])[0] = rslt.getString(24, 8);
               ((String[]) buf[25])[0] = rslt.getString(25, 20);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((String[]) buf[27])[0] = rslt.getString(27, 1);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 16);
               ((int[]) buf[30])[0] = rslt.getInt(30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(31, 1);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((int[]) buf[34])[0] = rslt.getInt(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 3);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               return;
      }
   }

}

