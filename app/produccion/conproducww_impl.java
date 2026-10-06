package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class conproducww_impl extends GXDataArea
{
   public conproducww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public conproducww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( conproducww_impl.class ));
   }

   public conproducww_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavMuestras = new HTMLChoice();
      cmbavGridactiongroup1 = new HTMLChoice();
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
      nRC_GXsfl_274 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_274"))) ;
      nGXsfl_274_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_274_idx"))) ;
      sGXsfl_274_idx = httpContext.GetPar( "sGXsfl_274_idx") ;
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
      AV107BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
      AV108BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
      AV109BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
      AV110BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
      AV103BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
      AV104BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
      AV101BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
      AV102BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
      AV99BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
      AV100BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
      AV97BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
      AV98BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
      AV93BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
      AV94BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
      AV95BarColNomto = httpContext.GetPar( "BarColNomto") ;
      AV96BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
      AV89BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
      AV90BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
      AV91BarNomClito = httpContext.GetPar( "BarNomClito") ;
      AV92BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
      AV87BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
      AV88BarSerto = httpContext.GetPar( "BarSerto") ;
      AV79BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
      AV80BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
      AV81BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
      AV82BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
      AV83BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
      AV84BarCodParto = httpContext.GetPar( "BarCodParto") ;
      AV77BarGirar = httpContext.GetPar( "BarGirar") ;
      AV105CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
      AV106CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
      AV85BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
      AV86BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
      AV76Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
      AV125EmprCod = httpContext.GetPar( "EmprCod") ;
      AV73LoadGridData = GXutil.strtobool( httpContext.GetPar( "LoadGridData")) ;
      AV140Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV132TFCP_BARCOLO = httpContext.GetPar( "TFCP_BARCOLO") ;
      AV133TFCP_BARCOLO_Sel = httpContext.GetPar( "TFCP_BARCOLO_Sel") ;
      AV134TFCP_BARCOLU = (int)(GXutil.lval( httpContext.GetPar( "TFCP_BARCOLU"))) ;
      AV135TFCP_BARCOLU_To = (int)(GXutil.lval( httpContext.GetPar( "TFCP_BARCOLU_To"))) ;
      AV136TFCP_TARTDSC = httpContext.GetPar( "TFCP_TARTDSC") ;
      AV137TFCP_TARTDSC_Sel = httpContext.GetPar( "TFCP_TARTDSC_Sel") ;
      A120BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
      AV129PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
      AV131CP_PedidoCliente = httpContext.GetPar( "CP_PedidoCliente") ;
      A14336CP_BARKGM = CommonUtil.decimalVal( httpContext.GetPar( "CP_BARKGM"), ".") ;
      A14337CP_BARMTR = CommonUtil.decimalVal( httpContext.GetPar( "CP_BARMTR"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV107BarDisNumfrom, AV108BarDisNumto, AV109BarSitfrom, AV110BarSitto, AV103BarFecClifrom, AV104BarFecClito, AV101BarFecGenfrom, AV102BarFecGento, AV99BarFecFprfrom, AV100BarFecFprto, AV97BarFecSalfrom, AV98BarFecSalto, AV93BarColNomfrom, AV94BarColNumfrom, AV95BarColNomto, AV96BarColNumto, AV89BarNomClifrom, AV90BarNumClifrom, AV91BarNomClito, AV92BarNumClito, AV87BarSerfrom, AV88BarSerto, AV79BarCodfrom, AV80BarCodReofrom, AV81BarCodParfrom, AV82BarCodto, AV83BarCodReoto, AV84BarCodParto, AV77BarGirar, AV105CliCodfrom, AV106CliCodto, AV85BarTipArtfrom, AV86BarTipArtto, AV76Cod_Idtx, AV125EmprCod, AV73LoadGridData, AV140Pgmname, AV12OrderedBy, AV13OrderedDsc, AV132TFCP_BARCOLO, AV133TFCP_BARCOLO_Sel, AV134TFCP_BARCOLU, AV135TFCP_BARCOLU_To, AV136TFCP_TARTDSC, AV137TFCP_TARTDSC_Sel, A120BarAgrEst, AV129PedidoCliente, AV131CP_PedidoCliente, A14336CP_BARKGM, A14337CP_BARMTR) ;
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
      pa26F2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start26F2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.conproducww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV129PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCP_PEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV131CP_PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARKGM", getSecureSignedToken( "", localUtil.format( A14336CP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARMTR", getSecureSignedToken( "", localUtil.format( A14337CP_BARMTR, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CONPRODUCWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV140Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\conproducww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARDISNUMFROM", GXutil.rtrim( AV107BarDisNumfrom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARDISNUMTO", GXutil.rtrim( AV108BarDisNumto));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV109BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV110BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECCLIFROM", localUtil.format(AV103BarFecClifrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECCLITO", localUtil.format(AV104BarFecClito, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGENFROM", localUtil.format(AV101BarFecGenfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGENTO", localUtil.format(AV102BarFecGento, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECFPRFROM", localUtil.format(AV99BarFecFprfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECFPRTO", localUtil.format(AV100BarFecFprto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECSALFROM", localUtil.format(AV97BarFecSalfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECSALTO", localUtil.format(AV98BarFecSalto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNOMFROM", GXutil.rtrim( AV93BarColNomfrom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNUMFROM", GXutil.ltrim( localUtil.ntoc( AV94BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNOMTO", GXutil.rtrim( AV95BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNUMTO", GXutil.ltrim( localUtil.ntoc( AV96BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNOMCLIFROM", GXutil.rtrim( AV89BarNomClifrom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNUMCLIFROM", GXutil.ltrim( localUtil.ntoc( AV90BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNOMCLITO", GXutil.rtrim( AV91BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNUMCLITO", GXutil.ltrim( localUtil.ntoc( AV92BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSERFROM", GXutil.rtrim( AV87BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSERTO", GXutil.rtrim( AV88BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODFROM", GXutil.ltrim( localUtil.ntoc( AV79BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODREOFROM", GXutil.ltrim( localUtil.ntoc( AV80BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODPARFROM", GXutil.rtrim( AV81BarCodParfrom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODTO", GXutil.ltrim( localUtil.ntoc( AV82BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODREOTO", GXutil.ltrim( localUtil.ntoc( AV83BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODPARTO", GXutil.rtrim( AV84BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARGIRAR", GXutil.rtrim( AV77BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV105CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV106CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARTIPARTFROM", GXutil.ltrim( localUtil.ntoc( AV85BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARTIPARTTO", GXutil.ltrim( localUtil.ntoc( AV86BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCOD_IDTX", GXutil.rtrim( AV76Cod_Idtx));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_274", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_274, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV115CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV115CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV116CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV116CliCodto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARTIPARTFROM_DATA", AV113BarTipArtfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARTIPARTFROM_DATA", AV113BarTipArtfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARTIPARTTO_DATA", AV114BarTipArtto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARTIPARTTO_DATA", AV114BarTipArtto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOD_IDTX_DATA", AV111Cod_Idtx_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOD_IDTX_DATA", AV111Cod_Idtx_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV71GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV72GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV69DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV69DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADGRIDDATA", AV73LoadGridData);
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCP_BARCOLO", GXutil.rtrim( AV132TFCP_BARCOLO));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCP_BARCOLO_SEL", GXutil.rtrim( AV133TFCP_BARCOLO_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCP_BARCOLU", GXutil.ltrim( localUtil.ntoc( AV134TFCP_BARCOLU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCP_BARCOLU_TO", GXutil.ltrim( localUtil.ntoc( AV135TFCP_BARCOLU_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCP_TARTDSC", AV136TFCP_TARTDSC);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCP_TARTDSC_SEL", AV137TFCP_TARTDSC_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV125EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDIDOCLIENTE", GXutil.rtrim( AV129PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV129PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCP_PEDIDOCLIENTE", GXutil.rtrim( AV131CP_PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCP_PEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV131CP_PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARKGM", GXutil.ltrim( localUtil.ntoc( A14336CP_BARKGM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARKGM", getSecureSignedToken( "", localUtil.format( A14336CP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARMTR", GXutil.ltrim( localUtil.ntoc( A14337CP_BARMTR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARMTR", getSecureSignedToken( "", localUtil.format( A14337CP_BARMTR, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTFROM_Cls", GXutil.rtrim( Combo_bartipartfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTFROM_Selectedvalue_set", GXutil.rtrim( Combo_bartipartfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTFROM_Emptyitemtext", GXutil.rtrim( Combo_bartipartfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Cls", GXutil.rtrim( Combo_bartipartto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Selectedvalue_set", GXutil.rtrim( Combo_bartipartto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Emptyitemtext", GXutil.rtrim( Combo_bartipartto_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Cls", GXutil.rtrim( Combo_cod_idtx_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Selectedvalue_set", GXutil.rtrim( Combo_cod_idtx_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Visible", GXutil.booltostr( Combo_cod_idtx_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Emptyitemtext", GXutil.rtrim( Combo_cod_idtx_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Width", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Cls", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Title", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Width", GXutil.rtrim( Dvpanel_panel_resultado_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autowidth", GXutil.booltostr( Dvpanel_panel_resultado_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoheight", GXutil.booltostr( Dvpanel_panel_resultado_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Cls", GXutil.rtrim( Dvpanel_panel_resultado_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Title", GXutil.rtrim( Dvpanel_panel_resultado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsible", GXutil.booltostr( Dvpanel_panel_resultado_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsed", GXutil.booltostr( Dvpanel_panel_resultado_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_resultado_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Iconposition", GXutil.rtrim( Dvpanel_panel_resultado_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoscroll", GXutil.booltostr( Dvpanel_panel_resultado_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Width", GXutil.rtrim( Situacionfases_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Title", GXutil.rtrim( Situacionfases_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Confirmtype", GXutil.rtrim( Situacionfases_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "SITUACIONFASES_MODAL_Bodytype", GXutil.rtrim( Situacionfases_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, "CONSULTAALBARANSALIDA_MODAL_Width", GXutil.rtrim( Consultaalbaransalida_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "CONSULTAALBARANSALIDA_MODAL_Title", GXutil.rtrim( Consultaalbaransalida_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "CONSULTAALBARANSALIDA_MODAL_Confirmtype", GXutil.rtrim( Consultaalbaransalida_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "CONSULTAALBARANSALIDA_MODAL_Bodytype", GXutil.rtrim( Consultaalbaransalida_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, "RECETAS_MODAL_Width", GXutil.rtrim( Recetas_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "RECETAS_MODAL_Title", GXutil.rtrim( Recetas_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "RECETAS_MODAL_Confirmtype", GXutil.rtrim( Recetas_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "RECETAS_MODAL_Bodytype", GXutil.rtrim( Recetas_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, "PARTESPRODUCCION_MODAL_Width", GXutil.rtrim( Partesproduccion_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "PARTESPRODUCCION_MODAL_Title", GXutil.rtrim( Partesproduccion_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PARTESPRODUCCION_MODAL_Confirmtype", GXutil.rtrim( Partesproduccion_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "PARTESPRODUCCION_MODAL_Bodytype", GXutil.rtrim( Partesproduccion_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, "PACKINGLIST_MODAL_Width", GXutil.rtrim( Packinglist_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "PACKINGLIST_MODAL_Title", GXutil.rtrim( Packinglist_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PACKINGLIST_MODAL_Confirmtype", GXutil.rtrim( Packinglist_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "PACKINGLIST_MODAL_Bodytype", GXutil.rtrim( Packinglist_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEZAS_MODAL_Width", GXutil.rtrim( Piezas_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEZAS_MODAL_Title", GXutil.rtrim( Piezas_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEZAS_MODAL_Confirmtype", GXutil.rtrim( Piezas_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEZAS_MODAL_Bodytype", GXutil.rtrim( Piezas_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, "AGRUPADAS_MODAL_Width", GXutil.rtrim( Agrupadas_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "AGRUPADAS_MODAL_Title", GXutil.rtrim( Agrupadas_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "AGRUPADAS_MODAL_Confirmtype", GXutil.rtrim( Agrupadas_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "AGRUPADAS_MODAL_Bodytype", GXutil.rtrim( Agrupadas_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Selectedvalue_get", GXutil.rtrim( Combo_cod_idtx_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Selectedvalue_get", GXutil.rtrim( Combo_bartipartto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTFROM_Selectedvalue_get", GXutil.rtrim( Combo_bartipartfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Selectedvalue_get", GXutil.rtrim( Combo_cod_idtx_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Selectedvalue_get", GXutil.rtrim( Combo_bartipartto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTFROM_Selectedvalue_get", GXutil.rtrim( Combo_bartipartfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
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
         we26F2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt26F2( ) ;
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
      return formatLink("app.produccion.conproducww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Produccion.CONPRODUCWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Consulta de Produccion", "") ;
   }

   public void wb26F0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosgenerales.setProperty("Width", Dvpanel_panel_filtrosgenerales_Width);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoWidth", Dvpanel_panel_filtrosgenerales_Autowidth);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoHeight", Dvpanel_panel_filtrosgenerales_Autoheight);
         ucDvpanel_panel_filtrosgenerales.setProperty("Cls", Dvpanel_panel_filtrosgenerales_Cls);
         ucDvpanel_panel_filtrosgenerales.setProperty("Title", Dvpanel_panel_filtrosgenerales_Title);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsible", Dvpanel_panel_filtrosgenerales_Collapsible);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsed", Dvpanel_panel_filtrosgenerales_Collapsed);
         ucDvpanel_panel_filtrosgenerales.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosgenerales_Showcollapseicon);
         ucDvpanel_panel_filtrosgenerales.setProperty("IconPosition", Dvpanel_panel_filtrosgenerales_Iconposition);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoScroll", Dvpanel_panel_filtrosgenerales_Autoscroll);
         ucDvpanel_panel_filtrosgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosgenerales_Internalname, "DVPANEL_PANEL_FILTROSGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSGENERALESContainer"+"Panel_FiltrosGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV115CliCodfrom_Data);
         ucCombo_clicodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodfrom_Internalname, "COMBO_CLICODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV116CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnumfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnumfrom_Internalname, httpContext.getMessage( "Ped. Cli. Ini.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnumfrom_Internalname, GXutil.rtrim( AV107BarDisNumfrom), GXutil.rtrim( localUtil.format( AV107BarDisNumfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnumfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnumfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnumto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnumto_Internalname, httpContext.getMessage( "Ped. Cli. Fin.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnumto_Internalname, GXutil.rtrim( AV108BarDisNumto), GXutil.rtrim( localUtil.format( AV108BarDisNumto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnumto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsitfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitfrom_Internalname, httpContext.getMessage( "Sit. Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV109BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV109BarSitfrom), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV109BarSitfrom), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitfrom_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsitto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitto_Internalname, httpContext.getMessage( "Sit. Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitto_Internalname, GXutil.ltrim( localUtil.ntoc( AV110BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV110BarSitto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV110BarSitto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecclifrom_Internalname, httpContext.getMessage( "Fecha Disp. Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecclifrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecclifrom_Internalname, localUtil.format(AV103BarFecClifrom, "99/99/99"), localUtil.format( AV103BarFecClifrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecclifrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecclifrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecclifrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecclito_Internalname, httpContext.getMessage( "Fecha Disp. Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecclito_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecclito_Internalname, localUtil.format(AV104BarFecClito, "99/99/99"), localUtil.format( AV104BarFecClito, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecclito_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecclito_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecclito_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecgenfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgenfrom_Internalname, httpContext.getMessage( "Fecha Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgenfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgenfrom_Internalname, localUtil.format(AV101BarFecGenfrom, "99/99/99"), localUtil.format( AV101BarFecGenfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgenfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgenfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgenfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgenfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecgento_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgento_Internalname, httpContext.getMessage( "Fecha Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgento_Internalname, localUtil.format(AV102BarFecGento, "99/99/99"), localUtil.format( AV102BarFecGento, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgento_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgento_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable16_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecfprfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecfprfrom_Internalname, httpContext.getMessage( "Fecha Prev.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecfprfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecfprfrom_Internalname, localUtil.format(AV99BarFecFprfrom, "99/99/99"), localUtil.format( AV99BarFecFprfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecfprfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecfprfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecfprfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecfprfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecfprto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecfprto_Internalname, httpContext.getMessage( "Fecha Prev.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecfprto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecfprto_Internalname, localUtil.format(AV100BarFecFprto, "99/99/99"), localUtil.format( AV100BarFecFprto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecfprto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecfprto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecfprto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecfprto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable17_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecsalfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecsalfrom_Internalname, httpContext.getMessage( "Fecha Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecsalfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsalfrom_Internalname, localUtil.format(AV97BarFecSalfrom, "99/99/99"), localUtil.format( AV97BarFecSalfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecsalfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecsalfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecsalfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecsalfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecsalto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecsalto_Internalname, httpContext.getMessage( "Fecha Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecsalto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsalto_Internalname, localUtil.format(AV98BarFecSalto, "99/99/99"), localUtil.format( AV98BarFecSalto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecsalto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecsalto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecsalto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecsalto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         httpContext.writeTextNL( "</div>") ;
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
         /* User Defined Control */
         ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
         ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
         ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
         ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
         ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
         ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
         ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
         ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
         ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
         ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
         ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomfrom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomfrom_Internalname, GXutil.rtrim( AV93BarColNomfrom), GXutil.rtrim( localUtil.format( AV93BarColNomfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnomfrom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnumfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnumfrom_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV94BarColNumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV94BarColNumfrom), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV94BarColNumfrom), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnumfrom_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomto_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomto_Internalname, GXutil.rtrim( AV95BarColNomto), GXutil.rtrim( localUtil.format( AV95BarColNomto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnomto_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnumto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnumto_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumto_Internalname, GXutil.ltrim( localUtil.ntoc( AV96BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV96BarColNumto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV96BarColNumto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnumto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomclifrom_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomclifrom_Internalname, GXutil.rtrim( AV89BarNomClifrom), GXutil.rtrim( localUtil.format( AV89BarNomClifrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomclifrom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumclifrom_Internalname, httpContext.getMessage( "Numero ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumclifrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV90BarNumClifrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumclifrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV90BarNumClifrom), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV90BarNumClifrom), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumclifrom_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomclito_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomclito_Internalname, GXutil.rtrim( AV91BarNomClito), GXutil.rtrim( localUtil.format( AV91BarNomClito, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,147);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomclito_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumclito_Internalname, httpContext.getMessage( "Numero ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumclito_Internalname, GXutil.ltrim( localUtil.ntoc( AV92BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumclito_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV92BarNumClito), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV92BarNumClito), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumclito_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
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
         /* User Defined Control */
         ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
         ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
         ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
         ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
         ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
         ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
         ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
         ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
         ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
         ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
         ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserfrom_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserfrom_Internalname, GXutil.rtrim( AV87BarSerfrom), GXutil.rtrim( localUtil.format( AV87BarSerfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserfrom_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserto_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserto_Internalname, GXutil.rtrim( AV88BarSerto), GXutil.rtrim( localUtil.format( AV88BarSerto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,168);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserto_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbartipartfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_bartipartfrom_Internalname, httpContext.getMessage( "Tipo Art. Inicial", ""), "", "", lblTextblockcombo_bartipartfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_bartipartfrom.setProperty("Caption", Combo_bartipartfrom_Caption);
         ucCombo_bartipartfrom.setProperty("Cls", Combo_bartipartfrom_Cls);
         ucCombo_bartipartfrom.setProperty("EmptyItemText", Combo_bartipartfrom_Emptyitemtext);
         ucCombo_bartipartfrom.setProperty("DropDownOptionsData", AV113BarTipArtfrom_Data);
         ucCombo_bartipartfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_bartipartfrom_Internalname, "COMBO_BARTIPARTFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbartipartto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_bartipartto_Internalname, httpContext.getMessage( "Tipo Art. Final", ""), "", "", lblTextblockcombo_bartipartto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_bartipartto.setProperty("Caption", Combo_bartipartto_Caption);
         ucCombo_bartipartto.setProperty("Cls", Combo_bartipartto_Cls);
         ucCombo_bartipartto.setProperty("EmptyItemText", Combo_bartipartto_Emptyitemtext);
         ucCombo_bartipartto.setProperty("DropDownOptionsData", AV114BarTipArtto_Data);
         ucCombo_bartipartto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_bartipartto_Internalname, "COMBO_BARTIPARTTOContainer");
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
         /* User Defined Control */
         ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
         ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
         ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
         ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
         ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
         ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
         ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
         ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
         ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
         ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
         ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodfrom_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV79BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV79BarCodfrom), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV79BarCodfrom), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodfrom_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreofrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreofrom_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreofrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV80BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreofrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV80BarCodReofrom), "9") : localUtil.format( DecimalUtil.doubleToDec(AV80BarCodReofrom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,203);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreofrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreofrom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodparfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparfrom_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparfrom_Internalname, GXutil.rtrim( AV81BarCodParfrom), GXutil.rtrim( localUtil.format( AV81BarCodParfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,207);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparfrom_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodto_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV82BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV82BarCodto), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV82BarCodto), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodto_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreoto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreoto_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreoto_Internalname, GXutil.ltrim( localUtil.ntoc( AV83BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreoto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83BarCodReoto), "9") : localUtil.format( DecimalUtil.doubleToDec(AV83BarCodReoto), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreoto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreoto_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodparto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparto_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparto_Internalname, GXutil.rtrim( AV84BarCodParto), GXutil.rtrim( localUtil.format( AV84BarCodParto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparto_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCombo_cod_idtx_cell_Internalname, 1, 0, "px", 0, "px", divCombo_cod_idtx_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcod_idtx_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cod_idtx_Internalname, httpContext.getMessage( "Clear To Wear", ""), "", "", lblTextblockcombo_cod_idtx_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cod_idtx.setProperty("Caption", Combo_cod_idtx_Caption);
         ucCombo_cod_idtx.setProperty("Cls", Combo_cod_idtx_Cls);
         ucCombo_cod_idtx.setProperty("EmptyItemText", Combo_cod_idtx_Emptyitemtext);
         ucCombo_cod_idtx.setProperty("DropDownOptionsData", AV111Cod_Idtx_Data);
         ucCombo_cod_idtx.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cod_idtx_Internalname, "COMBO_COD_IDTXContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBargirar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBargirar_Internalname, httpContext.getMessage( "Coleccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 237,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBargirar_Internalname, GXutil.rtrim( AV77BarGirar), GXutil.rtrim( localUtil.format( AV77BarGirar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,237);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBargirar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBargirar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMuestras_cell_Internalname, 1, 0, "px", 0, "px", divMuestras_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavMuestras.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavMuestras.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavMuestras, cmbavMuestras.getInternalname(), GXutil.rtrim( AV78Muestras), 1, cmbavMuestras.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavMuestras.getVisible(), cmbavMuestras.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "", true, (byte)(0), "HLP_Produccion\\CONPRODUCWW.htm");
         cmbavMuestras.setValue( GXutil.rtrim( AV78Muestras) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Values", cmbavMuestras.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsearch_Internalname, "gx.evt.setGridEvt("+GXutil.str( 274, 3, 0)+","+"null"+");", httpContext.getMessage( "GX_BtnSearch", ""), bttBtnsearch_Jsonclick, 5, httpContext.getMessage( "GX_BtnSearch", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSEARCH\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 274, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CONPRODUCWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_resultado.setProperty("Width", Dvpanel_panel_resultado_Width);
         ucDvpanel_panel_resultado.setProperty("AutoWidth", Dvpanel_panel_resultado_Autowidth);
         ucDvpanel_panel_resultado.setProperty("AutoHeight", Dvpanel_panel_resultado_Autoheight);
         ucDvpanel_panel_resultado.setProperty("Cls", Dvpanel_panel_resultado_Cls);
         ucDvpanel_panel_resultado.setProperty("Title", Dvpanel_panel_resultado_Title);
         ucDvpanel_panel_resultado.setProperty("Collapsible", Dvpanel_panel_resultado_Collapsible);
         ucDvpanel_panel_resultado.setProperty("Collapsed", Dvpanel_panel_resultado_Collapsed);
         ucDvpanel_panel_resultado.setProperty("ShowCollapseIcon", Dvpanel_panel_resultado_Showcollapseicon);
         ucDvpanel_panel_resultado.setProperty("IconPosition", Dvpanel_panel_resultado_Iconposition);
         ucDvpanel_panel_resultado.setProperty("AutoScroll", Dvpanel_panel_resultado_Autoscroll);
         ucDvpanel_panel_resultado.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_resultado_Internalname, "DVPANEL_PANEL_RESULTADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_RESULTADOContainer"+"Panel_Resultado"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_resultado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol274( ) ;
      }
      if ( wbEnd == 274 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_274 = (int)(nGXsfl_274_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV71GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV72GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV140Pgmname), GXutil.rtrim( localUtil.format( AV140Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 313,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV105CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV105CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,313);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV106CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV106CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,314);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 315,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipartfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV85BarTipArtfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV85BarTipArtfrom), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,315);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipartfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartipartfrom_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipartto_Internalname, GXutil.ltrim( localUtil.ntoc( AV86BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV86BarTipArtto), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,316);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipartto_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartipartto_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\CONPRODUCWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 317,'',false,'" + sGXsfl_274_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCod_idtx_Internalname, GXutil.rtrim( AV76Cod_Idtx), GXutil.rtrim( localUtil.format( AV76Cod_Idtx, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,317);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCod_idtx_Jsonclick, 0, "Attribute", "", "", "", "", edtavCod_idtx_Visible, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CONPRODUCWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV69DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_319_26F2( true) ;
      }
      else
      {
         wb_table1_319_26F2( false) ;
      }
      return  ;
   }

   public void wb_table1_319_26F2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_324_26F2( true) ;
      }
      else
      {
         wb_table2_324_26F2( false) ;
      }
      return  ;
   }

   public void wb_table2_324_26F2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_329_26F2( true) ;
      }
      else
      {
         wb_table3_329_26F2( false) ;
      }
      return  ;
   }

   public void wb_table3_329_26F2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_334_26F2( true) ;
      }
      else
      {
         wb_table4_334_26F2( false) ;
      }
      return  ;
   }

   public void wb_table4_334_26F2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_339_26F2( true) ;
      }
      else
      {
         wb_table5_339_26F2( false) ;
      }
      return  ;
   }

   public void wb_table5_339_26F2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_344_26F2( true) ;
      }
      else
      {
         wb_table6_344_26F2( false) ;
      }
      return  ;
   }

   public void wb_table6_344_26F2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_349_26F2( true) ;
      }
      else
      {
         wb_table7_349_26F2( false) ;
      }
      return  ;
   }

   public void wb_table7_349_26F2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0356"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0356"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_274_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0356"+"");
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
      if ( wbEnd == 274 )
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

   public void start26F2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Consulta de Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup26F0( ) ;
   }

   public void ws26F2( )
   {
      start26F2( ) ;
      evt26F2( ) ;
   }

   public void evt26F2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODFROM.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1126F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1226F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_BARTIPARTFROM.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1326F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_BARTIPARTTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1426F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_COD_IDTX.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1526F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1626F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1726F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1826F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SITUACIONFASES_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1926F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "CONSULTAALBARANSALIDA_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2026F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "RECETAS_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2126F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "PARTESPRODUCCION_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2226F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "PIEZAS_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2326F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "AGRUPADAS_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2426F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSEARCH'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSearch' */
                           e2526F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e2626F2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           nGXsfl_274_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_274_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_274_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_2742( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV75GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75GridActionGroup1), 4, 0));
                           A14297CP_ID = localUtil.ctol( httpContext.cgiGet( edtCP_ID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A14328CP_EMPRCOD = httpContext.cgiGet( edtCP_EMPRCOD_Internalname) ;
                           A14326CP_CLICOD = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_CLICOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14327CP_CLINOM = httpContext.cgiGet( edtCP_CLINOM_Internalname) ;
                           A14301CP_BARCOD = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_BARCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14302CP_BARCODR = (byte)(localUtil.ctol( httpContext.cgiGet( edtCP_BARCODR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14303CP_BARCODP = httpContext.cgiGet( edtCP_BARCODP_Internalname) ;
                           A14304CP_BARFECF = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtCP_BARFECF_Internalname), 0)) ;
                           A14305CP_BARNUMC = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_BARNUMC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14306CP_BARPLF = httpContext.cgiGet( edtCP_BARPLF_Internalname) ;
                           A14307CP_BARSIT = (byte)(localUtil.ctol( httpContext.cgiGet( edtCP_BARSIT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14308CP_BARFECG = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtCP_BARFECG_Internalname), 0)) ;
                           A14309CP_BARFECC = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtCP_BARFECC_Internalname), 0)) ;
                           A14310CP_BARFECS = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtCP_BARFECS_Internalname), 0)) ;
                           A14311CP_BARSER = httpContext.cgiGet( edtCP_BARSER_Internalname) ;
                           A14312CP_BARSERD = httpContext.cgiGet( edtCP_BARSERD_Internalname) ;
                           A14331CP_BARCOLO = httpContext.cgiGet( edtCP_BARCOLO_Internalname) ;
                           A14332CP_BARCOLU = (int)(localUtil.ctol( httpContext.cgiGet( edtCP_BARCOLU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14315CP_BARNOMC = httpContext.cgiGet( edtCP_BARNOMC_Internalname) ;
                           A14316CP_BARTIPA = (short)(localUtil.ctol( httpContext.cgiGet( edtCP_BARTIPA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14343CP_TARTDSC = httpContext.cgiGet( edtCP_TARTDSC_Internalname) ;
                           A14317CP_BARGIRA = httpContext.cgiGet( edtCP_BARGIRA_Internalname) ;
                           A14318CP_BARACAA = (short)(localUtil.ctol( httpContext.cgiGet( edtCP_BARACAA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A14319CP_BARAGRE = httpContext.cgiGet( edtCP_BARAGRE_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2726F2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2826F2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2926F2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e3026F2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Bardisnumfrom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUMFROM"), AV107BarDisNumfrom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bardisnumto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUMTO"), AV108BarDisNumto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsitfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV109BarSitfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsitto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV110BarSitto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecclifrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECCLIFROM"), 0), AV103BarFecClifrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecclito Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECCLITO"), 0), AV104BarFecClito) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgenfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGENFROM"), 0), AV101BarFecGenfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgento Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGENTO"), 0), AV102BarFecGento) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecfprfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECFPRFROM"), 0), AV99BarFecFprfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecfprto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECFPRTO"), 0), AV100BarFecFprto) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecsalfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECSALFROM"), 0), AV97BarFecSalfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecsalto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECSALTO"), 0), AV98BarFecSalto) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnomfrom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOMFROM"), AV93BarColNomfrom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnumfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUMFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV94BarColNumfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnomto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOMTO"), AV95BarColNomto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnumto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUMTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV96BarColNumto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnomclifrom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLIFROM"), AV89BarNomClifrom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnumclifrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLIFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV90BarNumClifrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnomclito Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLITO"), AV91BarNomClito) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnumclito Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLITO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV92BarNumClito )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barserfrom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSERFROM"), AV87BarSerfrom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barserto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSERTO"), AV88BarSerto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV79BarCodfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodreofrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREOFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV80BarCodReofrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodparfrom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPARFROM"), AV81BarCodParfrom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV82BarCodto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodreoto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREOTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83BarCodReoto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodparto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPARTO"), AV84BarCodParto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bargirar Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARGIRAR"), AV77BarGirar) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV105CliCodfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV106CliCodto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bartipartfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPARTFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV85BarTipArtfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bartipartto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPARTTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV86BarTipArtto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cod_idtx Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCOD_IDTX"), AV76Cod_Idtx) != 0 )
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
                     if ( nCmpId == 356 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0356") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0356", "", sEvt);
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

   public void we26F2( )
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

   public void pa26F2( )
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
            GX_FocusControl = edtavBardisnumfrom_Internalname ;
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
      subsflControlProps_2742( ) ;
      while ( nGXsfl_274_idx <= nRC_GXsfl_274 )
      {
         sendrow_2742( ) ;
         nGXsfl_274_idx = ((subGrid_Islastpage==1)&&(nGXsfl_274_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_274_idx+1) ;
         sGXsfl_274_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_274_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2742( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV107BarDisNumfrom ,
                                 String AV108BarDisNumto ,
                                 byte AV109BarSitfrom ,
                                 byte AV110BarSitto ,
                                 java.util.Date AV103BarFecClifrom ,
                                 java.util.Date AV104BarFecClito ,
                                 java.util.Date AV101BarFecGenfrom ,
                                 java.util.Date AV102BarFecGento ,
                                 java.util.Date AV99BarFecFprfrom ,
                                 java.util.Date AV100BarFecFprto ,
                                 java.util.Date AV97BarFecSalfrom ,
                                 java.util.Date AV98BarFecSalto ,
                                 String AV93BarColNomfrom ,
                                 int AV94BarColNumfrom ,
                                 String AV95BarColNomto ,
                                 int AV96BarColNumto ,
                                 String AV89BarNomClifrom ,
                                 int AV90BarNumClifrom ,
                                 String AV91BarNomClito ,
                                 int AV92BarNumClito ,
                                 String AV87BarSerfrom ,
                                 String AV88BarSerto ,
                                 int AV79BarCodfrom ,
                                 byte AV80BarCodReofrom ,
                                 String AV81BarCodParfrom ,
                                 int AV82BarCodto ,
                                 byte AV83BarCodReoto ,
                                 String AV84BarCodParto ,
                                 String AV77BarGirar ,
                                 int AV105CliCodfrom ,
                                 int AV106CliCodto ,
                                 short AV85BarTipArtfrom ,
                                 short AV86BarTipArtto ,
                                 String AV76Cod_Idtx ,
                                 String AV125EmprCod ,
                                 boolean AV73LoadGridData ,
                                 String AV140Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV132TFCP_BARCOLO ,
                                 String AV133TFCP_BARCOLO_Sel ,
                                 int AV134TFCP_BARCOLU ,
                                 int AV135TFCP_BARCOLU_To ,
                                 String AV136TFCP_TARTDSC ,
                                 String AV137TFCP_TARTDSC_Sel ,
                                 String A120BarAgrEst ,
                                 String AV129PedidoCliente ,
                                 String AV131CP_PedidoCliente ,
                                 java.math.BigDecimal A14336CP_BARKGM ,
                                 java.math.BigDecimal A14337CP_BARMTR )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2826F2 ();
      GRID_nCurrentRecord = 0 ;
      rf26F2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CONPRODUCWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV140Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\conproducww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14328CP_EMPRCOD, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_EMPRCOD", GXutil.rtrim( A14328CP_EMPRCOD));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14301CP_BARCOD), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARCOD", GXutil.ltrim( localUtil.ntoc( A14301CP_BARCOD, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARCODR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14302CP_BARCODR), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARCODR", GXutil.ltrim( localUtil.ntoc( A14302CP_BARCODR, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARCODP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14303CP_BARCODP, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARCODP", GXutil.rtrim( A14303CP_BARCODP));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14326CP_CLICOD), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_CLICOD", GXutil.ltrim( localUtil.ntoc( A14326CP_CLICOD, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_CLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14327CP_CLINOM, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_CLINOM", A14327CP_CLINOM);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14311CP_BARSER, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARSER", GXutil.rtrim( A14311CP_BARSER));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARSERD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14312CP_BARSERD, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARSERD", A14312CP_BARSERD);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARCOLO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14331CP_BARCOLO, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARCOLO", GXutil.rtrim( A14331CP_BARCOLO));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARCOLU", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14332CP_BARCOLU), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARCOLU", GXutil.ltrim( localUtil.ntoc( A14332CP_BARCOLU, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARFECF", getSecureSignedToken( "", A14304CP_BARFECF));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARFECF", localUtil.format(A14304CP_BARFECF, "99/99/99"));
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
      if ( cmbavMuestras.getItemCount() > 0 )
      {
         AV78Muestras = cmbavMuestras.getValidValue(AV78Muestras) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Muestras", AV78Muestras);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavMuestras.setValue( GXutil.rtrim( AV78Muestras) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Values", cmbavMuestras.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf26F2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV140Pgmname = "Produccion.CONPRODUCWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140Pgmname", AV140Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26F2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(274) ;
      /* Execute user event: Refresh */
      e2826F2 ();
      nGXsfl_274_idx = 1 ;
      sGXsfl_274_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_274_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2742( ) ;
      bGXsfl_274_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_2742( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV133TFCP_BARCOLO_Sel ,
                                              AV132TFCP_BARCOLO ,
                                              Integer.valueOf(AV134TFCP_BARCOLU) ,
                                              Integer.valueOf(AV135TFCP_BARCOLU_To) ,
                                              AV137TFCP_TARTDSC_Sel ,
                                              AV136TFCP_TARTDSC ,
                                              Boolean.valueOf(AV73LoadGridData) ,
                                              AV107BarDisNumfrom ,
                                              AV108BarDisNumto ,
                                              Integer.valueOf(AV105CliCodfrom) ,
                                              Integer.valueOf(AV106CliCodto) ,
                                              Byte.valueOf(AV109BarSitfrom) ,
                                              Byte.valueOf(AV110BarSitto) ,
                                              AV101BarFecGenfrom ,
                                              AV102BarFecGento ,
                                              AV97BarFecSalfrom ,
                                              AV98BarFecSalto ,
                                              AV103BarFecClifrom ,
                                              AV104BarFecClito ,
                                              AV99BarFecFprfrom ,
                                              AV100BarFecFprto ,
                                              AV87BarSerfrom ,
                                              AV88BarSerto ,
                                              AV93BarColNomfrom ,
                                              AV95BarColNomto ,
                                              Integer.valueOf(AV94BarColNumfrom) ,
                                              Integer.valueOf(AV96BarColNumto) ,
                                              AV89BarNomClifrom ,
                                              AV91BarNomClito ,
                                              Integer.valueOf(AV90BarNumClifrom) ,
                                              Integer.valueOf(AV92BarNumClito) ,
                                              Short.valueOf(AV85BarTipArtfrom) ,
                                              Short.valueOf(AV86BarTipArtto) ,
                                              AV128TFBarPlf ,
                                              Integer.valueOf(AV79BarCodfrom) ,
                                              Integer.valueOf(AV82BarCodto) ,
                                              Byte.valueOf(AV80BarCodReofrom) ,
                                              Byte.valueOf(AV83BarCodReoto) ,
                                              AV81BarCodParfrom ,
                                              AV84BarCodParto ,
                                              AV76Cod_Idtx ,
                                              AV77BarGirar ,
                                              A14331CP_BARCOLO ,
                                              Integer.valueOf(A14332CP_BARCOLU) ,
                                              A14343CP_TARTDSC ,
                                              Long.valueOf(A14297CP_ID) ,
                                              A14324CP_BARDISN ,
                                              Integer.valueOf(A14326CP_CLICOD) ,
                                              Byte.valueOf(A14307CP_BARSIT) ,
                                              A14308CP_BARFECG ,
                                              A14310CP_BARFECS ,
                                              A14309CP_BARFECC ,
                                              A14304CP_BARFECF ,
                                              A14311CP_BARSER ,
                                              A14315CP_BARNOMC ,
                                              Integer.valueOf(A14305CP_BARNUMC) ,
                                              Short.valueOf(A14316CP_BARTIPA) ,
                                              A14306CP_BARPLF ,
                                              Integer.valueOf(A14301CP_BARCOD) ,
                                              Byte.valueOf(A14302CP_BARCODR) ,
                                              A14303CP_BARCODP ,
                                              A14323CP_BARPROP ,
                                              A14317CP_BARGIRA ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV125EmprCod ,
                                              A14328CP_EMPRCOD } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV132TFCP_BARCOLO = GXutil.padr( GXutil.rtrim( AV132TFCP_BARCOLO), 13, "%") ;
         lV136TFCP_TARTDSC = GXutil.concat( GXutil.rtrim( AV136TFCP_TARTDSC), "%", "") ;
         /* Using cursor H026F2 */
         pr_default.execute(0, new Object[] {AV125EmprCod, lV132TFCP_BARCOLO, AV133TFCP_BARCOLO_Sel, Integer.valueOf(AV134TFCP_BARCOLU), Integer.valueOf(AV135TFCP_BARCOLU_To), lV136TFCP_TARTDSC, AV137TFCP_TARTDSC_Sel, AV107BarDisNumfrom, AV108BarDisNumto, Integer.valueOf(AV105CliCodfrom), Integer.valueOf(AV106CliCodto), Byte.valueOf(AV109BarSitfrom), Byte.valueOf(AV110BarSitto), AV101BarFecGenfrom, AV102BarFecGento, AV97BarFecSalfrom, AV98BarFecSalto, AV103BarFecClifrom, AV104BarFecClito, AV99BarFecFprfrom, AV100BarFecFprto, AV87BarSerfrom, AV88BarSerto, AV93BarColNomfrom, AV95BarColNomto, Integer.valueOf(AV94BarColNumfrom), Integer.valueOf(AV96BarColNumto), AV89BarNomClifrom, AV91BarNomClito, Integer.valueOf(AV90BarNumClifrom), Integer.valueOf(AV92BarNumClito), Short.valueOf(AV85BarTipArtfrom), Short.valueOf(AV86BarTipArtto), AV128TFBarPlf, Integer.valueOf(AV79BarCodfrom), Integer.valueOf(AV82BarCodto), Byte.valueOf(AV80BarCodReofrom), Byte.valueOf(AV83BarCodReoto), AV81BarCodParfrom, AV84BarCodParto, AV76Cod_Idtx, AV77BarGirar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_274_idx = 1 ;
         sGXsfl_274_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_274_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2742( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14323CP_BARPROP = H026F2_A14323CP_BARPROP[0] ;
            A14324CP_BARDISN = H026F2_A14324CP_BARDISN[0] ;
            A14336CP_BARKGM = H026F2_A14336CP_BARKGM[0] ;
            A14337CP_BARMTR = H026F2_A14337CP_BARMTR[0] ;
            A14319CP_BARAGRE = H026F2_A14319CP_BARAGRE[0] ;
            A14318CP_BARACAA = H026F2_A14318CP_BARACAA[0] ;
            A14317CP_BARGIRA = H026F2_A14317CP_BARGIRA[0] ;
            A14343CP_TARTDSC = H026F2_A14343CP_TARTDSC[0] ;
            A14316CP_BARTIPA = H026F2_A14316CP_BARTIPA[0] ;
            A14315CP_BARNOMC = H026F2_A14315CP_BARNOMC[0] ;
            A14332CP_BARCOLU = H026F2_A14332CP_BARCOLU[0] ;
            A14331CP_BARCOLO = H026F2_A14331CP_BARCOLO[0] ;
            A14312CP_BARSERD = H026F2_A14312CP_BARSERD[0] ;
            A14311CP_BARSER = H026F2_A14311CP_BARSER[0] ;
            A14310CP_BARFECS = H026F2_A14310CP_BARFECS[0] ;
            A14309CP_BARFECC = H026F2_A14309CP_BARFECC[0] ;
            A14308CP_BARFECG = H026F2_A14308CP_BARFECG[0] ;
            A14307CP_BARSIT = H026F2_A14307CP_BARSIT[0] ;
            A14306CP_BARPLF = H026F2_A14306CP_BARPLF[0] ;
            A14305CP_BARNUMC = H026F2_A14305CP_BARNUMC[0] ;
            A14304CP_BARFECF = H026F2_A14304CP_BARFECF[0] ;
            A14303CP_BARCODP = H026F2_A14303CP_BARCODP[0] ;
            A14302CP_BARCODR = H026F2_A14302CP_BARCODR[0] ;
            A14301CP_BARCOD = H026F2_A14301CP_BARCOD[0] ;
            A14327CP_CLINOM = H026F2_A14327CP_CLINOM[0] ;
            A14326CP_CLICOD = H026F2_A14326CP_CLICOD[0] ;
            A14328CP_EMPRCOD = H026F2_A14328CP_EMPRCOD[0] ;
            A14297CP_ID = H026F2_A14297CP_ID[0] ;
            e2926F2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(274) ;
         wb26F0( ) ;
      }
      bGXsfl_274_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes26F2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV125EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_EMPRCOD"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, GXutil.rtrim( localUtil.format( A14328CP_EMPRCOD, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARCOD"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, localUtil.format( DecimalUtil.doubleToDec(A14301CP_BARCOD), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARCODR"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, localUtil.format( DecimalUtil.doubleToDec(A14302CP_BARCODR), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARCODP"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, GXutil.rtrim( localUtil.format( A14303CP_BARCODP, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_CLICOD"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, localUtil.format( DecimalUtil.doubleToDec(A14326CP_CLICOD), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_CLINOM"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, GXutil.rtrim( localUtil.format( A14327CP_CLINOM, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDIDOCLIENTE", GXutil.rtrim( AV129PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV129PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARSER"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, GXutil.rtrim( localUtil.format( A14311CP_BARSER, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARSERD"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, GXutil.rtrim( localUtil.format( A14312CP_BARSERD, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARCOLO"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, GXutil.rtrim( localUtil.format( A14331CP_BARCOLO, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARCOLU"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, localUtil.format( DecimalUtil.doubleToDec(A14332CP_BARCOLU), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCP_PEDIDOCLIENTE", GXutil.rtrim( AV131CP_PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCP_PEDIDOCLIENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV131CP_PedidoCliente, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARFECF"+"_"+sGXsfl_274_idx, getSecureSignedToken( sGXsfl_274_idx, A14304CP_BARFECF));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARKGM", GXutil.ltrim( localUtil.ntoc( A14336CP_BARKGM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARKGM", getSecureSignedToken( "", localUtil.format( A14336CP_BARKGM, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "CP_BARMTR", GXutil.ltrim( localUtil.ntoc( A14337CP_BARMTR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CP_BARMTR", getSecureSignedToken( "", localUtil.format( A14337CP_BARMTR, "ZZZZZ9.99")));
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV133TFCP_BARCOLO_Sel ,
                                           AV132TFCP_BARCOLO ,
                                           Integer.valueOf(AV134TFCP_BARCOLU) ,
                                           Integer.valueOf(AV135TFCP_BARCOLU_To) ,
                                           AV137TFCP_TARTDSC_Sel ,
                                           AV136TFCP_TARTDSC ,
                                           Boolean.valueOf(AV73LoadGridData) ,
                                           AV107BarDisNumfrom ,
                                           AV108BarDisNumto ,
                                           Integer.valueOf(AV105CliCodfrom) ,
                                           Integer.valueOf(AV106CliCodto) ,
                                           Byte.valueOf(AV109BarSitfrom) ,
                                           Byte.valueOf(AV110BarSitto) ,
                                           AV101BarFecGenfrom ,
                                           AV102BarFecGento ,
                                           AV97BarFecSalfrom ,
                                           AV98BarFecSalto ,
                                           AV103BarFecClifrom ,
                                           AV104BarFecClito ,
                                           AV99BarFecFprfrom ,
                                           AV100BarFecFprto ,
                                           AV87BarSerfrom ,
                                           AV88BarSerto ,
                                           AV93BarColNomfrom ,
                                           AV95BarColNomto ,
                                           Integer.valueOf(AV94BarColNumfrom) ,
                                           Integer.valueOf(AV96BarColNumto) ,
                                           AV89BarNomClifrom ,
                                           AV91BarNomClito ,
                                           Integer.valueOf(AV90BarNumClifrom) ,
                                           Integer.valueOf(AV92BarNumClito) ,
                                           Short.valueOf(AV85BarTipArtfrom) ,
                                           Short.valueOf(AV86BarTipArtto) ,
                                           AV128TFBarPlf ,
                                           Integer.valueOf(AV79BarCodfrom) ,
                                           Integer.valueOf(AV82BarCodto) ,
                                           Byte.valueOf(AV80BarCodReofrom) ,
                                           Byte.valueOf(AV83BarCodReoto) ,
                                           AV81BarCodParfrom ,
                                           AV84BarCodParto ,
                                           AV76Cod_Idtx ,
                                           AV77BarGirar ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14343CP_TARTDSC ,
                                           Long.valueOf(A14297CP_ID) ,
                                           A14324CP_BARDISN ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           A14311CP_BARSER ,
                                           A14315CP_BARNOMC ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14306CP_BARPLF ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14323CP_BARPROP ,
                                           A14317CP_BARGIRA ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV125EmprCod ,
                                           A14328CP_EMPRCOD } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV132TFCP_BARCOLO = GXutil.padr( GXutil.rtrim( AV132TFCP_BARCOLO), 13, "%") ;
      lV136TFCP_TARTDSC = GXutil.concat( GXutil.rtrim( AV136TFCP_TARTDSC), "%", "") ;
      /* Using cursor H026F3 */
      pr_default.execute(1, new Object[] {AV125EmprCod, lV132TFCP_BARCOLO, AV133TFCP_BARCOLO_Sel, Integer.valueOf(AV134TFCP_BARCOLU), Integer.valueOf(AV135TFCP_BARCOLU_To), lV136TFCP_TARTDSC, AV137TFCP_TARTDSC_Sel, AV107BarDisNumfrom, AV108BarDisNumto, Integer.valueOf(AV105CliCodfrom), Integer.valueOf(AV106CliCodto), Byte.valueOf(AV109BarSitfrom), Byte.valueOf(AV110BarSitto), AV101BarFecGenfrom, AV102BarFecGento, AV97BarFecSalfrom, AV98BarFecSalto, AV103BarFecClifrom, AV104BarFecClito, AV99BarFecFprfrom, AV100BarFecFprto, AV87BarSerfrom, AV88BarSerto, AV93BarColNomfrom, AV95BarColNomto, Integer.valueOf(AV94BarColNumfrom), Integer.valueOf(AV96BarColNumto), AV89BarNomClifrom, AV91BarNomClito, Integer.valueOf(AV90BarNumClifrom), Integer.valueOf(AV92BarNumClito), Short.valueOf(AV85BarTipArtfrom), Short.valueOf(AV86BarTipArtto), AV128TFBarPlf, Integer.valueOf(AV79BarCodfrom), Integer.valueOf(AV82BarCodto), Byte.valueOf(AV80BarCodReofrom), Byte.valueOf(AV83BarCodReoto), AV81BarCodParfrom, AV84BarCodParto, AV76Cod_Idtx, AV77BarGirar});
      GRID_nRecordCount = H026F3_AGRID_nRecordCount[0] ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV107BarDisNumfrom, AV108BarDisNumto, AV109BarSitfrom, AV110BarSitto, AV103BarFecClifrom, AV104BarFecClito, AV101BarFecGenfrom, AV102BarFecGento, AV99BarFecFprfrom, AV100BarFecFprto, AV97BarFecSalfrom, AV98BarFecSalto, AV93BarColNomfrom, AV94BarColNumfrom, AV95BarColNomto, AV96BarColNumto, AV89BarNomClifrom, AV90BarNumClifrom, AV91BarNomClito, AV92BarNumClito, AV87BarSerfrom, AV88BarSerto, AV79BarCodfrom, AV80BarCodReofrom, AV81BarCodParfrom, AV82BarCodto, AV83BarCodReoto, AV84BarCodParto, AV77BarGirar, AV105CliCodfrom, AV106CliCodto, AV85BarTipArtfrom, AV86BarTipArtto, AV76Cod_Idtx, AV125EmprCod, AV73LoadGridData, AV140Pgmname, AV12OrderedBy, AV13OrderedDsc, AV132TFCP_BARCOLO, AV133TFCP_BARCOLO_Sel, AV134TFCP_BARCOLU, AV135TFCP_BARCOLU_To, AV136TFCP_TARTDSC, AV137TFCP_TARTDSC_Sel, A120BarAgrEst, AV129PedidoCliente, AV131CP_PedidoCliente, A14336CP_BARKGM, A14337CP_BARMTR) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV107BarDisNumfrom, AV108BarDisNumto, AV109BarSitfrom, AV110BarSitto, AV103BarFecClifrom, AV104BarFecClito, AV101BarFecGenfrom, AV102BarFecGento, AV99BarFecFprfrom, AV100BarFecFprto, AV97BarFecSalfrom, AV98BarFecSalto, AV93BarColNomfrom, AV94BarColNumfrom, AV95BarColNomto, AV96BarColNumto, AV89BarNomClifrom, AV90BarNumClifrom, AV91BarNomClito, AV92BarNumClito, AV87BarSerfrom, AV88BarSerto, AV79BarCodfrom, AV80BarCodReofrom, AV81BarCodParfrom, AV82BarCodto, AV83BarCodReoto, AV84BarCodParto, AV77BarGirar, AV105CliCodfrom, AV106CliCodto, AV85BarTipArtfrom, AV86BarTipArtto, AV76Cod_Idtx, AV125EmprCod, AV73LoadGridData, AV140Pgmname, AV12OrderedBy, AV13OrderedDsc, AV132TFCP_BARCOLO, AV133TFCP_BARCOLO_Sel, AV134TFCP_BARCOLU, AV135TFCP_BARCOLU_To, AV136TFCP_TARTDSC, AV137TFCP_TARTDSC_Sel, A120BarAgrEst, AV129PedidoCliente, AV131CP_PedidoCliente, A14336CP_BARKGM, A14337CP_BARMTR) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV107BarDisNumfrom, AV108BarDisNumto, AV109BarSitfrom, AV110BarSitto, AV103BarFecClifrom, AV104BarFecClito, AV101BarFecGenfrom, AV102BarFecGento, AV99BarFecFprfrom, AV100BarFecFprto, AV97BarFecSalfrom, AV98BarFecSalto, AV93BarColNomfrom, AV94BarColNumfrom, AV95BarColNomto, AV96BarColNumto, AV89BarNomClifrom, AV90BarNumClifrom, AV91BarNomClito, AV92BarNumClito, AV87BarSerfrom, AV88BarSerto, AV79BarCodfrom, AV80BarCodReofrom, AV81BarCodParfrom, AV82BarCodto, AV83BarCodReoto, AV84BarCodParto, AV77BarGirar, AV105CliCodfrom, AV106CliCodto, AV85BarTipArtfrom, AV86BarTipArtto, AV76Cod_Idtx, AV125EmprCod, AV73LoadGridData, AV140Pgmname, AV12OrderedBy, AV13OrderedDsc, AV132TFCP_BARCOLO, AV133TFCP_BARCOLO_Sel, AV134TFCP_BARCOLU, AV135TFCP_BARCOLU_To, AV136TFCP_TARTDSC, AV137TFCP_TARTDSC_Sel, A120BarAgrEst, AV129PedidoCliente, AV131CP_PedidoCliente, A14336CP_BARKGM, A14337CP_BARMTR) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV107BarDisNumfrom, AV108BarDisNumto, AV109BarSitfrom, AV110BarSitto, AV103BarFecClifrom, AV104BarFecClito, AV101BarFecGenfrom, AV102BarFecGento, AV99BarFecFprfrom, AV100BarFecFprto, AV97BarFecSalfrom, AV98BarFecSalto, AV93BarColNomfrom, AV94BarColNumfrom, AV95BarColNomto, AV96BarColNumto, AV89BarNomClifrom, AV90BarNumClifrom, AV91BarNomClito, AV92BarNumClito, AV87BarSerfrom, AV88BarSerto, AV79BarCodfrom, AV80BarCodReofrom, AV81BarCodParfrom, AV82BarCodto, AV83BarCodReoto, AV84BarCodParto, AV77BarGirar, AV105CliCodfrom, AV106CliCodto, AV85BarTipArtfrom, AV86BarTipArtto, AV76Cod_Idtx, AV125EmprCod, AV73LoadGridData, AV140Pgmname, AV12OrderedBy, AV13OrderedDsc, AV132TFCP_BARCOLO, AV133TFCP_BARCOLO_Sel, AV134TFCP_BARCOLU, AV135TFCP_BARCOLU_To, AV136TFCP_TARTDSC, AV137TFCP_TARTDSC_Sel, A120BarAgrEst, AV129PedidoCliente, AV131CP_PedidoCliente, A14336CP_BARKGM, A14337CP_BARMTR) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV107BarDisNumfrom, AV108BarDisNumto, AV109BarSitfrom, AV110BarSitto, AV103BarFecClifrom, AV104BarFecClito, AV101BarFecGenfrom, AV102BarFecGento, AV99BarFecFprfrom, AV100BarFecFprto, AV97BarFecSalfrom, AV98BarFecSalto, AV93BarColNomfrom, AV94BarColNumfrom, AV95BarColNomto, AV96BarColNumto, AV89BarNomClifrom, AV90BarNumClifrom, AV91BarNomClito, AV92BarNumClito, AV87BarSerfrom, AV88BarSerto, AV79BarCodfrom, AV80BarCodReofrom, AV81BarCodParfrom, AV82BarCodto, AV83BarCodReoto, AV84BarCodParto, AV77BarGirar, AV105CliCodfrom, AV106CliCodto, AV85BarTipArtfrom, AV86BarTipArtto, AV76Cod_Idtx, AV125EmprCod, AV73LoadGridData, AV140Pgmname, AV12OrderedBy, AV13OrderedDsc, AV132TFCP_BARCOLO, AV133TFCP_BARCOLO_Sel, AV134TFCP_BARCOLU, AV135TFCP_BARCOLU_To, AV136TFCP_TARTDSC, AV137TFCP_TARTDSC_Sel, A120BarAgrEst, AV129PedidoCliente, AV131CP_PedidoCliente, A14336CP_BARKGM, A14337CP_BARMTR) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV140Pgmname = "Produccion.CONPRODUCWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140Pgmname", AV140Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26F0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2726F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV115CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV116CliCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARTIPARTFROM_DATA"), AV113BarTipArtfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARTIPARTTO_DATA"), AV114BarTipArtto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOD_IDTX_DATA"), AV111Cod_Idtx_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV69DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_274 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_274"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV71GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV72GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV131CP_PedidoCliente = httpContext.cgiGet( "vCP_PEDIDOCLIENTE") ;
         AV129PedidoCliente = httpContext.cgiGet( "vPEDIDOCLIENTE") ;
         A14337CP_BARMTR = localUtil.ctond( httpContext.cgiGet( "CP_BARMTR")) ;
         A14336CP_BARKGM = localUtil.ctond( httpContext.cgiGet( "CP_BARKGM")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
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
         Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
         Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
         Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
         Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
         Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
         Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
         Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
         Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
         Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
         Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
         Combo_bartipartfrom_Cls = httpContext.cgiGet( "COMBO_BARTIPARTFROM_Cls") ;
         Combo_bartipartfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_BARTIPARTFROM_Selectedvalue_set") ;
         Combo_bartipartfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_BARTIPARTFROM_Emptyitemtext") ;
         Combo_bartipartto_Cls = httpContext.cgiGet( "COMBO_BARTIPARTTO_Cls") ;
         Combo_bartipartto_Selectedvalue_set = httpContext.cgiGet( "COMBO_BARTIPARTTO_Selectedvalue_set") ;
         Combo_bartipartto_Emptyitemtext = httpContext.cgiGet( "COMBO_BARTIPARTTO_Emptyitemtext") ;
         Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
         Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
         Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
         Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
         Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
         Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
         Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
         Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
         Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
         Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
         Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
         Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
         Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
         Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
         Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
         Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
         Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
         Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
         Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
         Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
         Combo_cod_idtx_Cls = httpContext.cgiGet( "COMBO_COD_IDTX_Cls") ;
         Combo_cod_idtx_Selectedvalue_set = httpContext.cgiGet( "COMBO_COD_IDTX_Selectedvalue_set") ;
         Combo_cod_idtx_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_IDTX_Visible")) ;
         Combo_cod_idtx_Emptyitemtext = httpContext.cgiGet( "COMBO_COD_IDTX_Emptyitemtext") ;
         Dvpanel_panel_filtrosgenerales_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Width") ;
         Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autowidth")) ;
         Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoheight")) ;
         Dvpanel_panel_filtrosgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Cls") ;
         Dvpanel_panel_filtrosgenerales_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Title") ;
         Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsible")) ;
         Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsed")) ;
         Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon")) ;
         Dvpanel_panel_filtrosgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Iconposition") ;
         Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll")) ;
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
         Dvpanel_panel_resultado_Width = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Width") ;
         Dvpanel_panel_resultado_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autowidth")) ;
         Dvpanel_panel_resultado_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoheight")) ;
         Dvpanel_panel_resultado_Cls = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Cls") ;
         Dvpanel_panel_resultado_Title = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Title") ;
         Dvpanel_panel_resultado_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsible")) ;
         Dvpanel_panel_resultado_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsed")) ;
         Dvpanel_panel_resultado_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Showcollapseicon")) ;
         Dvpanel_panel_resultado_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Iconposition") ;
         Dvpanel_panel_resultado_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoscroll")) ;
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
         Situacionfases_modal_Width = httpContext.cgiGet( "SITUACIONFASES_MODAL_Width") ;
         Situacionfases_modal_Title = httpContext.cgiGet( "SITUACIONFASES_MODAL_Title") ;
         Situacionfases_modal_Confirmtype = httpContext.cgiGet( "SITUACIONFASES_MODAL_Confirmtype") ;
         Situacionfases_modal_Bodytype = httpContext.cgiGet( "SITUACIONFASES_MODAL_Bodytype") ;
         Consultaalbaransalida_modal_Width = httpContext.cgiGet( "CONSULTAALBARANSALIDA_MODAL_Width") ;
         Consultaalbaransalida_modal_Title = httpContext.cgiGet( "CONSULTAALBARANSALIDA_MODAL_Title") ;
         Consultaalbaransalida_modal_Confirmtype = httpContext.cgiGet( "CONSULTAALBARANSALIDA_MODAL_Confirmtype") ;
         Consultaalbaransalida_modal_Bodytype = httpContext.cgiGet( "CONSULTAALBARANSALIDA_MODAL_Bodytype") ;
         Recetas_modal_Width = httpContext.cgiGet( "RECETAS_MODAL_Width") ;
         Recetas_modal_Title = httpContext.cgiGet( "RECETAS_MODAL_Title") ;
         Recetas_modal_Confirmtype = httpContext.cgiGet( "RECETAS_MODAL_Confirmtype") ;
         Recetas_modal_Bodytype = httpContext.cgiGet( "RECETAS_MODAL_Bodytype") ;
         Partesproduccion_modal_Width = httpContext.cgiGet( "PARTESPRODUCCION_MODAL_Width") ;
         Partesproduccion_modal_Title = httpContext.cgiGet( "PARTESPRODUCCION_MODAL_Title") ;
         Partesproduccion_modal_Confirmtype = httpContext.cgiGet( "PARTESPRODUCCION_MODAL_Confirmtype") ;
         Partesproduccion_modal_Bodytype = httpContext.cgiGet( "PARTESPRODUCCION_MODAL_Bodytype") ;
         Packinglist_modal_Width = httpContext.cgiGet( "PACKINGLIST_MODAL_Width") ;
         Packinglist_modal_Title = httpContext.cgiGet( "PACKINGLIST_MODAL_Title") ;
         Packinglist_modal_Confirmtype = httpContext.cgiGet( "PACKINGLIST_MODAL_Confirmtype") ;
         Packinglist_modal_Bodytype = httpContext.cgiGet( "PACKINGLIST_MODAL_Bodytype") ;
         Piezas_modal_Width = httpContext.cgiGet( "PIEZAS_MODAL_Width") ;
         Piezas_modal_Title = httpContext.cgiGet( "PIEZAS_MODAL_Title") ;
         Piezas_modal_Confirmtype = httpContext.cgiGet( "PIEZAS_MODAL_Confirmtype") ;
         Piezas_modal_Bodytype = httpContext.cgiGet( "PIEZAS_MODAL_Bodytype") ;
         Agrupadas_modal_Width = httpContext.cgiGet( "AGRUPADAS_MODAL_Width") ;
         Agrupadas_modal_Title = httpContext.cgiGet( "AGRUPADAS_MODAL_Title") ;
         Agrupadas_modal_Confirmtype = httpContext.cgiGet( "AGRUPADAS_MODAL_Confirmtype") ;
         Agrupadas_modal_Bodytype = httpContext.cgiGet( "AGRUPADAS_MODAL_Bodytype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Combo_cod_idtx_Selectedvalue_get = httpContext.cgiGet( "COMBO_COD_IDTX_Selectedvalue_get") ;
         Combo_bartipartto_Selectedvalue_get = httpContext.cgiGet( "COMBO_BARTIPARTTO_Selectedvalue_get") ;
         Combo_bartipartfrom_Selectedvalue_get = httpContext.cgiGet( "COMBO_BARTIPARTFROM_Selectedvalue_get") ;
         Combo_clicodto_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_get") ;
         Combo_clicodfrom_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_get") ;
         /* Read variables values. */
         AV107BarDisNumfrom = httpContext.cgiGet( edtavBardisnumfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107BarDisNumfrom", AV107BarDisNumfrom);
         AV108BarDisNumto = httpContext.cgiGet( edtavBardisnumto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108BarDisNumto", AV108BarDisNumto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITFROM");
            GX_FocusControl = edtavBarsitfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV109BarSitfrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109BarSitfrom), 2, 0));
         }
         else
         {
            AV109BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109BarSitfrom), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITTO");
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV110BarSitto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110BarSitto), 2, 0));
         }
         else
         {
            AV110BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110BarSitto), 2, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecclifrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLIFROM");
            GX_FocusControl = edtavBarfecclifrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV103BarFecClifrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103BarFecClifrom", localUtil.format(AV103BarFecClifrom, "99/99/99"));
         }
         else
         {
            AV103BarFecClifrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecclifrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103BarFecClifrom", localUtil.format(AV103BarFecClifrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecclito_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLITO");
            GX_FocusControl = edtavBarfecclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV104BarFecClito = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecClito", localUtil.format(AV104BarFecClito, "99/99/99"));
         }
         else
         {
            AV104BarFecClito = localUtil.ctod( httpContext.cgiGet( edtavBarfecclito_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104BarFecClito", localUtil.format(AV104BarFecClito, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgenfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGENFROM");
            GX_FocusControl = edtavBarfecgenfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV101BarFecGenfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101BarFecGenfrom", localUtil.format(AV101BarFecGenfrom, "99/99/99"));
         }
         else
         {
            AV101BarFecGenfrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecgenfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101BarFecGenfrom", localUtil.format(AV101BarFecGenfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgento_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGENTO");
            GX_FocusControl = edtavBarfecgento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV102BarFecGento = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102BarFecGento", localUtil.format(AV102BarFecGento, "99/99/99"));
         }
         else
         {
            AV102BarFecGento = localUtil.ctod( httpContext.cgiGet( edtavBarfecgento_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102BarFecGento", localUtil.format(AV102BarFecGento, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecfprfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECFPRFROM");
            GX_FocusControl = edtavBarfecfprfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV99BarFecFprfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99BarFecFprfrom", localUtil.format(AV99BarFecFprfrom, "99/99/99"));
         }
         else
         {
            AV99BarFecFprfrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecfprfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99BarFecFprfrom", localUtil.format(AV99BarFecFprfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecfprto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECFPRTO");
            GX_FocusControl = edtavBarfecfprto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV100BarFecFprto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100BarFecFprto", localUtil.format(AV100BarFecFprto, "99/99/99"));
         }
         else
         {
            AV100BarFecFprto = localUtil.ctod( httpContext.cgiGet( edtavBarfecfprto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100BarFecFprto", localUtil.format(AV100BarFecFprto, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsalfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSALFROM");
            GX_FocusControl = edtavBarfecsalfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV97BarFecSalfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97BarFecSalfrom", localUtil.format(AV97BarFecSalfrom, "99/99/99"));
         }
         else
         {
            AV97BarFecSalfrom = localUtil.ctod( httpContext.cgiGet( edtavBarfecsalfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97BarFecSalfrom", localUtil.format(AV97BarFecSalfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsalto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSALTO");
            GX_FocusControl = edtavBarfecsalto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV98BarFecSalto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarFecSalto", localUtil.format(AV98BarFecSalto, "99/99/99"));
         }
         else
         {
            AV98BarFecSalto = localUtil.ctod( httpContext.cgiGet( edtavBarfecsalto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarFecSalto", localUtil.format(AV98BarFecSalto, "99/99/99"));
         }
         AV93BarColNomfrom = httpContext.cgiGet( edtavBarcolnomfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93BarColNomfrom", AV93BarColNomfrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMFROM");
            GX_FocusControl = edtavBarcolnumfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV94BarColNumfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94BarColNumfrom), 6, 0));
         }
         else
         {
            AV94BarColNumfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94BarColNumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94BarColNumfrom), 6, 0));
         }
         AV95BarColNomto = httpContext.cgiGet( edtavBarcolnomto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95BarColNomto", AV95BarColNomto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMTO");
            GX_FocusControl = edtavBarcolnumto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV96BarColNumto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96BarColNumto), 6, 0));
         }
         else
         {
            AV96BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96BarColNumto), 6, 0));
         }
         AV89BarNomClifrom = httpContext.cgiGet( edtavBarnomclifrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89BarNomClifrom", AV89BarNomClifrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclifrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclifrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLIFROM");
            GX_FocusControl = edtavBarnumclifrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90BarNumClifrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90BarNumClifrom), 6, 0));
         }
         else
         {
            AV90BarNumClifrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumclifrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90BarNumClifrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90BarNumClifrom), 6, 0));
         }
         AV91BarNomClito = httpContext.cgiGet( edtavBarnomclito_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91BarNomClito", AV91BarNomClito);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLITO");
            GX_FocusControl = edtavBarnumclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV92BarNumClito = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92BarNumClito), 6, 0));
         }
         else
         {
            AV92BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92BarNumClito), 6, 0));
         }
         AV87BarSerfrom = httpContext.cgiGet( edtavBarserfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87BarSerfrom", AV87BarSerfrom);
         AV88BarSerto = httpContext.cgiGet( edtavBarserto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88BarSerto", AV88BarSerto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODFROM");
            GX_FocusControl = edtavBarcodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV79BarCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79BarCodfrom), 8, 0));
         }
         else
         {
            AV79BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79BarCodfrom), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreofrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreofrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOFROM");
            GX_FocusControl = edtavBarcodreofrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV80BarCodReofrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80BarCodReofrom", GXutil.str( AV80BarCodReofrom, 1, 0));
         }
         else
         {
            AV80BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreofrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80BarCodReofrom", GXutil.str( AV80BarCodReofrom, 1, 0));
         }
         AV81BarCodParfrom = httpContext.cgiGet( edtavBarcodparfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81BarCodParfrom", AV81BarCodParfrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODTO");
            GX_FocusControl = edtavBarcodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV82BarCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarCodto), 8, 0));
         }
         else
         {
            AV82BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarCodto), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOTO");
            GX_FocusControl = edtavBarcodreoto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83BarCodReoto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83BarCodReoto", GXutil.str( AV83BarCodReoto, 1, 0));
         }
         else
         {
            AV83BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83BarCodReoto", GXutil.str( AV83BarCodReoto, 1, 0));
         }
         AV84BarCodParto = httpContext.cgiGet( edtavBarcodparto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84BarCodParto", AV84BarCodParto);
         AV77BarGirar = httpContext.cgiGet( edtavBargirar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77BarGirar", AV77BarGirar);
         cmbavMuestras.setName( cmbavMuestras.getInternalname() );
         cmbavMuestras.setValue( httpContext.cgiGet( cmbavMuestras.getInternalname()) );
         AV78Muestras = httpContext.cgiGet( cmbavMuestras.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Muestras", AV78Muestras);
         AV140Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV140Pgmname", AV140Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV105CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105CliCodfrom), 6, 0));
         }
         else
         {
            AV105CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV106CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106CliCodto), 6, 0));
         }
         else
         {
            AV106CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106CliCodto), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPARTFROM");
            GX_FocusControl = edtavBartipartfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV85BarTipArtfrom = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85BarTipArtfrom), 4, 0));
         }
         else
         {
            AV85BarTipArtfrom = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipartfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85BarTipArtfrom), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPARTTO");
            GX_FocusControl = edtavBartipartto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV86BarTipArtto = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86BarTipArtto), 4, 0));
         }
         else
         {
            AV86BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86BarTipArtto), 4, 0));
         }
         AV76Cod_Idtx = httpContext.cgiGet( edtavCod_idtx_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76Cod_Idtx", AV76Cod_Idtx);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"CONPRODUCWW");
         AV140Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV140Pgmname", AV140Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV140Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\conproducww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUMFROM"), AV107BarDisNumfrom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUMTO"), AV108BarDisNumto) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV109BarSitfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV110BarSitto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECCLIFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV103BarFecClifrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECCLITO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV104BarFecClito)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGENFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV101BarFecGenfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGENTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV102BarFecGento)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECFPRFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV99BarFecFprfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECFPRTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV100BarFecFprto)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECSALFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV97BarFecSalfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECSALTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV98BarFecSalto)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOMFROM"), AV93BarColNomfrom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUMFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV94BarColNumfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOMTO"), AV95BarColNomto) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUMTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV96BarColNumto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLIFROM"), AV89BarNomClifrom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLIFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV90BarNumClifrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLITO"), AV91BarNomClito) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLITO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV92BarNumClito )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSERFROM"), AV87BarSerfrom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSERTO"), AV88BarSerto) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV79BarCodfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREOFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV80BarCodReofrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPARFROM"), AV81BarCodParfrom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV82BarCodto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREOTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83BarCodReoto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPARTO"), AV84BarCodParto) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARGIRAR"), AV77BarGirar) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV105CliCodfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV106CliCodto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPARTFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV85BarTipArtfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPARTTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV86BarTipArtto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCOD_IDTX"), AV76Cod_Idtx) != 0 )
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
      e2726F2 ();
      if (returnInSub) return;
   }

   public void e2726F2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV124Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      conproducww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV124Station = GXt_char1 ;
      GXv_char2[0] = AV125EmprCod ;
      GXv_char3[0] = AV126EmprNom ;
      GXv_char4[0] = AV127UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV124Station, GXv_char2, GXv_char3, GXv_char4) ;
      conproducww_impl.this.AV125EmprCod = GXv_char2[0] ;
      conproducww_impl.this.AV126EmprNom = GXv_char3[0] ;
      conproducww_impl.this.AV127UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125EmprCod", AV125EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125EmprCod, "@!"))));
      edtavCod_idtx_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCod_idtx_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCod_idtx_Visible), 5, 0), true);
      edtavBartipartto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipartto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipartto_Visible), 5, 0), true);
      edtavBartipartfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipartfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipartfrom_Visible), 5, 0), true);
      edtavClicodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Visible), 5, 0), true);
      edtavClicodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodfrom_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICODFROM' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICODTO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOBARTIPARTFROM' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOBARTIPARTTO' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCOD_IDTX' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S162 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Consulta de Produccion", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S192 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV69DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV69DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2826F2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S202 ();
      if (returnInSub) return;
      Gridpaginationbar_Emptygridcaption = (AV73LoadGridData ? httpContext.getMessage( "WWP_PagingEmptyGridCaption", "") : httpContext.getMessage( "WWP_PressSearchToShowData", "")) ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
      AV71GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71GridCurrentPage), 10, 0));
      AV72GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   public void e2526F2( )
   {
      /* 'DoSearch' Routine */
      returnInSub = false ;
      AV73LoadGridData = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73LoadGridData", AV73LoadGridData);
      httpContext.doAjaxRefresh();
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      /*  Sending Event outputs  */
   }

   public void e1626F2( )
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
         AV70PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV70PageToGo) ;
      }
   }

   public void e1726F2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1826F2( )
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
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CP_BARCOLO") == 0 )
         {
            AV132TFCP_BARCOLO = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV132TFCP_BARCOLO", AV132TFCP_BARCOLO);
            AV133TFCP_BARCOLO_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV133TFCP_BARCOLO_Sel", AV133TFCP_BARCOLO_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CP_BARCOLU") == 0 )
         {
            AV134TFCP_BARCOLU = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV134TFCP_BARCOLU", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134TFCP_BARCOLU), 6, 0));
            AV135TFCP_BARCOLU_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV135TFCP_BARCOLU_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV135TFCP_BARCOLU_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CP_TARTDSC") == 0 )
         {
            AV136TFCP_TARTDSC = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV136TFCP_TARTDSC", AV136TFCP_TARTDSC);
            AV137TFCP_TARTDSC_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137TFCP_TARTDSC_Sel", AV137TFCP_TARTDSC_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2926F2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Situacion Fases", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Consulta Albaran Salida", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Recetas", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Partes Produccion", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Packing List", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactiongroup1.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Consulta Almacen Tejido", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      GXt_int8 = (byte)(0) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV125EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      conproducww_impl.this.GXt_int8 = GXv_int9[0] ;
      AV130TempBoolean = (boolean)((GXt_int8==1)) ;
      if ( AV130TempBoolean )
      {
         cmbavGridactiongroup1.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Alterar Data Ent.", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactiongroup1.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Impresion HDR", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      if ( GXutil.strcmp(A120BarAgrEst, "S") == 0 )
      {
         cmbavGridactiongroup1.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Agrupadas", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(274) ;
      }
      sendrow_2742( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_274_Refreshing )
      {
         httpContext.doAjaxLoad(274, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0)) );
   }

   public void e3026F2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV75GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO SITUACIONFASES' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV75GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO CONSULTAALBARANSALIDA' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV75GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO RECETAS' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV75GridActionGroup1 == 4 )
      {
         /* Execute user subroutine: 'DO PARTESPRODUCCION' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV75GridActionGroup1 == 5 )
      {
         /* Execute user subroutine: 'DO PACKINGLIST' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV75GridActionGroup1 == 6 )
      {
         /* Execute user subroutine: 'DO PIEZAS' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV75GridActionGroup1 == 7 )
      {
         /* Execute user subroutine: 'DO MODIFICARFECHAE' */
         S272 ();
         if (returnInSub) return;
      }
      else if ( AV75GridActionGroup1 == 8 )
      {
         /* Execute user subroutine: 'DO IMPRESIONHDR' */
         S282 ();
         if (returnInSub) return;
      }
      else if ( AV75GridActionGroup1 == 9 )
      {
         /* Execute user subroutine: 'DO AGRUPADAS' */
         S292 ();
         if (returnInSub) return;
      }
      AV75GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e1926F2( )
   {
      /* Situacionfases_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2026F2( )
   {
      /* Consultaalbaransalida_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2126F2( )
   {
      /* Recetas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2226F2( )
   {
      /* Partesproduccion_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2326F2( )
   {
      /* Piezas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2426F2( )
   {
      /* Agrupadas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2626F2( )
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

   public void e1526F2( )
   {
      /* Combo_cod_idtx_Onoptionclicked Routine */
      returnInSub = false ;
      AV76Cod_Idtx = Combo_cod_idtx_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76Cod_Idtx", AV76Cod_Idtx);
      /*  Sending Event outputs  */
   }

   public void e1426F2( )
   {
      /* Combo_bartipartto_Onoptionclicked Routine */
      returnInSub = false ;
      AV86BarTipArtto = (short)(GXutil.lval( Combo_bartipartto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86BarTipArtto), 4, 0));
      /*  Sending Event outputs  */
   }

   public void e1326F2( )
   {
      /* Combo_bartipartfrom_Onoptionclicked Routine */
      returnInSub = false ;
      AV85BarTipArtfrom = (short)(GXutil.lval( Combo_bartipartfrom_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85BarTipArtfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85BarTipArtfrom), 4, 0));
      /*  Sending Event outputs  */
   }

   public void e1226F2( )
   {
      /* Combo_clicodto_Onoptionclicked Routine */
      returnInSub = false ;
      AV106CliCodto = (int)(GXutil.lval( Combo_clicodto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106CliCodto), 6, 0));
      /*  Sending Event outputs  */
   }

   public void e1126F2( )
   {
      /* Combo_clicodfrom_Onoptionclicked Routine */
      returnInSub = false ;
      AV105CliCodfrom = (int)(GXutil.lval( Combo_clicodfrom_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105CliCodfrom), 6, 0));
      /*  Sending Event outputs  */
   }

   public void S192( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S212( )
   {
      /* 'DO SITUACIONFASES' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "SITUACIONFASES_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S222( )
   {
      /* 'DO CONSULTAALBARANSALIDA' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "CONSULTAALBARANSALIDA_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S232( )
   {
      /* 'DO RECETAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "RECETAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S242( )
   {
      /* 'DO PARTESPRODUCCION' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "PARTESPRODUCCION_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S252( )
   {
      /* 'DO PACKINGLIST' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_packinglist", new String[] {GXutil.URLEncode(GXutil.rtrim(A14328CP_EMPRCOD)),GXutil.URLEncode(GXutil.ltrimstr(A14301CP_BARCOD,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A14302CP_BARCODR,1,0)),GXutil.URLEncode(GXutil.rtrim(A14303CP_BARCODP)),GXutil.URLEncode(GXutil.ltrimstr(A14326CP_CLICOD,6,0)),GXutil.URLEncode(GXutil.rtrim(A14327CP_CLINOM)),GXutil.URLEncode(GXutil.rtrim(AV129PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(A14311CP_BARSER)),GXutil.URLEncode(GXutil.rtrim(A14312CP_BARSERD)),GXutil.URLEncode(GXutil.rtrim(A14331CP_BARCOLO)),GXutil.URLEncode(GXutil.ltrimstr(A14332CP_BARCOLU,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S262( )
   {
      /* 'DO PIEZAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "PIEZAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S272( )
   {
      /* 'DO MODIFICARFECHAE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_modfecent", new String[] {GXutil.URLEncode(GXutil.rtrim(A14328CP_EMPRCOD)),GXutil.URLEncode(GXutil.ltrimstr(A14301CP_BARCOD,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A14302CP_BARCODR,1,0)),GXutil.URLEncode(GXutil.rtrim(A14303CP_BARCODP)),GXutil.URLEncode(GXutil.ltrimstr(A14326CP_CLICOD,6,0)),GXutil.URLEncode(GXutil.rtrim(A14327CP_CLINOM)),GXutil.URLEncode(GXutil.rtrim(AV131CP_PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(A14311CP_BARSER)),GXutil.URLEncode(GXutil.rtrim(A14312CP_BARSERD)),GXutil.URLEncode(GXutil.rtrim(A14331CP_BARCOLO)),GXutil.URLEncode(GXutil.ltrimstr(A14332CP_BARCOLU,6,0)),GXutil.URLEncode(GXutil.formatDateParm(A14304CP_BARFECF))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum","BarFecFpr"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S282( )
   {
      /* 'DO IMPRESIONHDR' Routine */
      returnInSub = false ;
   }

   public void S292( )
   {
      /* 'DO AGRUPADAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "AGRUPADAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S182( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV15Session.getValue(AV140Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV140Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV15Session.getValue(AV140Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S192 ();
      if (returnInSub) return;
      AV141GXV1 = 1 ;
      while ( AV141GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV141GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCP_BARCOLO") == 0 )
         {
            AV132TFCP_BARCOLO = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV132TFCP_BARCOLO", AV132TFCP_BARCOLO);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCP_BARCOLO_SEL") == 0 )
         {
            AV133TFCP_BARCOLO_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV133TFCP_BARCOLO_Sel", AV133TFCP_BARCOLO_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCP_BARCOLU") == 0 )
         {
            AV134TFCP_BARCOLU = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV134TFCP_BARCOLU", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134TFCP_BARCOLU), 6, 0));
            AV135TFCP_BARCOLU_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV135TFCP_BARCOLU_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV135TFCP_BARCOLU_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCP_TARTDSC") == 0 )
         {
            AV136TFCP_TARTDSC = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV136TFCP_TARTDSC", AV136TFCP_TARTDSC);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCP_TARTDSC_SEL") == 0 )
         {
            AV137TFCP_TARTDSC_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137TFCP_TARTDSC_Sel", AV137TFCP_TARTDSC_Sel);
         }
         AV141GXV1 = (int)(AV141GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV133TFCP_BARCOLO_Sel)==0), AV133TFCP_BARCOLO_Sel, GXv_char4) ;
      conproducww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV137TFCP_TARTDSC_Sel)==0), AV137TFCP_TARTDSC_Sel, GXv_char3) ;
      conproducww_impl.this.GXt_char10 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|||||||||||"+GXt_char1+"||||"+GXt_char10+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char10 = "" ;
      GXv_char4[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV132TFCP_BARCOLO)==0), AV132TFCP_BARCOLO, GXv_char4) ;
      conproducww_impl.this.GXt_char10 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV136TFCP_TARTDSC)==0), AV136TFCP_TARTDSC, GXv_char3) ;
      conproducww_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = "|||||||||||"+GXt_char10+"|"+((0==AV134TFCP_BARCOLU) ? "" : GXutil.str( AV134TFCP_BARCOLU, 6, 0))+"|||"+GXt_char1+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||||||||"+((0==AV135TFCP_BARCOLU_To) ? "" : GXutil.str( AV135TFCP_BARCOLU_To, 6, 0))+"||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV15Session.getValue(AV140Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFCP_BARCOLO", "", !(GXutil.strcmp("", AV132TFCP_BARCOLO)==0), (short)(0), AV132TFCP_BARCOLO, "", !(GXutil.strcmp("", AV133TFCP_BARCOLO_Sel)==0), AV133TFCP_BARCOLO_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFCP_BARCOLU", "", !((0==AV134TFCP_BARCOLU)&&(0==AV135TFCP_BARCOLU_To)), (short)(0), GXutil.trim( GXutil.str( AV134TFCP_BARCOLU, 6, 0)), GXutil.trim( GXutil.str( AV135TFCP_BARCOLU_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFCP_TARTDSC", "", !(GXutil.strcmp("", AV136TFCP_TARTDSC)==0), (short)(0), AV136TFCP_TARTDSC, "", !(GXutil.strcmp("", AV137TFCP_TARTDSC_Sel)==0), AV137TFCP_TARTDSC_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV140Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S172( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV140Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Produccion.CONPRODUC" );
      AV15Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV125EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV125EmprCod, httpContext.getMessage( "STDNOR", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV125EmprCod, httpContext.getMessage( "STNORM", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV125EmprCod, httpContext.getMessage( "CTWEAR", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         Combo_cod_idtx_Visible = false ;
         ucCombo_cod_idtx.sendProperty(context, "", false, Combo_cod_idtx_Internalname, "Visible", GXutil.booltostr( Combo_cod_idtx_Visible));
         divCombo_cod_idtx_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divCombo_cod_idtx_cell_Internalname, "Class", divCombo_cod_idtx_cell_Class, true);
      }
      else
      {
         Combo_cod_idtx_Visible = true ;
         ucCombo_cod_idtx.sendProperty(context, "", false, Combo_cod_idtx_Internalname, "Visible", GXutil.booltostr( Combo_cod_idtx_Visible));
         divCombo_cod_idtx_cell_Class = "col-xs-12 col-sm-5 DscTop ExtendedComboCell" ;
         httpContext.ajax_rsp_assign_prop("", false, divCombo_cod_idtx_cell_Internalname, "Class", divCombo_cod_idtx_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV125EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         cmbavMuestras.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Visible", GXutil.ltrimstr( cmbavMuestras.getVisible(), 5, 0), true);
         divMuestras_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divMuestras_cell_Internalname, "Class", divMuestras_cell_Class, true);
      }
      else
      {
         cmbavMuestras.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Visible", GXutil.ltrimstr( cmbavMuestras.getVisible(), 5, 0), true);
         divMuestras_cell_Class = "col-xs-12 col-sm-3" ;
         httpContext.ajax_rsp_assign_prop("", false, divMuestras_cell_Internalname, "Class", divMuestras_cell_Class, true);
      }
   }

   public void S152( )
   {
      /* 'LOADCOMBOCOD_IDTX' Routine */
      returnInSub = false ;
      /* Using cursor H026F4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13810Dsc_IdtxID = H026F4_A13810Dsc_IdtxID[0] ;
         A10887Cod_Idtx = H026F4_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = H026F4_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = H026F4_n10888Dsc_Idtx[0] ;
         AV112Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV112Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV112Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13810Dsc_IdtxID );
         AV111Cod_Idtx_Data.add(AV112Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_cod_idtx_Selectedvalue_set = AV76Cod_Idtx ;
      ucCombo_cod_idtx.sendProperty(context, "", false, Combo_cod_idtx_Internalname, "SelectedValue_set", Combo_cod_idtx_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOBARTIPARTTO' Routine */
      returnInSub = false ;
      /* Using cursor H026F5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13788TipArtCodD = H026F5_A13788TipArtCodD[0] ;
         A829TipArtCod = H026F5_A829TipArtCod[0] ;
         A830TipArtDsc = H026F5_A830TipArtDsc[0] ;
         n830TipArtDsc = H026F5_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H026F5_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H026F5_n6014TipArtDsc2[0] ;
         AV112Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV112Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV112Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV114BarTipArtto_Data.add(AV112Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_bartipartto_Selectedvalue_set = ((0==AV86BarTipArtto) ? "" : GXutil.trim( GXutil.str( AV86BarTipArtto, 4, 0))) ;
      ucCombo_bartipartto.sendProperty(context, "", false, Combo_bartipartto_Internalname, "SelectedValue_set", Combo_bartipartto_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOBARTIPARTFROM' Routine */
      returnInSub = false ;
      /* Using cursor H026F6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13788TipArtCodD = H026F6_A13788TipArtCodD[0] ;
         A829TipArtCod = H026F6_A829TipArtCod[0] ;
         A830TipArtDsc = H026F6_A830TipArtDsc[0] ;
         n830TipArtDsc = H026F6_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H026F6_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H026F6_n6014TipArtDsc2[0] ;
         AV112Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV112Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV112Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV113BarTipArtfrom_Data.add(AV112Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_bartipartfrom_Selectedvalue_set = ((0==AV85BarTipArtfrom) ? "" : GXutil.trim( GXutil.str( AV85BarTipArtfrom, 4, 0))) ;
      ucCombo_bartipartfrom.sendProperty(context, "", false, Combo_bartipartfrom_Internalname, "SelectedValue_set", Combo_bartipartfrom_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H026F7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A10045CliAct = H026F7_A10045CliAct[0] ;
         A13735CliCNom = H026F7_A13735CliCNom[0] ;
         A252CliCod = H026F7_A252CliCod[0] ;
         A279CliNom = H026F7_A279CliNom[0] ;
         AV112Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV112Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV112Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV116CliCodto_Data.add(AV112Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_clicodto_Selectedvalue_set = ((0==AV106CliCodto) ? "" : GXutil.trim( GXutil.str( AV106CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H026F8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A10045CliAct = H026F8_A10045CliAct[0] ;
         A13735CliCNom = H026F8_A13735CliCNom[0] ;
         A252CliCod = H026F8_A252CliCod[0] ;
         A279CliNom = H026F8_A279CliNom[0] ;
         AV112Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV112Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV112Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV115CliCodfrom_Data.add(AV112Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV105CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV105CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   public void wb_table7_349_26F2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTableagrupadas_modal_Internalname, tblTableagrupadas_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucAgrupadas_modal.setProperty("Width", Agrupadas_modal_Width);
         ucAgrupadas_modal.setProperty("Title", Agrupadas_modal_Title);
         ucAgrupadas_modal.setProperty("ConfirmType", Agrupadas_modal_Confirmtype);
         ucAgrupadas_modal.setProperty("BodyType", Agrupadas_modal_Bodytype);
         ucAgrupadas_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Agrupadas_modal_Internalname, "AGRUPADAS_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"AGRUPADAS_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_349_26F2e( true) ;
      }
      else
      {
         wb_table7_349_26F2e( false) ;
      }
   }

   public void wb_table6_344_26F2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablepiezas_modal_Internalname, tblTablepiezas_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucPiezas_modal.setProperty("Width", Piezas_modal_Width);
         ucPiezas_modal.setProperty("Title", Piezas_modal_Title);
         ucPiezas_modal.setProperty("ConfirmType", Piezas_modal_Confirmtype);
         ucPiezas_modal.setProperty("BodyType", Piezas_modal_Bodytype);
         ucPiezas_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Piezas_modal_Internalname, "PIEZAS_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"PIEZAS_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_344_26F2e( true) ;
      }
      else
      {
         wb_table6_344_26F2e( false) ;
      }
   }

   public void wb_table5_339_26F2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablepackinglist_modal_Internalname, tblTablepackinglist_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucPackinglist_modal.setProperty("Width", Packinglist_modal_Width);
         ucPackinglist_modal.setProperty("Title", Packinglist_modal_Title);
         ucPackinglist_modal.setProperty("ConfirmType", Packinglist_modal_Confirmtype);
         ucPackinglist_modal.setProperty("BodyType", Packinglist_modal_Bodytype);
         ucPackinglist_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Packinglist_modal_Internalname, "PACKINGLIST_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"PACKINGLIST_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_339_26F2e( true) ;
      }
      else
      {
         wb_table5_339_26F2e( false) ;
      }
   }

   public void wb_table4_334_26F2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablepartesproduccion_modal_Internalname, tblTablepartesproduccion_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucPartesproduccion_modal.setProperty("Width", Partesproduccion_modal_Width);
         ucPartesproduccion_modal.setProperty("Title", Partesproduccion_modal_Title);
         ucPartesproduccion_modal.setProperty("ConfirmType", Partesproduccion_modal_Confirmtype);
         ucPartesproduccion_modal.setProperty("BodyType", Partesproduccion_modal_Bodytype);
         ucPartesproduccion_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Partesproduccion_modal_Internalname, "PARTESPRODUCCION_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"PARTESPRODUCCION_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_334_26F2e( true) ;
      }
      else
      {
         wb_table4_334_26F2e( false) ;
      }
   }

   public void wb_table3_329_26F2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerecetas_modal_Internalname, tblTablerecetas_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucRecetas_modal.setProperty("Width", Recetas_modal_Width);
         ucRecetas_modal.setProperty("Title", Recetas_modal_Title);
         ucRecetas_modal.setProperty("ConfirmType", Recetas_modal_Confirmtype);
         ucRecetas_modal.setProperty("BodyType", Recetas_modal_Bodytype);
         ucRecetas_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Recetas_modal_Internalname, "RECETAS_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"RECETAS_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_329_26F2e( true) ;
      }
      else
      {
         wb_table3_329_26F2e( false) ;
      }
   }

   public void wb_table2_324_26F2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTableconsultaalbaransalida_modal_Internalname, tblTableconsultaalbaransalida_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucConsultaalbaransalida_modal.setProperty("Width", Consultaalbaransalida_modal_Width);
         ucConsultaalbaransalida_modal.setProperty("Title", Consultaalbaransalida_modal_Title);
         ucConsultaalbaransalida_modal.setProperty("ConfirmType", Consultaalbaransalida_modal_Confirmtype);
         ucConsultaalbaransalida_modal.setProperty("BodyType", Consultaalbaransalida_modal_Bodytype);
         ucConsultaalbaransalida_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Consultaalbaransalida_modal_Internalname, "CONSULTAALBARANSALIDA_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"CONSULTAALBARANSALIDA_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_324_26F2e( true) ;
      }
      else
      {
         wb_table2_324_26F2e( false) ;
      }
   }

   public void wb_table1_319_26F2( boolean wbgen )
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
         wb_table1_319_26F2e( true) ;
      }
      else
      {
         wb_table1_319_26F2e( false) ;
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
      pa26F2( ) ;
      ws26F2( ) ;
      we26F2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116151269", true, true);
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
      httpContext.AddJavascriptSource("produccion/conproducww.js", "?202682116151270", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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

   public void subsflControlProps_2742( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_274_idx );
      edtCP_ID_Internalname = "CP_ID_"+sGXsfl_274_idx ;
      edtCP_EMPRCOD_Internalname = "CP_EMPRCOD_"+sGXsfl_274_idx ;
      edtCP_CLICOD_Internalname = "CP_CLICOD_"+sGXsfl_274_idx ;
      edtCP_CLINOM_Internalname = "CP_CLINOM_"+sGXsfl_274_idx ;
      edtCP_BARCOD_Internalname = "CP_BARCOD_"+sGXsfl_274_idx ;
      edtCP_BARCODR_Internalname = "CP_BARCODR_"+sGXsfl_274_idx ;
      edtCP_BARCODP_Internalname = "CP_BARCODP_"+sGXsfl_274_idx ;
      edtCP_BARFECF_Internalname = "CP_BARFECF_"+sGXsfl_274_idx ;
      edtCP_BARNUMC_Internalname = "CP_BARNUMC_"+sGXsfl_274_idx ;
      edtCP_BARPLF_Internalname = "CP_BARPLF_"+sGXsfl_274_idx ;
      edtCP_BARSIT_Internalname = "CP_BARSIT_"+sGXsfl_274_idx ;
      edtCP_BARFECG_Internalname = "CP_BARFECG_"+sGXsfl_274_idx ;
      edtCP_BARFECC_Internalname = "CP_BARFECC_"+sGXsfl_274_idx ;
      edtCP_BARFECS_Internalname = "CP_BARFECS_"+sGXsfl_274_idx ;
      edtCP_BARSER_Internalname = "CP_BARSER_"+sGXsfl_274_idx ;
      edtCP_BARSERD_Internalname = "CP_BARSERD_"+sGXsfl_274_idx ;
      edtCP_BARCOLO_Internalname = "CP_BARCOLO_"+sGXsfl_274_idx ;
      edtCP_BARCOLU_Internalname = "CP_BARCOLU_"+sGXsfl_274_idx ;
      edtCP_BARNOMC_Internalname = "CP_BARNOMC_"+sGXsfl_274_idx ;
      edtCP_BARTIPA_Internalname = "CP_BARTIPA_"+sGXsfl_274_idx ;
      edtCP_TARTDSC_Internalname = "CP_TARTDSC_"+sGXsfl_274_idx ;
      edtCP_BARGIRA_Internalname = "CP_BARGIRA_"+sGXsfl_274_idx ;
      edtCP_BARACAA_Internalname = "CP_BARACAA_"+sGXsfl_274_idx ;
      edtCP_BARAGRE_Internalname = "CP_BARAGRE_"+sGXsfl_274_idx ;
   }

   public void subsflControlProps_fel_2742( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_274_fel_idx );
      edtCP_ID_Internalname = "CP_ID_"+sGXsfl_274_fel_idx ;
      edtCP_EMPRCOD_Internalname = "CP_EMPRCOD_"+sGXsfl_274_fel_idx ;
      edtCP_CLICOD_Internalname = "CP_CLICOD_"+sGXsfl_274_fel_idx ;
      edtCP_CLINOM_Internalname = "CP_CLINOM_"+sGXsfl_274_fel_idx ;
      edtCP_BARCOD_Internalname = "CP_BARCOD_"+sGXsfl_274_fel_idx ;
      edtCP_BARCODR_Internalname = "CP_BARCODR_"+sGXsfl_274_fel_idx ;
      edtCP_BARCODP_Internalname = "CP_BARCODP_"+sGXsfl_274_fel_idx ;
      edtCP_BARFECF_Internalname = "CP_BARFECF_"+sGXsfl_274_fel_idx ;
      edtCP_BARNUMC_Internalname = "CP_BARNUMC_"+sGXsfl_274_fel_idx ;
      edtCP_BARPLF_Internalname = "CP_BARPLF_"+sGXsfl_274_fel_idx ;
      edtCP_BARSIT_Internalname = "CP_BARSIT_"+sGXsfl_274_fel_idx ;
      edtCP_BARFECG_Internalname = "CP_BARFECG_"+sGXsfl_274_fel_idx ;
      edtCP_BARFECC_Internalname = "CP_BARFECC_"+sGXsfl_274_fel_idx ;
      edtCP_BARFECS_Internalname = "CP_BARFECS_"+sGXsfl_274_fel_idx ;
      edtCP_BARSER_Internalname = "CP_BARSER_"+sGXsfl_274_fel_idx ;
      edtCP_BARSERD_Internalname = "CP_BARSERD_"+sGXsfl_274_fel_idx ;
      edtCP_BARCOLO_Internalname = "CP_BARCOLO_"+sGXsfl_274_fel_idx ;
      edtCP_BARCOLU_Internalname = "CP_BARCOLU_"+sGXsfl_274_fel_idx ;
      edtCP_BARNOMC_Internalname = "CP_BARNOMC_"+sGXsfl_274_fel_idx ;
      edtCP_BARTIPA_Internalname = "CP_BARTIPA_"+sGXsfl_274_fel_idx ;
      edtCP_TARTDSC_Internalname = "CP_TARTDSC_"+sGXsfl_274_fel_idx ;
      edtCP_BARGIRA_Internalname = "CP_BARGIRA_"+sGXsfl_274_fel_idx ;
      edtCP_BARACAA_Internalname = "CP_BARACAA_"+sGXsfl_274_fel_idx ;
      edtCP_BARAGRE_Internalname = "CP_BARAGRE_"+sGXsfl_274_fel_idx ;
   }

   public void sendrow_2742( )
   {
      subsflControlProps_2742( ) ;
      wb26F0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_274_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_274_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_274_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 275,'',false,'"+sGXsfl_274_idx+"',274)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_274_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV75GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_274_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,275);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_274_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A14297CP_ID, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14297CP_ID), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_ID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_EMPRCOD_Internalname,GXutil.rtrim( A14328CP_EMPRCOD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_EMPRCOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_CLICOD_Internalname,GXutil.ltrim( localUtil.ntoc( A14326CP_CLICOD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14326CP_CLICOD), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_CLICOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_CLINOM_Internalname,A14327CP_CLINOM,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_CLINOM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCOD_Internalname,GXutil.ltrim( localUtil.ntoc( A14301CP_BARCOD, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14301CP_BARCOD), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCODR_Internalname,GXutil.ltrim( localUtil.ntoc( A14302CP_BARCODR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14302CP_BARCODR), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCODR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCODP_Internalname,GXutil.rtrim( A14303CP_BARCODP),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCODP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECF_Internalname,localUtil.format(A14304CP_BARFECF, "99/99/99"),localUtil.format( A14304CP_BARFECF, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARNUMC_Internalname,GXutil.ltrim( localUtil.ntoc( A14305CP_BARNUMC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14305CP_BARNUMC), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARNUMC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARPLF_Internalname,GXutil.rtrim( A14306CP_BARPLF),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARPLF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARSIT_Internalname,GXutil.ltrim( localUtil.ntoc( A14307CP_BARSIT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14307CP_BARSIT), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARSIT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECG_Internalname,localUtil.format(A14308CP_BARFECG, "99/99/99"),localUtil.format( A14308CP_BARFECG, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECC_Internalname,localUtil.format(A14309CP_BARFECC, "99/99/99"),localUtil.format( A14309CP_BARFECC, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARFECS_Internalname,localUtil.format(A14310CP_BARFECS, "99/99/99"),localUtil.format( A14310CP_BARFECS, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARFECS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARSER_Internalname,GXutil.rtrim( A14311CP_BARSER),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARSER_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARSERD_Internalname,A14312CP_BARSERD,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARSERD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCOLO_Internalname,GXutil.rtrim( A14331CP_BARCOLO),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCOLO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARCOLU_Internalname,GXutil.ltrim( localUtil.ntoc( A14332CP_BARCOLU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14332CP_BARCOLU), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARCOLU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARNOMC_Internalname,A14315CP_BARNOMC,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARNOMC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARTIPA_Internalname,GXutil.ltrim( localUtil.ntoc( A14316CP_BARTIPA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14316CP_BARTIPA), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARTIPA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_TARTDSC_Internalname,A14343CP_TARTDSC,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_TARTDSC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARGIRA_Internalname,A14317CP_BARGIRA,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARGIRA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARACAA_Internalname,GXutil.ltrim( localUtil.ntoc( A14318CP_BARACAA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14318CP_BARACAA), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARACAA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCP_BARAGRE_Internalname,GXutil.rtrim( A14319CP_BARAGRE),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCP_BARAGRE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(274),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes26F2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_274_idx = ((subGrid_Islastpage==1)&&(nGXsfl_274_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_274_idx+1) ;
         sGXsfl_274_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_274_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2742( ) ;
      }
      /* End function sendrow_2742 */
   }

   public void startgridcontrol274( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"274\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CP_ID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "BARCOD", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "REO", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PAR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prev", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo, Valor S o N", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Art.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CP_TARTDSC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cuardeno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV75GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14297CP_ID, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14328CP_EMPRCOD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14326CP_CLICOD, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14327CP_CLINOM);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14301CP_BARCOD, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14302CP_BARCODR, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14303CP_BARCODP));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A14304CP_BARFECF, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14305CP_BARNUMC, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14306CP_BARPLF));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14307CP_BARSIT, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A14308CP_BARFECG, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A14309CP_BARFECC, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A14310CP_BARFECS, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14311CP_BARSER));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14312CP_BARSERD);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14331CP_BARCOLO));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14332CP_BARCOLU, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14315CP_BARNOMC);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14316CP_BARTIPA, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14343CP_TARTDSC);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14317CP_BARGIRA);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14318CP_BARACAA, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14319CP_BARAGRE));
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
      lblTextblockcombo_clicodfrom_Internalname = "TEXTBLOCKCOMBO_CLICODFROM" ;
      Combo_clicodfrom_Internalname = "COMBO_CLICODFROM" ;
      divTablesplittedclicodfrom_Internalname = "TABLESPLITTEDCLICODFROM" ;
      lblTextblockcombo_clicodto_Internalname = "TEXTBLOCKCOMBO_CLICODTO" ;
      Combo_clicodto_Internalname = "COMBO_CLICODTO" ;
      divTablesplittedclicodto_Internalname = "TABLESPLITTEDCLICODTO" ;
      edtavBardisnumfrom_Internalname = "vBARDISNUMFROM" ;
      edtavBardisnumto_Internalname = "vBARDISNUMTO" ;
      edtavBarsitfrom_Internalname = "vBARSITFROM" ;
      edtavBarsitto_Internalname = "vBARSITTO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavBarfecclifrom_Internalname = "vBARFECCLIFROM" ;
      edtavBarfecclito_Internalname = "vBARFECCLITO" ;
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      edtavBarfecgenfrom_Internalname = "vBARFECGENFROM" ;
      edtavBarfecgento_Internalname = "vBARFECGENTO" ;
      divUnnamedtable15_Internalname = "UNNAMEDTABLE15" ;
      edtavBarfecfprfrom_Internalname = "vBARFECFPRFROM" ;
      edtavBarfecfprto_Internalname = "vBARFECFPRTO" ;
      divUnnamedtable16_Internalname = "UNNAMEDTABLE16" ;
      edtavBarfecsalfrom_Internalname = "vBARFECSALFROM" ;
      edtavBarfecsalto_Internalname = "vBARFECSALTO" ;
      divUnnamedtable17_Internalname = "UNNAMEDTABLE17" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      edtavBarcolnomfrom_Internalname = "vBARCOLNOMFROM" ;
      edtavBarcolnumfrom_Internalname = "vBARCOLNUMFROM" ;
      edtavBarcolnomto_Internalname = "vBARCOLNOMTO" ;
      edtavBarcolnumto_Internalname = "vBARCOLNUMTO" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      edtavBarnomclifrom_Internalname = "vBARNOMCLIFROM" ;
      edtavBarnumclifrom_Internalname = "vBARNUMCLIFROM" ;
      edtavBarnomclito_Internalname = "vBARNOMCLITO" ;
      edtavBarnumclito_Internalname = "vBARNUMCLITO" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      edtavBarserfrom_Internalname = "vBARSERFROM" ;
      edtavBarserto_Internalname = "vBARSERTO" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      lblTextblockcombo_bartipartfrom_Internalname = "TEXTBLOCKCOMBO_BARTIPARTFROM" ;
      Combo_bartipartfrom_Internalname = "COMBO_BARTIPARTFROM" ;
      divTablesplittedbartipartfrom_Internalname = "TABLESPLITTEDBARTIPARTFROM" ;
      lblTextblockcombo_bartipartto_Internalname = "TEXTBLOCKCOMBO_BARTIPARTTO" ;
      Combo_bartipartto_Internalname = "COMBO_BARTIPARTTO" ;
      divTablesplittedbartipartto_Internalname = "TABLESPLITTEDBARTIPARTTO" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      edtavBarcodfrom_Internalname = "vBARCODFROM" ;
      edtavBarcodreofrom_Internalname = "vBARCODREOFROM" ;
      edtavBarcodparfrom_Internalname = "vBARCODPARFROM" ;
      edtavBarcodto_Internalname = "vBARCODTO" ;
      edtavBarcodreoto_Internalname = "vBARCODREOTO" ;
      edtavBarcodparto_Internalname = "vBARCODPARTO" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      lblTextblockcombo_cod_idtx_Internalname = "TEXTBLOCKCOMBO_COD_IDTX" ;
      Combo_cod_idtx_Internalname = "COMBO_COD_IDTX" ;
      divTablesplittedcod_idtx_Internalname = "TABLESPLITTEDCOD_IDTX" ;
      divCombo_cod_idtx_cell_Internalname = "COMBO_COD_IDTX_CELL" ;
      edtavBargirar_Internalname = "vBARGIRAR" ;
      cmbavMuestras.setInternalname( "vMUESTRAS" );
      divMuestras_cell_Internalname = "MUESTRAS_CELL" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnsearch_Internalname = "BTNSEARCH" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Datamon_Internalname = "DATAMON" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtCP_ID_Internalname = "CP_ID" ;
      edtCP_EMPRCOD_Internalname = "CP_EMPRCOD" ;
      edtCP_CLICOD_Internalname = "CP_CLICOD" ;
      edtCP_CLINOM_Internalname = "CP_CLINOM" ;
      edtCP_BARCOD_Internalname = "CP_BARCOD" ;
      edtCP_BARCODR_Internalname = "CP_BARCODR" ;
      edtCP_BARCODP_Internalname = "CP_BARCODP" ;
      edtCP_BARFECF_Internalname = "CP_BARFECF" ;
      edtCP_BARNUMC_Internalname = "CP_BARNUMC" ;
      edtCP_BARPLF_Internalname = "CP_BARPLF" ;
      edtCP_BARSIT_Internalname = "CP_BARSIT" ;
      edtCP_BARFECG_Internalname = "CP_BARFECG" ;
      edtCP_BARFECC_Internalname = "CP_BARFECC" ;
      edtCP_BARFECS_Internalname = "CP_BARFECS" ;
      edtCP_BARSER_Internalname = "CP_BARSER" ;
      edtCP_BARSERD_Internalname = "CP_BARSERD" ;
      edtCP_BARCOLO_Internalname = "CP_BARCOLO" ;
      edtCP_BARCOLU_Internalname = "CP_BARCOLU" ;
      edtCP_BARNOMC_Internalname = "CP_BARNOMC" ;
      edtCP_BARTIPA_Internalname = "CP_BARTIPA" ;
      edtCP_TARTDSC_Internalname = "CP_TARTDSC" ;
      edtCP_BARGIRA_Internalname = "CP_BARGIRA" ;
      edtCP_BARACAA_Internalname = "CP_BARACAA" ;
      edtCP_BARAGRE_Internalname = "CP_BARAGRE" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      edtavBartipartfrom_Internalname = "vBARTIPARTFROM" ;
      edtavBartipartto_Internalname = "vBARTIPARTTO" ;
      edtavCod_idtx_Internalname = "vCOD_IDTX" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Situacionfases_modal_Internalname = "SITUACIONFASES_MODAL" ;
      tblTablesituacionfases_modal_Internalname = "TABLESITUACIONFASES_MODAL" ;
      Consultaalbaransalida_modal_Internalname = "CONSULTAALBARANSALIDA_MODAL" ;
      tblTableconsultaalbaransalida_modal_Internalname = "TABLECONSULTAALBARANSALIDA_MODAL" ;
      Recetas_modal_Internalname = "RECETAS_MODAL" ;
      tblTablerecetas_modal_Internalname = "TABLERECETAS_MODAL" ;
      Partesproduccion_modal_Internalname = "PARTESPRODUCCION_MODAL" ;
      tblTablepartesproduccion_modal_Internalname = "TABLEPARTESPRODUCCION_MODAL" ;
      Packinglist_modal_Internalname = "PACKINGLIST_MODAL" ;
      tblTablepackinglist_modal_Internalname = "TABLEPACKINGLIST_MODAL" ;
      Piezas_modal_Internalname = "PIEZAS_MODAL" ;
      tblTablepiezas_modal_Internalname = "TABLEPIEZAS_MODAL" ;
      Agrupadas_modal_Internalname = "AGRUPADAS_MODAL" ;
      tblTableagrupadas_modal_Internalname = "TABLEAGRUPADAS_MODAL" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtCP_BARAGRE_Jsonclick = "" ;
      edtCP_BARACAA_Jsonclick = "" ;
      edtCP_BARGIRA_Jsonclick = "" ;
      edtCP_TARTDSC_Jsonclick = "" ;
      edtCP_BARTIPA_Jsonclick = "" ;
      edtCP_BARNOMC_Jsonclick = "" ;
      edtCP_BARCOLU_Jsonclick = "" ;
      edtCP_BARCOLO_Jsonclick = "" ;
      edtCP_BARSERD_Jsonclick = "" ;
      edtCP_BARSER_Jsonclick = "" ;
      edtCP_BARFECS_Jsonclick = "" ;
      edtCP_BARFECC_Jsonclick = "" ;
      edtCP_BARFECG_Jsonclick = "" ;
      edtCP_BARSIT_Jsonclick = "" ;
      edtCP_BARPLF_Jsonclick = "" ;
      edtCP_BARNUMC_Jsonclick = "" ;
      edtCP_BARFECF_Jsonclick = "" ;
      edtCP_BARCODP_Jsonclick = "" ;
      edtCP_BARCODR_Jsonclick = "" ;
      edtCP_BARCOD_Jsonclick = "" ;
      edtCP_CLINOM_Jsonclick = "" ;
      edtCP_CLICOD_Jsonclick = "" ;
      edtCP_EMPRCOD_Jsonclick = "" ;
      edtCP_ID_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavCod_idtx_Jsonclick = "" ;
      edtavCod_idtx_Visible = 1 ;
      edtavBartipartto_Jsonclick = "" ;
      edtavBartipartto_Visible = 1 ;
      edtavBartipartfrom_Jsonclick = "" ;
      edtavBartipartfrom_Visible = 1 ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavMuestras.setJsonclick( "" );
      cmbavMuestras.setEnabled( 1 );
      cmbavMuestras.setVisible( 1 );
      divMuestras_cell_Class = "col-xs-12 col-sm-3" ;
      edtavBargirar_Jsonclick = "" ;
      edtavBargirar_Enabled = 1 ;
      divCombo_cod_idtx_cell_Class = "col-xs-12 col-sm-5" ;
      edtavBarcodparto_Jsonclick = "" ;
      edtavBarcodparto_Enabled = 1 ;
      edtavBarcodreoto_Jsonclick = "" ;
      edtavBarcodreoto_Enabled = 1 ;
      edtavBarcodto_Jsonclick = "" ;
      edtavBarcodto_Enabled = 1 ;
      edtavBarcodparfrom_Jsonclick = "" ;
      edtavBarcodparfrom_Enabled = 1 ;
      edtavBarcodreofrom_Jsonclick = "" ;
      edtavBarcodreofrom_Enabled = 1 ;
      edtavBarcodfrom_Jsonclick = "" ;
      edtavBarcodfrom_Enabled = 1 ;
      edtavBarserto_Jsonclick = "" ;
      edtavBarserto_Enabled = 1 ;
      edtavBarserfrom_Jsonclick = "" ;
      edtavBarserfrom_Enabled = 1 ;
      edtavBarnumclito_Jsonclick = "" ;
      edtavBarnumclito_Enabled = 1 ;
      edtavBarnomclito_Jsonclick = "" ;
      edtavBarnomclito_Enabled = 1 ;
      edtavBarnumclifrom_Jsonclick = "" ;
      edtavBarnumclifrom_Enabled = 1 ;
      edtavBarnomclifrom_Jsonclick = "" ;
      edtavBarnomclifrom_Enabled = 1 ;
      edtavBarcolnumto_Jsonclick = "" ;
      edtavBarcolnumto_Enabled = 1 ;
      edtavBarcolnomto_Jsonclick = "" ;
      edtavBarcolnomto_Enabled = 1 ;
      edtavBarcolnumfrom_Jsonclick = "" ;
      edtavBarcolnumfrom_Enabled = 1 ;
      edtavBarcolnomfrom_Jsonclick = "" ;
      edtavBarcolnomfrom_Enabled = 1 ;
      edtavBarfecsalto_Jsonclick = "" ;
      edtavBarfecsalto_Enabled = 1 ;
      edtavBarfecsalfrom_Jsonclick = "" ;
      edtavBarfecsalfrom_Enabled = 1 ;
      edtavBarfecfprto_Jsonclick = "" ;
      edtavBarfecfprto_Enabled = 1 ;
      edtavBarfecfprfrom_Jsonclick = "" ;
      edtavBarfecfprfrom_Enabled = 1 ;
      edtavBarfecgento_Jsonclick = "" ;
      edtavBarfecgento_Enabled = 1 ;
      edtavBarfecgenfrom_Jsonclick = "" ;
      edtavBarfecgenfrom_Enabled = 1 ;
      edtavBarfecclito_Jsonclick = "" ;
      edtavBarfecclito_Enabled = 1 ;
      edtavBarfecclifrom_Jsonclick = "" ;
      edtavBarfecclifrom_Enabled = 1 ;
      edtavBarsitto_Jsonclick = "" ;
      edtavBarsitto_Enabled = 1 ;
      edtavBarsitfrom_Jsonclick = "" ;
      edtavBarsitfrom_Enabled = 1 ;
      edtavBardisnumto_Jsonclick = "" ;
      edtavBardisnumto_Enabled = 1 ;
      edtavBardisnumfrom_Jsonclick = "" ;
      edtavBardisnumfrom_Enabled = 1 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Agrupadas_modal_Bodytype = "WebComponent" ;
      Agrupadas_modal_Confirmtype = "" ;
      Agrupadas_modal_Title = httpContext.getMessage( "Producciones Agrupadas Tinte", "") ;
      Agrupadas_modal_Width = "1500" ;
      Piezas_modal_Bodytype = "WebComponent" ;
      Piezas_modal_Confirmtype = "" ;
      Piezas_modal_Title = httpContext.getMessage( "Detalle Entradas Almacen Tejido", "") ;
      Piezas_modal_Width = "1500" ;
      Packinglist_modal_Bodytype = "WebComponent" ;
      Packinglist_modal_Confirmtype = "" ;
      Packinglist_modal_Title = httpContext.getMessage( " Packing List", "") ;
      Packinglist_modal_Width = "1500" ;
      Partesproduccion_modal_Bodytype = "WebComponent" ;
      Partesproduccion_modal_Confirmtype = "" ;
      Partesproduccion_modal_Title = httpContext.getMessage( " Parte Produccion", "") ;
      Partesproduccion_modal_Width = "1500" ;
      Recetas_modal_Bodytype = "WebComponent" ;
      Recetas_modal_Confirmtype = "" ;
      Recetas_modal_Title = httpContext.getMessage( "Recetas", "") ;
      Recetas_modal_Width = "800" ;
      Consultaalbaransalida_modal_Bodytype = "WebComponent" ;
      Consultaalbaransalida_modal_Confirmtype = "" ;
      Consultaalbaransalida_modal_Title = httpContext.getMessage( "Albaran de Entrega", "") ;
      Consultaalbaransalida_modal_Width = "1500" ;
      Situacionfases_modal_Bodytype = "WebComponent" ;
      Situacionfases_modal_Confirmtype = "" ;
      Situacionfases_modal_Title = httpContext.getMessage( "Consulta de Fases Produccion", "") ;
      Situacionfases_modal_Width = "1500" ;
      Ddo_grid_Datalistproc = "Produccion.CONPRODUCWWGetFilterData" ;
      Ddo_grid_Datalisttype = "|||||||||||Dynamic||||Dynamic|||" ;
      Ddo_grid_Includedatalist = "|||||||||||T||||T|||" ;
      Ddo_grid_Filterisrange = "||||||||||||T||||||" ;
      Ddo_grid_Filtertype = "|||||||||||Character|Numeric|||Character|||" ;
      Ddo_grid_Includefilter = "|||||||||||T|T|||T|||" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19" ;
      Ddo_grid_Columnids = "2:CP_EMPRCOD|3:CP_CLICOD|4:CP_CLINOM|8:CP_BARFECFPR|9:CP_BARNUMCLI|11:CP_BARSIT|12:CP_BARFECGEN|13:CP_BARFECCLI|14:CP_BARFECSAL|15:CP_BARSER|16:CP_BARSERDSC|17:CP_BARCOLO|18:CP_BARCOLU|19:CP_BARNOMCLI|20:CP_BARTIPART|21:CP_TARTDSC|22:CP_BARGIRAR|23:CP_BARACAANH|24:CP_BARAGREST" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultados", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
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
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Combo_cod_idtx_Emptyitemtext = "Todas" ;
      Combo_cod_idtx_Visible = GXutil.toBoolean( -1) ;
      Combo_cod_idtx_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Nº HDR", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Articulo", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Combo_bartipartto_Emptyitemtext = "Todos" ;
      Combo_bartipartto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_bartipartfrom_Emptyitemtext = "Todos" ;
      Combo_bartipartfrom_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Color", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Fechas", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Consulta de Produccion", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavMuestras.setName( "vMUESTRAS" );
      cmbavMuestras.setWebtags( "" );
      cmbavMuestras.addItem("", httpContext.getMessage( "Todo", ""), (short)(0));
      cmbavMuestras.addItem("N", httpContext.getMessage( "Nao AMOSTRAS", ""), (short)(0));
      cmbavMuestras.addItem("S", httpContext.getMessage( "Sim AMOSTRAS", ""), (short)(0));
      if ( cmbavMuestras.getItemCount() > 0 )
      {
         AV78Muestras = cmbavMuestras.getValidValue(AV78Muestras) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Muestras", AV78Muestras);
      }
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_274_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV75GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75GridActionGroup1), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOSEARCH'","{handler:'e2526F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("'DOSEARCH'",",oparms:[{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1626F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1726F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1826F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2926F2',iparms:[{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV75GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e3026F2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV75GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A14328CP_EMPRCOD',fld:'CP_EMPRCOD',pic:'',hsh:true},{av:'A14301CP_BARCOD',fld:'CP_BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A14302CP_BARCODR',fld:'CP_BARCODR',pic:'9',hsh:true},{av:'A14303CP_BARCODP',fld:'CP_BARCODP',pic:'',hsh:true},{av:'A14326CP_CLICOD',fld:'CP_CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A14327CP_CLINOM',fld:'CP_CLINOM',pic:'',hsh:true},{av:'A14311CP_BARSER',fld:'CP_BARSER',pic:'',hsh:true},{av:'A14312CP_BARSERD',fld:'CP_BARSERD',pic:'',hsh:true},{av:'A14331CP_BARCOLO',fld:'CP_BARCOLO',pic:'',hsh:true},{av:'A14332CP_BARCOLU',fld:'CP_BARCOLU',pic:'ZZZZZ9',hsh:true},{av:'A14304CP_BARFECF',fld:'CP_BARFECF',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV75GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE","{handler:'e1926F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE",",oparms:[{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("CONSULTAALBARANSALIDA_MODAL.CLOSE","{handler:'e2026F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("CONSULTAALBARANSALIDA_MODAL.CLOSE",",oparms:[{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("RECETAS_MODAL.CLOSE","{handler:'e2126F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("RECETAS_MODAL.CLOSE",",oparms:[{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("PARTESPRODUCCION_MODAL.CLOSE","{handler:'e2226F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("PARTESPRODUCCION_MODAL.CLOSE",",oparms:[{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("PIEZAS_MODAL.CLOSE","{handler:'e2326F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("PIEZAS_MODAL.CLOSE",",oparms:[{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("AGRUPADAS_MODAL.CLOSE","{handler:'e2426F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV107BarDisNumfrom',fld:'vBARDISNUMFROM',pic:''},{av:'AV108BarDisNumto',fld:'vBARDISNUMTO',pic:''},{av:'AV109BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV110BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV103BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV104BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV101BarFecGenfrom',fld:'vBARFECGENFROM',pic:''},{av:'AV102BarFecGento',fld:'vBARFECGENTO',pic:''},{av:'AV99BarFecFprfrom',fld:'vBARFECFPRFROM',pic:''},{av:'AV100BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV97BarFecSalfrom',fld:'vBARFECSALFROM',pic:''},{av:'AV98BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV93BarColNomfrom',fld:'vBARCOLNOMFROM',pic:''},{av:'AV94BarColNumfrom',fld:'vBARCOLNUMFROM',pic:'ZZZZZ9'},{av:'AV95BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV96BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV89BarNomClifrom',fld:'vBARNOMCLIFROM',pic:''},{av:'AV90BarNumClifrom',fld:'vBARNUMCLIFROM',pic:'ZZZZZ9'},{av:'AV91BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV92BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV87BarSerfrom',fld:'vBARSERFROM',pic:''},{av:'AV88BarSerto',fld:'vBARSERTO',pic:''},{av:'AV79BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV80BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV81BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV82BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV83BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV84BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV77BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'},{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV125EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV132TFCP_BARCOLO',fld:'vTFCP_BARCOLO',pic:''},{av:'AV133TFCP_BARCOLO_Sel',fld:'vTFCP_BARCOLO_SEL',pic:''},{av:'AV134TFCP_BARCOLU',fld:'vTFCP_BARCOLU',pic:'ZZZZZ9'},{av:'AV135TFCP_BARCOLU_To',fld:'vTFCP_BARCOLU_TO',pic:'ZZZZZ9'},{av:'AV136TFCP_TARTDSC',fld:'vTFCP_TARTDSC',pic:''},{av:'AV137TFCP_TARTDSC_Sel',fld:'vTFCP_TARTDSC_SEL',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV129PedidoCliente',fld:'vPEDIDOCLIENTE',pic:'',hsh:true},{av:'AV131CP_PedidoCliente',fld:'vCP_PEDIDOCLIENTE',pic:'',hsh:true},{av:'A14336CP_BARKGM',fld:'CP_BARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A14337CP_BARMTR',fld:'CP_BARMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("AGRUPADAS_MODAL.CLOSE",",oparms:[{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e2626F2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("COMBO_COD_IDTX.ONOPTIONCLICKED","{handler:'e1526F2',iparms:[{av:'Combo_cod_idtx_Selectedvalue_get',ctrl:'COMBO_COD_IDTX',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_COD_IDTX.ONOPTIONCLICKED",",oparms:[{av:'AV76Cod_Idtx',fld:'vCOD_IDTX',pic:''}]}");
      setEventMetadata("COMBO_BARTIPARTTO.ONOPTIONCLICKED","{handler:'e1426F2',iparms:[{av:'Combo_bartipartto_Selectedvalue_get',ctrl:'COMBO_BARTIPARTTO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_BARTIPARTTO.ONOPTIONCLICKED",",oparms:[{av:'AV86BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'}]}");
      setEventMetadata("COMBO_BARTIPARTFROM.ONOPTIONCLICKED","{handler:'e1326F2',iparms:[{av:'Combo_bartipartfrom_Selectedvalue_get',ctrl:'COMBO_BARTIPARTFROM',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_BARTIPARTFROM.ONOPTIONCLICKED",",oparms:[{av:'AV85BarTipArtfrom',fld:'vBARTIPARTFROM',pic:'ZZZ9'}]}");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED","{handler:'e1226F2',iparms:[{av:'Combo_clicodto_Selectedvalue_get',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED",",oparms:[{av:'AV106CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'}]}");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED","{handler:'e1126F2',iparms:[{av:'Combo_clicodfrom_Selectedvalue_get',ctrl:'COMBO_CLICODFROM',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED",",oparms:[{av:'AV105CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'valid_Cp_baragre',iparms:[]");
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
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Combo_cod_idtx_Selectedvalue_get = "" ;
      Combo_bartipartto_Selectedvalue_get = "" ;
      Combo_bartipartfrom_Selectedvalue_get = "" ;
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV107BarDisNumfrom = "" ;
      AV108BarDisNumto = "" ;
      AV103BarFecClifrom = GXutil.nullDate() ;
      AV104BarFecClito = GXutil.nullDate() ;
      AV101BarFecGenfrom = GXutil.nullDate() ;
      AV102BarFecGento = GXutil.nullDate() ;
      AV99BarFecFprfrom = GXutil.nullDate() ;
      AV100BarFecFprto = GXutil.nullDate() ;
      AV97BarFecSalfrom = GXutil.nullDate() ;
      AV98BarFecSalto = GXutil.nullDate() ;
      AV93BarColNomfrom = "" ;
      AV95BarColNomto = "" ;
      AV89BarNomClifrom = "" ;
      AV91BarNomClito = "" ;
      AV87BarSerfrom = "" ;
      AV88BarSerto = "" ;
      AV81BarCodParfrom = "" ;
      AV84BarCodParto = "" ;
      AV77BarGirar = "" ;
      AV76Cod_Idtx = "" ;
      AV125EmprCod = "" ;
      AV140Pgmname = "" ;
      AV132TFCP_BARCOLO = "" ;
      AV133TFCP_BARCOLO_Sel = "" ;
      AV136TFCP_TARTDSC = "" ;
      AV137TFCP_TARTDSC_Sel = "" ;
      A120BarAgrEst = "" ;
      AV129PedidoCliente = "" ;
      AV131CP_PedidoCliente = "" ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV115CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV116CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV113BarTipArtfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV114BarTipArtto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV111Cod_Idtx_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV69DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
      Combo_bartipartfrom_Selectedvalue_set = "" ;
      Combo_bartipartto_Selectedvalue_set = "" ;
      Combo_cod_idtx_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodfrom_Jsonclick = "" ;
      ucCombo_clicodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_clicodfrom_Caption = "" ;
      lblTextblockcombo_clicodto_Jsonclick = "" ;
      ucCombo_clicodto = new com.genexus.webpanels.GXUserControl();
      Combo_clicodto_Caption = "" ;
      TempTags = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_bartipartfrom_Jsonclick = "" ;
      ucCombo_bartipartfrom = new com.genexus.webpanels.GXUserControl();
      Combo_bartipartfrom_Caption = "" ;
      lblTextblockcombo_bartipartto_Jsonclick = "" ;
      ucCombo_bartipartto = new com.genexus.webpanels.GXUserControl();
      Combo_bartipartto_Caption = "" ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_cod_idtx_Jsonclick = "" ;
      ucCombo_cod_idtx = new com.genexus.webpanels.GXUserControl();
      Combo_cod_idtx_Caption = "" ;
      AV78Muestras = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnsearch_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A14328CP_EMPRCOD = "" ;
      A14327CP_CLINOM = "" ;
      A14303CP_BARCODP = "" ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14306CP_BARPLF = "" ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      A14311CP_BARSER = "" ;
      A14312CP_BARSERD = "" ;
      A14331CP_BARCOLO = "" ;
      A14315CP_BARNOMC = "" ;
      A14343CP_TARTDSC = "" ;
      A14317CP_BARGIRA = "" ;
      A14319CP_BARAGRE = "" ;
      scmdbuf = "" ;
      lV132TFCP_BARCOLO = "" ;
      lV136TFCP_TARTDSC = "" ;
      AV128TFBarPlf = "" ;
      A14324CP_BARDISN = "" ;
      A14323CP_BARPROP = "" ;
      H026F2_A14323CP_BARPROP = new String[] {""} ;
      H026F2_A14324CP_BARDISN = new String[] {""} ;
      H026F2_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026F2_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026F2_A14319CP_BARAGRE = new String[] {""} ;
      H026F2_A14318CP_BARACAA = new short[1] ;
      H026F2_A14317CP_BARGIRA = new String[] {""} ;
      H026F2_A14343CP_TARTDSC = new String[] {""} ;
      H026F2_A14316CP_BARTIPA = new short[1] ;
      H026F2_A14315CP_BARNOMC = new String[] {""} ;
      H026F2_A14332CP_BARCOLU = new int[1] ;
      H026F2_A14331CP_BARCOLO = new String[] {""} ;
      H026F2_A14312CP_BARSERD = new String[] {""} ;
      H026F2_A14311CP_BARSER = new String[] {""} ;
      H026F2_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      H026F2_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      H026F2_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      H026F2_A14307CP_BARSIT = new byte[1] ;
      H026F2_A14306CP_BARPLF = new String[] {""} ;
      H026F2_A14305CP_BARNUMC = new int[1] ;
      H026F2_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      H026F2_A14303CP_BARCODP = new String[] {""} ;
      H026F2_A14302CP_BARCODR = new byte[1] ;
      H026F2_A14301CP_BARCOD = new int[1] ;
      H026F2_A14327CP_CLINOM = new String[] {""} ;
      H026F2_A14326CP_CLICOD = new int[1] ;
      H026F2_A14328CP_EMPRCOD = new String[] {""} ;
      H026F2_A14297CP_ID = new long[1] ;
      H026F3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV124Station = "" ;
      GXv_char2 = new String[1] ;
      AV126EmprNom = "" ;
      AV127UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int9 = new byte[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV15Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char10 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState11 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H026F4_A396EmprCod = new String[] {""} ;
      H026F4_A13810Dsc_IdtxID = new String[] {""} ;
      H026F4_A10887Cod_Idtx = new String[] {""} ;
      H026F4_A10888Dsc_Idtx = new String[] {""} ;
      H026F4_n10888Dsc_Idtx = new boolean[] {false} ;
      A13810Dsc_IdtxID = "" ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV112Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H026F5_A396EmprCod = new String[] {""} ;
      H026F5_A13788TipArtCodD = new String[] {""} ;
      H026F5_A829TipArtCod = new short[1] ;
      H026F5_A830TipArtDsc = new String[] {""} ;
      H026F5_n830TipArtDsc = new boolean[] {false} ;
      H026F5_A6014TipArtDsc2 = new String[] {""} ;
      H026F5_n6014TipArtDsc2 = new boolean[] {false} ;
      A13788TipArtCodD = "" ;
      A830TipArtDsc = "" ;
      A6014TipArtDsc2 = "" ;
      H026F6_A396EmprCod = new String[] {""} ;
      H026F6_A13788TipArtCodD = new String[] {""} ;
      H026F6_A829TipArtCod = new short[1] ;
      H026F6_A830TipArtDsc = new String[] {""} ;
      H026F6_n830TipArtDsc = new boolean[] {false} ;
      H026F6_A6014TipArtDsc2 = new String[] {""} ;
      H026F6_n6014TipArtDsc2 = new boolean[] {false} ;
      H026F7_A396EmprCod = new String[] {""} ;
      H026F7_A10045CliAct = new String[] {""} ;
      H026F7_A13735CliCNom = new String[] {""} ;
      H026F7_A252CliCod = new int[1] ;
      H026F7_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      H026F8_A396EmprCod = new String[] {""} ;
      H026F8_A10045CliAct = new String[] {""} ;
      H026F8_A13735CliCNom = new String[] {""} ;
      H026F8_A252CliCod = new int[1] ;
      H026F8_A279CliNom = new String[] {""} ;
      ucAgrupadas_modal = new com.genexus.webpanels.GXUserControl();
      ucPiezas_modal = new com.genexus.webpanels.GXUserControl();
      ucPackinglist_modal = new com.genexus.webpanels.GXUserControl();
      ucPartesproduccion_modal = new com.genexus.webpanels.GXUserControl();
      ucRecetas_modal = new com.genexus.webpanels.GXUserControl();
      ucConsultaalbaransalida_modal = new com.genexus.webpanels.GXUserControl();
      ucSituacionfases_modal = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.conproducww__default(),
         new Object[] {
             new Object[] {
            H026F2_A14323CP_BARPROP, H026F2_A14324CP_BARDISN, H026F2_A14336CP_BARKGM, H026F2_A14337CP_BARMTR, H026F2_A14319CP_BARAGRE, H026F2_A14318CP_BARACAA, H026F2_A14317CP_BARGIRA, H026F2_A14343CP_TARTDSC, H026F2_A14316CP_BARTIPA, H026F2_A14315CP_BARNOMC,
            H026F2_A14332CP_BARCOLU, H026F2_A14331CP_BARCOLO, H026F2_A14312CP_BARSERD, H026F2_A14311CP_BARSER, H026F2_A14310CP_BARFECS, H026F2_A14309CP_BARFECC, H026F2_A14308CP_BARFECG, H026F2_A14307CP_BARSIT, H026F2_A14306CP_BARPLF, H026F2_A14305CP_BARNUMC,
            H026F2_A14304CP_BARFECF, H026F2_A14303CP_BARCODP, H026F2_A14302CP_BARCODR, H026F2_A14301CP_BARCOD, H026F2_A14327CP_CLINOM, H026F2_A14326CP_CLICOD, H026F2_A14328CP_EMPRCOD, H026F2_A14297CP_ID
            }
            , new Object[] {
            H026F3_AGRID_nRecordCount
            }
            , new Object[] {
            H026F4_A396EmprCod, H026F4_A13810Dsc_IdtxID, H026F4_A10887Cod_Idtx, H026F4_A10888Dsc_Idtx, H026F4_n10888Dsc_Idtx
            }
            , new Object[] {
            H026F5_A396EmprCod, H026F5_A13788TipArtCodD, H026F5_A829TipArtCod, H026F5_A830TipArtDsc, H026F5_n830TipArtDsc, H026F5_A6014TipArtDsc2, H026F5_n6014TipArtDsc2
            }
            , new Object[] {
            H026F6_A396EmprCod, H026F6_A13788TipArtCodD, H026F6_A829TipArtCod, H026F6_A830TipArtDsc, H026F6_n830TipArtDsc, H026F6_A6014TipArtDsc2, H026F6_n6014TipArtDsc2
            }
            , new Object[] {
            H026F7_A396EmprCod, H026F7_A10045CliAct, H026F7_A13735CliCNom, H026F7_A252CliCod, H026F7_A279CliNom
            }
            , new Object[] {
            H026F8_A396EmprCod, H026F8_A10045CliAct, H026F8_A13735CliCNom, H026F8_A252CliCod, H026F8_A279CliNom
            }
         }
      );
      AV140Pgmname = "Produccion.CONPRODUCWW" ;
      /* GeneXus formulas. */
      AV140Pgmname = "Produccion.CONPRODUCWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV109BarSitfrom ;
   private byte AV110BarSitto ;
   private byte AV80BarCodReofrom ;
   private byte AV83BarCodReoto ;
   private byte gxajaxcallmode ;
   private byte A14302CP_BARCODR ;
   private byte A14307CP_BARSIT ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int8 ;
   private byte GXv_int9[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
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
   private short AV85BarTipArtfrom ;
   private short AV86BarTipArtto ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV75GridActionGroup1 ;
   private short A14316CP_BARTIPA ;
   private short A14318CP_BARACAA ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A829TipArtCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_274 ;
   private int nGXsfl_274_idx=1 ;
   private int AV94BarColNumfrom ;
   private int AV96BarColNumto ;
   private int AV90BarNumClifrom ;
   private int AV92BarNumClito ;
   private int AV79BarCodfrom ;
   private int AV82BarCodto ;
   private int AV105CliCodfrom ;
   private int AV106CliCodto ;
   private int AV134TFCP_BARCOLU ;
   private int AV135TFCP_BARCOLU_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBardisnumfrom_Enabled ;
   private int edtavBardisnumto_Enabled ;
   private int edtavBarsitfrom_Enabled ;
   private int edtavBarsitto_Enabled ;
   private int edtavBarfecclifrom_Enabled ;
   private int edtavBarfecclito_Enabled ;
   private int edtavBarfecgenfrom_Enabled ;
   private int edtavBarfecgento_Enabled ;
   private int edtavBarfecfprfrom_Enabled ;
   private int edtavBarfecfprto_Enabled ;
   private int edtavBarfecsalfrom_Enabled ;
   private int edtavBarfecsalto_Enabled ;
   private int edtavBarcolnomfrom_Enabled ;
   private int edtavBarcolnumfrom_Enabled ;
   private int edtavBarcolnomto_Enabled ;
   private int edtavBarcolnumto_Enabled ;
   private int edtavBarnomclifrom_Enabled ;
   private int edtavBarnumclifrom_Enabled ;
   private int edtavBarnomclito_Enabled ;
   private int edtavBarnumclito_Enabled ;
   private int edtavBarserfrom_Enabled ;
   private int edtavBarserto_Enabled ;
   private int edtavBarcodfrom_Enabled ;
   private int edtavBarcodreofrom_Enabled ;
   private int edtavBarcodparfrom_Enabled ;
   private int edtavBarcodto_Enabled ;
   private int edtavBarcodreoto_Enabled ;
   private int edtavBarcodparto_Enabled ;
   private int edtavBargirar_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavClicodfrom_Visible ;
   private int edtavClicodto_Visible ;
   private int edtavBartipartfrom_Visible ;
   private int edtavBartipartto_Visible ;
   private int edtavCod_idtx_Visible ;
   private int A14326CP_CLICOD ;
   private int A14301CP_BARCOD ;
   private int A14305CP_BARNUMC ;
   private int A14332CP_BARCOLU ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV70PageToGo ;
   private int AV141GXV1 ;
   private int A252CliCod ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV71GridCurrentPage ;
   private long AV72GridPageCount ;
   private long A14297CP_ID ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal A14337CP_BARMTR ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Combo_cod_idtx_Selectedvalue_get ;
   private String Combo_bartipartto_Selectedvalue_get ;
   private String Combo_bartipartfrom_Selectedvalue_get ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_274_idx="0001" ;
   private String AV107BarDisNumfrom ;
   private String AV108BarDisNumto ;
   private String AV93BarColNomfrom ;
   private String AV95BarColNomto ;
   private String AV89BarNomClifrom ;
   private String AV91BarNomClito ;
   private String AV87BarSerfrom ;
   private String AV88BarSerto ;
   private String AV81BarCodParfrom ;
   private String AV84BarCodParto ;
   private String AV77BarGirar ;
   private String AV76Cod_Idtx ;
   private String AV125EmprCod ;
   private String AV140Pgmname ;
   private String AV132TFCP_BARCOLO ;
   private String AV133TFCP_BARCOLO_Sel ;
   private String A120BarAgrEst ;
   private String AV129PedidoCliente ;
   private String AV131CP_PedidoCliente ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Combo_bartipartfrom_Cls ;
   private String Combo_bartipartfrom_Selectedvalue_set ;
   private String Combo_bartipartfrom_Emptyitemtext ;
   private String Combo_bartipartto_Cls ;
   private String Combo_bartipartto_Selectedvalue_set ;
   private String Combo_bartipartto_Emptyitemtext ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Combo_cod_idtx_Cls ;
   private String Combo_cod_idtx_Selectedvalue_set ;
   private String Combo_cod_idtx_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
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
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
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
   private String Situacionfases_modal_Width ;
   private String Situacionfases_modal_Title ;
   private String Situacionfases_modal_Confirmtype ;
   private String Situacionfases_modal_Bodytype ;
   private String Consultaalbaransalida_modal_Width ;
   private String Consultaalbaransalida_modal_Title ;
   private String Consultaalbaransalida_modal_Confirmtype ;
   private String Consultaalbaransalida_modal_Bodytype ;
   private String Recetas_modal_Width ;
   private String Recetas_modal_Title ;
   private String Recetas_modal_Confirmtype ;
   private String Recetas_modal_Bodytype ;
   private String Partesproduccion_modal_Width ;
   private String Partesproduccion_modal_Title ;
   private String Partesproduccion_modal_Confirmtype ;
   private String Partesproduccion_modal_Bodytype ;
   private String Packinglist_modal_Width ;
   private String Packinglist_modal_Title ;
   private String Packinglist_modal_Confirmtype ;
   private String Packinglist_modal_Bodytype ;
   private String Piezas_modal_Width ;
   private String Piezas_modal_Title ;
   private String Piezas_modal_Confirmtype ;
   private String Piezas_modal_Bodytype ;
   private String Agrupadas_modal_Width ;
   private String Agrupadas_modal_Title ;
   private String Agrupadas_modal_Confirmtype ;
   private String Agrupadas_modal_Bodytype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedclicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Jsonclick ;
   private String Combo_clicodfrom_Caption ;
   private String Combo_clicodfrom_Internalname ;
   private String divTablesplittedclicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Jsonclick ;
   private String Combo_clicodto_Caption ;
   private String Combo_clicodto_Internalname ;
   private String edtavBardisnumfrom_Internalname ;
   private String TempTags ;
   private String edtavBardisnumfrom_Jsonclick ;
   private String edtavBardisnumto_Internalname ;
   private String edtavBardisnumto_Jsonclick ;
   private String edtavBarsitfrom_Internalname ;
   private String edtavBarsitfrom_Jsonclick ;
   private String edtavBarsitto_Internalname ;
   private String edtavBarsitto_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String edtavBarfecclifrom_Internalname ;
   private String edtavBarfecclifrom_Jsonclick ;
   private String edtavBarfecclito_Internalname ;
   private String edtavBarfecclito_Jsonclick ;
   private String divUnnamedtable15_Internalname ;
   private String edtavBarfecgenfrom_Internalname ;
   private String edtavBarfecgenfrom_Jsonclick ;
   private String edtavBarfecgento_Internalname ;
   private String edtavBarfecgento_Jsonclick ;
   private String divUnnamedtable16_Internalname ;
   private String edtavBarfecfprfrom_Internalname ;
   private String edtavBarfecfprfrom_Jsonclick ;
   private String edtavBarfecfprto_Internalname ;
   private String edtavBarfecfprto_Jsonclick ;
   private String divUnnamedtable17_Internalname ;
   private String edtavBarfecsalfrom_Internalname ;
   private String edtavBarfecsalfrom_Jsonclick ;
   private String edtavBarfecsalto_Internalname ;
   private String edtavBarfecsalto_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String edtavBarcolnomfrom_Internalname ;
   private String edtavBarcolnomfrom_Jsonclick ;
   private String edtavBarcolnumfrom_Internalname ;
   private String edtavBarcolnumfrom_Jsonclick ;
   private String edtavBarcolnomto_Internalname ;
   private String edtavBarcolnomto_Jsonclick ;
   private String edtavBarcolnumto_Internalname ;
   private String edtavBarcolnumto_Jsonclick ;
   private String divUnnamedtable13_Internalname ;
   private String edtavBarnomclifrom_Internalname ;
   private String edtavBarnomclifrom_Jsonclick ;
   private String edtavBarnumclifrom_Internalname ;
   private String edtavBarnumclifrom_Jsonclick ;
   private String edtavBarnomclito_Internalname ;
   private String edtavBarnomclito_Jsonclick ;
   private String edtavBarnumclito_Internalname ;
   private String edtavBarnumclito_Jsonclick ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String edtavBarserfrom_Internalname ;
   private String edtavBarserfrom_Jsonclick ;
   private String edtavBarserto_Internalname ;
   private String edtavBarserto_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String divTablesplittedbartipartfrom_Internalname ;
   private String lblTextblockcombo_bartipartfrom_Internalname ;
   private String lblTextblockcombo_bartipartfrom_Jsonclick ;
   private String Combo_bartipartfrom_Caption ;
   private String Combo_bartipartfrom_Internalname ;
   private String divTablesplittedbartipartto_Internalname ;
   private String lblTextblockcombo_bartipartto_Internalname ;
   private String lblTextblockcombo_bartipartto_Jsonclick ;
   private String Combo_bartipartto_Caption ;
   private String Combo_bartipartto_Internalname ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtavBarcodfrom_Internalname ;
   private String edtavBarcodfrom_Jsonclick ;
   private String edtavBarcodreofrom_Internalname ;
   private String edtavBarcodreofrom_Jsonclick ;
   private String edtavBarcodparfrom_Internalname ;
   private String edtavBarcodparfrom_Jsonclick ;
   private String edtavBarcodto_Internalname ;
   private String edtavBarcodto_Jsonclick ;
   private String edtavBarcodreoto_Internalname ;
   private String edtavBarcodreoto_Jsonclick ;
   private String edtavBarcodparto_Internalname ;
   private String edtavBarcodparto_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String divCombo_cod_idtx_cell_Internalname ;
   private String divCombo_cod_idtx_cell_Class ;
   private String divTablesplittedcod_idtx_Internalname ;
   private String lblTextblockcombo_cod_idtx_Internalname ;
   private String lblTextblockcombo_cod_idtx_Jsonclick ;
   private String Combo_cod_idtx_Caption ;
   private String Combo_cod_idtx_Internalname ;
   private String edtavBargirar_Internalname ;
   private String edtavBargirar_Jsonclick ;
   private String divMuestras_cell_Internalname ;
   private String divMuestras_cell_Class ;
   private String AV78Muestras ;
   private String divTable_acciones_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnsearch_Internalname ;
   private String bttBtnsearch_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String Datamon_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String edtavBartipartfrom_Internalname ;
   private String edtavBartipartfrom_Jsonclick ;
   private String edtavBartipartto_Internalname ;
   private String edtavBartipartto_Jsonclick ;
   private String edtavCod_idtx_Internalname ;
   private String edtavCod_idtx_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCP_ID_Internalname ;
   private String A14328CP_EMPRCOD ;
   private String edtCP_EMPRCOD_Internalname ;
   private String edtCP_CLICOD_Internalname ;
   private String edtCP_CLINOM_Internalname ;
   private String edtCP_BARCOD_Internalname ;
   private String edtCP_BARCODR_Internalname ;
   private String A14303CP_BARCODP ;
   private String edtCP_BARCODP_Internalname ;
   private String edtCP_BARFECF_Internalname ;
   private String edtCP_BARNUMC_Internalname ;
   private String A14306CP_BARPLF ;
   private String edtCP_BARPLF_Internalname ;
   private String edtCP_BARSIT_Internalname ;
   private String edtCP_BARFECG_Internalname ;
   private String edtCP_BARFECC_Internalname ;
   private String edtCP_BARFECS_Internalname ;
   private String A14311CP_BARSER ;
   private String edtCP_BARSER_Internalname ;
   private String edtCP_BARSERD_Internalname ;
   private String A14331CP_BARCOLO ;
   private String edtCP_BARCOLO_Internalname ;
   private String edtCP_BARCOLU_Internalname ;
   private String edtCP_BARNOMC_Internalname ;
   private String edtCP_BARTIPA_Internalname ;
   private String edtCP_TARTDSC_Internalname ;
   private String edtCP_BARGIRA_Internalname ;
   private String edtCP_BARACAA_Internalname ;
   private String A14319CP_BARAGRE ;
   private String edtCP_BARAGRE_Internalname ;
   private String scmdbuf ;
   private String lV132TFCP_BARCOLO ;
   private String AV128TFBarPlf ;
   private String A14324CP_BARDISN ;
   private String A14323CP_BARPROP ;
   private String hsh ;
   private String AV124Station ;
   private String GXv_char2[] ;
   private String AV126EmprNom ;
   private String AV127UsurCod ;
   private String GXt_char10 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A830TipArtDsc ;
   private String A6014TipArtDsc2 ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String tblTableagrupadas_modal_Internalname ;
   private String Agrupadas_modal_Internalname ;
   private String tblTablepiezas_modal_Internalname ;
   private String Piezas_modal_Internalname ;
   private String tblTablepackinglist_modal_Internalname ;
   private String Packinglist_modal_Internalname ;
   private String tblTablepartesproduccion_modal_Internalname ;
   private String Partesproduccion_modal_Internalname ;
   private String tblTablerecetas_modal_Internalname ;
   private String Recetas_modal_Internalname ;
   private String tblTableconsultaalbaransalida_modal_Internalname ;
   private String Consultaalbaransalida_modal_Internalname ;
   private String tblTablesituacionfases_modal_Internalname ;
   private String Situacionfases_modal_Internalname ;
   private String sGXsfl_274_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCP_ID_Jsonclick ;
   private String edtCP_EMPRCOD_Jsonclick ;
   private String edtCP_CLICOD_Jsonclick ;
   private String edtCP_CLINOM_Jsonclick ;
   private String edtCP_BARCOD_Jsonclick ;
   private String edtCP_BARCODR_Jsonclick ;
   private String edtCP_BARCODP_Jsonclick ;
   private String edtCP_BARFECF_Jsonclick ;
   private String edtCP_BARNUMC_Jsonclick ;
   private String edtCP_BARPLF_Jsonclick ;
   private String edtCP_BARSIT_Jsonclick ;
   private String edtCP_BARFECG_Jsonclick ;
   private String edtCP_BARFECC_Jsonclick ;
   private String edtCP_BARFECS_Jsonclick ;
   private String edtCP_BARSER_Jsonclick ;
   private String edtCP_BARSERD_Jsonclick ;
   private String edtCP_BARCOLO_Jsonclick ;
   private String edtCP_BARCOLU_Jsonclick ;
   private String edtCP_BARNOMC_Jsonclick ;
   private String edtCP_BARTIPA_Jsonclick ;
   private String edtCP_TARTDSC_Jsonclick ;
   private String edtCP_BARGIRA_Jsonclick ;
   private String edtCP_BARACAA_Jsonclick ;
   private String edtCP_BARAGRE_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV103BarFecClifrom ;
   private java.util.Date AV104BarFecClito ;
   private java.util.Date AV101BarFecGenfrom ;
   private java.util.Date AV102BarFecGento ;
   private java.util.Date AV99BarFecFprfrom ;
   private java.util.Date AV100BarFecFprto ;
   private java.util.Date AV97BarFecSalfrom ;
   private java.util.Date AV98BarFecSalto ;
   private java.util.Date A14304CP_BARFECF ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14310CP_BARFECS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV73LoadGridData ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean Combo_cod_idtx_Visible ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
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
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean bGXsfl_274_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV130TempBoolean ;
   private boolean Cond_result ;
   private boolean n10888Dsc_Idtx ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private String AV136TFCP_TARTDSC ;
   private String AV137TFCP_TARTDSC_Sel ;
   private String A14327CP_CLINOM ;
   private String A14312CP_BARSERD ;
   private String A14315CP_BARNOMC ;
   private String A14343CP_TARTDSC ;
   private String A14317CP_BARGIRA ;
   private String lV136TFCP_TARTDSC ;
   private String A13810Dsc_IdtxID ;
   private String A13788TipArtCodD ;
   private String A13735CliCNom ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucCombo_bartipartfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_bartipartto ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucCombo_cod_idtx ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucAgrupadas_modal ;
   private com.genexus.webpanels.GXUserControl ucPiezas_modal ;
   private com.genexus.webpanels.GXUserControl ucPackinglist_modal ;
   private com.genexus.webpanels.GXUserControl ucPartesproduccion_modal ;
   private com.genexus.webpanels.GXUserControl ucRecetas_modal ;
   private com.genexus.webpanels.GXUserControl ucConsultaalbaransalida_modal ;
   private com.genexus.webpanels.GXUserControl ucSituacionfases_modal ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavMuestras ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private String[] H026F2_A14323CP_BARPROP ;
   private String[] H026F2_A14324CP_BARDISN ;
   private java.math.BigDecimal[] H026F2_A14336CP_BARKGM ;
   private java.math.BigDecimal[] H026F2_A14337CP_BARMTR ;
   private String[] H026F2_A14319CP_BARAGRE ;
   private short[] H026F2_A14318CP_BARACAA ;
   private String[] H026F2_A14317CP_BARGIRA ;
   private String[] H026F2_A14343CP_TARTDSC ;
   private short[] H026F2_A14316CP_BARTIPA ;
   private String[] H026F2_A14315CP_BARNOMC ;
   private int[] H026F2_A14332CP_BARCOLU ;
   private String[] H026F2_A14331CP_BARCOLO ;
   private String[] H026F2_A14312CP_BARSERD ;
   private String[] H026F2_A14311CP_BARSER ;
   private java.util.Date[] H026F2_A14310CP_BARFECS ;
   private java.util.Date[] H026F2_A14309CP_BARFECC ;
   private java.util.Date[] H026F2_A14308CP_BARFECG ;
   private byte[] H026F2_A14307CP_BARSIT ;
   private String[] H026F2_A14306CP_BARPLF ;
   private int[] H026F2_A14305CP_BARNUMC ;
   private java.util.Date[] H026F2_A14304CP_BARFECF ;
   private String[] H026F2_A14303CP_BARCODP ;
   private byte[] H026F2_A14302CP_BARCODR ;
   private int[] H026F2_A14301CP_BARCOD ;
   private String[] H026F2_A14327CP_CLINOM ;
   private int[] H026F2_A14326CP_CLICOD ;
   private String[] H026F2_A14328CP_EMPRCOD ;
   private long[] H026F2_A14297CP_ID ;
   private long[] H026F3_AGRID_nRecordCount ;
   private String[] H026F4_A396EmprCod ;
   private String[] H026F4_A13810Dsc_IdtxID ;
   private String[] H026F4_A10887Cod_Idtx ;
   private String[] H026F4_A10888Dsc_Idtx ;
   private boolean[] H026F4_n10888Dsc_Idtx ;
   private String[] H026F5_A396EmprCod ;
   private String[] H026F5_A13788TipArtCodD ;
   private short[] H026F5_A829TipArtCod ;
   private String[] H026F5_A830TipArtDsc ;
   private boolean[] H026F5_n830TipArtDsc ;
   private String[] H026F5_A6014TipArtDsc2 ;
   private boolean[] H026F5_n6014TipArtDsc2 ;
   private String[] H026F6_A396EmprCod ;
   private String[] H026F6_A13788TipArtCodD ;
   private short[] H026F6_A829TipArtCod ;
   private String[] H026F6_A830TipArtDsc ;
   private boolean[] H026F6_n830TipArtDsc ;
   private String[] H026F6_A6014TipArtDsc2 ;
   private boolean[] H026F6_n6014TipArtDsc2 ;
   private String[] H026F7_A396EmprCod ;
   private String[] H026F7_A10045CliAct ;
   private String[] H026F7_A13735CliCNom ;
   private int[] H026F7_A252CliCod ;
   private String[] H026F7_A279CliNom ;
   private String[] H026F8_A396EmprCod ;
   private String[] H026F8_A10045CliAct ;
   private String[] H026F8_A13735CliCNom ;
   private int[] H026F8_A252CliCod ;
   private String[] H026F8_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV115CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV116CliCodto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV113BarTipArtfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV114BarTipArtto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV111Cod_Idtx_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState11[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV69DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV112Combo_DataItem ;
}

final  class conproducww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H026F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV133TFCP_BARCOLO_Sel ,
                                          String AV132TFCP_BARCOLO ,
                                          int AV134TFCP_BARCOLU ,
                                          int AV135TFCP_BARCOLU_To ,
                                          String AV137TFCP_TARTDSC_Sel ,
                                          String AV136TFCP_TARTDSC ,
                                          boolean AV73LoadGridData ,
                                          String AV107BarDisNumfrom ,
                                          String AV108BarDisNumto ,
                                          int AV105CliCodfrom ,
                                          int AV106CliCodto ,
                                          byte AV109BarSitfrom ,
                                          byte AV110BarSitto ,
                                          java.util.Date AV101BarFecGenfrom ,
                                          java.util.Date AV102BarFecGento ,
                                          java.util.Date AV97BarFecSalfrom ,
                                          java.util.Date AV98BarFecSalto ,
                                          java.util.Date AV103BarFecClifrom ,
                                          java.util.Date AV104BarFecClito ,
                                          java.util.Date AV99BarFecFprfrom ,
                                          java.util.Date AV100BarFecFprto ,
                                          String AV87BarSerfrom ,
                                          String AV88BarSerto ,
                                          String AV93BarColNomfrom ,
                                          String AV95BarColNomto ,
                                          int AV94BarColNumfrom ,
                                          int AV96BarColNumto ,
                                          String AV89BarNomClifrom ,
                                          String AV91BarNomClito ,
                                          int AV90BarNumClifrom ,
                                          int AV92BarNumClito ,
                                          short AV85BarTipArtfrom ,
                                          short AV86BarTipArtto ,
                                          String AV128TFBarPlf ,
                                          int AV79BarCodfrom ,
                                          int AV82BarCodto ,
                                          byte AV80BarCodReofrom ,
                                          byte AV83BarCodReoto ,
                                          String AV81BarCodParfrom ,
                                          String AV84BarCodParto ,
                                          String AV76Cod_Idtx ,
                                          String AV77BarGirar ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14343CP_TARTDSC ,
                                          long A14297CP_ID ,
                                          String A14324CP_BARDISN ,
                                          int A14326CP_CLICOD ,
                                          byte A14307CP_BARSIT ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          String A14311CP_BARSER ,
                                          String A14315CP_BARNOMC ,
                                          int A14305CP_BARNUMC ,
                                          short A14316CP_BARTIPA ,
                                          String A14306CP_BARPLF ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14323CP_BARPROP ,
                                          String A14317CP_BARGIRA ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV125EmprCod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[47];
      Object[] GXv_Object13 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " CP_BARPROP, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARAGRE, CP_BARACAA, CP_BARGIRA, CP_TARTDSC, CP_BARTIPA, CP_BARNOMC, CP_BARCOLU, CP_BARCOLO, CP_BARSERD, CP_BARSER," ;
      sSelectString += " CP_BARFECS, CP_BARFECC, CP_BARFECG, CP_BARSIT, CP_BARPLF, CP_BARNUMC, CP_BARFECF, CP_BARCODP, CP_BARCODR, CP_BARCOD, CP_CLINOM, CP_CLICOD, CP_EMPRCOD, CP_ID" ;
      sFromString = " FROM TXPCONPRO" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( (GXutil.strcmp("", AV133TFCP_BARCOLO_Sel)==0) && ( ! (GXutil.strcmp("", AV132TFCP_BARCOLO)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CP_BARCOLO) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133TFCP_BARCOLO_Sel)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO = ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV134TFCP_BARCOLU) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV135TFCP_BARCOLU_To) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137TFCP_TARTDSC_Sel)==0) && ( ! (GXutil.strcmp("", AV136TFCP_TARTDSC)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CP_TARTDSC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137TFCP_TARTDSC_Sel)==0) )
      {
         addWhere(sWhereString, "(CP_TARTDSC = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! AV73LoadGridData )
      {
         addWhere(sWhereString, "(CP_ID IS NULL and Not CP_ID IS NULL)");
      }
      if ( ! (GXutil.strcmp("", AV107BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV105CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV106CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV109BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV110BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV94BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV96BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV90BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV92BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV86BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (0==AV82BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (0==AV83BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_EMPRCOD" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_EMPRCOD DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_CLICOD" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_CLICOD DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_CLINOM" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_CLINOM DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARFECF" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARFECF DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARNUMC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARNUMC DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARSIT" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARSIT DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARFECG" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARFECG DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARFECC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARFECC DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARFECS" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARFECS DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARSER" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARSER DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARSERD" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARSERD DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARCOLO" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARCOLO DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARCOLU" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARCOLU DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARNOMC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARNOMC DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARTIPA" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARTIPA DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_TARTDSC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_TARTDSC DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARGIRA" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARGIRA DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARACAA" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARACAA DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY CP_BARAGRE" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY CP_BARAGRE DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY CP_ID" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_H026F3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV133TFCP_BARCOLO_Sel ,
                                          String AV132TFCP_BARCOLO ,
                                          int AV134TFCP_BARCOLU ,
                                          int AV135TFCP_BARCOLU_To ,
                                          String AV137TFCP_TARTDSC_Sel ,
                                          String AV136TFCP_TARTDSC ,
                                          boolean AV73LoadGridData ,
                                          String AV107BarDisNumfrom ,
                                          String AV108BarDisNumto ,
                                          int AV105CliCodfrom ,
                                          int AV106CliCodto ,
                                          byte AV109BarSitfrom ,
                                          byte AV110BarSitto ,
                                          java.util.Date AV101BarFecGenfrom ,
                                          java.util.Date AV102BarFecGento ,
                                          java.util.Date AV97BarFecSalfrom ,
                                          java.util.Date AV98BarFecSalto ,
                                          java.util.Date AV103BarFecClifrom ,
                                          java.util.Date AV104BarFecClito ,
                                          java.util.Date AV99BarFecFprfrom ,
                                          java.util.Date AV100BarFecFprto ,
                                          String AV87BarSerfrom ,
                                          String AV88BarSerto ,
                                          String AV93BarColNomfrom ,
                                          String AV95BarColNomto ,
                                          int AV94BarColNumfrom ,
                                          int AV96BarColNumto ,
                                          String AV89BarNomClifrom ,
                                          String AV91BarNomClito ,
                                          int AV90BarNumClifrom ,
                                          int AV92BarNumClito ,
                                          short AV85BarTipArtfrom ,
                                          short AV86BarTipArtto ,
                                          String AV128TFBarPlf ,
                                          int AV79BarCodfrom ,
                                          int AV82BarCodto ,
                                          byte AV80BarCodReofrom ,
                                          byte AV83BarCodReoto ,
                                          String AV81BarCodParfrom ,
                                          String AV84BarCodParto ,
                                          String AV76Cod_Idtx ,
                                          String AV77BarGirar ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14343CP_TARTDSC ,
                                          long A14297CP_ID ,
                                          String A14324CP_BARDISN ,
                                          int A14326CP_CLICOD ,
                                          byte A14307CP_BARSIT ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          String A14311CP_BARSER ,
                                          String A14315CP_BARNOMC ,
                                          int A14305CP_BARNUMC ,
                                          short A14316CP_BARTIPA ,
                                          String A14306CP_BARPLF ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14323CP_BARPROP ,
                                          String A14317CP_BARGIRA ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV125EmprCod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[42];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( (GXutil.strcmp("", AV133TFCP_BARCOLO_Sel)==0) && ( ! (GXutil.strcmp("", AV132TFCP_BARCOLO)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CP_BARCOLO) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133TFCP_BARCOLO_Sel)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO = ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV134TFCP_BARCOLU) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV135TFCP_BARCOLU_To) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137TFCP_TARTDSC_Sel)==0) && ( ! (GXutil.strcmp("", AV136TFCP_TARTDSC)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CP_TARTDSC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137TFCP_TARTDSC_Sel)==0) )
      {
         addWhere(sWhereString, "(CP_TARTDSC = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! AV73LoadGridData )
      {
         addWhere(sWhereString, "(CP_ID IS NULL and Not CP_ID IS NULL)");
      }
      if ( ! (GXutil.strcmp("", AV107BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV105CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV106CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV109BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV110BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV94BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV96BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV90BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV92BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV85BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV86BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV79BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV82BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV83BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_H026F2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Boolean) dynConstraints[6]).booleanValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).longValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).byteValue() , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).byteValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , ((Boolean) dynConstraints[64]).booleanValue() , (String)dynConstraints[65] , (String)dynConstraints[66] );
            case 1 :
                  return conditional_H026F3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Boolean) dynConstraints[6]).booleanValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).longValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).byteValue() , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (java.util.Date)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).byteValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , ((Boolean) dynConstraints[64]).booleanValue() , (String)dynConstraints[65] , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H026F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026F3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026F4", "SELECT EmprCod, RTRIM(LTRIM(Cod_Idtx)) || '-' || RTRIM(LTRIM(COALESCE( Dsc_Idtx, ''))) AS Dsc_IdtxID, Cod_Idtx, Dsc_Idtx FROM TXPINDITE ORDER BY Dsc_IdtxID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026F5", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026F6", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026F7", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026F8", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 16);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((String[]) buf[24])[0] = rslt.getVarchar(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 3);
               ((long[]) buf[27])[0] = rslt.getLong(28);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
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
                  stmt.setString(sIdx, (String)parms[47], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[83]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 20);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               return;
      }
   }

}

