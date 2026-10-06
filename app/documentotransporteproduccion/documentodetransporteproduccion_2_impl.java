package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_2_impl extends GXDataArea
{
   public documentodetransporteproduccion_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_2_impl.class ));
   }

   public documentodetransporteproduccion_2_impl( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbAlbProVal = new HTMLChoice();
      chkavOkin = UIFactory.getCheckbox(this);
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
               AV61EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV61EmprCod", AV61EmprCod);
               AV60AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60AlbProCod), 10, 0));
               AV58GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GuiRemCli), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV58GuiRemCli), "ZZZZZ9")));
               AV57GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57GuiRemCln", AV57GuiRemCln);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57GuiRemCln, ""))));
               AV62AlbProfch = localUtil.parseDateParm( httpContext.GetPar( "AlbProfch")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62AlbProfch", localUtil.format(AV62AlbProfch, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV62AlbProfch));
               AV63AlbSec = httpContext.GetPar( "AlbSec") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV63AlbSec", AV63AlbSec);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV63AlbSec, "@!"))));
               AV64AlbProPri = httpContext.GetPar( "AlbProPri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV64AlbProPri", AV64AlbProPri);
               AV65AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65AlbEnvFtp", GXutil.str( AV65AlbEnvFtp, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65AlbEnvFtp), "9")));
               AV66AlbLic = httpContext.GetPar( "AlbLic") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66AlbLic", AV66AlbLic);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66AlbLic, ""))));
               AV80AlbHhfm = localUtil.parseDTimeParm( httpContext.GetPar( "AlbHhfm")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV80AlbHhfm", localUtil.ttoc( AV80AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV93AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV93AlbProEst", GXutil.str( AV93AlbProEst, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93AlbProEst), "9")));
               AV94HashIN = httpContext.GetPar( "HashIN") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV94HashIN", AV94HashIN);
               AV95OkIN = GXutil.strtobool( httpContext.GetPar( "OkIN")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV95OkIN", AV95OkIN);
               AV96Messages_jsonIN = httpContext.GetPar( "Messages_jsonIN") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV96Messages_jsonIN", AV96Messages_jsonIN);
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      edtTubCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtBarAlbTub_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPlasCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtBarAlbPlas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_55_Refreshing);
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
      AV61EmprCod = httpContext.GetPar( "EmprCod") ;
      AV60AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      AV18TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV19TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV30TFBarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE"), ".") ;
      AV31TFBarAlbKgmE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbKgmE_To"), ".") ;
      AV32TFAlbHdrAnc = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc"))) ;
      AV33TFAlbHdrAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrAnc_To"))) ;
      AV34TFAlbHdrgm2 = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2"))) ;
      AV35TFAlbHdrgm2_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbHdrgm2_To"))) ;
      AV36TFBarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE"), ".") ;
      AV37TFBarAlbMtrE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarAlbMtrE_To"), ".") ;
      AV38TFBarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie"))) ;
      AV39TFBarAlbPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbPie_To"))) ;
      AV40TFTubCod = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod"))) ;
      AV41TFTubCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTubCod_To"))) ;
      AV42TFBarAlbTub = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub"))) ;
      AV43TFBarAlbTub_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarAlbTub_To"))) ;
      AV44TFPlasCod = (short)(GXutil.lval( httpContext.GetPar( "TFPlasCod"))) ;
      AV45TFPlasCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFPlasCod_To"))) ;
      AV46TFBarAlbPlas = (short)(GXutil.lval( httpContext.GetPar( "TFBarAlbPlas"))) ;
      AV47TFBarAlbPlas_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarAlbPlas_To"))) ;
      AV48TFAlbHdrObs = httpContext.GetPar( "TFAlbHdrObs") ;
      AV49TFAlbHdrObs_Sel = httpContext.GetPar( "TFAlbHdrObs_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV51TFAlbProVal_Sels);
      AV100Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      edtTubCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtBarAlbTub_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPlasCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtBarAlbPlas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_55_Refreshing);
      AV65AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
      AV93AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
      AV95OkIN = GXutil.strtobool( httpContext.GetPar( "OkIN")) ;
      AV66AlbLic = httpContext.GetPar( "AlbLic") ;
      AV63AlbSec = httpContext.GetPar( "AlbSec") ;
      AV58GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
      AV57GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
      AV62AlbProfch = localUtil.parseDateParm( httpContext.GetPar( "AlbProfch")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV61EmprCod, AV60AlbProCod, AV18TFBarNHdr, AV19TFBarNHdr_Sel, AV30TFBarAlbKgmE, AV31TFBarAlbKgmE_To, AV32TFAlbHdrAnc, AV33TFAlbHdrAnc_To, AV34TFAlbHdrgm2, AV35TFAlbHdrgm2_To, AV36TFBarAlbMtrE, AV37TFBarAlbMtrE_To, AV38TFBarAlbPie, AV39TFBarAlbPie_To, AV40TFTubCod, AV41TFTubCod_To, AV42TFBarAlbTub, AV43TFBarAlbTub_To, AV44TFPlasCod, AV45TFPlasCod_To, AV46TFBarAlbPlas, AV47TFBarAlbPlas_To, AV48TFAlbHdrObs, AV49TFAlbHdrObs_Sel, AV51TFAlbProVal_Sels, AV100Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65AlbEnvFtp, AV93AlbProEst, AV95OkIN, AV66AlbLic, AV63AlbSec, AV58GuiRemCli, AV57GuiRemCln, AV62AlbProfch) ;
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
      pa2502( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2502( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV58GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV57GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV62AlbProfch)),GXutil.URLEncode(GXutil.rtrim(AV63AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV64AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV65AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV66AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV80AlbHhfm)),GXutil.URLEncode(GXutil.ltrimstr(AV93AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV94HashIN)),GXutil.URLEncode(GXutil.booltostr(AV95OkIN)),GXutil.URLEncode(GXutil.rtrim(AV96Messages_jsonIN))}, new String[] {"Gx_mode","EmprCod","AlbProCod","GuiRemCli","GuiRemCln","AlbProfch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic","AlbHhfm","AlbProEst","HashIN","OkIN","Messages_jsonIN"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93AlbProEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66AlbLic, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV63AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV58GuiRemCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57GuiRemCln, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV62AlbProfch));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_2");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV100Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_55, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV54GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV55GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR", GXutil.rtrim( AV18TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR_SEL", GXutil.rtrim( AV19TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBKGME", GXutil.ltrim( localUtil.ntoc( AV30TFBarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBKGME_TO", GXutil.ltrim( localUtil.ntoc( AV31TFBarAlbKgmE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRANC", GXutil.ltrim( localUtil.ntoc( AV32TFAlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRANC_TO", GXutil.ltrim( localUtil.ntoc( AV33TFAlbHdrAnc_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRGM2", GXutil.ltrim( localUtil.ntoc( AV34TFAlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDRGM2_TO", GXutil.ltrim( localUtil.ntoc( AV35TFAlbHdrgm2_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBMTRE", GXutil.ltrim( localUtil.ntoc( AV36TFBarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBMTRE_TO", GXutil.ltrim( localUtil.ntoc( AV37TFBarAlbMtrE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPIE", GXutil.ltrim( localUtil.ntoc( AV38TFBarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPIE_TO", GXutil.ltrim( localUtil.ntoc( AV39TFBarAlbPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTUBCOD", GXutil.ltrim( localUtil.ntoc( AV40TFTubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTUBCOD_TO", GXutil.ltrim( localUtil.ntoc( AV41TFTubCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBTUB", GXutil.ltrim( localUtil.ntoc( AV42TFBarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBTUB_TO", GXutil.ltrim( localUtil.ntoc( AV43TFBarAlbTub_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPLASCOD", GXutil.ltrim( localUtil.ntoc( AV44TFPlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPLASCOD_TO", GXutil.ltrim( localUtil.ntoc( AV45TFPlasCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPLAS", GXutil.ltrim( localUtil.ntoc( AV46TFBarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARALBPLAS_TO", GXutil.ltrim( localUtil.ntoc( AV47TFBarAlbPlas_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDROBS", GXutil.rtrim( AV48TFAlbHdrObs));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHDROBS_SEL", GXutil.rtrim( AV49TFAlbHdrObs_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROVAL_SELS", AV51TFAlbProVal_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROVAL_SELS", AV51TFAlbProVal_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBENVFTP", GXutil.ltrim( localUtil.ntoc( AV65AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROEST", GXutil.ltrim( localUtil.ntoc( AV93AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93AlbProEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLIC", GXutil.rtrim( AV66AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66AlbLic, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV61EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV63AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV63AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV64AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCONTLIN", GXutil.ltrim( localUtil.ntoc( AV77AlbContLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV74Barcod_Selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV75Barcodreo_Selected, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR_SELECTED", GXutil.rtrim( AV76Barcodpar_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBHHFM", localUtil.ttoc( AV80AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETE_Result", GXutil.rtrim( Dvelop_confirmpanel_delete_Result));
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
         we2502( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2502( ) ;
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV58GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV57GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV62AlbProfch)),GXutil.URLEncode(GXutil.rtrim(AV63AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV64AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV65AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV66AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV80AlbHhfm)),GXutil.URLEncode(GXutil.ltrimstr(AV93AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV94HashIN)),GXutil.URLEncode(GXutil.booltostr(AV95OkIN)),GXutil.URLEncode(GXutil.rtrim(AV96Messages_jsonIN))}, new String[] {"Gx_mode","EmprCod","AlbProCod","GuiRemCli","GuiRemCln","AlbProfch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic","AlbHhfm","AlbProEst","HashIN","OkIN","Messages_jsonIN"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Detalle de Producciones", "") ;
   }

   public void wb2500( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV60AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV60AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV60AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcli_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV58GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV58GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV58GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcln_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcln_Internalname, httpContext.getMessage( "Nome", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcln_Internalname, GXutil.rtrim( AV57GuiRemCln), GXutil.rtrim( localUtil.format( AV57GuiRemCln, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofch_Internalname, httpContext.getMessage( "Data", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavAlbprofch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofch_Internalname, localUtil.format(AV62AlbProfch, "99/99/99"), localUtil.format( AV62AlbProfch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, bttBtninsert_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Hash y Comunicar a AT", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Hash y Comunicar a AT", ""), "", StyleString, ClassString, 1, bttBtncerrar_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtnuseraction1_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol55( ) ;
      }
      if ( wbEnd == 55 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_55 = (int)(nGXsfl_55_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV54GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV55GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV100Pgmname), GXutil.rtrim( localUtil.format( AV100Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMessages_jsonin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMessages_jsonin_Internalname, httpContext.getMessage( "Message", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavMessages_jsonin_Internalname, AV96Messages_jsonIN, "", "", (short)(0), 1, edtavMessages_jsonin_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHashin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHashin_Internalname, httpContext.getMessage( "Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHashin_Internalname, AV94HashIN, "", "", (short)(0), 1, edtavHashin_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavOkin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavOkin.getInternalname(), httpContext.getMessage( "Hash Correcto?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavOkin.getInternalname(), GXutil.booltostr( AV95OkIN), "", httpContext.getMessage( "Hash Correcto?", ""), 1, chkavOkin.getEnabled(), "true", "", StyleString, ClassString, "", "", "");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_113_2502( true) ;
      }
      else
      {
         wb_table1_113_2502( false) ;
      }
      return  ;
   }

   public void wb_table1_113_2502e( boolean wbgen )
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
      if ( wbEnd == 55 )
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

   public void start2502( )
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
      strup2500( ) ;
   }

   public void ws2502( )
   {
      start2502( ) ;
      evt2502( ) ;
   }

   public void evt2502( )
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
                           e112502 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122502 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132502 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DELETE.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142502 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e152502 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e162502 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e172502 ();
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
                           nGXsfl_55_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_552( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV56GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
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
                                 e182502 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e192502 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e202502 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e212502 ();
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

   public void we2502( )
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

   public void pa2502( )
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
      subsflControlProps_552( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         sendrow_552( ) ;
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV61EmprCod ,
                                 long AV60AlbProCod ,
                                 String AV18TFBarNHdr ,
                                 String AV19TFBarNHdr_Sel ,
                                 java.math.BigDecimal AV30TFBarAlbKgmE ,
                                 java.math.BigDecimal AV31TFBarAlbKgmE_To ,
                                 short AV32TFAlbHdrAnc ,
                                 short AV33TFAlbHdrAnc_To ,
                                 short AV34TFAlbHdrgm2 ,
                                 short AV35TFAlbHdrgm2_To ,
                                 java.math.BigDecimal AV36TFBarAlbMtrE ,
                                 java.math.BigDecimal AV37TFBarAlbMtrE_To ,
                                 int AV38TFBarAlbPie ,
                                 int AV39TFBarAlbPie_To ,
                                 short AV40TFTubCod ,
                                 short AV41TFTubCod_To ,
                                 int AV42TFBarAlbTub ,
                                 int AV43TFBarAlbTub_To ,
                                 short AV44TFPlasCod ,
                                 short AV45TFPlasCod_To ,
                                 short AV46TFBarAlbPlas ,
                                 short AV47TFBarAlbPlas_To ,
                                 String AV48TFAlbHdrObs ,
                                 String AV49TFAlbHdrObs_Sel ,
                                 GXSimpleCollection<String> AV51TFAlbProVal_Sels ,
                                 String AV100Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 byte AV65AlbEnvFtp ,
                                 byte AV93AlbProEst ,
                                 boolean AV95OkIN ,
                                 String AV66AlbLic ,
                                 String AV63AlbSec ,
                                 int AV58GuiRemCli ,
                                 String AV57GuiRemCln ,
                                 java.util.Date AV62AlbProfch )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192502 ();
      GRID_nCurrentRecord = 0 ;
      rf2502( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_2");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV100Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      AV95OkIN = GXutil.strtobool( GXutil.booltostr( AV95OkIN)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95OkIN", AV95OkIN);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2502( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV100Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100Pgmname", AV100Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      edtavGuiremcln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcln_Enabled), 5, 0), true);
      edtavAlbprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprofch_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavMessages_jsonin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMessages_jsonin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMessages_jsonin_Enabled), 5, 0), true);
      edtavHashin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHashin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHashin_Enabled), 5, 0), true);
      chkavOkin.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavOkin.getInternalname(), "Enabled", GXutil.ltrimstr( chkavOkin.getEnabled(), 5, 0), true);
   }

   public void rf2502( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(55) ;
      /* Execute user event: Refresh */
      e192502 ();
      nGXsfl_55_idx = 1 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_552( ) ;
      bGXsfl_55_Refreshing = true ;
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
         subsflControlProps_552( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A2839AlbProVal ,
                                              AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels ,
                                              AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel ,
                                              AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ,
                                              AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme ,
                                              AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to ,
                                              Short.valueOf(AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc) ,
                                              Short.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to) ,
                                              Short.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2) ,
                                              Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to) ,
                                              AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre ,
                                              AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to ,
                                              Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie) ,
                                              Integer.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to) ,
                                              Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod) ,
                                              Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to) ,
                                              Integer.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub) ,
                                              Integer.valueOf(AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to) ,
                                              Short.valueOf(AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod) ,
                                              Short.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to) ,
                                              Short.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas) ,
                                              Short.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to) ,
                                              AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel ,
                                              AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ,
                                              Integer.valueOf(AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels.size()) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
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
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV61EmprCod ,
                                              Long.valueOf(AV60AlbProCod) ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                              }
         });
         lV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr), 11, "%") ;
         lV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs), 60, "%") ;
         /* Using cursor H02502 */
         pr_default.execute(0, new Object[] {AV61EmprCod, Long.valueOf(AV60AlbProCod), lV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr, AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel, AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme, AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to, Short.valueOf(AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc), Short.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to), Short.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to), AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre, AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to, Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie), Integer.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to), Integer.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub), Integer.valueOf(AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to), Short.valueOf(AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod), Short.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to), Short.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas), Short.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to), lV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs, AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_55_idx = 1 ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A30AlbProCod = H02502_A30AlbProCod[0] ;
            A396EmprCod = H02502_A396EmprCod[0] ;
            A213BarSit = H02502_A213BarSit[0] ;
            A2839AlbProVal = H02502_A2839AlbProVal[0] ;
            A2441AlbHdrObs = H02502_A2441AlbHdrObs[0] ;
            A6467BarAlbPlas = H02502_A6467BarAlbPlas[0] ;
            A6466PlasCod = H02502_A6466PlasCod[0] ;
            n6466PlasCod = H02502_n6466PlasCod[0] ;
            A1266BarAlbTub = H02502_A1266BarAlbTub[0] ;
            A1206TubCod = H02502_A1206TubCod[0] ;
            n1206TubCod = H02502_n1206TubCod[0] ;
            A1265BarAlbPie = H02502_A1265BarAlbPie[0] ;
            A1263BarAlbMtrE = H02502_A1263BarAlbMtrE[0] ;
            A5019AlbHdrgm2 = H02502_A5019AlbHdrgm2[0] ;
            A3271AlbHdrAnc = H02502_A3271AlbHdrAnc[0] ;
            A1261BarAlbKgmE = H02502_A1261BarAlbKgmE[0] ;
            A12232AlbNomCli = H02502_A12232AlbNomCli[0] ;
            A3393AlbColNum = H02502_A3393AlbColNum[0] ;
            A3392AlbColNom = H02502_A3392AlbColNom[0] ;
            A8879AlbSerD = H02502_A8879AlbSerD[0] ;
            A3391AlbSer = H02502_A3391AlbSer[0] ;
            A130BarCodPar = H02502_A130BarCodPar[0] ;
            A132BarCodReo = H02502_A132BarCodReo[0] ;
            A129BarCod = H02502_A129BarCod[0] ;
            A213BarSit = H02502_A213BarSit[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e202502 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(55) ;
         wb2500( ) ;
      }
      bGXsfl_55_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2502( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vALBENVFTP", GXutil.ltrim( localUtil.ntoc( AV65AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROEST", GXutil.ltrim( localUtil.ntoc( AV93AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93AlbProEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLIC", GXutil.rtrim( AV66AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66AlbLic, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV63AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV63AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBKGME"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBMTRE"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARALBPIE"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")));
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
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = AV30TFBarAlbKgmE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = AV31TFBarAlbKgmE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie = AV38TFBarAlbPie ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod = AV40TFTubCod ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to = AV41TFTubCod_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub = AV42TFBarAlbTub ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to = AV43TFBarAlbTub_To ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod = AV44TFPlasCod ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to = AV45TFPlasCod_To ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas = AV46TFBarAlbPlas ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to = AV47TFBarAlbPlas_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = AV48TFAlbHdrObs ;
      AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = AV49TFAlbHdrObs_Sel ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = AV51TFAlbProVal_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme ,
                                           AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to ,
                                           Short.valueOf(AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc) ,
                                           Short.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to) ,
                                           Short.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2) ,
                                           Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to) ,
                                           AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre ,
                                           AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to ,
                                           Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie) ,
                                           Integer.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to) ,
                                           Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod) ,
                                           Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to) ,
                                           Integer.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub) ,
                                           Integer.valueOf(AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to) ,
                                           Short.valueOf(AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod) ,
                                           Short.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to) ,
                                           Short.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas) ,
                                           Short.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to) ,
                                           AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel ,
                                           AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ,
                                           Integer.valueOf(AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
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
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV61EmprCod ,
                                           Long.valueOf(AV60AlbProCod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr), 11, "%") ;
      lV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs), 60, "%") ;
      /* Using cursor H02503 */
      pr_default.execute(1, new Object[] {AV61EmprCod, Long.valueOf(AV60AlbProCod), lV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr, AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel, AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme, AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to, Short.valueOf(AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc), Short.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to), Short.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to), AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre, AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to, Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie), Integer.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to), Integer.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub), Integer.valueOf(AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to), Short.valueOf(AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod), Short.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to), Short.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas), Short.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to), lV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs, AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel});
      GRID_nRecordCount = H02503_AGRID_nRecordCount[0] ;
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
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = AV30TFBarAlbKgmE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = AV31TFBarAlbKgmE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie = AV38TFBarAlbPie ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod = AV40TFTubCod ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to = AV41TFTubCod_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub = AV42TFBarAlbTub ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to = AV43TFBarAlbTub_To ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod = AV44TFPlasCod ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to = AV45TFPlasCod_To ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas = AV46TFBarAlbPlas ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to = AV47TFBarAlbPlas_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = AV48TFAlbHdrObs ;
      AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = AV49TFAlbHdrObs_Sel ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = AV51TFAlbProVal_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV61EmprCod, AV60AlbProCod, AV18TFBarNHdr, AV19TFBarNHdr_Sel, AV30TFBarAlbKgmE, AV31TFBarAlbKgmE_To, AV32TFAlbHdrAnc, AV33TFAlbHdrAnc_To, AV34TFAlbHdrgm2, AV35TFAlbHdrgm2_To, AV36TFBarAlbMtrE, AV37TFBarAlbMtrE_To, AV38TFBarAlbPie, AV39TFBarAlbPie_To, AV40TFTubCod, AV41TFTubCod_To, AV42TFBarAlbTub, AV43TFBarAlbTub_To, AV44TFPlasCod, AV45TFPlasCod_To, AV46TFBarAlbPlas, AV47TFBarAlbPlas_To, AV48TFAlbHdrObs, AV49TFAlbHdrObs_Sel, AV51TFAlbProVal_Sels, AV100Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65AlbEnvFtp, AV93AlbProEst, AV95OkIN, AV66AlbLic, AV63AlbSec, AV58GuiRemCli, AV57GuiRemCln, AV62AlbProfch) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = AV30TFBarAlbKgmE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = AV31TFBarAlbKgmE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie = AV38TFBarAlbPie ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod = AV40TFTubCod ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to = AV41TFTubCod_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub = AV42TFBarAlbTub ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to = AV43TFBarAlbTub_To ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod = AV44TFPlasCod ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to = AV45TFPlasCod_To ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas = AV46TFBarAlbPlas ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to = AV47TFBarAlbPlas_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = AV48TFAlbHdrObs ;
      AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = AV49TFAlbHdrObs_Sel ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = AV51TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV61EmprCod, AV60AlbProCod, AV18TFBarNHdr, AV19TFBarNHdr_Sel, AV30TFBarAlbKgmE, AV31TFBarAlbKgmE_To, AV32TFAlbHdrAnc, AV33TFAlbHdrAnc_To, AV34TFAlbHdrgm2, AV35TFAlbHdrgm2_To, AV36TFBarAlbMtrE, AV37TFBarAlbMtrE_To, AV38TFBarAlbPie, AV39TFBarAlbPie_To, AV40TFTubCod, AV41TFTubCod_To, AV42TFBarAlbTub, AV43TFBarAlbTub_To, AV44TFPlasCod, AV45TFPlasCod_To, AV46TFBarAlbPlas, AV47TFBarAlbPlas_To, AV48TFAlbHdrObs, AV49TFAlbHdrObs_Sel, AV51TFAlbProVal_Sels, AV100Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65AlbEnvFtp, AV93AlbProEst, AV95OkIN, AV66AlbLic, AV63AlbSec, AV58GuiRemCli, AV57GuiRemCln, AV62AlbProfch) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = AV30TFBarAlbKgmE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = AV31TFBarAlbKgmE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie = AV38TFBarAlbPie ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod = AV40TFTubCod ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to = AV41TFTubCod_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub = AV42TFBarAlbTub ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to = AV43TFBarAlbTub_To ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod = AV44TFPlasCod ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to = AV45TFPlasCod_To ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas = AV46TFBarAlbPlas ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to = AV47TFBarAlbPlas_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = AV48TFAlbHdrObs ;
      AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = AV49TFAlbHdrObs_Sel ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = AV51TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV61EmprCod, AV60AlbProCod, AV18TFBarNHdr, AV19TFBarNHdr_Sel, AV30TFBarAlbKgmE, AV31TFBarAlbKgmE_To, AV32TFAlbHdrAnc, AV33TFAlbHdrAnc_To, AV34TFAlbHdrgm2, AV35TFAlbHdrgm2_To, AV36TFBarAlbMtrE, AV37TFBarAlbMtrE_To, AV38TFBarAlbPie, AV39TFBarAlbPie_To, AV40TFTubCod, AV41TFTubCod_To, AV42TFBarAlbTub, AV43TFBarAlbTub_To, AV44TFPlasCod, AV45TFPlasCod_To, AV46TFBarAlbPlas, AV47TFBarAlbPlas_To, AV48TFAlbHdrObs, AV49TFAlbHdrObs_Sel, AV51TFAlbProVal_Sels, AV100Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65AlbEnvFtp, AV93AlbProEst, AV95OkIN, AV66AlbLic, AV63AlbSec, AV58GuiRemCli, AV57GuiRemCln, AV62AlbProfch) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = AV30TFBarAlbKgmE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = AV31TFBarAlbKgmE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie = AV38TFBarAlbPie ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod = AV40TFTubCod ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to = AV41TFTubCod_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub = AV42TFBarAlbTub ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to = AV43TFBarAlbTub_To ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod = AV44TFPlasCod ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to = AV45TFPlasCod_To ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas = AV46TFBarAlbPlas ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to = AV47TFBarAlbPlas_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = AV48TFAlbHdrObs ;
      AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = AV49TFAlbHdrObs_Sel ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = AV51TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV61EmprCod, AV60AlbProCod, AV18TFBarNHdr, AV19TFBarNHdr_Sel, AV30TFBarAlbKgmE, AV31TFBarAlbKgmE_To, AV32TFAlbHdrAnc, AV33TFAlbHdrAnc_To, AV34TFAlbHdrgm2, AV35TFAlbHdrgm2_To, AV36TFBarAlbMtrE, AV37TFBarAlbMtrE_To, AV38TFBarAlbPie, AV39TFBarAlbPie_To, AV40TFTubCod, AV41TFTubCod_To, AV42TFBarAlbTub, AV43TFBarAlbTub_To, AV44TFPlasCod, AV45TFPlasCod_To, AV46TFBarAlbPlas, AV47TFBarAlbPlas_To, AV48TFAlbHdrObs, AV49TFAlbHdrObs_Sel, AV51TFAlbProVal_Sels, AV100Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65AlbEnvFtp, AV93AlbProEst, AV95OkIN, AV66AlbLic, AV63AlbSec, AV58GuiRemCli, AV57GuiRemCln, AV62AlbProfch) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = AV30TFBarAlbKgmE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = AV31TFBarAlbKgmE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie = AV38TFBarAlbPie ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod = AV40TFTubCod ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to = AV41TFTubCod_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub = AV42TFBarAlbTub ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to = AV43TFBarAlbTub_To ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod = AV44TFPlasCod ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to = AV45TFPlasCod_To ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas = AV46TFBarAlbPlas ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to = AV47TFBarAlbPlas_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = AV48TFAlbHdrObs ;
      AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = AV49TFAlbHdrObs_Sel ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = AV51TFAlbProVal_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV61EmprCod, AV60AlbProCod, AV18TFBarNHdr, AV19TFBarNHdr_Sel, AV30TFBarAlbKgmE, AV31TFBarAlbKgmE_To, AV32TFAlbHdrAnc, AV33TFAlbHdrAnc_To, AV34TFAlbHdrgm2, AV35TFAlbHdrgm2_To, AV36TFBarAlbMtrE, AV37TFBarAlbMtrE_To, AV38TFBarAlbPie, AV39TFBarAlbPie_To, AV40TFTubCod, AV41TFTubCod_To, AV42TFBarAlbTub, AV43TFBarAlbTub_To, AV44TFPlasCod, AV45TFPlasCod_To, AV46TFBarAlbPlas, AV47TFBarAlbPlas_To, AV48TFAlbHdrObs, AV49TFAlbHdrObs_Sel, AV51TFAlbProVal_Sels, AV100Pgmname, AV12OrderedBy, AV13OrderedDsc, AV65AlbEnvFtp, AV93AlbProEst, AV95OkIN, AV66AlbLic, AV63AlbSec, AV58GuiRemCli, AV57GuiRemCln, AV62AlbProfch) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV100Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100Pgmname", AV100Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      edtavGuiremcln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcln_Enabled), 5, 0), true);
      edtavAlbprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprofch_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavMessages_jsonin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMessages_jsonin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMessages_jsonin_Enabled), 5, 0), true);
      edtavHashin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHashin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHashin_Enabled), 5, 0), true);
      chkavOkin.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavOkin.getInternalname(), "Enabled", GXutil.ltrimstr( chkavOkin.getEnabled(), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2500( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e182502 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV55GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvelop_confirmpanel_delete_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETE_Result") ;
         /* Read variables values. */
         AV100Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100Pgmname", AV100Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_2");
         AV100Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100Pgmname", AV100Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV100Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e182502 ();
      if (returnInSub) return;
   }

   public void e182502( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV69Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV69Station = GXt_char1 ;
      GXv_char2[0] = AV61EmprCod ;
      GXv_char3[0] = AV67EmprNom ;
      GXv_char4[0] = AV68UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV69Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_2_impl.this.AV61EmprCod = GXv_char2[0] ;
      documentodetransporteproduccion_2_impl.this.AV67EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_2_impl.this.AV68UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61EmprCod", AV61EmprCod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV52DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV52DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV70Plasticos) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV61EmprCod, httpContext.getMessage( "PLASTI", ""), GXv_int8) ;
      documentodetransporteproduccion_2_impl.this.GXt_int7 = GXv_int8[0] ;
      AV70Plasticos = GXt_int7 ;
      GXt_int7 = (byte)(AV71Tubos) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV61EmprCod, httpContext.getMessage( "TUBOSS", ""), GXv_int8) ;
      documentodetransporteproduccion_2_impl.this.GXt_int7 = GXv_int8[0] ;
      AV71Tubos = GXt_int7 ;
      GXt_int7 = (byte)(DecimalUtil.decToDouble(AV101Nofases)) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV61EmprCod, httpContext.getMessage( "NOFASE", ""), GXv_int8) ;
      documentodetransporteproduccion_2_impl.this.GXt_int7 = GXv_int8[0] ;
      AV101Nofases = DecimalUtil.doubleToDec(GXt_int7) ;
      bttBtninsert_Enabled = (((AV65AlbEnvFtp==3)||(AV93AlbProEst==2)||!(GXutil.strcmp("", AV66AlbLic)==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtninsert_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtninsert_Enabled), 5, 0), true);
      bttBtncerrar_Enabled = (((AV65AlbEnvFtp==3)||(AV93AlbProEst==2)||!(GXutil.strcmp("", AV66AlbLic)==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtncerrar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtncerrar_Enabled), 5, 0), true);
      System.out.println( httpContext.getMessage( "Build", "") );
   }

   public void e192502( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV54GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridCurrentPage), 10, 0));
      AV55GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridPageCount), 10, 0));
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "InvertGridMenu", "", new Object[] {httpContext.getMessage( ".dropdown-menu", "")});
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = AV30TFBarAlbKgmE ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = AV31TFBarAlbKgmE_To ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie = AV38TFBarAlbPie ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod = AV40TFTubCod ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to = AV41TFTubCod_To ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub = AV42TFBarAlbTub ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to = AV43TFBarAlbTub_To ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod = AV44TFPlasCod ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to = AV45TFPlasCod_To ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas = AV46TFBarAlbPlas ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to = AV47TFBarAlbPlas_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = AV48TFAlbHdrObs ;
      AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = AV49TFAlbHdrObs_Sel ;
      AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = AV51TFAlbProVal_Sels ;
      /*  Sending Event outputs  */
   }

   public void e112502( )
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
         AV53PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV53PageToGo) ;
      }
   }

   public void e122502( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132502( )
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
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV18TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFBarNHdr", AV18TFBarNHdr);
            AV19TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFBarNHdr_Sel", AV19TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbKgmE") == 0 )
         {
            AV30TFBarAlbKgmE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarAlbKgmE", GXutil.ltrimstr( AV30TFBarAlbKgmE, 9, 2));
            AV31TFBarAlbKgmE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarAlbKgmE_To", GXutil.ltrimstr( AV31TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrAnc") == 0 )
         {
            AV32TFAlbHdrAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFAlbHdrAnc), 4, 0));
            AV33TFAlbHdrAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrgm2") == 0 )
         {
            AV34TFAlbHdrgm2 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFAlbHdrgm2), 4, 0));
            AV35TFAlbHdrgm2_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbMtrE") == 0 )
         {
            AV36TFBarAlbMtrE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFBarAlbMtrE", GXutil.ltrimstr( AV36TFBarAlbMtrE, 9, 2));
            AV37TFBarAlbMtrE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFBarAlbMtrE_To", GXutil.ltrimstr( AV37TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPie") == 0 )
         {
            AV38TFBarAlbPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFBarAlbPie), 6, 0));
            AV39TFBarAlbPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TubCod") == 0 )
         {
            AV40TFTubCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFTubCod), 4, 0));
            AV41TFTubCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbTub") == 0 )
         {
            AV42TFBarAlbTub = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFBarAlbTub), 6, 0));
            AV43TFBarAlbTub_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PlasCod") == 0 )
         {
            AV44TFPlasCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPlasCod), 4, 0));
            AV45TFPlasCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFPlasCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAlbPlas") == 0 )
         {
            AV46TFBarAlbPlas = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarAlbPlas), 4, 0));
            AV47TFBarAlbPlas_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFBarAlbPlas_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHdrObs") == 0 )
         {
            AV48TFAlbHdrObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbHdrObs", AV48TFAlbHdrObs);
            AV49TFAlbHdrObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbHdrObs_Sel", AV49TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProVal") == 0 )
         {
            AV50TFAlbProVal_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbProVal_SelsJson", AV50TFAlbProVal_SelsJson);
            AV51TFAlbProVal_Sels.fromJSonString(AV50TFAlbProVal_SelsJson, null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51TFAlbProVal_Sels", AV51TFAlbProVal_Sels);
   }

   private void e202502( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      if ( ( AV65AlbEnvFtp != 3 ) || ( AV93AlbProEst != 2 ) )
      {
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Fases", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      if ( ( AV65AlbEnvFtp != 3 ) || ( AV93AlbProEst != 2 ) )
      {
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Cerrar Produccion", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( ( AV65AlbEnvFtp != 3 ) || ( AV93AlbProEst != 2 ) )
      {
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(55) ;
      }
      sendrow_552( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_55_Refreshing )
      {
         httpContext.doAjaxLoad(55, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV56GridActions, 4, 0)) );
   }

   public void e212502( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV56GridActions == 1 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV56GridActions == 2 )
      {
         /* Execute user subroutine: 'DO FASES' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV56GridActions == 3 )
      {
         /* Execute user subroutine: 'DO CERRARPRODUCCION' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV56GridActions == 4 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S192 ();
         if (returnInSub) return;
      }
      AV56GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV56GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e142502( )
   {
      /* Dvelop_confirmpanel_delete_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_delete_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DELETE' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e152502( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_3", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(AV58GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV57GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV62AlbProfch)),GXutil.URLEncode(GXutil.rtrim(AV63AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV64AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV65AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV66AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic"}) , new Object[] {});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e162502( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_12", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"}) , new Object[] {});
      GXv_char4[0] = AV81Cadena ;
      GXv_char3[0] = AV82firma ;
      new app.documentotransporteproduccion.obtengocadenaparahashdocumentodetransporteproduccion(remoteHandle, context).execute( AV61EmprCod, (int)(AV60AlbProCod), AV62AlbProfch, AV80AlbHhfm, GXv_char4, GXv_char3) ;
      documentodetransporteproduccion_2_impl.this.AV81Cadena = GXv_char4[0] ;
      documentodetransporteproduccion_2_impl.this.AV82firma = GXv_char3[0] ;
      GXv_char4[0] = AV88Hash ;
      GXv_objcol_SdtMessages_Message10[0] = AV83Messages ;
      GXv_boolean11[0] = AV84ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV81Cadena, GXv_char4, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
      documentodetransporteproduccion_2_impl.this.AV88Hash = GXv_char4[0] ;
      AV83Messages = GXv_objcol_SdtMessages_Message10[0] ;
      documentodetransporteproduccion_2_impl.this.AV84ok = GXv_boolean11[0] ;
      if ( ! AV84ok )
      {
         AV125GXV1 = 1 ;
         while ( AV125GXV1 <= AV83Messages.size() )
         {
            AV89Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV83Messages.elementAt(-1+AV125GXV1));
            httpContext.GX_msglist.addItem(AV89Message.getgxTv_SdtMessages_Message_Description());
            AV125GXV1 = (int)(AV125GXV1+1) ;
         }
      }
      GXv_char4[0] = AV81Cadena ;
      GXv_char3[0] = AV88Hash ;
      new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion(remoteHandle, context).execute( AV61EmprCod, (int)(AV60AlbProCod), GXv_char4, GXv_char3) ;
      documentodetransporteproduccion_2_impl.this.AV81Cadena = GXv_char4[0] ;
      documentodetransporteproduccion_2_impl.this.AV88Hash = GXv_char3[0] ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.horasalidadocumentoenvioatdocumentodetransporteproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60AlbProCod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV80AlbHhfm)),GXutil.URLEncode(GXutil.rtrim(AV64AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV81Cadena)),GXutil.URLEncode(GXutil.rtrim(AV88Hash))}, new String[] {"Emprcod","AlbProCOD","AlbProSys","albPropri","cadena","hash"}) , new Object[] {"AV61EmprCod","AV60AlbProCod","AV80AlbHhfm","AV64AlbProPri","AV81Cadena","AV88Hash"});
      new app.pelcalb(remoteHandle, context).execute( AV61EmprCod, AV60AlbProCod) ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e172502( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      if ( ( AV93AlbProEst == 2 ) || ( AV65AlbEnvFtp == 3 ) || ! (GXutil.strcmp("", AV66AlbLic)==0) )
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
         GXv_char4[0] = AV81Cadena ;
         GXv_char3[0] = AV82firma ;
         new app.documentotransporteproduccion.obtengocadenaparahashdocumentodetransporteproduccion(remoteHandle, context).execute( AV61EmprCod, (int)(AV60AlbProCod), AV62AlbProfch, AV80AlbHhfm, GXv_char4, GXv_char3) ;
         documentodetransporteproduccion_2_impl.this.AV81Cadena = GXv_char4[0] ;
         documentodetransporteproduccion_2_impl.this.AV82firma = GXv_char3[0] ;
         GXv_char4[0] = AV88Hash ;
         GXv_objcol_SdtMessages_Message10[0] = AV83Messages ;
         GXv_boolean11[0] = AV84ok ;
         new app.hash_obtener(remoteHandle, context).execute( AV81Cadena, GXv_char4, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
         documentodetransporteproduccion_2_impl.this.AV88Hash = GXv_char4[0] ;
         AV83Messages = GXv_objcol_SdtMessages_Message10[0] ;
         documentodetransporteproduccion_2_impl.this.AV84ok = GXv_boolean11[0] ;
         AV90Messages_json = AV83Messages.toJSonString(false) ;
         System.out.println( AV90Messages_json );
         System.out.println( httpContext.getMessage( "&Cadena=", "")+AV81Cadena );
         System.out.println( httpContext.getMessage( "&hash=", "")+AV88Hash );
         System.out.println( httpContext.getMessage( "&ok=", "")+GXutil.booltostr( AV84ok) );
         if ( AV84ok )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
            GXv_char4[0] = AV81Cadena ;
            GXv_char3[0] = AV88Hash ;
            new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion(remoteHandle, context).execute( AV61EmprCod, (int)(AV60AlbProCod), GXv_char4, GXv_char3) ;
            documentodetransporteproduccion_2_impl.this.AV81Cadena = GXv_char4[0] ;
            documentodetransporteproduccion_2_impl.this.AV88Hash = GXv_char3[0] ;
         }
         else
         {
            AV126GXV2 = 1 ;
            while ( AV126GXV2 <= AV83Messages.size() )
            {
               AV89Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV83Messages.elementAt(-1+AV126GXV2));
               httpContext.GX_msglist.addItem(AV89Message.getgxTv_SdtMessages_Message_Description());
               AV126GXV2 = (int)(AV126GXV2+1) ;
            }
         }
         System.out.println( httpContext.getMessage( "go PELCALB", "") );
         new app.pelcalb(remoteHandle, context).execute( AV61EmprCod, AV60AlbProCod) ;
         System.out.println( httpContext.getMessage( "return PELCALB", "") );
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_12", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"}) , new Object[] {});
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( AV93AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Faturada ¡¡¡", ""));
      }
      else
      {
         if ( ( AV65AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV66AlbLic, " ") != 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", ""));
         }
         else
         {
            httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_3", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV58GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV57GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV62AlbProfch)),GXutil.URLEncode(GXutil.rtrim(AV63AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV64AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV65AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV66AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic"}) , new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO FASES' Routine */
      returnInSub = false ;
      if ( ( AV65AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV66AlbLic, " ") != 0 ) || ( AV93AlbProEst == 2 ) )
      {
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV65AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV66AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","AlbEnvFtp","AlbLic"}) , new Object[] {});
      }
      else
      {
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV65AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV66AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","AlbEnvFtp","AlbLic"}) , new Object[] {});
      }
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO CERRARPRODUCCION' Routine */
      returnInSub = false ;
      if ( AV93AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Faturada ¡¡¡", ""));
      }
      else
      {
         if ( ( AV65AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV66AlbLic, " ") != 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", ""));
         }
         else
         {
            httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_8", new String[] {GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(A1261BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(A1263BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(A1265BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A1261BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(A1263BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(A1265BarAlbPie,6,0)),GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.ltrimstr(A213BarSit,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV62AlbProfch))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarAlbKgmE","BarAlbMtrE","BarAlbPie","KilAnt","MtrAnt","PieAnt","Mode","BarSit","AlbProFch"}) , new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      if ( AV93AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Faturada ¡¡¡", ""));
      }
      else
      {
         if ( ( AV65AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV66AlbLic, " ") != 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", ""));
         }
         else
         {
            AV74Barcod_Selected = A129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74Barcod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Barcod_Selected), 8, 0));
            AV75Barcodreo_Selected = A132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75Barcodreo_Selected", GXutil.str( AV75Barcodreo_Selected, 1, 0));
            AV76Barcodpar_Selected = A130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76Barcodpar_Selected", AV76Barcodpar_Selected);
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DELETEContainer", "Confirm", "", new Object[] {});
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO ACTION DELETE' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV61EmprCod ;
      GXv_int12[0] = AV60AlbProCod ;
      GXv_int13[0] = A129BarCod ;
      GXv_int8[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_int14[0] = (byte)(1) ;
      new app.pelihoj(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int13, GXv_int8, GXv_char3, GXv_int14) ;
      documentodetransporteproduccion_2_impl.this.AV61EmprCod = GXv_char4[0] ;
      documentodetransporteproduccion_2_impl.this.AV60AlbProCod = GXv_int12[0] ;
      documentodetransporteproduccion_2_impl.this.A129BarCod = GXv_int13[0] ;
      documentodetransporteproduccion_2_impl.this.A132BarCodReo = GXv_int8[0] ;
      documentodetransporteproduccion_2_impl.this.A130BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61EmprCod", AV61EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV60AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60AlbProCod), 10, 0));
      GXv_char4[0] = AV61EmprCod ;
      GXv_int12[0] = AV60AlbProCod ;
      GXv_int15[0] = AV77AlbContLin ;
      new app.plinalb(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int15) ;
      documentodetransporteproduccion_2_impl.this.AV61EmprCod = GXv_char4[0] ;
      documentodetransporteproduccion_2_impl.this.AV60AlbProCod = GXv_int12[0] ;
      documentodetransporteproduccion_2_impl.this.AV77AlbContLin = GXv_int15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61EmprCod", AV61EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV60AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60AlbProCod), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV77AlbContLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77AlbContLin), 4, 0));
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Eliminacion realizada", ""));
      httpContext.doAjaxRefresh();
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_3", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV61EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV74Barcod_Selected,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV75Barcodreo_Selected,1,0)),GXutil.URLEncode(GXutil.rtrim(AV76Barcodpar_Selected)),GXutil.URLEncode(GXutil.ltrimstr(AV58GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV57GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV62AlbProfch)),GXutil.URLEncode(GXutil.rtrim(AV63AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV64AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV65AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV66AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV100Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV100Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV100Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV127GXV3 = 1 ;
      while ( AV127GXV3 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV127GXV3));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV18TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFBarNHdr", AV18TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV19TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFBarNHdr_Sel", AV19TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV30TFBarAlbKgmE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarAlbKgmE", GXutil.ltrimstr( AV30TFBarAlbKgmE, 9, 2));
            AV31TFBarAlbKgmE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarAlbKgmE_To", GXutil.ltrimstr( AV31TFBarAlbKgmE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV32TFAlbHdrAnc = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFAlbHdrAnc), 4, 0));
            AV33TFAlbHdrAnc_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbHdrAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFAlbHdrAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV34TFAlbHdrgm2 = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFAlbHdrgm2), 4, 0));
            AV35TFAlbHdrgm2_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFAlbHdrgm2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFAlbHdrgm2_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV36TFBarAlbMtrE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFBarAlbMtrE", GXutil.ltrimstr( AV36TFBarAlbMtrE, 9, 2));
            AV37TFBarAlbMtrE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFBarAlbMtrE_To", GXutil.ltrimstr( AV37TFBarAlbMtrE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV38TFBarAlbPie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFBarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFBarAlbPie), 6, 0));
            AV39TFBarAlbPie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFBarAlbPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFBarAlbPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV40TFTubCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFTubCod), 4, 0));
            AV41TFTubCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFTubCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFTubCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV42TFBarAlbTub = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFBarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFBarAlbTub), 6, 0));
            AV43TFBarAlbTub_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFBarAlbTub_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarAlbTub_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPLASCOD") == 0 )
         {
            AV44TFPlasCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPlasCod), 4, 0));
            AV45TFPlasCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPlasCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFPlasCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPLAS") == 0 )
         {
            AV46TFBarAlbPlas = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFBarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarAlbPlas), 4, 0));
            AV47TFBarAlbPlas_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFBarAlbPlas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFBarAlbPlas_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV48TFAlbHdrObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbHdrObs", AV48TFAlbHdrObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV49TFAlbHdrObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbHdrObs_Sel", AV49TFAlbHdrObs_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV50TFAlbProVal_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbProVal_SelsJson", AV50TFAlbProVal_SelsJson);
            AV51TFAlbProVal_Sels.fromJSonString(AV50TFAlbProVal_SelsJson, null);
         }
         AV127GXV3 = (int)(AV127GXV3+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFBarNHdr_Sel)==0), AV19TFBarNHdr_Sel, GXv_char4) ;
      documentodetransporteproduccion_2_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFAlbHdrObs_Sel)==0), AV49TFAlbHdrObs_Sel, GXv_char3) ;
      documentodetransporteproduccion_2_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV51TFAlbProVal_Sels.size()==0), AV50TFAlbProVal_SelsJson, GXv_char2) ;
      documentodetransporteproduccion_2_impl.this.GXt_char17 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||||||||||"+GXt_char16+"|"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFBarNHdr)==0), AV18TFBarNHdr, GXv_char4) ;
      documentodetransporteproduccion_2_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFAlbHdrObs)==0), AV48TFAlbHdrObs, GXv_char3) ;
      documentodetransporteproduccion_2_impl.this.GXt_char16 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char17+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarAlbKgmE)==0) ? "" : GXutil.str( AV30TFBarAlbKgmE, 9, 2))+"|"+((0==AV32TFAlbHdrAnc) ? "" : GXutil.str( AV32TFAlbHdrAnc, 4, 0))+"|"+((0==AV34TFAlbHdrgm2) ? "" : GXutil.str( AV34TFAlbHdrgm2, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarAlbMtrE)==0) ? "" : GXutil.str( AV36TFBarAlbMtrE, 9, 2))+"|"+((0==AV38TFBarAlbPie) ? "" : GXutil.str( AV38TFBarAlbPie, 6, 0))+"|"+((0==AV40TFTubCod) ? "" : GXutil.str( AV40TFTubCod, 4, 0))+"|"+((0==AV42TFBarAlbTub) ? "" : GXutil.str( AV42TFBarAlbTub, 6, 0))+"|"+((0==AV44TFPlasCod) ? "" : GXutil.str( AV44TFPlasCod, 4, 0))+"|"+((0==AV46TFBarAlbPlas) ? "" : GXutil.str( AV46TFBarAlbPlas, 4, 0))+"|"+GXt_char16+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarAlbKgmE_To)==0) ? "" : GXutil.str( AV31TFBarAlbKgmE_To, 9, 2))+"|"+((0==AV33TFAlbHdrAnc_To) ? "" : GXutil.str( AV33TFAlbHdrAnc_To, 4, 0))+"|"+((0==AV35TFAlbHdrgm2_To) ? "" : GXutil.str( AV35TFAlbHdrgm2_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarAlbMtrE_To)==0) ? "" : GXutil.str( AV37TFBarAlbMtrE_To, 9, 2))+"|"+((0==AV39TFBarAlbPie_To) ? "" : GXutil.str( AV39TFBarAlbPie_To, 6, 0))+"|"+((0==AV41TFTubCod_To) ? "" : GXutil.str( AV41TFTubCod_To, 4, 0))+"|"+((0==AV43TFBarAlbTub_To) ? "" : GXutil.str( AV43TFBarAlbTub_To, 6, 0))+"|"+((0==AV45TFPlasCod_To) ? "" : GXutil.str( AV45TFPlasCod_To, 4, 0))+"|"+((0==AV47TFBarAlbPlas_To) ? "" : GXutil.str( AV47TFBarAlbPlas_To, 4, 0))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV100Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARNHDR", "", !(GXutil.strcmp("", AV18TFBarNHdr)==0), (short)(0), AV18TFBarNHdr, "", !(GXutil.strcmp("", AV19TFBarNHdr_Sel)==0), AV19TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARALBKGME", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarAlbKgmE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarAlbKgmE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV30TFBarAlbKgmE, 9, 2)), GXutil.trim( GXutil.str( AV31TFBarAlbKgmE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFALBHDRANC", "", !((0==AV32TFAlbHdrAnc)&&(0==AV33TFAlbHdrAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFAlbHdrAnc, 4, 0)), GXutil.trim( GXutil.str( AV33TFAlbHdrAnc_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFALBHDRGM2", "", !((0==AV34TFAlbHdrgm2)&&(0==AV35TFAlbHdrgm2_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFAlbHdrgm2, 4, 0)), GXutil.trim( GXutil.str( AV35TFAlbHdrgm2_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARALBMTRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarAlbMtrE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFBarAlbMtrE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV36TFBarAlbMtrE, 9, 2)), GXutil.trim( GXutil.str( AV37TFBarAlbMtrE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARALBPIE", "", !((0==AV38TFBarAlbPie)&&(0==AV39TFBarAlbPie_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFBarAlbPie, 6, 0)), GXutil.trim( GXutil.str( AV39TFBarAlbPie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFTUBCOD", "", !((0==AV40TFTubCod)&&(0==AV41TFTubCod_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFTubCod, 4, 0)), GXutil.trim( GXutil.str( AV41TFTubCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARALBTUB", "", !((0==AV42TFBarAlbTub)&&(0==AV43TFBarAlbTub_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFBarAlbTub, 6, 0)), GXutil.trim( GXutil.str( AV43TFBarAlbTub_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPLASCOD", "", !((0==AV44TFPlasCod)&&(0==AV45TFPlasCod_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFPlasCod, 4, 0)), GXutil.trim( GXutil.str( AV45TFPlasCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARALBPLAS", "", !((0==AV46TFBarAlbPlas)&&(0==AV47TFBarAlbPlas_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFBarAlbPlas, 4, 0)), GXutil.trim( GXutil.str( AV47TFBarAlbPlas_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFALBHDROBS", "", !(GXutil.strcmp("", AV48TFAlbHdrObs)==0), (short)(0), AV48TFAlbHdrObs, "", !(GXutil.strcmp("", AV49TFAlbHdrObs_Sel)==0), AV49TFAlbHdrObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFALBPROVAL_SEL", "", !(AV51TFAlbProVal_Sels.size()==0), (short)(0), AV51TFAlbProVal_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV100Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV100Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_3" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV100Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV100Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV100Pgmname+"GridState"), null, null);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV61EmprCod, httpContext.getMessage( "TUBOSS", "")) == 1 ) ) )
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
         httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
         GXv_SdtWWPGridState18[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState18, "TFTUBCOD", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState18[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV100Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV61EmprCod, httpContext.getMessage( "TUBOSS", "")) == 1 ) ) )
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
         httpContext.ajax_rsp_assign_prop("", false, edtBarAlbTub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Visible), 5, 0), !bGXsfl_55_Refreshing);
         GXv_SdtWWPGridState18[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState18, "TFBARALBTUB", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState18[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV100Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV61EmprCod, httpContext.getMessage( "PLASTI", "")) == 1 ) ) )
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
         httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
         GXv_SdtWWPGridState18[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState18, "TFPLASCOD", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState18[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV100Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV61EmprCod, httpContext.getMessage( "PLASTI", "")) == 1 ) ) )
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
         httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_55_Refreshing);
         GXv_SdtWWPGridState18[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState18, "TFBARALBPLAS", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState18[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV100Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
   }

   public void wb_table1_113_2502( boolean wbgen )
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
         wb_table1_113_2502e( true) ;
      }
      else
      {
         wb_table1_113_2502e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      Gx_mode = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV61EmprCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61EmprCod", AV61EmprCod);
      AV60AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60AlbProCod), 10, 0));
      AV58GuiRemCli = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GuiRemCli), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV58GuiRemCli), "ZZZZZ9")));
      AV57GuiRemCln = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57GuiRemCln", AV57GuiRemCln);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57GuiRemCln, ""))));
      AV62AlbProfch = (java.util.Date)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62AlbProfch", localUtil.format(AV62AlbProfch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV62AlbProfch));
      AV63AlbSec = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63AlbSec", AV63AlbSec);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV63AlbSec, "@!"))));
      AV64AlbProPri = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64AlbProPri", AV64AlbProPri);
      AV65AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65AlbEnvFtp", GXutil.str( AV65AlbEnvFtp, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65AlbEnvFtp), "9")));
      AV66AlbLic = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66AlbLic", AV66AlbLic);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66AlbLic, ""))));
      AV80AlbHhfm = (java.util.Date)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80AlbHhfm", localUtil.ttoc( AV80AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV93AlbProEst = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93AlbProEst", GXutil.str( AV93AlbProEst, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93AlbProEst), "9")));
      AV94HashIN = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94HashIN", AV94HashIN);
      AV95OkIN = ((Boolean) getParm(obj,13)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95OkIN", AV95OkIN);
      AV96Messages_jsonIN = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Messages_jsonIN", AV96Messages_jsonIN);
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
      pa2502( ) ;
      ws2502( ) ;
      we2502( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615122", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_2.js", "?20268211615122", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_552( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_55_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_55_idx ;
      edtAlbSer_Internalname = "ALBSER_"+sGXsfl_55_idx ;
      edtAlbSerD_Internalname = "ALBSERD_"+sGXsfl_55_idx ;
      edtAlbColNom_Internalname = "ALBCOLNOM_"+sGXsfl_55_idx ;
      edtAlbColNum_Internalname = "ALBCOLNUM_"+sGXsfl_55_idx ;
      edtAlbNomCli_Internalname = "ALBNOMCLI_"+sGXsfl_55_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_55_idx ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC_"+sGXsfl_55_idx ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2_"+sGXsfl_55_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_55_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_55_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_idx ;
      edtTubCod_Internalname = "TUBCOD_"+sGXsfl_55_idx ;
      edtBarAlbTub_Internalname = "BARALBTUB_"+sGXsfl_55_idx ;
      edtPlasCod_Internalname = "PLASCOD_"+sGXsfl_55_idx ;
      edtBarAlbPlas_Internalname = "BARALBPLAS_"+sGXsfl_55_idx ;
      edtAlbHdrObs_Internalname = "ALBHDROBS_"+sGXsfl_55_idx ;
      cmbAlbProVal.setInternalname( "ALBPROVAL_"+sGXsfl_55_idx );
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_552( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_55_fel_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_55_fel_idx ;
      edtAlbSer_Internalname = "ALBSER_"+sGXsfl_55_fel_idx ;
      edtAlbSerD_Internalname = "ALBSERD_"+sGXsfl_55_fel_idx ;
      edtAlbColNom_Internalname = "ALBCOLNOM_"+sGXsfl_55_fel_idx ;
      edtAlbColNum_Internalname = "ALBCOLNUM_"+sGXsfl_55_fel_idx ;
      edtAlbNomCli_Internalname = "ALBNOMCLI_"+sGXsfl_55_fel_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_55_fel_idx ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC_"+sGXsfl_55_fel_idx ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2_"+sGXsfl_55_fel_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_55_fel_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_55_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_fel_idx ;
      edtTubCod_Internalname = "TUBCOD_"+sGXsfl_55_fel_idx ;
      edtBarAlbTub_Internalname = "BARALBTUB_"+sGXsfl_55_fel_idx ;
      edtPlasCod_Internalname = "PLASCOD_"+sGXsfl_55_fel_idx ;
      edtBarAlbPlas_Internalname = "BARALBPLAS_"+sGXsfl_55_fel_idx ;
      edtAlbHdrObs_Internalname = "ALBHDROBS_"+sGXsfl_55_fel_idx ;
      cmbAlbProVal.setInternalname( "ALBPROVAL_"+sGXsfl_55_fel_idx );
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_55_fel_idx ;
   }

   public void sendrow_552( )
   {
      subsflControlProps_552( ) ;
      wb2500( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_55_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_55_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_55_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV56GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV56GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV56GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_55_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,56);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV56GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_55_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSer_Internalname,GXutil.rtrim( A3391AlbSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSerD_Internalname,GXutil.rtrim( A8879AlbSerD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSerD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNom_Internalname,GXutil.rtrim( A3392AlbColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNomCli_Internalname,GXutil.rtrim( A12232AlbNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrgm2_Internalname,GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrgm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTubCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTubCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTubCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTubCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbTub_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbTub_Internalname,GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbTub_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbTub_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPlasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6466PlasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPlasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAlbPlas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPlas_Internalname,GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPlas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAlbPlas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrObs_Internalname,GXutil.rtrim( A2441AlbHdrObs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProVal.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROVAL_" + sGXsfl_55_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProVal,cmbAlbProVal.getInternalname(),GXutil.rtrim( A2839AlbProVal),Integer.valueOf(1),cmbAlbProVal.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), !bGXsfl_55_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2502( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      /* End function sendrow_552 */
   }

   public void startgridcontrol55( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"55\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descrição", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Largura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Peças", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "Qtd.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPlasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Plastico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAlbPlas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Qtd.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observações", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV56GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
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
      edtavGuiremcln_Internalname = "vGUIREMCLN" ;
      edtavAlbprofch_Internalname = "vALBPROFCH" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtBarNHdr_Internalname = "BARNHDR" ;
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
      edtBarSit_Internalname = "BARSIT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      edtavMessages_jsonin_Internalname = "vMESSAGES_JSONIN" ;
      edtavHashin_Internalname = "vHASHIN" ;
      chkavOkin.setInternalname( "vOKIN" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      edtBarSit_Jsonclick = "" ;
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
      edtBarNHdr_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      chkavOkin.setEnabled( 0 );
      edtavHashin_Enabled = 0 ;
      edtavMessages_jsonin_Enabled = 0 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtncerrar_Enabled = 1 ;
      bttBtninsert_Enabled = 1 ;
      edtavAlbprofch_Jsonclick = "" ;
      edtavAlbprofch_Enabled = 0 ;
      edtavGuiremcln_Jsonclick = "" ;
      edtavGuiremcln_Enabled = 0 ;
      edtavGuiremcli_Jsonclick = "" ;
      edtavGuiremcli_Enabled = 0 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_delete_Confirmtype = "1" ;
      Dvelop_confirmpanel_delete_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_delete_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_delete_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_delete_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_delete_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_delete_Title = "" ;
      Ddo_grid_Datalistproc = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2GetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||S:Si,N:No" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||T" ;
      Ddo_grid_Datalisttype = "Dynamic||||||||||Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "T||||||||||T|T" ;
      Ddo_grid_Filterisrange = "|T|T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|5|6|7|8|9|10|11|12" ;
      Ddo_grid_Columnids = "1:BarNHdr|7:BarAlbKgmE|8:AlbHdrAnc|9:AlbHdrgm2|10:BarAlbMtrE|11:BarAlbPie|15:TubCod|16:BarAlbTub|17:PlasCod|18:BarAlbPlas|19:AlbHdrObs|20:AlbProVal" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Control HASH", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
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
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_55_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV56GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV56GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
      }
      GXCCtl = "ALBPROVAL_" + sGXsfl_55_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
      }
      chkavOkin.setName( "vOKIN" );
      chkavOkin.setWebtags( "" );
      chkavOkin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOkin.getInternalname(), "TitleCaption", chkavOkin.getCaption(), true);
      chkavOkin.setCheckedValue( "false" );
      AV95OkIN = GXutil.strtobool( GXutil.booltostr( AV95OkIN)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95OkIN", AV95OkIN);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV19TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV32TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV33TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV34TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV35TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV36TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV39TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV40TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV41TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV42TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV43TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV44TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV45TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV46TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV47TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV48TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV49TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV51TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV93AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV95OkIN',fld:'vOKIN',pic:''},{av:'AV66AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV63AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV58GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV57GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV62AlbProfch',fld:'vALBPROFCH',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112502',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV18TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV19TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV32TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV33TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV34TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV35TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV36TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV39TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV40TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV41TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV42TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV43TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV44TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV45TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV46TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV47TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV48TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV49TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV51TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV65AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV93AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV95OkIN',fld:'vOKIN',pic:''},{av:'AV66AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV63AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV58GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV57GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV62AlbProfch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122502',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV18TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV19TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV32TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV33TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV34TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV35TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV36TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV39TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV40TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV41TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV42TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV43TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV44TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV45TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV46TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV47TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV48TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV49TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV51TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV65AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV93AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV95OkIN',fld:'vOKIN',pic:''},{av:'AV66AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV63AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV58GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV57GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV62AlbProfch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132502',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV18TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV19TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV32TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV33TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV34TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV35TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV36TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV39TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV40TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV41TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV42TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV43TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV44TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV45TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV46TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV47TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV48TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV49TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV51TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV65AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV93AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV95OkIN',fld:'vOKIN',pic:''},{av:'AV66AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV63AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV58GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV57GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV62AlbProfch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50TFAlbProVal_SelsJson',fld:'vTFALBPROVAL_SELSJSON',pic:''},{av:'AV51TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV48TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV49TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV46TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV47TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV44TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV45TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV42TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV43TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV40TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV41TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV38TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV39TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV36TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV34TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV35TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV32TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV33TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV30TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV18TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV19TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e202502',iparms:[{av:'AV65AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV93AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e212502',iparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV18TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV19TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV32TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV33TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV34TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV35TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV36TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV39TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV40TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV41TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV42TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV43TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV44TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV45TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV46TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV47TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV48TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV49TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV51TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV65AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV93AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV95OkIN',fld:'vOKIN',pic:''},{av:'AV66AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV63AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV58GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV57GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV62AlbProfch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV64AlbProPri',fld:'vALBPROPRI',pic:''},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9',hsh:true},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV74Barcod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV75Barcodreo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV76Barcodpar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETE.CLOSE","{handler:'e142502',iparms:[{av:'Dvelop_confirmpanel_delete_Result',ctrl:'DVELOP_CONFIRMPANEL_DELETE',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV18TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV19TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV32TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV33TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV34TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV35TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV36TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV39TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV40TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV41TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV42TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV43TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV44TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV45TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV46TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV47TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV48TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV49TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV51TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV65AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV93AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV95OkIN',fld:'vOKIN',pic:''},{av:'AV66AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV63AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV58GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV57GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV62AlbProfch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV77AlbContLin',fld:'vALBCONTLIN',pic:'ZZZ9'},{av:'AV74Barcod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV75Barcodreo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV76Barcodpar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'AV64AlbProPri',fld:'vALBPROPRI',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETE.CLOSE",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77AlbContLin',fld:'vALBCONTLIN',pic:'ZZZ9'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e152502',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV18TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV19TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV30TFBarAlbKgmE',fld:'vTFBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31TFBarAlbKgmE_To',fld:'vTFBARALBKGME_TO',pic:'ZZZZZ9.99'},{av:'AV32TFAlbHdrAnc',fld:'vTFALBHDRANC',pic:'ZZZ9'},{av:'AV33TFAlbHdrAnc_To',fld:'vTFALBHDRANC_TO',pic:'ZZZ9'},{av:'AV34TFAlbHdrgm2',fld:'vTFALBHDRGM2',pic:'ZZZ9'},{av:'AV35TFAlbHdrgm2_To',fld:'vTFALBHDRGM2_TO',pic:'ZZZ9'},{av:'AV36TFBarAlbMtrE',fld:'vTFBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37TFBarAlbMtrE_To',fld:'vTFBARALBMTRE_TO',pic:'ZZZZZ9.99'},{av:'AV38TFBarAlbPie',fld:'vTFBARALBPIE',pic:'ZZZZZ9'},{av:'AV39TFBarAlbPie_To',fld:'vTFBARALBPIE_TO',pic:'ZZZZZ9'},{av:'AV40TFTubCod',fld:'vTFTUBCOD',pic:'ZZZ9'},{av:'AV41TFTubCod_To',fld:'vTFTUBCOD_TO',pic:'ZZZ9'},{av:'AV42TFBarAlbTub',fld:'vTFBARALBTUB',pic:'ZZZ9'},{av:'AV43TFBarAlbTub_To',fld:'vTFBARALBTUB_TO',pic:'ZZZ9'},{av:'AV44TFPlasCod',fld:'vTFPLASCOD',pic:'ZZZ9'},{av:'AV45TFPlasCod_To',fld:'vTFPLASCOD_TO',pic:'ZZZ9'},{av:'AV46TFBarAlbPlas',fld:'vTFBARALBPLAS',pic:'ZZZ9'},{av:'AV47TFBarAlbPlas_To',fld:'vTFBARALBPLAS_TO',pic:'ZZZ9'},{av:'AV48TFAlbHdrObs',fld:'vTFALBHDROBS',pic:''},{av:'AV49TFAlbHdrObs_Sel',fld:'vTFALBHDROBS_SEL',pic:''},{av:'AV51TFAlbProVal_Sels',fld:'vTFALBPROVAL_SELS',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtTubCod_Visible',ctrl:'TUBCOD',prop:'Visible'},{av:'edtBarAlbTub_Visible',ctrl:'BARALBTUB',prop:'Visible'},{av:'edtPlasCod_Visible',ctrl:'PLASCOD',prop:'Visible'},{av:'edtBarAlbPlas_Visible',ctrl:'BARALBPLAS',prop:'Visible'},{av:'AV65AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV93AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV95OkIN',fld:'vOKIN',pic:''},{av:'AV66AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV63AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV58GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV57GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV62AlbProfch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV64AlbProPri',fld:'vALBPROPRI',pic:''}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e162502',iparms:[{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV62AlbProfch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV80AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV64AlbProPri',fld:'vALBPROPRI',pic:''}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'AV64AlbProPri',fld:'vALBPROPRI',pic:''},{av:'AV80AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e172502',iparms:[{av:'AV93AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV65AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV66AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV61EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV62AlbProfch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV80AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[]}");
      setEventMetadata("VALIDV_ALBPROCOD","{handler:'validv_Albprocod',iparms:[]");
      setEventMetadata("VALIDV_ALBPROCOD",",oparms:[]}");
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
      wcpOGx_mode = "" ;
      wcpOAV61EmprCod = "" ;
      wcpOAV57GuiRemCln = "" ;
      wcpOAV62AlbProfch = GXutil.nullDate() ;
      wcpOAV63AlbSec = "" ;
      wcpOAV64AlbProPri = "" ;
      wcpOAV66AlbLic = "" ;
      wcpOAV80AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV94HashIN = "" ;
      wcpOAV96Messages_jsonIN = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_delete_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV61EmprCod = "" ;
      AV57GuiRemCln = "" ;
      AV62AlbProfch = GXutil.nullDate() ;
      AV63AlbSec = "" ;
      AV64AlbProPri = "" ;
      AV66AlbLic = "" ;
      AV80AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV94HashIN = "" ;
      AV96Messages_jsonIN = "" ;
      AV18TFBarNHdr = "" ;
      AV19TFBarNHdr_Sel = "" ;
      AV30TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV31TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV36TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV37TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV48TFAlbHdrObs = "" ;
      AV49TFAlbHdrObs_Sel = "" ;
      AV51TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV100Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV52DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV76Barcodpar_Selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
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
      AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = "" ;
      lV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = "" ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = "" ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = "" ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = DecimalUtil.ZERO ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = DecimalUtil.ZERO ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = "" ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = "" ;
      A396EmprCod = "" ;
      H02502_A30AlbProCod = new long[1] ;
      H02502_A396EmprCod = new String[] {""} ;
      H02502_A213BarSit = new byte[1] ;
      H02502_A2839AlbProVal = new String[] {""} ;
      H02502_A2441AlbHdrObs = new String[] {""} ;
      H02502_A6467BarAlbPlas = new short[1] ;
      H02502_A6466PlasCod = new short[1] ;
      H02502_n6466PlasCod = new boolean[] {false} ;
      H02502_A1266BarAlbTub = new int[1] ;
      H02502_A1206TubCod = new short[1] ;
      H02502_n1206TubCod = new boolean[] {false} ;
      H02502_A1265BarAlbPie = new int[1] ;
      H02502_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02502_A5019AlbHdrgm2 = new short[1] ;
      H02502_A3271AlbHdrAnc = new short[1] ;
      H02502_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02502_A12232AlbNomCli = new String[] {""} ;
      H02502_A3393AlbColNum = new int[1] ;
      H02502_A3392AlbColNom = new String[] {""} ;
      H02502_A8879AlbSerD = new String[] {""} ;
      H02502_A3391AlbSer = new String[] {""} ;
      H02502_A130BarCodPar = new String[] {""} ;
      H02502_A132BarCodReo = new byte[1] ;
      H02502_A129BarCod = new int[1] ;
      H02503_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV69Station = "" ;
      AV67EmprNom = "" ;
      AV68UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV101Nofases = DecimalUtil.ZERO ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV50TFAlbProVal_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV81Cadena = "" ;
      AV82firma = "" ;
      AV88Hash = "" ;
      AV83Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV89Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXv_objcol_SdtMessages_Message10 = new GXBaseCollection[1] ;
      GXv_boolean11 = new boolean[1] ;
      AV90Messages_json = "" ;
      GXv_int13 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int12 = new long[1] ;
      GXv_int15 = new short[1] ;
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDvelop_confirmpanel_delete = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_2__default(),
         new Object[] {
             new Object[] {
            H02502_A30AlbProCod, H02502_A396EmprCod, H02502_A213BarSit, H02502_A2839AlbProVal, H02502_A2441AlbHdrObs, H02502_A6467BarAlbPlas, H02502_A6466PlasCod, H02502_n6466PlasCod, H02502_A1266BarAlbTub, H02502_A1206TubCod,
            H02502_n1206TubCod, H02502_A1265BarAlbPie, H02502_A1263BarAlbMtrE, H02502_A5019AlbHdrgm2, H02502_A3271AlbHdrAnc, H02502_A1261BarAlbKgmE, H02502_A12232AlbNomCli, H02502_A3393AlbColNum, H02502_A3392AlbColNom, H02502_A8879AlbSerD,
            H02502_A3391AlbSer, H02502_A130BarCodPar, H02502_A132BarCodReo, H02502_A129BarCod
            }
            , new Object[] {
            H02503_AGRID_nRecordCount
            }
         }
      );
      AV100Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2" ;
      /* GeneXus formulas. */
      AV100Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2" ;
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      edtavGuiremcli_Enabled = 0 ;
      edtavGuiremcln_Enabled = 0 ;
      edtavAlbprofch_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      edtavMessages_jsonin_Enabled = 0 ;
      edtavHashin_Enabled = 0 ;
      chkavOkin.setEnabled( 0 );
   }

   private byte wcpOAV65AlbEnvFtp ;
   private byte wcpOAV93AlbProEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV65AlbEnvFtp ;
   private byte AV93AlbProEst ;
   private byte gxajaxcallmode ;
   private byte AV75Barcodreo_Selected ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte GXv_int14[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV32TFAlbHdrAnc ;
   private short AV33TFAlbHdrAnc_To ;
   private short AV34TFAlbHdrgm2 ;
   private short AV35TFAlbHdrgm2_To ;
   private short AV40TFTubCod ;
   private short AV41TFTubCod_To ;
   private short AV44TFPlasCod ;
   private short AV45TFPlasCod_To ;
   private short AV46TFBarAlbPlas ;
   private short AV47TFBarAlbPlas_To ;
   private short AV12OrderedBy ;
   private short AV77AlbContLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV56GridActions ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc ;
   private short AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to ;
   private short AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 ;
   private short AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to ;
   private short AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod ;
   private short AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to ;
   private short AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod ;
   private short AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to ;
   private short AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas ;
   private short AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to ;
   private short AV70Plasticos ;
   private short AV71Tubos ;
   private short GXv_int15[] ;
   private int wcpOAV58GuiRemCli ;
   private int edtTubCod_Visible ;
   private int edtBarAlbTub_Visible ;
   private int edtPlasCod_Visible ;
   private int edtBarAlbPlas_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_55 ;
   private int AV58GuiRemCli ;
   private int nGXsfl_55_idx=1 ;
   private int AV38TFBarAlbPie ;
   private int AV39TFBarAlbPie_To ;
   private int AV42TFBarAlbTub ;
   private int AV43TFBarAlbTub_To ;
   private int AV74Barcod_Selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprocod_Enabled ;
   private int edtavGuiremcli_Enabled ;
   private int edtavGuiremcln_Enabled ;
   private int edtavAlbprofch_Enabled ;
   private int bttBtninsert_Enabled ;
   private int bttBtncerrar_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavMessages_jsonin_Enabled ;
   private int edtavHashin_Enabled ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int A1266BarAlbTub ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels_size ;
   private int AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie ;
   private int AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to ;
   private int AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub ;
   private int AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to ;
   private int AV53PageToGo ;
   private int AV125GXV1 ;
   private int AV126GXV2 ;
   private int GXv_int13[] ;
   private int AV127GXV3 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV60AlbProCod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV60AlbProCod ;
   private long AV54GridCurrentPage ;
   private long AV55GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long A30AlbProCod ;
   private long GRID_nRecordCount ;
   private long GXv_int12[] ;
   private java.math.BigDecimal AV30TFBarAlbKgmE ;
   private java.math.BigDecimal AV31TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV36TFBarAlbMtrE ;
   private java.math.BigDecimal AV37TFBarAlbMtrE_To ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme ;
   private java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to ;
   private java.math.BigDecimal AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre ;
   private java.math.BigDecimal AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to ;
   private java.math.BigDecimal AV101Nofases ;
   private String wcpOGx_mode ;
   private String wcpOAV61EmprCod ;
   private String wcpOAV57GuiRemCln ;
   private String wcpOAV63AlbSec ;
   private String wcpOAV64AlbProPri ;
   private String wcpOAV66AlbLic ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_delete_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV61EmprCod ;
   private String AV57GuiRemCln ;
   private String AV63AlbSec ;
   private String AV64AlbProPri ;
   private String AV66AlbLic ;
   private String sGXsfl_55_idx="0001" ;
   private String edtTubCod_Internalname ;
   private String edtBarAlbTub_Internalname ;
   private String edtPlasCod_Internalname ;
   private String edtBarAlbPlas_Internalname ;
   private String AV18TFBarNHdr ;
   private String AV19TFBarNHdr_Sel ;
   private String AV48TFAlbHdrObs ;
   private String AV49TFAlbHdrObs_Sel ;
   private String AV100Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV76Barcodpar_Selected ;
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
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
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
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavGuiremcli_Internalname ;
   private String edtavGuiremcli_Jsonclick ;
   private String edtavGuiremcln_Internalname ;
   private String edtavGuiremcln_Jsonclick ;
   private String edtavAlbprofch_Internalname ;
   private String edtavAlbprofch_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavMessages_jsonin_Internalname ;
   private String edtavHashin_Internalname ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
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
   private String edtBarSit_Internalname ;
   private String scmdbuf ;
   private String lV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ;
   private String lV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ;
   private String AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel ;
   private String AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ;
   private String AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel ;
   private String AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV69Station ;
   private String AV67EmprNom ;
   private String AV68UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_delete_Internalname ;
   private String Dvelop_confirmpanel_delete_Internalname ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
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
   private String edtBarSit_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV80AlbHhfm ;
   private java.util.Date AV80AlbHhfm ;
   private java.util.Date wcpOAV62AlbProfch ;
   private java.util.Date AV62AlbProfch ;
   private boolean wcpOAV95OkIN ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV95OkIN ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean AV13OrderedDsc ;
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
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n1206TubCod ;
   private boolean n6466PlasCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV84ok ;
   private boolean GXv_boolean11[] ;
   private boolean Cond_result ;
   private String wcpOAV96Messages_jsonIN ;
   private String AV96Messages_jsonIN ;
   private String AV50TFAlbProVal_SelsJson ;
   private String AV90Messages_json ;
   private String wcpOAV94HashIN ;
   private String AV94HashIN ;
   private String AV81Cadena ;
   private String AV82firma ;
   private String AV88Hash ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_delete ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbProVal ;
   private ICheckbox chkavOkin ;
   private IDataStoreProvider pr_default ;
   private long[] H02502_A30AlbProCod ;
   private String[] H02502_A396EmprCod ;
   private byte[] H02502_A213BarSit ;
   private String[] H02502_A2839AlbProVal ;
   private String[] H02502_A2441AlbHdrObs ;
   private short[] H02502_A6467BarAlbPlas ;
   private short[] H02502_A6466PlasCod ;
   private boolean[] H02502_n6466PlasCod ;
   private int[] H02502_A1266BarAlbTub ;
   private short[] H02502_A1206TubCod ;
   private boolean[] H02502_n1206TubCod ;
   private int[] H02502_A1265BarAlbPie ;
   private java.math.BigDecimal[] H02502_A1263BarAlbMtrE ;
   private short[] H02502_A5019AlbHdrgm2 ;
   private short[] H02502_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] H02502_A1261BarAlbKgmE ;
   private String[] H02502_A12232AlbNomCli ;
   private int[] H02502_A3393AlbColNum ;
   private String[] H02502_A3392AlbColNom ;
   private String[] H02502_A8879AlbSerD ;
   private String[] H02502_A3391AlbSer ;
   private String[] H02502_A130BarCodPar ;
   private byte[] H02502_A132BarCodReo ;
   private int[] H02502_A129BarCod ;
   private long[] H02503_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV51TFAlbProVal_Sels ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV83Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message10[] ;
   private com.genexus.SdtMessages_Message AV89Message ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class documentodetransporteproduccion_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02502( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel ,
                                          String AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ,
                                          java.math.BigDecimal AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to ,
                                          short AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc ,
                                          short AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to ,
                                          short AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre ,
                                          java.math.BigDecimal AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to ,
                                          int AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie ,
                                          int AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to ,
                                          int AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub ,
                                          int AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to ,
                                          short AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod ,
                                          short AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to ,
                                          short AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas ,
                                          short AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to ,
                                          String AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel ,
                                          String AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ,
                                          int AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
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
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV61EmprCod ,
                                          long AV60AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[29];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.AlbProCod, T1.EmprCod, T2.BarSit, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2," ;
      sSelectString += " T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod" ;
      sFromString = " FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (0==AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (0==AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (0==AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (0==AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (0==AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbKgmE" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbKgmE DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHdrAnc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHdrAnc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHdrgm2" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHdrgm2 DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbMtrE" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbMtrE DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbPie DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TubCod" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TubCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbTub" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbTub DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PlasCod" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PlasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAlbPlas" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAlbPlas DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHdrObs" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHdrObs DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProVal" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProVal DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H02503( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel ,
                                          String AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ,
                                          java.math.BigDecimal AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to ,
                                          short AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc ,
                                          short AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to ,
                                          short AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre ,
                                          java.math.BigDecimal AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to ,
                                          int AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie ,
                                          int AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to ,
                                          int AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub ,
                                          int AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to ,
                                          short AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod ,
                                          short AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to ,
                                          short AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas ,
                                          short AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to ,
                                          String AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel ,
                                          String AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ,
                                          int AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
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
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV61EmprCod ,
                                          long AV60AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[24];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV102Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! (0==AV106Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (0==AV116Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (0==AV117Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! (0==AV118Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (0==AV119Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( ! (0==AV121Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV122Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_H02502(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).longValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).longValue() );
            case 1 :
                  return conditional_H02503(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).longValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02502", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02503", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[16])[0] = rslt.getString(15, 13);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 13);
               ((String[]) buf[19])[0] = rslt.getString(18, 26);
               ((String[]) buf[20])[0] = rslt.getString(19, 16);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
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
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 60);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 60);
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
                  stmt.setLong(sIdx, ((Number) parms[25]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
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
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 60);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 60);
               }
               return;
      }
   }

}

