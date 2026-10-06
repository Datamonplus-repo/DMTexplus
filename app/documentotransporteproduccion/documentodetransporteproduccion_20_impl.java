package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_20_impl extends GXDataArea
{
   public documentodetransporteproduccion_20_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_20_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_20_impl.class ));
   }

   public documentodetransporteproduccion_20_impl( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbenvftp = new HTMLChoice();
      chkavClifacmtsp = UIFactory.getCheckbox(this);
      cmbavAlbproval = new HTMLChoice();
      chkavBartipcor = UIFactory.getCheckbox(this);
      cmbavGridactiongroup1 = new HTMLChoice();
      cmbAlbProVal = new HTMLChoice();
      cmbavBarestreo = new HTMLChoice();
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
            AV22EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV23AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23AlbProCod), 10, 0));
               AV25Guiremcli = (int)(GXutil.lval( httpContext.GetPar( "Guiremcli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Guiremcli), 6, 0));
               AV26GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26GuiRemCln", AV26GuiRemCln);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26GuiRemCln, ""))));
               AV27AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27AlbProFch", localUtil.format(AV27AlbProFch, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV27AlbProFch));
               AV28AlbSec = httpContext.GetPar( "AlbSec") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28AlbSec", AV28AlbSec);
               AV29AlbProPri = httpContext.GetPar( "AlbProPri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29AlbProPri", AV29AlbProPri);
               AV30AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30AlbEnvFtp", GXutil.str( AV30AlbEnvFtp, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30AlbEnvFtp), "9")));
               AV31AlbLic = httpContext.GetPar( "AlbLic") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31AlbLic", AV31AlbLic);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31AlbLic, ""))));
               AV73AlbHhfm = localUtil.parseDTimeParm( httpContext.GetPar( "AlbHhfm")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV73AlbHhfm", localUtil.ttoc( AV73AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV72AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV72AlbProEst", GXutil.str( AV72AlbProEst, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV72AlbProEst), "9")));
               AV74Hash = httpContext.GetPar( "Hash") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV74Hash", AV74Hash);
               AV75ok = GXutil.strtobool( httpContext.GetPar( "ok")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV75ok", AV75ok);
               AV76Messages_json = httpContext.GetPar( "Messages_json") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV76Messages_json", AV76Messages_json);
               AV71CliFacMtsP = httpContext.GetPar( "CliFacMtsP") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV71CliFacMtsP", AV71CliFacMtsP);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71CliFacMtsP, ""))));
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
      nRC_GXsfl_182 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_182"))) ;
      nGXsfl_182_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_182_idx"))) ;
      sGXsfl_182_idx = httpContext.GetPar( "sGXsfl_182_idx") ;
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
      AV22EmprCod = httpContext.GetPar( "EmprCod") ;
      AV23AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      AV14TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV15TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV43TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV44TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV45TFAlbSer = httpContext.GetPar( "TFAlbSer") ;
      AV46TFAlbSer_Sel = httpContext.GetPar( "TFAlbSer_Sel") ;
      AV47TFAlbSerD = httpContext.GetPar( "TFAlbSerD") ;
      AV48TFAlbSerD_Sel = httpContext.GetPar( "TFAlbSerD_Sel") ;
      AV49TFAlbColNom = httpContext.GetPar( "TFAlbColNom") ;
      AV50TFAlbColNom_Sel = httpContext.GetPar( "TFAlbColNom_Sel") ;
      AV51TFAlbColNum = (int)(GXutil.lval( httpContext.GetPar( "TFAlbColNum"))) ;
      AV52TFAlbColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbColNum_To"))) ;
      AV53TFAlbTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFAlbTipCol"))) ;
      AV54TFAlbTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFAlbTipCol_To"))) ;
      AV55TFAlbNomCli = httpContext.GetPar( "TFAlbNomCli") ;
      AV56TFAlbNomCli_Sel = httpContext.GetPar( "TFAlbNomCli_Sel") ;
      AV16TFBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE"), ".") ;
      AV17TFBarAlbKgmE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE_To"), ".") ;
      AV57TFAlbHdrAnc = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc"))) ;
      AV58TFAlbHdrAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc_To"))) ;
      AV59TFAlbHdrgm2 = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2"))) ;
      AV60TFAlbHdrgm2_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2_To"))) ;
      AV61TFBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE"), ".") ;
      AV62TFBarAlbMtrE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE_To"), ".") ;
      AV63TFBarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie"))) ;
      AV64TFBarAlbPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie_To"))) ;
      AV65TFTubCod = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod"))) ;
      AV66TFTubCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod_To"))) ;
      AV67TFBarAlbTub = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub"))) ;
      AV68TFBarAlbTub_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV70TFAlbProVal_Sels);
      AV126TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV127TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV97Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV139Pgmname = httpContext.GetPar( "Pgmname") ;
      AV32OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV12OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV71CliFacMtsP = httpContext.GetPar( "CliFacMtsP") ;
      AV91BarTipCor = httpContext.GetPar( "BarTipCor") ;
      AV72AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
      AV104FlagFas = (short)(GXutil.lval( httpContext.GetPar( "FlagFas"))) ;
      AV118Mensaje = httpContext.GetPar( "Mensaje") ;
      AV27AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
      AV105Nofases = (short)(GXutil.lval( httpContext.GetPar( "Nofases"))) ;
      AV125ImpCod = httpContext.GetPar( "ImpCod") ;
      AV26GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
      AV99errkgs = (short)(GXutil.lval( httpContext.GetPar( "errkgs"))) ;
      cmbavAlbenvftp.fromJSonString( httpContext.GetNextPar( ));
      AV30AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
      AV31AlbLic = httpContext.GetPar( "AlbLic") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV22EmprCod, AV23AlbProCod, AV14TFBarNHdr, AV15TFBarNHdr_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV45TFAlbSer, AV46TFAlbSer_Sel, AV47TFAlbSerD, AV48TFAlbSerD_Sel, AV49TFAlbColNom, AV50TFAlbColNom_Sel, AV51TFAlbColNum, AV52TFAlbColNum_To, AV53TFAlbTipCol, AV54TFAlbTipCol_To, AV55TFAlbNomCli, AV56TFAlbNomCli_Sel, AV16TFBarAlbKgmE, AV17TFBarAlbKgmE_To, AV57TFAlbHdrAnc, AV58TFAlbHdrAnc_To, AV59TFAlbHdrgm2, AV60TFAlbHdrgm2_To, AV61TFBarAlbMtrE, AV62TFBarAlbMtrE_To, AV63TFBarAlbPie, AV64TFBarAlbPie_To, AV65TFTubCod, AV66TFTubCod_To, AV67TFBarAlbTub, AV68TFBarAlbTub_To, AV70TFAlbProVal_Sels, AV126TFBarSit, AV127TFBarSit_To, AV97Moda21, AV139Pgmname, AV32OrderedBy, AV12OrderedDsc, AV71CliFacMtsP, AV91BarTipCor, AV72AlbProEst, AV104FlagFas, AV118Mensaje, AV27AlbProFch, AV105Nofases, AV125ImpCod, AV26GuiRemCln, AV99errkgs, AV30AlbEnvFtp, AV31AlbLic) ;
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
      pa2942( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2942( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_20", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV26GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV27AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV28AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV29AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV30AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV31AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV73AlbHhfm)),GXutil.URLEncode(GXutil.ltrimstr(AV72AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV74Hash)),GXutil.URLEncode(GXutil.booltostr(AV75ok)),GXutil.URLEncode(GXutil.rtrim(AV76Messages_json)),GXutil.URLEncode(GXutil.rtrim(AV71CliFacMtsP))}, new String[] {"EmprCod","AlbProCod","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic","AlbHhfm","AlbProEst","Hash","ok","Messages_json","CliFacMtsP"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV104FlagFas), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENSAJE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV118Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOFASES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105Nofases), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV99errkgs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26GuiRemCln, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV27AlbProFch));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31AlbLic, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV72AlbProEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71CliFacMtsP, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_20");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV139Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_20:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_182", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_182, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTUBCOD_DATA", AV100TubCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTUBCOD_DATA", AV100TubCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV20GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV21GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR", GXutil.rtrim( AV14TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR_SEL", GXutil.rtrim( AV15TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDIDOCLIENTE", GXutil.rtrim( AV43TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV44TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBSER", GXutil.rtrim( AV45TFAlbSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBSER_SEL", GXutil.rtrim( AV46TFAlbSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBSERD", GXutil.rtrim( AV47TFAlbSerD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBSERD_SEL", GXutil.rtrim( AV48TFAlbSerD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOLNOM", GXutil.rtrim( AV49TFAlbColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOLNOM_SEL", GXutil.rtrim( AV50TFAlbColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOLNUM", GXutil.ltrim( localUtil.ntoc( AV51TFAlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV52TFAlbColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBTIPCOL", GXutil.ltrim( localUtil.ntoc( AV53TFAlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV54TFAlbTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBNOMCLI", GXutil.rtrim( AV55TFAlbNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBNOMCLI_SEL", GXutil.rtrim( AV56TFAlbNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV16TFBarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBKGME_TO", GXutil.ltrim( localUtil.ntoc( AV17TFBarAlbKgmE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRANC", GXutil.ltrim( localUtil.ntoc( AV57TFAlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRANC_TO", GXutil.ltrim( localUtil.ntoc( AV58TFAlbHdrAnc_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRGM2", GXutil.ltrim( localUtil.ntoc( AV59TFAlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRGM2_TO", GXutil.ltrim( localUtil.ntoc( AV60TFAlbHdrgm2_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV61TFBarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBMTRE_TO", GXutil.ltrim( localUtil.ntoc( AV62TFBarAlbMtrE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV63TFBarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPIE_TO", GXutil.ltrim( localUtil.ntoc( AV64TFBarAlbPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTUBCOD", GXutil.ltrim( localUtil.ntoc( AV65TFTubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTUBCOD_TO", GXutil.ltrim( localUtil.ntoc( AV66TFTubCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBTUB", GXutil.ltrim( localUtil.ntoc( AV67TFBarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBTUB_TO", GXutil.ltrim( localUtil.ntoc( AV68TFBarAlbTub_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROVAL_SELS", AV70TFAlbProVal_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROVAL_SELS", AV70TFAlbProVal_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV126TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV127TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV97Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV32OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV12OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROEST", GXutil.ltrim( localUtil.ntoc( AV72AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV72AlbProEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV22EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFAS", GXutil.ltrim( localUtil.ntoc( AV104FlagFas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV104FlagFas), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV79UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV80Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV118Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENSAJE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV118Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH", localUtil.dtoc( AV27AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV27AlbProFch));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOFASES", GXutil.ltrim( localUtil.ntoc( AV105Nofases, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOFASES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105Nofases), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBHHFM", localUtil.ttoc( AV73AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV125ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLN", GXutil.rtrim( AV26GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26GuiRemCln, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRKGS", GXutil.ltrim( localUtil.ntoc( AV99errkgs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV99errkgs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV28AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV74Hash);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vOK", AV75ok);
      app.GxWebStd.gx_hidden_field( httpContext, "vMESSAGES_JSON", AV76Messages_json);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Cls", GXutil.rtrim( Combo_tubcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Selectedvalue_set", GXutil.rtrim( Combo_tubcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Emptyitemtext", GXutil.rtrim( Combo_tubcod_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Selectedvalue_get", GXutil.rtrim( Combo_tubcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we2942( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2942( ) ;
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_20", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV26GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV27AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV28AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV29AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV30AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV31AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV73AlbHhfm)),GXutil.URLEncode(GXutil.ltrimstr(AV72AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV74Hash)),GXutil.URLEncode(GXutil.booltostr(AV75ok)),GXutil.URLEncode(GXutil.rtrim(AV76Messages_json)),GXutil.URLEncode(GXutil.rtrim(AV71CliFacMtsP))}, new String[] {"EmprCod","AlbProCod","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic","AlbHhfm","AlbProEst","Hash","ok","Messages_json","CliFacMtsP"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_20" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Detalle de Producciones", "") ;
   }

   public void wb2940( )
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
         ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
         ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
         ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
         ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
         ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
         ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
         ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
         ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
         ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
         ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
         ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV23AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcli_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV25Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25Guiremcli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25Guiremcli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbpropri_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbpropri_Internalname, httpContext.getMessage( "Prioridad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbpropri_Internalname, GXutil.rtrim( AV29AlbProPri), GXutil.rtrim( localUtil.format( AV29AlbProPri, "9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbpropri_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbpropri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlblic_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlblic_Internalname, httpContext.getMessage( "Codigo AT", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlblic_Internalname, GXutil.rtrim( AV31AlbLic), GXutil.rtrim( localUtil.format( AV31AlbLic, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlblic_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlblic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbenvftp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbenvftp.getInternalname(), httpContext.getMessage( "AT", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbenvftp, cmbavAlbenvftp.getInternalname(), GXutil.trim( GXutil.str( AV30AlbEnvFtp, 1, 0)), 1, cmbavAlbenvftp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavAlbenvftp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         cmbavAlbenvftp.setValue( GXutil.trim( GXutil.str( AV30AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Values", cmbavAlbenvftp.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavClifacmtsp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavClifacmtsp.getInternalname(), httpContext.getMessage( "Fatura Metros PL?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavClifacmtsp.getInternalname(), AV71CliFacMtsP, "", httpContext.getMessage( "Fatura Metros PL?", ""), 1, chkavClifacmtsp.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº OS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV24BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV77Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV77Prompt)==0)&&(GXutil.strcmp("", AV140Prompt_GXI)==0))||!(GXutil.strcmp("", AV77Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV77Prompt)==0) ? AV140Prompt_GXI : httpContext.getResourceRelative(AV77Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV77Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV33BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV33BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV34BarCodPar), GXutil.rtrim( localUtil.format( AV34BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbkgme_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbkgme_Internalname, httpContext.getMessage( "Quilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbkgme_Internalname, GXutil.ltrim( localUtil.ntoc( AV35BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbkgme_Enabled!=0) ? localUtil.format( AV35BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( AV35BarAlbKgmE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbkgme_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbkgme_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbhdranc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbhdranc_Internalname, httpContext.getMessage( "Larg.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhdranc_Internalname, GXutil.ltrim( localUtil.ntoc( AV36AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbhdranc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36AlbHdrAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV36AlbHdrAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhdranc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbhdranc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbhdrgm2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbhdrgm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhdrgm2_Internalname, GXutil.ltrim( localUtil.ntoc( AV37AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbhdrgm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV37AlbHdrgm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV37AlbHdrgm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhdrgm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbhdrgm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbmtre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbmtre_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbmtre_Internalname, GXutil.ltrim( localUtil.ntoc( AV38BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbmtre_Enabled!=0) ? localUtil.format( AV38BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( AV38BarAlbMtrE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbmtre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbmtre_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbpie_Internalname, httpContext.getMessage( "Pças", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV39BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39BarAlbPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39BarAlbPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbproval.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbproval.getInternalname(), httpContext.getMessage( "F?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbproval, cmbavAlbproval.getInternalname(), GXutil.rtrim( AV42AlbProVal), 1, cmbavAlbproval.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbproval.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         cmbavAlbproval.setValue( GXutil.rtrim( AV42AlbProVal) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Values", cmbavAlbproval.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtubcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tubcod_Internalname, httpContext.getMessage( "Tubo", ""), "", "", lblTextblockcombo_tubcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tubcod.setProperty("Caption", Combo_tubcod_Caption);
         ucCombo_tubcod.setProperty("Cls", Combo_tubcod_Cls);
         ucCombo_tubcod.setProperty("EmptyItemText", Combo_tubcod_Emptyitemtext);
         ucCombo_tubcod.setProperty("DropDownOptionsData", AV100TubCod_Data);
         ucCombo_tubcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tubcod_Internalname, "COMBO_TUBCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbtub_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbtub_Internalname, httpContext.getMessage( "Qtd.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbtub_Internalname, GXutil.ltrim( localUtil.ntoc( AV41BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbtub_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41BarAlbTub), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41BarAlbTub), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbtub_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbtub_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbhdrobs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbhdrobs_Internalname, httpContext.getMessage( "Observaçoes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhdrobs_Internalname, GXutil.rtrim( AV93AlbHdrObs), GXutil.rtrim( localUtil.format( AV93AlbHdrObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhdrobs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbhdrobs_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 182, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, bttBtnenter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnhashcomunicarat_Internalname, "gx.evt.setGridEvt("+GXutil.str( 182, 3, 0)+","+"null"+");", httpContext.getMessage( "Hash y Comunicar a AT", ""), bttBtnhashcomunicarat_Jsonclick, 5, httpContext.getMessage( "Hash y Comunicar a AT", ""), "", StyleString, ClassString, 1, bttBtnhashcomunicarat_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOHASHCOMUNICARAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnverpiezas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 182, 3, 0)+","+"null"+");", httpContext.getMessage( "Ver Peças", ""), bttBtnverpiezas_Jsonclick, 5, httpContext.getMessage( "Ver Peças", ""), "", StyleString, ClassString, bttBtnverpiezas_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOVERPIEZAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimirhdr_Internalname, "gx.evt.setGridEvt("+GXutil.str( 182, 3, 0)+","+"null"+");", httpContext.getMessage( "Imprimir OS", ""), bttBtnimprimirhdr_Jsonclick, 7, httpContext.getMessage( "Imprimir OS", ""), "", StyleString, ClassString, bttBtnimprimirhdr_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112941_client"+"'", TempTags, "", 2, "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpackinglist_Internalname, "gx.evt.setGridEvt("+GXutil.str( 182, 3, 0)+","+"null"+");", httpContext.getMessage( "Packing List", ""), bttBtnpackinglist_Jsonclick, 7, httpContext.getMessage( "Packing List", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e122941_client"+"'", TempTags, "", 2, "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 182, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarenccli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarenccli_Internalname, httpContext.getMessage( "Enc. Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarenccli_Internalname, GXutil.rtrim( AV89BarEncCli), GXutil.rtrim( localUtil.format( AV89BarEncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarenccli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarenccli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Artigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV83BarSer), GXutil.rtrim( localUtil.format( AV83BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,148);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Descriçao", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV84BarSerDsc), GXutil.rtrim( localUtil.format( AV84BarSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Cor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV119BarColNom), GXutil.rtrim( localUtil.format( AV119BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV120BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV120BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV120BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,160);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartipcol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartipcol_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV82BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV82BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV82BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomcli_Internalname, httpContext.getMessage( "Cor Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV86BarNomCli), GXutil.rtrim( localUtil.format( AV86BarNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,168);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavBartipcor.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavBartipcor.getInternalname(), httpContext.getMessage( "Exp?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavBartipcor.getInternalname(), AV91BarTipCor, "", httpContext.getMessage( "Exp?", ""), 1, chkavBartipcor.getEnabled(), "SI", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(172, this, 'SI', 'NO',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,172);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsit_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsit_Internalname, httpContext.getMessage( "Sit.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsit_Internalname, GXutil.ltrim( localUtil.ntoc( AV92BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV92BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV92BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol182( ) ;
      }
      if ( wbEnd == 182 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_182 = (int)(nGXsfl_182_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV139Pgmname), GXutil.rtrim( localUtil.format( AV139Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV85CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV85CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV85CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,223);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarestreo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarestreo.getInternalname(), httpContext.getMessage( "Estado Reop", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 227,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarestreo, cmbavBarestreo.getInternalname(), GXutil.trim( GXutil.str( AV90BarEstReo, 1, 0)), 1, cmbavBarestreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavBarestreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,227);\"", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         cmbavBarestreo.setValue( GXutil.trim( GXutil.str( AV90BarEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Values", cmbavBarestreo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kgs OS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV98BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV98BarKgm, "ZZZZZ9.99") : localUtil.format( AV98BarKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKilant_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKilant_Internalname, httpContext.getMessage( "Old Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKilant_Internalname, GXutil.ltrim( localUtil.ntoc( AV106KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKilant_Enabled!=0) ? localUtil.format( AV106KilAnt, "ZZZZZ9.99") : localUtil.format( AV106KilAnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,235);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKilant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKilant_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetant_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetant_Internalname, httpContext.getMessage( "Old Mts", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetant_Internalname, GXutil.ltrim( localUtil.ntoc( AV107MetAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetant_Enabled!=0) ? localUtil.format( AV107MetAnt, "ZZZZZ9.99") : localUtil.format( AV107MetAnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetant_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPieant_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPieant_Internalname, httpContext.getMessage( "Old Pzs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 243,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPieant_Internalname, GXutil.ltrim( localUtil.ntoc( AV108PieAnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPieant_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV108PieAnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV108PieAnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,243);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPieant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPieant_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcad_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcad_Internalname, httpContext.getMessage( "barcad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 247,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcad_Internalname, GXutil.ltrim( localUtil.ntoc( AV94barcad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV94barcad), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV94barcad), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,247);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcad_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbbar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbbar_Internalname, httpContext.getMessage( "albbar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbbar_Internalname, GXutil.ltrim( localUtil.ntoc( AV95albbar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbbar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV95albbar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV95albbar), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbbar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbbar_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 255,'',false,'" + sGXsfl_182_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTubcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV40TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TubCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,255);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTubcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavTubcod_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_20.htm");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_257_2942( true) ;
      }
      else
      {
         wb_table1_257_2942( false) ;
      }
      return  ;
   }

   public void wb_table1_257_2942e( boolean wbgen )
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
      if ( wbEnd == 182 )
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

   public void start2942( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Detalle de Producciones", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2940( ) ;
   }

   public void ws2942( )
   {
      start2942( ) ;
      evt2942( ) ;
   }

   public void evt2942( )
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
                           e132942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162942 ();
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
                                 e172942 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOHASHCOMUNICARAT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Dohashcomunicarat' */
                           e182942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOVERPIEZAS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoVerPiezas' */
                           e192942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e202942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e212942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e222942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROVAL.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e232942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARALBKGME.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e242942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e252942 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           nGXsfl_182_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_182_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_182_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1822( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV132GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132GridActionGroup1), 4, 0));
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A3391AlbSer = httpContext.cgiGet( edtAlbSer_Internalname) ;
                           A8879AlbSerD = httpContext.cgiGet( edtAlbSerD_Internalname) ;
                           A3392AlbColNom = httpContext.cgiGet( edtAlbColNom_Internalname) ;
                           A3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3394AlbTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A12232AlbNomCli = httpContext.cgiGet( edtAlbNomCli_Internalname) ;
                           A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
                           A3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
                           A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1206TubCod = false ;
                           A1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbAlbProVal.setName( cmbAlbProVal.getInternalname() );
                           cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
                           A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e262942 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e272942 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e282942 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e292942 ();
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

   public void we2942( )
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

   public void pa2942( )
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
            GX_FocusControl = edtavBarcod_Internalname ;
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
      subsflControlProps_1822( ) ;
      while ( nGXsfl_182_idx <= nRC_GXsfl_182 )
      {
         sendrow_1822( ) ;
         nGXsfl_182_idx = ((subGrid_Islastpage==1)&&(nGXsfl_182_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_182_idx+1) ;
         sGXsfl_182_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_182_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1822( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV22EmprCod ,
                                 long AV23AlbProCod ,
                                 String AV14TFBarNHdr ,
                                 String AV15TFBarNHdr_Sel ,
                                 String AV43TFPedidoCliente ,
                                 String AV44TFPedidoCliente_Sel ,
                                 String AV45TFAlbSer ,
                                 String AV46TFAlbSer_Sel ,
                                 String AV47TFAlbSerD ,
                                 String AV48TFAlbSerD_Sel ,
                                 String AV49TFAlbColNom ,
                                 String AV50TFAlbColNom_Sel ,
                                 int AV51TFAlbColNum ,
                                 int AV52TFAlbColNum_To ,
                                 byte AV53TFAlbTipCol ,
                                 byte AV54TFAlbTipCol_To ,
                                 String AV55TFAlbNomCli ,
                                 String AV56TFAlbNomCli_Sel ,
                                 java.math.BigDecimal AV16TFBarAlbKgmE ,
                                 java.math.BigDecimal AV17TFBarAlbKgmE_To ,
                                 short AV57TFAlbHdrAnc ,
                                 short AV58TFAlbHdrAnc_To ,
                                 short AV59TFAlbHdrgm2 ,
                                 short AV60TFAlbHdrgm2_To ,
                                 java.math.BigDecimal AV61TFBarAlbMtrE ,
                                 java.math.BigDecimal AV62TFBarAlbMtrE_To ,
                                 int AV63TFBarAlbPie ,
                                 int AV64TFBarAlbPie_To ,
                                 short AV65TFTubCod ,
                                 short AV66TFTubCod_To ,
                                 int AV67TFBarAlbTub ,
                                 int AV68TFBarAlbTub_To ,
                                 GXSimpleCollection<String> AV70TFAlbProVal_Sels ,
                                 byte AV126TFBarSit ,
                                 byte AV127TFBarSit_To ,
                                 short AV97Moda21 ,
                                 String AV139Pgmname ,
                                 short AV32OrderedBy ,
                                 boolean AV12OrderedDsc ,
                                 String AV71CliFacMtsP ,
                                 String AV91BarTipCor ,
                                 byte AV72AlbProEst ,
                                 short AV104FlagFas ,
                                 String AV118Mensaje ,
                                 java.util.Date AV27AlbProFch ,
                                 short AV105Nofases ,
                                 String AV125ImpCod ,
                                 String AV26GuiRemCln ,
                                 short AV99errkgs ,
                                 byte AV30AlbEnvFtp ,
                                 String AV31AlbLic )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e272942 ();
      GRID_nCurrentRecord = 0 ;
      rf2942( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_20");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV139Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_20:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
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
      if ( cmbavAlbenvftp.getItemCount() > 0 )
      {
         AV30AlbEnvFtp = (byte)(GXutil.lval( cmbavAlbenvftp.getValidValue(GXutil.trim( GXutil.str( AV30AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30AlbEnvFtp", GXutil.str( AV30AlbEnvFtp, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30AlbEnvFtp), "9")));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbenvftp.setValue( GXutil.trim( GXutil.str( AV30AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Values", cmbavAlbenvftp.ToJavascriptSource(), true);
      }
      AV71CliFacMtsP = ((GXutil.strcmp(GXutil.rtrim( AV71CliFacMtsP), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71CliFacMtsP", AV71CliFacMtsP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71CliFacMtsP, ""))));
      if ( cmbavAlbproval.getItemCount() > 0 )
      {
         AV42AlbProVal = cmbavAlbproval.getValidValue(AV42AlbProVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42AlbProVal", AV42AlbProVal);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbproval.setValue( GXutil.rtrim( AV42AlbProVal) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Values", cmbavAlbproval.ToJavascriptSource(), true);
      }
      AV91BarTipCor = ((GXutil.strcmp(GXutil.rtrim( AV91BarTipCor), "SI")==0) ? "SI" : "NO") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91BarTipCor", AV91BarTipCor);
      if ( cmbavBarestreo.getItemCount() > 0 )
      {
         AV90BarEstReo = (byte)(GXutil.lval( cmbavBarestreo.getValidValue(GXutil.trim( GXutil.str( AV90BarEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90BarEstReo", GXutil.str( AV90BarEstReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarestreo.setValue( GXutil.trim( GXutil.str( AV90BarEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Values", cmbavBarestreo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2942( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV139Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_20" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV139Pgmname", AV139Pgmname);
      Gx_err = (short)(0) ;
      edtavAlblic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlblic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlblic_Enabled), 5, 0), true);
      cmbavAlbenvftp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbenvftp.getEnabled(), 5, 0), true);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      chkavBartipcor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavBartipcor.getInternalname(), "Enabled", GXutil.ltrimstr( chkavBartipcor.getEnabled(), 5, 0), true);
      edtavBarsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarsit_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      cmbavBarestreo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarestreo.getEnabled(), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavKilant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKilant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilant_Enabled), 5, 0), true);
      edtavMetant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetant_Enabled), 5, 0), true);
      edtavPieant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPieant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPieant_Enabled), 5, 0), true);
      edtavBarcad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcad_Enabled), 5, 0), true);
      edtavAlbbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbbar_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV14TFBarNHdr ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV43TFPedidoCliente ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV44TFPedidoCliente_Sel ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV45TFAlbSer ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV46TFAlbSer_Sel ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV47TFAlbSerD ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV48TFAlbSerD_Sel ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV49TFAlbColNom ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV50TFAlbColNom_Sel ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV51TFAlbColNum ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV52TFAlbColNum_To ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV53TFAlbTipCol ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV54TFAlbTipCol_To ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV55TFAlbNomCli ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV56TFAlbNomCli_Sel ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV16TFBarAlbKgmE ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV17TFBarAlbKgmE_To ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV57TFAlbHdrAnc ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV58TFAlbHdrAnc_To ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV59TFAlbHdrgm2 ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV60TFAlbHdrgm2_To ;
      AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV61TFBarAlbMtrE ;
      AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV62TFBarAlbMtrE_To ;
      AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV63TFBarAlbPie ;
      AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV64TFBarAlbPie_To ;
      AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV65TFTubCod ;
      AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV66TFTubCod_To ;
      AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV67TFBarAlbTub ;
      AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV68TFBarAlbTub_To ;
      AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV70TFAlbProVal_Sels ;
      AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV126TFBarSit ;
      AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV127TFBarSit_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                           AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                           AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                           AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                           AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                           AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                           AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                           AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                           AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) ,
                                           AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                           AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                           AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                           AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) ,
                                           AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                           AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) ,
                                           Short.valueOf(AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) ,
                                           Integer.valueOf(AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) ,
                                           Byte.valueOf(AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           Byte.valueOf(A3394AlbTipCol) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(AV32OrderedBy) ,
                                           Boolean.valueOf(AV12OrderedDsc) ,
                                           AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                           AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           AV22EmprCod ,
                                           Long.valueOf(AV23AlbProCod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr), 11, "%") ;
      lV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser), 16, "%") ;
      lV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd), 26, "%") ;
      lV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom), 13, "%") ;
      lV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli), 13, "%") ;
      /* Using cursor H02942 */
      pr_default.execute(0, new Object[] {AV22EmprCod, Long.valueOf(AV23AlbProCod), lV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr, AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel, lV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser, AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel, lV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd, AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel, lV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom, AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel, Integer.valueOf(AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum), Integer.valueOf(AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to), Byte.valueOf(AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol), Byte.valueOf(AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to), lV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli, AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel, AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme, AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to, Short.valueOf(AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc), Short.valueOf(AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to), Short.valueOf(AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2), Short.valueOf(AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to), AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre, AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to, Integer.valueOf(AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie), Integer.valueOf(AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to), Short.valueOf(AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod), Short.valueOf(AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to), Integer.valueOf(AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub), Integer.valueOf(AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to), Byte.valueOf(AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit), Byte.valueOf(AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = H02942_A30AlbProCod[0] ;
         A213BarSit = H02942_A213BarSit[0] ;
         A2839AlbProVal = H02942_A2839AlbProVal[0] ;
         A1266BarAlbTub = H02942_A1266BarAlbTub[0] ;
         A1206TubCod = H02942_A1206TubCod[0] ;
         n1206TubCod = H02942_n1206TubCod[0] ;
         A1265BarAlbPie = H02942_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = H02942_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = H02942_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = H02942_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = H02942_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = H02942_A12232AlbNomCli[0] ;
         A3394AlbTipCol = H02942_A3394AlbTipCol[0] ;
         A3393AlbColNum = H02942_A3393AlbColNum[0] ;
         A3392AlbColNom = H02942_A3392AlbColNom[0] ;
         A8879AlbSerD = H02942_A8879AlbSerD[0] ;
         A3391AlbSer = H02942_A3391AlbSer[0] ;
         A130BarCodPar = H02942_A130BarCodPar[0] ;
         A132BarCodReo = H02942_A132BarCodReo[0] ;
         A129BarCod = H02942_A129BarCod[0] ;
         A143BarDisNum = H02942_A143BarDisNum[0] ;
         A4812BarEncCli = H02942_A4812BarEncCli[0] ;
         A396EmprCod = H02942_A396EmprCod[0] ;
         A213BarSit = H02942_A213BarSit[0] ;
         A143BarDisNum = H02942_A143BarDisNum[0] ;
         A4812BarEncCli = H02942_A4812BarEncCli[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         documentodetransporteproduccion_20_impl.this.A396EmprCod = GXv_char2[0] ;
         documentodetransporteproduccion_20_impl.this.A4812BarEncCli = GXv_char3[0] ;
         documentodetransporteproduccion_20_impl.this.A143BarDisNum = GXv_char4[0] ;
         documentodetransporteproduccion_20_impl.this.GXt_char1 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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

   public void rf2942( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(182) ;
      /* Execute user event: Refresh */
      e272942 ();
      nGXsfl_182_idx = 1 ;
      sGXsfl_182_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_182_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1822( ) ;
      bGXsfl_182_Refreshing = true ;
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
         subsflControlProps_1822( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A2839AlbProVal ,
                                              AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                              AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                              AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                              AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                              AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                              AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                              AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                              AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                              AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                              Integer.valueOf(AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) ,
                                              Integer.valueOf(AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) ,
                                              Byte.valueOf(AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) ,
                                              Byte.valueOf(AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) ,
                                              AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                              AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                              AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                              AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                              Short.valueOf(AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) ,
                                              Short.valueOf(AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) ,
                                              Short.valueOf(AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) ,
                                              Short.valueOf(AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) ,
                                              AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                              AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                              Integer.valueOf(AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) ,
                                              Integer.valueOf(AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) ,
                                              Short.valueOf(AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) ,
                                              Short.valueOf(AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) ,
                                              Integer.valueOf(AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) ,
                                              Integer.valueOf(AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) ,
                                              Integer.valueOf(AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels.size()) ,
                                              Byte.valueOf(AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) ,
                                              Byte.valueOf(AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A3391AlbSer ,
                                              A8879AlbSerD ,
                                              A3392AlbColNom ,
                                              Integer.valueOf(A3393AlbColNum) ,
                                              Byte.valueOf(A3394AlbTipCol) ,
                                              A12232AlbNomCli ,
                                              A1261BarAlbKgmE ,
                                              Short.valueOf(A3271AlbHdrAnc) ,
                                              Short.valueOf(A5019AlbHdrgm2) ,
                                              A1263BarAlbMtrE ,
                                              Integer.valueOf(A1265BarAlbPie) ,
                                              Short.valueOf(A1206TubCod) ,
                                              Integer.valueOf(A1266BarAlbTub) ,
                                              Byte.valueOf(A213BarSit) ,
                                              Short.valueOf(AV32OrderedBy) ,
                                              Boolean.valueOf(AV12OrderedDsc) ,
                                              AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                              AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                              A13878PedidoClie ,
                                              AV22EmprCod ,
                                              Long.valueOf(AV23AlbProCod) ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                              }
         });
         lV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr), 11, "%") ;
         lV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser), 16, "%") ;
         lV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd), 26, "%") ;
         lV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom), 13, "%") ;
         lV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli), 13, "%") ;
         /* Using cursor H02943 */
         pr_default.execute(1, new Object[] {AV22EmprCod, Long.valueOf(AV23AlbProCod), lV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr, AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel, lV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser, AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel, lV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd, AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel, lV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom, AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel, Integer.valueOf(AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum), Integer.valueOf(AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to), Byte.valueOf(AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol), Byte.valueOf(AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to), lV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli, AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel, AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme, AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to, Short.valueOf(AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc), Short.valueOf(AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to), Short.valueOf(AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2), Short.valueOf(AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to), AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre, AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to, Integer.valueOf(AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie), Integer.valueOf(AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to), Short.valueOf(AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod), Short.valueOf(AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to), Integer.valueOf(AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub), Integer.valueOf(AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to), Byte.valueOf(AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit), Byte.valueOf(AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to)});
         nGXsfl_182_idx = 1 ;
         sGXsfl_182_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_182_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1822( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A30AlbProCod = H02943_A30AlbProCod[0] ;
            A213BarSit = H02943_A213BarSit[0] ;
            A2839AlbProVal = H02943_A2839AlbProVal[0] ;
            A1266BarAlbTub = H02943_A1266BarAlbTub[0] ;
            A1206TubCod = H02943_A1206TubCod[0] ;
            n1206TubCod = H02943_n1206TubCod[0] ;
            A1265BarAlbPie = H02943_A1265BarAlbPie[0] ;
            A1263BarAlbMtrE = H02943_A1263BarAlbMtrE[0] ;
            A5019AlbHdrgm2 = H02943_A5019AlbHdrgm2[0] ;
            A3271AlbHdrAnc = H02943_A3271AlbHdrAnc[0] ;
            A1261BarAlbKgmE = H02943_A1261BarAlbKgmE[0] ;
            A12232AlbNomCli = H02943_A12232AlbNomCli[0] ;
            A3394AlbTipCol = H02943_A3394AlbTipCol[0] ;
            A3393AlbColNum = H02943_A3393AlbColNum[0] ;
            A3392AlbColNom = H02943_A3392AlbColNom[0] ;
            A8879AlbSerD = H02943_A8879AlbSerD[0] ;
            A3391AlbSer = H02943_A3391AlbSer[0] ;
            A130BarCodPar = H02943_A130BarCodPar[0] ;
            A132BarCodReo = H02943_A132BarCodReo[0] ;
            A129BarCod = H02943_A129BarCod[0] ;
            A143BarDisNum = H02943_A143BarDisNum[0] ;
            A4812BarEncCli = H02943_A4812BarEncCli[0] ;
            A396EmprCod = H02943_A396EmprCod[0] ;
            A213BarSit = H02943_A213BarSit[0] ;
            A143BarDisNum = H02943_A143BarDisNum[0] ;
            A4812BarEncCli = H02943_A4812BarEncCli[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A4812BarEncCli ;
            GXv_char3[0] = A143BarDisNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            documentodetransporteproduccion_20_impl.this.A396EmprCod = GXv_char5[0] ;
            documentodetransporteproduccion_20_impl.this.A4812BarEncCli = GXv_char4[0] ;
            documentodetransporteproduccion_20_impl.this.A143BarDisNum = GXv_char3[0] ;
            documentodetransporteproduccion_20_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel) == 0 ) ) )
               {
                  A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                  e282942 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(182) ;
         wb2940( ) ;
      }
      bGXsfl_182_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2942( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV97Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR"+"_"+sGXsfl_182_idx, getSecureSignedToken( sGXsfl_182_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFAS", GXutil.ltrim( localUtil.ntoc( AV104FlagFas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV104FlagFas), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV118Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENSAJE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV118Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOFASES", GXutil.ltrim( localUtil.ntoc( AV105Nofases, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOFASES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105Nofases), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV125ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRKGS", GXutil.ltrim( localUtil.ntoc( AV99errkgs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV99errkgs), "ZZZ9")));
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
      AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV14TFBarNHdr ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV43TFPedidoCliente ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV44TFPedidoCliente_Sel ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV45TFAlbSer ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV46TFAlbSer_Sel ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV47TFAlbSerD ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV48TFAlbSerD_Sel ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV49TFAlbColNom ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV50TFAlbColNom_Sel ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV51TFAlbColNum ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV52TFAlbColNum_To ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV53TFAlbTipCol ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV54TFAlbTipCol_To ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV55TFAlbNomCli ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV56TFAlbNomCli_Sel ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV16TFBarAlbKgmE ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV17TFBarAlbKgmE_To ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV57TFAlbHdrAnc ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV58TFAlbHdrAnc_To ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV59TFAlbHdrgm2 ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV60TFAlbHdrgm2_To ;
      AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV61TFBarAlbMtrE ;
      AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV62TFBarAlbMtrE_To ;
      AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV63TFBarAlbPie ;
      AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV64TFBarAlbPie_To ;
      AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV65TFTubCod ;
      AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV66TFTubCod_To ;
      AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV67TFBarAlbTub ;
      AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV68TFBarAlbTub_To ;
      AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV70TFAlbProVal_Sels ;
      AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV126TFBarSit ;
      AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV127TFBarSit_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV22EmprCod, AV23AlbProCod, AV14TFBarNHdr, AV15TFBarNHdr_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV45TFAlbSer, AV46TFAlbSer_Sel, AV47TFAlbSerD, AV48TFAlbSerD_Sel, AV49TFAlbColNom, AV50TFAlbColNom_Sel, AV51TFAlbColNum, AV52TFAlbColNum_To, AV53TFAlbTipCol, AV54TFAlbTipCol_To, AV55TFAlbNomCli, AV56TFAlbNomCli_Sel, AV16TFBarAlbKgmE, AV17TFBarAlbKgmE_To, AV57TFAlbHdrAnc, AV58TFAlbHdrAnc_To, AV59TFAlbHdrgm2, AV60TFAlbHdrgm2_To, AV61TFBarAlbMtrE, AV62TFBarAlbMtrE_To, AV63TFBarAlbPie, AV64TFBarAlbPie_To, AV65TFTubCod, AV66TFTubCod_To, AV67TFBarAlbTub, AV68TFBarAlbTub_To, AV70TFAlbProVal_Sels, AV126TFBarSit, AV127TFBarSit_To, AV97Moda21, AV139Pgmname, AV32OrderedBy, AV12OrderedDsc, AV71CliFacMtsP, AV91BarTipCor, AV72AlbProEst, AV104FlagFas, AV118Mensaje, AV27AlbProFch, AV105Nofases, AV125ImpCod, AV26GuiRemCln, AV99errkgs, AV30AlbEnvFtp, AV31AlbLic) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV14TFBarNHdr ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV43TFPedidoCliente ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV44TFPedidoCliente_Sel ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV45TFAlbSer ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV46TFAlbSer_Sel ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV47TFAlbSerD ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV48TFAlbSerD_Sel ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV49TFAlbColNom ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV50TFAlbColNom_Sel ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV51TFAlbColNum ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV52TFAlbColNum_To ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV53TFAlbTipCol ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV54TFAlbTipCol_To ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV55TFAlbNomCli ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV56TFAlbNomCli_Sel ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV16TFBarAlbKgmE ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV17TFBarAlbKgmE_To ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV57TFAlbHdrAnc ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV58TFAlbHdrAnc_To ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV59TFAlbHdrgm2 ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV60TFAlbHdrgm2_To ;
      AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV61TFBarAlbMtrE ;
      AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV62TFBarAlbMtrE_To ;
      AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV63TFBarAlbPie ;
      AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV64TFBarAlbPie_To ;
      AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV65TFTubCod ;
      AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV66TFTubCod_To ;
      AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV67TFBarAlbTub ;
      AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV68TFBarAlbTub_To ;
      AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV70TFAlbProVal_Sels ;
      AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV126TFBarSit ;
      AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV127TFBarSit_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV22EmprCod, AV23AlbProCod, AV14TFBarNHdr, AV15TFBarNHdr_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV45TFAlbSer, AV46TFAlbSer_Sel, AV47TFAlbSerD, AV48TFAlbSerD_Sel, AV49TFAlbColNom, AV50TFAlbColNom_Sel, AV51TFAlbColNum, AV52TFAlbColNum_To, AV53TFAlbTipCol, AV54TFAlbTipCol_To, AV55TFAlbNomCli, AV56TFAlbNomCli_Sel, AV16TFBarAlbKgmE, AV17TFBarAlbKgmE_To, AV57TFAlbHdrAnc, AV58TFAlbHdrAnc_To, AV59TFAlbHdrgm2, AV60TFAlbHdrgm2_To, AV61TFBarAlbMtrE, AV62TFBarAlbMtrE_To, AV63TFBarAlbPie, AV64TFBarAlbPie_To, AV65TFTubCod, AV66TFTubCod_To, AV67TFBarAlbTub, AV68TFBarAlbTub_To, AV70TFAlbProVal_Sels, AV126TFBarSit, AV127TFBarSit_To, AV97Moda21, AV139Pgmname, AV32OrderedBy, AV12OrderedDsc, AV71CliFacMtsP, AV91BarTipCor, AV72AlbProEst, AV104FlagFas, AV118Mensaje, AV27AlbProFch, AV105Nofases, AV125ImpCod, AV26GuiRemCln, AV99errkgs, AV30AlbEnvFtp, AV31AlbLic) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV14TFBarNHdr ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV43TFPedidoCliente ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV44TFPedidoCliente_Sel ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV45TFAlbSer ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV46TFAlbSer_Sel ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV47TFAlbSerD ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV48TFAlbSerD_Sel ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV49TFAlbColNom ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV50TFAlbColNom_Sel ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV51TFAlbColNum ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV52TFAlbColNum_To ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV53TFAlbTipCol ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV54TFAlbTipCol_To ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV55TFAlbNomCli ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV56TFAlbNomCli_Sel ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV16TFBarAlbKgmE ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV17TFBarAlbKgmE_To ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV57TFAlbHdrAnc ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV58TFAlbHdrAnc_To ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV59TFAlbHdrgm2 ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV60TFAlbHdrgm2_To ;
      AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV61TFBarAlbMtrE ;
      AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV62TFBarAlbMtrE_To ;
      AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV63TFBarAlbPie ;
      AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV64TFBarAlbPie_To ;
      AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV65TFTubCod ;
      AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV66TFTubCod_To ;
      AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV67TFBarAlbTub ;
      AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV68TFBarAlbTub_To ;
      AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV70TFAlbProVal_Sels ;
      AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV126TFBarSit ;
      AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV127TFBarSit_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV22EmprCod, AV23AlbProCod, AV14TFBarNHdr, AV15TFBarNHdr_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV45TFAlbSer, AV46TFAlbSer_Sel, AV47TFAlbSerD, AV48TFAlbSerD_Sel, AV49TFAlbColNom, AV50TFAlbColNom_Sel, AV51TFAlbColNum, AV52TFAlbColNum_To, AV53TFAlbTipCol, AV54TFAlbTipCol_To, AV55TFAlbNomCli, AV56TFAlbNomCli_Sel, AV16TFBarAlbKgmE, AV17TFBarAlbKgmE_To, AV57TFAlbHdrAnc, AV58TFAlbHdrAnc_To, AV59TFAlbHdrgm2, AV60TFAlbHdrgm2_To, AV61TFBarAlbMtrE, AV62TFBarAlbMtrE_To, AV63TFBarAlbPie, AV64TFBarAlbPie_To, AV65TFTubCod, AV66TFTubCod_To, AV67TFBarAlbTub, AV68TFBarAlbTub_To, AV70TFAlbProVal_Sels, AV126TFBarSit, AV127TFBarSit_To, AV97Moda21, AV139Pgmname, AV32OrderedBy, AV12OrderedDsc, AV71CliFacMtsP, AV91BarTipCor, AV72AlbProEst, AV104FlagFas, AV118Mensaje, AV27AlbProFch, AV105Nofases, AV125ImpCod, AV26GuiRemCln, AV99errkgs, AV30AlbEnvFtp, AV31AlbLic) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV14TFBarNHdr ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV43TFPedidoCliente ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV44TFPedidoCliente_Sel ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV45TFAlbSer ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV46TFAlbSer_Sel ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV47TFAlbSerD ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV48TFAlbSerD_Sel ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV49TFAlbColNom ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV50TFAlbColNom_Sel ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV51TFAlbColNum ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV52TFAlbColNum_To ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV53TFAlbTipCol ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV54TFAlbTipCol_To ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV55TFAlbNomCli ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV56TFAlbNomCli_Sel ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV16TFBarAlbKgmE ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV17TFBarAlbKgmE_To ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV57TFAlbHdrAnc ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV58TFAlbHdrAnc_To ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV59TFAlbHdrgm2 ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV60TFAlbHdrgm2_To ;
      AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV61TFBarAlbMtrE ;
      AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV62TFBarAlbMtrE_To ;
      AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV63TFBarAlbPie ;
      AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV64TFBarAlbPie_To ;
      AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV65TFTubCod ;
      AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV66TFTubCod_To ;
      AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV67TFBarAlbTub ;
      AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV68TFBarAlbTub_To ;
      AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV70TFAlbProVal_Sels ;
      AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV126TFBarSit ;
      AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV127TFBarSit_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV22EmprCod, AV23AlbProCod, AV14TFBarNHdr, AV15TFBarNHdr_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV45TFAlbSer, AV46TFAlbSer_Sel, AV47TFAlbSerD, AV48TFAlbSerD_Sel, AV49TFAlbColNom, AV50TFAlbColNom_Sel, AV51TFAlbColNum, AV52TFAlbColNum_To, AV53TFAlbTipCol, AV54TFAlbTipCol_To, AV55TFAlbNomCli, AV56TFAlbNomCli_Sel, AV16TFBarAlbKgmE, AV17TFBarAlbKgmE_To, AV57TFAlbHdrAnc, AV58TFAlbHdrAnc_To, AV59TFAlbHdrgm2, AV60TFAlbHdrgm2_To, AV61TFBarAlbMtrE, AV62TFBarAlbMtrE_To, AV63TFBarAlbPie, AV64TFBarAlbPie_To, AV65TFTubCod, AV66TFTubCod_To, AV67TFBarAlbTub, AV68TFBarAlbTub_To, AV70TFAlbProVal_Sels, AV126TFBarSit, AV127TFBarSit_To, AV97Moda21, AV139Pgmname, AV32OrderedBy, AV12OrderedDsc, AV71CliFacMtsP, AV91BarTipCor, AV72AlbProEst, AV104FlagFas, AV118Mensaje, AV27AlbProFch, AV105Nofases, AV125ImpCod, AV26GuiRemCln, AV99errkgs, AV30AlbEnvFtp, AV31AlbLic) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV14TFBarNHdr ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV43TFPedidoCliente ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV44TFPedidoCliente_Sel ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV45TFAlbSer ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV46TFAlbSer_Sel ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV47TFAlbSerD ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV48TFAlbSerD_Sel ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV49TFAlbColNom ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV50TFAlbColNom_Sel ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV51TFAlbColNum ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV52TFAlbColNum_To ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV53TFAlbTipCol ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV54TFAlbTipCol_To ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV55TFAlbNomCli ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV56TFAlbNomCli_Sel ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV16TFBarAlbKgmE ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV17TFBarAlbKgmE_To ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV57TFAlbHdrAnc ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV58TFAlbHdrAnc_To ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV59TFAlbHdrgm2 ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV60TFAlbHdrgm2_To ;
      AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV61TFBarAlbMtrE ;
      AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV62TFBarAlbMtrE_To ;
      AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV63TFBarAlbPie ;
      AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV64TFBarAlbPie_To ;
      AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV65TFTubCod ;
      AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV66TFTubCod_To ;
      AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV67TFBarAlbTub ;
      AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV68TFBarAlbTub_To ;
      AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV70TFAlbProVal_Sels ;
      AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV126TFBarSit ;
      AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV127TFBarSit_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV22EmprCod, AV23AlbProCod, AV14TFBarNHdr, AV15TFBarNHdr_Sel, AV43TFPedidoCliente, AV44TFPedidoCliente_Sel, AV45TFAlbSer, AV46TFAlbSer_Sel, AV47TFAlbSerD, AV48TFAlbSerD_Sel, AV49TFAlbColNom, AV50TFAlbColNom_Sel, AV51TFAlbColNum, AV52TFAlbColNum_To, AV53TFAlbTipCol, AV54TFAlbTipCol_To, AV55TFAlbNomCli, AV56TFAlbNomCli_Sel, AV16TFBarAlbKgmE, AV17TFBarAlbKgmE_To, AV57TFAlbHdrAnc, AV58TFAlbHdrAnc_To, AV59TFAlbHdrgm2, AV60TFAlbHdrgm2_To, AV61TFBarAlbMtrE, AV62TFBarAlbMtrE_To, AV63TFBarAlbPie, AV64TFBarAlbPie_To, AV65TFTubCod, AV66TFTubCod_To, AV67TFBarAlbTub, AV68TFBarAlbTub_To, AV70TFAlbProVal_Sels, AV126TFBarSit, AV127TFBarSit_To, AV97Moda21, AV139Pgmname, AV32OrderedBy, AV12OrderedDsc, AV71CliFacMtsP, AV91BarTipCor, AV72AlbProEst, AV104FlagFas, AV118Mensaje, AV27AlbProFch, AV105Nofases, AV125ImpCod, AV26GuiRemCln, AV99errkgs, AV30AlbEnvFtp, AV31AlbLic) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV139Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_20" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV139Pgmname", AV139Pgmname);
      Gx_err = (short)(0) ;
      edtavAlblic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlblic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlblic_Enabled), 5, 0), true);
      cmbavAlbenvftp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbenvftp.getEnabled(), 5, 0), true);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      chkavBartipcor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavBartipcor.getInternalname(), "Enabled", GXutil.ltrimstr( chkavBartipcor.getEnabled(), 5, 0), true);
      edtavBarsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarsit_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      cmbavBarestreo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarestreo.getEnabled(), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavKilant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKilant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilant_Enabled), 5, 0), true);
      edtavMetant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetant_Enabled), 5, 0), true);
      edtavPieant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPieant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPieant_Enabled), 5, 0), true);
      edtavBarcad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcad_Enabled), 5, 0), true);
      edtavAlbbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbbar_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2940( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e262942 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTUBCOD_DATA"), AV100TubCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV18DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_182 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_182"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV20GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV21GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV97Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GuiRemCln = httpContext.cgiGet( "vGUIREMCLN") ;
         AV22EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         AV125ImpCod = httpContext.cgiGet( "vIMPCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
         Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
         Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
         Combo_tubcod_Cls = httpContext.cgiGet( "COMBO_TUBCOD_Cls") ;
         Combo_tubcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TUBCOD_Selectedvalue_set") ;
         Combo_tubcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TUBCOD_Emptyitemtext") ;
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
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
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
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
         }
         else
         {
            AV24BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
         }
         AV77Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarCodReo", GXutil.str( AV33BarCodReo, 1, 0));
         }
         else
         {
            AV33BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarCodReo", GXutil.str( AV33BarCodReo, 1, 0));
         }
         AV34BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodPar", AV34BarCodPar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBKGME");
            GX_FocusControl = edtavBaralbkgme_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35BarAlbKgmE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarAlbKgmE", GXutil.ltrimstr( AV35BarAlbKgmE, 9, 2));
         }
         else
         {
            AV35BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarAlbKgmE", GXutil.ltrimstr( AV35BarAlbKgmE, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdranc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdranc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBHDRANC");
            GX_FocusControl = edtavAlbhdranc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36AlbHdrAnc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbHdrAnc), 4, 0));
         }
         else
         {
            AV36AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbhdranc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbHdrAnc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBHDRGM2");
            GX_FocusControl = edtavAlbhdrgm2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37AlbHdrgm2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbHdrgm2), 4, 0));
         }
         else
         {
            AV37AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbhdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbHdrgm2), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBMTRE");
            GX_FocusControl = edtavBaralbmtre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38BarAlbMtrE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38BarAlbMtrE", GXutil.ltrimstr( AV38BarAlbMtrE, 9, 2));
         }
         else
         {
            AV38BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38BarAlbMtrE", GXutil.ltrimstr( AV38BarAlbMtrE, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBPIE");
            GX_FocusControl = edtavBaralbpie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39BarAlbPie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarAlbPie), 6, 0));
         }
         else
         {
            AV39BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarAlbPie), 6, 0));
         }
         cmbavAlbproval.setName( cmbavAlbproval.getInternalname() );
         cmbavAlbproval.setValue( httpContext.cgiGet( cmbavAlbproval.getInternalname()) );
         AV42AlbProVal = httpContext.cgiGet( cmbavAlbproval.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42AlbProVal", AV42AlbProVal);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbtub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbtub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBTUB");
            GX_FocusControl = edtavBaralbtub_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41BarAlbTub = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarAlbTub), 6, 0));
         }
         else
         {
            AV41BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbtub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarAlbTub), 6, 0));
         }
         AV93AlbHdrObs = httpContext.cgiGet( edtavAlbhdrobs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93AlbHdrObs", AV93AlbHdrObs);
         AV89BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89BarEncCli", AV89BarEncCli);
         AV83BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83BarSer", AV83BarSer);
         AV84BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84BarSerDsc", AV84BarSerDsc);
         AV119BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV119BarColNom", AV119BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV120BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120BarColNum), 6, 0));
         }
         else
         {
            AV120BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120BarColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPCOL");
            GX_FocusControl = edtavBartipcol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV82BarTipCol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarTipCol), 2, 0));
         }
         else
         {
            AV82BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarTipCol), 2, 0));
         }
         AV86BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86BarNomCli", AV86BarNomCli);
         AV91BarTipCor = ((GXutil.strcmp(httpContext.cgiGet( chkavBartipcor.getInternalname()), "SI")==0) ? "SI" : "NO") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91BarTipCor", AV91BarTipCor);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT");
            GX_FocusControl = edtavBarsit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV92BarSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92BarSit), 2, 0));
         }
         else
         {
            AV92BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92BarSit), 2, 0));
         }
         AV139Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV139Pgmname", AV139Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV85CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85CliCod), 6, 0));
         }
         else
         {
            AV85CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85CliCod), 6, 0));
         }
         cmbavBarestreo.setName( cmbavBarestreo.getInternalname() );
         cmbavBarestreo.setValue( httpContext.cgiGet( cmbavBarestreo.getInternalname()) );
         AV90BarEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavBarestreo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90BarEstReo", GXutil.str( AV90BarEstReo, 1, 0));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
            GX_FocusControl = edtavBarkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV98BarKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarKgm", GXutil.ltrimstr( AV98BarKgm, 9, 2));
         }
         else
         {
            AV98BarKgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarKgm", GXutil.ltrimstr( AV98BarKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilant_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILANT");
            GX_FocusControl = edtavKilant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV106KilAnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106KilAnt", GXutil.ltrimstr( AV106KilAnt, 9, 2));
         }
         else
         {
            AV106KilAnt = localUtil.ctond( httpContext.cgiGet( edtavKilant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106KilAnt", GXutil.ltrimstr( AV106KilAnt, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetant_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETANT");
            GX_FocusControl = edtavMetant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV107MetAnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107MetAnt", GXutil.ltrimstr( AV107MetAnt, 9, 2));
         }
         else
         {
            AV107MetAnt = localUtil.ctond( httpContext.cgiGet( edtavMetant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107MetAnt", GXutil.ltrimstr( AV107MetAnt, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPieant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPieant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPIEANT");
            GX_FocusControl = edtavPieant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV108PieAnt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108PieAnt), 6, 0));
         }
         else
         {
            AV108PieAnt = (int)(localUtil.ctol( httpContext.cgiGet( edtavPieant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108PieAnt), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCAD");
            GX_FocusControl = edtavBarcad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV94barcad = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94barcad), 4, 0));
         }
         else
         {
            AV94barcad = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarcad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94barcad), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBBAR");
            GX_FocusControl = edtavAlbbar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV95albbar = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95albbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95albbar), 4, 0));
         }
         else
         {
            AV95albbar = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95albbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95albbar), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTubcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTubcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTUBCOD");
            GX_FocusControl = edtavTubcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40TubCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TubCod), 4, 0));
         }
         else
         {
            AV40TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavTubcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TubCod), 4, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_20");
         AV139Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV139Pgmname", AV139Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV139Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_20:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e262942 ();
      if (returnInSub) return;
   }

   public void e262942( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV80Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      documentodetransporteproduccion_20_impl.this.GXt_char1 = GXv_char5[0] ;
      AV80Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Station", AV80Station);
      GXv_char5[0] = AV22EmprCod ;
      GXv_char4[0] = AV78EmprNom ;
      GXv_char3[0] = AV79UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV80Station, GXv_char5, GXv_char4, GXv_char3) ;
      documentodetransporteproduccion_20_impl.this.AV22EmprCod = GXv_char5[0] ;
      documentodetransporteproduccion_20_impl.this.AV78EmprNom = GXv_char4[0] ;
      documentodetransporteproduccion_20_impl.this.AV79UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV79UsurCod", AV79UsurCod);
      edtavTubcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTubcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTubcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOTUBCOD' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Detalle de Producciones", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV32OrderedBy < 1 )
      {
         AV32OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV18DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV18DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int8 = (byte)(AV97Moda21) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int9) ;
      documentodetransporteproduccion_20_impl.this.GXt_int8 = GXv_int9[0] ;
      AV97Moda21 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97Moda21), "ZZZ9")));
      GXt_int8 = (byte)(AV99errkgs) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "ERRKGS", ""), GXv_int9) ;
      documentodetransporteproduccion_20_impl.this.GXt_int8 = GXv_int9[0] ;
      AV99errkgs = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99errkgs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99errkgs), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV99errkgs), "ZZZ9")));
      GXt_int8 = (byte)(AV105Nofases) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "NOFASE", ""), GXv_int9) ;
      documentodetransporteproduccion_20_impl.this.GXt_int8 = GXv_int9[0] ;
      AV105Nofases = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105Nofases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105Nofases), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOFASES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105Nofases), "ZZZ9")));
      GXt_int8 = (byte)(AV102Plasticos) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "PLASTI", ""), GXv_int9) ;
      documentodetransporteproduccion_20_impl.this.GXt_int8 = GXv_int9[0] ;
      AV102Plasticos = GXt_int8 ;
      GXt_int8 = (byte)(AV103Tubos) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "TUBOSS", ""), GXv_int9) ;
      documentodetransporteproduccion_20_impl.this.GXt_int8 = GXv_int9[0] ;
      AV103Tubos = GXt_int8 ;
      GXt_int8 = (byte)(AV104FlagFas) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "ALBFAS", ""), GXv_int9) ;
      documentodetransporteproduccion_20_impl.this.GXt_int8 = GXv_int9[0] ;
      AV104FlagFas = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104FlagFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104FlagFas), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV104FlagFas), "ZZZ9")));
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV77Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV77Prompt)==0) ? AV140Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV77Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV77Prompt), true);
      AV140Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV77Prompt)==0) ? AV140Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV77Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV77Prompt), true);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
      bttBtnenter_Enabled = ((AV30AlbEnvFtp==3)||(GXutil.strcmp(AV31AlbLic, " ")!=0)||(AV72AlbProEst==2) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Enabled), 5, 0), true);
      bttBtnhashcomunicarat_Enabled = ((AV30AlbEnvFtp==3)||(GXutil.strcmp(AV31AlbLic, " ")!=0)||(AV72AlbProEst==2) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnhashcomunicarat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnhashcomunicarat_Enabled), 5, 0), true);
   }

   public void e272942( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV6WWPContext = GXv_SdtWWPContext10[0] ;
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      AV20GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridCurrentPage), 10, 0));
      AV21GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridPageCount), 10, 0));
      AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV14TFBarNHdr ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV43TFPedidoCliente ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV44TFPedidoCliente_Sel ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV45TFAlbSer ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV46TFAlbSer_Sel ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV47TFAlbSerD ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV48TFAlbSerD_Sel ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV49TFAlbColNom ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV50TFAlbColNom_Sel ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV51TFAlbColNum ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV52TFAlbColNum_To ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV53TFAlbTipCol ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV54TFAlbTipCol_To ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV55TFAlbNomCli ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV56TFAlbNomCli_Sel ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV16TFBarAlbKgmE ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV17TFBarAlbKgmE_To ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV57TFAlbHdrAnc ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV58TFAlbHdrAnc_To ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV59TFAlbHdrgm2 ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV60TFAlbHdrgm2_To ;
      AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV61TFBarAlbMtrE ;
      AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV62TFBarAlbMtrE_To ;
      AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV63TFBarAlbPie ;
      AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV64TFBarAlbPie_To ;
      AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV65TFTubCod ;
      AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV66TFTubCod_To ;
      AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV67TFBarAlbTub ;
      AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV68TFBarAlbTub_To ;
      AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV70TFAlbProVal_Sels ;
      AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV126TFBarSit ;
      AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV127TFBarSit_To ;
      /*  Sending Event outputs  */
   }

   public void e132942( )
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
         AV19PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV19PageToGo) ;
      }
   }

   public void e142942( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e152942( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV32OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
         AV12OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedDsc", AV12OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV14TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14TFBarNHdr", AV14TFBarNHdr);
            AV15TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFBarNHdr_Sel", AV15TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedidoCliente") == 0 )
         {
            AV43TFPedidoCliente = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPedidoCliente", AV43TFPedidoCliente);
            AV44TFPedidoCliente_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPedidoCliente_Sel", AV44TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbSer") == 0 )
         {
            AV45TFAlbSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbSer", AV45TFAlbSer);
            AV46TFAlbSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbSer_Sel", AV46TFAlbSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbSerD") == 0 )
         {
            AV47TFAlbSerD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbSerD", AV47TFAlbSerD);
            AV48TFAlbSerD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbSerD_Sel", AV48TFAlbSerD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbColNom") == 0 )
         {
            AV49TFAlbColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbColNom", AV49TFAlbColNom);
            AV50TFAlbColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbColNom_Sel", AV50TFAlbColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbColNum") == 0 )
         {
            AV51TFAlbColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFAlbColNum), 6, 0));
            AV52TFAlbColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFAlbColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbTipCol") == 0 )
         {
            AV53TFAlbTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFAlbTipCol), 2, 0));
            AV54TFAlbTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFAlbTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbNomCli") == 0 )
         {
            AV55TFAlbNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbNomCli", AV55TFAlbNomCli);
            AV56TFAlbNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbNomCli_Sel", AV56TFAlbNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbKgmE") == 0 )
         {
            AV16TFBarAlbKgmE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFBarAlbKgmE", GXutil.ltrimstr( AV16TFBarAlbKgmE, 9, 2));
            AV17TFBarAlbKgmE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFBarAlbKgmE_To", GXutil.ltrimstr( AV17TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrAnc") == 0 )
         {
            AV57TFAlbHdrAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbHdrAnc), 4, 0));
            AV58TFAlbHdrAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrgm2") == 0 )
         {
            AV59TFAlbHdrgm2 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbHdrgm2), 4, 0));
            AV60TFAlbHdrgm2_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbMtrE") == 0 )
         {
            AV61TFBarAlbMtrE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarAlbMtrE", GXutil.ltrimstr( AV61TFBarAlbMtrE, 9, 2));
            AV62TFBarAlbMtrE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFBarAlbMtrE_To", GXutil.ltrimstr( AV62TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPie") == 0 )
         {
            AV63TFBarAlbPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFBarAlbPie), 6, 0));
            AV64TFBarAlbPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TubCod") == 0 )
         {
            AV65TFTubCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFTubCod), 4, 0));
            AV66TFTubCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbTub") == 0 )
         {
            AV67TFBarAlbTub = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFBarAlbTub), 6, 0));
            AV68TFBarAlbTub_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProVal") == 0 )
         {
            AV69TFAlbProVal_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbProVal_SelsJson", AV69TFAlbProVal_SelsJson);
            AV70TFAlbProVal_Sels.fromJSonString(AV69TFAlbProVal_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV126TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126TFBarSit), 2, 0));
            AV127TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127TFBarSit_To), 2, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70TFAlbProVal_Sels", AV70TFAlbProVal_Sels);
   }

   private void e282942( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactiongroup1.removeAllItems();
         cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Servicios", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(182) ;
         }
         sendrow_1822( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_182_Refreshing )
      {
         httpContext.doAjaxLoad(182, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV132GridActionGroup1, 4, 0)) );
   }

   public void e292942( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV132GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO SERVICIOS' */
         S172 ();
         if (returnInSub) return;
      }
      AV132GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV132GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e172942 ();
      if (returnInSub) return;
   }

   public void e172942( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV24BarCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay valor en N OS", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV85CliCod != AV25Guiremcli )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente errado", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( AV92BarSit == 9 ) && ( AV95albbar == 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está fechado", ""));
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( AV92BarSit == 11 ) && ( AV95albbar == 0 ) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está no HISTÓRICO", ""));
                  GX_FocusControl = edtavBarcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( ( GXutil.strcmp(AV29AlbProPri, "1") == 0 ) && ( AV90BarEstReo == 2 ) && ( AV97Moda21 == 1 ) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço nao autorizada. Es uma Reclamaçao ¡¡¡", ""));
                     GX_FocusControl = edtavBarcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e162942( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavAlbproval.setValue( GXutil.rtrim( AV42AlbProVal) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Values", cmbavAlbproval.ToJavascriptSource(), true);
      cmbavBarestreo.setValue( GXutil.trim( GXutil.str( AV90BarEstReo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Values", cmbavBarestreo.ToJavascriptSource(), true);
   }

   public void e182942( )
   {
      /* 'Dohashcomunicarat' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_12", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"}) , new Object[] {});
      GXv_char5[0] = AV122Cadena ;
      GXv_char4[0] = AV121firma ;
      new app.documentotransporteproduccion.obtengocadenaparahashdocumentodetransporteproduccion(remoteHandle, context).execute( AV22EmprCod, (int)(AV23AlbProCod), AV27AlbProFch, AV73AlbHhfm, GXv_char5, GXv_char4) ;
      documentodetransporteproduccion_20_impl.this.AV122Cadena = GXv_char5[0] ;
      documentodetransporteproduccion_20_impl.this.AV121firma = GXv_char4[0] ;
      GXv_char5[0] = AV74Hash ;
      GXv_objcol_SdtMessages_Message11[0] = AV123Messages ;
      GXv_boolean12[0] = AV75ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV122Cadena, GXv_char5, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
      documentodetransporteproduccion_20_impl.this.AV74Hash = GXv_char5[0] ;
      AV123Messages = GXv_objcol_SdtMessages_Message11[0] ;
      documentodetransporteproduccion_20_impl.this.AV75ok = GXv_boolean12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Hash", AV74Hash);
      httpContext.ajax_rsp_assign_attri("", false, "AV75ok", AV75ok);
      if ( ! AV75ok )
      {
         AV174GXV1 = 1 ;
         while ( AV174GXV1 <= AV123Messages.size() )
         {
            AV124Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV123Messages.elementAt(-1+AV174GXV1));
            httpContext.GX_msglist.addItem(AV124Message.getgxTv_SdtMessages_Message_Description());
            AV174GXV1 = (int)(AV174GXV1+1) ;
         }
      }
      GXv_char5[0] = AV122Cadena ;
      GXv_char4[0] = AV74Hash ;
      new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion(remoteHandle, context).execute( AV22EmprCod, (int)(AV23AlbProCod), GXv_char5, GXv_char4) ;
      documentodetransporteproduccion_20_impl.this.AV122Cadena = GXv_char5[0] ;
      documentodetransporteproduccion_20_impl.this.AV74Hash = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Hash", AV74Hash);
      httpContext.popup(formatLink("app.documentotransporteproduccion.horasalidadocumentoenvioatdocumentodetransporteproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV73AlbHhfm)),GXutil.URLEncode(GXutil.rtrim(AV29AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV122Cadena)),GXutil.URLEncode(GXutil.rtrim(AV74Hash))}, new String[] {"Emprcod","AlbProCOD","AlbProSys","albPropri","cadena","hash"}) , new Object[] {"AV22EmprCod","AV23AlbProCod","AV73AlbHhfm","AV29AlbProPri","AV122Cadena","AV74Hash"});
      new app.pelcalb(remoteHandle, context).execute( AV22EmprCod, AV23AlbProCod) ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e192942( )
   {
      /* 'DoVerPiezas' Routine */
      returnInSub = false ;
      if ( AV94barcad > 0 )
      {
         if ( ( AV97Moda21 == 1 ) && ( GXutil.strcmp(AV91BarTipCor, "SI") == 0 ) )
         {
            GXv_int13[0] = AV39BarAlbPie ;
            GXv_decimal14[0] = AV35BarAlbKgmE ;
            GXv_decimal15[0] = AV38BarAlbMtrE ;
            GXv_char5[0] = AV117MetPieCtr ;
            GXv_char4[0] = Gx_msg ;
            new app.pmetpiacopy1(remoteHandle, context).execute( AV22EmprCod, AV24BarCod, AV33BarCodReo, AV34BarCodPar, AV23AlbProCod, GXv_int13, GXv_decimal14, GXv_decimal15, GXv_char5, GXv_char4) ;
            documentodetransporteproduccion_20_impl.this.AV39BarAlbPie = GXv_int13[0] ;
            documentodetransporteproduccion_20_impl.this.AV35BarAlbKgmE = GXv_decimal14[0] ;
            documentodetransporteproduccion_20_impl.this.AV38BarAlbMtrE = GXv_decimal15[0] ;
            documentodetransporteproduccion_20_impl.this.AV117MetPieCtr = GXv_char5[0] ;
            documentodetransporteproduccion_20_impl.this.Gx_msg = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarAlbPie), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarAlbKgmE", GXutil.ltrimstr( AV35BarAlbKgmE, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV38BarAlbMtrE", GXutil.ltrimstr( AV38BarAlbMtrE, 9, 2));
            if ( ( AV30AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV31AlbLic, " ") != 0 ) || ( AV72AlbProEst == 2 ) )
            {
               httpContext.popup(formatLink("app.tmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.rtrim("9999999999")),GXutil.URLEncode(GXutil.ltrimstr(AV24BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV39BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV35BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(AV38BarAlbMtrE)),GXutil.URLEncode(GXutil.rtrim(AV117MetPieCtr)),GXutil.URLEncode(GXutil.rtrim(AV118Mensaje))}, new String[] {"Mode","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProcod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) , new Object[] {});
            }
            else
            {
               httpContext.popup(formatLink("app.tmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.rtrim("9999999999")),GXutil.URLEncode(GXutil.ltrimstr(AV24BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV39BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV35BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(AV38BarAlbMtrE)),GXutil.URLEncode(GXutil.rtrim(AV117MetPieCtr)),GXutil.URLEncode(GXutil.rtrim(AV118Mensaje))}, new String[] {"Mode","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProcod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) , new Object[] {});
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e202942( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      if ( ( AV72AlbProEst == 2 ) || ( AV30AlbEnvFtp == 3 ) || ! (GXutil.strcmp("", AV31AlbLic)==0) )
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         GXv_char5[0] = AV122Cadena ;
         GXv_char4[0] = AV121firma ;
         new app.documentotransporteproduccion.obtengocadenaparahashdocumentodetransporteproduccion(remoteHandle, context).execute( AV22EmprCod, (int)(AV23AlbProCod), AV27AlbProFch, AV73AlbHhfm, GXv_char5, GXv_char4) ;
         documentodetransporteproduccion_20_impl.this.AV122Cadena = GXv_char5[0] ;
         documentodetransporteproduccion_20_impl.this.AV121firma = GXv_char4[0] ;
         GXv_char5[0] = AV74Hash ;
         GXv_objcol_SdtMessages_Message11[0] = AV123Messages ;
         GXv_boolean12[0] = AV75ok ;
         new app.hash_obtener(remoteHandle, context).execute( AV122Cadena, GXv_char5, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
         documentodetransporteproduccion_20_impl.this.AV74Hash = GXv_char5[0] ;
         AV123Messages = GXv_objcol_SdtMessages_Message11[0] ;
         documentodetransporteproduccion_20_impl.this.AV75ok = GXv_boolean12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Hash", AV74Hash);
         httpContext.ajax_rsp_assign_attri("", false, "AV75ok", AV75ok);
         AV76Messages_json = AV123Messages.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76Messages_json", AV76Messages_json);
         System.out.println( AV76Messages_json );
         System.out.println( httpContext.getMessage( "&Cadena=", "")+AV122Cadena );
         System.out.println( httpContext.getMessage( "&hash=", "")+AV74Hash );
         System.out.println( httpContext.getMessage( "&ok=", "")+GXutil.booltostr( AV75ok) );
         if ( AV75ok )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
            GXv_char5[0] = AV122Cadena ;
            GXv_char4[0] = AV74Hash ;
            new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion(remoteHandle, context).execute( AV22EmprCod, (int)(AV23AlbProCod), GXv_char5, GXv_char4) ;
            documentodetransporteproduccion_20_impl.this.AV122Cadena = GXv_char5[0] ;
            documentodetransporteproduccion_20_impl.this.AV74Hash = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74Hash", AV74Hash);
         }
         else
         {
            AV176GXV2 = 1 ;
            while ( AV176GXV2 <= AV123Messages.size() )
            {
               AV124Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV123Messages.elementAt(-1+AV176GXV2));
               httpContext.GX_msglist.addItem(AV124Message.getgxTv_SdtMessages_Message_Description());
               AV176GXV2 = (int)(AV176GXV2+1) ;
            }
         }
         System.out.println( httpContext.getMessage( "go PELCALB", "") );
         new app.pelcalb(remoteHandle, context).execute( AV22EmprCod, AV23AlbProCod) ;
         System.out.println( httpContext.getMessage( "return PELCALB", "") );
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_12", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"}) , new Object[] {});
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV32OrderedBy, 4, 0))+":"+(AV12OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      if ( ! ( ( AV97Moda21 == 1 ) ) )
      {
         bttBtnverpiezas_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnverpiezas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnverpiezas_Visible), 5, 0), true);
      }
      if ( ! ( ( AV97Moda21 == 1 ) ) )
      {
         bttBtnimprimirhdr_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnimprimirhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnimprimirhdr_Visible), 5, 0), true);
      }
   }

   public void S172( )
   {
      /* 'DO SERVICIOS' Routine */
      returnInSub = false ;
      if ( ( AV30AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV31AlbLic, " ") != 0 ) || ( AV72AlbProEst == 2 ) )
      {
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV30AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV31AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","AlbEnvFtp","AlbLic"}) , new Object[] {});
      }
      else
      {
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV30AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV31AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","AlbEnvFtp","AlbLic"}) , new Object[] {});
      }
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_20_ins_upd(remoteHandle, context).execute( AV22EmprCod, AV23AlbProCod, AV24BarCod, AV33BarCodReo, AV34BarCodPar, AV35BarAlbKgmE, AV36AlbHdrAnc, AV37AlbHdrgm2, AV38BarAlbMtrE, AV39BarAlbPie, AV40TubCod, AV41BarAlbTub, AV42AlbProVal, AV93AlbHdrObs, (short)(0), "", "") ;
      if ( ( AV104FlagFas == 1 ) && ( AV97Moda21 == 1 ) )
      {
         GXv_char5[0] = AV22EmprCod ;
         GXv_int16[0] = AV23AlbProCod ;
         GXv_int13[0] = AV24BarCod ;
         GXv_int9[0] = AV33BarCodReo ;
         GXv_char4[0] = AV34BarCodPar ;
         new app.pfas618(remoteHandle, context).execute( GXv_char5, GXv_int16, GXv_int13, GXv_int9, GXv_char4) ;
         documentodetransporteproduccion_20_impl.this.AV22EmprCod = GXv_char5[0] ;
         documentodetransporteproduccion_20_impl.this.AV23AlbProCod = GXv_int16[0] ;
         documentodetransporteproduccion_20_impl.this.AV24BarCod = GXv_int13[0] ;
         documentodetransporteproduccion_20_impl.this.AV33BarCodReo = GXv_int9[0] ;
         documentodetransporteproduccion_20_impl.this.AV34BarCodPar = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV23AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33BarCodReo", GXutil.str( AV33BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodPar", AV34BarCodPar);
      }
      if ( ( AV104FlagFas == 1 ) && ( AV95albbar == 0 ) )
      {
         GXv_char5[0] = AV22EmprCod ;
         GXv_int16[0] = AV23AlbProCod ;
         GXv_int13[0] = AV24BarCod ;
         GXv_int9[0] = AV33BarCodReo ;
         GXv_char4[0] = AV34BarCodPar ;
         new app.pcopfas(remoteHandle, context).execute( GXv_char5, GXv_int16, GXv_int13, GXv_int9, GXv_char4) ;
         documentodetransporteproduccion_20_impl.this.AV22EmprCod = GXv_char5[0] ;
         documentodetransporteproduccion_20_impl.this.AV23AlbProCod = GXv_int16[0] ;
         documentodetransporteproduccion_20_impl.this.AV24BarCod = GXv_int13[0] ;
         documentodetransporteproduccion_20_impl.this.AV33BarCodReo = GXv_int9[0] ;
         documentodetransporteproduccion_20_impl.this.AV34BarCodPar = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV23AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33BarCodReo", GXutil.str( AV33BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodPar", AV34BarCodPar);
         GXv_char5[0] = AV22EmprCod ;
         GXv_int16[0] = AV23AlbProCod ;
         GXv_int13[0] = AV24BarCod ;
         GXv_int9[0] = AV33BarCodReo ;
         GXv_char4[0] = AV34BarCodPar ;
         new app.pkilfas(remoteHandle, context).execute( GXv_char5, GXv_int16, GXv_int13, GXv_int9, GXv_char4) ;
         documentodetransporteproduccion_20_impl.this.AV22EmprCod = GXv_char5[0] ;
         documentodetransporteproduccion_20_impl.this.AV23AlbProCod = GXv_int16[0] ;
         documentodetransporteproduccion_20_impl.this.AV24BarCod = GXv_int13[0] ;
         documentodetransporteproduccion_20_impl.this.AV33BarCodReo = GXv_int9[0] ;
         documentodetransporteproduccion_20_impl.this.AV34BarCodPar = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV23AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33BarCodReo", GXutil.str( AV33BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodPar", AV34BarCodPar);
      }
      if ( ( AV97Moda21 == 1 ) && ( ( DecimalUtil.compareTo(AV107MetAnt, AV38BarAlbMtrE) != 0 ) || ( DecimalUtil.compareTo(AV106KilAnt, AV35BarAlbKgmE) != 0 ) ) && ( AV95albbar == 1 ) )
      {
         GXv_char5[0] = AV22EmprCod ;
         GXv_int16[0] = AV23AlbProCod ;
         GXv_int13[0] = AV24BarCod ;
         GXv_int9[0] = AV33BarCodReo ;
         GXv_char4[0] = AV34BarCodPar ;
         GXv_decimal15[0] = AV35BarAlbKgmE ;
         GXv_decimal14[0] = AV38BarAlbMtrE ;
         GXv_char3[0] = AV79UsurCod ;
         GXv_char2[0] = AV80Station ;
         new app.pupdmtsfs(remoteHandle, context).execute( GXv_char5, GXv_int16, GXv_int13, GXv_int9, GXv_char4, GXv_decimal15, GXv_decimal14, GXv_char3, GXv_char2) ;
         documentodetransporteproduccion_20_impl.this.AV22EmprCod = GXv_char5[0] ;
         documentodetransporteproduccion_20_impl.this.AV23AlbProCod = GXv_int16[0] ;
         documentodetransporteproduccion_20_impl.this.AV24BarCod = GXv_int13[0] ;
         documentodetransporteproduccion_20_impl.this.AV33BarCodReo = GXv_int9[0] ;
         documentodetransporteproduccion_20_impl.this.AV34BarCodPar = GXv_char4[0] ;
         documentodetransporteproduccion_20_impl.this.AV35BarAlbKgmE = GXv_decimal15[0] ;
         documentodetransporteproduccion_20_impl.this.AV38BarAlbMtrE = GXv_decimal14[0] ;
         documentodetransporteproduccion_20_impl.this.AV79UsurCod = GXv_char3[0] ;
         documentodetransporteproduccion_20_impl.this.AV80Station = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV23AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33BarCodReo", GXutil.str( AV33BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodPar", AV34BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV35BarAlbKgmE", GXutil.ltrimstr( AV35BarAlbKgmE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV38BarAlbMtrE", GXutil.ltrimstr( AV38BarAlbMtrE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV79UsurCod", AV79UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV80Station", AV80Station);
      }
      Gx_mode = ((AV95albbar==0) ? httpContext.getMessage( "INS", "") : httpContext.getMessage( "UPD", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      GXv_char5[0] = AV22EmprCod ;
      GXv_int13[0] = AV24BarCod ;
      GXv_int9[0] = AV33BarCodReo ;
      GXv_char4[0] = AV34BarCodPar ;
      GXv_decimal15[0] = AV35BarAlbKgmE ;
      GXv_decimal14[0] = AV38BarAlbMtrE ;
      GXv_int17[0] = AV39BarAlbPie ;
      GXv_decimal18[0] = AV106KilAnt ;
      GXv_decimal19[0] = AV107MetAnt ;
      GXv_int20[0] = AV108PieAnt ;
      GXv_char3[0] = Gx_mode ;
      new app.pcampie(remoteHandle, context).execute( GXv_char5, GXv_int13, GXv_int9, GXv_char4, GXv_decimal15, GXv_decimal14, GXv_int17, GXv_decimal18, GXv_decimal19, GXv_int20, GXv_char3) ;
      documentodetransporteproduccion_20_impl.this.AV22EmprCod = GXv_char5[0] ;
      documentodetransporteproduccion_20_impl.this.AV24BarCod = GXv_int13[0] ;
      documentodetransporteproduccion_20_impl.this.AV33BarCodReo = GXv_int9[0] ;
      documentodetransporteproduccion_20_impl.this.AV34BarCodPar = GXv_char4[0] ;
      documentodetransporteproduccion_20_impl.this.AV35BarAlbKgmE = GXv_decimal15[0] ;
      documentodetransporteproduccion_20_impl.this.AV38BarAlbMtrE = GXv_decimal14[0] ;
      documentodetransporteproduccion_20_impl.this.AV39BarAlbPie = GXv_int17[0] ;
      documentodetransporteproduccion_20_impl.this.AV106KilAnt = GXv_decimal18[0] ;
      documentodetransporteproduccion_20_impl.this.AV107MetAnt = GXv_decimal19[0] ;
      documentodetransporteproduccion_20_impl.this.AV108PieAnt = GXv_int20[0] ;
      documentodetransporteproduccion_20_impl.this.Gx_mode = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV33BarCodReo", GXutil.str( AV33BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodPar", AV34BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV35BarAlbKgmE", GXutil.ltrimstr( AV35BarAlbKgmE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarAlbMtrE", GXutil.ltrimstr( AV38BarAlbMtrE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarAlbPie), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV106KilAnt", GXutil.ltrimstr( AV106KilAnt, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV107MetAnt", GXutil.ltrimstr( AV107MetAnt, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV108PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108PieAnt), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ( AV97Moda21 == 1 ) && ( GXutil.strcmp(AV91BarTipCor, "SI") == 0 ) )
      {
         AV114Pzs = AV39BarAlbPie ;
         AV115Kgs = AV35BarAlbKgmE ;
         AV116Mts = AV38BarAlbMtrE ;
         GXv_int20[0] = AV114Pzs ;
         GXv_decimal19[0] = AV115Kgs ;
         GXv_decimal18[0] = AV116Mts ;
         GXv_char5[0] = AV117MetPieCtr ;
         GXv_char4[0] = Gx_msg ;
         new app.pmetpiacopy1(remoteHandle, context).execute( AV22EmprCod, AV24BarCod, AV33BarCodReo, AV34BarCodPar, AV23AlbProCod, GXv_int20, GXv_decimal19, GXv_decimal18, GXv_char5, GXv_char4) ;
         documentodetransporteproduccion_20_impl.this.AV114Pzs = GXv_int20[0] ;
         documentodetransporteproduccion_20_impl.this.AV115Kgs = GXv_decimal19[0] ;
         documentodetransporteproduccion_20_impl.this.AV116Mts = GXv_decimal18[0] ;
         documentodetransporteproduccion_20_impl.this.AV117MetPieCtr = GXv_char5[0] ;
         documentodetransporteproduccion_20_impl.this.Gx_msg = GXv_char4[0] ;
         httpContext.popup(formatLink("app.tmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.rtrim("9999999999")),GXutil.URLEncode(GXutil.ltrimstr(AV24BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV114Pzs,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV115Kgs)),GXutil.URLEncode(DecimalUtil.decToString(AV116Mts)),GXutil.URLEncode(GXutil.rtrim(AV117MetPieCtr)),GXutil.URLEncode(GXutil.rtrim(AV118Mensaje))}, new String[] {"Mode","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProcod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) , new Object[] {});
      }
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_8", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV24BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV35BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(AV38BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(AV39BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV106KilAnt)),GXutil.URLEncode(DecimalUtil.decToString(AV107MetAnt)),GXutil.URLEncode(GXutil.ltrimstr(AV108PieAnt,6,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV92BarSit,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV27AlbProFch))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarAlbKgmE","BarAlbMtrE","BarAlbPie","KilAnt","MtrAnt","PieAnt","Mode","BarSit","AlbProFch"}) , new Object[] {});
      if ( (0==AV105Nofases) )
      {
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV30AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV31AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","AlbEnvFtp","AlbLic"}) , new Object[] {});
      }
      AV24BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24BarCod), 8, 0));
      AV33BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33BarCodReo", GXutil.str( AV33BarCodReo, 1, 0));
      AV34BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodPar", AV34BarCodPar);
      AV36AlbHdrAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbHdrAnc), 4, 0));
      AV37AlbHdrgm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbHdrgm2), 4, 0));
      AV93AlbHdrObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93AlbHdrObs", AV93AlbHdrObs);
      AV35BarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35BarAlbKgmE", GXutil.ltrimstr( AV35BarAlbKgmE, 9, 2));
      AV38BarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarAlbMtrE", GXutil.ltrimstr( AV38BarAlbMtrE, 9, 2));
      AV39BarAlbPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarAlbPie), 6, 0));
      AV41BarAlbTub = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarAlbTub), 6, 0));
      AV40TubCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TubCod), 4, 0));
      AV42AlbProVal = "S" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42AlbProVal", AV42AlbProVal);
      AV89BarEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89BarEncCli", AV89BarEncCli);
      AV83BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83BarSer", AV83BarSer);
      AV84BarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84BarSerDsc", AV84BarSerDsc);
      AV119BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119BarColNom", AV119BarColNom);
      AV120BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120BarColNum), 6, 0));
      AV82BarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarTipCol), 2, 0));
      AV86BarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86BarNomCli", AV86BarNomCli);
      AV87barnumcli = 0 ;
      AV92BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92BarSit), 2, 0));
      AV91BarTipCor = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91BarTipCor", AV91BarTipCor);
      AV85CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85CliCod), 6, 0));
      AV90BarEstReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90BarEstReo", GXutil.str( AV90BarEstReo, 1, 0));
      AV98BarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98BarKgm", GXutil.ltrimstr( AV98BarKgm, 9, 2));
      AV106KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106KilAnt", GXutil.ltrimstr( AV106KilAnt, 9, 2));
      AV107MetAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107MetAnt", GXutil.ltrimstr( AV107MetAnt, 9, 2));
      AV108PieAnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108PieAnt), 6, 0));
      AV94barcad = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94barcad), 4, 0));
      AV95albbar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95albbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95albbar), 4, 0));
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      GX_FocusControl = edtavBarcod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue(AV139Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV139Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV13Session.getValue(AV139Pgmname+"GridState"), null, null);
      }
      AV32OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
      AV12OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedDsc", AV12OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV178GXV3 = 1 ;
      while ( AV178GXV3 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV178GXV3));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV14TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14TFBarNHdr", AV14TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV15TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFBarNHdr_Sel", AV15TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV43TFPedidoCliente = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPedidoCliente", AV43TFPedidoCliente);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV44TFPedidoCliente_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPedidoCliente_Sel", AV44TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER") == 0 )
         {
            AV45TFAlbSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbSer", AV45TFAlbSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER_SEL") == 0 )
         {
            AV46TFAlbSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbSer_Sel", AV46TFAlbSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD") == 0 )
         {
            AV47TFAlbSerD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbSerD", AV47TFAlbSerD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD_SEL") == 0 )
         {
            AV48TFAlbSerD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbSerD_Sel", AV48TFAlbSerD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM") == 0 )
         {
            AV49TFAlbColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbColNom", AV49TFAlbColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM_SEL") == 0 )
         {
            AV50TFAlbColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbColNom_Sel", AV50TFAlbColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNUM") == 0 )
         {
            AV51TFAlbColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFAlbColNum), 6, 0));
            AV52TFAlbColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFAlbColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIPCOL") == 0 )
         {
            AV53TFAlbTipCol = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFAlbTipCol), 2, 0));
            AV54TFAlbTipCol_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFAlbTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI") == 0 )
         {
            AV55TFAlbNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbNomCli", AV55TFAlbNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI_SEL") == 0 )
         {
            AV56TFAlbNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbNomCli_Sel", AV56TFAlbNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV16TFBarAlbKgmE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFBarAlbKgmE", GXutil.ltrimstr( AV16TFBarAlbKgmE, 9, 2));
            AV17TFBarAlbKgmE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFBarAlbKgmE_To", GXutil.ltrimstr( AV17TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV57TFAlbHdrAnc = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbHdrAnc), 4, 0));
            AV58TFAlbHdrAnc_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV59TFAlbHdrgm2 = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbHdrgm2), 4, 0));
            AV60TFAlbHdrgm2_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV61TFBarAlbMtrE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFBarAlbMtrE", GXutil.ltrimstr( AV61TFBarAlbMtrE, 9, 2));
            AV62TFBarAlbMtrE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFBarAlbMtrE_To", GXutil.ltrimstr( AV62TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV63TFBarAlbPie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFBarAlbPie), 6, 0));
            AV64TFBarAlbPie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV65TFTubCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFTubCod), 4, 0));
            AV66TFTubCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV67TFBarAlbTub = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFBarAlbTub), 6, 0));
            AV68TFBarAlbTub_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV69TFAlbProVal_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbProVal_SelsJson", AV69TFAlbProVal_SelsJson);
            AV70TFAlbProVal_Sels.fromJSonString(AV69TFAlbProVal_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV126TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126TFBarSit), 2, 0));
            AV127TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127TFBarSit_To), 2, 0));
         }
         AV178GXV3 = (int)(AV178GXV3+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV15TFBarNHdr_Sel)==0), AV15TFBarNHdr_Sel, GXv_char5) ;
      documentodetransporteproduccion_20_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char21 = "" ;
      GXv_char4[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFPedidoCliente_Sel)==0), AV44TFPedidoCliente_Sel, GXv_char4) ;
      documentodetransporteproduccion_20_impl.this.GXt_char21 = GXv_char4[0] ;
      GXt_char22 = "" ;
      GXv_char3[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFAlbSer_Sel)==0), AV46TFAlbSer_Sel, GXv_char3) ;
      documentodetransporteproduccion_20_impl.this.GXt_char22 = GXv_char3[0] ;
      GXt_char23 = "" ;
      GXv_char2[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFAlbSerD_Sel)==0), AV48TFAlbSerD_Sel, GXv_char2) ;
      documentodetransporteproduccion_20_impl.this.GXt_char23 = GXv_char2[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFAlbColNom_Sel)==0), AV50TFAlbColNom_Sel, GXv_char25) ;
      documentodetransporteproduccion_20_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFAlbNomCli_Sel)==0), AV56TFAlbNomCli_Sel, GXv_char27) ;
      documentodetransporteproduccion_20_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV70TFAlbProVal_Sels.size()==0), AV69TFAlbProVal_SelsJson, GXv_char29) ;
      documentodetransporteproduccion_20_impl.this.GXt_char28 = GXv_char29[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char21+"|"+GXt_char22+"|"+GXt_char23+"|"+GXt_char24+"|||"+GXt_char26+"||||||||"+GXt_char28+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV14TFBarNHdr)==0), AV14TFBarNHdr, GXv_char29) ;
      documentodetransporteproduccion_20_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFPedidoCliente)==0), AV43TFPedidoCliente, GXv_char27) ;
      documentodetransporteproduccion_20_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFAlbSer)==0), AV45TFAlbSer, GXv_char25) ;
      documentodetransporteproduccion_20_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char23 = "" ;
      GXv_char5[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFAlbSerD)==0), AV47TFAlbSerD, GXv_char5) ;
      documentodetransporteproduccion_20_impl.this.GXt_char23 = GXv_char5[0] ;
      GXt_char22 = "" ;
      GXv_char4[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFAlbColNom)==0), AV49TFAlbColNom, GXv_char4) ;
      documentodetransporteproduccion_20_impl.this.GXt_char22 = GXv_char4[0] ;
      GXt_char21 = "" ;
      GXv_char3[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFAlbNomCli)==0), AV55TFAlbNomCli, GXv_char3) ;
      documentodetransporteproduccion_20_impl.this.GXt_char21 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char28+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char23+"|"+GXt_char22+"|"+((0==AV51TFAlbColNum) ? "" : GXutil.str( AV51TFAlbColNum, 6, 0))+"|"+((0==AV53TFAlbTipCol) ? "" : GXutil.str( AV53TFAlbTipCol, 2, 0))+"|"+GXt_char21+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV16TFBarAlbKgmE)==0) ? "" : GXutil.str( AV16TFBarAlbKgmE, 9, 2))+"|"+((0==AV57TFAlbHdrAnc) ? "" : GXutil.str( AV57TFAlbHdrAnc, 4, 0))+"|"+((0==AV59TFAlbHdrgm2) ? "" : GXutil.str( AV59TFAlbHdrgm2, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFBarAlbMtrE)==0) ? "" : GXutil.str( AV61TFBarAlbMtrE, 9, 2))+"|"+((0==AV63TFBarAlbPie) ? "" : GXutil.str( AV63TFBarAlbPie, 6, 0))+"|"+((0==AV65TFTubCod) ? "" : GXutil.str( AV65TFTubCod, 4, 0))+"|"+((0==AV67TFBarAlbTub) ? "" : GXutil.str( AV67TFBarAlbTub, 6, 0))+"||"+((0==AV126TFBarSit) ? "" : GXutil.str( AV126TFBarSit, 2, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||"+((0==AV52TFAlbColNum_To) ? "" : GXutil.str( AV52TFAlbColNum_To, 6, 0))+"|"+((0==AV54TFAlbTipCol_To) ? "" : GXutil.str( AV54TFAlbTipCol_To, 2, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV17TFBarAlbKgmE_To)==0) ? "" : GXutil.str( AV17TFBarAlbKgmE_To, 9, 2))+"|"+((0==AV58TFAlbHdrAnc_To) ? "" : GXutil.str( AV58TFAlbHdrAnc_To, 4, 0))+"|"+((0==AV60TFAlbHdrgm2_To) ? "" : GXutil.str( AV60TFAlbHdrgm2_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFBarAlbMtrE_To)==0) ? "" : GXutil.str( AV62TFBarAlbMtrE_To, 9, 2))+"|"+((0==AV64TFBarAlbPie_To) ? "" : GXutil.str( AV64TFBarAlbPie_To, 6, 0))+"|"+((0==AV66TFTubCod_To) ? "" : GXutil.str( AV66TFTubCod_To, 4, 0))+"|"+((0==AV68TFBarAlbTub_To) ? "" : GXutil.str( AV68TFBarAlbTub_To, 6, 0))+"||"+((0==AV127TFBarSit_To) ? "" : GXutil.str( AV127TFBarSit_To, 2, 0)) ;
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
      AV10GridState.fromxml(AV13Session.getValue(AV139Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV32OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV12OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARNHDR", "", !(GXutil.strcmp("", AV14TFBarNHdr)==0), (short)(0), AV14TFBarNHdr, "", !(GXutil.strcmp("", AV15TFBarNHdr_Sel)==0), AV15TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPEDIDOCLIENTE", "", !(GXutil.strcmp("", AV43TFPedidoCliente)==0), (short)(0), AV43TFPedidoCliente, "", !(GXutil.strcmp("", AV44TFPedidoCliente_Sel)==0), AV44TFPedidoCliente_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBSER", "", !(GXutil.strcmp("", AV45TFAlbSer)==0), (short)(0), AV45TFAlbSer, "", !(GXutil.strcmp("", AV46TFAlbSer_Sel)==0), AV46TFAlbSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBSERD", "", !(GXutil.strcmp("", AV47TFAlbSerD)==0), (short)(0), AV47TFAlbSerD, "", !(GXutil.strcmp("", AV48TFAlbSerD_Sel)==0), AV48TFAlbSerD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBCOLNOM", "", !(GXutil.strcmp("", AV49TFAlbColNom)==0), (short)(0), AV49TFAlbColNom, "", !(GXutil.strcmp("", AV50TFAlbColNom_Sel)==0), AV50TFAlbColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBCOLNUM", "", !((0==AV51TFAlbColNum)&&(0==AV52TFAlbColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFAlbColNum, 6, 0)), GXutil.trim( GXutil.str( AV52TFAlbColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBTIPCOL", "", !((0==AV53TFAlbTipCol)&&(0==AV54TFAlbTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV53TFAlbTipCol, 2, 0)), GXutil.trim( GXutil.str( AV54TFAlbTipCol_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBNOMCLI", "", !(GXutil.strcmp("", AV55TFAlbNomCli)==0), (short)(0), AV55TFAlbNomCli, "", !(GXutil.strcmp("", AV56TFAlbNomCli_Sel)==0), AV56TFAlbNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARALBKGME", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV16TFBarAlbKgmE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV17TFBarAlbKgmE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV16TFBarAlbKgmE, 9, 2)), GXutil.trim( GXutil.str( AV17TFBarAlbKgmE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBHDRANC", "", !((0==AV57TFAlbHdrAnc)&&(0==AV58TFAlbHdrAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFAlbHdrAnc, 4, 0)), GXutil.trim( GXutil.str( AV58TFAlbHdrAnc_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBHDRGM2", "", !((0==AV59TFAlbHdrgm2)&&(0==AV60TFAlbHdrgm2_To)), (short)(0), GXutil.trim( GXutil.str( AV59TFAlbHdrgm2, 4, 0)), GXutil.trim( GXutil.str( AV60TFAlbHdrgm2_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARALBMTRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFBarAlbMtrE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFBarAlbMtrE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV61TFBarAlbMtrE, 9, 2)), GXutil.trim( GXutil.str( AV62TFBarAlbMtrE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARALBPIE", "", !((0==AV63TFBarAlbPie)&&(0==AV64TFBarAlbPie_To)), (short)(0), GXutil.trim( GXutil.str( AV63TFBarAlbPie, 6, 0)), GXutil.trim( GXutil.str( AV64TFBarAlbPie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFTUBCOD", "", !((0==AV65TFTubCod)&&(0==AV66TFTubCod_To)), (short)(0), GXutil.trim( GXutil.str( AV65TFTubCod, 4, 0)), GXutil.trim( GXutil.str( AV66TFTubCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARALBTUB", "", !((0==AV67TFBarAlbTub)&&(0==AV68TFBarAlbTub_To)), (short)(0), GXutil.trim( GXutil.str( AV67TFBarAlbTub, 6, 0)), GXutil.trim( GXutil.str( AV68TFBarAlbTub_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFALBPROVAL_SEL", "", !(AV70TFAlbProVal_Sels.size()==0), (short)(0), AV70TFAlbProVal_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARSIT", "", !((0==AV126TFBarSit)&&(0==AV127TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV126TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV127TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState30[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV139Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV139Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_3" );
      AV13Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'LOADCOMBOTUBCOD' Routine */
      returnInSub = false ;
      /* Using cursor H02944 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H02944_A396EmprCod[0] ;
         A13813TubNomID = H02944_A13813TubNomID[0] ;
         A1207TubNom = H02944_A1207TubNom[0] ;
         n1207TubNom = H02944_n1207TubNom[0] ;
         A1206TubCod = H02944_A1206TubCod[0] ;
         n1206TubCod = H02944_n1206TubCod[0] ;
         AV101Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV101Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A1206TubCod, 4, 0)) );
         AV101Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13813TubNomID );
         AV100TubCod_Data.add(AV101Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_tubcod_Selectedvalue_set = ((0==AV40TubCod) ? "" : GXutil.trim( GXutil.str( AV40TubCod, 4, 0))) ;
      ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "SelectedValue_set", Combo_tubcod_Selectedvalue_set);
   }

   public void e252942( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      AV81IN_Barsit = (byte)(5) ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV24BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV25Guiremcli,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV81IN_Barsit,2,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"AV22EmprCod","AV24BarCod","AV33BarCodReo","AV34BarCodPar","AV25Guiremcli","AV81IN_Barsit"});
      /*  Sending Event outputs  */
   }

   public void e212942( )
   {
      /* Barcod_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV24BarCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay valor en N OS", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
         lblTbmessage_Caption = httpContext.getMessage( "NO hay valor en N OS", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      /*  Sending Event outputs  */
   }

   public void e222942( )
   {
      /* Barcodpar_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      GXv_decimal19[0] = AV35BarAlbKgmE ;
      GXv_int31[0] = AV36AlbHdrAnc ;
      GXv_int32[0] = AV37AlbHdrgm2 ;
      GXv_decimal18[0] = AV38BarAlbMtrE ;
      GXv_int20[0] = AV39BarAlbPie ;
      GXv_int33[0] = AV40TubCod ;
      GXv_int17[0] = AV41BarAlbTub ;
      GXv_char29[0] = AV42AlbProVal ;
      GXv_int9[0] = AV90BarEstReo ;
      GXv_char27[0] = AV91BarTipCor ;
      GXv_int34[0] = AV92BarSit ;
      GXv_char25[0] = AV86BarNomCli ;
      GXv_int13[0] = AV87barnumcli ;
      GXv_char5[0] = AV83BarSer ;
      GXv_char4[0] = AV84BarSerDsc ;
      GXv_int35[0] = AV88bartipart ;
      GXv_int36[0] = AV82BarTipCol ;
      GXv_int37[0] = AV85CliCod ;
      GXv_char3[0] = AV89BarEncCli ;
      GXv_char2[0] = AV93AlbHdrObs ;
      GXv_int38[0] = AV94barcad ;
      GXv_int39[0] = AV95albbar ;
      GXv_decimal15[0] = AV98BarKgm ;
      GXv_decimal14[0] = AV106KilAnt ;
      GXv_decimal40[0] = AV107MetAnt ;
      GXv_int41[0] = AV108PieAnt ;
      GXv_char42[0] = AV119BarColNom ;
      GXv_int43[0] = AV120BarColNum ;
      GXv_char44[0] = AV133Barunimed ;
      GXv_int45[0] = AV134BarAlbUnd ;
      GXv_char46[0] = AV135Bartipdis ;
      GXv_int47[0] = AV136barpie ;
      GXv_decimal48[0] = DecimalUtil.ZERO ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_20_prc(remoteHandle, context).execute( AV22EmprCod, AV23AlbProCod, AV24BarCod, AV33BarCodReo, AV34BarCodPar, GXv_decimal19, GXv_int31, GXv_int32, GXv_decimal18, GXv_int20, GXv_int33, GXv_int17, GXv_char29, GXv_int9, GXv_char27, GXv_int34, GXv_char25, GXv_int13, GXv_char5, GXv_char4, GXv_int35, GXv_int36, GXv_int37, GXv_char3, GXv_char2, GXv_int38, GXv_int39, GXv_decimal15, GXv_decimal14, GXv_decimal40, GXv_int41, GXv_char42, GXv_int43, GXv_char44, AV29AlbProPri, GXv_int45, GXv_char46, GXv_int47, GXv_decimal48) ;
      documentodetransporteproduccion_20_impl.this.AV35BarAlbKgmE = GXv_decimal19[0] ;
      documentodetransporteproduccion_20_impl.this.AV36AlbHdrAnc = GXv_int31[0] ;
      documentodetransporteproduccion_20_impl.this.AV37AlbHdrgm2 = GXv_int32[0] ;
      documentodetransporteproduccion_20_impl.this.AV38BarAlbMtrE = GXv_decimal18[0] ;
      documentodetransporteproduccion_20_impl.this.AV39BarAlbPie = GXv_int20[0] ;
      documentodetransporteproduccion_20_impl.this.AV40TubCod = GXv_int33[0] ;
      documentodetransporteproduccion_20_impl.this.AV41BarAlbTub = GXv_int17[0] ;
      documentodetransporteproduccion_20_impl.this.AV42AlbProVal = GXv_char29[0] ;
      documentodetransporteproduccion_20_impl.this.AV90BarEstReo = GXv_int9[0] ;
      documentodetransporteproduccion_20_impl.this.AV91BarTipCor = GXv_char27[0] ;
      documentodetransporteproduccion_20_impl.this.AV92BarSit = GXv_int34[0] ;
      documentodetransporteproduccion_20_impl.this.AV86BarNomCli = GXv_char25[0] ;
      documentodetransporteproduccion_20_impl.this.AV87barnumcli = GXv_int13[0] ;
      documentodetransporteproduccion_20_impl.this.AV83BarSer = GXv_char5[0] ;
      documentodetransporteproduccion_20_impl.this.AV84BarSerDsc = GXv_char4[0] ;
      documentodetransporteproduccion_20_impl.this.AV88bartipart = GXv_int35[0] ;
      documentodetransporteproduccion_20_impl.this.AV82BarTipCol = GXv_int36[0] ;
      documentodetransporteproduccion_20_impl.this.AV85CliCod = GXv_int37[0] ;
      documentodetransporteproduccion_20_impl.this.AV89BarEncCli = GXv_char3[0] ;
      documentodetransporteproduccion_20_impl.this.AV93AlbHdrObs = GXv_char2[0] ;
      documentodetransporteproduccion_20_impl.this.AV94barcad = GXv_int38[0] ;
      documentodetransporteproduccion_20_impl.this.AV95albbar = GXv_int39[0] ;
      documentodetransporteproduccion_20_impl.this.AV98BarKgm = GXv_decimal15[0] ;
      documentodetransporteproduccion_20_impl.this.AV106KilAnt = GXv_decimal14[0] ;
      documentodetransporteproduccion_20_impl.this.AV107MetAnt = GXv_decimal40[0] ;
      documentodetransporteproduccion_20_impl.this.AV108PieAnt = GXv_int41[0] ;
      documentodetransporteproduccion_20_impl.this.AV119BarColNom = GXv_char42[0] ;
      documentodetransporteproduccion_20_impl.this.AV120BarColNum = GXv_int43[0] ;
      documentodetransporteproduccion_20_impl.this.AV133Barunimed = GXv_char44[0] ;
      documentodetransporteproduccion_20_impl.this.AV134BarAlbUnd = GXv_int45[0] ;
      documentodetransporteproduccion_20_impl.this.AV135Bartipdis = GXv_char46[0] ;
      documentodetransporteproduccion_20_impl.this.AV136barpie = GXv_int47[0] ;
      if ( (0==AV94barcad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe N OS", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
         lblTbmessage_Caption = httpContext.getMessage( "NO existe N OS", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         if ( ( GXutil.strcmp(AV29AlbProPri, "1") == 0 ) && ( AV90BarEstReo == 2 ) && ( AV97Moda21 == 1 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço nao autorizada. Es uma Reclamaçao ¡¡¡", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            lblTbmessage_Caption = httpContext.getMessage( "Ordem Serviço nao autorizada. Es uma Reclamaçao ¡¡¡", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
      }
      /*  Sending Event outputs  */
      cmbavBarestreo.setValue( GXutil.trim( GXutil.str( AV90BarEstReo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Values", cmbavBarestreo.ToJavascriptSource(), true);
      cmbavAlbproval.setValue( GXutil.rtrim( AV42AlbProVal) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Values", cmbavAlbproval.ToJavascriptSource(), true);
   }

   public void e232942( )
   {
      /* Albproval_Isvalid Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV42AlbProVal, "S") == 0 ) && ( AV94barcad == 1 ) && ( AV95albbar == 0 ) )
      {
         GXv_decimal48[0] = AV109BarPreKgm ;
         GXv_decimal40[0] = AV110BarPreMtr ;
         GXv_int36[0] = AV111AlbProEsp ;
         GXv_decimal19[0] = AV112AlbProRec ;
         GXv_char46[0] = AV113BarFasExt ;
         new app.pbuspre4(remoteHandle, context).execute( AV22EmprCod, AV24BarCod, AV33BarCodReo, AV34BarCodPar, GXv_decimal48, GXv_decimal40, GXv_int36, GXv_decimal19, GXv_char46) ;
         documentodetransporteproduccion_20_impl.this.AV109BarPreKgm = GXv_decimal48[0] ;
         documentodetransporteproduccion_20_impl.this.AV110BarPreMtr = GXv_decimal40[0] ;
         documentodetransporteproduccion_20_impl.this.AV111AlbProEsp = GXv_int36[0] ;
         documentodetransporteproduccion_20_impl.this.AV112AlbProRec = GXv_decimal19[0] ;
         documentodetransporteproduccion_20_impl.this.AV113BarFasExt = GXv_char46[0] ;
      }
   }

   public void e242942( )
   {
      /* Baralbkgme_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( AV97Moda21 == 1 )
      {
         if ( ( DecimalUtil.compareTo(AV35BarAlbKgmE, AV98BarKgm) > 0 ) && ( AV99errkgs == 1 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Os quilos saidos= ", "")+GXutil.trim( GXutil.str( AV35BarAlbKgmE, 9, 2))+httpContext.getMessage( ", são maiores do que os quilos da OS= ", "")+GXutil.trim( GXutil.str( AV98BarKgm, 9, 2)));
            GX_FocusControl = edtavBaralbkgme_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            lblTbmessage_Caption = httpContext.getMessage( "Os quilos saidos= ", "")+GXutil.trim( GXutil.str( AV35BarAlbKgmE, 9, 2))+httpContext.getMessage( ", são maiores do que os quilos da OS= ", "")+GXutil.trim( GXutil.str( AV98BarKgm, 9, 2)) ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            if ( GXutil.strcmp(AV71CliFacMtsP, "N") == 0 )
            {
               AV38BarAlbMtrE = (((AV37AlbHdrgm2*AV36AlbHdrAnc)>0) ? (AV35BarAlbKgmE.divide(DecimalUtil.doubleToDec((AV37AlbHdrgm2*(AV36AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38BarAlbMtrE", GXutil.ltrimstr( AV38BarAlbMtrE, 9, 2));
               GXv_char46[0] = Gx_msg ;
               new app.pmodmercopy1(remoteHandle, context).execute( AV22EmprCod, AV23AlbProCod, AV24BarCod, AV33BarCodReo, AV34BarCodPar, AV35BarAlbKgmE, AV79UsurCod, AV80Station, AV139Pgmname, GXv_char46) ;
               documentodetransporteproduccion_20_impl.this.Gx_msg = GXv_char46[0] ;
               if ( ! (GXutil.strcmp("", Gx_msg)==0) )
               {
                  httpContext.GX_msglist.addItem(Gx_msg);
                  httpContext.doAjaxRefresh();
                  lblTbmessage_Caption = Gx_msg ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void wb_table1_257_2942( boolean wbgen )
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
         wb_table1_257_2942e( true) ;
      }
      else
      {
         wb_table1_257_2942e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV22EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      AV23AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23AlbProCod), 10, 0));
      AV25Guiremcli = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Guiremcli), 6, 0));
      AV26GuiRemCln = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26GuiRemCln", AV26GuiRemCln);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26GuiRemCln, ""))));
      AV27AlbProFch = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27AlbProFch", localUtil.format(AV27AlbProFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV27AlbProFch));
      AV28AlbSec = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28AlbSec", AV28AlbSec);
      AV29AlbProPri = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29AlbProPri", AV29AlbProPri);
      AV30AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30AlbEnvFtp", GXutil.str( AV30AlbEnvFtp, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30AlbEnvFtp), "9")));
      AV31AlbLic = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31AlbLic", AV31AlbLic);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31AlbLic, ""))));
      AV73AlbHhfm = (java.util.Date)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73AlbHhfm", localUtil.ttoc( AV73AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV72AlbProEst = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72AlbProEst", GXutil.str( AV72AlbProEst, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV72AlbProEst), "9")));
      AV74Hash = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Hash", AV74Hash);
      AV75ok = ((Boolean) getParm(obj,12)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75ok", AV75ok);
      AV76Messages_json = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76Messages_json", AV76Messages_json);
      AV71CliFacMtsP = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71CliFacMtsP", AV71CliFacMtsP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71CliFacMtsP, ""))));
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
      pa2942( ) ;
      ws2942( ) ;
      we2942( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116153449", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_20.js", "?202682116153449", false, true);
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_1822( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_182_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_182_idx ;
      edtPedidoClie_Internalname = "PEDIDOCLIE_"+sGXsfl_182_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_182_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_182_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_182_idx ;
      edtAlbSer_Internalname = "ALBSER_"+sGXsfl_182_idx ;
      edtAlbSerD_Internalname = "ALBSERD_"+sGXsfl_182_idx ;
      edtAlbColNom_Internalname = "ALBCOLNOM_"+sGXsfl_182_idx ;
      edtAlbColNum_Internalname = "ALBCOLNUM_"+sGXsfl_182_idx ;
      edtAlbTipCol_Internalname = "ALBTIPCOL_"+sGXsfl_182_idx ;
      edtAlbNomCli_Internalname = "ALBNOMCLI_"+sGXsfl_182_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_182_idx ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC_"+sGXsfl_182_idx ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2_"+sGXsfl_182_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_182_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_182_idx ;
      edtTubCod_Internalname = "TUBCOD_"+sGXsfl_182_idx ;
      edtBarAlbTub_Internalname = "BARALBTUB_"+sGXsfl_182_idx ;
      cmbAlbProVal.setInternalname( "ALBPROVAL_"+sGXsfl_182_idx );
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_182_idx ;
   }

   public void subsflControlProps_fel_1822( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_182_fel_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_182_fel_idx ;
      edtPedidoClie_Internalname = "PEDIDOCLIE_"+sGXsfl_182_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_182_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_182_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_182_fel_idx ;
      edtAlbSer_Internalname = "ALBSER_"+sGXsfl_182_fel_idx ;
      edtAlbSerD_Internalname = "ALBSERD_"+sGXsfl_182_fel_idx ;
      edtAlbColNom_Internalname = "ALBCOLNOM_"+sGXsfl_182_fel_idx ;
      edtAlbColNum_Internalname = "ALBCOLNUM_"+sGXsfl_182_fel_idx ;
      edtAlbTipCol_Internalname = "ALBTIPCOL_"+sGXsfl_182_fel_idx ;
      edtAlbNomCli_Internalname = "ALBNOMCLI_"+sGXsfl_182_fel_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_182_fel_idx ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC_"+sGXsfl_182_fel_idx ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2_"+sGXsfl_182_fel_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_182_fel_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_182_fel_idx ;
      edtTubCod_Internalname = "TUBCOD_"+sGXsfl_182_fel_idx ;
      edtBarAlbTub_Internalname = "BARALBTUB_"+sGXsfl_182_fel_idx ;
      cmbAlbProVal.setInternalname( "ALBPROVAL_"+sGXsfl_182_fel_idx );
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_182_fel_idx ;
   }

   public void sendrow_1822( )
   {
      subsflControlProps_1822( ) ;
      wb2940( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_182_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_182_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_182_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 183,'',false,'"+sGXsfl_182_idx+"',182)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_182_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV132GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV132GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV132GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_182_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,183);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV132GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_182_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSer_Internalname,GXutil.rtrim( A3391AlbSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSerD_Internalname,GXutil.rtrim( A8879AlbSerD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSerD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNom_Internalname,GXutil.rtrim( A3392AlbColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3394AlbTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNomCli_Internalname,GXutil.rtrim( A12232AlbNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrgm2_Internalname,GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrgm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTubCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTubCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbTub_Internalname,GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbTub_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProVal.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROVAL_" + sGXsfl_182_idx ;
            cmbAlbProVal.setName( GXCCtl );
            cmbAlbProVal.setWebtags( "" );
            cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
            cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
            if ( cmbAlbProVal.getItemCount() > 0 )
            {
               A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProVal,cmbAlbProVal.getInternalname(),GXutil.rtrim( A2839AlbProVal),Integer.valueOf(1),cmbAlbProVal.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), !bGXsfl_182_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(182),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2942( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_182_idx = ((subGrid_Islastpage==1)&&(nGXsfl_182_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_182_idx+1) ;
         sGXsfl_182_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_182_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1822( ) ;
      }
      /* End function sendrow_1822 */
   }

   public void startgridcontrol182( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"182\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº OS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Enc. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descriçao", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Larg.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pças", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tubo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qtd.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV132GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3391AlbSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8879AlbSerD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3392AlbColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12232AlbNomCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2839AlbProVal));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
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
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      edtavGuiremcli_Internalname = "vGUIREMCLI" ;
      edtavAlbpropri_Internalname = "vALBPROPRI" ;
      edtavAlblic_Internalname = "vALBLIC" ;
      cmbavAlbenvftp.setInternalname( "vALBENVFTP" );
      chkavClifacmtsp.setInternalname( "vCLIFACMTSP" );
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavBaralbkgme_Internalname = "vBARALBKGME" ;
      edtavAlbhdranc_Internalname = "vALBHDRANC" ;
      edtavAlbhdrgm2_Internalname = "vALBHDRGM2" ;
      edtavBaralbmtre_Internalname = "vBARALBMTRE" ;
      edtavBaralbpie_Internalname = "vBARALBPIE" ;
      cmbavAlbproval.setInternalname( "vALBPROVAL" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblockcombo_tubcod_Internalname = "TEXTBLOCKCOMBO_TUBCOD" ;
      Combo_tubcod_Internalname = "COMBO_TUBCOD" ;
      divTablesplittedtubcod_Internalname = "TABLESPLITTEDTUBCOD" ;
      edtavBaralbtub_Internalname = "vBARALBTUB" ;
      edtavAlbhdrobs_Internalname = "vALBHDROBS" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnhashcomunicarat_Internalname = "BTNHASHCOMUNICARAT" ;
      bttBtnverpiezas_Internalname = "BTNVERPIEZAS" ;
      bttBtnimprimirhdr_Internalname = "BTNIMPRIMIRHDR" ;
      bttBtnpackinglist_Internalname = "BTNPACKINGLIST" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavBarenccli_Internalname = "vBARENCCLI" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavBartipcol_Internalname = "vBARTIPCOL" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      chkavBartipcor.setInternalname( "vBARTIPCOR" );
      edtavBarsit_Internalname = "vBARSIT" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtPedidoClie_Internalname = "PEDIDOCLIE" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtAlbSer_Internalname = "ALBSER" ;
      edtAlbSerD_Internalname = "ALBSERD" ;
      edtAlbColNom_Internalname = "ALBCOLNOM" ;
      edtAlbColNum_Internalname = "ALBCOLNUM" ;
      edtAlbTipCol_Internalname = "ALBTIPCOL" ;
      edtAlbNomCli_Internalname = "ALBNOMCLI" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC" ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      edtBarAlbPie_Internalname = "BARALBPIE" ;
      edtTubCod_Internalname = "TUBCOD" ;
      edtBarAlbTub_Internalname = "BARALBTUB" ;
      cmbAlbProVal.setInternalname( "ALBPROVAL" );
      edtBarSit_Internalname = "BARSIT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      edtavClicod_Internalname = "vCLICOD" ;
      cmbavBarestreo.setInternalname( "vBARESTREO" );
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavKilant_Internalname = "vKILANT" ;
      edtavMetant_Internalname = "vMETANT" ;
      edtavPieant_Internalname = "vPIEANT" ;
      edtavBarcad_Internalname = "vBARCAD" ;
      edtavAlbbar_Internalname = "vALBBAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavTubcod_Internalname = "vTUBCOD" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      edtBarSit_Jsonclick = "" ;
      cmbAlbProVal.setJsonclick( "" );
      edtBarAlbTub_Jsonclick = "" ;
      edtTubCod_Jsonclick = "" ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtAlbHdrgm2_Jsonclick = "" ;
      edtAlbHdrAnc_Jsonclick = "" ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtAlbNomCli_Jsonclick = "" ;
      edtAlbTipCol_Jsonclick = "" ;
      edtAlbColNum_Jsonclick = "" ;
      edtAlbColNom_Jsonclick = "" ;
      edtAlbSerD_Jsonclick = "" ;
      edtAlbSer_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtPedidoClie_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavTubcod_Jsonclick = "" ;
      edtavTubcod_Visible = 1 ;
      edtavAlbbar_Jsonclick = "" ;
      edtavAlbbar_Enabled = 1 ;
      edtavBarcad_Jsonclick = "" ;
      edtavBarcad_Enabled = 1 ;
      edtavPieant_Jsonclick = "" ;
      edtavPieant_Enabled = 1 ;
      edtavMetant_Jsonclick = "" ;
      edtavMetant_Enabled = 1 ;
      edtavKilant_Jsonclick = "" ;
      edtavKilant_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 1 ;
      cmbavBarestreo.setJsonclick( "" );
      cmbavBarestreo.setEnabled( 1 );
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarsit_Jsonclick = "" ;
      edtavBarsit_Enabled = 1 ;
      chkavBartipcor.setEnabled( 1 );
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Enabled = 1 ;
      edtavBartipcol_Jsonclick = "" ;
      edtavBartipcol_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 1 ;
      lblTbmessage_Caption = "  " ;
      bttBtnimprimirhdr_Visible = 1 ;
      bttBtnverpiezas_Visible = 1 ;
      bttBtnhashcomunicarat_Enabled = 1 ;
      bttBtnenter_Enabled = 1 ;
      edtavAlbhdrobs_Jsonclick = "" ;
      edtavAlbhdrobs_Enabled = 1 ;
      edtavBaralbtub_Jsonclick = "" ;
      edtavBaralbtub_Enabled = 1 ;
      cmbavAlbproval.setJsonclick( "" );
      cmbavAlbproval.setEnabled( 1 );
      edtavBaralbpie_Jsonclick = "" ;
      edtavBaralbpie_Enabled = 1 ;
      edtavBaralbmtre_Jsonclick = "" ;
      edtavBaralbmtre_Enabled = 1 ;
      edtavAlbhdrgm2_Jsonclick = "" ;
      edtavAlbhdrgm2_Enabled = 1 ;
      edtavAlbhdranc_Jsonclick = "" ;
      edtavAlbhdranc_Enabled = 1 ;
      edtavBaralbkgme_Jsonclick = "" ;
      edtavBaralbkgme_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      chkavClifacmtsp.setEnabled( 0 );
      cmbavAlbenvftp.setJsonclick( "" );
      cmbavAlbenvftp.setEnabled( 0 );
      edtavAlblic_Jsonclick = "" ;
      edtavAlblic_Enabled = 0 ;
      edtavAlbpropri_Jsonclick = "" ;
      edtavAlbpropri_Enabled = 0 ;
      edtavGuiremcli_Jsonclick = "" ;
      edtavGuiremcli_Enabled = 0 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma el dato?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Ddo_grid_Datalistproc = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_20GetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||||S:Si,N:No|" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||||||T|" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic||||||||FixedValues|" ;
      Ddo_grid_Includedatalist = "T|T|T|T|T|||T||||||||T|" ;
      Ddo_grid_Filterisrange = "|||||T|T||T|T|T|T|T|T|T||T" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Character|Numeric|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric||Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T" ;
      Ddo_grid_Includesortasc = "||T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "||2|3|4|5|6|7|8|9|10|11|12|13|14|15|16" ;
      Ddo_grid_Columnids = "1:BarNHdr|2:PedidoCliente|6:AlbSer|7:AlbSerD|8:AlbColNom|9:AlbColNum|10:AlbTipCol|11:AlbNomCli|12:BarAlbKgmE|13:AlbHdrAnc|14:AlbHdrgm2|15:BarAlbMtrE|16:BarAlbPie|17:TubCod|18:BarAlbTub|19:AlbProVal|20:BarSit" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Provisional", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Mais Dados", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      Combo_tubcod_Emptyitemtext = "" ;
      Combo_tubcod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Detalle de Producciones", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbenvftp.setName( "vALBENVFTP" );
      cmbavAlbenvftp.setWebtags( "" );
      cmbavAlbenvftp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbavAlbenvftp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbavAlbenvftp.getItemCount() > 0 )
      {
         AV30AlbEnvFtp = (byte)(GXutil.lval( cmbavAlbenvftp.getValidValue(GXutil.trim( GXutil.str( AV30AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30AlbEnvFtp", GXutil.str( AV30AlbEnvFtp, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30AlbEnvFtp), "9")));
      }
      chkavClifacmtsp.setName( "vCLIFACMTSP" );
      chkavClifacmtsp.setWebtags( "" );
      chkavClifacmtsp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavClifacmtsp.getInternalname(), "TitleCaption", chkavClifacmtsp.getCaption(), true);
      chkavClifacmtsp.setCheckedValue( "N" );
      AV71CliFacMtsP = ((GXutil.strcmp(GXutil.rtrim( AV71CliFacMtsP), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71CliFacMtsP", AV71CliFacMtsP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71CliFacMtsP, ""))));
      cmbavAlbproval.setName( "vALBPROVAL" );
      cmbavAlbproval.setWebtags( "" );
      cmbavAlbproval.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbavAlbproval.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbavAlbproval.getItemCount() > 0 )
      {
         AV42AlbProVal = cmbavAlbproval.getValidValue(AV42AlbProVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42AlbProVal", AV42AlbProVal);
      }
      chkavBartipcor.setName( "vBARTIPCOR" );
      chkavBartipcor.setWebtags( "" );
      chkavBartipcor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavBartipcor.getInternalname(), "TitleCaption", chkavBartipcor.getCaption(), true);
      chkavBartipcor.setCheckedValue( "NO" );
      AV91BarTipCor = ((GXutil.strcmp(GXutil.rtrim( AV91BarTipCor), "SI")==0) ? "SI" : "NO") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91BarTipCor", AV91BarTipCor);
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_182_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV132GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV132GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132GridActionGroup1), 4, 0));
      }
      GXCCtl = "ALBPROVAL_" + sGXsfl_182_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
      }
      cmbavBarestreo.setName( "vBARESTREO" );
      cmbavBarestreo.setWebtags( "" );
      cmbavBarestreo.addItem("0", httpContext.getMessage( "Normal", ""), (short)(0));
      cmbavBarestreo.addItem("1", httpContext.getMessage( "No Conformidad", ""), (short)(0));
      cmbavBarestreo.addItem("2", httpContext.getMessage( "Reclamacion", ""), (short)(0));
      if ( cmbavBarestreo.getItemCount() > 0 )
      {
         AV90BarEstReo = (byte)(GXutil.lval( cmbavBarestreo.getValidValue(GXutil.trim( GXutil.str( AV90BarEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90BarEstReo", GXutil.str( AV90BarEstReo, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV15TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV45TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV46TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV47TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV48TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV49TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV50TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV51TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV54TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV55TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV56TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV16TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV17TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV57TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV58TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV59TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV60TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV61TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV62TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV64TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV65TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV66TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV67TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV68TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV70TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV127TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV139Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV104FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV118Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV105Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV125ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV26GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV99errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNVERPIEZAS',prop:'Visible'},{ctrl:'BTNIMPRIMIRHDR',prop:'Visible'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e132942',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV14TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV15TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV45TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV46TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV47TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV48TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV49TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV50TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV51TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV54TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV55TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV56TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV16TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV17TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV57TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV58TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV59TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV60TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV61TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV62TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV64TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV65TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV66TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV67TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV68TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV70TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV127TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV139Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV104FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV118Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV105Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV125ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV26GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV99errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142942',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV14TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV15TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV45TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV46TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV47TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV48TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV49TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV50TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV51TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV54TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV55TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV56TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV16TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV17TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV57TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV58TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV59TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV60TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV61TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV62TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV64TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV65TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV66TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV67TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV68TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV70TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV127TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV139Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV104FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV118Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV105Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV125ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV26GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV99errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e152942',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV14TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV15TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV45TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV46TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV47TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV48TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV49TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV50TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV51TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV54TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV55TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV56TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV16TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV17TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV57TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV58TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV59TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV60TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV61TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV62TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV64TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV65TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV66TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV67TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV68TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV70TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV127TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV139Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV104FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV118Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV105Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV125ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV26GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV99errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV126TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV127TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV69TFAlbProVal_SelsJson',fld:'vTFALBPROVAL_SELSJSON',pic:''},{av:'AV70TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV67TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV68TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV65TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV66TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV63TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV64TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV61TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV62TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV59TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV60TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV57TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV58TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV16TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV17TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV55TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV56TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV53TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV54TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV51TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV49TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV50TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV47TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV48TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV45TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV46TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV14TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV15TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e282942',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV132GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e292942',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV132GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV14TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV15TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV45TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV46TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV47TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV48TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV49TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV50TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV51TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV54TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV55TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV56TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV16TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV17TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV57TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV58TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV59TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV60TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV61TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV62TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV64TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV65TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV66TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV67TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV68TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV70TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV127TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV139Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV104FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV118Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV105Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV125ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV26GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV99errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV132GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNVERPIEZAS',prop:'Visible'},{ctrl:'BTNIMPRIMIRHDR',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e172942',iparms:[{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV85CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV25Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV92BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV95albbar',fld:'vALBBAR',pic:'ZZZ9'},{av:'AV29AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'cmbavBarestreo'},{av:'AV90BarEstReo',fld:'vBARESTREO',pic:'9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e162942',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV14TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV15TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV45TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV46TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV47TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV48TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV49TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV50TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV51TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV54TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV55TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV56TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV16TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV17TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV57TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV58TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV59TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV60TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV61TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV62TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV64TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV65TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV66TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV67TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV68TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV70TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV127TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV139Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV104FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV118Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV105Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV125ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV26GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV99errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV34BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV35BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV36AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'},{av:'AV37AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV38BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV39BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'},{av:'AV40TubCod',fld:'vTUBCOD',pic:'ZZZ9'},{av:'AV41BarAlbTub',fld:'vBARALBTUB',pic:'ZZZ9'},{av:'cmbavAlbproval'},{av:'AV42AlbProVal',fld:'vALBPROVAL',pic:'@!'},{av:'AV93AlbHdrObs',fld:'vALBHDROBS',pic:''},{av:'AV95albbar',fld:'vALBBAR',pic:'ZZZ9'},{av:'AV107MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV106KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV79UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV80Station',fld:'vSTATION',pic:''},{av:'AV108PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'},{av:'AV92BarSit',fld:'vBARSIT',pic:'Z9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV34BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV33BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV80Station',fld:'vSTATION',pic:''},{av:'AV79UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV38BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV35BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV108PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'},{av:'AV107MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV106KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV39BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'},{av:'AV36AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'},{av:'AV37AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV93AlbHdrObs',fld:'vALBHDROBS',pic:''},{av:'AV41BarAlbTub',fld:'vBARALBTUB',pic:'ZZZ9'},{av:'AV40TubCod',fld:'vTUBCOD',pic:'ZZZ9'},{av:'cmbavAlbproval'},{av:'AV42AlbProVal',fld:'vALBPROVAL',pic:'@!'},{av:'AV89BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV83BarSer',fld:'vBARSER',pic:''},{av:'AV84BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV119BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV120BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV82BarTipCol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV86BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV92BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV85CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'cmbavBarestreo'},{av:'AV90BarEstReo',fld:'vBARESTREO',pic:'9'},{av:'AV98BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV94barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV95albbar',fld:'vALBBAR',pic:'ZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNVERPIEZAS',prop:'Visible'},{ctrl:'BTNIMPRIMIRHDR',prop:'Visible'}]}");
      setEventMetadata("'DOHASHCOMUNICARAT'","{handler:'e182942',iparms:[{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV73AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV29AlbProPri',fld:'vALBPROPRI',pic:'9'}]");
      setEventMetadata("'DOHASHCOMUNICARAT'",",oparms:[{av:'AV75ok',fld:'vOK',pic:''},{av:'AV74Hash',fld:'vHASH',pic:''},{av:'AV29AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV73AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOVERPIEZAS'","{handler:'e192942',iparms:[{av:'AV94barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV34BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV39BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'},{av:'AV35BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV38BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV118Mensaje',fld:'vMENSAJE',pic:'',hsh:true}]");
      setEventMetadata("'DOVERPIEZAS'",",oparms:[{av:'AV38BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV35BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV39BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOIMPRIMIRHDR'","{handler:'e112941',iparms:[{av:'AV94barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV34BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV125ImpCod',fld:'vIMPCOD',pic:'',hsh:true}]");
      setEventMetadata("'DOIMPRIMIRHDR'",",oparms:[]}");
      setEventMetadata("'DOPACKINGLIST'","{handler:'e122941',iparms:[{av:'AV94barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV34BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV26GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV89BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV83BarSer',fld:'vBARSER',pic:''},{av:'AV84BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV119BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV120BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOPACKINGLIST'",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e202942',iparms:[{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV73AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'AV75ok',fld:'vOK',pic:''},{av:'AV74Hash',fld:'vHASH',pic:''},{av:'AV76Messages_json',fld:'vMESSAGES_JSON',pic:''}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e252942',iparms:[{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV34BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV25Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV34BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV33BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VBARCOD.ISVALID","{handler:'e212942',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV14TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV15TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV45TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV46TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV47TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV48TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV49TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV50TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV51TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV54TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV55TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV56TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV16TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV17TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV57TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV58TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV59TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV60TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV61TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV62TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV64TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV65TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV66TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV67TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV68TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV70TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV127TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV139Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV104FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV118Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV105Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV125ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV26GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV99errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VBARCOD.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNVERPIEZAS',prop:'Visible'},{ctrl:'BTNIMPRIMIRHDR',prop:'Visible'}]}");
      setEventMetadata("VBARCODPAR.ISVALID","{handler:'e222942',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV14TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV15TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV45TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV46TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV47TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV48TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV49TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV50TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV51TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV54TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV55TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV56TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV16TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV17TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV57TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV58TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV59TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV60TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV61TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV62TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV64TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV65TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV66TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV67TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV68TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV70TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV127TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV139Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV104FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV118Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV105Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV125ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV26GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV99errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV34BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV29AlbProPri',fld:'vALBPROPRI',pic:'9'}]");
      setEventMetadata("VBARCODPAR.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV120BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV119BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV108PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'},{av:'AV107MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV106KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV98BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV95albbar',fld:'vALBBAR',pic:'ZZZ9'},{av:'AV94barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV93AlbHdrObs',fld:'vALBHDROBS',pic:''},{av:'AV89BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV85CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82BarTipCol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV84BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV83BarSer',fld:'vBARSER',pic:''},{av:'AV86BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV92BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'cmbavBarestreo'},{av:'AV90BarEstReo',fld:'vBARESTREO',pic:'9'},{av:'cmbavAlbproval'},{av:'AV42AlbProVal',fld:'vALBPROVAL',pic:'@!'},{av:'AV41BarAlbTub',fld:'vBARALBTUB',pic:'ZZZ9'},{av:'AV40TubCod',fld:'vTUBCOD',pic:'ZZZ9'},{av:'AV39BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'},{av:'AV38BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV36AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'},{av:'AV35BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNVERPIEZAS',prop:'Visible'},{ctrl:'BTNIMPRIMIRHDR',prop:'Visible'}]}");
      setEventMetadata("VALBPROVAL.ISVALID","{handler:'e232942',iparms:[{av:'cmbavAlbproval'},{av:'AV42AlbProVal',fld:'vALBPROVAL',pic:'@!'},{av:'AV94barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV95albbar',fld:'vALBBAR',pic:'ZZZ9'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV34BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VALBPROVAL.ISVALID",",oparms:[]}");
      setEventMetadata("VBARALBKGME.ISVALID","{handler:'e242942',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV14TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV15TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV43TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV44TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV45TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV46TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV47TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV48TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV49TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV50TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV51TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV52TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV53TFAlbTipCol',fld:'vTFALBTIPCOL',pic:'Z9'},{av:'AV54TFAlbTipCol_To',fld:'vTFALBTIPCOL_TO',pic:'Z9'},{av:'AV55TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV56TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV16TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV17TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV57TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV58TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV59TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV60TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV61TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV62TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV64TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV65TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV66TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV67TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV68TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV70TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV127TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV97Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV139Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV91BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV72AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV104FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV118Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'AV27AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV105Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV125ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV26GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV99errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV30AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV31AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV35BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV98BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV37AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV36AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'},{av:'AV24BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV34BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV79UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV80Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("VBARALBKGME.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV38BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNVERPIEZAS',prop:'Visible'},{ctrl:'BTNIMPRIMIRHDR',prop:'Visible'}]}");
      setEventMetadata("VALIDV_ALBPROCOD","{handler:'validv_Albprocod',iparms:[]");
      setEventMetadata("VALIDV_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barsit',iparms:[]");
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
      wcpOAV22EmprCod = "" ;
      wcpOAV26GuiRemCln = "" ;
      wcpOAV27AlbProFch = GXutil.nullDate() ;
      wcpOAV28AlbSec = "" ;
      wcpOAV29AlbProPri = "" ;
      wcpOAV31AlbLic = "" ;
      wcpOAV73AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV74Hash = "" ;
      wcpOAV76Messages_json = "" ;
      wcpOAV71CliFacMtsP = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Combo_tubcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV22EmprCod = "" ;
      AV26GuiRemCln = "" ;
      AV27AlbProFch = GXutil.nullDate() ;
      AV28AlbSec = "" ;
      AV29AlbProPri = "" ;
      AV31AlbLic = "" ;
      AV73AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV74Hash = "" ;
      AV76Messages_json = "" ;
      AV71CliFacMtsP = "" ;
      AV14TFBarNHdr = "" ;
      AV15TFBarNHdr_Sel = "" ;
      AV43TFPedidoCliente = "" ;
      AV44TFPedidoCliente_Sel = "" ;
      AV45TFAlbSer = "" ;
      AV46TFAlbSer_Sel = "" ;
      AV47TFAlbSerD = "" ;
      AV48TFAlbSerD_Sel = "" ;
      AV49TFAlbColNom = "" ;
      AV50TFAlbColNom_Sel = "" ;
      AV55TFAlbNomCli = "" ;
      AV56TFAlbNomCli_Sel = "" ;
      AV16TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV17TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV61TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV62TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV70TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV139Pgmname = "" ;
      AV91BarTipCor = "" ;
      AV118Mensaje = "" ;
      AV125ImpCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV100TubCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV18DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV79UsurCod = "" ;
      AV80Station = "" ;
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      Combo_tubcod_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV77Prompt = "" ;
      AV140Prompt_GXI = "" ;
      sImgUrl = "" ;
      AV34BarCodPar = "" ;
      AV35BarAlbKgmE = DecimalUtil.ZERO ;
      AV38BarAlbMtrE = DecimalUtil.ZERO ;
      AV42AlbProVal = "" ;
      lblTextblockcombo_tubcod_Jsonclick = "" ;
      ucCombo_tubcod = new com.genexus.webpanels.GXUserControl();
      Combo_tubcod_Caption = "" ;
      AV93AlbHdrObs = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnhashcomunicarat_Jsonclick = "" ;
      bttBtnverpiezas_Jsonclick = "" ;
      bttBtnimprimirhdr_Jsonclick = "" ;
      bttBtnpackinglist_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV89BarEncCli = "" ;
      AV83BarSer = "" ;
      AV84BarSerDsc = "" ;
      AV119BarColNom = "" ;
      AV86BarNomCli = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV98BarKgm = DecimalUtil.ZERO ;
      AV106KilAnt = DecimalUtil.ZERO ;
      AV107MetAnt = DecimalUtil.ZERO ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13696BarNHdr = "" ;
      A13878PedidoClie = "" ;
      A130BarCodPar = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2839AlbProVal = "" ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = "" ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = "" ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = "" ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = "" ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = "" ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = "" ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = "" ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = "" ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = "" ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = "" ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = "" ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = "" ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = DecimalUtil.ZERO ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = DecimalUtil.ZERO ;
      AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = "" ;
      lV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = "" ;
      lV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = "" ;
      lV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = "" ;
      lV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = "" ;
      H02942_A30AlbProCod = new long[1] ;
      H02942_A213BarSit = new byte[1] ;
      H02942_A2839AlbProVal = new String[] {""} ;
      H02942_A1266BarAlbTub = new int[1] ;
      H02942_A1206TubCod = new short[1] ;
      H02942_n1206TubCod = new boolean[] {false} ;
      H02942_A1265BarAlbPie = new int[1] ;
      H02942_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02942_A5019AlbHdrgm2 = new short[1] ;
      H02942_A3271AlbHdrAnc = new short[1] ;
      H02942_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02942_A12232AlbNomCli = new String[] {""} ;
      H02942_A3394AlbTipCol = new byte[1] ;
      H02942_A3393AlbColNum = new int[1] ;
      H02942_A3392AlbColNom = new String[] {""} ;
      H02942_A8879AlbSerD = new String[] {""} ;
      H02942_A3391AlbSer = new String[] {""} ;
      H02942_A130BarCodPar = new String[] {""} ;
      H02942_A132BarCodReo = new byte[1] ;
      H02942_A129BarCod = new int[1] ;
      H02942_A143BarDisNum = new String[] {""} ;
      H02942_A4812BarEncCli = new String[] {""} ;
      H02942_A396EmprCod = new String[] {""} ;
      H02943_A30AlbProCod = new long[1] ;
      H02943_A213BarSit = new byte[1] ;
      H02943_A2839AlbProVal = new String[] {""} ;
      H02943_A1266BarAlbTub = new int[1] ;
      H02943_A1206TubCod = new short[1] ;
      H02943_n1206TubCod = new boolean[] {false} ;
      H02943_A1265BarAlbPie = new int[1] ;
      H02943_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02943_A5019AlbHdrgm2 = new short[1] ;
      H02943_A3271AlbHdrAnc = new short[1] ;
      H02943_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02943_A12232AlbNomCli = new String[] {""} ;
      H02943_A3394AlbTipCol = new byte[1] ;
      H02943_A3393AlbColNum = new int[1] ;
      H02943_A3392AlbColNom = new String[] {""} ;
      H02943_A8879AlbSerD = new String[] {""} ;
      H02943_A3391AlbSer = new String[] {""} ;
      H02943_A130BarCodPar = new String[] {""} ;
      H02943_A132BarCodReo = new byte[1] ;
      H02943_A129BarCod = new int[1] ;
      H02943_A143BarDisNum = new String[] {""} ;
      H02943_A4812BarEncCli = new String[] {""} ;
      H02943_A396EmprCod = new String[] {""} ;
      hsh = "" ;
      AV78EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV69TFAlbProVal_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV122Cadena = "" ;
      AV121firma = "" ;
      AV123Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV124Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV117MetPieCtr = "" ;
      Gx_msg = "" ;
      GXv_objcol_SdtMessages_Message11 = new GXBaseCollection[1] ;
      GXv_boolean12 = new boolean[1] ;
      GXv_int16 = new long[1] ;
      Gx_mode = "" ;
      AV115Kgs = DecimalUtil.ZERO ;
      AV116Mts = DecimalUtil.ZERO ;
      AV13Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char28 = "" ;
      GXt_char26 = "" ;
      GXt_char24 = "" ;
      GXt_char23 = "" ;
      GXt_char22 = "" ;
      GXt_char21 = "" ;
      GXv_SdtWWPGridState30 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H02944_A396EmprCod = new String[] {""} ;
      H02944_A13813TubNomID = new String[] {""} ;
      H02944_A1207TubNom = new String[] {""} ;
      H02944_n1207TubNom = new boolean[] {false} ;
      H02944_A1206TubCod = new short[1] ;
      H02944_n1206TubCod = new boolean[] {false} ;
      A13813TubNomID = "" ;
      A1207TubNom = "" ;
      AV101Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_int31 = new short[1] ;
      GXv_int32 = new short[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_int20 = new int[1] ;
      GXv_int33 = new short[1] ;
      GXv_int17 = new int[1] ;
      GXv_char29 = new String[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char27 = new String[1] ;
      GXv_int34 = new byte[1] ;
      GXv_char25 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int35 = new short[1] ;
      GXv_int37 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int38 = new short[1] ;
      GXv_int39 = new short[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int41 = new int[1] ;
      GXv_char42 = new String[1] ;
      GXv_int43 = new int[1] ;
      AV133Barunimed = "" ;
      GXv_char44 = new String[1] ;
      GXv_int45 = new int[1] ;
      AV135Bartipdis = "" ;
      GXv_int47 = new int[1] ;
      AV109BarPreKgm = DecimalUtil.ZERO ;
      GXv_decimal48 = new java.math.BigDecimal[1] ;
      AV110BarPreMtr = DecimalUtil.ZERO ;
      GXv_decimal40 = new java.math.BigDecimal[1] ;
      GXv_int36 = new byte[1] ;
      AV112AlbProRec = DecimalUtil.ZERO ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      AV113BarFasExt = "" ;
      GXv_char46 = new String[1] ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_20__default(),
         new Object[] {
             new Object[] {
            H02942_A30AlbProCod, H02942_A213BarSit, H02942_A2839AlbProVal, H02942_A1266BarAlbTub, H02942_A1206TubCod, H02942_n1206TubCod, H02942_A1265BarAlbPie, H02942_A1263BarAlbMtrE, H02942_A5019AlbHdrgm2, H02942_A3271AlbHdrAnc,
            H02942_A1261BarAlbKgmE, H02942_A12232AlbNomCli, H02942_A3394AlbTipCol, H02942_A3393AlbColNum, H02942_A3392AlbColNom, H02942_A8879AlbSerD, H02942_A3391AlbSer, H02942_A130BarCodPar, H02942_A132BarCodReo, H02942_A129BarCod,
            H02942_A143BarDisNum, H02942_A4812BarEncCli, H02942_A396EmprCod
            }
            , new Object[] {
            H02943_A30AlbProCod, H02943_A213BarSit, H02943_A2839AlbProVal, H02943_A1266BarAlbTub, H02943_A1206TubCod, H02943_n1206TubCod, H02943_A1265BarAlbPie, H02943_A1263BarAlbMtrE, H02943_A5019AlbHdrgm2, H02943_A3271AlbHdrAnc,
            H02943_A1261BarAlbKgmE, H02943_A12232AlbNomCli, H02943_A3394AlbTipCol, H02943_A3393AlbColNum, H02943_A3392AlbColNom, H02943_A8879AlbSerD, H02943_A3391AlbSer, H02943_A130BarCodPar, H02943_A132BarCodReo, H02943_A129BarCod,
            H02943_A143BarDisNum, H02943_A4812BarEncCli, H02943_A396EmprCod
            }
            , new Object[] {
            H02944_A396EmprCod, H02944_A13813TubNomID, H02944_A1207TubNom, H02944_n1207TubNom, H02944_A1206TubCod
            }
         }
      );
      AV139Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_20" ;
      /* GeneXus formulas. */
      AV139Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_20" ;
      Gx_err = (short)(0) ;
      edtavAlblic_Enabled = 0 ;
      cmbavAlbenvftp.setEnabled( 0 );
      edtavBarenccli_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBartipcol_Enabled = 0 ;
      edtavBarnomcli_Enabled = 0 ;
      chkavBartipcor.setEnabled( 0 );
      edtavBarsit_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      cmbavBarestreo.setEnabled( 0 );
      edtavBarkgm_Enabled = 0 ;
      edtavKilant_Enabled = 0 ;
      edtavMetant_Enabled = 0 ;
      edtavPieant_Enabled = 0 ;
      edtavBarcad_Enabled = 0 ;
      edtavAlbbar_Enabled = 0 ;
   }

   private byte wcpOAV30AlbEnvFtp ;
   private byte wcpOAV72AlbProEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV30AlbEnvFtp ;
   private byte AV72AlbProEst ;
   private byte AV53TFAlbTipCol ;
   private byte AV54TFAlbTipCol_To ;
   private byte AV126TFBarSit ;
   private byte AV127TFBarSit_To ;
   private byte gxajaxcallmode ;
   private byte AV33BarCodReo ;
   private byte AV82BarTipCol ;
   private byte AV92BarSit ;
   private byte AV90BarEstReo ;
   private byte A132BarCodReo ;
   private byte A3394AlbTipCol ;
   private byte A213BarSit ;
   private byte nDonePA ;
   private byte AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol ;
   private byte AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to ;
   private byte AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit ;
   private byte AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int8 ;
   private byte AV81IN_Barsit ;
   private byte GXv_int9[] ;
   private byte GXv_int34[] ;
   private byte AV111AlbProEsp ;
   private byte GXv_int36[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV57TFAlbHdrAnc ;
   private short AV58TFAlbHdrAnc_To ;
   private short AV59TFAlbHdrgm2 ;
   private short AV60TFAlbHdrgm2_To ;
   private short AV65TFTubCod ;
   private short AV66TFTubCod_To ;
   private short AV97Moda21 ;
   private short AV32OrderedBy ;
   private short AV104FlagFas ;
   private short AV105Nofases ;
   private short AV99errkgs ;
   private short wbEnd ;
   private short wbStart ;
   private short AV36AlbHdrAnc ;
   private short AV37AlbHdrgm2 ;
   private short AV94barcad ;
   private short AV95albbar ;
   private short AV40TubCod ;
   private short AV132GridActionGroup1 ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc ;
   private short AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to ;
   private short AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 ;
   private short AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to ;
   private short AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod ;
   private short AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to ;
   private short AV102Plasticos ;
   private short AV103Tubos ;
   private short GXv_int31[] ;
   private short GXv_int32[] ;
   private short GXv_int33[] ;
   private short AV88bartipart ;
   private short GXv_int35[] ;
   private short GXv_int38[] ;
   private short GXv_int39[] ;
   private int wcpOAV25Guiremcli ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_182 ;
   private int AV25Guiremcli ;
   private int nGXsfl_182_idx=1 ;
   private int AV51TFAlbColNum ;
   private int AV52TFAlbColNum_To ;
   private int AV63TFBarAlbPie ;
   private int AV64TFBarAlbPie_To ;
   private int AV67TFBarAlbTub ;
   private int AV68TFBarAlbTub_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprocod_Enabled ;
   private int edtavGuiremcli_Enabled ;
   private int edtavAlbpropri_Enabled ;
   private int edtavAlblic_Enabled ;
   private int AV24BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavBaralbkgme_Enabled ;
   private int edtavAlbhdranc_Enabled ;
   private int edtavAlbhdrgm2_Enabled ;
   private int edtavBaralbmtre_Enabled ;
   private int AV39BarAlbPie ;
   private int edtavBaralbpie_Enabled ;
   private int AV41BarAlbTub ;
   private int edtavBaralbtub_Enabled ;
   private int edtavAlbhdrobs_Enabled ;
   private int bttBtnenter_Enabled ;
   private int bttBtnhashcomunicarat_Enabled ;
   private int bttBtnverpiezas_Visible ;
   private int bttBtnimprimirhdr_Visible ;
   private int edtavBarenccli_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int AV120BarColNum ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBartipcol_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int edtavBarsit_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV85CliCod ;
   private int edtavClicod_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavKilant_Enabled ;
   private int edtavMetant_Enabled ;
   private int AV108PieAnt ;
   private int edtavPieant_Enabled ;
   private int edtavBarcad_Enabled ;
   private int edtavAlbbar_Enabled ;
   private int edtavTubcod_Visible ;
   private int A129BarCod ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int subGrid_Islastpage ;
   private int AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum ;
   private int AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to ;
   private int AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie ;
   private int AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to ;
   private int AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub ;
   private int AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to ;
   private int AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size ;
   private int AV19PageToGo ;
   private int AV174GXV1 ;
   private int AV176GXV2 ;
   private int AV114Pzs ;
   private int AV87barnumcli ;
   private int AV178GXV3 ;
   private int GXv_int20[] ;
   private int GXv_int17[] ;
   private int GXv_int13[] ;
   private int GXv_int37[] ;
   private int GXv_int41[] ;
   private int GXv_int43[] ;
   private int AV134BarAlbUnd ;
   private int GXv_int45[] ;
   private int AV136barpie ;
   private int GXv_int47[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV23AlbProCod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV23AlbProCod ;
   private long AV20GridCurrentPage ;
   private long AV21GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long A30AlbProCod ;
   private long GXv_int16[] ;
   private java.math.BigDecimal AV16TFBarAlbKgmE ;
   private java.math.BigDecimal AV17TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV61TFBarAlbMtrE ;
   private java.math.BigDecimal AV62TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV35BarAlbKgmE ;
   private java.math.BigDecimal AV38BarAlbMtrE ;
   private java.math.BigDecimal AV98BarKgm ;
   private java.math.BigDecimal AV106KilAnt ;
   private java.math.BigDecimal AV107MetAnt ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ;
   private java.math.BigDecimal AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ;
   private java.math.BigDecimal AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ;
   private java.math.BigDecimal AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ;
   private java.math.BigDecimal AV115Kgs ;
   private java.math.BigDecimal AV116Mts ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal AV109BarPreKgm ;
   private java.math.BigDecimal GXv_decimal48[] ;
   private java.math.BigDecimal AV110BarPreMtr ;
   private java.math.BigDecimal GXv_decimal40[] ;
   private java.math.BigDecimal AV112AlbProRec ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private String wcpOAV22EmprCod ;
   private String wcpOAV26GuiRemCln ;
   private String wcpOAV28AlbSec ;
   private String wcpOAV29AlbProPri ;
   private String wcpOAV31AlbLic ;
   private String wcpOAV71CliFacMtsP ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Combo_tubcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV22EmprCod ;
   private String AV26GuiRemCln ;
   private String AV28AlbSec ;
   private String AV29AlbProPri ;
   private String AV31AlbLic ;
   private String AV71CliFacMtsP ;
   private String sGXsfl_182_idx="0001" ;
   private String AV14TFBarNHdr ;
   private String AV15TFBarNHdr_Sel ;
   private String AV43TFPedidoCliente ;
   private String AV44TFPedidoCliente_Sel ;
   private String AV45TFAlbSer ;
   private String AV46TFAlbSer_Sel ;
   private String AV47TFAlbSerD ;
   private String AV48TFAlbSerD_Sel ;
   private String AV49TFAlbColNom ;
   private String AV50TFAlbColNom_Sel ;
   private String AV55TFAlbNomCli ;
   private String AV56TFAlbNomCli_Sel ;
   private String AV139Pgmname ;
   private String AV91BarTipCor ;
   private String AV125ImpCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV79UsurCod ;
   private String AV80Station ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Combo_tubcod_Cls ;
   private String Combo_tubcod_Selectedvalue_set ;
   private String Combo_tubcod_Emptyitemtext ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavGuiremcli_Internalname ;
   private String edtavGuiremcli_Jsonclick ;
   private String edtavAlbpropri_Internalname ;
   private String edtavAlbpropri_Jsonclick ;
   private String edtavAlblic_Internalname ;
   private String edtavAlblic_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String imgavPrompt_gximage ;
   private String sImgUrl ;
   private String imgavPrompt_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV34BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavBaralbkgme_Internalname ;
   private String edtavBaralbkgme_Jsonclick ;
   private String edtavAlbhdranc_Internalname ;
   private String edtavAlbhdranc_Jsonclick ;
   private String edtavAlbhdrgm2_Internalname ;
   private String edtavAlbhdrgm2_Jsonclick ;
   private String edtavBaralbmtre_Internalname ;
   private String edtavBaralbmtre_Jsonclick ;
   private String edtavBaralbpie_Internalname ;
   private String edtavBaralbpie_Jsonclick ;
   private String AV42AlbProVal ;
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedtubcod_Internalname ;
   private String lblTextblockcombo_tubcod_Internalname ;
   private String lblTextblockcombo_tubcod_Jsonclick ;
   private String Combo_tubcod_Caption ;
   private String Combo_tubcod_Internalname ;
   private String edtavBaralbtub_Internalname ;
   private String edtavBaralbtub_Jsonclick ;
   private String edtavAlbhdrobs_Internalname ;
   private String AV93AlbHdrObs ;
   private String edtavAlbhdrobs_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnhashcomunicarat_Internalname ;
   private String bttBtnhashcomunicarat_Jsonclick ;
   private String bttBtnverpiezas_Internalname ;
   private String bttBtnverpiezas_Jsonclick ;
   private String bttBtnimprimirhdr_Internalname ;
   private String bttBtnimprimirhdr_Jsonclick ;
   private String bttBtnpackinglist_Internalname ;
   private String bttBtnpackinglist_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarenccli_Internalname ;
   private String AV89BarEncCli ;
   private String edtavBarenccli_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String AV83BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String AV84BarSerDsc ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String AV119BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBartipcol_Internalname ;
   private String edtavBartipcol_Jsonclick ;
   private String edtavBarnomcli_Internalname ;
   private String AV86BarNomCli ;
   private String edtavBarnomcli_Jsonclick ;
   private String edtavBarsit_Internalname ;
   private String edtavBarsit_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavKilant_Internalname ;
   private String edtavKilant_Jsonclick ;
   private String edtavMetant_Internalname ;
   private String edtavMetant_Jsonclick ;
   private String edtavPieant_Internalname ;
   private String edtavPieant_Jsonclick ;
   private String edtavBarcad_Internalname ;
   private String edtavBarcad_Jsonclick ;
   private String edtavAlbbar_Internalname ;
   private String edtavAlbbar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavTubcod_Internalname ;
   private String edtavTubcod_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A3391AlbSer ;
   private String edtAlbSer_Internalname ;
   private String A8879AlbSerD ;
   private String edtAlbSerD_Internalname ;
   private String A3392AlbColNom ;
   private String edtAlbColNom_Internalname ;
   private String edtAlbColNum_Internalname ;
   private String edtAlbTipCol_Internalname ;
   private String A12232AlbNomCli ;
   private String edtAlbNomCli_Internalname ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtAlbHdrAnc_Internalname ;
   private String edtAlbHdrgm2_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String edtTubCod_Internalname ;
   private String edtBarAlbTub_Internalname ;
   private String A2839AlbProVal ;
   private String edtBarSit_Internalname ;
   private String AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ;
   private String AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ;
   private String AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ;
   private String AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ;
   private String AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ;
   private String AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ;
   private String AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ;
   private String AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ;
   private String AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ;
   private String AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ;
   private String AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ;
   private String AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ;
   private String scmdbuf ;
   private String lV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ;
   private String lV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ;
   private String lV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ;
   private String lV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ;
   private String lV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ;
   private String hsh ;
   private String AV78EmprNom ;
   private String AV117MetPieCtr ;
   private String Gx_msg ;
   private String Gx_mode ;
   private String GXt_char1 ;
   private String GXt_char28 ;
   private String GXt_char26 ;
   private String GXt_char24 ;
   private String GXt_char23 ;
   private String GXt_char22 ;
   private String GXt_char21 ;
   private String A1207TubNom ;
   private String GXv_char29[] ;
   private String GXv_char27[] ;
   private String GXv_char25[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char42[] ;
   private String AV133Barunimed ;
   private String GXv_char44[] ;
   private String AV135Bartipdis ;
   private String AV113BarFasExt ;
   private String GXv_char46[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String sGXsfl_182_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtAlbSer_Jsonclick ;
   private String edtAlbSerD_Jsonclick ;
   private String edtAlbColNom_Jsonclick ;
   private String edtAlbColNum_Jsonclick ;
   private String edtAlbTipCol_Jsonclick ;
   private String edtAlbNomCli_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtAlbHdrAnc_Jsonclick ;
   private String edtAlbHdrgm2_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String edtTubCod_Jsonclick ;
   private String edtBarAlbTub_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV73AlbHhfm ;
   private java.util.Date AV73AlbHhfm ;
   private java.util.Date wcpOAV27AlbProFch ;
   private java.util.Date AV27AlbProFch ;
   private boolean wcpOAV75ok ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV75ok ;
   private boolean AV12OrderedDsc ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean AV77Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n1206TubCod ;
   private boolean bGXsfl_182_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean GXv_boolean12[] ;
   private boolean n1207TubNom ;
   private String wcpOAV76Messages_json ;
   private String AV76Messages_json ;
   private String AV69TFAlbProVal_SelsJson ;
   private String wcpOAV74Hash ;
   private String AV74Hash ;
   private String AV118Mensaje ;
   private String AV140Prompt_GXI ;
   private String AV122Cadena ;
   private String AV121firma ;
   private String A13813TubNomID ;
   private String AV77Prompt ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_tubcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlbenvftp ;
   private ICheckbox chkavClifacmtsp ;
   private HTMLChoice cmbavAlbproval ;
   private ICheckbox chkavBartipcor ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private HTMLChoice cmbAlbProVal ;
   private HTMLChoice cmbavBarestreo ;
   private IDataStoreProvider pr_default ;
   private long[] H02942_A30AlbProCod ;
   private byte[] H02942_A213BarSit ;
   private String[] H02942_A2839AlbProVal ;
   private int[] H02942_A1266BarAlbTub ;
   private short[] H02942_A1206TubCod ;
   private boolean[] H02942_n1206TubCod ;
   private int[] H02942_A1265BarAlbPie ;
   private java.math.BigDecimal[] H02942_A1263BarAlbMtrE ;
   private short[] H02942_A5019AlbHdrgm2 ;
   private short[] H02942_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] H02942_A1261BarAlbKgmE ;
   private String[] H02942_A12232AlbNomCli ;
   private byte[] H02942_A3394AlbTipCol ;
   private int[] H02942_A3393AlbColNum ;
   private String[] H02942_A3392AlbColNom ;
   private String[] H02942_A8879AlbSerD ;
   private String[] H02942_A3391AlbSer ;
   private String[] H02942_A130BarCodPar ;
   private byte[] H02942_A132BarCodReo ;
   private int[] H02942_A129BarCod ;
   private String[] H02942_A143BarDisNum ;
   private String[] H02942_A4812BarEncCli ;
   private String[] H02942_A396EmprCod ;
   private long[] H02943_A30AlbProCod ;
   private byte[] H02943_A213BarSit ;
   private String[] H02943_A2839AlbProVal ;
   private int[] H02943_A1266BarAlbTub ;
   private short[] H02943_A1206TubCod ;
   private boolean[] H02943_n1206TubCod ;
   private int[] H02943_A1265BarAlbPie ;
   private java.math.BigDecimal[] H02943_A1263BarAlbMtrE ;
   private short[] H02943_A5019AlbHdrgm2 ;
   private short[] H02943_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] H02943_A1261BarAlbKgmE ;
   private String[] H02943_A12232AlbNomCli ;
   private byte[] H02943_A3394AlbTipCol ;
   private int[] H02943_A3393AlbColNum ;
   private String[] H02943_A3392AlbColNom ;
   private String[] H02943_A8879AlbSerD ;
   private String[] H02943_A3391AlbSer ;
   private String[] H02943_A130BarCodPar ;
   private byte[] H02943_A132BarCodReo ;
   private int[] H02943_A129BarCod ;
   private String[] H02943_A143BarDisNum ;
   private String[] H02943_A4812BarEncCli ;
   private String[] H02943_A396EmprCod ;
   private String[] H02944_A396EmprCod ;
   private String[] H02944_A13813TubNomID ;
   private String[] H02944_A1207TubNom ;
   private boolean[] H02944_n1207TubNom ;
   private short[] H02944_A1206TubCod ;
   private boolean[] H02944_n1206TubCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV70TFAlbProVal_Sels ;
   private GXSimpleCollection<String> AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV100TubCod_Data ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV123Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message11[] ;
   private com.genexus.SdtMessages_Message AV124Message ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState30[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV18DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV101Combo_DataItem ;
}

final  class documentodetransporteproduccion_20__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02942( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                          String AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                          String AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                          String AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                          String AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                          String AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                          String AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                          String AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                          String AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                          int AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum ,
                                          int AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to ,
                                          byte AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol ,
                                          byte AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to ,
                                          String AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                          String AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                          short AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc ,
                                          short AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to ,
                                          short AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 ,
                                          short AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                          int AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie ,
                                          int AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to ,
                                          short AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod ,
                                          short AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to ,
                                          int AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub ,
                                          int AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to ,
                                          int AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size ,
                                          byte AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit ,
                                          byte AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          byte A3394AlbTipCol ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          byte A213BarSit ,
                                          short AV32OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          String AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                          String AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String AV22EmprCod ,
                                          long AV23AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int49 = new byte[32];
      Object[] GXv_Object50 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T2.BarSit, T1.AlbProVal, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol," ;
      scmdbuf += " T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int49[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int49[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int49[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int49[9] = (byte)(1) ;
      }
      if ( ! (0==AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int49[10] = (byte)(1) ;
      }
      if ( ! (0==AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int49[11] = (byte)(1) ;
      }
      if ( ! (0==AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int49[12] = (byte)(1) ;
      }
      if ( ! (0==AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int49[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int49[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int49[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int49[17] = (byte)(1) ;
      }
      if ( ! (0==AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int49[18] = (byte)(1) ;
      }
      if ( ! (0==AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int49[19] = (byte)(1) ;
      }
      if ( ! (0==AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int49[20] = (byte)(1) ;
      }
      if ( ! (0==AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int49[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int49[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int49[23] = (byte)(1) ;
      }
      if ( ! (0==AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int49[24] = (byte)(1) ;
      }
      if ( ! (0==AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int49[25] = (byte)(1) ;
      }
      if ( ! (0==AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int49[26] = (byte)(1) ;
      }
      if ( ! (0==AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int49[27] = (byte)(1) ;
      }
      if ( ! (0==AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int49[28] = (byte)(1) ;
      }
      if ( ! (0==AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int49[29] = (byte)(1) ;
      }
      if ( AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int49[30] = (byte)(1) ;
      }
      if ( ! (0==AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int49[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV32OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbSer" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbSer DESC" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbSerD" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbSerD DESC" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbColNom" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbColNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbColNum" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbColNum DESC" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbTipCol" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbTipCol DESC" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbNomCli" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbNomCli DESC" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbHdrAnc" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbHdrAnc DESC" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbHdrgm2" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbHdrgm2 DESC" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie DESC" ;
      }
      else if ( ( AV32OrderedBy == 13 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TubCod" ;
      }
      else if ( ( AV32OrderedBy == 13 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TubCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 14 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbTub" ;
      }
      else if ( ( AV32OrderedBy == 14 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbTub DESC" ;
      }
      else if ( ( AV32OrderedBy == 15 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProVal" ;
      }
      else if ( ( AV32OrderedBy == 15 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProVal DESC" ;
      }
      else if ( ( AV32OrderedBy == 16 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV32OrderedBy == 16 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      GXv_Object50[0] = scmdbuf ;
      GXv_Object50[1] = GXv_int49 ;
      return GXv_Object50 ;
   }

   protected Object[] conditional_H02943( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                          String AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                          String AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                          String AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                          String AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                          String AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                          String AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                          String AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                          String AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                          int AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum ,
                                          int AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to ,
                                          byte AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol ,
                                          byte AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to ,
                                          String AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                          String AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                          short AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc ,
                                          short AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to ,
                                          short AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 ,
                                          short AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                          int AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie ,
                                          int AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to ,
                                          short AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod ,
                                          short AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to ,
                                          int AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub ,
                                          int AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to ,
                                          int AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size ,
                                          byte AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit ,
                                          byte AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          byte A3394AlbTipCol ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          byte A213BarSit ,
                                          short AV32OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          String AV144Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                          String AV143Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String AV22EmprCod ,
                                          long AV23AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int52 = new byte[32];
      Object[] GXv_Object53 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T2.BarSit, T1.AlbProVal, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol," ;
      scmdbuf += " T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV141Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int52[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int52[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV145Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int52[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int52[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV147Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int52[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int52[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV149Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int52[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int52[9] = (byte)(1) ;
      }
      if ( ! (0==AV151Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int52[10] = (byte)(1) ;
      }
      if ( ! (0==AV152Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int52[11] = (byte)(1) ;
      }
      if ( ! (0==AV153Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int52[12] = (byte)(1) ;
      }
      if ( ! (0==AV154Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int52[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV155Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int52[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int52[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int52[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int52[17] = (byte)(1) ;
      }
      if ( ! (0==AV159Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int52[18] = (byte)(1) ;
      }
      if ( ! (0==AV160Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int52[19] = (byte)(1) ;
      }
      if ( ! (0==AV161Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int52[20] = (byte)(1) ;
      }
      if ( ! (0==AV162Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int52[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int52[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int52[23] = (byte)(1) ;
      }
      if ( ! (0==AV165Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int52[24] = (byte)(1) ;
      }
      if ( ! (0==AV166Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int52[25] = (byte)(1) ;
      }
      if ( ! (0==AV167Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int52[26] = (byte)(1) ;
      }
      if ( ! (0==AV168Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int52[27] = (byte)(1) ;
      }
      if ( ! (0==AV169Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int52[28] = (byte)(1) ;
      }
      if ( ! (0==AV170Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int52[29] = (byte)(1) ;
      }
      if ( AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV171Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV172Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int52[30] = (byte)(1) ;
      }
      if ( ! (0==AV173Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int52[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV32OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbSer" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbSer DESC" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbSerD" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbSerD DESC" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbColNom" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbColNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbColNum" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbColNum DESC" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbTipCol" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbTipCol DESC" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbNomCli" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbNomCli DESC" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbHdrAnc" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbHdrAnc DESC" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbHdrgm2" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbHdrgm2 DESC" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie DESC" ;
      }
      else if ( ( AV32OrderedBy == 13 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TubCod" ;
      }
      else if ( ( AV32OrderedBy == 13 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TubCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 14 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbTub" ;
      }
      else if ( ( AV32OrderedBy == 14 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbTub DESC" ;
      }
      else if ( ( AV32OrderedBy == 15 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProVal" ;
      }
      else if ( ( AV32OrderedBy == 15 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProVal DESC" ;
      }
      else if ( ( AV32OrderedBy == 16 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV32OrderedBy == 16 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      GXv_Object53[0] = scmdbuf ;
      GXv_Object53[1] = GXv_int52 ;
      return GXv_Object53 ;
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
                  return conditional_H02942(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , ((Boolean) dynConstraints[51]).booleanValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).longValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).longValue() );
            case 1 :
                  return conditional_H02943(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , ((Boolean) dynConstraints[51]).booleanValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).longValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02942", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02943", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02944", "SELECT EmprCod, RTRIM(LTRIM(COALESCE( TubNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(TubCod,'9990'), 2))) || ')' AS TubNomID, TubNom, TubCod FROM TXPTUBOS ORDER BY TubNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((String[]) buf[21])[0] = rslt.getString(21, 20);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((String[]) buf[21])[0] = rslt.getString(21, 20);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
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
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
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
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               return;
      }
   }

}

