package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_2_wp_impl extends GXDataArea
{
   public documentodetransporteproduccion_2_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_2_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_2_wp_impl.class ));
   }

   public documentodetransporteproduccion_2_wp_impl( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbproval = new HTMLChoice();
      cmbavGridactiongroup1 = new HTMLChoice();
      cmbAlbProVal = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
            Gx_mode = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
               AV6AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProCod), 10, 0));
               AV7GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7GuiRemCli), 6, 0));
               AV8GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8GuiRemCln", AV8GuiRemCln);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8GuiRemCln, ""))));
               AV9AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProFch", localUtil.format(AV9AlbProFch, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV9AlbProFch));
               AV10AlbSec = httpContext.GetPar( "AlbSec") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbSec", AV10AlbSec);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10AlbSec, "@!"))));
               AV11AlbPropri = httpContext.GetPar( "AlbPropri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11AlbPropri", AV11AlbPropri);
               AV12AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12AlbEnvFtp", GXutil.str( AV12AlbEnvFtp, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12AlbEnvFtp), "9")));
               AV13AlbLic = httpContext.GetPar( "AlbLic") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13AlbLic", AV13AlbLic);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13AlbLic, ""))));
               AV14AlbHhfm = localUtil.parseDTimeParm( httpContext.GetPar( "AlbHhfm")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14AlbHhfm", localUtil.ttoc( AV14AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      nRC_GXsfl_134 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_134"))) ;
      nGXsfl_134_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_134_idx"))) ;
      sGXsfl_134_idx = httpContext.GetPar( "sGXsfl_134_idx") ;
      edtTubCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_134_Refreshing);
      edtBarAlbTub_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_134_Refreshing);
      edtPlasCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_134_Refreshing);
      edtBarAlbPlas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_134_Refreshing);
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
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV6AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      AV25TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV26TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV59TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV60TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV27TFAlbSer = httpContext.GetPar( "TFAlbSer") ;
      AV28TFAlbSer_Sel = httpContext.GetPar( "TFAlbSer_Sel") ;
      AV29TFAlbSerD = httpContext.GetPar( "TFAlbSerD") ;
      AV30TFAlbSerD_Sel = httpContext.GetPar( "TFAlbSerD_Sel") ;
      AV31TFAlbColNom = httpContext.GetPar( "TFAlbColNom") ;
      AV32TFAlbColNom_Sel = httpContext.GetPar( "TFAlbColNom_Sel") ;
      AV33TFAlbColNum = (int)(GXutil.lval( httpContext.GetPar( "TFAlbColNum"))) ;
      AV34TFAlbColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbColNum_To"))) ;
      AV35TFAlbNomCli = httpContext.GetPar( "TFAlbNomCli") ;
      AV36TFAlbNomCli_Sel = httpContext.GetPar( "TFAlbNomCli_Sel") ;
      AV37TFBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE"), ".") ;
      AV38TFBarAlbKgmE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE_To"), ".") ;
      AV39TFAlbHdrAnc = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc"))) ;
      AV40TFAlbHdrAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc_To"))) ;
      AV41TFAlbHdrgm2 = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2"))) ;
      AV42TFAlbHdrgm2_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2_To"))) ;
      AV43TFBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE"), ".") ;
      AV44TFBarAlbMtrE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE_To"), ".") ;
      AV45TFBarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie"))) ;
      AV46TFBarAlbPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie_To"))) ;
      AV47TFTubCod = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod"))) ;
      AV48TFTubCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod_To"))) ;
      AV49TFBarAlbTub = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub"))) ;
      AV50TFBarAlbTub_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub_To"))) ;
      AV51TFPlasCod = (short)(GXutil.lval( httpContext.GetPar( "TFPlasCod"))) ;
      AV52TFPlasCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFPlasCod_To"))) ;
      AV53TFBarAlbPlas = (short)(GXutil.lval( httpContext.GetPar( "TFBarAlbPlas"))) ;
      AV54TFBarAlbPlas_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarAlbPlas_To"))) ;
      AV55TFAlbHdrObs = httpContext.GetPar( "TFAlbHdrObs") ;
      AV56TFAlbHdrObs_Sel = httpContext.GetPar( "TFAlbHdrObs_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV58TFAlbProVal_Sels);
      AV126Pgmname = httpContext.GetPar( "Pgmname") ;
      AV22OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV23OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      edtTubCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_134_Refreshing);
      edtBarAlbTub_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_134_Refreshing);
      edtPlasCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_134_Refreshing);
      edtBarAlbPlas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_134_Refreshing);
      AV12AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
      AV9AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
      AV10AlbSec = httpContext.GetPar( "AlbSec") ;
      AV13AlbLic = httpContext.GetPar( "AlbLic") ;
      AV93Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV92CliFacMtsP = httpContext.GetPar( "CliFacMtsP") ;
      AV108errkgs = (byte)(GXutil.lval( httpContext.GetPar( "errkgs"))) ;
      AV8GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6AlbProCod, AV25TFBarNHdr, AV26TFBarNHdr_Sel, AV59TFBarSit, AV60TFBarSit_To, AV27TFAlbSer, AV28TFAlbSer_Sel, AV29TFAlbSerD, AV30TFAlbSerD_Sel, AV31TFAlbColNom, AV32TFAlbColNom_Sel, AV33TFAlbColNum, AV34TFAlbColNum_To, AV35TFAlbNomCli, AV36TFAlbNomCli_Sel, AV37TFBarAlbKgmE, AV38TFBarAlbKgmE_To, AV39TFAlbHdrAnc, AV40TFAlbHdrAnc_To, AV41TFAlbHdrgm2, AV42TFAlbHdrgm2_To, AV43TFBarAlbMtrE, AV44TFBarAlbMtrE_To, AV45TFBarAlbPie, AV46TFBarAlbPie_To, AV47TFTubCod, AV48TFTubCod_To, AV49TFBarAlbTub, AV50TFBarAlbTub_To, AV51TFPlasCod, AV52TFPlasCod_To, AV53TFBarAlbPlas, AV54TFBarAlbPlas_To, AV55TFAlbHdrObs, AV56TFAlbHdrObs_Sel, AV58TFAlbProVal_Sels, AV126Pgmname, AV22OrderedBy, AV23OrderedDsc, AV12AlbEnvFtp, AV9AlbProFch, AV10AlbSec, AV13AlbLic, AV93Moda21, AV92CliFacMtsP, AV108errkgs, AV8GuiRemCln) ;
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
      pa27N2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start27N2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_2_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV10AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV11AlbPropri)),GXutil.URLEncode(GXutil.ltrimstr(AV12AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV14AlbHhfm))}, new String[] {"Gx_mode","EmprCod","AlbProCod","GuiRemCli","GuiRemCln","AlbProFch","AlbSec","AlbPropri","AlbEnvFtp","AlbLic","AlbHhfm"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV92CliFacMtsP, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108errkgs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8GuiRemCln, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV9AlbProFch));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13AlbLic, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_134", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_134, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTUBCOD_DATA", AV79TubCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTUBCOD_DATA", AV79TubCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPLASCOD_DATA", AV81PlasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPLASCOD_DATA", AV81PlasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV63GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV64GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV61DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV61DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR", GXutil.rtrim( AV25TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR_SEL", GXutil.rtrim( AV26TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV59TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV60TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBSER", GXutil.rtrim( AV27TFAlbSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBSER_SEL", GXutil.rtrim( AV28TFAlbSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBSERD", GXutil.rtrim( AV29TFAlbSerD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBSERD_SEL", GXutil.rtrim( AV30TFAlbSerD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOLNOM", GXutil.rtrim( AV31TFAlbColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOLNOM_SEL", GXutil.rtrim( AV32TFAlbColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOLNUM", GXutil.ltrim( localUtil.ntoc( AV33TFAlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV34TFAlbColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBNOMCLI", GXutil.rtrim( AV35TFAlbNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBNOMCLI_SEL", GXutil.rtrim( AV36TFAlbNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV37TFBarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBKGME_TO", GXutil.ltrim( localUtil.ntoc( AV38TFBarAlbKgmE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRANC", GXutil.ltrim( localUtil.ntoc( AV39TFAlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRANC_TO", GXutil.ltrim( localUtil.ntoc( AV40TFAlbHdrAnc_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRGM2", GXutil.ltrim( localUtil.ntoc( AV41TFAlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRGM2_TO", GXutil.ltrim( localUtil.ntoc( AV42TFAlbHdrgm2_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV43TFBarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBMTRE_TO", GXutil.ltrim( localUtil.ntoc( AV44TFBarAlbMtrE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV45TFBarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPIE_TO", GXutil.ltrim( localUtil.ntoc( AV46TFBarAlbPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTUBCOD", GXutil.ltrim( localUtil.ntoc( AV47TFTubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTUBCOD_TO", GXutil.ltrim( localUtil.ntoc( AV48TFTubCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBTUB", GXutil.ltrim( localUtil.ntoc( AV49TFBarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBTUB_TO", GXutil.ltrim( localUtil.ntoc( AV50TFBarAlbTub_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPLASCOD", GXutil.ltrim( localUtil.ntoc( AV51TFPlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPLASCOD_TO", GXutil.ltrim( localUtil.ntoc( AV52TFPlasCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPLAS", GXutil.ltrim( localUtil.ntoc( AV53TFBarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPLAS_TO", GXutil.ltrim( localUtil.ntoc( AV54TFBarAlbPlas_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDROBS", GXutil.rtrim( AV55TFAlbHdrObs));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDROBS_SEL", GXutil.rtrim( AV56TFAlbHdrObs_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROVAL_SELS", AV58TFAlbProVal_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROVAL_SELS", AV58TFAlbProVal_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV22OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV23OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBENVFTP", GXutil.ltrim( localUtil.ntoc( AV12AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH", localUtil.dtoc( AV9AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV9AlbProFch));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV10AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV11AlbPropri));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLIC", GXutil.rtrim( AV13AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13AlbLic, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV117Barcod_Selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV118Barcodreo_Selected, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR_SELECTED", GXutil.rtrim( AV119Barcodpar_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBHHFM", localUtil.ttoc( AV14AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGHDR", GXutil.ltrim( localUtil.ntoc( AV85FlagHdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV93Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARESTREO", GXutil.ltrim( localUtil.ntoc( AV105BarEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKGSHDR", GXutil.ltrim( localUtil.ntoc( AV94KgsHdr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIFACMTSP", GXutil.rtrim( AV92CliFacMtsP));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV92CliFacMtsP, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV84UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV82Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRKGS", GXutil.ltrim( localUtil.ntoc( AV108errkgs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108errkgs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Cls", GXutil.rtrim( Combo_tubcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Selectedvalue_set", GXutil.rtrim( Combo_tubcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Emptyitem", GXutil.booltostr( Combo_tubcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PLASCOD_Cls", GXutil.rtrim( Combo_plascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PLASCOD_Selectedvalue_set", GXutil.rtrim( Combo_plascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PLASCOD_Emptyitem", GXutil.booltostr( Combo_plascod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Title", GXutil.rtrim( Dvelop_confirmpanel_delete_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_delete_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_delete_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_delete_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_delete_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PLASCOD_Selectedvalue_get", GXutil.rtrim( Combo_plascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Selectedvalue_get", GXutil.rtrim( Combo_tubcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "TUBCOD_Visible", GXutil.ltrim( localUtil.ntoc( edtTubCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBTUB_Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbTub_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLASCOD_Visible", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPLAS_Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we27N2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt27N2( ) ;
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_2_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV10AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV11AlbPropri)),GXutil.URLEncode(GXutil.ltrimstr(AV12AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV14AlbHhfm))}, new String[] {"Gx_mode","EmprCod","AlbProCod","GuiRemCli","GuiRemCln","AlbProFch","AlbSec","AlbPropri","AlbEnvFtp","AlbLic","AlbHhfm"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Detalle de Producciones", "") ;
   }

   public void wb27N0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcli_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV7GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcln_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcln_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcln_Internalname, GXutil.rtrim( AV8GuiRemCln), GXutil.rtrim( localUtil.format( AV8GuiRemCln, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV65BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV65BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV65BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", ((edtavBarcod_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavBarcod_Backcolor)+";"), "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV120Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV120Prompt)==0)&&(GXutil.strcmp("", AV127Prompt_GXI)==0))||!(GXutil.strcmp("", AV120Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV120Prompt)==0) ? AV127Prompt_GXI : httpContext.getResourceRelative(AV120Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV120Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV66BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV66BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV66BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV67BarCodPar), GXutil.rtrim( localUtil.format( AV67BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbkgme_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbkgme_Internalname, httpContext.getMessage( "Quilos S.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbkgme_Internalname, GXutil.ltrim( localUtil.ntoc( AV68BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbkgme_Enabled!=0) ? localUtil.format( AV68BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( AV68BarAlbKgmE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbkgme_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbkgme_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbhdranc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbhdranc_Internalname, httpContext.getMessage( "Largura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhdranc_Internalname, GXutil.ltrim( localUtil.ntoc( AV69AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbhdranc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV69AlbHdrAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV69AlbHdrAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhdranc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbhdranc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhdrgm2_Internalname, GXutil.ltrim( localUtil.ntoc( AV70AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbhdrgm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70AlbHdrgm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV70AlbHdrgm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhdrgm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbhdrgm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbmtre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbmtre_Internalname, httpContext.getMessage( "Metros S.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbmtre_Internalname, GXutil.ltrim( localUtil.ntoc( AV71BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbmtre_Enabled!=0) ? localUtil.format( AV71BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( AV71BarAlbMtrE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbmtre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbmtre_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbpie_Internalname, httpContext.getMessage( "Peças", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV72BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV72BarAlbPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV72BarAlbPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtubcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tubcod_Internalname, httpContext.getMessage( "Tubo", ""), "", "", lblTextblockcombo_tubcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tubcod.setProperty("Caption", Combo_tubcod_Caption);
         ucCombo_tubcod.setProperty("Cls", Combo_tubcod_Cls);
         ucCombo_tubcod.setProperty("EmptyItem", Combo_tubcod_Emptyitem);
         ucCombo_tubcod.setProperty("DropDownOptionsData", AV79TubCod_Data);
         ucCombo_tubcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tubcod_Internalname, "COMBO_TUBCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbtub_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbtub_Internalname, httpContext.getMessage( "Qtd.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbtub_Internalname, GXutil.ltrim( localUtil.ntoc( AV74BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbtub_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV74BarAlbTub), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV74BarAlbTub), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbtub_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbtub_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedplascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_plascod_Internalname, httpContext.getMessage( "Plastico", ""), "", "", lblTextblockcombo_plascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_plascod.setProperty("Caption", Combo_plascod_Caption);
         ucCombo_plascod.setProperty("Cls", Combo_plascod_Cls);
         ucCombo_plascod.setProperty("EmptyItem", Combo_plascod_Emptyitem);
         ucCombo_plascod.setProperty("DropDownOptionsData", AV81PlasCod_Data);
         ucCombo_plascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_plascod_Internalname, "COMBO_PLASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbplas_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbplas_Internalname, httpContext.getMessage( "Qtd.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbplas_Internalname, GXutil.ltrim( localUtil.ntoc( AV76BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbplas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV76BarAlbPlas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV76BarAlbPlas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbplas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbplas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbhdrobs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbhdrobs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhdrobs_Internalname, GXutil.rtrim( AV78AlbHdrObs), GXutil.rtrim( localUtil.format( AV78AlbHdrObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhdrobs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbhdrobs_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbproval, cmbavAlbproval.getInternalname(), GXutil.rtrim( AV77AlbProVal), 1, cmbavAlbproval.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbproval.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         cmbavAlbproval.setValue( GXutil.rtrim( AV77AlbProVal) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Values", cmbavAlbproval.ToJavascriptSource(), true);
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
         wb_table1_111_27N2( true) ;
      }
      else
      {
         wb_table1_111_27N2( false) ;
      }
      return  ;
   }

   public void wb_table1_111_27N2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnagregar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 134, 3, 0)+","+"null"+");", httpContext.getMessage( "Agregar", ""), bttBtnagregar_Jsonclick, 7, httpContext.getMessage( "Agregar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1127n1_client"+"'", TempTags, "", 2, "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnhashycomunicaraat_Internalname, "gx.evt.setGridEvt("+GXutil.str( 134, 3, 0)+","+"null"+");", httpContext.getMessage( "Hash y Comunicar a AT", ""), bttBtnhashycomunicaraat_Jsonclick, 5, httpContext.getMessage( "Hash y Comunicar a AT", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOHASHYCOMUNICARAAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 134, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
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
         startgridcontrol134( ) ;
      }
      if ( wbEnd == 134 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_134 = (int)(nGXsfl_134_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV63GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV64GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV126Pgmname), GXutil.rtrim( localUtil.format( AV126Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 170,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTubcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV73TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73TubCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,170);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTubcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavTubcod_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'" + sGXsfl_134_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPlascod_Internalname, GXutil.ltrim( localUtil.ntoc( AV75PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV75PlasCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPlascod_Jsonclick, 0, "Attribute", "", "", "", "", edtavPlascod_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2_WP.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV61DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_173_27N2( true) ;
      }
      else
      {
         wb_table2_173_27N2( false) ;
      }
      return  ;
   }

   public void wb_table2_173_27N2e( boolean wbgen )
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
      if ( wbEnd == 134 )
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

   public void start27N2( )
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
      strup27N0( ) ;
   }

   public void ws27N2( )
   {
      start27N2( ) ;
      evt27N2( ) ;
   }

   public void evt27N2( )
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
                           e1227N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1327N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1427N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOHASHYCOMUNICARAAT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoHashyComunicaraAT' */
                           e1527N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1627N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1727N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1827N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARALBKGME.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1927N2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2027N2 ();
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
                           nGXsfl_134_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1342( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV116GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActionGroup1), 4, 0));
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3391AlbSer = httpContext.cgiGet( edtAlbSer_Internalname) ;
                           A8879AlbSerD = httpContext.cgiGet( edtAlbSerD_Internalname) ;
                           A3392AlbColNom = httpContext.cgiGet( edtAlbColNom_Internalname) ;
                           A3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A12232AlbNomCli = httpContext.cgiGet( edtAlbNomCli_Internalname) ;
                           A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
                           A3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
                           A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1206TubCod = false ;
                           A1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n6466PlasCod = false ;
                           A6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2441AlbHdrObs = httpContext.cgiGet( edtAlbHdrObs_Internalname) ;
                           cmbAlbProVal.setName( cmbAlbProVal.getInternalname() );
                           cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
                           A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2127N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2227N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2327N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2427N2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
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

   public void we27N2( )
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

   public void pa27N2( )
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
      subsflControlProps_1342( ) ;
      while ( nGXsfl_134_idx <= nRC_GXsfl_134 )
      {
         sendrow_1342( ) ;
         nGXsfl_134_idx = ((subGrid_Islastpage==1)&&(nGXsfl_134_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_134_idx+1) ;
         sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1342( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5EmprCod ,
                                 long AV6AlbProCod ,
                                 String AV25TFBarNHdr ,
                                 String AV26TFBarNHdr_Sel ,
                                 byte AV59TFBarSit ,
                                 byte AV60TFBarSit_To ,
                                 String AV27TFAlbSer ,
                                 String AV28TFAlbSer_Sel ,
                                 String AV29TFAlbSerD ,
                                 String AV30TFAlbSerD_Sel ,
                                 String AV31TFAlbColNom ,
                                 String AV32TFAlbColNom_Sel ,
                                 int AV33TFAlbColNum ,
                                 int AV34TFAlbColNum_To ,
                                 String AV35TFAlbNomCli ,
                                 String AV36TFAlbNomCli_Sel ,
                                 java.math.BigDecimal AV37TFBarAlbKgmE ,
                                 java.math.BigDecimal AV38TFBarAlbKgmE_To ,
                                 short AV39TFAlbHdrAnc ,
                                 short AV40TFAlbHdrAnc_To ,
                                 short AV41TFAlbHdrgm2 ,
                                 short AV42TFAlbHdrgm2_To ,
                                 java.math.BigDecimal AV43TFBarAlbMtrE ,
                                 java.math.BigDecimal AV44TFBarAlbMtrE_To ,
                                 int AV45TFBarAlbPie ,
                                 int AV46TFBarAlbPie_To ,
                                 short AV47TFTubCod ,
                                 short AV48TFTubCod_To ,
                                 int AV49TFBarAlbTub ,
                                 int AV50TFBarAlbTub_To ,
                                 short AV51TFPlasCod ,
                                 short AV52TFPlasCod_To ,
                                 short AV53TFBarAlbPlas ,
                                 short AV54TFBarAlbPlas_To ,
                                 String AV55TFAlbHdrObs ,
                                 String AV56TFAlbHdrObs_Sel ,
                                 GXSimpleCollection<String> AV58TFAlbProVal_Sels ,
                                 String AV126Pgmname ,
                                 short AV22OrderedBy ,
                                 boolean AV23OrderedDsc ,
                                 byte AV12AlbEnvFtp ,
                                 java.util.Date AV9AlbProFch ,
                                 String AV10AlbSec ,
                                 String AV13AlbLic ,
                                 short AV93Moda21 ,
                                 String AV92CliFacMtsP ,
                                 byte AV108errkgs ,
                                 String AV8GuiRemCln )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2227N2 ();
      GRID_nCurrentRecord = 0 ;
      rf27N2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBKGME", getSecureSignedToken( "", localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBMTRE", getSecureSignedToken( "", localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBMTRE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPIE", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
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
      if ( cmbavAlbproval.getItemCount() > 0 )
      {
         AV77AlbProVal = cmbavAlbproval.getValidValue(AV77AlbProVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77AlbProVal", AV77AlbProVal);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbproval.setValue( GXutil.rtrim( AV77AlbProVal) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Values", cmbavAlbproval.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf27N2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV126Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126Pgmname", AV126Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      edtavGuiremcln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcln_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27N2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(134) ;
      /* Execute user event: Refresh */
      e2227N2 ();
      nGXsfl_134_idx = 1 ;
      sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1342( ) ;
      bGXsfl_134_Refreshing = true ;
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
         subsflControlProps_1342( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A2839AlbProVal ,
                                              AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                              AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                              AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                              Byte.valueOf(AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) ,
                                              Byte.valueOf(AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) ,
                                              AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                              AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                              AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                              AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                              AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                              AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                              Integer.valueOf(AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) ,
                                              Integer.valueOf(AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) ,
                                              AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                              AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                              AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                              AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                              Short.valueOf(AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) ,
                                              Short.valueOf(AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) ,
                                              Short.valueOf(AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) ,
                                              Short.valueOf(AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) ,
                                              AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                              AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                              Integer.valueOf(AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) ,
                                              Integer.valueOf(AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) ,
                                              Short.valueOf(AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) ,
                                              Short.valueOf(AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) ,
                                              Integer.valueOf(AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) ,
                                              Integer.valueOf(AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) ,
                                              Short.valueOf(AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) ,
                                              Short.valueOf(AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) ,
                                              Short.valueOf(AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) ,
                                              Short.valueOf(AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) ,
                                              AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                              AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                              Integer.valueOf(AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels.size()) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Byte.valueOf(A213BarSit) ,
                                              A3391AlbSer ,
                                              A8879AlbSerD ,
                                              A3392AlbColNom ,
                                              Integer.valueOf(A3393AlbColNum) ,
                                              A12232AlbNomCli ,
                                              A1261BarAlbKgmE ,
                                              Short.valueOf(A3271AlbHdrAnc) ,
                                              Short.valueOf(A5019AlbHdrgm2) ,
                                              A1263BarAlbMtrE ,
                                              Integer.valueOf(A1265BarAlbPie) ,
                                              Short.valueOf(A1206TubCod) ,
                                              Integer.valueOf(A1266BarAlbTub) ,
                                              Short.valueOf(A6466PlasCod) ,
                                              Short.valueOf(A6467BarAlbPlas) ,
                                              A2441AlbHdrObs ,
                                              Short.valueOf(AV22OrderedBy) ,
                                              Boolean.valueOf(AV23OrderedDsc) ,
                                              AV5EmprCod ,
                                              Long.valueOf(AV6AlbProCod) ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                              }
         });
         lV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr), 11, "%") ;
         lV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser), 16, "%") ;
         lV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd), 26, "%") ;
         lV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom), 13, "%") ;
         lV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli), 13, "%") ;
         lV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs), 60, "%") ;
         /* Using cursor H027N2 */
         pr_default.execute(0, new Object[] {AV5EmprCod, Long.valueOf(AV6AlbProCod), lV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr, AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel, Byte.valueOf(AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit), Byte.valueOf(AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to), lV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser, AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel, lV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd, AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel, lV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom, AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel, Integer.valueOf(AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum), Integer.valueOf(AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to), lV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli, AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel, AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme, AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to, Short.valueOf(AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc), Short.valueOf(AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to), Short.valueOf(AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2), Short.valueOf(AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to), AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre, AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to, Integer.valueOf(AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie), Integer.valueOf(AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to), Short.valueOf(AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod), Short.valueOf(AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to), Integer.valueOf(AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub), Integer.valueOf(AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to), Short.valueOf(AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod), Short.valueOf(AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to), Short.valueOf(AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas), Short.valueOf(AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to), lV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs, AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_134_idx = 1 ;
         sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1342( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A30AlbProCod = H027N2_A30AlbProCod[0] ;
            A396EmprCod = H027N2_A396EmprCod[0] ;
            A2839AlbProVal = H027N2_A2839AlbProVal[0] ;
            A2441AlbHdrObs = H027N2_A2441AlbHdrObs[0] ;
            A6467BarAlbPlas = H027N2_A6467BarAlbPlas[0] ;
            A6466PlasCod = H027N2_A6466PlasCod[0] ;
            n6466PlasCod = H027N2_n6466PlasCod[0] ;
            A1266BarAlbTub = H027N2_A1266BarAlbTub[0] ;
            A1206TubCod = H027N2_A1206TubCod[0] ;
            n1206TubCod = H027N2_n1206TubCod[0] ;
            A1265BarAlbPie = H027N2_A1265BarAlbPie[0] ;
            A1263BarAlbMtrE = H027N2_A1263BarAlbMtrE[0] ;
            A5019AlbHdrgm2 = H027N2_A5019AlbHdrgm2[0] ;
            A3271AlbHdrAnc = H027N2_A3271AlbHdrAnc[0] ;
            A1261BarAlbKgmE = H027N2_A1261BarAlbKgmE[0] ;
            A12232AlbNomCli = H027N2_A12232AlbNomCli[0] ;
            A3393AlbColNum = H027N2_A3393AlbColNum[0] ;
            A3392AlbColNom = H027N2_A3392AlbColNom[0] ;
            A8879AlbSerD = H027N2_A8879AlbSerD[0] ;
            A3391AlbSer = H027N2_A3391AlbSer[0] ;
            A213BarSit = H027N2_A213BarSit[0] ;
            A130BarCodPar = H027N2_A130BarCodPar[0] ;
            A132BarCodReo = H027N2_A132BarCodReo[0] ;
            A129BarCod = H027N2_A129BarCod[0] ;
            A213BarSit = H027N2_A213BarSit[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e2327N2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(134) ;
         wb27N0( ) ;
      }
      bGXsfl_134_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27N2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD"+"_"+sGXsfl_134_idx, getSecureSignedToken( sGXsfl_134_idx, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO"+"_"+sGXsfl_134_idx, getSecureSignedToken( sGXsfl_134_idx, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR"+"_"+sGXsfl_134_idx, getSecureSignedToken( sGXsfl_134_idx, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBKGME"+"_"+sGXsfl_134_idx, getSecureSignedToken( sGXsfl_134_idx, localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBMTRE"+"_"+sGXsfl_134_idx, getSecureSignedToken( sGXsfl_134_idx, localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBPIE"+"_"+sGXsfl_134_idx, getSecureSignedToken( sGXsfl_134_idx, localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV93Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIFACMTSP", GXutil.rtrim( AV92CliFacMtsP));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV92CliFacMtsP, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRKGS", GXutil.ltrim( localUtil.ntoc( AV108errkgs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108errkgs), "9")));
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
      AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV25TFBarNHdr ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV26TFBarNHdr_Sel ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV59TFBarSit ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV60TFBarSit_To ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV27TFAlbSer ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV28TFAlbSer_Sel ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV29TFAlbSerD ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV30TFAlbSerD_Sel ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV31TFAlbColNom ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV32TFAlbColNom_Sel ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV33TFAlbColNum ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV34TFAlbColNum_To ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV35TFAlbNomCli ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV36TFAlbNomCli_Sel ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV37TFBarAlbKgmE ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV38TFBarAlbKgmE_To ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV39TFAlbHdrAnc ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV40TFAlbHdrAnc_To ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV41TFAlbHdrgm2 ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV42TFAlbHdrgm2_To ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV43TFBarAlbMtrE ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV44TFBarAlbMtrE_To ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV45TFBarAlbPie ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV46TFBarAlbPie_To ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV47TFTubCod ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV48TFTubCod_To ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV49TFBarAlbTub ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV50TFBarAlbTub_To ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV51TFPlasCod ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV52TFPlasCod_To ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV53TFBarAlbPlas ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV54TFBarAlbPlas_To ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV55TFAlbHdrObs ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV56TFAlbHdrObs_Sel ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV58TFAlbProVal_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                           AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                           AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                           Byte.valueOf(AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) ,
                                           Byte.valueOf(AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) ,
                                           AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                           AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                           AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                           AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                           AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                           AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                           Integer.valueOf(AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) ,
                                           AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                           AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                           AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                           AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                           Short.valueOf(AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) ,
                                           Short.valueOf(AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) ,
                                           Short.valueOf(AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) ,
                                           Short.valueOf(AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) ,
                                           AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                           AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                           Integer.valueOf(AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) ,
                                           Integer.valueOf(AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) ,
                                           Short.valueOf(AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) ,
                                           Short.valueOf(AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) ,
                                           Integer.valueOf(AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) ,
                                           Integer.valueOf(AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) ,
                                           Short.valueOf(AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) ,
                                           Short.valueOf(AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) ,
                                           Short.valueOf(AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) ,
                                           Short.valueOf(AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) ,
                                           AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                           AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                           Integer.valueOf(AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           Short.valueOf(AV22OrderedBy) ,
                                           Boolean.valueOf(AV23OrderedDsc) ,
                                           AV5EmprCod ,
                                           Long.valueOf(AV6AlbProCod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr), 11, "%") ;
      lV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser), 16, "%") ;
      lV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd), 26, "%") ;
      lV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom), 13, "%") ;
      lV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli), 13, "%") ;
      lV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs), 60, "%") ;
      /* Using cursor H027N3 */
      pr_default.execute(1, new Object[] {AV5EmprCod, Long.valueOf(AV6AlbProCod), lV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr, AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel, Byte.valueOf(AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit), Byte.valueOf(AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to), lV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser, AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel, lV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd, AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel, lV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom, AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel, Integer.valueOf(AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum), Integer.valueOf(AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to), lV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli, AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel, AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme, AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to, Short.valueOf(AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc), Short.valueOf(AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to), Short.valueOf(AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2), Short.valueOf(AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to), AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre, AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to, Integer.valueOf(AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie), Integer.valueOf(AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to), Short.valueOf(AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod), Short.valueOf(AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to), Integer.valueOf(AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub), Integer.valueOf(AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to), Short.valueOf(AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod), Short.valueOf(AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to), Short.valueOf(AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas), Short.valueOf(AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to), lV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs, AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel});
      GRID_nRecordCount = H027N3_AGRID_nRecordCount[0] ;
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
      AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV25TFBarNHdr ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV26TFBarNHdr_Sel ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV59TFBarSit ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV60TFBarSit_To ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV27TFAlbSer ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV28TFAlbSer_Sel ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV29TFAlbSerD ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV30TFAlbSerD_Sel ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV31TFAlbColNom ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV32TFAlbColNom_Sel ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV33TFAlbColNum ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV34TFAlbColNum_To ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV35TFAlbNomCli ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV36TFAlbNomCli_Sel ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV37TFBarAlbKgmE ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV38TFBarAlbKgmE_To ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV39TFAlbHdrAnc ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV40TFAlbHdrAnc_To ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV41TFAlbHdrgm2 ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV42TFAlbHdrgm2_To ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV43TFBarAlbMtrE ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV44TFBarAlbMtrE_To ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV45TFBarAlbPie ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV46TFBarAlbPie_To ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV47TFTubCod ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV48TFTubCod_To ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV49TFBarAlbTub ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV50TFBarAlbTub_To ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV51TFPlasCod ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV52TFPlasCod_To ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV53TFBarAlbPlas ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV54TFBarAlbPlas_To ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV55TFAlbHdrObs ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV56TFAlbHdrObs_Sel ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV58TFAlbProVal_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6AlbProCod, AV25TFBarNHdr, AV26TFBarNHdr_Sel, AV59TFBarSit, AV60TFBarSit_To, AV27TFAlbSer, AV28TFAlbSer_Sel, AV29TFAlbSerD, AV30TFAlbSerD_Sel, AV31TFAlbColNom, AV32TFAlbColNom_Sel, AV33TFAlbColNum, AV34TFAlbColNum_To, AV35TFAlbNomCli, AV36TFAlbNomCli_Sel, AV37TFBarAlbKgmE, AV38TFBarAlbKgmE_To, AV39TFAlbHdrAnc, AV40TFAlbHdrAnc_To, AV41TFAlbHdrgm2, AV42TFAlbHdrgm2_To, AV43TFBarAlbMtrE, AV44TFBarAlbMtrE_To, AV45TFBarAlbPie, AV46TFBarAlbPie_To, AV47TFTubCod, AV48TFTubCod_To, AV49TFBarAlbTub, AV50TFBarAlbTub_To, AV51TFPlasCod, AV52TFPlasCod_To, AV53TFBarAlbPlas, AV54TFBarAlbPlas_To, AV55TFAlbHdrObs, AV56TFAlbHdrObs_Sel, AV58TFAlbProVal_Sels, AV126Pgmname, AV22OrderedBy, AV23OrderedDsc, AV12AlbEnvFtp, AV9AlbProFch, AV10AlbSec, AV13AlbLic, AV93Moda21, AV92CliFacMtsP, AV108errkgs, AV8GuiRemCln) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV25TFBarNHdr ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV26TFBarNHdr_Sel ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV59TFBarSit ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV60TFBarSit_To ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV27TFAlbSer ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV28TFAlbSer_Sel ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV29TFAlbSerD ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV30TFAlbSerD_Sel ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV31TFAlbColNom ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV32TFAlbColNom_Sel ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV33TFAlbColNum ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV34TFAlbColNum_To ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV35TFAlbNomCli ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV36TFAlbNomCli_Sel ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV37TFBarAlbKgmE ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV38TFBarAlbKgmE_To ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV39TFAlbHdrAnc ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV40TFAlbHdrAnc_To ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV41TFAlbHdrgm2 ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV42TFAlbHdrgm2_To ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV43TFBarAlbMtrE ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV44TFBarAlbMtrE_To ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV45TFBarAlbPie ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV46TFBarAlbPie_To ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV47TFTubCod ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV48TFTubCod_To ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV49TFBarAlbTub ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV50TFBarAlbTub_To ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV51TFPlasCod ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV52TFPlasCod_To ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV53TFBarAlbPlas ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV54TFBarAlbPlas_To ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV55TFAlbHdrObs ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV56TFAlbHdrObs_Sel ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV58TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6AlbProCod, AV25TFBarNHdr, AV26TFBarNHdr_Sel, AV59TFBarSit, AV60TFBarSit_To, AV27TFAlbSer, AV28TFAlbSer_Sel, AV29TFAlbSerD, AV30TFAlbSerD_Sel, AV31TFAlbColNom, AV32TFAlbColNom_Sel, AV33TFAlbColNum, AV34TFAlbColNum_To, AV35TFAlbNomCli, AV36TFAlbNomCli_Sel, AV37TFBarAlbKgmE, AV38TFBarAlbKgmE_To, AV39TFAlbHdrAnc, AV40TFAlbHdrAnc_To, AV41TFAlbHdrgm2, AV42TFAlbHdrgm2_To, AV43TFBarAlbMtrE, AV44TFBarAlbMtrE_To, AV45TFBarAlbPie, AV46TFBarAlbPie_To, AV47TFTubCod, AV48TFTubCod_To, AV49TFBarAlbTub, AV50TFBarAlbTub_To, AV51TFPlasCod, AV52TFPlasCod_To, AV53TFBarAlbPlas, AV54TFBarAlbPlas_To, AV55TFAlbHdrObs, AV56TFAlbHdrObs_Sel, AV58TFAlbProVal_Sels, AV126Pgmname, AV22OrderedBy, AV23OrderedDsc, AV12AlbEnvFtp, AV9AlbProFch, AV10AlbSec, AV13AlbLic, AV93Moda21, AV92CliFacMtsP, AV108errkgs, AV8GuiRemCln) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV25TFBarNHdr ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV26TFBarNHdr_Sel ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV59TFBarSit ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV60TFBarSit_To ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV27TFAlbSer ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV28TFAlbSer_Sel ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV29TFAlbSerD ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV30TFAlbSerD_Sel ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV31TFAlbColNom ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV32TFAlbColNom_Sel ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV33TFAlbColNum ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV34TFAlbColNum_To ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV35TFAlbNomCli ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV36TFAlbNomCli_Sel ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV37TFBarAlbKgmE ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV38TFBarAlbKgmE_To ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV39TFAlbHdrAnc ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV40TFAlbHdrAnc_To ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV41TFAlbHdrgm2 ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV42TFAlbHdrgm2_To ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV43TFBarAlbMtrE ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV44TFBarAlbMtrE_To ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV45TFBarAlbPie ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV46TFBarAlbPie_To ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV47TFTubCod ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV48TFTubCod_To ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV49TFBarAlbTub ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV50TFBarAlbTub_To ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV51TFPlasCod ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV52TFPlasCod_To ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV53TFBarAlbPlas ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV54TFBarAlbPlas_To ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV55TFAlbHdrObs ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV56TFAlbHdrObs_Sel ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV58TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6AlbProCod, AV25TFBarNHdr, AV26TFBarNHdr_Sel, AV59TFBarSit, AV60TFBarSit_To, AV27TFAlbSer, AV28TFAlbSer_Sel, AV29TFAlbSerD, AV30TFAlbSerD_Sel, AV31TFAlbColNom, AV32TFAlbColNom_Sel, AV33TFAlbColNum, AV34TFAlbColNum_To, AV35TFAlbNomCli, AV36TFAlbNomCli_Sel, AV37TFBarAlbKgmE, AV38TFBarAlbKgmE_To, AV39TFAlbHdrAnc, AV40TFAlbHdrAnc_To, AV41TFAlbHdrgm2, AV42TFAlbHdrgm2_To, AV43TFBarAlbMtrE, AV44TFBarAlbMtrE_To, AV45TFBarAlbPie, AV46TFBarAlbPie_To, AV47TFTubCod, AV48TFTubCod_To, AV49TFBarAlbTub, AV50TFBarAlbTub_To, AV51TFPlasCod, AV52TFPlasCod_To, AV53TFBarAlbPlas, AV54TFBarAlbPlas_To, AV55TFAlbHdrObs, AV56TFAlbHdrObs_Sel, AV58TFAlbProVal_Sels, AV126Pgmname, AV22OrderedBy, AV23OrderedDsc, AV12AlbEnvFtp, AV9AlbProFch, AV10AlbSec, AV13AlbLic, AV93Moda21, AV92CliFacMtsP, AV108errkgs, AV8GuiRemCln) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV25TFBarNHdr ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV26TFBarNHdr_Sel ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV59TFBarSit ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV60TFBarSit_To ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV27TFAlbSer ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV28TFAlbSer_Sel ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV29TFAlbSerD ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV30TFAlbSerD_Sel ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV31TFAlbColNom ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV32TFAlbColNom_Sel ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV33TFAlbColNum ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV34TFAlbColNum_To ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV35TFAlbNomCli ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV36TFAlbNomCli_Sel ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV37TFBarAlbKgmE ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV38TFBarAlbKgmE_To ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV39TFAlbHdrAnc ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV40TFAlbHdrAnc_To ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV41TFAlbHdrgm2 ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV42TFAlbHdrgm2_To ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV43TFBarAlbMtrE ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV44TFBarAlbMtrE_To ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV45TFBarAlbPie ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV46TFBarAlbPie_To ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV47TFTubCod ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV48TFTubCod_To ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV49TFBarAlbTub ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV50TFBarAlbTub_To ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV51TFPlasCod ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV52TFPlasCod_To ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV53TFBarAlbPlas ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV54TFBarAlbPlas_To ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV55TFAlbHdrObs ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV56TFAlbHdrObs_Sel ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV58TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6AlbProCod, AV25TFBarNHdr, AV26TFBarNHdr_Sel, AV59TFBarSit, AV60TFBarSit_To, AV27TFAlbSer, AV28TFAlbSer_Sel, AV29TFAlbSerD, AV30TFAlbSerD_Sel, AV31TFAlbColNom, AV32TFAlbColNom_Sel, AV33TFAlbColNum, AV34TFAlbColNum_To, AV35TFAlbNomCli, AV36TFAlbNomCli_Sel, AV37TFBarAlbKgmE, AV38TFBarAlbKgmE_To, AV39TFAlbHdrAnc, AV40TFAlbHdrAnc_To, AV41TFAlbHdrgm2, AV42TFAlbHdrgm2_To, AV43TFBarAlbMtrE, AV44TFBarAlbMtrE_To, AV45TFBarAlbPie, AV46TFBarAlbPie_To, AV47TFTubCod, AV48TFTubCod_To, AV49TFBarAlbTub, AV50TFBarAlbTub_To, AV51TFPlasCod, AV52TFPlasCod_To, AV53TFBarAlbPlas, AV54TFBarAlbPlas_To, AV55TFAlbHdrObs, AV56TFAlbHdrObs_Sel, AV58TFAlbProVal_Sels, AV126Pgmname, AV22OrderedBy, AV23OrderedDsc, AV12AlbEnvFtp, AV9AlbProFch, AV10AlbSec, AV13AlbLic, AV93Moda21, AV92CliFacMtsP, AV108errkgs, AV8GuiRemCln) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV25TFBarNHdr ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV26TFBarNHdr_Sel ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV59TFBarSit ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV60TFBarSit_To ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV27TFAlbSer ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV28TFAlbSer_Sel ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV29TFAlbSerD ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV30TFAlbSerD_Sel ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV31TFAlbColNom ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV32TFAlbColNom_Sel ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV33TFAlbColNum ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV34TFAlbColNum_To ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV35TFAlbNomCli ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV36TFAlbNomCli_Sel ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV37TFBarAlbKgmE ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV38TFBarAlbKgmE_To ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV39TFAlbHdrAnc ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV40TFAlbHdrAnc_To ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV41TFAlbHdrgm2 ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV42TFAlbHdrgm2_To ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV43TFBarAlbMtrE ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV44TFBarAlbMtrE_To ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV45TFBarAlbPie ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV46TFBarAlbPie_To ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV47TFTubCod ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV48TFTubCod_To ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV49TFBarAlbTub ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV50TFBarAlbTub_To ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV51TFPlasCod ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV52TFPlasCod_To ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV53TFBarAlbPlas ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV54TFBarAlbPlas_To ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV55TFAlbHdrObs ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV56TFAlbHdrObs_Sel ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV58TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6AlbProCod, AV25TFBarNHdr, AV26TFBarNHdr_Sel, AV59TFBarSit, AV60TFBarSit_To, AV27TFAlbSer, AV28TFAlbSer_Sel, AV29TFAlbSerD, AV30TFAlbSerD_Sel, AV31TFAlbColNom, AV32TFAlbColNom_Sel, AV33TFAlbColNum, AV34TFAlbColNum_To, AV35TFAlbNomCli, AV36TFAlbNomCli_Sel, AV37TFBarAlbKgmE, AV38TFBarAlbKgmE_To, AV39TFAlbHdrAnc, AV40TFAlbHdrAnc_To, AV41TFAlbHdrgm2, AV42TFAlbHdrgm2_To, AV43TFBarAlbMtrE, AV44TFBarAlbMtrE_To, AV45TFBarAlbPie, AV46TFBarAlbPie_To, AV47TFTubCod, AV48TFTubCod_To, AV49TFBarAlbTub, AV50TFBarAlbTub_To, AV51TFPlasCod, AV52TFPlasCod_To, AV53TFBarAlbPlas, AV54TFBarAlbPlas_To, AV55TFAlbHdrObs, AV56TFAlbHdrObs_Sel, AV58TFAlbProVal_Sels, AV126Pgmname, AV22OrderedBy, AV23OrderedDsc, AV12AlbEnvFtp, AV9AlbProFch, AV10AlbSec, AV13AlbLic, AV93Moda21, AV92CliFacMtsP, AV108errkgs, AV8GuiRemCln) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV126Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126Pgmname", AV126Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      edtavGuiremcln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcln_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup27N0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2127N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTUBCOD_DATA"), AV79TubCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPLASCOD_DATA"), AV81PlasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV61DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_134 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_134"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV63GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV64GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV92CliFacMtsP = httpContext.cgiGet( "vCLIFACMTSP") ;
         AV93Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV5EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         AV117Barcod_Selected = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV118Barcodreo_Selected = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV119Barcodpar_Selected = httpContext.cgiGet( "vBARCODPAR_SELECTED") ;
         AV9AlbProFch = localUtil.ctod( httpContext.cgiGet( "vALBPROFCH"), 0) ;
         AV10AlbSec = httpContext.cgiGet( "vALBSEC") ;
         AV11AlbPropri = httpContext.cgiGet( "vALBPROPRI") ;
         AV12AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "vALBENVFTP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV13AlbLic = httpContext.cgiGet( "vALBLIC") ;
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
         Combo_tubcod_Cls = httpContext.cgiGet( "COMBO_TUBCOD_Cls") ;
         Combo_tubcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TUBCOD_Selectedvalue_set") ;
         Combo_tubcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Emptyitem")) ;
         Combo_plascod_Cls = httpContext.cgiGet( "COMBO_PLASCOD_Cls") ;
         Combo_plascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PLASCOD_Selectedvalue_set") ;
         Combo_plascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PLASCOD_Emptyitem")) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_delete_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Title") ;
         Dvelop_confirmpanel_delete_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Confirmationtext") ;
         Dvelop_confirmpanel_delete_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Yesbuttoncaption") ;
         Dvelop_confirmpanel_delete_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Nobuttoncaption") ;
         Dvelop_confirmpanel_delete_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_delete_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Yesbuttonposition") ;
         Dvelop_confirmpanel_delete_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Confirmtype") ;
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
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV65BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarCod), 8, 0));
         }
         else
         {
            AV65BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarCod), 8, 0));
         }
         AV120Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV66BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66BarCodReo", GXutil.str( AV66BarCodReo, 1, 0));
         }
         else
         {
            AV66BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66BarCodReo", GXutil.str( AV66BarCodReo, 1, 0));
         }
         AV67BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67BarCodPar", AV67BarCodPar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBKGME");
            GX_FocusControl = edtavBaralbkgme_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV68BarAlbKgmE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68BarAlbKgmE", GXutil.ltrimstr( AV68BarAlbKgmE, 9, 2));
         }
         else
         {
            AV68BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68BarAlbKgmE", GXutil.ltrimstr( AV68BarAlbKgmE, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdranc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdranc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBHDRANC");
            GX_FocusControl = edtavAlbhdranc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV69AlbHdrAnc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69AlbHdrAnc), 4, 0));
         }
         else
         {
            AV69AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbhdranc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69AlbHdrAnc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBHDRGM2");
            GX_FocusControl = edtavAlbhdrgm2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70AlbHdrgm2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70AlbHdrgm2), 4, 0));
         }
         else
         {
            AV70AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbhdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70AlbHdrgm2), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBMTRE");
            GX_FocusControl = edtavBaralbmtre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71BarAlbMtrE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71BarAlbMtrE", GXutil.ltrimstr( AV71BarAlbMtrE, 9, 2));
         }
         else
         {
            AV71BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71BarAlbMtrE", GXutil.ltrimstr( AV71BarAlbMtrE, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBPIE");
            GX_FocusControl = edtavBaralbpie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72BarAlbPie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarAlbPie), 6, 0));
         }
         else
         {
            AV72BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarAlbPie), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbtub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbtub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBTUB");
            GX_FocusControl = edtavBaralbtub_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV74BarAlbTub = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarAlbTub), 6, 0));
         }
         else
         {
            AV74BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbtub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarAlbTub), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbplas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbplas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBPLAS");
            GX_FocusControl = edtavBaralbplas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76BarAlbPlas = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76BarAlbPlas), 4, 0));
         }
         else
         {
            AV76BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( edtavBaralbplas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76BarAlbPlas), 4, 0));
         }
         AV78AlbHdrObs = httpContext.cgiGet( edtavAlbhdrobs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78AlbHdrObs", AV78AlbHdrObs);
         cmbavAlbproval.setName( cmbavAlbproval.getInternalname() );
         cmbavAlbproval.setValue( httpContext.cgiGet( cmbavAlbproval.getInternalname()) );
         AV77AlbProVal = httpContext.cgiGet( cmbavAlbproval.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77AlbProVal", AV77AlbProVal);
         AV126Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126Pgmname", AV126Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTubcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTubcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTUBCOD");
            GX_FocusControl = edtavTubcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73TubCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TubCod), 4, 0));
         }
         else
         {
            AV73TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavTubcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TubCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPlascod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPlascod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPLASCOD");
            GX_FocusControl = edtavPlascod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75PlasCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75PlasCod), 4, 0));
         }
         else
         {
            AV75PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavPlascod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75PlasCod), 4, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e2127N2 ();
      if (returnInSub) return;
   }

   public void e2127N2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV82Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV82Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82Station", AV82Station);
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV83EmprNom ;
      GXv_char4[0] = AV84UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV82Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_2_wp_impl.this.AV5EmprCod = GXv_char2[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV83EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV84UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV84UsurCod", AV84UsurCod);
      edtavPlascod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPlascod_Visible), 5, 0), true);
      edtavTubcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTubcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTubcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOTUBCOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPLASCOD' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S132 ();
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
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( AV22OrderedBy < 1 )
      {
         AV22OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S162 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV61DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV61DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV93Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV93Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93Moda21), "ZZZ9")));
      GXt_int7 = AV108errkgs ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "ERRKGS", ""), GXv_int8) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV108errkgs = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108errkgs", GXutil.str( AV108errkgs, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108errkgs), "9")));
      GXt_int7 = (byte)(AV122Plasticos) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "PLASTI", ""), GXv_int8) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV122Plasticos = GXt_int7 ;
      GXt_int7 = (byte)(AV121Tubos) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "TUBOSS", ""), GXv_int8) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV121Tubos = GXt_int7 ;
      AV92CliFacMtsP = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92CliFacMtsP", AV92CliFacMtsP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV92CliFacMtsP, ""))));
      if ( AV93Moda21 == 1 )
      {
         GXv_char4[0] = AV5EmprCod ;
         GXv_int9[0] = AV7GuiRemCli ;
         GXv_char3[0] = AV92CliFacMtsP ;
         new app.pclimtspl(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3) ;
         documentodetransporteproduccion_2_wp_impl.this.AV5EmprCod = GXv_char4[0] ;
         documentodetransporteproduccion_2_wp_impl.this.AV7GuiRemCli = GXv_int9[0] ;
         documentodetransporteproduccion_2_wp_impl.this.AV92CliFacMtsP = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7GuiRemCli), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV92CliFacMtsP", AV92CliFacMtsP);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV92CliFacMtsP, ""))));
      }
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV120Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV120Prompt)==0) ? AV127Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV120Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV120Prompt), true);
      AV127Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV120Prompt)==0) ? AV127Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV120Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV120Prompt), true);
   }

   public void e2227N2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV16WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV16WWPContext = GXv_SdtWWPContext10[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S172 ();
      if (returnInSub) return;
      AV63GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GridCurrentPage), 10, 0));
      AV64GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridPageCount), 10, 0));
      AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV25TFBarNHdr ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV26TFBarNHdr_Sel ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV59TFBarSit ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV60TFBarSit_To ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV27TFAlbSer ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV28TFAlbSer_Sel ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV29TFAlbSerD ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV30TFAlbSerD_Sel ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV31TFAlbColNom ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV32TFAlbColNom_Sel ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV33TFAlbColNum ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV34TFAlbColNum_To ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV35TFAlbNomCli ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV36TFAlbNomCli_Sel ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV37TFBarAlbKgmE ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV38TFBarAlbKgmE_To ;
      AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV39TFAlbHdrAnc ;
      AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV40TFAlbHdrAnc_To ;
      AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV41TFAlbHdrgm2 ;
      AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV42TFAlbHdrgm2_To ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV43TFBarAlbMtrE ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV44TFBarAlbMtrE_To ;
      AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV45TFBarAlbPie ;
      AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV46TFBarAlbPie_To ;
      AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV47TFTubCod ;
      AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV48TFTubCod_To ;
      AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV49TFBarAlbTub ;
      AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV50TFBarAlbTub_To ;
      AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV51TFPlasCod ;
      AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV52TFPlasCod_To ;
      AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV53TFBarAlbPlas ;
      AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV54TFBarAlbPlas_To ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV55TFAlbHdrObs ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV56TFAlbHdrObs_Sel ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV58TFAlbProVal_Sels ;
      /*  Sending Event outputs  */
   }

   public void e1227N2( )
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
         AV62PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV62PageToGo) ;
      }
   }

   public void e1327N2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1427N2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV22OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
         AV23OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedDsc", AV23OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV25TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFBarNHdr", AV25TFBarNHdr);
            AV26TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFBarNHdr_Sel", AV26TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV59TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarSit), 2, 0));
            AV60TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbSer") == 0 )
         {
            AV27TFAlbSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbSer", AV27TFAlbSer);
            AV28TFAlbSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbSer_Sel", AV28TFAlbSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbSerD") == 0 )
         {
            AV29TFAlbSerD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbSerD", AV29TFAlbSerD);
            AV30TFAlbSerD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbSerD_Sel", AV30TFAlbSerD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbColNom") == 0 )
         {
            AV31TFAlbColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbColNom", AV31TFAlbColNom);
            AV32TFAlbColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbColNom_Sel", AV32TFAlbColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbColNum") == 0 )
         {
            AV33TFAlbColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFAlbColNum), 6, 0));
            AV34TFAlbColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFAlbColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbNomCli") == 0 )
         {
            AV35TFAlbNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFAlbNomCli", AV35TFAlbNomCli);
            AV36TFAlbNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbNomCli_Sel", AV36TFAlbNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbKgmE") == 0 )
         {
            AV37TFBarAlbKgmE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFBarAlbKgmE", GXutil.ltrimstr( AV37TFBarAlbKgmE, 9, 2));
            AV38TFBarAlbKgmE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFBarAlbKgmE_To", GXutil.ltrimstr( AV38TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrAnc") == 0 )
         {
            AV39TFAlbHdrAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFAlbHdrAnc), 4, 0));
            AV40TFAlbHdrAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrgm2") == 0 )
         {
            AV41TFAlbHdrgm2 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFAlbHdrgm2), 4, 0));
            AV42TFAlbHdrgm2_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbMtrE") == 0 )
         {
            AV43TFBarAlbMtrE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFBarAlbMtrE", GXutil.ltrimstr( AV43TFBarAlbMtrE, 9, 2));
            AV44TFBarAlbMtrE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFBarAlbMtrE_To", GXutil.ltrimstr( AV44TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPie") == 0 )
         {
            AV45TFBarAlbPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFBarAlbPie), 6, 0));
            AV46TFBarAlbPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TubCod") == 0 )
         {
            AV47TFTubCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFTubCod), 4, 0));
            AV48TFTubCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbTub") == 0 )
         {
            AV49TFBarAlbTub = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFBarAlbTub), 6, 0));
            AV50TFBarAlbTub_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PlasCod") == 0 )
         {
            AV51TFPlasCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFPlasCod), 4, 0));
            AV52TFPlasCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFPlasCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPlas") == 0 )
         {
            AV53TFBarAlbPlas = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarAlbPlas), 4, 0));
            AV54TFBarAlbPlas_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarAlbPlas_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrObs") == 0 )
         {
            AV55TFAlbHdrObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbHdrObs", AV55TFAlbHdrObs);
            AV56TFAlbHdrObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbHdrObs_Sel", AV56TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProVal") == 0 )
         {
            AV57TFAlbProVal_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbProVal_SelsJson", AV57TFAlbProVal_SelsJson);
            AV58TFAlbProVal_Sels.fromJSonString(AV57TFAlbProVal_SelsJson, null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV58TFAlbProVal_Sels", AV58TFAlbProVal_Sels);
   }

   private void e2327N2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      if ( AV12AlbEnvFtp != 3 )
      {
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Fases", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      if ( AV12AlbEnvFtp != 3 )
      {
         cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Cerrar Produccion", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( AV12AlbEnvFtp != 3 )
      {
         cmbavGridactiongroup1.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(134) ;
      }
      sendrow_1342( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_134_Refreshing )
      {
         httpContext.doAjaxLoad(134, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV116GridActionGroup1, 4, 0)) );
   }

   public void e2427N2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV116GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV116GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO FASES' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV116GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO CERRARPRODUCCION' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV116GridActionGroup1 == 4 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      AV116GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV116GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e1527N2( )
   {
      /* 'DoHashyComunicaraAT' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_12", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"}) , new Object[] {});
      GXv_char4[0] = AV111Cadena ;
      GXv_char3[0] = AV112firma ;
      new app.documentotransporteproduccion.obtengocadenaparahashdocumentodetransporteproduccion(remoteHandle, context).execute( AV5EmprCod, (int)(AV6AlbProCod), AV9AlbProFch, AV14AlbHhfm, GXv_char4, GXv_char3) ;
      documentodetransporteproduccion_2_wp_impl.this.AV111Cadena = GXv_char4[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV112firma = GXv_char3[0] ;
      GXv_char4[0] = AV113Hash ;
      GXv_objcol_SdtMessages_Message11[0] = AV114Messages ;
      GXv_boolean12[0] = AV115ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV111Cadena, GXv_char4, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
      documentodetransporteproduccion_2_wp_impl.this.AV113Hash = GXv_char4[0] ;
      AV114Messages = GXv_objcol_SdtMessages_Message11[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV115ok = GXv_boolean12[0] ;
      GXv_char4[0] = AV111Cadena ;
      GXv_char3[0] = AV113Hash ;
      new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion(remoteHandle, context).execute( AV5EmprCod, (int)(AV6AlbProCod), GXv_char4, GXv_char3) ;
      documentodetransporteproduccion_2_wp_impl.this.AV111Cadena = GXv_char4[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV113Hash = GXv_char3[0] ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.horasalidadocumentoenvioatdocumentodetransporteproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV14AlbHhfm)),GXutil.URLEncode(GXutil.rtrim(AV11AlbPropri)),GXutil.URLEncode(GXutil.rtrim(AV111Cadena)),GXutil.URLEncode(GXutil.rtrim(AV113Hash))}, new String[] {"Emprcod","AlbProCOD","AlbProSys","albPropri","cadena","hash"}) , new Object[] {"AV5EmprCod","AV6AlbProCod","AV14AlbHhfm","AV11AlbPropri","AV111Cadena","AV113Hash"});
      new app.pelcalb(remoteHandle, context).execute( AV5EmprCod, AV6AlbProCod) ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e1627N2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      new app.pelcalb(remoteHandle, context).execute( AV5EmprCod, AV6AlbProCod) ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S162( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV22OrderedBy, 4, 0))+":"+(AV23OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S182( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_3", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV7GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV10AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV11AlbPropri)),GXutil.URLEncode(GXutil.ltrimstr(AV12AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO FASES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV12AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","AlbEnvFtp","AlbLic"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO CERRARPRODUCCION' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_8", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(A1261BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(A1263BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(A1265BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A1261BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(A1263BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(A1265BarAlbPie,6,0)),GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.ltrimstr(A213BarSit,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProFch))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarAlbKgmE","BarAlbMtrE","BarAlbPie","KilAnt","MtrAnt","PieAnt","Mode","BarSit","AlbProFch"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      AV117Barcod_Selected = A129BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117Barcod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV117Barcod_Selected), 8, 0));
      AV118Barcodreo_Selected = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118Barcodreo_Selected", GXutil.str( AV118Barcodreo_Selected, 1, 0));
      AV119Barcodpar_Selected = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119Barcodpar_Selected", AV119Barcodpar_Selected);
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DELETEContainer", "Confirm", "", new Object[] {});
   }

   public void S222( )
   {
      /* 'DO ACTION DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_3", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV117Barcod_Selected,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV118Barcodreo_Selected,1,0)),GXutil.URLEncode(GXutil.rtrim(AV119Barcodpar_Selected)),GXutil.URLEncode(GXutil.ltrimstr(AV7GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV9AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV10AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV11AlbPropri)),GXutil.URLEncode(GXutil.ltrimstr(AV12AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S152( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue(AV126Pgmname+"GridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV126Pgmname+"GridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV24Session.getValue(AV126Pgmname+"GridState"), null, null);
      }
      AV22OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22OrderedBy), 4, 0));
      AV23OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedDsc", AV23OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S162 ();
      if (returnInSub) return;
      AV163GXV1 = 1 ;
      while ( AV163GXV1 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV163GXV1));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV25TFBarNHdr = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFBarNHdr", AV25TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV26TFBarNHdr_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFBarNHdr_Sel", AV26TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV59TFBarSit = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarSit), 2, 0));
            AV60TFBarSit_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER") == 0 )
         {
            AV27TFAlbSer = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbSer", AV27TFAlbSer);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER_SEL") == 0 )
         {
            AV28TFAlbSer_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbSer_Sel", AV28TFAlbSer_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD") == 0 )
         {
            AV29TFAlbSerD = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbSerD", AV29TFAlbSerD);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD_SEL") == 0 )
         {
            AV30TFAlbSerD_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbSerD_Sel", AV30TFAlbSerD_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM") == 0 )
         {
            AV31TFAlbColNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbColNom", AV31TFAlbColNom);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM_SEL") == 0 )
         {
            AV32TFAlbColNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbColNom_Sel", AV32TFAlbColNom_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNUM") == 0 )
         {
            AV33TFAlbColNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFAlbColNum), 6, 0));
            AV34TFAlbColNum_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFAlbColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI") == 0 )
         {
            AV35TFAlbNomCli = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFAlbNomCli", AV35TFAlbNomCli);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI_SEL") == 0 )
         {
            AV36TFAlbNomCli_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbNomCli_Sel", AV36TFAlbNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV37TFBarAlbKgmE = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFBarAlbKgmE", GXutil.ltrimstr( AV37TFBarAlbKgmE, 9, 2));
            AV38TFBarAlbKgmE_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFBarAlbKgmE_To", GXutil.ltrimstr( AV38TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV39TFAlbHdrAnc = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFAlbHdrAnc), 4, 0));
            AV40TFAlbHdrAnc_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV41TFAlbHdrgm2 = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFAlbHdrgm2), 4, 0));
            AV42TFAlbHdrgm2_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV43TFBarAlbMtrE = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFBarAlbMtrE", GXutil.ltrimstr( AV43TFBarAlbMtrE, 9, 2));
            AV44TFBarAlbMtrE_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFBarAlbMtrE_To", GXutil.ltrimstr( AV44TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV45TFBarAlbPie = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFBarAlbPie), 6, 0));
            AV46TFBarAlbPie_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV47TFTubCod = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFTubCod), 4, 0));
            AV48TFTubCod_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV49TFBarAlbTub = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFBarAlbTub), 6, 0));
            AV50TFBarAlbTub_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPLASCOD") == 0 )
         {
            AV51TFPlasCod = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFPlasCod), 4, 0));
            AV52TFPlasCod_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFPlasCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPLAS") == 0 )
         {
            AV53TFBarAlbPlas = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarAlbPlas), 4, 0));
            AV54TFBarAlbPlas_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarAlbPlas_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV55TFAlbHdrObs = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbHdrObs", AV55TFAlbHdrObs);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV56TFAlbHdrObs_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbHdrObs_Sel", AV56TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV57TFAlbProVal_SelsJson = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbProVal_SelsJson", AV57TFAlbProVal_SelsJson);
            AV58TFAlbProVal_Sels.fromJSonString(AV57TFAlbProVal_SelsJson, null);
         }
         AV163GXV1 = (int)(AV163GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFBarNHdr_Sel)==0), AV26TFBarNHdr_Sel, GXv_char4) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFAlbSer_Sel)==0), AV28TFAlbSer_Sel, GXv_char3) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFAlbSerD_Sel)==0), AV30TFAlbSerD_Sel, GXv_char2) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char14 = GXv_char2[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFAlbColNom_Sel)==0), AV32TFAlbColNom_Sel, GXv_char16) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFAlbNomCli_Sel)==0), AV36TFAlbNomCli_Sel, GXv_char18) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFAlbHdrObs_Sel)==0), AV56TFAlbHdrObs_Sel, GXv_char20) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV58TFAlbProVal_Sels.size()==0), AV57TFAlbProVal_SelsJson, GXv_char22) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char21 = GXv_char22[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char15+"||"+GXt_char17+"||||||||||"+GXt_char19+"|"+GXt_char21 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFBarNHdr)==0), AV25TFBarNHdr, GXv_char22) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFAlbSer)==0), AV27TFAlbSer, GXv_char20) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFAlbSerD)==0), AV29TFAlbSerD, GXv_char18) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFAlbColNom)==0), AV31TFAlbColNom, GXv_char16) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFAlbNomCli)==0), AV35TFAlbNomCli, GXv_char4) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFAlbHdrObs)==0), AV55TFAlbHdrObs, GXv_char3) ;
      documentodetransporteproduccion_2_wp_impl.this.GXt_char13 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char21+"|"+((0==AV59TFBarSit) ? "" : GXutil.str( AV59TFBarSit, 2, 0))+"|"+GXt_char19+"|"+GXt_char17+"|"+GXt_char15+"|"+((0==AV33TFAlbColNum) ? "" : GXutil.str( AV33TFAlbColNum, 6, 0))+"|"+GXt_char14+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarAlbKgmE)==0) ? "" : GXutil.str( AV37TFBarAlbKgmE, 9, 2))+"|"+((0==AV39TFAlbHdrAnc) ? "" : GXutil.str( AV39TFAlbHdrAnc, 4, 0))+"|"+((0==AV41TFAlbHdrgm2) ? "" : GXutil.str( AV41TFAlbHdrgm2, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarAlbMtrE)==0) ? "" : GXutil.str( AV43TFBarAlbMtrE, 9, 2))+"|"+((0==AV45TFBarAlbPie) ? "" : GXutil.str( AV45TFBarAlbPie, 6, 0))+"|"+((0==AV47TFTubCod) ? "" : GXutil.str( AV47TFTubCod, 4, 0))+"|"+((0==AV49TFBarAlbTub) ? "" : GXutil.str( AV49TFBarAlbTub, 6, 0))+"|"+((0==AV51TFPlasCod) ? "" : GXutil.str( AV51TFPlasCod, 4, 0))+"|"+((0==AV53TFBarAlbPlas) ? "" : GXutil.str( AV53TFBarAlbPlas, 4, 0))+"|"+GXt_char13+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV60TFBarSit_To) ? "" : GXutil.str( AV60TFBarSit_To, 2, 0))+"||||"+((0==AV34TFAlbColNum_To) ? "" : GXutil.str( AV34TFAlbColNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFBarAlbKgmE_To)==0) ? "" : GXutil.str( AV38TFBarAlbKgmE_To, 9, 2))+"|"+((0==AV40TFAlbHdrAnc_To) ? "" : GXutil.str( AV40TFAlbHdrAnc_To, 4, 0))+"|"+((0==AV42TFAlbHdrgm2_To) ? "" : GXutil.str( AV42TFAlbHdrgm2_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarAlbMtrE_To)==0) ? "" : GXutil.str( AV44TFBarAlbMtrE_To, 9, 2))+"|"+((0==AV46TFBarAlbPie_To) ? "" : GXutil.str( AV46TFBarAlbPie_To, 6, 0))+"|"+((0==AV48TFTubCod_To) ? "" : GXutil.str( AV48TFTubCod_To, 4, 0))+"|"+((0==AV50TFBarAlbTub_To) ? "" : GXutil.str( AV50TFBarAlbTub_To, 6, 0))+"|"+((0==AV52TFPlasCod_To) ? "" : GXutil.str( AV52TFPlasCod_To, 4, 0))+"|"+((0==AV54TFBarAlbPlas_To) ? "" : GXutil.str( AV54TFBarAlbPlas_To, 4, 0))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV20GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV20GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV20GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV20GridState.fromxml(AV24Session.getValue(AV126Pgmname+"GridState"), null, null);
      AV20GridState.setgxTv_SdtWWPGridState_Orderedby( AV22OrderedBy );
      AV20GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV23OrderedDsc );
      AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARNHDR", "", !(GXutil.strcmp("", AV25TFBarNHdr)==0), (short)(0), AV25TFBarNHdr, "", !(GXutil.strcmp("", AV26TFBarNHdr_Sel)==0), AV26TFBarNHdr_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARSIT", "", !((0==AV59TFBarSit)&&(0==AV60TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV59TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV60TFBarSit_To, 2, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBSER", "", !(GXutil.strcmp("", AV27TFAlbSer)==0), (short)(0), AV27TFAlbSer, "", !(GXutil.strcmp("", AV28TFAlbSer_Sel)==0), AV28TFAlbSer_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBSERD", "", !(GXutil.strcmp("", AV29TFAlbSerD)==0), (short)(0), AV29TFAlbSerD, "", !(GXutil.strcmp("", AV30TFAlbSerD_Sel)==0), AV30TFAlbSerD_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBCOLNOM", "", !(GXutil.strcmp("", AV31TFAlbColNom)==0), (short)(0), AV31TFAlbColNom, "", !(GXutil.strcmp("", AV32TFAlbColNom_Sel)==0), AV32TFAlbColNom_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBCOLNUM", "", !((0==AV33TFAlbColNum)&&(0==AV34TFAlbColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV33TFAlbColNum, 6, 0)), GXutil.trim( GXutil.str( AV34TFAlbColNum_To, 6, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBNOMCLI", "", !(GXutil.strcmp("", AV35TFAlbNomCli)==0), (short)(0), AV35TFAlbNomCli, "", !(GXutil.strcmp("", AV36TFAlbNomCli_Sel)==0), AV36TFAlbNomCli_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARALBKGME", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarAlbKgmE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFBarAlbKgmE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV37TFBarAlbKgmE, 9, 2)), GXutil.trim( GXutil.str( AV38TFBarAlbKgmE_To, 9, 2))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBHDRANC", "", !((0==AV39TFAlbHdrAnc)&&(0==AV40TFAlbHdrAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV39TFAlbHdrAnc, 4, 0)), GXutil.trim( GXutil.str( AV40TFAlbHdrAnc_To, 4, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBHDRGM2", "", !((0==AV41TFAlbHdrgm2)&&(0==AV42TFAlbHdrgm2_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFAlbHdrgm2, 4, 0)), GXutil.trim( GXutil.str( AV42TFAlbHdrgm2_To, 4, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARALBMTRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarAlbMtrE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarAlbMtrE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV43TFBarAlbMtrE, 9, 2)), GXutil.trim( GXutil.str( AV44TFBarAlbMtrE_To, 9, 2))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARALBPIE", "", !((0==AV45TFBarAlbPie)&&(0==AV46TFBarAlbPie_To)), (short)(0), GXutil.trim( GXutil.str( AV45TFBarAlbPie, 6, 0)), GXutil.trim( GXutil.str( AV46TFBarAlbPie_To, 6, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFTUBCOD", "", !((0==AV47TFTubCod)&&(0==AV48TFTubCod_To)), (short)(0), GXutil.trim( GXutil.str( AV47TFTubCod, 4, 0)), GXutil.trim( GXutil.str( AV48TFTubCod_To, 4, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARALBTUB", "", !((0==AV49TFBarAlbTub)&&(0==AV50TFBarAlbTub_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFBarAlbTub, 6, 0)), GXutil.trim( GXutil.str( AV50TFBarAlbTub_To, 6, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFPLASCOD", "", !((0==AV51TFPlasCod)&&(0==AV52TFPlasCod_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFPlasCod, 4, 0)), GXutil.trim( GXutil.str( AV52TFPlasCod_To, 4, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARALBPLAS", "", !((0==AV53TFBarAlbPlas)&&(0==AV54TFBarAlbPlas_To)), (short)(0), GXutil.trim( GXutil.str( AV53TFBarAlbPlas, 4, 0)), GXutil.trim( GXutil.str( AV54TFBarAlbPlas_To, 4, 0))) ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBHDROBS", "", !(GXutil.strcmp("", AV55TFAlbHdrObs)==0), (short)(0), AV55TFAlbHdrObs, "", !(GXutil.strcmp("", AV56TFAlbHdrObs_Sel)==0), AV56TFAlbHdrObs_Sel, "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFALBPROVAL_SEL", "", !(AV58TFAlbProVal_Sels.size()==0), (short)(0), AV58TFAlbProVal_Sels.toJSonString(false), "") ;
      AV20GridState = GXv_SdtWWPGridState23[0] ;
      AV20GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV20GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV126Pgmname+"GridState", AV20GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S142( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV18TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV126Pgmname );
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV17HTTPRequest.getScriptName()+"?"+AV17HTTPRequest.getQuerystring() );
      AV18TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_3" );
      AV24Session.setValue("TrnContext", AV18TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S132( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue(AV126Pgmname+"GridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV126Pgmname+"GridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV24Session.getValue(AV126Pgmname+"GridState"), null, null);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV5EmprCod, httpContext.getMessage( "TUBOSS", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtTubCod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_134_Refreshing);
         GXv_SdtWWPGridState23[0] = AV20GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState23, "TFTUBCOD", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV20GridState = GXv_SdtWWPGridState23[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV126Pgmname+"GridState", AV20GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV5EmprCod, httpContext.getMessage( "TUBOSS", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarAlbTub_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_134_Refreshing);
         GXv_SdtWWPGridState23[0] = AV20GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState23, "TFBARALBTUB", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV20GridState = GXv_SdtWWPGridState23[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV126Pgmname+"GridState", AV20GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV5EmprCod, httpContext.getMessage( "PLASTI", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtPlasCod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_134_Refreshing);
         GXv_SdtWWPGridState23[0] = AV20GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState23, "TFPLASCOD", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV20GridState = GXv_SdtWWPGridState23[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV126Pgmname+"GridState", AV20GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV5EmprCod, httpContext.getMessage( "PLASTI", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarAlbPlas_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_134_Refreshing);
         GXv_SdtWWPGridState23[0] = AV20GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState23, "TFBARALBPLAS", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV20GridState = GXv_SdtWWPGridState23[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV126Pgmname+"GridState", AV20GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOPLASCOD' Routine */
      returnInSub = false ;
      /* Using cursor H027N4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H027N4_A396EmprCod[0] ;
         A14285PlasNomID = H027N4_A14285PlasNomID[0] ;
         A6466PlasCod = H027N4_A6466PlasCod[0] ;
         n6466PlasCod = H027N4_n6466PlasCod[0] ;
         A6474PlasNom = H027N4_A6474PlasNom[0] ;
         n6474PlasNom = H027N4_n6474PlasNom[0] ;
         AV80Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV80Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A6466PlasCod, 4, 0)) );
         AV80Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14285PlasNomID );
         AV81PlasCod_Data.add(AV80Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_plascod_Selectedvalue_set = ((0==AV75PlasCod) ? "" : GXutil.trim( GXutil.str( AV75PlasCod, 4, 0))) ;
      ucCombo_plascod.sendProperty(context, "", false, Combo_plascod_Internalname, "SelectedValue_set", Combo_plascod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOTUBCOD' Routine */
      returnInSub = false ;
      /* Using cursor H027N5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H027N5_A396EmprCod[0] ;
         A13813TubNomID = H027N5_A13813TubNomID[0] ;
         A1207TubNom = H027N5_A1207TubNom[0] ;
         n1207TubNom = H027N5_n1207TubNom[0] ;
         A1206TubCod = H027N5_A1206TubCod[0] ;
         n1206TubCod = H027N5_n1206TubCod[0] ;
         AV80Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV80Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A1206TubCod, 4, 0)) );
         AV80Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13813TubNomID );
         AV79TubCod_Data.add(AV80Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_tubcod_Selectedvalue_set = ((0==AV73TubCod) ? "" : GXutil.trim( GXutil.str( AV73TubCod, 4, 0))) ;
      ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "SelectedValue_set", Combo_tubcod_Selectedvalue_set);
   }

   public void e1727N2( )
   {
      /* Barcodpar_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char22[0] = AV5EmprCod ;
      GXv_int9[0] = AV65BarCod ;
      GXv_int8[0] = AV66BarCodReo ;
      GXv_char20[0] = AV67BarCodPar ;
      GXv_int24[0] = (byte)(AV85FlagHdr) ;
      new app.pexihdr(remoteHandle, context).execute( GXv_char22, GXv_int9, GXv_int8, GXv_char20, GXv_int24) ;
      documentodetransporteproduccion_2_wp_impl.this.AV5EmprCod = GXv_char22[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV65BarCod = GXv_int9[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV66BarCodReo = GXv_int8[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV67BarCodPar = GXv_char20[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV85FlagHdr = GXv_int24[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV65BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV66BarCodReo", GXutil.str( AV66BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV67BarCodPar", AV67BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV85FlagHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85FlagHdr), 4, 0));
      if ( (0==AV85FlagHdr) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº OS", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( AV93Moda21 == 1 ) && ( GXutil.strcmp(AV11AlbPropri, "1") == 0 ) && ( AV105BarEstReo == 2 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Ordem Serviço nao autorizada. Es uma Reclamaçao ¡¡¡", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_decimal25[0] = AV88Metros ;
            GXv_decimal26[0] = AV86BarMla ;
            GXv_decimal27[0] = AV89BarKgm ;
            GXv_decimal28[0] = AV87BarKla ;
            GXv_int9[0] = AV90PzasLan ;
            GXv_int29[0] = AV91BarPlz ;
            new app.pkgsmts(remoteHandle, context).execute( AV5EmprCod, AV65BarCod, AV66BarCodReo, AV67BarCodPar, GXv_decimal25, GXv_decimal26, GXv_decimal27, GXv_decimal28, GXv_int9, GXv_int29) ;
            documentodetransporteproduccion_2_wp_impl.this.AV88Metros = GXv_decimal25[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV86BarMla = GXv_decimal26[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV89BarKgm = GXv_decimal27[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV87BarKla = GXv_decimal28[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV90PzasLan = (short)((short)(GXv_int9[0])) ;
            documentodetransporteproduccion_2_wp_impl.this.AV91BarPlz = (short)((short)(GXv_int29[0])) ;
            GXv_char22[0] = AV5EmprCod ;
            GXv_int29[0] = AV65BarCod ;
            GXv_int24[0] = AV66BarCodReo ;
            GXv_char20[0] = AV67BarCodPar ;
            GXv_decimal28[0] = AV94KgsHdr ;
            new app.pkilos(remoteHandle, context).execute( GXv_char22, GXv_int29, GXv_int24, GXv_char20, GXv_decimal28) ;
            documentodetransporteproduccion_2_wp_impl.this.AV5EmprCod = GXv_char22[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV65BarCod = GXv_int29[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV66BarCodReo = GXv_int24[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV67BarCodPar = GXv_char20[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV94KgsHdr = GXv_decimal28[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV65BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV66BarCodReo", GXutil.str( AV66BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV67BarCodPar", AV67BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV94KgsHdr", GXutil.ltrimstr( AV94KgsHdr, 9, 2));
            GXv_int30[0] = AV69AlbHdrAnc ;
            GXv_char22[0] = AV102AlbColNom ;
            GXv_int29[0] = AV103AlbColNum ;
            GXv_int24[0] = AV104AlbTipCol ;
            GXv_char20[0] = AV95AlbSer ;
            GXv_char18[0] = AV96AlbSerD ;
            GXv_int9[0] = AV97AlbCliCod ;
            GXv_char16[0] = AV98AlbNomCli ;
            GXv_int31[0] = AV99AlbNumcli ;
            GXv_int32[0] = AV100AlbTipArt ;
            GXv_int33[0] = AV70AlbHdrgm2 ;
            GXv_char4[0] = AV101AlbEncCli ;
            GXv_int8[0] = AV105BarEstReo ;
            GXv_char3[0] = AV106BarTipCor ;
            GXv_int34[0] = AV109BarSit ;
            new app.documentotransporteproduccion.documentodetransporteproduccion_datoshdrguia(remoteHandle, context).execute( AV5EmprCod, AV65BarCod, AV66BarCodReo, AV67BarCodPar, GXv_int30, GXv_char22, GXv_int29, GXv_int24, GXv_char20, GXv_char18, GXv_int9, GXv_char16, GXv_int31, GXv_int32, GXv_int33, GXv_char4, GXv_int8, GXv_char3, GXv_int34) ;
            documentodetransporteproduccion_2_wp_impl.this.AV69AlbHdrAnc = GXv_int30[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV102AlbColNom = GXv_char22[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV103AlbColNum = GXv_int29[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV104AlbTipCol = GXv_int24[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV95AlbSer = GXv_char20[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV96AlbSerD = GXv_char18[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV97AlbCliCod = GXv_int9[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV98AlbNomCli = GXv_char16[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV99AlbNumcli = GXv_int31[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV100AlbTipArt = GXv_int32[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV70AlbHdrgm2 = GXv_int33[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV101AlbEncCli = GXv_char4[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV105BarEstReo = GXv_int8[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV106BarTipCor = GXv_char3[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV109BarSit = GXv_int34[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69AlbHdrAnc), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV70AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70AlbHdrgm2), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV105BarEstReo", GXutil.str( AV105BarEstReo, 1, 0));
            if ( AV97AlbCliCod != AV7GuiRemCli )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente errado", ""));
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( AV109BarSit == 9 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está fechado", ""));
                  /* Execute user subroutine: 'INICIALIZARCAMPOS' */
                  S232 ();
                  if (returnInSub) return;
                  GX_FocusControl = edtavBarcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( AV109BarSit == 11 )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está no HISTÓRICO", ""));
                     GX_FocusControl = edtavBarcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     AV68BarAlbKgmE = AV89BarKgm ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV68BarAlbKgmE", GXutil.ltrimstr( AV68BarAlbKgmE, 9, 2));
                     if ( (0==AV93Moda21) )
                     {
                        AV71BarAlbMtrE = AV88Metros ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV71BarAlbMtrE", GXutil.ltrimstr( AV71BarAlbMtrE, 9, 2));
                     }
                     if ( ( AV90PzasLan > 0 ) && ( ( ( AV93Moda21 == 1 ) && ( GXutil.strcmp(AV92CliFacMtsP, "N") == 0 ) ) || (0==AV93Moda21) ) )
                     {
                        AV72BarAlbPie = AV90PzasLan ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV72BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarAlbPie), 6, 0));
                     }
                     AV74BarAlbTub = AV72BarAlbPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV74BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarAlbTub), 6, 0));
                     if ( AV93Moda21 == 1 )
                     {
                        AV70AlbHdrgm2 = (short)(((GXutil.strcmp(AV92CliFacMtsP, "S")!=0) ? AV70AlbHdrgm2 : 0)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV70AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70AlbHdrgm2), 4, 0));
                        AV69AlbHdrAnc = (short)(((GXutil.strcmp(AV92CliFacMtsP, "S")!=0) ? AV69AlbHdrAnc : 0)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV69AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69AlbHdrAnc), 4, 0));
                        if ( GXutil.strcmp(AV92CliFacMtsP, "N") == 0 )
                        {
                           AV71BarAlbMtrE = (((AV70AlbHdrgm2*AV69AlbHdrAnc)>0) ? (AV68BarAlbKgmE.divide(DecimalUtil.doubleToDec((AV70AlbHdrgm2*(AV69AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV71BarAlbMtrE", GXutil.ltrimstr( AV71BarAlbMtrE, 9, 2));
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1827N2( )
   {
      /* Barcodpar_Isvalid Routine */
      returnInSub = false ;
      edtavBarcod_Backcolor = GXutil.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Backcolor), 9, 0), true);
      GXv_char22[0] = AV5EmprCod ;
      GXv_int31[0] = AV65BarCod ;
      GXv_int34[0] = AV66BarCodReo ;
      GXv_char20[0] = AV67BarCodPar ;
      GXv_int24[0] = (byte)(AV85FlagHdr) ;
      new app.pexihdr(remoteHandle, context).execute( GXv_char22, GXv_int31, GXv_int34, GXv_char20, GXv_int24) ;
      documentodetransporteproduccion_2_wp_impl.this.AV5EmprCod = GXv_char22[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV65BarCod = GXv_int31[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV66BarCodReo = GXv_int34[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV67BarCodPar = GXv_char20[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV85FlagHdr = GXv_int24[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV65BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV66BarCodReo", GXutil.str( AV66BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV67BarCodPar", AV67BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV85FlagHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85FlagHdr), 4, 0));
      if ( (0==AV85FlagHdr) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº OS", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( AV93Moda21 == 1 ) && ( GXutil.strcmp(AV11AlbPropri, "1") == 0 ) && ( AV105BarEstReo == 2 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Ordem Serviço nao autorizada. Es uma Reclamaçao ¡¡¡", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_decimal28[0] = AV88Metros ;
            GXv_decimal27[0] = AV86BarMla ;
            GXv_decimal26[0] = AV89BarKgm ;
            GXv_decimal25[0] = AV87BarKla ;
            GXv_int31[0] = AV90PzasLan ;
            GXv_int29[0] = AV91BarPlz ;
            new app.pkgsmts(remoteHandle, context).execute( AV5EmprCod, AV65BarCod, AV66BarCodReo, AV67BarCodPar, GXv_decimal28, GXv_decimal27, GXv_decimal26, GXv_decimal25, GXv_int31, GXv_int29) ;
            documentodetransporteproduccion_2_wp_impl.this.AV88Metros = GXv_decimal28[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV86BarMla = GXv_decimal27[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV89BarKgm = GXv_decimal26[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV87BarKla = GXv_decimal25[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV90PzasLan = (short)((short)(GXv_int31[0])) ;
            documentodetransporteproduccion_2_wp_impl.this.AV91BarPlz = (short)((short)(GXv_int29[0])) ;
            GXv_char22[0] = AV5EmprCod ;
            GXv_int31[0] = AV65BarCod ;
            GXv_int34[0] = AV66BarCodReo ;
            GXv_char20[0] = AV67BarCodPar ;
            GXv_decimal28[0] = AV94KgsHdr ;
            new app.pkilos(remoteHandle, context).execute( GXv_char22, GXv_int31, GXv_int34, GXv_char20, GXv_decimal28) ;
            documentodetransporteproduccion_2_wp_impl.this.AV5EmprCod = GXv_char22[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV65BarCod = GXv_int31[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV66BarCodReo = GXv_int34[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV67BarCodPar = GXv_char20[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV94KgsHdr = GXv_decimal28[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV65BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV66BarCodReo", GXutil.str( AV66BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV67BarCodPar", AV67BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV94KgsHdr", GXutil.ltrimstr( AV94KgsHdr, 9, 2));
            GXv_int33[0] = AV69AlbHdrAnc ;
            GXv_char22[0] = AV102AlbColNom ;
            GXv_int31[0] = AV103AlbColNum ;
            GXv_int34[0] = AV104AlbTipCol ;
            GXv_char20[0] = AV95AlbSer ;
            GXv_char18[0] = AV96AlbSerD ;
            GXv_int29[0] = AV97AlbCliCod ;
            GXv_char16[0] = AV98AlbNomCli ;
            GXv_int9[0] = AV99AlbNumcli ;
            GXv_int32[0] = AV100AlbTipArt ;
            GXv_int30[0] = AV70AlbHdrgm2 ;
            GXv_char4[0] = AV101AlbEncCli ;
            GXv_int24[0] = AV105BarEstReo ;
            GXv_char3[0] = AV106BarTipCor ;
            GXv_int8[0] = AV109BarSit ;
            new app.documentotransporteproduccion.documentodetransporteproduccion_datoshdrguia(remoteHandle, context).execute( AV5EmprCod, AV65BarCod, AV66BarCodReo, AV67BarCodPar, GXv_int33, GXv_char22, GXv_int31, GXv_int34, GXv_char20, GXv_char18, GXv_int29, GXv_char16, GXv_int9, GXv_int32, GXv_int30, GXv_char4, GXv_int24, GXv_char3, GXv_int8) ;
            documentodetransporteproduccion_2_wp_impl.this.AV69AlbHdrAnc = GXv_int33[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV102AlbColNom = GXv_char22[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV103AlbColNum = GXv_int31[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV104AlbTipCol = GXv_int34[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV95AlbSer = GXv_char20[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV96AlbSerD = GXv_char18[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV97AlbCliCod = GXv_int29[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV98AlbNomCli = GXv_char16[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV99AlbNumcli = GXv_int9[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV100AlbTipArt = GXv_int32[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV70AlbHdrgm2 = GXv_int30[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV101AlbEncCli = GXv_char4[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV105BarEstReo = GXv_int24[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV106BarTipCor = GXv_char3[0] ;
            documentodetransporteproduccion_2_wp_impl.this.AV109BarSit = GXv_int8[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69AlbHdrAnc), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV70AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70AlbHdrgm2), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV105BarEstReo", GXutil.str( AV105BarEstReo, 1, 0));
            if ( AV97AlbCliCod != AV7GuiRemCli )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente errado", ""));
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( AV109BarSit == 9 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está fechado", ""));
                  GX_FocusControl = edtavBarcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( AV109BarSit == 11 )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está no HISTÓRICO", ""));
                     GX_FocusControl = edtavBarcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     AV68BarAlbKgmE = AV89BarKgm ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV68BarAlbKgmE", GXutil.ltrimstr( AV68BarAlbKgmE, 9, 2));
                     if ( (0==AV93Moda21) )
                     {
                        AV71BarAlbMtrE = AV88Metros ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV71BarAlbMtrE", GXutil.ltrimstr( AV71BarAlbMtrE, 9, 2));
                     }
                     if ( ( AV90PzasLan > 0 ) && ( ( ( AV93Moda21 == 1 ) && ( GXutil.strcmp(AV92CliFacMtsP, "N") == 0 ) ) || (0==AV93Moda21) ) )
                     {
                        AV72BarAlbPie = AV90PzasLan ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV72BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarAlbPie), 6, 0));
                     }
                     AV74BarAlbTub = AV72BarAlbPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV74BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarAlbTub), 6, 0));
                     if ( AV93Moda21 == 1 )
                     {
                        AV70AlbHdrgm2 = (short)(((GXutil.strcmp(AV92CliFacMtsP, "S")!=0) ? AV70AlbHdrgm2 : 0)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV70AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70AlbHdrgm2), 4, 0));
                        AV69AlbHdrAnc = (short)(((GXutil.strcmp(AV92CliFacMtsP, "S")!=0) ? AV69AlbHdrAnc : 0)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV69AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69AlbHdrAnc), 4, 0));
                        if ( GXutil.strcmp(AV92CliFacMtsP, "N") == 0 )
                        {
                           AV71BarAlbMtrE = (((AV70AlbHdrgm2*AV69AlbHdrAnc)>0) ? (AV68BarAlbKgmE.divide(DecimalUtil.doubleToDec((AV70AlbHdrgm2*(AV69AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV71BarAlbMtrE", GXutil.ltrimstr( AV71BarAlbMtrE, 9, 2));
                        }
                     }
                     if ( ( AV93Moda21 == 1 ) && ( GXutil.strcmp(AV106BarTipCor, "SI") == 0 ) )
                     {
                        edtavBarcod_Backcolor = GXutil.getColor( 255, 255, 0) ;
                        httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Backcolor), 9, 0), true);
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1927N2( )
   {
      /* Baralbkgme_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char22[0] = AV5EmprCod ;
      GXv_int35[0] = AV6AlbProCod ;
      GXv_int31[0] = AV65BarCod ;
      GXv_int34[0] = AV66BarCodReo ;
      GXv_char20[0] = AV67BarCodPar ;
      GXv_decimal28[0] = AV68BarAlbKgmE ;
      GXv_char18[0] = AV84UsurCod ;
      GXv_char16[0] = AV82Station ;
      GXv_char4[0] = AV126Pgmname ;
      new app.pmodmer(remoteHandle, context).execute( GXv_char22, GXv_int35, GXv_int31, GXv_int34, GXv_char20, GXv_decimal28, GXv_char18, GXv_char16, GXv_char4) ;
      documentodetransporteproduccion_2_wp_impl.this.AV5EmprCod = GXv_char22[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV6AlbProCod = GXv_int35[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV65BarCod = GXv_int31[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV66BarCodReo = GXv_int34[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV67BarCodPar = GXv_char20[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV68BarAlbKgmE = GXv_decimal28[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV84UsurCod = GXv_char18[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV82Station = GXv_char16[0] ;
      documentodetransporteproduccion_2_wp_impl.this.AV126Pgmname = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProCod), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV65BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV66BarCodReo", GXutil.str( AV66BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV67BarCodPar", AV67BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV68BarAlbKgmE", GXutil.ltrimstr( AV68BarAlbKgmE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV84UsurCod", AV84UsurCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV82Station", AV82Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV126Pgmname", AV126Pgmname);
      AV107Msg_k = httpContext.getMessage( "Os quilos saidos= ", "") + GXutil.str( AV68BarAlbKgmE, 9, 2) + httpContext.getMessage( ", são maiores do que os quilos da OS= ", "") + GXutil.str( AV94KgsHdr, 9, 2) ;
      if ( ( AV93Moda21 == 1 ) && ( DecimalUtil.compareTo(AV68BarAlbKgmE, AV94KgsHdr) > 0 ) && ( AV108errkgs == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV107Msg_k);
         GX_FocusControl = edtavBaralbkgme_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      if ( AV93Moda21 == 1 )
      {
         if ( GXutil.strcmp(AV92CliFacMtsP, "N") == 0 )
         {
            AV71BarAlbMtrE = (((AV70AlbHdrgm2*AV69AlbHdrAnc)>0) ? (AV68BarAlbKgmE.divide(DecimalUtil.doubleToDec((AV70AlbHdrgm2*(AV69AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71BarAlbMtrE", GXutil.ltrimstr( AV71BarAlbMtrE, 9, 2));
         }
      }
      /*  Sending Event outputs  */
   }

   public void e2027N2( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV65BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV66BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV67BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV7GuiRemCli,6,0)),GXutil.URLEncode(GXutil.ltrimstr(5,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"AV5EmprCod","AV65BarCod","AV66BarCodReo","AV67BarCodPar","AV7GuiRemCli",""});
      /*  Sending Event outputs  */
   }

   public void S232( )
   {
      /* 'INICIALIZARCAMPOS' Routine */
      returnInSub = false ;
      AV68BarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68BarAlbKgmE", GXutil.ltrimstr( AV68BarAlbKgmE, 9, 2));
      AV71BarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71BarAlbMtrE", GXutil.ltrimstr( AV71BarAlbMtrE, 9, 2));
      AV72BarAlbPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarAlbPie), 6, 0));
      AV76BarAlbPlas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76BarAlbPlas), 4, 0));
      AV74BarAlbTub = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarAlbTub), 6, 0));
      AV97AlbCliCod = 0 ;
      AV102AlbColNom = "" ;
      AV103AlbColNum = 0 ;
      AV101AlbEncCli = "" ;
      AV69AlbHdrAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69AlbHdrAnc), 4, 0));
      AV70AlbHdrgm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70AlbHdrgm2), 4, 0));
      AV78AlbHdrObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78AlbHdrObs", AV78AlbHdrObs);
      AV73TubCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TubCod), 4, 0));
      Combo_tubcod_Selectedvalue_set = ((0==AV73TubCod) ? "" : GXutil.trim( GXutil.str( AV73TubCod, 4, 0))) ;
      ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "SelectedValue_set", Combo_tubcod_Selectedvalue_set);
      AV75PlasCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75PlasCod), 4, 0));
      Combo_plascod_Selectedvalue_set = ((0==AV75PlasCod) ? "" : GXutil.trim( GXutil.str( AV75PlasCod, 4, 0))) ;
      ucCombo_plascod.sendProperty(context, "", false, Combo_plascod_Internalname, "SelectedValue_set", Combo_plascod_Selectedvalue_set);
   }

   public void wb_table2_173_27N2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_delete_Internalname, tblTabledvelop_confirmpanel_delete_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_delete.setProperty("Title", Dvelop_confirmpanel_delete_Title);
         ucDvelop_confirmpanel_delete.setProperty("ConfirmationText", Dvelop_confirmpanel_delete_Confirmationtext);
         ucDvelop_confirmpanel_delete.setProperty("YesButtonCaption", Dvelop_confirmpanel_delete_Yesbuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("NoButtonCaption", Dvelop_confirmpanel_delete_Nobuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("CancelButtonCaption", Dvelop_confirmpanel_delete_Cancelbuttoncaption);
         ucDvelop_confirmpanel_delete.setProperty("YesButtonPosition", Dvelop_confirmpanel_delete_Yesbuttonposition);
         ucDvelop_confirmpanel_delete.setProperty("ConfirmType", Dvelop_confirmpanel_delete_Confirmtype);
         ucDvelop_confirmpanel_delete.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_delete_Internalname, "DVELOP_CONFIRMPANEL_DELETEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_DELETEContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_173_27N2e( true) ;
      }
      else
      {
         wb_table2_173_27N2e( false) ;
      }
   }

   public void wb_table1_111_27N2( boolean wbgen )
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
         wb_table1_111_27N2e( true) ;
      }
      else
      {
         wb_table1_111_27N2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      Gx_mode = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV5EmprCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV6AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProCod), 10, 0));
      AV7GuiRemCli = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7GuiRemCli), 6, 0));
      AV8GuiRemCln = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8GuiRemCln", AV8GuiRemCln);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8GuiRemCln, ""))));
      AV9AlbProFch = (java.util.Date)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProFch", localUtil.format(AV9AlbProFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV9AlbProFch));
      AV10AlbSec = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbSec", AV10AlbSec);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10AlbSec, "@!"))));
      AV11AlbPropri = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11AlbPropri", AV11AlbPropri);
      AV12AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbEnvFtp", GXutil.str( AV12AlbEnvFtp, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12AlbEnvFtp), "9")));
      AV13AlbLic = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13AlbLic", AV13AlbLic);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13AlbLic, ""))));
      AV14AlbHhfm = (java.util.Date)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14AlbHhfm", localUtil.ttoc( AV14AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      pa27N2( ) ;
      ws27N2( ) ;
      we27N2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116151212", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_2_wp.js", "?202682116151212", false, true);
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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

   public void subsflControlProps_1342( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_134_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_134_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_134_idx ;
      edtAlbSer_Internalname = "ALBSER_"+sGXsfl_134_idx ;
      edtAlbSerD_Internalname = "ALBSERD_"+sGXsfl_134_idx ;
      edtAlbColNom_Internalname = "ALBCOLNOM_"+sGXsfl_134_idx ;
      edtAlbColNum_Internalname = "ALBCOLNUM_"+sGXsfl_134_idx ;
      edtAlbNomCli_Internalname = "ALBNOMCLI_"+sGXsfl_134_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_134_idx ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC_"+sGXsfl_134_idx ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2_"+sGXsfl_134_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_134_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_134_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_134_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_134_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_134_idx ;
      edtTubCod_Internalname = "TUBCOD_"+sGXsfl_134_idx ;
      edtBarAlbTub_Internalname = "BARALBTUB_"+sGXsfl_134_idx ;
      edtPlasCod_Internalname = "PLASCOD_"+sGXsfl_134_idx ;
      edtBarAlbPlas_Internalname = "BARALBPLAS_"+sGXsfl_134_idx ;
      edtAlbHdrObs_Internalname = "ALBHDROBS_"+sGXsfl_134_idx ;
      cmbAlbProVal.setInternalname( "ALBPROVAL_"+sGXsfl_134_idx );
   }

   public void subsflControlProps_fel_1342( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_134_fel_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_134_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_134_fel_idx ;
      edtAlbSer_Internalname = "ALBSER_"+sGXsfl_134_fel_idx ;
      edtAlbSerD_Internalname = "ALBSERD_"+sGXsfl_134_fel_idx ;
      edtAlbColNom_Internalname = "ALBCOLNOM_"+sGXsfl_134_fel_idx ;
      edtAlbColNum_Internalname = "ALBCOLNUM_"+sGXsfl_134_fel_idx ;
      edtAlbNomCli_Internalname = "ALBNOMCLI_"+sGXsfl_134_fel_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_134_fel_idx ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC_"+sGXsfl_134_fel_idx ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2_"+sGXsfl_134_fel_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_134_fel_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_134_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_134_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_134_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_134_fel_idx ;
      edtTubCod_Internalname = "TUBCOD_"+sGXsfl_134_fel_idx ;
      edtBarAlbTub_Internalname = "BARALBTUB_"+sGXsfl_134_fel_idx ;
      edtPlasCod_Internalname = "PLASCOD_"+sGXsfl_134_fel_idx ;
      edtBarAlbPlas_Internalname = "BARALBPLAS_"+sGXsfl_134_fel_idx ;
      edtAlbHdrObs_Internalname = "ALBHDROBS_"+sGXsfl_134_fel_idx ;
      cmbAlbProVal.setInternalname( "ALBPROVAL_"+sGXsfl_134_fel_idx );
   }

   public void sendrow_1342( )
   {
      subsflControlProps_1342( ) ;
      wb27N0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_134_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_134_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_134_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 135,'',false,'"+sGXsfl_134_idx+"',134)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_134_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV116GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV116GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV116GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_134_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,135);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV116GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_134_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSer_Internalname,GXutil.rtrim( A3391AlbSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSerD_Internalname,GXutil.rtrim( A8879AlbSerD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSerD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNom_Internalname,GXutil.rtrim( A3392AlbColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNomCli_Internalname,GXutil.rtrim( A12232AlbNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrgm2_Internalname,GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrgm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTubCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTubCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTubCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTubCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbTub_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbTub_Internalname,GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbTub_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbTub_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPlasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6466PlasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPlasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbPlas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPlas_Internalname,GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPlas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAlbPlas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrObs_Internalname,GXutil.rtrim( A2441AlbHdrObs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(134),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProVal.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROVAL_" + sGXsfl_134_idx ;
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
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), !bGXsfl_134_Refreshing);
         send_integrity_lvl_hashes27N2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_134_idx = ((subGrid_Islastpage==1)&&(nGXsfl_134_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_134_idx+1) ;
         sGXsfl_134_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_134_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1342( ) ;
      }
      /* End function sendrow_1342 */
   }

   public void startgridcontrol134( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"134\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "KIlos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTubCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tubo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbTub_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPlasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Plastico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbPlas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV116GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTubCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbTub_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2441AlbHdrObs));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2839AlbProVal));
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
      edtavGuiremcln_Internalname = "vGUIREMCLN" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavBaralbkgme_Internalname = "vBARALBKGME" ;
      edtavAlbhdranc_Internalname = "vALBHDRANC" ;
      edtavAlbhdrgm2_Internalname = "vALBHDRGM2" ;
      edtavBaralbmtre_Internalname = "vBARALBMTRE" ;
      edtavBaralbpie_Internalname = "vBARALBPIE" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblockcombo_tubcod_Internalname = "TEXTBLOCKCOMBO_TUBCOD" ;
      Combo_tubcod_Internalname = "COMBO_TUBCOD" ;
      divTablesplittedtubcod_Internalname = "TABLESPLITTEDTUBCOD" ;
      edtavBaralbtub_Internalname = "vBARALBTUB" ;
      lblTextblockcombo_plascod_Internalname = "TEXTBLOCKCOMBO_PLASCOD" ;
      Combo_plascod_Internalname = "COMBO_PLASCOD" ;
      divTablesplittedplascod_Internalname = "TABLESPLITTEDPLASCOD" ;
      edtavBaralbplas_Internalname = "vBARALBPLAS" ;
      edtavAlbhdrobs_Internalname = "vALBHDROBS" ;
      cmbavAlbproval.setInternalname( "vALBPROVAL" );
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      bttBtnagregar_Internalname = "BTNAGREGAR" ;
      bttBtnhashycomunicaraat_Internalname = "BTNHASHYCOMUNICARAAT" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtAlbSer_Internalname = "ALBSER" ;
      edtAlbSerD_Internalname = "ALBSERD" ;
      edtAlbColNom_Internalname = "ALBCOLNOM" ;
      edtAlbColNum_Internalname = "ALBCOLNUM" ;
      edtAlbNomCli_Internalname = "ALBNOMCLI" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC" ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      edtBarAlbPie_Internalname = "BARALBPIE" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtTubCod_Internalname = "TUBCOD" ;
      edtBarAlbTub_Internalname = "BARALBTUB" ;
      edtPlasCod_Internalname = "PLASCOD" ;
      edtBarAlbPlas_Internalname = "BARALBPLAS" ;
      edtAlbHdrObs_Internalname = "ALBHDROBS" ;
      cmbAlbProVal.setInternalname( "ALBPROVAL" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavTubcod_Internalname = "vTUBCOD" ;
      edtavPlascod_Internalname = "vPLASCOD" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_delete_Internalname = "DVELOP_CONFIRMPANEL_DELETE" ;
      tblTabledvelop_confirmpanel_delete_Internalname = "TABLEDVELOP_CONFIRMPANEL_DELETE" ;
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
      cmbAlbProVal.setJsonclick( "" );
      edtAlbHdrObs_Jsonclick = "" ;
      edtBarAlbPlas_Jsonclick = "" ;
      edtPlasCod_Jsonclick = "" ;
      edtBarAlbTub_Jsonclick = "" ;
      edtTubCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtAlbHdrgm2_Jsonclick = "" ;
      edtAlbHdrAnc_Jsonclick = "" ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtAlbNomCli_Jsonclick = "" ;
      edtAlbColNum_Jsonclick = "" ;
      edtAlbColNom_Jsonclick = "" ;
      edtAlbSerD_Jsonclick = "" ;
      edtAlbSer_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPlascod_Jsonclick = "" ;
      edtavPlascod_Visible = 1 ;
      edtavTubcod_Jsonclick = "" ;
      edtavTubcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavAlbproval.setJsonclick( "" );
      cmbavAlbproval.setEnabled( 1 );
      edtavAlbhdrobs_Jsonclick = "" ;
      edtavAlbhdrobs_Enabled = 1 ;
      edtavBaralbplas_Jsonclick = "" ;
      edtavBaralbplas_Enabled = 1 ;
      edtavBaralbtub_Jsonclick = "" ;
      edtavBaralbtub_Enabled = 1 ;
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
      edtavBarcod_Backstyle = (byte)(-1) ;
      edtavBarcod_Backcolor = (int)(0xFFFFFF) ;
      edtavBarcod_Enabled = 1 ;
      edtavGuiremcln_Jsonclick = "" ;
      edtavGuiremcln_Enabled = 0 ;
      edtavGuiremcli_Jsonclick = "" ;
      edtavGuiremcli_Enabled = 0 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_delete_Confirmtype = "1" ;
      Dvelop_confirmpanel_delete_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_delete_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_delete_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_delete_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_delete_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_delete_Title = "" ;
      Ddo_grid_Datalistproc = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2_WPGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||||||S:Si,N:No" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||||||||T" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic|Dynamic|Dynamic||Dynamic||||||||||Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "T||T|T|T||T||||||||||T|T" ;
      Ddo_grid_Filterisrange = "|T||||T||T|T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18" ;
      Ddo_grid_Columnids = "1:BarNHdr|2:BarSit|3:AlbSer|4:AlbSerD|5:AlbColNom|6:AlbColNum|7:AlbNomCli|8:BarAlbKgmE|9:AlbHdrAnc|10:AlbHdrgm2|11:BarAlbMtrE|12:BarAlbPie|16:TubCod|17:BarAlbTub|18:PlasCod|19:BarAlbPlas|20:AlbHdrObs|21:AlbProVal" ;
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
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Agregar", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Combo_plascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_plascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tubcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_tubcod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Detalle de Producciones", "") );
      edtBarAlbPlas_Visible = -1 ;
      edtPlasCod_Visible = -1 ;
      edtBarAlbTub_Visible = -1 ;
      edtTubCod_Visible = -1 ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbproval.setName( "vALBPROVAL" );
      cmbavAlbproval.setWebtags( "" );
      cmbavAlbproval.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbavAlbproval.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbavAlbproval.getItemCount() > 0 )
      {
         AV77AlbProVal = cmbavAlbproval.getValidValue(AV77AlbProVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77AlbProVal", AV77AlbProVal);
      }
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_134_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV116GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV116GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActionGroup1), 4, 0));
      }
      GXCCtl = "ALBPROVAL_" + sGXsfl_134_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV26TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV27TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV28TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV29TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV30TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV31TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV32TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV33TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV36TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV37TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV39TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV40TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV41TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV42TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV43TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV44TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV45TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV46TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV47TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV48TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV49TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV50TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV51TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV52TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV53TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV54TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV55TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV56TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV58TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV12AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV9AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV13AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV93Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV92CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV108errkgs',fld:'vERRKGS',pic:'9',hsh:true},{av:'AV8GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV63GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV64GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1227N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV25TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV26TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV27TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV28TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV29TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV30TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV31TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV32TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV33TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV36TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV37TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV39TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV40TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV41TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV42TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV43TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV44TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV45TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV46TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV47TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV48TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV49TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV50TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV51TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV52TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV53TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV54TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV55TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV56TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV58TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV12AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV9AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV13AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV93Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV92CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV108errkgs',fld:'vERRKGS',pic:'9',hsh:true},{av:'AV8GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1327N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV25TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV26TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV27TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV28TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV29TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV30TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV31TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV32TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV33TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV36TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV37TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV39TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV40TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV41TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV42TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV43TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV44TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV45TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV46TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV47TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV48TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV49TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV50TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV51TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV52TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV53TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV54TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV55TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV56TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV58TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV12AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV9AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV13AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV93Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV92CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV108errkgs',fld:'vERRKGS',pic:'9',hsh:true},{av:'AV8GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1427N2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV25TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV26TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV27TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV28TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV29TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV30TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV31TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV32TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV33TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV36TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV37TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV39TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV40TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV41TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV42TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV43TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV44TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV45TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV46TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV47TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV48TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV49TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV50TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV51TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV52TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV53TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV54TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV55TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV56TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV58TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV12AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV9AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV13AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV93Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV92CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV108errkgs',fld:'vERRKGS',pic:'9',hsh:true},{av:'AV8GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TFAlbProVal_SelsJson',fld:'vTFALBPROVAL_SELSJSON',pic:''},{av:'AV58TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV55TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV56TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV53TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV54TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV51TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV52TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV49TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV50TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV47TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV48TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV45TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV46TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV43TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV44TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV41TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV42TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV39TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV40TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV37TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV35TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV36TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV33TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV32TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV29TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV30TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV27TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV28TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV25TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV26TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2327N2',iparms:[{av:'AV12AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV116GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2427N2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV116GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV25TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV26TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV59TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV60TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV27TFAlbSer',fld:'vTFALBSER',pic:''},{av:'AV28TFAlbSer_Sel',fld:'vTFALBSER_SEL',pic:''},{av:'AV29TFAlbSerD',fld:'vTFALBSERD',pic:''},{av:'AV30TFAlbSerD_Sel',fld:'vTFALBSERD_SEL',pic:''},{av:'AV31TFAlbColNom',fld:'vTFALBCOLNOM',pic:''},{av:'AV32TFAlbColNom_Sel',fld:'vTFALBCOLNOM_SEL',pic:''},{av:'AV33TFAlbColNum',fld:'vTFALBCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFAlbColNum_To',fld:'vTFALBCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFAlbNomCli',fld:'vTFALBNOMCLI',pic:''},{av:'AV36TFAlbNomCli_Sel',fld:'vTFALBNOMCLI_SEL',pic:''},{av:'AV37TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV39TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV40TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV41TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV42TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV43TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV44TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV45TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV46TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV47TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV48TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV49TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV50TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV51TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV52TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV53TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV54TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV55TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV56TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV58TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV23OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV12AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV9AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV13AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV93Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV92CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV108errkgs',fld:'vERRKGS',pic:'9',hsh:true},{av:'AV8GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV7GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV116GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV117Barcod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV118Barcodreo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV119Barcodpar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'AV63GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV64GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOAGREGAR'","{handler:'e1127N1',iparms:[]");
      setEventMetadata("'DOAGREGAR'",",oparms:[]}");
      setEventMetadata("'DOHASHYCOMUNICARAAT'","{handler:'e1527N2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV9AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV14AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'}]");
      setEventMetadata("'DOHASHYCOMUNICARAAT'",",oparms:[{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV14AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1627N2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VBARCODPAR.CONTROLVALUECHANGED","{handler:'e1727N2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV66BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV67BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV85FlagHdr',fld:'vFLAGHDR',pic:'ZZZ9'},{av:'AV93Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV105BarEstReo',fld:'vBARESTREO',pic:'9'},{av:'AV94KgsHdr',fld:'vKGSHDR',pic:'ZZZZZ9.99'},{av:'AV7GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV92CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV72BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("VBARCODPAR.CONTROLVALUECHANGED",",oparms:[{av:'AV85FlagHdr',fld:'vFLAGHDR',pic:'ZZZ9'},{av:'AV67BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV66BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV65BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94KgsHdr',fld:'vKGSHDR',pic:'ZZZZZ9.99'},{av:'AV105BarEstReo',fld:'vBARESTREO',pic:'9'},{av:'AV70AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV69AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'},{av:'AV68BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV71BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV72BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'},{av:'AV74BarAlbTub',fld:'vBARALBTUB',pic:'ZZZ9'},{av:'AV76BarAlbPlas',fld:'vBARALBPLAS',pic:'ZZZ9'},{av:'AV78AlbHdrObs',fld:'vALBHDROBS',pic:''},{av:'AV73TubCod',fld:'vTUBCOD',pic:'ZZZ9'},{av:'Combo_tubcod_Selectedvalue_set',ctrl:'COMBO_TUBCOD',prop:'SelectedValue_set'},{av:'AV75PlasCod',fld:'vPLASCOD',pic:'ZZZ9'},{av:'Combo_plascod_Selectedvalue_set',ctrl:'COMBO_PLASCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("VBARCODPAR.ISVALID","{handler:'e1827N2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV66BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV67BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV85FlagHdr',fld:'vFLAGHDR',pic:'ZZZ9'},{av:'AV93Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV11AlbPropri',fld:'vALBPROPRI',pic:'9'},{av:'AV105BarEstReo',fld:'vBARESTREO',pic:'9'},{av:'AV94KgsHdr',fld:'vKGSHDR',pic:'ZZZZZ9.99'},{av:'AV7GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV92CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV72BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("VBARCODPAR.ISVALID",",oparms:[{av:'edtavBarcod_Backcolor',ctrl:'vBARCOD',prop:'Backcolor'},{av:'AV85FlagHdr',fld:'vFLAGHDR',pic:'ZZZ9'},{av:'AV67BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV66BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV65BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94KgsHdr',fld:'vKGSHDR',pic:'ZZZZZ9.99'},{av:'AV105BarEstReo',fld:'vBARESTREO',pic:'9'},{av:'AV70AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV69AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'},{av:'AV68BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV71BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV72BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'},{av:'AV74BarAlbTub',fld:'vBARALBTUB',pic:'ZZZ9'}]}");
      setEventMetadata("VBARALBKGME.CONTROLVALUECHANGED","{handler:'e1927N2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV65BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV66BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV67BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV68BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV84UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV82Station',fld:'vSTATION',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV94KgsHdr',fld:'vKGSHDR',pic:'ZZZZZ9.99'},{av:'AV93Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV108errkgs',fld:'vERRKGS',pic:'9',hsh:true},{av:'AV92CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV70AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV69AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'}]");
      setEventMetadata("VBARALBKGME.CONTROLVALUECHANGED",",oparms:[{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV82Station',fld:'vSTATION',pic:''},{av:'AV84UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV68BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV67BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV66BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV65BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e2027N2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV66BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV67BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV7GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV67BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV66BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV65BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_ALBPROCOD","{handler:'validv_Albprocod',iparms:[]");
      setEventMetadata("VALIDV_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albproval',iparms:[]");
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
      wcpOGx_mode = "" ;
      wcpOAV5EmprCod = "" ;
      wcpOAV8GuiRemCln = "" ;
      wcpOAV9AlbProFch = GXutil.nullDate() ;
      wcpOAV10AlbSec = "" ;
      wcpOAV11AlbPropri = "" ;
      wcpOAV13AlbLic = "" ;
      wcpOAV14AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_delete_Result = "" ;
      Combo_plascod_Selectedvalue_get = "" ;
      Combo_tubcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV5EmprCod = "" ;
      AV8GuiRemCln = "" ;
      AV9AlbProFch = GXutil.nullDate() ;
      AV10AlbSec = "" ;
      AV11AlbPropri = "" ;
      AV13AlbLic = "" ;
      AV14AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV25TFBarNHdr = "" ;
      AV26TFBarNHdr_Sel = "" ;
      AV27TFAlbSer = "" ;
      AV28TFAlbSer_Sel = "" ;
      AV29TFAlbSerD = "" ;
      AV30TFAlbSerD_Sel = "" ;
      AV31TFAlbColNom = "" ;
      AV32TFAlbColNom_Sel = "" ;
      AV35TFAlbNomCli = "" ;
      AV36TFAlbNomCli_Sel = "" ;
      AV37TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV38TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV43TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV44TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV55TFAlbHdrObs = "" ;
      AV56TFAlbHdrObs_Sel = "" ;
      AV58TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV126Pgmname = "" ;
      AV92CliFacMtsP = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV79TubCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV81PlasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV61DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV119Barcodpar_Selected = "" ;
      AV94KgsHdr = DecimalUtil.ZERO ;
      AV84UsurCod = "" ;
      AV82Station = "" ;
      Combo_tubcod_Selectedvalue_set = "" ;
      Combo_plascod_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV120Prompt = "" ;
      AV127Prompt_GXI = "" ;
      sImgUrl = "" ;
      AV67BarCodPar = "" ;
      AV68BarAlbKgmE = DecimalUtil.ZERO ;
      AV71BarAlbMtrE = DecimalUtil.ZERO ;
      lblTextblockcombo_tubcod_Jsonclick = "" ;
      ucCombo_tubcod = new com.genexus.webpanels.GXUserControl();
      Combo_tubcod_Caption = "" ;
      lblTextblockcombo_plascod_Jsonclick = "" ;
      ucCombo_plascod = new com.genexus.webpanels.GXUserControl();
      Combo_plascod_Caption = "" ;
      AV78AlbHdrObs = "" ;
      AV77AlbProVal = "" ;
      bttBtnagregar_Jsonclick = "" ;
      bttBtnhashycomunicaraat_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13696BarNHdr = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A2441AlbHdrObs = "" ;
      A2839AlbProVal = "" ;
      AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = "" ;
      lV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = "" ;
      lV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = "" ;
      lV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = "" ;
      lV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = "" ;
      lV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = "" ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = "" ;
      AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = "" ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = "" ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = "" ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = "" ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = "" ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = "" ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = "" ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = "" ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = "" ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = DecimalUtil.ZERO ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = DecimalUtil.ZERO ;
      AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = "" ;
      AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = "" ;
      A396EmprCod = "" ;
      H027N2_A30AlbProCod = new long[1] ;
      H027N2_A396EmprCod = new String[] {""} ;
      H027N2_A2839AlbProVal = new String[] {""} ;
      H027N2_A2441AlbHdrObs = new String[] {""} ;
      H027N2_A6467BarAlbPlas = new short[1] ;
      H027N2_A6466PlasCod = new short[1] ;
      H027N2_n6466PlasCod = new boolean[] {false} ;
      H027N2_A1266BarAlbTub = new int[1] ;
      H027N2_A1206TubCod = new short[1] ;
      H027N2_n1206TubCod = new boolean[] {false} ;
      H027N2_A1265BarAlbPie = new int[1] ;
      H027N2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027N2_A5019AlbHdrgm2 = new short[1] ;
      H027N2_A3271AlbHdrAnc = new short[1] ;
      H027N2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027N2_A12232AlbNomCli = new String[] {""} ;
      H027N2_A3393AlbColNum = new int[1] ;
      H027N2_A3392AlbColNom = new String[] {""} ;
      H027N2_A8879AlbSerD = new String[] {""} ;
      H027N2_A3391AlbSer = new String[] {""} ;
      H027N2_A213BarSit = new byte[1] ;
      H027N2_A130BarCodPar = new String[] {""} ;
      H027N2_A132BarCodReo = new byte[1] ;
      H027N2_A129BarCod = new int[1] ;
      H027N3_AGRID_nRecordCount = new long[1] ;
      AV83EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV16WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV57TFAlbProVal_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV111Cadena = "" ;
      AV112firma = "" ;
      AV113Hash = "" ;
      AV114Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message11 = new GXBaseCollection[1] ;
      GXv_boolean12 = new boolean[1] ;
      AV24Session = httpContext.getWebSession();
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char21 = "" ;
      GXt_char19 = "" ;
      GXt_char17 = "" ;
      GXt_char15 = "" ;
      GXt_char14 = "" ;
      GXt_char13 = "" ;
      AV18TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV17HTTPRequest = httpContext.getHttpRequest();
      GXv_SdtWWPGridState23 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      H027N4_A396EmprCod = new String[] {""} ;
      H027N4_A14285PlasNomID = new String[] {""} ;
      H027N4_A6466PlasCod = new short[1] ;
      H027N4_n6466PlasCod = new boolean[] {false} ;
      H027N4_A6474PlasNom = new String[] {""} ;
      H027N4_n6474PlasNom = new boolean[] {false} ;
      A14285PlasNomID = "" ;
      A6474PlasNom = "" ;
      AV80Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H027N5_A396EmprCod = new String[] {""} ;
      H027N5_A13813TubNomID = new String[] {""} ;
      H027N5_A1207TubNom = new String[] {""} ;
      H027N5_n1207TubNom = new boolean[] {false} ;
      H027N5_A1206TubCod = new short[1] ;
      H027N5_n1206TubCod = new boolean[] {false} ;
      A13813TubNomID = "" ;
      A1207TubNom = "" ;
      AV88Metros = DecimalUtil.ZERO ;
      AV86BarMla = DecimalUtil.ZERO ;
      AV89BarKgm = DecimalUtil.ZERO ;
      AV87BarKla = DecimalUtil.ZERO ;
      AV102AlbColNom = "" ;
      AV95AlbSer = "" ;
      AV96AlbSerD = "" ;
      AV98AlbNomCli = "" ;
      AV101AlbEncCli = "" ;
      AV106BarTipCor = "" ;
      GXv_decimal27 = new java.math.BigDecimal[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_int33 = new short[1] ;
      GXv_int29 = new int[1] ;
      GXv_int9 = new int[1] ;
      GXv_int32 = new short[1] ;
      GXv_int30 = new short[1] ;
      GXv_int24 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char22 = new String[1] ;
      GXv_int35 = new long[1] ;
      GXv_int31 = new int[1] ;
      GXv_int34 = new byte[1] ;
      GXv_char20 = new String[1] ;
      GXv_decimal28 = new java.math.BigDecimal[1] ;
      GXv_char18 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV107Msg_k = "" ;
      ucDvelop_confirmpanel_delete = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_2_wp__default(),
         new Object[] {
             new Object[] {
            H027N2_A30AlbProCod, H027N2_A396EmprCod, H027N2_A2839AlbProVal, H027N2_A2441AlbHdrObs, H027N2_A6467BarAlbPlas, H027N2_A6466PlasCod, H027N2_n6466PlasCod, H027N2_A1266BarAlbTub, H027N2_A1206TubCod, H027N2_n1206TubCod,
            H027N2_A1265BarAlbPie, H027N2_A1263BarAlbMtrE, H027N2_A5019AlbHdrgm2, H027N2_A3271AlbHdrAnc, H027N2_A1261BarAlbKgmE, H027N2_A12232AlbNomCli, H027N2_A3393AlbColNum, H027N2_A3392AlbColNom, H027N2_A8879AlbSerD, H027N2_A3391AlbSer,
            H027N2_A213BarSit, H027N2_A130BarCodPar, H027N2_A132BarCodReo, H027N2_A129BarCod
            }
            , new Object[] {
            H027N3_AGRID_nRecordCount
            }
            , new Object[] {
            H027N4_A396EmprCod, H027N4_A14285PlasNomID, H027N4_A6466PlasCod, H027N4_A6474PlasNom, H027N4_n6474PlasNom
            }
            , new Object[] {
            H027N5_A396EmprCod, H027N5_A13813TubNomID, H027N5_A1207TubNom, H027N5_n1207TubNom, H027N5_A1206TubCod
            }
         }
      );
      AV126Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2_WP" ;
      /* GeneXus formulas. */
      AV126Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2_WP" ;
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      edtavGuiremcli_Enabled = 0 ;
      edtavGuiremcln_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV12AlbEnvFtp ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV12AlbEnvFtp ;
   private byte AV59TFBarSit ;
   private byte AV60TFBarSit_To ;
   private byte AV108errkgs ;
   private byte gxajaxcallmode ;
   private byte AV118Barcodreo_Selected ;
   private byte AV105BarEstReo ;
   private byte AV66BarCodReo ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit ;
   private byte AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to ;
   private byte GXt_int7 ;
   private byte AV104AlbTipCol ;
   private byte AV109BarSit ;
   private byte GXv_int24[] ;
   private byte GXv_int8[] ;
   private byte GXv_int34[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte edtavBarcod_Backstyle ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV39TFAlbHdrAnc ;
   private short AV40TFAlbHdrAnc_To ;
   private short AV41TFAlbHdrgm2 ;
   private short AV42TFAlbHdrgm2_To ;
   private short AV47TFTubCod ;
   private short AV48TFTubCod_To ;
   private short AV51TFPlasCod ;
   private short AV52TFPlasCod_To ;
   private short AV53TFBarAlbPlas ;
   private short AV54TFBarAlbPlas_To ;
   private short AV22OrderedBy ;
   private short AV93Moda21 ;
   private short AV85FlagHdr ;
   private short wbEnd ;
   private short wbStart ;
   private short AV69AlbHdrAnc ;
   private short AV70AlbHdrgm2 ;
   private short AV76BarAlbPlas ;
   private short AV73TubCod ;
   private short AV75PlasCod ;
   private short AV116GridActionGroup1 ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc ;
   private short AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to ;
   private short AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 ;
   private short AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to ;
   private short AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod ;
   private short AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to ;
   private short AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod ;
   private short AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to ;
   private short AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas ;
   private short AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to ;
   private short AV122Plasticos ;
   private short AV121Tubos ;
   private short AV90PzasLan ;
   private short AV91BarPlz ;
   private short AV100AlbTipArt ;
   private short GXv_int33[] ;
   private short GXv_int32[] ;
   private short GXv_int30[] ;
   private int wcpOAV7GuiRemCli ;
   private int edtTubCod_Visible ;
   private int edtBarAlbTub_Visible ;
   private int edtPlasCod_Visible ;
   private int edtBarAlbPlas_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_134 ;
   private int AV7GuiRemCli ;
   private int nGXsfl_134_idx=1 ;
   private int AV33TFAlbColNum ;
   private int AV34TFAlbColNum_To ;
   private int AV45TFBarAlbPie ;
   private int AV46TFBarAlbPie_To ;
   private int AV49TFBarAlbTub ;
   private int AV50TFBarAlbTub_To ;
   private int AV117Barcod_Selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprocod_Enabled ;
   private int edtavGuiremcli_Enabled ;
   private int edtavGuiremcln_Enabled ;
   private int AV65BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcod_Backcolor ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavBaralbkgme_Enabled ;
   private int edtavAlbhdranc_Enabled ;
   private int edtavAlbhdrgm2_Enabled ;
   private int edtavBaralbmtre_Enabled ;
   private int AV72BarAlbPie ;
   private int edtavBaralbpie_Enabled ;
   private int AV74BarAlbTub ;
   private int edtavBaralbtub_Enabled ;
   private int edtavBaralbplas_Enabled ;
   private int edtavAlbhdrobs_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavTubcod_Visible ;
   private int edtavPlascod_Visible ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int A1266BarAlbTub ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size ;
   private int AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum ;
   private int AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to ;
   private int AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie ;
   private int AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to ;
   private int AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub ;
   private int AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to ;
   private int AV62PageToGo ;
   private int AV163GXV1 ;
   private int AV103AlbColNum ;
   private int AV97AlbCliCod ;
   private int AV99AlbNumcli ;
   private int GXv_int29[] ;
   private int GXv_int9[] ;
   private int GXv_int31[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV6AlbProCod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV6AlbProCod ;
   private long AV63GridCurrentPage ;
   private long AV64GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long A30AlbProCod ;
   private long GRID_nRecordCount ;
   private long GXv_int35[] ;
   private java.math.BigDecimal AV37TFBarAlbKgmE ;
   private java.math.BigDecimal AV38TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV43TFBarAlbMtrE ;
   private java.math.BigDecimal AV44TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV94KgsHdr ;
   private java.math.BigDecimal AV68BarAlbKgmE ;
   private java.math.BigDecimal AV71BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ;
   private java.math.BigDecimal AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ;
   private java.math.BigDecimal AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ;
   private java.math.BigDecimal AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ;
   private java.math.BigDecimal AV88Metros ;
   private java.math.BigDecimal AV86BarMla ;
   private java.math.BigDecimal AV89BarKgm ;
   private java.math.BigDecimal AV87BarKla ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal28[] ;
   private String wcpOGx_mode ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV8GuiRemCln ;
   private String wcpOAV10AlbSec ;
   private String wcpOAV11AlbPropri ;
   private String wcpOAV13AlbLic ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_delete_Result ;
   private String Combo_plascod_Selectedvalue_get ;
   private String Combo_tubcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV5EmprCod ;
   private String AV8GuiRemCln ;
   private String AV10AlbSec ;
   private String AV11AlbPropri ;
   private String AV13AlbLic ;
   private String sGXsfl_134_idx="0001" ;
   private String edtTubCod_Internalname ;
   private String edtBarAlbTub_Internalname ;
   private String edtPlasCod_Internalname ;
   private String edtBarAlbPlas_Internalname ;
   private String AV25TFBarNHdr ;
   private String AV26TFBarNHdr_Sel ;
   private String AV27TFAlbSer ;
   private String AV28TFAlbSer_Sel ;
   private String AV29TFAlbSerD ;
   private String AV30TFAlbSerD_Sel ;
   private String AV31TFAlbColNom ;
   private String AV32TFAlbColNom_Sel ;
   private String AV35TFAlbNomCli ;
   private String AV36TFAlbNomCli_Sel ;
   private String AV55TFAlbHdrObs ;
   private String AV56TFAlbHdrObs_Sel ;
   private String AV126Pgmname ;
   private String AV92CliFacMtsP ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV119Barcodpar_Selected ;
   private String AV84UsurCod ;
   private String AV82Station ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_tubcod_Cls ;
   private String Combo_tubcod_Selectedvalue_set ;
   private String Combo_plascod_Cls ;
   private String Combo_plascod_Selectedvalue_set ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_delete_Title ;
   private String Dvelop_confirmpanel_delete_Confirmationtext ;
   private String Dvelop_confirmpanel_delete_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_delete_Nobuttoncaption ;
   private String Dvelop_confirmpanel_delete_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_delete_Yesbuttonposition ;
   private String Dvelop_confirmpanel_delete_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavGuiremcli_Internalname ;
   private String edtavGuiremcli_Jsonclick ;
   private String edtavGuiremcln_Internalname ;
   private String edtavGuiremcln_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String ClassString ;
   private String imgavPrompt_gximage ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgavPrompt_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV67BarCodPar ;
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
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedtubcod_Internalname ;
   private String lblTextblockcombo_tubcod_Internalname ;
   private String lblTextblockcombo_tubcod_Jsonclick ;
   private String Combo_tubcod_Caption ;
   private String Combo_tubcod_Internalname ;
   private String edtavBaralbtub_Internalname ;
   private String edtavBaralbtub_Jsonclick ;
   private String divTablesplittedplascod_Internalname ;
   private String lblTextblockcombo_plascod_Internalname ;
   private String lblTextblockcombo_plascod_Jsonclick ;
   private String Combo_plascod_Caption ;
   private String Combo_plascod_Internalname ;
   private String edtavBaralbplas_Internalname ;
   private String edtavBaralbplas_Jsonclick ;
   private String edtavAlbhdrobs_Internalname ;
   private String AV78AlbHdrObs ;
   private String edtavAlbhdrobs_Jsonclick ;
   private String AV77AlbProVal ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnagregar_Internalname ;
   private String bttBtnagregar_Jsonclick ;
   private String bttBtnhashycomunicaraat_Internalname ;
   private String bttBtnhashycomunicaraat_Jsonclick ;
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
   private String edtavTubcod_Internalname ;
   private String edtavTubcod_Jsonclick ;
   private String edtavPlascod_Internalname ;
   private String edtavPlascod_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtBarSit_Internalname ;
   private String A3391AlbSer ;
   private String edtAlbSer_Internalname ;
   private String A8879AlbSerD ;
   private String edtAlbSerD_Internalname ;
   private String A3392AlbColNom ;
   private String edtAlbColNom_Internalname ;
   private String edtAlbColNum_Internalname ;
   private String A12232AlbNomCli ;
   private String edtAlbNomCli_Internalname ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtAlbHdrAnc_Internalname ;
   private String edtAlbHdrgm2_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A2441AlbHdrObs ;
   private String edtAlbHdrObs_Internalname ;
   private String A2839AlbProVal ;
   private String scmdbuf ;
   private String lV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ;
   private String lV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ;
   private String lV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ;
   private String lV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ;
   private String lV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ;
   private String lV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ;
   private String AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ;
   private String AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ;
   private String AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ;
   private String AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ;
   private String AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ;
   private String AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ;
   private String AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ;
   private String AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ;
   private String AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ;
   private String AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ;
   private String AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ;
   private String AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ;
   private String A396EmprCod ;
   private String AV83EmprNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char21 ;
   private String GXt_char19 ;
   private String GXt_char17 ;
   private String GXt_char15 ;
   private String GXt_char14 ;
   private String GXt_char13 ;
   private String A14285PlasNomID ;
   private String A6474PlasNom ;
   private String A1207TubNom ;
   private String AV102AlbColNom ;
   private String AV95AlbSer ;
   private String AV96AlbSerD ;
   private String AV98AlbNomCli ;
   private String AV101AlbEncCli ;
   private String AV106BarTipCor ;
   private String GXv_char3[] ;
   private String GXv_char22[] ;
   private String GXv_char20[] ;
   private String GXv_char18[] ;
   private String GXv_char16[] ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_delete_Internalname ;
   private String Dvelop_confirmpanel_delete_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_134_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtAlbSer_Jsonclick ;
   private String edtAlbSerD_Jsonclick ;
   private String edtAlbColNom_Jsonclick ;
   private String edtAlbColNum_Jsonclick ;
   private String edtAlbNomCli_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtAlbHdrAnc_Jsonclick ;
   private String edtAlbHdrgm2_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtTubCod_Jsonclick ;
   private String edtBarAlbTub_Jsonclick ;
   private String edtPlasCod_Jsonclick ;
   private String edtBarAlbPlas_Jsonclick ;
   private String edtAlbHdrObs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV14AlbHhfm ;
   private java.util.Date AV14AlbHhfm ;
   private java.util.Date wcpOAV9AlbProFch ;
   private java.util.Date AV9AlbProFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_134_Refreshing=false ;
   private boolean AV23OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_tubcod_Emptyitem ;
   private boolean Combo_plascod_Emptyitem ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
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
   private boolean AV120Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n1206TubCod ;
   private boolean n6466PlasCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV115ok ;
   private boolean GXv_boolean12[] ;
   private boolean Cond_result ;
   private boolean n6474PlasNom ;
   private boolean n1207TubNom ;
   private String AV57TFAlbProVal_SelsJson ;
   private String AV127Prompt_GXI ;
   private String AV111Cadena ;
   private String AV112firma ;
   private String AV113Hash ;
   private String A13813TubNomID ;
   private String AV107Msg_k ;
   private String AV120Prompt ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV17HTTPRequest ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_tubcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_plascod ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_delete ;
   private GXSimpleCollection<String> AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ;
   private HTMLChoice cmbavAlbproval ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private HTMLChoice cmbAlbProVal ;
   private IDataStoreProvider pr_default ;
   private long[] H027N2_A30AlbProCod ;
   private String[] H027N2_A396EmprCod ;
   private String[] H027N2_A2839AlbProVal ;
   private String[] H027N2_A2441AlbHdrObs ;
   private short[] H027N2_A6467BarAlbPlas ;
   private short[] H027N2_A6466PlasCod ;
   private boolean[] H027N2_n6466PlasCod ;
   private int[] H027N2_A1266BarAlbTub ;
   private short[] H027N2_A1206TubCod ;
   private boolean[] H027N2_n1206TubCod ;
   private int[] H027N2_A1265BarAlbPie ;
   private java.math.BigDecimal[] H027N2_A1263BarAlbMtrE ;
   private short[] H027N2_A5019AlbHdrgm2 ;
   private short[] H027N2_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] H027N2_A1261BarAlbKgmE ;
   private String[] H027N2_A12232AlbNomCli ;
   private int[] H027N2_A3393AlbColNum ;
   private String[] H027N2_A3392AlbColNom ;
   private String[] H027N2_A8879AlbSerD ;
   private String[] H027N2_A3391AlbSer ;
   private byte[] H027N2_A213BarSit ;
   private String[] H027N2_A130BarCodPar ;
   private byte[] H027N2_A132BarCodReo ;
   private int[] H027N2_A129BarCod ;
   private long[] H027N3_AGRID_nRecordCount ;
   private String[] H027N4_A396EmprCod ;
   private String[] H027N4_A14285PlasNomID ;
   private short[] H027N4_A6466PlasCod ;
   private boolean[] H027N4_n6466PlasCod ;
   private String[] H027N4_A6474PlasNom ;
   private boolean[] H027N4_n6474PlasNom ;
   private String[] H027N5_A396EmprCod ;
   private String[] H027N5_A13813TubNomID ;
   private String[] H027N5_A1207TubNom ;
   private boolean[] H027N5_n1207TubNom ;
   private short[] H027N5_A1206TubCod ;
   private boolean[] H027N5_n1206TubCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV58TFAlbProVal_Sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV79TubCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV81PlasCod_Data ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV114Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV16WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV18TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState23[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV61DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV80Combo_DataItem ;
}

final  class documentodetransporteproduccion_2_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H027N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                          String AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                          String AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                          byte AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit ,
                                          byte AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to ,
                                          String AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                          String AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                          String AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                          String AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                          String AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                          String AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                          int AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum ,
                                          int AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to ,
                                          String AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                          String AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                          java.math.BigDecimal AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                          short AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc ,
                                          short AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to ,
                                          short AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 ,
                                          short AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                          java.math.BigDecimal AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                          int AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie ,
                                          int AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to ,
                                          short AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod ,
                                          short AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to ,
                                          int AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub ,
                                          int AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to ,
                                          short AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod ,
                                          short AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to ,
                                          short AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas ,
                                          short AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to ,
                                          String AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                          String AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                          int AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String AV5EmprCod ,
                                          long AV6AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[41];
      Object[] GXv_Object37 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.AlbProCod, T1.EmprCod, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc," ;
      sSelectString += " T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod" ;
      sFromString = " FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int36[3] = (byte)(1) ;
      }
      if ( ! (0==AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int36[4] = (byte)(1) ;
      }
      if ( ! (0==AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int36[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int36[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int36[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int36[11] = (byte)(1) ;
      }
      if ( ! (0==AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int36[12] = (byte)(1) ;
      }
      if ( ! (0==AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int36[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int36[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int36[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int36[17] = (byte)(1) ;
      }
      if ( ! (0==AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int36[18] = (byte)(1) ;
      }
      if ( ! (0==AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int36[19] = (byte)(1) ;
      }
      if ( ! (0==AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int36[20] = (byte)(1) ;
      }
      if ( ! (0==AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int36[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int36[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int36[23] = (byte)(1) ;
      }
      if ( ! (0==AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int36[24] = (byte)(1) ;
      }
      if ( ! (0==AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int36[25] = (byte)(1) ;
      }
      if ( ! (0==AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int36[26] = (byte)(1) ;
      }
      if ( ! (0==AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int36[27] = (byte)(1) ;
      }
      if ( ! (0==AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int36[28] = (byte)(1) ;
      }
      if ( ! (0==AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int36[29] = (byte)(1) ;
      }
      if ( ! (0==AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int36[30] = (byte)(1) ;
      }
      if ( ! (0==AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int36[31] = (byte)(1) ;
      }
      if ( ! (0==AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int36[32] = (byte)(1) ;
      }
      if ( ! (0==AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int36[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int36[35] = (byte)(1) ;
      }
      if ( AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( AV22OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbSer" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbSer DESC" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbSerD" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbSerD DESC" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbColNom" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbColNom DESC" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbColNum" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbColNum DESC" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbNomCli" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbNomCli DESC" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbKgmE" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHdrAnc" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHdrAnc DESC" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHdrgm2" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHdrgm2 DESC" ;
      }
      else if ( ( AV22OrderedBy == 11 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbMtrE" ;
      }
      else if ( ( AV22OrderedBy == 11 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV22OrderedBy == 12 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV22OrderedBy == 12 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbPie DESC" ;
      }
      else if ( ( AV22OrderedBy == 13 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TubCod" ;
      }
      else if ( ( AV22OrderedBy == 13 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TubCod DESC" ;
      }
      else if ( ( AV22OrderedBy == 14 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbTub" ;
      }
      else if ( ( AV22OrderedBy == 14 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbTub DESC" ;
      }
      else if ( ( AV22OrderedBy == 15 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PlasCod" ;
      }
      else if ( ( AV22OrderedBy == 15 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PlasCod DESC" ;
      }
      else if ( ( AV22OrderedBy == 16 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbPlas" ;
      }
      else if ( ( AV22OrderedBy == 16 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbPlas DESC" ;
      }
      else if ( ( AV22OrderedBy == 17 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHdrObs" ;
      }
      else if ( ( AV22OrderedBy == 17 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHdrObs DESC" ;
      }
      else if ( ( AV22OrderedBy == 18 ) && ! AV23OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProVal" ;
      }
      else if ( ( AV22OrderedBy == 18 ) && ( AV23OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProVal DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object37[0] = scmdbuf ;
      GXv_Object37[1] = GXv_int36 ;
      return GXv_Object37 ;
   }

   protected Object[] conditional_H027N3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                          String AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                          String AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                          byte AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit ,
                                          byte AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to ,
                                          String AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                          String AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                          String AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                          String AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                          String AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                          String AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                          int AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum ,
                                          int AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to ,
                                          String AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                          String AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                          java.math.BigDecimal AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                          short AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc ,
                                          short AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to ,
                                          short AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 ,
                                          short AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                          java.math.BigDecimal AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                          int AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie ,
                                          int AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to ,
                                          short AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod ,
                                          short AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to ,
                                          int AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub ,
                                          int AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to ,
                                          short AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod ,
                                          short AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to ,
                                          short AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas ,
                                          short AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to ,
                                          String AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                          String AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                          int AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String AV5EmprCod ,
                                          long AV6AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int39 = new byte[36];
      Object[] GXv_Object40 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV128Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int39[3] = (byte)(1) ;
      }
      if ( ! (0==AV130Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int39[4] = (byte)(1) ;
      }
      if ( ! (0==AV131Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int39[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV132Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int39[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV134Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int39[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV136Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int39[11] = (byte)(1) ;
      }
      if ( ! (0==AV138Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int39[12] = (byte)(1) ;
      }
      if ( ! (0==AV139Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int39[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV140Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int39[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int39[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int39[17] = (byte)(1) ;
      }
      if ( ! (0==AV144Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int39[18] = (byte)(1) ;
      }
      if ( ! (0==AV145Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int39[19] = (byte)(1) ;
      }
      if ( ! (0==AV146Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int39[20] = (byte)(1) ;
      }
      if ( ! (0==AV147Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int39[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int39[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int39[23] = (byte)(1) ;
      }
      if ( ! (0==AV150Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int39[24] = (byte)(1) ;
      }
      if ( ! (0==AV151Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int39[25] = (byte)(1) ;
      }
      if ( ! (0==AV152Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int39[26] = (byte)(1) ;
      }
      if ( ! (0==AV153Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int39[27] = (byte)(1) ;
      }
      if ( ! (0==AV154Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int39[28] = (byte)(1) ;
      }
      if ( ! (0==AV155Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int39[29] = (byte)(1) ;
      }
      if ( ! (0==AV156Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int39[30] = (byte)(1) ;
      }
      if ( ! (0==AV157Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int39[31] = (byte)(1) ;
      }
      if ( ! (0==AV158Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int39[32] = (byte)(1) ;
      }
      if ( ! (0==AV159Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int39[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV160Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int39[35] = (byte)(1) ;
      }
      if ( AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV162Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( AV22OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 5 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 6 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 7 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 8 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 9 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 10 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 11 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 11 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 12 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 12 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 13 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 13 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 14 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 14 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 15 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 15 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 16 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 16 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 17 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 17 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 18 ) && ! AV23OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV22OrderedBy == 18 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object40[0] = scmdbuf ;
      GXv_Object40[1] = GXv_int39 ;
      return GXv_Object40 ;
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
                  return conditional_H027N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Boolean) dynConstraints[57]).booleanValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() );
            case 1 :
                  return conditional_H027N3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Boolean) dynConstraints[57]).booleanValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H027N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027N3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027N4", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(PlasCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PlasNom, ''))) AS PlasNomID, PlasCod, PlasNom FROM TXPPLASTI ORDER BY PlasNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027N5", "SELECT EmprCod, RTRIM(LTRIM(COALESCE( TubNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(TubCod,'9990'), 2))) || ')' AS TubNomID, TubNom, TubCod FROM TXPTUBOS ORDER BY TubNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[15])[0] = rslt.getString(14, 13);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 13);
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[42]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 60);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 60);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[37]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 60);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 60);
               }
               return;
      }
   }

}

